# Simple-Calculator-Application (Android Studio Projects)

 <img src="app/image 2.png" width="200" height="400"> <img src="app/image 1.png" width="200" height="400"> <img src="app/image 3.png" width="200" height="400">

  
 
<h4>Main Activtity Java Code:</h4>



    public class MainActivity extends AppCompatActivity {
    EditText et1, et3;
    Button b,b2,b3,b4,b6;
    TextView ans;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        et1 = (EditText) findViewById(R.id.et1);
        et3 = (EditText) findViewById(R.id.et3);
        b = (Button) findViewById(R.id.b);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b6 = (Button) findViewById(R.id.b6);
        ans = (TextView) findViewById(R.id.ans);
 
 
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int k = i + j;
                ans.setText("Ans is: " + k);
            }
        });
 
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int m = i - j;
                ans.setText("Ans is: " + m);
            }
        });
 
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int l = i * j;
                ans.setText("Ans is: " + l);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et3.getText().toString());
                int d = i / j;
                ans.setText("Ans is: " + d);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    
    
   
   
   <h4>activity_main XML code:</h4>
    
    
    
    
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/tv1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="64dp"
        android:layout_marginLeft="64dp"
        android:layout_marginTop="128dp"
        android:text="1st No:"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/tv2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="64dp"
        android:layout_marginLeft="64dp"
        android:layout_marginTop="64dp"
        android:text="2nd No:"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv1" />

    <EditText
        android:id="@+id/et1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="128dp"
        android:layout_marginEnd="32dp"
        android:layout_marginRight="32dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/et3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="192dp"
        android:layout_marginEnd="32dp"
        android:layout_marginRight="32dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/b"
        android:layout_width="61dp"
        android:layout_height="40dp"
        android:text="SUM"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.653"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.504" />

    <TextView
        android:id="@+id/ans"
        android:layout_width="143dp"
        android:layout_height="43dp"
        android:text="Ans is ..."
        android:textColor="@android:color/holo_red_dark"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/b" />

    <Button
        android:id="@+id/b2"
        android:layout_width="85dp"
        android:layout_height="41dp"
        android:text="sub"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/b"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/b3"
        android:layout_width="83dp"
        android:layout_height="37dp"
        android:text="mul"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/b"
        app:layout_constraintHorizontal_bias="0.833"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/b4"
        android:layout_width="77dp"
        android:layout_height="41dp"
        android:text="Div"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/b3"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/b6"
        android:layout_width="65dp"
        android:layout_height="48dp"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginRight="16dp"
        android:background="?attr/colorControlHighlight"
        android:text="Exit"
        android:textColor="@android:color/holo_red_dark"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    </androidx.constraintlayout.widget.ConstraintLayout>

