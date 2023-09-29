package montacer.elfazazi.ejerc1clasepmdmtema1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mostrarResultadoActivity extends AppCompatActivity {
    private TextView lbresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_resultado);

        lbresultado = findViewById(R.id.lbResultadoMostrar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String mensaje = bundle.getString("MSG");
            lbresultado.setText(mensaje);
        }
    }
}