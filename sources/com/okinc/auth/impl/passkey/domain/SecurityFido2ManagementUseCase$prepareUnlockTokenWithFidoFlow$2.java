package com.okinc.auth.impl.passkey.domain;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5990aGr;
import o.C56391yDq;
import o.C56442yFn;
import o.C5903aFJ;
import o.C5904aFK;
import o.C5973aGa;
import o.C6617aSi;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5990aGr>, Object> {
    int label;
    final /* synthetic */ C5973aGa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2(C5973aGa c5973aGa, Continuation<? super SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = c5973aGa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5990aGr> continuation) {
        return ((SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:8:0x0014, B:40:0x00a6, B:12:0x0021, B:34:0x0078, B:36:0x0082, B:37:0x008a, B:31:0x0069), top: B:47:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:8:0x0014, B:40:0x00a6, B:12:0x0021, B:34:0x0078, B:36:0x0082, B:37:0x008a, B:31:0x0069), top: B:47:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object application;
        boolean zBooleanValue;
        AuthenticationStartResponse authenticationStartResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            application = new AbstractC5990aGr.Application(e.getMessage());
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5904aFK c5904aFK = this.this$0.AEQbTJ;
            this.label = 1;
            obj = c5904aFK.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    PendingIntent pendingIntent = (PendingIntent) obj;
                    Intrinsics.copydefault(pendingIntent);
                    application = new AbstractC5990aGr.Activity(pendingIntent);
                    return application;
                }
                C56391yDq.AEQbTJ(obj);
                authenticationStartResponse = (AuthenticationStartResponse) ((ResponseData) obj).getData();
                if (authenticationStartResponse != null) {
                    return new AbstractC5990aGr.Application("null data");
                }
                Task<PendingIntent> signPendingIntent = this.this$0.KWHzl.getSignPendingIntent(authenticationStartResponse.toPublicKeyCredentialRequestOptions());
                Intrinsics.checkNotNullExpressionValue(signPendingIntent, "");
                this.label = 4;
                obj = C6617aSi.EZpvd(signPendingIntent, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                Intrinsics.copydefault(pendingIntent2);
                application = new AbstractC5990aGr.Activity(pendingIntent2);
                return application;
            }
            C56391yDq.AEQbTJ(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                return AbstractC5990aGr.TaskDescription.copydefault;
            }
            if (zBooleanValue) {
                PasskeyApiService passkeyApiService = this.this$0.copydefault;
                this.label = 3;
                obj = passkeyApiService.prepareUnlockTokenWithFido(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                authenticationStartResponse = (AuthenticationStartResponse) ((ResponseData) obj).getData();
                if (authenticationStartResponse != null) {
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C5903aFJ c5903aFJ = this.this$0.OLrzqt;
            this.label = 2;
            obj = c5903aFJ.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
            }
        } else {
            return AbstractC5990aGr.ActionBar.OLrzqt;
        }
    }
}
