package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SlippageControlEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56197xyK extends xKE<java.util.List<? extends SpotGridEditParamRep>> {
    public SlippageControlEditParamRep KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull SlippageControlEditParamRep slippageControlEditParamRep) {
        Intrinsics.checkNotNullParameter(slippageControlEditParamRep, "");
        this.KWHzl = slippageControlEditParamRep;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SpotGridEditParamRep>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SpotGridEditParamRep>>> EZpvd() {
        SlippageControlEditParamRep slippageControlEditParamRep = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        SlippageControlEditParamRep slippageControlEditParamRep2 = this.KWHzl;
        if (slippageControlEditParamRep2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            slippageControlEditParamRep = slippageControlEditParamRep2;
        }
        return bizApiService.slippageControlEdit(slippageControlEditParamRep);
    }
}
