package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.core.usecase.todo.BotAmtTaskUseCase$doRetrieveFlowData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xCJ extends xKW<OrderPositionData> {
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xCJ() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:19) call: o.xCJ.<init>(boolean):void type: THIS */
    public /* synthetic */ xCJ(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public xCJ(boolean z) {
        this.copydefault = z;
    }

    @Override // o.xKQ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<OrderPositionData>>> continuation) {
        return FlowKt.callbackFlow(new BotAmtTaskUseCase$doRetrieveFlowData$2(this, null));
    }
}
