package com.okinc.auth.impl.debugtool.passkey;

import android.app.PendingIntent;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33488mxR;
import o.C56391yDq;
import o.C5643aAO;
import o.C56442yFn;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyDebugToolFragment$initView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5643aAO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyDebugToolFragment$initView$2$1(C5643aAO c5643aAO, Continuation<? super PasskeyDebugToolFragment$initView$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c5643aAO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyDebugToolFragment$initView$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyDebugToolFragment$initView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            RegistrationStartResponse.PublicKey publicKey = this.this$0.valueOf().getPublicKey();
            String strEZpvd = publicKey != null ? C33488mxR.EZpvd(publicKey) : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            String strKWHzl = C6617aSi.KWHzl(strEZpvd, PasskeyPromotionAuthenticator.All.KWHzl);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsKWHzl = C6617aSi.KWHzl(strKWHzl);
            pUU.KWHzl(this.this$0.getTAG(), "getRegistrationResult: finalJson: " + strKWHzl);
            Task<PendingIntent> registerPendingIntent = this.this$0.EZpvd().getRegisterPendingIntent(publicKeyCredentialCreationOptionsKWHzl);
            Intrinsics.checkNotNullExpressionValue(registerPendingIntent, "");
            this.label = 1;
            obj = C6617aSi.EZpvd(registerPendingIntent, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        PendingIntent pendingIntent = (PendingIntent) obj;
        C5643aAO c5643aAO = this.this$0;
        Intrinsics.copydefault(pendingIntent);
        c5643aAO.AEQbTJ(pendingIntent);
        return Unit.INSTANCE;
    }
}
