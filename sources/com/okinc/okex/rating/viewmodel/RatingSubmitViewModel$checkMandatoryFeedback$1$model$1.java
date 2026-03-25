package com.okinc.okex.rating.viewmodel;

import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.yEE;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingSubmitViewModel$checkMandatoryFeedback$1$model$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RatingSubmitViewModel.MandatoryFeedbackModel>, Object> {
    final /* synthetic */ List<GetSupportRatingBean.Label.LabelDetail> $currentLabelDetails;
    int label;
    final /* synthetic */ RatingSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingSubmitViewModel$checkMandatoryFeedback$1$model$1(RatingSubmitViewModel ratingSubmitViewModel, List<GetSupportRatingBean.Label.LabelDetail> list, Continuation<? super RatingSubmitViewModel$checkMandatoryFeedback$1$model$1> continuation) {
        super(2, continuation);
        this.this$0 = ratingSubmitViewModel;
        this.$currentLabelDetails = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RatingSubmitViewModel$checkMandatoryFeedback$1$model$1(this.this$0, this.$currentLabelDetails, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RatingSubmitViewModel.MandatoryFeedbackModel> continuation) {
        return ((RatingSubmitViewModel$checkMandatoryFeedback$1$model$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GetSupportRatingBean getSupportRatingBean = (GetSupportRatingBean) this.this$0.AEQbTJ.getValue();
            String genericRequiredFeedbackContent = getSupportRatingBean != null ? getSupportRatingBean.getGenericRequiredFeedbackContent() : null;
            if (genericRequiredFeedbackContent == null) {
                genericRequiredFeedbackContent = "";
            }
            Set setCopydefault = (Set) this.this$0.ejfBZ.getValue();
            if (setCopydefault == null) {
                setCopydefault = yEE.copydefault();
            }
            List<GetSupportRatingBean.Label.LabelDetail> list = this.$currentLabelDetails;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                GetSupportRatingBean.Label.LabelDetail labelDetail = (GetSupportRatingBean.Label.LabelDetail) obj2;
                if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Long>) ((Iterable<? extends Object>) setCopydefault), labelDetail.getId()) && labelDetail.getFeedbackRequired()) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() > 1) {
                return new RatingSubmitViewModel.MandatoryFeedbackModel(genericRequiredFeedbackContent, true);
            }
            if (arrayList.size() == 1) {
                String feedbackContent = ((GetSupportRatingBean.Label.LabelDetail) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getFeedbackContent();
                return new RatingSubmitViewModel.MandatoryFeedbackModel(feedbackContent != null ? feedbackContent : "", true);
            }
            return new RatingSubmitViewModel.MandatoryFeedbackModel(null, false, 1, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
