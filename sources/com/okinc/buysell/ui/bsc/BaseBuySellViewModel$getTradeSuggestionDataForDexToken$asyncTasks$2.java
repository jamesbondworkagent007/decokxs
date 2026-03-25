package com.okinc.buysell.ui.bsc;

import com.okinc.crcore.shared.net.responsebean.bsc.DexTradeStatusCheckBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends DexTradeStatusCheckBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ CurrencyToken $baseCurrencyToken;
    int label;
    final /* synthetic */ BaseBuySellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$2(BaseBuySellViewModel baseBuySellViewModel, CurrencyToken currencyToken, Continuation<? super BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$2> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellViewModel;
        this.$baseCurrencyToken = currencyToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$2(this.this$0, this.$baseCurrencyToken, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends DexTradeStatusCheckBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<DexTradeStatusCheckBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<DexTradeStatusCheckBean, OKServerException>> continuation) {
        return ((BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.AxsJAY;
            String chainIndex = this.$baseCurrencyToken.getDexInfo().getChainIndex();
            String tokenAddress = this.$baseCurrencyToken.getDexInfo().getTokenAddress();
            String type = this.this$0.flVtFt().getType();
            this.label = 1;
            obj = interfaceC31764mDa.copydefault(chainIndex, tokenAddress, type, this);
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
