package com.okinc.okmarket.home;

import com.okinc.okmarket.home.MarketHomeSubPage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C41607qtx;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$fillVp$2$tabs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MarketHomeSubPage>>, Object> {
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$fillVp$2$tabs$1(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$fillVp$2$tabs$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$fillVp$2$tabs$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MarketHomeSubPage>> continuation) {
        return ((MarketHomeV2Fragment$fillVp$2$tabs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeSubPage.ActionBar actionBar = MarketHomeSubPage.Companion;
            C41607qtx c41607qtxAkhnZx = this.this$0.AkhnZx();
            Unit unit = Unit.INSTANCE;
            Boolean boolAEQbTJ = c41607qtxAkhnZx.AEQbTJ(unit);
            MarketHomeV2Fragment marketHomeV2Fragment = this.this$0;
            boolean zBooleanValue = boolAEQbTJ.booleanValue();
            pUU.KWHzl(marketHomeV2Fragment.getTAG(), "fillVp supportCedefi abtest: " + zBooleanValue);
            boolean zBooleanValue2 = boolAEQbTJ.booleanValue();
            Object objCopydefault = this.this$0.values().copydefault(unit);
            MarketHomeV2Fragment marketHomeV2Fragment2 = this.this$0;
            Boolean bool = (Boolean) objCopydefault;
            boolean zBooleanValue3 = bool.booleanValue();
            pUU.KWHzl(marketHomeV2Fragment2.getTAG(), "fillVp supportStock abtest: " + zBooleanValue3);
            return actionBar.KWHzl(zBooleanValue2, bool.booleanValue());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
