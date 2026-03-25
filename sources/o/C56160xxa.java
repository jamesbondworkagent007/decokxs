package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AssetsCoinTransferTarget;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56160xxa extends xKE<java.util.List<? extends AssetsCoinTransferTarget>> {
    public int AEQbTJ;
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.AssetsCoinTransferTarget>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends AssetsCoinTransferTarget>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).queryCurrencyTarget(this.AEQbTJ, this.KWHzl, true);
    }
}
