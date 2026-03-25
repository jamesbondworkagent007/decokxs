package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25918jLe;
import o.C56391yDq;
import o.C56442yFn;
import o.jKQ;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1(jKQ jkq, Continuation<? super FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jKQ jkq = this.this$0;
            FuturesAnalysisViewModel futuresAnalysisViewModelGEmmrt = jkq.gEmmrt();
            this.label = 1;
            obj = jkq.AEQbTJ(futuresAnalysisViewModelGEmmrt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zGEmmrt = ((FuturesAnalysisViewModel.StateListAnimator) obj).gEmmrt();
        final jKQ jkq2 = this.this$0;
        C25918jLe c25918jLe = new C25918jLe(zGEmmrt, new Function1() { // from class: o.jKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1.invokeSuspend$lambda$0(jkq2, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25918jLe.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(jKQ jkq, boolean z) {
        jkq.gEmmrt().KWHzl(z);
        return Unit.INSTANCE;
    }
}
