package com.okinc.kline.ui;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionCoolState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.oYA;

/* JADX INFO: loaded from: classes8.dex */
public final class BaseKlineFragment$initData$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC54531xLw $biz;
    int label;
    final /* synthetic */ oYA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKlineFragment$initData$5$1$1$1(oYA oya, AbstractC54531xLw abstractC54531xLw, Continuation<? super BaseKlineFragment$initData$5$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oya;
        this.$biz = abstractC54531xLw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKlineFragment$initData$5$1$1$1(this.this$0, this.$biz, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKlineFragment$initData$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        String tradeSymbol;
        String instrumentId;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        BizInstrument bizInstrumentValueOf = null;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = this.this$0.dNCPSb();
            if (stateListAnimatorDNCPSb == null) {
                arrayList = null;
                if (arrayList != null || arrayList.isEmpty()) {
                    this.this$0.KWHzl(false);
                } else {
                    AbstractC54531xLw abstractC54531xLw = this.$biz;
                    String str = "";
                    if (abstractC54531xLw != null) {
                        MarketCoinInfo marketCoinInfoQbewEr = this.this$0.QbewEr();
                        if (marketCoinInfoQbewEr == null || (instrumentId = marketCoinInfoQbewEr.getInstrumentId()) == null) {
                            instrumentId = "";
                        }
                        bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                    }
                    this.this$0.OLrzqt(C33129mqd.valueOf(((OptionCoolState) arrayList.get(0)).getCoolingEndTime()));
                    oYA oya = this.this$0;
                    OptionCoolState optionCoolState = (OptionCoolState) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0);
                    if (optionCoolState == null) {
                        z = false;
                        oya.KWHzl(z);
                    } else {
                        if (bizInstrumentValueOf != null && (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) != null) {
                            str = tradeSymbol;
                        }
                        if (!optionCoolState.isInCoolTime(str)) {
                        }
                        oya.KWHzl(z);
                    }
                }
                return Unit.INSTANCE;
            }
            oYA oya2 = this.this$0;
            this.label = 1;
            obj = stateListAnimatorDNCPSb.KWHzl(oya2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        arrayList = (ArrayList) obj;
        if (arrayList != null) {
            this.this$0.KWHzl(false);
        }
        return Unit.INSTANCE;
    }
}
