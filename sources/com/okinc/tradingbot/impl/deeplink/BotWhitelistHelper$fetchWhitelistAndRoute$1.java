package com.okinc.tradingbot.impl.deeplink;

import android.content.Context;
import com.okinc.unify_trade.biz.OrderCategory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C51004veo;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.pUU;
import o.xOR;

/* JADX INFO: loaded from: classes11.dex */
public final class BotWhitelistHelper$fetchWhitelistAndRoute$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $onProceed;
    final /* synthetic */ String $strategyType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotWhitelistHelper$fetchWhitelistAndRoute$1(String str, Context context, Function0<Unit> function0, Continuation<? super BotWhitelistHelper$fetchWhitelistAndRoute$1> continuation) {
        super(2, continuation);
        this.$strategyType = str;
        this.$context = context;
        this.$onProceed = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotWhitelistHelper$fetchWhitelistAndRoute$1(this.$strategyType, this.$context, this.$onProceed, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotWhitelistHelper$fetchWhitelistAndRoute$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        xOR xorCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        List<OrderCategory> list = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1 botWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1 = new BotWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, botWhitelistHelper$fetchWhitelistAndRoute$1$strategies$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            list = (List) obj;
        } catch (Exception e) {
            pUU.AEQbTJ("BotWhitelistHelper", "Failed to fetch strategy types for whitelist check", e);
        }
        if (list != null && !list.isEmpty() && (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null) {
            xorCopydefault.OLrzqt(list);
        }
        if (list == null || list.isEmpty()) {
            this.$onProceed.invoke();
            break;
        }
        String str = this.$strategyType;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((OrderCategory) it.next()).getStrategyType(), (Object) str)) {
                    this.$onProceed.invoke();
                    break;
                }
            }
        }
        pUU.KWHzl("BotWhitelistHelper", "Non-whitelisted for " + this.$strategyType + " (fresh fetch), redirecting");
        C51004veo.OLrzqt.OLrzqt(this.$context);
        return Unit.INSTANCE;
    }
}
