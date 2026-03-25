package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56224xyl extends xKE<java.util.List<? extends SpotGridEditParamRep>> {
    public SpotGridEditParamReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull SpotGridEditParamReq spotGridEditParamReq) {
        Intrinsics.checkNotNullParameter(spotGridEditParamReq, "");
        this.copydefault = spotGridEditParamReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SpotGridEditParamRep>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SpotGridEditParamRep>>> EZpvd() {
        SpotGridEditParamReq spotGridEditParamReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        SpotGridEditParamReq spotGridEditParamReq2 = this.copydefault;
        if (spotGridEditParamReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            spotGridEditParamReq = spotGridEditParamReq2;
        }
        return bizApiService.spotGridChangeParam(spotGridEditParamReq);
    }
}
