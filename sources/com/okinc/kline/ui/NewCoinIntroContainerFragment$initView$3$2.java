package com.okinc.kline.ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C35964oKf;
import o.C38910piO;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.pWO;
import o.rVN;
import o.tWL;

/* JADX INFO: loaded from: classes8.dex */
public final class NewCoinIntroContainerFragment$initView$3$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketCoinInfo $it;
    int label;
    final /* synthetic */ C38910piO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCoinIntroContainerFragment$initView$3$2(MarketCoinInfo marketCoinInfo, C38910piO c38910piO, Continuation<? super NewCoinIntroContainerFragment$initView$3$2> continuation) {
        super(2, continuation);
        this.$it = marketCoinInfo;
        this.this$0 = c38910piO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewCoinIntroContainerFragment$initView$3$2(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewCoinIntroContainerFragment$initView$3$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.$it.getInstrumentType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(this.$it.getInstrumentId());
            String tradeSymbol = bizInstrumentValueOf != null ? bizInstrumentValueOf.getTradeSymbol() : null;
            if (tradeSymbol != null && C33129mqd.OLrzqt((CharSequence) tradeSymbol)) {
                tWL twl = (tWL) C43251rlk.copydefault(tWL.class);
                String strAEQbTJ = this.this$0.AEQbTJ();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                this.this$0.getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.fhwtiV, twl.EZpvd(strAEQbTJ, contextRequireContext), this.this$0.getTag()).commitAllowingStateLoss();
                this.this$0.valueOf();
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
