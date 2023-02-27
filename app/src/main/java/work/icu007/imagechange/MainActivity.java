package work.icu007.imagechange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Description: 通过Toast将message显示出来
     * Name: displayToast(String message)
     * Author: Charlie_Liao
     * Time: 2023/2/27-11:23
     * E-mail: rookie_l@icu007.work
     **/
    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    /**
     * Description: 通过调用displayToast()方法来展示donut的描述信息
     * Name: showDonutOrder(View view)
     * Author: Charlie_Liao
     * Time: 2023/2/27-11:19
     * E-mail: rookie_l@icu007.work
     **/
    public void showDonutOrder(View view){
        displayToast(getString(R.string.donut_order_message));
    }


    /**
     * Description: 通过调用displayToast()方法来展示Ice-cream的描述信息
     * Name: showIceCreamOrder(View view)
     * Author: Charlie_Liao
     * Time: 2023/2/27-11:37
     * E-mail: rookie_l@icu007.work
     **/
    public void showIceCreamOrder(View view){
        displayToast(getString(R.string.ice_cream_order_message));
    }


    /**
     * Description: 通过调用displayToast()方法来展示froyo的描述信息
     * Name: showFroyoOrder(View view)
     * Author: Charlie_Liao
     * Time: 2023/2/27-11:39
     * E-mail: rookie_l@icu007.work
     **/
    public void showFroyoOrder(View view){
        displayToast(getString(R.string.froyo_order_message));
    }


    /**
     * Description: 点击图标打开OrderActivity
     * Name: StartOrderActivity(View view)
     * Author: Charlie_Liao
     * Time: 2023/2/27-15:51
     * E-mail: rookie_l@icu007.work
     **/
    public void startOrderActivity(View view) {
        Intent intent = new Intent(MainActivity.this,OrderActivity.class);
        startActivity(intent);
    }
}