package com.okinc.okex.rating.viewmodel;

import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PostSupportRatingRequestBean;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel$postSubmitRating$1;
import java.util.HashSet;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingSubmitViewModel$postSubmitRating$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GetSupportRatingBean $apiModel;
    final /* synthetic */ HashSet<Long> $labelIds;
    final /* synthetic */ JsonObject $moduleAttributes;
    final /* synthetic */ String $ratingNotificationId;
    int label;
    final /* synthetic */ RatingSubmitViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingSubmitViewModel$postSubmitRating$1(RatingSubmitViewModel ratingSubmitViewModel, HashSet<Long> hashSet, GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, Continuation<? super RatingSubmitViewModel$postSubmitRating$1> continuation) {
        super(2, continuation);
        this.this$0 = ratingSubmitViewModel;
        this.$labelIds = hashSet;
        this.$apiModel = getSupportRatingBean;
        this.$ratingNotificationId = str;
        this.$moduleAttributes = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RatingSubmitViewModel$postSubmitRating$1(this.this$0, this.$labelIds, this.$apiModel, this.$ratingNotificationId, this.$moduleAttributes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RatingSubmitViewModel$postSubmitRating$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(true));
            RatingSubmitViewModel ratingSubmitViewModel = this.this$0;
            JsonObject jsonObject = this.$moduleAttributes;
            final JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Boolean fieldNames = ratingSubmitViewModel.getFieldNames();
            if (fieldNames != null) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "isSolved", C56443yFo.KWHzl(fieldNames.booleanValue()));
            }
            Integer numValues = ratingSubmitViewModel.values();
            if (numValues != null) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "effortlessScore", C56443yFo.AEQbTJ(numValues.intValue()));
            }
            if (jsonObject != null) {
                final Function2 function2 = new Function2() { // from class: o.szF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return RatingSubmitViewModel$postSubmitRating$1.invokeSuspend$lambda$4$lambda$2(jsonObjectBuilder, (java.lang.String) obj2, (JsonElement) obj3);
                    }
                };
                jsonObject.forEach(new BiConsumer() { // from class: o.szH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.BiConsumer
                    public final void accept(java.lang.Object obj2, java.lang.Object obj3) {
                        function2.invoke(obj2, obj3);
                    }
                });
            }
            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
            Boolean bool = (Boolean) this.this$0.djBIcL.getValue();
            String str = (String) this.this$0.EZpvd.getValue();
            HashSet<Long> hashSet = this.$labelIds;
            String strJoinToString$default = hashSet != null ? CollectionsKt___CollectionsKt.joinToString$default(hashSet, ",", null, null, 0, null, null, 62, null) : null;
            GetSupportRatingBean getSupportRatingBean = this.$apiModel;
            Long id = getSupportRatingBean != null ? getSupportRatingBean.getId() : null;
            GetSupportRatingBean getSupportRatingBean2 = this.$apiModel;
            String moduleType = getSupportRatingBean2 != null ? getSupportRatingBean2.getModuleType() : null;
            String str2 = this.$ratingNotificationId;
            PostSupportRatingRequestBean postSupportRatingRequestBean = new PostSupportRatingRequestBean(bool, str, strJoinToString$default, id, moduleType, str2 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str2) : null, (Integer) this.this$0.isConnected.getValue(), jsonObjectBuild, (String) this.this$0.gEmmrt.getValue(), this.this$0.ORxRYg());
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
        if (submitRatingResult instanceof SubmitRatingResult.Failure) {
            this.this$0.hDKMBd.setValue(new C32989mnw(RatingSubmitViewModel.Application.C0551Application.KWHzl));
        } else if (submitRatingResult instanceof SubmitRatingResult.Success) {
            this.this$0.fJNWhG.setValue(StringsKt__StringNumberConversionsKt.getFieldNames(((SubmitRatingResult.Success) submitRatingResult).getRatingId()));
            this.this$0.copydefault.setValue(new C32989mnw(Unit.INSTANCE));
        } else if (submitRatingResult instanceof SubmitRatingResult.ApiError) {
            this.this$0.hDKMBd.setValue(new C32989mnw(new RatingSubmitViewModel.Application.StateListAnimator(((SubmitRatingResult.ApiError) submitRatingResult).getErrorMessage())));
        } else if (Intrinsics.EZpvd(submitRatingResult, SubmitRatingResult.ApiErrorUnknown.INSTANCE)) {
            this.this$0.hDKMBd.setValue(new C32989mnw(RatingSubmitViewModel.Application.C0551Application.KWHzl));
        }
        this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$2(JsonObjectBuilder jsonObjectBuilder, String str, JsonElement jsonElement) {
        Intrinsics.copydefault((Object) str);
        Intrinsics.copydefault(jsonElement);
        jsonObjectBuilder.put(str, jsonElement);
        return Unit.INSTANCE;
    }
}
