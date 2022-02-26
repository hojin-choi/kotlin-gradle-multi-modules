package dev.hojin.domain.service

import com.google.gson.Gson
import dev.hojin.domain.entity.AstroResult
import java.net.URL

class AstroRequest {
    companion object {
        private const val ASTRO_URL = "http://api.open-notify.org/astros.json"
    }

    operator fun invoke(): AstroResult {
        val responseString = URL(ASTRO_URL).readText()
        return Gson().fromJson(responseString, AstroResult::class.java)
    }
}
