package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivateTEEResult {
    public static final int $stable = 0;
    private final Boolean autoRenew;
    private final Long expireTimestamp;
    private final Long extendExpirePeriodDay;
    private final HPKEInfoData hpkeInfo;
    private final Boolean isActive;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivateTEEResult() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivateTEEResult copy$default(ActivateTEEResult activateTEEResult, Boolean bool, Long l, Long l2, Boolean bool2, HPKEInfoData hPKEInfoData, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = activateTEEResult.isActive;
        }
        if ((i & 2) != 0) {
            l = activateTEEResult.expireTimestamp;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = activateTEEResult.extendExpirePeriodDay;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            bool2 = activateTEEResult.autoRenew;
        }
        Boolean bool3 = bool2;
        if ((i & 16) != 0) {
            hPKEInfoData = activateTEEResult.hpkeInfo;
        }
        return activateTEEResult.copy(bool, l3, l4, bool3, hPKEInfoData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.extendExpirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEInfoData component5() {
        return this.hpkeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTEEResult copy(Boolean bool, Long l, Long l2, Boolean bool2, HPKEInfoData hPKEInfoData) {
        return new ActivateTEEResult(bool, l, l2, bool2, hPKEInfoData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateTEEResult)) {
            return false;
        }
        ActivateTEEResult activateTEEResult = (ActivateTEEResult) obj;
        return Intrinsics.EZpvd(this.isActive, activateTEEResult.isActive) && Intrinsics.EZpvd(this.expireTimestamp, activateTEEResult.expireTimestamp) && Intrinsics.EZpvd(this.extendExpirePeriodDay, activateTEEResult.extendExpirePeriodDay) && Intrinsics.EZpvd(this.autoRenew, activateTEEResult.autoRenew) && Intrinsics.EZpvd(this.hpkeInfo, activateTEEResult.hpkeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExtendExpirePeriodDay() {
        return this.extendExpirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEInfoData getHpkeInfo() {
        return this.hpkeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isActive;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Long l = this.expireTimestamp;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.extendExpirePeriodDay;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        Boolean bool2 = this.autoRenew;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        HPKEInfoData hPKEInfoData = this.hpkeInfo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (hPKEInfoData != null ? hPKEInfoData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateTEEResult(isActive=" + this.isActive + ", expireTimestamp=" + this.expireTimestamp + ", extendExpirePeriodDay=" + this.extendExpirePeriodDay + ", autoRenew=" + this.autoRenew + ", hpkeInfo=" + this.hpkeInfo + ")";
    }

    public ActivateTEEResult(Boolean bool, Long l, Long l2, Boolean bool2, HPKEInfoData hPKEInfoData) {
        this.isActive = bool;
        this.expireTimestamp = l;
        this.extendExpirePeriodDay = l2;
        this.autoRenew = bool2;
        this.hpkeInfo = hPKEInfoData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData) : (r9v0 com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData))
 A[MD:(java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Boolean, com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData):void (m)] (LINE:91) call: com.okinc.business.defi.wallet.tee.common.model.ActivateTEEResult.<init>(java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Boolean, com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData):void type: THIS */
    public /* synthetic */ ActivateTEEResult(Boolean bool, Long l, Long l2, Boolean bool2, HPKEInfoData hPKEInfoData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : hPKEInfoData);
    }
}
