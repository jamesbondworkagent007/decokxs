package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.DcdRecommendedParams;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xAG extends xKE<java.util.List<? extends DcdRecommendedParams>> {
    public DcdProductListReq KWHzl = new DcdProductListReq(null, null, null, null, null, null, null, null, null, null, 1023, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull DcdProductListReq dcdProductListReq) {
        Intrinsics.checkNotNullParameter(dcdProductListReq, "");
        this.KWHzl = dcdProductListReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.DcdRecommendedParams>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends DcdRecommendedParams>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String aiParamType = this.KWHzl.getAiParamType();
        java.lang.String currencyId = this.KWHzl.getCurrencyId();
        java.lang.String altCurrencyId = this.KWHzl.getAltCurrencyId();
        java.lang.String dcdOptionType = this.KWHzl.getDcdOptionType();
        java.lang.String strike = this.KWHzl.getStrike();
        if (strike == null) {
            strike = "";
        }
        java.lang.String strikePercentage = this.KWHzl.getStrikePercentage();
        if (strikePercentage == null) {
            strikePercentage = "";
        }
        return bizApiService.getRecommendedParam(aiParamType, currencyId, altCurrencyId, dcdOptionType, strike, strikePercentage, this.KWHzl.getMinAnnualYieldPercentage(), this.KWHzl.getMaxSettlementDay());
    }
}
