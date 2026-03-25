package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth;

import com.okinc.unify_trade.biz.ArbitrageInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C53964wvS;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes19.dex */
public final class DepthViewModel$subDepthSource$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArbitrageInfo $currentLeft;
    int label;
    final /* synthetic */ C53964wvS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepthViewModel$subDepthSource$1(ArbitrageInfo arbitrageInfo, C53964wvS c53964wvS, Continuation<? super DepthViewModel$subDepthSource$1> continuation) {
        super(2, continuation);
        this.$currentLeft = arbitrageInfo;
        this.this$0 = c53964wvS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DepthViewModel$subDepthSource$1(this.$currentLeft, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DepthViewModel$subDepthSource$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC54531xLw abstractC54531xLw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                abstractC54531xLw = null;
                C53964wvS c53964wvS = this.this$0;
                if (abstractC54531xLw != null) {
                    c53964wvS.DbNXlk();
                }
                return Unit.INSTANCE;
            }
            String instType = this.$currentLeft.getInstType();
            this.label = 1;
            obj = interfaceC54581xNrOLrzqt.EZpvd(instType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC54531xLw = (AbstractC54531xLw) obj;
        C53964wvS c53964wvS2 = this.this$0;
        if (abstractC54531xLw != null) {
        }
        return Unit.INSTANCE;
    }
}
