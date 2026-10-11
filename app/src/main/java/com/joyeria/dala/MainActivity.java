package com.joyeria.dala;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAnillos = findViewById(R.id.btnAnillos);
        Button btnCadenas = findViewById(R.id.btnCadenas);
        Button btnTopos = findViewById(R.id.btnTopos);
        Button btnVerCatalogo = findViewById(R.id.btnVerCatalogo);

        btnAnillos.setOnClickListener(v -> mostrarDialogoColeccion(
                "Colección Anillos de Compromiso",
                "1. Solitario en Oro 18K con Diamante Central\n   Precio: $2.450.000 COP\n\n" +
                        "2. Anillo Esmeralda Colombiana de Muzo\n   Precio: $3.800.000 COP\n\n" +
                        "3. Churumbela en Oro Rosado e Incrustaciones\n   Precio: $1.950.000 COP\n\n" +
                        "• Incluye certificado de autenticidad y estuche de lujo."
        ));

        btnCadenas.setOnClickListener(v -> mostrarDialogoColeccion(
                "Cadenas & Pulseras Finas",
                "1. Cadena Tejido Escalera Oro 18K (50cm)\n   Precio: $2.850.000 COP\n\n" +
                        "2. Pulsera Tejido Barbado Delgado\n   Precio: $1.400.000 COP\n\n" +
                        "3. Dije Medalla San Benito Oro Pulido\n   Precio: $780.000 COP\n\n" +
                        "• Garantía de por vida en la ley del metal (18 Kilates)."
        ));

        btnTopos.setOnClickListener(v -> mostrarDialogoColeccion(
                "Topos, Aretes & Candongas",
                "1. Topos Diamante Natural 0.30 Ct\n   Precio: $2.100.000 COP\n\n" +
                        "2. Candongas Lisas en Oro Amarillo 18K\n   Precio: $890.000 COP\n\n" +
                        "3. Aretes de Filigrana con Perla Cultivada\n   Precio: $1.250.000 COP\n\n" +
                        "• Cierre con tuerca de rosca antialérgica de seguridad."
        ));

        btnVerCatalogo.setOnClickListener(v -> mostrarDialogoColeccion(
                "Diseños Personalizados & Asesoría",
                "En Joyería Dala elaboramos la joya de tus sueños sobre pedido:\n\n" +
                        "• Fabricación 3D y render previo de la pieza.\n" +
                        "• Selección directa de gemas naturales certificadas.\n" +
                        "• Grabados con láser de alta precisión.\n\n" +
                        "¿Deseas iniciar una cotización con un asesor comercial?"
        ));
    }

    private void mostrarDialogoColeccion(String titulo, String mensaje) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(titulo);
        builder.setMessage(mensaje);
        builder.setPositiveButton("Contactar Asesor", (dialog, which) -> {
            Toast.makeText(MainActivity.this, "Solicitud registrada para " + titulo, Toast.LENGTH_LONG).show();
        });
        builder.setNegativeButton("Cerrar", (dialog, which) -> dialog.dismiss());

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}