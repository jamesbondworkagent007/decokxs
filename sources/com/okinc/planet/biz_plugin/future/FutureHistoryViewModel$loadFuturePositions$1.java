package com.okinc.planet.biz_plugin.future;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.future.FutureHistoryViewModel$loadFuturePositions$1;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32866mlf;
import o.C33129mqd;
import o.C45948tCe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.tBU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureHistoryViewModel$loadFuturePositions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45948tCe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureHistoryViewModel$loadFuturePositions$1(C45948tCe c45948tCe, Continuation<? super FutureHistoryViewModel$loadFuturePositions$1> continuation) {
        super(2, continuation);
        this.this$0 = c45948tCe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureHistoryViewModel$loadFuturePositions$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureHistoryViewModel$loadFuturePositions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C45948tCe.Application application;
        String message;
        Object value2;
        Object value3;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C45948tCe.Application.copy$default((C45948tCe.Application) value2, true, null, null, null, null, null, false, 30, null)));
                tBU tbu = this.this$0.copydefault;
                this.label = 1;
                obj = tbu.KWHzl(this);
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
                MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
                do {
                    value3 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value3, C45948tCe.Application.copy$default((C45948tCe.Application) value3, false, null, null, null, null, "Failed to load future position", true, 30, null)));
            } else {
                Iterable iterable = (Iterable) pair2.getFirst();
                final ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new FutureHistoryBean((TradeHisPositionPlanetBean) it.next(), false, (String) pair2.getSecond(), yDY.AhwBna(), yDY.AhwBna(), false));
                }
                C32866mlf.onEvent$default("Feeds_Whole_PluginCardSelect_View", (TrackChannel[]) null, new Function1() { // from class: o.tCd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return FutureHistoryViewModel$loadFuturePositions$1.invokeSuspend$lambda$2(arrayList, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                MutableStateFlow mutableStateFlow3 = this.this$0.KWHzl;
                do {
                    value4 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value4, ((C45948tCe.Application) value4).AEQbTJ(false, arrayList, arrayList, null, null, null, false)));
            }
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow4 = this.this$0.KWHzl;
            do {
                value = mutableStateFlow4.getValue();
                application = (C45948tCe.Application) value;
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error occurred";
                }
            } while (!mutableStateFlow4.compareAndSet(value, C45948tCe.Application.copy$default(application, false, null, null, null, null, message, true, 30, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(List list, EventParamsList eventParamsList) {
        eventParamsList.put("plugin_type", "historical_futures", true);
        eventParamsList.put("no_data", C33129mqd.KWHzl((Collection) list) ? "false" : "true", false);
        return Unit.INSTANCE;
    }
}
