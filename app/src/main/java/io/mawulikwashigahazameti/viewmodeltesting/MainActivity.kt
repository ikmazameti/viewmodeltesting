package io.mawulikwashigahazameti.viewmodeltesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import io.mawulikwashigahazameti.viewmodeltesting.databinding.ActivityCourtBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCourtBinding
    private lateinit var viewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_court)
        viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)

        displayForTeamA()
        displayForTeamB()


        //Increase by one
        binding.freeThrowA.setOnClickListener {
            viewModel.addOneA()
            displayForTeamA()
        }

        binding.freeThrowB.setOnClickListener {
            viewModel.addOneB()
            displayForTeamB()
        }

        //Increase by two
        binding.twoPointsA.setOnClickListener {
            viewModel.addTwoA()
            displayForTeamA()
        }

        binding.twoPointsB.setOnClickListener {
            viewModel.addTwoB()
            displayForTeamB()
        }

        //Increase by three
        binding.threePointsA.setOnClickListener {
            viewModel.addThreeA()
            displayForTeamA()
        }

        binding.threePointsB.setOnClickListener {
            viewModel.addThreeB()
            displayForTeamB()
        }

    }

    //Displays the score of Team A
    private fun displayForTeamA() {
        binding.scoreA.text = viewModel.scoreA.toString()
    }

    //Displays the score of Team B
    private fun displayForTeamB() {
        binding.scoreB.text = viewModel.scoreB.toString()
    }
}