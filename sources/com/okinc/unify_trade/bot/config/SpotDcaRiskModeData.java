package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SpotDcaRiskModeData {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SpotDcaRiskModeData[] $VALUES;
    private final int desc;
    private final String mode;
    private final int showMode;
    public static final SpotDcaRiskModeData CONSERVATIVE = new SpotDcaRiskModeData("CONSERVATIVE", 0, "conservative", C55688xof.Application.TarCU, C55688xof.Application.DsrFlB);
    public static final SpotDcaRiskModeData MODERATE = new SpotDcaRiskModeData("MODERATE", 1, "moderate", C55688xof.Application.ULRxlR, C55688xof.Application.DaRZkR);
    public static final SpotDcaRiskModeData AGGRESSIVE = new SpotDcaRiskModeData("AGGRESSIVE", 2, "aggressive", C55688xof.Application.UhxbNG, C55688xof.Application.DGgnkA);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SpotDcaRiskModeData[] $values() {
        return new SpotDcaRiskModeData[]{CONSERVATIVE, MODERATE, AGGRESSIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SpotDcaRiskModeData> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private SpotDcaRiskModeData(String str, @StringRes int i, @StringRes String str2, int i2, int i3) {
        this.mode = str2;
        this.showMode = i2;
        this.desc = i3;
    }

    static {
        SpotDcaRiskModeData[] spotDcaRiskModeDataArr$values = $values();
        $VALUES = spotDcaRiskModeDataArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(spotDcaRiskModeDataArr$values);
    }

    public static SpotDcaRiskModeData valueOf(String str) {
        return (SpotDcaRiskModeData) Enum.valueOf(SpotDcaRiskModeData.class, str);
    }

    public static SpotDcaRiskModeData[] values() {
        return (SpotDcaRiskModeData[]) $VALUES.clone();
    }
}
