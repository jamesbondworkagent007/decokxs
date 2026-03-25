package com.okinc.buysell.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class AsyncHelperKt$executeApiTasks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends AbstractC43419rot<?, ? extends Exception>>>, Object> {
    final /* synthetic */ Map<String, Function1<Continuation<? super AbstractC43419rot<?, ? extends Exception>>, Object>> $tasks;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super o.rot<?, ? extends java.lang.Exception>>, ? extends java.lang.Object>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncHelperKt$executeApiTasks$2(Map<String, ? extends Function1<? super Continuation<? super AbstractC43419rot<?, ? extends Exception>>, ? extends Object>> map, Continuation<? super AsyncHelperKt$executeApiTasks$2> continuation) {
        super(2, continuation);
        this.$tasks = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsyncHelperKt$executeApiTasks$2 asyncHelperKt$executeApiTasks$2 = new AsyncHelperKt$executeApiTasks$2(this.$tasks, continuation);
        asyncHelperKt$executeApiTasks$2.L$0 = obj;
        return asyncHelperKt$executeApiTasks$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends AbstractC43419rot<?, ? extends Exception>>> continuation) {
        return ((AsyncHelperKt$executeApiTasks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00af -> B:19:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map linkedHashMap;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Map<String, Function1<Continuation<? super AbstractC43419rot<?, ? extends Exception>>, Object>> map = this.$tasks;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap2.put(entry.getKey(), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AsyncHelperKt$executeApiTasks$2$deferredTasks$1$1((Function1) entry.getValue(), null), 3, null));
            }
            linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap2.size()));
            it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object key = this.L$3;
            linkedHashMap = (Map) this.L$2;
            it = (Iterator) this.L$1;
            Map map2 = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            linkedHashMap.put(key, (AbstractC43419rot) obj);
            linkedHashMap = map2;
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                key = entry2.getKey();
                Deferred deferred = (Deferred) entry2.getValue();
                this.L$0 = linkedHashMap;
                this.L$1 = it;
                this.L$2 = linkedHashMap;
                this.L$3 = key;
                this.label = 1;
                obj = deferred.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                map2 = linkedHashMap;
                linkedHashMap.put(key, (AbstractC43419rot) obj);
                linkedHashMap = map2;
                if (it.hasNext()) {
                    return linkedHashMap;
                }
            }
        }
    }
}
