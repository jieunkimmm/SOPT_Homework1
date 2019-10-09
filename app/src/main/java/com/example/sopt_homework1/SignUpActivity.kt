package com.example.sopt_homework1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import java.io.IOException
import java.io.File
import java.io.FileOutputStream
import android.os.Environment
import android.graphics.Bitmap
import java.io.ByteArrayOutputStream
import android.media.MediaScannerConnection
import java.util.*

class SignUpActivity : AppCompatActivity() {
    var signup_id: EditText? = null
    var signup_pw: EditText? = null
    var signup_name: EditText? = null
    var signup_pwch: EditText? = null
    var signup: Button? = null
    var imageView: ImageView? = null
    var camera_button: Button? = null
    var gallery_button: Button? = null
    private val GALLERY = 1
    private val CAMERA = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        signup_id = findViewById(R.id.id)
        signup_pw = findViewById(R.id.pw)
        signup_name = findViewById(R.id.name)
        signup_pwch = findViewById(R.id.pw_check)
        signup = findViewById(R.id.signIn_signupBt)
        imageView = findViewById(R.id.imageview)
        camera_button = findViewById(R.id.camera_button)
        gallery_button = findViewById(R.id.gallery_button)


        camera_button?.setOnClickListener(){
            takePhotoFromCamera()
        }

        gallery_button?.setOnClickListener(){
            choosePhotoFromGallary()
        }

        signup?.setOnClickListener(){
            if(signup_id?.text.toString().isEmpty() || signup_pw?.text.toString().isEmpty() || signup_name?.text.toString().isEmpty() ||
                signup_pwch?.text.toString().isEmpty()){
                // 빈칸이 있으면 실패 메세지를 보여준다
                Toast.makeText(this, "빈 칸 없이 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else{
                if(signup_pw?.text.toString().equals(signup_pwch?.text.toString())){
                    //Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
                    val intent = Intent()
                    intent.putExtra("signup_id", signup_id?.text.toString())
                    intent.putExtra("signup_pw", signup_pw?.text.toString())
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }else{
                    Toast.makeText(this, "비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == GALLERY){
            if (data != null)
            {
                val contentURI = data!!.data
                try
                {
                    val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, contentURI)
                    val path = saveImage(bitmap)
                    imageView!!.setImageBitmap(bitmap)

                }
                catch (e: IOException) {
                    e.printStackTrace()
                    Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    fun choosePhotoFromGallary() {
        val galleryIntent = Intent(Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI)

        startActivityForResult(galleryIntent, GALLERY)
    }

    private fun takePhotoFromCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, CAMERA)
    }

    fun saveImage(myBitmap: Bitmap):String {
        val bytes = ByteArrayOutputStream()
        myBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bytes)
        val wallpaperDirectory = File(
            (Environment.getExternalStorageDirectory()).toString() + IMAGE_DIRECTORY)
        // have the object build the directory structure, if needed.
        if (!wallpaperDirectory.exists())
        {

            wallpaperDirectory.mkdirs()
        }

        try
        {
            val f = File(wallpaperDirectory, ((Calendar.getInstance()
                .getTimeInMillis()).toString() + ".jpg"))
            f.createNewFile()
            val fo = FileOutputStream(f)
            fo.write(bytes.toByteArray())
            MediaScannerConnection.scanFile(this,
                arrayOf(f.getPath()),
                arrayOf("image/jpeg"), null)
            fo.close()

            return f.getAbsolutePath()
        }
        catch (e1: IOException) {
            e1.printStackTrace()
        }

        return ""
    }

    companion object {
        private val IMAGE_DIRECTORY = "/demonuts"
    }


}
