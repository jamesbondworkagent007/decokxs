package com.okinc.unify_trade.manager;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class UserOperationInfo {
    public static final int $stable = 8;
    private int amountChangeCount;
    private int assetListAllCount;
    private int bottomAllCount;
    private int bottomSwitchTabCount;
    private int clickOrderTypeEntryCount;
    private int depthAllCount;
    private int depthAmountCount;
    private int depthLevelCount;
    private int depthModeCount;
    private int depthPriceCount;
    private int dragSeekBarCount;
    private int kLineAllCount;
    private int kLineEnterCount;
    private int kLineHideCount;
    private int kLineTimeCount;
    private int makeOrderCount;
    private int marginModeCount;
    private int modifyLeverageCount;
    private int oppoPriceCount;
    private int orderAreaCount;
    private int orderCancelCount;
    private int orderItemCount;
    private int orderListAllCount;
    private int orderModifyCount;
    private int positionListAllCount;
    private int priceChangeCount;
    private int reduceOnlyCount;
    private int switchBuySellCount;
    private int switchMarginCount;
    private int tpslCount;
    private int transferCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserOperationInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void cancelOrder() {
        this.orderCancelCount++;
        this.orderListAllCount++;
        this.bottomAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void changeBottomTab() {
        this.bottomSwitchTabCount++;
        this.bottomAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void changeInputAmount() {
        this.amountChangeCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void changeInputPrice() {
        this.priceChangeCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickAssetList() {
        this.assetListAllCount++;
        this.bottomAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickDephtLevel() {
        this.depthLevelCount++;
        this.depthAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickDepthAmount() {
        this.depthAmountCount++;
        this.depthAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickDepthMode() {
        this.depthModeCount++;
        this.depthAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickDepthPrice() {
        this.depthPriceCount++;
        this.depthAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickLeverage() {
        this.modifyLeverageCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickMarginMode() {
        this.marginModeCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickMarginSwitch() {
        this.switchMarginCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickOrderType() {
        this.clickOrderTypeEntryCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickPositionList() {
        this.positionListAllCount++;
        this.bottomAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickReduceOnly() {
        this.reduceOnlyCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickTpsl() {
        this.tpslCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clickTransfer() {
        this.transferCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.orderAreaCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.reduceOnlyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.tpslCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.makeOrderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.switchMarginCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.depthAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.depthPriceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.depthAmountCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.depthModeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.depthLevelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.kLineAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.clickOrderTypeEntryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.kLineHideCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.kLineEnterCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.kLineTimeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.bottomAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.bottomSwitchTabCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component25() {
        return this.positionListAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.orderListAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component27() {
        return this.orderModifyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component28() {
        return this.orderCancelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.orderItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.priceChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component30() {
        return this.assetListAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component31() {
        return this.transferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.amountChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.dragSeekBarCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.switchBuySellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.oppoPriceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.marginModeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.modifyLeverageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperationInfo copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31) {
        return new UserOperationInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void dragSeekBar() {
        this.dragSeekBarCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserOperationInfo)) {
            return false;
        }
        UserOperationInfo userOperationInfo = (UserOperationInfo) obj;
        return this.orderAreaCount == userOperationInfo.orderAreaCount && this.clickOrderTypeEntryCount == userOperationInfo.clickOrderTypeEntryCount && this.priceChangeCount == userOperationInfo.priceChangeCount && this.amountChangeCount == userOperationInfo.amountChangeCount && this.dragSeekBarCount == userOperationInfo.dragSeekBarCount && this.switchBuySellCount == userOperationInfo.switchBuySellCount && this.oppoPriceCount == userOperationInfo.oppoPriceCount && this.marginModeCount == userOperationInfo.marginModeCount && this.modifyLeverageCount == userOperationInfo.modifyLeverageCount && this.reduceOnlyCount == userOperationInfo.reduceOnlyCount && this.tpslCount == userOperationInfo.tpslCount && this.makeOrderCount == userOperationInfo.makeOrderCount && this.switchMarginCount == userOperationInfo.switchMarginCount && this.depthAllCount == userOperationInfo.depthAllCount && this.depthPriceCount == userOperationInfo.depthPriceCount && this.depthAmountCount == userOperationInfo.depthAmountCount && this.depthModeCount == userOperationInfo.depthModeCount && this.depthLevelCount == userOperationInfo.depthLevelCount && this.kLineAllCount == userOperationInfo.kLineAllCount && this.kLineHideCount == userOperationInfo.kLineHideCount && this.kLineEnterCount == userOperationInfo.kLineEnterCount && this.kLineTimeCount == userOperationInfo.kLineTimeCount && this.bottomAllCount == userOperationInfo.bottomAllCount && this.bottomSwitchTabCount == userOperationInfo.bottomSwitchTabCount && this.positionListAllCount == userOperationInfo.positionListAllCount && this.orderListAllCount == userOperationInfo.orderListAllCount && this.orderModifyCount == userOperationInfo.orderModifyCount && this.orderCancelCount == userOperationInfo.orderCancelCount && this.orderItemCount == userOperationInfo.orderItemCount && this.assetListAllCount == userOperationInfo.assetListAllCount && this.transferCount == userOperationInfo.transferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAmountChangeCount() {
        return this.amountChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetListAllCount() {
        return this.assetListAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBottomAllCount() {
        return this.bottomAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBottomSwitchTabCount() {
        return this.bottomSwitchTabCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getClickOrderTypeEntryCount() {
        return this.clickOrderTypeEntryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepthAllCount() {
        return this.depthAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepthAmountCount() {
        return this.depthAmountCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepthLevelCount() {
        return this.depthLevelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepthModeCount() {
        return this.depthModeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepthPriceCount() {
        return this.depthPriceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDragSeekBarCount() {
        return this.dragSeekBarCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKLineAllCount() {
        return this.kLineAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKLineEnterCount() {
        return this.kLineEnterCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKLineHideCount() {
        return this.kLineHideCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKLineTimeCount() {
        return this.kLineTimeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMakeOrderCount() {
        return this.makeOrderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMarginModeCount() {
        return this.marginModeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModifyLeverageCount() {
        return this.modifyLeverageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOppoPriceCount() {
        return this.oppoPriceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderAreaCount() {
        return this.orderAreaCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderCancelCount() {
        return this.orderCancelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderItemCount() {
        return this.orderItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderListAllCount() {
        return this.orderListAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderModifyCount() {
        return this.orderModifyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionListAllCount() {
        return this.positionListAllCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriceChangeCount() {
        return this.priceChangeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getReduceOnlyCount() {
        return this.reduceOnlyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchBuySellCount() {
        return this.switchBuySellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchMarginCount() {
        return this.switchMarginCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTpslCount() {
        return this.tpslCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferCount() {
        return this.transferCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.orderAreaCount) * 31) + Integer.hashCode(this.clickOrderTypeEntryCount)) * 31) + Integer.hashCode(this.priceChangeCount)) * 31) + Integer.hashCode(this.amountChangeCount)) * 31) + Integer.hashCode(this.dragSeekBarCount)) * 31) + Integer.hashCode(this.switchBuySellCount)) * 31) + Integer.hashCode(this.oppoPriceCount)) * 31) + Integer.hashCode(this.marginModeCount)) * 31) + Integer.hashCode(this.modifyLeverageCount)) * 31) + Integer.hashCode(this.reduceOnlyCount)) * 31) + Integer.hashCode(this.tpslCount)) * 31) + Integer.hashCode(this.makeOrderCount)) * 31) + Integer.hashCode(this.switchMarginCount)) * 31) + Integer.hashCode(this.depthAllCount)) * 31) + Integer.hashCode(this.depthPriceCount)) * 31) + Integer.hashCode(this.depthAmountCount)) * 31) + Integer.hashCode(this.depthModeCount)) * 31) + Integer.hashCode(this.depthLevelCount)) * 31) + Integer.hashCode(this.kLineAllCount)) * 31) + Integer.hashCode(this.kLineHideCount)) * 31) + Integer.hashCode(this.kLineEnterCount)) * 31) + Integer.hashCode(this.kLineTimeCount)) * 31) + Integer.hashCode(this.bottomAllCount)) * 31) + Integer.hashCode(this.bottomSwitchTabCount)) * 31) + Integer.hashCode(this.positionListAllCount)) * 31) + Integer.hashCode(this.orderListAllCount)) * 31) + Integer.hashCode(this.orderModifyCount)) * 31) + Integer.hashCode(this.orderCancelCount)) * 31) + Integer.hashCode(this.orderItemCount)) * 31) + Integer.hashCode(this.assetListAllCount)) * 31) + Integer.hashCode(this.transferCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void hideKline() {
        this.kLineHideCount++;
        this.kLineAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void makeOrderClick() {
        this.makeOrderCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void modifyOrder() {
        this.orderModifyCount++;
        this.orderListAllCount++;
        this.bottomAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void oppoPrice() {
        this.oppoPriceCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void orderItem() {
        this.orderItemCount++;
        this.orderListAllCount++;
        this.bottomAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountChangeCount(int i) {
        this.amountChangeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetListAllCount(int i) {
        this.assetListAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomAllCount(int i) {
        this.bottomAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomSwitchTabCount(int i) {
        this.bottomSwitchTabCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickOrderTypeEntryCount(int i) {
        this.clickOrderTypeEntryCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepthAllCount(int i) {
        this.depthAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepthAmountCount(int i) {
        this.depthAmountCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepthLevelCount(int i) {
        this.depthLevelCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepthModeCount(int i) {
        this.depthModeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepthPriceCount(int i) {
        this.depthPriceCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDragSeekBarCount(int i) {
        this.dragSeekBarCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKLineAllCount(int i) {
        this.kLineAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKLineEnterCount(int i) {
        this.kLineEnterCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKLineHideCount(int i) {
        this.kLineHideCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKLineTimeCount(int i) {
        this.kLineTimeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMakeOrderCount(int i) {
        this.makeOrderCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginModeCount(int i) {
        this.marginModeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyLeverageCount(int i) {
        this.modifyLeverageCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOppoPriceCount(int i) {
        this.oppoPriceCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderAreaCount(int i) {
        this.orderAreaCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderCancelCount(int i) {
        this.orderCancelCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderItemCount(int i) {
        this.orderItemCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderListAllCount(int i) {
        this.orderListAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderModifyCount(int i) {
        this.orderModifyCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionListAllCount(int i) {
        this.positionListAllCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeCount(int i) {
        this.priceChangeCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnlyCount(int i) {
        this.reduceOnlyCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchBuySellCount(int i) {
        this.switchBuySellCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchMarginCount(int i) {
        this.switchMarginCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslCount(int i) {
        this.tpslCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferCount(int i) {
        this.transferCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void showKline() {
        this.kLineEnterCount++;
        this.kLineAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void switchBuySell() {
        this.switchBuySellCount++;
        this.orderAreaCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void switchKlineTimeZone() {
        this.kLineTimeCount++;
        this.kLineAllCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserOperationInfo(orderAreaCount=" + this.orderAreaCount + ", clickOrderTypeEntryCount=" + this.clickOrderTypeEntryCount + ", priceChangeCount=" + this.priceChangeCount + ", amountChangeCount=" + this.amountChangeCount + ", dragSeekBarCount=" + this.dragSeekBarCount + ", switchBuySellCount=" + this.switchBuySellCount + ", oppoPriceCount=" + this.oppoPriceCount + ", marginModeCount=" + this.marginModeCount + ", modifyLeverageCount=" + this.modifyLeverageCount + ", reduceOnlyCount=" + this.reduceOnlyCount + ", tpslCount=" + this.tpslCount + ", makeOrderCount=" + this.makeOrderCount + ", switchMarginCount=" + this.switchMarginCount + ", depthAllCount=" + this.depthAllCount + ", depthPriceCount=" + this.depthPriceCount + ", depthAmountCount=" + this.depthAmountCount + ", depthModeCount=" + this.depthModeCount + ", depthLevelCount=" + this.depthLevelCount + ", kLineAllCount=" + this.kLineAllCount + ", kLineHideCount=" + this.kLineHideCount + ", kLineEnterCount=" + this.kLineEnterCount + ", kLineTimeCount=" + this.kLineTimeCount + ", bottomAllCount=" + this.bottomAllCount + ", bottomSwitchTabCount=" + this.bottomSwitchTabCount + ", positionListAllCount=" + this.positionListAllCount + ", orderListAllCount=" + this.orderListAllCount + ", orderModifyCount=" + this.orderModifyCount + ", orderCancelCount=" + this.orderCancelCount + ", orderItemCount=" + this.orderItemCount + ", assetListAllCount=" + this.assetListAllCount + ", transferCount=" + this.transferCount + ")";
    }

    public UserOperationInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31) {
        this.orderAreaCount = i;
        this.clickOrderTypeEntryCount = i2;
        this.priceChangeCount = i3;
        this.amountChangeCount = i4;
        this.dragSeekBarCount = i5;
        this.switchBuySellCount = i6;
        this.oppoPriceCount = i7;
        this.marginModeCount = i8;
        this.modifyLeverageCount = i9;
        this.reduceOnlyCount = i10;
        this.tpslCount = i11;
        this.makeOrderCount = i12;
        this.switchMarginCount = i13;
        this.depthAllCount = i14;
        this.depthPriceCount = i15;
        this.depthAmountCount = i16;
        this.depthModeCount = i17;
        this.depthLevelCount = i18;
        this.kLineAllCount = i19;
        this.kLineHideCount = i20;
        this.kLineEnterCount = i21;
        this.kLineTimeCount = i22;
        this.bottomAllCount = i23;
        this.bottomSwitchTabCount = i24;
        this.positionListAllCount = i25;
        this.orderListAllCount = i26;
        this.orderModifyCount = i27;
        this.orderCancelCount = i28;
        this.orderItemCount = i29;
        this.assetListAllCount = i30;
        this.transferCount = i31;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x016a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0042: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004a: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005a: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0062: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006a: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0072: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r47v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007d: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r48v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0088: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0093: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009e: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r51v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r52v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r53v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r54v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r55v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r56v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r57v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r58v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r59v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0101: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r60v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x010c: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r61v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0117: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r62v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0122: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r63v0 int))
 A[MD:(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int):void (m)] (LINE:729) call: com.okinc.unify_trade.manager.UserOperationInfo.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ UserOperationInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, DefaultConstructorMarker defaultConstructorMarker) {
        this((i32 & 1) != 0 ? 0 : i, (i32 & 2) != 0 ? 0 : i2, (i32 & 4) != 0 ? 0 : i3, (i32 & 8) != 0 ? 0 : i4, (i32 & 16) != 0 ? 0 : i5, (i32 & 32) != 0 ? 0 : i6, (i32 & 64) != 0 ? 0 : i7, (i32 & 128) != 0 ? 0 : i8, (i32 & 256) != 0 ? 0 : i9, (i32 & 512) != 0 ? 0 : i10, (i32 & 1024) != 0 ? 0 : i11, (i32 & 2048) != 0 ? 0 : i12, (i32 & 4096) != 0 ? 0 : i13, (i32 & 8192) != 0 ? 0 : i14, (i32 & 16384) != 0 ? 0 : i15, (i32 & 32768) != 0 ? 0 : i16, (i32 & 65536) != 0 ? 0 : i17, (i32 & 131072) != 0 ? 0 : i18, (i32 & 262144) != 0 ? 0 : i19, (i32 & 524288) != 0 ? 0 : i20, (i32 & 1048576) != 0 ? 0 : i21, (i32 & 2097152) != 0 ? 0 : i22, (i32 & 4194304) != 0 ? 0 : i23, (i32 & 8388608) != 0 ? 0 : i24, (i32 & 16777216) != 0 ? 0 : i25, (i32 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i26, (i32 & 67108864) != 0 ? 0 : i27, (i32 & 134217728) != 0 ? 0 : i28, (i32 & 268435456) != 0 ? 0 : i29, (i32 & 536870912) != 0 ? 0 : i30, (i32 & 1073741824) != 0 ? 0 : i31);
    }
}
