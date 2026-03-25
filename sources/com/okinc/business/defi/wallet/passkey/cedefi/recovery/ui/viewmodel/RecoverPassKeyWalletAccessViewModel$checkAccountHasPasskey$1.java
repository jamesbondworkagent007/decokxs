package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel;

import com.okinc.auth.api.passkey.PasskeyCanLinkExistingToCedefiWalletState;
import kotlin.NoWhenBranchMatchedException;
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
public final class RecoverPassKeyWalletAccessViewModel$checkAccountHasPasskey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecoverPassKeyWalletAccessViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletAccessViewModel$checkAccountHasPasskey$1(RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel, Continuation<? super RecoverPassKeyWalletAccessViewModel$checkAccountHasPasskey$1> continuation) {
        super(2, continuation);
        this.this$0 = recoverPassKeyWalletAccessViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletAccessViewModel$checkAccountHasPasskey$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletAccessViewModel$checkAccountHasPasskey$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
            this.label = 1;
            obj = interfaceC8196ayF.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        PasskeyCanLinkExistingToCedefiWalletState passkeyCanLinkExistingToCedefiWalletState = (PasskeyCanLinkExistingToCedefiWalletState) obj;
        if (passkeyCanLinkExistingToCedefiWalletState instanceof PasskeyCanLinkExistingToCedefiWalletState.Success) {
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(C56443yFo.KWHzl(((PasskeyCanLinkExistingToCedefiWalletState.Success) passkeyCanLinkExistingToCedefiWalletState).EZpvd()));
            this.label = 2;
            if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (passkeyCanLinkExistingToCedefiWalletState instanceof PasskeyCanLinkExistingToCedefiWalletState.Failure) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
            InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(new Throwable(((PasskeyCanLinkExistingToCedefiWalletState.Failure) passkeyCanLinkExistingToCedefiWalletState).OLrzqt()), null, 2, null);
            this.label = 3;
            if (mutableSharedFlow2.emit(application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
