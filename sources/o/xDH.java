package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstMarginModeConfigs;
import com.okinc.unify_trade.biz.MarginModeInitConfigData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDH extends xKE<java.util.ArrayList<InstMarginModeConfigs>> {
    public MarginModeInitConfigData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDH AEQbTJ(@NotNull MarginModeInitConfigData marginModeInitConfigData) {
        Intrinsics.checkNotNullParameter(marginModeInitConfigData, "");
        this.copydefault = marginModeInitConfigData;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<InstMarginModeConfigs>>> EZpvd() {
        MarginModeInitConfigData marginModeInitConfigData = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        MarginModeInitConfigData marginModeInitConfigData2 = this.copydefault;
        if (marginModeInitConfigData2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            marginModeInitConfigData = marginModeInitConfigData2;
        }
        return bizApiService.updateMarginModeInitConfig(marginModeInitConfigData);
    }
}
