package com.okinc.business.defi.wallet.common.okxconnect;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15935eaT;
import o.C16011ebq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$removeExpiredSessions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$removeExpiredSessions$1(C15935eaT c15935eaT, Continuation<? super OKXConnectManager$removeExpiredSessions$1> continuation) {
        super(2, continuation);
        this.this$0 = c15935eaT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$removeExpiredSessions$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectManager$removeExpiredSessions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        C15935eaT c15935eaT;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int iAEQbTJ = 7;
            try {
                iAEQbTJ = this.this$0.fIwbmz.AEQbTJ("okxConnectConfiguration.sessionExpiryInDays", 7);
            } catch (Exception e) {
                pUU.AEQbTJ("OKXConnectManager", "Error getting sessionExpiryInDays", e);
            }
            C16011ebq c16011ebq = this.this$0.AkhnZx;
            this.label = 1;
            obj = c16011ebq.AEQbTJ(iAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                c15935eaT = (C15935eaT) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it.hasNext()) {
                    String str = (String) it.next();
                    this.L$0 = list;
                    this.L$1 = c15935eaT;
                    this.L$2 = it;
                    this.label = 2;
                    if (c15935eaT.KWHzl(str, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                pUU.KWHzl("OKXConnectManager", "Removed expired sessions: " + list);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        list = (List) obj;
        c15935eaT = this.this$0;
        it = list.iterator();
        while (it.hasNext()) {
        }
        pUU.KWHzl("OKXConnectManager", "Removed expired sessions: " + list);
        return Unit.INSTANCE;
    }
}
