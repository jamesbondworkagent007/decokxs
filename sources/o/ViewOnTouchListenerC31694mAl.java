package o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;

/* JADX INFO: renamed from: o.mAl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewOnTouchListenerC31694mAl implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static int AEQbTJ = 200;
    public static float EZpvd = 1.75f;
    public static int KWHzl = 1;
    public static float OLrzqt = 1.0f;
    public static float copydefault = 3.0f;
    public android.widget.ImageView AkhnZx;
    public InterfaceC31690mAh AuCTelauCTel;
    public InterfaceC31693mAk AwvSrB;
    public Activity djBIcL;
    public InterfaceC31683mAa ejfBZ;
    public View.OnLongClickListener fIwbmz;
    public InterfaceC31692mAj getFieldNames;
    public View.OnClickListener getNewProxyInstance;
    public InterfaceC31688mAf hDKMBd;
    public android.view.GestureDetector isConnected;
    public InterfaceC31691mAi iwGUEr;
    public float valueOf;
    public InterfaceC31689mAg wlaJM;
    public C31685mAc zLjUOn;
    public android.view.animation.Interpolator values = new android.view.animation.AccelerateDecelerateInterpolator();
    public int AxsJAY = AEQbTJ;
    public float uzCIH = OLrzqt;
    public float fARcdN = EZpvd;
    public float AuCTel = copydefault;
    public boolean AYXKKw = true;
    public boolean gEmmrt = false;
    public final android.graphics.Matrix AhwBna = new android.graphics.Matrix();
    public final android.graphics.Matrix fetchVPNInfo = new android.graphics.Matrix();
    public final android.graphics.Matrix sSMYrx = new android.graphics.Matrix();
    public final RectF DbNXlk = new RectF();
    public final float[] fJNWhG = new float[9];
    public int zsXlph = 2;
    public boolean zuBGHE = true;
    public ImageView.ScaleType AubY = ImageView.ScaleType.FIT_CENTER;
    public InterfaceC31686mAd gHZMYf = new InterfaceC31686mAd() { // from class: o.mAl.3
        @Override // o.InterfaceC31686mAd
        public void copydefault(float f, float f2) {
            if (ViewOnTouchListenerC31694mAl.this.zLjUOn.copydefault()) {
                return;
            }
            if (ViewOnTouchListenerC31694mAl.this.hDKMBd != null) {
                ViewOnTouchListenerC31694mAl.this.hDKMBd.EZpvd(f, f2);
            }
            ViewOnTouchListenerC31694mAl.this.sSMYrx.postTranslate(f, f2);
            ViewOnTouchListenerC31694mAl.this.KWHzl();
            android.view.ViewParent parent = ViewOnTouchListenerC31694mAl.this.AkhnZx.getParent();
            if (!ViewOnTouchListenerC31694mAl.this.AYXKKw || ViewOnTouchListenerC31694mAl.this.zLjUOn.copydefault() || ViewOnTouchListenerC31694mAl.this.gEmmrt) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((ViewOnTouchListenerC31694mAl.this.zsXlph == 2 || ((ViewOnTouchListenerC31694mAl.this.zsXlph == 0 && f >= 1.0f) || (ViewOnTouchListenerC31694mAl.this.zsXlph == 1 && f <= -1.0f))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // o.InterfaceC31686mAd
        public void copydefault(float f, float f2, float f3, float f4) {
            ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl = ViewOnTouchListenerC31694mAl.this;
            viewOnTouchListenerC31694mAl.djBIcL = viewOnTouchListenerC31694mAl.new Activity(viewOnTouchListenerC31694mAl.AkhnZx.getContext());
            Activity activity = ViewOnTouchListenerC31694mAl.this.djBIcL;
            ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl2 = ViewOnTouchListenerC31694mAl.this;
            int iCopydefault = viewOnTouchListenerC31694mAl2.copydefault(viewOnTouchListenerC31694mAl2.AkhnZx);
            ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl3 = ViewOnTouchListenerC31694mAl.this;
            activity.OLrzqt(iCopydefault, viewOnTouchListenerC31694mAl3.AEQbTJ(viewOnTouchListenerC31694mAl3.AkhnZx), (int) f3, (int) f4);
            ViewOnTouchListenerC31694mAl.this.AkhnZx.post(ViewOnTouchListenerC31694mAl.this.djBIcL);
        }

        @Override // o.InterfaceC31686mAd
        public void copydefault(float f, float f2, float f3) {
            if (ViewOnTouchListenerC31694mAl.this.DbNXlk() < ViewOnTouchListenerC31694mAl.this.AuCTel || f < 1.0f) {
                if (ViewOnTouchListenerC31694mAl.this.DbNXlk() > ViewOnTouchListenerC31694mAl.this.uzCIH || f > 1.0f) {
                    if (ViewOnTouchListenerC31694mAl.this.AuCTelauCTel != null) {
                        ViewOnTouchListenerC31694mAl.this.AuCTelauCTel.AEQbTJ(f, f2, f3);
                    }
                    ViewOnTouchListenerC31694mAl.this.sSMYrx.postScale(f, f, f2, f3);
                    ViewOnTouchListenerC31694mAl.this.KWHzl();
                }
            }
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(InterfaceC31689mAg interfaceC31689mAg) {
        this.wlaJM = interfaceC31689mAg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(InterfaceC31691mAi interfaceC31691mAi) {
        this.iwGUEr = interfaceC31691mAi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(InterfaceC31693mAk interfaceC31693mAk) {
        this.AwvSrB = interfaceC31693mAk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(InterfaceC31690mAh interfaceC31690mAh) {
        this.AuCTelauCTel = interfaceC31690mAh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(InterfaceC31692mAj interfaceC31692mAj) {
        this.getFieldNames = interfaceC31692mAj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.AxsJAY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(View.OnClickListener onClickListener) {
        this.getNewProxyInstance = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(View.OnLongClickListener onLongClickListener) {
        this.fIwbmz = onLongClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC31683mAa interfaceC31683mAa) {
        this.ejfBZ = interfaceC31683mAa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC31688mAf interfaceC31688mAf) {
        this.hDKMBd = interfaceC31688mAf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float fetchVPNInfo() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.Matrix gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageView.ScaleType isConnected() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float valueOf() {
        return this.AuCTel;
    }

    public ViewOnTouchListenerC31694mAl(android.widget.ImageView imageView) {
        this.AkhnZx = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.valueOf = 0.0f;
        this.zLjUOn = new C31685mAc(imageView.getContext(), this.gHZMYf);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: o.mAl.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                if (ViewOnTouchListenerC31694mAl.this.fIwbmz != null) {
                    ViewOnTouchListenerC31694mAl.this.fIwbmz.onLongClick(ViewOnTouchListenerC31694mAl.this.AkhnZx);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                if (ViewOnTouchListenerC31694mAl.this.wlaJM == null || ViewOnTouchListenerC31694mAl.this.DbNXlk() > ViewOnTouchListenerC31694mAl.OLrzqt || MotionEventCompat.getPointerCount(motionEvent) > ViewOnTouchListenerC31694mAl.KWHzl || MotionEventCompat.getPointerCount(motionEvent2) > ViewOnTouchListenerC31694mAl.KWHzl) {
                    return false;
                }
                return ViewOnTouchListenerC31694mAl.this.wlaJM.AEQbTJ(motionEvent, motionEvent2, f, f2);
            }
        });
        this.isConnected = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: o.mAl.2
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                if (ViewOnTouchListenerC31694mAl.this.getNewProxyInstance != null) {
                    ViewOnTouchListenerC31694mAl.this.getNewProxyInstance.onClick(ViewOnTouchListenerC31694mAl.this.AkhnZx);
                }
                RectF rectFDjBIcL = ViewOnTouchListenerC31694mAl.this.djBIcL();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (ViewOnTouchListenerC31694mAl.this.AwvSrB != null) {
                    ViewOnTouchListenerC31694mAl.this.AwvSrB.KWHzl(ViewOnTouchListenerC31694mAl.this.AkhnZx, x, y);
                }
                if (rectFDjBIcL == null) {
                    return false;
                }
                if (rectFDjBIcL.contains(x, y)) {
                    float fWidth = (x - rectFDjBIcL.left) / rectFDjBIcL.width();
                    float fHeight = (y - rectFDjBIcL.top) / rectFDjBIcL.height();
                    if (ViewOnTouchListenerC31694mAl.this.iwGUEr == null) {
                        return true;
                    }
                    ViewOnTouchListenerC31694mAl.this.iwGUEr.copydefault(ViewOnTouchListenerC31694mAl.this.AkhnZx, fWidth, fHeight);
                    return true;
                }
                if (ViewOnTouchListenerC31694mAl.this.getFieldNames == null) {
                    return false;
                }
                ViewOnTouchListenerC31694mAl.this.getFieldNames.copydefault(ViewOnTouchListenerC31694mAl.this.AkhnZx);
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                try {
                    float fDbNXlk = ViewOnTouchListenerC31694mAl.this.DbNXlk();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (fDbNXlk < ViewOnTouchListenerC31694mAl.this.AhwBna()) {
                        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl = ViewOnTouchListenerC31694mAl.this;
                        viewOnTouchListenerC31694mAl.EZpvd(viewOnTouchListenerC31694mAl.AhwBna(), x, y, true);
                    } else if (fDbNXlk >= ViewOnTouchListenerC31694mAl.this.AhwBna() && fDbNXlk < ViewOnTouchListenerC31694mAl.this.valueOf()) {
                        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl2 = ViewOnTouchListenerC31694mAl.this;
                        viewOnTouchListenerC31694mAl2.EZpvd(viewOnTouchListenerC31694mAl2.valueOf(), x, y, true);
                    } else {
                        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl3 = ViewOnTouchListenerC31694mAl.this;
                        viewOnTouchListenerC31694mAl3.EZpvd(viewOnTouchListenerC31694mAl3.fetchVPNInfo(), x, y, true);
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }
        });
    }

    public void OLrzqt(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.isConnected.setOnDoubleTapListener(onDoubleTapListener);
    }

    public RectF djBIcL() {
        OLrzqt();
        return copydefault(AYXKKw());
    }

    public void OLrzqt(float f) {
        this.sSMYrx.setRotate(f % 360.0f);
        KWHzl();
    }

    public void KWHzl(float f) {
        this.sSMYrx.postRotate(f % 360.0f);
        KWHzl();
    }

    public float DbNXlk() {
        return (float) java.lang.Math.sqrt(((float) java.lang.Math.pow(KWHzl(this.sSMYrx, 0), 2.0d)) + ((float) java.lang.Math.pow(KWHzl(this.sSMYrx, 3), 2.0d)));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        OLrzqt(this.AkhnZx.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        C31685mAc c31685mAc;
        boolean z2;
        android.view.GestureDetector gestureDetector;
        RectF rectFDjBIcL;
        boolean z3 = false;
        if (!this.zuBGHE || !C31697mAo.copydefault((android.widget.ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            android.view.ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            AEQbTJ();
        } else {
            if (action == 1 || action == 3) {
                if (DbNXlk() < this.uzCIH) {
                    RectF rectFDjBIcL2 = djBIcL();
                    if (rectFDjBIcL2 != null) {
                        view.post(new StateListAnimator(DbNXlk(), this.uzCIH, rectFDjBIcL2.centerX(), rectFDjBIcL2.centerY()));
                        z = true;
                    }
                } else if (DbNXlk() > this.AuCTel && (rectFDjBIcL = djBIcL()) != null) {
                    view.post(new StateListAnimator(DbNXlk(), this.AuCTel, rectFDjBIcL.centerX(), rectFDjBIcL.centerY()));
                    z = true;
                }
            }
            c31685mAc = this.zLjUOn;
            if (c31685mAc == null) {
                boolean zCopydefault = c31685mAc.copydefault();
                boolean zEZpvd = this.zLjUOn.EZpvd();
                boolean zCopydefault2 = this.zLjUOn.copydefault(motionEvent);
                boolean z4 = (zCopydefault || this.zLjUOn.copydefault()) ? false : true;
                boolean z5 = (zEZpvd || this.zLjUOn.EZpvd()) ? false : true;
                if (z4 && z5) {
                    z3 = true;
                }
                this.gEmmrt = z3;
                z2 = zCopydefault2;
            } else {
                z2 = z;
            }
            gestureDetector = this.isConnected;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        z = false;
        c31685mAc = this.zLjUOn;
        if (c31685mAc == null) {
        }
        gestureDetector = this.isConnected;
        return gestureDetector == null ? z2 : z2;
    }

    public void AEQbTJ(float f) {
        C31697mAo.OLrzqt(f, this.fARcdN, this.AuCTel);
        this.uzCIH = f;
    }

    public void copydefault(float f) {
        C31697mAo.OLrzqt(this.uzCIH, f, this.AuCTel);
        this.fARcdN = f;
    }

    public void EZpvd(float f) {
        C31697mAo.OLrzqt(this.uzCIH, this.fARcdN, f);
        this.AuCTel = f;
    }

    public void KWHzl(float f, float f2, float f3) {
        C31697mAo.OLrzqt(f, f2, f3);
        this.uzCIH = f;
        this.fARcdN = f2;
        this.AuCTel = f3;
    }

    public void valueOf(float f) {
        copydefault(f, false);
    }

    public void copydefault(float f, boolean z) {
        EZpvd(f, this.AkhnZx.getRight() / 2, this.AkhnZx.getBottom() / 2, z);
    }

    public void EZpvd(float f, float f2, float f3, boolean z) {
        if (f < this.uzCIH || f > this.AuCTel) {
            throw new java.lang.IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.AkhnZx.post(new StateListAnimator(DbNXlk(), f, f2, f3));
        } else {
            this.sSMYrx.setScale(f, f, f2, f3);
            KWHzl();
        }
    }

    public void OLrzqt(ImageView.ScaleType scaleType) {
        if (!C31697mAo.KWHzl(scaleType) || scaleType == this.AubY) {
            return;
        }
        this.AubY = scaleType;
        AkhnZx();
    }

    public void OLrzqt(boolean z) {
        this.zuBGHE = z;
        AkhnZx();
    }

    public void AkhnZx() {
        if (this.zuBGHE) {
            OLrzqt(this.AkhnZx.getDrawable());
        } else {
            values();
        }
    }

    public final android.graphics.Matrix AYXKKw() {
        this.fetchVPNInfo.set(this.AhwBna);
        this.fetchVPNInfo.postConcat(this.sSMYrx);
        return this.fetchVPNInfo;
    }

    public final float KWHzl(android.graphics.Matrix matrix, int i) {
        matrix.getValues(this.fJNWhG);
        return this.fJNWhG[i];
    }

    public final void values() {
        this.sSMYrx.reset();
        KWHzl(this.valueOf);
        AEQbTJ(AYXKKw());
        OLrzqt();
    }

    public final void AEQbTJ(android.graphics.Matrix matrix) {
        RectF rectFCopydefault;
        this.AkhnZx.setImageMatrix(matrix);
        if (this.ejfBZ == null || (rectFCopydefault = copydefault(matrix)) == null) {
            return;
        }
        this.ejfBZ.AEQbTJ(rectFCopydefault);
    }

    public final void KWHzl() {
        if (OLrzqt()) {
            AEQbTJ(AYXKKw());
        }
    }

    public final RectF copydefault(android.graphics.Matrix matrix) {
        if (this.AkhnZx.getDrawable() == null) {
            return null;
        }
        this.DbNXlk.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.DbNXlk);
        return this.DbNXlk;
    }

    public final void OLrzqt(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fCopydefault = copydefault(this.AkhnZx);
        float fAEQbTJ = AEQbTJ(this.AkhnZx);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.AhwBna.reset();
        float f = intrinsicWidth;
        float f2 = fCopydefault / f;
        float f3 = intrinsicHeight;
        float f4 = fAEQbTJ / f3;
        ImageView.ScaleType scaleType = this.AubY;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.AhwBna.postTranslate((fCopydefault - f) / 2.0f, (fAEQbTJ - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = java.lang.Math.max(f2, f4);
            this.AhwBna.postScale(fMax, fMax);
            this.AhwBna.postTranslate((fCopydefault - (f * fMax)) / 2.0f, (fAEQbTJ - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = java.lang.Math.min(1.0f, java.lang.Math.min(f2, f4));
            this.AhwBna.postScale(fMin, fMin);
            this.AhwBna.postTranslate((fCopydefault - (f * fMin)) / 2.0f, (fAEQbTJ - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, fCopydefault, fAEQbTJ);
            if (((int) this.valueOf) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = AnonymousClass1.KWHzl[this.AubY.ordinal()];
            if (i == 1) {
                this.AhwBna.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.AhwBna.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.AhwBna.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.AhwBna.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        values();
    }

    /* JADX INFO: renamed from: o.mAl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            KWHzl = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public final boolean OLrzqt() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF rectFCopydefault = copydefault(AYXKKw());
        if (rectFCopydefault == null) {
            return false;
        }
        float fHeight = rectFCopydefault.height();
        float fWidth = rectFCopydefault.width();
        float fAEQbTJ = AEQbTJ(this.AkhnZx);
        float f6 = 0.0f;
        if (fHeight <= fAEQbTJ) {
            int i = AnonymousClass1.KWHzl[this.AubY.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    fAEQbTJ -= fHeight;
                    f2 = rectFCopydefault.top;
                } else {
                    fAEQbTJ = (fAEQbTJ - fHeight) / 2.0f;
                    f2 = rectFCopydefault.top;
                }
            } else {
                f = rectFCopydefault.top;
                f3 = -f;
            }
        } else {
            f = rectFCopydefault.top;
            if (f > 0.0f) {
                f3 = -f;
            } else {
                f2 = rectFCopydefault.bottom;
                f3 = f2 < fAEQbTJ ? fAEQbTJ - f2 : 0.0f;
            }
        }
        float fCopydefault = copydefault(this.AkhnZx);
        if (fWidth <= fCopydefault) {
            int i2 = AnonymousClass1.KWHzl[this.AubY.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f4 = fCopydefault - fWidth;
                    f5 = rectFCopydefault.left;
                } else {
                    f4 = (fCopydefault - fWidth) / 2.0f;
                    f5 = rectFCopydefault.left;
                }
                f6 = f4 - f5;
            } else {
                f6 = -rectFCopydefault.left;
            }
            this.zsXlph = 2;
        } else {
            float f7 = rectFCopydefault.left;
            if (f7 > 0.0f) {
                this.zsXlph = 0;
                f6 = -f7;
            } else {
                float f8 = rectFCopydefault.right;
                if (f8 < fCopydefault) {
                    f6 = fCopydefault - f8;
                    this.zsXlph = 1;
                } else {
                    this.zsXlph = -1;
                }
            }
        }
        this.sSMYrx.postTranslate(f6, f3);
        return true;
    }

    public final int copydefault(android.widget.ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public final int AEQbTJ(android.widget.ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final void AEQbTJ() {
        Activity activity = this.djBIcL;
        if (activity != null) {
            activity.EZpvd();
            this.djBIcL = null;
        }
    }

    /* JADX INFO: renamed from: o.mAl$StateListAnimator */
    public class StateListAnimator implements java.lang.Runnable {
        public final float AEQbTJ;
        public final float EZpvd;
        public final float KWHzl;
        public final float OLrzqt;
        public final long copydefault = java.lang.System.currentTimeMillis();

        public StateListAnimator(float f, float f2, float f3, float f4) {
            this.AEQbTJ = f3;
            this.EZpvd = f4;
            this.KWHzl = f;
            this.OLrzqt = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            float fOLrzqt = OLrzqt();
            float f = this.KWHzl;
            ViewOnTouchListenerC31694mAl.this.gHZMYf.copydefault((f + ((this.OLrzqt - f) * fOLrzqt)) / ViewOnTouchListenerC31694mAl.this.DbNXlk(), this.AEQbTJ, this.EZpvd);
            if (fOLrzqt < 1.0f) {
                C31687mAe.copydefault(ViewOnTouchListenerC31694mAl.this.AkhnZx, this);
            }
        }

        public final float OLrzqt() {
            return ViewOnTouchListenerC31694mAl.this.values.getInterpolation(java.lang.Math.min(1.0f, ((java.lang.System.currentTimeMillis() - this.copydefault) * 1.0f) / ViewOnTouchListenerC31694mAl.this.AxsJAY));
        }
    }

    /* JADX INFO: renamed from: o.mAl$Activity */
    public class Activity implements java.lang.Runnable {
        public int AEQbTJ;
        public final android.widget.OverScroller KWHzl;
        public int OLrzqt;

        public Activity(android.content.Context context) {
            this.KWHzl = new android.widget.OverScroller(context);
        }

        public void EZpvd() {
            this.KWHzl.forceFinished(true);
        }

        public void OLrzqt(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFDjBIcL = ViewOnTouchListenerC31694mAl.this.djBIcL();
            if (rectFDjBIcL == null) {
                return;
            }
            int iRound3 = java.lang.Math.round(-rectFDjBIcL.left);
            float f = i;
            if (f < rectFDjBIcL.width()) {
                iRound = java.lang.Math.round(rectFDjBIcL.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = java.lang.Math.round(-rectFDjBIcL.top);
            float f2 = i2;
            if (f2 < rectFDjBIcL.height()) {
                iRound2 = java.lang.Math.round(rectFDjBIcL.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.AEQbTJ = iRound3;
            this.OLrzqt = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.KWHzl.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.KWHzl.isFinished() && this.KWHzl.computeScrollOffset()) {
                int currX = this.KWHzl.getCurrX();
                int currY = this.KWHzl.getCurrY();
                ViewOnTouchListenerC31694mAl.this.sSMYrx.postTranslate(this.AEQbTJ - currX, this.OLrzqt - currY);
                ViewOnTouchListenerC31694mAl.this.KWHzl();
                this.AEQbTJ = currX;
                this.OLrzqt = currY;
                C31687mAe.copydefault(ViewOnTouchListenerC31694mAl.this.AkhnZx, this);
            }
        }
    }
}
