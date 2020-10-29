package com.example.nana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Frag_Favoritos frag_favoritos;
    Frag_Promos frag_promos;
    Frag_Tienda frag_tienda;
    Frag_Carrito frag_carrito;
    Frag_Login frag_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_favoritos = new Frag_Favoritos();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, frag_favoritos).commit();


    }

    public void onClick(View view) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.cardFavoritos:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFrag_favoritos());
                break;
            case R.id.cardPromo:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFrag_promos());
                break;
            case R.id.cardTienda:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFrag_tienda());
                break;
            case R.id.cardCarrito:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFrag_carrito());
                break;
            case R.id.cardlogin:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFrag_login());
                break;
            default:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFrag_tienda());
                break;
        }
        fragmentTransaction.commit();

    }

    public Frag_Favoritos getFrag_favoritos() {
        if (frag_favoritos == null)
            frag_favoritos = new Frag_Favoritos();

        return frag_favoritos;
    }

    public Frag_Promos getFrag_promos() {
        if (frag_promos == null)
            frag_promos = new Frag_Promos();

        return frag_promos;
    }

    public Frag_Tienda getFrag_tienda() {
        if (frag_tienda == null)
            frag_tienda = new Frag_Tienda();

        return frag_tienda;
    }

    public Frag_Carrito getFrag_carrito() {
        if (frag_carrito == null)
            frag_carrito = new Frag_Carrito();

        return frag_carrito;
    }

    public Frag_Login getFrag_login() {
        if (frag_login == null)
            frag_login = new Frag_Login();

        return frag_login;
    }
}