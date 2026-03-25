package com.okinc.find_ui.ranking.newcoin.adapter;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35010nnJ;
import o.C35014nnN;
import o.C56444yFp;
import o.InterfaceC40518qYv;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public abstract class MarketNewCoinSubPage implements InterfaceC40518qYv {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketNewCoinSubPage[] $VALUES;
    private final String contentDescription;
    private final int titleResId;
    public static final MarketNewCoinSubPage SPOT = new MarketNewCoinSubPage("SPOT", 0) { // from class: com.okinc.find_ui.ranking.newcoin.adapter.MarketNewCoinSubPage.SPOT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.hUfVAv;
            String str = "SPOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35014nnN();
        }
    };
    public static final MarketNewCoinSubPage FUTURES = new MarketNewCoinSubPage("FUTURES", 1) { // from class: com.okinc.find_ui.ranking.newcoin.adapter.MarketNewCoinSubPage.FUTURES
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = qZH.PendingIntent.DQnQnb;
            String str = "FUTURES";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC40518qYv
        public Fragment createFragment() {
            return new C35010nnJ();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketNewCoinSubPage[] $values() {
        return new MarketNewCoinSubPage[]{SPOT, FUTURES};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String):void (m)] call: com.okinc.find_ui.ranking.newcoin.adapter.MarketNewCoinSubPage.<init>(java.lang.String, int, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MarketNewCoinSubPage(String str, int i, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketNewCoinSubPage> getEntries() {
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

    private MarketNewCoinSubPage(@StringRes String str, int i, int i2, String str2) {
        this.titleResId = i2;
        this.contentDescription = str2;
    }

    static {
        MarketNewCoinSubPage[] marketNewCoinSubPageArr$values = $values();
        $VALUES = marketNewCoinSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketNewCoinSubPageArr$values);
    }

    public static MarketNewCoinSubPage valueOf(String str) {
        return (MarketNewCoinSubPage) Enum.valueOf(MarketNewCoinSubPage.class, str);
    }

    public static MarketNewCoinSubPage[] values() {
        return (MarketNewCoinSubPage[]) $VALUES.clone();
    }
}
