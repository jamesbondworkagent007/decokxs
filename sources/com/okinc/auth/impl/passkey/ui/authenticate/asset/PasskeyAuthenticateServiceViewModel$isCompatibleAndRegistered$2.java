package com.okinc.auth.impl.passkey.ui.authenticate.asset;

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
public final class PasskeyAuthenticateServiceViewModel$isCompatibleAndRegistered$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    int label;
    final /* synthetic */ PasskeyAuthenticateServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceViewModel$isCompatibleAndRegistered$2(PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModel, Continuation<? super PasskeyAuthenticateServiceViewModel$isCompatibleAndRegistered$2> continuation) {
        super(2, continuation);
        this.this$0 = passkeyAuthenticateServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateServiceViewModel$isCompatibleAndRegistered$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PasskeyAuthenticateServiceViewModel$isCompatibleAndRegistered$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.fJNWhG) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.gEmmrt;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return C56443yFo.KWHzl(true);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(z);
                }
                C56391yDq.AEQbTJ(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.Z$0 = zBooleanValue;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                    return objCopydefault;
                }
                z = zBooleanValue;
                return C56443yFo.KWHzl(z);
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC8196ayF interfaceC8196ayF = this.this$0.djBIcL;
        PasskeyScenario.Asset asset = new PasskeyScenario.Asset(false, 1, null);
        this.label = 2;
        obj = InterfaceC8196ayF.Activity.checkPasskeyCompatible$default(interfaceC8196ayF, asset, false, this, 2, null);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        mutableSharedFlow = this.this$0.gEmmrt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.Z$0 = zBooleanValue2;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
