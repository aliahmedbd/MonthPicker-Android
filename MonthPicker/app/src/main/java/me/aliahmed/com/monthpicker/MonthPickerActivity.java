package me.aliahmed.com.monthpicker;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MonthPickerActivity extends AppCompatActivity {

    TextView txtYear, txtJan, txtFeb, txtMar, txtApr, txtMay, txtJun, txtJul, txtAug, txtSep, txtNov, txtDec, txtCancel, txtOk;
    Button btnShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_picker);
        clickListener();
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMonthDialog();
            }
        });

    }

    public void showMonthDialog() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_month_picker);
        txtYear = (TextView) dialog.findViewById(R.id.txtYear);
        txtJan = (TextView) dialog.findViewById(R.id.txtJan);
        txtFeb = (TextView) dialog.findViewById(R.id.txtFeb);
        txtMar = (TextView) dialog.findViewById(R.id.txtMar);
        txtApr = (TextView) dialog.findViewById(R.id.txtApr);
        txtMay = (TextView) dialog.findViewById(R.id.txtMay);
        txtJun = (TextView) dialog.findViewById(R.id.txtJune);
        txtJul = (TextView) dialog.findViewById(R.id.txtJul);
        txtAug = (TextView) dialog.findViewById(R.id.txtAug);
        txtSep = (TextView) dialog.findViewById(R.id.txtSep);
        txtNov = (TextView) dialog.findViewById(R.id.txtNov);
        txtDec = (TextView) dialog.findViewById(R.id.txtdec);
        txtCancel = (TextView) dialog.findViewById(R.id.txtCancel);
        txtOk = (TextView) dialog.findViewById(R.id.txtOk);
        dialog.show();
    }

    public void clickListener(){
        txtOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
