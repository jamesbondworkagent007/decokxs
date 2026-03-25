package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC11252cHi;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$setupExistingAddressBook$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletAddressBookDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailViewModel$setupExistingAddressBook$1$1(WalletAddressBookDetailViewModel walletAddressBookDetailViewModel, String str, Continuation<? super WalletAddressBookDetailViewModel$setupExistingAddressBook$1$1> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBookDetailViewModel;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailViewModel$setupExistingAddressBook$1$1(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailViewModel$setupExistingAddressBook$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        WalletAddressBookDetailViewModel walletAddressBookDetailViewModel;
        String str;
        AddressBookEntity addressBookEntity;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                walletAddressBookDetailViewModel = this.this$0;
                String str2 = this.$address;
                Result.Application application = Result.Companion;
                InterfaceC11252cHi interfaceC11252cHi = walletAddressBookDetailViewModel.AhwBna;
                this.L$0 = walletAddressBookDetailViewModel;
                this.L$1 = str2;
                this.label = 1;
                Object objCopydefault2 = interfaceC11252cHi.copydefault(str2, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
                obj = objCopydefault2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                walletAddressBookDetailViewModel = (WalletAddressBookDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            addressBookEntity = (AddressBookEntity) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (addressBookEntity == null) {
            throw new IllegalStateException("no existing address book with address " + str);
        }
        walletAddressBookDetailViewModel.AEQbTJ(addressBookEntity.getName());
        walletAddressBookDetailViewModel.KWHzl(addressBookEntity.getAddress());
        MutableStateFlow mutableStateFlow = walletAddressBookDetailViewModel.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, addressBookEntity));
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
