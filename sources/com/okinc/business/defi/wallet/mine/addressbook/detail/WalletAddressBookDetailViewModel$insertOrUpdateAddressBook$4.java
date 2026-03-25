package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.biz.net.bean.AABook;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC11252cHi;
import o.Point;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ AddressBookEntity $addressBookEntity;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletAddressBookDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4(AddressBookEntity addressBookEntity, WalletAddressBookDetailViewModel walletAddressBookDetailViewModel, String str, Continuation<? super WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4> continuation) {
        super(2, continuation);
        this.$addressBookEntity = addressBookEntity;
        this.this$0 = walletAddressBookDetailViewModel;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4(this.$addressBookEntity, this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        WalletAddressBookDetailViewModel walletAddressBookDetailViewModel;
        AddressBookEntity addressBookEntity;
        String str;
        WalletAddressBookDetailViewModel walletAddressBookDetailViewModel2;
        AddressBookEntity addressBookEntity2;
        InterfaceC11252cHi interfaceC11252cHi;
        WalletAddressBookDetailViewModel walletAddressBookDetailViewModel3;
        Throwable thM7380exceptionOrNullimpl;
        Object value;
        MutableStateFlow mutableStateFlow;
        Object value2;
        Unit unit;
        Boolean boolIsSmartContract;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = false;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletAddressBookDetailViewModel walletAddressBookDetailViewModel4 = this.this$0;
            String str2 = this.$address;
            Result.Application application3 = Result.Companion;
            CoroutineDispatcher coroutineDispatcher = walletAddressBookDetailViewModel4.values;
            WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4$isSmartContract$1$1 walletAddressBookDetailViewModel$insertOrUpdateAddressBook$4$isSmartContract$1$1 = new WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4$isSmartContract$1$1(walletAddressBookDetailViewModel4, str2, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, walletAddressBookDetailViewModel$insertOrUpdateAddressBook$4$isSmartContract$1$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    walletAddressBookDetailViewModel3 = (WalletAddressBookDetailViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableStateFlow = walletAddressBookDetailViewModel3.EZpvd;
                    do {
                        value2 = mutableStateFlow.getValue();
                        unit = Unit.INSTANCE;
                    } while (!mutableStateFlow.compareAndSet(value2, new Point.Application(unit)));
                    objM7377constructorimpl2 = Result.m7377constructorimpl(unit);
                    WalletAddressBookDetailViewModel walletAddressBookDetailViewModel5 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = walletAddressBookDetailViewModel5.EZpvd;
                        do {
                            value = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value, new Point.TaskDescription(thM7380exceptionOrNullimpl.getMessage())));
                    }
                    return Unit.INSTANCE;
                }
                addressBookEntity2 = (AddressBookEntity) this.L$1;
                walletAddressBookDetailViewModel2 = (WalletAddressBookDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C56443yFo.AEQbTJ(((Number) obj).intValue());
                addressBookEntity = addressBookEntity2;
                walletAddressBookDetailViewModel = walletAddressBookDetailViewModel2;
                interfaceC11252cHi = walletAddressBookDetailViewModel.AhwBna;
                this.L$0 = walletAddressBookDetailViewModel;
                this.L$1 = null;
                this.label = 3;
                if (interfaceC11252cHi.OLrzqt(addressBookEntity, this) != objCopydefault) {
                    return objCopydefault;
                }
                walletAddressBookDetailViewModel3 = walletAddressBookDetailViewModel;
                mutableStateFlow = walletAddressBookDetailViewModel3.EZpvd;
                do {
                    value2 = mutableStateFlow.getValue();
                    unit = Unit.INSTANCE;
                } while (!mutableStateFlow.compareAndSet(value2, new Point.Application(unit)));
                objM7377constructorimpl2 = Result.m7377constructorimpl(unit);
                WalletAddressBookDetailViewModel walletAddressBookDetailViewModel52 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AABook aABook = (AABook) ((ResponseData) obj).getData();
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl((aABook == null || (boolIsSmartContract = aABook.isSmartContract()) == null) ? false : boolIsSmartContract.booleanValue()));
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        if (((Boolean) objM7377constructorimpl).booleanValue()) {
            this.$addressBookEntity.setSmartContract();
        }
        walletAddressBookDetailViewModel = this.this$0;
        String str3 = this.$address;
        addressBookEntity = this.$addressBookEntity;
        Result.Application application4 = Result.Companion;
        String str4 = walletAddressBookDetailViewModel.isConnected;
        if (str4 != null && str4.length() != 0) {
            z = true;
        }
        if (((!Intrinsics.EZpvd((Object) walletAddressBookDetailViewModel.isConnected, (Object) str3)) & z) && (str = walletAddressBookDetailViewModel.isConnected) != null) {
            InterfaceC11252cHi interfaceC11252cHi2 = walletAddressBookDetailViewModel.AhwBna;
            this.L$0 = walletAddressBookDetailViewModel;
            this.L$1 = addressBookEntity;
            this.label = 2;
            Object objKWHzl = interfaceC11252cHi2.KWHzl(str, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            walletAddressBookDetailViewModel2 = walletAddressBookDetailViewModel;
            obj = objKWHzl;
            addressBookEntity2 = addressBookEntity;
            C56443yFo.AEQbTJ(((Number) obj).intValue());
            addressBookEntity = addressBookEntity2;
            walletAddressBookDetailViewModel = walletAddressBookDetailViewModel2;
        }
        interfaceC11252cHi = walletAddressBookDetailViewModel.AhwBna;
        this.L$0 = walletAddressBookDetailViewModel;
        this.L$1 = null;
        this.label = 3;
        if (interfaceC11252cHi.OLrzqt(addressBookEntity, this) != objCopydefault) {
        }
    }
}
