package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.GestureDetector;
import android.view.ViewGroup;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.wUO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wUO extends android.view.ViewGroup {
    public float AEQbTJ;
    public float AYXKKw;
    public final float AhwBna;
    public float AkhnZx;
    public final android.widget.TextView AuCTel;
    public java.util.List<StateListAnimator> DbNXlk;
    public final android.graphics.Paint EZpvd;
    public float OLrzqt;
    public android.animation.ValueAnimator djBIcL;
    public float fIwbmz;
    public int fJNWhG;
    public RectF fetchVPNInfo;
    public final android.view.GestureDetector gEmmrt;
    public float isConnected;
    public final float valueOf;
    public java.util.List<? extends InterfaceC52756wXe> values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final int[] KWHzl = {Color.parseColor("#64D33D"), Color.parseColor("#8A91FF"), Color.parseColor("#B3B3B3"), Color.parseColor("#BCFF2F"), Color.parseColor("#FF7888"), Color.parseColor("#FFB117"), Color.parseColor("#FF7888"), Color.parseColor("#8A91FF"), Color.parseColor("#49A92D"), Color.parseColor("#BDBDBD")};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:52) call: o.wUO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wUO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wUO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.EZpvd = paint;
        this.fetchVPNInfo = new RectF();
        this.values = yDY.AhwBna();
        this.DbNXlk = new java.util.ArrayList();
        this.fJNWhG = -1;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        this.AuCTel = textView;
        this.valueOf = C55298xhM.EZpvd(6.0f, context);
        this.AhwBna = C55298xhM.EZpvd(12.0f, context);
        setWillNotDraw(false);
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        textView.setGravity(17);
        this.gEmmrt = new android.view.GestureDetector(context, new Activity());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wUO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.values.isEmpty()) {
            return;
        }
        copydefault(canvas);
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        float f;
        int iIntValue;
        int size = this.values.size();
        if (size == 0) {
            return;
        }
        float fCopydefault = C56548yJl.copydefault(360.0f - (size == 1 ? 0.0f : this.fIwbmz * size), 0.0f);
        float f2 = -90.0f;
        int i = 0;
        for (java.lang.Object obj : this.DbNXlk) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            float fAEQbTJ = stateListAnimator.AEQbTJ() * this.AkhnZx * (fCopydefault / 360.0f);
            if (i == this.fJNWhG) {
                float f3 = this.valueOf;
                f = f3 + ((this.AhwBna - f3) * this.AYXKKw);
            } else {
                f = this.valueOf;
            }
            this.EZpvd.setStrokeWidth(f);
            android.graphics.Paint paint = this.EZpvd;
            java.lang.Integer numOLrzqt = stateListAnimator.OLrzqt();
            if (numOLrzqt != null) {
                iIntValue = numOLrzqt.intValue();
            } else {
                int[] iArr = KWHzl;
                iIntValue = iArr[i % iArr.length];
            }
            paint.setColor(iIntValue);
            canvas.drawArc(this.fetchVPNInfo, f2 + (this.fIwbmz / 2.0f), fAEQbTJ, false, this.EZpvd);
            f2 += fAEQbTJ + this.fIwbmz;
            i++;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.OLrzqt = i / 2.0f;
        this.AEQbTJ = i2 / 2.0f;
        float fMin = (java.lang.Math.min(i, i2) / 2.0f) - (this.AhwBna / 2.0f);
        this.isConnected = fMin;
        RectF rectF = this.fetchVPNInfo;
        float f = this.OLrzqt;
        float f2 = this.AEQbTJ;
        rectF.set(f - fMin, f2 - fMin, f + fMin, f2 + fMin);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.fIwbmz = (float) ((((double) (C55298xhM.EZpvd(2.8f, context) * 4.0f)) / (((double) (this.isConnected + (this.AhwBna / 2.0f))) * 6.283185307179586d)) * ((double) 360.0f));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            return this.gEmmrt.onTouchEvent(motionEvent);
        }
        return false;
    }

    public static final class Activity extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }

        public Activity() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) throws java.io.IOException {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int iOLrzqt = wUO.this.OLrzqt(motionEvent.getX(), motionEvent.getY());
            if (iOLrzqt != -1) {
                if (iOLrzqt == wUO.this.fJNWhG) {
                    final wUO wuo = wUO.this;
                    wuo.AEQbTJ(0.0f, (Function0<Unit>) new Function0() { // from class: o.wUR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return wUO.Activity.EZpvd(wuo);
                        }
                    });
                } else {
                    if (wUO.this.fJNWhG != -1) {
                        wUO.this.AYXKKw = 0.0f;
                    }
                    wUO.this.fJNWhG = iOLrzqt;
                    wUO.animateExpansion$default(wUO.this, 1.0f, null, 2, null);
                }
            } else if (wUO.this.fJNWhG != -1) {
                final wUO wuo2 = wUO.this;
                wuo2.AEQbTJ(0.0f, (Function0<Unit>) new Function0() { // from class: o.wUS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return wUO.Activity.OLrzqt(wuo2);
                    }
                });
            }
            wUO.this.OLrzqt();
            wUO.this.invalidate();
            return true;
        }

        public static final Unit EZpvd(wUO wuo) throws java.io.IOException {
            wuo.fJNWhG = -1;
            wuo.OLrzqt();
            wuo.invalidate();
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(wUO wuo) throws java.io.IOException {
            wuo.fJNWhG = -1;
            wuo.OLrzqt();
            wuo.invalidate();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wUO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateExpansion$default(wUO wuo, float f, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        wuo.AEQbTJ(f, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(float f, Function0<Unit> function0) {
        android.animation.ValueAnimator valueAnimator = this.djBIcL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.AYXKKw, f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.wUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                wUO.copydefault(this.KWHzl, valueAnimator2);
            }
        });
        if (function0 != null) {
            valueAnimatorOfFloat.addListener(new Application(function0));
        }
        valueAnimatorOfFloat.start();
        this.djBIcL = valueAnimatorOfFloat;
    }

    public static final void copydefault(wUO wuo, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        wuo.AYXKKw = ((java.lang.Float) animatedValue).floatValue();
        wuo.invalidate();
    }

    public static final class Application implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Application(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.invoke();
        }
    }

    public final int OLrzqt(float f, float f2) {
        float fMin = java.lang.Math.min(getWidth(), getHeight()) / 2.0f;
        int i = 0;
        new Region(0, 0, getWidth(), getHeight());
        float f3 = f - this.OLrzqt;
        float f4 = f2 - this.AEQbTJ;
        int size = this.values.size();
        if (size == 0) {
            return -1;
        }
        float f5 = this.fIwbmz;
        float f6 = size;
        if (size == 1) {
            return (f3 * f3) + (f4 * f4) <= fMin * fMin ? 0 : -1;
        }
        float degrees = ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(f4, f3))) + 90.0f;
        if (degrees < 0.0f) {
            degrees += 360.0f;
        }
        if (degrees >= 360.0f) {
            degrees -= 360.0f;
        }
        if (((float) java.lang.Math.sqrt((f3 * f3) + (f4 * f4))) > fMin) {
            return -1;
        }
        float f7 = 0.0f;
        for (java.lang.Object obj : this.DbNXlk) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            float fAEQbTJ = ((StateListAnimator) obj).AEQbTJ() * ((360.0f - (f5 * f6)) / 360.0f);
            float f8 = this.fIwbmz / 2.0f;
            float f9 = fAEQbTJ / 2.0f;
            float fMax = java.lang.Math.max(f9, 10.0f);
            float f10 = f8 + f7 + f9;
            float f11 = f10 - fMax;
            float f12 = f10 + fMax;
            if (f11 < 0.0f) {
                f11 += 360.0f;
            }
            if (f12 >= 360.0f) {
                f12 -= 360.0f;
            }
            if (f11 <= f12) {
                if (f11 <= degrees && degrees <= f12) {
                    return i;
                }
                f7 += fAEQbTJ + this.fIwbmz;
                i++;
            } else {
                if (degrees >= f11 || degrees <= f12) {
                    return i;
                }
                f7 += fAEQbTJ + this.fIwbmz;
                i++;
            }
        }
        return -1;
    }

    public final void OLrzqt() throws java.io.IOException {
        java.lang.String strOLrzqt;
        int i = this.fJNWhG;
        java.lang.String iCUPercent$default = null;
        if (i != -1) {
            StateListAnimator stateListAnimator = (StateListAnimator) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, i);
            strOLrzqt = stateListAnimator != null ? stateListAnimator.copydefault() : null;
        } else {
            strOLrzqt = C33070mpX.OLrzqt(C48033uCm.Fragment.USBtdM, java.lang.Float.valueOf(this.AEQbTJ));
        }
        int i2 = this.fJNWhG;
        if (i2 != -1) {
            StateListAnimator stateListAnimator2 = (StateListAnimator) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, i2);
            if (stateListAnimator2 != null) {
                iCUPercent$default = stateListAnimator2.KWHzl();
            }
        } else {
            iCUPercent$default = pTB.formatICUPercent$default(java.lang.Float.valueOf(100.0f), RoundingMode.UP, C38307pTy.Companion.EZpvd(2), null, null, null, 28, null);
        }
        android.widget.TextView textView = this.AuCTel;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.QOLQEE);
        int length = spannableStringBuilder.length();
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.FQNKFG));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) strOLrzqt).append('\n');
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
        android.text.style.TextAppearanceSpan textAppearanceSpan2 = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.uzCIH);
        int length3 = spannableStringBuilder.length();
        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
        int length4 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) iCUPercent$default);
        spannableStringBuilder.setSpan(styleSpan, length4, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(textAppearanceSpan2, length3, spannableStringBuilder.length(), 17);
        textView.setText(new android.text.SpannedString(spannableStringBuilder));
    }

    public final boolean AEQbTJ(@NotNull java.util.List<? extends InterfaceC52756wXe> list, boolean z, int i) throws java.io.IOException {
        java.util.List<? extends InterfaceC52756wXe> listDjBIcL = list;
        Intrinsics.checkNotNullParameter(listDjBIcL, "");
        int i2 = 0;
        if (list.isEmpty()) {
            return false;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((InterfaceC52756wXe) it.next()).KWHzl());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        if (bigDecimalValueOf.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        if (list.size() > 10) {
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listDjBIcL, 9);
            java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listDjBIcL, 9);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
            java.util.Iterator it2 = listDjBIcL2.iterator();
            while (it2.hasNext()) {
                bigDecimalValueOf2 = bigDecimalValueOf2.add(((InterfaceC52756wXe) it2.next()).KWHzl());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
            }
            BigDecimal bigDecimalDivide = bigDecimalValueOf2.divide(bigDecimalValueOf, MathContext.DECIMAL32);
            listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) C56402yEa.EZpvd(new TaskDescription(uLP.EZpvd(C33129mqd.gEmmrt(bigDecimalDivide), C33129mqd.gEmmrt(bigDecimalDivide)), C33070mpX.OLrzqt(C48033uCm.Fragment.aappFQ, getContext()), null, 0 == true ? 1 : 0)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        float f = 0.0f;
        for (java.lang.Object obj : listDjBIcL) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            InterfaceC52756wXe interfaceC52756wXe = (InterfaceC52756wXe) obj;
            float fDjBIcL = C33129mqd.djBIcL(interfaceC52756wXe.KWHzl()) * 360.0f;
            f += fDjBIcL;
            float f2 = 360.0f - f;
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(interfaceC52756wXe.KWHzl(), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(100.0d), null, 20, null);
            if (i2 != yDY.AuCTel(listDjBIcL)) {
                f2 = 0.0f;
            }
            arrayList.add(new StateListAnimator(fDjBIcL + f2, interfaceC52756wXe.copydefault(), iCUPercent$default, interfaceC52756wXe.OLrzqt()));
            i2++;
        }
        this.DbNXlk = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        this.values = listDjBIcL;
        postInvalidate();
        this.fJNWhG = i;
        if (z) {
            copydefault(new Function0() { // from class: o.wUT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wUO.gEmmrt(this.KWHzl);
                }
            });
            return true;
        }
        this.AkhnZx = 1.0f;
        this.AYXKKw = 1.0f;
        OLrzqt();
        invalidate();
        return true;
    }

    public static final Unit gEmmrt(wUO wuo) throws java.io.IOException {
        animateExpansion$default(wuo, 1.0f, null, 2, null);
        wuo.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void copydefault(int i) throws java.io.IOException {
        if (i < -1 || i >= this.values.size()) {
            return;
        }
        int i2 = this.fJNWhG;
        if (i == i2) {
            AEQbTJ(0.0f, new Function0() { // from class: o.wUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wUO.AEQbTJ(this.copydefault);
                }
            });
            return;
        }
        if (i2 != -1) {
            this.AYXKKw = 0.0f;
        }
        this.fJNWhG = i;
        if (i != -1) {
            animateExpansion$default(this, 1.0f, null, 2, null);
        } else {
            animateExpansion$default(this, 0.0f, null, 2, null);
        }
        OLrzqt();
        invalidate();
    }

    public static final Unit AEQbTJ(wUO wuo) throws java.io.IOException {
        wuo.fJNWhG = -1;
        wuo.OLrzqt();
        wuo.invalidate();
        return Unit.INSTANCE;
    }

    public final void copydefault(Function0<Unit> function0) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.wUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                wUO.EZpvd(this.EZpvd, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Fragment(function0));
        valueAnimatorOfFloat.start();
    }

    public static final void EZpvd(wUO wuo, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        wuo.AkhnZx = ((java.lang.Float) animatedValue).floatValue();
        wuo.invalidate();
    }

    public static final class Fragment implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Fragment(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            wUO wuo = wUO.this;
            final Function0<Unit> function0 = this.copydefault;
            wuo.post(new java.lang.Runnable() { // from class: o.wUZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    wUO.Fragment.copydefault(function0);
                }
            });
        }

        public static final void copydefault(Function0 function0) {
            function0.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.AuCTel.measure(0, 0);
        int measuredWidth = this.AuCTel.getMeasuredWidth();
        int measuredHeight = this.AuCTel.getMeasuredHeight();
        android.widget.TextView textView = this.AuCTel;
        float f = this.OLrzqt;
        float f2 = measuredWidth / 2;
        float f3 = this.AEQbTJ;
        float f4 = measuredHeight / 2;
        textView.layout((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        android.animation.ValueAnimator valueAnimator = this.djBIcL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public static final class StateListAnimator {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, float f, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                str2 = stateListAnimator.EZpvd;
            }
            if ((i & 8) != 0) {
                num = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.KWHzl(f, str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(float f, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(f, str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return java.lang.Float.compare(this.OLrzqt, stateListAnimator.OLrzqt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Float.hashCode(this.OLrzqt);
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.EZpvd.hashCode();
            java.lang.Integer num = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SegmentData(angle=" + this.OLrzqt + ", label=" + this.KWHzl + ", ratioStr=" + this.EZpvd + ", color=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(float f, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = f;
            this.KWHzl = str;
            this.EZpvd = str2;
            this.AEQbTJ = num;
        }
    }

    public static final class TaskDescription implements InterfaceC52756wXe {
        public final java.lang.String EZpvd;
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> KWHzl;
        public final java.lang.Integer OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.Pair), (r2v0 java.lang.String), (r3v0 java.lang.Integer) A[MD:(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, java.lang.String, java.lang.Integer):void (m)] call: o.wUO.TaskDescription.<init>(kotlin.Pair, java.lang.String, java.lang.Integer):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(kotlin.Pair pair, java.lang.String str, @androidx.annotation.ColorInt java.lang.Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(pair, str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wUO$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-XnBNQ_w$default, reason: not valid java name */
        public static /* synthetic */ TaskDescription m8785copyXnBNQ_w$default(TaskDescription taskDescription, kotlin.Pair pair, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pair = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                num = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(pair, str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC52756wXe
        public java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, @NotNull java.lang.String str, @androidx.annotation.ColorInt java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(pair, str, num, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC52756wXe
        public java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return uLP.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iEZpvd = uLP.EZpvd(this.KWHzl);
            int iHashCode = this.EZpvd.hashCode();
            java.lang.Integer num = this.OLrzqt;
            return (((iEZpvd * 31) + iHashCode) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Data(ratio=" + uLP.gEmmrt(this.KWHzl) + ", label=" + this.EZpvd + ", color=" + this.OLrzqt + ")";
        }

        public TaskDescription(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, java.lang.String str, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = pair;
            this.EZpvd = str;
            this.OLrzqt = num;
        }

        @Override // o.InterfaceC52756wXe
        public BigDecimal KWHzl() {
            return C33129mqd.EZpvd(uLP.KWHzl(this.KWHzl));
        }
    }
}
