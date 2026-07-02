package moe.fuqiuluo.mamu.utils

import moe.fuqiuluo.mamu.MamuApplication
import android.util.Log

object AssetHelper {
    private const val TAG = "AssetHelper"

    @JvmStatic
    fun readAsset(name: String): ByteArray? {
        return try {
            val am = MamuApplication.instance.assets
            am.open(name).use { it.readBytes() }
        } catch (e: Exception) {
            Log.e(TAG, "readAsset failed: $name", e)
            null
        }
    }
}
