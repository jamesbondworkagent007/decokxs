package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.remote.MaxSeqData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C44486sRp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.sGI;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2(C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6 A[LOOP:0: B:29:0x00c0->B:31:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        List<MaxSeqData> list;
        List<MaxSeqData> list2;
        C44486sRp c44486sRpAkhnZx;
        ArrayList arrayList;
        Iterator it;
        sGI sgi;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogSync$default("markAllConversationsAsRead => start...", null, null, 6, null);
            sGI sgi2 = this.this$0.djBIcL;
            this.label = 1;
            obj = sgi2.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    list = (List) obj;
                    C44124sEe.imLogSync$default("markAllConversationsAsRead => maxSeqData:" + list, null, null, 6, null);
                    if (!list.isEmpty()) {
                        sGI sgi3 = this.this$0.djBIcL;
                        this.L$0 = list;
                        this.label = 3;
                        if (sgi3.KWHzl(this) == objCopydefault) {
                            return objCopydefault;
                        }
                        list2 = list;
                        c44486sRpAkhnZx = this.this$0.AkhnZx();
                        arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                        }
                        this.L$0 = list2;
                        this.label = 4;
                        if (c44486sRpAkhnZx.KWHzl(arrayList, this) == objCopydefault) {
                        }
                        sgi = this.this$0.djBIcL;
                        this.L$0 = null;
                        this.label = 5;
                        if (sgi.OLrzqt(list2, this) == objCopydefault) {
                        }
                        C44124sEe.imLogSync$default("markAllConversationsAsRead => clear local data success", null, null, 6, null);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        C44124sEe.imLogSync$default("markAllConversationsAsRead => clear local data success", null, null, 6, null);
                        return Unit.INSTANCE;
                    }
                    list2 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    sgi = this.this$0.djBIcL;
                    this.L$0 = null;
                    this.label = 5;
                    if (sgi.OLrzqt(list2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C44124sEe.imLogSync$default("markAllConversationsAsRead => clear local data success", null, null, 6, null);
                    return Unit.INSTANCE;
                }
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c44486sRpAkhnZx = this.this$0.AkhnZx();
                arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MaxSeqData) it.next()).getChannelId());
                }
                this.L$0 = list2;
                this.label = 4;
                if (c44486sRpAkhnZx.KWHzl(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
                sgi = this.this$0.djBIcL;
                this.L$0 = null;
                this.label = 5;
                if (sgi.OLrzqt(list2, this) == objCopydefault) {
                }
                C44124sEe.imLogSync$default("markAllConversationsAsRead => clear local data success", null, null, 6, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<String> list3 = (List) obj;
        C44124sEe.imLogSync$default("markAllConversationsAsRead => channelsWithUnreadCount:" + list3, null, null, 6, null);
        C44486sRp c44486sRpAkhnZx2 = this.this$0.AkhnZx();
        this.label = 2;
        obj = c44486sRpAkhnZx2.EZpvd(list3, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        list = (List) obj;
        C44124sEe.imLogSync$default("markAllConversationsAsRead => maxSeqData:" + list, null, null, 6, null);
        if (!list.isEmpty()) {
        }
        return Unit.INSTANCE;
    }
}
