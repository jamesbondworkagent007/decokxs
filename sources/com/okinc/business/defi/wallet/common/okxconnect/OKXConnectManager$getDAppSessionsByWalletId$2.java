package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15935eaT;
import o.C16011ebq;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$getDAppSessionsByWalletId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DAppSession>>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$getDAppSessionsByWalletId$2(C15935eaT c15935eaT, String str, Continuation<? super OKXConnectManager$getDAppSessionsByWalletId$2> continuation) {
        super(2, continuation);
        this.this$0 = c15935eaT;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$getDAppSessionsByWalletId$2(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DAppSession>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DAppSession>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DAppSession>> continuation) {
        return ((OKXConnectManager$getDAppSessionsByWalletId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((Map) obj).get(this.$walletId);
        return list == null ? yDY.AhwBna() : list;
    }
}
