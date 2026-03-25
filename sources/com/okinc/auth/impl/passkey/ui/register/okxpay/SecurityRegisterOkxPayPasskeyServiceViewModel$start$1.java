package com.okinc.auth.impl.passkey.ui.register.okxpay;

import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityRegisterOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceViewModel$start$1(SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel, Continuation<? super SecurityRegisterOkxPayPasskeyServiceViewModel$start$1> continuation) {
        super(2, continuation);
        this.this$0 = securityRegisterOkxPayPasskeyServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityRegisterOkxPayPasskeyServiceViewModel$start$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceViewModel$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeyState passkeyState;
        MutableSharedFlow mutableSharedFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    passkeyState = (PasskeyState) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = this.this$0.AEQbTJ;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(passkeyState, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                passkeyState = (PasskeyState) obj;
                if ((passkeyState instanceof PasskeyState.Success) && !Intrinsics.EZpvd(passkeyState, PasskeyState.AccountHasNoPasskey.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = passkeyState;
                    this.label = 3;
                    if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow = this.this$0.AEQbTJ;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(passkeyState, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                this.this$0.valueOf();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel = this.this$0;
        this.label = 2;
        obj = securityRegisterOkxPayPasskeyServiceViewModel.EZpvd(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        passkeyState = (PasskeyState) obj;
        if (passkeyState instanceof PasskeyState.Success) {
        }
        this.this$0.valueOf();
        return Unit.INSTANCE;
    }
}
