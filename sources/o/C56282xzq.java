package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.bot.data.BotToMPRecommend;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56282xzq extends xKE<java.util.ArrayList<BotToMPRecommend>> {
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<BotToMPRecommend>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getOngoingRecommend();
    }
}
