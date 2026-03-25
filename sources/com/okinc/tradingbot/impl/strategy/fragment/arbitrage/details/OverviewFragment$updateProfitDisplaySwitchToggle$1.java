package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.view.View;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.MarginPerCcyVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.UnitDisplayVo;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C55804xqp;
import o.C55930xtI;
import o.C56033xvF;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.uSF;

/* JADX INFO: loaded from: classes19.dex */
public final class OverviewFragment$updateProfitDisplaySwitchToggle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55804xqp<StrategyDetailsResponse> $currentList;
    final /* synthetic */ int $selectedIndex;
    Object L$0;
    int label;
    final /* synthetic */ OverviewFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewFragment$updateProfitDisplaySwitchToggle$1(OverviewFragment overviewFragment, C55804xqp<StrategyDetailsResponse> c55804xqp, int i, Continuation<? super OverviewFragment$updateProfitDisplaySwitchToggle$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewFragment;
        this.$currentList = c55804xqp;
        this.$selectedIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewFragment$updateProfitDisplaySwitchToggle$1(this.this$0, this.$currentList, this.$selectedIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewFragment$updateProfitDisplaySwitchToggle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        BotVo bot;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        Map<String, MarginPerCcyVo> marginPerCcy;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        MarginPerCcyVo marginPerCcyVo = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, this.$currentList, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        OverviewFragment overviewFragment = this.this$0;
        TacticsData tacticsData = (TacticsData) CollectionsKt___CollectionsKt.firstOrNull((List) objectRef.element);
        if (tacticsData == null) {
            tacticsData = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
        }
        overviewFragment.fARcdN = tacticsData;
        uSF usf = this.this$0.AhwBna;
        if (usf != null) {
            OverviewFragment overviewFragment2 = this.this$0;
            boolean zAEQbTJ = overviewFragment2.AEQbTJ(overviewFragment2.fARcdN, this.$selectedIndex);
            if (zAEQbTJ && (bot = overviewFragment2.fARcdN.getBot()) != null && (contractGrid = bot.getContractGrid()) != null && (unitDisplayVO = contractGrid.getUnitDisplayVO()) != null && (marginPerCcy = unitDisplayVO.getMarginPerCcy()) != null) {
                marginPerCcyVo = marginPerCcy.get("USDT");
            }
            Pair pairCopydefault = overviewFragment2.copydefault(zAEQbTJ, marginPerCcyVo);
            usf.isConnected.KWHzl((String) pairCopydefault.component2(), C56033xvF.OLrzqt((Object) C55930xtI.ActionBar.KWHzl(((C55930xtI.ActionBar) pairCopydefault.component1()).KWHzl())));
            View root = usf.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            overviewFragment2.EZpvd(root, usf, overviewFragment2.fARcdN);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$updateProfitDisplaySwitchToggle$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C55804xqp<StrategyDetailsResponse> $currentList;
        final /* synthetic */ Ref.ObjectRef<List<TacticsData>> $dataList;
        int label;
        final /* synthetic */ OverviewFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<TacticsData>> objectRef, OverviewFragment overviewFragment, C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dataList = objectRef;
            this.this$0 = overviewFragment;
            this.$currentList = c55804xqp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dataList, this.this$0, this.$currentList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$dataList.element = this.this$0.AEQbTJ((C55804xqp<List<StrategyDetailsResponse>>) new C55804xqp("", C56402yEa.EZpvd(this.$currentList.copydefault()), null, null, 12, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
