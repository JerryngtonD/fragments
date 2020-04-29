package ru.otus.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.otus.fragments.recyclerTwo.NewsAdapter
import ru.otus.fragments.recyclerTwo.NewsItem

class NewsListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<RecyclerView>(R.id.recyclerView).adapter = NewsAdapter(LayoutInflater.from(activity), listOf(
            NewsItem(0, "News 0"),
            NewsItem(1, "News 1"),
            NewsItem(2, "News 2"),
            NewsItem(3, "News 3"),
            NewsItem(4, "News 4")
        ))
    }
}