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
import o.C41375qpd;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.rgn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42989rgn extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public boolean AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.Integer AkhnZx;
    public final int AuCTel;
    public final float DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final C42863reT copydefault;
    public boolean djBIcL;
    public final int ejfBZ;
    public final float fARcdN;
    public java.lang.Integer fIwbmz;
    public int fJNWhG;
    public final int fetchVPNInfo;
    public kotlin.Pair<java.lang.String, java.lang.String> gEmmrt;
    public int getFieldNames;
    public final float hDKMBd;
    public java.util.List<java.lang.String> isConnected;
    public final float iwGUEr;
    public final float uzCIH;
    public java.lang.String valueOf;
    public java.lang.Integer values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42989rgn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42989rgn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraWidth$OKMarket_market_impl(int i) {
        this.fJNWhG = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.rgn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42989rgn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42989rgn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42863reT c42863reTOLrzqt = C42863reT.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42863reTOLrzqt, "");
        this.copydefault = c42863reTOLrzqt;
        this.ejfBZ = 15;
        this.AuCTel = 12;
        this.DbNXlk = C55298xhM.dp$default(15, (android.content.Context) null, 1, (java.lang.Object) null);
        this.uzCIH = C55298xhM.gEmmrt(14.0f, context);
        this.fARcdN = C55298xhM.dp$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.getFieldNames = C52761wXj.LoaderManager.QSBOWP;
        this.hDKMBd = C55298xhM.gEmmrt(12.0f, context);
        this.iwGUEr = C55298xhM.gEmmrt(10.0f, context);
        this.fetchVPNInfo = ((C33570myu.djBIcL(context) - C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(92, (android.content.Context) null, 1, (java.lang.Object) null);
        this.gEmmrt = new kotlin.Pair<>("", "");
        this.KWHzl = "";
        this.valueOf = "";
        this.AhwBna = "";
        this.EZpvd = "";
    }

    private final int OLrzqt() {
        java.lang.Integer num = this.fIwbmz;
        return num != null ? num.intValue() : this.fetchVPNInfo - this.fJNWhG;
    }

    private final int AEQbTJ() {
        return OLrzqt() - C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.rgn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rgn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void setData(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Boolean bool, java.lang.String str4, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.gEmmrt = pair;
        this.isConnected = list;
        this.KWHzl = str;
        this.valueOf = str2;
        this.AhwBna = str3;
        this.values = num;
        this.AkhnZx = num2;
        this.djBIcL = z;
        this.AYXKKw = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
        this.EZpvd = str4 != null ? str4 : "";
        this.AEQbTJ = function1;
        KWHzl(pair, list, str, str2, str3, num, num2, z, bool, str4);
    }

    public final void KWHzl(kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Boolean bool, java.lang.String str4) {
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
        float fKWHzl = KWHzl(pair.getFirst(), str5, list, str2, num, num2, java.lang.Boolean.valueOf(z), bool, str4);
        AppCompatTextView appCompatTextView = this.copydefault.AEQbTJ;
        Intrinsics.copydefault(appCompatTextView);
        int i = 8;
        appCompatTextView.setVisibility((appCompatTextView.getVisibility() == 0 && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true)) ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.copydefault.EZpvd;
        Intrinsics.copydefault(appCompatTextView2);
        if (appCompatTextView2.getVisibility() == 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3))) {
            i = 0;
        }
        appCompatTextView2.setVisibility(i);
        setBottomTitle(str, str3, fKWHzl);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        pUU.EZpvd("MarketHomeCryptoLayout", "onSizeChanged: w=" + i + ", h=" + i2 + ", oldw=" + i3 + ", oldh=" + i4);
        if (i == i3 || i == OLrzqt()) {
            return;
        }
        pUU.EZpvd("MarketHomeCryptoLayout", "onSizeChanged diff: w=" + i + ", oldw=" + i3 + ", cryptoLayoutWidth=" + OLrzqt());
        this.fIwbmz = java.lang.Integer.valueOf(i);
        post(new java.lang.Runnable() { // from class: o.rgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C42989rgn.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(C42989rgn c42989rgn) {
        kotlin.Pair<java.lang.String, java.lang.String> pair = c42989rgn.gEmmrt;
        java.util.List<java.lang.String> list = c42989rgn.isConnected;
        java.lang.String str = c42989rgn.KWHzl;
        java.lang.String str2 = c42989rgn.valueOf;
        java.lang.String str3 = c42989rgn.AhwBna;
        java.lang.Integer num = c42989rgn.values;
        java.lang.Integer num2 = c42989rgn.AkhnZx;
        boolean z = c42989rgn.djBIcL;
        boolean z2 = c42989rgn.AYXKKw;
        c42989rgn.KWHzl(pair, list, str, str2, str3, num, num2, z, java.lang.Boolean.valueOf(z2), c42989rgn.EZpvd);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(o.qpd$Activity, android.view.View, kotlin.jvm.functions.Function0, int, java.lang.Object):kotlin.Pair */
    public final float KWHzl(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str4) {
        java.lang.String str5;
        kotlin.Pair pair;
        kotlin.Pair pair2;
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        int i;
        java.lang.StringBuilder sb3;
        float fMeasureText;
        java.lang.StringBuilder sb4;
        android.text.TextPaint paint = this.copydefault.OLrzqt.getPaint();
        paint.setTextSize(this.DbNXlk);
        float fMeasureText2 = paint.measureText(str);
        float fMeasureText3 = paint.measureText(str3);
        paint.setTextSize(this.uzCIH);
        float fMeasureText4 = paint.measureText(str2);
        boolean zOLrzqt = isInEditMode() ? false : C33492mxV.OLrzqt();
        C41375qpd.Activity activity = C41375qpd.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        str5 = "";
        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pairOLrzqt = activity.OLrzqt(zOLrzqt, list, context, this, num, num2);
        android.content.Context context2 = null;
        if (pairOLrzqt == null) {
            pairOLrzqt = new kotlin.Pair<>(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpanComponent1 = pairOLrzqt.component1();
        int iIntValue = pairOLrzqt.component2().intValue();
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool3)) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, str5);
            pair = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, new C42991rgp(context3, null, 0, 6, null), null, 2, null);
            if (pair == null) {
                pair = new kotlin.Pair(null, 0);
            }
        } else {
            pair = new kotlin.Pair(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpan = (android.text.style.ReplacementSpan) pair.component1();
        int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
        if (Intrinsics.EZpvd(bool2, bool3) && C27563jxZ.OLrzqt.EZpvd()) {
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, str5);
            C42979rgd c42979rgd = new C42979rgd(context4, null, 0, 6, null);
            c42979rgd.setBoostTag(str4, bool2);
            pair2 = C41375qpd.Activity.getOrCreateClickableIconSpan$OKMarket_market_impl$default(activity, c42979rgd, null, 2, null);
            if (pair2 == null) {
                pair2 = new kotlin.Pair(null, 0);
            }
        } else {
            pair2 = new kotlin.Pair(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpan2 = (android.text.style.ReplacementSpan) pair2.component1();
        float fIntValue = iIntValue + ((java.lang.Number) pair2.component2()).intValue() + iIntValue2;
        float f = fMeasureText2 + fMeasureText4 + fIntValue;
        if (C33129mqd.valueOf(java.lang.Float.valueOf(f + fMeasureText3), java.lang.Integer.valueOf(AEQbTJ()))) {
            this.copydefault.OLrzqt.setMaxLines(1);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, str5);
            if (C55296xhK.OLrzqt(context5)) {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str2);
                sb4.append(str);
            } else {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(str2);
            }
            java.lang.String string = sb4.toString();
            int i2 = this.ejfBZ;
            setTextData(string, str2, replacementSpanComponent1, str3, i2, i2, false, replacementSpan, replacementSpan2);
        } else {
            paint.setTextSize(this.fARcdN);
            fMeasureText3 = paint.measureText(str3);
            if (C33129mqd.valueOf(java.lang.Float.valueOf(f + fMeasureText3), java.lang.Integer.valueOf(AEQbTJ()))) {
                int i3 = this.AuCTel;
                int i4 = this.ejfBZ - 1;
                if (i3 <= i4) {
                    while (true) {
                        paint.setTextSize(C55298xhM.dp$default(i4, (android.content.Context) null, 1, (java.lang.Object) null));
                        fMeasureText = paint.measureText(str3);
                        if (!C33129mqd.valueOf(java.lang.Float.valueOf(f + fMeasureText), java.lang.Integer.valueOf(AEQbTJ()))) {
                            if (i4 == i3) {
                                break;
                            }
                            i4--;
                        } else {
                            i3 = i4;
                            break;
                        }
                    }
                    i = i3;
                    fMeasureText3 = fMeasureText;
                } else {
                    i = i3;
                }
                this.copydefault.OLrzqt.setMaxLines(1);
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
                setTextData(sb3.toString(), str2, replacementSpanComponent1, str3, this.ejfBZ, i, false, replacementSpan, replacementSpan2);
            } else {
                paint.setTextSize(this.fARcdN);
                float fMeasureText5 = paint.measureText(str);
                if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText5 + fMeasureText4 + fIntValue + fMeasureText3), java.lang.Integer.valueOf(AEQbTJ()))) {
                    int i5 = this.AuCTel;
                    int i6 = this.ejfBZ - 1;
                    if (i5 <= i6) {
                        while (true) {
                            paint.setTextSize(C55298xhM.dp$default(i6, context2, 1, (java.lang.Object) context2));
                            if (!C33129mqd.valueOf(java.lang.Float.valueOf(paint.measureText(str) + fMeasureText4 + fIntValue + fMeasureText3), java.lang.Integer.valueOf(AEQbTJ()))) {
                                if (i6 == i5) {
                                    break;
                                }
                                i6--;
                                context2 = null;
                            } else {
                                i5 = i6;
                                break;
                            }
                        }
                    }
                    this.copydefault.OLrzqt.setMaxLines(1);
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
                    setTextData(sb2.toString(), str2, replacementSpanComponent1, str3, i5, this.AuCTel, false, replacementSpan, replacementSpan2);
                } else if (C33129mqd.valueOf(java.lang.Float.valueOf(java.lang.Math.max(fMeasureText5, fMeasureText4 + fIntValue) + fMeasureText3), java.lang.Integer.valueOf(AEQbTJ()))) {
                    this.copydefault.OLrzqt.setMaxLines(2);
                    int i7 = this.AuCTel;
                    setTextData(str + "\n" + str2, str2, replacementSpanComponent1, str3, i7, i7, true, replacementSpan, replacementSpan2);
                } else {
                    this.copydefault.OLrzqt.setMaxLines(2);
                    Intrinsics.copydefault(paint);
                    java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, OLrzqt(str, paint, (AEQbTJ() - fMeasureText3) - C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null)));
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                        java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) str) ? "" : "..."));
                        boolean z = (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) ^ true) || C33129mqd.KWHzl((java.util.Collection) list);
                        if (z) {
                            strAEQbTJ = strAEQbTJ + "\n" + str2;
                        }
                        java.lang.String str6 = strAEQbTJ;
                        int i8 = this.AuCTel;
                        setTextData(str6, str2, replacementSpanComponent1, str3, i8, i8, z, replacementSpan, replacementSpan2);
                    } else {
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
                        java.lang.String string2 = sb.toString();
                        int i9 = this.AuCTel;
                        setTextData$default(this, string2, str2, replacementSpanComponent1, str3, i9, i9, false, replacementSpan, replacementSpan2, 64, null);
                    }
                }
            }
        }
        return fMeasureText3;
    }

    private final int OLrzqt(java.lang.String str, android.graphics.Paint paint, float f) {
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

    public static /* synthetic */ void setTextData$default(C42989rgn c42989rgn, java.lang.String str, java.lang.String str2, android.text.style.ReplacementSpan replacementSpan, java.lang.String str3, int i, int i2, boolean z, android.text.style.ReplacementSpan replacementSpan2, android.text.style.ReplacementSpan replacementSpan3, int i3, java.lang.Object obj) {
        c42989rgn.setTextData(str, str2, replacementSpan, str3, i, i2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? null : replacementSpan2, (i3 & 256) != 0 ? null : replacementSpan3);
    }

    public final void setTextData(java.lang.String str, java.lang.String str2, final android.text.style.ReplacementSpan replacementSpan, java.lang.String str3, int i, int i2, boolean z, final android.text.style.ReplacementSpan replacementSpan2, final android.text.style.ReplacementSpan replacementSpan3) {
        java.lang.String str4;
        if (replacementSpan != null) {
            str4 = ((z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? "" : " ") + " ";
        } else {
            str4 = "";
        }
        java.lang.String str5 = replacementSpan3 != null ? Marker.ANY_NON_NULL_MARKER : "";
        java.lang.String str6 = replacementSpan2 != null ? "-" : "";
        this.copydefault.OLrzqt.setTextSize(2, C33129mqd.djBIcL(java.lang.Integer.valueOf(i)));
        java.lang.String str7 = str + str4 + str6 + str5;
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        MatchPattern matchPattern = MatchPattern.LAST_ONLY;
        appCompatTextView.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str7, new java.lang.String[]{str2}, 0, matchPattern, false, new Function1() { // from class: o.rgr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42989rgn.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{" "}, 0, matchPattern, false, new Function1() { // from class: o.rgo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42989rgn.OLrzqt(replacementSpan, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{Marker.ANY_NON_NULL_MARKER}, 0, matchPattern, false, new Function1() { // from class: o.rgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42989rgn.KWHzl(replacementSpan3, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{"-"}, 0, matchPattern, false, new Function1() { // from class: o.rgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42989rgn.AhwBna(replacementSpan2, (java.util.List) obj);
            }
        }, 10, null));
        this.copydefault.copydefault.setTextSize(2, C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)));
        this.copydefault.copydefault.setText(str3);
        if ((replacementSpan2 instanceof C40547qZx) || (replacementSpan3 instanceof C40547qZx)) {
            this.copydefault.OLrzqt.post(new java.lang.Runnable() { // from class: o.rgu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C42989rgn.setTextData$lambda$9(this.KWHzl, replacementSpan2, replacementSpan3);
                }
            });
        }
    }

    public static final Unit KWHzl(C42989rgn c42989rgn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42989rgn.getContext(), c42989rgn.getFieldNames));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AhwBna(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void setTextData$lambda$9(final C42989rgn c42989rgn, final android.text.style.ReplacementSpan replacementSpan, final android.text.style.ReplacementSpan replacementSpan2) {
        AppCompatTextView appCompatTextView = c42989rgn.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C41426qqb.copydefault(appCompatTextView, new Function1() { // from class: o.rgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42989rgn.KWHzl(replacementSpan, replacementSpan2, c42989rgn, (C40547qZx) obj);
            }
        });
    }

    public static final Unit KWHzl(android.text.style.ReplacementSpan replacementSpan, android.text.style.ReplacementSpan replacementSpan2, C42989rgn c42989rgn, C40547qZx c40547qZx) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(c40547qZx, "");
        C46731tch c46731tchOLrzqt = C46731tch.Companion.OLrzqt(java.lang.Boolean.valueOf(replacementSpan != null), java.lang.Boolean.valueOf(replacementSpan2 != null), c42989rgn.EZpvd);
        c46731tchOLrzqt.OLrzqt(c42989rgn.AEQbTJ);
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c42989rgn);
        FragmentActivity fragmentActivity = activityKWHzl instanceof FragmentActivity ? (FragmentActivity) activityKWHzl : null;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            c46731tchOLrzqt.show(supportFragmentManager);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void setBottomTitle(java.lang.String str, java.lang.String str2, float f) {
        AppCompatTextView appCompatTextView = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if (appCompatTextView.getVisibility() == 0) {
            AppCompatTextView appCompatTextView2 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            if (appCompatTextView2.getVisibility() == 0) {
                android.text.TextPaint paint = this.copydefault.AEQbTJ.getPaint();
                paint.setTextSize(this.hDKMBd);
                float fMeasureText = paint.measureText(str);
                if (C33129mqd.valueOf(java.lang.Float.valueOf(java.lang.Math.max(fMeasureText, C55298xhM.dp$default(80, (android.content.Context) null, 1, (java.lang.Object) null)) + paint.measureText(str2)), java.lang.Integer.valueOf(AEQbTJ()))) {
                    float f2 = this.hDKMBd;
                    setBottomTextData(str, f2, str2, f2);
                    return;
                }
                paint.setTextSize(this.iwGUEr);
                float fMeasureText2 = paint.measureText(str2);
                if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText + fMeasureText2), java.lang.Integer.valueOf(AEQbTJ()))) {
                    setBottomTextData(str, this.hDKMBd, str2, this.iwGUEr);
                    return;
                }
                paint.setTextSize(this.iwGUEr);
                if (C33129mqd.valueOf(java.lang.Float.valueOf(paint.measureText(str) + fMeasureText2), java.lang.Integer.valueOf(AEQbTJ()))) {
                    float f3 = this.iwGUEr;
                    setBottomTextData(str, f3, str2, f3);
                    return;
                }
                Intrinsics.copydefault(paint);
                java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, OLrzqt(str, paint, (AEQbTJ() - fMeasureText2) - C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null)));
                java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) str) ? "" : "..."));
                float f4 = this.iwGUEr;
                setBottomTextData(strAEQbTJ, f4, str2, f4);
                return;
            }
        }
        AppCompatTextView appCompatTextView3 = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        if (appCompatTextView3.getVisibility() == 0) {
            this.copydefault.AEQbTJ.setMaxWidth(C55298xhM.dpInt$default(AEQbTJ() - f, (android.content.Context) null, 1, (java.lang.Object) null));
            android.text.TextPaint paint2 = this.copydefault.AEQbTJ.getPaint();
            paint2.setTextSize(this.hDKMBd);
            if (C33129mqd.valueOf(java.lang.Float.valueOf(paint2.measureText(str) + f), java.lang.Integer.valueOf(AEQbTJ()))) {
                float f5 = this.hDKMBd;
                setBottomTextData(str, f5, str2, f5);
                return;
            }
            paint2.setTextSize(this.iwGUEr);
            if (C33129mqd.valueOf(java.lang.Float.valueOf(paint2.measureText(str) + f), java.lang.Integer.valueOf(AEQbTJ()))) {
                float f6 = this.iwGUEr;
                setBottomTextData(str, f6, str2, f6);
                return;
            }
            Intrinsics.copydefault(paint2);
            java.lang.String strAkhnZx2 = C59454zhO.AkhnZx(str, OLrzqt(str, paint2, AEQbTJ() - f));
            java.lang.String strAEQbTJ2 = pTF.KWHzl.AEQbTJ(strAkhnZx2 + (Intrinsics.EZpvd((java.lang.Object) strAkhnZx2, (java.lang.Object) str) ? "" : "..."));
            float f7 = this.iwGUEr;
            setBottomTextData(strAEQbTJ2, f7, str2, f7);
            return;
        }
        float f8 = this.hDKMBd;
        setBottomTextData(str, f8, str2, f8);
    }

    public final void setBottomTextData(java.lang.String str, float f, java.lang.String str2, float f2) {
        AppCompatTextView appCompatTextView = this.copydefault.AEQbTJ;
        appCompatTextView.setTextSize(0, f);
        appCompatTextView.setText(str);
        AppCompatTextView appCompatTextView2 = this.copydefault.EZpvd;
        appCompatTextView2.setTextSize(0, f2);
        appCompatTextView2.setText(str2);
    }

    public final void setPriceLayoutVisible(boolean z) {
        AppCompatTextView appCompatTextView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView3 = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(z ? 0 : 8);
    }

    public final void setPriceLayoutVisible(boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z2 ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ = null;
    }
}
