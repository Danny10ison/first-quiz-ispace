package com.hgecapsi.newsapptestoneproject.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hgecapsi.newsapptestoneproject.R
import com.hgecapsi.newsapptestoneproject.databinding.FragmentAllDevsBinding


class AllDevsFragment : Fragment() {

    private lateinit var binding: FragmentAllDevsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_devs, container, false)
    }



}