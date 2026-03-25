package com.okinc.business.market.features.tag.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C21847hOn;
import o.C29721kyw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class TagExplanationFragment$onDevAnalysisClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C29721kyw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagExplanationFragment$onDevAnalysisClick$1(C29721kyw c29721kyw, Continuation<? super TagExplanationFragment$onDevAnalysisClick$1> continuation) {
        super(2, continuation);
        this.this$0 = c29721kyw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagExplanationFragment$onDevAnalysisClick$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TagExplanationFragment$onDevAnalysisClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TagExplanationViewModel tagExplanationViewModelEjfBZ = this.this$0.ejfBZ();
            str = "token_detail_tab_click";
            this.L$0 = "token_detail_tab_click";
            this.L$1 = "dev_token";
            this.label = 1;
            obj = tagExplanationViewModelEjfBZ.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            str2 = "dev_token";
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C21847hOn.EZpvd(str, str2, (String) obj);
        return Unit.INSTANCE;
    }
}
