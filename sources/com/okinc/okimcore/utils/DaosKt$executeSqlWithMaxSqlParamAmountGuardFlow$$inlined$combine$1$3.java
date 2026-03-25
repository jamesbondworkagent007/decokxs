package com.okinc.okimcore.utils;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDV;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [U] */
/* JADX INFO: loaded from: classes10.dex */
public final class DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3<U> extends SuspendLambda implements yHO<FlowCollector<? super List<? extends U>>, List<? extends U>[], Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3(Continuation continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull FlowCollector<? super List<? extends U>> flowCollector, @NotNull List<? extends U>[] listArr, Continuation<? super Unit> continuation) {
        DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3 daosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3 = new DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3(continuation);
        daosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3.L$0 = flowCollector;
        daosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3.L$1 = listArr;
        return daosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List listQOLQEE = C56403yEb.QOLQEE(yDV.AwvSrB((List[]) ((Object[]) this.L$1)));
            this.label = 1;
            if (flowCollector.emit(listQOLQEE, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
