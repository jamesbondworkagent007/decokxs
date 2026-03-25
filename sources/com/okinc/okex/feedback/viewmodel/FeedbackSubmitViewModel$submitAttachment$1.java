package com.okinc.okex.feedback.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45618stT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yFL;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackSubmitViewModel$submitAttachment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<FeedbackSubmitViewModel.Application> $attachments;
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ FeedbackSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSubmitViewModel$submitAttachment$1(FeedbackSubmitViewModel feedbackSubmitViewModel, File file, List<FeedbackSubmitViewModel.Application> list, Continuation<? super FeedbackSubmitViewModel$submitAttachment$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackSubmitViewModel;
        this.$file = file;
        this.$attachments = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackSubmitViewModel$submitAttachment$1(this.this$0, this.$file, this.$attachments, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackSubmitViewModel$submitAttachment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FeedbackSubmitViewModel.ActionBar stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(true));
            C45618stT c45618stT = this.this$0.fetchVPNInfo;
            File file = this.$file;
            this.label = 1;
            obj = c45618stT.OLrzqt(file, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C45618stT.ActionBar actionBar = (C45618stT.ActionBar) obj;
        this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(false));
        MutableLiveData mutableLiveData = this.this$0.KWHzl;
        boolean z = actionBar instanceof C45618stT.ActionBar.TaskDescription;
        if (z) {
            stateListAnimator = FeedbackSubmitViewModel.ActionBar.Activity.EZpvd;
        } else {
            if (!(actionBar instanceof C45618stT.ActionBar.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            stateListAnimator = new FeedbackSubmitViewModel.ActionBar.StateListAnimator(((C45618stT.ActionBar.Activity) actionBar).copydefault());
        }
        mutableLiveData.setValue(stateListAnimator);
        if (z) {
            MutableLiveData mutableLiveData2 = this.this$0.EZpvd;
            List<FeedbackSubmitViewModel.Application> list = this.$attachments;
            File file2 = this.$file;
            C45618stT.ActionBar.TaskDescription taskDescription = (C45618stT.ActionBar.TaskDescription) actionBar;
            list.add(new FeedbackSubmitViewModel.Application(taskDescription.OLrzqt().getName(), file2.length(), yFL.fetchVPNInfo(file2), taskDescription.OLrzqt()));
            mutableLiveData2.setValue(list);
        }
        return Unit.INSTANCE;
    }
}
