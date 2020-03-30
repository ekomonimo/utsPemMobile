package prasetyo.muhamad.utsAboutMe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_hal4.*

/**
 * A simple [Fragment] subclass.
 */
class hal4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hal4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val bintangOutput = "1"
        val bintangOutput=arguments?.getString("args")
        //val outputt= bintangOutput?.toFloat()
        //ratingBar.rating= 5F
        if (bintangOutput != null) {
            ratingBar.rating= bintangOutput.toFloat()
        }
            //ratingBar.rating=

        //textView7.text=bintangOutput


    }

}
