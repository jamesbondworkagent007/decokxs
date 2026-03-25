package com.okinc.business.defi.assets.utxo.list;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C10285bla;
import o.C10353bmp;
import o.C10854bwM;
import o.C10954byG;
import o.C13754dXa;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoListFragment$updateContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $tokenAmount;
    int label;
    final /* synthetic */ C10285bla this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoListFragment$updateContent$1(C10285bla c10285bla, long j, Continuation<? super InvestUtxoListFragment$updateContent$1> continuation) {
        super(2, continuation);
        this.this$0 = c10285bla;
        this.$tokenAmount = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoListFragment$updateContent$1(this.this$0, this.$tokenAmount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoListFragment$updateContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(this.this$0.AhwBna().KWHzl());
            String strFJNWhG = c10854bwMCopydefault != null ? c10854bwMCopydefault.fJNWhG() : null;
            if (strFJNWhG == null) {
                strFJNWhG = "";
            }
            this.this$0.OLrzqt().DbNXlk.setText(C33069mpW.copydefault(this.this$0, C13754dXa.FragmentManager.DGUQLIekVPG, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", C10353bmp.OLrzqt.AEQbTJ(this.$tokenAmount)), C56390yDp.OLrzqt("symbol", strFJNWhG))));
            this.this$0.OLrzqt().fetchVPNInfo.setText(this.this$0.gEmmrt().EZpvd(String.valueOf(this.$tokenAmount)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
