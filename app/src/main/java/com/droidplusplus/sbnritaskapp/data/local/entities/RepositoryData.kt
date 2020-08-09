package com.droidplusplus.sbnritaskapp.data.local.entities


import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.Entity
import kotlinx.android.parcel.Parcelize

@Keep
@Entity
@Parcelize
data class RepositoryData(
    val id: Long,
    val name: String? = null,
    val description: String? = null,
    val owner: OwnerInfo? = null,
    val license: LicenseInfo? = null,
    val open_issues_count: Int = 0,
    val forks: Int = 0,
    val stars: Int = 0,
    val language: String? = null
) : Parcelable

@Keep
@Parcelize
data class OwnerInfo(
    val avatar_url: String
) : Parcelable

@Keep
@Parcelize
data class LicenseInfo(
    val name: String
) : Parcelable