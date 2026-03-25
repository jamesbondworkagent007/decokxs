package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.inhouseim.ws.Reaction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSPushReaction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C44124sEe;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ WSPushReaction $result;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3(C44302sKu c44302sKu, String str, WSPushReaction wSPushReaction, Continuation<? super InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$key = str;
        this.$result = wSPushReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3(this.this$0, this.$key, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [786=4, 787=4] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unit unit;
        String str;
        StringBuilder sb;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                long j = this.this$0.AEQbTJ;
                this.label = 1;
                if (DelayKt.delay(j, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.AuCTel().remove(this.$key);
                    C44124sEe.imLogSync$default("WSPushReaction => finished processing for key: " + this.$key, null, null, 6, null);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (Intrinsics.EZpvd(this.this$0.fARcdN().get(this.$key), this.$result)) {
                C44124sEe.imLogSync$default("WSPushReaction => no new data received for key: " + this.$key + " during " + this.this$0.AEQbTJ + "ms, proceeding to handle", null, null, 6, null);
                WSPushReaction wSPushReactionRemove = this.this$0.fARcdN().remove(this.$key);
                if (wSPushReactionRemove != null) {
                    C44302sKu c44302sKu = this.this$0;
                    String strOLrzqt = wSPushReactionRemove.OLrzqt().OLrzqt();
                    long jEZpvd = wSPushReactionRemove.OLrzqt().EZpvd();
                    List<Reaction> listCopydefault = wSPushReactionRemove.OLrzqt().copydefault();
                    long jKWHzl = wSPushReactionRemove.OLrzqt().KWHzl();
                    this.label = 2;
                    if (c44302sKu.copydefault(strOLrzqt, jEZpvd, listCopydefault, jKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.AuCTel().remove(this.$key);
                    C44124sEe.imLogSync$default("WSPushReaction => finished processing for key: " + this.$key, null, null, 6, null);
                    return Unit.INSTANCE;
                }
                unit = Unit.INSTANCE;
                this.this$0.AuCTel().remove(this.$key);
                str = this.$key;
                sb = new StringBuilder();
            } else {
                C44124sEe.imLogSync$default("WSPushReaction => data changed for key: " + this.$key + " during wait, skipping", null, null, 6, null);
                unit = Unit.INSTANCE;
                this.this$0.AuCTel().remove(this.$key);
                str = this.$key;
                sb = new StringBuilder();
            }
            sb.append("WSPushReaction => finished processing for key: ");
            sb.append(str);
            C44124sEe.imLogSync$default(sb.toString(), null, null, 6, null);
            return unit;
        } catch (Throwable th) {
            this.this$0.AuCTel().remove(this.$key);
            C44124sEe.imLogSync$default("WSPushReaction => finished processing for key: " + this.$key, null, null, 6, null);
            throw th;
        }
    }
}
