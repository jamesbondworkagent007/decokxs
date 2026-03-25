package com.okinc.okex.rating.viewmodel;

import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PostSupportRatingRequestBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C56391yDq;
import o.C56442yFn;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingSubmitViewModel$preSubmitRating$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GetSupportRatingBean $apiModel;
    final /* synthetic */ String $ratingNotificationId;
    final /* synthetic */ JsonObject $updatedModuleAttributes;
    int label;
    final /* synthetic */ RatingSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingSubmitViewModel$preSubmitRating$1(GetSupportRatingBean getSupportRatingBean, String str, RatingSubmitViewModel ratingSubmitViewModel, JsonObject jsonObject, Continuation<? super RatingSubmitViewModel$preSubmitRating$1> continuation) {
        super(2, continuation);
        this.$apiModel = getSupportRatingBean;
        this.$ratingNotificationId = str;
        this.this$0 = ratingSubmitViewModel;
        this.$updatedModuleAttributes = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RatingSubmitViewModel$preSubmitRating$1(this.$apiModel, this.$ratingNotificationId, this.this$0, this.$updatedModuleAttributes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RatingSubmitViewModel$preSubmitRating$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GetSupportRatingBean getSupportRatingBean = this.$apiModel;
            Long id = getSupportRatingBean != null ? getSupportRatingBean.getId() : null;
            GetSupportRatingBean getSupportRatingBean2 = this.$apiModel;
            String moduleType = getSupportRatingBean2 != null ? getSupportRatingBean2.getModuleType() : null;
            String str = this.$ratingNotificationId;
            PostSupportRatingRequestBean postSupportRatingRequestBean = new PostSupportRatingRequestBean((Boolean) null, (String) null, (String) null, id, moduleType, str != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str) : null, (Integer) this.this$0.isConnected.getValue(), this.$updatedModuleAttributes, (String) null, this.this$0.ORxRYg(), 263, (DefaultConstructorMarker) null);
            syS sys = this.this$0.sSMYrx;
            this.label = 1;
            objCopydefault = sys.copydefault(postSupportRatingRequestBean, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        SubmitRatingResult submitRatingResult = (SubmitRatingResult) objCopydefault;
        this.this$0.getNewProxyInstance.setValue(submitRatingResult);
        if (submitRatingResult instanceof SubmitRatingResult.Success) {
            this.this$0.fJNWhG.setValue(StringsKt__StringNumberConversionsKt.getFieldNames(((SubmitRatingResult.Success) submitRatingResult).getRatingId()));
        } else if (!(submitRatingResult instanceof SubmitRatingResult.Failure) && !(submitRatingResult instanceof SubmitRatingResult.ApiError)) {
            Intrinsics.EZpvd(submitRatingResult, SubmitRatingResult.ApiErrorUnknown.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
