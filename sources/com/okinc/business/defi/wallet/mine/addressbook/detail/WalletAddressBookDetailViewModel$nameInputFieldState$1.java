package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$nameInputFieldState$1 extends SuspendLambda implements Function2<String, Continuation<? super WalletAddressBookDetailViewModel.NameInputFieldState>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WalletAddressBookDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailViewModel$nameInputFieldState$1(WalletAddressBookDetailViewModel walletAddressBookDetailViewModel, Continuation<? super WalletAddressBookDetailViewModel$nameInputFieldState$1> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBookDetailViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletAddressBookDetailViewModel$nameInputFieldState$1 walletAddressBookDetailViewModel$nameInputFieldState$1 = new WalletAddressBookDetailViewModel$nameInputFieldState$1(this.this$0, continuation);
        walletAddressBookDetailViewModel$nameInputFieldState$1.L$0 = obj;
        return walletAddressBookDetailViewModel$nameInputFieldState$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super WalletAddressBookDetailViewModel.NameInputFieldState> continuation) {
        return ((WalletAddressBookDetailViewModel$nameInputFieldState$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return this.this$0.EZpvd((String) this.L$0);
    }
}
