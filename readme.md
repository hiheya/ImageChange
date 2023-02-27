## 一、可点击图片练习
1. 在布局文件中添加图片以及描述信息
如下所示：
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:text="Droid Desserts"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/donut"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:onClick="showDonutOrder"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:srcCompat="@drawable/donut_circle" />

    <ImageView
        android:id="@+id/ice_cream"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:onClick="showIceCreamOrder"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/donut"
        app:srcCompat="@drawable/icecream_circle" />

    <ImageView
        android:id="@+id/froyo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:onClick="showFroyoOrder"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/ice_cream"
        app:srcCompat="@drawable/froyo_circle" />

    <TextView
        android:id="@+id/donut_description"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="24dp"
        android:text="Donuts are glazed and sprinkled with candy."
        app:layout_constraintBottom_toBottomOf="@+id/donut"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/donut"
        app:layout_constraintTop_toTopOf="@+id/donut" />

    <TextView
        android:id="@+id/froyo_description"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="24dp"
        android:text="FroYo is premium self-serve frozen yogurt."
        app:layout_constraintBottom_toBottomOf="@+id/froyo"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/froyo"
        app:layout_constraintTop_toTopOf="@+id/froyo" />

    <TextView
        android:id="@+id/ice_cream_description"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="24dp"
        android:text="Ice cream sandwiches have chocolate wafers and vanilla filling."
        app:layout_constraintBottom_toBottomOf="@+id/ice_cream"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/ice_cream"
        app:layout_constraintTop_toTopOf="@+id/ice_cream" />

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/floatingActionButton"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="16dp"
        android:clickable="true"
        android:onClick="startOrderActivity"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:srcCompat="@drawable/ic_shopping_cart"
        tools:ignore="MissingConstraints" />


</androidx.constraintlayout.widget.ConstraintLayout>
```
2. 为图像添加onClick()方法
- 创建Toast方法
  - 先在string.xml文件中添加字符串资源
  ```xml
    <string name="ice_cream_order_message">You ordered an ice cream sandwich.</string>
    <string name="froyo_order_message">You ordered a FroYo.</string>
    <string name="title_activity_order">OrderActivity</string>
    ```
  - 添加 displayToast()方法
  ```java
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
    ```
- 创建点击处理程序
  - showDonutOrder()
  ```java
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
    ```
    - showIceCreamOrder()
  ```java
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
    ```
    - showFroyoOrder()
  ```java
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
    ```
3. 更改浮动操作按钮
- 新建一个OrderActivity
- 为浮动操作按钮添加点击处理程序
```java
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
```
