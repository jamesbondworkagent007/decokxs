package com.okinc.business.market.features.meme.explanation.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29715kyq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28706kfo;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeLabelExplanationViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $keys;
    int label;
    final /* synthetic */ MemeLabelExplanationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeLabelExplanationViewModel$loadData$1(MemeLabelExplanationViewModel memeLabelExplanationViewModel, List<String> list, Continuation<? super MemeLabelExplanationViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = memeLabelExplanationViewModel;
        this.$keys = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeLabelExplanationViewModel$loadData$1(this.this$0, this.$keys, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeLabelExplanationViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8678batchGet0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29715kyq c29715kyqCopydefault = this.this$0.copydefault();
            List<String> list = this.$keys;
            this.label = 1;
            objM8678batchGet0E7RQCE$default = C29715kyq.m8678batchGet0E7RQCE$default(c29715kyqCopydefault, list, false, this, 2, null);
            if (objM8678batchGet0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8678batchGet0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        MemeLabelExplanationViewModel memeLabelExplanationViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8678batchGet0E7RQCE$default)) {
            memeLabelExplanationViewModel.copydefault.setValue(new InterfaceC28706kfo.StateListAnimator((List) objM8678batchGet0E7RQCE$default));
        }
        MemeLabelExplanationViewModel memeLabelExplanationViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM8678batchGet0E7RQCE$default) != null) {
            memeLabelExplanationViewModel2.copydefault.setValue(InterfaceC28706kfo.Application.EZpvd);
        }
        return Unit.INSTANCE;
    }
}
