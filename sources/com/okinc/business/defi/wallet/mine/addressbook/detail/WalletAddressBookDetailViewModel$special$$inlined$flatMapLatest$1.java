package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ WalletAddressBookDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, WalletAddressBookDetailViewModel walletAddressBookDetailViewModel) {
        super(3, continuation);
        this.this$0 = walletAddressBookDetailViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState> flowCollector, String str, Continuation<? super Unit> continuation) {
        WalletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1 walletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1 = new WalletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        walletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        walletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return walletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            WalletAddressBookDetailViewModel walletAddressBookDetailViewModel = this.this$0;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = walletAddressBookDetailViewModel.OLrzqt(str, this);
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
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, (Flow) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
