package prasetyo.muhamad.utsAboutMe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_hal3.*

/**
 * A simple [Fragment] subclass.
 */
class hal3 : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hal3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        submit_bintang.setOnClickListener{
            if(input_bintang.text.toString().isNotEmpty()){
                val input = input_bintang.text.toString()
                val bundle=Bundle()
                bundle.putString("args", input.toString())

                nav.navigate(R.id.action_hal3_to_hal4,bundle)
            }

        }
    }

}
