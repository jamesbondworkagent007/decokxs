package com.okinc.okex.rating.usecase;

import com.okinc.biz.model.ModuleType;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.rating.bean.RatingMetadataResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C6808aWP;
import o.pUU;
import o.sxL;
import o.sxM;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingUseCase$getRatingMetadata$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C6808aWP>, Object> {
    final /* synthetic */ String $businessId;
    final /* synthetic */ ModuleType $moduleType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ syS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingUseCase$getRatingMetadata$2(syS sys, ModuleType moduleType, String str, Continuation<? super RatingUseCase$getRatingMetadata$2> continuation) {
        super(2, continuation);
        this.this$0 = sys;
        this.$moduleType = moduleType;
        this.$businessId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RatingUseCase$getRatingMetadata$2 ratingUseCase$getRatingMetadata$2 = new RatingUseCase$getRatingMetadata$2(this.this$0, this.$moduleType, this.$businessId, continuation);
        ratingUseCase$getRatingMetadata$2.L$0 = obj;
        return ratingUseCase$getRatingMetadata$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C6808aWP> continuation) {
        return ((RatingUseCase$getRatingMetadata$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                ModuleType moduleType = this.$moduleType;
                String str = this.$businessId;
                sxL sxl = sys.KWHzl;
                String value = moduleType.getValue();
                this.label = 1;
                obj = sxl.EZpvd(value, str, this);
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
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return sxM.copydefault((RatingMetadataResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C6808aWP(null, 1, null);
    }
}
