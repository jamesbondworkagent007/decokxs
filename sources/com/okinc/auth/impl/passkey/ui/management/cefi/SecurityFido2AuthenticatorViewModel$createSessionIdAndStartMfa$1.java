package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5765aCe;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$createSessionIdAndStartMfa$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $business;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$createSessionIdAndStartMfa$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, String str, Continuation<? super SecurityFido2AuthenticatorViewModel$createSessionIdAndStartMfa$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
        this.$business = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$createSessionIdAndStartMfa$1(this.this$0, this.$business, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$createSessionIdAndStartMfa$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object obj2;
        MfaCreateSessionResponse mfaCreateSessionResponse;
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel;
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        String sessionId;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5765aCe c5765aCe = this.this$0.AuCTelauCTel;
            MfaCreateSessionRequest mfaCreateSessionRequest = new MfaCreateSessionRequest(this.$business);
            this.label = 1;
            objOLrzqt = c5765aCe.OLrzqt(mfaCreateSessionRequest, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$2;
                    securityFido2AuthenticatorViewModel2 = (SecurityFido2AuthenticatorViewModel) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    MutableLiveData mutableLiveData = securityFido2AuthenticatorViewModel2.EZpvd;
                    String message = th.getMessage();
                    mutableLiveData.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(message != null ? message : "")));
                    return Unit.INSTANCE;
                }
                mfaCreateSessionResponse = (MfaCreateSessionResponse) this.L$2;
                securityFido2AuthenticatorViewModel = (SecurityFido2AuthenticatorViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                MutableLiveData mutableLiveData2 = securityFido2AuthenticatorViewModel.EZpvd;
                sessionId = mfaCreateSessionResponse.getSessionId();
                if (sessionId == null) {
                    sessionId = "";
                }
                mutableLiveData2.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.ActionBar(sessionId)));
                securityFido2AuthenticatorViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = securityFido2AuthenticatorViewModel2.gEmmrt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = obj2;
                    this.L$1 = securityFido2AuthenticatorViewModel2;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    MutableLiveData mutableLiveData3 = securityFido2AuthenticatorViewModel2.EZpvd;
                    String message2 = th.getMessage();
                    mutableLiveData3.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(message2 != null ? message2 : "")));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        obj2 = objOLrzqt;
        SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            mfaCreateSessionResponse = (MfaCreateSessionResponse) obj2;
            MutableSharedFlow mutableSharedFlow2 = securityFido2AuthenticatorViewModel3.gEmmrt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
            this.L$0 = obj2;
            this.L$1 = securityFido2AuthenticatorViewModel3;
            this.L$2 = mfaCreateSessionResponse;
            this.label = 2;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
            securityFido2AuthenticatorViewModel = securityFido2AuthenticatorViewModel3;
            MutableLiveData mutableLiveData22 = securityFido2AuthenticatorViewModel.EZpvd;
            sessionId = mfaCreateSessionResponse.getSessionId();
            if (sessionId == null) {
            }
            mutableLiveData22.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.ActionBar(sessionId)));
        }
        securityFido2AuthenticatorViewModel2 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
