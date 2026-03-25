package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xAC extends xKE<java.util.List<? extends ProductItemResp>> {
    public DcdProductListReq OLrzqt = new DcdProductListReq(null, null, null, null, null, null, null, null, null, null, 1023, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdProductListReq AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull DcdProductListReq dcdProductListReq) {
        Intrinsics.checkNotNullParameter(dcdProductListReq, "");
        this.OLrzqt = dcdProductListReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ProductItemResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ProductItemResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String currencyId = this.OLrzqt.getCurrencyId();
        java.lang.String altCurrencyId = this.OLrzqt.getAltCurrencyId();
        java.lang.String dcdOptionType = this.OLrzqt.getDcdOptionType();
        java.lang.String strikePercentage = this.OLrzqt.getStrikePercentage();
        if (strikePercentage == null) {
            strikePercentage = "";
        }
        return bizApiService.getDcdProductListAdvanced(currencyId, altCurrencyId, dcdOptionType, strikePercentage, this.OLrzqt.getMinAnnualYieldPercentage(), this.OLrzqt.getMaxSettlementDay());
    }
}
