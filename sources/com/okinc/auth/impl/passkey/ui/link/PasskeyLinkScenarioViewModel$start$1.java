package com.okinc.auth.impl.passkey.ui.link;

import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C5894aFA;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyLinkScenarioViewModel$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PasskeyLinkScenarioViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLinkScenarioViewModel$start$1(PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel, Continuation<? super PasskeyLinkScenarioViewModel$start$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyLinkScenarioViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyLinkScenarioViewModel$start$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyLinkScenarioViewModel$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5894aFA.TaskDescription taskDescription;
        List<AuthenticationStartResponse.CredentialDescriptor> allowCredentials;
        AuthenticationStartResponse.Extensions extensions;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5894aFA c5894aFA = this.this$0.DbNXlk;
                this.label = 2;
                obj = c5894aFA.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                taskDescription = (C5894aFA.TaskDescription) obj;
                if (taskDescription instanceof C5894aFA.TaskDescription.StateListAnimator) {
                    AuthenticationStartResponse authenticationStartResponseKWHzl = ((C5894aFA.TaskDescription.StateListAnimator) taskDescription).KWHzl();
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.copydefault;
                    AuthenticationStartResponse.PublicKey publicKey = authenticationStartResponseKWHzl.getPublicKey();
                    List listAhwBna = null;
                    PasskeyAuthenticateRequest.Extensions extensions2 = new PasskeyAuthenticateRequest.Extensions((publicKey == null || (extensions = publicKey.getExtensions()) == null) ? null : extensions.getCredProps());
                    AuthenticationStartResponse.PublicKey publicKey2 = authenticationStartResponseKWHzl.getPublicKey();
                    String challenge = publicKey2 != null ? publicKey2.getChallenge() : null;
                    if (challenge == null) {
                        challenge = "";
                    }
                    AuthenticationStartResponse.PublicKey publicKey3 = authenticationStartResponseKWHzl.getPublicKey();
                    String rpId = publicKey3 != null ? publicKey3.getRpId() : null;
                    String str = rpId != null ? rpId : "";
                    AuthenticationStartResponse.PublicKey publicKey4 = authenticationStartResponseKWHzl.getPublicKey();
                    if (publicKey4 != null && (allowCredentials = publicKey4.getAllowCredentials()) != null) {
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(allowCredentials, 10));
                        for (AuthenticationStartResponse.CredentialDescriptor credentialDescriptor : allowCredentials) {
                            List<String> transports = credentialDescriptor.getTransports();
                            List listAxsJAYsNCnLh = transports != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(transports) : null;
                            if (listAxsJAYsNCnLh == null) {
                                listAxsJAYsNCnLh = yDY.AhwBna();
                            }
                            arrayList.add(new PasskeyAuthenticateRequest.AllowCredential(listAxsJAYsNCnLh, String.valueOf(credentialDescriptor.getId()), String.valueOf(credentialDescriptor.getType())));
                        }
                        listAhwBna = arrayList;
                    }
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    PasskeyAuthenticateRequest passkeyAuthenticateRequest = new PasskeyAuthenticateRequest(extensions2, challenge, str, listAhwBna);
                    this.label = 3;
                    if (mutableSharedFlow3.emit(passkeyAuthenticateRequest, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (taskDescription instanceof C5894aFA.TaskDescription.ActionBar) {
                    Exception excOLrzqt = ((C5894aFA.TaskDescription.ActionBar) taskDescription).OLrzqt();
                    PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel = this.this$0;
                    pUU.copydefault("PasskeyLinkScenarioViewModel", "start: " + excOLrzqt.getMessage());
                    MutableSharedFlow mutableSharedFlow4 = passkeyLinkScenarioViewModel.KWHzl;
                    String message = excOLrzqt.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    PasskeyLinkState.Failure failure = new PasskeyLinkState.Failure("", message);
                    this.label = 4;
                    if (mutableSharedFlow4.emit(failure, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (taskDescription instanceof C5894aFA.TaskDescription.Application) {
                    MutableSharedFlow mutableSharedFlow5 = this.this$0.OLrzqt;
                    String strEZpvd = ((C5894aFA.TaskDescription.Application) taskDescription).EZpvd();
                    this.label = 5;
                    if (mutableSharedFlow5.emit(strEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5894aFA c5894aFA2 = this.this$0.DbNXlk;
                this.label = 2;
                obj = c5894aFA2.KWHzl(this);
                if (obj == objCopydefault) {
                }
                taskDescription = (C5894aFA.TaskDescription) obj;
                if (taskDescription instanceof C5894aFA.TaskDescription.StateListAnimator) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                taskDescription = (C5894aFA.TaskDescription) obj;
                if (taskDescription instanceof C5894aFA.TaskDescription.StateListAnimator) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
            case 4:
            case 5:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
