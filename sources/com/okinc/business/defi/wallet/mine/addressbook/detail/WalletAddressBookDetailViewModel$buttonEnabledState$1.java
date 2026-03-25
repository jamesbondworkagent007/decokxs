package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$buttonEnabledState$1 extends SuspendLambda implements yHT<WalletAddressBookDetailViewModel.NameInputFieldState, WalletAddressBookDetailViewModel.AddressInputFieldState, List<? extends AddressChainUiData>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAddressBookDetailViewModel$buttonEnabledState$1(Continuation<? super WalletAddressBookDetailViewModel$buttonEnabledState$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(WalletAddressBookDetailViewModel.NameInputFieldState nameInputFieldState, WalletAddressBookDetailViewModel.AddressInputFieldState addressInputFieldState, List<AddressChainUiData> list, Continuation<? super Boolean> continuation) {
        WalletAddressBookDetailViewModel$buttonEnabledState$1 walletAddressBookDetailViewModel$buttonEnabledState$1 = new WalletAddressBookDetailViewModel$buttonEnabledState$1(continuation);
        walletAddressBookDetailViewModel$buttonEnabledState$1.L$0 = nameInputFieldState;
        walletAddressBookDetailViewModel$buttonEnabledState$1.L$1 = addressInputFieldState;
        walletAddressBookDetailViewModel$buttonEnabledState$1.L$2 = list;
        return walletAddressBookDetailViewModel$buttonEnabledState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(WalletAddressBookDetailViewModel.NameInputFieldState nameInputFieldState, WalletAddressBookDetailViewModel.AddressInputFieldState addressInputFieldState, List<? extends AddressChainUiData> list, Continuation<? super Boolean> continuation) {
        return invoke2(nameInputFieldState, addressInputFieldState, (List<AddressChainUiData>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletAddressBookDetailViewModel.NameInputFieldState nameInputFieldState = (WalletAddressBookDetailViewModel.NameInputFieldState) this.L$0;
            WalletAddressBookDetailViewModel.AddressInputFieldState addressInputFieldState = (WalletAddressBookDetailViewModel.AddressInputFieldState) this.L$1;
            List list = (List) this.L$2;
            boolean zEZpvd = nameInputFieldState.EZpvd();
            boolean zKWHzl = addressInputFieldState.KWHzl();
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((AddressChainUiData) it.next()).AhwBna()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            return C56443yFo.KWHzl(zEZpvd & zKWHzl & z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
