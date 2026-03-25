package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AccountLevelData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xxr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56177xxr extends xKE<java.util.List<? extends EmptyResp>> {
    public AccountLevelData KWHzl;

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.EmptyResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends EmptyResp>>> EZpvd() {
        AccountLevelData accountLevelData = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        AccountLevelData accountLevelData2 = this.KWHzl;
        if (accountLevelData2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            accountLevelData = accountLevelData2;
        }
        return bizApiService.setMaxAccountLevel(accountLevelData);
    }
}
