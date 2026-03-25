package com.okinc.business.defi.wallet.common.okxconnect.storage;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C16011ebq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectCacheManager$addOrReplaceDAppSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DAppSession $session;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectCacheManager$addOrReplaceDAppSession$1(C16011ebq c16011ebq, String str, DAppSession dAppSession, Continuation<? super OKXConnectCacheManager$addOrReplaceDAppSession$1> continuation) {
        super(2, continuation);
        this.this$0 = c16011ebq;
        this.$walletId = str;
        this.$session = dAppSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$addOrReplaceDAppSession$1(this.this$0, this.$walletId, this.$session, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectCacheManager$addOrReplaceDAppSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            C16011ebq c16011ebq = this.this$0;
            this.label = 1;
            obj = c16011ebq.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        Map mapIsConnected = C56424yEw.isConnected((Map) obj);
        List listAhwBna = (List) mapIsConnected.get(this.$walletId);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        DAppSession dAppSession = this.$session;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listAhwBna) {
            if (!Intrinsics.EZpvd((Object) ((DAppSession) obj2).getClientId(), (Object) dAppSession.getClientId())) {
                arrayList.add(obj2);
            }
        }
        Pair pairOLrzqt = C56390yDp.OLrzqt(this.$walletId, CollectionsKt___CollectionsKt.copydefault((Collection<? extends DAppSession>) arrayList, this.$session));
        mapIsConnected.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        this.this$0.copydefault((Map<String, ? extends List<DAppSession>>) mapIsConnected);
        return Unit.INSTANCE;
    }
}
