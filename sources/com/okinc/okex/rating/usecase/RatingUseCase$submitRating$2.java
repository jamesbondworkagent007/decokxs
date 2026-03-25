package com.okinc.okex.rating.usecase;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.rating.bean.PostSupportRatingRequestBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C45362soP;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.pUU;
import o.sxL;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingUseCase$submitRating$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SubmitRatingResult>, Object> {
    final /* synthetic */ PostSupportRatingRequestBean $requestBean;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ syS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingUseCase$submitRating$2(PostSupportRatingRequestBean postSupportRatingRequestBean, syS sys, Continuation<? super RatingUseCase$submitRating$2> continuation) {
        super(2, continuation);
        this.$requestBean = postSupportRatingRequestBean;
        this.this$0 = sys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RatingUseCase$submitRating$2 ratingUseCase$submitRating$2 = new RatingUseCase$submitRating$2(this.$requestBean, this.this$0, continuation);
        ratingUseCase$submitRating$2.L$0 = obj;
        return ratingUseCase$submitRating$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SubmitRatingResult> continuation) {
        return ((RatingUseCase$submitRating$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                syS sys = this.this$0;
                PostSupportRatingRequestBean postSupportRatingRequestBean = this.$requestBean;
                sxL sxl = sys.KWHzl;
                this.label = 1;
                obj = sxl.AEQbTJ(postSupportRatingRequestBean, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        C45362soP.copydefault.copydefault("SUBMIT rating", C56424yEw.gEmmrt(C56390yDp.OLrzqt("checkBoxResult", String.valueOf(this.$requestBean.getCheckBoxResult())), C56390yDp.OLrzqt("feedback", String.valueOf(this.$requestBean.getFeedback())), C56390yDp.OLrzqt("labelIds", String.valueOf(this.$requestBean.getLabelIds())), C56390yDp.OLrzqt("ratingId", String.valueOf(this.$requestBean.getModuleId())), C56390yDp.OLrzqt("moduleType", String.valueOf(this.$requestBean.getModuleType())), C56390yDp.OLrzqt("ratingNotificationId", String.valueOf(this.$requestBean.getRatingNotificationId())), C56390yDp.OLrzqt(FirebaseAnalytics.Param.SCORE, String.valueOf(this.$requestBean.getScore())), C56390yDp.OLrzqt("labelFeedback", String.valueOf(this.$requestBean.getLabelFeedback())), C56390yDp.OLrzqt("response success", String.valueOf(actionBar.EZpvd()))));
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            String str = (String) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            if (str == null) {
                str = "";
            }
            return new SubmitRatingResult.Success(str);
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        String message = ((OKServerException) actionBar2.KWHzl()).getMessage();
        if (((OKServerException) actionBar2.KWHzl()).getOrigin() != null) {
            return new SubmitRatingResult.Failure((Throwable) actionBar2.KWHzl());
        }
        if (message != null && (!StringsKt__StringsKt.fARcdN((CharSequence) message))) {
            return new SubmitRatingResult.ApiError(message);
        }
        return SubmitRatingResult.ApiErrorUnknown.INSTANCE;
    }
}
