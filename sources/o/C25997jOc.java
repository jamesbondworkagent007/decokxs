package o;

import com.okinc.business.market.data.model.DevAnalysisData;
import com.okinc.business.market.features.coindetail.repo.DevAnalysisRepositoryImpl$getDevAnalysisList$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25997jOc implements jNV {
    public final InterfaceC23229huL KWHzl;

    @yCM
    public C25997jOc(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.KWHzl = interfaceC23229huL;
    }

    @Override // o.jNV
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, @NotNull Continuation<? super AbstractC43419rot<DevAnalysisData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenContractAddress", str2);
        map.put("page", java.lang.String.valueOf(i));
        map.put("pageSize", java.lang.String.valueOf(i2));
        return kAB.EZpvd(new DevAnalysisRepositoryImpl$getDevAnalysisList$2(this, map, null), continuation);
    }
}
