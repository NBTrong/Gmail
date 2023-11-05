package com.example.gmailkt


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListAdapter
import android.widget.ListView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: ListAdapter
    private lateinit var gmail: Gmail
    var dataArrayList = ArrayList<Gmail?>()

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        var listImage = intArrayOf(
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
        )

        var title = arrayOf(
            "Cách làm món ...",
            "Làm thế nào ...",
            "Phân tích ...",
            "Khám phá vẻ đẹp ...",
            "Những bài ...",
            "Những cách ...",
            "Bí quyết ...",
            "Tạo một ...",
            "Những kỹ ...",
            "Những điểm ..."
        )


        var summary = arrayOf(
            "Một bài viết thú vị về công nghệ mới đang thay đổi cách chúng ta làm việc.",
            "Tóm tắt cuộc trò chuyện hôm nay với người bạn cũ về cuộc hành trình đến núi rừng.",
            "Một bản tóm tắt về bài giảng về khoa học đang diễn ra tại trường học.",
            "Tóm tắt cuốn sách mới mà tôi đã đọc về lịch sử nghệ thuật.",
            "Tóm tắt cuộc phỏng vấn với một nhà khoa học nổi tiếng về các phát triển trong y học.",
            "Một tóm tắt về buổi diễn hài kịch cuối tuần qua, nơi tôi đã cười nhiều.",
            "Hôm nay, chúng tôi đánh giá một bộ phim mới và viết một tóm tắt về nó.",
            "Tóm tắt cuộc trò chuyện với người hàng xóm về kế hoạch kỳ nghỉ mùa hè.",
            "Một bài viết tóm tắt về cuộc thi thể thao cuối tuần qua và những người chiến thắng.",
            "Tóm tắt buổi triển lãm nghệ thuật mới tại bảo tàng đương đại."
        )


        var content = arrayOf(
            "Hôm nay, chúng tôi quyết định tham quan một bảo tàng nghệ thuật ở thành phố.",
            "Cuối tuần này, chúng tôi sẽ dự đám cưới của một người bạn thân.",
            "Trời nắng đẹp, và chúng tôi dự định đi dạo chơi ở công viên hoặc bãi biển.",
            "Hôm nay là ngày của cuộc thi thể thao của con trai, chúng tôi đang tập luyện và chuẩn bị cho sự kiện này.",
            "Cuối tuần này, chúng tôi dự định tham gia vào một khóa học nấu ăn tại một nhà hàng danh tiếng.",
            "Chúng tôi đang lên kế hoạch cho chuyến du lịch dài hạn đến một quốc gia châu Âu.",
            "Hôm nay, chúng tôi đã mua vé xem một buổi biểu diễn âm nhạc tại sân khấu trong nhà.",
            "Dự định mua một chiếc xe mới trong thời gian sắp tới để thay thế chiếc xe cũ.",
            "Chúng tôi đang làm việc tự sửa chữa một phần của ngôi nhà, đó là một dự án khá thú vị.",
            "Hôm nay, chúng tôi dự định tự nấu một bữa tối đặc biệt và thử một món ăn mới."
        )

        for(i in listImage.indices){
            gmail = Gmail(
                title[i],summary[i],content[i], listImage[i]
            )
            dataArrayList.add(gmail)
        }

        listAdapter = GmailAdapter(this@MainActivity,dataArrayList)
        var listview = findViewById<ListView>(R.id.listgmail)
        listview.adapter = listAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}