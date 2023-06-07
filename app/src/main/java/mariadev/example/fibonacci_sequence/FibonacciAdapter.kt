package mariadev.example.fibonacci_sequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonacciAdapter(val fibonacciList: List<BigInteger>): RecyclerView.Adapter<FibonacciAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fibonnaci,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FibonacciAdapter.ViewHolder, position: Int) {
        val fibonacciNumber = fibonacciList[position]
        holder.tvNum.text = fibonacciNumber.toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvNum: TextView  = itemView.findViewById(R.id.tvNum)
    }
}





