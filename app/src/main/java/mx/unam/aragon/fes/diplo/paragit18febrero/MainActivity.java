package mx.unam.aragon.fes.diplo.paragit18febrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private Button miboton;
    private Button miboton2;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miboton= findViewById(R.id.button);
        miboton2= findViewById(R.id.button2);
        texto= findViewById(R.id.texto);

        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    texto.setText("Hola Git Hub");
                    Toast.makeText(MainActivity.this,"Se cambio el mensaje del text view",Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        miboton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    texto.setText("Diplomado Android");
                    
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
