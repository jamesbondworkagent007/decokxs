package com.okinc.planet.biz_plugin.future;

import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C45957tCn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.tBW;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureQuicklyViewModel$loadPositions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45957tCn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureQuicklyViewModel$loadPositions$1(C45957tCn c45957tCn, Continuation<? super FutureQuicklyViewModel$loadPositions$1> continuation) {
        super(2, continuation);
        this.this$0 = c45957tCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureQuicklyViewModel$loadPositions$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureQuicklyViewModel$loadPositions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C45957tCn.TaskDescription taskDescription;
        String message;
        Object value2;
        Object value3;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C45957tCn.TaskDescription.copy$default((C45957tCn.TaskDescription) value2, true, null, null, false, 2, null)));
                tBW tbw = this.this$0.AEQbTJ;
                this.label = 1;
                obj = tbw.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Pair pair = (Pair) obj;
            Pair pair2 = (Pair) pair.component1();
            if (!((Boolean) pair.component2()).booleanValue()) {
                MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
                do {
                    value3 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value3, C45957tCn.TaskDescription.copy$default((C45957tCn.TaskDescription) value3, false, null, "Failed to load spot holdings", true, 2, null)));
            } else {
                List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) pair2.getFirst(), 5);
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                Iterator it = listAhwBna.iterator();
                while (it.hasNext()) {
                    arrayList.add(new FuturePositionBean((TradePositionPlanetBean) it.next(), false, (String) pair2.getSecond(), yDY.AhwBna(), yDY.AhwBna(), false, 32, (DefaultConstructorMarker) null));
                }
                MutableStateFlow mutableStateFlow3 = this.this$0.EZpvd;
                do {
                    value4 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value4, ((C45957tCn.TaskDescription) value4).KWHzl(false, arrayList, null, false)));
            }
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow4 = this.this$0.EZpvd;
            do {
                value = mutableStateFlow4.getValue();
                taskDescription = (C45957tCn.TaskDescription) value;
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error occurred";
                }
            } while (!mutableStateFlow4.compareAndSet(value, C45957tCn.TaskDescription.copy$default(taskDescription, false, null, message, true, 2, null)));
        }
        return Unit.INSTANCE;
    }
}
