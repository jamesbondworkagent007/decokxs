package com.okinc.okimcore.feature.cache.contact;

import com.okinc.okimcore.model.room.ContactEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sFP;

/* JADX INFO: loaded from: classes10.dex */
public final class ContactCacheImpl$getContact$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ContactEntity>, Object> {
    final /* synthetic */ String $contactId;
    int label;
    final /* synthetic */ sFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactCacheImpl$getContact$1(sFP sfp, String str, Continuation<? super ContactCacheImpl$getContact$1> continuation) {
        super(2, continuation);
        this.this$0 = sfp;
        this.$contactId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactCacheImpl$getContact$1(this.this$0, this.$contactId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContactEntity> continuation) {
        return ((ContactCacheImpl$getContact$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sFP sfp = this.this$0;
            String str = this.$contactId;
            this.label = 1;
            obj = sfp.KWHzl(str, this);
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
