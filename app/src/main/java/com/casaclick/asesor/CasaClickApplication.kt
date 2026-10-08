package com.casaclick.asesor
import android.app.Application
import com.casaclick.asesor.di.AppContainer
import com.casaclick.asesor.worker.SyncWorker
class CasaClickApplication : Application() {
    lateinit var container: AppContainer
        private set
    override fun onCreate() { super.onCreate();container=AppContainer(this);SyncWorker.periodico(this); if(container.sesion.activa) container.programar() }
}
