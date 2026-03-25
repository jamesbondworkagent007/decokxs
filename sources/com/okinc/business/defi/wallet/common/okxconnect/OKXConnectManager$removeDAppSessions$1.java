package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C15935eaT;
import o.C16011ebq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$removeDAppSessions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$removeDAppSessions$1(C15935eaT c15935eaT, String str, Continuation<? super OKXConnectManager$removeDAppSessions$1> continuation) {
        super(2, continuation);
        this.this$0 = c15935eaT;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$removeDAppSessions$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectManager$removeDAppSessions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        C15935eaT c15935eaT;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16011ebq c16011ebq = this.this$0.AkhnZx;
            this.label = 1;
            obj = c16011ebq.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                c15935eaT = (C15935eaT) this.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it.hasNext()) {
                    String clientId = ((DAppSession) it.next()).getClientId();
                    this.L$0 = c15935eaT;
                    this.L$1 = it;
                    this.label = 2;
                    if (c15935eaT.KWHzl(clientId, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (this.$walletId == null) {
                    this.this$0.AkhnZx.KWHzl(this.$walletId);
                } else {
                    this.this$0.AkhnZx.KWHzl();
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List listQOLQEE = C56403yEb.QOLQEE(((Map) obj).values());
        String str = this.$walletId;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listQOLQEE) {
            DAppSession dAppSession = (DAppSession) obj2;
            if (str == null || Intrinsics.EZpvd((Object) dAppSession.getWalletId(), (Object) str)) {
                arrayList.add(obj2);
            }
        }
        C15935eaT c15935eaT2 = this.this$0;
        it = arrayList.iterator();
        c15935eaT = c15935eaT2;
        while (it.hasNext()) {
        }
        if (this.$walletId == null) {
        }
        return Unit.INSTANCE;
    }
}
