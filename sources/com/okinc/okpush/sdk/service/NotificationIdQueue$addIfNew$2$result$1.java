package com.okinc.okpush.sdk.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C46923tgN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes24.dex */
public final class NotificationIdQueue$addIfNew$2$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $notificationId;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationIdQueue$addIfNew$2$result$1(String str, Continuation<? super NotificationIdQueue$addIfNew$2$result$1> continuation) {
        super(2, continuation);
        this.$notificationId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationIdQueue$addIfNew$2$result$1(this.$notificationId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((NotificationIdQueue$addIfNew$2$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = C46923tgN.EZpvd;
            String str2 = this.$notificationId;
            this.L$0 = mutex;
            this.L$1 = str2;
            this.label = 1;
            if (mutex.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            C46923tgN c46923tgN = C46923tgN.KWHzl;
            c46923tgN.KWHzl();
            if (C46923tgN.djBIcL.contains(str)) {
                z = false;
            } else {
                C46923tgN.djBIcL.add(str);
                C46923tgN.gEmmrt.addLast(str);
                if (C46923tgN.gEmmrt.size() > 3000) {
                    C46923tgN.djBIcL.remove((String) C46923tgN.gEmmrt.removeFirst());
                }
                c46923tgN.copydefault();
            }
            return C56443yFo.KWHzl(z);
        } finally {
            mutex.unlock(null);
        }
    }
}
