package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import android.content.Context;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.TacticsListPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C49953uyK;
import o.C52324wHe;
import o.C55237xgE;
import o.C55298xhM;
import o.C55804xqp;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListFragment$processProfitData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TacticsData $data;
    final /* synthetic */ List<StrategyProfitResponse> $responseList;
    int label;
    final /* synthetic */ C52324wHe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListFragment$processProfitData$1(C52324wHe c52324wHe, TacticsData tacticsData, List<StrategyProfitResponse> list, Continuation<? super TacticsListFragment$processProfitData$1> continuation) {
        super(2, continuation);
        this.this$0 = c52324wHe;
        this.$data = tacticsData;
        this.$responseList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsListFragment$processProfitData$1(this.this$0, this.$data, this.$responseList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsListFragment$processProfitData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.okinc.unify_trade.bot.presenter.TacticsListPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer next;
        List<StrategyProfitResponse> listFJNWhG;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55804xqp<List<BizTradeStrategyInfo>> value = C52324wHe.values(this.this$0).isConnected().getValue();
            List<BizTradeStrategyInfo> listCopydefault = value != null ? value.copydefault() : null;
            List list = listCopydefault instanceof CopyOnWriteArrayList ? (CopyOnWriteArrayList) listCopydefault : null;
            if (list == null) {
                List<BizTradeStrategyInfo> listCopydefault2 = value != null ? value.copydefault() : null;
                list = listCopydefault2 instanceof ArrayList ? (ArrayList) listCopydefault2 : null;
            }
            if (list != null) {
                TacticsData tacticsData = this.$data;
                List<StrategyProfitResponse> list2 = this.$responseList;
                C52324wHe c52324wHe = this.this$0;
                Iterator<Integer> it = yDY.valueOf((Collection<?>) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((BizTradeStrategyInfo) list.get(next.intValue())).getOrderAlgoId(), (Object) tacticsData.getAlgoId())) {
                        break;
                    }
                }
                Integer num = next;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue != -1 && iIntValue < list.size() && list2 != null && (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) list2)) != null) {
                        ((BizTradeStrategyInfo) list.get(iIntValue)).setOngoingProfitSnapshots(listFJNWhG);
                    }
                    if (c52324wHe.getContext() == null || !c52324wHe.isAdded()) {
                        return Unit.INSTANCE;
                    }
                    TacticsListPresenter tacticsListPresenterValues = C52324wHe.values(c52324wHe);
                    C55237xgE c55237xgE = C52324wHe.AkhnZx(c52324wHe).EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
                    tacticsListPresenterValues.OLrzqt(C55298xhM.px2dp$default(C49953uyK.OLrzqt(c55237xgE), (Context) null, 1, (Object) null));
                    TacticsListPresenter tacticsListPresenterValues2 = C52324wHe.values(c52324wHe);
                    Intrinsics.copydefault(value);
                    List<?> items = c52324wHe.zuBGHE().getItems();
                    Intrinsics.copydefault(items, "");
                    tacticsListPresenterValues2.OLrzqt(value, (List<? extends Object>) items, false);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
