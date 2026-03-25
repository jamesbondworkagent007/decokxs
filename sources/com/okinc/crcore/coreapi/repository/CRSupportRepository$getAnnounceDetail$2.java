package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.AnnounceDetailResponseBean;
import com.okinc.crcore.coreapi.repository.CRSupportRepository$getAnnounceDetail$2;
import com.okinc.crcore.shared.net.responsebean.AnnounceDetailBean;
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
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31774mDk;
import o.mAY;
import o.mCX;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class CRSupportRepository$getAnnounceDetail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends AnnounceDetailBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $cacheStrategy;
    final /* synthetic */ String $projectName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mCX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRSupportRepository$getAnnounceDetail$2(mCX mcx, String str, String str2, Continuation<? super CRSupportRepository$getAnnounceDetail$2> continuation) {
        super(2, continuation);
        this.this$0 = mcx;
        this.$projectName = str;
        this.$cacheStrategy = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRSupportRepository$getAnnounceDetail$2 cRSupportRepository$getAnnounceDetail$2 = new CRSupportRepository$getAnnounceDetail$2(this.this$0, this.$projectName, this.$cacheStrategy, continuation);
        cRSupportRepository$getAnnounceDetail$2.L$0 = obj;
        return cRSupportRepository$getAnnounceDetail$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends AnnounceDetailBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<AnnounceDetailBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<AnnounceDetailBean, OKServerException>> continuation) {
        return ((CRSupportRepository$getAnnounceDetail$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                mCX mcx = this.this$0;
                String str = this.$projectName;
                String str2 = this.$cacheStrategy;
                InterfaceC31774mDk interfaceC31774mDk = mcx.EZpvd;
                this.label = 1;
                obj = InterfaceC31774mDk.StateListAnimator.getAnnounceDetail$default(interfaceC31774mDk, str, str2, 0, this, 4, null);
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
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRSupportRepository$getAnnounceDetail$2.invokeSuspend$lambda$1((AnnounceDetailResponseBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnounceDetailBean invokeSuspend$lambda$1(AnnounceDetailResponseBean announceDetailResponseBean) {
        return AnnounceDetailBean.Companion.OLrzqt(announceDetailResponseBean);
    }
}
