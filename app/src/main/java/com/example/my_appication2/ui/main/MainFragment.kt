package com.example.my_appication2.ui.main

import android.content.Intent
import android.graphics.drawable.Drawable.createFromPath
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import com.example.my_appication2.MainActivity4
import com.example.my_appication2.R
import com.example.my_appication2.databinding.MainFragmentBinding
import com.example.my_appication2.get_name

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
private lateinit var binding:MainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this.binding = MainFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.button.setOnClickListener {
            binding.imageView.load(get_name())
            binding.imageView.visibility=View.VISIBLE}

            binding.button3.setOnClickListener {

                    startActivity(Intent(this.context,MainActivity4::class.java))
            }

        }

    }