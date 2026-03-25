package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27193jqa extends ConstraintLayout {
    public iLP OLrzqt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27193jqa(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27193jqa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27193jqa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    private final void OLrzqt() {
        this.OLrzqt = (iLP) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C25493ixk.Activity.geLlBI, this, true);
    }

    public final void setData(InvestExchangeRateBean investExchangeRateBean) {
        iLP ilp = this.OLrzqt;
        if (ilp != null) {
            if (investExchangeRateBean == null || investExchangeRateBean.getExchangeRate().length() == 0) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            java.lang.String strLimitFmtNoZeroWithKMB$default = C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investExchangeRateBean.getExchangeRate(), 6, 2, false, false, 24, null);
            java.lang.String localized$default = pTB.formatLocalized$default("1", null, 1, null);
            java.lang.String fromTokenSymbol = investExchangeRateBean.getFromTokenSymbol();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.QVsKAR);
            java.lang.String toTokenSymbol = investExchangeRateBean.getToTokenSymbol();
            ilp.KWHzl.setText(localized$default + " " + fromTokenSymbol + " " + strAYXKKw + " " + strLimitFmtNoZeroWithKMB$default + " " + toTokenSymbol);
        }
    }

    public final void KWHzl() {
        iLP ilp = this.OLrzqt;
        if (ilp != null) {
            ilp.KWHzl.setText("--");
        }
    }
}
