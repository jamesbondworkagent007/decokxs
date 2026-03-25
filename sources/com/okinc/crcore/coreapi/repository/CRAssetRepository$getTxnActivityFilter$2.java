package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.enums.ActivityFilterQueryType;
import com.okinc.crcore.coreapi.net.responsebean.TxnActivityFilterResponseBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31722mBm;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31766mDc;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRAssetRepository$getTxnActivityFilter$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends TxnActivityFilterResponseBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ ActivityFilterQueryType $queryType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31722mBm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRAssetRepository$getTxnActivityFilter$2(C31722mBm c31722mBm, ActivityFilterQueryType activityFilterQueryType, Continuation<? super CRAssetRepository$getTxnActivityFilter$2> continuation) {
        super(2, continuation);
        this.this$0 = c31722mBm;
        this.$queryType = activityFilterQueryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRAssetRepository$getTxnActivityFilter$2 cRAssetRepository$getTxnActivityFilter$2 = new CRAssetRepository$getTxnActivityFilter$2(this.this$0, this.$queryType, continuation);
        cRAssetRepository$getTxnActivityFilter$2.L$0 = obj;
        return cRAssetRepository$getTxnActivityFilter$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends TxnActivityFilterResponseBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<TxnActivityFilterResponseBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<TxnActivityFilterResponseBean, OKServerException>> continuation) {
        return ((CRAssetRepository$getTxnActivityFilter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31722mBm c31722mBm = this.this$0;
                ActivityFilterQueryType activityFilterQueryType = this.$queryType;
                InterfaceC31766mDc interfaceC31766mDc = c31722mBm.KWHzl;
                int queryType = activityFilterQueryType.getQueryType();
                this.label = 1;
                obj = interfaceC31766mDc.AEQbTJ(queryType, this);
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
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
