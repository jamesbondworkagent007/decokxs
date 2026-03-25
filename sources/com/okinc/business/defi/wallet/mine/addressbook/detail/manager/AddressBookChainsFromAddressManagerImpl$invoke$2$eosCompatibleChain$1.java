package com.okinc.business.defi.wallet.mine.addressbook.detail.manager;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13847daM;
import o.C13853daS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C13853daS>>, Object> {
    final /* synthetic */ String $address;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1(String str, Continuation<? super AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1> continuation) {
        super(2, continuation);
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1(this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C13853daS>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C13853daS>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C13853daS>> continuation) {
        return ((AddressBookChainsFromAddressManagerImpl$invoke$2$eosCompatibleChain$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<C13853daS> listValueOf = C13847daM.Companion.valueOf(this.$address);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listValueOf) {
                if (((C13853daS) obj2).copydefault().OuxcSI()) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
