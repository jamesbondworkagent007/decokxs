package com.okinc.okmarket.home;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment;
import com.okinc.tradeapi.framework.constant.TradeKey;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34953nmF;
import o.C34972nmY;
import o.C35025nnY;
import o.C35047nnu;
import o.C35095nop;
import o.C43251rlk;
import o.C56402yEa;
import o.C56444yFp;
import o.InterfaceC40518qYv;
import o.InterfaceC49422uoJ;
import o.InterfaceC49425uoM;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public abstract class MarketHomeSubPage implements InterfaceC40518qYv {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketHomeSubPage[] $VALUES;
    public static final ActionBar Companion;
    private final String e2eContentDescription;
    private final String pageType;
    private final int titleResId;
    public static final MarketHomeSubPage FAVORITES = new MarketHomeSubPage("FAVORITES", 0) { // from class: com.okinc.okmarket.home.MarketHomeSubPage.FAVORITES
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.QKVWgx;
            String strEZpvd = ((InterfaceC49422uoJ) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.COMMON)).EZpvd();
            String str = "homeFavTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new MarketFavQuoteFragment();
        }
    };
    public static final MarketHomeSubPage HOT_RANK = new MarketHomeSubPage("HOT_RANK", 1) { // from class: com.okinc.okmarket.home.MarketHomeSubPage.HOT_RANK
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.UeEOUB;
            String str = "hot-rank";
            String str2 = "homeHotRankTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C34972nmY();
        }
    };
    public static final MarketHomeSubPage UP_RANK = new MarketHomeSubPage("UP_RANK", 2) { // from class: com.okinc.okmarket.home.MarketHomeSubPage.UP_RANK
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.RKDWNf;
            String str = "up-rank";
            String str2 = "homeUpRank";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35025nnY();
        }
    };
    public static final MarketHomeSubPage NEW_COIN_RANK = new MarketHomeSubPage("NEW_COIN_RANK", 3) { // from class: com.okinc.okmarket.home.MarketHomeSubPage.NEW_COIN_RANK
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.RcXXUw;
            String str = "new-coin-rank";
            String str2 = "homeNewCoinRank";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35047nnu();
        }
    };
    public static final MarketHomeSubPage STOCK_RANK = new MarketHomeSubPage("STOCK_RANK", 4) { // from class: com.okinc.okmarket.home.MarketHomeSubPage.STOCK_RANK
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.GqbzPL;
            String str = "stock-rank";
            String str2 = "homeNewCoinRank";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35095nop();
        }
    };
    public static final MarketHomeSubPage DEX_RANK = new MarketHomeSubPage("DEX_RANK", 5) { // from class: com.okinc.okmarket.home.MarketHomeSubPage.DEX_RANK
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.DKtBnz;
            String str = "dex-rank";
            String str2 = "homeDexToken";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C34953nmF();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketHomeSubPage[] $values() {
        return new MarketHomeSubPage[]{FAVORITES, HOT_RANK, UP_RANK, NEW_COIN_RANK, STOCK_RANK, DEX_RANK};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String), (r5v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] call: com.okinc.okmarket.home.MarketHomeSubPage.<init>(java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MarketHomeSubPage(String str, int i, int i2, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketHomeSubPage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getE2eContentDescription() {
        return this.e2eContentDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageType() {
        return this.pageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40518qYv
    public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
        Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
        return this == interfaceC40518qYv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40518qYv
    public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
        Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
        return this == interfaceC40518qYv;
    }

    private MarketHomeSubPage(@StringRes String str, int i, int i2, String str2, String str3) {
        this.titleResId = i2;
        this.pageType = str2;
        this.e2eContentDescription = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 int)
  (r9v0 int)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.okmarket.home.MarketHomeSubPage.<init>(java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketHomeSubPage(String str, int i, int i2, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, (i3 & 4) != 0 ? "" : str3);
    }

    static {
        MarketHomeSubPage[] marketHomeSubPageArr$values = $values();
        $VALUES = marketHomeSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketHomeSubPageArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.MarketHomeSubPage.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final List<MarketHomeSubPage> KWHzl(boolean z, boolean z2) {
            List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(MarketHomeSubPage.FAVORITES);
            listOLrzqt.add(MarketHomeSubPage.HOT_RANK);
            if (z) {
                listOLrzqt.add(MarketHomeSubPage.NEW_COIN_RANK);
                if (z2) {
                    listOLrzqt.add(MarketHomeSubPage.STOCK_RANK);
                }
                listOLrzqt.add(MarketHomeSubPage.DEX_RANK);
                listOLrzqt.add(MarketHomeSubPage.UP_RANK);
            } else {
                listOLrzqt.add(MarketHomeSubPage.UP_RANK);
                listOLrzqt.add(MarketHomeSubPage.NEW_COIN_RANK);
                if (z2) {
                    listOLrzqt.add(MarketHomeSubPage.STOCK_RANK);
                }
            }
            return C56402yEa.fARcdN(listOLrzqt);
        }
    }

    public static MarketHomeSubPage valueOf(String str) {
        return (MarketHomeSubPage) Enum.valueOf(MarketHomeSubPage.class, str);
    }

    public static MarketHomeSubPage[] values() {
        return (MarketHomeSubPage[]) $VALUES.clone();
    }
}
