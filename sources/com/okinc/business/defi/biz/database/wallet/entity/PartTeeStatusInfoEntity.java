package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PartTeeStatusInfoEntity {
    public static final int $stable = 0;
    private final String accountId;
    private final int autoRenew;
    private final int canUseSa2;
    private final long expiredTimestamp;
    private final boolean hasShowExpiredAlert;
    private final boolean isActive;
    private final boolean isCreated;
    private final boolean isDisabledByUser;
    private final boolean isVerify;
    private final long updateAt;
    private final int upgradeStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.hasShowExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isDisabledByUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PartTeeStatusInfoEntity copy(@NotNull String str, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, long j2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PartTeeStatusInfoEntity(str, z, z2, j, z3, z4, z5, j2, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartTeeStatusInfoEntity)) {
            return false;
        }
        PartTeeStatusInfoEntity partTeeStatusInfoEntity = (PartTeeStatusInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) partTeeStatusInfoEntity.accountId) && this.isCreated == partTeeStatusInfoEntity.isCreated && this.isActive == partTeeStatusInfoEntity.isActive && this.expiredTimestamp == partTeeStatusInfoEntity.expiredTimestamp && this.isVerify == partTeeStatusInfoEntity.isVerify && this.hasShowExpiredAlert == partTeeStatusInfoEntity.hasShowExpiredAlert && this.isDisabledByUser == partTeeStatusInfoEntity.isDisabledByUser && this.updateAt == partTeeStatusInfoEntity.updateAt && this.canUseSa2 == partTeeStatusInfoEntity.canUseSa2 && this.autoRenew == partTeeStatusInfoEntity.autoRenew && this.upgradeStatus == partTeeStatusInfoEntity.upgradeStatus;
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
    public final long getExpiredTimestamp() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasShowExpiredAlert() {
        return this.hasShowExpiredAlert;
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
        return (((((((((((((((((((this.accountId.hashCode() * 31) + Boolean.hashCode(this.isCreated)) * 31) + Boolean.hashCode(this.isActive)) * 31) + Long.hashCode(this.expiredTimestamp)) * 31) + Boolean.hashCode(this.isVerify)) * 31) + Boolean.hashCode(this.hasShowExpiredAlert)) * 31) + Boolean.hashCode(this.isDisabledByUser)) * 31) + Long.hashCode(this.updateAt)) * 31) + Integer.hashCode(this.canUseSa2)) * 31) + Integer.hashCode(this.autoRenew)) * 31) + Integer.hashCode(this.upgradeStatus);
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
        return "PartTeeStatusInfoEntity(accountId=" + this.accountId + ", isCreated=" + this.isCreated + ", isActive=" + this.isActive + ", expiredTimestamp=" + this.expiredTimestamp + ", isVerify=" + this.isVerify + ", hasShowExpiredAlert=" + this.hasShowExpiredAlert + ", isDisabledByUser=" + this.isDisabledByUser + ", updateAt=" + this.updateAt + ", canUseSa2=" + this.canUseSa2 + ", autoRenew=" + this.autoRenew + ", upgradeStatus=" + this.upgradeStatus + ")";
    }

    public PartTeeStatusInfoEntity(@NotNull String str, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, long j2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.isCreated = z;
        this.isActive = z2;
        this.expiredTimestamp = j;
        this.isVerify = z3;
        this.hasShowExpiredAlert = z4;
        this.isDisabledByUser = z5;
        this.updateAt = j2;
        this.canUseSa2 = i;
        this.autoRenew = i2;
        this.upgradeStatus = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 boolean)
  (r20v0 boolean)
  (r21v0 long)
  (r23v0 boolean)
  (r24v0 boolean)
  (r25v0 boolean)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:69)) : (r26v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
 A[MD:(java.lang.String, boolean, boolean, long, boolean, boolean, boolean, long, int, int, int):void (m)] (LINE:53) call: com.okinc.business.defi.biz.database.wallet.entity.PartTeeStatusInfoEntity.<init>(java.lang.String, boolean, boolean, long, boolean, boolean, boolean, long, int, int, int):void type: THIS */
    public /* synthetic */ PartTeeStatusInfoEntity(String str, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, long j2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, j, z3, z4, z5, (i4 & 128) != 0 ? System.currentTimeMillis() : j2, (i4 & 256) != 0 ? 0 : i, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) != 0 ? 0 : i3);
    }
}
