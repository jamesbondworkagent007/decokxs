package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SepInfoEntity {
    public static final int $stable = 8;
    private long coinId;
    private String state;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SepInfoEntity() {
        this(null, 0L, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SepInfoEntity copy$default(SepInfoEntity sepInfoEntity, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sepInfoEntity.walletId;
        }
        if ((i & 2) != 0) {
            j = sepInfoEntity.coinId;
        }
        if ((i & 4) != 0) {
            str2 = sepInfoEntity.state;
        }
        return sepInfoEntity.copy(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SepInfoEntity copy(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SepInfoEntity(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SepInfoEntity)) {
            return false;
        }
        SepInfoEntity sepInfoEntity = (SepInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) sepInfoEntity.walletId) && this.coinId == sepInfoEntity.coinId && Intrinsics.EZpvd((Object) this.state, (Object) sepInfoEntity.state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.state.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SepInfoEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", state=" + this.state + ")";
    }

    public SepInfoEntity(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.walletId = str;
        this.coinId = j;
        this.state = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r3v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String):void (m)] (LINE:20) call: com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity.<init>(java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ SepInfoEntity(String str, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2);
    }
}
