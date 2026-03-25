package com.okinc.components.track.common.whitelist;

import com.okinc.components.track.common.whitelist.RemoteInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.serialization.json.Json;
import o.C32895mmH;
import o.C56391yDq;
import o.C56442yFn;
import o.yFI;

/* JADX INFO: loaded from: classes7.dex */
public final class RemoteInterceptor$reportCachedEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RemoteInterceptor this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteInterceptor$reportCachedEvents$1(RemoteInterceptor remoteInterceptor, Continuation<? super RemoteInterceptor$reportCachedEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteInterceptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteInterceptor$reportCachedEvents$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoteInterceptor$reportCachedEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        RemoteInterceptor remoteInterceptor;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = this.this$0.AEQbTJ;
            RemoteInterceptor remoteInterceptor2 = this.this$0;
            this.L$0 = mutex;
            this.L$1 = remoteInterceptor2;
            this.label = 1;
            if (mutex.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            remoteInterceptor = remoteInterceptor2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteInterceptor = (RemoteInterceptor) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            if (!remoteInterceptor.gEmmrt.exists()) {
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            List lines$default = yFI.readLines$default(remoteInterceptor.gEmmrt, null, 1, null);
            for (int i2 = 0; i2 < lines$default.size() && (str = (String) CollectionsKt___CollectionsKt.AkhnZx(lines$default, i2 + 1)) != null; i2 += 2) {
                if (remoteInterceptor.djBIcL.containsKey(lines$default.get(i2))) {
                    try {
                        Json jsonAEQbTJ = C32895mmH.Companion.AEQbTJ();
                        jsonAEQbTJ.getSerializersModule();
                        arrayList.add((RemoteInterceptor.ReportCache) jsonAEQbTJ.decodeFromString(RemoteInterceptor.ReportCache.Companion.serializer(), str));
                    } catch (Exception unused) {
                    }
                }
            }
            remoteInterceptor.gEmmrt.delete();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                remoteInterceptor.EZpvd((RemoteInterceptor.ReportCache) it.next());
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
