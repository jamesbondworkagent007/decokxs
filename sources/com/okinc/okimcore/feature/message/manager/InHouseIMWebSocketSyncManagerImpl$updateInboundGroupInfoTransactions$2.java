package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C44302sKu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Unit>>, Object> {
    final /* synthetic */ List<WSSendMessageDetailData> $messageList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2(List<WSSendMessageDetailData> list, C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2> continuation) {
        super(2, continuation);
        this.$messageList = list;
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2 inHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2 = new InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2(this.$messageList, this.this$0, continuation);
        inHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Unit>> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<WSSendMessageDetailData> list = this.$messageList;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                String channelId = ((WSSendMessageDetailData) it.next()).getChannelId();
                if (channelId != null && channelId.length() > 0) {
                    str = channelId;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
            InHouseIMGroupInfoDao inHouseIMGroupInfoDaoValues = this.this$0.values();
            C44302sKu c44302sKu = this.this$0;
            Set set = setOqFWZa;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, c44302sKu.getFieldNames(), null, new InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2$1$tasks$1$1(inHouseIMGroupInfoDaoValues, c44302sKu, (String) it2.next(), null), 2, null));
            }
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (List) obj;
    }
}
