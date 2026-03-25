package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.dex.assets.data.repository.DexAssetsRepository$getDexAsset$2;
import com.okinc.unify_trade.dex.assets.data.repository.DexAssetsRepository$getDexAssets$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xHz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54426xHz implements xHF {
    public final xHD AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public C54426xHz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull xHD xhd) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(xhd, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = xhd;
    }

    @Override // o.xHF
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexAssets>>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexAssetsRepository$getDexAsset$2(this, str, str2, null), continuation);
    }

    @Override // o.xHF
    public java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<DexAssetsResponse>>> continuation) {
        return BuildersKt.withContext(copydefault(), new DexAssetsRepository$getDexAssets$2(this, num, num2, num3, str, null), continuation);
    }
}
