package wsp.utsjr.com.wishofsexproducts;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Nombre de la clase: Categorias
 * Info de la version: Android 1.0.2
 * Copyrigth: Alma Granados (Programador)
 */


/**
 * Created by user on 26/08/2014.
 */
//Clase que contiene metodos para controlar la informacion de cada Categoria disponible en el menú

public class Categorias extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.categorias, container, false);

        return rootView;
    }
}
