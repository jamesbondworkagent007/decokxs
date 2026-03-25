package com.okinc.productmatrix.biz.entrances;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class CommonEntranceConfig {
    public static final int $stable = 8;
    private int isHidden;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonEntranceConfig() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonEntranceConfig copy$default(CommonEntranceConfig commonEntranceConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commonEntranceConfig.isHidden;
        }
        return commonEntranceConfig.copy(i);
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
    public final CommonEntranceConfig copy(int i) {
        return new CommonEntranceConfig(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonEntranceConfig) && this.isHidden == ((CommonEntranceConfig) obj).isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHidden(int i) {
        this.isHidden = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonEntranceConfig(isHidden=" + this.isHidden + ")";
    }

    public CommonEntranceConfig(int i) {
        this.isHidden = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:38) call: com.okinc.productmatrix.biz.entrances.CommonEntranceConfig.<init>(int):void type: THIS */
    public /* synthetic */ CommonEntranceConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: isHidden, reason: collision with other method in class */
    public boolean m7072isHidden() {
        return !canShow();
    }
}
