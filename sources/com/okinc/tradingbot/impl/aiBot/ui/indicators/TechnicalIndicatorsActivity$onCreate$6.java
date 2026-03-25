package com.okinc.tradingbot.impl.aiBot.ui.indicators;

import com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsActivity$onCreate$6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C38307pTy;
import o.C48033uCm;
import o.C52794wYp;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.pTB;
import o.uDU;
import o.uLU;
import o.uMD;

/* JADX INFO: loaded from: classes16.dex */
public final class TechnicalIndicatorsActivity$onCreate$6 extends SuspendLambda implements Function2<uLU<? extends uDU>, Continuation<? super Unit>, Object> {
    final /* synthetic */ uMD $binding;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TechnicalIndicatorsActivity$onCreate$6(uMD umd, Continuation<? super TechnicalIndicatorsActivity$onCreate$6> continuation) {
        super(2, continuation);
        this.$binding = umd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TechnicalIndicatorsActivity$onCreate$6 technicalIndicatorsActivity$onCreate$6 = new TechnicalIndicatorsActivity$onCreate$6(this.$binding, continuation);
        technicalIndicatorsActivity$onCreate$6.L$0 = obj;
        return technicalIndicatorsActivity$onCreate$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(uLU<? extends uDU> ulu, Continuation<? super Unit> continuation) {
        return invoke2((uLU<uDU>) ulu, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(uLU<uDU> ulu, Continuation<? super Unit> continuation) {
        return ((TechnicalIndicatorsActivity$onCreate$6) create(ulu, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            uDU udu = (uDU) ((uLU) this.L$0).OLrzqt();
            final int iOLrzqt = udu != null ? udu.OLrzqt() : 0;
            final String strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.iRxXKY, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(C56443yFo.AEQbTJ(iOLrzqt), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null))));
            C52794wYp c52794wYpCopydefault = this.$binding.copydefault.copydefault();
            if (!Intrinsics.EZpvd((Object) (c52794wYpCopydefault != null ? c52794wYpCopydefault.getText() : null), (Object) strCopydefault)) {
                final uMD umd = this.$binding;
                umd.copydefault.post(new Runnable() { // from class: o.uDE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        TechnicalIndicatorsActivity$onCreate$6.invokeSuspend$lambda$0(umd, strCopydefault, iOLrzqt);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(uMD umd, String str, int i) {
        C52794wYp c52794wYpCopydefault = umd.copydefault.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(str);
        }
        C52794wYp c52794wYpCopydefault2 = umd.copydefault.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setEnabled(i > 0);
        }
    }
}
