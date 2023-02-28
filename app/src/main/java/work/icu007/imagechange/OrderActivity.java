package work.icu007.imagechange;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message = "Order: " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);


        // 实例化Spinner
        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null){
            // 为spinner设置监听器
            spinner.setOnItemSelectedListener(this);
        }

        // 使用字符数组和默认的spinner布局创建一个ArrayAdapter，为每个项提供的布局创建字符串数组
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);

        // 指定出现选项列表时要使用的布局。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 将ArrayAdapter 应用到 spinner
        if (spinner != null){
            spinner.setAdapter(adapter);
        }


        //
        EditText editText = findViewById(R.id.editText_main);
        if (editText != null)
            editText.setOnEditorActionListener
                    (new TextView.OnEditorActionListener() {
                        @Override
                        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                            boolean handled = false;
                            if (actionId == EditorInfo.IME_ACTION_SEND){
                                dialNumber();
                                handled = true;
                            }
                            return handled;
                        }
                        // If view is found, set the listener for editText.
                    });
    }


    /**
     * Description: 通过Toast展示message
     * Name: displayToast(String message)
     * Author: Charlie_Liao
     * Time: 2023/2/27-17:19
     * E-mail: rookie_l@icu007.work
     **/
    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    /**
     * Description: 判断复选框选择了什么，使用Toast提醒用户
     * Name: onRadioButtonClicked(View view)
     * Author: Charlie_Liao
     * Time: 2023/2/27-17:19
     * E-mail: rookie_l@icu007.work
     **/
    public void onRadioButtonClicked(View view) {
        // 判断 复选框是否被点击
        boolean checked = ((RadioButton) view ).isChecked();
        // 检查 哪个复选框被选中
        switch (view.getId()){
            case R.id.sameday:
                if (checked){
                    displayToast("用户选择当天送达");
                }
                break;
            case R.id.nextday:
                if (checked){
                    displayToast("用户选择次日送达");
                }
                break;
            case R.id.pickup:
                if (checked){
                    displayToast("用户选择自提");
                }
                break;
            default:
                // 直接break；
                break;
        }
    }

    // 当任意spinner item被选择时的回调接口。Interface callback for when any spinner item is selected.
    @Override
    public void onItemSelected(AdapterView<?> adapterView,
                               View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
        displayToast(spinnerLabel);
    }

    // 当没有spinner item被选择时的回调接口。Interface callback for when no spinner item is selected.
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // Do nothing.
    }


    /**
     * Description: 拨号函数
     * Name: dialNumber()
     * Author: Charlie_Liao
     * Time: 2023/2/28-14:51
     * E-mail: rookie_l@icu007.work
     **/
    private void dialNumber() {
        // Find the editText_main view.
        // 通过id找到指定的EditText
        EditText editText = findViewById(R.id.editText_main);
        String phoneNum = null;
        // If the editText field is not null,
        // concatenate "tel: " with the phone number string.
        // 若 editText 不为空，则将获取到的 电话号码 与 "tel:" 字段连接起来。
        if (editText != null) phoneNum = "tel:" +
                editText.getText().toString();
        // Optional: Log the concatenated phone number for dialing.
        // 将需要拨打的电话号码打印出来。
        Log.d("TAG", "dialNumber: " + phoneNum);
        // Specify the intent.
        // 实例化一个intent
        Intent intent = new Intent(Intent.ACTION_DIAL);
        // Set the data for the intent as the phone number.
        // 设置获取到的电话号码 设置为 intent数据
        intent.setData(Uri.parse(phoneNum));
        // If the intent resolves to a package (app),
        // start the activity with the intent.
        // 若有应用可以处理此intent 则启动这个activity
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }
}