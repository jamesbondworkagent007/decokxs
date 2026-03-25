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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46500tWq;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46500tWq extends android.view.ViewGroup {
    public float AYXKKw;
    public final float AhwBna;
    public RectF AkhnZx;
    public int AuCTel;
    public java.util.List<? extends InterfaceC46504tWu> DbNXlk;
    public final android.graphics.Paint KWHzl;
    public float OLrzqt;
    public float copydefault;
    public final android.view.GestureDetector djBIcL;
    public final android.widget.TextView fARcdN;
    public float fJNWhG;
    public float fetchVPNInfo;
    public final float gEmmrt;
    public java.util.List<C46501tWr> isConnected;
    public android.animation.ValueAnimator valueOf;
    public float values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final int[] AEQbTJ = {Color.parseColor("#64D33D"), Color.parseColor("#8A91FF"), Color.parseColor("#B3B3B3"), Color.parseColor("#BCFF2F"), Color.parseColor("#FF7888"), Color.parseColor("#FFB117"), Color.parseColor("#FF7888"), Color.parseColor("#8A91FF"), Color.parseColor("#49A92D"), Color.parseColor("#BDBDBD")};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46500tWq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46500tWq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:41) call: o.tWq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46500tWq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46500tWq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.KWHzl = paint;
        this.AkhnZx = new RectF();
        this.DbNXlk = yDY.AhwBna();
        this.isConnected = new java.util.ArrayList();
        this.AuCTel = -1;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        this.fARcdN = textView;
        this.AhwBna = C55298xhM.EZpvd(6.0f, context);
        this.gEmmrt = C55298xhM.EZpvd(12.0f, context);
        setWillNotDraw(false);
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        textView.setGravity(17);
        this.djBIcL = new android.view.GestureDetector(context, new Activity());
    }

    /* JADX INFO: renamed from: o.tWq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tWq.ActionBar.<init>():void type: THIS */
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
        if (this.DbNXlk.isEmpty()) {
            return;
        }
        copydefault(canvas);
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        float f;
        int size = this.DbNXlk.size();
        if (size == 0) {
            return;
        }
        float fCopydefault = C56548yJl.copydefault(360.0f - (size == 1 ? 0.0f : this.fJNWhG * size), 0.0f);
        float f2 = -90.0f;
        int i = 0;
        for (java.lang.Object obj : this.isConnected) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C46501tWr c46501tWr = (C46501tWr) obj;
            float fAEQbTJ = c46501tWr.AEQbTJ() * this.fetchVPNInfo * (fCopydefault / 360.0f);
            if (i == this.AuCTel) {
                float f3 = this.AhwBna;
                f = f3 + ((this.gEmmrt - f3) * this.AYXKKw);
            } else {
                f = this.AhwBna;
            }
            this.KWHzl.setStrokeWidth(f);
            this.KWHzl.setColor(c46501tWr.KWHzl());
            canvas.drawArc(this.AkhnZx, f2 + (this.fJNWhG / 2.0f), fAEQbTJ, false, this.KWHzl);
            f2 += fAEQbTJ + this.fJNWhG;
            i++;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.copydefault = i / 2.0f;
        this.OLrzqt = i2 / 2.0f;
        float fMin = (java.lang.Math.min(i, i2) / 2.0f) - (this.gEmmrt / 2.0f);
        this.values = fMin;
        RectF rectF = this.AkhnZx;
        float f = this.copydefault;
        float f2 = this.OLrzqt;
        rectF.set(f - fMin, f2 - fMin, f + fMin, f2 + fMin);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.fJNWhG = (float) ((((double) (C55298xhM.EZpvd(2.8f, context) * 4.0f)) / (((double) (this.values + (this.gEmmrt / 2.0f))) * 6.283185307179586d)) * ((double) 360.0f));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            return this.djBIcL.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.tWq$Activity */
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
            int iOLrzqt = C46500tWq.this.OLrzqt(motionEvent.getX(), motionEvent.getY());
            if (iOLrzqt != -1) {
                if (iOLrzqt == C46500tWq.this.AuCTel) {
                    final C46500tWq c46500tWq = C46500tWq.this;
                    c46500tWq.copydefault(0.0f, new Function0() { // from class: o.tWw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C46500tWq.Activity.OLrzqt(c46500tWq);
                        }
                    });
                } else {
                    if (C46500tWq.this.AuCTel != -1) {
                        C46500tWq.this.AYXKKw = 0.0f;
                    }
                    C46500tWq.this.AuCTel = iOLrzqt;
                    C46500tWq.animateExpansion$default(C46500tWq.this, 1.0f, null, 2, null);
                }
            } else if (C46500tWq.this.AuCTel != -1) {
                final C46500tWq c46500tWq2 = C46500tWq.this;
                c46500tWq2.copydefault(0.0f, new Function0() { // from class: o.tWz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46500tWq.Activity.KWHzl(c46500tWq2);
                    }
                });
            }
            C46500tWq.this.EZpvd();
            C46500tWq.this.invalidate();
            return true;
        }

        public static final Unit OLrzqt(C46500tWq c46500tWq) throws java.io.IOException {
            c46500tWq.AuCTel = -1;
            c46500tWq.EZpvd();
            c46500tWq.invalidate();
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C46500tWq c46500tWq) throws java.io.IOException {
            c46500tWq.AuCTel = -1;
            c46500tWq.EZpvd();
            c46500tWq.invalidate();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tWq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateExpansion$default(C46500tWq c46500tWq, float f, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c46500tWq.copydefault(f, function0);
    }

    public final void copydefault(float f, Function0<Unit> function0) {
        android.animation.ValueAnimator valueAnimator = this.valueOf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.AYXKKw, f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C46500tWq.KWHzl(this.copydefault, valueAnimator2);
            }
        });
        if (function0 != null) {
            valueAnimatorOfFloat.addListener(new TaskDescription(function0));
        }
        valueAnimatorOfFloat.start();
        this.valueOf = valueAnimatorOfFloat;
    }

    public static final void KWHzl(C46500tWq c46500tWq, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c46500tWq.AYXKKw = ((java.lang.Float) animatedValue).floatValue();
        c46500tWq.invalidate();
    }

    /* JADX INFO: renamed from: o.tWq$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> KWHzl;

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

        public TaskDescription(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.KWHzl.invoke();
        }
    }

    public final int OLrzqt(float f, float f2) {
        float fMin = java.lang.Math.min(getWidth(), getHeight()) / 2.0f;
        int i = 0;
        new Region(0, 0, getWidth(), getHeight());
        float f3 = f - this.copydefault;
        float f4 = f2 - this.OLrzqt;
        int size = this.DbNXlk.size();
        if (size == 0) {
            return -1;
        }
        float f5 = this.fJNWhG;
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
        for (java.lang.Object obj : this.isConnected) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            float fAEQbTJ = ((C46501tWr) obj).AEQbTJ() * ((360.0f - (f5 * f6)) / 360.0f);
            float f8 = this.fJNWhG / 2.0f;
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
                if (degrees >= f11 && degrees <= f12) {
                    return i;
                }
                f7 += fAEQbTJ + this.fJNWhG;
                i++;
            } else {
                if (degrees >= f11 || degrees <= f12) {
                    return i;
                }
                f7 += fAEQbTJ + this.fJNWhG;
                i++;
            }
        }
        return -1;
    }

    public final void EZpvd() throws java.io.IOException {
        java.lang.String strOLrzqt;
        int i = this.AuCTel;
        java.lang.String iCUPercent$default = null;
        if (i != -1) {
            C46501tWr c46501tWr = (C46501tWr) CollectionsKt___CollectionsKt.AkhnZx(this.isConnected, i);
            strOLrzqt = c46501tWr != null ? c46501tWr.OLrzqt() : null;
        } else {
            strOLrzqt = C33070mpX.OLrzqt(C47501trL.Fragment.sIqKDg, java.lang.Float.valueOf(this.OLrzqt));
        }
        int i2 = this.AuCTel;
        if (i2 != -1) {
            C46501tWr c46501tWr2 = (C46501tWr) CollectionsKt___CollectionsKt.AkhnZx(this.isConnected, i2);
            if (c46501tWr2 != null) {
                iCUPercent$default = c46501tWr2.copydefault();
            }
        } else {
            iCUPercent$default = pTB.formatICUPercent$default(java.lang.Float.valueOf(100.0f), RoundingMode.UP, C38307pTy.Companion.EZpvd(2), null, null, null, 28, null);
        }
        android.widget.TextView textView = this.fARcdN;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.QOLQEE);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) strOLrzqt).append('\n');
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
        android.text.style.TextAppearanceSpan textAppearanceSpan2 = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.uzCIH);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) iCUPercent$default);
        spannableStringBuilder.setSpan(textAppearanceSpan2, length2, spannableStringBuilder.length(), 17);
        textView.setText(new android.text.SpannedString(spannableStringBuilder));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tWq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean setData$default(C46500tWq c46500tWq, java.util.List list, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return c46500tWq.EZpvd((java.util.List<? extends InterfaceC46504tWu>) list, z, (Function1<? super java.util.List<C46501tWr>, Unit>) function1);
    }

    public final boolean EZpvd(@NotNull java.util.List<? extends InterfaceC46504tWu> list, boolean z, Function1<? super java.util.List<C46501tWr>, Unit> function1) {
        java.util.List<? extends InterfaceC46504tWu> listDjBIcL = list;
        Intrinsics.checkNotNullParameter(listDjBIcL, "");
        int i = 0;
        if (list.isEmpty()) {
            return false;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((InterfaceC46504tWu) it.next()).OLrzqt());
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
                bigDecimalValueOf2 = bigDecimalValueOf2.add(((InterfaceC46504tWu) it2.next()).OLrzqt());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
            }
            BigDecimal bigDecimalDivide = bigDecimalValueOf2.divide(bigDecimalValueOf, MathContext.DECIMAL32);
            Intrinsics.copydefault(bigDecimalDivide);
            listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) C56402yEa.EZpvd(new C46493tWj(bigDecimalDivide, C33070mpX.OLrzqt(C47501trL.Fragment.RbVjfb, getContext()))));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        float f = 0.0f;
        for (java.lang.Object obj : listDjBIcL) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC46504tWu interfaceC46504tWu = (InterfaceC46504tWu) obj;
            float fDjBIcL = C33129mqd.djBIcL(interfaceC46504tWu.OLrzqt()) * 360.0f;
            f += fDjBIcL;
            float f2 = 360.0f - f;
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(interfaceC46504tWu.OLrzqt(), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(100.0d), null, 20, null);
            if (i != yDY.AuCTel(listDjBIcL)) {
                f2 = 0.0f;
            }
            java.lang.String strAEQbTJ = interfaceC46504tWu.AEQbTJ();
            int[] iArr = AEQbTJ;
            arrayList.add(new C46501tWr(fDjBIcL + f2, strAEQbTJ, iCUPercent$default, iArr[i % iArr.length]));
            i++;
        }
        java.util.List<C46501tWr> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        this.isConnected = listFJNWhG;
        if (function1 != null) {
            function1.invoke(listFJNWhG);
        }
        this.DbNXlk = listDjBIcL;
        postInvalidate();
        if (!z) {
            return true;
        }
        EZpvd(new Function0() { // from class: o.tWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46500tWq.KWHzl(this.KWHzl);
            }
        });
        return true;
    }

    public static final Unit KWHzl(C46500tWq c46500tWq) throws java.io.IOException {
        c46500tWq.EZpvd();
        return Unit.INSTANCE;
    }

    public final void EZpvd(Function0<Unit> function0) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C46500tWq.AEQbTJ(this.KWHzl, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new StateListAnimator(function0));
        valueAnimatorOfFloat.start();
    }

    public static final void AEQbTJ(C46500tWq c46500tWq, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c46500tWq.fetchVPNInfo = ((java.lang.Float) animatedValue).floatValue();
        c46500tWq.invalidate();
    }

    /* JADX INFO: renamed from: o.tWq$StateListAnimator */
    public static final class StateListAnimator implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

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

        public StateListAnimator(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.fARcdN.measure(0, 0);
        int measuredWidth = this.fARcdN.getMeasuredWidth();
        int measuredHeight = this.fARcdN.getMeasuredHeight();
        android.widget.TextView textView = this.fARcdN;
        float f = this.copydefault;
        float f2 = measuredWidth / 2;
        float f3 = this.OLrzqt;
        float f4 = measuredHeight / 2;
        textView.layout((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        android.animation.ValueAnimator valueAnimator = this.valueOf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }
}
