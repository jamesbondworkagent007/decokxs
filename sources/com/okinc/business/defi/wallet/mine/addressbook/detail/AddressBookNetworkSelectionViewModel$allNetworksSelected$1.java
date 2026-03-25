package com.okinc.business.defi.wallet.mine.addressbook.detail;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookNetworkSelectionViewModel$allNetworksSelected$1 extends SuspendLambda implements Function2<Set<? extends Long>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressBookNetworkSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookNetworkSelectionViewModel$allNetworksSelected$1(AddressBookNetworkSelectionViewModel addressBookNetworkSelectionViewModel, Continuation<? super AddressBookNetworkSelectionViewModel$allNetworksSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = addressBookNetworkSelectionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddressBookNetworkSelectionViewModel$allNetworksSelected$1 addressBookNetworkSelectionViewModel$allNetworksSelected$1 = new AddressBookNetworkSelectionViewModel$allNetworksSelected$1(this.this$0, continuation);
        addressBookNetworkSelectionViewModel$allNetworksSelected$1.L$0 = obj;
        return addressBookNetworkSelectionViewModel$allNetworksSelected$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends Long> set, Continuation<? super Boolean> continuation) {
        return invoke2((Set<Long>) set, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<Long> set, Continuation<? super Boolean> continuation) {
        return ((AddressBookNetworkSelectionViewModel$allNetworksSelected$1) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(Intrinsics.EZpvd(this.this$0.valueOf, (Set) this.L$0) & (!this.this$0.valueOf.isEmpty()) & (!r4.isEmpty()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
