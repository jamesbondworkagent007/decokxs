package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC11252cHi;
import o.InterfaceC18734fnw;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$handleExistingAddressBook$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends AddressChainUiData>, ? extends Unit>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onApiCallLoading;
    Object L$0;
    int label;
    final /* synthetic */ WalletAddressBookDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletAddressBookDetailViewModel$handleExistingAddressBook$2(WalletAddressBookDetailViewModel walletAddressBookDetailViewModel, String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super WalletAddressBookDetailViewModel$handleExistingAddressBook$2> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBookDetailViewModel;
        this.$address = str;
        this.$onApiCallLoading = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailViewModel$handleExistingAddressBook$2(this.this$0, this.$address, this.$onApiCallLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends AddressChainUiData>, ? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<AddressChainUiData>, Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<AddressChainUiData>, Unit>> continuation) {
        return ((WalletAddressBookDetailViewModel$handleExistingAddressBook$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        AddressBookEntity addressBookEntity;
        Object objAEQbTJ;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC11252cHi interfaceC11252cHi = this.this$0.AhwBna;
            String str = this.$address;
            this.label = 1;
            objCopydefault = interfaceC11252cHi.copydefault(str, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AddressBookEntity addressBookEntity2 = (AddressBookEntity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressBookEntity = addressBookEntity2;
                objAEQbTJ = obj;
                abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                if (!abstractC43419rot.OLrzqt()) {
                    return new AbstractC43419rot.ActionBar(Unit.INSTANCE);
                }
                Intrinsics.copydefault(abstractC43419rot, "");
                Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(addressBookEntity.getChainNames());
                Iterable<AddressChainUiData> iterable = (Iterable) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                for (AddressChainUiData addressChainUiData : iterable) {
                    arrayList.add(addressChainUiData.EZpvd((255 & 1) != 0 ? addressChainUiData.AEQbTJ : null, (255 & 2) != 0 ? addressChainUiData.EZpvd : 0L, (255 & 4) != 0 ? addressChainUiData.KWHzl : null, (255 & 8) != 0 ? addressChainUiData.gEmmrt : false, (255 & 16) != 0 ? addressChainUiData.AYXKKw : false, (255 & 32) != 0 ? addressChainUiData.OLrzqt : false, (255 & 64) != 0 ? addressChainUiData.copydefault : false, (255 & 128) != 0 ? addressChainUiData.AhwBna : setOqFWZa.contains(addressChainUiData.EZpvd())));
                }
                return new AbstractC43419rot.StateListAnimator(arrayList);
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        addressBookEntity = (AddressBookEntity) objCopydefault;
        if (addressBookEntity == null) {
            throw new IllegalStateException("no existing address book with address " + this.$address);
        }
        InterfaceC18734fnw interfaceC18734fnw = this.this$0.fetchVPNInfo;
        String str2 = this.$address;
        Function1<Continuation<? super Unit>, Object> function1 = this.$onApiCallLoading;
        this.L$0 = addressBookEntity;
        this.label = 2;
        objAEQbTJ = interfaceC18734fnw.AEQbTJ(str2, function1, 0L, this);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (!abstractC43419rot.OLrzqt()) {
        }
    }
}
