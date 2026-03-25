package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56234xyv extends xKE<java.util.List<? extends BotWebHook>> {
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56234xyv EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotWebHook>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotWebHook>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).loadWebHookActions(this.AEQbTJ);
    }
}
