package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class PositionAndAssetListOperation {
    public static final int $stable = 8;
    private int assetBuySellCount;
    private int assetCostTypeCount;
    private int assetDetailCount;
    private int assetModifyCostCount;
    private int assetShareCount;
    private int assetTpslCount;
    private int assetTransferCount;
    private int positionAdlCount;
    private int positionCloseCount;
    private int positionGoToTradeCount;
    private int positionLeverageCount;
    private int positionManualRepayCount;
    private int positionMarketCloseAllCount;
    private int positionModifyMarginCount;
    private int positionShareCount;
    private int positionSwitchAccountCount;
    private int positionTpslAllCount;
    private int positionTpslCount;
    private int positionTransferAllCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PositionAndAssetListOperation() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524287, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.positionAdlCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.positionTpslAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.positionManualRepayCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.positionTransferAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.assetBuySellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.assetTpslCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.assetTransferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.assetModifyCostCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.assetShareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.assetDetailCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.assetCostTypeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.positionShareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.positionCloseCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.positionMarketCloseAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.positionLeverageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.positionModifyMarginCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.positionTpslCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.positionSwitchAccountCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.positionGoToTradeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionAndAssetListOperation copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        return new PositionAndAssetListOperation(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionAndAssetListOperation)) {
            return false;
        }
        PositionAndAssetListOperation positionAndAssetListOperation = (PositionAndAssetListOperation) obj;
        return this.positionAdlCount == positionAndAssetListOperation.positionAdlCount && this.positionShareCount == positionAndAssetListOperation.positionShareCount && this.positionCloseCount == positionAndAssetListOperation.positionCloseCount && this.positionMarketCloseAllCount == positionAndAssetListOperation.positionMarketCloseAllCount && this.positionLeverageCount == positionAndAssetListOperation.positionLeverageCount && this.positionModifyMarginCount == positionAndAssetListOperation.positionModifyMarginCount && this.positionTpslCount == positionAndAssetListOperation.positionTpslCount && this.positionSwitchAccountCount == positionAndAssetListOperation.positionSwitchAccountCount && this.positionGoToTradeCount == positionAndAssetListOperation.positionGoToTradeCount && this.positionTpslAllCount == positionAndAssetListOperation.positionTpslAllCount && this.positionManualRepayCount == positionAndAssetListOperation.positionManualRepayCount && this.positionTransferAllCount == positionAndAssetListOperation.positionTransferAllCount && this.assetBuySellCount == positionAndAssetListOperation.assetBuySellCount && this.assetTpslCount == positionAndAssetListOperation.assetTpslCount && this.assetTransferCount == positionAndAssetListOperation.assetTransferCount && this.assetModifyCostCount == positionAndAssetListOperation.assetModifyCostCount && this.assetShareCount == positionAndAssetListOperation.assetShareCount && this.assetDetailCount == positionAndAssetListOperation.assetDetailCount && this.assetCostTypeCount == positionAndAssetListOperation.assetCostTypeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetBuySellCount() {
        return this.assetBuySellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetCostTypeCount() {
        return this.assetCostTypeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetDetailCount() {
        return this.assetDetailCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetModifyCostCount() {
        return this.assetModifyCostCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetShareCount() {
        return this.assetShareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetTpslCount() {
        return this.assetTpslCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetTransferCount() {
        return this.assetTransferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionAdlCount() {
        return this.positionAdlCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionCloseCount() {
        return this.positionCloseCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionGoToTradeCount() {
        return this.positionGoToTradeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionLeverageCount() {
        return this.positionLeverageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionManualRepayCount() {
        return this.positionManualRepayCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionMarketCloseAllCount() {
        return this.positionMarketCloseAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionModifyMarginCount() {
        return this.positionModifyMarginCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionShareCount() {
        return this.positionShareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionSwitchAccountCount() {
        return this.positionSwitchAccountCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionTpslAllCount() {
        return this.positionTpslAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionTpslCount() {
        return this.positionTpslCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionTransferAllCount() {
        return this.positionTransferAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.positionAdlCount) * 31) + Integer.hashCode(this.positionShareCount)) * 31) + Integer.hashCode(this.positionCloseCount)) * 31) + Integer.hashCode(this.positionMarketCloseAllCount)) * 31) + Integer.hashCode(this.positionLeverageCount)) * 31) + Integer.hashCode(this.positionModifyMarginCount)) * 31) + Integer.hashCode(this.positionTpslCount)) * 31) + Integer.hashCode(this.positionSwitchAccountCount)) * 31) + Integer.hashCode(this.positionGoToTradeCount)) * 31) + Integer.hashCode(this.positionTpslAllCount)) * 31) + Integer.hashCode(this.positionManualRepayCount)) * 31) + Integer.hashCode(this.positionTransferAllCount)) * 31) + Integer.hashCode(this.assetBuySellCount)) * 31) + Integer.hashCode(this.assetTpslCount)) * 31) + Integer.hashCode(this.assetTransferCount)) * 31) + Integer.hashCode(this.assetModifyCostCount)) * 31) + Integer.hashCode(this.assetShareCount)) * 31) + Integer.hashCode(this.assetDetailCount)) * 31) + Integer.hashCode(this.assetCostTypeCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetBuySellCount(int i) {
        this.assetBuySellCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetCostTypeCount(int i) {
        this.assetCostTypeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetDetailCount(int i) {
        this.assetDetailCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetModifyCostCount(int i) {
        this.assetModifyCostCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetShareCount(int i) {
        this.assetShareCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetTpslCount(int i) {
        this.assetTpslCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetTransferCount(int i) {
        this.assetTransferCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionAdlCount(int i) {
        this.positionAdlCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionCloseCount(int i) {
        this.positionCloseCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionGoToTradeCount(int i) {
        this.positionGoToTradeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionLeverageCount(int i) {
        this.positionLeverageCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionManualRepayCount(int i) {
        this.positionManualRepayCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionMarketCloseAllCount(int i) {
        this.positionMarketCloseAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionModifyMarginCount(int i) {
        this.positionModifyMarginCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionShareCount(int i) {
        this.positionShareCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionSwitchAccountCount(int i) {
        this.positionSwitchAccountCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionTpslAllCount(int i) {
        this.positionTpslAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionTpslCount(int i) {
        this.positionTpslCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionTransferAllCount(int i) {
        this.positionTransferAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionAndAssetListOperation(positionAdlCount=" + this.positionAdlCount + ", positionShareCount=" + this.positionShareCount + ", positionCloseCount=" + this.positionCloseCount + ", positionMarketCloseAllCount=" + this.positionMarketCloseAllCount + ", positionLeverageCount=" + this.positionLeverageCount + ", positionModifyMarginCount=" + this.positionModifyMarginCount + ", positionTpslCount=" + this.positionTpslCount + ", positionSwitchAccountCount=" + this.positionSwitchAccountCount + ", positionGoToTradeCount=" + this.positionGoToTradeCount + ", positionTpslAllCount=" + this.positionTpslAllCount + ", positionManualRepayCount=" + this.positionManualRepayCount + ", positionTransferAllCount=" + this.positionTransferAllCount + ", assetBuySellCount=" + this.assetBuySellCount + ", assetTpslCount=" + this.assetTpslCount + ", assetTransferCount=" + this.assetTransferCount + ", assetModifyCostCount=" + this.assetModifyCostCount + ", assetShareCount=" + this.assetShareCount + ", assetDetailCount=" + this.assetDetailCount + ", assetCostTypeCount=" + this.assetCostTypeCount + ")";
    }

    public PositionAndAssetListOperation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.positionAdlCount = i;
        this.positionShareCount = i2;
        this.positionCloseCount = i3;
        this.positionMarketCloseAllCount = i4;
        this.positionLeverageCount = i5;
        this.positionModifyMarginCount = i6;
        this.positionTpslCount = i7;
        this.positionSwitchAccountCount = i8;
        this.positionGoToTradeCount = i9;
        this.positionTpslAllCount = i10;
        this.positionManualRepayCount = i11;
        this.positionTransferAllCount = i12;
        this.assetBuySellCount = i13;
        this.assetTpslCount = i14;
        this.assetTransferCount = i15;
        this.assetModifyCostCount = i16;
        this.assetShareCount = i17;
        this.assetDetailCount = i18;
        this.assetCostTypeCount = i19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ce: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0042: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004a: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005a: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0062: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006a: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0088: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0093: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009e: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
 A[MD:(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int):void (m)] (LINE:980) call: com.okinc.unify_trade.manager.PositionAndAssetListOperation.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ PositionAndAssetListOperation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this((i20 & 1) != 0 ? 0 : i, (i20 & 2) != 0 ? 0 : i2, (i20 & 4) != 0 ? 0 : i3, (i20 & 8) != 0 ? 0 : i4, (i20 & 16) != 0 ? 0 : i5, (i20 & 32) != 0 ? 0 : i6, (i20 & 64) != 0 ? 0 : i7, (i20 & 128) != 0 ? 0 : i8, (i20 & 256) != 0 ? 0 : i9, (i20 & 512) != 0 ? 0 : i10, (i20 & 1024) != 0 ? 0 : i11, (i20 & 2048) != 0 ? 0 : i12, (i20 & 4096) != 0 ? 0 : i13, (i20 & 8192) != 0 ? 0 : i14, (i20 & 16384) != 0 ? 0 : i15, (i20 & 32768) != 0 ? 0 : i16, (i20 & 65536) != 0 ? 0 : i17, (i20 & 131072) != 0 ? 0 : i18, (i20 & 262144) != 0 ? 0 : i19);
    }
}
