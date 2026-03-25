package com.okinc.tradingbot.impl.signalClone.domain;

import android.os.Parcelable;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowCollector;
import o.C53734wrA;
import o.C53736wrC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalCloneProcessManager$processDcdBotFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super C53734wrA.Application.StateListAnimator>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C53734wrA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneProcessManager$processDcdBotFlow$2(C53734wrA c53734wrA, String str, Continuation<? super SignalCloneProcessManager$processDcdBotFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = c53734wrA;
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneProcessManager$processDcdBotFlow$2 signalCloneProcessManager$processDcdBotFlow$2 = new SignalCloneProcessManager$processDcdBotFlow$2(this.this$0, this.$algoId, continuation);
        signalCloneProcessManager$processDcdBotFlow$2.L$0 = obj;
        return signalCloneProcessManager$processDcdBotFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C53734wrA.Application.StateListAnimator> flowCollector, Continuation<? super Unit> continuation) {
        return ((SignalCloneProcessManager$processDcdBotFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C53736wrC c53736wrC = this.this$0.KWHzl;
            C53736wrC.StateListAnimator stateListAnimator = new C53736wrC.StateListAnimator(this.$algoId);
            this.L$0 = flowCollector;
            this.label = 1;
            objKWHzl = c53736wrC.KWHzl(stateListAnimator, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        C53736wrC.Activity activity = (C53736wrC.Activity) objKWHzl;
        String instId = activity.copydefault().getInstId();
        String instType = activity.copydefault().getInstType();
        String strike = activity.copydefault().getStrike();
        String strikePercentage = activity.copydefault().getStrikePercentage();
        String minAnnualYieldPercentage = activity.copydefault().getMinAnnualYieldPercentage();
        String str = minAnnualYieldPercentage == null ? "" : minAnnualYieldPercentage;
        String maxSettlementDay = activity.copydefault().getMaxSettlementDay();
        String str2 = maxSettlementDay == null ? "" : maxSettlementDay;
        String currency = activity.copydefault().getCurrency();
        String str3 = currency == null ? "" : currency;
        String alternateCurrency = activity.copydefault().getAlternateCurrency();
        C53734wrA.Application.StateListAnimator stateListAnimator2 = new C53734wrA.Application.StateListAnimator(new BotTradeData("dcd_bot", instId, instType, (Parcelable) new DcdProductListReq(null, activity.copydefault().getInstId(), activity.copydefault().getInstType(), str3, alternateCurrency == null ? "" : alternateCurrency, null, strike, str, str2, strikePercentage, 33, null), false, (String) null, (String) null, false, (List) null, 496, (DefaultConstructorMarker) null));
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(stateListAnimator2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
