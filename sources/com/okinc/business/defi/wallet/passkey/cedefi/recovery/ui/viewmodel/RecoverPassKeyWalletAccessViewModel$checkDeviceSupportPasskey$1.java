package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel;

import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes5.dex */
public final class RecoverPassKeyWalletAccessViewModel$checkDeviceSupportPasskey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecoverPassKeyWalletAccessViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletAccessViewModel$checkDeviceSupportPasskey$1(RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel, Continuation<? super RecoverPassKeyWalletAccessViewModel$checkDeviceSupportPasskey$1> continuation) {
        super(2, continuation);
        this.this$0 = recoverPassKeyWalletAccessViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletAccessViewModel$checkDeviceSupportPasskey$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletAccessViewModel$checkDeviceSupportPasskey$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        InterfaceC49371unL.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.label = 1;
            if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault) {
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
                C56391yDq.AEQbTJ(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mutableSharedFlow = this.this$0.EZpvd;
                activity = new InterfaceC49371unL.Activity(C56443yFo.KWHzl(zBooleanValue));
                this.label = 3;
                if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
        PasskeyScenario.CedefiWallet cedefiWallet = new PasskeyScenario.CedefiWallet(null, false, 3, null);
        this.label = 2;
        obj = InterfaceC8196ayF.Activity.checkPasskeyCompatible$default(interfaceC8196ayF, cedefiWallet, false, this, 2, null);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        mutableSharedFlow = this.this$0.EZpvd;
        activity = new InterfaceC49371unL.Activity(C56443yFo.KWHzl(zBooleanValue2));
        this.label = 3;
        if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
