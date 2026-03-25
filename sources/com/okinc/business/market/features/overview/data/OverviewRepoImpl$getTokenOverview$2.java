package com.okinc.business.market.features.overview.data;

import com.okinc.business.market.data.model.OverviewData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28987klD;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class OverviewRepoImpl$getTokenOverview$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<OverviewData>>, Object> {
    final /* synthetic */ HashMap<String, String> $param;
    int label;
    final /* synthetic */ C28987klD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewRepoImpl$getTokenOverview$2(C28987klD c28987klD, HashMap<String, String> map, Continuation<? super OverviewRepoImpl$getTokenOverview$2> continuation) {
        super(1, continuation);
        this.this$0 = c28987klD;
        this.$param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OverviewRepoImpl$getTokenOverview$2(this.this$0, this.$param, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<OverviewData>> continuation) {
        return ((OverviewRepoImpl$getTokenOverview$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.copydefault;
            HashMap<String, String> map = this.$param;
            this.label = 1;
            obj = interfaceC27595jyE.AYXKKw(map, (Continuation<? super ResponseData<OverviewData>>) this);
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
