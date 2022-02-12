package com.example.my_appication2.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import com.example.my_appication2.MainActivity
import com.example.my_appication2.R
import com.example.my_appication2.databinding.MainFragment2Binding
import com.example.my_appication2.databinding.MainFragmentBinding
import com.example.my_appication2.get_name

class MainActivity4Fragment : Fragment() {

    companion object {
        fun newInstance() = MainActivity4Fragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this.binding = MainFragment2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.button5.setOnClickListener {
            binding.imageView2.load(get_name())
        }
            binding.button4.setOnClickListener {
                startActivity(Intent(this.context, MainActivity::class.java))
            }

        }
    }
