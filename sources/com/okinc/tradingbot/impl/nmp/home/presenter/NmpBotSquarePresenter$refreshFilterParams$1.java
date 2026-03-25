package com.okinc.tradingbot.impl.nmp.home.presenter;

import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class NmpBotSquarePresenter$refreshFilterParams$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeStrategyDropDownInfo $filterInfo;
    int label;
    final /* synthetic */ NmpBotSquarePresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NmpBotSquarePresenter$refreshFilterParams$1(NmpBotSquarePresenter nmpBotSquarePresenter, HomeStrategyDropDownInfo homeStrategyDropDownInfo, Continuation<? super NmpBotSquarePresenter$refreshFilterParams$1> continuation) {
        super(2, continuation);
        this.this$0 = nmpBotSquarePresenter;
        this.$filterInfo = homeStrategyDropDownInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NmpBotSquarePresenter$refreshFilterParams$1(this.this$0, this.$filterInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NmpBotSquarePresenter$refreshFilterParams$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            NmpBotSquarePresenter nmpBotSquarePresenter = this.this$0;
            HomeStrategyDropDownInfo homeStrategyDropDownInfo = this.$filterInfo;
            this.label = 1;
            obj = nmpBotSquarePresenter.OLrzqt(homeStrategyDropDownInfo, (Continuation<? super Boolean>) this);
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
            NmpBotSquarePresenter.refreshBotList$default(this.this$0, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}
