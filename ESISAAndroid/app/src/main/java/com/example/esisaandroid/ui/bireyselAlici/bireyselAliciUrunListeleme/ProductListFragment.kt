package com.example.esisaandroid.ui.bireyselAlici.bireyselAliciUrunListeleme

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.FragmentProductListBinding
import com.example.esisapp.ui.bireyselAlici.bireyselAliciUrunListeleme.ProductListViewModel

class ProductListFragment : Fragment() {
    private var _binding: FragmentProductListBinding?=null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = ProductListFragment()
    }

    private lateinit var viewModel: ProductListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.btnProductAdd.setOnClickListener {
            it.findNavController().navigate(R.id.productAddFragment)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}