package com.okinc.okex.feedback;

import android.text.Editable;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC47382tow;
import o.C45625sta;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class FeedbackRejectDialogFragment$confirm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45625sta this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackRejectDialogFragment$confirm$1(C45625sta c45625sta, Continuation<? super FeedbackRejectDialogFragment$confirm$1> continuation) {
        super(2, continuation);
        this.this$0 = c45625sta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackRejectDialogFragment$confirm$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackRejectDialogFragment$confirm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKEditText oKEditText;
        Editable text;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FeedbackListViewModel feedbackListViewModelGEmmrt = this.this$0.gEmmrt();
            int iAYXKKw = this.this$0.AYXKKw();
            AbstractC47382tow abstractC47382tow = this.this$0.KWHzl;
            String string = (abstractC47382tow == null || (oKEditText = abstractC47382tow.KWHzl) == null || (text = oKEditText.getText()) == null) ? null : text.toString();
            if (string == null) {
                string = "";
            }
            this.label = 1;
            if (feedbackListViewModelGEmmrt.OLrzqt(iAYXKKw, false, string, this) == objCopydefault) {
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
