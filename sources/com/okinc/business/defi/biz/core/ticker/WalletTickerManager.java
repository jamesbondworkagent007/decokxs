package com.okinc.business.defi.biz.core.ticker;

import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletTickerSubManager;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC58185ywX;
import o.C10854bwM;
import o.C10954byG;
import o.C11205cFp;
import o.C11607cUn;
import o.C13934dbu;
import o.C33129mqd;
import o.C48787ucK;
import o.C56392yDr;
import o.C56403yEb;
import o.C58266yxz;
import o.InterfaceC56387yDm;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58217yxC;
import o.InterfaceC58222yxH;
import o.InterfaceC58229yxO;
import o.xZA;
import o.yBI;
import o.yBP;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletTickerManager {
    public List<CoinInfo> OLrzqt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bBl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return WalletTickerManager.copydefault();
        }
    });
    public final int copydefault = 100;
    public HashMap<Long, CoinPrice> KWHzl = new HashMap<>();
    public HashMap<Long, Long> EZpvd = new HashMap<>();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.bBk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return WalletTickerManager.OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<Long, CoinPrice> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinInfo> AYXKKw() {
        return this.OLrzqt;
    }

    public final C13934dbu AhwBna() {
        return (C13934dbu) this.valueOf.getValue();
    }

    public static final C13934dbu copydefault() {
        return new C13934dbu();
    }

    public final xZA gEmmrt() {
        return (xZA) this.AEQbTJ.getValue();
    }

    public static final xZA OLrzqt() {
        long jAEQbTJ = ((long) C48787ucK.AEQbTJ.AEQbTJ("wallet_price_socket_config.timer", 5)) * 1000;
        return new xZA(jAEQbTJ, jAEQbTJ, null, 4, null);
    }

    public final CoinPrice AEQbTJ(long j) {
        return this.KWHzl.get(Long.valueOf(j));
    }

    public final CoinPrice copydefault(long j) {
        return this.KWHzl.get(this.EZpvd.get(Long.valueOf(j)));
    }

    public final AbstractC58185ywX<CoinPriceRes> copydefault(@NotNull final String str, @NotNull final xZA xza, @NotNull final List<CoinInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(xza, "");
        Intrinsics.checkNotNullParameter(list, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<CoinPriceRes> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                WalletTickerManager.copydefault(this.copydefault, list, objectRef, str, xza, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt()).copydefault(new InterfaceC58222yxH() { // from class: o.bBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                WalletTickerManager.copydefault(this.AEQbTJ, objectRef, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, o.yxC] */
    public static final void copydefault(final WalletTickerManager walletTickerManager, final List list, Ref.ObjectRef objectRef, final String str, final xZA xza, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        walletTickerManager.OLrzqt = list;
        objectRef.element = yBI.KWHzl(walletTickerManager.copydefault((List<CoinInfo>) list), new Function1() { // from class: o.bBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTickerManager.EZpvd(this.AEQbTJ, interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        }, new Function0() { // from class: o.bBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WalletTickerManager.EZpvd(list, walletTickerManager, str, xza, interfaceC58184ywW);
            }
        }, new Function1() { // from class: o.bBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTickerManager.OLrzqt(this.copydefault, interfaceC58184ywW, (WalletTickerManager.CoinPriceBean) obj);
            }
        });
    }

    public static final Unit OLrzqt(WalletTickerManager walletTickerManager, InterfaceC58184ywW interfaceC58184ywW, CoinPriceBean coinPriceBean) {
        Intrinsics.checkNotNullParameter(coinPriceBean, "");
        Map<Long, Long> bestPriceRelations = coinPriceBean.getBestPriceRelations();
        if (bestPriceRelations != null) {
            for (Map.Entry<Long, Long> entry : bestPriceRelations.entrySet()) {
                walletTickerManager.EZpvd.put(entry.getKey(), entry.getValue());
            }
        }
        walletTickerManager.EZpvd(1, coinPriceBean.getCoinPriceList(), (InterfaceC58184ywW<CoinPriceRes>) interfaceC58184ywW);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(WalletTickerManager walletTickerManager, InterfaceC58184ywW interfaceC58184ywW, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        walletTickerManager.OLrzqt = null;
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(List list, final WalletTickerManager walletTickerManager, String str, xZA xza, final InterfaceC58184ywW interfaceC58184ywW) {
        C10854bwM c10854bwMKWHzl;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoinInfo coinInfo = (CoinInfo) it.next();
            WalletTickerSubManager.TaskDescription taskDescription = new WalletTickerSubManager.TaskDescription(coinInfo.getGeneralChainId(), coinInfo.getTokenAddress());
            map.put(taskDescription.KWHzl(), taskDescription);
            CoinPrice coinPriceCopydefault = walletTickerManager.copydefault(coinInfo.getCoinId());
            if (coinPriceCopydefault != null && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(coinPriceCopydefault.getCoinId()))) != null) {
                WalletTickerSubManager.TaskDescription taskDescription2 = new WalletTickerSubManager.TaskDescription(c10854bwMKWHzl.fetchVPNInfo(), c10854bwMKWHzl.OLrzqt());
                map.put(taskDescription2.KWHzl(), taskDescription2);
            }
        }
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        walletTickerManager.EZpvd(str, xza, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues), new Function1() { // from class: o.bBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTickerManager.EZpvd(this.OLrzqt, interfaceC58184ywW, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(WalletTickerManager walletTickerManager, InterfaceC58184ywW interfaceC58184ywW, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        walletTickerManager.EZpvd(2, (List<CoinPrice>) list, (InterfaceC58184ywW<CoinPriceRes>) interfaceC58184ywW);
        return Unit.INSTANCE;
    }

    public static final void copydefault(WalletTickerManager walletTickerManager, Ref.ObjectRef objectRef, String str) {
        walletTickerManager.OLrzqt = null;
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C11205cFp.EZpvd.gHZMYf().OLrzqt(str);
    }

    public final AbstractC58185ywX<CoinPriceRes> EZpvd(@NotNull final String str, @NotNull final xZA xza, @NotNull final List<CoinInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(xza, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                WalletTickerManager.OLrzqt(this.KWHzl, str, xza, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX<CoinPriceRes> abstractC58185ywXCopydefault = C11607cUn.AEQbTJ(abstractC58185ywXKWHzl).copydefault(new InterfaceC58222yxH() { // from class: o.bBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                WalletTickerManager.copydefault(str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final Unit copydefault(WalletTickerManager walletTickerManager, InterfaceC58184ywW interfaceC58184ywW, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        walletTickerManager.EZpvd(2, (List<CoinPrice>) list, (InterfaceC58184ywW<CoinPriceRes>) interfaceC58184ywW);
        return Unit.INSTANCE;
    }

    public static final void copydefault(String str) {
        C11205cFp.EZpvd.gHZMYf().OLrzqt(str);
    }

    public static final class StateListAnimator extends WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> {
        public final /* synthetic */ WalletTickerManager EZpvd;
        public final /* synthetic */ Function1<List<CoinPrice>, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.business.defi.biz.core.ticker.WalletTickerManager$CoinPrice>, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(String str, xZA xza, List<WalletTickerSubManager.TaskDescription> list, Function1<? super List<CoinPrice>, Unit> function1, WalletTickerManager walletTickerManager) {
            super(str, xza, list);
            this.KWHzl = function1;
            this.EZpvd = walletTickerManager;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(List<WalletTickerSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            Function1<List<CoinPrice>, Unit> function1 = this.KWHzl;
            WalletTickerManager walletTickerManager = this.EZpvd;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (WalletTickerSubManager.SubResponse subResponse : list) {
                String coinId = subResponse.getCoinId();
                long j = coinId != null ? Long.parseLong(coinId) : 0L;
                String price = subResponse.getPrice();
                boolean z = price == null || price.length() == 0;
                String price2 = subResponse.getPrice();
                String str = price2 == null ? "" : price2;
                Boolean hasPercent = subResponse.getHasPercent();
                boolean zBooleanValue = hasPercent != null ? hasPercent.booleanValue() : false;
                String priceChangePercent24h = subResponse.getPriceChangePercent24h();
                String str2 = priceChangePercent24h == null ? "" : priceChangePercent24h;
                CoinPrice coinPriceAEQbTJ = walletTickerManager.AEQbTJ(C33129mqd.valueOf(subResponse.getCoinId()));
                arrayList.add(new CoinPrice(j, !z, str, zBooleanValue, str2, coinPriceAEQbTJ != null ? coinPriceAEQbTJ.isAnchoredToken() : false));
            }
            function1.invoke(arrayList);
        }
    }

    public final void EZpvd(String str, xZA xza, List<WalletTickerSubManager.TaskDescription> list, Function1<? super List<CoinPrice>, Unit> function1) {
        C11205cFp.EZpvd.gHZMYf().copydefault(new StateListAnimator(str, xza, list, function1, this));
    }

    public final AbstractC58185ywX<CoinPriceBean> copydefault(@NotNull List<CoinInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, CoinIds>> it = AEQbTJ(list).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ(it.next().getValue()));
        }
        AbstractC58185ywX<CoinPriceBean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl((Iterable) arrayList);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final HashMap<Integer, CoinIds> AEQbTJ(List<CoinInfo> list) {
        ArrayList<Long> coinIds;
        HashMap<Integer, CoinIds> map = new HashMap<>();
        int i = 0;
        for (CoinInfo coinInfo : list) {
            Integer numValueOf = Integer.valueOf(i);
            CoinIds coinIds2 = map.get(numValueOf);
            if (coinIds2 == null) {
                coinIds2 = new CoinIds(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                map.put(numValueOf, coinIds2);
            }
            CoinIds coinIds3 = coinIds2;
            coinIds3.getCoinIds().add(Long.valueOf(coinInfo.getCoinId()));
            if (coinInfo.getNeedAggregationPrice()) {
                if (coinIds3.getAggregationCoinIds() == null) {
                    coinIds3.setAggregationCoinIds(new ArrayList<>());
                }
                ArrayList<Long> aggregationCoinIds = coinIds3.getAggregationCoinIds();
                if (aggregationCoinIds != null) {
                    aggregationCoinIds.add(Long.valueOf(coinInfo.getCoinId()));
                }
            }
            CoinIds coinIds4 = map.get(Integer.valueOf(i));
            if (coinIds4 != null && (coinIds = coinIds4.getCoinIds()) != null && coinIds.size() == this.copydefault) {
                i++;
            }
        }
        return map;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.defi.biz.core.ticker.WalletTickerManager$CoinPriceBean> */
    public final AbstractC58185ywX<CoinPriceBean> AEQbTJ(CoinIds coinIds) {
        AbstractC58185ywX<ResponseData<List<com.okinc.business.defi.api.bean.CoinPrice>>> abstractC58185ywXKWHzl = AhwBna().KWHzl(coinIds.getCoinIds(), coinIds.getAggregationCoinIds());
        final Function1 function1 = new Function1() { // from class: o.bBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTickerManager.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletTickerManager.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final CoinPriceBean OLrzqt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CoinPriceBean) function1.invoke(obj);
    }

    public static final class CoinInfo {
        public static final int $stable = 0;
        private final long coinId;
        private final long generalChainId;
        private final boolean needAggregationPrice;
        private final String tokenAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CoinInfo copy$default(CoinInfo coinInfo, long j, long j2, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = coinInfo.generalChainId;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = coinInfo.coinId;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = coinInfo.tokenAddress;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z = coinInfo.needAggregationPrice;
            }
            return coinInfo.copy(j3, j4, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.needAggregationPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinInfo copy(long j, long j2, String str, boolean z) {
            return new CoinInfo(j, j2, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinInfo)) {
                return false;
            }
            CoinInfo coinInfo = (CoinInfo) obj;
            return this.generalChainId == coinInfo.generalChainId && this.coinId == coinInfo.coinId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) coinInfo.tokenAddress) && this.needAggregationPrice == coinInfo.needAggregationPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getGeneralChainId() {
            return this.generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getNeedAggregationPrice() {
            return this.needAggregationPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.generalChainId);
            int iHashCode2 = Long.hashCode(this.coinId);
            String str = this.tokenAddress;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.needAggregationPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinInfo(generalChainId=" + this.generalChainId + ", coinId=" + this.coinId + ", tokenAddress=" + this.tokenAddress + ", needAggregationPrice=" + this.needAggregationPrice + ")";
        }

        public CoinInfo(long j, long j2, String str, boolean z) {
            this.generalChainId = j;
            this.coinId = j2;
            this.tokenAddress = str;
            this.needAggregationPrice = z;
        }
    }

    public static final class CoinIds {
        public static final int $stable = 8;
        private ArrayList<Long> aggregationCoinIds;
        private final ArrayList<Long> coinIds;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CoinIds() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.ticker.WalletTickerManager$CoinIds */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CoinIds copy$default(CoinIds coinIds, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = coinIds.coinIds;
            }
            if ((i & 2) != 0) {
                arrayList2 = coinIds.aggregationCoinIds;
            }
            return coinIds.copy(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Long> component1() {
            return this.coinIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Long> component2() {
            return this.aggregationCoinIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinIds copy(@NotNull ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new CoinIds(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinIds)) {
                return false;
            }
            CoinIds coinIds = (CoinIds) obj;
            return Intrinsics.EZpvd(this.coinIds, coinIds.coinIds) && Intrinsics.EZpvd(this.aggregationCoinIds, coinIds.aggregationCoinIds);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Long> getAggregationCoinIds() {
            return this.aggregationCoinIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Long> getCoinIds() {
            return this.coinIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.coinIds.hashCode();
            ArrayList<Long> arrayList = this.aggregationCoinIds;
            return (iHashCode * 31) + (arrayList == null ? 0 : arrayList.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAggregationCoinIds(ArrayList<Long> arrayList) {
            this.aggregationCoinIds = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinIds(coinIds=" + this.coinIds + ", aggregationCoinIds=" + this.aggregationCoinIds + ")";
        }

        public CoinIds(@NotNull ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.coinIds = arrayList;
            this.aggregationCoinIds = arrayList2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:263) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<java.lang.Long>, java.util.ArrayList<java.lang.Long>):void (m)] (LINE:262) call: com.okinc.business.defi.biz.core.ticker.WalletTickerManager.CoinIds.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
        public /* synthetic */ CoinIds(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? null : arrayList2);
        }
    }

    public static final class CoinPriceBean {
        public static final int $stable = 8;
        private final Map<Long, Long> bestPriceRelations;
        private final List<CoinPrice> coinPriceList;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.ticker.WalletTickerManager$CoinPriceBean */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CoinPriceBean copy$default(CoinPriceBean coinPriceBean, List list, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = coinPriceBean.coinPriceList;
            }
            if ((i & 2) != 0) {
                map = coinPriceBean.bestPriceRelations;
            }
            return coinPriceBean.copy(list, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CoinPrice> component1() {
            return this.coinPriceList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Long, Long> component2() {
            return this.bestPriceRelations;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinPriceBean copy(@NotNull List<CoinPrice> list, Map<Long, Long> map) {
            Intrinsics.checkNotNullParameter(list, "");
            return new CoinPriceBean(list, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinPriceBean)) {
                return false;
            }
            CoinPriceBean coinPriceBean = (CoinPriceBean) obj;
            return Intrinsics.EZpvd(this.coinPriceList, coinPriceBean.coinPriceList) && Intrinsics.EZpvd(this.bestPriceRelations, coinPriceBean.bestPriceRelations);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Long, Long> getBestPriceRelations() {
            return this.bestPriceRelations;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CoinPrice> getCoinPriceList() {
            return this.coinPriceList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.coinPriceList.hashCode();
            Map<Long, Long> map = this.bestPriceRelations;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinPriceBean(coinPriceList=" + this.coinPriceList + ", bestPriceRelations=" + this.bestPriceRelations + ")";
        }

        public CoinPriceBean(@NotNull List<CoinPrice> list, Map<Long, Long> map) {
            Intrinsics.checkNotNullParameter(list, "");
            this.coinPriceList = list;
            this.bestPriceRelations = map;
        }
    }

    public static final class CoinPrice {
        public static final int $stable = 0;
        private final long coinId;
        private final boolean hasPercent;
        private final boolean hasPrice;
        private final boolean isAnchoredToken;
        private final String price;
        private final String priceChangePercent24h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.hasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.hasPercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.priceChangePercent24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component6() {
            return this.isAnchoredToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinPrice copy(long j, boolean z, @NotNull String str, boolean z2, @NotNull String str2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CoinPrice(j, z, str, z2, str2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinPrice)) {
                return false;
            }
            CoinPrice coinPrice = (CoinPrice) obj;
            return this.coinId == coinPrice.coinId && this.hasPrice == coinPrice.hasPrice && Intrinsics.EZpvd((Object) this.price, (Object) coinPrice.price) && this.hasPercent == coinPrice.hasPercent && Intrinsics.EZpvd((Object) this.priceChangePercent24h, (Object) coinPrice.priceChangePercent24h) && this.isAnchoredToken == coinPrice.isAnchoredToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getHasPercent() {
            return this.hasPercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getHasPrice() {
            return this.hasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriceChangePercent24h() {
            return this.priceChangePercent24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRealPrice() {
            return this.hasPrice ? this.price : "0";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Long.hashCode(this.coinId) * 31) + Boolean.hashCode(this.hasPrice)) * 31) + this.price.hashCode()) * 31) + Boolean.hashCode(this.hasPercent)) * 31) + this.priceChangePercent24h.hashCode()) * 31) + Boolean.hashCode(this.isAnchoredToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAnchoredToken() {
            return this.isAnchoredToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinPrice(coinId=" + this.coinId + ", hasPrice=" + this.hasPrice + ", price=" + this.price + ", hasPercent=" + this.hasPercent + ", priceChangePercent24h=" + this.priceChangePercent24h + ", isAnchoredToken=" + this.isAnchoredToken + ")";
        }

        public CoinPrice(long j, boolean z, @NotNull String str, boolean z2, @NotNull String str2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.coinId = j;
            this.hasPrice = z;
            this.price = str;
            this.hasPercent = z2;
            this.priceChangePercent24h = str2;
            this.isAnchoredToken = z3;
        }
    }

    public static final class CoinPriceRes {
        public static final int TYPE_INTERFACE = 1;
        public static final int TYPE_WS = 2;
        private final List<CoinPrice> coinPriceList;
        private final int type;
        public static final Application Companion = new Application(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.ticker.WalletTickerManager$CoinPriceRes */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CoinPriceRes copy$default(CoinPriceRes coinPriceRes, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = coinPriceRes.type;
            }
            if ((i2 & 2) != 0) {
                list = coinPriceRes.coinPriceList;
            }
            return coinPriceRes.copy(i, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CoinPrice> component2() {
            return this.coinPriceList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinPriceRes copy(int i, @NotNull List<CoinPrice> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new CoinPriceRes(i, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinPriceRes)) {
                return false;
            }
            CoinPriceRes coinPriceRes = (CoinPriceRes) obj;
            return this.type == coinPriceRes.type && Intrinsics.EZpvd(this.coinPriceList, coinPriceRes.coinPriceList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CoinPrice> getCoinPriceList() {
            return this.coinPriceList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.type) * 31) + this.coinPriceList.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinPriceRes(type=" + this.type + ", coinPriceList=" + this.coinPriceList + ")";
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ticker.WalletTickerManager.CoinPriceRes.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public CoinPriceRes(int i, @NotNull List<CoinPrice> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.type = i;
            this.coinPriceList = list;
        }
    }

    public final void EZpvd(int i, List<CoinPrice> list, InterfaceC58184ywW<CoinPriceRes> interfaceC58184ywW) {
        for (CoinPrice coinPrice : list) {
            this.KWHzl.put(Long.valueOf(coinPrice.getCoinId()), coinPrice);
        }
        if (interfaceC58184ywW != null) {
            interfaceC58184ywW.onNext(new CoinPriceRes(i, list));
        }
    }

    public static final void OLrzqt(final WalletTickerManager walletTickerManager, String str, xZA xza, List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoinInfo coinInfo = (CoinInfo) it.next();
            arrayList.add(new WalletTickerSubManager.TaskDescription(coinInfo.getGeneralChainId(), coinInfo.getTokenAddress()));
        }
        walletTickerManager.EZpvd(str, xza, arrayList, new Function1() { // from class: o.bBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletTickerManager.copydefault(this.OLrzqt, interfaceC58184ywW, (java.util.List) obj);
            }
        });
    }

    public static final CoinPriceBean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            List<com.okinc.business.defi.api.bean.CoinPrice> list = (List) responseData.getData();
            if (list != null) {
                for (com.okinc.business.defi.api.bean.CoinPrice coinPrice : list) {
                    long coinId = coinPrice.getCoinId();
                    boolean hasPrice = coinPrice.getHasPrice();
                    String price = coinPrice.getPrice();
                    String str = price == null ? "" : price;
                    boolean hasPercent = coinPrice.getHasPercent();
                    String priceChangePercent24h = coinPrice.getPriceChangePercent24h();
                    arrayList.add(new CoinPrice(coinId, hasPrice, str, hasPercent, priceChangePercent24h == null ? "" : priceChangePercent24h, coinPrice.isAnchoredCoin()));
                    if (coinPrice.hasBestPrice()) {
                        map.put(Long.valueOf(coinPrice.getCoinId()), Long.valueOf(coinPrice.bestPriceCoinId()));
                    }
                }
            }
            return new CoinPriceBean(arrayList, map);
        }
        return new CoinPriceBean(yDY.AhwBna(), null);
    }
}
