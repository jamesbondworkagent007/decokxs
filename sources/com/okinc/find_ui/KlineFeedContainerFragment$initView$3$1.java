package com.okinc.find_ui;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C33062mpP;
import o.C33129mqd;
import o.C34825njk;
import o.C34829njo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC54581xNr;
import o.InterfaceC56551yJo;
import o.pWO;
import o.qZH;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFeedContainerFragment$initView$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketCoinInfo $it;
    int label;
    final /* synthetic */ C34829njo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineFeedContainerFragment$initView$3$1(MarketCoinInfo marketCoinInfo, C34829njo c34829njo, Continuation<? super KlineFeedContainerFragment$initView$3$1> continuation) {
        super(2, continuation);
        this.$it = marketCoinInfo;
        this.this$0 = c34829njo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineFeedContainerFragment$initView$3$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineFeedContainerFragment$initView$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            String instId = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstId() : null;
            if (tradeSymbol != null && C33129mqd.OLrzqt((CharSequence) tradeSymbol)) {
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C34825njk.class);
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                if (((C34825njk) C33062mpP.findFragment$default(interfaceC56551yJoAEQbTJ, childFragmentManager, null, 2, null)) != null && !Intrinsics.EZpvd((Object) tradeSymbol, (Object) this.this$0.AEQbTJ())) {
                    Bundle arguments = this.this$0.getArguments();
                    if (arguments != null) {
                        arguments.putString("data", tradeSymbol);
                    }
                    Bundle arguments2 = this.this$0.getArguments();
                    if (arguments2 != null) {
                        arguments2.putString("instId", instId);
                    }
                    InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(C34825njk.class);
                    FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    int i = qZH.StateListAnimator.DQzvGN;
                    Bundle bundle = new Bundle();
                    bundle.putString("data", tradeSymbol);
                    bundle.putString("instId", instId);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Bundle arguments3 = this.this$0.getArguments();
                    if (arguments3 != null) {
                        arguments3.putString("data", tradeSymbol);
                    }
                    Bundle arguments4 = this.this$0.getArguments();
                    if (arguments4 != null) {
                        arguments4.putString("instId", instId);
                    }
                    InterfaceC56551yJo interfaceC56551yJoAEQbTJ3 = C56524yIo.AEQbTJ(C34825njk.class);
                    FragmentManager childFragmentManager3 = this.this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                    int i2 = qZH.StateListAnimator.DQzvGN;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data", tradeSymbol);
                    bundle2.putString("instId", instId);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
