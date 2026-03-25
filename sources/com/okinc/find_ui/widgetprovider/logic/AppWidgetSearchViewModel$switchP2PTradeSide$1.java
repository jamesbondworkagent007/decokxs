package com.okinc.find_ui.widgetprovider.logic;

import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsInfo;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35119npM;
import o.C35128npV;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class AppWidgetSearchViewModel$switchP2PTradeSide$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ P2PTradeSide $tradeSide;
    int label;
    final /* synthetic */ C35119npM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSearchViewModel$switchP2PTradeSide$1(C35119npM c35119npM, P2PTradeSide p2PTradeSide, Continuation<? super AppWidgetSearchViewModel$switchP2PTradeSide$1> continuation) {
        super(2, continuation);
        this.this$0 = c35119npM;
        this.$tradeSide = p2PTradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppWidgetSearchViewModel$switchP2PTradeSide$1(this.this$0, this.$tradeSide, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppWidgetSearchViewModel$switchP2PTradeSide$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C35128npV.copy$default((C35128npV) value2, true, null, null, null, 14, null)));
                if (this.this$0.djBIcL.containsKey(this.$tradeSide)) {
                    Object obj2 = this.this$0.djBIcL.get(this.$tradeSide);
                    Intrinsics.copydefault(obj2);
                    this.this$0.KWHzl((List<P2PPairsInfo>) obj2, this.$tradeSide);
                } else {
                    C35119npM c35119npM = this.this$0;
                    P2PTradeSide p2PTradeSide = this.$tradeSide;
                    this.label = 1;
                    if (c35119npM.EZpvd(p2PTradeSide, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            P2PTradeSide p2PTradeSide2 = this.$tradeSide;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, C35128npV.copy$default((C35128npV) value3, false, null, p2PTradeSide2, null, 10, null)));
        } catch (Exception e) {
            C43296rmc.copydefault("AppWidgetSearchViewModel", "Switch P2P trade side failed", e);
            MutableStateFlow mutableStateFlow3 = this.this$0.copydefault;
            do {
                value = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value, C35128npV.copy$default((C35128npV) value, false, e.getMessage(), null, null, 12, null)));
        }
        return Unit.INSTANCE;
    }
}
