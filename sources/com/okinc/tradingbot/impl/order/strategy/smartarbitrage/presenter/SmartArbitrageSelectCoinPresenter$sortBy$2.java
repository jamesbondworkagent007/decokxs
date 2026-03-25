package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageListSorter;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageSelectCoinPresenter$sortBy$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $period;
    final /* synthetic */ OKSortTextView.SortType $sortType;
    final /* synthetic */ SmartArbitrageListSorter.SortingCriterion $sortingCriterion;
    int label;
    final /* synthetic */ SmartArbitrageSelectCoinPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageSelectCoinPresenter$sortBy$2(SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter, OKSortTextView.SortType sortType, String str, SmartArbitrageListSorter.SortingCriterion sortingCriterion, Continuation<? super SmartArbitrageSelectCoinPresenter$sortBy$2> continuation) {
        super(2, continuation);
        this.this$0 = smartArbitrageSelectCoinPresenter;
        this.$sortType = sortType;
        this.$period = str;
        this.$sortingCriterion = sortingCriterion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartArbitrageSelectCoinPresenter$sortBy$2(this.this$0, this.$sortType, this.$period, this.$sortingCriterion, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbitrageSelectCoinPresenter$sortBy$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt().postValue(this.this$0.OLrzqt.EZpvd("", this.$sortType, this.$period, this.$sortingCriterion));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
