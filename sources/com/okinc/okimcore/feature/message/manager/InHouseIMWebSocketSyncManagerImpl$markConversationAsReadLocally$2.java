package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.remote.MaxSeqData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C44124sEe;
import o.C44302sKu;
import o.C44486sRp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.sGI;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    long J$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2(C44302sKu c44302sKu, String str, Continuation<? super InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2(this.this$0, this.$channelId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        long jLongValue;
        C44486sRp c44486sRpAkhnZx;
        String str;
        long j;
        sGI sgi;
        List<MaxSeqData> listEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44486sRp c44486sRpAkhnZx2 = this.this$0.AkhnZx();
            String str2 = this.$channelId;
            this.label = 1;
            obj = c44486sRpAkhnZx2.valueOf(str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        C44124sEe.imLogSync$default("markConversationAsReadLocally => clear local data success", null, null, 6, null);
                        return Unit.INSTANCE;
                    }
                    j = this.J$0;
                    C56391yDq.AEQbTJ(obj);
                    sgi = this.this$0.djBIcL;
                    listEZpvd = C56402yEa.EZpvd(new MaxSeqData(this.$channelId, C33129mqd.gEmmrt(C56443yFo.KWHzl(j))));
                    this.label = 4;
                    if (sgi.OLrzqt(listEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C44124sEe.imLogSync$default("markConversationAsReadLocally => clear local data success", null, null, 6, null);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                jLongValue = ((Number) obj).longValue();
                C44124sEe.imLogSync$default("markConversationAsReadLocally => maxSeq:" + jLongValue, null, null, 6, null);
                c44486sRpAkhnZx = this.this$0.AkhnZx();
                str = this.$channelId;
                this.J$0 = jLongValue;
                this.label = 3;
                if (c44486sRpAkhnZx.AYXKKw(str, jLongValue, this) != objCopydefault) {
                    return objCopydefault;
                }
                j = jLongValue;
                sgi = this.this$0.djBIcL;
                listEZpvd = C56402yEa.EZpvd(new MaxSeqData(this.$channelId, C33129mqd.gEmmrt(C56443yFo.KWHzl(j))));
                this.label = 4;
                if (sgi.OLrzqt(listEZpvd, this) == objCopydefault) {
                }
                C44124sEe.imLogSync$default("markConversationAsReadLocally => clear local data success", null, null, 6, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Number) obj).intValue() > 0) {
            C44486sRp c44486sRpAkhnZx3 = this.this$0.AkhnZx();
            String str3 = this.$channelId;
            this.label = 2;
            obj = c44486sRpAkhnZx3.AEQbTJ(str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            jLongValue = ((Number) obj).longValue();
            C44124sEe.imLogSync$default("markConversationAsReadLocally => maxSeq:" + jLongValue, null, null, 6, null);
            c44486sRpAkhnZx = this.this$0.AkhnZx();
            str = this.$channelId;
            this.J$0 = jLongValue;
            this.label = 3;
            if (c44486sRpAkhnZx.AYXKKw(str, jLongValue, this) != objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }
}
