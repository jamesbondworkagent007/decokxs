package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SimulateAssetsRequest;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56173xxn extends xKE<java.util.List<? extends Unit>> {
    public SimulateAssetsRequest EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56173xxn EZpvd(@NotNull SimulateAssetsRequest simulateAssetsRequest) {
        Intrinsics.checkNotNullParameter(simulateAssetsRequest, "");
        this.EZpvd = simulateAssetsRequest;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<kotlin.Unit>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends Unit>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        SimulateAssetsRequest simulateAssetsRequest = this.EZpvd;
        if (simulateAssetsRequest == null) {
            Intrinsics.gEmmrt("");
            simulateAssetsRequest = null;
        }
        return bizApiService.resetSimulateAssets(simulateAssetsRequest);
    }
}
