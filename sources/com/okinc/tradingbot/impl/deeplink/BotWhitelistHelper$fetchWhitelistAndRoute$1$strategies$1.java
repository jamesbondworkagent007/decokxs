package com.okinc.tradingbot.impl.deeplink;

import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.OrderCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uLO;

/* JADX INFO: loaded from: classes11.dex */
public final class BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends OrderCategory>>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1(Continuation<? super BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends OrderCategory>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<OrderCategory>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<OrderCategory>> continuation) {
        return ((BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            uLO uloAEQbTJ = uLO.Companion.AEQbTJ();
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            obj = uloAEQbTJ.KWHzl(unit, (Continuation) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return ((BotCategoryConfig) obj).getStrategy();
    }
}
