package com.okinc.business.defi.wallet.mine.addressbook.detail.manager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C18733fnv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Boolean, ? extends Unit>>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ C18733fnv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2(C18733fnv c18733fnv, String str, Continuation<? super AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c18733fnv;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Boolean, ? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<Boolean, Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<Boolean, Unit>> continuation) {
        return ((AddressBookChainsFromAddressManagerImpl$invoke$2$apiCalls$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18733fnv c18733fnv = this.this$0;
            String str = this.$address;
            this.label = 1;
            obj = c18733fnv.AEQbTJ(str, (Continuation<? super AbstractC43419rot<Boolean, Unit>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
