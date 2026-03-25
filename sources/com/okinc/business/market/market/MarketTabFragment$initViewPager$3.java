package com.okinc.business.market.market;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27857kFx;
import o.C43296rmc;
import o.C55608xnE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.pWO;

/* JADX INFO: loaded from: classes18.dex */
public final class MarketTabFragment$initViewPager$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C27857kFx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketTabFragment$initViewPager$3(C27857kFx c27857kFx, Continuation<? super MarketTabFragment$initViewPager$3> continuation) {
        super(2, continuation);
        this.this$0 = c27857kFx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketTabFragment$initViewPager$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketTabFragment$initViewPager$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C27857kFx c27857kFx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C27857kFx c27857kFx2 = this.this$0;
                Result.Application application = Result.Companion;
                InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                this.L$0 = c27857kFx2;
                this.label = 1;
                if (C55608xnE.copydefault(interfaceC54577xNnKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                c27857kFx = c27857kFx2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27857kFx = (C27857kFx) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            c27857kFx.EZpvd();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C27857kFx c27857kFx3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C43296rmc.copydefault(c27857kFx3.getTAG(), "trade manager ensureInit failed", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
