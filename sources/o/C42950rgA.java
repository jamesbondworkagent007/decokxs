package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C46731tch;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42950rgA extends C40499qYc {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ;
    public final float EZpvd;
    public final C42868reY OLrzqt;
    public final float copydefault;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42950rgA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42950rgA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.rgA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42950rgA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42950rgA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = 16;
        this.valueOf = 12;
        this.copydefault = C55298xhM.gEmmrt(16.0f, context);
        this.EZpvd = C55298xhM.gEmmrt(12.0f, context);
        C42868reY c42868reYKWHzl = C42868reY.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42868reYKWHzl, "");
        this.OLrzqt = c42868reYKWHzl;
        if (isInEditMode()) {
            setData$OKMarket_market_impl$default(this, false, "MOODENG", "0xb7...23s1", "$16.25M•$10.46M", "$0.0000061", "+5.19%", UpDownColor.UP, null, 100, false, false, false, "", null, 9856, null);
        }
    }

    /* JADX INFO: renamed from: o.rgA$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rgA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: o.rgA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$OKMarket_market_impl$default(C42950rgA c42950rgA, boolean z, java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, UpDownColor upDownColor, java.lang.String str2, int i, boolean z2, boolean z3, boolean z4, java.lang.String str3, Function1 function1, int i2, java.lang.Object obj) {
        c42950rgA.setData$OKMarket_market_impl(z, str, charSequence, charSequence2, charSequence3, charSequence4, upDownColor, (i2 & 128) != 0 ? null : str2, i, (i2 & 512) != 0 ? true : z2, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? "" : str3, (i2 & 8192) != 0 ? null : function1);
    }

    public final void setData$OKMarket_market_impl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, @NotNull java.lang.CharSequence charSequence4, UpDownColor upDownColor, java.lang.String str2, int i, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str3, Function1<? super java.lang.String, Unit> function1) {
        java.lang.CharSequence charSequenceOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AppCompatTextView appCompatTextView = this.OLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z2 ? 0 : 8);
        AppCompatImageView appCompatImageView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z2 ^ true ? 0 : 8);
        C42991rgp c42991rgp = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c42991rgp, "");
        c42991rgp.setVisibility(z ? 0 : 8);
        this.OLrzqt.gEmmrt.setText(charSequence3);
        AppCompatTextView appCompatTextView2 = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C41426qqb.EZpvd(appCompatTextView2, charSequence4, upDownColor);
        this.OLrzqt.valueOf.setText(charSequence2);
        boolean z5 = z4 && C27563jxZ.OLrzqt.EZpvd();
        C42979rgd c42979rgd = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c42979rgd, "");
        c42979rgd.setVisibility(z5 ? 0 : 8);
        this.OLrzqt.OLrzqt.setBoostTag(str3, java.lang.Boolean.valueOf(z5));
        C42979rgd c42979rgd2 = this.OLrzqt.OLrzqt;
        c42979rgd2.setOnClickListener(new ActionBar(c42979rgd2, 1000L, this, str3, function1));
        C42991rgp c42991rgp2 = this.OLrzqt.KWHzl;
        c42991rgp2.setOnClickListener(new Activity(c42991rgp2, 1000L, this, str3, function1));
        setCellTextStyle(str, charSequence3, str2, i);
        AppCompatTextView appCompatTextView3 = this.OLrzqt.AhwBna;
        if (z3) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(charSequence);
            charSequenceOLrzqt = OLrzqt(strGEmmrt, strGEmmrt);
        } else {
            charSequenceOLrzqt = charSequence;
        }
        appCompatTextView3.setText(charSequenceOLrzqt);
    }

    public final void OLrzqt(java.lang.String str, Function1<? super java.lang.String, Unit> function1) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        C46731tch.TaskDescription taskDescription = C46731tch.Companion;
        C42991rgp c42991rgp = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c42991rgp, "");
        boolean z = c42991rgp.getVisibility() == 0;
        C42979rgd c42979rgd = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c42979rgd, "");
        C46731tch c46731tchOLrzqt = taskDescription.OLrzqt(java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(c42979rgd.getVisibility() == 0), str);
        c46731tchOLrzqt.OLrzqt(function1);
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(this);
        FragmentActivity fragmentActivity = activityKWHzl instanceof FragmentActivity ? (FragmentActivity) activityKWHzl : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        c46731tchOLrzqt.show(supportFragmentManager);
    }

    public static /* synthetic */ void setCellTextStyle$default(C42950rgA c42950rgA, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        c42950rgA.setCellTextStyle(str, charSequence, str2, i);
    }

    public final void setCellTextStyle(java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, int i) {
        float width;
        float fDjBIcL;
        android.text.TextPaint paint = this.OLrzqt.AYXKKw.getPaint();
        paint.setTextSize(this.copydefault);
        float fMeasureText = paint.measureText(str);
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(charSequence);
        float fMeasureText2 = paint.measureText(strGEmmrt);
        AppCompatTextView appCompatTextView = this.OLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if (appCompatTextView.getVisibility() == 0) {
            AppCompatTextView appCompatTextView2 = this.OLrzqt.djBIcL;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            width = C55296xhK.viewToBitmap$default(appCompatTextView2, 0, 0, 3, null) != null ? r7.getWidth() + C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null) : C55298xhM.dp$default(20, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            width = 0.0f;
        }
        C42991rgp c42991rgp = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c42991rgp, "");
        float fDp$default = c42991rgp.getVisibility() == 0 ? C55298xhM.dp$default(20, (android.content.Context) null, 1, (java.lang.Object) null) : 0.0f;
        AppCompatImageView appCompatImageView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        float fDp$default2 = appCompatImageView.getVisibility() == 0 ? C55298xhM.dp$default(18, (android.content.Context) null, 1, (java.lang.Object) null) : 0.0f;
        C42979rgd c42979rgd = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c42979rgd, "");
        if (c42979rgd.getVisibility() == 0) {
            C42979rgd c42979rgd2 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c42979rgd2, "");
            android.graphics.Bitmap bitmapViewToBitmap$default = C55296xhK.viewToBitmap$default(c42979rgd2, 0, 0, 3, null);
            fDjBIcL = bitmapViewToBitmap$default != null ? C33129mqd.djBIcL(java.lang.Integer.valueOf(bitmapViewToBitmap$default.getWidth())) : C55298xhM.dp$default(53, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            fDjBIcL = 0.0f;
        }
        float f = width + fDp$default + fDp$default2 + fDjBIcL;
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText2 + fMeasureText + f), java.lang.Integer.valueOf(i))) {
            int i2 = this.AEQbTJ;
            setTitleText(str, i2, i2, str2);
            return;
        }
        paint.setTextSize(this.EZpvd);
        float fMeasureText3 = paint.measureText(strGEmmrt);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText + fMeasureText3 + f), java.lang.Integer.valueOf(i))) {
            int i3 = this.valueOf;
            int i4 = this.AEQbTJ - 1;
            if (i3 <= i4) {
                while (true) {
                    paint.setTextSize(C55298xhM.dp$default(i4, (android.content.Context) null, 1, (java.lang.Object) null));
                    if (!C33129mqd.valueOf(java.lang.Float.valueOf(paint.measureText(strGEmmrt) + fMeasureText + f), java.lang.Integer.valueOf(i))) {
                        if (i4 == i3) {
                            break;
                        } else {
                            i4--;
                        }
                    } else {
                        i3 = i4;
                        break;
                    }
                }
            }
            setTitleText(str, this.AEQbTJ, i3, str2);
            return;
        }
        paint.setTextSize(this.EZpvd);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(paint.measureText(str) + fMeasureText3 + f), java.lang.Integer.valueOf(i))) {
            int i5 = this.valueOf;
            int i6 = this.AEQbTJ - 1;
            if (i5 <= i6) {
                while (true) {
                    paint.setTextSize(C55298xhM.dp$default(i6, (android.content.Context) null, 1, (java.lang.Object) null));
                    if (!C33129mqd.valueOf(java.lang.Float.valueOf(paint.measureText(str) + fMeasureText3 + f), java.lang.Integer.valueOf(i))) {
                        if (i6 == i5) {
                            break;
                        } else {
                            i6--;
                        }
                    } else {
                        i5 = i6;
                        break;
                    }
                }
            }
            setTitleText(str, i5, this.valueOf, str2);
            return;
        }
        Intrinsics.copydefault(paint);
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, OLrzqt(str, paint, ((i - fMeasureText3) - f) - C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null)));
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) str) ? "" : "..."));
            int i7 = this.valueOf;
            setTitleText(strAEQbTJ, i7, i7, str2);
            return;
        }
        int i8 = this.valueOf;
        setTitleText(str, i8, i8, str2);
    }

    /* JADX INFO: renamed from: o.rgA$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ C42950rgA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42950rgA c42950rgA, java.lang.String str, Function1 function1) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c42950rgA;
            this.EZpvd = str;
            this.OLrzqt = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.OLrzqt(this.EZpvd, (Function1<? super java.lang.String, Unit>) this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.rgA$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42950rgA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42950rgA c42950rgA, java.lang.String str, Function1 function1) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c42950rgA;
            this.AEQbTJ = str;
            this.EZpvd = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.OLrzqt(this.AEQbTJ, (Function1<? super java.lang.String, Unit>) this.EZpvd);
            }
        }
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

    public static /* synthetic */ void setTitleText$default(C42950rgA c42950rgA, java.lang.String str, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        c42950rgA.setTitleText(str, i, i2, str2);
    }

    public final void setTitleText(java.lang.String str, int i, int i2, java.lang.String str2) {
        AppCompatTextView appCompatTextView = this.OLrzqt.AYXKKw;
        if (str2 == null) {
            str2 = "";
        }
        appCompatTextView.setText(OLrzqt(str, str2));
        this.OLrzqt.AYXKKw.setTextSize(2, C33129mqd.djBIcL(java.lang.Integer.valueOf(i)));
        this.OLrzqt.gEmmrt.setTextSize(2, C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)));
    }

    public final java.lang.CharSequence OLrzqt(java.lang.String str, java.lang.String str2) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return str;
        }
        java.lang.String strCopydefault = C6798aWF.copydefault(str);
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strCopydefault.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.util.List<kotlin.Pair> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) AEQbTJ(lowerCase, lowerCase2));
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) " ", false, 2, (java.lang.Object) null)) {
            java.lang.String strReplace$default = C59449zhJ.replace$default(str2, " ", "", false, 4, (java.lang.Object) null);
            if (strReplace$default.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) strReplace$default, (java.lang.Object) str2)) {
                java.util.Locale locale3 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                java.lang.String lowerCase3 = strCopydefault.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                java.util.Locale locale4 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "");
                java.lang.String lowerCase4 = strReplace$default.toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                listFJNWhG.addAll(AEQbTJ(lowerCase3, lowerCase4));
            }
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        try {
            for (kotlin.Pair pair : listFJNWhG) {
                if (((java.lang.Number) pair.getFirst()).intValue() + ((java.lang.Number) pair.getSecond()).intValue() <= strCopydefault.length()) {
                    if (C33492mxV.OLrzqt()) {
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dSJNDS)), ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getFirst()).intValue() + ((java.lang.Number) pair.getSecond()).intValue(), 33);
                    }
                    spannableString.setSpan(new android.text.style.BackgroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iRxXKY)), ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getFirst()).intValue() + ((java.lang.Number) pair.getSecond()).intValue(), 33);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return spannableString;
    }

    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return arrayList;
        }
        int length = 0;
        while (StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, length, false, 4, (java.lang.Object) null) != -1) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, length, false, 4, (java.lang.Object) null);
            arrayList.add(C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(str2.length())));
            length = iIndexOf$default + str2.length();
        }
        return arrayList;
    }
}
