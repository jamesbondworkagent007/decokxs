package o;

import com.okinc.dexkline.market.data.model.OverviewData;
import com.okinc.dexkline.market.data.model.TransactionInfoData;
import com.okinc.dexkline.market.features.overview.data.OverviewRepoImpl$getTokenOverview$2;
import com.okinc.dexkline.market.features.overview.data.OverviewRepoImpl$getTransactionDataByTime$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34381nax implements InterfaceC34383naz {
    public final InterfaceC32260mVk EZpvd;

    @yCM
    public C34381nax(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        this.EZpvd = interfaceC32260mVk;
    }

    @Override // o.InterfaceC34383naz
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<TransactionInfoData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("tokenContractAddress", str);
        map.put("chainId", str2);
        map.put("type", str3);
        return C34583nen.AEQbTJ(new OverviewRepoImpl$getTransactionDataByTime$2(this, map, null), continuation);
    }

    @Override // o.InterfaceC34383naz
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<OverviewData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("tokenContractAddress", str);
        map.put("chainId", str2);
        return C34583nen.AEQbTJ(new OverviewRepoImpl$getTokenOverview$2(this, map, null), continuation);
    }
}
