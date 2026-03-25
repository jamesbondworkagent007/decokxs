package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C44124sEe;
import o.C44302sKu;
import o.C44504sSg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<Long> $seqList;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2(C44302sKu c44302sKu, String str, List<Long> list, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$channelId = str;
        this.$seqList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2(this.this$0, this.$channelId, this.$seqList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.hDKMBd().OLrzqt();
                C44504sSg newProxyInstance = this.this$0.getNewProxyInstance();
                String str = this.$channelId;
                List<Long> list = this.$seqList;
                this.label = 1;
                objKWHzl = newProxyInstance.KWHzl(str, list, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C44302sKu c44302sKu = this.this$0;
            String str2 = this.$channelId;
            if (Result.m7384isSuccessimpl(objKWHzl)) {
                List list2 = (List) objKWHzl;
                if (C33129mqd.KWHzl((Collection) list2)) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        c44302sKu.ejfBZ().KWHzl(new InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2$1$1$1(str2, c44302sKu, (OKMessage) it.next(), null));
                    }
                }
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.imLogSync$default("syncMessageReactions failure:", thM7380exceptionOrNullimpl, null, 4, null);
            }
            return Result.m7376boximpl(objKWHzl);
        } catch (Exception e) {
            C44124sEe.imLogSync$default("syncMessageReactions error:", e, null, 4, null);
            return Unit.INSTANCE;
        }
    }
}
