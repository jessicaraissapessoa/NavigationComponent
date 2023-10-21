package br.com.jessicaraissapessoa.navigation.navigation.component.fragments

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.jessicaraissapessoa.navigation.navigation.component.databinding.FragmentResumeBinding

class ResumeFragment : Fragment() {

    private var _binding: FragmentResumeBinding? = null // set do binding (só seta uma vez)
    private val binding get() = _binding!! //get do binding (recupera)

    private val args by navArgs<ResumeFragmentArgs>() //Forma de recuperação dos dados

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = FragmentResumeBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e(ContentValues.TAG, "onViewCreated: ${args.model}")

        binding.tvPerson.text = args.model.person
        binding.tvAddress.text = args.model.address
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}