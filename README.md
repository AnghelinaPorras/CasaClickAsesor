# CasaClick Perú - Asesor

Proyecto Android independiente de Anghelina Porras Torres, caso 9, evaluación parcial Semana 8.

Abrir esta carpeta en Android Studio. Instalar SDK 37.1 si se solicita. Ejecutar la API compartida en puerto 3001 y usar `http://10.0.2.2:3001/` en Login del emulador. La URL es editable.

Cuenta: `asesor@casaclick.pe`; clave ficticia `CasaClick2026!`. Solo admite rol administrador. El primer ingreso es online.

Funciones: catálogo local, registro/edición/eliminación de propiedades, validación de precio > 0, consulta por distrito, visitas de todos los clientes, consulta por fecha, gestión de estados, sincronización offline con cola transaccional y pantalla de errores/historial.

La eliminación de propiedades con visitas activas se rechaza en el servidor. Una versión antigua devuelve 409 y permite descartar el cambio para recuperar el dato remoto. Sync incluye controles de demostración de error 503, habilitados en la API con ENABLE_DEMO=true.

```powershell
$env:JAVA_HOME='C:\Program Files\Android\Android Studio\jbr'
.\gradlew.bat assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`. No subir `local.properties`, build ni cachés; ya están en `.gitignore`.

MVVM: ui -> viewmodel -> data/repository -> Room/Retrofit. `worker/SyncWorker.kt` procesa la cola con red disponible; cada escritura usa una transacción.

Pruebas: `PersistenciaSincronizacionTest` usa Room y un servidor simulado; `FlujoCompletoTest` requiere una API limpia con datos de seed y el argumento de instrumentación `apiUrl`. La documentación completa se entrega junto con este proyecto en `CasaClickPeru_Semana8`.
