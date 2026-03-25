package com.okinc.dexkline.market.features.history.ui;

import com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.mZQ;

/* JADX INFO: loaded from: classes15.dex */
public final class HistoryHeaderFragment$updateFilterIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $newFilter;
    int label;
    final /* synthetic */ mZQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryHeaderFragment$updateFilterIcon$1(TokenFilter tokenFilter, mZQ mzq, Continuation<? super HistoryHeaderFragment$updateFilterIcon$1> continuation) {
        super(2, continuation);
        this.$newFilter = tokenFilter;
        this.this$0 = mzq;
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
            TokenFilter tokenFilterGEmmrt = this.this$0.AkhnZx().gEmmrt();
            if (!Intrinsics.EZpvd(tokenFilter, tokenFilterGEmmrt.AEQbTJ((15359 & 1) != 0 ? tokenFilterGEmmrt.copydefault : null, (15359 & 2) != 0 ? tokenFilterGEmmrt.isConnected : null, (15359 & 4) != 0 ? tokenFilterGEmmrt.DbNXlk : this.this$0.AkhnZx().EZpvd().isConnected(), (15359 & 8) != 0 ? tokenFilterGEmmrt.AhwBna : null, (15359 & 16) != 0 ? tokenFilterGEmmrt.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterGEmmrt.valueOf : false, (15359 & 64) != 0 ? tokenFilterGEmmrt.djBIcL : false, (15359 & 128) != 0 ? tokenFilterGEmmrt.EZpvd : null, (15359 & 256) != 0 ? tokenFilterGEmmrt.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterGEmmrt.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterGEmmrt.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterGEmmrt.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterGEmmrt.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterGEmmrt.AkhnZx : null))) {
                i = C52761wXj.TaskDescription.GVpNrs;
            } else {
                this.this$0.valueOf().copydefault.setTitle(C33070mpX.AYXKKw(LabelFilter.Companion.AEQbTJ(LabelFilter.ALL)));
                i = C52761wXj.TaskDescription.dPnHjp;
            }
            this.this$0.valueOf().KWHzl.setImageDrawable(C33070mpX.KWHzl(i));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
