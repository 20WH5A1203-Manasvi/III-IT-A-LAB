package com.example.layout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
EditText name;
Button b;
EditText address;
EditText age;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
name=findViewById(R.id.editText);
address=findViewById(R.id.editTexta);
age = findViewById(R.id.editText3);
b = findViewById(R.id.button);
b.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
String s=name.getText().toString();
String s1=address.getText().toString();
String s2=age.getText().toString();
Toast.makeText(getApplicationContext(),"User Name : " + s +
"\nAddress : " + s1 + "\nAge : " + s2,Toast.LENGTH_LONG).show();
}
});
}
}
