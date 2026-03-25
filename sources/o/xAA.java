package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xAA extends xKE<java.util.List<? extends ProductItemResp>> {
    public DcdProductListReq KWHzl = new DcdProductListReq(null, null, null, null, null, null, null, null, null, null, 1023, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdProductListReq KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull DcdProductListReq dcdProductListReq) {
        Intrinsics.checkNotNullParameter(dcdProductListReq, "");
        this.KWHzl = dcdProductListReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ProductItemResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ProductItemResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String currencyId = this.KWHzl.getCurrencyId();
        java.lang.String altCurrencyId = this.KWHzl.getAltCurrencyId();
        java.lang.String dcdOptionType = this.KWHzl.getDcdOptionType();
        java.lang.String strike = this.KWHzl.getStrike();
        if (strike == null) {
            strike = "";
        }
        return bizApiService.getDcdProductList(currencyId, altCurrencyId, dcdOptionType, strike, this.KWHzl.getMinAnnualYieldPercentage(), this.KWHzl.getMaxSettlementDay());
    }
}
