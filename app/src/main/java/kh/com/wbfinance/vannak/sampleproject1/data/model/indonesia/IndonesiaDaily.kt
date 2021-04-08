package kh.com.wbfinance.vannak.sampleproject1.data.model.indonesia

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class IndonesiaDaily(
    @Expose @SerializedName("fid")
    val fid: Int = 0,
    @Expose @SerializedName("harike")
    val days: Int = 0,
    @Expose @SerializedName("jumlahKasusBaruperHari")
    val newCasePerDay: Int = 0,
    @Expose @SerializedName("jumlahKasusKumulatif")
    val totalCase: Int = 0,
    @Expose @SerializedName("jumlahPasienMeninggal")
    val totalDeath: Int = 0,
    @Expose @SerializedName("jumlahPasienSembuh")
    val totalRecover: Int = 0,
    @Expose @SerializedName("tanggal")
    val date: Long = 0
)