package com.okinc.oklive.app.data.repository.remote;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ String $instId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2(String str, String str2, Continuation<? super TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2> continuation) {
        super(2, continuation);
        this.$instId = str;
        this.$bizType = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2(this.$instId, this.$bizType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((TradingCardPriceUpdateUseCaseProtocolImpl$canTrade$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        AbstractC54531xLw abstractC54531xLw;
        BizInstrument bizInstrumentValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("TradingCardPriceUpdate", "Error checking trade availability for " + this.$instId, e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("TradingCardPriceUpdate", "Checking if user can trade instId: " + this.$instId + ", bizType: " + this.$bizType);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                abstractC54531xLw = null;
                if (this.$instId.length() != 0) {
                    bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.copydefault() : null;
                    if (bizInstrumentValueOf == null) {
                        bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.copydefault() : null;
                    }
                    z = bizInstrumentValueOf != null;
                } else {
                    if (abstractC54531xLw != null) {
                        bizInstrumentValueOf = abstractC54531xLw.valueOf(this.$instId);
                    }
                    if (bizInstrumentValueOf == null) {
                    }
                    if (bizInstrumentValueOf != null) {
                    }
                }
                return C56443yFo.KWHzl(z);
            }
            String str = this.$bizType;
            this.label = 1;
            obj = interfaceC54581xNrOLrzqt.EZpvd(str, this);
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
        if (this.$instId.length() != 0) {
        }
        return C56443yFo.KWHzl(z);
    }
}
