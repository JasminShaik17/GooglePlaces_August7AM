package cubex.mahesh.googleplaces_august7am

import cubex.mahesh.googleplaces_august7am.beans.PlacesBean
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlacesAPI {
    @GET("maps/api/place/nearbysearch/json?radius=1000&key=AIzaSyDdCGdR2cnWw0AB0LeN3jOTjKmkKag4tew")
    fun getPlaces(@Query("location") loc:String,
                  @Query("type") type:String):Call<PlacesBean>
}