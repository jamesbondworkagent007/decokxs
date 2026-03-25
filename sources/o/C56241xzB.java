package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SpotDcaEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.net.BotApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56241xzB extends xKQ<java.util.List<? extends SpotGridEditParamRep>> {
    public SpotDcaEditParamRep copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull SpotDcaEditParamRep spotDcaEditParamRep) {
        Intrinsics.checkNotNullParameter(spotDcaEditParamRep, "");
        this.copydefault = spotDcaEditParamRep;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SpotGridEditParamRep>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends SpotGridEditParamRep>>> continuation) {
        BotApiService botApiServiceAEQbTJ = BotApiService.Companion.AEQbTJ();
        SpotDcaEditParamRep spotDcaEditParamRep = this.copydefault;
        if (spotDcaEditParamRep == null) {
            Intrinsics.gEmmrt("");
            spotDcaEditParamRep = null;
        }
        return botApiServiceAEQbTJ.spotDcaModifyParameters(spotDcaEditParamRep, continuation);
    }
}
