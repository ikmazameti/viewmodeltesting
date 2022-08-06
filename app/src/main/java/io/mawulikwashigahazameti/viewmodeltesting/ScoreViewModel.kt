package io.mawulikwashigahazameti.viewmodeltesting

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    var scoreA = 0
    var scoreB = 0


    fun addOneA(): Int {
        return scoreA++
    }

    fun addOneB(): Int {
        return scoreB++
    }

    fun addTwoA(): Int {
        scoreA += 2
        return scoreA
    }

    fun addTwoB(): Int {
        scoreB += 2
        return scoreB
    }

    fun addThreeA(): Int {
        scoreA += 3
        return scoreA
    }

    fun addThreeB(): Int {
        scoreB += 3
        return scoreB
    }

}