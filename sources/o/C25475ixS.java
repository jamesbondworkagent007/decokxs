package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25475ixS {
    public static final C25476ixT OLrzqt(@NotNull C23673iFb c23673iFb) {
        Intrinsics.checkNotNullParameter(c23673iFb, "");
        long jAEQbTJ = c23673iFb.KWHzl().AEQbTJ();
        java.lang.Long lEZpvd = c23673iFb.KWHzl().EZpvd();
        long jOLrzqt = c23673iFb.AEQbTJ().OLrzqt();
        PoolProtocolType poolProtocolTypeDjBIcL = c23673iFb.EZpvd().djBIcL();
        ProductType productTypeAYXKKw = c23673iFb.EZpvd().AYXKKw();
        ProtocolType protocolTypeAhwBna = c23673iFb.EZpvd().AhwBna();
        java.lang.String strValueOf = c23673iFb.EZpvd().valueOf();
        boolean zOLrzqt = c23673iFb.EZpvd().OLrzqt();
        PaymentOption paymentOptionEZpvd = c23673iFb.EZpvd().EZpvd();
        C23687iFp c23687iFpAYXKKw = c23673iFb.AYXKKw();
        InvestAssetPositionType investAssetPositionTypeCopydefault = c23673iFb.EZpvd().copydefault();
        InvestDetailPagePromptInformation investDetailPagePromptInformationEZpvd = c23673iFb.OLrzqt().EZpvd();
        InvestTipInfoVo unableToRedeemTip = investDetailPagePromptInformationEZpvd != null ? investDetailPagePromptInformationEZpvd.getUnableToRedeemTip() : null;
        InvestDetailPagePromptInformation investDetailPagePromptInformationEZpvd2 = c23673iFb.OLrzqt().EZpvd();
        return new C25476ixT(jAEQbTJ, null, lEZpvd, jOLrzqt, null, poolProtocolTypeDjBIcL, productTypeAYXKKw, protocolTypeAhwBna, strValueOf, zOLrzqt, paymentOptionEZpvd, c23687iFpAYXKKw, null, false, null, investDetailPagePromptInformationEZpvd2 != null ? investDetailPagePromptInformationEZpvd2.getUnableSubscribeTip() : null, unableToRedeemTip, investAssetPositionTypeCopydefault, null, null, 815122, null);
    }

    public static final boolean KWHzl(@NotNull C25476ixT c25476ixT) {
        Intrinsics.checkNotNullParameter(c25476ixT, "");
        return c25476ixT.djBIcL() == ProductType.Farm && c25476ixT.AYXKKw() == PoolProtocolType.V3;
    }
}
