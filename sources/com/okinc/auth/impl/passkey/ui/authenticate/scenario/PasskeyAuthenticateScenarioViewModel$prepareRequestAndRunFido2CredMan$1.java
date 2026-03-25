package com.okinc.auth.impl.passkey.ui.authenticate.scenario;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C5941aFv;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyAuthenticateScenarioViewModel$prepareRequestAndRunFido2CredMan$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enableExternal;
    final /* synthetic */ PasskeyAuthenticateRequest $request;
    int label;
    final /* synthetic */ PasskeyAuthenticateScenarioViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateScenarioViewModel$prepareRequestAndRunFido2CredMan$1(PasskeyAuthenticateScenarioViewModel passkeyAuthenticateScenarioViewModel, PasskeyAuthenticateRequest passkeyAuthenticateRequest, boolean z, Continuation<? super PasskeyAuthenticateScenarioViewModel$prepareRequestAndRunFido2CredMan$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyAuthenticateScenarioViewModel;
        this.$request = passkeyAuthenticateRequest;
        this.$enableExternal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateScenarioViewModel$prepareRequestAndRunFido2CredMan$1(this.this$0, this.$request, this.$enableExternal, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateScenarioViewModel$prepareRequestAndRunFido2CredMan$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PendingIntent pendingIntent;
        MutableSharedFlow mutableSharedFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("PasskeyAuthenticateScenarioViewModel", "prepareRequestAndRunFido2CredMan: " + e.getMessage());
            MutableSharedFlow mutableSharedFlow2 = this.this$0.djBIcL;
            PasskeyAuthenticateState.Failure failure = PasskeyAuthenticateState.Failure.OLrzqt;
            this.label = 5;
            if (mutableSharedFlow2.emit(failure, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5941aFv c5941aFv = this.this$0.AhwBna;
            this.label = 1;
            obj = c5941aFv.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                } else if (i == 3) {
                    C56391yDq.AEQbTJ(obj);
                    pendingIntent = (PendingIntent) obj;
                    mutableSharedFlow = this.this$0.copydefault;
                    Intrinsics.copydefault(pendingIntent);
                    this.label = 4;
                    if (mutableSharedFlow.emit(pendingIntent, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            String strOLrzqt = C6617aSi.OLrzqt(this.$request, this.$enableExternal);
            MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
            this.label = 2;
            if (mutableSharedFlow3.emit(strOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        Task<PendingIntent> signPendingIntent = this.this$0.AYXKKw.getSignPendingIntent(C6617aSi.EZpvd(this.$request, this.$enableExternal));
        Intrinsics.checkNotNullExpressionValue(signPendingIntent, "");
        this.label = 3;
        obj = C6617aSi.EZpvd(signPendingIntent, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        pendingIntent = (PendingIntent) obj;
        mutableSharedFlow = this.this$0.copydefault;
        Intrinsics.copydefault(pendingIntent);
        this.label = 4;
        if (mutableSharedFlow.emit(pendingIntent, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
