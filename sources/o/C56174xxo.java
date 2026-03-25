package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.LoanModeReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56174xxo extends xKE<java.util.List<? extends LoanModeReq>> {
    public LoanModeReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56174xxo KWHzl(@NotNull LoanModeReq loanModeReq) {
        Intrinsics.checkNotNullParameter(loanModeReq, "");
        this.copydefault = loanModeReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.LoanModeReq>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends LoanModeReq>>> EZpvd() {
        LoanModeReq loanModeReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        LoanModeReq loanModeReq2 = this.copydefault;
        if (loanModeReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            loanModeReq = loanModeReq2;
        }
        return bizApiService.setAutoLoan(loanModeReq);
    }
}
