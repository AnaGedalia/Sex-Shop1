package wsp.utsjr.com.wishofsexproducts;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Nombre de la clase: Contacto
 * Info de la version: Android 1.0.2
 * Copyrigth: Alma Granados (Programador)
 */

/**
 * Created by user on 26/08/2014.
 */

//Contiene los metodos que son utilizados para mostrarle al usuario los servicios ofrecidos
public class Contacto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.contacto, container, false);

        return rootView;
    }
}
