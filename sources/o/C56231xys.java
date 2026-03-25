package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56231xys extends xKE<java.util.List<? extends BotCategoryConfig>> {
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotCategoryConfig>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotCategoryConfig>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getBotCategory();
    }
}
