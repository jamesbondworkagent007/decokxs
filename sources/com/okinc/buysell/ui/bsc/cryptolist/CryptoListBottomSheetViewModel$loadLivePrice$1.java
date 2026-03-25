package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31670lzr;

/* JADX INFO: loaded from: classes18.dex */
public final class CryptoListBottomSheetViewModel$loadLivePrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CurrencyToken> $cryptoList;
    final /* synthetic */ List<String> $cryptoNames;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ String $quoteCurrency;
    int label;
    final /* synthetic */ CryptoListBottomSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoListBottomSheetViewModel$loadLivePrice$1(LifecycleOwner lifecycleOwner, List<String> list, String str, CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, List<CurrencyToken> list2, Continuation<? super CryptoListBottomSheetViewModel$loadLivePrice$1> continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
        this.$cryptoNames = list;
        this.$quoteCurrency = str;
        this.this$0 = cryptoListBottomSheetViewModel;
        this.$cryptoList = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoListBottomSheetViewModel$loadLivePrice$1(this.$lifecycleOwner, this.$cryptoNames, this.$quoteCurrency, this.this$0, this.$cryptoList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoListBottomSheetViewModel$loadLivePrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            List<String> list = this.$cryptoNames;
            String str = this.$quoteCurrency;
            this.label = 1;
            obj = interfaceC31670lzr.OLrzqt(lifecycleOwner, list, str, this);
            if (obj == objCopydefault) {
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
            C56391yDq.AEQbTJ(obj);
        }
        Flow flowOnEach = FlowKt.onEach((Flow) obj, new AnonymousClass1(this.this$0, this.$cryptoList, null));
        final CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheetViewModel$loadLivePrice$1.2
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<String, FairPriceTickerData> map, Continuation<? super Unit> continuation) {
                cryptoListBottomSheetViewModel.valueOf.setValue(map);
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (flowOnEach.collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheetViewModel$loadLivePrice$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Map<String, ? extends FairPriceTickerData>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<CurrencyToken> $cryptoList;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoListBottomSheetViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, List<CurrencyToken> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cryptoListBottomSheetViewModel;
            this.$cryptoList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cryptoList, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends FairPriceTickerData> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, FairPriceTickerData>) map, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, FairPriceTickerData> map, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Map map = (Map) this.L$0;
                List<CurrencyToken> list = this.$cryptoList;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    FairPriceTickerData fairPriceTickerData = (FairPriceTickerData) entry.getValue();
                    Objects.toString(fairPriceTickerData);
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((CurrencyToken) next).getCurrency(), (Object) str)) {
                            break;
                        }
                    }
                    CurrencyToken currencyToken = (CurrencyToken) next;
                    if (currencyToken != null) {
                        currencyToken.setPrice(fairPriceTickerData.getPrice());
                        currencyToken.setPercentage(new Pair<>(C56443yFo.AEQbTJ(fairPriceTickerData.getPercent()), fairPriceTickerData.getPercentToDisplay()));
                    }
                }
                if (this.this$0.valueOf.getValue() == 0) {
                    this.this$0.valueOf.setValue(map);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
