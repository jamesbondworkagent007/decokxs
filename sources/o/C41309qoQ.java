package o;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C41375qpd;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.qoQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41309qoQ extends C40499qYc {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.CharSequence AhwBna;
    public boolean AkhnZx;
    public int DbNXlk;
    public kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> EZpvd;
    public final C42864reU KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String djBIcL;
    public float fARcdN;
    public kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public float fetchVPNInfo;
    public kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> gEmmrt;
    public float isConnected;
    public java.lang.CharSequence valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41309qoQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41309qoQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:49) call: o.qoQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41309qoQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41309qoQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42864reU c42864reUKWHzl = C42864reU.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42864reUKWHzl, "");
        this.KWHzl = c42864reUKWHzl;
        this.djBIcL = "";
        this.AhwBna = "";
        this.valueOf = "";
        this.AYXKKw = "";
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.qpb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C41309qoQ.AEQbTJ(this.EZpvd));
            }
        });
    }

    /* JADX INFO: renamed from: o.qoQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qoQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final int valueOf() {
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> pair = this.gEmmrt;
        int iIntValue = pair != null ? pair.getSecond().intValue() : 0;
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> pair2 = this.fIwbmz;
        int iIntValue2 = pair2 != null ? pair2.getSecond().intValue() : 0;
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> pair3 = this.EZpvd;
        return iIntValue + iIntValue2 + (pair3 != null ? pair3.getSecond().intValue() : 0);
    }

    private final java.lang.String AEQbTJ() {
        return ((java.lang.Object) this.AhwBna) + " • " + ((java.lang.Object) this.valueOf);
    }

    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.fJNWhG.getValue()).booleanValue();
    }

    public static final boolean AEQbTJ(C41309qoQ c41309qoQ) {
        if (c41309qoQ.isInEditMode()) {
            return false;
        }
        return C41431qqg.OLrzqt(c41309qoQ);
    }

    public final void setData(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, @NotNull java.lang.CharSequence charSequence4, @NotNull UpDownColor upDownColor, boolean z, boolean z2, @NotNull java.lang.String str4, Function1<? super java.lang.String, Unit> function1) {
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> orCreateClickableIconSpan$OKMarket_market_impl$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.values = true;
        if (!Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) str) || !Intrinsics.EZpvd(this.AhwBna, charSequence) || !Intrinsics.EZpvd(this.valueOf, charSequence2) || !Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) charSequence3.toString())) {
            this.AkhnZx = true;
        }
        this.djBIcL = str;
        this.AhwBna = charSequence;
        this.valueOf = charSequence2;
        this.AYXKKw = charSequence3.toString();
        this.OLrzqt = str4;
        this.AEQbTJ = function1;
        if (isInEditMode()) {
            this.KWHzl.copydefault.setImageResource(C52761wXj.TaskDescription.aHXSQp);
            this.KWHzl.OLrzqt.setImageResource(C52761wXj.TaskDescription.fERRXa);
        } else {
            AppCompatImageView appCompatImageView = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.loadBorderImage$default(appCompatImageView, str2 == null ? "" : str2, C52761wXj.TaskDescription.aHXSQp, 0.0f, 0, 8, (java.lang.Object) null);
            AppCompatImageView appCompatImageView2 = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C57659ymb.loadBorderImage$default(appCompatImageView2, str3 == null ? "" : str3, C52761wXj.TaskDescription.fERRXa, 0.0f, 0, 8, (java.lang.Object) null);
        }
        this.KWHzl.AYXKKw.setText(charSequence3);
        this.KWHzl.KWHzl.setChangeRatioAndColor(charSequence4, upDownColor);
        C41375qpd.Activity activity = C41375qpd.Companion;
        boolean zKWHzl = KWHzl();
        java.util.List listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz));
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.gEmmrt = activity.OLrzqt(zKWHzl, listEZpvd, context, this, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> orCreateClickableIconSpan$OKMarket_market_impl$default2 = null;
        if (z) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            orCreateClickableIconSpan$OKMarket_market_impl$default = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, new C42991rgp(context2, null, 0, 6, null), null, 2, null);
        } else {
            orCreateClickableIconSpan$OKMarket_market_impl$default = null;
        }
        this.fIwbmz = orCreateClickableIconSpan$OKMarket_market_impl$default;
        if (z2 && C27563jxZ.OLrzqt.EZpvd()) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C42979rgd c42979rgd = new C42979rgd(context3, null, 0, 6, null);
            c42979rgd.setBoostTag(str4, java.lang.Boolean.TRUE);
            orCreateClickableIconSpan$OKMarket_market_impl$default2 = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, c42979rgd, null, 2, null);
        }
        this.EZpvd = orCreateClickableIconSpan$OKMarket_market_impl$default2;
        if (this.AkhnZx) {
            this.isConnected = 0.0f;
            this.fetchVPNInfo = 0.0f;
            requestLayout();
        }
    }

    private final float djBIcL() {
        if (this.isConnected == 0.0f) {
            this.KWHzl.valueOf.setTextSize(2, 15.0f);
            this.isConnected = this.KWHzl.valueOf.getPaint().measureText(this.djBIcL + " ") + valueOf();
        }
        return this.isConnected;
    }

    private final float AYXKKw() {
        if (this.fetchVPNInfo == 0.0f) {
            this.KWHzl.EZpvd.setTextSize(2, 12.0f);
            this.fetchVPNInfo = this.KWHzl.EZpvd.getPaint().measureText(AEQbTJ());
        }
        return this.fetchVPNInfo;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.values) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.DbNXlk != size) {
            this.DbNXlk = size;
            this.AkhnZx = true;
        }
        if (this.AkhnZx) {
            OLrzqt();
            boolean zCopydefault = copydefault();
            boolean zEZpvd = EZpvd();
            if (!zEZpvd && !zCopydefault) {
                EZpvd(false);
                AEQbTJ(true);
            } else if (zEZpvd && !zCopydefault) {
                EZpvd(false);
                AEQbTJ(true);
            } else if (!zEZpvd && zCopydefault) {
                EZpvd(true);
                AEQbTJ(false);
            } else {
                EZpvd(false);
                AEQbTJ(false);
            }
            this.AkhnZx = false;
        }
        super.onMeasure(i, i2);
    }

    public final boolean EZpvd() {
        if (djBIcL() > this.fARcdN) {
            for (float f = 15.0f; f >= 12.0f; f -= 1.0f) {
                this.KWHzl.valueOf.setTextSize(2, f);
                if (this.KWHzl.valueOf.getPaint().measureText(this.djBIcL + " ") + valueOf() > this.fARcdN) {
                }
            }
            return false;
        }
        this.KWHzl.valueOf.setTextSize(2, 15.0f);
        return true;
    }

    public final boolean copydefault() {
        if (AYXKKw() > this.fARcdN) {
            for (float f = 12.0f; f >= 10.0f; f -= 1.0f) {
                this.KWHzl.EZpvd.setTextSize(2, f);
                if (this.KWHzl.EZpvd.getPaint().measureText(AEQbTJ()) > this.fARcdN) {
                }
            }
            return false;
        }
        this.KWHzl.EZpvd.setTextSize(2, 12.0f);
        return true;
    }

    public final void EZpvd(boolean z) {
        java.lang.String str;
        java.lang.CharSequence charSequence;
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> pair = this.gEmmrt;
        final android.text.style.ReplacementSpan first = pair != null ? pair.getFirst() : null;
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> pair2 = this.fIwbmz;
        final android.text.style.ReplacementSpan first2 = pair2 != null ? pair2.getFirst() : null;
        kotlin.Pair<? extends android.text.style.ReplacementSpan, java.lang.Integer> pair3 = this.EZpvd;
        final android.text.style.ReplacementSpan first3 = pair3 != null ? pair3.getFirst() : null;
        AppCompatTextView appCompatTextView = this.KWHzl.valueOf;
        if (first == null && first2 == null && first3 == null) {
            charSequence = this.djBIcL;
        } else {
            java.lang.String str2 = first2 != null ? "-" : "";
            java.lang.String str3 = first3 != null ? Marker.ANY_NON_NULL_MARKER : "";
            if (z) {
                str = this.djBIcL + "\ntag" + str2 + str3;
            } else {
                str = this.djBIcL + " tag" + str2 + str3;
            }
            MatchPattern matchPattern = MatchPattern.LAST_ONLY;
            charSequence = C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{"tag"}, 0, matchPattern, false, new Function1() { // from class: o.qoV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41309qoQ.KWHzl(first, (java.util.List) obj);
                }
            }, 10, null), new java.lang.String[]{Marker.ANY_NON_NULL_MARKER}, 0, matchPattern, false, new Function1() { // from class: o.qoU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41309qoQ.OLrzqt(first3, (java.util.List) obj);
                }
            }, 10, null), new java.lang.String[]{"-"}, 0, matchPattern, false, new Function1() { // from class: o.qoX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41309qoQ.djBIcL(first2, (java.util.List) obj);
                }
            }, 10, null);
        }
        appCompatTextView.setText(charSequence);
        if (isRtl()) {
            this.KWHzl.valueOf.requestLayout();
        }
        if ((first2 instanceof C40547qZx) || (first3 instanceof C40547qZx)) {
            this.KWHzl.valueOf.post(new java.lang.Runnable() { // from class: o.qoY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C41309qoQ.OLrzqt(this.EZpvd, first2, first3);
                }
            });
        }
    }

    public static final Unit KWHzl(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final C41309qoQ c41309qoQ, final android.text.style.ReplacementSpan replacementSpan, final android.text.style.ReplacementSpan replacementSpan2) {
        AppCompatTextView appCompatTextView = c41309qoQ.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C41426qqb.copydefault(appCompatTextView, new Function1() { // from class: o.qoW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41309qoQ.KWHzl(replacementSpan, replacementSpan2, c41309qoQ, (C40547qZx) obj);
            }
        });
    }

    public static final Unit KWHzl(android.text.style.ReplacementSpan replacementSpan, android.text.style.ReplacementSpan replacementSpan2, C41309qoQ c41309qoQ, C40547qZx c40547qZx) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(c40547qZx, "");
        C46731tch c46731tchOLrzqt = C46731tch.Companion.OLrzqt(java.lang.Boolean.valueOf(replacementSpan != null), java.lang.Boolean.valueOf(replacementSpan2 != null), c41309qoQ.OLrzqt);
        c46731tchOLrzqt.OLrzqt(c41309qoQ.AEQbTJ);
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c41309qoQ);
        FragmentActivity fragmentActivity = activityKWHzl instanceof FragmentActivity ? (FragmentActivity) activityKWHzl : null;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            c46731tchOLrzqt.show(supportFragmentManager);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        java.lang.String strAEQbTJ;
        AppCompatTextView appCompatTextView = this.KWHzl.EZpvd;
        if (isRtl()) {
            java.lang.CharSequence charSequenceUnicodeWrap = androidx.core.text.BidiFormatter.getInstance().unicodeWrap(this.AhwBna);
            java.lang.CharSequence charSequenceUnicodeWrap2 = androidx.core.text.BidiFormatter.getInstance().unicodeWrap(this.valueOf);
            if (z) {
                strAEQbTJ = ((java.lang.Object) charSequenceUnicodeWrap2) + " •\n" + ((java.lang.Object) charSequenceUnicodeWrap);
            } else {
                strAEQbTJ = ((java.lang.Object) charSequenceUnicodeWrap2) + " • " + ((java.lang.Object) charSequenceUnicodeWrap);
            }
        } else if (z) {
            strAEQbTJ = ((java.lang.Object) this.AhwBna) + " •\n" + ((java.lang.Object) this.valueOf);
        } else {
            strAEQbTJ = AEQbTJ();
        }
        appCompatTextView.setText(strAEQbTJ);
        AppCompatTextView appCompatTextView2 = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i = z ? 2 : 4;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.OLrzqt(i, context);
            appCompatTextView2.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final float OLrzqt() {
        float fMax = java.lang.Math.max(djBIcL(), AYXKKw());
        int i = this.DbNXlk;
        AppCompatImageView appCompatImageView = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        int marginStart = KWHzl(appCompatImageView).getMarginStart();
        AppCompatImageView appCompatImageView2 = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        int i2 = KWHzl(appCompatImageView2).width;
        AppCompatTextView appCompatTextView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        int marginStart2 = KWHzl(appCompatTextView).getMarginStart();
        AppCompatTextView appCompatTextView2 = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        int marginEnd = KWHzl(appCompatTextView2).getMarginEnd();
        C41312qoT c41312qoT = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c41312qoT, "");
        int marginEnd2 = KWHzl(c41312qoT).getMarginEnd();
        C41312qoT c41312qoT2 = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c41312qoT2, "");
        int i3 = KWHzl(c41312qoT2).width;
        AppCompatTextView appCompatTextView3 = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        int marginEnd3 = ((((((i - marginStart) - i2) - marginStart2) - marginEnd) - marginEnd2) - i3) - KWHzl(appCompatTextView3).getMarginEnd();
        float fMeasureText = 0.0f;
        for (float f = 15.0f; f >= 12.0f; f -= 1.0f) {
            this.KWHzl.AYXKKw.setTextSize(2, f);
            fMeasureText = this.KWHzl.AYXKKw.getPaint().measureText(this.AYXKKw);
            if (fMeasureText + fMax < marginEnd3) {
                break;
            }
        }
        float f2 = marginEnd3 - fMeasureText;
        this.fARcdN = f2;
        return f2;
    }

    public final ViewGroup.MarginLayoutParams KWHzl(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        return (ConstraintLayout.LayoutParams) layoutParams;
    }

    @Override // o.C40499qYc, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            KWHzl(canvas);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        canvas.drawRect(this.KWHzl.EZpvd.getLeft() + 0.0f, 0.0f, this.KWHzl.EZpvd.getLeft() + this.fARcdN, getHeight() + 0.0f, C40504qYh.KWHzl((qXQ) this));
        float left = this.KWHzl.valueOf.getLeft();
        float top = this.KWHzl.valueOf.getTop() + this.KWHzl.valueOf.getHeight();
        float left2 = this.KWHzl.valueOf.getLeft();
        canvas.drawLine(left + 0.0f, top + 0.0f, djBIcL() + left2, this.KWHzl.valueOf.getTop() + this.KWHzl.valueOf.getHeight() + 0.0f, C40504qYh.KWHzl((qXQ) this));
        float left3 = this.KWHzl.EZpvd.getLeft();
        float top2 = this.KWHzl.EZpvd.getTop() + this.KWHzl.EZpvd.getHeight();
        float left4 = this.KWHzl.EZpvd.getLeft();
        canvas.drawLine(left3 + 0.0f, top2 + 0.0f, AYXKKw() + left4, this.KWHzl.EZpvd.getTop() + this.KWHzl.EZpvd.getHeight() + 0.0f, C40504qYh.KWHzl((qXQ) this));
        AppCompatTextView appCompatTextView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        float fCopydefault = copydefault(appCompatTextView, "N", canvas, 0.0f);
        AppCompatTextView appCompatTextView2 = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        float fCopydefault2 = copydefault(appCompatTextView2, "D", canvas, fCopydefault);
        AppCompatTextView appCompatTextView3 = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        copydefault(appCompatTextView3, "P", canvas, fCopydefault2);
    }

    public static final float copydefault(android.widget.TextView textView, java.lang.String str, android.graphics.Canvas canvas, float f) {
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        float f2 = fontMetrics.bottom;
        float f3 = fontMetrics.top;
        float f4 = (f2 - f3) + f;
        canvas.drawText(str + ": " + C55298xhM.px2sp$default(textView.getTextSize(), (android.content.Context) null, 1, (java.lang.Object) null), 10.0f, f4, textView.getPaint());
        return f4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ = null;
    }
}
