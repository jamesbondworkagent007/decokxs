package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14786dry extends ConstraintLayout {
    public AbstractC17123ewp copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14786dry(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14786dry(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14786dry(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    private final void copydefault() {
        this.copydefault = (AbstractC17123ewp) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C13754dXa.TaskDescription.zdxASf, this, true);
    }

    public static /* synthetic */ void setCurrentPrice$default(C14786dry c14786dry, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        java.lang.String str3 = (i2 & 1) != 0 ? "0" : str;
        java.lang.String str4 = (i2 & 2) != 0 ? "0" : str2;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            i = c14786dry.getContext().getColor(C52761wXj.Activity.fdOvFl);
        }
        c14786dry.setCurrentPrice(str3, str4, z3, z2, i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xYl.formatCoinPrice$default(java.math.BigDecimal, com.okinc.business.defi.api.bean.CurrencyPrependSign, boolean, com.okinc.wallet.core.formatter.WalletCurrencyBean, com.okinc.business.defi.api.bean.CurrencyDisplayStyle, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Class process forced to load method for inline: o.xYm.formatPriceChangePercentage$default(java.math.BigDecimal, int, int, boolean, com.okinc.localization.util.format.DisplaySign, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    public final void setCurrentPrice(@NotNull java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        Intrinsics.checkNotNullParameter(str, "");
        boolean z3 = z || str.length() > 0;
        if (z3) {
            AbstractC17123ewp abstractC17123ewp = this.copydefault;
            if (abstractC17123ewp != null) {
                abstractC17123ewp.OLrzqt.setText(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(str), null, z2, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null));
                if (str2 != null && str2.length() > 0) {
                    abstractC17123ewp.KWHzl.setVisibility(0);
                    abstractC17123ewp.KWHzl.setText(C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(str2), 0, 0, false, null, null, 31, null));
                } else {
                    abstractC17123ewp.KWHzl.setVisibility(8);
                }
                abstractC17123ewp.KWHzl.setTextColor(AEQbTJ(str2));
                return;
            }
            return;
        }
        if (z3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC17123ewp abstractC17123ewp2 = this.copydefault;
        if (abstractC17123ewp2 != null && (textView3 = abstractC17123ewp2.KWHzl) != null) {
            textView3.setVisibility(8);
        }
        AbstractC17123ewp abstractC17123ewp3 = this.copydefault;
        if (abstractC17123ewp3 != null && (textView2 = abstractC17123ewp3.OLrzqt) != null) {
            textView2.setText("--");
        }
        AbstractC17123ewp abstractC17123ewp4 = this.copydefault;
        if (abstractC17123ewp4 == null || (textView = abstractC17123ewp4.OLrzqt) == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public static /* synthetic */ int getCurrentRadioColor$default(C14786dry c14786dry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "0";
        }
        return c14786dry.AEQbTJ(str);
    }

    public final int AEQbTJ(java.lang.String str) {
        if (C33129mqd.AEQbTJ(str, 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
    }
}
