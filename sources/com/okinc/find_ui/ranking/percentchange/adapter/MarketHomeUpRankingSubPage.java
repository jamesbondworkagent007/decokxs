package com.okinc.find_ui.ranking.percentchange.adapter;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35086nog;
import o.C35094noo;
import o.C56444yFp;
import o.InterfaceC40518qYv;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public abstract class MarketHomeUpRankingSubPage implements InterfaceC40518qYv {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketHomeUpRankingSubPage[] $VALUES;
    private final String contentDescription;
    private final int titleResId;
    public static final MarketHomeUpRankingSubPage SPOT = new MarketHomeUpRankingSubPage("SPOT", 0) { // from class: com.okinc.find_ui.ranking.percentchange.adapter.MarketHomeUpRankingSubPage.SPOT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.hUfVAv;
            String str = "SPOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35094noo();
        }
    };
    public static final MarketHomeUpRankingSubPage FUTURES = new MarketHomeUpRankingSubPage("FUTURES", 1) { // from class: com.okinc.find_ui.ranking.percentchange.adapter.MarketHomeUpRankingSubPage.FUTURES
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.DQnQnb;
            String str = "SWAP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35086nog();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketHomeUpRankingSubPage[] $values() {
        return new MarketHomeUpRankingSubPage[]{SPOT, FUTURES};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String):void (m)] call: com.okinc.find_ui.ranking.percentchange.adapter.MarketHomeUpRankingSubPage.<init>(java.lang.String, int, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MarketHomeUpRankingSubPage(String str, int i, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketHomeUpRankingSubPage> getEntries() {
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

    private MarketHomeUpRankingSubPage(@StringRes String str, int i, int i2, String str2) {
        this.titleResId = i2;
        this.contentDescription = str2;
    }

    static {
        MarketHomeUpRankingSubPage[] marketHomeUpRankingSubPageArr$values = $values();
        $VALUES = marketHomeUpRankingSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketHomeUpRankingSubPageArr$values);
    }

    public static MarketHomeUpRankingSubPage valueOf(String str) {
        return (MarketHomeUpRankingSubPage) Enum.valueOf(MarketHomeUpRankingSubPage.class, str);
    }

    public static MarketHomeUpRankingSubPage[] values() {
        return (MarketHomeUpRankingSubPage[]) $VALUES.clone();
    }
}
