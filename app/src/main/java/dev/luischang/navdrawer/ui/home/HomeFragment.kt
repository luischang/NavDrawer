package dev.luischang.navdrawer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import dev.luischang.navdrawer.R
import dev.luischang.navdrawer.databinding.FragmentHomeBinding
import dev.luischang.navdrawer.ui.shared.HomeGalleryViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val homeGalleryViewModel: HomeGalleryViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val navController = findNavController()

        binding.btGoUrl.setOnClickListener {
            val url: String = binding.etUrl.text.toString()
            homeGalleryViewModel.setUrl(url)
            navController.navigate(R.id.nav_gallery)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}