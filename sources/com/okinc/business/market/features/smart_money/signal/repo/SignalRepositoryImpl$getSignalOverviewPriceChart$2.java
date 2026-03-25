package com.okinc.business.market.features.smart_money.signal.repo;

import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29467kuG;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalRepositoryImpl$getSignalOverviewPriceChart$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends List<? extends String>>>>, Object> {
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ C29467kuG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalRepositoryImpl$getSignalOverviewPriceChart$2(C29467kuG c29467kuG, Map<String, ? extends Object> map, Continuation<? super SignalRepositoryImpl$getSignalOverviewPriceChart$2> continuation) {
        super(1, continuation);
        this.this$0 = c29467kuG;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SignalRepositoryImpl$getSignalOverviewPriceChart$2(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends List<? extends String>>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<List<String>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<List<String>>>> continuation) {
        return ((SignalRepositoryImpl$getSignalOverviewPriceChart$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.OLrzqt;
            Map<String, Object> map = this.$params;
            this.label = 1;
            obj = interfaceC27595jyE.OLrzqt(map, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
