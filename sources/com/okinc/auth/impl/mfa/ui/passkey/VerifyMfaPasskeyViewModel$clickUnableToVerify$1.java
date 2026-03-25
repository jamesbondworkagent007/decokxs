package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaPasskeyViewModel$clickUnableToVerify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VerifyMfaPasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyViewModel$clickUnableToVerify$1(VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, Continuation<? super VerifyMfaPasskeyViewModel$clickUnableToVerify$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaPasskeyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyViewModel$clickUnableToVerify$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$clickUnableToVerify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8196ayF interfaceC8196ayF = this.this$0.getFieldNames;
            PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
            this.label = 1;
            obj = interfaceC8196ayF.copydefault(account, false, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MutableSharedFlow mutableSharedFlow = this.this$0.hDKMBd;
        Boolean boolKWHzl = C56443yFo.KWHzl(zBooleanValue);
        this.label = 2;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
