package com.okinc.business.market.features.coindetail_liquidity.ui;

import androidx.core.content.ContextCompat;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C26052jQd;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.hDN;
import o.wYC;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityHeaderFragment$updateFilterIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $newFilter;
    int label;
    final /* synthetic */ C26052jQd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityHeaderFragment$updateFilterIcon$1(TokenFilter tokenFilter, C26052jQd c26052jQd, Continuation<? super LiquidityHeaderFragment$updateFilterIcon$1> continuation) {
        super(2, continuation);
        this.$newFilter = tokenFilter;
        this.this$0 = c26052jQd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityHeaderFragment$updateFilterIcon$1(this.$newFilter, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidityHeaderFragment$updateFilterIcon$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wYC wyc;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TokenFilter tokenFilter = this.$newFilter;
            TokenFilter tokenFilterEZpvd = this.this$0.gEmmrt().EZpvd();
            int i = Intrinsics.EZpvd(tokenFilter, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : this.this$0.gEmmrt().KWHzl().DbNXlk(), (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null)) ^ true ? C52761wXj.TaskDescription.GVpNrs : C52761wXj.TaskDescription.dPnHjp;
            hDN hdnKWHzl = C26052jQd.KWHzl(this.this$0);
            if (hdnKWHzl != null && (wyc = hdnKWHzl.EZpvd) != null) {
                wyc.setImageDrawable(ContextCompat.getDrawable(this.this$0.requireContext(), i));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
