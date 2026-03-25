package com.okinc.business.dex.trade.copytrading.edit.ui.fragment;

import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C19888gTa;
import o.C19923gUi;
import o.C55001xbh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingBuySettingFragment$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C19923gUi $this_apply;
    int label;
    final /* synthetic */ C19888gTa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingBuySettingFragment$setListener$1$1(C19888gTa c19888gTa, C19923gUi c19923gUi, Continuation<? super CopyTradingBuySettingFragment$setListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c19888gTa;
        this.$this_apply = c19923gUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingBuySettingFragment$setListener$1$1(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingBuySettingFragment$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Pair<Boolean, String>> stateFlowAYXKKw = this.this$0.AYXKKw().AYXKKw();
            final C19923gUi c19923gUi = this.$this_apply;
            FlowCollector<? super Pair<Boolean, String>> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$setListener$1$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<Boolean, String> pair, Continuation<? super Unit> continuation) {
                    C55001xbh c55001xbhAkhnZx;
                    String strIsConnected;
                    if (pair.getFirst().booleanValue() && (c55001xbhAkhnZx = c19923gUi.AEQbTJ().AkhnZx()) != null && (strIsConnected = c55001xbhAkhnZx.isConnected()) != null && strIsConnected.length() == 0) {
                        c19923gUi.setMaxBuyAmount(pair.getSecond());
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
