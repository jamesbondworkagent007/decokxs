package com.okinc.business.defi.wallet.tx.history.segwit;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C16488ekq;
import o.C19429gCa;
import o.C19437gCi;
import o.C33134mqi;
import o.C56391yDq;
import o.C56442yFn;
import o.C59534zip;
import o.Point;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class AggregationAddressSwitchFragment$observeAggregationListState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19429gCa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregationAddressSwitchFragment$observeAggregationListState$1(C19429gCa c19429gCa, Continuation<? super AggregationAddressSwitchFragment$observeAggregationListState$1> continuation) {
        super(2, continuation);
        this.this$0 = c19429gCa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregationAddressSwitchFragment$observeAggregationListState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AggregationAddressSwitchFragment$observeAggregationListState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Point<List<C19437gCi>>> stateFlowEZpvd = this.this$0.AEQbTJ().EZpvd();
            final C19429gCa c19429gCa = this.this$0;
            FlowCollector<? super Point<List<C19437gCi>>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchFragment$observeAggregationListState$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(Point<? extends List<C19437gCi>> point, Continuation<? super Unit> continuation) {
                    if (point == null) {
                        return Unit.INSTANCE;
                    }
                    C16488ekq c16488ekq = null;
                    if (point instanceof Point.StateListAnimator) {
                        C16488ekq c16488ekq2 = c19429gCa.values;
                        if (c16488ekq2 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c16488ekq = c16488ekq2;
                        }
                        c16488ekq.EZpvd.KWHzl(0L);
                    } else if (point instanceof Point.Application) {
                        C16488ekq c16488ekq3 = c19429gCa.values;
                        if (c16488ekq3 == null) {
                            Intrinsics.gEmmrt("");
                            c16488ekq3 = null;
                        }
                        c16488ekq3.EZpvd.copydefault();
                        C59534zip c59534zip = c19429gCa.AEQbTJ;
                        if (c59534zip != null) {
                            c59534zip.setItems((List) ((Point.Application) point).copydefault());
                        }
                        C59534zip c59534zip2 = c19429gCa.AEQbTJ;
                        if (c59534zip2 != null) {
                            c59534zip2.notifyDataSetChanged();
                        }
                        rVN.reportFullyDrawn$default((Fragment) c19429gCa, true, (String) null, 2, (Object) null);
                    } else if (point instanceof Point.TaskDescription) {
                        C16488ekq c16488ekq4 = c19429gCa.values;
                        if (c16488ekq4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c16488ekq = c16488ekq4;
                        }
                        c16488ekq.EZpvd.copydefault();
                        C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
