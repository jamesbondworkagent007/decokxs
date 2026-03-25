package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.KLineTechPic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39846pzz extends ConstraintLayout {
    public AbstractC36117oPx EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39846pzz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39846pzz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.pzz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39846pzz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39846pzz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = (AbstractC36117oPx) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C35964oKf.Application.Th, this, true);
    }

    public final void setContent(@NotNull KLineTechPic kLineTechPic) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        android.widget.ImageView imageView5;
        android.widget.ImageView imageView6;
        android.widget.ImageView imageView7;
        java.lang.String timeframe;
        android.widget.ImageView imageView8;
        android.widget.ImageView imageView9;
        android.widget.ImageView imageView10;
        android.widget.ImageView imageView11;
        android.widget.ImageView imageView12;
        android.widget.ImageView imageView13;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        Intrinsics.checkNotNullParameter(kLineTechPic, "");
        AbstractC36117oPx abstractC36117oPx = this.EZpvd;
        if (abstractC36117oPx != null && (textView3 = abstractC36117oPx.OLrzqt) != null) {
            textView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.AkhnZx) + "\n\n" + C33070mpX.AYXKKw(C35964oKf.Fragment.fetchVPNInfo) + "\n\n" + C33070mpX.AYXKKw(C35964oKf.Fragment.values));
        }
        AbstractC36117oPx abstractC36117oPx2 = this.EZpvd;
        if (abstractC36117oPx2 != null && (textView2 = abstractC36117oPx2.AEQbTJ) != null) {
            textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DbNXlk) + "\n");
        }
        AbstractC36117oPx abstractC36117oPx3 = this.EZpvd;
        if (abstractC36117oPx3 != null && (textView = abstractC36117oPx3.copydefault) != null) {
            textView.setText(java.lang.String.valueOf(C33070mpX.AYXKKw(C35964oKf.Fragment.isConnected)));
        }
        if (C33512mxp.AEQbTJ.isConnected() == 1) {
            if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().DarRvM(), (java.lang.Object) "light")) {
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                if (C38303pTu.KWHzl(locale)) {
                    AbstractC36117oPx abstractC36117oPx4 = this.EZpvd;
                    if (abstractC36117oPx4 != null && (imageView13 = abstractC36117oPx4.values) != null) {
                        C33054mpH.AEQbTJ(imageView13, pFZ.KWHzl.EZpvd("kline_structure_red_raise_chinese_dark.webp"));
                    }
                } else {
                    AbstractC36117oPx abstractC36117oPx5 = this.EZpvd;
                    if (abstractC36117oPx5 != null && (imageView11 = abstractC36117oPx5.values) != null) {
                        C33054mpH.AEQbTJ(imageView11, pFZ.KWHzl.EZpvd("kline_structure_red_raise_other_language_dark.webp"));
                    }
                }
                AbstractC36117oPx abstractC36117oPx6 = this.EZpvd;
                if (abstractC36117oPx6 != null && (imageView12 = abstractC36117oPx6.DbNXlk) != null) {
                    C33054mpH.AEQbTJ(imageView12, pFZ.KWHzl.EZpvd("kline_structure_1_red_raise_dark.webp"));
                }
            } else {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                if (C38303pTu.KWHzl(locale2)) {
                    AbstractC36117oPx abstractC36117oPx7 = this.EZpvd;
                    if (abstractC36117oPx7 != null && (imageView10 = abstractC36117oPx7.values) != null) {
                        C33054mpH.AEQbTJ(imageView10, pFZ.KWHzl.EZpvd("kline_structure_red_raise_chinese.webp"));
                    }
                } else {
                    AbstractC36117oPx abstractC36117oPx8 = this.EZpvd;
                    if (abstractC36117oPx8 != null && (imageView8 = abstractC36117oPx8.values) != null) {
                        C33054mpH.AEQbTJ(imageView8, pFZ.KWHzl.EZpvd("kline_structure_red_raise_other_language.webp"));
                    }
                }
                AbstractC36117oPx abstractC36117oPx9 = this.EZpvd;
                if (abstractC36117oPx9 != null && (imageView9 = abstractC36117oPx9.DbNXlk) != null) {
                    C33054mpH.AEQbTJ(imageView9, pFZ.KWHzl.EZpvd("kline_structure_1_red_raise.webp"));
                }
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().DarRvM(), (java.lang.Object) "light")) {
            java.util.Locale locale3 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            if (C38303pTu.KWHzl(locale3)) {
                AbstractC36117oPx abstractC36117oPx10 = this.EZpvd;
                if (abstractC36117oPx10 != null && (imageView6 = abstractC36117oPx10.values) != null) {
                    C33054mpH.AEQbTJ(imageView6, pFZ.KWHzl.EZpvd("kline_structure_green_raise_chinese_dark.webp"));
                }
            } else {
                AbstractC36117oPx abstractC36117oPx11 = this.EZpvd;
                if (abstractC36117oPx11 != null && (imageView4 = abstractC36117oPx11.values) != null) {
                    C33054mpH.AEQbTJ(imageView4, pFZ.KWHzl.EZpvd("kline_structure_green_raise_other_language_dark.webp"));
                }
            }
            AbstractC36117oPx abstractC36117oPx12 = this.EZpvd;
            if (abstractC36117oPx12 != null && (imageView5 = abstractC36117oPx12.DbNXlk) != null) {
                C33054mpH.AEQbTJ(imageView5, pFZ.KWHzl.EZpvd("kline_structure_1_green_raise_dark.webp"));
            }
        } else {
            java.util.Locale locale4 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            if (C38303pTu.KWHzl(locale4)) {
                AbstractC36117oPx abstractC36117oPx13 = this.EZpvd;
                if (abstractC36117oPx13 != null && (imageView3 = abstractC36117oPx13.values) != null) {
                    C33054mpH.AEQbTJ(imageView3, pFZ.KWHzl.EZpvd("kline_structure_green_raise_chinese.webp"));
                }
            } else {
                AbstractC36117oPx abstractC36117oPx14 = this.EZpvd;
                if (abstractC36117oPx14 != null && (imageView = abstractC36117oPx14.values) != null) {
                    C33054mpH.AEQbTJ(imageView, pFZ.KWHzl.EZpvd("kline_structure_green_raise_other_language.webp"));
                }
            }
            AbstractC36117oPx abstractC36117oPx15 = this.EZpvd;
            if (abstractC36117oPx15 != null && (imageView2 = abstractC36117oPx15.DbNXlk) != null) {
                C33054mpH.AEQbTJ(imageView2, pFZ.KWHzl.EZpvd("kline_structure_1_green_raise.webp"));
            }
        }
        AbstractC36117oPx abstractC36117oPx16 = this.EZpvd;
        if (abstractC36117oPx16 == null || (imageView7 = abstractC36117oPx16.fetchVPNInfo) == null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            timeframe = kLineTechPic.getBlack_timeframe();
        } else if (!Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) && C33492mxV.OLrzqt()) {
            timeframe = kLineTechPic.getBlack_timeframe();
        } else {
            timeframe = kLineTechPic.getTimeframe();
        }
        C33054mpH.loadRoundImage$default(imageView7, timeframe, 0, 2, null);
    }
}
