package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamRep;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp;
import com.okinc.unify_trade.net.BotApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56244xzE extends xKQ<java.util.List<? extends SpotDcaAdditionalFundParamResp>> {
    public SpotDcaAdditionalFundParamRep OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SpotDcaAdditionalFundParamRep spotDcaAdditionalFundParamRep) {
        Intrinsics.checkNotNullParameter(spotDcaAdditionalFundParamRep, "");
        this.OLrzqt = spotDcaAdditionalFundParamRep;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends SpotDcaAdditionalFundParamResp>>> continuation) {
        BotApiService botApiServiceAEQbTJ = BotApiService.Companion.AEQbTJ();
        SpotDcaAdditionalFundParamRep spotDcaAdditionalFundParamRep = this.OLrzqt;
        if (spotDcaAdditionalFundParamRep == null) {
            Intrinsics.gEmmrt("");
            spotDcaAdditionalFundParamRep = null;
        }
        return botApiServiceAEQbTJ.spotDcaAdditionalFundForEdit(spotDcaAdditionalFundParamRep, continuation);
    }
}
