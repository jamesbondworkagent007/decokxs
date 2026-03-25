package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5790aDC;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$14 extends SuspendLambda implements Function2<AuthenticationStartResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$14(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$14> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyFragment$initView$14 verifyMfaPasskeyFragment$initView$14 = new VerifyMfaPasskeyFragment$initView$14(this.this$0, continuation);
        verifyMfaPasskeyFragment$initView$14.L$0 = obj;
        return verifyMfaPasskeyFragment$initView$14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthenticationStartResponse authenticationStartResponse, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$14) create(authenticationStartResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String credentialId;
        Object next;
        Integer inHouseVer;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AuthenticationStartResponse authenticationStartResponse = (AuthenticationStartResponse) this.L$0;
            AuthenticationStartResponse.PublicKey publicKey = authenticationStartResponse.getPublicKey();
            String challenge = publicKey != null ? publicKey.getChallenge() : null;
            String str = challenge == null ? "" : challenge;
            List<AuthenticationStartResponse.AdditionalData> additionalData = authenticationStartResponse.getAdditionalData();
            if (additionalData != null) {
                Iterator<T> it = additionalData.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    AuthenticationStartResponse.AdditionalData additionalData2 = (AuthenticationStartResponse.AdditionalData) next;
                    if (Intrinsics.EZpvd(additionalData2.getInHouse(), C56443yFo.KWHzl(true)) && (inHouseVer = additionalData2.getInHouseVer()) != null && inHouseVer.intValue() == 2) {
                        break;
                    }
                }
                AuthenticationStartResponse.AdditionalData additionalData3 = (AuthenticationStartResponse.AdditionalData) next;
                credentialId = additionalData3 != null ? additionalData3.getCredentialId() : null;
            }
            String str2 = credentialId == null ? "" : credentialId;
            AuthenticationStartResponse.PublicKey publicKey2 = authenticationStartResponse.getPublicKey();
            String rpId = publicKey2 != null ? publicKey2.getRpId() : null;
            String str3 = rpId == null ? "" : rpId;
            String userHandle = authenticationStartResponse.getUserHandle();
            this.this$0.AYXKKw.launch(new PasskeyCrossDeviceVerifyActivity.Input(str, str2, str3, userHandle == null ? "" : userHandle, this.this$0.ejfBZ().hDKMBd()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
