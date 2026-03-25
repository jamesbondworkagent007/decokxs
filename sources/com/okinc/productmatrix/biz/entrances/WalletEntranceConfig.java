package com.okinc.productmatrix.biz.entrances;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WalletEntranceConfig {
    public static final int $stable = 8;
    private String grep;
    private int isHidden;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletEntranceConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletEntranceConfig copy$default(WalletEntranceConfig walletEntranceConfig, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = walletEntranceConfig.isHidden;
        }
        if ((i2 & 2) != 0) {
            str = walletEntranceConfig.grep;
        }
        return walletEntranceConfig.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean canShow() {
        return this.isHidden == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.grep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletEntranceConfig copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletEntranceConfig(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletEntranceConfig)) {
            return false;
        }
        WalletEntranceConfig walletEntranceConfig = (WalletEntranceConfig) obj;
        return this.isHidden == walletEntranceConfig.isHidden && Intrinsics.EZpvd((Object) this.grep, (Object) walletEntranceConfig.grep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGrep() {
        return this.grep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.isHidden) * 31) + this.grep.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGrep(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.grep = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHidden(int i) {
        this.isHidden = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletEntranceConfig(isHidden=" + this.isHidden + ", grep=" + this.grep + ")";
    }

    public WalletEntranceConfig(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isHidden = i;
        this.grep = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("100") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:58) call: com.okinc.productmatrix.biz.entrances.WalletEntranceConfig.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ WalletEntranceConfig(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "100" : str);
    }

    /* JADX INFO: renamed from: isHidden, reason: collision with other method in class */
    public boolean m7077isHidden() {
        return !canShow();
    }
}
