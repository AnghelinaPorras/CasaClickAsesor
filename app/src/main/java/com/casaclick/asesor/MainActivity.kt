package com.casaclick.asesor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.casaclick.asesor.ui.theme.CasaClickTheme
import com.casaclick.asesor.ui.navigation.AppNavigation
import com.casaclick.asesor.viewmodel.CasaClickFactory
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);enableEdgeToEdge()
        val factory=CasaClickFactory((application as CasaClickApplication).container)
        setContent { CasaClickTheme { AppNavigation(factory) } }
    }
}
