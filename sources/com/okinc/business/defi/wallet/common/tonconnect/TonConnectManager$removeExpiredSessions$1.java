package com.okinc.business.defi.wallet.common.tonconnect;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C16058eck;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$removeExpiredSessions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$removeExpiredSessions$1(C16058eck c16058eck, Continuation<? super TonConnectManager$removeExpiredSessions$1> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectManager$removeExpiredSessions$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TonConnectManager$removeExpiredSessions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<String> listCopydefault;
        C16058eck c16058eck;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int iAEQbTJ = 7;
            try {
                iAEQbTJ = this.this$0.fIwbmz.AEQbTJ("tonConnect.sessionExpiryInDays", 7);
            } catch (Exception e) {
                pUU.AEQbTJ("TonConnectManager", "Error getting sessionExpiryInDays", e);
            }
            listCopydefault = this.this$0.fARcdN.copydefault(iAEQbTJ);
            c16058eck = this.this$0;
            it = listCopydefault.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            c16058eck = (C16058eck) this.L$1;
            listCopydefault = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            this.L$0 = listCopydefault;
            this.L$1 = c16058eck;
            this.L$2 = it;
            this.label = 1;
            if (c16058eck.AEQbTJ(str, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        pUU.KWHzl("TonConnectManager", "Removed expired sessions: " + listCopydefault);
        return Unit.INSTANCE;
    }
}
