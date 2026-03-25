package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C20037gYo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20068gZs;
import o.hBC;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyPositionFragment$setListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C20037gYo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyPositionFragment$setListener$1(C20037gYo c20037gYo, Continuation<? super StrategyPositionFragment$setListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c20037gYo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyPositionFragment$setListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyPositionFragment$setListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC20068gZs> stateFlowAEQbTJ = this.this$0.djBIcL().AEQbTJ();
            final C20037gYo c20037gYo = this.this$0;
            FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$setListener$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                    LinearLayoutCompat linearLayoutCompat;
                    hBC hbcKWHzl;
                    LinearLayoutCompat linearLayoutCompat2;
                    c20037gYo.EZpvd(interfaceC20068gZs);
                    boolean z = interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator;
                    int i2 = 0;
                    if (z || (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar)) {
                        rVN.reportFullyDrawn$default((Fragment) c20037gYo, true, (String) null, 2, (Object) null);
                    } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
                        rVN.reportFullyDrawn$default((Fragment) c20037gYo, false, (String) null, 2, (Object) null);
                    }
                    hBC hbcKWHzl2 = C20037gYo.KWHzl(c20037gYo);
                    if (hbcKWHzl2 != null && (linearLayoutCompat = hbcKWHzl2.OLrzqt) != null) {
                        if (!z && (!(interfaceC20068gZs instanceof InterfaceC20068gZs.TaskDescription) || c20037gYo.KWHzl().getItemCount() <= 0 || (hbcKWHzl = C20037gYo.KWHzl(c20037gYo)) == null || (linearLayoutCompat2 = hbcKWHzl.OLrzqt) == null || linearLayoutCompat2.getVisibility() != 0)) {
                            i2 = 8;
                        }
                        linearLayoutCompat.setVisibility(i2);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
