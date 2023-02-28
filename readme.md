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

## 二、输入控件练习

1. 在OrderActivity中添加一个输入name的编辑文本

```xml
    <TextView
        android:id="@+id/name_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="32dp"
        android:text="name:"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <EditText
        android:id="@+id/name_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="8dp"
        android:layout_marginStart="8dp"
        android:ems="10"
        android:hint="Enter your name"
        android:inputType="textPersonName"
        app:layout_constraintBaseline_toBaselineOf="@+id/name_label"
        app:layout_constraintStart_toEndOf="@+id/name_label" />
```


| **“文本视图”属性**                   | **价值**                |
| ---------------------------------------- | ------------------------- |
| `android:id`                           | `"@+id/name_label"`     |
| `android:layout_width`                 | `"wrap_content"`        |
| `android:layout_height`                | `"wrap_content"`        |
| `android:layout_marginStart`           | `"24dp"`                |
| `android:layout_marginLeft`            | `"24dp"`                |
| `android:layout_marginTop`             | `"32dp"`                |
| `android:text`                         | `"Name"`                |
| `app:layout_constraintStart_toStartOf` | `"parent"`              |
| `app:layout_constraintTop_toBottomOf`  | `"@+id/order_textview"` |

- 注意这里的inputType应选择textPersonName

2. 添加一个输入地址的编辑文本

```xml
    <TextView
        android:id="@+id/address_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:text="Address: "
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/name_label" />

    <EditText
        android:id="@+id/address_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="8dp"
        android:layout_marginStart="8dp"
        android:ems="10"
        android:hint="Enter Address"
        android:inputType="textMultiLine"
        app:layout_constraintBaseline_toBaselineOf="@+id/address_label"
        app:layout_constraintStart_toEndOf="@+id/address_label" />
```

- 因为地址相对较长，所以这里inputType 选择textMultiLine

3. 添加输入电话号码的编辑文本

```xml
    <TextView
        android:id="@+id/phone_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:text="Phone: "
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/address_text" />

    <EditText
        android:id="@+id/phone_text"
        android:layout_width="134dp"
        android:layout_height="wrap_content"
        android:layout_marginLeft="8dp"
        android:layout_marginStart="8dp"
        android:ems="10"
        android:hint="Enter your phone "
        android:inputType="phone"
        app:layout_constraintBaseline_toBaselineOf="@+id/phone_label"
        app:layout_constraintStart_toEndOf="@+id/phone_label" />
```

- 因为输入的是手机号码，所以inputType这里选择phone

4. 添加一个备注编辑文本

```xml
    <TextView
        android:id="@+id/note_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:text="Note: "
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/phone_label" />

    <EditText
        android:id="@+id/note_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="8dp"
        android:layout_marginStart="8dp"
        android:ems="10"
        android:hint="Enter the notes"
        android:inputType="textCapSentences|textMultiLine"
        app:layout_constraintBaseline_toBaselineOf="@+id/note_label"
        app:layout_constraintStart_toEndOf="@+id/note_label" />
```

- 这里inputType选择 textCapSentences|textMultiLine 多行以及首字母大写

5. 添加单选按钮组和单选按钮

- 由于单选按钮选择是互斥的，因此可以在单选组中将它们组合在一起。通过将它们组合在一起，Android 系统确保一次只能选择一个单选按钮。

> ⭐注意：RadioButton 列出元素的顺序决定了它们在屏幕上的显示顺序。

- 添加一个RadioGroup,然后包含三个RadioButton元素。

```xml
    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="24dp"
        android:layout_marginStart="24dp"
        android:orientation="vertical"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/delivery_label">

        <RadioButton
            android:id="@+id/sameday"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:checked="true"
            android:onClick="onRadioButtonClicked"
            android:text="当天达" />

        <RadioButton
            android:id="@+id/nextday"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="onRadioButtonClicked"
            android:text="次日送达" />

        <RadioButton
            android:id="@+id/pickup"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="onRadioButtonClicked"
            android:text="自提" />
    </RadioGroup>
```

7. 添加按钮点击处理程序

- 每个单选按钮元素的属性(android:onClick = onRadioButtonClicked())指定处理单击事件的方法。因此，您需要在 OrderActivity 类中添加一个新方法onRadioButtonClicked()。
- 如下onRadioButtonClicked()方法，先判断是否点击复选框，若点击了复选框则判断具体id，并使用Toast 提醒用户

```java
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
```

8. 在布局中添加 Spinner

- 打开activity_order.xml将spinner从Palette 拖到布局当中
- 代码如下：

```xml
    <Spinner
        android:id="@+id/label_spinner"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="24dp"
        android:layout_marginRight="24dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="24dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/phone_text"
        app:layout_constraintTop_toBottomOf="@+id/address_text" />
```

- 添加代码以激活Spinner以及监听器

  - 先在strings.xml中为字符串数组定义可选值。

  ```xml
    <string-array name="labels_array">
        <item>Home</item>
        <item>Work</item>
        <item>Mobile</item>
        <item>Other</item>
    </string-array>
  ```

  - 更改OrderActivity类实现AdapterView.OnItemSelectedListener接口用于定义Spinner的回调。

  ```java
  public class OrderActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {
    // ...
    // Interface callback for when any spinner item is selected.
    @Override
    public void onItemSelected(AdapterView<?> adapterView,
                               View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
        displayToast(spinnerLabel);
    }

    // Interface callback for when no spinner item is selected.
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // Do nothing.
    }
  }
  ```

  - 如上OrderActivity是AdapterView.OnItemSelectedListener接口的实现，并且实现了其两个方法。
  - 在 onCreate()中实例化一个spinner 并且为其设置监听器。

  ```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message = "Order: " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);


        // 创建一个Spinner
        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null){
            spinner.setOnItemSelectedListener(this);
        }

        // 使用字符数组和默认的spinner布局创建一个ArrayAdapter
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);

        // 指定出现选项列表时要使用的布局。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 将ArrayAdapter 应用到 spinner
        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }
  ```
- 添加代码响应Spinner的选择

  - 重写其两个方法即可

  ```java
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
  ```
- 小tips

> android:inputType的以下属性值会影响屏幕键盘的外观：
>
> textAutoCorrect：建议拼写更正。
>
> textCapSentences：每个新句子以大写字母开头。
> textPersonName：在用户键入时显示一行包含建议的文本，以及完成键，供用户在完成后点击。
> textMultiLine：启用多行文本输入和 Return 键以添加新行。
>
> textPassword：输入密码时隐藏密码。
> textEmailAddress：显示电子邮件键盘而不是标准键盘。
>
> phone：显示电话键盘而不是标准键盘。



单选按钮是输入控件，可用于从一组选项中仅选择一个选项：

* 在`单选按钮组中`将单选按钮元素组合在一起，以便一次只能选择一个`单选按钮`。
* `RadioButton`列出组中元素的顺序决定了它们在屏幕上的显示顺序。
* `RadioButton`使用每个`android:onClick`属性指定单击处理程序。
* 若要确定是否选择了按钮，请使用Checkable接口的isChecked（）方法，如果选择了该按钮，则返回`true`。

微调器Spinner提供了一个下拉菜单：
将微调器Spinner添加到布局。
使用 `ArrayAdapter` 将文本值数组指定为`Spinner`的菜单项。
实现 `AdapterView.OnItemSelectedListener` 接口，该接口还需要添加`onItemSelected()` 和 `onNothingSelected()`回调方法来激活`Spinner` 及其侦听器。
使用 `onItemSelected（）` 回调方法通过 `getItemAtPosition（）` 检索`Spinner`菜单中的选定项。