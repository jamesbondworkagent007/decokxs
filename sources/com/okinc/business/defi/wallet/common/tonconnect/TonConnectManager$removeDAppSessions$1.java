package com.okinc.business.defi.wallet.common.tonconnect;

import com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C16058eck;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$removeDAppSessions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$removeDAppSessions$1(C16058eck c16058eck, String str, Continuation<? super TonConnectManager$removeDAppSessions$1> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectManager$removeDAppSessions$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TonConnectManager$removeDAppSessions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        C16058eck c16058eck;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            c16058eck = (C16058eck) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            List listQOLQEE = C56403yEb.QOLQEE(this.this$0.fARcdN.AhwBna().values());
            String str = this.$walletId;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listQOLQEE) {
                DAppSession dAppSession = (DAppSession) obj2;
                if (str == null || Intrinsics.EZpvd((Object) dAppSession.getWalletId(), (Object) str)) {
                    arrayList.add(obj2);
                }
            }
            C16058eck c16058eck2 = this.this$0;
            it = arrayList.iterator();
            c16058eck = c16058eck2;
        }
        while (it.hasNext()) {
            String clientId = ((DAppSession) it.next()).getClientId();
            this.L$0 = c16058eck;
            this.L$1 = it;
            this.label = 1;
            if (c16058eck.AEQbTJ(clientId, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (this.$walletId != null) {
            this.this$0.fARcdN.OLrzqt(this.$walletId);
        } else {
            this.this$0.fARcdN.AEQbTJ();
        }
        return Unit.INSTANCE;
    }
}
