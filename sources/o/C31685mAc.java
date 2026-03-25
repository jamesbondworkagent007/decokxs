package o;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: o.mAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31685mAc {
    public final android.view.ScaleGestureDetector AEQbTJ;
    public final float AYXKKw;
    public float AhwBna;
    public boolean EZpvd;
    public float OLrzqt;
    public android.view.VelocityTracker djBIcL;
    public InterfaceC31686mAd gEmmrt;
    public final float valueOf;
    public int KWHzl = -1;
    public int copydefault = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.EZpvd;
    }

    public C31685mAc(android.content.Context context, InterfaceC31686mAd interfaceC31686mAd) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.AYXKKw = viewConfiguration.getScaledMinimumFlingVelocity();
        this.valueOf = viewConfiguration.getScaledTouchSlop();
        this.gEmmrt = interfaceC31686mAd;
        this.AEQbTJ = new android.view.ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: o.mAc.4
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (java.lang.Float.isNaN(scaleFactor) || java.lang.Float.isInfinite(scaleFactor)) {
                    return false;
                }
                C31685mAc.this.gEmmrt.copydefault(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    public final float EZpvd(android.view.MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.copydefault);
        } catch (java.lang.Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float OLrzqt(android.view.MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.copydefault);
        } catch (java.lang.Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean copydefault() {
        return this.AEQbTJ.isInProgress();
    }

    public boolean copydefault(android.view.MotionEvent motionEvent) {
        try {
            this.AEQbTJ.onTouchEvent(motionEvent);
            return KWHzl(motionEvent);
        } catch (java.lang.IllegalArgumentException unused) {
            return true;
        }
    }

    public final boolean KWHzl(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.KWHzl = motionEvent.getPointerId(0);
            android.view.VelocityTracker velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.djBIcL = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.OLrzqt = EZpvd(motionEvent);
            this.AhwBna = OLrzqt(motionEvent);
            this.EZpvd = false;
        } else if (action == 1) {
            this.KWHzl = -1;
            if (this.EZpvd && this.djBIcL != null) {
                this.OLrzqt = EZpvd(motionEvent);
                this.AhwBna = OLrzqt(motionEvent);
                this.djBIcL.addMovement(motionEvent);
                this.djBIcL.computeCurrentVelocity(1000);
                float xVelocity = this.djBIcL.getXVelocity();
                float yVelocity = this.djBIcL.getYVelocity();
                if (java.lang.Math.max(java.lang.Math.abs(xVelocity), java.lang.Math.abs(yVelocity)) >= this.AYXKKw) {
                    this.gEmmrt.copydefault(this.OLrzqt, this.AhwBna, -xVelocity, -yVelocity);
                }
            }
            android.view.VelocityTracker velocityTracker = this.djBIcL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.djBIcL = null;
            }
        } else if (action == 2) {
            float fEZpvd = EZpvd(motionEvent);
            float fOLrzqt = OLrzqt(motionEvent);
            float f = fEZpvd - this.OLrzqt;
            float f2 = fOLrzqt - this.AhwBna;
            if (!this.EZpvd) {
                this.EZpvd = java.lang.Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.valueOf);
            }
            if (this.EZpvd) {
                this.gEmmrt.copydefault(f, f2);
                this.OLrzqt = fEZpvd;
                this.AhwBna = fOLrzqt;
                android.view.VelocityTracker velocityTracker2 = this.djBIcL;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.KWHzl = -1;
            android.view.VelocityTracker velocityTracker3 = this.djBIcL;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.djBIcL = null;
            }
        } else if (action == 6) {
            int iOLrzqt = C31697mAo.OLrzqt(motionEvent.getAction());
            if (motionEvent.getPointerId(iOLrzqt) == this.KWHzl) {
                int i = iOLrzqt == 0 ? 1 : 0;
                this.KWHzl = motionEvent.getPointerId(i);
                this.OLrzqt = motionEvent.getX(i);
                this.AhwBna = motionEvent.getY(i);
            }
        }
        int i2 = this.KWHzl;
        this.copydefault = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        return true;
    }
}
