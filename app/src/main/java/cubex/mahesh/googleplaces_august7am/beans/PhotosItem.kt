package cubex.mahesh.googleplaces_august7am.beans

import com.google.gson.annotations.SerializedName

data class PhotosItem(@SerializedName("photo_reference")
                      val photoReference: String = "",
                      @SerializedName("width")
                      val width: Int = 0,
                      @SerializedName("html_attributions")
                      val htmlAttributions: List<String>?,
                      @SerializedName("height")
                      val height: Int = 0)