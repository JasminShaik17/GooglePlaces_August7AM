package cubex.mahesh.googleplaces_august7am.beans

import com.google.gson.annotations.SerializedName

data class ResultsItem(@SerializedName("types")
                       val types: List<String>?,
                       @SerializedName("icon")
                       val icon: String = "",
                       @SerializedName("rating")
                       val rating: Double = 0.0,
                       @SerializedName("photos")
                       val photos: List<PhotosItem>?,
                       @SerializedName("reference")
                       val reference: String = "",
                       @SerializedName("scope")
                       val scope: String = "",
                       @SerializedName("name")
                       val name: String = "",
                       @SerializedName("opening_hours")
                       val openingHours: OpeningHours,
                       @SerializedName("geometry")
                       val geometry: Geometry,
                       @SerializedName("vicinity")
                       val vicinity: String = "",
                       @SerializedName("id")
                       val id: String = "",
                       @SerializedName("plus_code")
                       val plusCode: PlusCode,
                       @SerializedName("place_id")
                       val placeId: String = "")