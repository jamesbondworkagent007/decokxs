package o;

import android.view.View;

/* JADX INFO: renamed from: o.arZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC7847arZ implements View.OnTouchListener {
    public float AEQbTJ;
    public boolean AYXKKw;
    public long EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float copydefault;
    public android.view.View gEmmrt;

    public ViewOnTouchListenerC7847arZ() {
    }

    public ViewOnTouchListenerC7847arZ(android.view.View view, boolean z) {
        this.gEmmrt = view;
        this.AYXKKw = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    android.view.View view2 = this.gEmmrt;
                    if (view2 != null) {
                        view = view2;
                    }
                    float rawX = motionEvent.getRawX();
                    float f = this.OLrzqt;
                    float rawY = motionEvent.getRawY();
                    float f2 = this.AEQbTJ;
                    view.setTranslationX((rawX - f) + this.KWHzl);
                    view.setTranslationY((rawY - f2) + this.copydefault);
                }
            }
            if (!this.AYXKKw || AEQbTJ() - this.EZpvd > 150) {
                return false;
            }
            view.performClick();
            return false;
        }
        android.view.View view3 = this.gEmmrt;
        if (view3 != null) {
            view = view3;
        }
        this.KWHzl = view.getTranslationX();
        this.copydefault = view.getTranslationY();
        this.OLrzqt = motionEvent.getRawX();
        this.AEQbTJ = motionEvent.getRawY();
        this.EZpvd = AEQbTJ();
        return true;
    }

    public final long AEQbTJ() {
        return android.os.SystemClock.uptimeMillis();
    }
}
