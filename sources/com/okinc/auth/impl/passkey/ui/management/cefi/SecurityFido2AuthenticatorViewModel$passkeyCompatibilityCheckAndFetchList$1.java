package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
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
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$passkeyCompatibilityCheckAndFetchList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$passkeyCompatibilityCheckAndFetchList$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Continuation<? super SecurityFido2AuthenticatorViewModel$passkeyCompatibilityCheckAndFetchList$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$passkeyCompatibilityCheckAndFetchList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$passkeyCompatibilityCheckAndFetchList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objValueOf;
        MutableLiveData mutableLiveData2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.gEmmrt;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData2 = (MutableLiveData) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableLiveData2.setValue(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
                    pUU.KWHzl("SecurityFido2AuthenticatorViewModel", "passkeyCompatibilityCheckAndFetchList is register compatible: " + this.this$0.AYXKKw.getValue());
                    this.this$0.AubY();
                    return Unit.INSTANCE;
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveData.setValue(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
                pUU.KWHzl("SecurityFido2AuthenticatorViewModel", "passkeyCompatibilityCheckAndFetchList is authenticate compatible: " + this.this$0.AhwBna.getValue());
                MutableLiveData mutableLiveData3 = this.this$0.AYXKKw;
                InterfaceC8196ayF interfaceC8196ayF = this.this$0.fARcdN;
                this.L$0 = mutableLiveData3;
                this.label = 3;
                objValueOf = interfaceC8196ayF.valueOf(this);
                if (objValueOf != objCopydefault) {
                    return objCopydefault;
                }
                mutableLiveData2 = mutableLiveData3;
                obj = objValueOf;
                mutableLiveData2.setValue(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
                pUU.KWHzl("SecurityFido2AuthenticatorViewModel", "passkeyCompatibilityCheckAndFetchList is register compatible: " + this.this$0.AYXKKw.getValue());
                this.this$0.AubY();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        mutableLiveData = this.this$0.AhwBna;
        InterfaceC8196ayF interfaceC8196ayF2 = this.this$0.fARcdN;
        PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
        this.L$0 = mutableLiveData;
        this.label = 2;
        obj = interfaceC8196ayF2.copydefault(account, true, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        mutableLiveData.setValue(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        pUU.KWHzl("SecurityFido2AuthenticatorViewModel", "passkeyCompatibilityCheckAndFetchList is authenticate compatible: " + this.this$0.AhwBna.getValue());
        MutableLiveData mutableLiveData32 = this.this$0.AYXKKw;
        InterfaceC8196ayF interfaceC8196ayF3 = this.this$0.fARcdN;
        this.L$0 = mutableLiveData32;
        this.label = 3;
        objValueOf = interfaceC8196ayF3.valueOf(this);
        if (objValueOf != objCopydefault) {
        }
    }
}
