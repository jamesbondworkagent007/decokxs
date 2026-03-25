package com.okinc.find_ui.ranking.percentchange.sub;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC32996moC;
import o.C35025nnY;
import o.C35086nog;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.rVN;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeUpRankingFuturesFragment$setListener$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends Object>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35086nog this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeUpRankingFuturesFragment$setListener$2(C35086nog c35086nog, Continuation<? super MarketHomeUpRankingFuturesFragment$setListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c35086nog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeUpRankingFuturesFragment$setListener$2 marketHomeUpRankingFuturesFragment$setListener$2 = new MarketHomeUpRankingFuturesFragment$setListener$2(this.this$0, continuation);
        marketHomeUpRankingFuturesFragment$setListener$2.L$0 = obj;
        return marketHomeUpRankingFuturesFragment$setListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49371unL<? extends List<? extends Object>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((MarketHomeUpRankingFuturesFragment$setListener$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                this.this$0.zLjUOn().setItems((List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
                this.this$0.zLjUOn().notifyDataSetChanged();
                this.this$0.EZpvd(false);
                this.this$0.KWHzl(false);
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                AbstractC32996moC abstractC32996moC = this.this$0;
                if (!(abstractC32996moC instanceof C35025nnY)) {
                    Fragment parentFragment = abstractC32996moC.getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof C35025nnY)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    abstractC32996moC = (C35025nnY) (parentFragment instanceof C35025nnY ? parentFragment : null);
                }
                C35025nnY c35025nnY = (C35025nnY) abstractC32996moC;
                if (c35025nnY != null) {
                    c35025nnY.values();
                }
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                this.this$0.EZpvd(false);
                if (this.this$0.iwGUEr()) {
                    this.this$0.KWHzl(true);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
