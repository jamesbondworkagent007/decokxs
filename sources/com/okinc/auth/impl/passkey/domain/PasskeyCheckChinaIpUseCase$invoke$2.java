package com.okinc.auth.impl.passkey.domain;

import com.okinc.account.api.model.social.SocialEligibilityResponse;
import com.okinc.auth.impl.featureflag.FeatureFlag;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5904aFK;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCheckChinaIpUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C5904aFK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCheckChinaIpUseCase$invoke$2(C5904aFK c5904aFK, Continuation<? super PasskeyCheckChinaIpUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5904aFK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCheckChinaIpUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PasskeyCheckChinaIpUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (Exception e) {
            pUU.copydefault(this.this$0.copydefault, "passkey china ip exception: " + e.getMessage());
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AEQbTJ.copydefault(FeatureFlag.BYPASS_CHINA_IP_CHECKING, false)) {
                pUU.KWHzl(this.this$0.copydefault, "passkey china ip: bypassed by Amplitude feature flag");
                z = z;
                return C56443yFo.KWHzl(z);
            }
            PasskeyApiService passkeyApiService = this.this$0.EZpvd;
            this.label = 1;
            obj = PasskeyApiService.Application.checkSocialLoginEligibility$default(passkeyApiService, 0, null, this, 3, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        SocialEligibilityResponse socialEligibilityResponse = (SocialEligibilityResponse) ((ResponseData) obj).getData();
        z = socialEligibilityResponse == null || !Intrinsics.EZpvd(socialEligibilityResponse.getEligible(), C56443yFo.KWHzl(true));
        pUU.KWHzl(this.this$0.copydefault, "passkey china ip: " + z);
        z = z;
        return C56443yFo.KWHzl(z);
    }
}
