// arquivo de activity_main.xml

<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//
//
//
//
    android:orientation="vertical"
    android:background="@color/white"
//

    <androidx.appcompat.widget.AppCompatView
        android:id="@+id/txt_expressao"
        android:layout_widht="match_parent"
        android:layout_height="80dp"
        android:text=""
        android:textColor="@color/black"
        android:textSize="40sp"
        android:gravity="end"
        android:layout_marginEnd="10dp"
        android:ellipsize="start"
        android:singleLine="true"/>

    <androidx.appcompat.widget.AppCompatView
        android:id="@+id/txt_resultado"
        android:layout_widht="match_parent"
        android:layout_height="100dp"
        android:text=""
        android:textColor="@color/black"
        android:textSize="30sp"
        android:gravity="end"
        android:layout_marginEnd="10dp"
        android:ellipsize="end"
        android:maxLines="1"/>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="0.8"
        android:orientation="horizontal"

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/bt_limpar"
            style="@style/Operators_Button"
            android:layout_weight="3"
            android:text="C" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/divisao"
            style="@style/Operators_Button"
            android:text="/" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal"

        <<androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_sete"
            style="@style/Numbers_Button"
            android:text="7" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_oito"
            style="@style/Numbers_Button"
            android:text="8" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_nove"
            style="@style/Numbers_Button"
            android:text="9" /> 

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/multiplicacao"
            style="@style/Operators_Button"
            android:text="X" /> 

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal"

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_quatro"
            style="@style/Numbers_Button"
            android:text="4" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_cinco"
            style="@style/Numbers_Button"
            android:text="5" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_seis"
            style="@style/Numbers_Button"
            android:text="6" /> 

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/subtracao"
            style="@style/Operators_Button"
            android:text="-" /> 

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal"

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_um"
            style="@style/Numbers_Button"
            android:text="1" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_dois"
            style="@style/Numbers_Button"
            android:text="2" />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_tres"
            style="@style/Numbers_Button"
            android:text="3" /> 

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/soma"
            style="@style/Operators_Button"
            android:text="+" /> 

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal"

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/ponto"
            style="@style/Numbers_Button"
            android:text="." />

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/numero_zero"
            style="@style/Numbers_Button"
            android:text="0" />

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/backspace"
            style="@style/Numbers_Button"
            android:src="@drawabre/backspace"
            android: scaleType="center" /> 

        <androidx.appcompat.wiget.AppCompatButton
            android:id="@+id/igual"
            style="@style/Operators_Button"
            android:text="=" /> 

    </LinearLayout>

</LinearLayout>