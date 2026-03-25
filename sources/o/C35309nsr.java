package o;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.common.ConnectionResult;
import com.okinc.im.camera.OKIMCaptureMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35317nsz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35309nsr extends android.view.View {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final float AEQbTJ;
    public float AYXKKw;
    public final float AhwBna;
    public final int AkhnZx;
    public final android.graphics.Paint AuCTel;
    public int DbNXlk;
    public float EZpvd;
    public float KWHzl;
    public final int copydefault;
    public InterfaceC35317nsz djBIcL;
    public final int ejfBZ;
    public float fARcdN;
    public final int fIwbmz;
    public final int fJNWhG;
    public int fetchVPNInfo;
    public OKIMCaptureMode gEmmrt;
    public int getFieldNames;
    public final float getNewProxyInstance;
    public int hDKMBd;
    public final int isConnected;
    public final RectF iwGUEr;
    public StateListAnimator uzCIH;
    public final float valueOf;
    public final Application values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKIMCaptureMode AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35317nsz OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCaptureListener(InterfaceC35317nsz interfaceC35317nsz) {
        this.djBIcL = interfaceC35317nsz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCaptureMode(@NotNull OKIMCaptureMode oKIMCaptureMode) {
        Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
        this.gEmmrt = oKIMCaptureMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf() {
        this.hDKMBd = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35309nsr(@NotNull android.content.Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = i;
        this.fIwbmz = -300503530;
        this.ejfBZ = -287515428;
        this.isConnected = -1;
        this.hDKMBd = 1;
        this.gEmmrt = OKIMCaptureMode.CAPTURE_ONLY;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.AuCTel = paint;
        float f = i;
        float f2 = f / 15.0f;
        this.getNewProxyInstance = f2;
        int i2 = i / 8;
        this.fJNWhG = i2;
        this.AkhnZx = i2;
        float f3 = ((i2 * 2) + i) / 2.0f;
        this.valueOf = f3;
        this.AhwBna = f3;
        float f4 = f / 2.0f;
        this.AEQbTJ = f4;
        this.KWHzl = f4;
        this.EZpvd = 0.75f * f4;
        this.DbNXlk = 10300;
        this.fetchVPNInfo = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        float f5 = (i2 + f4) - (f2 / 2);
        float f6 = f3 - f5;
        float f7 = f3 + f5;
        this.iwGUEr = new RectF(f6, f6, f7, f7);
        this.values = new Application();
        pUU.KWHzl("OKIMCaptureButton", "OKIMCaptureButton initialised with size: " + i);
        long j = (long) this.DbNXlk;
        this.uzCIH = new StateListAnimator(j, j / 360);
    }

    /* JADX INFO: renamed from: o.nsr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nsr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.copydefault + (this.fJNWhG * 2);
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        this.AuCTel.setStyle(Paint.Style.FILL);
        this.AuCTel.setColor(this.ejfBZ);
        canvas.drawCircle(this.valueOf, this.AhwBna, this.KWHzl, this.AuCTel);
        this.AuCTel.setColor(this.isConnected);
        canvas.drawCircle(this.valueOf, this.AhwBna, this.EZpvd, this.AuCTel);
        if (this.hDKMBd == 4) {
            this.AuCTel.setColor(this.fIwbmz);
            this.AuCTel.setStyle(Paint.Style.STROKE);
            this.AuCTel.setStrokeWidth(this.getNewProxyInstance);
            canvas.drawArc(this.iwGUEr, -90.0f, this.fARcdN, false, this.AuCTel);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        OKIMCaptureMode oKIMCaptureMode;
        InterfaceC35317nsz interfaceC35317nsz;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            pUU.KWHzl("OKIMCaptureButton", "Touch down, state: " + this.hDKMBd);
            if (motionEvent.getPointerCount() <= 1 && this.hDKMBd == 1) {
                this.AYXKKw = motionEvent.getY();
                this.hDKMBd = 2;
                OKIMCaptureMode oKIMCaptureMode2 = this.gEmmrt;
                if (oKIMCaptureMode2 == OKIMCaptureMode.RECORD_ONLY || oKIMCaptureMode2 == OKIMCaptureMode.BOTH) {
                    postDelayed(this.values, 500L);
                }
            }
        } else if (action != 1) {
            if (action == 2 && this.hDKMBd == 4 && (((oKIMCaptureMode = this.gEmmrt) == OKIMCaptureMode.RECORD_ONLY || oKIMCaptureMode == OKIMCaptureMode.BOTH) && (interfaceC35317nsz = this.djBIcL) != null)) {
                interfaceC35317nsz.OLrzqt(new InterfaceC35317nsz.StateListAnimator.TaskDescription(this.AYXKKw - motionEvent.getY()));
            }
        } else {
            performClick();
            KWHzl();
        }
        return true;
    }

    public final void KWHzl() {
        removeCallbacks(this.values);
        int i = this.hDKMBd;
        if (i == 2) {
            OKIMCaptureMode oKIMCaptureMode = this.gEmmrt;
            if (oKIMCaptureMode == OKIMCaptureMode.CAPTURE_ONLY || oKIMCaptureMode == OKIMCaptureMode.BOTH) {
                AhwBna();
            } else {
                this.hDKMBd = 1;
            }
        } else if (i == 3 || i == 4) {
            StateListAnimator stateListAnimator = this.uzCIH;
            if (stateListAnimator != null) {
                stateListAnimator.cancel();
            }
            EZpvd();
        }
        this.hDKMBd = 1;
    }

    public final void EZpvd() {
        InterfaceC35317nsz interfaceC35317nsz = this.djBIcL;
        if (interfaceC35317nsz != null) {
            int i = this.getFieldNames;
            if (i < this.fetchVPNInfo) {
                interfaceC35317nsz.OLrzqt(new InterfaceC35317nsz.StateListAnimator.C0897StateListAnimator(i));
            } else {
                interfaceC35317nsz.OLrzqt(new InterfaceC35317nsz.StateListAnimator.ActionBar(i));
            }
        }
        copydefault();
    }

    public final void copydefault() {
        this.hDKMBd = 5;
        this.fARcdN = 0.0f;
        invalidate();
        float f = this.KWHzl;
        float f2 = this.AEQbTJ;
        OLrzqt(f, f2, this.EZpvd, 0.75f * f2);
    }

    public final void AhwBna() {
        float f = this.EZpvd;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f, 0.75f * f, f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.nss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C35309nsr.AhwBna(this.copydefault, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Activity());
        valueAnimatorOfFloat.setDuration(50L);
        valueAnimatorOfFloat.start();
    }

    public static final void AhwBna(C35309nsr c35309nsr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c35309nsr.EZpvd = ((java.lang.Float) animatedValue).floatValue();
        c35309nsr.invalidate();
    }

    /* JADX INFO: renamed from: o.nsr$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public Activity() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            InterfaceC35317nsz interfaceC35317nszOLrzqt = C35309nsr.this.OLrzqt();
            if (interfaceC35317nszOLrzqt != null) {
                interfaceC35317nszOLrzqt.OLrzqt(InterfaceC35317nsz.StateListAnimator.Fragment.EZpvd);
            }
            C35309nsr.this.hDKMBd = 5;
        }
    }

    public final void OLrzqt(float f, float f2, float f3, float f4) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.nsy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C35309nsr.OLrzqt(this.OLrzqt, valueAnimator);
            }
        });
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(f3, f4);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.nsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C35309nsr.copydefault(this.copydefault, valueAnimator);
            }
        });
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new TaskDescription());
        animatorSet.setDuration(100L);
        animatorSet.start();
    }

    public static final void OLrzqt(C35309nsr c35309nsr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c35309nsr.KWHzl = ((java.lang.Float) animatedValue).floatValue();
        c35309nsr.invalidate();
    }

    public static final void copydefault(C35309nsr c35309nsr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c35309nsr.EZpvd = ((java.lang.Float) animatedValue).floatValue();
        c35309nsr.invalidate();
    }

    /* JADX INFO: renamed from: o.nsr$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public TaskDescription() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (C35309nsr.this.hDKMBd != 3) {
                C35309nsr.this.hDKMBd = 1;
                return;
            }
            InterfaceC35317nsz interfaceC35317nszOLrzqt = C35309nsr.this.OLrzqt();
            if (interfaceC35317nszOLrzqt != null) {
                interfaceC35317nszOLrzqt.OLrzqt(InterfaceC35317nsz.StateListAnimator.Application.OLrzqt);
            }
            C35309nsr.this.hDKMBd = 4;
            StateListAnimator stateListAnimator = C35309nsr.this.uzCIH;
            if (stateListAnimator != null) {
                stateListAnimator.start();
            }
        }
    }

    public final void OLrzqt(long j) {
        int i = this.DbNXlk;
        this.getFieldNames = (int) (((long) i) - j);
        this.fARcdN = 360.0f - ((j / i) * 360.0f);
        invalidate();
    }

    /* JADX INFO: renamed from: o.nsr$StateListAnimator */
    public final class StateListAnimator extends android.os.CountDownTimer {
        public StateListAnimator(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C35309nsr.this.OLrzqt(j);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C35309nsr.this.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.nsr$Application */
    public final class Application implements java.lang.Runnable {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C35309nsr.this.hDKMBd = 3;
            C35309nsr c35309nsr = C35309nsr.this;
            c35309nsr.OLrzqt(c35309nsr.KWHzl, C35309nsr.this.KWHzl + C35309nsr.this.fJNWhG, C35309nsr.this.EZpvd, C35309nsr.this.EZpvd - C35309nsr.this.AkhnZx);
        }
    }

    public final void setMaxDuration(int i) {
        this.DbNXlk = i;
        long j = i;
        this.uzCIH = new StateListAnimator(j, j / 360);
    }
}
