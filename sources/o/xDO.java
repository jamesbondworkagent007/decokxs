package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDO extends xKE<Unit> {
    public ArbitrageSetFavoriteBean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDO copydefault(@NotNull ArbitrageSetFavoriteBean arbitrageSetFavoriteBean) {
        Intrinsics.checkNotNullParameter(arbitrageSetFavoriteBean, "");
        this.EZpvd = arbitrageSetFavoriteBean;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<Unit>> EZpvd() {
        ArbitrageSetFavoriteBean arbitrageSetFavoriteBean = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ArbitrageSetFavoriteBean arbitrageSetFavoriteBean2 = this.EZpvd;
        if (arbitrageSetFavoriteBean2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arbitrageSetFavoriteBean = arbitrageSetFavoriteBean2;
        }
        return bizApiService.setArbitrageFavorite(arbitrageSetFavoriteBean);
    }
}
