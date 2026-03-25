package com.okinc.business.trade.features.home.ui.viewmodel;

import com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30505lcS;
import o.AbstractC43419rot;
import o.C30507lcU;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeAutoSellStrategyViewModel$fetchRemoteStrategies$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TradeAutoSellStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAutoSellStrategyViewModel$fetchRemoteStrategies$1(TradeAutoSellStrategyViewModel tradeAutoSellStrategyViewModel, Continuation<? super TradeAutoSellStrategyViewModel$fetchRemoteStrategies$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeAutoSellStrategyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeAutoSellStrategyViewModel$fetchRemoteStrategies$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeAutoSellStrategyViewModel$fetchRemoteStrategies$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AEQbTJ.setValue(AbstractC30505lcS.ActionBar.AEQbTJ);
                InterfaceC28149kQs interfaceC28149kQs = this.this$0.OLrzqt;
                this.label = 1;
                obj = interfaceC28149kQs.copydefault(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
            TradeAutoSellStrategyViewModel tradeAutoSellStrategyViewModel = this.this$0;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                TPSLRemoteConfigResponse tPSLRemoteConfigResponse = (TPSLRemoteConfigResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                pUU.EZpvd("TradeAutoSellStrategyVM", "Fetched TPSL remote config: " + tPSLRemoteConfigResponse);
                tradeAutoSellStrategyViewModel.AEQbTJ.setValue(new AbstractC30505lcS.TaskDescription(C30507lcU.EZpvd(tPSLRemoteConfigResponse.getResult())));
            }
            TradeAutoSellStrategyViewModel tradeAutoSellStrategyViewModel2 = this.this$0;
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                pUU.copydefault("TradeAutoSellStrategyVM", "Failed to fetch TPSL remote config: " + oKServerException.getMessage());
                tradeAutoSellStrategyViewModel2.AEQbTJ.setValue(new AbstractC30505lcS.StateListAnimator(oKServerException.getMessage()));
            }
        } catch (Exception e) {
            pUU.AEQbTJ("TradeAutoSellStrategyVM", "Error fetching TPSL remote config", e);
            this.this$0.AEQbTJ.setValue(new AbstractC30505lcS.StateListAnimator(e.getMessage()));
        }
        return Unit.INSTANCE;
    }
}
