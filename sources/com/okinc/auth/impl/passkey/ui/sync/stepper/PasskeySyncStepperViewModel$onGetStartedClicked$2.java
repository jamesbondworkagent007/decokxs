package com.okinc.auth.impl.passkey.ui.sync.stepper;

import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5765aCe;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeySyncStepperViewModel$onGetStartedClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $businessValue;
    Object L$0;
    int label;
    final /* synthetic */ PasskeySyncStepperViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySyncStepperViewModel$onGetStartedClicked$2(PasskeySyncStepperViewModel passkeySyncStepperViewModel, String str, Continuation<? super PasskeySyncStepperViewModel$onGetStartedClicked$2> continuation) {
        super(2, continuation);
        this.this$0 = passkeySyncStepperViewModel;
        this.$businessValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeySyncStepperViewModel$onGetStartedClicked$2(this.this$0, this.$businessValue, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeySyncStepperViewModel$onGetStartedClicked$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(C56443yFo.KWHzl(true));
            C5765aCe c5765aCe = this.this$0.fetchVPNInfo;
            MfaCreateSessionRequest mfaCreateSessionRequest = new MfaCreateSessionRequest(this.$businessValue);
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
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                PasskeySyncStepperViewModel passkeySyncStepperViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("PasskeySyncStepperViewModel", "onGetStartedClicked: MFA session creation failed: " + thM7380exceptionOrNullimpl.getMessage());
                    passkeySyncStepperViewModel.EZpvd.setValue(C56443yFo.KWHzl(false));
                    MutableSharedFlow mutableSharedFlow = passkeySyncStepperViewModel.valueOf;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Failed to create session. Please try again.";
                    }
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        obj2 = objOLrzqt;
        PasskeySyncStepperViewModel passkeySyncStepperViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            String sessionId = ((MfaCreateSessionResponse) obj2).getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            pUU.KWHzl("PasskeySyncStepperViewModel", "onGetStartedClicked: MFA session created, sessionId=" + sessionId);
            passkeySyncStepperViewModel2.EZpvd.setValue(C56443yFo.KWHzl(false));
            MutableSharedFlow mutableSharedFlow2 = passkeySyncStepperViewModel2.AYXKKw;
            this.L$0 = obj2;
            this.label = 2;
            if (mutableSharedFlow2.emit(sessionId, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        PasskeySyncStepperViewModel passkeySyncStepperViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
