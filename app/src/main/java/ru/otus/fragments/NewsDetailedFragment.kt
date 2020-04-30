package ru.otus.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsDetailedFragment : Fragment() {
    companion object {
        const val TAG = "NewsDetailedFragment"

        const val EXTRA_TITLE = "EXTRA_TITLE"

        fun newInstance(text: String): NewsDetailedFragment {
            return NewsDetailedFragment().apply {
                arguments = Bundle().apply {
                    putString(EXTRA_TITLE, text)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news_detailed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.fragment_detailed_id).text = arguments?.getString(EXTRA_TITLE)
    }
}