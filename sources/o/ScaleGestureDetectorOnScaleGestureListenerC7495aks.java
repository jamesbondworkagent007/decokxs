package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ScaleGestureDetectorCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC7495aks extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public final PointF AkhnZx;
    public final float[] AuCTel;
    public float AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public final GestureDetector.OnGestureListener DbNXlk;
    public boolean EZpvd;
    public final RectF OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public float ejfBZ;
    public float fARcdN;
    public Function0<Unit> fIwbmz;
    public Function0<Unit> fJNWhG;
    public boolean fetchVPNInfo;
    public int gEmmrt;
    public android.view.ScaleGestureDetector getFieldNames;
    public int getNewProxyInstance;
    public android.animation.ValueAnimator hDKMBd;
    public float isConnected;
    public float iwGUEr;
    public final android.graphics.Matrix sSMYrx;
    public boolean uzCIH;
    public float valueOf;
    public android.view.GestureDetector values;
    public float[] wlaJM;
    public ImageView.ScaleType zLjUOn;
    public android.graphics.Matrix zsXlph;

    /* JADX INFO: renamed from: o.aks$ActionBar */
    public static class ActionBar implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScaleGestureDetectorOnScaleGestureListenerC7495aks(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScaleGestureDetectorOnScaleGestureListenerC7495aks(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AwvSrB && this.AhwBna > 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull android.view.ScaleGestureDetector scaleGestureDetector) {
        Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
        this.iwGUEr = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLongPressListener(Function0<Unit> function0) {
        this.fIwbmz = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSingleTapListener(Function0<Unit> function0) {
        this.fJNWhG = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.aks.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ScaleGestureDetectorOnScaleGestureListenerC7495aks(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: o.aks$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aks.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleGestureDetectorOnScaleGestureListenerC7495aks(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.sSMYrx = new android.graphics.Matrix();
        this.zsXlph = new android.graphics.Matrix();
        this.AuCTel = new float[9];
        this.fARcdN = 0.6f;
        this.ejfBZ = 8.0f;
        this.AYXKKw = 0.6f;
        this.valueOf = 8.0f;
        this.OLrzqt = new RectF();
        this.AwvSrB = true;
        this.AxsJAY = true;
        this.fetchVPNInfo = true;
        this.EZpvd = true;
        this.isConnected = 3.0f;
        this.AkhnZx = new PointF(0.0f, 0.0f);
        this.AuCTelauCTel = 1.0f;
        this.iwGUEr = 1.0f;
        this.AhwBna = 1.0f;
        this.getNewProxyInstance = 1;
        PendingIntent pendingIntent = new PendingIntent();
        this.DbNXlk = pendingIntent;
        this.getFieldNames = new android.view.ScaleGestureDetector(context, this);
        this.values = new android.view.GestureDetector(context, pendingIntent);
        ScaleGestureDetectorCompat.setQuickScaleEnabled((java.lang.Object) this.getFieldNames, false);
        this.zLjUOn = getScaleType();
        values();
    }

    /* JADX INFO: renamed from: o.aks$PendingIntent */
    public static final class PendingIntent extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }

        public PendingIntent() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.djBIcL = true;
            }
            ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.AubY = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.AubY = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.AubY = false;
            Function0<Unit> function0GEmmrt = ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.gEmmrt();
            if (function0GEmmrt != null) {
                function0GEmmrt.invoke();
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            super.onLongPress(motionEvent);
            Function0<Unit> function0AYXKKw = ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.AYXKKw();
            if (function0AYXKKw != null) {
                function0AYXKKw.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001b A[PHI: r5
  0x001b: PHI (r5v4 float) = (r5v2 float), (r5v3 float) binds: [B:3:0x0019, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onScale(@NotNull android.view.ScaleGestureDetector scaleGestureDetector) {
        Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
        float f = this.AuCTelauCTel;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f2 = this.AuCTel[0];
        float f3 = (f * scaleFactor) / f2;
        this.iwGUEr = f3;
        float f4 = f3 * f2;
        float f5 = this.AYXKKw;
        if (f4 < f5) {
            this.iwGUEr = f5 / f2;
        } else {
            f5 = this.valueOf;
            if (f4 > f5) {
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull android.view.ScaleGestureDetector scaleGestureDetector) {
        Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
        this.AuCTelauCTel = this.AuCTel[0];
        return true;
    }

    public final void values() {
        float f = this.fARcdN;
        float f2 = this.ejfBZ;
        if (f >= f2) {
            throw new java.lang.IllegalStateException("minScale must be < maxScale".toString());
        }
        if (f < 0.0f) {
            throw new java.lang.IllegalStateException("minScale must be > 0".toString());
        }
        if (f2 < 0.0f) {
            throw new java.lang.IllegalStateException("maxScale must be > 0".toString());
        }
        if (this.isConnected > f2) {
            this.isConnected = f2;
        }
        if (this.isConnected < f) {
            this.isConnected = f;
        }
    }

    public final void setScaleRange(float f, float f2) {
        this.fARcdN = f;
        this.ejfBZ = f2;
        this.wlaJM = null;
        values();
    }

    public final void setDoubleTapToZoomScaleFactor(float f) {
        this.isConnected = f;
        values();
    }

    @Override // android.widget.ImageView
    public void setScaleType(@androidx.annotation.Nullable ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.zLjUOn = scaleType;
            this.wlaJM = null;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        setScaleType(this.zLjUOn);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        setScaleType(this.zLjUOn);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.zLjUOn);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.zLjUOn);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(@androidx.annotation.Nullable android.net.Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.zLjUOn);
    }

    public final void KWHzl(float[] fArr) {
        if (getDrawable() != null) {
            this.OLrzqt.set(fArr[2], fArr[5], (getDrawable().getIntrinsicWidth() * fArr[0]) + fArr[2], (getDrawable().getIntrinsicHeight() * fArr[4]) + fArr[5]);
        }
    }

    private final float isConnected() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicWidth() * this.AuCTel[0];
        }
        return 0.0f;
    }

    private final float DbNXlk() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicHeight() * this.AuCTel[4];
        }
        return 0.0f;
    }

    public final void setStartValues() {
        this.wlaJM = new float[9];
        android.graphics.Matrix matrix = new android.graphics.Matrix(getImageMatrix());
        this.zsXlph = matrix;
        matrix.getValues(this.wlaJM);
        float f = this.fARcdN;
        float[] fArr = this.wlaJM;
        Intrinsics.copydefault(fArr);
        this.AYXKKw = f * fArr[0];
        float f2 = this.ejfBZ;
        float[] fArr2 = this.wlaJM;
        Intrinsics.copydefault(fArr2);
        this.valueOf = f2 * fArr2[0];
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!isClickable() && isEnabled() && (this.AxsJAY || this.AwvSrB)) {
            ImageView.ScaleType scaleType = getScaleType();
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
            if (scaleType != scaleType2) {
                super.setScaleType(scaleType2);
            }
            if (this.wlaJM == null) {
                setStartValues();
            }
            this.gEmmrt = motionEvent.getPointerCount();
            this.sSMYrx.set(getImageMatrix());
            this.sSMYrx.getValues(this.AuCTel);
            KWHzl(this.AuCTel);
            android.view.ScaleGestureDetector scaleGestureDetector = this.getFieldNames;
            Intrinsics.copydefault(scaleGestureDetector);
            scaleGestureDetector.onTouchEvent(motionEvent);
            android.view.GestureDetector gestureDetector = this.values;
            Intrinsics.copydefault(gestureDetector);
            gestureDetector.onTouchEvent(motionEvent);
            if (this.fetchVPNInfo && this.djBIcL) {
                this.djBIcL = false;
                this.AubY = false;
                float f = this.AuCTel[0];
                float[] fArr = this.wlaJM;
                Intrinsics.copydefault(fArr);
                if (f != fArr[0]) {
                    valueOf();
                } else {
                    android.graphics.Matrix matrix = new android.graphics.Matrix(this.sSMYrx);
                    float f2 = this.isConnected;
                    android.view.ScaleGestureDetector scaleGestureDetector2 = this.getFieldNames;
                    Intrinsics.copydefault(scaleGestureDetector2);
                    float focusX = scaleGestureDetector2.getFocusX();
                    android.view.ScaleGestureDetector scaleGestureDetector3 = this.getFieldNames;
                    Intrinsics.copydefault(scaleGestureDetector3);
                    matrix.postScale(f2, f2, focusX, scaleGestureDetector3.getFocusY());
                    OLrzqt(matrix, 200);
                }
                return true;
            }
            if (!this.AubY) {
                if (motionEvent.getActionMasked() == 0 || this.gEmmrt != this.getNewProxyInstance) {
                    PointF pointF = this.AkhnZx;
                    android.view.ScaleGestureDetector scaleGestureDetector4 = this.getFieldNames;
                    Intrinsics.copydefault(scaleGestureDetector4);
                    float focusX2 = scaleGestureDetector4.getFocusX();
                    android.view.ScaleGestureDetector scaleGestureDetector5 = this.getFieldNames;
                    Intrinsics.copydefault(scaleGestureDetector5);
                    pointF.set(focusX2, scaleGestureDetector5.getFocusY());
                } else if (motionEvent.getActionMasked() == 2) {
                    android.view.ScaleGestureDetector scaleGestureDetector6 = this.getFieldNames;
                    Intrinsics.copydefault(scaleGestureDetector6);
                    float focusX3 = scaleGestureDetector6.getFocusX();
                    android.view.ScaleGestureDetector scaleGestureDetector7 = this.getFieldNames;
                    Intrinsics.copydefault(scaleGestureDetector7);
                    float focusY = scaleGestureDetector7.getFocusY();
                    if (OLrzqt()) {
                        this.sSMYrx.postTranslate(AEQbTJ(focusX3, this.AkhnZx.x), copydefault(focusY, this.AkhnZx.y));
                    }
                    if (EZpvd()) {
                        android.graphics.Matrix matrix2 = this.sSMYrx;
                        float f3 = this.iwGUEr;
                        matrix2.postScale(f3, f3, focusX3, focusY);
                        float f4 = this.AuCTel[0];
                        float[] fArr2 = this.wlaJM;
                        Intrinsics.copydefault(fArr2);
                        this.AhwBna = f4 / fArr2[0];
                    }
                    setImageMatrix(this.sSMYrx);
                    this.AkhnZx.set(focusX3, focusY);
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    this.iwGUEr = 1.0f;
                    AkhnZx();
                }
            }
            getParent().requestDisallowInterceptTouchEvent(AhwBna());
            this.getNewProxyInstance = this.gEmmrt;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean AhwBna() {
        return this.gEmmrt > 1 || this.AhwBna > 1.0f || fetchVPNInfo();
    }

    private final boolean fetchVPNInfo() {
        android.animation.ValueAnimator valueAnimator = this.hDKMBd;
        if (valueAnimator != null) {
            Intrinsics.copydefault(valueAnimator);
            if (valueAnimator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final void AkhnZx() {
        int i = this.AEQbTJ;
        if (i == 0) {
            float f = this.AuCTel[0];
            float[] fArr = this.wlaJM;
            Intrinsics.copydefault(fArr);
            if (f <= fArr[0]) {
                valueOf();
                return;
            } else {
                djBIcL();
                return;
            }
        }
        if (i != 1) {
            if (i == 2) {
                valueOf();
                return;
            } else {
                if (i != 3) {
                    return;
                }
                djBIcL();
                return;
            }
        }
        float f2 = this.AuCTel[0];
        float[] fArr2 = this.wlaJM;
        Intrinsics.copydefault(fArr2);
        if (f2 >= fArr2[0]) {
            valueOf();
        } else {
            djBIcL();
        }
    }

    public final void djBIcL() {
        if (this.EZpvd) {
            KWHzl();
            AEQbTJ();
        }
    }

    public final void valueOf() {
        KWHzl(this.copydefault);
    }

    public final void KWHzl(boolean z) {
        if (z) {
            copydefault();
        } else {
            setImageMatrix(this.zsXlph);
        }
    }

    public final void copydefault() {
        OLrzqt(this.zsXlph, 200);
    }

    public final void OLrzqt(android.graphics.Matrix matrix, int i) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(getImageMatrix());
        matrix2.getValues(this.AuCTel);
        float f = fArr[0];
        float[] fArr2 = this.AuCTel;
        float f2 = fArr2[0];
        float f3 = fArr[4];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[2];
        float f7 = fArr[5];
        float f8 = fArr2[5];
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.hDKMBd = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new TaskDescription(matrix2, f5 - f6, f7 - f8, f - f2, f3 - f4));
        }
        android.animation.ValueAnimator valueAnimator = this.hDKMBd;
        if (valueAnimator != null) {
            valueAnimator.addListener(new StateListAnimator(matrix));
        }
        android.animation.ValueAnimator valueAnimator2 = this.hDKMBd;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(i);
        }
        android.animation.ValueAnimator valueAnimator3 = this.hDKMBd;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: renamed from: o.aks$TaskDescription */
    public static final class TaskDescription implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float AEQbTJ;
        public final float[] AYXKKw = new float[9];
        public final /* synthetic */ float EZpvd;
        public final /* synthetic */ android.graphics.Matrix KWHzl;
        public final /* synthetic */ float OLrzqt;
        public final /* synthetic */ float copydefault;
        public final android.graphics.Matrix valueOf;

        public TaskDescription(android.graphics.Matrix matrix, float f, float f2, float f3, float f4) {
            this.KWHzl = matrix;
            this.OLrzqt = f;
            this.copydefault = f2;
            this.EZpvd = f3;
            this.AEQbTJ = f4;
            this.valueOf = new android.graphics.Matrix(ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.getImageMatrix());
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            float fFloatValue = ((java.lang.Float) animatedValue).floatValue();
            this.valueOf.set(this.KWHzl);
            this.valueOf.getValues(this.AYXKKw);
            float[] fArr = this.AYXKKw;
            fArr[2] = fArr[2] + (this.OLrzqt * fFloatValue);
            fArr[5] = fArr[5] + (this.copydefault * fFloatValue);
            fArr[0] = fArr[0] + (this.EZpvd * fFloatValue);
            fArr[4] = fArr[4] + (this.AEQbTJ * fFloatValue);
            this.valueOf.setValues(fArr);
            ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.setImageMatrix(this.valueOf);
        }
    }

    /* JADX INFO: renamed from: o.aks$StateListAnimator */
    public static final class StateListAnimator extends ActionBar {
        public final /* synthetic */ android.graphics.Matrix copydefault;

        public StateListAnimator(android.graphics.Matrix matrix) {
            this.copydefault = matrix;
        }

        @Override // o.ScaleGestureDetectorOnScaleGestureListenerC7495aks.ActionBar, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.setImageMatrix(this.copydefault);
        }
    }

    public final void KWHzl() {
        if (isConnected() > getWidth()) {
            RectF rectF = this.OLrzqt;
            if (rectF.left > 0.0f) {
                copydefault(2, 0.0f);
                return;
            } else {
                if (rectF.right < getWidth()) {
                    copydefault(2, (this.OLrzqt.left + getWidth()) - this.OLrzqt.right);
                    return;
                }
                return;
            }
        }
        RectF rectF2 = this.OLrzqt;
        if (rectF2.left < 0.0f) {
            copydefault(2, 0.0f);
        } else if (rectF2.right > getWidth()) {
            copydefault(2, (this.OLrzqt.left + getWidth()) - this.OLrzqt.right);
        }
    }

    public final void AEQbTJ() {
        if (DbNXlk() > getHeight()) {
            RectF rectF = this.OLrzqt;
            if (rectF.top > 0.0f) {
                copydefault(5, 0.0f);
                return;
            } else {
                if (rectF.bottom < getHeight()) {
                    copydefault(5, (this.OLrzqt.top + getHeight()) - this.OLrzqt.bottom);
                    return;
                }
                return;
            }
        }
        RectF rectF2 = this.OLrzqt;
        if (rectF2.top < 0.0f) {
            copydefault(5, 0.0f);
        } else if (rectF2.bottom > getHeight()) {
            copydefault(5, (this.OLrzqt.top + getHeight()) - this.OLrzqt.bottom);
        }
    }

    /* JADX INFO: renamed from: o.aks$Activity */
    public static final class Activity implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int AEQbTJ;
        public final float[] OLrzqt = new float[9];
        public android.graphics.Matrix copydefault = new android.graphics.Matrix();

        public Activity(int i) {
            this.AEQbTJ = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            this.copydefault.set(ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.getImageMatrix());
            this.copydefault.getValues(this.OLrzqt);
            float[] fArr = this.OLrzqt;
            int i = this.AEQbTJ;
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            fArr[i] = ((java.lang.Float) animatedValue).floatValue();
            this.copydefault.setValues(this.OLrzqt);
            ScaleGestureDetectorOnScaleGestureListenerC7495aks.this.setImageMatrix(this.copydefault);
        }
    }

    public final void copydefault(int i, float f) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.AuCTel[i], f);
        valueAnimatorOfFloat.addUpdateListener(new Activity(i));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
    }

    public final float AEQbTJ(float f, float f2) {
        float fEZpvd = f - f2;
        if (this.uzCIH) {
            fEZpvd = EZpvd(fEZpvd);
        }
        RectF rectF = this.OLrzqt;
        float f3 = rectF.right;
        return f3 + fEZpvd < 0.0f ? -f3 : rectF.left + fEZpvd > ((float) getWidth()) ? getWidth() - this.OLrzqt.left : fEZpvd;
    }

    public final float EZpvd(float f) {
        float width;
        float f2;
        if (isConnected() >= getWidth()) {
            float f3 = this.OLrzqt.left;
            if (f3 <= 0.0f && f3 + f > 0.0f) {
                android.view.ScaleGestureDetector scaleGestureDetector = this.getFieldNames;
                Intrinsics.copydefault(scaleGestureDetector);
                if (!scaleGestureDetector.isInProgress()) {
                    return -this.OLrzqt.left;
                }
            }
            if (this.OLrzqt.right < getWidth() || this.OLrzqt.right + f >= getWidth()) {
                return f;
            }
            android.view.ScaleGestureDetector scaleGestureDetector2 = this.getFieldNames;
            Intrinsics.copydefault(scaleGestureDetector2);
            if (scaleGestureDetector2.isInProgress()) {
                return f;
            }
            width = getWidth();
            f2 = this.OLrzqt.right;
        } else {
            android.view.ScaleGestureDetector scaleGestureDetector3 = this.getFieldNames;
            Intrinsics.copydefault(scaleGestureDetector3);
            if (scaleGestureDetector3.isInProgress()) {
                return f;
            }
            RectF rectF = this.OLrzqt;
            float f4 = rectF.left;
            if (f4 >= 0.0f && f4 + f < 0.0f) {
                return -f4;
            }
            if (rectF.right > getWidth() || this.OLrzqt.right + f <= getWidth()) {
                return f;
            }
            width = getWidth();
            f2 = this.OLrzqt.right;
        }
        return width - f2;
    }

    public final float copydefault(float f, float f2) {
        float fAEQbTJ = f - f2;
        if (this.uzCIH) {
            fAEQbTJ = AEQbTJ(fAEQbTJ);
        }
        RectF rectF = this.OLrzqt;
        float f3 = rectF.bottom;
        return f3 + fAEQbTJ < 0.0f ? -f3 : rectF.top + fAEQbTJ > ((float) getHeight()) ? getHeight() - this.OLrzqt.top : fAEQbTJ;
    }

    public final float AEQbTJ(float f) {
        float height;
        float f2;
        if (DbNXlk() >= getHeight()) {
            float f3 = this.OLrzqt.top;
            if (f3 <= 0.0f && f3 + f > 0.0f) {
                android.view.ScaleGestureDetector scaleGestureDetector = this.getFieldNames;
                Intrinsics.copydefault(scaleGestureDetector);
                if (!scaleGestureDetector.isInProgress()) {
                    return -this.OLrzqt.top;
                }
            }
            if (this.OLrzqt.bottom < getHeight() || this.OLrzqt.bottom + f >= getHeight()) {
                return f;
            }
            android.view.ScaleGestureDetector scaleGestureDetector2 = this.getFieldNames;
            Intrinsics.copydefault(scaleGestureDetector2);
            if (scaleGestureDetector2.isInProgress()) {
                return f;
            }
            height = getHeight();
            f2 = this.OLrzqt.bottom;
        } else {
            android.view.ScaleGestureDetector scaleGestureDetector3 = this.getFieldNames;
            Intrinsics.copydefault(scaleGestureDetector3);
            if (scaleGestureDetector3.isInProgress()) {
                return f;
            }
            RectF rectF = this.OLrzqt;
            float f4 = rectF.top;
            if (f4 >= 0.0f && f4 + f < 0.0f) {
                return -f4;
            }
            if (rectF.bottom > getHeight() || this.OLrzqt.bottom + f <= getHeight()) {
                return f;
            }
            height = getHeight();
            f2 = this.OLrzqt.bottom;
        }
        return height - f2;
    }
}
