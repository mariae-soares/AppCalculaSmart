/*criar nova pasta em values, nome Styles.xml e add esse código*/

<style name="Container_Button">
    <item name="android:layout_width">0dp</item>
    <item name="android:layout_height">match_parent</item>
    <item name="android:layout_weight">1</item>
    <item name="android:textSize">28sp</item>
    <item name="android:gravity">center</item>
    <item name="android:textStyle">bold</item>
    <item name="android:layout_margin">0.5dp</item>
</style>

<style name="Operators_Button" parent="Container_Button">
    <item name="android:backgroud">@color/orange</item>
    <item name="android:textColor">@color/white</item>
</style>

<style name="Numbers_Button" parent="Container_Button">
    <item name="android:background">@drawable/botao_numero_clicado</item>
    <item name="android:textColor">@color/black</item>
</style>
