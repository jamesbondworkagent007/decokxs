package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25973jNf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jMI;
import o.jMM;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC49371unL<Object> $result;
    Object L$0;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2(jMI jmi, InterfaceC49371unL<? extends Object> interfaceC49371unL, Continuation<? super SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
        this.$result = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HashMap map;
        Throwable thAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap map2 = this.this$0.valueOf;
            jMI jmi = this.this$0;
            SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna = jmi.AhwBna();
            this.L$0 = map2;
            this.label = 1;
            Object objAEQbTJ = jmi.AEQbTJ(spotAnalysisPnlDetailViewModelAhwBna, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            map = map2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (HashMap) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        jMM jmm = (jMM) map.get(((C25973jNf) obj).copydefault());
        if (jmm != null) {
            InterfaceC49371unL<Object> interfaceC49371unL = this.$result;
            InterfaceC49371unL.Application application = interfaceC49371unL instanceof InterfaceC49371unL.Application ? (InterfaceC49371unL.Application) interfaceC49371unL : null;
            InterfaceC49371unL taskDescription = (application == null || (thAEQbTJ = application.AEQbTJ()) == null) ? new InterfaceC49371unL.TaskDescription(null, 1, null) : new InterfaceC49371unL.Application(thAEQbTJ, null, 2, null);
            final jMI jmi2 = this.this$0;
            jMM.updatePageState$default(jmm, taskDescription, null, new Function0() { // from class: o.jML
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SpotAnalysisPnlDetailFragment$handleRequestFailOrEmpty$2.invokeSuspend$lambda$1(jmi2);
                }
            }, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(jMI jmi) {
        jmi.gEmmrt();
        return Unit.INSTANCE;
    }
}
