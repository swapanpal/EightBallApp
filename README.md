# EightBallApp
Random image changing app by using Random object

// casting imageView and Button
        Button askButton = findViewById(R.id.ask_button);
        final ImageView eightBallImage = findViewById(R.id.eight_ball_image);
        // Array list for eight ball image
        final int[] eightBallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make a random number generator
                Random randomNumberGenerator = new Random();
                // store the random number here
                int number = randomNumberGenerator.nextInt(5);
                // set eight ball image to image view randomley
                eightBallImage.setImageResource(eightBallArray[number]);
            }
        });
        
        
        
        xml part:
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#26ade0"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/colorPrimary"
        android:text="@string/title_text"
        android:padding="10sp"
        android:textSize="20sp"
        android:textColor="#ffffff"
        android:layout_marginTop="40dp"
        android:gravity="center_horizontal"
        android:textStyle="bold"/>
    <ImageView
        android:id="@+id/eight_ball_image"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:scaleType="centerCrop"
        android:src="@drawable/ball1"/>
    <Button
        android:id="@+id/ask_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="20dp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:text="@string/button_text"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:background="#3F51B5"
        android:textColor="#ffffff"
        android:textSize="20sp"
        android:textAllCaps="false"/>
</RelativeLayout>
