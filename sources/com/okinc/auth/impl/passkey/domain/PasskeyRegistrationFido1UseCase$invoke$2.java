package com.okinc.auth.impl.passkey.domain;

import android.content.Context;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRegistrationStartRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32996moC;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5910aFQ;
import o.C5911aFR;
import o.InterfaceC5693aBL;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRegistrationFido1UseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5910aFQ.Application>, Object> {
    final /* synthetic */ AbstractC32996moC $fragment;
    final /* synthetic */ int $inHouseVersion;
    final /* synthetic */ String $mfaSessionId;
    final /* synthetic */ String $passkeyEasyRegToken;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5910aFQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRegistrationFido1UseCase$invoke$2(String str, String str2, C5910aFQ c5910aFQ, int i, AbstractC32996moC abstractC32996moC, Continuation<? super PasskeyRegistrationFido1UseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$passkeyEasyRegToken = str;
        this.$mfaSessionId = str2;
        this.this$0 = c5910aFQ;
        this.$inHouseVersion = i;
        this.$fragment = abstractC32996moC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyRegistrationFido1UseCase$invoke$2 passkeyRegistrationFido1UseCase$invoke$2 = new PasskeyRegistrationFido1UseCase$invoke$2(this.$passkeyEasyRegToken, this.$mfaSessionId, this.this$0, this.$inHouseVersion, this.$fragment, continuation);
        passkeyRegistrationFido1UseCase$invoke$2.L$0 = obj;
        return passkeyRegistrationFido1UseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5910aFQ.Application> continuation) {
        return ((PasskeyRegistrationFido1UseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:8:0x001c, B:52:0x0118, B:54:0x011e, B:58:0x0126, B:60:0x012a, B:61:0x0131, B:62:0x013a, B:64:0x0140, B:68:0x0160, B:69:0x0167, B:12:0x0030, B:30:0x009c, B:32:0x00a2, B:45:0x00e8, B:33:0x00ae, B:35:0x00b6, B:36:0x00b9, B:38:0x00c1, B:39:0x00c9, B:41:0x00cd, B:42:0x00d9, B:44:0x00dd, B:46:0x00ef, B:47:0x00f4, B:15:0x0039, B:21:0x005f, B:23:0x0067, B:25:0x006d, B:27:0x0071, B:48:0x00f5, B:70:0x016f, B:18:0x0045), top: B:85:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:8:0x001c, B:52:0x0118, B:54:0x011e, B:58:0x0126, B:60:0x012a, B:61:0x0131, B:62:0x013a, B:64:0x0140, B:68:0x0160, B:69:0x0167, B:12:0x0030, B:30:0x009c, B:32:0x00a2, B:45:0x00e8, B:33:0x00ae, B:35:0x00b6, B:36:0x00b9, B:38:0x00c1, B:39:0x00c9, B:41:0x00cd, B:42:0x00d9, B:44:0x00dd, B:46:0x00ef, B:47:0x00f4, B:15:0x0039, B:21:0x005f, B:23:0x0067, B:25:0x006d, B:27:0x0071, B:48:0x00f5, B:70:0x016f, B:18:0x0045), top: B:85:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:8:0x001c, B:52:0x0118, B:54:0x011e, B:58:0x0126, B:60:0x012a, B:61:0x0131, B:62:0x013a, B:64:0x0140, B:68:0x0160, B:69:0x0167, B:12:0x0030, B:30:0x009c, B:32:0x00a2, B:45:0x00e8, B:33:0x00ae, B:35:0x00b6, B:36:0x00b9, B:38:0x00c1, B:39:0x00c9, B:41:0x00cd, B:42:0x00d9, B:44:0x00dd, B:46:0x00ef, B:47:0x00f4, B:15:0x0039, B:21:0x005f, B:23:0x0067, B:25:0x006d, B:27:0x0071, B:48:0x00f5, B:70:0x016f, B:18:0x0045), top: B:85:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:8:0x001c, B:52:0x0118, B:54:0x011e, B:58:0x0126, B:60:0x012a, B:61:0x0131, B:62:0x013a, B:64:0x0140, B:68:0x0160, B:69:0x0167, B:12:0x0030, B:30:0x009c, B:32:0x00a2, B:45:0x00e8, B:33:0x00ae, B:35:0x00b6, B:36:0x00b9, B:38:0x00c1, B:39:0x00c9, B:41:0x00cd, B:42:0x00d9, B:44:0x00dd, B:46:0x00ef, B:47:0x00f4, B:15:0x0039, B:21:0x005f, B:23:0x0067, B:25:0x006d, B:27:0x0071, B:48:0x00f5, B:70:0x016f, B:18:0x0045), top: B:85:0x0010 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object taskDescription;
        CoroutineScope coroutineScope;
        Object objStartRegistration;
        Object objM7386unboximpl;
        Object objInvoke$default;
        C5911aFR.Application application;
        ActivateGuardUseCase.TaskDescription dialog;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str = "";
        Object obj2 = null;
        try {
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationFido1UseCase", "passkeyStartRegistration error: " + e.getMessage());
            List listGEmmrt = yDY.gEmmrt(C56443yFo.AEQbTJ(42007), C56443yFo.AEQbTJ(42013), C56443yFo.AEQbTJ(MfaResponse.SESSION_EXPIRED), C56443yFo.AEQbTJ(MfaResponse.SESSION_INVALID));
            boolean z = e instanceof OKServerException;
            if (z && listGEmmrt.contains(C56443yFo.AEQbTJ(((OKServerException) e).getCode()))) {
                taskDescription = C5910aFQ.Application.StateListAnimator.OLrzqt;
            } else if (z && ((OKServerException) e).getCode() == 42009) {
                taskDescription = C5910aFQ.Application.ActionBar.EZpvd;
            } else {
                return new C5910aFQ.Application.TaskDescription(e.getMessage());
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody = new PasskeyRegistrationStartRequestBody(this.$passkeyEasyRegToken, this.$mfaSessionId);
            PasskeyApiService passkeyApiService = this.this$0.EZpvd;
            this.L$0 = coroutineScope;
            this.label = 1;
            objStartRegistration = passkeyApiService.startRegistration(passkeyRegistrationStartRequestBody, this);
            if (objStartRegistration == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objInvoke$default = obj;
                    application = (C5911aFR.Application) objInvoke$default;
                    if (!(application instanceof C5911aFR.Application.ActionBar)) {
                        dialog = new ActivateGuardUseCase.TaskDescription.Fragment(((C5911aFR.Application.ActionBar) application).KWHzl());
                    } else if (Intrinsics.EZpvd(application, C5911aFR.Application.C0819Application.AEQbTJ)) {
                        dialog = ActivateGuardUseCase.TaskDescription.ActionBar.KWHzl;
                    } else if (Intrinsics.EZpvd(application, C5911aFR.Application.Activity.OLrzqt)) {
                        dialog = new ActivateGuardUseCase.TaskDescription.StateListAnimator(InterfaceC5693aBL.StateListAnimator.Activity.copydefault);
                    } else if (application instanceof C5911aFR.Application.TaskDescription) {
                        dialog = new ActivateGuardUseCase.TaskDescription.StateListAnimator(((C5911aFR.Application.TaskDescription) application).EZpvd());
                    } else {
                        if (!(application instanceof C5911aFR.Application.StateListAnimator)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dialog = new ActivateGuardUseCase.TaskDescription.Dialog(((C5911aFR.Application.StateListAnimator) application).KWHzl());
                    }
                    return new C5910aFQ.Application.C0818Application(dialog);
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
                        obj2 = objM7386unboximpl;
                    }
                    ActivateGuardUseCase.TaskDescription taskDescription2 = (ActivateGuardUseCase.TaskDescription) obj2;
                    if (taskDescription2 != null) {
                        return new C5910aFQ.Application.C0818Application(taskDescription2);
                    }
                    return new C5910aFQ.Application.TaskDescription("null getOrNull null");
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("PasskeyRegistrationFido1UseCase", "activateGuardUseCase error: " + thM7380exceptionOrNullimpl.getMessage());
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    return new C5910aFQ.Application.TaskDescription(str);
                }
                taskDescription = new C5910aFQ.Application.TaskDescription("null exceptionOrNull null");
                return taskDescription;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objStartRegistration = obj;
        }
        ResponseData responseData = (ResponseData) objStartRegistration;
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            pUU.copydefault("PasskeyRegistrationFido1UseCase", "passkeyStartRegistration error: " + responseData.getMsg());
            return new C5910aFQ.Application.TaskDescription(responseData.getMsg());
        }
        if (this.$inHouseVersion == 2) {
            C5911aFR c5911aFR = this.this$0.AEQbTJ;
            Context contextRequireContext = this.$fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            this.L$0 = null;
            this.label = 2;
            objInvoke$default = C5911aFR.invoke$default(c5911aFR, contextRequireContext, (RegistrationStartResponse) data, false, this, 4, null);
            if (objInvoke$default == objCopydefault) {
                return objCopydefault;
            }
            application = (C5911aFR.Application) objInvoke$default;
            if (!(application instanceof C5911aFR.Application.ActionBar)) {
            }
            return new C5910aFQ.Application.C0818Application(dialog);
        }
        ActivateGuardUseCase activateGuardUseCase = this.this$0.copydefault;
        AbstractC32996moC abstractC32996moC = this.$fragment;
        Object data2 = responseData.getData();
        Intrinsics.copydefault(data2);
        ActivateGuardUseCase.StateListAnimator stateListAnimator = new ActivateGuardUseCase.StateListAnimator(false, abstractC32996moC, (RegistrationStartResponse) data2);
        this.L$0 = coroutineScope;
        this.label = 3;
        Object objKWHzl = activateGuardUseCase.KWHzl(stateListAnimator, (Continuation) this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objM7386unboximpl = objKWHzl;
        if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
    }
}
