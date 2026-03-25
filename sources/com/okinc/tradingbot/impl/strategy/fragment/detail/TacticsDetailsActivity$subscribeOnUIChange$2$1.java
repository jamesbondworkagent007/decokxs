package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC52272wFg;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsDetailsActivity$subscribeOnUIChange$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StrategyDetailsResponse $resp;
    int label;
    final /* synthetic */ ActivityC52272wFg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsDetailsActivity$subscribeOnUIChange$2$1(StrategyDetailsResponse strategyDetailsResponse, ActivityC52272wFg activityC52272wFg, Continuation<? super TacticsDetailsActivity$subscribeOnUIChange$2$1> continuation) {
        super(2, continuation);
        this.$resp = strategyDetailsResponse;
        this.this$0 = activityC52272wFg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsDetailsActivity$subscribeOnUIChange$2$1(this.$resp, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsDetailsActivity$subscribeOnUIChange$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 2, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ActivityC52272wFg activityC52272wFg = this.this$0;
                activityC52272wFg.DbNXlk = false;
                activityC52272wFg.QfsBiF();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                String instType = this.$resp.getInstType();
                this.label = 2;
                obj = interfaceC54581xNrOLrzqt.EZpvd(instType, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            ActivityC52272wFg activityC52272wFg2 = this.this$0;
            activityC52272wFg2.DbNXlk = false;
            activityC52272wFg2.QfsBiF();
            return Unit.INSTANCE;
        }
        ActivityC52272wFg activityC52272wFg3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default);
        activityC52272wFg3.copydefault(thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null);
        return Unit.INSTANCE;
    }
}
