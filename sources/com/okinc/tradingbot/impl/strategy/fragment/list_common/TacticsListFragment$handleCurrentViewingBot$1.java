package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C51046vfd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListFragment$handleCurrentViewingBot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ List<Object> $botList;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListFragment$handleCurrentViewingBot$1(List<? extends Object> list, String str, Continuation<? super TacticsListFragment$handleCurrentViewingBot$1> continuation) {
        super(2, continuation);
        this.$botList = list;
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsListFragment$handleCurrentViewingBot$1(this.$botList, this.$algoId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsListFragment$handleCurrentViewingBot$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        BalanceDetailInfoDto balanceDetails;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Object> list = this.$botList;
            String str = this.$algoId;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ((next instanceof TacticsData) && Intrinsics.EZpvd((Object) ((TacticsData) next).getAlgoId(), (Object) str)) {
                    break;
                }
            }
            if (next != null) {
                TacticsData tacticsData = next instanceof TacticsData ? (TacticsData) next : null;
                if (tacticsData == null || (balanceDetails = tacticsData.getBalanceDetails()) == null) {
                    return Unit.INSTANCE;
                }
                C51046vfd.Companion.KWHzl().tryEmit(balanceDetails);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
