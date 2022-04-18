package com.example.homework5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.activityButton).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.top_in, R.anim.bottom_out, R.anim.top_in, R.anim.bottom_out)
                .addToBackStack(null)
                .add(R.id.fragmentContainerView, AnimationFragment())
                .commit()
        }
    }
}