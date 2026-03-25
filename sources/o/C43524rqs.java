package o;

import com.okinc.nft.nftmarket.NFTApiService;
import com.okinc.nft.push.chainstatus.TxInfoBean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43524rqs {
    public final NFTApiService KWHzl() {
        return NFTApiService.Companion.copydefault(C43526rqu.AEQbTJ);
    }

    public final AbstractC58185ywX<java.util.List<TxInfoBean>> copydefault(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C32962mnV.unwrapResponseData$default(C33024moe.KWHzl((AbstractC58185ywX) KWHzl().getTxInfo(C43526rqu.AEQbTJ.getBaseUrl() + "/v1/deposit/app/tx/txHash/" + j + "/" + str + "/tx/info")), (Function1) null, 1, (java.lang.Object) null);
    }
}
