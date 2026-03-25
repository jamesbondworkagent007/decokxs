package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.widget.TextView;
import com.okinc.tradingbot.impl.dto.RiskInfoVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33069mpW;
import o.C48033uCm;
import o.C53970wvY;
import o.C56033xvF;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.uMG;
import o.vNB;

/* JADX INFO: loaded from: classes16.dex */
public final class ArbitragePositioningFragment$initListener$1 extends SuspendLambda implements Function2<vNB<? extends RiskInfoVo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C53970wvY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArbitragePositioningFragment$initListener$1(C53970wvY c53970wvY, Continuation<? super ArbitragePositioningFragment$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c53970wvY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ArbitragePositioningFragment$initListener$1 arbitragePositioningFragment$initListener$1 = new ArbitragePositioningFragment$initListener$1(this.this$0, continuation);
        arbitragePositioningFragment$initListener$1.L$0 = obj;
        return arbitragePositioningFragment$initListener$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends RiskInfoVo> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<RiskInfoVo>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<RiskInfoVo> vnb, Continuation<? super Unit> continuation) {
        return ((ArbitragePositioningFragment$initListener$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uMG umg;
        TextView textView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            RiskInfoVo riskInfoVo = (RiskInfoVo) ((vNB) this.L$0).KWHzl();
            if (riskInfoVo != null && (umg = this.this$0.OLrzqt) != null && (textView = umg.ejfBZ) != null) {
                textView.setText(C33069mpW.copydefault(C48033uCm.Fragment.gqOnQv, C56424yEw.gEmmrt(C56390yDp.OLrzqt("pctMinLimit", C56033xvF.copydefault(riskInfoVo.KWHzl())), C56390yDp.OLrzqt("pctReduce", C56033xvF.copydefault(riskInfoVo.OLrzqt())))));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
