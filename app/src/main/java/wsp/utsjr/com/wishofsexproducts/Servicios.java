package wsp.utsjr.com.wishofsexproducts;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Nombre de la clase: Servicios
 * Info de la version: Android 1.0.2
 * Copyrigth: Alma Granados (Programador)
 */

/**
 * Created by user on 26/08/2014.
 */

//Contiene los metodos que son requeridos para la funcionalidad del Layout de servicios
public class Servicios extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.servicios, container, false);

        return rootView;
    }
}
