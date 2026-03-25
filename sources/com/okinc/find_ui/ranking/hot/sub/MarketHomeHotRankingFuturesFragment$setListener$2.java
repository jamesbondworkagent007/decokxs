package com.okinc.find_ui.ranking.hot.sub;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC32996moC;
import o.C34972nmY;
import o.C35034nnh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.rVN;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeHotRankingFuturesFragment$setListener$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends Object>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35034nnh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeHotRankingFuturesFragment$setListener$2(C35034nnh c35034nnh, Continuation<? super MarketHomeHotRankingFuturesFragment$setListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c35034nnh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeHotRankingFuturesFragment$setListener$2 marketHomeHotRankingFuturesFragment$setListener$2 = new MarketHomeHotRankingFuturesFragment$setListener$2(this.this$0, continuation);
        marketHomeHotRankingFuturesFragment$setListener$2.L$0 = obj;
        return marketHomeHotRankingFuturesFragment$setListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49371unL<? extends List<? extends Object>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((MarketHomeHotRankingFuturesFragment$setListener$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                this.this$0.AuCTelauCTel().setItems((List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
                this.this$0.AuCTelauCTel().notifyDataSetChanged();
                this.this$0.EZpvd(false);
                this.this$0.KWHzl(false);
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                AbstractC32996moC abstractC32996moC = this.this$0;
                if (!(abstractC32996moC instanceof C34972nmY)) {
                    Fragment parentFragment = abstractC32996moC.getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof C34972nmY)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    abstractC32996moC = (C34972nmY) (parentFragment instanceof C34972nmY ? parentFragment : null);
                }
                C34972nmY c34972nmY = (C34972nmY) abstractC32996moC;
                if (c34972nmY != null) {
                    c34972nmY.AkhnZx();
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
