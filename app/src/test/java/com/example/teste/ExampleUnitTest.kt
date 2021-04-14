package com.example.teste

import com.example.teste.model.ContatoHttp
import com.example.teste.model.InfoRequest
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ApiTest {
    @Test
    fun executaRequest(){
        val resposta : InfoRequest? = ContatoHttp.procuraAluno()
        println(resposta)
        checkNotNull(resposta)
        assert(resposta.sucesso)
    }
}