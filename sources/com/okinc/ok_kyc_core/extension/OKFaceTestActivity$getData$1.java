package com.okinc.ok_kyc_core.extension;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43728ruk;
import o.ActivityC41985rCb;
import o.C33129mqd;
import o.C41978rBv;
import o.C43662rtX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rBQ;

/* JADX INFO: loaded from: classes19.dex */
public final class OKFaceTestActivity$getData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ rBQ $multiVendorUseCases;
    int label;
    final /* synthetic */ ActivityC41985rCb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKFaceTestActivity$getData$1(rBQ rbq, ActivityC41985rCb activityC41985rCb, Continuation<? super OKFaceTestActivity$getData$1> continuation) {
        super(2, continuation);
        this.$multiVendorUseCases = rbq;
        this.this$0 = activityC41985rCb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKFaceTestActivity$getData$1(this.$multiVendorUseCases, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKFaceTestActivity$getData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C41978rBv c41978rBvKWHzl = this.$multiVendorUseCases.KWHzl();
            this.label = 1;
            obj = c41978rBvKWHzl.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) obj;
        ActivityC41985rCb activityC41985rCb = this.this$0;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            MultiVendorTokenResp multiVendorTokenResp = (MultiVendorTokenResp) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            String token = multiVendorTokenResp.getToken();
            if (token == null) {
                token = "";
            }
            String sessionId = multiVendorTokenResp.getSessionId();
            String str = sessionId != null ? sessionId : "";
            pUU.EZpvd(activityC41985rCb.getTAG(), "token = " + token + ", sessionId=" + str);
            if (!Intrinsics.EZpvd((Object) multiVendorTokenResp.getMode(), (Object) "url") || !C33129mqd.OLrzqt((CharSequence) multiVendorTokenResp.getUrl())) {
                Integer vendorType = multiVendorTokenResp.getVendorType();
                int vendorType2 = Constant.VendorType.EOP.getVendorType();
                if (vendorType != null && vendorType.intValue() == vendorType2) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC41985rCb), null, null, new OKFaceTestActivity$getData$1$1$1(activityC41985rCb, str, null), 3, null);
                } else {
                    C55326xho.toastWithFailedIcon$default(C43662rtX.Dialog.ejfBZ, 0, 1, (Object) null);
                    pUU.KWHzl(activityC41985rCb.getTAG(), "getSessionError->vendor is not expect,vendorType=" + multiVendorTokenResp.getVendorType());
                }
            }
        }
        ActivityC41985rCb activityC41985rCb2 = this.this$0;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            pUU.EZpvd(activityC41985rCb2.getTAG(), "token failed,errorMessage = " + responseFailedException.getMessage());
        }
        return Unit.INSTANCE;
    }
}
