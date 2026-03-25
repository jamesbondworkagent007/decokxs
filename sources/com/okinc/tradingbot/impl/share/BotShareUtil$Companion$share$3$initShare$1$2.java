package com.okinc.tradingbot.impl.share;

import androidx.activity.ComponentActivity;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C53698wqR;
import o.C53780wru;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BotShareUtil$Companion$share$3$initShare$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ List<StrategyProfitResponse> $chartData;
    final /* synthetic */ boolean $isShareSelf;
    final /* synthetic */ C53780wru $shareParams;
    final /* synthetic */ boolean $shouldEnableShareToFeed;
    final /* synthetic */ TacticsData $tacticsData;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotShareUtil$Companion$share$3$initShare$1$2(ComponentActivity componentActivity, TacticsData tacticsData, List<StrategyProfitResponse> list, boolean z, boolean z2, C53780wru c53780wru, Continuation<? super BotShareUtil$Companion$share$3$initShare$1$2> continuation) {
        super(2, continuation);
        this.$activity = componentActivity;
        this.$tacticsData = tacticsData;
        this.$chartData = list;
        this.$isShareSelf = z;
        this.$shouldEnableShareToFeed = z2;
        this.$shareParams = c53780wru;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotShareUtil$Companion$share$3$initShare$1$2(this.$activity, this.$tacticsData, this.$chartData, this.$isShareSelf, this.$shouldEnableShareToFeed, this.$shareParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotShareUtil$Companion$share$3$initShare$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C53698wqR.TaskDescription taskDescription = C53698wqR.Companion;
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) this.$activity;
            TacticsData tacticsData = this.$tacticsData;
            List<StrategyProfitResponse> list = this.$chartData;
            boolean z = this.$isShareSelf;
            boolean z2 = this.$shouldEnableShareToFeed;
            C53780wru c53780wru = this.$shareParams;
            this.label = 1;
            if (taskDescription.OLrzqt(abstractActivityC33041mov, tacticsData, list, z, z2, null, false, c53780wru, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
