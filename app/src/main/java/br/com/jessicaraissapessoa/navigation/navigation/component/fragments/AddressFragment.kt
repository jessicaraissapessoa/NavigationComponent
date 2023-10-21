package br.com.jessicaraissapessoa.navigation.navigation.component.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.jessicaraissapessoa.navigation.navigation.component.databinding.FragmentAddressBinding
import br.com.jessicaraissapessoa.navigation.navigation.component.extensions.text
import br.com.jessicaraissapessoa.navigation.navigation.component.model.PersonModel

class AddressFragment : Fragment() {

    private var _binding: FragmentAddressBinding? = null // set do binding (só seta uma vez)
    private val binding get() = _binding!! //get do binding (recupera)

    private val args by navArgs<AddressFragmentArgs>() //Forma de recuperação dos dados

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = FragmentAddressBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e(TAG, "onViewCreated: ${args.model}")

        binding.btnNext.setOnClickListener {

            val model = PersonModel(
                street = binding.tilStreet.text,
                number = binding.tilNumber.text.toInt()
            )
        }
        //TODO: Mandar os dados para outro fragment
        //TODO: Navegar entre os fragments
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}