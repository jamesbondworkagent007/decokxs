package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.unify_trade.bot.data.SelectCoinData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class RecurringTradePresenterNew$handleValidCoins$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<SelectCoinData> $currentAvailCoinList;
    int label;
    final /* synthetic */ RecurringTradePresenterNew this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringTradePresenterNew$handleValidCoins$2(ArrayList<SelectCoinData> arrayList, RecurringTradePresenterNew recurringTradePresenterNew, Continuation<? super RecurringTradePresenterNew$handleValidCoins$2> continuation) {
        super(2, continuation);
        this.$currentAvailCoinList = arrayList;
        this.this$0 = recurringTradePresenterNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringTradePresenterNew$handleValidCoins$2(this.$currentAvailCoinList, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringTradePresenterNew$handleValidCoins$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList<SelectCoinData> arrayList = this.$currentAvailCoinList;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SelectCoinData) it.next()).getName());
            }
            ArrayList<SelectCoinData> arrayListFARcdN = this.this$0.fARcdN();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayListFARcdN) {
                if (!arrayList2.contains(((SelectCoinData) obj2).getName())) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList<SelectCoinData> arrayListFARcdN2 = this.this$0.fARcdN();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayListFARcdN2) {
                if (arrayList2.contains(((SelectCoinData) obj3).getName())) {
                    arrayList4.add(obj3);
                }
            }
            if (arrayList4.isEmpty()) {
                this.this$0.OLrzqt((ArrayList<SelectCoinData>) this.$currentAvailCoinList);
                return Unit.INSTANCE;
            }
            if (C33129mqd.KWHzl((Collection) arrayList3)) {
                this.this$0.copydefault((List<SelectCoinData>) arrayList4);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
