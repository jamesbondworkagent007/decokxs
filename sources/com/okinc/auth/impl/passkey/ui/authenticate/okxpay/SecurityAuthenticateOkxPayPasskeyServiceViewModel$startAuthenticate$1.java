package com.okinc.auth.impl.passkey.ui.authenticate.okxpay;

import android.app.PendingIntent;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C5902aFI;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityAuthenticateOkxPayPasskeyServiceViewModel$startAuthenticate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyAuthenticateRequest $request;
    Object L$0;
    int label;
    final /* synthetic */ SecurityAuthenticateOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAuthenticateOkxPayPasskeyServiceViewModel$startAuthenticate$1(SecurityAuthenticateOkxPayPasskeyServiceViewModel securityAuthenticateOkxPayPasskeyServiceViewModel, PasskeyAuthenticateRequest passkeyAuthenticateRequest, Continuation<? super SecurityAuthenticateOkxPayPasskeyServiceViewModel$startAuthenticate$1> continuation) {
        super(2, continuation);
        this.this$0 = securityAuthenticateOkxPayPasskeyServiceViewModel;
        this.$request = passkeyAuthenticateRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityAuthenticateOkxPayPasskeyServiceViewModel$startAuthenticate$1(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityAuthenticateOkxPayPasskeyServiceViewModel$startAuthenticate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object obj2;
        PendingIntent pendingIntent;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SecurityAuthenticateOkxPayPasskeyServiceViewModel securityAuthenticateOkxPayPasskeyServiceViewModel = this.this$0;
            this.label = 1;
            obj = securityAuthenticateOkxPayPasskeyServiceViewModel.copydefault(this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    obj2 = objCopydefault;
                    pendingIntent = (PendingIntent) (!Result.m7383isFailureimpl(obj2) ? null : obj2);
                    if (pendingIntent != null) {
                        MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.Activity activity = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.Activity(pendingIntent);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow.emit(activity, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(new PasskeyState.AuthenticateError(message));
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        PasskeyState passkeyState = (PasskeyState) obj;
        if (passkeyState instanceof PasskeyState.Success) {
            C5902aFI c5902aFI = this.this$0.KWHzl;
            PasskeyAuthenticateRequest passkeyAuthenticateRequest = this.$request;
            this.label = 2;
            objCopydefault = c5902aFI.copydefault(passkeyAuthenticateRequest, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            obj2 = objCopydefault;
            pendingIntent = (PendingIntent) (!Result.m7383isFailureimpl(obj2) ? null : obj2);
            if (pendingIntent != null) {
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
        SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar actionBar2 = new SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar(passkeyState);
        this.label = 5;
        if (mutableSharedFlow3.emit(actionBar2, this) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }
}
