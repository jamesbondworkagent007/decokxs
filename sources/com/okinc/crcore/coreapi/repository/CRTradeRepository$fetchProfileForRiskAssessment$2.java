package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.enums.ProductType;
import com.okinc.crcore.coreapi.net.responsebean.ProfileRiskAssessmentBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
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
import o.InterfaceC31776mDm;
import o.mAY;
import o.mCY;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class CRTradeRepository$fetchProfileForRiskAssessment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends ProfileRiskAssessmentBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ ProductType $productType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mCY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRTradeRepository$fetchProfileForRiskAssessment$2(mCY mcy, ProductType productType, Continuation<? super CRTradeRepository$fetchProfileForRiskAssessment$2> continuation) {
        super(2, continuation);
        this.this$0 = mcy;
        this.$productType = productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRTradeRepository$fetchProfileForRiskAssessment$2 cRTradeRepository$fetchProfileForRiskAssessment$2 = new CRTradeRepository$fetchProfileForRiskAssessment$2(this.this$0, this.$productType, continuation);
        cRTradeRepository$fetchProfileForRiskAssessment$2.L$0 = obj;
        return cRTradeRepository$fetchProfileForRiskAssessment$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends ProfileRiskAssessmentBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<ProfileRiskAssessmentBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<ProfileRiskAssessmentBean, OKServerException>> continuation) {
        return ((CRTradeRepository$fetchProfileForRiskAssessment$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                mCY mcy = this.this$0;
                ProductType productType = this.$productType;
                InterfaceC31776mDm interfaceC31776mDm = mcy.EZpvd;
                String productType2 = productType.getProductType();
                this.label = 1;
                obj = interfaceC31776mDm.AEQbTJ(productType2, this);
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
        return mAY.EZpvd(actionBar);
    }
}
