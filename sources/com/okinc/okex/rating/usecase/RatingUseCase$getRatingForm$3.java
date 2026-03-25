package com.okinc.okex.rating.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C45362soP;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.pUU;
import o.sxK;
import o.sxL;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingUseCase$getRatingForm$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RatingResult>, Object> {
    final /* synthetic */ String $businessId;
    final /* synthetic */ JsonObject $moduleAttributes;
    final /* synthetic */ String $ratingNotificationId;
    final /* synthetic */ String $rawModuleType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ syS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingUseCase$getRatingForm$3(String str, String str2, String str3, syS sys, JsonObject jsonObject, Continuation<? super RatingUseCase$getRatingForm$3> continuation) {
        super(2, continuation);
        this.$rawModuleType = str;
        this.$ratingNotificationId = str2;
        this.$businessId = str3;
        this.this$0 = sys;
        this.$moduleAttributes = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RatingUseCase$getRatingForm$3 ratingUseCase$getRatingForm$3 = new RatingUseCase$getRatingForm$3(this.$rawModuleType, this.$ratingNotificationId, this.$businessId, this.this$0, this.$moduleAttributes, continuation);
        ratingUseCase$getRatingForm$3.L$0 = obj;
        return ratingUseCase$getRatingForm$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RatingResult> continuation) {
        return ((RatingUseCase$getRatingForm$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                String str = this.$rawModuleType;
                String str2 = this.$ratingNotificationId;
                String str3 = this.$businessId;
                sxL sxl = sys.KWHzl;
                this.label = 1;
                obj = sxl.EZpvd(str, str2, str3, this);
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
        C45362soP c45362soP = C45362soP.copydefault;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C56390yDp.OLrzqt("moduleType", this.$rawModuleType);
        pairArr[1] = C56390yDp.OLrzqt("ratingNotificationId", String.valueOf(this.$ratingNotificationId));
        pairArr[2] = C56390yDp.OLrzqt("businessId", String.valueOf(this.$businessId));
        pairArr[3] = C56390yDp.OLrzqt("response success", String.valueOf(actionBar.EZpvd()));
        GetSupportRatingBean getSupportRatingBean = (GetSupportRatingBean) actionBar.copydefault();
        pairArr[4] = C56390yDp.OLrzqt("ratingId", String.valueOf(getSupportRatingBean != null ? getSupportRatingBean.getId() : null));
        c45362soP.copydefault("GET rating", C56424yEw.gEmmrt(pairArr));
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            GetSupportRatingBean getSupportRatingBean2 = (GetSupportRatingBean) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            RatingResult ratingResultEZpvd = sxK.copydefault.EZpvd(getSupportRatingBean2, this.$ratingNotificationId, this.$moduleAttributes, this.$businessId);
            pUU.KWHzl("RatingUseCase", "[requestRatingFragment] [ratingResult=" + ratingResultEZpvd + "] [status=" + getSupportRatingBean2.getStatus() + "]");
            return ratingResultEZpvd;
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return new RatingResult.Failure((Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
    }
}
