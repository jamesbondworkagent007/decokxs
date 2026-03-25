package com.okinc.okex.rating.viewmodel;

import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PostUpdateRatingRequestBean;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C32989mnw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingSubmitViewModel$postUpdateRating$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GetSupportRatingBean $apiModel;
    final /* synthetic */ HashSet<Long> $labelIds;
    final /* synthetic */ long $ratingId;
    final /* synthetic */ JsonObject $updatedModuleAttributes;
    int label;
    final /* synthetic */ RatingSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingSubmitViewModel$postUpdateRating$1(RatingSubmitViewModel ratingSubmitViewModel, HashSet<Long> hashSet, GetSupportRatingBean getSupportRatingBean, long j, JsonObject jsonObject, Continuation<? super RatingSubmitViewModel$postUpdateRating$1> continuation) {
        super(2, continuation);
        this.this$0 = ratingSubmitViewModel;
        this.$labelIds = hashSet;
        this.$apiModel = getSupportRatingBean;
        this.$ratingId = j;
        this.$updatedModuleAttributes = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RatingSubmitViewModel$postUpdateRating$1(this.this$0, this.$labelIds, this.$apiModel, this.$ratingId, this.$updatedModuleAttributes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RatingSubmitViewModel$postUpdateRating$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(true));
            Boolean bool = (Boolean) this.this$0.djBIcL.getValue();
            String str = (String) this.this$0.EZpvd.getValue();
            HashSet<Long> hashSet = this.$labelIds;
            String strJoinToString$default = hashSet != null ? CollectionsKt___CollectionsKt.joinToString$default(hashSet, ",", null, null, 0, null, null, 62, null) : null;
            GetSupportRatingBean getSupportRatingBean = this.$apiModel;
            Long id = getSupportRatingBean != null ? getSupportRatingBean.getId() : null;
            GetSupportRatingBean getSupportRatingBean2 = this.$apiModel;
            PostUpdateRatingRequestBean postUpdateRatingRequestBean = new PostUpdateRatingRequestBean(this.$ratingId, str, bool, strJoinToString$default, id, getSupportRatingBean2 != null ? getSupportRatingBean2.getModuleType() : null, this.$updatedModuleAttributes, this.this$0.ORxRYg());
            syS sys = this.this$0.sSMYrx;
            this.label = 1;
            objAEQbTJ = sys.AEQbTJ(postUpdateRatingRequestBean, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        syS.Activity activity = (syS.Activity) objAEQbTJ;
        if (activity instanceof syS.Activity.ActionBar) {
            this.this$0.getNewProxyInstance.setValue(new SubmitRatingResult.Failure(((syS.Activity.ActionBar) activity).EZpvd()));
            this.this$0.hDKMBd.setValue(new C32989mnw(RatingSubmitViewModel.Application.C0551Application.KWHzl));
        } else if (activity instanceof syS.Activity.C0952Activity) {
            this.this$0.getNewProxyInstance.setValue(new SubmitRatingResult.Success(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$ratingId))));
            this.this$0.copydefault.setValue(new C32989mnw(Unit.INSTANCE));
        } else if (activity instanceof syS.Activity.TaskDescription) {
            syS.Activity.TaskDescription taskDescription = (syS.Activity.TaskDescription) activity;
            this.this$0.getNewProxyInstance.setValue(new SubmitRatingResult.ApiError(taskDescription.OLrzqt()));
            this.this$0.hDKMBd.setValue(new C32989mnw(new RatingSubmitViewModel.Application.StateListAnimator(taskDescription.OLrzqt())));
        } else if (Intrinsics.EZpvd(activity, syS.Activity.Application.KWHzl)) {
            this.this$0.getNewProxyInstance.setValue(SubmitRatingResult.ApiErrorUnknown.INSTANCE);
            this.this$0.hDKMBd.setValue(new C32989mnw(RatingSubmitViewModel.Application.C0551Application.KWHzl));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
