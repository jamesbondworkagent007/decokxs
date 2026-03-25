package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.okinc.web3Uilib.bean.TransferAssetInfoBean;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.yiP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57435yiP extends ConstraintLayout {
    public final C57385yhS AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57435yiP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57435yiP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.yiP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57435yiP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57435yiP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57385yhS c57385yhSCopydefault = C57385yhS.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57385yhSCopydefault, "");
        this.AEQbTJ = c57385yhSCopydefault;
        C57483yjK c57483yjKAEQbTJ = c57385yhSCopydefault.EZpvd.AEQbTJ();
        if (c57483yjKAEQbTJ != null) {
            c57483yjKAEQbTJ.copydefault(18.0f, 38.0f);
        }
        C57483yjK c57483yjKAEQbTJ2 = c57385yhSCopydefault.OLrzqt.AEQbTJ();
        if (c57483yjKAEQbTJ2 != null) {
            c57483yjKAEQbTJ2.copydefault(12.0f, 12.0f);
        }
        C57483yjK c57483yjKAEQbTJ3 = c57385yhSCopydefault.OLrzqt.AEQbTJ();
        if (c57483yjKAEQbTJ3 != null) {
            c57483yjKAEQbTJ3.KWHzl(1);
        }
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
    }

    public final void setViewDataBean(@NotNull TransferAssetInfoBean transferAssetInfoBean) {
        Intrinsics.checkNotNullParameter(transferAssetInfoBean, "");
        copydefault(transferAssetInfoBean);
        KWHzl(transferAssetInfoBean);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(TransferAssetInfoBean transferAssetInfoBean) {
        java.lang.String subtitleTagContent;
        int measuredWidth;
        java.lang.String subtitleTagContent2;
        int measuredWidth2;
        java.lang.String subtitleTagContent3;
        android.widget.TextView textViewEZpvd;
        android.text.TextPaint paint;
        java.lang.String titleTagContent = transferAssetInfoBean.getTitleTagContent();
        java.lang.String subtitleTagContent4 = (titleTagContent == null || titleTagContent.length() == 0) ? transferAssetInfoBean.getSubtitleTagContent() : transferAssetInfoBean.getTitleTagContent();
        C55251xgS c55251xgSCopydefault = this.AEQbTJ.EZpvd.copydefault();
        if (c55251xgSCopydefault != null) {
            C55307xhV.AEQbTJ(c55251xgSCopydefault, subtitleTagContent4);
        }
        int direction = transferAssetInfoBean.getDirection();
        java.lang.String str = direction != 1 ? direction != 2 ? "" : "-" : Marker.ANY_NON_NULL_MARKER;
        int iAEQbTJ = C33570myu.AEQbTJ();
        java.lang.String titleTagContent2 = transferAssetInfoBean.getTitleTagContent();
        int iDp2px$default = C55298xhM.dp2px$default(48.0f, null, 1, null) + C55298xhM.dp2px$default(4.0f, null, 1, null) + (((titleTagContent2 == null || titleTagContent2.length() == 0) && ((subtitleTagContent = transferAssetInfoBean.getSubtitleTagContent()) == null || subtitleTagContent.length() == 0)) ? 0 : C55298xhM.dp2px$default(4.0f, null, 1, null));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setTextSize(18.0f);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str + transferAssetInfoBean.getTitleContent());
        if (transferAssetInfoBean.getTitleSymbol().length() > 0 && transferAssetInfoBean.getTitleContent().length() > 0) {
            spannableStringBuilder.append((java.lang.CharSequence) " ").append(C57490yjR.AEQbTJ(transferAssetInfoBean.getTitleSymbol(), 12));
        } else {
            spannableStringBuilder.append(C57490yjR.AEQbTJ(transferAssetInfoBean.getTitleSymbol(), 12));
        }
        float fMeasureText = textView.getPaint().measureText(spannableStringBuilder.toString());
        AppCompatImageView appCompatImageView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        if (appCompatImageView.getVisibility() == 0) {
            this.AEQbTJ.KWHzl.measure(iMakeMeasureSpec, 0);
            measuredWidth = this.AEQbTJ.KWHzl.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        java.lang.String titleTagContent3 = transferAssetInfoBean.getTitleTagContent();
        if ((titleTagContent3 == null || titleTagContent3.length() == 0) && ((subtitleTagContent2 = transferAssetInfoBean.getSubtitleTagContent()) == null || subtitleTagContent2.length() == 0)) {
            measuredWidth2 = 0;
        } else {
            C55251xgS c55251xgSCopydefault2 = this.AEQbTJ.EZpvd.copydefault();
            if (c55251xgSCopydefault2 != null) {
                c55251xgSCopydefault2.measure(iMakeMeasureSpec, 0);
            }
            C55251xgS c55251xgSCopydefault3 = this.AEQbTJ.EZpvd.copydefault();
            if (c55251xgSCopydefault3 != null) {
                measuredWidth2 = c55251xgSCopydefault3.getMeasuredWidth();
            }
        }
        android.widget.TextView textViewEZpvd2 = this.AEQbTJ.EZpvd.EZpvd();
        if (textViewEZpvd2 != null) {
            textViewEZpvd2.setTextAppearance(C52761wXj.LoaderManager.QSLkRj);
        }
        android.widget.TextView textViewEZpvd3 = this.AEQbTJ.EZpvd.EZpvd();
        if (textViewEZpvd3 != null) {
            textViewEZpvd3.setTextSize(12.0f);
        }
        C57488yjP c57488yjP = this.AEQbTJ.EZpvd;
        float fMeasureText2 = (c57488yjP == null || (textViewEZpvd = c57488yjP.EZpvd()) == null || (paint = textViewEZpvd.getPaint()) == null) ? 0.0f : paint.measureText(transferAssetInfoBean.getSubContent());
        java.lang.String titleTagContent4 = transferAssetInfoBean.getTitleTagContent();
        if ((titleTagContent4 != null && titleTagContent4.length() != 0) || ((subtitleTagContent3 = transferAssetInfoBean.getSubtitleTagContent()) != null && subtitleTagContent3.length() != 0)) {
            fMeasureText += measuredWidth2;
        }
        if (fMeasureText + fMeasureText2 >= (iAEQbTJ - iDp2px$default) - measuredWidth) {
            C55251xgS c55251xgSCopydefault4 = this.AEQbTJ.EZpvd.copydefault();
            if (c55251xgSCopydefault4 != null) {
                c55251xgSCopydefault4.setVisibility(8);
            }
            AEQbTJ(transferAssetInfoBean);
            EZpvd(transferAssetInfoBean);
            return;
        }
        C57488yjP c57488yjP2 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57488yjP2, "");
        c57488yjP2.setVisibility(8);
        C57483yjK c57483yjKAEQbTJ = this.AEQbTJ.EZpvd.AEQbTJ();
        if (c57483yjKAEQbTJ != null) {
            c57483yjKAEQbTJ.setWidth((((iAEQbTJ - measuredWidth) - ((int) fMeasureText2)) - measuredWidth2) - iDp2px$default);
        }
        AEQbTJ(transferAssetInfoBean);
        android.widget.TextView textViewEZpvd4 = this.AEQbTJ.EZpvd.EZpvd();
        if (textViewEZpvd4 != null) {
            textViewEZpvd4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        android.widget.TextView textViewEZpvd5 = this.AEQbTJ.EZpvd.EZpvd();
        if (textViewEZpvd5 != null) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(transferAssetInfoBean.getSubContent());
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder2.length(), 33);
            C55307xhV.AEQbTJ(textViewEZpvd5, spannableStringBuilder2);
        }
    }

    public final void copydefault(TransferAssetInfoBean transferAssetInfoBean) {
        AbstractC5461Sp abstractC5461SpEZpvd;
        if (transferAssetInfoBean.getIconRes() == null && transferAssetInfoBean.getDefaultIcon() == null) {
            this.AEQbTJ.KWHzl.setVisibility(8);
            return;
        }
        this.AEQbTJ.KWHzl.setVisibility(0);
        java.lang.Object iconRes = transferAssetInfoBean.getIconRes();
        if (iconRes == null) {
            iconRes = transferAssetInfoBean.getDefaultIcon();
        }
        if (iconRes instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) iconRes;
            C5448Sc c5448ScAEQbTJ = AEQbTJ(str);
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                str = "SVG:" + iconRes;
            }
            abstractC5461SpEZpvd = Glide.KWHzl(this.AEQbTJ.KWHzl).EZpvd(str).OLrzqt((RX<?>) c5448ScAEQbTJ).EZpvd(transferAssetInfoBean.getDefaultIcon()).OLrzqt(transferAssetInfoBean.getDefaultIcon()).AEQbTJ(transferAssetInfoBean.getDefaultIcon()).EZpvd((NN<android.graphics.Bitmap>) new RoundedCornersTransformation(transferAssetInfoBean.getIconRoundedRadius(), 0)).EZpvd((android.widget.ImageView) this.AEQbTJ.KWHzl);
        } else {
            abstractC5461SpEZpvd = Glide.KWHzl(this.AEQbTJ.KWHzl).KWHzl(transferAssetInfoBean.getIconRes()).EZpvd(transferAssetInfoBean.getDefaultIcon()).OLrzqt(transferAssetInfoBean.getDefaultIcon()).AEQbTJ(transferAssetInfoBean.getDefaultIcon()).EZpvd((NN<android.graphics.Bitmap>) new RoundedCornersTransformation(transferAssetInfoBean.getIconRoundedRadius(), 0)).EZpvd((android.widget.ImageView) this.AEQbTJ.KWHzl);
        }
        Intrinsics.copydefault(abstractC5461SpEZpvd);
    }

    public final void AEQbTJ(TransferAssetInfoBean transferAssetInfoBean) {
        int direction = transferAssetInfoBean.getDirection();
        java.lang.String str = direction != 1 ? direction != 2 ? "" : "-" : Marker.ANY_NON_NULL_MARKER;
        C57483yjK c57483yjKAEQbTJ = this.AEQbTJ.EZpvd.AEQbTJ();
        if (c57483yjKAEQbTJ != null) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str + transferAssetInfoBean.getTitleContent());
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(C57490yjR.AEQbTJ(transferAssetInfoBean.getTitleSymbol(), 12));
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder2.length(), 33);
            Unit unit = Unit.INSTANCE;
            c57483yjKAEQbTJ.setNumberAndUnitText(spannableStringBuilder, spannableStringBuilder2, true);
        }
    }

    public final void EZpvd(TransferAssetInfoBean transferAssetInfoBean) {
        this.AEQbTJ.OLrzqt.setVisibility(transferAssetInfoBean.getSubContent().length() == 0 ? 8 : 0);
        C57483yjK c57483yjKAEQbTJ = this.AEQbTJ.OLrzqt.AEQbTJ();
        if (c57483yjKAEQbTJ != null) {
            c57483yjKAEQbTJ.setTextAppearance(C52761wXj.LoaderManager.QSLkRj);
        }
        C57483yjK c57483yjKAEQbTJ2 = this.AEQbTJ.OLrzqt.AEQbTJ();
        if (c57483yjKAEQbTJ2 != null) {
            c57483yjKAEQbTJ2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        C57483yjK c57483yjKAEQbTJ3 = this.AEQbTJ.OLrzqt.AEQbTJ();
        if (c57483yjKAEQbTJ3 != null) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(transferAssetInfoBean.getSubContent());
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder.length(), 33);
            C57483yjK.setNumberAndUnitText$default(c57483yjKAEQbTJ3, spannableStringBuilder, "", false, 4, null);
        }
        C55251xgS c55251xgSCopydefault = this.AEQbTJ.OLrzqt.copydefault();
        if (c55251xgSCopydefault != null) {
            C55307xhV.AEQbTJ(c55251xgSCopydefault, transferAssetInfoBean.getSubtitleTagContent());
        }
    }

    public final C5448Sc AEQbTJ(java.lang.String str) {
        C5448Sc c5448Sc;
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }
}
