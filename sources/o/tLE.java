package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import com.okinc.planet.biz_userprofile.data.PlanetBioContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tLE extends ConstraintLayout {
    public final C46319tPy AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public int KWHzl;
    public android.animation.ValueAnimator OLrzqt;
    public PlanetBioContent copydefault;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.tLE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tLE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tLE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = 3;
        this.copydefault = PlanetBioContent.Companion.OLrzqt();
        this.gEmmrt = true;
        C46319tPy c46319tPyKWHzl = C46319tPy.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c46319tPyKWHzl, "");
        this.AEQbTJ = c46319tPyKWHzl;
        final GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, new ActionBar());
        c46319tPyKWHzl.OLrzqt.setOnTouchListener(new View.OnTouchListener() { // from class: o.tLF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return tLE.copydefault(gestureDetectorCompat, view, motionEvent);
            }
        });
    }

    public static final class Activity implements View.OnLayoutChangeListener {
        public Activity() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            tLE.this.KWHzl();
        }
    }

    public static final class StateListAnimator implements View.OnLayoutChangeListener {
        public final /* synthetic */ C46319tPy AEQbTJ;

        public StateListAnimator(C46319tPy c46319tPy) {
            this.AEQbTJ = c46319tPy;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            tLE tle = tLE.this;
            tLB tlb = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(tlb, "");
            tle.KWHzl = tle.AEQbTJ(tlb).setMaxLines(Integer.MAX_VALUE).setEllipsize(null).build().getHeight();
            tLE tle2 = tLE.this;
            tLB tlb2 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(tlb2, "");
            tle2.EZpvd = tle2.AEQbTJ(tlb2).setMaxLines(3).setEllipsize(TextUtils.TruncateAt.END).build().getHeight();
            tLE.this.KWHzl();
            boolean z = tLE.this.EZpvd != tLE.this.KWHzl && tLE.this.gEmmrt;
            wYC wyc = tLE.this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(tLE.this.EZpvd == tLE.this.KWHzl ? 8 : 0);
            if (z) {
                this.AEQbTJ.OLrzqt.setMaxLines(tLE.this.AYXKKw);
                tLB tlb3 = this.AEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(tlb3, "");
                ViewGroup.LayoutParams layoutParams = tlb3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = tLE.this.EZpvd;
                    tlb3.setLayoutParams(layoutParams);
                    this.AEQbTJ.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                tLB tlb4 = this.AEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(tlb4, "");
                ViewGroup.LayoutParams layoutParams2 = tlb4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = tLE.this.KWHzl;
                    tlb4.setLayoutParams(layoutParams2);
                    this.AEQbTJ.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            this.AEQbTJ.OLrzqt.setTextIsSelectable(true);
        }
    }

    public static final class ActionBar extends GestureDetector.SimpleOnGestureListener {
        public ActionBar() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (tLE.this.KWHzl == tLE.this.EZpvd) {
                return false;
            }
            tLE.this.copydefault();
            return true;
        }
    }

    public static final boolean copydefault(GestureDetectorCompat gestureDetectorCompat, android.view.View view, android.view.MotionEvent motionEvent) {
        gestureDetectorCompat.onTouchEvent(motionEvent);
        return false;
    }

    public final java.lang.String EZpvd() {
        return this.copydefault.OLrzqt();
    }

    public final void setBio(@NotNull PlanetBioContent planetBioContent) {
        Intrinsics.checkNotNullParameter(planetBioContent, "");
        if (planetBioContent.copydefault().length() != 0) {
            if (Intrinsics.EZpvd(this.copydefault, planetBioContent)) {
                return;
            }
            this.copydefault = planetBioContent;
            AEQbTJ(planetBioContent.copydefault());
            C46319tPy c46319tPy = this.AEQbTJ;
            tUE tue = c46319tPy.EZpvd;
            Intrinsics.checkNotNullExpressionValue(tue, "");
            tue.setVisibility(this.copydefault.KWHzl() ? 0 : 8);
            if (this.copydefault.KWHzl()) {
                c46319tPy.EZpvd.setText(OLrzqt());
                tUE tue2 = c46319tPy.EZpvd;
                tue2.setOnClickListener(new TaskDescription(tue2, 300L, tue2, this));
                return;
            }
            return;
        }
        setVisibility(8);
    }

    private final java.lang.String OLrzqt() {
        if (this.copydefault.djBIcL()) {
            return C33070mpX.OLrzqt(C47501trL.Fragment.invokespecialaKhcqp, getContext());
        }
        return C33070mpX.OLrzqt(C47501trL.Fragment.invokespecialROgMPW, getContext());
    }

    public final void AEQbTJ() {
        C46319tPy c46319tPy = this.AEQbTJ;
        AEQbTJ(this.copydefault.AEQbTJ());
        c46319tPy.EZpvd.setText(OLrzqt());
        if (this.copydefault.djBIcL() || !this.gEmmrt) {
            return;
        }
        copydefault();
    }

    public final void AEQbTJ(java.lang.String str) {
        C46319tPy c46319tPy = this.AEQbTJ;
        c46319tPy.OLrzqt.setText(str);
        tLB tlb = c46319tPy.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(tlb, "");
        if (ViewCompat.isLaidOut(tlb) && !tlb.isLayoutRequested()) {
            tLB tlb2 = c46319tPy.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(tlb2, "");
            this.KWHzl = AEQbTJ(tlb2).setMaxLines(Integer.MAX_VALUE).setEllipsize(null).build().getHeight();
            tLB tlb3 = c46319tPy.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(tlb3, "");
            this.EZpvd = AEQbTJ(tlb3).setMaxLines(3).setEllipsize(TextUtils.TruncateAt.END).build().getHeight();
            KWHzl();
            boolean z = this.EZpvd != this.KWHzl && this.gEmmrt;
            wYC wyc = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(this.EZpvd == this.KWHzl ? 8 : 0);
            if (z) {
                c46319tPy.OLrzqt.setMaxLines(this.AYXKKw);
                tLB tlb4 = c46319tPy.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(tlb4, "");
                ViewGroup.LayoutParams layoutParams = tlb4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.EZpvd;
                    tlb4.setLayoutParams(layoutParams);
                    c46319tPy.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                tLB tlb5 = c46319tPy.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(tlb5, "");
                ViewGroup.LayoutParams layoutParams2 = tlb5.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = this.KWHzl;
                    tlb5.setLayoutParams(layoutParams2);
                    c46319tPy.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            c46319tPy.OLrzqt.setTextIsSelectable(true);
            return;
        }
        tlb.addOnLayoutChangeListener(new StateListAnimator(c46319tPy));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tLE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, android.view.View view2, tLE tle) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = view2;
            this.EZpvd = tle;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ();
            }
        }
    }

    public final void copydefault() {
        int i;
        C46319tPy c46319tPy = this.AEQbTJ;
        c46319tPy.OLrzqt.setText(this.copydefault.OLrzqt());
        if (this.gEmmrt) {
            c46319tPy.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            c46319tPy.OLrzqt.setMaxLines(Integer.MAX_VALUE);
            i = this.KWHzl;
        } else {
            c46319tPy.OLrzqt.setMaxLines(this.AYXKKw);
            tLB tlb = c46319tPy.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(tlb, "");
            if (ViewCompat.isLaidOut(tlb) && !tlb.isLayoutRequested()) {
                KWHzl();
            } else {
                tlb.addOnLayoutChangeListener(new Activity());
            }
            c46319tPy.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            i = this.EZpvd;
        }
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(c46319tPy.OLrzqt.getMeasuredHeight(), i);
        valueAnimatorOfInt.setDuration(240L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tLG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                tLE.AEQbTJ(valueAnimatorOfInt, this, valueAnimator2);
            }
        });
        valueAnimatorOfInt.start();
        this.OLrzqt = valueAnimatorOfInt;
        this.gEmmrt = !this.gEmmrt;
    }

    public static final void AEQbTJ(android.animation.ValueAnimator valueAnimator, tLE tle, android.animation.ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = tle.AEQbTJ.OLrzqt.getLayoutParams();
        layoutParams.height = iIntValue;
        tle.AEQbTJ.OLrzqt.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void KWHzl() {
        java.lang.CharSequence text;
        java.lang.String string;
        this.AEQbTJ.OLrzqt.setTextIsSelectable(false);
        android.text.Layout layout = this.AEQbTJ.OLrzqt.getLayout();
        if (layout == null || (text = layout.getText()) == null || (string = text.toString()) == null) {
            return;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) string, (char) 8230, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default != -1) {
            string = string.subSequence(0, iIndexOf$default + 1).toString();
        }
        this.AEQbTJ.OLrzqt.setText(string);
        this.AEQbTJ.OLrzqt.setTextIsSelectable(true);
    }

    public final StaticLayout.Builder AEQbTJ(AppCompatTextView appCompatTextView) throws java.io.IOException {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) this.copydefault.OLrzqt(), new java.lang.String[]{"\n"}, false, 0, 6, (java.lang.Object) null);
        int i = 0;
        for (java.lang.Object obj : listSplit$default) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (i != yDY.AuCTel(listSplit$default)) {
                spannableStringBuilder.append((java.lang.CharSequence) str).append('\n');
            } else {
                spannableStringBuilder.append((java.lang.CharSequence) str);
            }
            i++;
        }
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        StaticLayout.Builder breakStrategy = StaticLayout.Builder.obtain(spannedString, 0, spannedString.length(), appCompatTextView.getPaint(), (appCompatTextView.getWidth() - appCompatTextView.getPaddingEnd()) - appCompatTextView.getPaddingStart()).setText(spannedString).setIncludePad(appCompatTextView.getIncludeFontPadding()).setLineSpacing(appCompatTextView.getLineSpacingExtra(), appCompatTextView.getLineSpacingMultiplier()).setBreakStrategy(appCompatTextView.getBreakStrategy());
        Intrinsics.checkNotNullExpressionValue(breakStrategy, "");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            breakStrategy.setJustificationMode(appCompatTextView.getJustificationMode());
        }
        if (i2 >= 28) {
            breakStrategy.setUseLineSpacingFromFallbacks(true);
        }
        if (i2 >= 29) {
            breakStrategy.setTextDirection(appCompatTextView.getTextDirectionHeuristic());
        }
        return breakStrategy;
    }
}
