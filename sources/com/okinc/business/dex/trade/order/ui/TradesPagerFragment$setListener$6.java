package com.okinc.business.dex.trade.order.ui;

import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C22241hbe;
import o.C22254hbr;
import o.C33546myW;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20068gZs;
import o.hBR;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class TradesPagerFragment$setListener$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C22241hbe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradesPagerFragment$setListener$6(C22241hbe c22241hbe, Continuation<? super TradesPagerFragment$setListener$6> continuation) {
        super(2, continuation);
        this.this$0 = c22241hbe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradesPagerFragment$setListener$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradesPagerFragment$setListener$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC20068gZs> stateFlowAEQbTJ = this.this$0.AYXKKw().AEQbTJ();
            final C22241hbe c22241hbe = this.this$0;
            FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$setListener$6.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                    C33546myW c33546myW;
                    C33546myW c33546myW2;
                    C33546myW c33546myW3;
                    C33546myW c33546myW4;
                    C33546myW c33546myW5;
                    hBR hbr = c22241hbe.AhwBna;
                    if (hbr != null && (c33546myW5 = hbr.AEQbTJ) != null) {
                        c33546myW5.AEQbTJ();
                    }
                    hBR hbr2 = c22241hbe.AhwBna;
                    if (hbr2 != null && (c33546myW4 = hbr2.AEQbTJ) != null) {
                        c33546myW4.valueOf();
                    }
                    if (interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) {
                        c22241hbe.EZpvd(false);
                        hBR hbr3 = c22241hbe.AhwBna;
                        if (hbr3 != null && (c33546myW3 = hbr3.AEQbTJ) != null) {
                            c33546myW3.AhwBna(((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).AEQbTJ());
                        }
                        hBR hbr4 = c22241hbe.AhwBna;
                        if (hbr4 != null && (c33546myW2 = hbr4.AEQbTJ) != null) {
                            c33546myW2.valueOf();
                        }
                        InterfaceC20068gZs.StateListAnimator stateListAnimator = (InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs;
                        List<? extends Object> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) stateListAnimator.EZpvd());
                        if (!stateListAnimator.AEQbTJ()) {
                            listFJNWhG.add(new C22254hbr(null, false, 3, null));
                        }
                        c22241hbe.AhwBna().OLrzqt(listFJNWhG);
                        rVN.reportFullyDrawn$default((Fragment) c22241hbe, true, (String) null, 2, (Object) null);
                    } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar) {
                        c22241hbe.EZpvd(false);
                        c22241hbe.AhwBna().KWHzl();
                        rVN.reportFullyDrawn$default((Fragment) c22241hbe, true, (String) null, 2, (Object) null);
                    } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
                        c22241hbe.EZpvd(false);
                        c22241hbe.AhwBna().OLrzqt(((InterfaceC20068gZs.Application) interfaceC20068gZs).EZpvd());
                        rVN.reportFullyDrawn$default((Fragment) c22241hbe, false, (String) null, 2, (Object) null);
                    } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Activity.OLrzqt)) {
                        c22241hbe.EZpvd(true);
                    } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Fragment.KWHzl)) {
                        hBR hbr5 = c22241hbe.AhwBna;
                        if (hbr5 != null && (c33546myW = hbr5.AEQbTJ) != null) {
                            c33546myW.valueOf();
                        }
                    } else if (!Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.TaskDescription.OLrzqt)) {
                        throw new NoWhenBranchMatchedException();
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
