package com.okinc.business.dex.trade.copytrading.home.usecase;

import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC20053gZd;
import o.gWJ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingPnLUseCase$getCopyTradeStat-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CopyTradingPnLResponse>>, Object> {
    final /* synthetic */ String $strategyOrderId$inlined;
    final /* synthetic */ CopyTradeStatRequest.TimeRange $timeRange$inlined;
    Object L$0;
    int label;
    final /* synthetic */ gWJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, gWJ gwj, String str, CopyTradeStatRequest.TimeRange timeRange) {
        super(2, continuation);
        this.this$0 = gwj;
        this.$strategyOrderId$inlined = str;
        this.$timeRange$inlined = timeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$strategyOrderId$inlined, this.$timeRange$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends CopyTradingPnLResponse>> continuation) {
        return ((CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC20053gZd interfaceC20053gZd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            interfaceC20053gZd = this.this$0.EZpvd;
            C28196kSl c28196kSl = this.this$0.KWHzl;
            this.L$0 = interfaceC20053gZd;
            this.label = 1;
            obj = c28196kSl.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            interfaceC20053gZd = (InterfaceC20053gZd) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str = (String) obj;
        String str2 = this.$strategyOrderId$inlined;
        CopyTradeStatRequest.TimeRange timeRange = this.$timeRange$inlined;
        CopyTradeStatRequest copyTradeStatRequest = new CopyTradeStatRequest(str, null, null, str2, timeRange != null ? C56443yFo.AEQbTJ(timeRange.getCode()) : null, 6, null);
        this.L$0 = null;
        this.label = 2;
        obj = interfaceC20053gZd.KWHzl(copyTradeStatRequest, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
