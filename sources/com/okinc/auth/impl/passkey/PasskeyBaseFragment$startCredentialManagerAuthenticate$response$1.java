package com.okinc.auth.impl.passkey;

import android.content.Context;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5926aFg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GetCredentialResponse>, Object> {
    final /* synthetic */ GetPublicKeyCredentialOption $getPublicKeyCredentialOption;
    int label;
    final /* synthetic */ AbstractC5926aFg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1(AbstractC5926aFg abstractC5926aFg, GetPublicKeyCredentialOption getPublicKeyCredentialOption, Continuation<? super PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC5926aFg;
        this.$getPublicKeyCredentialOption = getPublicKeyCredentialOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1(this.this$0, this.$getPublicKeyCredentialOption, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetCredentialResponse> continuation) {
        return ((PasskeyBaseFragment$startCredentialManagerAuthenticate$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CredentialManager credentialManagerValues = this.this$0.values();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            GetCredentialRequest getCredentialRequest = new GetCredentialRequest(C56402yEa.EZpvd(this.$getPublicKeyCredentialOption), null, false, null, false, 30, null);
            this.label = 1;
            obj = credentialManagerValues.getCredential(contextRequireContext, getCredentialRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
