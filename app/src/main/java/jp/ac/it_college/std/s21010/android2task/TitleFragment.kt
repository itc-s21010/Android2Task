package jp.ac.it_college.std.s21010.android2task

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21010.android2task.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {
    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.toStart.setOnClickListener {
            Navigation.findNavController(it).navigate(
                TitleFragmentDirections.actionTitleFragmentToGenerationFragment().apply {  }
            )
        }
        return null
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}