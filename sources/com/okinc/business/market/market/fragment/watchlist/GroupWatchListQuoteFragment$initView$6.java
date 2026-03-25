package com.okinc.business.market.market.fragment.watchlist;

import androidx.fragment.app.Fragment;
import com.okinc.business.market.bean.CoinQuote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C27931kIq;
import o.C33546myW;
import o.C41381qpj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.qXK;
import o.rVN;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListQuoteFragment$initView$6 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends CoinQuote>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C27931kIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListQuoteFragment$initView$6(C27931kIq c27931kIq, Continuation<? super GroupWatchListQuoteFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c27931kIq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupWatchListQuoteFragment$initView$6 groupWatchListQuoteFragment$initView$6 = new GroupWatchListQuoteFragment$initView$6(this.this$0, continuation);
        groupWatchListQuoteFragment$initView$6.L$0 = obj;
        return groupWatchListQuoteFragment$initView$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends CoinQuote>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<CoinQuote>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<CoinQuote>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((GroupWatchListQuoteFragment$initView$6) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C41381qpj c41381qpj;
        C33546myW c33546myWFetchVPNInfo;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                if (!this.this$0.AhwBna) {
                    this.this$0.AEQbTJ((ArrayList<CoinQuote>) new ArrayList((Collection) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()));
                }
                C27931kIq.handleSort$default(this.this$0, false, 1, null);
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if ((interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) && (c41381qpj = this.this$0.fARcdN) != null) {
                qXK.StateListAnimator.showLoadingState$default(c41381qpj, 0L, 1, null);
            }
            if (!(interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) && (c33546myWFetchVPNInfo = this.this$0.fetchVPNInfo()) != null) {
                c33546myWFetchVPNInfo.AEQbTJ();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
