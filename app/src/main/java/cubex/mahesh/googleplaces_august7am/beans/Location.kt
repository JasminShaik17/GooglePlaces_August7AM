package cubex.mahesh.googleplaces_august7am.beans

import com.google.gson.annotations.SerializedName

data class Location(@SerializedName("lng")
                    val lng: Double = 0.0,
                    @SerializedName("lat")
                    val lat: Double = 0.0)