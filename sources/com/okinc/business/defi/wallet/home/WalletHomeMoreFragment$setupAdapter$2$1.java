package com.okinc.business.defi.wallet.home;

import android.content.Context;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C15770eUq;
import o.C18065fbP;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeMoreFragment$setupAdapter$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18065fbP $it;
    Object L$0;
    int label;
    final /* synthetic */ C15770eUq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeMoreFragment$setupAdapter$2$1(C15770eUq c15770eUq, C18065fbP c18065fbP, Continuation<? super WalletHomeMoreFragment$setupAdapter$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c15770eUq;
        this.$it = c18065fbP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeMoreFragment$setupAdapter$2$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeMoreFragment$setupAdapter$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C15770eUq c15770eUq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.this$0.getContext();
            if (context != null) {
                C18065fbP c18065fbP = this.$it;
                C15770eUq c15770eUq2 = this.this$0;
                dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
                ActivateTeeGuideModel activateTeeGuideModel = new ActivateTeeGuideModel(c18065fbP.KWHzl().DbNXlk(), false, false, (String) null, 0, 0, 0, "sa_wallet_more", WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null);
                this.L$0 = c15770eUq2;
                this.label = 1;
                if (dtq.KWHzl(context, activateTeeGuideModel, this) == objCopydefault) {
                    return objCopydefault;
                }
                c15770eUq = c15770eUq2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c15770eUq = (C15770eUq) this.L$0;
        C56391yDq.AEQbTJ(obj);
        c15770eUq.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
