package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotModifyReq;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56260xzU extends xKE<java.util.List<? extends BotModifyResp>> {
    public BotModifyReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BotModifyReq botModifyReq) {
        Intrinsics.checkNotNullParameter(botModifyReq, "");
        this.copydefault = botModifyReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotModifyResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotModifyResp>>> EZpvd() {
        BotModifyReq botModifyReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        BotModifyReq botModifyReq2 = this.copydefault;
        if (botModifyReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            botModifyReq = botModifyReq2;
        }
        return bizApiService.modifyBotState(botModifyReq);
    }
}
