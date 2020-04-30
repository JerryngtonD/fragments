package ru.otus.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.otus.fragments.recyclerTwo.NewsItem

class MainActivity : AppCompatActivity(), NewsListFragment.NewsListListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, NewsListFragment().apply { listener = this@MainActivity }, NewsListFragment.TAG)
            .commit()

        findViewById<View>(R.id.showDetailsBtn).setOnClickListener{
            openDetailedFragment()
        }
    }

    private fun openDetailedFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, NewsDetailedFragment(), NewsDetailedFragment.TAG)
            .addToBackStack(null)
            .commit()
    }

    override fun onNewsSelected(newsItem: NewsItem) {
        openDetailedFragment()
    }


}