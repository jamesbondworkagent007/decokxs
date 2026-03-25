package com.okinc.buysell.domain;

import com.okinc.fiat.api.bean.FiatCryptoCoinBean;
import com.okinc.fiat.api.bean.FiatCryptoCoinListBean;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34746niK;
import o.C46871tfO;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class CacheLegacyCoinsUseCase$cacheCoinPairs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoListModel $cryptoListModel;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheLegacyCoinsUseCase$cacheCoinPairs$2(CryptoListModel cryptoListModel, Continuation<? super CacheLegacyCoinsUseCase$cacheCoinPairs$2> continuation) {
        super(2, continuation);
        this.$cryptoListModel = cryptoListModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CacheLegacyCoinsUseCase$cacheCoinPairs$2(this.$cryptoListModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CacheLegacyCoinsUseCase$cacheCoinPairs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FiatCryptoCoinListBean fiatCryptoCoinListBean = new FiatCryptoCoinListBean();
            ArrayList<FiatCryptoCoinBean> arrayList = new ArrayList<>();
            Iterator<CurrencyToken> it = this.$cryptoListModel.getBuyCryptoList().iterator();
            while (it.hasNext()) {
                arrayList.add(C46871tfO.copydefault(it.next()));
            }
            ArrayList<FiatCryptoCoinBean> arrayList2 = new ArrayList<>();
            Iterator<BuySellCurrency> it2 = this.$cryptoListModel.getBuyCurrencyList().iterator();
            while (it2.hasNext()) {
                arrayList2.add(C46871tfO.OLrzqt(it2.next()));
            }
            ArrayList<FiatCryptoCoinBean> arrayList3 = new ArrayList<>();
            Iterator<BuySellCurrency> it3 = this.$cryptoListModel.getSellCurrencyList().iterator();
            while (it3.hasNext()) {
                arrayList3.add(C46871tfO.OLrzqt(it3.next()));
            }
            fiatCryptoCoinListBean.setBaseCurrencies(arrayList);
            fiatCryptoCoinListBean.setQuoteCurrencies(arrayList2);
            fiatCryptoCoinListBean.setSellSupportQuoteCurrencies(arrayList3);
            C34746niK.OLrzqt.OLrzqt(fiatCryptoCoinListBean);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
