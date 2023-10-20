package br.com.jessicaraissapessoa.navigation.navigation.component.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.jessicaraissapessoa.navigation.navigation.component.databinding.FragmentPersonalDataBinding

class PersonalDataFragment : Fragment() {

    private var _binding: FragmentPersonalDataBinding? = null // set do binding (só seta uma vez)
    private val binding get() = _binding!! //get do binding (recupera)

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View? {
        _binding = FragmentPersonalDataBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}