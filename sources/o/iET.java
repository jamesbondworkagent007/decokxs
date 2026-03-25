package o;

import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import com.okinc.business.invest_biz.data.contants.BtcProtocolType;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.RateType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iET {
    @yCM
    public iET() {
    }

    public final C23684iFm EZpvd(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        InvestmentKind investmentKindAxsJAYsNCnLh = productDetailsResponse.AxsJAYsNCnLh();
        ProductType productTypeFinit = productDetailsResponse.finit();
        ProtocolType protocolTypeFZBcTu = productDetailsResponse.fZBcTu();
        PoolProtocolType poolProtocolTypeDNCPSb = productDetailsResponse.dNCPSb();
        BtcProtocolType btcProtocolTypeAYXKKw = productDetailsResponse.AYXKKw();
        java.lang.String strRcXXUw = productDetailsResponse.RcXXUw();
        java.lang.String fieldNames = productDetailsResponse.getFieldNames();
        RateType rateTypeGGvvIC = productDetailsResponse.gGvvIC();
        java.lang.String strDxcTrN = productDetailsResponse.dxcTrN();
        java.lang.String strAhwBna = productDetailsResponse.AhwBna();
        boolean zAubY = productDetailsResponse.AubY();
        boolean zHUfVAv = productDetailsResponse.hUfVAv();
        int iQbewEr = productDetailsResponse.QbewEr();
        PaymentOption paymentOptionGHZMYf = productDetailsResponse.gHZMYf();
        PaymentOption paymentOptionIRxXKY = productDetailsResponse.iRxXKY();
        return new C23684iFm(investmentKindAxsJAYsNCnLh, productTypeFinit, poolProtocolTypeDNCPSb, protocolTypeFZBcTu, btcProtocolTypeAYXKKw, strRcXXUw, strAhwBna, strDxcTrN, rateTypeGGvvIC, null, zAubY, zHUfVAv, iQbewEr, fieldNames, null, productDetailsResponse.AxsJAYaxsJAY(), productDetailsResponse.flVtFt(), paymentOptionIRxXKY, paymentOptionGHZMYf, productDetailsResponse.gEmmrt(), productDetailsResponse.gasjUx(), 16896, null);
    }
}
