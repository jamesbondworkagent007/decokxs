package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31657lze;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedPriceUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends B2CQuotePriceBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $depositName;
    final /* synthetic */ String $paymentMethod;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $standard;
    final /* synthetic */ String $tradeType;
    int label;
    final /* synthetic */ C31657lze this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuotedPriceUseCase$invoke$2(C31657lze c31657lze, String str, String str2, String str3, String str4, int i, String str5, String str6, Continuation<? super QuotedPriceUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c31657lze;
        this.$baseCurrency = str;
        this.$quoteCurrency = str2;
        this.$quoteAmount = str3;
        this.$tradeType = str4;
        this.$standard = i;
        this.$depositName = str5;
        this.$paymentMethod = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuotedPriceUseCase$invoke$2(this.this$0, this.$baseCurrency, this.$quoteCurrency, this.$quoteAmount, this.$tradeType, this.$standard, this.$depositName, this.$paymentMethod, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends B2CQuotePriceBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<B2CQuotePriceBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<B2CQuotePriceBean>, OKServerException>> continuation) {
        return ((QuotedPriceUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.copydefault;
            String str = this.$baseCurrency;
            String str2 = this.$quoteCurrency;
            String str3 = this.$quoteAmount;
            String str4 = this.$tradeType;
            int i2 = this.$standard;
            String str5 = this.$depositName;
            String str6 = this.$paymentMethod;
            this.label = 1;
            obj = interfaceC31764mDa.EZpvd(str, str2, str3, str4, i2, str5, str6, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
