package com.okinc.im.usecase.broadcastmessage;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC35761oCs;
import o.C35762oCt;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessagesUseCase$execute$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends AbstractC35761oCs>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $broadcastChannelId;
    final /* synthetic */ List<SendMessageRequestParam> $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C35762oCt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.im.config.serviceprovider.SendMessageRequestParam> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastMessagesUseCase$execute$1(List<? extends SendMessageRequestParam> list, C35762oCt c35762oCt, long j, Continuation<? super BroadcastMessagesUseCase$execute$1> continuation) {
        super(2, continuation);
        this.$params = list;
        this.this$0 = c35762oCt;
        this.$broadcastChannelId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagesUseCase$execute$1 broadcastMessagesUseCase$execute$1 = new BroadcastMessagesUseCase$execute$1(this.$params, this.this$0, this.$broadcastChannelId, continuation);
        broadcastMessagesUseCase$execute$1.L$0 = obj;
        return broadcastMessagesUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super List<? extends AbstractC35761oCs>> producerScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesUseCase$execute$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00df -> B:29:0x00e2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        ProducerScope producerScope2;
        Map map;
        C35762oCt c35762oCt;
        ProducerScope producerScope3;
        Iterator it;
        Collection collection;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope4 = (ProducerScope) this.L$0;
            BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1 broadcastMessagesUseCase$execute$1$pendingMessagesMap$1 = new BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1(this.$params, this.this$0, this.$broadcastChannelId, null);
            this.L$0 = producerScope4;
            this.label = 1;
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(broadcastMessagesUseCase$execute$1$pendingMessagesMap$1, this);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            producerScope = producerScope4;
            obj = objCoroutineScope;
        } else if (i == 1) {
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else if (i == 2) {
            map = (Map) this.L$1;
            producerScope2 = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c35762oCt = this.this$0;
            ArrayList arrayList = new ArrayList(map.size());
            producerScope3 = producerScope2;
            it = map.entrySet().iterator();
            collection = arrayList;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            collection = (Collection) this.L$4;
            it = (Iterator) this.L$3;
            Collection collection2 = (Collection) this.L$2;
            C35762oCt c35762oCt2 = (C35762oCt) this.L$1;
            ProducerScope producerScope5 = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            producerScope3 = producerScope5;
            collection.add((Deferred) obj);
            collection = collection2;
            c35762oCt = c35762oCt2;
            if (!it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C35762oCt c35762oCt3 = c35762oCt;
                BroadcastMessagesUseCase$execute$1$sentResults$1$1 broadcastMessagesUseCase$execute$1$sentResults$1$1 = new BroadcastMessagesUseCase$execute$1$sentResults$1$1(c35762oCt3, ((AbstractC35761oCs.TaskDescription) entry.getValue()).OLrzqt(), (SendMessageRequestParam) entry.getKey(), producerScope3, null);
                this.L$0 = producerScope3;
                this.L$1 = c35762oCt;
                this.L$2 = collection;
                this.L$3 = it;
                this.L$4 = collection;
                this.label = 3;
                Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(broadcastMessagesUseCase$execute$1$sentResults$1$1, this);
                if (objCoroutineScope2 == objCopydefault) {
                    return objCopydefault;
                }
                c35762oCt2 = c35762oCt;
                obj = objCoroutineScope2;
                collection2 = collection;
                collection.add((Deferred) obj);
                collection = collection2;
                c35762oCt = c35762oCt2;
                if (!it.hasNext()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    if (AwaitKt.awaitAll((List) collection, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        Map mapCopydefault = C56424yEw.copydefault((Iterable) obj);
        List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(mapCopydefault.values());
        this.L$0 = producerScope;
        this.L$1 = mapCopydefault;
        this.label = 2;
        if (producerScope.send(listAxsJAYsNCnLh, this) == objCopydefault) {
            return objCopydefault;
        }
        producerScope2 = producerScope;
        map = mapCopydefault;
        c35762oCt = this.this$0;
        ArrayList arrayList2 = new ArrayList(map.size());
        producerScope3 = producerScope2;
        it = map.entrySet().iterator();
        collection = arrayList2;
        if (!it.hasNext()) {
        }
    }
}
