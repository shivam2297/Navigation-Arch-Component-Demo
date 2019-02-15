package com.example.shivam.navigationcomponentdemo.fragments.shared_element_transition


import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.transition.ChangeBounds
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.shivam.navigationcomponentdemo.R

class SharedElementFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        sharedElementEnterTransition = ChangeBounds().apply {
            duration = 300
        }
        sharedElementReturnTransition= ChangeBounds().apply {
            duration = 300
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shared_element, container, false)
    }

}
