package fr.epf.min.movieappepf.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.epf.min.movieappepf.R

class StackQrcodeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stack_qrcode, container, false)
    }

    override fun onResume() {
        super.onResume()
    }
}
