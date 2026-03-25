package com.okinc.components.track.common.whitelist;

import com.okinc.components.track.common.whitelist.RemoteInterceptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.serialization.json.Json;
import o.C32895mmH;
import o.C33056mpJ;
import o.C56391yDq;
import o.C56442yFn;
import o.yFI;

/* JADX INFO: loaded from: classes7.dex */
public final class RemoteInterceptor$addWaitForReport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RemoteInterceptor.ReportCache $reportCache;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteInterceptor this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteInterceptor$addWaitForReport$1(RemoteInterceptor remoteInterceptor, RemoteInterceptor.ReportCache reportCache, Continuation<? super RemoteInterceptor$addWaitForReport$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteInterceptor;
        this.$reportCache = reportCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteInterceptor$addWaitForReport$1(this.this$0, this.$reportCache, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoteInterceptor$addWaitForReport$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RemoteInterceptor remoteInterceptor;
        Mutex mutex;
        RemoteInterceptor.ReportCache reportCache;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.this$0.AEQbTJ;
            remoteInterceptor = this.this$0;
            RemoteInterceptor.ReportCache reportCache2 = this.$reportCache;
            this.L$0 = mutex2;
            this.L$1 = remoteInterceptor;
            this.L$2 = reportCache2;
            this.label = 1;
            if (mutex2.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            reportCache = reportCache2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reportCache = (RemoteInterceptor.ReportCache) this.L$2;
            remoteInterceptor = (RemoteInterceptor) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            if (C33056mpJ.AEQbTJ(remoteInterceptor.gEmmrt)) {
                Json jsonAEQbTJ = C32895mmH.Companion.AEQbTJ();
                jsonAEQbTJ.getSerializersModule();
                String strEncodeToString = jsonAEQbTJ.encodeToString(RemoteInterceptor.ReportCache.Companion.serializer(), reportCache);
                yFI.appendText$default(remoteInterceptor.gEmmrt, reportCache.EZpvd() + "\n" + strEncodeToString + "\n", null, 2, null);
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
