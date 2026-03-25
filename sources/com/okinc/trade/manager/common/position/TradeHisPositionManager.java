package com.okinc.trade.manager.common.position;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.trade.manager.common.position.TradePositionManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeHisPositionManager {
    public static final TradeHisPositionManager KWHzl = new TradeHisPositionManager();

    public static class HisPositionItem extends TradePositionManager.PositionItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<HisPositionItem> CREATOR = new Creator();
        private String mgnMode = "cross";
        private String openAvgPx = "";
        private String closeAvgPx = "";
        private String triggerPx = "";
        private String closeUpl = "";
        private String closeUplRatio = "";
        private String closeTotalAmount = "";
        private String openMaxAmount = "";
        private String closeType = "";
        private String ctVal = "";
        private String ctMulti = "";
        private String bankruptcyPrice = "";
        private String riskProfit = "";
        private String pnlRatio = "";
        private String ruleType = "";
        private String shouldDisplay = "";

        public static final class Creator implements Parcelable.Creator<HisPositionItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HisPositionItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new HisPositionItem();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HisPositionItem[] newArray(int i) {
                return new HisPositionItem[i];
            }
        }

        @Override // com.okinc.trade.manager.common.position.TradePositionManager.PositionItem, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBankruptcyPrice() {
            return this.bankruptcyPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCloseAvgPx() {
            return this.closeAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCloseTotalAmount() {
            return this.closeTotalAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCloseType() {
            return this.closeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCloseUpl() {
            return this.closeUpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCloseUplRatio() {
            return this.closeUplRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCtMulti() {
            return this.ctMulti;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCtVal() {
            return this.ctVal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMgnMode() {
            return this.mgnMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOpenAvgPx() {
            return this.openAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOpenMaxAmount() {
            return this.openMaxAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlRatio() {
            return this.pnlRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRiskProfit() {
            return this.riskProfit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRuleType() {
            return this.ruleType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getShouldDisplay() {
            return this.shouldDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTriggerPx() {
            return this.triggerPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBankruptcyPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bankruptcyPrice = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCloseAvgPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.closeAvgPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCloseTotalAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.closeTotalAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCloseType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.closeType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCloseUpl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.closeUpl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCloseUplRatio(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.closeUplRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCtMulti(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ctMulti = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCtVal(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ctVal = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMgnMode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.mgnMode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpenAvgPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.openAvgPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpenMaxAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.openMaxAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPnlRatio(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pnlRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRiskProfit(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.riskProfit = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRuleType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ruleType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShouldDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.shouldDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTriggerPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.triggerPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.trade.manager.common.position.TradePositionManager.PositionItem, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    private TradeHisPositionManager() {
    }
}
