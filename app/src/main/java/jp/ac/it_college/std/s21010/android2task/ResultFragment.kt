package jp.ac.it_college.std.s21010.android2task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import jp.ac.it_college.std.s21010.android2task.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private val args: ResultFragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        _binding = FragmentResultBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ResultFragmentDirections.actionResultFragmentToGenerationFragment()
            )
        }
        val score = args.score
        binding.textView4.text = getString(R.string.empty, score)

        return binding.root
    }
}