package o;

import com.okinc.dexkline.market.data.model.holder.HolderChartData;
import com.okinc.dexkline.market.features.data.repo.HolderChartRepoImpl$getChartData$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mXN implements mXO {
    public final InterfaceC32162mRu AEQbTJ;

    @yCM
    public mXN(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        this.AEQbTJ = interfaceC32162mRu;
    }

    @Override // o.mXO
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<HolderChartData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenAddress", str2);
        return C34583nen.AEQbTJ(new HolderChartRepoImpl$getChartData$2(this, map, null), continuation);
    }
}
