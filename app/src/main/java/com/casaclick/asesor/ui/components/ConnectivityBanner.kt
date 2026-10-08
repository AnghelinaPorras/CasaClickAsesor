package com.casaclick.asesor.ui.components
            import androidx.compose.foundation.*
            import androidx.compose.foundation.layout.*
            import androidx.compose.foundation.lazy.LazyColumn
            import androidx.compose.foundation.lazy.items
            import androidx.compose.foundation.lazy.grid.*
            import androidx.compose.foundation.shape.RoundedCornerShape
            import androidx.compose.material.icons.Icons
            import androidx.compose.material.icons.filled.*
            import androidx.compose.material3.*
            import androidx.compose.runtime.*
            import androidx.compose.runtime.saveable.rememberSaveable
            import androidx.compose.ui.*
            import androidx.compose.ui.graphics.Color
            import androidx.compose.ui.text.font.FontWeight
            import androidx.compose.ui.text.input.*
            import androidx.compose.ui.unit.dp
            import androidx.compose.ui.layout.ContentScale
            import androidx.lifecycle.compose.collectAsStateWithLifecycle
            import com.casaclick.asesor.BuildConfig
            import com.casaclick.asesor.viewmodel.*
            import com.casaclick.asesor.model.*
            import com.casaclick.asesor.ui.components.*

        @Composable fun ConnectivityBanner(conectado: Boolean) {
            if(!conectado) Surface(color=MaterialTheme.colorScheme.secondaryContainer) {
                Text("Sin conexión · Tus cambios se guardan en este celular",Modifier.fillMaxWidth().padding(12.dp),style=MaterialTheme.typography.bodySmall)
            }
        }
