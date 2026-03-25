package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitragePriceSetting;
import com.okinc.unify_trade.biz.ArbitragePriceSettingModel;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54229xAr extends xKE<java.util.List<? extends ArbitragePriceSettingModel>> {
    public ArbitragePriceSetting EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54229xAr KWHzl(@NotNull ArbitragePriceSetting arbitragePriceSetting) {
        Intrinsics.checkNotNullParameter(arbitragePriceSetting, "");
        this.EZpvd = arbitragePriceSetting;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ArbitragePriceSettingModel>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ArbitragePriceSettingModel>>> EZpvd() {
        ArbitragePriceSetting arbitragePriceSetting = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ArbitragePriceSetting arbitragePriceSetting2 = this.EZpvd;
        if (arbitragePriceSetting2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arbitragePriceSetting = arbitragePriceSetting2;
        }
        return bizApiService.setArbitragePriceSetting(arbitragePriceSetting);
    }
}
