package com.example.staticweatherapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.staticweatherapp.databinding.FragmentSwitcherBinding
import com.example.staticweatherapp.switchviewmodel.SwitchViewModel

class SwitchButtonFragment : Fragment() {
    private val binding by lazy { FragmentSwitcherBinding.inflate(layoutInflater) }
    private val viewModel: SwitchViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.switchButton.setOnClickListener {
            viewModel.onSwitchToggle()
            requireActivity().invalidateOptionsMenu()
        }
    }
}