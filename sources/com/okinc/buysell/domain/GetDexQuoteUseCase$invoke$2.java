package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;
import o.lyT;

/* JADX INFO: loaded from: classes7.dex */
public final class GetDexQuoteUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends DexQuoteBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ int $chainIndex;
    final /* synthetic */ String $fromAmount;
    final /* synthetic */ String $fromCurrency;
    final /* synthetic */ boolean $isOrderConfirm;
    final /* synthetic */ String $platformCode;
    final /* synthetic */ String $referenceDexQuoteId;
    final /* synthetic */ String $slippageTolerance;
    final /* synthetic */ String $toCurrency;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ Integer $tokenDecimal;
    final /* synthetic */ String $tradeType;
    int label;
    final /* synthetic */ lyT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDexQuoteUseCase$invoke$2(lyT lyt, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i, String str7, boolean z, String str8, Continuation<? super GetDexQuoteUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lyt;
        this.$platformCode = str;
        this.$tradeType = str2;
        this.$toCurrency = str3;
        this.$fromAmount = str4;
        this.$fromCurrency = str5;
        this.$tokenAddress = str6;
        this.$tokenDecimal = num;
        this.$chainIndex = i;
        this.$slippageTolerance = str7;
        this.$isOrderConfirm = z;
        this.$referenceDexQuoteId = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetDexQuoteUseCase$invoke$2(this.this$0, this.$platformCode, this.$tradeType, this.$toCurrency, this.$fromAmount, this.$fromCurrency, this.$tokenAddress, this.$tokenDecimal, this.$chainIndex, this.$slippageTolerance, this.$isOrderConfirm, this.$referenceDexQuoteId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends DexQuoteBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>> continuation) {
        return ((GetDexQuoteUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        InterfaceC31764mDa interfaceC31764mDa = this.this$0.KWHzl;
        String str = this.$platformCode;
        String str2 = this.$tradeType;
        String str3 = this.$toCurrency;
        String str4 = this.$fromAmount;
        String str5 = this.$fromCurrency;
        String str6 = this.$tokenAddress;
        Integer num = this.$tokenDecimal;
        int i2 = this.$chainIndex;
        String str7 = this.$slippageTolerance;
        boolean z = this.$isOrderConfirm;
        String str8 = this.$referenceDexQuoteId;
        this.label = 1;
        Object dexQuote$default = InterfaceC31764mDa.ActionBar.getDexQuote$default(interfaceC31764mDa, str, str2, str3, str4, str5, str6, num, i2, str7, z, str8, null, this, 2048, null);
        return dexQuote$default == objCopydefault ? objCopydefault : dexQuote$default;
    }
}
