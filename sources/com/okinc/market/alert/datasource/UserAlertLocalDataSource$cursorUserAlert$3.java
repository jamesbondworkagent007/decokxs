package com.okinc.market.alert.datasource;

import com.okinc.market.alert.data.MarketUserAlert;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class UserAlertLocalDataSource$cursorUserAlert$3 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends MarketUserAlert>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $userId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAlertLocalDataSource$cursorUserAlert$3(String str, Continuation<? super UserAlertLocalDataSource$cursorUserAlert$3> continuation) {
        super(2, continuation);
        this.$userId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserAlertLocalDataSource$cursorUserAlert$3(this.$userId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends MarketUserAlert>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<MarketUserAlert>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<MarketUserAlert>> flowCollector, Continuation<? super Unit> continuation) {
        return ((UserAlertLocalDataSource$cursorUserAlert$3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("WMYYY", "cursorUserAlert() onStart user:" + this.$userId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
