package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C44124sEe;
import o.C44302sKu;
import o.C44489sRs;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<InHouseIMServerConversationEntity> $batch;
    final /* synthetic */ List<InHouseIMConversationSimpleInfoEntity> $conversationIdBatch;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1(List<InHouseIMServerConversationEntity> list, C44302sKu c44302sKu, List<InHouseIMConversationSimpleInfoEntity> list2, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1> continuation) {
        super(2, continuation);
        this.$batch = list;
        this.this$0 = c44302sKu;
        this.$conversationIdBatch = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1(this.$batch, this.this$0, this.$conversationIdBatch, continuation);
        inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x010c -> B:23:0x0117). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        C44302sKu c44302sKu;
        List<InHouseIMConversationSimpleInfoEntity> list;
        Collection arrayList;
        Iterator it;
        List<InHouseIMConversationSimpleInfoEntity> list2;
        Collection collection;
        CoroutineScope coroutineScope2;
        C44302sKu c44302sKu2;
        String str;
        Iterator it2;
        InHouseIMServerConversationEntity inHouseIMServerConversationEntity;
        Collection collection2;
        long j;
        long jCurrentTimeMillis;
        char c;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            List<InHouseIMServerConversationEntity> list3 = this.$batch;
            c44302sKu = this.this$0;
            list = this.$conversationIdBatch;
            arrayList = new ArrayList(C56403yEb.AYXKKw(list3, 10));
            it = list3.iterator();
            if (it.hasNext()) {
            }
        } else if (i == 1) {
            j = this.J$0;
            collection2 = (Collection) this.L$7;
            String str2 = (String) this.L$6;
            inHouseIMServerConversationEntity = (InHouseIMServerConversationEntity) this.L$5;
            it2 = (Iterator) this.L$4;
            Collection collection3 = (Collection) this.L$3;
            List<InHouseIMConversationSimpleInfoEntity> list4 = (List) this.L$2;
            c44302sKu2 = (C44302sKu) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            collection = collection3;
            list2 = list4;
            str = str2;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            jCurrentTimeMillis = System.currentTimeMillis();
            C44489sRs c44489sRsHDKMBd = c44302sKu2.hDKMBd();
            this.L$0 = coroutineScope2;
            this.L$1 = c44302sKu2;
            this.L$2 = list2;
            this.L$3 = collection;
            this.L$4 = it2;
            this.L$5 = inHouseIMServerConversationEntity;
            this.L$6 = str;
            this.L$7 = collection2;
            this.J$0 = jCurrentTimeMillis2;
            this.J$1 = jCurrentTimeMillis;
            c = 2;
            this.label = 2;
            objEZpvd = c44489sRsHDKMBd.EZpvd(str, this);
            if (objEZpvd != objCopydefault) {
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            long j2 = this.J$1;
            long j3 = this.J$0;
            Collection collection4 = (Collection) this.L$7;
            String str3 = (String) this.L$6;
            InHouseIMServerConversationEntity inHouseIMServerConversationEntity2 = (InHouseIMServerConversationEntity) this.L$5;
            Iterator it3 = (Iterator) this.L$4;
            Collection collection5 = (Collection) this.L$3;
            list2 = (List) this.L$2;
            C44302sKu c44302sKu3 = (C44302sKu) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            String str4 = str3;
            InHouseIMServerConversationEntity inHouseIMServerConversationEntity3 = inHouseIMServerConversationEntity2;
            c44302sKu2 = c44302sKu3;
            it = it3;
            objEZpvd = obj;
            arrayList = collection5;
            long j4 = j3;
            c = 2;
            jCurrentTimeMillis = j2;
            collection2 = collection4;
            coroutineScope = coroutineScope3;
            Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(C33129mqd.valueOf(objEZpvd)), C56443yFo.KWHzl(System.currentTimeMillis() - jCurrentTimeMillis));
            long jLongValue = ((Number) pairOLrzqt.component1()).longValue();
            long jLongValue2 = ((Number) pairOLrzqt.component2()).longValue();
            C44124sEe.logSyncAnalysis$default("sync conversations => timeCostWaitWebSocketConnected:" + j4 + " timeCostRetrieveRemoteSeq:" + jLongValue2, null, null, 6, null);
            collection2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, c44302sKu2.getFieldNames(), null, new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2(c44302sKu2, str4, jLongValue, j4, jLongValue2, list2, inHouseIMServerConversationEntity3, null), 2, null));
            c44302sKu = c44302sKu2;
            list = list2;
            i2 = 1;
            if (it.hasNext()) {
                InHouseIMServerConversationEntity inHouseIMServerConversationEntity4 = (InHouseIMServerConversationEntity) it.next();
                String channelId = inHouseIMServerConversationEntity4.getChannelId();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                C44489sRs c44489sRsHDKMBd2 = c44302sKu.hDKMBd();
                this.L$0 = coroutineScope;
                this.L$1 = c44302sKu;
                this.L$2 = list;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = inHouseIMServerConversationEntity4;
                this.L$6 = channelId;
                this.L$7 = arrayList;
                this.J$0 = jCurrentTimeMillis3;
                this.label = i2;
                if (c44489sRsHDKMBd2.KWHzl(channelId, "sync", this) == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope2 = coroutineScope;
                list2 = list;
                collection = arrayList;
                inHouseIMServerConversationEntity = inHouseIMServerConversationEntity4;
                it2 = it;
                j = jCurrentTimeMillis3;
                c44302sKu2 = c44302sKu;
                collection2 = collection;
                str = channelId;
                long jCurrentTimeMillis22 = System.currentTimeMillis() - j;
                jCurrentTimeMillis = System.currentTimeMillis();
                C44489sRs c44489sRsHDKMBd3 = c44302sKu2.hDKMBd();
                this.L$0 = coroutineScope2;
                this.L$1 = c44302sKu2;
                this.L$2 = list2;
                this.L$3 = collection;
                this.L$4 = it2;
                this.L$5 = inHouseIMServerConversationEntity;
                this.L$6 = str;
                this.L$7 = collection2;
                this.J$0 = jCurrentTimeMillis22;
                this.J$1 = jCurrentTimeMillis;
                c = 2;
                this.label = 2;
                objEZpvd = c44489sRsHDKMBd3.EZpvd(str, this);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                inHouseIMServerConversationEntity3 = inHouseIMServerConversationEntity;
                str4 = str;
                arrayList = collection;
                it = it2;
                coroutineScope = coroutineScope2;
                j4 = jCurrentTimeMillis22;
                Pair pairOLrzqt2 = C56390yDp.OLrzqt(C56443yFo.KWHzl(C33129mqd.valueOf(objEZpvd)), C56443yFo.KWHzl(System.currentTimeMillis() - jCurrentTimeMillis));
                long jLongValue3 = ((Number) pairOLrzqt2.component1()).longValue();
                long jLongValue22 = ((Number) pairOLrzqt2.component2()).longValue();
                C44124sEe.logSyncAnalysis$default("sync conversations => timeCostWaitWebSocketConnected:" + j4 + " timeCostRetrieveRemoteSeq:" + jLongValue22, null, null, 6, null);
                collection2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, c44302sKu2.getFieldNames(), null, new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2(c44302sKu2, str4, jLongValue3, j4, jLongValue22, list2, inHouseIMServerConversationEntity3, null), 2, null));
                c44302sKu = c44302sKu2;
                list = list2;
                i2 = 1;
                if (it.hasNext()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 3;
                    if (AwaitKt.awaitAll((List) arrayList, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
