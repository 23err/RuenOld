package ru.marslab.ruen.data.repositories.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.marslab.ruen.data.repositories.room.DAO.CardDao
import ru.marslab.ruen.data.repositories.room.DAO.TranslationDao
import ru.marslab.ruen.data.repositories.room.converters.DateConverter
import ru.marslab.ruen.data.repositories.room.entities.RoomCard
import ru.marslab.ruen.data.repositories.room.entities.RoomTranslation

@Database(
    entities = arrayOf(RoomCard::class, RoomTranslation::class),
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class RuenDatabase : RoomDatabase() {
    abstract fun cardDao(): CardDao
    abstract fun translateDao(): TranslationDao
}