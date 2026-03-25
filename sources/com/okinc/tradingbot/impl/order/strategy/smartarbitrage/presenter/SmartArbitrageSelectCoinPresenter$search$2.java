package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageListSorter;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C47222tlv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageSelectCoinPresenter$search$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $period;
    final /* synthetic */ String $query;
    final /* synthetic */ OKSortTextView.SortType $sortType;
    final /* synthetic */ SmartArbitrageListSorter.SortingCriterion $sortingCriterion;
    int label;
    final /* synthetic */ SmartArbitrageSelectCoinPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageSelectCoinPresenter$search$2(SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter, String str, OKSortTextView.SortType sortType, String str2, SmartArbitrageListSorter.SortingCriterion sortingCriterion, Continuation<? super SmartArbitrageSelectCoinPresenter$search$2> continuation) {
        super(2, continuation);
        this.this$0 = smartArbitrageSelectCoinPresenter;
        this.$query = str;
        this.$sortType = sortType;
        this.$period = str2;
        this.$sortingCriterion = sortingCriterion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartArbitrageSelectCoinPresenter$search$2(this.this$0, this.$query, this.$sortType, this.$period, this.$sortingCriterion, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbitrageSelectCoinPresenter$search$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listSearchAndSortItems$default;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter = this.this$0;
            if (StringsKt__StringsKt.fARcdN((CharSequence) this.$query)) {
                List<FundingRateArbCoin> listKWHzl = this.this$0.KWHzl();
                SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter2 = this.this$0;
                listSearchAndSortItems$default = new ArrayList();
                for (Object obj2 : listKWHzl) {
                    if (!smartArbitrageSelectCoinPresenter2.KWHzl((FundingRateArbCoin) obj2)) {
                        listSearchAndSortItems$default.add(obj2);
                    }
                }
            } else {
                C47222tlv c47222tlv = C47222tlv.KWHzl;
                String str = this.$query;
                List<FundingRateArbCoin> listKWHzl2 = this.this$0.KWHzl();
                SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter3 = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listKWHzl2) {
                    if (!smartArbitrageSelectCoinPresenter3.EZpvd((FundingRateArbCoin) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(c47222tlv, str, arrayList, FuzzySearchEventSourceEnum.OKTRADECORE_COIN.getSource(), false, 8, null);
            }
            smartArbitrageSelectCoinPresenter.AYXKKw = listSearchAndSortItems$default;
            this.this$0.OLrzqt.copydefault(this.this$0.AYXKKw);
            this.this$0.OLrzqt().postValue(this.this$0.OLrzqt.EZpvd(this.$query, this.$sortType, this.$period, this.$sortingCriterion));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
