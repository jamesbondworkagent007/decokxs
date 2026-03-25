package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27220jrA extends ConstraintLayout {
    public iMY EZpvd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27220jrA(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27220jrA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27220jrA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    private final void KWHzl() {
        iMY imyOLrzqt = iMY.OLrzqt(android.view.LayoutInflater.from(getContext()), this, false);
        this.EZpvd = imyOLrzqt;
        if (imyOLrzqt == null) {
            Intrinsics.gEmmrt("");
            imyOLrzqt = null;
        }
        addView(imyOLrzqt.getRoot());
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iMY imy = this.EZpvd;
        if (imy == null) {
            Intrinsics.gEmmrt("");
            imy = null;
        }
        imy.valueOf.setText(str);
    }

    public final void setData(InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, boolean z, boolean z2) {
        iMY imy = this.EZpvd;
        iMY imy2 = null;
        if (imy == null) {
            Intrinsics.gEmmrt("");
            imy = null;
        }
        android.widget.LinearLayout linearLayout = imy.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        iMY imy3 = this.EZpvd;
        if (imy3 == null) {
            Intrinsics.gEmmrt("");
            imy3 = null;
        }
        ConstraintLayout constraintLayout = imy3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        iMY imy4 = this.EZpvd;
        if (imy4 == null) {
            Intrinsics.gEmmrt("");
            imy4 = null;
        }
        ConstraintLayout constraintLayout2 = imy4.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
        if (investTokenWithAmount != null && investTokenWithAmount.getTokenSymbol().length() > 0) {
            iMY imy5 = this.EZpvd;
            if (imy5 == null) {
                Intrinsics.gEmmrt("");
                imy5 = null;
            }
            ConstraintLayout constraintLayout3 = imy5.EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            iMY imy6 = this.EZpvd;
            if (imy6 == null) {
                Intrinsics.gEmmrt("");
                imy6 = null;
            }
            android.widget.ImageView imageView = imy6.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            iMY imy7 = this.EZpvd;
            if (imy7 == null) {
                Intrinsics.gEmmrt("");
                imy7 = null;
            }
            android.widget.TextView textView = imy7.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            setRewardItem(imageView, textView, investTokenWithAmount, z, z2);
        }
        if (investTokenWithAmount2 == null || investTokenWithAmount2.getTokenSymbol().length() <= 0) {
            return;
        }
        iMY imy8 = this.EZpvd;
        if (imy8 == null) {
            Intrinsics.gEmmrt("");
            imy8 = null;
        }
        ConstraintLayout constraintLayout4 = imy8.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
        constraintLayout4.setVisibility(0);
        iMY imy9 = this.EZpvd;
        if (imy9 == null) {
            Intrinsics.gEmmrt("");
            imy9 = null;
        }
        android.widget.ImageView imageView2 = imy9.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        iMY imy10 = this.EZpvd;
        if (imy10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imy2 = imy10;
        }
        android.widget.TextView textView2 = imy2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        setRewardItem(imageView2, textView2, investTokenWithAmount2, z, z2);
    }

    public final void setRewardItem(android.widget.ImageView imageView, android.widget.TextView textView, InvestTokenWithAmount investTokenWithAmount, boolean z, boolean z2) {
        java.lang.String str;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investTokenWithAmount.getTokenLogo())) {
            imageView.setVisibility(0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        } else {
            imageView.setVisibility(8);
        }
        if (z) {
            str = C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, "0", 6, 2, false, false, 24, null) + " " + investTokenWithAmount.getTokenSymbol();
        } else if (z2) {
            str = "-- " + investTokenWithAmount.getTokenSymbol();
        } else if (investTokenWithAmount.getDataType() == InvestTokenType.TRADING_FEE) {
            str = C27492jwH.OLrzqt.KWHzl(investTokenWithAmount.getCurrencyAmount()) + " " + getContext().getString(C25493ixk.FragmentManager.DQnQnb);
        } else {
            str = C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null) + " " + investTokenWithAmount.getTokenSymbol();
        }
        textView.setText(str);
    }
}
