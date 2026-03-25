package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.WebsiteSearchHistory;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryPageFragment$observeFilteredHistory$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryPageFragment$onItemClicked$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19152fvr extends AbstractC32998moE {
    public static Function1<? super C18989fsn, Unit> AEQbTJ;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static Function2<? super C18989fsn, ? super InterfaceC9738bbJ, Unit> OLrzqt;
    public static WalletSearchHistoryViewModel copydefault;
    public RecyclerView AhwBna;
    public HistoryFilterType EZpvd;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fvo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19152fvr.OLrzqt();
        }
    });
    public final int AYXKKw = C13754dXa.TaskDescription.YFmri;

    /* JADX INFO: renamed from: o.fvr$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.DAPP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.WEBSITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.TOKEN_ASSET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchType.NFT_ASSET.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchType.DEFI_ASSET.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[HistoryFilterType.values().length];
            try {
                iArr2[HistoryFilterType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[HistoryFilterType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[HistoryFilterType.DAPPS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[HistoryFilterType.ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[HistoryFilterType.MY_ASSET.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final WalletSearchHistoryViewModel djBIcL() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit>, kotlin.jvm.functions.Function1<o.fsn, kotlin.Unit> */
    public final Function1<C18989fsn, Unit> AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super o.fsn, ? super o.bbJ, kotlin.Unit>, kotlin.jvm.functions.Function2<o.fsn, o.bbJ, kotlin.Unit> */
    public final Function2<C18989fsn, InterfaceC9738bbJ, Unit> EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.fvr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fvr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C19152fvr OLrzqt(@NotNull HistoryFilterType historyFilterType, @NotNull WalletSearchHistoryViewModel walletSearchHistoryViewModel, @NotNull Function2<? super C18989fsn, ? super InterfaceC9738bbJ, Unit> function2, @NotNull Function1<? super C18989fsn, Unit> function1) {
            Intrinsics.checkNotNullParameter(historyFilterType, "");
            Intrinsics.checkNotNullParameter(walletSearchHistoryViewModel, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C19152fvr.copydefault = walletSearchHistoryViewModel;
            C19152fvr.OLrzqt = function2;
            C19152fvr.AEQbTJ = function1;
            C19152fvr c19152fvr = new C19152fvr();
            c19152fvr.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("filter_type", historyFilterType.name())));
            return c19152fvr;
        }
    }

    public static final C19131fvW OLrzqt() {
        return new C19131fvW();
    }

    public final C19131fvW KWHzl() {
        return (C19131fvW) this.djBIcL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        HistoryFilterType historyFilterTypeValueOf;
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("filter_type")) == null || (historyFilterTypeValueOf = HistoryFilterType.valueOf(string)) == null) {
            historyFilterTypeValueOf = HistoryFilterType.ALL;
        }
        this.EZpvd = historyFilterTypeValueOf;
        java.lang.String tag = getTAG();
        HistoryFilterType historyFilterType = this.EZpvd;
        if (historyFilterType == null) {
            Intrinsics.gEmmrt("");
            historyFilterType = null;
        }
        pUU.EZpvd(tag, "Created page fragment for filter: " + historyFilterType);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String tag = getTAG();
        HistoryFilterType historyFilterType = this.EZpvd;
        HistoryFilterType historyFilterType2 = null;
        if (historyFilterType == null) {
            Intrinsics.gEmmrt("");
            historyFilterType = null;
        }
        pUU.EZpvd(tag, "initView called for filter: " + historyFilterType);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C13754dXa.ActionBar.MediaControllerCompatMediaControllerExtraData);
        this.AhwBna = recyclerView;
        if (recyclerView == null) {
            java.lang.String tag2 = getTAG();
            HistoryFilterType historyFilterType3 = this.EZpvd;
            if (historyFilterType3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                historyFilterType2 = historyFilterType3;
            }
            pUU.copydefault(tag2, "RecyclerView is null for filter: " + historyFilterType2);
            return;
        }
        AYXKKw();
        valueOf();
    }

    private final void AYXKKw() {
        KWHzl().register(C18989fsn.class, new C19183fwV(new Function1() { // from class: o.fvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19152fvr.EZpvd(this.AEQbTJ, (C18989fsn) obj);
            }
        }, new Function1() { // from class: o.fvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19152fvr.KWHzl(this.copydefault, (C18989fsn) obj);
            }
        }));
        RecyclerView recyclerView = this.AhwBna;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAdapter(KWHzl());
        }
    }

    public static final Unit EZpvd(C19152fvr c19152fvr, C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        c19152fvr.AEQbTJ(c18989fsn);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C19152fvr c19152fvr, C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        c19152fvr.OLrzqt(c18989fsn);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        WalletSearchHistoryViewModel walletSearchHistoryViewModelDjBIcL = djBIcL();
        HistoryFilterType historyFilterType = null;
        if (walletSearchHistoryViewModelDjBIcL == null) {
            java.lang.String tag = getTAG();
            HistoryFilterType historyFilterType2 = this.EZpvd;
            if (historyFilterType2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                historyFilterType = historyFilterType2;
            }
            pUU.copydefault(tag, "ViewModel is null for " + historyFilterType + ", cannot observe history");
            return;
        }
        java.lang.String tag2 = getTAG();
        HistoryFilterType historyFilterType3 = this.EZpvd;
        if (historyFilterType3 == null) {
            Intrinsics.gEmmrt("");
            historyFilterType3 = null;
        }
        pUU.EZpvd(tag2, "observeFilteredHistory called for " + historyFilterType3);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryPageFragment$observeFilteredHistory$1(this, walletSearchHistoryViewModelDjBIcL, null), 3, null);
    }

    public final java.util.List<C18989fsn> copydefault(java.util.List<C18989fsn> list, HistoryFilterType historyFilterType) {
        java.util.ArrayList arrayList;
        int i = Activity.copydefault[historyFilterType.ordinal()];
        if (i == 1) {
            return list;
        }
        if (i == 2) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((C18989fsn) obj).AEQbTJ().gEmmrt() == SearchType.TOKEN) {
                    arrayList.add(obj);
                }
            }
        } else if (i == 3) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                int i2 = Activity.AEQbTJ[((C18989fsn) obj2).AEQbTJ().gEmmrt().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    arrayList.add(obj2);
                }
            }
        } else if (i == 4) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (((C18989fsn) obj3).AEQbTJ().gEmmrt() == SearchType.ADDRESS) {
                    arrayList.add(obj3);
                }
            }
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                int i3 = Activity.AEQbTJ[((C18989fsn) obj4).AEQbTJ().gEmmrt().ordinal()];
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    arrayList.add(obj4);
                }
            }
        }
        return arrayList;
    }

    public final void AEQbTJ(C18989fsn c18989fsn) {
        if (!isAdded() || isDetached()) {
            pUU.valueOf(getTAG(), "Fragment not in valid state for navigation");
            return;
        }
        Function2<C18989fsn, InterfaceC9738bbJ, Unit> function2EZpvd = EZpvd();
        if (function2EZpvd == null) {
            pUU.copydefault(getTAG(), "onItemClick callback is null");
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryPageFragment$onItemClicked$1(this, c18989fsn, function2EZpvd, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHistoryItem copydefault(SearchHistoryItem searchHistoryItem) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (searchHistoryItem instanceof TokenSearchHistory) {
            TokenSearchHistory tokenSearchHistory = (TokenSearchHistory) searchHistoryItem;
            return tokenSearchHistory.KWHzl((127 & 1) != 0 ? tokenSearchHistory.symbol : null, (127 & 2) != 0 ? tokenSearchHistory.tokenName : null, (127 & 4) != 0 ? tokenSearchHistory.chainId : 0L, (127 & 8) != 0 ? tokenSearchHistory.contractAddress : null, (127 & 16) != 0 ? tokenSearchHistory.tokenLogoUrl : null, (127 & 32) != 0 ? tokenSearchHistory.chainLogoUrl : null, (127 & 64) != 0 ? tokenSearchHistory.searchedByContract : false, (127 & 128) != 0 ? tokenSearchHistory.timestamp : jCurrentTimeMillis);
        }
        if (searchHistoryItem instanceof TokenAssetHistory) {
            TokenAssetHistory tokenAssetHistory = (TokenAssetHistory) searchHistoryItem;
            return tokenAssetHistory.OLrzqt((127 & 1) != 0 ? tokenAssetHistory.metaId : null, (127 & 2) != 0 ? tokenAssetHistory.symbol : null, (127 & 4) != 0 ? tokenAssetHistory.walletId : null, (127 & 8) != 0 ? tokenAssetHistory.generalChainId : 0L, (127 & 16) != 0 ? tokenAssetHistory.displayName : null, (127 & 32) != 0 ? tokenAssetHistory.iconUrl : null, (127 & 64) != 0 ? tokenAssetHistory.chainLogoUrl : null, (127 & 128) != 0 ? tokenAssetHistory.timestamp : jCurrentTimeMillis);
        }
        if (searchHistoryItem instanceof AddressSearchHistory) {
            return AddressSearchHistory.copy$default((AddressSearchHistory) searchHistoryItem, null, null, false, jCurrentTimeMillis, 7, null);
        }
        if (searchHistoryItem instanceof DAppSearchHistory) {
            DAppSearchHistory dAppSearchHistory = (DAppSearchHistory) searchHistoryItem;
            return dAppSearchHistory.copydefault((15 & 1) != 0 ? dAppSearchHistory.dappId : 0L, (15 & 2) != 0 ? dAppSearchHistory.name : null, (15 & 4) != 0 ? dAppSearchHistory.url : null, (15 & 8) != 0 ? dAppSearchHistory.iconUrl : null, (15 & 16) != 0 ? dAppSearchHistory.timestamp : jCurrentTimeMillis);
        }
        if (searchHistoryItem instanceof WebsiteSearchHistory) {
            return WebsiteSearchHistory.copy$default((WebsiteSearchHistory) searchHistoryItem, null, null, jCurrentTimeMillis, 3, null);
        }
        if (searchHistoryItem instanceof NFTAssetHistory) {
            NFTAssetHistory nFTAssetHistory = (NFTAssetHistory) searchHistoryItem;
            return nFTAssetHistory.copydefault((127 & 1) != 0 ? nFTAssetHistory.project : null, (127 & 2) != 0 ? nFTAssetHistory.platform : null, (127 & 4) != 0 ? nFTAssetHistory.metaId : null, (127 & 8) != 0 ? nFTAssetHistory.walletId : null, (127 & 16) != 0 ? nFTAssetHistory.generalChainId : 0L, (127 & 32) != 0 ? nFTAssetHistory.displayName : null, (127 & 64) != 0 ? nFTAssetHistory.iconUrl : null, (127 & 128) != 0 ? nFTAssetHistory.timestamp : jCurrentTimeMillis);
        }
        if (!(searchHistoryItem instanceof DeFiAssetHistory)) {
            throw new NoWhenBranchMatchedException();
        }
        DeFiAssetHistory deFiAssetHistory = (DeFiAssetHistory) searchHistoryItem;
        return deFiAssetHistory.copydefault((255 & 1) != 0 ? deFiAssetHistory.platformId : 0L, (255 & 2) != 0 ? deFiAssetHistory.platformName : null, (255 & 4) != 0 ? deFiAssetHistory.metaId : null, (255 & 8) != 0 ? deFiAssetHistory.walletId : null, (255 & 16) != 0 ? deFiAssetHistory.generalChainId : 0L, (255 & 32) != 0 ? deFiAssetHistory.displayName : null, (255 & 64) != 0 ? deFiAssetHistory.iconUrl : null, (255 & 128) != 0 ? deFiAssetHistory.chainLogoUrl : null, (255 & 256) != 0 ? deFiAssetHistory.timestamp : jCurrentTimeMillis);
    }

    public final void OLrzqt(C18989fsn c18989fsn) {
        Function1<C18989fsn, Unit> function1AEQbTJ = AEQbTJ();
        if (function1AEQbTJ == null) {
            pUU.copydefault(getTAG(), "onDeleteClick callback is null");
            return;
        }
        try {
            function1AEQbTJ.invoke(c18989fsn);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error handling delete click: " + e.getMessage(), e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }
}
