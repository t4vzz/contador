package br.com.viewModelProject.meucontadordecliques.views

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _contador = MutableLiveData(0)
    val contador: LiveData<Int> = _contador

    fun incrementaContador(){
        _contador.value = _contador.value?.plus(1)
    }
}