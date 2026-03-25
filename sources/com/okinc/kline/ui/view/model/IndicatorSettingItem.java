package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class IndicatorSettingItem {
    public static final int $stable = 8;
    private String itemTittle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndicatorSettingItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IndicatorSettingItem copy$default(IndicatorSettingItem indicatorSettingItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorSettingItem.itemTittle;
        }
        return indicatorSettingItem.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.itemTittle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndicatorSettingItem copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IndicatorSettingItem(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IndicatorSettingItem) && Intrinsics.EZpvd((Object) this.itemTittle, (Object) ((IndicatorSettingItem) obj).itemTittle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getItemTittle() {
        return this.itemTittle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.itemTittle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemTittle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.itemTittle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndicatorSettingItem(itemTittle=" + this.itemTittle + ")";
    }

    public IndicatorSettingItem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.itemTittle = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:14) call: com.okinc.kline.ui.view.model.IndicatorSettingItem.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ IndicatorSettingItem(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
