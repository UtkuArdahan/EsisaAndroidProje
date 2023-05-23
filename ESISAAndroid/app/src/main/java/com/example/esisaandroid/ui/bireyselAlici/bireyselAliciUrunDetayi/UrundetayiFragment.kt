package com.example.esisaandroid.ui.bireyselAlici.bireyselAliciUrunDetayi

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.esisaandroid.R
import com.example.esisapp.ui.bireyselAlici.bireyselAliciUrunDetayi.UrundetayiViewModel


class UrundetayiFragment : Fragment() {

    companion object {
        fun newInstance() = UrundetayiFragment()
    }

    private lateinit var viewModel: UrundetayiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_urundetayi, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UrundetayiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}