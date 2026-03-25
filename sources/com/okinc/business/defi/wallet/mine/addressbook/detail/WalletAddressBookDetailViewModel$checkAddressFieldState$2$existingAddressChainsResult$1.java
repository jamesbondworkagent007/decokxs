package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector<WalletAddressBookDetailViewModel.AddressInputFieldState> $$this$flow;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.FlowCollector<? super com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel$AddressInputFieldState> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1(FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState> flowCollector, Continuation<? super WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1> continuation) {
        super(1, continuation);
        this.$$this$flow = flowCollector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1(this.$$this$flow, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector<WalletAddressBookDetailViewModel.AddressInputFieldState> flowCollector = this.$$this$flow;
            WalletAddressBookDetailViewModel.AddressInputFieldState.Application application = WalletAddressBookDetailViewModel.AddressInputFieldState.Application.AEQbTJ;
            this.label = 1;
            if (flowCollector.emit(application, this) == objCopydefault) {
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
