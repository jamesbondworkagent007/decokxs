package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.bot.presenter.TacticsListPresenter;
import java.util.List;
import kotlin.Unit;
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
import o.rVN;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListFragment$subscribeOnUIChange$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isOverMax;
    final /* synthetic */ C55804xqp<List<BizTradeStrategyInfo>> $it;
    int label;
    final /* synthetic */ C52324wHe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListFragment$subscribeOnUIChange$7$1(C52324wHe c52324wHe, C55804xqp<List<BizTradeStrategyInfo>> c55804xqp, boolean z, Continuation<? super TacticsListFragment$subscribeOnUIChange$7$1> continuation) {
        super(2, continuation);
        this.this$0 = c52324wHe;
        this.$it = c55804xqp;
        this.$isOverMax = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsListFragment$subscribeOnUIChange$7$1(this.this$0, this.$it, this.$isOverMax, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsListFragment$subscribeOnUIChange$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: com.okinc.unify_trade.bot.presenter.TacticsListPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TacticsListPresenter tacticsListPresenterValues = C52324wHe.values(this.this$0);
            C55237xgE c55237xgE = C52324wHe.AkhnZx(this.this$0).EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
            int iOLrzqt = C49953uyK.OLrzqt(c55237xgE);
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            tacticsListPresenterValues.OLrzqt(C55298xhM.EZpvd(iOLrzqt, contextRequireContext));
            TacticsListPresenter tacticsListPresenterValues2 = C52324wHe.values(this.this$0);
            C55804xqp<List<BizTradeStrategyInfo>> c55804xqp = this.$it;
            List<?> items = this.this$0.zuBGHE().getItems();
            Intrinsics.copydefault(items, "");
            tacticsListPresenterValues2.OLrzqt(c55804xqp, (List<? extends Object>) items, this.$isOverMax);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
