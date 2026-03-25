package com.okinc.tradingbot.impl.market_place.home.list.ui.fragment;

import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeStrategyListPresenter;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43316rmw;
import o.C51632vqg;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeStrategyListFragment$onVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C51632vqg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeStrategyListFragment$onVisible$1(C51632vqg c51632vqg, Continuation<? super HomeStrategyListFragment$onVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = c51632vqg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeStrategyListFragment$onVisible$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeStrategyListFragment$onVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        C51632vqg c51632vqg = this.this$0;
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            HomeStrategyListPresenter homeStrategyListPresenterAhwBna = C51632vqg.AhwBna(c51632vqg);
            HomeStrategySortConfig value = c51632vqg.AEQbTJ().copydefault().getValue();
            String str = c51632vqg.OLrzqt;
            String str2 = c51632vqg.AYXKKw;
            C43316rmw c43316rmw = c51632vqg.KWHzl;
            HomeStrategyListPresenter.fetchBotList$default(homeStrategyListPresenterAhwBna, value, str, str2, c43316rmw != null && c43316rmw.getItemCount() == 0, null, 16, null);
        }
        C51632vqg c51632vqg2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default) != null) {
            c51632vqg2.EZpvd();
        }
        return Unit.INSTANCE;
    }
}
