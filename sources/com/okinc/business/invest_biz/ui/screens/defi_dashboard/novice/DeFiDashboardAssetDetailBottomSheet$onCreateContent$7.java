package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C24214iZc;
import o.C56391yDq;
import o.C56442yFn;
import o.iZT;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiDashboardAssetDetailBottomSheet$onCreateContent$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecyclerView $recyclerView;
    int label;
    final /* synthetic */ C24214iZc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiDashboardAssetDetailBottomSheet$onCreateContent$7(C24214iZc c24214iZc, RecyclerView recyclerView, Continuation<? super DeFiDashboardAssetDetailBottomSheet$onCreateContent$7> continuation) {
        super(2, continuation);
        this.this$0 = c24214iZc;
        this.$recyclerView = recyclerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiDashboardAssetDetailBottomSheet$onCreateContent$7(this.this$0, this.$recyclerView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiDashboardAssetDetailBottomSheet$onCreateContent$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.this$0.EZpvd().AEQbTJ(), this.this$0.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED);
            final C24214iZc c24214iZc = this.this$0;
            final RecyclerView recyclerView = this.$recyclerView;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$onCreateContent$7.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(iZT izt, Continuation<? super Unit> continuation) {
                    if (!Intrinsics.EZpvd(c24214iZc.valueOf, izt)) {
                        c24214iZc.valueOf = izt;
                        C24214iZc c24214iZc2 = c24214iZc;
                        c24214iZc2.OLrzqt(izt, recyclerView, c24214iZc2.DbNXlk, c24214iZc.fetchVPNInfo, c24214iZc.AYXKKw);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowFlowWithLifecycle.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
