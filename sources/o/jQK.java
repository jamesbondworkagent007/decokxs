package o;

import com.okinc.business.market.data.model.holder.HolderChartData;
import com.okinc.business.market.features.data.repo.HolderChartRepoImpl$getChartData$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jQK implements jQJ {
    public final InterfaceC23229huL KWHzl;

    @yCM
    public jQK(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.KWHzl = interfaceC23229huL;
    }

    @Override // o.jQJ
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<HolderChartData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenAddress", str2);
        return kAB.EZpvd(new HolderChartRepoImpl$getChartData$2(this, map, null), continuation);
    }
}
