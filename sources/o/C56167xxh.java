package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstConfigInfo;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56167xxh extends xKE<java.util.ArrayList<InstConfigInfo>> {
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<InstConfigInfo>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarginModeConfig();
    }
}
