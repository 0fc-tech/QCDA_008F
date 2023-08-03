package com.example.mod12apirest

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONArray
import java.io.IOException

//logt :  créé un tag avec le nom du fichier
private const val TAG = "PunkVM"
class PunkVM : ViewModel() {
    val punkBeer : PunkBeer? = null
    private val clientHttp = OkHttpClient()
    private val requestBeers = Request.Builder()
        .url("https://api.punkapi.com/v2/beers")
        .build()
    init {
        viewModelScope.launch(Dispatchers.IO){
            val response = clientHttp.newCall(requestBeers).execute()
            val responseRaw = response.body?.string().toString()
            Log.i(TAG, "PunkVM: $responseRaw", )
            val responseJson : JSONArray = JSONArray(responseRaw)
            val beerAl = arrayListOf<PunkBeer>()
            for (beer in 0 until responseJson.length()){
                beerAl.add(
                    PunkBeer(
                        responseJson.getJSONObject(beer).getString("name"),
                        responseJson.getJSONObject(beer).getString("description"),
                        responseJson.getJSONObject(beer).getDouble("abv"),
                        responseJson.getJSONObject(beer).getString("tagline"),
                        /*responseJson.getJSONObject(beer).getDouble("ibu").toDouble()*/0.0,
                    )
                )
            }
            Log.i(TAG, "PunkVM:Je bois la bière ${beerAl.first().name} ")
        }
    }
}











