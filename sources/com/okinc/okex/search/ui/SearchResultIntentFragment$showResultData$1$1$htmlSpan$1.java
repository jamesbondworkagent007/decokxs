package com.okinc.okex.search.ui;

import android.text.Spannable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C44052sBo;
import o.C45395sow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchResultIntentFragment$showResultData$1$1$htmlSpan$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Spannable>, Object> {
    final /* synthetic */ C44052sBo $data;
    int label;
    final /* synthetic */ SearchResultIntentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultIntentFragment$showResultData$1$1$htmlSpan$1(SearchResultIntentFragment searchResultIntentFragment, C44052sBo c44052sBo, Continuation<? super SearchResultIntentFragment$showResultData$1$1$htmlSpan$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultIntentFragment;
        this.$data = c44052sBo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultIntentFragment$showResultData$1$1$htmlSpan$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Spannable> continuation) {
        return ((SearchResultIntentFragment$showResultData$1$1$htmlSpan$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Spannable spannableAEQbTJ = this.this$0.DbNXlk().AEQbTJ(this.$data.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(spannableAEQbTJ, "");
            return C45395sow.AEQbTJ(spannableAEQbTJ);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
