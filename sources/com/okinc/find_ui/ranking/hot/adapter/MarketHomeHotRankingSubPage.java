package com.okinc.find_ui.ranking.hot.adapter;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35034nnh;
import o.C35041nno;
import o.C56444yFp;
import o.InterfaceC40518qYv;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public abstract class MarketHomeHotRankingSubPage implements InterfaceC40518qYv {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketHomeHotRankingSubPage[] $VALUES;
    private final String contentDescription;
    private final int titleResId;
    public static final MarketHomeHotRankingSubPage SPOT = new MarketHomeHotRankingSubPage("SPOT", 0) { // from class: com.okinc.find_ui.ranking.hot.adapter.MarketHomeHotRankingSubPage.SPOT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.hUfVAv;
            String str = "SPOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35041nno();
        }
    };
    public static final MarketHomeHotRankingSubPage FUTURES = new MarketHomeHotRankingSubPage("FUTURES", 1) { // from class: com.okinc.find_ui.ranking.hot.adapter.MarketHomeHotRankingSubPage.FUTURES
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.DQnQnb;
            String str = "SWAP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35034nnh();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketHomeHotRankingSubPage[] $values() {
        return new MarketHomeHotRankingSubPage[]{SPOT, FUTURES};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String):void (m)] call: com.okinc.find_ui.ranking.hot.adapter.MarketHomeHotRankingSubPage.<init>(java.lang.String, int, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MarketHomeHotRankingSubPage(String str, int i, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketHomeHotRankingSubPage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDescription() {
        return this.contentDescription;
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

    private MarketHomeHotRankingSubPage(@StringRes String str, int i, int i2, String str2) {
        this.titleResId = i2;
        this.contentDescription = str2;
    }

    static {
        MarketHomeHotRankingSubPage[] marketHomeHotRankingSubPageArr$values = $values();
        $VALUES = marketHomeHotRankingSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketHomeHotRankingSubPageArr$values);
    }

    public static MarketHomeHotRankingSubPage valueOf(String str) {
        return (MarketHomeHotRankingSubPage) Enum.valueOf(MarketHomeHotRankingSubPage.class, str);
    }

    public static MarketHomeHotRankingSubPage[] values() {
        return (MarketHomeHotRankingSubPage[]) $VALUES.clone();
    }
}
