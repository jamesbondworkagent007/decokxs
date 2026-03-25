package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstMarginModeConfigs;
import com.okinc.unify_trade.biz.MarginModeConfigData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56170xxk extends xKE<java.util.ArrayList<InstMarginModeConfigs>> {
    public MarginModeConfigData AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56170xxk AEQbTJ(@NotNull MarginModeConfigData marginModeConfigData) {
        Intrinsics.checkNotNullParameter(marginModeConfigData, "");
        this.AEQbTJ = marginModeConfigData;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<InstMarginModeConfigs>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        MarginModeConfigData marginModeConfigData = this.AEQbTJ;
        if (marginModeConfigData == null) {
            Intrinsics.gEmmrt("");
            marginModeConfigData = null;
        }
        return bizApiService.saveMarginModeConfig(marginModeConfigData);
    }
}
