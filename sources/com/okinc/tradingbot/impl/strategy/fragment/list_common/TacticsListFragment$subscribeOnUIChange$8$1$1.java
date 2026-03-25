package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import android.content.Context;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.bot.presenter.TacticsListPresenter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
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
import o.InterfaceC55705xow;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListFragment$subscribeOnUIChange$8$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BizTradeStrategyInfo $data;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52324wHe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListFragment$subscribeOnUIChange$8$1$1(C52324wHe c52324wHe, BizTradeStrategyInfo bizTradeStrategyInfo, Continuation<? super TacticsListFragment$subscribeOnUIChange$8$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c52324wHe;
        this.$data = bizTradeStrategyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TacticsListFragment$subscribeOnUIChange$8$1$1 tacticsListFragment$subscribeOnUIChange$8$1$1 = new TacticsListFragment$subscribeOnUIChange$8$1$1(this.this$0, this.$data, continuation);
        tacticsListFragment$subscribeOnUIChange$8$1$1.L$0 = obj;
        return tacticsListFragment$subscribeOnUIChange$8$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsListFragment$subscribeOnUIChange$8$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.okinc.unify_trade.bot.presenter.TacticsListPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Integer next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C52324wHe c52324wHe = this.this$0;
            BizTradeStrategyInfo bizTradeStrategyInfo = this.$data;
            try {
                Result.Application application = Result.Companion;
                C55804xqp<List<BizTradeStrategyInfo>> value = C52324wHe.values(c52324wHe).isConnected().getValue();
                InterfaceC55705xow interfaceC55705xow = c52324wHe.zsXlph;
                if (interfaceC55705xow != null) {
                    interfaceC55705xow.copydefault(bizTradeStrategyInfo);
                }
                Unit unit = null;
                List<BizTradeStrategyInfo> listCopydefault = value != null ? value.copydefault() : null;
                CopyOnWriteArrayList copyOnWriteArrayList = listCopydefault instanceof CopyOnWriteArrayList ? (CopyOnWriteArrayList) listCopydefault : null;
                if (copyOnWriteArrayList != null) {
                    Iterator<Integer> it = yDY.valueOf((Collection<?>) copyOnWriteArrayList).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        BizTradeStrategyInfo bizTradeStrategyInfo2 = (BizTradeStrategyInfo) CollectionsKt___CollectionsKt.AkhnZx(copyOnWriteArrayList, next.intValue());
                        if (Intrinsics.EZpvd((Object) (bizTradeStrategyInfo2 != null ? bizTradeStrategyInfo2.getOrderAlgoId() : null), (Object) bizTradeStrategyInfo.getOrderAlgoId())) {
                            break;
                        }
                    }
                    Integer num = next;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (iIntValue < copyOnWriteArrayList.size()) {
                            if (bizTradeStrategyInfo.isStop()) {
                                copyOnWriteArrayList.remove(iIntValue);
                            } else {
                                copyOnWriteArrayList.set(iIntValue, bizTradeStrategyInfo);
                            }
                            TacticsListPresenter tacticsListPresenterValues = C52324wHe.values(c52324wHe);
                            C55237xgE c55237xgE = C52324wHe.AkhnZx(c52324wHe).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
                            int iOLrzqt = C49953uyK.OLrzqt(c55237xgE);
                            Context contextRequireContext = c52324wHe.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            tacticsListPresenterValues.OLrzqt(C55298xhM.EZpvd(iOLrzqt, contextRequireContext));
                            TacticsListPresenter tacticsListPresenterValues2 = C52324wHe.values(c52324wHe);
                            List<?> items = c52324wHe.zuBGHE().getItems();
                            Intrinsics.copydefault(items, "");
                            tacticsListPresenterValues2.OLrzqt(value, (List<? extends Object>) items, false);
                        }
                        unit = Unit.INSTANCE;
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            C52324wHe c52324wHe2 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(c52324wHe2.getTAG(), "error: " + thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
