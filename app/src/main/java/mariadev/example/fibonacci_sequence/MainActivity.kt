package mariadev.example.fibonacci_sequence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import mariadev.example.fibonacci_sequence.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayFib()
    }
    fun displayNumbers(count: Int): List<BigInteger>{
        var  fiblist = mutableListOf<BigInteger>(BigInteger.ZERO,BigInteger.ONE)
        while (fiblist.size < count){
            var next = fiblist[fiblist.lastIndex] + fiblist[fiblist.lastIndex -1]
            fiblist.add(next)
        }
        return fiblist
    }
    fun displayFib(){
        binding.rvfibrecycler.layoutManager = LinearLayoutManager(this)
        var fibadapter = FibonacciAdapter(displayNumbers(100))
        binding.rvfibrecycler.adapter = fibadapter
    }
}