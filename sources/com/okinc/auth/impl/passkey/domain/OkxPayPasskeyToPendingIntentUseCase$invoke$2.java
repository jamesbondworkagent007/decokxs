package com.okinc.auth.impl.passkey.domain;

import android.app.PendingIntent;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C5902aFI;
import o.C6617aSi;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayPasskeyToPendingIntentUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PendingIntent>>, Object> {
    final /* synthetic */ PasskeyAuthenticateRequest $request;
    int label;
    final /* synthetic */ C5902aFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayPasskeyToPendingIntentUseCase$invoke$2(C5902aFI c5902aFI, PasskeyAuthenticateRequest passkeyAuthenticateRequest, Continuation<? super OkxPayPasskeyToPendingIntentUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5902aFI;
        this.$request = passkeyAuthenticateRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayPasskeyToPendingIntentUseCase$invoke$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PendingIntent>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PendingIntent>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PendingIntent>> continuation) {
        return ((OkxPayPasskeyToPendingIntentUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                PublicKeyCredentialRequestOptions.Builder builder = new PublicKeyCredentialRequestOptions.Builder();
                PasskeyAuthenticateRequest passkeyAuthenticateRequest = this.$request;
                builder.setChallenge(C6617aSi.AEQbTJ(passkeyAuthenticateRequest.EZpvd()));
                builder.setRpId(passkeyAuthenticateRequest.KWHzl());
                List<PasskeyAuthenticateRequest.AllowCredential> listOLrzqt = passkeyAuthenticateRequest.OLrzqt();
                ArrayList<PasskeyAuthenticateRequest.AllowCredential> arrayList = new ArrayList();
                for (Object obj2 : listOLrzqt) {
                    PasskeyAuthenticateRequest.AllowCredential allowCredential = (PasskeyAuthenticateRequest.AllowCredential) obj2;
                    if (allowCredential.AEQbTJ().contains("hybrid") || allowCredential.AEQbTJ().contains("unknown")) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (PasskeyAuthenticateRequest.AllowCredential allowCredential2 : arrayList) {
                    String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    byte[] bArrAEQbTJ = C6617aSi.AEQbTJ(allowCredential2.copydefault());
                    if (bArrAEQbTJ == null) {
                        bArrAEQbTJ = new byte[0];
                    }
                    arrayList2.add(C6617aSi.OLrzqt(string, bArrAEQbTJ, C56402yEa.EZpvd(Transport.INTERNAL)));
                }
                builder.setAllowList(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2));
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsBuild = builder.build();
                Intrinsics.checkNotNullExpressionValue(publicKeyCredentialRequestOptionsBuild, "");
                Task<PendingIntent> signPendingIntent = this.this$0.AEQbTJ.getSignPendingIntent(publicKeyCredentialRequestOptionsBuild);
                Intrinsics.checkNotNullExpressionValue(signPendingIntent, "");
                Result.Application application = Result.Companion;
                this.label = 1;
                obj = C6617aSi.EZpvd(signPendingIntent, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            Intrinsics.copydefault(pendingIntent);
            objM7377constructorimpl = Result.m7377constructorimpl(pendingIntent);
        } catch (Exception e) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
