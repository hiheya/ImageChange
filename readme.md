## 一、可点击图片练习

### 1.1. 在布局文件中添加图片以及描述信息
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

### 1.2. 为图像添加onClick()方法

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

### 1.3. 更改浮动操作按钮

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
---
## 二、输入控件练习

### 2.1. 在OrderActivity中添加一个输入name的编辑文本

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

### 2.2. 添加一个输入地址的编辑文本

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

### 2.3. 添加输入电话号码的编辑文本

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

### 2.4. 添加一个备注编辑文本

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

### 2.5. 添加单选按钮组和单选按钮

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

### 2.7. 添加按钮点击处理程序

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

### 2.8. 在布局中添加 Spinner

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
- 将微调器Spinner添加到布局。
- 使用 `ArrayAdapter` 将文本值数组指定为`Spinner`的菜单项。
- 实现 `AdapterView.OnItemSelectedListener` 接口，该接口还需要添加`onItemSelected()` 和 `onNothingSelected()`回调方法来激活`Spinner` 及其侦听器。
- 使用 `onItemSelected（）` 回调方法通过 `getItemAtPosition（）` 检索`Spinner`菜单中的选定项。

---
## 三、菜单和选取器
### 3.1 将选项菜单(OptionMenu)添加到活动中
1. 在res文件夹处右键新建一个menu文件夹
   ![image.png](http://i0.hdslb.com/bfs/album/e20fce50db895f674c558f80fc2bbb117dcb4eb7.png)
2. 而后在 menu文件夹处新建需要用到的menu源文件
   ![image.png](http://i0.hdslb.com/bfs/album/9185f4a61664cafa7e11c5335b128eb9afd38c53.png)
3. 在`MainActivity`当中添加菜单,重写`onCreateOptionsMenu()`方法，在该方法中导入菜单布局。
```java
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
```
4. 在`MainActivity`当中添加点击监听,重写`onOptionsItemSelected()`方法，在该方法中判断item获取到的id，然后再进行处理。
```java
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_order:
                Intent intent = new Intent(getApplicationContext(),OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE,mOrderMessage);
                startActivity(intent);
                return true;
            case R.id.action_status:
                displayToast(getString(R.string.action_status_message));
                return true;
            case R.id.action_favorites:
                displayToast(getString(R.string.action_favorites_message));
                return true;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_message));
                return true;
            case R.id.action_start_article:
                Intent intent1 = new Intent(getApplicationContext(),ArticleActivity.class);
                startActivity(intent1);
                return true;
            default:
                // do nothing
        }
        return super.onOptionsItemSelected(item);
    }
```
### 3.2 将上下文菜单(ContextMenu)添加到活动中
1. 新建menu源文件步骤同 **3.1** .
2. 在`ArticleActivity`当中添加上下文菜单，先在`onCreate()`当中为组件注册上下文菜单。
```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        TextView article_text = findViewById(R.id.article);
        // 为article_text注册一个上下文菜单。
        registerForContextMenu(article_text);
    }
```
3. 在`ArticleActivity`中导入菜单，重写 `onCreateContextMenu()`方法
```java
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context,menu);
    }
```
4. 在`ArticleActivity`当中添加选择菜单选项时的处理方法。在 `onContextItemSelected()` 方法中判断item获取到的id，然后再进行处理。
```java
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.context_edit:
                displayToast("Edit choice clicked");
                return true;
            case R.id.context_share:
                displayToast("share choice clicked");
                return true;
            case R.id.context_delete:
                displayToast("Delete choice clicked");
                return true;
            default:
                // Do nothing

        }
        return super.onContextItemSelected(item);
    }
```
### 3.3. 为菜单项添加图标
1. 详见menu_main.xml文件
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/action_contact"
        android:orderInCategory="100"
        android:title="@string/action_contact"
        app:showAsAction="never" />

    <item
        android:id="@+id/action_start_article"
        android:orderInCategory="100"
        android:title="article"
        app:showAsAction="never" />

    <item
        android:id="@+id/action_order"
        android:icon="@drawable/ic_shopping_cart"
        android:orderInCategory="10"
        android:title="@string/action_order"
        app:showAsAction="always" />
    <item
        android:id="@+id/action_status"
        android:icon="@drawable/ic_status_info"
        android:orderInCategory="20"
        android:title="@string/action_status"
        app:showAsAction="always" />
    <item
        android:id="@+id/action_favorites"
        android:icon="@drawable/ic_favorite"
        android:orderInCategory="30"
        android:title="@string/action_favorites"
        app:showAsAction="always" />
</menu>
```
2. 使用 `android:icon="xxx"`指定图标（前提是图标资源已存在）
- `app:showAsAction`可以指定图标是否显示在应用栏当中。
  - `"always"`：始终显示在应用栏中。（如果没有足够的空间，它可能会与其他菜单图标重叠。
  - `"ifRoom"`：如果有空间，则显示在应用栏中。
  - `"never"`：从不显示在应用栏中;其文本显示在“溢出”菜单中。
3. 添加图标资源步骤
- 在`“Project > Android ”`窗格中展开 res，然后右键单击（或按住 Control 并单击）drawable文件夹。
- 选择 `"new > Image Asset"` 此时会出现 `Configure Image Asset`对话框
- ![image.png](http://i0.hdslb.com/bfs/album/19c3bacdd2de0c82a19d64141efbab5ea905b683.png)
- ![image.png](http://i0.hdslb.com/bfs/album/72d39ecb79959d28647bfd5105f4605c621a50cb.png)
- 在下拉菜单中选择`Action Bar and Tab Icons`项。 
- 将`ic_action_name`更改为其他名称（例如“状态”图标的`ic_status_info`）。 
- 单击`Clip Art`（`Clip Art`旁边的 Android 徽标：）以选`Clip Art`图像作为图标。此时将显示一页图标。单击要使用的图标。 
- 从`Theme`下拉菜单中选择`HOLO_DARK`。这会将图标设置为白色，背景为深色（或黑色）。单击`“Next”`，然后单击`“Finish”`。
### 3.4  使用对话框请求用户的选择
1. 基于`”Empty Activity“`模板创建一个名为`”DialogForAlert“`的新项目。
2. 打开`activity_dialog_for_alert.xml`布局文件显示布局编辑器。
3. 将`android:onClick="onClickShowAlert()"`属性添加到按钮以调用单击处理程序。输入后，单击处理程序将以红色下划线。
4. 生成器类通常是它生成的类的静态成员类。使用 `AlertDialog.Builder` 构建一个标准的警报对话框，使用`setTitle（）`设置其标题，`setMessage（）`设置其消息，`setPositiveButton（）`和 `setNegativeButton（）`设置其按钮。
5. 若要使用对话框，需要先创建一个对象。为 `alert`创建添加单击处理程序，当用户单击时才会创建对话框。
6. 代码实现如下：
```java
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
```
7. 实现步骤：创建一个对象>设置标题>添加对话框按钮>创建并展示对话框
### 3.5 使用选取器进行用户输入
#### 3.5.1 使用编辑框
1. 继续使用`DialogForAlert`活动，在布局文件中添加`EDITTEXT`按钮。设置点击事件为`onClickEditText`。
```xml
    <Button
        android:id="@+id/btnEdit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="EditText"
        android:onClick="onClickEditText"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btnAlert" />
```
2. 实例化一个 `EditText`对象，再创建一个`AlertDialog.Builder` 对象.
3. 使用`setTitle（）`设置其标题，`setView（）`设置使用`EditText`输入，`setPositiveButton（）`和 `setNegativeButton（）`设置其按钮。
```java
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
```
#### 3.5.2 使用选取器进行用户输入
1. 继续使用`DialogForAlert`活动，在布局文件中添加`DATE`按钮。设置单击处理程序为`showDatePicker`。
2. 为日期选择器创建一个新的片段 > 展开 `java` > `work.icu007.imagechange`，然后选择 `DialogForActivity`。
   ![image.png](http://i0.hdslb.com/bfs/album/8cd93b456a2455bb8c76587e085c86c1871ece03.png)
3. 打开 `DatePickerFragment` 并编辑类定义以扩展和实现`DatePickerDialog.OnDateSetListener`来创建具有监听器的标准日期选取器。
```java
public class DatePickerFragment extends DialogFragment
                     implements DatePickerDialog.OnDateSetListener {
```
4. 实现`onDateSet()`方法
```java
public void onDateSet(DatePicker datePicker, 
                                 int year, int month, int day)
```
5. 删除空的公共构造函数。 `public DatePickerFragment()`
6. 将整个`onCreateView()`方法替换为返回 `Dialog` 的 `onCreateDialog()` 并注释返回值不能为`NULL`
```java
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),this,year,month,day);
    }
```
7. 修改 `DialogForAlert` 活动，它创建一个使用 `getSupportFragmentManager（）` 的实例来自动管理，并显示选取器。
```java
    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
```
8. 使用所选日期
   1. 打开`DialogForAlert`添加一个空方法：`processDatePickerResult()`，并以year、month和day作为参数。
   2. 将以下代码添加到`processDatePickerResult()`方法中，用以转换year、month和day。并使用Toast提示用户
    ```java
        public void processDatePickerResult(int year, int month, int day){
            String month_string = Integer.toString(month+1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);
            String dateMessage = (year_string + '/' + month_string + '/' + day_string);
            Toast.makeText(this, "Date" + dateMessage, Toast.LENGTH_SHORT).show();
        }
    ```
   3. 打开 `DatePickerFragment`，并将以下内容添加到`onDateSet()`方法中，并调用`processDatePickerResult()`来传递给`DialogForAlert()` year 、 month 和 day
   ```java
   @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        DialogForAlert dialogForAlert = (DialogForAlert) getActivity();
        dialogForAlert.processDatePickerResult(year,month,dayOfMonth);
    }
    ```
   
#### 3.5.3 使用选取器进行用户输入时间
1. 继续使用`DialogForAlert`活动，在布局文件中添加`Time`按钮。设置单击处理程序为`showTimePicker`。
2. 为日期选择器创建一个新的片段 > 展开 `java` > `work.icu007.imagechange`，然后选择 `DialogForActivity`。
   ![image.png](http://i0.hdslb.com/bfs/album/8cd93b456a2455bb8c76587e085c86c1871ece03.png)
3. 打开 `TimePickerFragment` 并编辑类定义以扩展和实现`TimePickerDialog.OnDateSetListener`来创建具有监听器的标准日期选取器。
```java
public class TimePickerFragment extends DialogFragment
                     implements TimePickerDialog.OnTimeSetListener {
```
4. 实现`onDateSet()`方法
```java
public void onTimeSet(TimePicker timePicker, 
                                 int hour, int minute)
```
5. 删除空的公共构造函数。 `public TimePickerFragment()`
6. 将整个`onCreateView()`方法替换为返回 `Dialog` 的 `onCreateDialog()` 并注释返回值不能为`NULL`
```java
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        // TimePickerDialog()方法中最后一个参数描述：is24HourView，当其为true时表示传入的为24h制时间，false则为12h制。
        return new TimePickerDialog(getActivity(), this, hour, minute,false);
    }
```
7. 修改 `DialogForAlert` 活动，它创建一个使用 `getSupportFragmentManager（）` 的实例来自动管理，并显示选取器。
```java
    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timePicker");
    }
```
8. 使用所选时间
    1. 打开`DialogForAlert`添加一个空方法：`processTimePickerResult()`，并以hour和minute作为参数。
    2. 将以下代码添加到`processTimePickerResult()`方法中，用以转换hour和minute。并使用Toast提示用户
    ```java
        public void processTimePickerResult(int hourOfDay, int minute){
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);

            String timeMessage = (hour_string + ':' + minute_string );
            Toast.makeText(this, "Time" + timeMessage, Toast.LENGTH_SHORT).show();
        }
    ```
    3. 打开 `TimePickerFragment`，并将以下内容添加到`onTimeSet()`方法中，并调用`processTimePickerResult()`来传递给`DialogForAlert()` hour和 minute
   ```java
   @Override
    public void onTimeSet(DatePicker view, int hourOfDay, int minute) {
        DialogForAlert dialogForAlert = (DialogForAlert) getActivity();
        dialogForAlert.processTimePickerResult(hourOfDay, minute);
    }
    ```
   





