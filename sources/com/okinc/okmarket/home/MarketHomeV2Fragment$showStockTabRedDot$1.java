package com.okinc.okmarket.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C40440qVy;
import o.C55244xgL;
import o.C56391yDq;
import o.C56442yFn;
import o.qZH;
import o.qZO;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketHomeV2Fragment$showStockTabRedDot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$showStockTabRedDot$1(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$showStockTabRedDot$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeV2Fragment$showStockTabRedDot$1 marketHomeV2Fragment$showStockTabRedDot$1 = new MarketHomeV2Fragment$showStockTabRedDot$1(this.this$0, continuation);
        marketHomeV2Fragment$showStockTabRedDot$1.L$0 = obj;
        return marketHomeV2Fragment$showStockTabRedDot$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$showStockTabRedDot$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55244xgL c55244xgL;
        C55244xgL c55244xgL2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, C40440qVy.Companion.AEQbTJ(), null, new MarketHomeV2Fragment$showStockTabRedDot$1$isShow$1(null), 2, null);
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            int iIntValue = ((Number) this.this$0.KWHzl(qZH.PendingIntent.GqbzPL).getSecond()).intValue();
            if (iIntValue != -1) {
                qZO qzo = this.this$0.fetchVPNInfo;
                if (qzo == null || (c55244xgL2 = qzo.OLrzqt) == null || iIntValue != c55244xgL2.gEmmrt()) {
                    qZO qzo2 = this.this$0.fetchVPNInfo;
                    if (qzo2 != null && (c55244xgL = qzo2.OLrzqt) != null) {
                        c55244xgL.EZpvd(iIntValue);
                    }
                } else {
                    this.this$0.copydefault(iIntValue);
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
