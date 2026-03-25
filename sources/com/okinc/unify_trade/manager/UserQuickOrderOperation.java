package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C33129mqd;

/* JADX INFO: loaded from: classes12.dex */
public final class UserQuickOrderOperation {
    public static final int $stable = 8;
    private int amountChangeCount;
    private int buySellClickCount;
    private int dragSeekBarCount;
    private int leverageChangeCount;
    private int makeOrderCount;
    private int mgnModeChangeCount;
    private int oppoPriceCount;
    private int priceChangeCount;
    private int switchMarginCount;
    private int transferCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserQuickOrderOperation() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void changeInputAmount() {
        this.amountChangeCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void changeInputPrice() {
        this.priceChangeCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickLeverage() {
        this.leverageChangeCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickMarginMode() {
        this.mgnModeChangeCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickMarginSwitch() {
        this.switchMarginCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickTransfer() {
        this.transferCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.buySellClickCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.transferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.priceChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.amountChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.leverageChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.mgnModeChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.makeOrderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.oppoPriceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.dragSeekBarCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.switchMarginCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserQuickOrderOperation copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        return new UserQuickOrderOperation(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void dragSeekBar() {
        this.dragSeekBarCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserQuickOrderOperation)) {
            return false;
        }
        UserQuickOrderOperation userQuickOrderOperation = (UserQuickOrderOperation) obj;
        return this.buySellClickCount == userQuickOrderOperation.buySellClickCount && this.priceChangeCount == userQuickOrderOperation.priceChangeCount && this.amountChangeCount == userQuickOrderOperation.amountChangeCount && this.leverageChangeCount == userQuickOrderOperation.leverageChangeCount && this.mgnModeChangeCount == userQuickOrderOperation.mgnModeChangeCount && this.makeOrderCount == userQuickOrderOperation.makeOrderCount && this.oppoPriceCount == userQuickOrderOperation.oppoPriceCount && this.dragSeekBarCount == userQuickOrderOperation.dragSeekBarCount && this.switchMarginCount == userQuickOrderOperation.switchMarginCount && this.transferCount == userQuickOrderOperation.transferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAmountChangeCount() {
        return this.amountChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBuySellClickCount() {
        return this.buySellClickCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDragSeekBarCount() {
        return this.dragSeekBarCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLeverageChangeCount() {
        return this.leverageChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMakeOrderCount() {
        return this.makeOrderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMgnModeChangeCount() {
        return this.mgnModeChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOppoPriceCount() {
        return this.oppoPriceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriceChangeCount() {
        return this.priceChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchMarginCount() {
        return this.switchMarginCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferCount() {
        return this.transferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.buySellClickCount) * 31) + Integer.hashCode(this.priceChangeCount)) * 31) + Integer.hashCode(this.amountChangeCount)) * 31) + Integer.hashCode(this.leverageChangeCount)) * 31) + Integer.hashCode(this.mgnModeChangeCount)) * 31) + Integer.hashCode(this.makeOrderCount)) * 31) + Integer.hashCode(this.oppoPriceCount)) * 31) + Integer.hashCode(this.dragSeekBarCount)) * 31) + Integer.hashCode(this.switchMarginCount)) * 31) + Integer.hashCode(this.transferCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void makeOrderClick() {
        this.makeOrderCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void oppoPrice() {
        this.oppoPriceCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountChangeCount(int i) {
        this.amountChangeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuySellClickCount(int i) {
        this.buySellClickCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDragSeekBarCount(int i) {
        this.dragSeekBarCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverageChangeCount(int i) {
        this.leverageChangeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMakeOrderCount(int i) {
        this.makeOrderCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnModeChangeCount(int i) {
        this.mgnModeChangeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOppoPriceCount(int i) {
        this.oppoPriceCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeCount(int i) {
        this.priceChangeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchMarginCount(int i) {
        this.switchMarginCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferCount(int i) {
        this.transferCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void switchBuySell() {
        this.buySellClickCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserQuickOrderOperation(buySellClickCount=" + this.buySellClickCount + ", priceChangeCount=" + this.priceChangeCount + ", amountChangeCount=" + this.amountChangeCount + ", leverageChangeCount=" + this.leverageChangeCount + ", mgnModeChangeCount=" + this.mgnModeChangeCount + ", makeOrderCount=" + this.makeOrderCount + ", oppoPriceCount=" + this.oppoPriceCount + ", dragSeekBarCount=" + this.dragSeekBarCount + ", switchMarginCount=" + this.switchMarginCount + ", transferCount=" + this.transferCount + ")";
    }

    public UserQuickOrderOperation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.buySellClickCount = i;
        this.priceChangeCount = i2;
        this.amountChangeCount = i3;
        this.leverageChangeCount = i4;
        this.mgnModeChangeCount = i5;
        this.makeOrderCount = i6;
        this.oppoPriceCount = i7;
        this.dragSeekBarCount = i8;
        this.switchMarginCount = i9;
        this.transferCount = i10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 int) : (0 int))
 A[MD:(int, int, int, int, int, int, int, int, int, int):void (m)] (LINE:911) call: com.okinc.unify_trade.manager.UserQuickOrderOperation.<init>(int, int, int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ UserQuickOrderOperation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i2, (i11 & 4) != 0 ? 0 : i3, (i11 & 8) != 0 ? 0 : i4, (i11 & 16) != 0 ? 0 : i5, (i11 & 32) != 0 ? 0 : i6, (i11 & 64) != 0 ? 0 : i7, (i11 & 128) != 0 ? 0 : i8, (i11 & 256) != 0 ? 0 : i9, (i11 & 512) == 0 ? i10 : 0);
    }

    public final boolean hasOperation() {
        return C33129mqd.AEQbTJ(Integer.valueOf(this.buySellClickCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.priceChangeCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.amountChangeCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.leverageChangeCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.mgnModeChangeCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.makeOrderCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.oppoPriceCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.dragSeekBarCount), 0) || C33129mqd.AEQbTJ(Integer.valueOf(this.transferCount), 0);
    }
}
