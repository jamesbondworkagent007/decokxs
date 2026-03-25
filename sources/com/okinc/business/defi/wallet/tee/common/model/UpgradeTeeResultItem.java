package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UpgradeTeeResultItem {
    public static final int $stable = 0;
    private final String accountId;
    private final Boolean autoRenew;
    private final Long expireTimestamp;
    private final HPKEInfoData hpkeInfo;
    private final boolean isActive;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpgradeTeeResultItem() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpgradeTeeResultItem copy$default(UpgradeTeeResultItem upgradeTeeResultItem, String str, Long l, String str2, boolean z, Boolean bool, HPKEInfoData hPKEInfoData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradeTeeResultItem.accountId;
        }
        if ((i & 2) != 0) {
            l = upgradeTeeResultItem.expireTimestamp;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str2 = upgradeTeeResultItem.teeId;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = upgradeTeeResultItem.isActive;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            bool = upgradeTeeResultItem.autoRenew;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            hPKEInfoData = upgradeTeeResultItem.hpkeInfo;
        }
        return upgradeTeeResultItem.copy(str, l2, str3, z2, bool2, hPKEInfoData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEInfoData component6() {
        return this.hpkeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeTeeResultItem copy(String str, Long l, String str2, boolean z, Boolean bool, HPKEInfoData hPKEInfoData) {
        return new UpgradeTeeResultItem(str, l, str2, z, bool, hPKEInfoData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradeTeeResultItem)) {
            return false;
        }
        UpgradeTeeResultItem upgradeTeeResultItem = (UpgradeTeeResultItem) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) upgradeTeeResultItem.accountId) && Intrinsics.EZpvd(this.expireTimestamp, upgradeTeeResultItem.expireTimestamp) && Intrinsics.EZpvd((Object) this.teeId, (Object) upgradeTeeResultItem.teeId) && this.isActive == upgradeTeeResultItem.isActive && Intrinsics.EZpvd(this.autoRenew, upgradeTeeResultItem.autoRenew) && Intrinsics.EZpvd(this.hpkeInfo, upgradeTeeResultItem.hpkeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
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
    public final HPKEInfoData getHpkeInfo() {
        return this.hpkeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.expireTimestamp;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.teeId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isActive);
        Boolean bool = this.autoRenew;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        HPKEInfoData hPKEInfoData = this.hpkeInfo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (hPKEInfoData != null ? hPKEInfoData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpgradeTeeResultItem(accountId=" + this.accountId + ", expireTimestamp=" + this.expireTimestamp + ", teeId=" + this.teeId + ", isActive=" + this.isActive + ", autoRenew=" + this.autoRenew + ", hpkeInfo=" + this.hpkeInfo + ")";
    }

    public UpgradeTeeResultItem(String str, Long l, String str2, boolean z, Boolean bool, HPKEInfoData hPKEInfoData) {
        this.accountId = str;
        this.expireTimestamp = l;
        this.teeId = str2;
        this.isActive = z;
        this.autoRenew = bool;
        this.hpkeInfo = hPKEInfoData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:boolean:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData) : (r11v0 com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, boolean, java.lang.Boolean, com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData):void (m)] (LINE:112) call: com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResultItem.<init>(java.lang.String, java.lang.Long, java.lang.String, boolean, java.lang.Boolean, com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData):void type: THIS */
    public /* synthetic */ UpgradeTeeResultItem(String str, Long l, String str2, boolean z, Boolean bool, HPKEInfoData hPKEInfoData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : hPKEInfoData);
    }
}
