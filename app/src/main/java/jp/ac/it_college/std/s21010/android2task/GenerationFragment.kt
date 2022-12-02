package jp.ac.it_college.std.s21010.android2task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.ac.it_college.std.s21010.android2task.databinding.FragmentGenerationBinding
import jp.ac.it_college.std.s21010.android2task.databinding.FragmentTitleBinding


class GenerationFragment : Fragment() {
    private var _binding: FragmentGenerationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_generation, container, false)
    }
}