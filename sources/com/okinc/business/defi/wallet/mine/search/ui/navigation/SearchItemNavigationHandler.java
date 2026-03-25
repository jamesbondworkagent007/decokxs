package com.okinc.business.defi.wallet.mine.search.ui.navigation;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.WebsiteSearchHistory;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.ActivityC21325gxd;
import o.C10527bqD;
import o.C10528bqE;
import o.C10953byF;
import o.C18976fsa;
import o.C33129mqd;
import o.C33570myu;
import o.C43251rlk;
import o.C56391yDq;
import o.C56524yIo;
import o.InterfaceC18922frZ;
import o.InterfaceC54828xWv;
import o.InterfaceC9773bbs;
import o.InterfaceC9774bbt;
import o.eVQ;
import o.gKO;
import o.pUU;
import o.yDY;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchItemNavigationHandler {
    public static final SearchItemNavigationHandler EZpvd = new SearchItemNavigationHandler();

    private SearchItemNavigationHandler() {
    }

    public final Object AEQbTJ(@NotNull Fragment fragment, @NotNull SearchHistoryItem searchHistoryItem, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new IllegalStateException("Fragment activity tied to " + fragment.getClass().getSimpleName() + " is null")));
        }
        try {
            Result.Application application2 = Result.Companion;
            copydefault(searchHistoryItem, abstractC12782ctV);
            if (searchHistoryItem instanceof TokenSearchHistory) {
                long jOLrzqt = ((TokenSearchHistory) searchHistoryItem).OLrzqt();
                String strCopydefault = ((TokenSearchHistory) searchHistoryItem).copydefault();
                EZpvd(activity, jOLrzqt, strCopydefault == null ? "" : strCopydefault, ((TokenSearchHistory) searchHistoryItem).djBIcL());
            } else if (searchHistoryItem instanceof DAppSearchHistory) {
                InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(fragment);
                if (interfaceC18922frZCopydefault != null) {
                    String strDjBIcL = ((DAppSearchHistory) searchHistoryItem).djBIcL();
                    String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(((DAppSearchHistory) searchHistoryItem).OLrzqt()));
                    String strCopydefault2 = ((DAppSearchHistory) searchHistoryItem).copydefault();
                    String strAEQbTJ = ((DAppSearchHistory) searchHistoryItem).AEQbTJ();
                    copydefault(activity, interfaceC18922frZCopydefault, strDjBIcL, strGEmmrt, strCopydefault2, strAEQbTJ == null ? "" : strAEQbTJ);
                }
            } else if (searchHistoryItem instanceof AddressSearchHistory) {
                String strCopydefault3 = ((AddressSearchHistory) searchHistoryItem).copydefault();
                List<Long> listAEQbTJ = ((AddressSearchHistory) searchHistoryItem).AEQbTJ();
                if (listAEQbTJ == null) {
                    listAEQbTJ = yDY.AhwBna();
                }
                EZpvd(activity, strCopydefault3, new ArrayList<>(listAEQbTJ));
            } else if (searchHistoryItem instanceof WebsiteSearchHistory) {
                String strCopydefault4 = ((WebsiteSearchHistory) searchHistoryItem).copydefault();
                InterfaceC18922frZ interfaceC18922frZCopydefault2 = C18976fsa.copydefault(fragment);
                if (interfaceC18922frZCopydefault2 != null) {
                    AEQbTJ(activity, strCopydefault4, interfaceC18922frZCopydefault2);
                }
            } else if (searchHistoryItem instanceof TokenAssetHistory) {
                copydefault(activity, ((TokenAssetHistory) searchHistoryItem).OLrzqt(), ((TokenAssetHistory) searchHistoryItem).AEQbTJ());
            } else if (searchHistoryItem instanceof NFTAssetHistory) {
                EZpvd(activity, ((NFTAssetHistory) searchHistoryItem).djBIcL(), ((NFTAssetHistory) searchHistoryItem).copydefault(), String.valueOf(((NFTAssetHistory) searchHistoryItem).AEQbTJ()), true);
            } else {
                if (!(searchHistoryItem instanceof DeFiAssetHistory)) {
                    throw new NoWhenBranchMatchedException();
                }
                copydefault(activity, Long.valueOf(((DeFiAssetHistory) searchHistoryItem).djBIcL()), ((DeFiAssetHistory) searchHistoryItem).AEQbTJ());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("SearchNavigationHandler", "Navigation failed for " + searchHistoryItem.gEmmrt() + ": " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        return objM7377constructorimpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateToAddress$default(SearchItemNavigationHandler searchItemNavigationHandler, Activity activity, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 4) != 0) {
            arrayList = null;
        }
        searchItemNavigationHandler.EZpvd(activity, str, arrayList);
    }

    public final void EZpvd(@NotNull Activity activity, @NotNull String str, ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        C33570myu.copydefault(activity);
        eVQ.TaskDescription.startActivity$default(eVQ.Companion, activity, str, arrayList, 0L, null, 24, null);
    }

    public final void copydefault(@NotNull Activity activity, @NotNull InterfaceC18922frZ interfaceC18922frZ, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(interfaceC18922frZ, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C33570myu.copydefault(activity);
        InterfaceC54828xWv.ActionBar.getDAppWebViewFragmentByDAppId$default((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class), activity, str, str2, str3, null, null, new Function0() { // from class: o.frX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchItemNavigationHandler.AEQbTJ();
            }
        }, null, null, "wallet", interfaceC18922frZ.EZpvd(), interfaceC18922frZ.OLrzqt(), str4, MLKEMEngine.KyberPolyBytes, null);
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull Activity activity, @NotNull String str, @NotNull InterfaceC18922frZ interfaceC18922frZ) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC18922frZ, "");
        C33570myu.copydefault(activity);
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        Function0 function0 = new Function0() { // from class: o.frW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchItemNavigationHandler.OLrzqt();
            }
        };
        FragmentManager fragmentManagerEZpvd = interfaceC18922frZ.EZpvd();
        int iOLrzqt = interfaceC18922frZ.OLrzqt();
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, activity, str, null, null, function0, null, null, "wallet", fragmentManagerEZpvd, Integer.valueOf(iOLrzqt), Boolean.FALSE, 96, null);
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull Activity activity, long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33570myu.copydefault(activity);
        ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(activity, new OKDCoinDetailConfig(OKDSourceType.WALLET_SOURCE, C33129mqd.gEmmrt(Long.valueOf(j)), str, str2, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
    }

    public final void copydefault(@NotNull Activity activity, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33570myu.copydefault(activity);
        ActivityC21325gxd.Application.start$default(ActivityC21325gxd.Companion, activity, str, str2, 0L, 8, null);
    }

    public final void EZpvd(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        InterfaceC9773bbs interfaceC9773bbs;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C33570myu.copydefault(activity);
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        if (listKWHzl == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
            return;
        }
        interfaceC9773bbs.copydefault(activity, str, str2, str3, z);
    }

    public final void copydefault(@NotNull Activity activity, Long l, long j) {
        InterfaceC9774bbt interfaceC9774bbt;
        Intrinsics.checkNotNullParameter(activity, "");
        C33570myu.copydefault(activity);
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
        if (listKWHzl == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return;
        }
        interfaceC9774bbt.AEQbTJ(activity, l, Long.valueOf(j));
    }

    public final void copydefault(SearchHistoryItem searchHistoryItem, AbstractC12782ctV abstractC12782ctV) throws AssetNotFoundException {
        boolean z;
        if (searchHistoryItem instanceof TokenAssetHistory) {
            TokenAssetHistory tokenAssetHistory = (TokenAssetHistory) searchHistoryItem;
            String strOLrzqt = tokenAssetHistory.OLrzqt();
            boolean zOLrzqt = C10953byF.KWHzl.OLrzqt(strOLrzqt);
            boolean zIsConnected = abstractC12782ctV.isConnected(strOLrzqt);
            if ((!zOLrzqt) || (!zIsConnected)) {
                throw new AssetNotFoundException(tokenAssetHistory.gEmmrt() + " asset is not supported");
            }
            return;
        }
        Object obj = null;
        if (searchHistoryItem instanceof NFTAssetHistory) {
            NFTAssetHistory nFTAssetHistory = (NFTAssetHistory) searchHistoryItem;
            String strOLrzqt2 = nFTAssetHistory.OLrzqt();
            boolean zOLrzqt2 = C10953byF.KWHzl.OLrzqt(strOLrzqt2);
            Iterator<T> it = abstractC12782ctV.fARcdN().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.EZpvd((Object) ((C10528bqE) next).djBIcL(), (Object) strOLrzqt2)) {
                    obj = next;
                    break;
                }
            }
            z = obj == null;
            if ((!zOLrzqt2) || z) {
                throw new AssetNotFoundException(nFTAssetHistory.gEmmrt() + " asset is not supported");
            }
            return;
        }
        if (searchHistoryItem instanceof DeFiAssetHistory) {
            DeFiAssetHistory deFiAssetHistory = (DeFiAssetHistory) searchHistoryItem;
            String strCopydefault = deFiAssetHistory.copydefault();
            boolean zOLrzqt3 = C10953byF.KWHzl.OLrzqt(strCopydefault);
            Iterator<T> it2 = abstractC12782ctV.RdAHlO().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.EZpvd((Object) ((C10527bqD) next2).AhwBna(), (Object) strCopydefault)) {
                    obj = next2;
                    break;
                }
            }
            z = obj == null;
            if ((!zOLrzqt3) || z) {
                throw new AssetNotFoundException(deFiAssetHistory.gEmmrt() + " asset is not supported");
            }
        }
    }

    public static final class AssetNotFoundException extends Exception {
        public static final int $stable = 0;
        private final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssetNotFoundException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssetNotFoundException copy$default(AssetNotFoundException assetNotFoundException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetNotFoundException.message;
            }
            return assetNotFoundException.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssetNotFoundException copy(String str) {
            return new AssetNotFoundException(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssetNotFoundException) && Intrinsics.EZpvd((Object) this.message, (Object) ((AssetNotFoundException) obj).message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String toString() {
            return "AssetNotFoundException(message=" + this.message + ")";
        }

        public AssetNotFoundException(String str) {
            super(str);
            this.message = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:256) call: com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler.AssetNotFoundException.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ AssetNotFoundException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
