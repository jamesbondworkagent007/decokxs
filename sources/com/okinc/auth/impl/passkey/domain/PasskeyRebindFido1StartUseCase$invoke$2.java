package com.okinc.auth.impl.passkey.domain;

import android.content.Context;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRebindStartRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.network.okg.response.ResponseData;
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
import o.C5911aFR;
import o.C5912aFS;
import o.InterfaceC5693aBL;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindFido1StartUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ActivateGuardUseCase.TaskDescription>>, Object> {
    final /* synthetic */ AbstractC32996moC $fragment;
    final /* synthetic */ int $inHouseVersion;
    final /* synthetic */ String $workflowToken;
    int label;
    final /* synthetic */ C5912aFS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindFido1StartUseCase$invoke$2(String str, C5912aFS c5912aFS, int i, AbstractC32996moC abstractC32996moC, Continuation<? super PasskeyRebindFido1StartUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$workflowToken = str;
        this.this$0 = c5912aFS;
        this.$inHouseVersion = i;
        this.$fragment = abstractC32996moC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindFido1StartUseCase$invoke$2(this.$workflowToken, this.this$0, this.$inHouseVersion, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ActivateGuardUseCase.TaskDescription>> continuation) {
        return ((PasskeyRebindFido1StartUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: Exception -> 0x0165, TryCatch #0 {Exception -> 0x0165, blocks: (B:7:0x0015, B:48:0x00fc, B:50:0x0102, B:51:0x010a, B:53:0x0110, B:11:0x0028, B:27:0x008c, B:29:0x0092, B:42:0x00d8, B:30:0x009e, B:32:0x00a6, B:33:0x00a9, B:35:0x00b1, B:36:0x00b9, B:38:0x00bd, B:39:0x00c9, B:41:0x00cd, B:43:0x00e0, B:44:0x00e5, B:12:0x002c, B:18:0x0049, B:20:0x0051, B:22:0x0057, B:24:0x0064, B:45:0x00e6, B:54:0x013b, B:15:0x0033), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[Catch: Exception -> 0x0165, TryCatch #0 {Exception -> 0x0165, blocks: (B:7:0x0015, B:48:0x00fc, B:50:0x0102, B:51:0x010a, B:53:0x0110, B:11:0x0028, B:27:0x008c, B:29:0x0092, B:42:0x00d8, B:30:0x009e, B:32:0x00a6, B:33:0x00a9, B:35:0x00b1, B:36:0x00b9, B:38:0x00bd, B:39:0x00c9, B:41:0x00cd, B:43:0x00e0, B:44:0x00e5, B:12:0x002c, B:18:0x0049, B:20:0x0051, B:22:0x0057, B:24:0x0064, B:45:0x00e6, B:54:0x013b, B:15:0x0033), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102 A[Catch: Exception -> 0x0165, TryCatch #0 {Exception -> 0x0165, blocks: (B:7:0x0015, B:48:0x00fc, B:50:0x0102, B:51:0x010a, B:53:0x0110, B:11:0x0028, B:27:0x008c, B:29:0x0092, B:42:0x00d8, B:30:0x009e, B:32:0x00a6, B:33:0x00a9, B:35:0x00b1, B:36:0x00b9, B:38:0x00bd, B:39:0x00c9, B:41:0x00cd, B:43:0x00e0, B:44:0x00e5, B:12:0x002c, B:18:0x0049, B:20:0x0051, B:22:0x0057, B:24:0x0064, B:45:0x00e6, B:54:0x013b, B:15:0x0033), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[Catch: Exception -> 0x0165, TryCatch #0 {Exception -> 0x0165, blocks: (B:7:0x0015, B:48:0x00fc, B:50:0x0102, B:51:0x010a, B:53:0x0110, B:11:0x0028, B:27:0x008c, B:29:0x0092, B:42:0x00d8, B:30:0x009e, B:32:0x00a6, B:33:0x00a9, B:35:0x00b1, B:36:0x00b9, B:38:0x00bd, B:39:0x00c9, B:41:0x00cd, B:43:0x00e0, B:44:0x00e5, B:12:0x002c, B:18:0x0049, B:20:0x0051, B:22:0x0057, B:24:0x0064, B:45:0x00e6, B:54:0x013b, B:15:0x0033), top: B:60:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C5911aFR.Application application;
        Object dialog;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("PasskeyRebindFido1Start", "rebind error: " + e.getMessage());
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyRebindStartRequestBody passkeyRebindStartRequestBody = new PasskeyRebindStartRequestBody(this.$workflowToken);
            PasskeyApiService passkeyApiService = this.this$0.KWHzl;
            this.label = 1;
            obj = passkeyApiService.startRebind(passkeyRebindStartRequestBody, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    application = (C5911aFR.Application) obj;
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
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(dialog);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    Result.Application application4 = Result.Companion;
                    Result.m7377constructorimpl((ActivateGuardUseCase.TaskDescription) objM7377constructorimpl);
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("PasskeyRebindFido1Start", "activateGuardUseCase error: " + thM7380exceptionOrNullimpl.getMessage());
                    Result.Application application5 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(thM7380exceptionOrNullimpl.getMessage())));
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        ResponseData responseData = (ResponseData) obj;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            RegistrationStartResponse registrationStartResponse = (RegistrationStartResponse) data;
            if (this.$inHouseVersion == 2) {
                C5911aFR c5911aFR = this.this$0.copydefault;
                Context contextRequireContext = this.$fragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                this.label = 2;
                obj = C5911aFR.invoke$default(c5911aFR, contextRequireContext, (RegistrationStartResponse) data2, false, this, 4, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                application = (C5911aFR.Application) obj;
                if (!(application instanceof C5911aFR.Application.ActionBar)) {
                }
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(dialog);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            ActivateGuardUseCase activateGuardUseCase = this.this$0.EZpvd;
            ActivateGuardUseCase.StateListAnimator stateListAnimator = new ActivateGuardUseCase.StateListAnimator(true, this.$fragment, registrationStartResponse);
            this.label = 3;
            objM7377constructorimpl = activateGuardUseCase.KWHzl(stateListAnimator, (Continuation) this);
            if (objM7377constructorimpl == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        pUU.copydefault("PasskeyRebindFido1Start", "rebind error: " + responseData.getMsg());
        Result.Application application6 = Result.Companion;
        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(responseData.getMsg())));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
