//criar dentro de drawable nome = shape_numero_normal

    <solid android:color="@color/white"/>


//criar dentro de drawable nome = shape_numero_selecionado

    <solid android:color="@color/white"/>


//criar dentro de drawable nome = botao_numero_clicado

    <item android:drawable="@drawable/shape_numero_selecionado" android:state_pressed="true"/>
    <item android:drawable="@drawable/shape_numero_selecionado" android:state_focused="true"/>
    <item android:drawable="@drawable/shape_numero_normal"/>