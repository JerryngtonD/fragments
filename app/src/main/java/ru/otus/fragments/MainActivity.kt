package ru.otus.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.otus.fragments.recyclerTwo.NewsItem

class MainActivity : AppCompatActivity(), NewsListFragment.NewsListListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, NewsListFragment(), NewsListFragment.TAG)
            .commit()
    }

    private fun openDetailedFragment(newsItem: NewsItem) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, NewsDetailedFragment.newInstance(newsItem.title), NewsDetailedFragment.TAG)
            .addToBackStack(null)
            .commit()
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        if (fragment is NewsListFragment) {
            fragment.listener = this
        }
    }

    override fun onNewsSelected(newsItem: NewsItem) {
        openDetailedFragment(newsItem)
    }


}