package com.okinc.find_ui.ranking.stock.adapter;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import o.C35074noU;
import o.C56444yFp;
import o.InterfaceC40518qYv;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class MarketStockSubPage implements InterfaceC40518qYv {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketStockSubPage[] $VALUES;
    private final String contentDescription;
    private final int titleResId;
    public static final MarketStockSubPage SPOT = new MarketStockSubPage("SPOT", 0, qZH.PendingIntent.hUfVAv, "SPOT");
    public static final MarketStockSubPage FUTURES = new MarketStockSubPage("FUTURES", 1, qZH.PendingIntent.DQnQnb, "SWAP");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketStockSubPage[] $values() {
        return new MarketStockSubPage[]{SPOT, FUTURES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketStockSubPage> getEntries() {
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

    private MarketStockSubPage(@StringRes String str, int i, int i2, String str2) {
        this.titleResId = i2;
        this.contentDescription = str2;
    }

    static {
        MarketStockSubPage[] marketStockSubPageArr$values = $values();
        $VALUES = marketStockSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketStockSubPageArr$values);
    }

    @Override // o.InterfaceC40518qYv
    public Fragment createFragment() {
        return C35074noU.Companion.EZpvd(this.contentDescription);
    }

    public static MarketStockSubPage valueOf(String str) {
        return (MarketStockSubPage) Enum.valueOf(MarketStockSubPage.class, str);
    }

    public static MarketStockSubPage[] values() {
        return (MarketStockSubPage[]) $VALUES.clone();
    }
}
