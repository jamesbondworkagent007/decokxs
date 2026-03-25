package com.okinc.unify_trade.trade.core.init;

import com.okinc.unify_trade.biz.InstConfigInfo;
import com.okinc.unify_trade.biz.SpotCopyInstSwitchConfig;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43246rlf;
import o.C54592xOb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes12.dex */
public final class MarginConfigProvider$asyncWriteSPTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstConfigInfo $data;
    int label;
    final /* synthetic */ C54592xOb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginConfigProvider$asyncWriteSPTask$1(C54592xOb c54592xOb, InstConfigInfo instConfigInfo, Continuation<? super MarginConfigProvider$asyncWriteSPTask$1> continuation) {
        super(2, continuation);
        this.this$0 = c54592xOb;
        this.$data = instConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginConfigProvider$asyncWriteSPTask$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginConfigProvider$asyncWriteSPTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MarginModeManager marginModeManagerAEQbTJ = this.this$0.AEQbTJ();
            InstConfigInfo instConfigInfo = this.$data;
            SpotCopyInstSwitchConfig spotCopyInstSwitchConfig = instConfigInfo != null ? instConfigInfo.getSpotCopyInstSwitchConfig() : null;
            InstConfigInfo instConfigInfo2 = this.$data;
            MarginModeManager.saveInstFlyMarginModeToLocal$default(marginModeManagerAEQbTJ, spotCopyInstSwitchConfig, instConfigInfo2 != null ? instConfigInfo2.getInstMarginModeConfigs() : null, C43246rlf.OLrzqt.valueOf(), null, null, 24, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
