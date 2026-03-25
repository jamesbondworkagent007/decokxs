package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import android.app.Activity;
import com.okinc.tradelite.bean.TradeProductId;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49505upn;

/* JADX INFO: loaded from: classes16.dex */
public final class StgyCopyPresenter$startRiskEvaluationFlow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ StgyCopyPresenter.Activity $event;
    final /* synthetic */ TradeProductId $productId;
    final /* synthetic */ InterfaceC49505upn $tradeLiteUiService;
    int label;
    final /* synthetic */ StgyCopyPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StgyCopyPresenter$startRiskEvaluationFlow$1$1(InterfaceC49505upn interfaceC49505upn, Activity activity, TradeProductId tradeProductId, StgyCopyPresenter stgyCopyPresenter, StgyCopyPresenter.Activity activity2, Continuation<? super StgyCopyPresenter$startRiskEvaluationFlow$1$1> continuation) {
        super(2, continuation);
        this.$tradeLiteUiService = interfaceC49505upn;
        this.$activity = activity;
        this.$productId = tradeProductId;
        this.this$0 = stgyCopyPresenter;
        this.$event = activity2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StgyCopyPresenter$startRiskEvaluationFlow$1$1(this.$tradeLiteUiService, this.$activity, this.$productId, this.this$0, this.$event, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StgyCopyPresenter$startRiskEvaluationFlow$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49505upn interfaceC49505upn = this.$tradeLiteUiService;
            Activity activity = this.$activity;
            TradeProductId tradeProductId = this.$productId;
            this.label = 1;
            obj = interfaceC49505upn.KWHzl(activity, tradeProductId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.copydefault.tryEmit(this.$event);
        } else {
            this.this$0.copydefault.tryEmit(StgyCopyPresenter.Activity.StateListAnimator.EZpvd);
        }
        return Unit.INSTANCE;
    }
}
