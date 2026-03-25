package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class QuickOrderInfo {
    public static final int $stable = 8;
    private String instId;
    private String instType;
    private boolean isCanTrade;
    private boolean isFirstTrade;
    private String orderType;
    private String side;
    private String stayTime;
    private int step;
    private String successCount;
    private UserQuickOrderOperation userOperation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isFirstTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserQuickOrderOperation component10() {
        return this.userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isCanTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.successCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickOrderInfo copy(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, UserQuickOrderOperation userQuickOrderOperation) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new QuickOrderInfo(z, z2, str, str2, str3, str4, str5, str6, i, userQuickOrderOperation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickOrderInfo)) {
            return false;
        }
        QuickOrderInfo quickOrderInfo = (QuickOrderInfo) obj;
        return this.isFirstTrade == quickOrderInfo.isFirstTrade && this.isCanTrade == quickOrderInfo.isCanTrade && Intrinsics.EZpvd((Object) this.instId, (Object) quickOrderInfo.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) quickOrderInfo.instType) && Intrinsics.EZpvd((Object) this.stayTime, (Object) quickOrderInfo.stayTime) && Intrinsics.EZpvd((Object) this.successCount, (Object) quickOrderInfo.successCount) && Intrinsics.EZpvd((Object) this.side, (Object) quickOrderInfo.side) && Intrinsics.EZpvd((Object) this.orderType, (Object) quickOrderInfo.orderType) && this.step == quickOrderInfo.step && Intrinsics.EZpvd(this.userOperation, quickOrderInfo.userOperation);
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
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStayTime() {
        return this.stayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuccessCount() {
        return this.successCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserQuickOrderOperation getUserOperation() {
        return this.userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFirstTrade);
        int iHashCode2 = Boolean.hashCode(this.isCanTrade);
        int iHashCode3 = this.instId.hashCode();
        int iHashCode4 = this.instType.hashCode();
        int iHashCode5 = this.stayTime.hashCode();
        int iHashCode6 = this.successCount.hashCode();
        int iHashCode7 = this.side.hashCode();
        int iHashCode8 = this.orderType.hashCode();
        int iHashCode9 = Integer.hashCode(this.step);
        UserQuickOrderOperation userQuickOrderOperation = this.userOperation;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (userQuickOrderOperation == null ? 0 : userQuickOrderOperation.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCanTrade() {
        return this.isCanTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFirstTrade() {
        return this.isFirstTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTrade(boolean z) {
        this.isCanTrade = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstTrade(boolean z) {
        this.isFirstTrade = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStayTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stayTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStep(int i) {
        this.step = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccessCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.successCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserOperation(UserQuickOrderOperation userQuickOrderOperation) {
        this.userOperation = userQuickOrderOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuickOrderInfo(isFirstTrade=" + this.isFirstTrade + ", isCanTrade=" + this.isCanTrade + ", instId=" + this.instId + ", instType=" + this.instType + ", stayTime=" + this.stayTime + ", successCount=" + this.successCount + ", side=" + this.side + ", orderType=" + this.orderType + ", step=" + this.step + ", userOperation=" + this.userOperation + ")";
    }

    public QuickOrderInfo(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, UserQuickOrderOperation userQuickOrderOperation) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.isFirstTrade = z;
        this.isCanTrade = z2;
        this.instId = str;
        this.instType = str2;
        this.stayTime = str3;
        this.successCount = str4;
        this.side = str5;
        this.orderType = str6;
        this.step = i;
        this.userOperation = userQuickOrderOperation;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 int)
  (wrap:com.okinc.unify_trade.manager.UserQuickOrderOperation:?: TERNARY null = ((wrap:int:0x0044: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.manager.UserQuickOrderOperation) : (r24v0 com.okinc.unify_trade.manager.UserQuickOrderOperation))
 A[MD:(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.unify_trade.manager.UserQuickOrderOperation):void (m)] (LINE:897) call: com.okinc.unify_trade.manager.QuickOrderInfo.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.unify_trade.manager.UserQuickOrderOperation):void type: THIS */
    public /* synthetic */ QuickOrderInfo(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, int i, UserQuickOrderOperation userQuickOrderOperation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, i, (i2 & 512) != 0 ? null : userQuickOrderOperation);
    }
}
