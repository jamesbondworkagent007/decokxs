package o;

import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8475bDS {
    public boolean AEQbTJ;
    public boolean AkhnZx;
    public InterfaceC58217yxC djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bEg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.gEmmrt();
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bEf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.AYXKKw();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.bEc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.AhwBna();
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.bEe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.djBIcL();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.bEh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.valueOf();
        }
    });
    public final CopyOnWriteArraySet<ActionBar> AYXKKw = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<TaskDescription> valueOf = new CopyOnWriteArraySet<>();
    public int fetchVPNInfo = 1;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.bEl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.OLrzqt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.bEj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8475bDS.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.bDS$ActionBar */
    public interface ActionBar {
        void OLrzqt(@NotNull java.util.List<WalletTickerManager.CoinPrice> list);
    }

    /* JADX INFO: renamed from: o.bDS$TaskDescription */
    public interface TaskDescription {
        void EZpvd();

        void OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.AkhnZx;
    }

    public static final java.util.HashSet gEmmrt() {
        return new java.util.HashSet();
    }

    public final java.util.HashSet<java.lang.Long> DbNXlk() {
        return (java.util.HashSet) this.OLrzqt.getValue();
    }

    public static final java.util.HashMap AYXKKw() {
        return new java.util.HashMap();
    }

    public final java.util.HashMap<java.lang.Long, C10854bwM> isConnected() {
        return (java.util.HashMap) this.EZpvd.getValue();
    }

    public static final java.util.HashMap AhwBna() {
        return new java.util.HashMap();
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> values() {
        return (java.util.HashMap) this.KWHzl.getValue();
    }

    public static final WalletTickerManager djBIcL() {
        return new WalletTickerManager();
    }

    public final WalletTickerManager AuCTel() {
        return (WalletTickerManager) this.isConnected.getValue();
    }

    public static final TXCoinAssetManager valueOf() {
        return new TXCoinAssetManager();
    }

    public final TXCoinAssetManager ejfBZ() {
        return (TXCoinAssetManager) this.AhwBna.getValue();
    }

    public final java.lang.String fJNWhG() {
        return (java.lang.String) this.values.getValue();
    }

    public static final java.lang.String OLrzqt(C8475bDS c8475bDS) {
        int i = c8475bDS.fetchVPNInfo;
        if (i != 1 && i != 6) {
            return "subTicker-TXCoinHelper";
        }
        return "subTicker-TXCoinHelper-" + c8475bDS;
    }

    public final java.lang.String fARcdN() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String EZpvd(C8475bDS c8475bDS) {
        int i = c8475bDS.fetchVPNInfo;
        if (i != 1 && i != 6) {
            return "subCoinAsset-TXCoinHelper";
        }
        return "subCoinAsset-TXCoinHelper-" + c8475bDS;
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(int i, @NotNull final java.util.List<C13856daV> list, @NotNull final java.util.Set<java.lang.Long> set) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.AkhnZx = false;
        this.AEQbTJ = false;
        this.fetchVPNInfo = i;
        DbNXlk().clear();
        DbNXlk().addAll(set);
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue()), true);
            if (c10854bwMCopydefault != null) {
                isConnected().put(java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()), c10854bwMCopydefault);
            }
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C8475bDS.AEQbTJ(this.KWHzl, set, list, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void AEQbTJ(final C8475bDS c8475bDS, java.util.Set set, java.util.List list, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        c8475bDS.getFieldNames();
        java.util.Set set2 = set;
        java.util.List<WalletTickerManager.CoinInfo> listOLrzqt = c8475bDS.OLrzqt(set2);
        if (!listOLrzqt.isEmpty()) {
            c8475bDS.djBIcL = yBI.subscribeBy$default(c8475bDS.AuCTel().copydefault(c8475bDS.fJNWhG(), new xZA(1000L, 1000L, null, 4, null), listOLrzqt), new Function1() { // from class: o.bEk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8475bDS.KWHzl(this.AEQbTJ, interfaceC58257yxq, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.bDY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8475bDS.copydefault(this.copydefault, interfaceC58257yxq, (WalletTickerManager.CoinPriceRes) obj);
                }
            }, 2, (java.lang.Object) null);
        } else {
            c8475bDS.AkhnZx = true;
            c8475bDS.AEQbTJ((InterfaceC58257yxq<kotlin.Pair<java.lang.Boolean, java.lang.String>>) interfaceC58257yxq, true, (java.lang.String) null);
        }
        TXCoinAssetManager tXCoinAssetManagerEjfBZ = c8475bDS.ejfBZ();
        java.lang.String strFARcdN = c8475bDS.fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            C13856daV c13856daV = (C13856daV) it.next();
            arrayList.add(new C13856daV(c13856daV.EZpvd(), c13856daV.AEQbTJ()));
        }
        c8475bDS.gEmmrt = yBI.subscribeBy$default(tXCoinAssetManagerEjfBZ.OLrzqt(strFARcdN, arrayList, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set2)), new Function1() { // from class: o.bDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8475bDS.copydefault(this.OLrzqt, interfaceC58257yxq, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.bEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8475bDS.OLrzqt(this.KWHzl, interfaceC58257yxq, (TXCoinAssetManager.CoinAssetRes) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(C8475bDS c8475bDS, InterfaceC58257yxq interfaceC58257yxq, WalletTickerManager.CoinPriceRes coinPriceRes) {
        Intrinsics.checkNotNullParameter(coinPriceRes, "");
        int type = coinPriceRes.getType();
        if (type == 1) {
            c8475bDS.AkhnZx = true;
            Intrinsics.copydefault(interfaceC58257yxq);
            c8475bDS.AEQbTJ((InterfaceC58257yxq<kotlin.Pair<java.lang.Boolean, java.lang.String>>) interfaceC58257yxq, true, (java.lang.String) null);
        } else if (type == 2) {
            java.util.Iterator<T> it = c8475bDS.AYXKKw.iterator();
            while (it.hasNext()) {
                ((ActionBar) it.next()).OLrzqt(coinPriceRes.getCoinPriceList());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C8475bDS c8475bDS, InterfaceC58257yxq interfaceC58257yxq, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c8475bDS.AkhnZx = false;
        Intrinsics.copydefault(interfaceC58257yxq);
        c8475bDS.AEQbTJ((InterfaceC58257yxq<kotlin.Pair<java.lang.Boolean, java.lang.String>>) interfaceC58257yxq, false, th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C8475bDS c8475bDS, InterfaceC58257yxq interfaceC58257yxq, TXCoinAssetManager.CoinAssetRes coinAssetRes) {
        Intrinsics.checkNotNullParameter(coinAssetRes, "");
        for (TXCoinAssetManager.CoinAsset coinAsset : coinAssetRes.getCoinAssetList()) {
            c8475bDS.AEQbTJ(coinAsset.getCoinId(), coinAsset.getAddress(), coinAsset.getAsset());
        }
        int type = coinAssetRes.getType();
        if (type == 1) {
            c8475bDS.AEQbTJ = true;
            Intrinsics.copydefault(interfaceC58257yxq);
            c8475bDS.AEQbTJ((InterfaceC58257yxq<kotlin.Pair<java.lang.Boolean, java.lang.String>>) interfaceC58257yxq, true, (java.lang.String) null);
        } else if (type == 2) {
            c8475bDS.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C8475bDS c8475bDS, InterfaceC58257yxq interfaceC58257yxq, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c8475bDS.AEQbTJ = false;
        Intrinsics.copydefault(interfaceC58257yxq);
        c8475bDS.AEQbTJ((InterfaceC58257yxq<kotlin.Pair<java.lang.Boolean, java.lang.String>>) interfaceC58257yxq, false, th.getMessage());
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.util.List<C13856daV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        getFieldNames();
        java.util.List<WalletTickerManager.CoinInfo> listOLrzqt = OLrzqt(DbNXlk());
        if (!listOLrzqt.isEmpty()) {
            this.djBIcL = yBI.subscribeBy$default(AuCTel().EZpvd(fJNWhG(), new xZA(1000L, 1000L, null, 4, null), listOLrzqt), (Function1) null, (Function0) null, new Function1() { // from class: o.bEa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8475bDS.OLrzqt(this.copydefault, (WalletTickerManager.CoinPriceRes) obj);
                }
            }, 3, (java.lang.Object) null);
        }
        this.gEmmrt = yBI.subscribeBy$default(ejfBZ().EZpvd(fARcdN(), list, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(DbNXlk())), (Function1) null, (Function0) null, new Function1() { // from class: o.bDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8475bDS.OLrzqt(this.KWHzl, (TXCoinAssetManager.CoinAssetRes) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C8475bDS c8475bDS, WalletTickerManager.CoinPriceRes coinPriceRes) {
        Intrinsics.checkNotNullParameter(coinPriceRes, "");
        java.util.Iterator<T> it = c8475bDS.AYXKKw.iterator();
        while (it.hasNext()) {
            ((ActionBar) it.next()).OLrzqt(coinPriceRes.getCoinPriceList());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C8475bDS c8475bDS, TXCoinAssetManager.CoinAssetRes coinAssetRes) {
        Intrinsics.checkNotNullParameter(coinAssetRes, "");
        for (TXCoinAssetManager.CoinAsset coinAsset : coinAssetRes.getCoinAssetList()) {
            c8475bDS.AEQbTJ(coinAsset.getCoinId(), coinAsset.getAddress(), coinAsset.getAsset());
        }
        c8475bDS.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager.loadCoinAssets$default(com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager, java.util.List, java.util.List, boolean, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<java.util.List<TXCoinAssetManager.CoinAsset>> OLrzqt(@NotNull java.util.List<C13856daV> list, @NotNull java.util.Set<java.lang.Long> set) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        return TXCoinAssetManager.loadCoinAssets$default(ejfBZ(), list, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set), false, 4, null);
    }

    public final void AEQbTJ(InterfaceC58257yxq<kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58257yxq, boolean z, java.lang.String str) {
        if (!z) {
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, str));
        } else if (this.AkhnZx && this.AEQbTJ) {
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, str));
        }
    }

    public static final void OLrzqt(java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String strEZpvd = C33488mxR.EZpvd(map);
        C6777aVl.Companion.OLrzqt(th, map, strEZpvd, "TXCoinHelper");
        pUU.copydefault("TxCoinHelper", strEZpvd);
    }

    public final C10854bwM OLrzqt(long j) throws CoinMetaError {
        C10954byG c10954byG = C10954byG.EZpvd;
        int size = c10954byG.valueOf().values().size();
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(j), true);
        C10854bwM c10854bwM = isConnected().get(java.lang.Long.valueOf(j));
        if (c10854bwMCopydefault != null) {
            return c10854bwMCopydefault;
        }
        CoinMetaError coinMetaError = new CoinMetaError("coin meta not found");
        java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("coinId", java.lang.String.valueOf(j)), C56390yDp.OLrzqt("txSource", java.lang.String.valueOf(this.fetchVPNInfo)), C56390yDp.OLrzqt("allCoinIds", CollectionsKt___CollectionsKt.joinToString$default(DbNXlk(), null, null, null, 0, null, null, 63, null)), C56390yDp.OLrzqt("enabledCoinsCount", java.lang.String.valueOf(size)), C56390yDp.OLrzqt("whichIsNull", "coinMeta"), C56390yDp.OLrzqt("initStatus", java.lang.String.valueOf(c10954byG.AhwBna())));
        if (c10854bwM != null) {
            OLrzqt(coinMetaError, (java.util.Map<java.lang.String, java.lang.String>) mapDjBIcL);
            return c10854bwM;
        }
        mapDjBIcL.put("whichIsNull", "cachedCoinMeta");
        OLrzqt(coinMetaError, (java.util.Map<java.lang.String, java.lang.String>) mapDjBIcL);
        throw coinMetaError;
    }

    public final C10854bwM copydefault(long j) {
        return C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(j), true);
    }

    public final WalletTickerManager.CoinPrice copydefault(java.lang.Long l) {
        if (l == null) {
            return null;
        }
        return AuCTel().AEQbTJ(l.longValue());
    }

    public final java.util.HashMap<java.lang.Long, WalletTickerManager.CoinPrice> fetchVPNInfo() {
        return AuCTel().AEQbTJ();
    }

    public final void AEQbTJ(long j, java.lang.String str, java.lang.String str2) {
        values().put(EZpvd(java.lang.Long.valueOf(j), str), str2);
    }

    public final java.lang.String EZpvd(java.lang.Long l, java.lang.String str) {
        return l + "-" + str;
    }

    public final kotlin.Pair<java.lang.Long, java.lang.String> KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 0);
        java.lang.Long lValueOf = str2 != null ? java.lang.Long.valueOf(C33129mqd.valueOf(str2)) : null;
        java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
        if (str3 == null) {
            str3 = "";
        }
        return C56390yDp.OLrzqt(lValueOf, str3);
    }

    public final java.util.Map<java.lang.Long, java.lang.String> AkhnZx() {
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        for (Map.Entry<java.lang.String, java.lang.String> entry : values().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.Long first = KWHzl(key).getFirst();
            if (first != null) {
                mapOLrzqt.put(java.lang.Long.valueOf(first.longValue()), value);
            }
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }

    public final java.lang.String KWHzl(java.lang.Long l, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (l == null) {
            return null;
        }
        return values().get(EZpvd(l, str));
    }

    public final void OLrzqt(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AYXKKw.add(actionBar);
    }

    public final void KWHzl(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.valueOf.add(taskDescription);
    }

    public final void getFieldNames() {
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.gEmmrt;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void iwGUEr() {
        getFieldNames();
        this.AYXKKw.clear();
        this.valueOf.clear();
    }

    public final java.util.List<WalletTickerManager.CoinInfo> OLrzqt(java.lang.Iterable<java.lang.Long> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it = iterable.iterator();
        while (it.hasNext()) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(it.next().longValue()));
            WalletTickerManager.CoinInfo coinInfo = c10854bwMKWHzl != null ? new WalletTickerManager.CoinInfo(c10854bwMKWHzl.fetchVPNInfo(), c10854bwMKWHzl.AhwBna(), c10854bwMKWHzl.OLrzqt(), false) : null;
            if (coinInfo != null) {
                arrayList.add(coinInfo);
            }
        }
        return arrayList;
    }

    public final void getNewProxyInstance() {
        java.util.Iterator<T> it = this.valueOf.iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).OLrzqt();
        }
    }

    public final void uzCIH() {
        java.util.Iterator<T> it = this.valueOf.iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).EZpvd();
        }
    }
}
