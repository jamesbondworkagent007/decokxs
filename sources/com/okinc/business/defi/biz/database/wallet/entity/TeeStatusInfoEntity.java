package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeStatusInfoEntity {
    public static final int $stable = 0;
    private final String accountId;
    private final int autoRenew;
    private final int canUseSa2;
    private final long createAt;
    private final long expiredTimestamp;
    private final boolean hasShowExpiredAlert;
    private final boolean isActive;
    private final boolean isCreated;
    private final boolean isDisabledByUser;
    private final boolean isVerify;
    private final int model;
    private final String teeId;
    private final long updateAt;
    private final int upgradeStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.hasShowExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isDisabledByUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeStatusInfoEntity copy(@NotNull String str, @NotNull String str2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, long j2, long j3, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TeeStatusInfoEntity(str, str2, z, z2, j, z3, z4, z5, j2, j3, i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeStatusInfoEntity)) {
            return false;
        }
        TeeStatusInfoEntity teeStatusInfoEntity = (TeeStatusInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeStatusInfoEntity.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) teeStatusInfoEntity.teeId) && this.isCreated == teeStatusInfoEntity.isCreated && this.isActive == teeStatusInfoEntity.isActive && this.expiredTimestamp == teeStatusInfoEntity.expiredTimestamp && this.isVerify == teeStatusInfoEntity.isVerify && this.hasShowExpiredAlert == teeStatusInfoEntity.hasShowExpiredAlert && this.isDisabledByUser == teeStatusInfoEntity.isDisabledByUser && this.createAt == teeStatusInfoEntity.createAt && this.updateAt == teeStatusInfoEntity.updateAt && this.model == teeStatusInfoEntity.model && this.canUseSa2 == teeStatusInfoEntity.canUseSa2 && this.autoRenew == teeStatusInfoEntity.autoRenew && this.upgradeStatus == teeStatusInfoEntity.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCanUseSa2() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiredTimestamp() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasShowExpiredAlert() {
        return this.hasShowExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateAt() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.accountId.hashCode() * 31) + this.teeId.hashCode()) * 31) + Boolean.hashCode(this.isCreated)) * 31) + Boolean.hashCode(this.isActive)) * 31) + Long.hashCode(this.expiredTimestamp)) * 31) + Boolean.hashCode(this.isVerify)) * 31) + Boolean.hashCode(this.hasShowExpiredAlert)) * 31) + Boolean.hashCode(this.isDisabledByUser)) * 31) + Long.hashCode(this.createAt)) * 31) + Long.hashCode(this.updateAt)) * 31) + Integer.hashCode(this.model)) * 31) + Integer.hashCode(this.canUseSa2)) * 31) + Integer.hashCode(this.autoRenew)) * 31) + Integer.hashCode(this.upgradeStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCreated() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDisabledByUser() {
        return this.isDisabledByUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVerify() {
        return this.isVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeStatusInfoEntity(accountId=" + this.accountId + ", teeId=" + this.teeId + ", isCreated=" + this.isCreated + ", isActive=" + this.isActive + ", expiredTimestamp=" + this.expiredTimestamp + ", isVerify=" + this.isVerify + ", hasShowExpiredAlert=" + this.hasShowExpiredAlert + ", isDisabledByUser=" + this.isDisabledByUser + ", createAt=" + this.createAt + ", updateAt=" + this.updateAt + ", model=" + this.model + ", canUseSa2=" + this.canUseSa2 + ", autoRenew=" + this.autoRenew + ", upgradeStatus=" + this.upgradeStatus + ")";
    }

    public TeeStatusInfoEntity(@NotNull String str, @NotNull String str2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, long j2, long j3, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountId = str;
        this.teeId = str2;
        this.isCreated = z;
        this.isActive = z2;
        this.expiredTimestamp = j;
        this.isVerify = z3;
        this.hasShowExpiredAlert = z4;
        this.isDisabledByUser = z5;
        this.createAt = j2;
        this.updateAt = j3;
        this.model = i;
        this.canUseSa2 = i2;
        this.autoRenew = i3;
        this.upgradeStatus = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 boolean)
  (r25v0 boolean)
  (r26v0 long)
  (r28v0 boolean)
  (r29v0 boolean)
  (r30v0 boolean)
  (r31v0 long)
  (r33v0 long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, long, boolean, boolean, boolean, long, long, int, int, int, int):void (m)] (LINE:21) call: com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity.<init>(java.lang.String, java.lang.String, boolean, boolean, long, boolean, boolean, boolean, long, long, int, int, int, int):void type: THIS */
    public /* synthetic */ TeeStatusInfoEntity(String str, String str2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, long j2, long j3, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2, j, z3, z4, z5, j2, j3, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? 0 : i2, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? 0 : i4);
    }
}
