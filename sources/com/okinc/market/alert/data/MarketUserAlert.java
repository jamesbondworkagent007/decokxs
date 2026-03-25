package com.okinc.market.alert.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MarketUserAlert {
    public static final int $stable = 0;
    private final String chainId;
    private final long createTime;
    private final long id;
    private final String instId;
    private final String instType;
    private final String ruleId;
    private final String tokenAddress;
    private final String userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketUserAlert copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new MarketUserAlert(j, str, str2, str3, j2, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketUserAlert)) {
            return false;
        }
        MarketUserAlert marketUserAlert = (MarketUserAlert) obj;
        return this.id == marketUserAlert.id && Intrinsics.EZpvd((Object) this.instId, (Object) marketUserAlert.instId) && Intrinsics.EZpvd((Object) this.userId, (Object) marketUserAlert.userId) && Intrinsics.EZpvd((Object) this.instType, (Object) marketUserAlert.instType) && this.createTime == marketUserAlert.createTime && Intrinsics.EZpvd((Object) this.ruleId, (Object) marketUserAlert.ruleId) && Intrinsics.EZpvd((Object) this.chainId, (Object) marketUserAlert.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) marketUserAlert.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + this.instId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.instType.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.ruleId.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.tokenAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketUserAlert(id=" + this.id + ", instId=" + this.instId + ", userId=" + this.userId + ", instType=" + this.instType + ", createTime=" + this.createTime + ", ruleId=" + this.ruleId + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public MarketUserAlert(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = j;
        this.instId = str;
        this.userId = str2;
        this.instType = str3;
        this.createTime = j2;
        this.ruleId = str4;
        this.chainId = str5;
        this.tokenAddress = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 long)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.market.alert.data.MarketUserAlert.<init>(long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketUserAlert(long j, String str, String str2, String str3, long j2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3, j2, str4, str5, str6);
    }
}
