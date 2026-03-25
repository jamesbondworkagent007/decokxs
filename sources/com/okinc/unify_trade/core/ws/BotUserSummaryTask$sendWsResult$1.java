package com.okinc.unify_trade.core.ws;

import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54326xEg;
import o.C55942xtU;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.xAF;
import o.xMK;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryTask$sendWsResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<StrategyUserSummaryData> $data;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C54326xEg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryTask$sendWsResult$1(C54326xEg c54326xEg, List<StrategyUserSummaryData> list, Continuation<? super BotUserSummaryTask$sendWsResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c54326xEg;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotUserSummaryTask$sendWsResult$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotUserSummaryTask$sendWsResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55942xtU c55942xtUDjBIcL;
        String preferUnit;
        List<StrategyUserSummaryData> list;
        xAF xaf;
        BotUserSummaryReq botUserSummaryReqEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xAF xaf2 = this.this$0.AYXKKw;
            if (xaf2 != null) {
                c55942xtUDjBIcL = this.this$0.djBIcL();
                List<StrategyUserSummaryData> list2 = this.$data;
                xMK xmk = xMK.EZpvd;
                xAF xaf3 = this.this$0.AYXKKw;
                if (xaf3 == null || (botUserSummaryReqEZpvd = xaf3.EZpvd()) == null || (preferUnit = botUserSummaryReqEZpvd.getPreferUnit()) == null) {
                    preferUnit = "USDT";
                }
                this.L$0 = xaf2;
                this.L$1 = c55942xtUDjBIcL;
                this.L$2 = list2;
                this.label = 1;
                Object objKWHzl = xmk.KWHzl("USDT", preferUnit, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
                xaf = xaf2;
                obj = objKWHzl;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) this.L$2;
        c55942xtUDjBIcL = (C55942xtU) this.L$1;
        xaf = (xAF) this.L$0;
        C56391yDq.AEQbTJ(obj);
        xaf.KWHzl(c55942xtUDjBIcL.KWHzl2(C56390yDp.OLrzqt(list, obj)));
        return Unit.INSTANCE;
    }
}
