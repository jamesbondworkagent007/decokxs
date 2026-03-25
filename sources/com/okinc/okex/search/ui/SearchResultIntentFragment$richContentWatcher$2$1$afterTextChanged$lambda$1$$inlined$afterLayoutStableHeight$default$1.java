package com.okinc.okex.search.ui;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC47355toV;
import o.C45391sos;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchResultIntentFragment$richContentWatcher$2$1$afterTextChanged$lambda$1$$inlined$afterLayoutStableHeight$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $heightFlow;
    final /* synthetic */ AbstractC47355toV $this_apply$inlined;
    int label;
    final /* synthetic */ SearchResultIntentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultIntentFragment$richContentWatcher$2$1$afterTextChanged$lambda$1$$inlined$afterLayoutStableHeight$default$1(Flow flow, Continuation continuation, AbstractC47355toV abstractC47355toV, SearchResultIntentFragment searchResultIntentFragment) {
        super(2, continuation);
        this.$heightFlow = flow;
        this.$this_apply$inlined = abstractC47355toV;
        this.this$0 = searchResultIntentFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultIntentFragment$richContentWatcher$2$1$afterTextChanged$lambda$1$$inlined$afterLayoutStableHeight$default$1(this.$heightFlow, continuation, this.$this_apply$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultIntentFragment$richContentWatcher$2$1$afterTextChanged$lambda$1$$inlined$afterLayoutStableHeight$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flow = this.$heightFlow;
            final AbstractC47355toV abstractC47355toV = this.$this_apply$inlined;
            final SearchResultIntentFragment searchResultIntentFragment = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$richContentWatcher$2$1$afterTextChanged$lambda$1$$inlined$afterLayoutStableHeight$default$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return KWHzl(((Number) obj2).intValue(), continuation);
                }

                public final Object KWHzl(int i2, Continuation<? super Unit> continuation) {
                    TextView textView = abstractC47355toV.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    boolean zOLrzqt = C45391sos.OLrzqt(textView);
                    pUU.EZpvd(searchResultIntentFragment.getTAG(), "richContentWatcher: isClipped: " + zOLrzqt);
                    searchResultIntentFragment.fIwbmz().OLrzqt(zOLrzqt);
                    SearchResultIntentFragment searchResultIntentFragment2 = searchResultIntentFragment;
                    searchResultIntentFragment2.copydefault(zOLrzqt, searchResultIntentFragment2.fIwbmz().copydefault() || zOLrzqt);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == objCopydefault) {
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
