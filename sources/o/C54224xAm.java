package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SmartArbitrageModificationReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54224xAm extends xKE<java.util.List<? extends StrategyResponse>> {
    public static final int copydefault = 8;
    public SmartArbitrageModificationReq AEQbTJ = new SmartArbitrageModificationReq((java.lang.String) null, (java.lang.String) null, (PlaceOrderCondition) null, 7, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54224xAm copydefault(@NotNull SmartArbitrageModificationReq smartArbitrageModificationReq) {
        Intrinsics.checkNotNullParameter(smartArbitrageModificationReq, "");
        this.AEQbTJ = smartArbitrageModificationReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).modifyConditionStrategyOrder(this.AEQbTJ);
    }
}
