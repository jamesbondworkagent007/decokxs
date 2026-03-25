package o;

import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendItemBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pKY {
    public final InterfaceC33171mrS AEQbTJ;
    public final InterfaceC46557tYt EZpvd;

    @yCM
    public pKY(@NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.AEQbTJ = interfaceC33171mrS;
        this.EZpvd = interfaceC46557tYt;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull TokenRecommendItemBean tokenRecommendItemBean) {
        int iEZpvd;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(tokenRecommendItemBean, "");
        AbstractC33244msm value = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).values().getValue();
        if ((!this.AEQbTJ.getFieldNames() && !Intrinsics.EZpvd(value, AbstractC33244msm.ActionBar.KWHzl)) || (iEZpvd = this.EZpvd.EZpvd()) == 0) {
            strOLrzqt = tokenRecommendItemBean.OLrzqt();
        } else if (iEZpvd == 1) {
            strOLrzqt = tokenRecommendItemBean.KWHzl();
        } else if (iEZpvd == 2) {
            strOLrzqt = tokenRecommendItemBean.EZpvd();
        } else {
            strOLrzqt = tokenRecommendItemBean.OLrzqt();
        }
        return new kotlin.Pair<>(strOLrzqt, pTB.formatPercentWithSymbol$default(pTB.OLrzqt((java.lang.Object) strOLrzqt), 0, 0, RoundingMode.DOWN, null, 11, null));
    }

    public final int copydefault(double d) {
        if (C33129mqd.gEmmrt(java.lang.Double.valueOf(d), 0)) {
            return C33512mxp.lossAlternativeColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null);
        }
        return C33512mxp.profitAlternativeColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null);
    }

    public final int AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.gEmmrt(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xTM.AEQbTJ.KWHzl(new BigDecimal(str).toPlainString());
    }
}
