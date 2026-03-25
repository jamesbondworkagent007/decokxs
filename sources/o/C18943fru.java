package o;

import com.okinc.business.defi.wallet.mine.search.data.SearchHistoryPrefsDataSource$getSearchHistoryFlow$1;
import com.okinc.business.defi.wallet.mine.search.data.SearchHistoryPrefsDataSource$getSearchHistoryFlow$2;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18943fru {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final android.content.Context AEQbTJ;
    public final Json KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C18943fru(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = context;
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = JsonKt.Json$default(null, new Function1() { // from class: o.frs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18943fru.AEQbTJ((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setPrettyPrint(false);
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setClassDiscriminator("type");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fru$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fru.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C18943fru getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.KWHzl(context);
        }

        public final C18943fru KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).hDKMBd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fru */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List getSearchHistory$default(C18943fru c18943fru, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        return c18943fru.copydefault(str, list);
    }

    public final java.util.List<SearchHistoryItem> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<? extends SearchType> list) {
        java.lang.Object next;
        java.util.List<SearchHistoryItem> listAhwBna;
        java.util.List<SearchHistoryItem> listAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = KWHzl().AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((WalletSearchHistory) next).EZpvd(), (java.lang.Object) str)) {
                break;
            }
        }
        WalletSearchHistory walletSearchHistory = (WalletSearchHistory) next;
        if (walletSearchHistory == null || (listAEQbTJ = walletSearchHistory.AEQbTJ()) == null || (listAhwBna = CollectionsKt___CollectionsKt.EZpvd(listAEQbTJ, new Activity())) == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (list.isEmpty()) {
            return listAhwBna;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAhwBna) {
            if (!list.contains(((SearchHistoryItem) obj).gEmmrt())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List<SearchHistoryItem> AEQbTJ() {
        java.util.List<WalletSearchHistory> listAEQbTJ = KWHzl().AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((WalletSearchHistory) it.next()).AEQbTJ());
        }
        return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription()), 20);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fru */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addSearchHistory$default(C18943fru c18943fru, java.lang.String str, SearchHistoryItem searchHistoryItem, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = yDY.AhwBna();
        }
        c18943fru.KWHzl(str, searchHistoryItem, list);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull SearchHistoryItem searchHistoryItem, @NotNull java.util.List<? extends SearchType> list) {
        java.lang.Object next;
        java.util.List<SearchHistoryItem> listAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        Intrinsics.checkNotNullParameter(list, "");
        try {
            if ((!list.isEmpty()) && list.contains(searchHistoryItem.gEmmrt())) {
                return;
            }
            SearchHistoryContainer searchHistoryContainerKWHzl = KWHzl();
            java.util.Iterator<T> it = searchHistoryContainerKWHzl.AEQbTJ().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((WalletSearchHistory) next).EZpvd(), (java.lang.Object) str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            WalletSearchHistory walletSearchHistory = (WalletSearchHistory) next;
            if (walletSearchHistory == null || (listAhwBna = walletSearchHistory.AEQbTJ()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAhwBna) {
                if (!list.contains(((SearchHistoryItem) obj).gEmmrt())) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((SearchHistoryItem) obj2).valueOf(), (java.lang.Object) searchHistoryItem.valueOf())) {
                    arrayList2.add(obj2);
                }
            }
            WalletSearchHistory walletSearchHistory2 = new WalletSearchHistory(str, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(searchHistoryItem), (java.lang.Iterable) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList2, 19)), java.lang.System.currentTimeMillis());
            java.util.List<WalletSearchHistory> listAEQbTJ = searchHistoryContainerKWHzl.AEQbTJ();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((WalletSearchHistory) obj3).EZpvd(), (java.lang.Object) str)) {
                    arrayList3.add(obj3);
                }
            }
            EZpvd(SearchHistoryContainer.copy$default(searchHistoryContainerKWHzl, 0, CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends WalletSearchHistory>) arrayList3, walletSearchHistory2), 1, null));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SearchHistoryPrefsDataSource", "Failed to add search history: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: o.fru$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((SearchHistoryItem) t2).AhwBna()), java.lang.Long.valueOf(((SearchHistoryItem) t).AhwBna()));
        }
    }

    /* JADX INFO: renamed from: o.fru$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((SearchHistoryItem) t2).AhwBna()), java.lang.Long.valueOf(((SearchHistoryItem) t).AhwBna()));
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            SearchHistoryContainer searchHistoryContainerKWHzl = KWHzl();
            java.util.Iterator<T> it = searchHistoryContainerKWHzl.AEQbTJ().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((WalletSearchHistory) next).EZpvd(), (java.lang.Object) str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            WalletSearchHistory walletSearchHistory = (WalletSearchHistory) next;
            if (walletSearchHistory != null) {
                java.util.List<SearchHistoryItem> listAEQbTJ = walletSearchHistory.AEQbTJ();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((SearchHistoryItem) obj).valueOf(), (java.lang.Object) str2)) {
                        arrayList.add(obj);
                    }
                }
                WalletSearchHistory walletSearchHistoryCopy$default = WalletSearchHistory.copy$default(walletSearchHistory, null, arrayList, java.lang.System.currentTimeMillis(), 1, null);
                java.util.List<WalletSearchHistory> listAEQbTJ2 = searchHistoryContainerKWHzl.AEQbTJ();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAEQbTJ2) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((WalletSearchHistory) obj2).EZpvd(), (java.lang.Object) str)) {
                        arrayList2.add(obj2);
                    }
                }
                EZpvd(SearchHistoryContainer.copy$default(searchHistoryContainerKWHzl, 0, CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends WalletSearchHistory>) arrayList2, walletSearchHistoryCopy$default), 1, null));
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SearchHistoryPrefsDataSource", "Failed to delete search history item: " + e.getMessage(), e);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SearchHistoryContainer searchHistoryContainerKWHzl = KWHzl();
            java.util.List<WalletSearchHistory> listAEQbTJ = searchHistoryContainerKWHzl.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (true ^ Intrinsics.EZpvd((java.lang.Object) ((WalletSearchHistory) obj).EZpvd(), (java.lang.Object) str)) {
                    arrayList.add(obj);
                }
            }
            EZpvd(SearchHistoryContainer.copy$default(searchHistoryContainerKWHzl, 0, arrayList, 1, null));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SearchHistoryPrefsDataSource", "Failed to clear search history: " + e.getMessage(), e);
        }
    }

    public final void OLrzqt() {
        try {
            SPUtils.remove("search_history_v2", "WEB3_SEARCH_HISTORY");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SearchHistoryPrefsDataSource", "Failed to clear all history: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer.copy$default(com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer, int, java.util.List, int, java.lang.Object):com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer */
    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory.copy$default(com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory, java.lang.String, java.util.List, long, int, java.lang.Object):com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory */
    public final void EZpvd() {
        try {
            pUU.EZpvd("SearchHistoryPrefsDataSource", "Deleting DApp items from all wallets in SharedPreferences");
            SearchHistoryContainer searchHistoryContainerKWHzl = KWHzl();
            java.util.List<WalletSearchHistory> listAEQbTJ = searchHistoryContainerKWHzl.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (WalletSearchHistory walletSearchHistory : listAEQbTJ) {
                walletSearchHistory.AEQbTJ().size();
                java.util.List<SearchHistoryItem> listAEQbTJ2 = walletSearchHistory.AEQbTJ();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ2) {
                    if (((SearchHistoryItem) obj).gEmmrt() != SearchType.DAPP) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.add(WalletSearchHistory.copy$default(walletSearchHistory, null, arrayList2, 0L, 5, null));
            }
            EZpvd(SearchHistoryContainer.copy$default(searchHistoryContainerKWHzl, 0, arrayList, 1, null));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SearchHistoryPrefsDataSource", "Failed to delete DApp items: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fru */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow getSearchHistoryFlow$default(C18943fru c18943fru, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        return c18943fru.KWHzl(str, list);
    }

    public final Flow<java.util.List<SearchHistoryItem>> KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends SearchType> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.callbackFlow(new SearchHistoryPrefsDataSource$getSearchHistoryFlow$1(this, str, list, null)), new SearchHistoryPrefsDataSource$getSearchHistoryFlow$2(this, str, list, null))), this.OLrzqt);
    }

    public final SearchHistoryContainer KWHzl() {
        java.util.List list = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        java.lang.String string = SPUtils.getString("search_history_v2", null, "WEB3_SEARCH_HISTORY");
        int i = 3;
        int i2 = 0;
        if (string == null || string.length() == 0) {
            return new SearchHistoryContainer(i2, (java.util.List) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
        }
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return (SearchHistoryContainer) json.decodeFromString(SearchHistoryContainer.Companion.serializer(), string);
        } catch (java.lang.Exception unused) {
            pUU.valueOf("SearchHistoryPrefsDataSource", "Failed to load current format, attempting legacy migration");
            try {
                SearchHistoryContainer searchHistoryContainerKWHzl = KWHzl(string);
                if (searchHistoryContainerKWHzl != null) {
                    java.util.Iterator<T> it = searchHistoryContainerKWHzl.AEQbTJ().iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((WalletSearchHistory) it.next()).AEQbTJ().size();
                    }
                    pUU.EZpvd("SearchHistoryPrefsDataSource", "Successfully migrated " + size + " items");
                    EZpvd(searchHistoryContainerKWHzl);
                    return searchHistoryContainerKWHzl;
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("SearchHistoryPrefsDataSource", "Legacy migration failed: " + e.getMessage());
            }
            pUU.valueOf("SearchHistoryPrefsDataSource", "Unable to load or migrate data, returning empty (data preserved)");
            return new SearchHistoryContainer(i2, list, i, (DefaultConstructorMarker) (b3 == true ? 1 : 0));
        }
    }

    public final SearchHistoryContainer KWHzl(java.lang.String str) {
        try {
            Json jsonJson$default = JsonKt.Json$default(null, new Function1() { // from class: o.frr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18943fru.copydefault((JsonBuilder) obj);
                }
            }, 1, null);
            jsonJson$default.getSerializersModule();
            return (SearchHistoryContainer) jsonJson$default.decodeFromString(SearchHistoryContainer.Companion.serializer(), str);
        } catch (java.lang.Exception e) {
            pUU.EZpvd("SearchHistoryPrefsDataSource", "Lenient parsing failed: " + e.getMessage());
            return null;
        }
    }

    public static final Unit copydefault(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setCoerceInputValues(true);
        jsonBuilder.setClassDiscriminator("type");
        return Unit.INSTANCE;
    }

    public final void EZpvd(SearchHistoryContainer searchHistoryContainer) {
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            SPUtils.put("search_history_v2", json.encodeToString(SearchHistoryContainer.Companion.serializer(), searchHistoryContainer), "WEB3_SEARCH_HISTORY");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SearchHistoryPrefsDataSource", "Failed to save history: " + e.getMessage(), e);
        }
    }
}
