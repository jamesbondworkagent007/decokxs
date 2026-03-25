package com.okinc.ok_kyc_core.presentation.verify;

import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$postOnboarding$2;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43697ruF;
import o.C42203rKd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyViewModel$postOnboarding$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VendorVerifyRequest $verifyRequest;
    int label;
    final /* synthetic */ C42203rKd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyViewModel$postOnboarding$2(C42203rKd c42203rKd, VendorVerifyRequest vendorVerifyRequest, Continuation<? super OcrVerifyViewModel$postOnboarding$2> continuation) {
        super(2, continuation);
        this.this$0 = c42203rKd;
        this.$verifyRequest = vendorVerifyRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyViewModel$postOnboarding$2(this.this$0, this.$verifyRequest, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyViewModel$postOnboarding$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C42203rKd c42203rKd = this.this$0;
            AbstractC43697ruF.TaskDescription taskDescription = new AbstractC43697ruF.TaskDescription(MultiVendorResultStatus.Passed, VendorEvent.VENDOR_VERIFY_RESULT_COMPLETE, this.$verifyRequest.getResultTarget(), this.$verifyRequest.getCtaValue());
            String playbook = this.$verifyRequest.getPlaybook();
            String featureUri = this.$verifyRequest.getFeatureUri();
            String resultId = this.$verifyRequest.getResultId();
            HashMap<String, String> params = this.$verifyRequest.getParams();
            final C42203rKd c42203rKd2 = this.this$0;
            AbstractC42074rFj.signalCompletionAndPop$default(c42203rKd, taskDescription, playbook, featureUri, resultId, params, null, null, new Function0() { // from class: o.rKr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OcrVerifyViewModel$postOnboarding$2.invokeSuspend$lambda$0(c42203rKd2);
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
