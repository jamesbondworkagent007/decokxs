package o;

import com.okinc.business.market.data.model.OverviewData;
import com.okinc.business.market.data.model.TransactionInfoData;
import com.okinc.business.market.features.overview.data.OverviewRepoImpl$getTokenOverview$2;
import com.okinc.business.market.features.overview.data.OverviewRepoImpl$getTransactionDataByTime$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28987klD implements InterfaceC29035klz {
    public final InterfaceC27595jyE copydefault;

    @yCM
    public C28987klD(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        this.copydefault = interfaceC27595jyE;
    }

    @Override // o.InterfaceC29035klz
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<TransactionInfoData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("tokenContractAddress", str);
        map.put("chainId", str2);
        map.put("type", str3);
        return kAB.EZpvd(new OverviewRepoImpl$getTransactionDataByTime$2(this, map, null), continuation);
    }

    @Override // o.InterfaceC29035klz
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<OverviewData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("tokenContractAddress", str);
        map.put("chainId", str2);
        return kAB.EZpvd(new OverviewRepoImpl$getTokenOverview$2(this, map, null), continuation);
    }
}
