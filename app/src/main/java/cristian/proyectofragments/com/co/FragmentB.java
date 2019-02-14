package cristian.proyectofragments.com.co;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FragmentB extends Fragment {

    private ImageView imgImagen;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_a, container, false);
        imgImagen = v.findViewById(R.id.imagen);

        return inflater.inflate(R.layout.fragment_b, container, false);
    }


}
