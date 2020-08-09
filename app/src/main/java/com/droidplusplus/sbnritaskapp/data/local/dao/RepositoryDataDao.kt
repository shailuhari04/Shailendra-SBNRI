package com.droidplusplus.sbnritaskapp.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.droidplusplus.sbnritaskapp.data.local.entities.RepositoryData

@Dao
interface RepositoryDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(dataItems: List<RepositoryData>)

    @Query("select * from repositorydata")
    fun getAllDataItem(): LiveData<List<RepositoryData>>
}
