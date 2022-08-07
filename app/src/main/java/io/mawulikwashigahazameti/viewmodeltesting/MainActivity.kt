package io.mawulikwashigahazameti.viewmodeltesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import io.mawulikwashigahazameti.viewmodeltesting.databinding.ActivityCourtBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCourtBinding
    private lateinit var viewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_court)
        viewModel = ViewModelProvider(this)[ScoreViewModel::class.java]

        // Get initial counting value ( equal to zero at the beginning of the app)
        viewModel.scoreA().observe(this, Observer {
            binding.scoreA.text = it.toString()
        })
        viewModel.scoreB().observe(this, Observer {
            binding.scoreB.text = it.toString()
        })

        //start counters
        binding.freeThrowA.setOnClickListener {
            viewModel.addOneA()
        }

        binding.twoPointsA.setOnClickListener {
            viewModel.addTwoA()
        }

        binding.threePointsA.setOnClickListener {
            viewModel.addThreeA()
        }

        binding.freeThrowB.setOnClickListener {
            viewModel.addOneB()
        }

        binding.twoPointsB.setOnClickListener {
            viewModel.addTwoB()
        }

        binding.threePointsB.setOnClickListener {
            viewModel.addThreeB()
        }

        binding.resetBtn.setOnClickListener { viewModel.reset() }
    }
}