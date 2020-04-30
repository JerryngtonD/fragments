package ru.otus.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.otus.fragments.recyclerTwo.NewsAdapter
import ru.otus.fragments.recyclerTwo.NewsItem

class NewsListFragment : Fragment() {
    companion object {
        const val TAG = "NewsListFragment"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate $this")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy  $this")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        return inflater.inflate(R.layout.fragment_news_list, container, false)

    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated")
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