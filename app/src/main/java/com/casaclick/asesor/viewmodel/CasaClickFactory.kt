package com.casaclick.asesor.viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.casaclick.asesor.di.AppContainer
class CasaClickFactory(private val c: AppContainer) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T = when(modelClass) {
        AuthViewModel::class.java -> AuthViewModel(c)
        PropiedadViewModel::class.java -> PropiedadViewModel(c)
        VisitaViewModel::class.java -> VisitaViewModel(c)
        SyncViewModel::class.java -> SyncViewModel(c)
        else -> error("ViewModel desconocido.")
    } as T
}
