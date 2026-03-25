package o;

import com.okinc.dexkline.market.data.model.LiquidityChartData;
import com.okinc.dexkline.market.features.data.repo.LiquidityRepoImpl$getLiquidityChart$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mXV implements mXP {
    public final InterfaceC32162mRu copydefault;

    @yCM
    public mXV(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        this.copydefault = interfaceC32162mRu;
    }

    @Override // o.mXP
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<LiquidityChartData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenContractAddress", str2);
        return C34583nen.AEQbTJ(new LiquidityRepoImpl$getLiquidityChart$2(this, map, null), continuation);
    }
}
