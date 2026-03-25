package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import o.C52761wXj;
import o.oXP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXR extends android.view.View {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public android.animation.ValueAnimator AEQbTJ;
    public final int AYXKKw;
    public oXK AhwBna;
    public oXP AkhnZx;
    public final int AuCTel;
    public int DbNXlk;
    public oXH<?> EZpvd;
    public final int OLrzqt;
    public boolean copydefault;
    public oXS djBIcL;
    public final Activity ejfBZ;
    public boolean fARcdN;
    public oXS fIwbmz;
    public int fJNWhG;
    public float fetchVPNInfo;
    public android.view.MotionEvent gEmmrt;
    public TaskDescription getFieldNames;
    public InterfaceC36341oYe isConnected;
    public oXS uzCIH;
    public oXS valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXS AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXS KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXS copydefault() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFallOption(oXS oxs) {
        this.valueOf = oxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnChartTouchListener(InterfaceC36341oYe interfaceC36341oYe) {
        this.isConnected = interfaceC36341oYe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiseOption(oXS oxs) {
        this.fIwbmz = oxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTouchTmpDrawOption(oXS oxs) {
        this.uzCIH = oxs;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oXR(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.RJOkX);
        this.AhwBna = new oXK();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(TypedValues.TransitionType.TYPE_DURATION);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        this.AEQbTJ = valueAnimatorOfInt;
        this.DbNXlk = 255;
        this.AuCTel = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.djBIcL = new oXS(-16711936, -16711936, -16711936, -16711936, -16711936, 0, 0, 0, 224, null);
        this.AkhnZx = new oXP(0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0.0f, false, 8191, null);
        this.ejfBZ = new Activity();
        this.OLrzqt = 10001;
        this.fJNWhG = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oXR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.RJOkX);
        this.AhwBna = new oXK();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(TypedValues.TransitionType.TYPE_DURATION);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        this.AEQbTJ = valueAnimatorOfInt;
        this.DbNXlk = 255;
        this.AuCTel = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.djBIcL = new oXS(-16711936, -16711936, -16711936, -16711936, -16711936, 0, 0, 0, 224, null);
        this.AkhnZx = new oXP(0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0.0f, false, 8191, null);
        this.ejfBZ = new Activity();
        this.OLrzqt = 10001;
        this.fJNWhG = -1;
        EZpvd(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oXR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.RJOkX);
        this.AhwBna = new oXK();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(TypedValues.TransitionType.TYPE_DURATION);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        this.AEQbTJ = valueAnimatorOfInt;
        this.DbNXlk = 255;
        this.AuCTel = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.djBIcL = new oXS(-16711936, -16711936, -16711936, -16711936, -16711936, 0, 0, 0, 224, null);
        this.AkhnZx = new oXP(0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0.0f, false, 8191, null);
        this.ejfBZ = new Activity();
        this.OLrzqt = 10001;
        this.fJNWhG = -1;
        EZpvd(context, attributeSet);
    }

    public final void setDrawOption(@NotNull oXS oxs) {
        Intrinsics.checkNotNullParameter(oxs, "");
        if (Intrinsics.EZpvd(this.djBIcL, oxs)) {
            return;
        }
        this.djBIcL = oxs;
        updateDrawBox$default(this, oxs, false, 2, null);
        invalidate();
    }

    public static /* synthetic */ void updateDrawBox$default(oXR oxr, oXS oxs, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        oxr.OLrzqt(oxs, z);
    }

    public final void OLrzqt(oXS oxs, boolean z) {
        this.AhwBna.OLrzqt(oxs);
        if (!this.AkhnZx.zsXlph() || z) {
            return;
        }
        this.AhwBna.OLrzqt(oxs, this.AkhnZx);
    }

    public static final class ActionBar implements Animator.AnimatorListener {
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

        public ActionBar(oXR oxr) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            oXR.this.EZpvd();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            oXR.this.EZpvd();
        }
    }

    private final void EZpvd(oXH<?> oxh) {
        if (Intrinsics.EZpvd(oxh, this.EZpvd)) {
            return;
        }
        this.EZpvd = oxh;
        if (oxh != null && this.AkhnZx.zsXlph()) {
            oXH<?> oxh2 = this.EZpvd;
            Intrinsics.copydefault(oxh2);
            KWHzl(oxh2, this.AkhnZx);
        }
        invalidate();
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32392mcI.Fragment.djBIcL);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int i = typedArrayObtainStyledAttributes.getInt(C32392mcI.Fragment.AkhnZx, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(C32392mcI.Fragment.AYXKKw, 50);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C32392mcI.Fragment.DbNXlk, 8.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C32392mcI.Fragment.AhwBna, 2.0f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C32392mcI.Fragment.gEmmrt, 0);
        typedArrayObtainStyledAttributes.recycle();
        oXP.StateListAnimator stateListAnimator = oXP.Companion;
        KWHzl(stateListAnimator.AEQbTJ(stateListAnimator.KWHzl(this.AkhnZx, i, i2), dimensionPixelSize));
        KWHzl(stateListAnimator.OLrzqt(this.AkhnZx, dimension + dimension2, dimension, dimension2));
    }

    private final void KWHzl(oXP oxp) {
        if (Intrinsics.EZpvd(oxp, this.AkhnZx)) {
            return;
        }
        this.AkhnZx = oxp;
        if (oxp.zsXlph()) {
            updateDrawBox$default(this, this.djBIcL, false, 2, null);
        }
        if (this.EZpvd != null && this.AkhnZx.zsXlph()) {
            oXH<?> oxh = this.EZpvd;
            Intrinsics.copydefault(oxh);
            KWHzl(oxh, this.AkhnZx);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oXP.StateListAnimator stateListAnimator = oXP.Companion;
        KWHzl(stateListAnimator.EZpvd(stateListAnimator.EZpvd(this.AkhnZx, C56548yJl.valueOf(i2, getMeasuredHeight()), C56548yJl.valueOf(i, getMeasuredWidth()))));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        java.lang.Integer num;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        TaskDescription taskDescription = this.getFieldNames;
        if (taskDescription != null && taskDescription != null) {
            taskDescription.OLrzqt();
        }
        if (this.AEQbTJ.isRunning()) {
            java.lang.Object animatedValue = this.AEQbTJ.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            num = (java.lang.Integer) animatedValue;
        } else {
            num = null;
        }
        if (!this.fARcdN) {
            if (this.getFieldNames == null) {
                android.graphics.Bitmap bitmapOLrzqt = this.AkhnZx.OLrzqt();
                if (bitmapOLrzqt != null && !bitmapOLrzqt.isRecycled()) {
                    canvas.drawBitmap(bitmapOLrzqt, 0.0f, 0.0f, this.AhwBna.copydefault());
                }
            } else {
                oXN oxn = oXN.KWHzl;
                oXP oxp = this.AkhnZx;
                oXH<?> oxh = this.EZpvd;
                oXK oxk = this.AhwBna;
                canvas.save();
                android.graphics.Path pathDjBIcL = oxh != null ? oxh.djBIcL() : null;
                if (pathDjBIcL != null) {
                    canvas.clipPath(pathDjBIcL);
                }
                try {
                    float[] fArrWlaJM = oxp.wlaJM();
                    if (fArrWlaJM != null) {
                        canvas.drawLines(fArrWlaJM, oxk.gEmmrt());
                    }
                    float[] fArrAYXKKw = oxp.AYXKKw();
                    if (fArrAYXKKw != null) {
                        canvas.drawLines(fArrAYXKKw, oxk.AhwBna());
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                canvas.restore();
                oXN oxn2 = oXN.KWHzl;
                oXP oxp2 = this.AkhnZx;
                oXH<?> oxh2 = this.EZpvd;
                android.graphics.Paint paintKWHzl = this.AhwBna.KWHzl();
                canvas.save();
                android.graphics.Path pathEZpvd = oxh2 != null ? oxh2.EZpvd() : null;
                if (pathEZpvd != null) {
                    canvas.clipPath(pathEZpvd);
                }
                try {
                    try {
                        float[] fArrDjBIcL = oxp2.djBIcL();
                        if (fArrDjBIcL != null) {
                            canvas.drawLines(fArrDjBIcL, paintKWHzl);
                        }
                    } catch (java.lang.Exception e2) {
                        e2.printStackTrace();
                    }
                } finally {
                    canvas.restore();
                }
            }
        }
        oXN oxn3 = oXN.KWHzl;
        oxn3.EZpvd(canvas, this.EZpvd, this.AkhnZx, this.getFieldNames, this.AhwBna, num);
        oxn3.KWHzl(canvas, this.EZpvd, this.AkhnZx, this.getFieldNames, this.AhwBna);
        if (num == null) {
            oxn3.OLrzqt(canvas, this.EZpvd, this.AkhnZx, this.getFieldNames, this.AhwBna);
        }
    }

    public final void setMaxMinLabelsAlpha(int i) {
        this.DbNXlk = i;
        this.AhwBna.AYXKKw().setAlpha(i);
        invalidate();
    }

    public final void AhwBna() {
        this.AEQbTJ.cancel();
        this.AEQbTJ.removeAllUpdateListeners();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(TypedValues.TransitionType.TYPE_DURATION);
        this.AEQbTJ = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new android.view.animation.LinearInterpolator());
        this.AEQbTJ.setDuration(700L);
        this.AEQbTJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oYb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                oXR.KWHzl(this.AEQbTJ, valueAnimator);
            }
        });
        this.AEQbTJ.addListener(new ActionBar(this));
        this.AEQbTJ.start();
    }

    public static final void KWHzl(oXR oxr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        oXK oxk = oxr.AhwBna;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int iIntValue = TypedValues.TransitionType.TYPE_DURATION;
        oxk.EZpvd(num != null ? num.intValue() : 700, TypedValues.TransitionType.TYPE_DURATION);
        oXH<?> oxh = oxr.EZpvd;
        if (oxh != null) {
            java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
            java.lang.Integer num2 = animatedValue2 instanceof java.lang.Integer ? (java.lang.Integer) animatedValue2 : null;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            oxh.KWHzl(iIntValue);
        }
        if (oxr.DbNXlk == 0) {
            oxr.AhwBna.AYXKKw().setAlpha(oxr.DbNXlk);
        }
        oxr.invalidate();
    }

    public final void EZpvd() {
        this.AhwBna.copydefault().setAlpha(255);
        this.AhwBna.KWHzl().setAlpha(255);
        this.AhwBna.AhwBna().setAlpha(255);
        this.AhwBna.AYXKKw().setAlpha(this.DbNXlk);
        this.AhwBna.gEmmrt().setAlpha(255);
        this.AhwBna.isConnected().setAlpha(255);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ.cancel();
    }

    public final <T> void setData(@NotNull java.util.List<? extends T> list, boolean z, boolean z2, @NotNull oXM oxm, @NotNull Function1<? super T, java.lang.Float> function1, @NotNull Function1<? super T, java.lang.String> function12, @NotNull Function1<? super T, java.lang.String> function13) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oxm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        toString();
        this.fARcdN = z2;
        EZpvd(new oXH<>(list, function1, oxm, function12, function13));
        if (z) {
            AhwBna();
        } else {
            this.AEQbTJ.cancel();
            this.AEQbTJ.removeAllUpdateListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(TaskDescription taskDescription) {
        if (Intrinsics.EZpvd(this.getFieldNames, taskDescription)) {
            return;
        }
        if (this.getFieldNames == null && taskDescription != null) {
            this.uzCIH = this.djBIcL;
            AEQbTJ(taskDescription);
        }
        if (this.getFieldNames != null && taskDescription == null) {
            valueOf();
            oXS oxs = this.uzCIH;
            if (oxs == null) {
                oxs = this.djBIcL;
            }
            setDrawOption(oxs);
            this.uzCIH = null;
        }
        this.getFieldNames = taskDescription;
    }

    public final void valueOf() {
        post(new java.lang.Runnable() { // from class: o.oXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oXR.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final void gEmmrt(oXR oxr) {
        InterfaceC36341oYe interfaceC36341oYe = oxr.isConnected;
        if (interfaceC36341oYe != null) {
            interfaceC36341oYe.copydefault();
        }
    }

    public final void AEQbTJ(final TaskDescription taskDescription) {
        post(new java.lang.Runnable() { // from class: o.oXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oXR.valueOf(this.AEQbTJ, taskDescription);
            }
        });
    }

    public static final void valueOf(oXR oxr, TaskDescription taskDescription) {
        InterfaceC36341oYe interfaceC36341oYe = oxr.isConnected;
        if (interfaceC36341oYe != null) {
            java.lang.Float fOLrzqt = taskDescription.OLrzqt();
            oXL<?> oxlEZpvd = taskDescription.EZpvd();
            interfaceC36341oYe.EZpvd(fOLrzqt, oxlEZpvd != null ? oxlEZpvd.KWHzl() : null);
        }
    }

    public final void KWHzl(final TaskDescription taskDescription) {
        post(new java.lang.Runnable() { // from class: o.oXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oXR.KWHzl(this.AEQbTJ, taskDescription);
            }
        });
    }

    public static final void KWHzl(oXR oxr, TaskDescription taskDescription) {
        InterfaceC36341oYe interfaceC36341oYe = oxr.isConnected;
        if (interfaceC36341oYe != null) {
            float fValueOf = taskDescription.valueOf();
            oXL<?> oxlEZpvd = taskDescription.EZpvd();
            interfaceC36341oYe.copydefault(java.lang.Float.valueOf(fValueOf), oxlEZpvd != null ? oxlEZpvd.KWHzl() : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.fetchVPNInfo = motionEvent.getX();
                this.values = motionEvent.getY();
                OLrzqt();
            } else if (action == 1) {
                AYXKKw();
                this.copydefault = false;
            } else if (action == 2) {
                float y = motionEvent.getY();
                float f = this.values;
                float x = motionEvent.getX();
                float f2 = this.fetchVPNInfo;
                if (!this.copydefault && (java.lang.Math.abs(x - f2) > this.AuCTel || java.lang.Math.abs(y - f) > this.AuCTel)) {
                    AYXKKw();
                }
            } else if (action == 3) {
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final class Activity implements java.lang.Runnable {
        public Activity() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oXR.this.getParent().requestDisallowInterceptTouchEvent(true);
            oXR oxr = oXR.this;
            oxr.EZpvd(oxr.new TaskDescription());
            TaskDescription taskDescription = oXR.this.getFieldNames;
            if (taskDescription != null) {
                taskDescription.copydefault(java.lang.Integer.valueOf(oXR.this.fJNWhG));
            }
            TaskDescription taskDescription2 = oXR.this.getFieldNames;
            if (taskDescription2 != null) {
                taskDescription2.KWHzl(oXR.this.gEmmrt);
            }
            oXR.this.copydefault = true;
            oXR.this.invalidate();
        }
    }

    public final void OLrzqt() {
        android.os.Handler handler = getHandler();
        if (handler == null || handler.hasMessages(this.OLrzqt)) {
            return;
        }
        android.os.Message messageObtain = android.os.Message.obtain(getHandler(), this.ejfBZ);
        messageObtain.what = this.OLrzqt;
        getHandler().sendMessageDelayed(messageObtain, android.view.ViewConfiguration.getLongPressTimeout());
    }

    public final void AYXKKw() {
        getHandler().removeMessages(this.OLrzqt);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.fARcdN) {
            return false;
        }
        this.AEQbTJ.cancel();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.fJNWhG = motionEvent.getPointerId(0);
            this.gEmmrt = android.view.MotionEvent.obtain(motionEvent);
        } else if (actionMasked == 1) {
            if (this.getFieldNames == null) {
                valueOf();
            }
            TaskDescription taskDescription = this.getFieldNames;
            if (taskDescription != null) {
                taskDescription.KWHzl(null);
            }
            TaskDescription taskDescription2 = this.getFieldNames;
            if (taskDescription2 != null) {
                taskDescription2.copydefault(null);
            }
            EZpvd((TaskDescription) null);
            this.fJNWhG = -1;
            android.view.MotionEvent motionEvent2 = this.gEmmrt;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.gEmmrt = null;
        } else if (actionMasked == 2) {
            TaskDescription taskDescription3 = this.getFieldNames;
            if (taskDescription3 != null) {
                java.lang.Integer numCopydefault = taskDescription3.copydefault();
                if (motionEvent.findPointerIndex(numCopydefault != null ? numCopydefault.intValue() : -1) != -1) {
                    taskDescription3.KWHzl(android.view.MotionEvent.obtain(motionEvent));
                }
            }
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                if (this.getFieldNames == null) {
                    valueOf();
                }
                int actionIndex = motionEvent.getActionIndex();
                TaskDescription taskDescription4 = this.getFieldNames;
                if (taskDescription4 != null) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    java.lang.Integer numCopydefault2 = taskDescription4.copydefault();
                    if (numCopydefault2 != null && pointerId == numCopydefault2.intValue()) {
                        TaskDescription taskDescription5 = this.getFieldNames;
                        if (taskDescription5 != null) {
                            taskDescription5.KWHzl(null);
                        }
                        TaskDescription taskDescription6 = this.getFieldNames;
                        if (taskDescription6 != null) {
                            taskDescription6.copydefault(null);
                        }
                        EZpvd((TaskDescription) null);
                        this.fJNWhG = -1;
                        android.view.MotionEvent motionEvent3 = this.gEmmrt;
                        if (motionEvent3 != null) {
                            motionEvent3.recycle();
                        }
                        this.gEmmrt = null;
                        this.copydefault = false;
                    }
                }
            }
        }
        return true;
    }

    public final class TaskDescription {
        public RectF AEQbTJ;
        public java.lang.Float AYXKKw;
        public java.lang.Integer EZpvd;
        public oXL<?> OLrzqt;
        public java.util.List<C36343oYg> copydefault;
        public int djBIcL = -1;
        public float gEmmrt = -1000.0f;
        public android.view.MotionEvent valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36343oYg> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final oXL<?> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RectF KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        public final void OLrzqt(oXL<?> oxl) {
            oXS oxsAEQbTJ;
            if (Intrinsics.EZpvd(this.OLrzqt, oxl)) {
                return;
            }
            this.OLrzqt = oxl;
            oXH oxh = oXR.this.EZpvd;
            if (oxh != null) {
                oXR oxr = oXR.this;
                java.lang.Float fAYXKKw = oxh.AYXKKw();
                java.lang.Float fEZpvd = oxh.EZpvd(oxl != null ? oxl.KWHzl() : null);
                if (fEZpvd == null || fAYXKKw == null || Intrinsics.copydefault(fAYXKKw, fEZpvd)) {
                    return;
                }
                if (fEZpvd.floatValue() > fAYXKKw.floatValue()) {
                    oxsAEQbTJ = oxr.copydefault();
                    if (oxsAEQbTJ == null) {
                        oxsAEQbTJ = oxr.KWHzl();
                    }
                } else {
                    oxsAEQbTJ = oxr.AEQbTJ();
                    if (oxsAEQbTJ == null) {
                        oxsAEQbTJ = oxr.KWHzl();
                    }
                }
                oxr.setDrawOption(oxsAEQbTJ);
            }
        }

        public final void AEQbTJ(java.lang.Float f) {
            if (Intrinsics.copydefault(this.AYXKKw, f)) {
                return;
            }
            this.AYXKKw = f;
            oXR.this.KWHzl(this);
        }

        public final void EZpvd(float f) {
            C36343oYg c36343oYg;
            if (f == this.gEmmrt) {
                return;
            }
            this.gEmmrt = f;
            this.djBIcL = f == -1000.0f ? -1 : oXQ.EZpvd.KWHzl(f, oXR.this.AkhnZx);
            oXH oxh = oXR.this.EZpvd;
            java.lang.Float fValueOf = null;
            OLrzqt(oxh != null ? oxh.copydefault(this.djBIcL) : null);
            oXL<?> oxl = this.OLrzqt;
            if (oxl != null) {
                oXR oxr = oXR.this;
                oXH oxh2 = oxr.EZpvd;
                java.util.List<C36343oYg> listEZpvd = oxh2 != null ? oxh2.EZpvd(oxl.copydefault().copydefault()) : null;
                this.copydefault = listEZpvd;
                if (listEZpvd != null && (c36343oYg = (C36343oYg) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd)) != null) {
                    fValueOf = java.lang.Float.valueOf(c36343oYg.EZpvd() + (c36343oYg.OLrzqt() / 2.0f));
                }
                AEQbTJ(fValueOf);
                this.AEQbTJ = oXQ.EZpvd.EZpvd(this, oxr.AkhnZx);
            }
        }

        public final void KWHzl(android.view.MotionEvent motionEvent) {
            this.valueOf = motionEvent;
            EZpvd((motionEvent == null || motionEvent == null) ? -1000.0f : motionEvent.getX());
            oXR.this.invalidate();
        }
    }

    public final <T> void KWHzl(@NotNull oXH<T> oxh, @NotNull oXP oxp) {
        android.graphics.Bitmap bitmapOLrzqt;
        oXL<T> second;
        C36343oYg c36343oYgCopydefault;
        oXL<T> second2;
        C36343oYg c36343oYgCopydefault2;
        oXL<T> second3;
        C36343oYg c36343oYgCopydefault3;
        oXL<T> second4;
        C36343oYg c36343oYgCopydefault4;
        Intrinsics.checkNotNullParameter(oxh, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        java.lang.System.currentTimeMillis();
        oXQ oxq = oXQ.EZpvd;
        oXF<T> oxfOLrzqt = oxq.OLrzqt(oxh.OLrzqt(), oxp, oxh.fetchVPNInfo());
        this.AhwBna.copydefault(oxh);
        oxh.OLrzqt(oxfOLrzqt.EZpvd());
        oxp.KWHzl(this.AhwBna.AYXKKw().measureText(oxh.values()));
        kotlin.Pair<java.lang.Integer, oXL<T>> pairAkhnZx = oxh.AkhnZx();
        oxp.KWHzl((pairAkhnZx == null || (second4 = pairAkhnZx.getSecond()) == null || (c36343oYgCopydefault4 = second4.copydefault()) == null) ? null : java.lang.Float.valueOf((c36343oYgCopydefault4.EZpvd() + (oxp.uzCIH() / 2.0f)) - (oxp.values() / 2.0f)));
        kotlin.Pair<java.lang.Integer, oXL<T>> pairIsConnected = oxh.isConnected();
        oxp.AEQbTJ((pairIsConnected == null || (second3 = pairIsConnected.getSecond()) == null || (c36343oYgCopydefault3 = second3.copydefault()) == null) ? null : java.lang.Float.valueOf(c36343oYgCopydefault3.gEmmrt() - this.AYXKKw));
        kotlin.Pair<java.lang.Integer, oXL<T>> pairAkhnZx2 = oxh.AkhnZx();
        oxp.OLrzqt((pairAkhnZx2 == null || (second2 = pairAkhnZx2.getSecond()) == null || (c36343oYgCopydefault2 = second2.copydefault()) == null) ? null : java.lang.Float.valueOf(c36343oYgCopydefault2.gEmmrt() + this.AYXKKw + (this.AhwBna.AYXKKw().getFontMetrics().bottom - this.AhwBna.AYXKKw().getFontMetrics().top)));
        oxp.copydefault(this.AhwBna.AYXKKw().measureText(oxh.DbNXlk()));
        kotlin.Pair<java.lang.Integer, oXL<T>> pairIsConnected2 = oxh.isConnected();
        oxp.EZpvd((pairIsConnected2 == null || (second = pairIsConnected2.getSecond()) == null || (c36343oYgCopydefault = second.copydefault()) == null) ? null : java.lang.Float.valueOf((c36343oYgCopydefault.EZpvd() + (oxp.uzCIH() / 2.0f)) - (oxp.fetchVPNInfo() / 2.0f)));
        oxh.copydefault(oxfOLrzqt.OLrzqt());
        oxh.EZpvd(oxfOLrzqt.copydefault());
        oxh.KWHzl(oxfOLrzqt.AEQbTJ());
        oxh.copydefault(oxq.OLrzqt(new android.graphics.Path(oxh.valueOf()), oxp));
        oxh.copydefault(true);
        java.lang.System.currentTimeMillis();
        if (oxp.OLrzqt() != null) {
            android.graphics.Bitmap bitmapOLrzqt2 = oxp.OLrzqt();
            if (bitmapOLrzqt2 != null) {
                bitmapOLrzqt2.recycle();
            }
            oxp.AEQbTJ((android.graphics.Bitmap) null);
        }
        if (this.fARcdN) {
            return;
        }
        java.lang.System.currentTimeMillis();
        if ((oxp.OLrzqt() == null || ((bitmapOLrzqt = oxp.OLrzqt()) != null && bitmapOLrzqt.isRecycled())) && oxp.zsXlph() && oxp.AkhnZx() > 0 && oxp.gEmmrt() > 0) {
            try {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(oxp.AkhnZx(), oxp.gEmmrt(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                oXN oxn = oXN.KWHzl;
                oXK oxk = this.AhwBna;
                canvas.save();
                android.graphics.Path pathDjBIcL = oxh.djBIcL();
                if (pathDjBIcL != null) {
                    canvas.clipPath(pathDjBIcL);
                }
                try {
                    float[] fArrWlaJM = oxp.wlaJM();
                    if (fArrWlaJM != null) {
                        canvas.drawLines(fArrWlaJM, oxk.gEmmrt());
                    }
                    float[] fArrAYXKKw = oxp.AYXKKw();
                    if (fArrAYXKKw != null) {
                        canvas.drawLines(fArrAYXKKw, oxk.AhwBna());
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                canvas.restore();
                oXN oxn2 = oXN.KWHzl;
                android.graphics.Paint paintKWHzl = this.AhwBna.KWHzl();
                canvas.save();
                android.graphics.Path pathEZpvd = oxh.EZpvd();
                if (pathEZpvd != null) {
                    canvas.clipPath(pathEZpvd);
                }
                try {
                    try {
                        float[] fArrDjBIcL = oxp.djBIcL();
                        if (fArrDjBIcL != null) {
                            canvas.drawLines(fArrDjBIcL, paintKWHzl);
                        }
                    } catch (java.lang.Exception e2) {
                        e2.printStackTrace();
                    }
                    canvas.restore();
                    oxp.AEQbTJ(bitmapCreateBitmap);
                } catch (java.lang.Throwable th) {
                    canvas.restore();
                    throw th;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.System.currentTimeMillis();
    }
}
