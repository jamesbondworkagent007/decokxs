package com.okinc.find_ui.ranking.newcoin.home;

import com.okinc.find_ui.ranking.newcoin.adapter.MarketNewCoinSubPage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35047nnu;
import o.C42789rcz;
import o.C55244xgL;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeNewCoinFragment$displayRedDot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35047nnu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeNewCoinFragment$displayRedDot$1(C35047nnu c35047nnu, Continuation<? super MarketHomeNewCoinFragment$displayRedDot$1> continuation) {
        super(2, continuation);
        this.this$0 = c35047nnu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeNewCoinFragment$displayRedDot$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeNewCoinFragment$displayRedDot$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C42789rcz c42789rcz;
        C55244xgL c55244xgL;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35047nnu c35047nnu = this.this$0;
            this.label = 1;
            obj = c35047nnu.KWHzl((Continuation<? super Boolean>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue() && (c42789rcz = this.this$0.fIwbmz) != null && (c55244xgL = c42789rcz.EZpvd) != null) {
            c55244xgL.EZpvd(MarketNewCoinSubPage.FUTURES.ordinal());
        }
        return Unit.INSTANCE;
    }
}
