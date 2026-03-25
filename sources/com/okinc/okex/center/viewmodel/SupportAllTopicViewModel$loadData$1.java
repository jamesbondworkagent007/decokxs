package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.viewmodel.SupportAllTopicViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45353soG;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportAllTopicViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportAllTopicViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportAllTopicViewModel$loadData$1(SupportAllTopicViewModel supportAllTopicViewModel, Continuation<? super SupportAllTopicViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = supportAllTopicViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportAllTopicViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportAllTopicViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ.setValue(C56443yFo.KWHzl(true));
            C45353soG c45353soG = this.this$0.gEmmrt;
            this.label = 1;
            obj = c45353soG.OLrzqt(null, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C45353soG.Application application = (C45353soG.Application) obj;
        if (application instanceof C45353soG.Application.TaskDescription) {
            C45353soG.Application.TaskDescription taskDescription = (C45353soG.Application.TaskDescription) application;
            if (taskDescription.KWHzl().getTopicSections().isEmpty()) {
                this.this$0.copydefault.setValue(SupportAllTopicViewModel.TaskDescription.StateListAnimator.copydefault);
            } else {
                this.this$0.copydefault.setValue(new SupportAllTopicViewModel.TaskDescription.Activity(taskDescription.KWHzl().getTopicSections()));
            }
            this.this$0.KWHzl.setValue(taskDescription.KWHzl().getRatingResult());
        } else if (application instanceof C45353soG.Application.StateListAnimator) {
            this.this$0.copydefault.setValue(SupportAllTopicViewModel.TaskDescription.C0542TaskDescription.EZpvd);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.AEQbTJ.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
