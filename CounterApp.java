<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorDarkViolet"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="258dp"
        android:layout_height="75dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="42dp"
        android:layout_marginLeft="42dp"
        android:layout_marginTop="43dp"
        android:text="Counter 1 : "
        android:textStyle="bold"
        android:textSize="28sp"
        android:background="@color/colorAqua"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="247dp"
        android:layout_height="77dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="50dp"
        android:layout_marginLeft="50dp"
        android:layout_marginTop="142dp"
        android:background="@color/colorSpringGreen"
        android:text="Counter 2 : "
        android:textStyle="bold"
        android:textSize="28sp" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="243dp"
        android:layout_height="77dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="51dp"
        android:layout_marginLeft="51dp"
        android:background="@color/colorRed"
        android:layout_marginTop="246dp"
        android:text="Counter 3 : "
        android:textStyle="bold"
        android:textSize="28sp"  />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginBottom="65dp"
        android:text="Exit" />

    <Button
        android:id="@+id/button4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="153dp"
        android:layout_marginLeft="153dp"
        android:layout_marginBottom="209dp"
        android:text="EEE" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="52dp"
        android:layout_marginRight="52dp"
        android:layout_marginBottom="209dp"
        android:text="ME" />

    <Button
        android:id="@+id/button6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="91dp"
        android:layout_marginLeft="91dp"
        android:layout_marginBottom="129dp"
        android:text="SWE" />

    <Button
        android:id="@+id/button7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="89dp"
        android:layout_marginRight="89dp"
        android:layout_marginBottom="129dp"
        android:text="RME" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="35dp"
        android:layout_marginLeft="35dp"
        android:layout_marginBottom="64dp"
        android:text="Clear" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="30dp"
        android:layout_marginLeft="30dp"
        android:layout_marginBottom="207dp"
        android:text="CSE" />

</RelativeLayout>
