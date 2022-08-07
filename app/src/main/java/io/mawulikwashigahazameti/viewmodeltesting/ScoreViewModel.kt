package io.mawulikwashigahazameti.viewmodeltesting

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    private var scoreA = 0
    private val _scoreA = MutableLiveData<Int>()
    private var scoreB = 0
    private val _scoreB = MutableLiveData<Int>()


    //  get initial count value at the beginning of our app
    fun scoreA(): MutableLiveData<Int> {
        _scoreA.value = scoreA
        return _scoreA
    }

    //  get initial count value at the beginning of our app
    fun scoreB(): MutableLiveData<Int> {
        _scoreB.value = scoreB
        return _scoreB
    }

    //update our Live Data counting values
    fun addOneA() {
        scoreA += 1
        _scoreA.value = scoreA
    }

    fun addOneB() {
        scoreB += 1
        _scoreB.value = scoreB

    }

    fun addTwoA() {
        scoreA += 2
        _scoreA.value = scoreA
    }

    fun addTwoB() {
        scoreB += 2
        _scoreB.value = scoreB
    }

    fun addThreeA() {
        scoreA += 3
        _scoreA.value = scoreA
    }

    fun addThreeB() {
        scoreB += 3
        _scoreB.value = scoreB
    }

    fun reset() {
        scoreA = 0
        scoreB = 0
        _scoreA.value = scoreA
        _scoreB.value = scoreB
    }

}