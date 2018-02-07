package com.fabriciohsilva.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.textIdade = (EditText) findViewById(R.id.textIdade);
        this.mViewHolder.textResultIdade = (TextView) findViewById(R.id.textResultIdade);
        this.mViewHolder.buttonIdade = (Button) findViewById(R.id.buttonIdade);

        this.mViewHolder.buttonIdade.setOnClickListener(this);

    }//end protected void onCreate(Bundle savedInstanceState)

    @Override
    public void onClick(View v){
        int id = v.getId();

        if (id == R.id.buttonIdade){

            if (this.mViewHolder.textIdade.getText().toString().isEmpty()){
                //mensagem de erro
                this.mViewHolder.textResultIdade.setText(R.string.msg_idade_vazia);
            }
            else{
                this.mViewHolder.textResultIdade.setText("A idade em anos humanos é: "
                        +(Integer.parseInt(this.mViewHolder.textIdade.getText().toString()) * 7) + " ano(s).");
            }

        }//end if (id == R.id.buttonIdade)
    }//end public void onClick(View v)

    private static class ViewHolder {
        EditText textIdade;
        TextView textResultIdade;
        Button buttonIdade;
    }//end private static class mviewHolder

}
