package com.okinc.find_ui.ranking.hot;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C34971nmX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHomeHotRankingFragmentV2$setListener$3 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends Object>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34971nmX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeHotRankingFragmentV2$setListener$3(C34971nmX c34971nmX, Continuation<? super MarketHomeHotRankingFragmentV2$setListener$3> continuation) {
        super(2, continuation);
        this.this$0 = c34971nmX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeHotRankingFragmentV2$setListener$3 marketHomeHotRankingFragmentV2$setListener$3 = new MarketHomeHotRankingFragmentV2$setListener$3(this.this$0, continuation);
        marketHomeHotRankingFragmentV2$setListener$3.L$0 = obj;
        return marketHomeHotRankingFragmentV2$setListener$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49371unL<? extends List<? extends Object>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((MarketHomeHotRankingFragmentV2$setListener$3) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                this.this$0.zuBGHE().setItems((List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
                this.this$0.zuBGHE().notifyDataSetChanged();
                this.this$0.EZpvd(false);
                this.this$0.KWHzl(false);
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                this.this$0.EZpvd(false);
                if (this.this$0.iwGUEr()) {
                    this.this$0.KWHzl(true);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
