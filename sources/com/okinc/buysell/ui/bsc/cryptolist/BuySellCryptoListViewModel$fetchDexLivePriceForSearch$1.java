package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.camera.video.AudioStats;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.okex.lite_market_api.DexUtils;
import com.okinc.okex.lite_market_api.bean.DexPriceTickerData;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StateFlow<Map<String, DexPriceTickerData>> $flow;
    int label;
    final /* synthetic */ BuySellCryptoListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.StateFlow<? extends java.util.Map<java.lang.String, com.okinc.okex.lite_market_api.bean.DexPriceTickerData>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1(StateFlow<? extends Map<String, DexPriceTickerData>> stateFlow, BuySellCryptoListViewModel buySellCryptoListViewModel, Continuation<? super BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1> continuation) {
        super(2, continuation);
        this.$flow = stateFlow;
        this.this$0 = buySellCryptoListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1(this.$flow, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Map<String, ? extends DexPriceTickerData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BuySellCryptoListViewModel this$0;

        /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1$1$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[DexUtils.Trend.values().length];
                try {
                    iArr[DexUtils.Trend.UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DexUtils.Trend.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BuySellCryptoListViewModel buySellCryptoListViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = buySellCryptoListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends DexPriceTickerData> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, DexPriceTickerData>) map, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, DexPriceTickerData> map, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CryptoListItem.BuyDexListItem.PercentageChange percentageChangeOLrzqt;
            String strKWHzl;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Map map = (Map) this.L$0;
                if (map == null) {
                    return Unit.INSTANCE;
                }
                if (!map.isEmpty()) {
                    List<CryptoListItem> list = this.this$0.DbNXlk;
                    BuySellCryptoListViewModel buySellCryptoListViewModel = this.this$0;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (CryptoListItem cryptoListItemKWHzl : list) {
                        DexPriceTickerData dexPriceTickerData = (DexPriceTickerData) map.get(cryptoListItemKWHzl.getCryptoId());
                        if (dexPriceTickerData == null) {
                            dexPriceTickerData = new DexPriceTickerData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, 65535, (DefaultConstructorMarker) null);
                        }
                        if (cryptoListItemKWHzl instanceof CryptoListItem.BuyDexListItem) {
                            DexUtils dexUtils = DexUtils.EZpvd;
                            String price = dexPriceTickerData.getPrice();
                            double dAEQbTJ = buySellCryptoListViewModel.copydefault().AEQbTJ();
                            String strEZpvd = buySellCryptoListViewModel.copydefault().EZpvd();
                            String strEZpvd2 = dexUtils.EZpvd(price, strEZpvd, (12 & 4) != 0 ? strEZpvd : null, (12 & 8) != 0 ? RoundingMode.HALF_UP : null, (12 & 16) != 0, (12 & 32) != 0 ? 1.0d : dAEQbTJ);
                            Pair pairEZpvd = dexUtils.EZpvd(dexPriceTickerData.getPriceChangeRatio(), (62 & 2) != 0 ? 2 : 0, (62 & 4) == 0 ? 0 : 2, (62 & 8) != 0 ? RoundingMode.HALF_UP : null, (62 & 16) != 0 ? Locale.getDefault() : null, (62 & 32) != 0 ? 1.0d : AudioStats.AUDIO_AMPLITUDE_NONE);
                            int i = TaskDescription.EZpvd[((DexUtils.Trend) pairEZpvd.getSecond()).ordinal()];
                            if (i == 1) {
                                percentageChangeOLrzqt = CryptoListItem.BuyDexListItem.PercentageChange.UP;
                            } else if (i == 2) {
                                percentageChangeOLrzqt = CryptoListItem.BuyDexListItem.PercentageChange.DOWN;
                            } else {
                                percentageChangeOLrzqt = CryptoListItem.BuyDexListItem.PercentageChange.NO_CHANGE;
                            }
                            CryptoListItem.BuyDexListItem buyDexListItem = (CryptoListItem.BuyDexListItem) cryptoListItemKWHzl;
                            String strEZpvd3 = Intrinsics.EZpvd((Object) strEZpvd2, (Object) "--") ? buyDexListItem.EZpvd() : strEZpvd2;
                            if (Intrinsics.EZpvd(pairEZpvd.getFirst(), (Object) "--")) {
                                strKWHzl = buyDexListItem.KWHzl();
                            } else {
                                strKWHzl = (String) pairEZpvd.getFirst();
                            }
                            String str = strKWHzl;
                            if (Intrinsics.EZpvd(pairEZpvd.getFirst(), (Object) "--")) {
                                percentageChangeOLrzqt = buyDexListItem.OLrzqt();
                            }
                            cryptoListItemKWHzl = buyDexListItem.KWHzl((31 & 1) != 0 ? buyDexListItem.copydefault : null, (31 & 2) != 0 ? buyDexListItem.KWHzl : null, (31 & 4) != 0 ? buyDexListItem.valueOf : null, (31 & 8) != 0 ? buyDexListItem.DbNXlk : null, (31 & 16) != 0 ? buyDexListItem.gEmmrt : null, (31 & 32) != 0 ? buyDexListItem.AhwBna : strEZpvd3, (31 & 64) != 0 ? buyDexListItem.AYXKKw : str, (31 & 128) != 0 ? buyDexListItem.djBIcL : percentageChangeOLrzqt);
                        }
                        arrayList.add(cryptoListItemKWHzl);
                    }
                    this.this$0.DbNXlk = arrayList;
                    if (this.this$0.AkhnZx()) {
                        mHA.OLrzqt.OLrzqt(this.this$0.AEQbTJ, this.this$0.DbNXlk);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Map<String, DexPriceTickerData>> stateFlow = this.$flow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
