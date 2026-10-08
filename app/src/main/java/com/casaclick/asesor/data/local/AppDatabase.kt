package com.casaclick.asesor.data.local
import androidx.room.*
import com.casaclick.asesor.data.local.dao.*
import com.casaclick.asesor.data.local.entities.*
@Database(entities = [UsuarioEntity::class, PropiedadEntity::class, VisitaEntity::class, FavoritoEntity::class, OperacionPendienteEntity::class, SyncMetadataEntity::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {
    abstract fun usuarios(): UsuarioDao
    abstract fun propiedades(): PropiedadDao
    abstract fun visitas(): VisitaDao
    abstract fun favoritos(): FavoritoDao
    abstract fun operaciones(): OperacionPendienteDao
    abstract fun metadata(): SyncMetadataDao
}
