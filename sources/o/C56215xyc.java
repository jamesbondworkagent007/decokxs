package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56215xyc extends xKE<java.util.List<? extends ContractGridClosePositionData>> {
    public boolean KWHzl;
    public ContractGridClosePositionData OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull ContractGridClosePositionData contractGridClosePositionData) {
        Intrinsics.checkNotNullParameter(contractGridClosePositionData, "");
        this.OLrzqt = contractGridClosePositionData;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractGridClosePositionData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractGridClosePositionData>>> EZpvd() {
        ContractGridClosePositionData contractGridClosePositionData = null;
        if (this.KWHzl) {
            BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
            ContractGridClosePositionData contractGridClosePositionData2 = this.OLrzqt;
            if (contractGridClosePositionData2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                contractGridClosePositionData = contractGridClosePositionData2;
            }
            return bizApiService.cancelDCASubOrder(contractGridClosePositionData);
        }
        BizApiService bizApiService2 = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ContractGridClosePositionData contractGridClosePositionData3 = this.OLrzqt;
        if (contractGridClosePositionData3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridClosePositionData = contractGridClosePositionData3;
        }
        return bizApiService2.cancelSubOrder(contractGridClosePositionData);
    }
}
