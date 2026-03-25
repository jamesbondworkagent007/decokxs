package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C41375qpd;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.qSx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40358qSx extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C42937rfo AEQbTJ;
    public final float AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final float KWHzl;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public final float gEmmrt;
    public final int valueOf;

    /* JADX INFO: renamed from: o.qSx$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UpDownColor.values().length];
            try {
                iArr[UpDownColor.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UpDownColor.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40358qSx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40358qSx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:46) call: o.qSx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40358qSx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40358qSx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42937rfo c42937rfoAEQbTJ = C42937rfo.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42937rfoAEQbTJ, "");
        this.AEQbTJ = c42937rfoAEQbTJ;
        this.EZpvd = 15;
        this.AhwBna = 10;
        this.valueOf = 6;
        this.KWHzl = C55298xhM.dp$default(15, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AYXKKw = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        this.gEmmrt = C55298xhM.sp2pxFloat$default(130.0f, null, 1, null);
    }

    /* JADX INFO: renamed from: o.qSx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qSx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setData(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, UpDownColor upDownColor, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Integer num, java.lang.Integer num2, boolean z5, java.lang.Boolean bool, java.lang.String str4, java.lang.Integer num3, java.lang.String str5, Function1<? super java.lang.String, Unit> function1) {
        java.lang.String str6;
        int iCopydefault;
        java.lang.String str7;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = function1;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pair.getSecond())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                str7 = ((java.lang.Object) pair.getSecond()) + " / ";
            } else {
                str7 = " / " + ((java.lang.Object) pair.getSecond());
            }
            str6 = str7;
        } else {
            str6 = "";
        }
        setAdaptiveTitle(pair.getFirst(), str6, list, str2, z, z2, z3, z4, num, num2, z5, bool, str4, num3);
        AppCompatImageView appCompatImageView = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z3 ? 0 : 8);
        C55251xgS c55251xgS = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(z4 ? 0 : 8);
        java.lang.String str8 = (str5 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5)) ? str : str5;
        AppCompatTextView appCompatTextView = this.AEQbTJ.AEQbTJ;
        Intrinsics.copydefault(appCompatTextView);
        appCompatTextView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str8) ^ true ? 0 : 8);
        appCompatTextView.setText(str8);
        AppCompatTextView appCompatTextView2 = this.AEQbTJ.AhwBna;
        Intrinsics.copydefault(appCompatTextView2);
        appCompatTextView2.setVisibility((appCompatTextView2.getVisibility() == 0 && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3) ^ true)) ? 0 : 8);
        appCompatTextView2.setText(str3);
        int i = upDownColor == null ? -1 : StateListAnimator.AEQbTJ[upDownColor.ordinal()];
        if (i == 1) {
            android.content.Context context2 = appCompatTextView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C33508mxl.copydefault(context2);
        } else if (i == 2) {
            android.content.Context context3 = appCompatTextView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iCopydefault = C33508mxl.AEQbTJ(context3);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        appCompatTextView2.setTextColor(iCopydefault);
    }

    public final void setAdaptiveTitle(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Integer num, java.lang.Integer num2, boolean z5, java.lang.Boolean bool, java.lang.String str4, java.lang.Integer num3) {
        int i;
        C41375qpd.Activity activity;
        kotlin.Pair pair;
        kotlin.Pair pair2;
        java.lang.String str5;
        android.text.TextPaint textPaint;
        java.lang.StringBuilder sb;
        android.content.Context context = null;
        int iDpInt$default = z2 ? C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null) : 0;
        int iDjBIcL = ((((((C33570myu.djBIcL(getContext()) - C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)) - iDpInt$default) - (z ? C55298xhM.dpInt$default(44, (android.content.Context) null, 1, (java.lang.Object) null) : 0)) - (z3 ? C55298xhM.dpInt$default(18, (android.content.Context) null, 1, (java.lang.Object) null) : 0)) - (z4 ? C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null) + C33129mqd.AhwBna(java.lang.Float.valueOf(this.AEQbTJ.copydefault.getPaint().measureText(C33129mqd.gEmmrt(this.AEQbTJ.copydefault.getText())))) : 0)) - (num3 != null ? num3.intValue() : 0)) - C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        android.text.TextPaint paint = this.AEQbTJ.djBIcL.getPaint();
        paint.setTextSize(this.KWHzl);
        float fMeasureText = paint.measureText(str);
        float fMin = java.lang.Math.min(paint.measureText(str3), this.gEmmrt);
        int i2 = this.EZpvd;
        int i3 = this.valueOf;
        if (i3 <= i2) {
            int i4 = i2;
            while (true) {
                paint.setTextSize(C55298xhM.dp$default(i4, (android.content.Context) null, 1, (java.lang.Object) null));
                if (!C33129mqd.valueOf(java.lang.Float.valueOf(paint.measureText(str3)), java.lang.Float.valueOf(this.gEmmrt))) {
                    if (i4 == i3) {
                        break;
                    } else {
                        i4--;
                    }
                } else {
                    i = i4;
                    break;
                }
            }
            i = i2;
        } else {
            i = i2;
        }
        paint.setTextSize(this.AYXKKw);
        float fMeasureText2 = paint.measureText(str2);
        C41375qpd.Activity activity2 = C41375qpd.Companion;
        boolean zOLrzqt = C41431qqg.OLrzqt(this);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        android.text.TextPaint textPaint2 = paint;
        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pairOLrzqt = activity2.OLrzqt(zOLrzqt, list, context2, this, num, num2);
        if (pairOLrzqt == null) {
            pairOLrzqt = new kotlin.Pair<>(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpanComponent1 = pairOLrzqt.component1();
        int iIntValue = pairOLrzqt.component2().intValue();
        if (z5) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C42991rgp c42991rgp = new C42991rgp(context3, null, 0, 6, null);
            activity = activity2;
            pair = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, c42991rgp, null, 2, null);
            if (pair == null) {
                pair = new kotlin.Pair(null, 0);
            }
        } else {
            activity = activity2;
            pair = new kotlin.Pair(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpan = (android.text.style.ReplacementSpan) pair.component1();
        int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && C27563jxZ.OLrzqt.EZpvd()) {
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            C42979rgd c42979rgd = new C42979rgd(context4, null, 0, 6, null);
            c42979rgd.setBoostTag(str4, bool);
            pair2 = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, c42979rgd, null, 2, null);
            if (pair2 == null) {
                pair2 = new kotlin.Pair(null, 0);
            }
        } else {
            pair2 = new kotlin.Pair(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpan2 = (android.text.style.ReplacementSpan) pair2.component1();
        float fIntValue = iIntValue + ((java.lang.Number) pair2.component2()).intValue() + iIntValue2;
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText + fMeasureText2 + fIntValue + fMin), java.lang.Integer.valueOf(iDjBIcL))) {
            this.AEQbTJ.djBIcL.setMaxLines(1);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            if (C55296xhK.OLrzqt(context5)) {
                sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(str);
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(str2);
            }
            setTextData$default(this, sb.toString(), str, str2, replacementSpanComponent1, str3, this.EZpvd, i, false, replacementSpan, replacementSpan2, str4, 128, null);
            return;
        }
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) || replacementSpanComponent1 != null) {
            this.AEQbTJ.djBIcL.setMaxLines(2);
            str5 = str + "\n" + str2;
        } else {
            this.AEQbTJ.djBIcL.setMaxLines(1);
            str5 = str;
        }
        int i5 = this.EZpvd;
        int i6 = this.AhwBna;
        if (i6 <= i5) {
            int i7 = i5;
            int i8 = 1;
            while (true) {
                float fDp$default = C55298xhM.dp$default(i7, context, i8, (java.lang.Object) context);
                textPaint = textPaint2;
                textPaint.setTextSize(fDp$default);
                if (!C33129mqd.valueOf(java.lang.Float.valueOf(java.lang.Math.max(textPaint.measureText(str), fMeasureText2 + fIntValue) + fMin), java.lang.Integer.valueOf(iDjBIcL))) {
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                    textPaint2 = textPaint;
                    i8 = 1;
                    context = null;
                } else {
                    setTextData(str5, str, str2, replacementSpanComponent1, str3, i7, i, true, replacementSpan, replacementSpan2, str4);
                    return;
                }
            }
        } else {
            textPaint = textPaint2;
        }
        Intrinsics.copydefault(textPaint);
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, EZpvd(str, textPaint, iDjBIcL - fMin));
        java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) str) ? "" : "..."));
        setTextData(strAEQbTJ + "\n" + str2, strAEQbTJ, str2, replacementSpanComponent1, str3, this.AhwBna, i, true, replacementSpan, replacementSpan2, str4);
    }

    private final int EZpvd(java.lang.String str, android.graphics.Paint paint, float f) {
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

    public static /* synthetic */ void setTextData$default(C40358qSx c40358qSx, java.lang.String str, java.lang.String str2, java.lang.String str3, android.text.style.ReplacementSpan replacementSpan, java.lang.String str4, int i, int i2, boolean z, android.text.style.ReplacementSpan replacementSpan2, android.text.style.ReplacementSpan replacementSpan3, java.lang.String str5, int i3, java.lang.Object obj) {
        c40358qSx.setTextData(str, str2, str3, replacementSpan, str4, i, i2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? null : replacementSpan2, (i3 & 512) != 0 ? null : replacementSpan3, (i3 & 1024) != 0 ? "" : str5);
    }

    public final void setTextData(java.lang.String str, java.lang.String str2, java.lang.String str3, final android.text.style.ReplacementSpan replacementSpan, java.lang.String str4, final int i, int i2, boolean z, final android.text.style.ReplacementSpan replacementSpan2, final android.text.style.ReplacementSpan replacementSpan3, final java.lang.String str5) {
        java.lang.String str6;
        if (replacementSpan != null) {
            str6 = ((z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) ? "" : " ") + "tag";
        } else {
            str6 = "";
        }
        java.lang.String str7 = str + str6 + (replacementSpan2 != null ? "-" : "") + (replacementSpan3 != null ? Marker.ANY_NON_NULL_MARKER : "");
        AppCompatTextView appCompatTextView = this.AEQbTJ.djBIcL;
        MatchPattern matchPattern = MatchPattern.LAST_ONLY;
        appCompatTextView.setText(StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str7, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.qSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40358qSx.KWHzl(this.copydefault, i, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str3}, 0, null, false, new Function1() { // from class: o.qSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40358qSx.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{"tag"}, 0, matchPattern, false, new Function1() { // from class: o.qSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40358qSx.copydefault(replacementSpan, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{Marker.ANY_NON_NULL_MARKER}, 0, matchPattern, false, new Function1() { // from class: o.qSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40358qSx.OLrzqt(replacementSpan3, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{"-"}, 0, matchPattern, false, new Function1() { // from class: o.qSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40358qSx.AhwBna(replacementSpan2, (java.util.List) obj);
            }
        }, 10, null)));
        this.AEQbTJ.valueOf.setTextSize(C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)));
        this.AEQbTJ.valueOf.setText(str4);
        if ((replacementSpan2 instanceof C40547qZx) || (replacementSpan3 instanceof C40547qZx)) {
            this.AEQbTJ.djBIcL.post(new java.lang.Runnable() { // from class: o.qSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C40358qSx.setTextData$lambda$9(this.copydefault, replacementSpan2, replacementSpan3, str5);
                }
            });
        }
    }

    public static final Unit KWHzl(C40358qSx c40358qSx, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c40358qSx.getContext(), C52761wXj.LoaderManager.USBtdM));
        list.add(new android.text.style.AbsoluteSizeSpan(i, true));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C40358qSx c40358qSx, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c40358qSx.getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void setTextData$lambda$9(final C40358qSx c40358qSx, final android.text.style.ReplacementSpan replacementSpan, final android.text.style.ReplacementSpan replacementSpan2, final java.lang.String str) {
        AppCompatTextView appCompatTextView = c40358qSx.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C41426qqb.copydefault(appCompatTextView, new Function1() { // from class: o.qSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40358qSx.OLrzqt(replacementSpan, replacementSpan2, str, c40358qSx, (C40547qZx) obj);
            }
        });
    }

    public static final Unit OLrzqt(android.text.style.ReplacementSpan replacementSpan, android.text.style.ReplacementSpan replacementSpan2, java.lang.String str, C40358qSx c40358qSx, C40547qZx c40547qZx) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(c40547qZx, "");
        C46731tch c46731tchOLrzqt = C46731tch.Companion.OLrzqt(java.lang.Boolean.valueOf(replacementSpan != null), java.lang.Boolean.valueOf(replacementSpan2 != null), str);
        c46731tchOLrzqt.OLrzqt(c40358qSx.OLrzqt);
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c40358qSx);
        FragmentActivity fragmentActivity = activityKWHzl instanceof FragmentActivity ? (FragmentActivity) activityKWHzl : null;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            c46731tchOLrzqt.show(supportFragmentManager);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void setPriceLayoutVisible(boolean z) {
        AppCompatTextView appCompatTextView = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OLrzqt = null;
    }
}
