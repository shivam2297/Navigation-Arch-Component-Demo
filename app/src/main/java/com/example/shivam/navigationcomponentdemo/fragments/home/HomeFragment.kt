package com.example.shivam.navigationcomponentdemo.fragments.home


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigator
import com.example.shivam.navigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        next_fragment_btn.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_nextFragment)
        }

        shared_element_btn.setOnClickListener { view ->
            val  extras = FragmentNavigator.Extras.Builder().addSharedElement(shared_iv,"header_iv").build()
            view.findNavController().navigate(R.id.action_homeFragment_to_sharedElementFragment, null, null, extras)
        }

    }
}
