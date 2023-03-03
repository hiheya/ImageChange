package work.icu007.imagechange;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class DialogForAlert extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_for_alert);
        mTextView = findViewById(R.id.textView);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(DialogForAlert.this);

        // 设置对话框的标题及信息
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop");

        // 添加对话框按钮
        myAlertBuilder.setPositiveButton("OK",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 用户点击OK按钮时
                Toast.makeText(getApplicationContext(), "Press OK", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 用户点击Cancel按钮时
                Toast.makeText(getApplicationContext(), "Press Cancel", Toast.LENGTH_SHORT).show();
            }
        });

        // 创建 并且 展示 对话框
        myAlertBuilder.show();
    }

    public void onClickEditText(View view) {

        final EditText editText = new EditText(this);
        AlertDialog.Builder dialog = new AlertDialog.Builder(DialogForAlert.this);
        dialog.setTitle("请输入文本");
        dialog.setView(editText);
        dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mTextView.setText(editText.getText().toString());
            }

        });

        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DialogForAlert.this, "你选择了取消", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void showTimePicker(View view) {
        DialogFragment mDialogFragment = new TimePickerFragment();
        mDialogFragment.show(getSupportFragmentManager(),"timePicker");
    }


    public void processDatePickerResult(int year, int month, int day){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (year_string + '/' + month_string + '/' + day_string);
        Toast.makeText(this, "Date" + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute){
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);

        String timeMessage = (hour_string + ':' + minute_string );
        Toast.makeText(this, "Time" + timeMessage, Toast.LENGTH_SHORT).show();
    }


}