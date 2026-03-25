package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyPairsResponseBean;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getConvertCurrencyPairs$2;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyPairsBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31722mBm;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31766mDc;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRAssetRepository$getConvertCurrencyPairs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends ConvertCurrencyPairsBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $cacheStrategy;
    final /* synthetic */ String $fromCcy;
    final /* synthetic */ String $toCcy;
    final /* synthetic */ Integer $ttl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31722mBm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRAssetRepository$getConvertCurrencyPairs$2(C31722mBm c31722mBm, String str, Integer num, String str2, String str3, Continuation<? super CRAssetRepository$getConvertCurrencyPairs$2> continuation) {
        super(2, continuation);
        this.this$0 = c31722mBm;
        this.$cacheStrategy = str;
        this.$ttl = num;
        this.$fromCcy = str2;
        this.$toCcy = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRAssetRepository$getConvertCurrencyPairs$2 cRAssetRepository$getConvertCurrencyPairs$2 = new CRAssetRepository$getConvertCurrencyPairs$2(this.this$0, this.$cacheStrategy, this.$ttl, this.$fromCcy, this.$toCcy, continuation);
        cRAssetRepository$getConvertCurrencyPairs$2.L$0 = obj;
        return cRAssetRepository$getConvertCurrencyPairs$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends ConvertCurrencyPairsBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<ConvertCurrencyPairsBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<ConvertCurrencyPairsBean, OKServerException>> continuation) {
        return ((CRAssetRepository$getConvertCurrencyPairs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31722mBm c31722mBm = this.this$0;
                String str = this.$cacheStrategy;
                Integer num = this.$ttl;
                String str2 = this.$fromCcy;
                String str3 = this.$toCcy;
                InterfaceC31766mDc interfaceC31766mDc = c31722mBm.KWHzl;
                if (str == null) {
                    str = "FIRST_CACHE";
                }
                String str4 = str;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                this.label = 1;
                obj = interfaceC31766mDc.EZpvd(str4, numAEQbTJ, str2, str3, this);
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
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRAssetRepository$getConvertCurrencyPairs$2.invokeSuspend$lambda$1((ConvertCurrencyPairsResponseBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConvertCurrencyPairsBean invokeSuspend$lambda$1(ConvertCurrencyPairsResponseBean convertCurrencyPairsResponseBean) {
        return ConvertCurrencyPairsBean.Companion.copydefault(convertCurrencyPairsResponseBean);
    }
}
