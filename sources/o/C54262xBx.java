package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BillTypeData;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54262xBx extends xKE<java.util.ArrayList<BillTypeData>> {
    public java.lang.String EZpvd = "0";

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<BillTypeData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getBillType(this.EZpvd);
    }
}
