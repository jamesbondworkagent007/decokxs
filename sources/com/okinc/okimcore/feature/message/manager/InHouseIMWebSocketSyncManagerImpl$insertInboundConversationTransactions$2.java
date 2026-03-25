package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isNotifyUI;
    final /* synthetic */ List<WSSendMessageDetailData> $messageList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2(List<WSSendMessageDetailData> list, C44302sKu c44302sKu, boolean z, Continuation<? super InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2> continuation) {
        super(2, continuation);
        this.$messageList = list;
        this.this$0 = c44302sKu;
        this.$isNotifyUI = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2 inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2 = new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2(this.$messageList, this.this$0, this.$isNotifyUI, continuation);
        inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set<String> set;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<WSSendMessageDetailData> list = this.$messageList;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String channelId = ((WSSendMessageDetailData) it.next()).getChannelId();
                if (channelId == null || channelId.length() <= 0) {
                    channelId = null;
                }
                if (channelId != null) {
                    arrayList.add(channelId);
                }
            }
            Set<String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
            if (!setOqFWZa.isEmpty()) {
                Set<String> set2 = setOqFWZa;
                List<WSSendMessageDetailData> list2 = this.$messageList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(set2, 10)), 16));
                for (Object obj2 : set2) {
                    String str = (String) obj2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (Intrinsics.EZpvd((Object) ((WSSendMessageDetailData) obj3).getChannelId(), (Object) str)) {
                            arrayList2.add(obj3);
                        }
                    }
                    linkedHashMap.put(obj2, arrayList2);
                }
                C44302sKu c44302sKu = this.this$0;
                boolean z = this.$isNotifyUI;
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList3.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, c44302sKu.getFieldNames(), null, new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2$tasks$1$1(c44302sKu, (String) entry.getKey(), (List) entry.getValue(), z, null), 2, null));
                }
                this.L$0 = setOqFWZa;
                this.label = 1;
                if (AwaitKt.awaitAll(arrayList3, this) == objCopydefault) {
                    return objCopydefault;
                }
                set = setOqFWZa;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogSync$default("insert incoming message => asked workers to insert inbound messages in parallel", null, null, 6, null);
            return Unit.INSTANCE;
        }
        set = (Set) this.L$0;
        C56391yDq.AEQbTJ(obj);
        C44302sKu c44302sKu2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (c44302sKu2.EZpvd(set, this) == objCopydefault) {
            return objCopydefault;
        }
        C44124sEe.imLogSync$default("insert incoming message => asked workers to insert inbound messages in parallel", null, null, 6, null);
        return Unit.INSTANCE;
    }
}
