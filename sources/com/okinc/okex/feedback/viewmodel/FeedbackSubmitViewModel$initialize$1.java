package com.okinc.okex.feedback.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okex.feedback.net.bean.MainCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45618stT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackSubmitViewModel$initialize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $categoryId;
    int label;
    final /* synthetic */ FeedbackSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSubmitViewModel$initialize$1(FeedbackSubmitViewModel feedbackSubmitViewModel, int i, Continuation<? super FeedbackSubmitViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackSubmitViewModel;
        this.$categoryId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackSubmitViewModel$initialize$1(this.this$0, this.$categoryId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackSubmitViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C45618stT.Activity.Application application;
        List<MainCategory> listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45618stT c45618stT = this.this$0.fetchVPNInfo;
            this.label = 1;
            obj = c45618stT.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                application = !(obj instanceof C45618stT.Activity.Application) ? (C45618stT.Activity.Application) obj : null;
                MutableLiveData mutableLiveData = this.this$0.AYXKKw;
                if (application != null || (listAhwBna = application.OLrzqt()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                mutableLiveData.setValue(listAhwBna);
                this.this$0.OLrzqt(C56443yFo.AEQbTJ(this.$categoryId));
                this.this$0.copydefault.setValue(null);
                this.this$0.EZpvd.setValue(null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C45618stT.Application.Activity activity = obj instanceof C45618stT.Application.Activity ? (C45618stT.Application.Activity) obj : null;
        this.this$0.djBIcL.setValue(activity != null ? C56443yFo.AEQbTJ(activity.KWHzl()) : null);
        this.this$0.AhwBna.setValue(activity != null ? C56443yFo.AEQbTJ(activity.copydefault()) : null);
        C45618stT c45618stT2 = this.this$0.fetchVPNInfo;
        int i2 = this.$categoryId;
        this.label = 2;
        obj = c45618stT2.AEQbTJ(i2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        if (!(obj instanceof C45618stT.Activity.Application)) {
        }
        MutableLiveData mutableLiveData2 = this.this$0.AYXKKw;
        if (application != null) {
            listAhwBna = yDY.AhwBna();
        }
        mutableLiveData2.setValue(listAhwBna);
        this.this$0.OLrzqt(C56443yFo.AEQbTJ(this.$categoryId));
        this.this$0.copydefault.setValue(null);
        this.this$0.EZpvd.setValue(null);
        return Unit.INSTANCE;
    }
}
