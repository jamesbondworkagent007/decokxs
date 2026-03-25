package com.okinc.ok_kyc_core.presentation.verify;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43697ruF;
import o.C33129mqd;
import o.C42203rKd;
import o.C43693ruB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42203rKd.StateListAnimator $eopVerifyCallback;
    final /* synthetic */ ResponseFailedException $it;
    final /* synthetic */ VendorVerifyRequest $verifyRequest;
    int label;
    final /* synthetic */ C42203rKd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1(C42203rKd.StateListAnimator stateListAnimator, ResponseFailedException responseFailedException, C42203rKd c42203rKd, VendorVerifyRequest vendorVerifyRequest, Continuation<? super OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1> continuation) {
        super(2, continuation);
        this.$eopVerifyCallback = stateListAnimator;
        this.$it = responseFailedException;
        this.this$0 = c42203rKd;
        this.$verifyRequest = vendorVerifyRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1(this.$eopVerifyCallback, this.$it, this.this$0, this.$verifyRequest, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C42203rKd.StateListAnimator stateListAnimator = this.$eopVerifyCallback;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd();
            }
            C43693ruB.EZpvd("KYC_Verify_Api_Error", C33129mqd.gEmmrt(this.$it.getMessage()));
            C42203rKd c42203rKd = this.this$0;
            AbstractC43697ruF.StateListAnimator stateListAnimator2 = new AbstractC43697ruF.StateListAnimator(VendorEvent.VENDOR_VERIFY_FAILED, this.$verifyRequest.getResultTarget(), this.$verifyRequest.getCtaValue(), this.$it.getMessage());
            String playbook = this.$verifyRequest.getPlaybook();
            String featureUri = this.$verifyRequest.getFeatureUri();
            String resultId = this.$verifyRequest.getResultId();
            HashMap<String, String> params = this.$verifyRequest.getParams();
            final C42203rKd c42203rKd2 = this.this$0;
            AbstractC42074rFj.signalCompletionAndPop$default(c42203rKd, stateListAnimator2, playbook, featureUri, resultId, params, null, null, new Function0() { // from class: o.rKl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OcrVerifyViewModel$getMultiVendorEopVerificationResult$1$3$1.invokeSuspend$lambda$0(c42203rKd2);
                }
            }, 96, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C42203rKd c42203rKd) {
        c42203rKd.wlaJM();
        return Unit.INSTANCE;
    }
}
