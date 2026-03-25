package com.okinc.business.web3pay.lib.features.contacts.data.datasource.contentresolver;

import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C31252lqX;
import o.C31313lrf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Collection<C31252lqX>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31313lrf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1(C31313lrf c31313lrf, Continuation<? super Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1> continuation) {
        super(2, continuation);
        this.this$0 = c31313lrf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1 web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1 = new Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1(this.this$0, continuation);
        web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1.L$0 = obj;
        return web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Collection<C31252lqX>> continuation) {
        return ((Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AEQbTJ((CoroutineScope) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
