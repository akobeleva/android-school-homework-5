package com.example.homework5

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Scene
import android.transition.TransitionManager
import android.transition.TransitionSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AnimationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.scene1, container, false).also {
            it.findViewById<Button>(R.id.fragmentButton).setOnClickListener {
                startAnimation()
            }
        }
    }

    private fun startAnimation() {
        val scene = Scene.getSceneForLayout(view as ViewGroup, R.layout.scene2, context)
        TransitionManager.go(scene, TransitionSet().apply {
            addTransition(ChangeBounds().setDuration(400))
        })
    }
}