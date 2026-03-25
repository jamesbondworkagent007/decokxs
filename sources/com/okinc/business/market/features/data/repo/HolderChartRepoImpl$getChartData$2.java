package com.okinc.business.market.features.data.repo;

import com.okinc.business.market.data.model.holder.HolderChartData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;
import o.jQK;

/* JADX INFO: loaded from: classes6.dex */
public final class HolderChartRepoImpl$getChartData$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<HolderChartData>>, Object> {
    final /* synthetic */ HashMap<String, String> $param;
    int label;
    final /* synthetic */ jQK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderChartRepoImpl$getChartData$2(jQK jqk, HashMap<String, String> map, Continuation<? super HolderChartRepoImpl$getChartData$2> continuation) {
        super(1, continuation);
        this.this$0 = jqk;
        this.$param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HolderChartRepoImpl$getChartData$2(this.this$0, this.$param, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<HolderChartData>> continuation) {
        return ((HolderChartRepoImpl$getChartData$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23229huL interfaceC23229huL = this.this$0.KWHzl;
            HashMap<String, String> map = this.$param;
            this.label = 1;
            obj = interfaceC23229huL.OLrzqt(map, (Continuation<? super ResponseData<HolderChartData>>) this);
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
