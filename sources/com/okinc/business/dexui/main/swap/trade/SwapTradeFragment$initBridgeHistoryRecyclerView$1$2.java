package com.okinc.business.dexui.main.swap.trade;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
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
import o.C25045ipM;
import o.C33546myW;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapTradeFragment$initBridgeHistoryRecyclerView$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SwapTradeFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapTradeFragment$initBridgeHistoryRecyclerView$1$2(SwapTradeFragment swapTradeFragment, Continuation<? super SwapTradeFragment$initBridgeHistoryRecyclerView$1$2> continuation) {
        super(2, continuation);
        this.this$0 = swapTradeFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwapTradeFragment$initBridgeHistoryRecyclerView$1$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwapTradeFragment$initBridgeHistoryRecyclerView$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC20068gZs> stateFlowKWHzl = this.this$0.djBIcL().KWHzl();
            final SwapTradeFragment swapTradeFragment = this.this$0;
            FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.trade.SwapTradeFragment$initBridgeHistoryRecyclerView$1$2.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                    RecyclerView recyclerViewEZpvd;
                    C33546myW c33546myWCopydefault;
                    C33546myW c33546myWCopydefault2;
                    C33546myW c33546myWCopydefault3;
                    C33546myW c33546myWCopydefault4;
                    RecyclerView recyclerViewEZpvd2;
                    if (interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) {
                        C25045ipM c25045ipM = swapTradeFragment.fIwbmz;
                        if (c25045ipM != null && (recyclerViewEZpvd2 = c25045ipM.EZpvd()) != null) {
                            recyclerViewEZpvd2.setVisibility(0);
                        }
                        C25045ipM c25045ipM2 = swapTradeFragment.fIwbmz;
                        if (c25045ipM2 != null && (c33546myWCopydefault4 = c25045ipM2.copydefault()) != null) {
                            c33546myWCopydefault4.AhwBna(((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).AEQbTJ());
                        }
                        C25045ipM c25045ipM3 = swapTradeFragment.fIwbmz;
                        if (c25045ipM3 != null && (c33546myWCopydefault3 = c25045ipM3.copydefault()) != null) {
                            c33546myWCopydefault3.valueOf();
                        }
                        C25045ipM c25045ipM4 = swapTradeFragment.fIwbmz;
                        if (c25045ipM4 != null && (c33546myWCopydefault2 = c25045ipM4.copydefault()) != null) {
                            c33546myWCopydefault2.AEQbTJ();
                        }
                        swapTradeFragment.AhwBna().OLrzqt(CollectionsKt___CollectionsKt.fJNWhG((Collection) ((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).EZpvd()));
                    } else if ((interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar) || (interfaceC20068gZs instanceof InterfaceC20068gZs.Application)) {
                        C25045ipM c25045ipM5 = swapTradeFragment.fIwbmz;
                        if (c25045ipM5 != null && (recyclerViewEZpvd = c25045ipM5.EZpvd()) != null) {
                            recyclerViewEZpvd.setVisibility(8);
                        }
                    } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Fragment.KWHzl)) {
                        C25045ipM c25045ipM6 = swapTradeFragment.fIwbmz;
                        if (c25045ipM6 != null && (c33546myWCopydefault = c25045ipM6.copydefault()) != null) {
                            c33546myWCopydefault.valueOf();
                        }
                    } else if (!Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Activity.OLrzqt) && !Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.TaskDescription.OLrzqt)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
