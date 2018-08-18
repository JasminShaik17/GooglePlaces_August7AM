package cubex.mahesh.googleplaces_august7am.beans

import com.google.gson.annotations.SerializedName

data class Geometry(@SerializedName("viewport")
                    val viewport: Viewport,
                    @SerializedName("location")
                    val location: Location)