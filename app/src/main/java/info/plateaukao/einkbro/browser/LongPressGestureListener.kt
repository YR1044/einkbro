package info.plateaukao.einkbro.browser

import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent
import info.plateaukao.einkbro.view.NinjaWebView

class LongPressGestureListener(private var webView: NinjaWebView) : SimpleOnGestureListener() {
    private var longPress = true

    override fun onLongPress(e: MotionEvent) {
        if (longPress) {
            webView.onLongPress(e)
        }
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        longPress = false
        return false
    }

    override fun onShowPress(e: MotionEvent) {
        longPress = true
    }
}