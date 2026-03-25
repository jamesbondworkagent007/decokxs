package com.okinc.business.defi.assets.utxo.list;

import com.okinc.business.defi.assets.utxo.list.InvestUtxoListFragment$setupViews$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C10228bkW;
import o.C10285bla;
import o.C10303bls;
import o.C10854bwM;
import o.C10954byG;
import o.C16568emQ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoListFragment$setupViews$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16568emQ $this_with;
    int label;
    final /* synthetic */ C10285bla this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoListFragment$setupViews$1$1(C10285bla c10285bla, C16568emQ c16568emQ, Continuation<? super InvestUtxoListFragment$setupViews$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c10285bla;
        this.$this_with = c16568emQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoListFragment$setupViews$1$1(this.this$0, this.$this_with, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoListFragment$setupViews$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C10285bla c10285bla = this.this$0;
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(this.this$0.AhwBna().KWHzl());
            String strFJNWhG = c10854bwMCopydefault != null ? c10854bwMCopydefault.fJNWhG() : null;
            if (strFJNWhG == null) {
                strFJNWhG = "";
            }
            final C10285bla c10285bla2 = this.this$0;
            Function1 function1 = new Function1() { // from class: o.bli
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return InvestUtxoListFragment$setupViews$1$1.invokeSuspend$lambda$0(c10285bla2, (java.lang.String) obj2);
                }
            };
            final C10285bla c10285bla3 = this.this$0;
            Function2 function2 = new Function2() { // from class: o.blm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestUtxoListFragment$setupViews$1$1.invokeSuspend$lambda$1(c10285bla3, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
                }
            };
            final C10285bla c10285bla4 = this.this$0;
            c10285bla.AhwBna = new C10228bkW(strFJNWhG, function1, function2, new Function1() { // from class: o.blk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return InvestUtxoListFragment$setupViews$1$1.invokeSuspend$lambda$2(c10285bla4, (C10303bls) obj2);
                }
            });
            C10228bkW c10228bkW = this.this$0.AhwBna;
            if (c10228bkW != null) {
                this.$this_with.djBIcL.setAdapter(c10228bkW);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0(C10285bla c10285bla, String str) {
        return c10285bla.gEmmrt().EZpvd(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(C10285bla c10285bla, C10303bls c10303bls) {
        c10285bla.AEQbTJ(c10303bls);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C10285bla c10285bla, String str, boolean z) {
        c10285bla.djBIcL().EZpvd(str, z);
        return Unit.INSTANCE;
    }
}
