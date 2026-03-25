package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitragePriceSettingModel;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54228xAq extends xKE<java.util.List<? extends ArbitragePriceSettingModel>> {
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ArbitragePriceSettingModel>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ArbitragePriceSettingModel>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getArbitragePriceSetting(this.copydefault);
    }
}
