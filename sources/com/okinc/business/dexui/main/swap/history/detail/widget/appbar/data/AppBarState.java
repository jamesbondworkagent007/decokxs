package com.okinc.business.dexui.main.swap.history.detail.widget.appbar.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AppBarState {
    public static final int $stable = 0;
    private final boolean isFacetSwap;
    private final boolean isLimit;
    private final String state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppBarState copy$default(AppBarState appBarState, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appBarState.isLimit;
        }
        if ((i & 2) != 0) {
            str = appBarState.state;
        }
        if ((i & 4) != 0) {
            z2 = appBarState.isFacetSwap;
        }
        return appBarState.copy(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isFacetSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppBarState copy(boolean z, @NotNull String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AppBarState(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBarState)) {
            return false;
        }
        AppBarState appBarState = (AppBarState) obj;
        return this.isLimit == appBarState.isLimit && Intrinsics.EZpvd((Object) this.state, (Object) appBarState.state) && this.isFacetSwap == appBarState.isFacetSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.isLimit) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.isFacetSwap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFacetSwap() {
        return this.isFacetSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLimit() {
        return this.isLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppBarState(isLimit=" + this.isLimit + ", state=" + this.state + ", isFacetSwap=" + this.isFacetSwap + ")";
    }

    public AppBarState(boolean z, @NotNull String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isLimit = z;
        this.state = str;
        this.isFacetSwap = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, java.lang.String, boolean):void (m)] (LINE:6) call: com.okinc.business.dexui.main.swap.history.detail.widget.appbar.data.AppBarState.<init>(boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AppBarState(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? false : z2);
    }
}
