package com.droidplusplus.sbnritaskapp.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.droidplusplus.sbnritaskapp.data.local.dao.RepositoryDataDao
import com.droidplusplus.sbnritaskapp.data.local.entities.RepositoryData

@Database(entities = [RepositoryData::class], version = 1)
abstract class RepositoryDataDB : RoomDatabase() {

    abstract fun repositoryDataDao(): RepositoryDataDao

    companion object {
        private var INSTANCE: RepositoryDataDB? = null

        fun getDBInstance(context: Context): RepositoryDataDB {
            if (INSTANCE == null) {
                synchronized(RepositoryDataDB::class) {
                    INSTANCE = buildRoomDb(context)
                }
            }
            return INSTANCE!!
        }

        private fun buildRoomDb(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                RepositoryDataDB::class.java,
                "repository_database.db"
            ).build()

    }

}
