package o;

import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mUA extends android.widget.LinearLayout {
    public final float AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public boolean EZpvd;
    public final C36068oOb KWHzl;
    public float OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mUA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.copydefault = true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.mUA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ mUA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mUA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(32.0f, null, 1, null);
        C36068oOb c36068oObOLrzqt = C36068oOb.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36068oObOLrzqt, "");
        this.KWHzl = c36068oObOLrzqt;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.mUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mUA.EZpvd(this.EZpvd);
            }
        });
    }

    public final AppCompatImageView AEQbTJ() {
        AppCompatImageView appCompatImageView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    public final java.util.List<android.view.View> KWHzl() {
        C36068oOb c36068oOb = this.KWHzl;
        return yDY.gEmmrt(c36068oOb.gEmmrt, c36068oOb.EZpvd);
    }

    public final void setTitleAndContract(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C36068oOb c36068oOb = this.KWHzl;
        c36068oOb.djBIcL.setText(mUO.formatAddress$default(str2, 6, 4, null, 4, null));
        c36068oOb.fetchVPNInfo.setText(str);
    }

    public final void setShowTokenAddress(boolean z) {
        LinearLayoutCompat linearLayoutCompat = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        boolean z2 = !z;
        linearLayoutCompat2.setVisibility(z2 ? 0 : 8);
        this.copydefault = z;
        this.EZpvd = z2;
    }

    public final void setCoinChainCoinImageUrl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.KWHzl.EZpvd(str2);
        this.KWHzl.KWHzl.copydefault(str);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.isConnected.setText(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = C34663ngO.EZpvd(str, new Function1() { // from class: o.mUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mUA.EZpvd((java.lang.String) obj);
            }
        });
        if (strEZpvd.length() == 0) {
            strEZpvd = "--";
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = mUO.KWHzl(context, str);
        AppCompatTextView appCompatTextView = this.KWHzl.DbNXlk;
        appCompatTextView.setText(strEZpvd);
        appCompatTextView.setTextColor(iKWHzl);
    }

    public static final java.lang.String EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C32163mRv.formatPercentWithSymbol$default(str, false, 0, 2, null, null, 26, null);
    }

    private final android.animation.ValueAnimator AhwBna() {
        return (android.animation.ValueAnimator) this.AhwBna.getValue();
    }

    public static final android.animation.ValueAnimator EZpvd(final mUA mua) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                mUA.copydefault(this.AEQbTJ, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public static final void copydefault(mUA mua, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        mua.AEQbTJ(((java.lang.Float) animatedValue).floatValue());
    }

    public final void AEQbTJ(float f) {
        C36068oOb c36068oOb = this.KWHzl;
        LinearLayoutCompat linearLayoutCompat = c36068oOb.gEmmrt;
        float fKWHzl = C56548yJl.KWHzl(f * 2.5f, 0.0f, 1.0f);
        float f2 = 1;
        linearLayoutCompat.setAlpha(f2 - fKWHzl);
        linearLayoutCompat.setTranslationY(((-linearLayoutCompat.getHeight()) * fKWHzl) / 2);
        Intrinsics.copydefault(linearLayoutCompat);
        linearLayoutCompat.setVisibility(fKWHzl < 1.0f ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = c36068oOb.valueOf;
        float f3 = (f - 0.6f) * 2.5f;
        float fKWHzl2 = C56548yJl.KWHzl(f3, 0.0f, 1.0f);
        linearLayoutCompat2.setAlpha(fKWHzl2);
        linearLayoutCompat2.setTranslationY(linearLayoutCompat2.getHeight() * (f2 - fKWHzl2));
        Intrinsics.copydefault(linearLayoutCompat2);
        linearLayoutCompat2.setVisibility(f > 0.6f ? 0 : 8);
        AppCompatImageView appCompatImageView = c36068oOb.EZpvd;
        appCompatImageView.setAlpha(C56548yJl.KWHzl(f3, 0.0f, 1.0f));
        Intrinsics.copydefault(appCompatImageView);
        appCompatImageView.setVisibility(f > 0.6f ? 0 : 8);
    }

    public final void OLrzqt(int i) {
        if (this.copydefault && !this.EZpvd) {
            float fKWHzl = C56548yJl.KWHzl((i - this.AEQbTJ) / 100, 0.0f, 1.0f);
            if (java.lang.Math.abs(fKWHzl - this.OLrzqt) > 0.01f) {
                this.OLrzqt = fKWHzl;
                AhwBna().cancel();
                android.animation.ValueAnimator valueAnimatorAhwBna = AhwBna();
                float[] fArr = new float[2];
                java.lang.Object animatedValue = AhwBna().getAnimatedValue();
                java.lang.Float f = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
                fArr[0] = f != null ? f.floatValue() : this.OLrzqt;
                fArr[1] = fKWHzl;
                valueAnimatorAhwBna.setFloatValues(fArr);
                AhwBna().start();
            }
        }
    }

    public final void OLrzqt() {
        OLrzqt(C33129mqd.AhwBna(java.lang.Float.valueOf(this.AEQbTJ)) + 101);
        this.copydefault = false;
    }

    public final AppCompatImageView EZpvd() {
        AppCompatImageView appCompatImageView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }
}
