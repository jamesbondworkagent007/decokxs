package com.okinc.business.market.features.analysis.futures.sub.funding.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.FutureAnalysisCoinPairDialogFragment$initListener$2;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C25881jJv;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import o.rVN;

/* JADX INFO: loaded from: classes23.dex */
public final class FutureAnalysisCoinPairDialogFragment$initListener$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends CoinPairVo>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25881jJv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureAnalysisCoinPairDialogFragment$initListener$2(C25881jJv c25881jJv, Continuation<? super FutureAnalysisCoinPairDialogFragment$initListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c25881jJv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FutureAnalysisCoinPairDialogFragment$initListener$2 futureAnalysisCoinPairDialogFragment$initListener$2 = new FutureAnalysisCoinPairDialogFragment$initListener$2(this.this$0, continuation);
        futureAnalysisCoinPairDialogFragment$initListener$2.L$0 = obj;
        return futureAnalysisCoinPairDialogFragment$initListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends CoinPairVo>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<CoinPairVo>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<CoinPairVo>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((FutureAnalysisCoinPairDialogFragment$initListener$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if ((interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) || (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
                if (!this.this$0.valueOf) {
                    qXK.StateListAnimator.showLoadingState$default(this.this$0, 0L, 1, null);
                }
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                this.this$0.valueOf = true;
                List<?> list = (List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
                if (!list.isEmpty()) {
                    this.this$0.KWHzl.setItems(list);
                    this.this$0.KWHzl.notifyDataSetChanged();
                    this.this$0.AEQbTJ();
                } else {
                    qXK.StateListAnimator.showEmptyState$default(this.this$0, (String) null, C33070mpX.AYXKKw(qZH.PendingIntent.isConnected), (String) null, 0, (Function0) null, 29, (Object) null);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (!(interfaceC49371unL instanceof InterfaceC49371unL.Application)) {
                this.this$0.valueOf = true;
                qXK.StateListAnimator.showEmptyState$default(this.this$0, (String) null, C33070mpX.AYXKKw(qZH.PendingIntent.isConnected), (String) null, 0, (Function0) null, 29, (Object) null);
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else {
                final C25881jJv c25881jJv = this.this$0;
                c25881jJv.EZpvd(qZH.PendingIntent.GQzpsZ, qZH.PendingIntent.hwkNQP, qZH.PendingIntent.gFTCsA, new Function0() { // from class: o.jJC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return FutureAnalysisCoinPairDialogFragment$initListener$2.invokeSuspend$lambda$0(c25881jJv);
                    }
                });
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C25881jJv c25881jJv) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c25881jJv), null, null, new FutureAnalysisCoinPairDialogFragment$initListener$2$1$1(c25881jJv, null), 3, null);
        return Unit.INSTANCE;
    }
}
