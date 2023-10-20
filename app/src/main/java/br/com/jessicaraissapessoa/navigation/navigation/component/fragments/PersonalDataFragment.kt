package br.com.jessicaraissapessoa.navigation.navigation.component.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.jessicaraissapessoa.navigation.navigation.component.R
import br.com.jessicaraissapessoa.navigation.navigation.component.model.PersonModel
import br.com.jessicaraissapessoa.navigation.navigation.component.databinding.FragmentPersonalDataBinding
import br.com.jessicaraissapessoa.navigation.navigation.component.extensions.text

class PersonalDataFragment : Fragment() {

    private var _binding: FragmentPersonalDataBinding? = null // set do binding (só seta uma vez)
    private val binding get() = _binding!! //get do binding (recupera)

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = FragmentPersonalDataBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {

            val model = PersonModel(
                name = binding.tilName.text,
                age = binding.tilAge.text.toInt()
            )
            findNavController().navigate(R.id.go_to_addressFragment)
        }
        //TODO: Mandar os dados para outro fragment
        //TODO: Navegar entre os fragments
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}