package dev.heryordejy.wedar.ui.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomTabItemsEnum {
  HOME {
    override fun title(): String {
      return "Home"
    }

    override fun icon(): ImageVector {
      return Icons.Default.Home
    }
  },

  DAILY {
    override fun title(): String {
      return "Daily"
    }

    override fun icon(): ImageVector {
      return Icons.Default.DateRange
    }
  };


  abstract fun title(): String
  abstract fun icon(): ImageVector
}

