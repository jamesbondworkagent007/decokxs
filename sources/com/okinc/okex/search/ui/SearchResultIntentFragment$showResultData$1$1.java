package com.okinc.okex.search.ui;

import android.text.Spannable;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC47355toV;
import o.C44052sBo;
import o.C44711scA;
import o.C45391sos;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchResultIntentFragment$showResultData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C44052sBo $data;
    final /* synthetic */ AbstractC47355toV $this_apply;
    int label;
    final /* synthetic */ SearchResultIntentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultIntentFragment$showResultData$1$1(AbstractC47355toV abstractC47355toV, SearchResultIntentFragment searchResultIntentFragment, C44052sBo c44052sBo, Continuation<? super SearchResultIntentFragment$showResultData$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = abstractC47355toV;
        this.this$0 = searchResultIntentFragment;
        this.$data = c44052sBo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultIntentFragment$showResultData$1$1(this.$this_apply, this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultIntentFragment$showResultData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sos.detectLinks$default(android.widget.TextView, int, int, java.lang.Object):void */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MainCoroutineDispatcher mainCoroutineDispatcherKWHzl = C44711scA.EZpvd.KWHzl();
            SearchResultIntentFragment$showResultData$1$1$htmlSpan$1 searchResultIntentFragment$showResultData$1$1$htmlSpan$1 = new SearchResultIntentFragment$showResultData$1$1$htmlSpan$1(this.this$0, this.$data, null);
            this.label = 1;
            obj = BuildersKt.withContext(mainCoroutineDispatcherKWHzl, searchResultIntentFragment$showResultData$1$1$htmlSpan$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Spannable spannable = (Spannable) obj;
        this.$this_apply.AhwBna.setText(spannable);
        TextView textView = this.$this_apply.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C45391sos.detectLinks$default(textView, 0, 1, null);
        pUU.EZpvd(this.this$0.getTAG(), "showResultData > htmlSpan: " + ((Object) spannable));
        return Unit.INSTANCE;
    }
}
