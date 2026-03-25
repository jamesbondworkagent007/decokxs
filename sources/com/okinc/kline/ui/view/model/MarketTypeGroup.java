package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MarketTypeGroup {
    public static final int $stable = 8;
    private String selectGroupName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketTypeGroup() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketTypeGroup copy$default(MarketTypeGroup marketTypeGroup, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketTypeGroup.selectGroupName;
        }
        return marketTypeGroup.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.selectGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTypeGroup copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketTypeGroup(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketTypeGroup) && Intrinsics.EZpvd((Object) this.selectGroupName, (Object) ((MarketTypeGroup) obj).selectGroupName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectGroupName() {
        return this.selectGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.selectGroupName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectGroupName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selectGroupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketTypeGroup(selectGroupName=" + this.selectGroupName + ")";
    }

    public MarketTypeGroup(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selectGroupName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:11) call: com.okinc.kline.ui.view.model.MarketTypeGroup.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ MarketTypeGroup(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
