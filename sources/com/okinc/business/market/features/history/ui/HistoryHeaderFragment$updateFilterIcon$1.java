package com.okinc.business.market.features.history.ui;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C33070mpX;
import o.C52761wXj;
import o.C55052xcf;
import o.C56391yDq;
import o.C56442yFn;
import o.jXH;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryHeaderFragment$updateFilterIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $newFilter;
    int label;
    final /* synthetic */ jXH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryHeaderFragment$updateFilterIcon$1(TokenFilter tokenFilter, jXH jxh, Continuation<? super HistoryHeaderFragment$updateFilterIcon$1> continuation) {
        super(2, continuation);
        this.$newFilter = tokenFilter;
        this.this$0 = jxh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryHeaderFragment$updateFilterIcon$1(this.$newFilter, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryHeaderFragment$updateFilterIcon$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TokenFilter tokenFilter = this.$newFilter;
            TokenFilter tokenFilterGEmmrt = this.this$0.fetchVPNInfo().gEmmrt();
            if (!Intrinsics.EZpvd(tokenFilter, tokenFilterGEmmrt.OLrzqt((6143 & 1) != 0 ? tokenFilterGEmmrt.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterGEmmrt.isConnected : null, (6143 & 4) != 0 ? tokenFilterGEmmrt.AkhnZx : this.this$0.fetchVPNInfo().EZpvd().DbNXlk(), (6143 & 8) != 0 ? tokenFilterGEmmrt.AhwBna : null, (6143 & 16) != 0 ? tokenFilterGEmmrt.KWHzl : null, (6143 & 32) != 0 ? tokenFilterGEmmrt.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterGEmmrt.valueOf : false, (6143 & 128) != 0 ? tokenFilterGEmmrt.EZpvd : null, (6143 & 256) != 0 ? tokenFilterGEmmrt.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterGEmmrt.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterGEmmrt.copydefault : null, (6143 & 2048) != 0 ? tokenFilterGEmmrt.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterGEmmrt.fetchVPNInfo : null))) {
                i = C52761wXj.TaskDescription.GVpNrs;
            } else {
                C55052xcf c55052xcf = this.this$0.djBIcL().AEQbTJ;
                String string = this.this$0.getString(C23274hvD.Fragment.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55052xcf.setTitle(string);
                i = C52761wXj.TaskDescription.dPnHjp;
            }
            this.this$0.djBIcL().OLrzqt.setImageDrawable(C33070mpX.KWHzl(i));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
