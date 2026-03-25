package o;

import com.okinc.market.common.MarketHttpApi;
import com.okinc.market.common.bean.FavoriteInfo;
import com.okinc.market.common.bean.GetProductInfoRequest;
import com.okinc.market.watch.data.po.FavGroupProductItemPo;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$fillDataToTmpUse$2;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$initWatchBiz$1;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$loadBizInfoForLogin$1;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$loadBizInfoForLogin$3;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$loadinBizInfoForUnlogin$1;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$requestCupTicker$1;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$requestMpTicker$1;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$requestTicker$1;
import com.okinc.market.watch.datasource.WatchBizDataSourceImpl$requestTickerData$3;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FavoriteBizConfig;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import com.okinc.unify_trade.biz.FavoriteBizInst;
import com.okinc.unify_trade.biz.FavouriteDexCoin;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.NonCancellable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40466qWx {
    public qWD AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final qUV AhwBna;
    public java.util.List<TradeCoinInfo> EZpvd;
    public ConcurrentHashMap<java.lang.String, TickersData> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final MarketFavDataBase copydefault;
    public final qWO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<TradeCoinInfo> AYXKKw() {
        return this.EZpvd;
    }

    @yCM
    public C40466qWx(@NotNull qUV quv, @NotNull qWD qwd) {
        Intrinsics.checkNotNullParameter(quv, "");
        Intrinsics.checkNotNullParameter(qwd, "");
        this.AhwBna = quv;
        this.AEQbTJ = qwd;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qWB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40466qWx.OLrzqt();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.qWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40466qWx.AEQbTJ();
            }
        });
        this.KWHzl = new ConcurrentHashMap<>();
        MarketFavDataBase marketFavDataBaseInstance$default = MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null);
        this.copydefault = marketFavDataBaseInstance$default;
        this.valueOf = new qWO(new C40462qWt(marketFavDataBaseInstance$default.OLrzqt(), marketFavDataBaseInstance$default.djBIcL(), marketFavDataBaseInstance$default.EZpvd()), new C40465qWw());
    }

    public final qWE EZpvd() {
        return (qWE) this.OLrzqt.getValue();
    }

    public static final qWE OLrzqt() {
        return (qWE) C43417ror.OLrzqt(C56524yIo.AEQbTJ(qWE.class));
    }

    private final MarketHttpApi valueOf() {
        return (MarketHttpApi) this.AYXKKw.getValue();
    }

    public static final MarketHttpApi AEQbTJ() {
        return (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchBizDataSourceImpl$initWatchBiz$1 watchBizDataSourceImpl$initWatchBiz$1;
        java.util.List<WatchListData> arrayList;
        C40466qWx c40466qWx;
        if (continuation instanceof WatchBizDataSourceImpl$initWatchBiz$1) {
            watchBizDataSourceImpl$initWatchBiz$1 = (WatchBizDataSourceImpl$initWatchBiz$1) continuation;
            int i = watchBizDataSourceImpl$initWatchBiz$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchBizDataSourceImpl$initWatchBiz$1.label = i - Integer.MIN_VALUE;
            } else {
                watchBizDataSourceImpl$initWatchBiz$1 = new WatchBizDataSourceImpl$initWatchBiz$1(this, continuation);
            }
        }
        java.lang.Object obj = watchBizDataSourceImpl$initWatchBiz$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchBizDataSourceImpl$initWatchBiz$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.AhwBna.AEQbTJ(this.KWHzl);
            arrayList = new java.util.ArrayList<>();
            if (C55608xnE.isLogin$default(null, 1, null)) {
                watchBizDataSourceImpl$initWatchBiz$1.L$0 = this;
                watchBizDataSourceImpl$initWatchBiz$1.L$1 = arrayList;
                watchBizDataSourceImpl$initWatchBiz$1.label = 1;
                if (EZpvd(arrayList, watchBizDataSourceImpl$initWatchBiz$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                watchBizDataSourceImpl$initWatchBiz$1.L$0 = this;
                watchBizDataSourceImpl$initWatchBiz$1.L$1 = arrayList;
                watchBizDataSourceImpl$initWatchBiz$1.label = 2;
                if (AEQbTJ(arrayList, watchBizDataSourceImpl$initWatchBiz$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c40466qWx = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            arrayList = (java.util.List) watchBizDataSourceImpl$initWatchBiz$1.L$1;
            c40466qWx = (C40466qWx) watchBizDataSourceImpl$initWatchBiz$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        watchBizDataSourceImpl$initWatchBiz$1.L$0 = null;
        watchBizDataSourceImpl$initWatchBiz$1.L$1 = null;
        watchBizDataSourceImpl$initWatchBiz$1.label = 3;
        if (c40466qWx.AYXKKw(c40466qWx, arrayList, watchBizDataSourceImpl$initWatchBiz$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object AYXKKw(C40466qWx c40466qWx, java.util.List<WatchListData> list, Continuation<? super Unit> continuation) {
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BizInstrument bizInstrumentKWHzl = qWJ.KWHzl((WatchListData) it.next());
                if (bizInstrumentKWHzl != null) {
                    arrayList.add(bizInstrumentKWHzl);
                }
            }
            for (BizInstrument bizInstrument : arrayList) {
                if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "COIN")) {
                    linkedHashSet.add(bizInstrument.getInstId());
                } else {
                    linkedHashSet.add(bizInstrument.getQuoteSymbol());
                    linkedHashSet.add(bizInstrument.getTradeSymbol());
                    if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "OPTION")) {
                        linkedHashSet3.add(bizInstrument.getInstId());
                    } else {
                        linkedHashSet2.add(bizInstrument.getInstId());
                    }
                }
            }
            java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new WatchBizDataSourceImpl$requestTickerData$3(c40466qWx, linkedHashSet, linkedHashSet2, linkedHashSet3, null), continuation);
            return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchBizDataSourceImpl$requestMpTicker$1 watchBizDataSourceImpl$requestMpTicker$1;
        C40466qWx c40466qWx;
        if (continuation instanceof WatchBizDataSourceImpl$requestMpTicker$1) {
            watchBizDataSourceImpl$requestMpTicker$1 = (WatchBizDataSourceImpl$requestMpTicker$1) continuation;
            int i = watchBizDataSourceImpl$requestMpTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchBizDataSourceImpl$requestMpTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                watchBizDataSourceImpl$requestMpTicker$1 = new WatchBizDataSourceImpl$requestMpTicker$1(this, continuation);
            }
        }
        java.lang.Object markPriceMultTicker = watchBizDataSourceImpl$requestMpTicker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchBizDataSourceImpl$requestMpTicker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(markPriceMultTicker);
            if (!list.isEmpty()) {
                MarketHttpApi marketHttpApiValueOf = valueOf();
                java.lang.String strAEQbTJ = qTN.AEQbTJ(new TickerInstReq(list));
                watchBizDataSourceImpl$requestMpTicker$1.L$0 = this;
                watchBizDataSourceImpl$requestMpTicker$1.label = 1;
                markPriceMultTicker = marketHttpApiValueOf.getMarkPriceMultTicker(strAEQbTJ, watchBizDataSourceImpl$requestMpTicker$1);
                if (markPriceMultTicker == objCopydefault) {
                    return objCopydefault;
                }
                c40466qWx = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c40466qWx = (C40466qWx) watchBizDataSourceImpl$requestMpTicker$1.L$0;
        C56391yDq.AEQbTJ(markPriceMultTicker);
        java.util.List<TickersData> list2 = (java.util.List) ((ResponseData) markPriceMultTicker).getData();
        if (list2 != null) {
            for (TickersData tickersData : list2) {
                c40466qWx.AhwBna.OLrzqt(tickersData.getInstId(), tickersData);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchBizDataSourceImpl$requestTicker$1 watchBizDataSourceImpl$requestTicker$1;
        C40466qWx c40466qWx;
        if (continuation instanceof WatchBizDataSourceImpl$requestTicker$1) {
            watchBizDataSourceImpl$requestTicker$1 = (WatchBizDataSourceImpl$requestTicker$1) continuation;
            int i = watchBizDataSourceImpl$requestTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchBizDataSourceImpl$requestTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                watchBizDataSourceImpl$requestTicker$1 = new WatchBizDataSourceImpl$requestTicker$1(this, continuation);
            }
        }
        java.lang.Object objBatchMarketTickersCor = watchBizDataSourceImpl$requestTicker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchBizDataSourceImpl$requestTicker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objBatchMarketTickersCor);
            if (!list.isEmpty()) {
                MarketHttpApi marketHttpApiValueOf = valueOf();
                java.lang.String strAEQbTJ = qTN.AEQbTJ(new TickerInstReq(list));
                watchBizDataSourceImpl$requestTicker$1.L$0 = this;
                watchBizDataSourceImpl$requestTicker$1.label = 1;
                objBatchMarketTickersCor = marketHttpApiValueOf.batchMarketTickersCor(strAEQbTJ, watchBizDataSourceImpl$requestTicker$1);
                if (objBatchMarketTickersCor == objCopydefault) {
                    return objCopydefault;
                }
                c40466qWx = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c40466qWx = (C40466qWx) watchBizDataSourceImpl$requestTicker$1.L$0;
        C56391yDq.AEQbTJ(objBatchMarketTickersCor);
        java.util.List<TickersData> list2 = (java.util.List) ((ResponseData) objBatchMarketTickersCor).getData();
        if (list2 != null) {
            for (TickersData tickersData : list2) {
                c40466qWx.AhwBna.OLrzqt(tickersData.getInstId(), tickersData);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchBizDataSourceImpl$requestCupTicker$1 watchBizDataSourceImpl$requestCupTicker$1;
        C40466qWx c40466qWx;
        C40466qWx c40466qWx2;
        java.util.List<TickersData> list2;
        java.util.List<TickersData> list3;
        if (continuation instanceof WatchBizDataSourceImpl$requestCupTicker$1) {
            watchBizDataSourceImpl$requestCupTicker$1 = (WatchBizDataSourceImpl$requestCupTicker$1) continuation;
            int i = watchBizDataSourceImpl$requestCupTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchBizDataSourceImpl$requestCupTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                watchBizDataSourceImpl$requestCupTicker$1 = new WatchBizDataSourceImpl$requestCupTicker$1(this, continuation);
            }
        }
        java.lang.Object objBatchMarketCupTickersCor = watchBizDataSourceImpl$requestCupTicker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchBizDataSourceImpl$requestCupTicker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objBatchMarketCupTickersCor);
            if (list.size() > 50) {
                MarketHttpApi marketHttpApiValueOf = valueOf();
                watchBizDataSourceImpl$requestCupTicker$1.L$0 = this;
                watchBizDataSourceImpl$requestCupTicker$1.label = 1;
                objBatchMarketCupTickersCor = marketHttpApiValueOf.batchMarketAllCupTickersCor(watchBizDataSourceImpl$requestCupTicker$1);
                if (objBatchMarketCupTickersCor == objCopydefault) {
                    return objCopydefault;
                }
                c40466qWx2 = this;
                list2 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
                if (list2 != null) {
                }
            } else if (!list.isEmpty()) {
                MarketHttpApi marketHttpApiValueOf2 = valueOf();
                java.lang.String strCopydefault = qTN.copydefault(new TickerCupReq(list));
                watchBizDataSourceImpl$requestCupTicker$1.L$0 = this;
                watchBizDataSourceImpl$requestCupTicker$1.label = 2;
                objBatchMarketCupTickersCor = marketHttpApiValueOf2.batchMarketCupTickersCor(strCopydefault, watchBizDataSourceImpl$requestCupTicker$1);
                if (objBatchMarketCupTickersCor == objCopydefault) {
                    return objCopydefault;
                }
                c40466qWx = this;
                list3 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
                if (list3 != null) {
                }
            }
        } else if (i2 == 1) {
            c40466qWx2 = (C40466qWx) watchBizDataSourceImpl$requestCupTicker$1.L$0;
            C56391yDq.AEQbTJ(objBatchMarketCupTickersCor);
            list2 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
            if (list2 != null) {
                for (TickersData tickersData : list2) {
                    c40466qWx2.AhwBna.OLrzqt(tickersData.getCcy(), tickersData);
                }
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40466qWx = (C40466qWx) watchBizDataSourceImpl$requestCupTicker$1.L$0;
            C56391yDq.AEQbTJ(objBatchMarketCupTickersCor);
            list3 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
            if (list3 != null) {
                for (TickersData tickersData2 : list3) {
                    c40466qWx.AhwBna.OLrzqt(tickersData2.getCcy(), tickersData2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<WatchListData> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchBizDataSourceImpl$loadinBizInfoForUnlogin$1 watchBizDataSourceImpl$loadinBizInfoForUnlogin$1;
        C40466qWx c40466qWx;
        FavoriteBizInfo favoriteBizInfo;
        java.util.List<FavouriteDexCoin> dexCoins;
        FavoriteBizConfig favoriteBizConfig;
        qVD qvd;
        if (continuation instanceof WatchBizDataSourceImpl$loadinBizInfoForUnlogin$1) {
            watchBizDataSourceImpl$loadinBizInfoForUnlogin$1 = (WatchBizDataSourceImpl$loadinBizInfoForUnlogin$1) continuation;
            int i = watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label = i - Integer.MIN_VALUE;
            } else {
                watchBizDataSourceImpl$loadinBizInfoForUnlogin$1 = new WatchBizDataSourceImpl$loadinBizInfoForUnlogin$1(this, continuation);
            }
        }
        java.lang.Object favoriteInfo = watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label;
        int i3 = 3;
        java.util.List list2 = null;
        byte b = 0;
        byte b2 = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(favoriteInfo);
            java.util.List<WatchListData> listAhwBna = AhwBna();
            list.addAll(listAhwBna);
            Triple tripleCreateBizReq$default = xTQ.createBizReq$default(xTQ.copydefault, listAhwBna, null, 2, null);
            java.lang.String string = (java.lang.String) tripleCreateBizReq$default.component1();
            java.lang.String str = (java.lang.String) tripleCreateBizReq$default.component2();
            java.util.List list3 = (java.util.List) tripleCreateBizReq$default.component3();
            if (string.length() > 0 && C59454zhO.zsXlph(string) == ';') {
                string = StringsKt__StringsKt.copydefault(string, string.length() - 1, string.length()).toString();
            }
            MarketHttpApi marketHttpApi = (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
            GetProductInfoRequest getProductInfoRequest = new GetProductInfoRequest(0, str, string, false, list3, 9, null);
            watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.L$0 = this;
            watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label = 1;
            favoriteInfo = marketHttpApi.getFavoriteInfo(getProductInfoRequest, watchBizDataSourceImpl$loadinBizInfoForUnlogin$1);
            if (favoriteInfo == objCopydefault) {
                return objCopydefault;
            }
            c40466qWx = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(favoriteInfo);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(favoriteInfo);
                qvd = qVD.AEQbTJ;
                qvd.AEQbTJ(true);
                watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label = 3;
                if (qvd.OLrzqt(watchBizDataSourceImpl$loadinBizInfoForUnlogin$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            c40466qWx = (C40466qWx) watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.L$0;
            C56391yDq.AEQbTJ(favoriteInfo);
        }
        ResponseData responseData = (ResponseData) favoriteInfo;
        FavoriteInfo favoriteInfo2 = (FavoriteInfo) responseData.getData();
        if (favoriteInfo2 != null) {
            FavoriteBizInst simpleProduct = favoriteInfo2.getSimpleProduct();
            java.util.List<TradeCoinInfo> coins = favoriteInfo2.getCoins();
            java.util.List<FavoriteBizConfig> configs = favoriteInfo2.getConfigs();
            if (configs == null || (favoriteBizConfig = (FavoriteBizConfig) CollectionsKt___CollectionsKt.firstOrNull(configs)) == null) {
                favoriteBizConfig = new FavoriteBizConfig(list2, (java.util.List) (b2 == true ? 1 : 0), i3, (DefaultConstructorMarker) (b == true ? 1 : 0));
            }
            favoriteBizInfo = new FavoriteBizInfo(simpleProduct, favoriteBizConfig, coins);
        } else {
            favoriteBizInfo = new FavoriteBizInfo((FavoriteBizInst) null, (FavoriteBizConfig) null, (java.util.List) null, 7, (DefaultConstructorMarker) null);
        }
        FavoriteInfo favoriteInfo3 = (FavoriteInfo) responseData.getData();
        if (favoriteInfo3 != null && (dexCoins = favoriteInfo3.getDexCoins()) != null) {
            c40466qWx.KWHzl(dexCoins);
        }
        watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.L$0 = null;
        watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label = 2;
        if (c40466qWx.KWHzl(favoriteBizInfo, watchBizDataSourceImpl$loadinBizInfoForUnlogin$1) == objCopydefault) {
            return objCopydefault;
        }
        qvd = qVD.AEQbTJ;
        qvd.AEQbTJ(true);
        watchBizDataSourceImpl$loadinBizInfoForUnlogin$1.label = 3;
        if (qvd.OLrzqt(watchBizDataSourceImpl$loadinBizInfoForUnlogin$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<FavouriteDexCoin> list) {
        qWD qwd = this.AEQbTJ;
        qwd.copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj : list) {
            FavouriteDexCoin favouriteDexCoin = (FavouriteDexCoin) obj;
            linkedHashMap.put(favouriteDexCoin.getChainId() + favouriteDexCoin.getTokenContractAddress(), obj);
        }
        qwd.EZpvd(linkedHashMap);
        pUU.KWHzl("WatchBizDataSourceImpl", "cacheDexCoins: cached " + list.size() + " dex coins");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<WatchListData> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchBizDataSourceImpl$loadBizInfoForLogin$1 watchBizDataSourceImpl$loadBizInfoForLogin$1;
        C40466qWx c40466qWx;
        java.util.List list2;
        FavGroupProductItemPo favGroupProductItemPo;
        java.util.List<WatchListData> listAhwBna;
        FavoriteBizConfig favoriteBizConfig;
        java.util.List list3;
        java.util.List<FavouriteDexCoin> dexCoins;
        FavoriteInfo combineFavouriteBean;
        java.util.List<WatchListData> favorites;
        java.lang.Object next;
        NonCancellable nonCancellable;
        WatchBizDataSourceImpl$loadBizInfoForLogin$3 watchBizDataSourceImpl$loadBizInfoForLogin$3;
        if (continuation instanceof WatchBizDataSourceImpl$loadBizInfoForLogin$1) {
            watchBizDataSourceImpl$loadBizInfoForLogin$1 = (WatchBizDataSourceImpl$loadBizInfoForLogin$1) continuation;
            int i = watchBizDataSourceImpl$loadBizInfoForLogin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchBizDataSourceImpl$loadBizInfoForLogin$1.label = i - Integer.MIN_VALUE;
            } else {
                watchBizDataSourceImpl$loadBizInfoForLogin$1 = new WatchBizDataSourceImpl$loadBizInfoForLogin$1(this, continuation);
            }
        }
        java.lang.Object groupFavProductInfo$default = watchBizDataSourceImpl$loadBizInfoForLogin$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchBizDataSourceImpl$loadBizInfoForLogin$1.label;
        int i3 = 3;
        java.util.List list4 = null;
        byte b = 0;
        byte b2 = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(groupFavProductInfo$default);
            qWE qweEZpvd = EZpvd();
            watchBizDataSourceImpl$loadBizInfoForLogin$1.L$0 = this;
            watchBizDataSourceImpl$loadBizInfoForLogin$1.L$1 = list;
            watchBizDataSourceImpl$loadBizInfoForLogin$1.label = 1;
            groupFavProductInfo$default = MarketHttpApi.ActionBar.getGroupFavProductInfo$default(qweEZpvd, 0, null, null, false, watchBizDataSourceImpl$loadBizInfoForLogin$1, 15, null);
            if (groupFavProductInfo$default == objCopydefault) {
                return objCopydefault;
            }
            c40466qWx = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(groupFavProductInfo$default);
                    return Unit.INSTANCE;
                }
                list3 = (java.util.List) watchBizDataSourceImpl$loadBizInfoForLogin$1.L$1;
                c40466qWx = (C40466qWx) watchBizDataSourceImpl$loadBizInfoForLogin$1.L$0;
                C56391yDq.AEQbTJ(groupFavProductInfo$default);
                list2 = list3;
                nonCancellable = NonCancellable.INSTANCE;
                watchBizDataSourceImpl$loadBizInfoForLogin$3 = new WatchBizDataSourceImpl$loadBizInfoForLogin$3(c40466qWx, list2, null);
                watchBizDataSourceImpl$loadBizInfoForLogin$1.L$0 = null;
                watchBizDataSourceImpl$loadBizInfoForLogin$1.L$1 = null;
                watchBizDataSourceImpl$loadBizInfoForLogin$1.label = 3;
                if (BuildersKt.withContext(nonCancellable, watchBizDataSourceImpl$loadBizInfoForLogin$3, watchBizDataSourceImpl$loadBizInfoForLogin$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            list = (java.util.List) watchBizDataSourceImpl$loadBizInfoForLogin$1.L$1;
            c40466qWx = (C40466qWx) watchBizDataSourceImpl$loadBizInfoForLogin$1.L$0;
            C56391yDq.AEQbTJ(groupFavProductInfo$default);
        }
        list2 = (java.util.List) ((ResponseData) groupFavProductInfo$default).getData();
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((FavGroupProductItemPo) next).getGroupName(), (java.lang.Object) "ALL")) {
                    break;
                }
            }
            favGroupProductItemPo = (FavGroupProductItemPo) next;
        } else {
            favGroupProductItemPo = null;
        }
        pUU.KWHzl("WatchBizDataSourceImpl", "watchlist from http:" + ((favGroupProductItemPo == null || (combineFavouriteBean = favGroupProductItemPo.getCombineFavouriteBean()) == null || (favorites = combineFavouriteBean.getFavorites()) == null) ? null : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(favorites)));
        FavoriteInfo combineFavouriteBean2 = favGroupProductItemPo != null ? favGroupProductItemPo.getCombineFavouriteBean() : null;
        c40466qWx.EZpvd = combineFavouriteBean2 != null ? combineFavouriteBean2.getCoins() : null;
        if (combineFavouriteBean2 != null && (dexCoins = combineFavouriteBean2.getDexCoins()) != null) {
            c40466qWx.KWHzl(dexCoins);
        }
        if (combineFavouriteBean2 == null || (listAhwBna = combineFavouriteBean2.getFavorites()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        list.addAll(listAhwBna);
        if (combineFavouriteBean2 != null) {
            FavoriteBizInst simpleProduct = combineFavouriteBean2.getSimpleProduct();
            java.util.List<TradeCoinInfo> coins = combineFavouriteBean2.getCoins();
            java.util.List<FavoriteBizConfig> configs = combineFavouriteBean2.getConfigs();
            if (configs == null || (favoriteBizConfig = (FavoriteBizConfig) CollectionsKt___CollectionsKt.firstOrNull(configs)) == null) {
                favoriteBizConfig = new FavoriteBizConfig(list4, (java.util.List) (b2 == true ? 1 : 0), i3, (DefaultConstructorMarker) (b == true ? 1 : 0));
            }
            FavoriteBizInfo favoriteBizInfo = new FavoriteBizInfo(simpleProduct, favoriteBizConfig, coins);
            watchBizDataSourceImpl$loadBizInfoForLogin$1.L$0 = c40466qWx;
            watchBizDataSourceImpl$loadBizInfoForLogin$1.L$1 = list2;
            watchBizDataSourceImpl$loadBizInfoForLogin$1.label = 2;
            if (c40466qWx.KWHzl(favoriteBizInfo, watchBizDataSourceImpl$loadBizInfoForLogin$1) == objCopydefault) {
                return objCopydefault;
            }
            list3 = list2;
            list2 = list3;
        }
        nonCancellable = NonCancellable.INSTANCE;
        watchBizDataSourceImpl$loadBizInfoForLogin$3 = new WatchBizDataSourceImpl$loadBizInfoForLogin$3(c40466qWx, list2, null);
        watchBizDataSourceImpl$loadBizInfoForLogin$1.L$0 = null;
        watchBizDataSourceImpl$loadBizInfoForLogin$1.L$1 = null;
        watchBizDataSourceImpl$loadBizInfoForLogin$1.label = 3;
        if (BuildersKt.withContext(nonCancellable, watchBizDataSourceImpl$loadBizInfoForLogin$3, watchBizDataSourceImpl$loadBizInfoForLogin$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(FavoriteBizInfo favoriteBizInfo, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new WatchBizDataSourceImpl$fillDataToTmpUse$2(favoriteBizInfo, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.util.List<WatchListData> AhwBna() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
            java.util.Iterator<T> it = arrayListEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(((WatchListBean) it.next()).getWatchlistData());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        return (java.util.List) objM7377constructorimpl;
    }
}
