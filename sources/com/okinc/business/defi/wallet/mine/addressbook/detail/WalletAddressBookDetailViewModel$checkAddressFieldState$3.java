package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$checkAddressFieldState$3 extends SuspendLambda implements yHO<FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAddressBookDetailViewModel$checkAddressFieldState$3(Continuation<? super WalletAddressBookDetailViewModel$checkAddressFieldState$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        WalletAddressBookDetailViewModel$checkAddressFieldState$3 walletAddressBookDetailViewModel$checkAddressFieldState$3 = new WalletAddressBookDetailViewModel$checkAddressFieldState$3(continuation);
        walletAddressBookDetailViewModel$checkAddressFieldState$3.L$0 = flowCollector;
        walletAddressBookDetailViewModel$checkAddressFieldState$3.L$1 = th;
        return walletAddressBookDetailViewModel$checkAddressFieldState$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            WalletAddressBookDetailViewModel.AddressInputFieldState.TaskDescription taskDescription = new WalletAddressBookDetailViewModel.AddressInputFieldState.TaskDescription(((Throwable) this.L$1).getMessage());
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
