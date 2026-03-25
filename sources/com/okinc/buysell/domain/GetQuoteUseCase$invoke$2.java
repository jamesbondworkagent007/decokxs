package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;
import o.lyX;

/* JADX INFO: loaded from: classes7.dex */
public final class GetQuoteUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends B2CQuoteBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $depositName;
    final /* synthetic */ String $paymentMethod;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $quoteSide;
    final /* synthetic */ int $standard;
    final /* synthetic */ TradeType $tradeType;
    int label;
    final /* synthetic */ lyX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetQuoteUseCase$invoke$2(lyX lyx, String str, String str2, String str3, String str4, TradeType tradeType, String str5, int i, int i2, String str6, String str7, Continuation<? super GetQuoteUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lyx;
        this.$baseCurrency = str;
        this.$baseAmount = str2;
        this.$quoteCurrency = str3;
        this.$quoteAmount = str4;
        this.$tradeType = tradeType;
        this.$paymentMethod = str5;
        this.$standard = i;
        this.$quoteSide = i2;
        this.$amount = str6;
        this.$depositName = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetQuoteUseCase$invoke$2(this.this$0, this.$baseCurrency, this.$baseAmount, this.$quoteCurrency, this.$quoteAmount, this.$tradeType, this.$paymentMethod, this.$standard, this.$quoteSide, this.$amount, this.$depositName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends B2CQuoteBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>> continuation) {
        return ((GetQuoteUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC31764mDa interfaceC31764mDa = this.this$0.OLrzqt;
        String str = this.$baseCurrency;
        String str2 = this.$baseAmount;
        String str3 = this.$quoteCurrency;
        String str4 = this.$quoteAmount;
        String type = this.$tradeType.getType();
        String str5 = this.$paymentMethod;
        int i2 = this.$tradeType == TradeType.BUY ? this.$standard : 0;
        int i3 = this.$quoteSide;
        String str6 = this.$amount;
        String str7 = this.$depositName;
        this.label = 1;
        Object objKWHzl = interfaceC31764mDa.KWHzl(null, str, str2, str3, str4, type, str5, i2, i3, str6, str7, this);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
