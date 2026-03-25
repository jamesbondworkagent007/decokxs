package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.tradingbot.impl.aiBot.dto.InvestLimitDto;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33129mqd;
import o.C47988uAv;
import o.C48468uSn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.uEG;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmInvestBottomSheet$initViewModel$1 extends SuspendLambda implements Function2<InvestLimitDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uEG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmInvestBottomSheet$initViewModel$1(uEG ueg, Continuation<? super LlmInvestBottomSheet$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = ueg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmInvestBottomSheet$initViewModel$1 llmInvestBottomSheet$initViewModel$1 = new LlmInvestBottomSheet$initViewModel$1(this.this$0, continuation);
        llmInvestBottomSheet$initViewModel$1.L$0 = obj;
        return llmInvestBottomSheet$initViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestLimitDto investLimitDto, Continuation<? super Unit> continuation) {
        return ((LlmInvestBottomSheet$initViewModel$1) create(investLimitDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C47988uAv c47988uAv;
        TradeCoinInfo tradeCoinInfoAhwBna;
        String sizeDig;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestLimitDto investLimitDto = (InvestLimitDto) this.L$0;
            C48468uSn c48468uSn = this.this$0.isConnected;
            if (c48468uSn != null && (c47988uAv = c48468uSn.AEQbTJ) != null) {
                InterfaceC54581xNr interfaceC54581xNrFARcdN = this.this$0.fARcdN();
                int iAhwBna = (interfaceC54581xNrFARcdN == null || (tradeCoinInfoAhwBna = interfaceC54581xNrFARcdN.AhwBna(investLimitDto.KWHzl())) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) ? 4 : C33129mqd.AhwBna(sizeDig);
                C47988uAv.setInputLabel$default(c47988uAv, PriceRangeUtil.AEQbTJ.copydefault(investLimitDto.AEQbTJ(), investLimitDto.EZpvd(), iAhwBna), null, 2, null);
                c47988uAv.setInputUnit(investLimitDto.KWHzl());
                c47988uAv.setMaxDecimal(iAhwBna);
            }
            this.this$0.iwGUEr();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
