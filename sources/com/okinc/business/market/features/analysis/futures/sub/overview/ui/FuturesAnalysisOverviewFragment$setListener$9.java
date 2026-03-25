package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C42782rcs;
import o.C56391yDq;
import o.C56442yFn;
import o.jKQ;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisOverviewFragment$setListener$9 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$setListener$9(jKQ jkq, Continuation<? super FuturesAnalysisOverviewFragment$setListener$9> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisOverviewFragment$setListener$9 futuresAnalysisOverviewFragment$setListener$9 = new FuturesAnalysisOverviewFragment$setListener$9(this.this$0, continuation);
        futuresAnalysisOverviewFragment$setListener$9.Z$0 = ((Boolean) obj).booleanValue();
        return futuresAnalysisOverviewFragment$setListener$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$setListener$9) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0 && this.this$0.copydefault;
            C42782rcs c42782rcs = this.this$0.AEQbTJ;
            if (c42782rcs != null && (appCompatTextView2 = c42782rcs.RJOkX) != null) {
                appCompatTextView2.setVisibility(z ? 0 : 8);
            }
            C42782rcs c42782rcs2 = this.this$0.AEQbTJ;
            if (c42782rcs2 != null && (appCompatTextView = c42782rcs2.aKErDB) != null) {
                appCompatTextView.setVisibility(z ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
