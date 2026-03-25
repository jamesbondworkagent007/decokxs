package com.okinc.auth.impl.passkey.domain;

import android.content.Context;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C3066Aet;
import o.C34703nhO;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C5691aBJ;
import o.C5911aFR;
import o.C6617aSi;
import o.InterfaceC5693aBL;
import o.InterfaceC58880zSu;
import o.pUU;
import o.yDY;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRegistrationFido1v2UseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5911aFR.Application>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $requireUserPresence;
    final /* synthetic */ RegistrationStartResponse $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C5911aFR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRegistrationFido1v2UseCase$invoke$2(C5911aFR c5911aFR, RegistrationStartResponse registrationStartResponse, Context context, boolean z, Continuation<? super PasskeyRegistrationFido1v2UseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5911aFR;
        this.$response = registrationStartResponse;
        this.$context = context;
        this.$requireUserPresence = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRegistrationFido1v2UseCase$invoke$2(this.this$0, this.$response, this.$context, this.$requireUserPresence, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5911aFR.Application> continuation) {
        return ((PasskeyRegistrationFido1v2UseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4 A[Catch: Exception -> 0x0171, OkxPasskeyException -> 0x0173, TryCatch #0 {OkxPasskeyException -> 0x0173, blocks: (B:6:0x0015, B:63:0x012c, B:11:0x003c, B:60:0x0105, B:14:0x0055, B:16:0x0063, B:20:0x006c, B:22:0x0074, B:24:0x007a, B:28:0x0083, B:30:0x008b, B:32:0x0091, B:36:0x009a, B:38:0x00a2, B:40:0x00a8, B:44:0x00b1, B:46:0x00b9, B:48:0x00bf, B:49:0x00c8, B:51:0x00ce, B:53:0x00da, B:54:0x00de, B:57:0x00e8, B:56:0x00e4), top: B:82:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object taskDescription;
        InterfaceC58880zSu interfaceC58880zSu;
        String challenge;
        String id;
        String id2;
        String name;
        List<String> listAhwBna;
        Object objCopydefault;
        List<RegistrationStartResponse.PublicKey.CredentialDescriptor> excludeCredentials;
        RegistrationStartResponse.PublicKey.User user;
        RegistrationStartResponse.PublicKey.User user2;
        RegistrationStartResponse.PublicKey.Rp rp;
        Object objEZpvd;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    interfaceC58880zSu = this.this$0.copydefault;
                    RegistrationStartResponse.PublicKey publicKey = this.$response.getPublicKey();
                    challenge = publicKey != null ? publicKey.getChallenge() : null;
                    if (challenge == null) {
                        challenge = "";
                    }
                    RegistrationStartResponse.PublicKey publicKey2 = this.$response.getPublicKey();
                    id = (publicKey2 == null || (rp = publicKey2.getRp()) == null) ? null : rp.getId();
                    if (id == null) {
                        id = "";
                    }
                    RegistrationStartResponse.PublicKey publicKey3 = this.$response.getPublicKey();
                    id2 = (publicKey3 == null || (user2 = publicKey3.getUser()) == null) ? null : user2.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    RegistrationStartResponse.PublicKey publicKey4 = this.$response.getPublicKey();
                    name = (publicKey4 == null || (user = publicKey4.getUser()) == null) ? null : user.getName();
                    if (name == null) {
                        name = "";
                    }
                    RegistrationStartResponse.PublicKey publicKey5 = this.$response.getPublicKey();
                    if (publicKey5 == null || (excludeCredentials = publicKey5.getExcludeCredentials()) == null) {
                        listAhwBna = yDY.AhwBna();
                        C5691aBJ c5691aBJ = this.this$0.KWHzl;
                        Context context = this.$context;
                        this.L$0 = interfaceC58880zSu;
                        this.L$1 = challenge;
                        this.L$2 = id;
                        this.L$3 = id2;
                        this.L$4 = name;
                        this.L$5 = listAhwBna;
                        this.label = 1;
                        objCopydefault = c5691aBJ.copydefault(context, this);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = excludeCredentials.iterator();
                        while (it.hasNext()) {
                            String id3 = ((RegistrationStartResponse.PublicKey.CredentialDescriptor) it.next()).getId();
                            if (id3 != null) {
                                arrayList.add(id3);
                            }
                        }
                        listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
                        if (listAhwBna == null) {
                        }
                        C5691aBJ c5691aBJ2 = this.this$0.KWHzl;
                        Context context2 = this.$context;
                        this.L$0 = interfaceC58880zSu;
                        this.L$1 = challenge;
                        this.L$2 = id;
                        this.L$3 = id2;
                        this.L$4 = name;
                        this.L$5 = listAhwBna;
                        this.label = 1;
                        objCopydefault = c5691aBJ2.copydefault(context2, this);
                        if (objCopydefault == objCopydefault2) {
                        }
                    }
                    C3066Aet c3066Aet = (C3066Aet) objEZpvd;
                    String strAEQbTJ = C6617aSi.AEQbTJ(c3066Aet.KWHzl());
                    String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return new C5911aFR.Application.ActionBar(new RegistrationFinishBody(string, strAEQbTJ, (String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new RegistrationFinishBody.ResponseData(C6617aSi.AEQbTJ(c3066Aet.AEQbTJ()), C6617aSi.AEQbTJ(c3066Aet.EZpvd()), C56402yEa.EZpvd("internal")), new RegistrationFinishBody.ClientExtensionResultsData((RegistrationFinishBody.CredPropsData) null, 1, (DefaultConstructorMarker) null), 4, (DefaultConstructorMarker) null));
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = obj;
                    C3066Aet c3066Aet2 = (C3066Aet) objEZpvd;
                    String strAEQbTJ2 = C6617aSi.AEQbTJ(c3066Aet2.KWHzl());
                    String string2 = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    return new C5911aFR.Application.ActionBar(new RegistrationFinishBody(string2, strAEQbTJ2, (String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new RegistrationFinishBody.ResponseData(C6617aSi.AEQbTJ(c3066Aet2.AEQbTJ()), C6617aSi.AEQbTJ(c3066Aet2.EZpvd()), C56402yEa.EZpvd("internal")), new RegistrationFinishBody.ClientExtensionResultsData((RegistrationFinishBody.CredPropsData) null, 1, (DefaultConstructorMarker) null), 4, (DefaultConstructorMarker) null));
                }
                List<String> list = (List) this.L$5;
                String str = (String) this.L$4;
                String str2 = (String) this.L$3;
                String str3 = (String) this.L$2;
                String str4 = (String) this.L$1;
                InterfaceC58880zSu interfaceC58880zSu2 = (InterfaceC58880zSu) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
                listAhwBna = list;
                interfaceC58880zSu = interfaceC58880zSu2;
                name = str;
                challenge = str4;
                id2 = str2;
                id = str3;
                String strKWHzl = C34703nhO.KWHzl(this.$context);
                boolean z = this.$requireUserPresence;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                objEZpvd = interfaceC58880zSu.EZpvd(id, challenge, name, id2, listAhwBna, (String) objCopydefault, strKWHzl, z, this);
                if (objEZpvd == objCopydefault2) {
                    return objCopydefault2;
                }
                C3066Aet c3066Aet22 = (C3066Aet) objEZpvd;
                String strAEQbTJ22 = C6617aSi.AEQbTJ(c3066Aet22.KWHzl());
                String string22 = PublicKeyCredentialType.PUBLIC_KEY.toString();
                Intrinsics.checkNotNullExpressionValue(string22, "");
                return new C5911aFR.Application.ActionBar(new RegistrationFinishBody(string22, strAEQbTJ22, (String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new RegistrationFinishBody.ResponseData(C6617aSi.AEQbTJ(c3066Aet22.AEQbTJ()), C6617aSi.AEQbTJ(c3066Aet22.EZpvd()), C56402yEa.EZpvd("internal")), new RegistrationFinishBody.ClientExtensionResultsData((RegistrationFinishBody.CredPropsData) null, 1, (DefaultConstructorMarker) null), 4, (DefaultConstructorMarker) null));
            } catch (OkxPasskeyException e) {
                pUU.copydefault("PasskeyRegistrationFido1v2UseCase", "getOkxPasskeyManager createCredential(): " + e + " " + e.getMessage());
                if (e instanceof OkxPasskeyException.UserCancelled) {
                    taskDescription = C5911aFR.Application.Activity.OLrzqt;
                } else if (e instanceof OkxPasskeyException.KeyAlreadyExists) {
                    taskDescription = C5911aFR.Application.C0819Application.AEQbTJ;
                } else {
                    if (!(e instanceof OkxPasskeyException.NoDevicePasscode)) {
                        return new C5911aFR.Application.StateListAnimator(e + ": " + e.getMessage());
                    }
                    taskDescription = new C5911aFR.Application.TaskDescription(InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd);
                }
                return taskDescription;
            }
        } catch (Exception e2) {
            pUU.copydefault("PasskeyRegistrationFido1v2UseCase", "getOkxPasskeyManager e: " + e2.getMessage());
            return new C5911aFR.Application.StateListAnimator(e2.getMessage());
        }
    }
}
