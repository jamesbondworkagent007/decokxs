package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TeeExtendResultItemData {
    public static final int $stable = 0;
    private final String accountId;
    private final Boolean autoRenew;
    private final Long expireTimestamp;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeExtendResultItemData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeExtendResultItemData copy$default(TeeExtendResultItemData teeExtendResultItemData, String str, String str2, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeExtendResultItemData.accountId;
        }
        if ((i & 2) != 0) {
            str2 = teeExtendResultItemData.teeId;
        }
        if ((i & 4) != 0) {
            l = teeExtendResultItemData.expireTimestamp;
        }
        if ((i & 8) != 0) {
            bool = teeExtendResultItemData.autoRenew;
        }
        return teeExtendResultItemData.copy(str, str2, l, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeExtendResultItemData copy(String str, String str2, Long l, Boolean bool) {
        return new TeeExtendResultItemData(str, str2, l, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeExtendResultItemData)) {
            return false;
        }
        TeeExtendResultItemData teeExtendResultItemData = (TeeExtendResultItemData) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeExtendResultItemData.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) teeExtendResultItemData.teeId) && Intrinsics.EZpvd(this.expireTimestamp, teeExtendResultItemData.expireTimestamp) && Intrinsics.EZpvd(this.autoRenew, teeExtendResultItemData.autoRenew);
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
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.teeId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.expireTimestamp;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Boolean bool = this.autoRenew;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeExtendResultItemData(accountId=" + this.accountId + ", teeId=" + this.teeId + ", expireTimestamp=" + this.expireTimestamp + ", autoRenew=" + this.autoRenew + ")";
    }

    public TeeExtendResultItemData(String str, String str2, Long l, Boolean bool) {
        this.accountId = str;
        this.teeId = str2;
        this.expireTimestamp = l;
        this.autoRenew = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r4v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean):void (m)] (LINE:146) call: com.okinc.business.defi.wallet.tee.common.model.TeeExtendResultItemData.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TeeExtendResultItemData(String str, String str2, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : bool);
    }
}
