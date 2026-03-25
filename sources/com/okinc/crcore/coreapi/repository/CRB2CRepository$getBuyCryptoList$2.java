package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.bsc.CryptoListModelResponseBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getBuyCryptoList$2;
import com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean;
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
import o.C31731mBv;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31770mDg;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRB2CRepository$getBuyCryptoList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends CryptoListModelBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $cacheStrategy;
    final /* synthetic */ Integer $expire;
    final /* synthetic */ String $liteApp;
    final /* synthetic */ int $refreshWhenChange;
    final /* synthetic */ String $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getBuyCryptoList$2(C31731mBv c31731mBv, String str, String str2, Integer num, int i, String str3, Continuation<? super CRB2CRepository$getBuyCryptoList$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$liteApp = str;
        this.$cacheStrategy = str2;
        this.$expire = num;
        this.$refreshWhenChange = i;
        this.$type = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getBuyCryptoList$2 cRB2CRepository$getBuyCryptoList$2 = new CRB2CRepository$getBuyCryptoList$2(this.this$0, this.$liteApp, this.$cacheStrategy, this.$expire, this.$refreshWhenChange, this.$type, continuation);
        cRB2CRepository$getBuyCryptoList$2.L$0 = obj;
        return cRB2CRepository$getBuyCryptoList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends CryptoListModelBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<CryptoListModelBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<CryptoListModelBean, OKServerException>> continuation) {
        return ((CRB2CRepository$getBuyCryptoList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object buyCryptoList$default;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31731mBv c31731mBv = this.this$0;
                String str = this.$liteApp;
                String str2 = this.$cacheStrategy;
                Integer num = this.$expire;
                int i2 = this.$refreshWhenChange;
                String str3 = this.$type;
                InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                this.label = 1;
                buyCryptoList$default = InterfaceC31770mDg.ActionBar.getBuyCryptoList$default(interfaceC31770mDg, str, null, str2, num, i2, null, str3, this, 34, null);
                if (buyCryptoList$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                buyCryptoList$default = obj;
            }
            responseData = (ResponseData) buyCryptoList$default;
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CRB2CRepository$getBuyCryptoList$2.invokeSuspend$lambda$1((CryptoListModelResponseBean) obj2);
                }
            });
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$getBuyCryptoList$2.invokeSuspend$lambda$1((CryptoListModelResponseBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoListModelBean invokeSuspend$lambda$1(CryptoListModelResponseBean cryptoListModelResponseBean) {
        return CryptoListModelBean.Companion.AEQbTJ(cryptoListModelResponseBean);
    }
}
