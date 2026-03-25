package com.okinc.business.market.features.alert.create.coinselect.tokenlist.data;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C22366hdx;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class AlertMarketCapUnit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertMarketCapUnit[] $VALUES;
    private final String contentDescription;
    private final int descriptionResId;
    private final int multiplier;
    private final int titleResId;
    public static final AlertMarketCapUnit B = new AlertMarketCapUnit("B", 0, C22366hdx.StateListAnimator.djBIcL, C22366hdx.StateListAnimator.EZpvd, 1000000000, "web3_dex_market_alert_unit_item_billion");
    public static final AlertMarketCapUnit M = new AlertMarketCapUnit("M", 1, C22366hdx.StateListAnimator.gEmmrt, C22366hdx.StateListAnimator.KWHzl, 1000000, null, 8, null);
    public static final AlertMarketCapUnit K = new AlertMarketCapUnit("K", 2, C23274hvD.Fragment.gRtANS, C22366hdx.StateListAnimator.valueOf, 1000, null, 8, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertMarketCapUnit[] $values() {
        return new AlertMarketCapUnit[]{B, M, K};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertMarketCapUnit> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMultiplier() {
        return this.multiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    private AlertMarketCapUnit(@StringRes String str, @StringRes int i, int i2, int i3, int i4, String str2) {
        this.titleResId = i2;
        this.descriptionResId = i3;
        this.multiplier = i4;
        this.contentDescription = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 int)
  (r11v0 int)
  (r12v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, int, int, int, int, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.market.features.alert.create.coinselect.tokenlist.data.AlertMarketCapUnit.<init>(java.lang.String, int, int, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ AlertMarketCapUnit(String str, int i, int i2, int i3, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, i4, (i5 & 8) != 0 ? null : str2);
    }

    static {
        AlertMarketCapUnit[] alertMarketCapUnitArr$values = $values();
        $VALUES = alertMarketCapUnitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertMarketCapUnitArr$values);
    }

    public static AlertMarketCapUnit valueOf(String str) {
        return (AlertMarketCapUnit) Enum.valueOf(AlertMarketCapUnit.class, str);
    }

    public static AlertMarketCapUnit[] values() {
        return (AlertMarketCapUnit[]) $VALUES.clone();
    }
}
