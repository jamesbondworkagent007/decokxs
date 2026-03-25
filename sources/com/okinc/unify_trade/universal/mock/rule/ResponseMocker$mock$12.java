package com.okinc.unify_trade.universal.mock.rule;

import com.okinc.unify_trade.net.TradeApiService;
import io.mockk.ConstantMatcher;
import io.mockk.MockKMatcherScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C43392roS;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC43391roR;

/* JADX INFO: loaded from: classes24.dex */
public final class ResponseMocker$mock$12 extends SuspendLambda implements Function2<MockKMatcherScope, Continuation<? super TradeApiService>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ResponseMocker$mock$12(Continuation<? super ResponseMocker$mock$12> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResponseMocker$mock$12 responseMocker$mock$12 = new ResponseMocker$mock$12(continuation);
        responseMocker$mock$12.L$0 = obj;
        return responseMocker$mock$12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MockKMatcherScope mockKMatcherScope, Continuation<? super TradeApiService> continuation) {
        return ((ResponseMocker$mock$12) create(mockKMatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MockKMatcherScope mockKMatcherScope = (MockKMatcherScope) this.L$0;
            return C43392roS.EZpvd.OLrzqt(C56524yIo.AEQbTJ(TradeApiService.class), (InterfaceC43391roR) mockKMatcherScope.getCallRecorder().matcher(new ConstantMatcher(true), C56524yIo.AEQbTJ(InterfaceC43391roR.class)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
