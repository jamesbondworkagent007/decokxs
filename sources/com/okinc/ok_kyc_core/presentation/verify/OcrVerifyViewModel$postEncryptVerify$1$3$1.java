package com.okinc.ok_kyc_core.presentation.verify;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$postEncryptVerify$1$3$1;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43697ruF;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C42203rKd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyViewModel$postEncryptVerify$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42203rKd.StateListAnimator $eopVerifyCallback;
    final /* synthetic */ ResponseFailedException $it;
    final /* synthetic */ String $source;
    final /* synthetic */ VendorVerifyRequest $verifyRequest;
    int label;
    final /* synthetic */ C42203rKd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyViewModel$postEncryptVerify$1$3$1(C42203rKd.StateListAnimator stateListAnimator, C42203rKd c42203rKd, VendorVerifyRequest vendorVerifyRequest, ResponseFailedException responseFailedException, String str, Continuation<? super OcrVerifyViewModel$postEncryptVerify$1$3$1> continuation) {
        super(2, continuation);
        this.$eopVerifyCallback = stateListAnimator;
        this.this$0 = c42203rKd;
        this.$verifyRequest = vendorVerifyRequest;
        this.$it = responseFailedException;
        this.$source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyViewModel$postEncryptVerify$1$3$1(this.$eopVerifyCallback, this.this$0, this.$verifyRequest, this.$it, this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyViewModel$postEncryptVerify$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final ResponseFailedException responseFailedException = this.$it;
            final String str = this.$source;
            C32866mlf.EZpvd("TRKYC_Encrypt_Verify_Result", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rKj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OcrVerifyViewModel$postEncryptVerify$1$3$1.invokeSuspend$lambda$0(responseFailedException, str, (EventParamsList) obj2);
                }
            });
            C42203rKd c42203rKd = this.this$0;
            AbstractC43697ruF.StateListAnimator stateListAnimator2 = new AbstractC43697ruF.StateListAnimator(VendorEvent.VENDOR_VERIFY_FAILED, this.$verifyRequest.getResultTarget(), this.$verifyRequest.getCtaValue(), this.$it.getMessage());
            String playbook = this.$verifyRequest.getPlaybook();
            String featureUri = this.$verifyRequest.getFeatureUri();
            String resultId = this.$verifyRequest.getResultId();
            HashMap<String, String> params = this.$verifyRequest.getParams();
            final C42203rKd c42203rKd2 = this.this$0;
            AbstractC42074rFj.signalCompletionAndPop$default(c42203rKd, stateListAnimator2, playbook, featureUri, resultId, params, null, null, new Function0() { // from class: o.rKq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OcrVerifyViewModel$postEncryptVerify$1$3$1.invokeSuspend$lambda$1(c42203rKd2);
                }
            }, 96, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ResponseFailedException responseFailedException, String str, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "result", EopTrackEvent.KEY_RESULT_FAILED, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MESSAGE, C33129mqd.gEmmrt(responseFailedException.getMessage()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str, false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C42203rKd c42203rKd) {
        c42203rKd.wlaJM();
        return Unit.INSTANCE;
    }
}
