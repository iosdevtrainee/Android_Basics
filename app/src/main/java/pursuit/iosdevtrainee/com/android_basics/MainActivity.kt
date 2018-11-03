package pursuit.iosdevtrainee.com.android_basics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import pursuit.iosdevtrainee.com.android_basics.R.id
import pursuit.iosdevtrainee.com.android_basics.R.layout
import android.widget.Toast
//public class MainActivity extends AppCompatActivity {
class MainActivity : AppCompatActivity() {
//    field have to be intiliazed in Kotlin or must use the lateint modifier
    internal lateinit var mResetButton: Button
//    private Button mResetButton
    internal lateinit var mSendButton: Button
//    private Button mSendButton java version
    internal lateinit var nameView: TextView
    internal lateinit var numberView: TextView
    internal lateinit var editName: EditText
    internal lateinit var editNumber: EditText
    internal lateinit var editThis: EditText
    internal lateinit var toast: Toast


//   override is a safeguard which makes sure the base class has
//   the method which is declared directly below the override kw
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super calls the base classes method i.e. AppCompatActivity
//        .onCreate
//        super.onCreate(savedInstanceState);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        super.onCreate(savedInstanceState);
//        onCreate is a app lifecycle method which is called when the

        setContentView(layout.activity_main)
//        setContentView goes to the resource directory i.e. res/ and
//        loads the layout named activity_main in activity_main.xml
//
//            }
//        };
        // casting in Kotlin is done via generic methods i.e.
        // findViewById gets the generic view object and you
        // downcast it to the specific view which you want.
        //mResetButton = (Button) findViewById(R.id.resetButton)
        mResetButton = findViewById<Button>(R.id.resetButton)
        //mSendButton = (Button) findViewById(R.id.sendButton)
        mSendButton = findViewById<Button>(R.id.sendButton)
        nameView = findViewById<TextView>(R.id.nameSendLabel)
        numberView = findViewById<TextView>(R.id.numberSendLabel)
        editName = findViewById<EditText>(R.id.nameText)
        // Kotlin can do type inference so this doesn't need
        // to be explicitly annotated.
        editNumber = findViewById(R.id.numberText)
        // onclick takes a self i.e. view object as a param
        // and calls internal methods of the activity object class
        // in this case Main Activity
        mSendButton.setOnClickListener{view ->
            sendData()
        }
        //mSendButton.setOnClickListener(new View.OnClickListener(){
            //    @Override
                //public void onClick(View v){
                //
                //}
                //});
        mResetButton.setOnClickListener {view ->
            resetData()
        }

    }
//    /** Called when the user taps the Send button */
//    public void sendMessage(View view) {
//        // Do something in response to button
//    }
//}
    private fun resetData() {
        nameView.text = ""
        numberView.text = ""
    }

    private fun sendData() {
        nameView.text = editName.text
        numberView.text = editNumber.text
    }

}

