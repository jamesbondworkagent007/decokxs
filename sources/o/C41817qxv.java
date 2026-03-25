package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41817qxv extends ConstraintLayout {
    public final C42940rfr AEQbTJ;
    public final float AhwBna;
    public final float EZpvd;
    public final float KWHzl;
    public final float OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41817qxv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41817qxv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.qxv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41817qxv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41817qxv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42940rfr c42940rfrOLrzqt = C42940rfr.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42940rfrOLrzqt, "");
        this.AEQbTJ = c42940rfrOLrzqt;
        this.KWHzl = C55298xhM.sp2pxFloat$default(15.0f, null, 1, null);
        this.AhwBna = C55298xhM.sp2pxFloat$default(14.0f, null, 1, null);
        this.EZpvd = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        this.OLrzqt = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        this.copydefault = C55298xhM.sp2pxFloat$default(10.0f, null, 1, null);
    }

    public static /* synthetic */ void setData$default(C41817qxv c41817qxv, kotlin.Pair pair, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c41817qxv.setData(pair, str, str2, str3, z);
    }

    public final void setData(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pair.getSecond())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                str4 = ((java.lang.Object) pair.getSecond()) + " / ";
            } else {
                str4 = " / " + ((java.lang.Object) pair.getSecond());
            }
        }
        setAdaptiveTitle(pair.getFirst(), str4, str, str3, str2, z);
        AppCompatTextView appCompatTextView = this.AEQbTJ.copydefault;
        Intrinsics.copydefault(appCompatTextView);
        int i = 8;
        appCompatTextView.setVisibility((appCompatTextView.getVisibility() == 0 && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true)) ? 0 : 8);
        appCompatTextView.setText(str);
        AppCompatTextView appCompatTextView2 = this.AEQbTJ.EZpvd;
        Intrinsics.copydefault(appCompatTextView2);
        if (appCompatTextView2.getVisibility() == 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3))) {
            i = 0;
        }
        appCompatTextView2.setVisibility(i);
        appCompatTextView2.setText(str3);
    }

    public final void setAdaptiveTitle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        int iDjBIcL;
        int iDpInt$default;
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        java.lang.StringBuilder sb3;
        java.lang.StringBuilder sb4;
        android.text.TextPaint paint = this.AEQbTJ.AEQbTJ.getPaint();
        if (z) {
            iDjBIcL = (((C33570myu.djBIcL(getContext()) - C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(92, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
            iDpInt$default = C55298xhM.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            iDjBIcL = ((C33570myu.djBIcL(getContext()) - C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(92, (android.content.Context) null, 1, (java.lang.Object) null);
            iDpInt$default = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        int i = iDjBIcL - iDpInt$default;
        paint.setTextSize(this.KWHzl);
        float fMeasureText = paint.measureText(str);
        float fMeasureText2 = paint.measureText(str5);
        paint.setTextSize(this.AhwBna);
        float fMeasureText3 = paint.measureText(str2);
        paint.setTextSize(this.OLrzqt);
        float fMeasureText4 = paint.measureText(str3);
        float fMax = java.lang.Math.max(fMeasureText4, fMeasureText + fMeasureText3);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText2 + fMax), java.lang.Integer.valueOf(i))) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str2);
                sb4.append(str);
            } else {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(str2);
            }
            java.lang.String string = sb4.toString();
            int i2 = C32113mPz.Dialog.gHZMYf;
            float f = this.KWHzl;
            setTextData$default(this, string, str, str2, str5, str3, i2, f, f, false, 256, null);
            return;
        }
        paint.setTextSize(this.EZpvd);
        float fMeasureText5 = paint.measureText(str5);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMax + fMeasureText5), java.lang.Integer.valueOf(i))) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (C55296xhK.OLrzqt(context2)) {
                sb3 = new java.lang.StringBuilder();
                sb3.append(str2);
                sb3.append(str);
            } else {
                sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(str2);
            }
            setTextData$default(this, sb3.toString(), str, str2, str5, str3, C32113mPz.Dialog.gHZMYf, this.EZpvd, this.KWHzl, false, 256, null);
            return;
        }
        paint.setTextSize(this.EZpvd);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(java.lang.Math.max(fMeasureText4, paint.measureText(str) + fMeasureText3) + fMeasureText5), java.lang.Integer.valueOf(i))) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            if (C55296xhK.OLrzqt(context3)) {
                sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(str);
            } else {
                sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(str2);
            }
            java.lang.String string2 = sb2.toString();
            int i3 = qZH.FragmentManager.AEQbTJ;
            float f2 = this.EZpvd;
            setTextData$default(this, string2, str, str2, str5, str3, i3, f2, f2, false, 256, null);
            return;
        }
        paint.setTextSize(this.OLrzqt);
        float fMeasureText6 = paint.measureText(str);
        float fMeasureText7 = paint.measureText(str2);
        float fMeasureText8 = paint.measureText(str5);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(java.lang.Math.max(fMeasureText4, fMeasureText6 + fMeasureText7) + fMeasureText8), java.lang.Integer.valueOf(i))) {
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            if (C55296xhK.OLrzqt(context4)) {
                sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(str);
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(str2);
            }
            java.lang.String string3 = sb.toString();
            int i4 = C32113mPz.Dialog.AuCTelauCTel;
            float f3 = this.OLrzqt;
            setTextData$default(this, string3, str, str2, str5, str3, i4, f3, f3, false, 256, null);
            return;
        }
        Intrinsics.copydefault(paint);
        float fDpInt$default = i - fMeasureText8;
        if (z) {
            fDpInt$default -= C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, EZpvd(str, paint, fDpInt$default));
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + "...");
            int i5 = qZH.FragmentManager.AEQbTJ;
            float f4 = this.OLrzqt;
            setTextData(strAEQbTJ + "\n" + str2, strAEQbTJ, str2, str5, str3, i5, f4, f4, true);
            return;
        }
        int i6 = qZH.FragmentManager.AEQbTJ;
        float f5 = this.copydefault;
        setTextData$default(this, "...", "...", str2, str5, str3, i6, f5, f5, false, 256, null);
    }

    public final int EZpvd(java.lang.String str, android.graphics.Paint paint, float f) {
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

    public static /* synthetic */ void setTextData$default(C41817qxv c41817qxv, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, float f, float f2, boolean z, int i2, java.lang.Object obj) {
        c41817qxv.setTextData(str, str2, str3, str4, str5, i, f, f2, (i2 & 256) != 0 ? false : z);
    }

    public final void setTextData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final int i, float f, float f2, boolean z) {
        this.AEQbTJ.AEQbTJ.setText(StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(java.lang.String.valueOf(str), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.qxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41817qxv.copydefault(this.AEQbTJ, i, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str3}, 0, null, false, new Function1() { // from class: o.qxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41817qxv.EZpvd(this.copydefault, (java.util.List) obj);
            }
        }, 14, null)));
        this.AEQbTJ.OLrzqt.setTextSize(0, f);
        this.AEQbTJ.OLrzqt.setText(str4);
        this.AEQbTJ.copydefault.setText(str5);
    }

    public static final Unit copydefault(C41817qxv c41817qxv, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c41817qxv.getContext(), i));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C41817qxv c41817qxv, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c41817qxv.getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public final void setPriceLayoutVisible(boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z2 ? 0 : 8);
    }
}
