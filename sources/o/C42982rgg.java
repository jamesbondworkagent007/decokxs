package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.core.ktx.MatchPattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C41375qpd;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.rgg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42982rgg extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.Boolean AYXKKw;
    public kotlin.Pair<java.lang.String, java.lang.String> AhwBna;
    public final int AkhnZx;
    public final float AuCTel;
    public java.util.List<java.lang.String> DbNXlk;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public java.lang.Boolean KWHzl;
    public final C42634raC copydefault;
    public java.lang.Boolean djBIcL;
    public int ejfBZ;
    public final float fARcdN;
    public final float fIwbmz;
    public int fJNWhG;
    public java.lang.Integer fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.Integer isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42982rgg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42982rgg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.rgg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42982rgg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42982rgg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42634raC c42634raCKWHzl = C42634raC.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42634raCKWHzl, "");
        this.copydefault = c42634raCKWHzl;
        this.AuCTel = C55298xhM.gEmmrt(16.0f, context);
        this.fARcdN = C55298xhM.gEmmrt(16.0f, context);
        this.fIwbmz = C55298xhM.gEmmrt(12.0f, context);
        this.ejfBZ = C52761wXj.LoaderManager.QSBOWP;
        int iDjBIcL = (C33570myu.djBIcL(context) - C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AkhnZx = iDjBIcL;
        this.fJNWhG = iDjBIcL;
        this.AhwBna = new kotlin.Pair<>("", "");
        this.gEmmrt = "";
        this.valueOf = "";
        this.values = "";
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.djBIcL = bool;
        this.AYXKKw = bool;
        this.KWHzl = bool;
        this.AEQbTJ = "";
    }

    /* JADX INFO: renamed from: o.rgg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rgg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final int KWHzl() {
        return this.fJNWhG - C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final void setData(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str4, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AhwBna = pair;
        this.DbNXlk = list;
        this.gEmmrt = str;
        this.valueOf = str2;
        this.values = str3;
        this.isConnected = num;
        this.fetchVPNInfo = num2;
        this.djBIcL = bool;
        this.AYXKKw = bool2;
        this.KWHzl = bool3;
        this.AEQbTJ = str4 != null ? str4 : "";
        this.EZpvd = function1;
        KWHzl(pair, list, str, str2, str3, num, num2, bool, bool2, bool3, str4);
    }

    public final void KWHzl(kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pair.getSecond())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                str6 = ((java.lang.Object) pair.getSecond()) + " / ";
            } else {
                str6 = " / " + ((java.lang.Object) pair.getSecond());
            }
            str5 = str6;
        } else {
            str5 = "";
        }
        setAdaptiveTitle(pair.getFirst(), str5, list, str2, num, num2, bool, bool2, java.lang.Boolean.valueOf(Intrinsics.EZpvd(bool3, java.lang.Boolean.TRUE) && C27563jxZ.OLrzqt.EZpvd()), str4);
        AppCompatTextView appCompatTextView = this.copydefault.copydefault;
        Intrinsics.copydefault(appCompatTextView);
        appCompatTextView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        appCompatTextView.setText(str);
        AppCompatTextView appCompatTextView2 = this.copydefault.djBIcL;
        Intrinsics.copydefault(appCompatTextView2);
        appCompatTextView2.setVisibility((appCompatTextView2.getVisibility() == 0 && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3) ^ true)) ? 0 : 8);
        appCompatTextView2.setText(str3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        pUU.EZpvd("MarketCardCryptoLayout", "onSizeChanged: w=" + i + ", h=" + i2 + ", oldw=" + i3 + ", oldh=" + i4);
        if (i == i3 || i == (i5 = this.fJNWhG)) {
            return;
        }
        pUU.EZpvd("MarketCardCryptoLayout", "onSizeChanged diff: w=" + i + ", oldw=" + i3 + ", foldScreenWidth=" + i5);
        this.fJNWhG = i;
        post(new java.lang.Runnable() { // from class: o.rgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C42982rgg.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(C42982rgg c42982rgg) {
        c42982rgg.KWHzl(c42982rgg.AhwBna, c42982rgg.DbNXlk, c42982rgg.gEmmrt, c42982rgg.valueOf, c42982rgg.values, c42982rgg.isConnected, c42982rgg.fetchVPNInfo, c42982rgg.djBIcL, c42982rgg.AYXKKw, c42982rgg.KWHzl, c42982rgg.AEQbTJ);
    }

    public final void setAdaptiveTitle(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str4) {
        kotlin.Pair pair;
        kotlin.Pair pair2;
        java.lang.String str5;
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        java.lang.StringBuilder sb3;
        java.lang.StringBuilder sb4;
        java.lang.StringBuilder sb5;
        android.text.TextPaint paint = this.copydefault.AEQbTJ.getPaint();
        paint.setTextSize(this.AuCTel);
        float fMeasureText = paint.measureText(str);
        float fMeasureText2 = paint.measureText(str3);
        paint.setTextSize(this.fARcdN);
        float fMeasureText3 = paint.measureText(str2);
        boolean zOLrzqt = isInEditMode() ? false : C33492mxV.OLrzqt();
        C41375qpd.Activity activity = C41375qpd.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pairOLrzqt = activity.OLrzqt(zOLrzqt, list, context, this, num, num2);
        if (pairOLrzqt == null) {
            pairOLrzqt = new kotlin.Pair<>(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpanComponent1 = pairOLrzqt.component1();
        int iIntValue = pairOLrzqt.component2().intValue();
        java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool4)) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            pair = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, new C42991rgp(context2, null, 0, 6, null), null, 2, null);
            if (pair == null) {
                pair = new kotlin.Pair(null, 0);
            }
        } else {
            pair = new kotlin.Pair(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpan = (android.text.style.ReplacementSpan) pair.component1();
        int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
        if (Intrinsics.EZpvd(bool3, bool4)) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C42979rgd c42979rgd = new C42979rgd(context3, null, 0, 6, null);
            c42979rgd.setBoostTag(str4, bool3);
            pair2 = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, c42979rgd, null, 2, null);
            if (pair2 == null) {
                pair2 = new kotlin.Pair(null, 0);
            }
        } else {
            pair2 = new kotlin.Pair(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpan2 = (android.text.style.ReplacementSpan) pair2.component1();
        int iIntValue3 = ((java.lang.Number) pair2.component2()).intValue();
        if (Intrinsics.EZpvd(bool2, bool4)) {
            this.copydefault.AEQbTJ.setMaxWidth((int) ((KWHzl() - fMeasureText2) - C55298xhM.dp2px$default(16.0f, null, 1, null)));
            this.copydefault.AEQbTJ.setMaxLines(2);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            if (C55296xhK.OLrzqt(context4)) {
                sb5 = new java.lang.StringBuilder();
                sb5.append(str2);
                sb5.append(str);
            } else {
                sb5 = new java.lang.StringBuilder();
                sb5.append(str);
                sb5.append(str2);
            }
            setTextData$default(this, sb5.toString(), str, str2, replacementSpanComponent1, str3, C32113mPz.Dialog.QOLQEE, this.AuCTel, false, replacementSpan, replacementSpan2, 128, null);
            return;
        }
        this.copydefault.AEQbTJ.setMaxWidth(KWHzl());
        float f = iIntValue + iIntValue3 + iIntValue2;
        float f2 = fMeasureText + fMeasureText3 + f;
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText2 + f2), java.lang.Integer.valueOf(KWHzl()))) {
            this.copydefault.AEQbTJ.setMaxLines(1);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            if (C55296xhK.OLrzqt(context5)) {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str2);
                sb4.append(str);
            } else {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(str2);
            }
            setTextData$default(this, sb4.toString(), str, str2, replacementSpanComponent1, str3, C32113mPz.Dialog.QOLQEE, this.AuCTel, false, replacementSpan, replacementSpan2, 128, null);
            return;
        }
        paint.setTextSize(this.fIwbmz);
        str5 = "";
        float fMeasureText4 = paint.measureText(str3);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(f2 + fMeasureText4), java.lang.Integer.valueOf(KWHzl()))) {
            this.copydefault.AEQbTJ.setMaxLines(1);
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, str5);
            if (C55296xhK.OLrzqt(context6)) {
                sb3 = new java.lang.StringBuilder();
                sb3.append(str2);
                sb3.append(str);
            } else {
                sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(str2);
            }
            setTextData$default(this, sb3.toString(), str, str2, replacementSpanComponent1, str3, C32113mPz.Dialog.QOLQEE, this.fIwbmz, false, replacementSpan, replacementSpan2, 128, null);
            return;
        }
        paint.setTextSize(this.fIwbmz);
        float fMeasureText5 = paint.measureText(str);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText5 + fMeasureText3 + f + fMeasureText4), java.lang.Integer.valueOf(KWHzl()))) {
            this.copydefault.AEQbTJ.setMaxLines(1);
            android.content.Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, str5);
            if (C55296xhK.OLrzqt(context7)) {
                sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(str);
            } else {
                sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(str2);
            }
            setTextData$default(this, sb2.toString(), str, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.fIwbmz, false, replacementSpan, replacementSpan2, 128, null);
            return;
        }
        if (C33129mqd.valueOf(java.lang.Float.valueOf(java.lang.Math.max(fMeasureText5, fMeasureText3 + f) + fMeasureText4), java.lang.Integer.valueOf(KWHzl()))) {
            this.copydefault.AEQbTJ.setMaxLines(2);
            setTextData(str + "\n" + str2, str, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.fIwbmz, true, replacementSpan, replacementSpan2);
            return;
        }
        this.copydefault.AEQbTJ.setMaxLines(2);
        Intrinsics.copydefault(paint);
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, KWHzl(str, paint, (KWHzl() - fMeasureText4) - C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null)));
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) str) ? "" : "..."));
            setTextData(strAEQbTJ + "\n" + str2, strAEQbTJ, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.fIwbmz, true, replacementSpan, replacementSpan2);
            return;
        }
        android.content.Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, str5);
        if (C55296xhK.OLrzqt(context8)) {
            sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(str);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
        }
        setTextData$default(this, sb.toString(), str, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.fIwbmz, false, replacementSpan, replacementSpan2, 128, null);
    }

    private final int KWHzl(java.lang.String str, android.graphics.Paint paint, float f) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float fMeasureText = paint.measureText(java.lang.String.valueOf(str.charAt(i2)));
            if (!C33129mqd.copydefault(java.lang.Float.valueOf(f), java.lang.Float.valueOf(fMeasureText))) {
                break;
            }
            f -= fMeasureText;
            i++;
        }
        return i;
    }

    public static /* synthetic */ void setTextData$default(C42982rgg c42982rgg, java.lang.String str, java.lang.String str2, java.lang.String str3, android.text.style.ReplacementSpan replacementSpan, java.lang.String str4, int i, float f, boolean z, android.text.style.ReplacementSpan replacementSpan2, android.text.style.ReplacementSpan replacementSpan3, int i2, java.lang.Object obj) {
        c42982rgg.setTextData(str, str2, str3, replacementSpan, str4, i, f, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : replacementSpan2, (i2 & 512) != 0 ? null : replacementSpan3);
    }

    public final void setTextData(java.lang.String str, java.lang.String str2, java.lang.String str3, final android.text.style.ReplacementSpan replacementSpan, java.lang.String str4, final int i, float f, boolean z, final android.text.style.ReplacementSpan replacementSpan2, final android.text.style.ReplacementSpan replacementSpan3) {
        java.lang.String str5;
        if (replacementSpan != null) {
            str5 = ((z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) ? "" : " ") + " ";
        } else {
            str5 = "";
        }
        java.lang.String str6 = replacementSpan3 != null ? Marker.ANY_NON_NULL_MARKER : "";
        java.lang.String str7 = str + str5 + (replacementSpan2 != null ? "-" : "") + str6;
        AppCompatTextView appCompatTextView = this.copydefault.AEQbTJ;
        MatchPattern matchPattern = MatchPattern.LAST_ONLY;
        appCompatTextView.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str7, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.rgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42982rgg.KWHzl(this.OLrzqt, i, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str3}, 0, null, false, new Function1() { // from class: o.rge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42982rgg.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{" "}, 0, matchPattern, false, new Function1() { // from class: o.rgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42982rgg.copydefault(replacementSpan, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{Marker.ANY_NON_NULL_MARKER}, 0, matchPattern, false, new Function1() { // from class: o.rgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42982rgg.gEmmrt(replacementSpan3, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{"-"}, 0, matchPattern, false, new Function1() { // from class: o.rgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42982rgg.AEQbTJ(replacementSpan2, (java.util.List) obj);
            }
        }, 10, null));
        this.copydefault.OLrzqt.setTextSize(0, f);
        this.copydefault.OLrzqt.setText(str4);
        if ((replacementSpan2 instanceof C40547qZx) || (replacementSpan3 instanceof C40547qZx)) {
            this.copydefault.AEQbTJ.post(new java.lang.Runnable() { // from class: o.rgi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C42982rgg.setTextData$lambda$10(this.copydefault, replacementSpan2, replacementSpan3);
                }
            });
        }
    }

    public static final Unit KWHzl(C42982rgg c42982rgg, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42982rgg.getContext(), i));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C42982rgg c42982rgg, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42982rgg.getContext(), c42982rgg.ejfBZ));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gEmmrt(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void setTextData$lambda$10(final C42982rgg c42982rgg, final android.text.style.ReplacementSpan replacementSpan, final android.text.style.ReplacementSpan replacementSpan2) {
        AppCompatTextView appCompatTextView = c42982rgg.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C41426qqb.copydefault(appCompatTextView, new Function1() { // from class: o.rgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42982rgg.EZpvd(replacementSpan, replacementSpan2, c42982rgg, (C40547qZx) obj);
            }
        });
    }

    public static final Unit EZpvd(android.text.style.ReplacementSpan replacementSpan, android.text.style.ReplacementSpan replacementSpan2, C42982rgg c42982rgg, C40547qZx c40547qZx) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(c40547qZx, "");
        C46731tch c46731tchOLrzqt = C46731tch.Companion.OLrzqt(java.lang.Boolean.valueOf(replacementSpan != null), java.lang.Boolean.valueOf(replacementSpan2 != null), c42982rgg.AEQbTJ);
        c46731tchOLrzqt.OLrzqt(c42982rgg.EZpvd);
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c42982rgg);
        FragmentActivity fragmentActivity = activityKWHzl instanceof FragmentActivity ? (FragmentActivity) activityKWHzl : null;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            c46731tchOLrzqt.show(supportFragmentManager);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void setPriceLayoutVisible(boolean z) {
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView3 = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(z ? 0 : 8);
    }

    public final void setPriceLayoutVisible(boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z2 ? 0 : 8);
    }

    public final void setSubPriceColor(@androidx.annotation.ColorInt int i) {
        this.copydefault.djBIcL.setTextColor(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.EZpvd = null;
    }
}
