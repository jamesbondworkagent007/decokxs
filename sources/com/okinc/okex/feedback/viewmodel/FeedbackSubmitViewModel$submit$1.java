package com.okinc.okex.feedback.viewmodel;

import com.okinc.okex.feedback.net.bean.FileUpload;
import com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45618stT;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackSubmitViewModel$submit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FeedbackSubmitViewModel.TaskDescription $eligibility;
    int label;
    final /* synthetic */ FeedbackSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSubmitViewModel$submit$1(FeedbackSubmitViewModel feedbackSubmitViewModel, FeedbackSubmitViewModel.TaskDescription taskDescription, Continuation<? super FeedbackSubmitViewModel$submit$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackSubmitViewModel;
        this.$eligibility = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackSubmitViewModel$submit$1(this.this$0, this.$eligibility, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackSubmitViewModel$submit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<FileUpload> listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(true));
            C45618stT c45618stT = this.this$0.fetchVPNInfo;
            int iKWHzl = ((FeedbackSubmitViewModel.TaskDescription.Activity) this.$eligibility).KWHzl();
            int iEZpvd = ((FeedbackSubmitViewModel.TaskDescription.Activity) this.$eligibility).EZpvd();
            String strOLrzqt = ((FeedbackSubmitViewModel.TaskDescription.Activity) this.$eligibility).OLrzqt();
            String strCopydefault = ((FeedbackSubmitViewModel.TaskDescription.Activity) this.$eligibility).copydefault();
            List<FeedbackSubmitViewModel.Application> value = this.this$0.copydefault().getValue();
            if (value == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeedbackSubmitViewModel.Application) it.next()).copydefault());
                }
                listAhwBna = arrayList;
            }
            this.label = 1;
            obj = c45618stT.EZpvd(iKWHzl, iEZpvd, strOLrzqt, strCopydefault, listAhwBna, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.AEQbTJ.setValue((C45618stT.TaskDescription) obj);
        this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
