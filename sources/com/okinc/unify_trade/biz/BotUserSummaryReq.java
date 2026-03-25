package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotUserSummaryReq {
    public static final int $stable = 0;
    private final boolean isNeedWs;
    private final String orderType;
    private final String preferUnit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotUserSummaryReq copy$default(BotUserSummaryReq botUserSummaryReq, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = botUserSummaryReq.isNeedWs;
        }
        if ((i & 2) != 0) {
            str = botUserSummaryReq.preferUnit;
        }
        if ((i & 4) != 0) {
            str2 = botUserSummaryReq.orderType;
        }
        return botUserSummaryReq.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isNeedWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.preferUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUserSummaryReq copy(boolean z, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BotUserSummaryReq(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotUserSummaryReq)) {
            return false;
        }
        BotUserSummaryReq botUserSummaryReq = (BotUserSummaryReq) obj;
        return this.isNeedWs == botUserSummaryReq.isNeedWs && Intrinsics.EZpvd((Object) this.preferUnit, (Object) botUserSummaryReq.preferUnit) && Intrinsics.EZpvd((Object) this.orderType, (Object) botUserSummaryReq.orderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreferUnit() {
        return this.preferUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNeedWs);
        int iHashCode2 = this.preferUnit.hashCode();
        String str = this.orderType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedWs() {
        return this.isNeedWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotUserSummaryReq(isNeedWs=" + this.isNeedWs + ", preferUnit=" + this.preferUnit + ", orderType=" + this.orderType + ")";
    }

    public BotUserSummaryReq(boolean z, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isNeedWs = z;
        this.preferUnit = str;
        this.orderType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:1111) call: com.okinc.unify_trade.biz.BotUserSummaryReq.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotUserSummaryReq(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, str, (i & 4) != 0 ? null : str2);
    }
}
