package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TpSlTypeConfigData {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TpSlTypeConfigData[] $VALUES;
    private final int title;
    private final String type;
    public static final TpSlTypeConfigData RATIO = new TpSlTypeConfigData("RATIO", 0, C55688xof.Application.getLastCustomNonConfigurationInstance, "tp_sl_ratio");
    public static final TpSlTypeConfigData PRICE = new TpSlTypeConfigData("PRICE", 1, C55688xof.Application.getMaxItemsactivity_release, "tp_sl_price");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TpSlTypeConfigData[] $values() {
        return new TpSlTypeConfigData[]{RATIO, PRICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TpSlTypeConfigData> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private TpSlTypeConfigData(@StringRes String str, int i, int i2, String str2) {
        this.title = i2;
        this.type = str2;
    }

    static {
        TpSlTypeConfigData[] tpSlTypeConfigDataArr$values = $values();
        $VALUES = tpSlTypeConfigDataArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tpSlTypeConfigDataArr$values);
    }

    public static TpSlTypeConfigData valueOf(String str) {
        return (TpSlTypeConfigData) Enum.valueOf(TpSlTypeConfigData.class, str);
    }

    public static TpSlTypeConfigData[] values() {
        return (TpSlTypeConfigData[]) $VALUES.clone();
    }
}
