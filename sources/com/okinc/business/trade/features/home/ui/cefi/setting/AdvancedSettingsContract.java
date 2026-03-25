package com.okinc.business.trade.features.home.ui.cefi.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.IntentCompat;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC30838lih;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedSettingsContract extends ActivityResultContract<Input, Input> {

    public static final class Input implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        private final AutoSlippageInfo autoSlippageInfo;
        private String autoSlippageValue;
        private final String chainId;
        private AdvancedMainConfig config;
        private final String estimateGasFee;
        private final boolean isFreeGas;
        private boolean isOpenMev;
        private String maxSlippage;
        private final TrackOrderType orderType;
        private final String perTokenUsd;
        private int priorityFeeType;
        private String priorityValue;
        private final AdvancedQuoteUiData quoteData;
        private String routerModeType;
        private int slippageFeeType;
        private SlippageMode slippageMode;
        private String slippageValue;
        private final String sourceType;
        private final String subEventSource;
        private final boolean supportReset;
        private String totalFee;
        private final TradeMode tradeMode;
        private final int transaction;

        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdvancedMainConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoSlippageInfo.CREATOR.createFromParcel(parcel), SlippageMode.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, TrackOrderType.valueOf(parcel.readString()), TradeMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? AdvancedQuoteUiData.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i) {
                return new Input[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.sourceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.subEventSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.estimateGasFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.perTokenUsd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.routerModeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedMainConfig component14() {
            return this.config;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AutoSlippageInfo component15() {
            return this.autoSlippageInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SlippageMode component16() {
            return this.slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component17() {
            return this.maxSlippage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component18() {
            return this.totalFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component19() {
            return this.supportReset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component20() {
            return this.isFreeGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TrackOrderType component21() {
            return this.orderType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeMode component22() {
            return this.tradeMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedQuoteUiData component23() {
            return this.quoteData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.slippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.slippageFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.autoSlippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.priorityValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component7() {
            return this.priorityFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isOpenMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component9() {
            return this.transaction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, int i2, boolean z, int i3, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, AdvancedMainConfig advancedMainConfig, AutoSlippageInfo autoSlippageInfo, @NotNull SlippageMode slippageMode, String str10, @NotNull String str11, boolean z2, boolean z3, @NotNull TrackOrderType trackOrderType, @NotNull TradeMode tradeMode, AdvancedQuoteUiData advancedQuoteUiData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(trackOrderType, "");
            Intrinsics.checkNotNullParameter(tradeMode, "");
            return new Input(str, str2, str3, i, str4, str5, i2, z, i3, str6, str7, str8, str9, advancedMainConfig, autoSlippageInfo, slippageMode, str10, str11, z2, z3, trackOrderType, tradeMode, advancedQuoteUiData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return Intrinsics.EZpvd((Object) this.sourceType, (Object) input.sourceType) && Intrinsics.EZpvd((Object) this.chainId, (Object) input.chainId) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) input.slippageValue) && this.slippageFeeType == input.slippageFeeType && Intrinsics.EZpvd((Object) this.autoSlippageValue, (Object) input.autoSlippageValue) && Intrinsics.EZpvd((Object) this.priorityValue, (Object) input.priorityValue) && this.priorityFeeType == input.priorityFeeType && this.isOpenMev == input.isOpenMev && this.transaction == input.transaction && Intrinsics.EZpvd((Object) this.subEventSource, (Object) input.subEventSource) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) input.estimateGasFee) && Intrinsics.EZpvd((Object) this.perTokenUsd, (Object) input.perTokenUsd) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) input.routerModeType) && Intrinsics.EZpvd(this.config, input.config) && Intrinsics.EZpvd(this.autoSlippageInfo, input.autoSlippageInfo) && this.slippageMode == input.slippageMode && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) input.maxSlippage) && Intrinsics.EZpvd((Object) this.totalFee, (Object) input.totalFee) && this.supportReset == input.supportReset && this.isFreeGas == input.isFreeGas && this.orderType == input.orderType && this.tradeMode == input.tradeMode && Intrinsics.EZpvd(this.quoteData, input.quoteData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AutoSlippageInfo getAutoSlippageInfo() {
            return this.autoSlippageInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAutoSlippageValue() {
            return this.autoSlippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedMainConfig getConfig() {
            return this.config;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEstimateGasFee() {
            return this.estimateGasFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxSlippage() {
            return this.maxSlippage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TrackOrderType getOrderType() {
            return this.orderType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPerTokenUsd() {
            return this.perTokenUsd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPriorityFeeType() {
            return this.priorityFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriorityValue() {
            return this.priorityValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedQuoteUiData getQuoteData() {
            return this.quoteData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRouterModeType() {
            return this.routerModeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSlippageFeeType() {
            return this.slippageFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SlippageMode getSlippageMode() {
            return this.slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSlippageValue() {
            return this.slippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSubEventSource() {
            return this.subEventSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getSupportReset() {
            return this.supportReset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTotalFee() {
            return this.totalFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeMode getTradeMode() {
            return this.tradeMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTransaction() {
            return this.transaction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.sourceType.hashCode();
            int iHashCode2 = this.chainId.hashCode();
            int iHashCode3 = this.slippageValue.hashCode();
            int iHashCode4 = Integer.hashCode(this.slippageFeeType);
            int iHashCode5 = this.autoSlippageValue.hashCode();
            int iHashCode6 = this.priorityValue.hashCode();
            int iHashCode7 = Integer.hashCode(this.priorityFeeType);
            int iHashCode8 = Boolean.hashCode(this.isOpenMev);
            int iHashCode9 = Integer.hashCode(this.transaction);
            int iHashCode10 = this.subEventSource.hashCode();
            int iHashCode11 = this.estimateGasFee.hashCode();
            int iHashCode12 = this.perTokenUsd.hashCode();
            int iHashCode13 = this.routerModeType.hashCode();
            AdvancedMainConfig advancedMainConfig = this.config;
            int iHashCode14 = advancedMainConfig == null ? 0 : advancedMainConfig.hashCode();
            AutoSlippageInfo autoSlippageInfo = this.autoSlippageInfo;
            int iHashCode15 = autoSlippageInfo == null ? 0 : autoSlippageInfo.hashCode();
            int iHashCode16 = this.slippageMode.hashCode();
            String str = this.maxSlippage;
            int iHashCode17 = str == null ? 0 : str.hashCode();
            int iHashCode18 = this.totalFee.hashCode();
            int iHashCode19 = Boolean.hashCode(this.supportReset);
            int iHashCode20 = Boolean.hashCode(this.isFreeGas);
            int iHashCode21 = this.orderType.hashCode();
            int iHashCode22 = this.tradeMode.hashCode();
            AdvancedQuoteUiData advancedQuoteUiData = this.quoteData;
            return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (advancedQuoteUiData == null ? 0 : advancedQuoteUiData.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isFreeGas() {
            return this.isFreeGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isOpenMev() {
            return this.isOpenMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAutoSlippageValue(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.autoSlippageValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setConfig(AdvancedMainConfig advancedMainConfig) {
            this.config = advancedMainConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaxSlippage(String str) {
            this.maxSlippage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpenMev(boolean z) {
            this.isOpenMev = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPriorityFeeType(int i) {
            this.priorityFeeType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPriorityValue(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.priorityValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRouterModeType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.routerModeType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSlippageFeeType(int i) {
            this.slippageFeeType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSlippageMode(@NotNull SlippageMode slippageMode) {
            Intrinsics.checkNotNullParameter(slippageMode, "");
            this.slippageMode = slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSlippageValue(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.slippageValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTotalFee(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.totalFee = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(sourceType=" + this.sourceType + ", chainId=" + this.chainId + ", slippageValue=" + this.slippageValue + ", slippageFeeType=" + this.slippageFeeType + ", autoSlippageValue=" + this.autoSlippageValue + ", priorityValue=" + this.priorityValue + ", priorityFeeType=" + this.priorityFeeType + ", isOpenMev=" + this.isOpenMev + ", transaction=" + this.transaction + ", subEventSource=" + this.subEventSource + ", estimateGasFee=" + this.estimateGasFee + ", perTokenUsd=" + this.perTokenUsd + ", routerModeType=" + this.routerModeType + ", config=" + this.config + ", autoSlippageInfo=" + this.autoSlippageInfo + ", slippageMode=" + this.slippageMode + ", maxSlippage=" + this.maxSlippage + ", totalFee=" + this.totalFee + ", supportReset=" + this.supportReset + ", isFreeGas=" + this.isFreeGas + ", orderType=" + this.orderType + ", tradeMode=" + this.tradeMode + ", quoteData=" + this.quoteData + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.sourceType);
            parcel.writeString(this.chainId);
            parcel.writeString(this.slippageValue);
            parcel.writeInt(this.slippageFeeType);
            parcel.writeString(this.autoSlippageValue);
            parcel.writeString(this.priorityValue);
            parcel.writeInt(this.priorityFeeType);
            parcel.writeInt(this.isOpenMev ? 1 : 0);
            parcel.writeInt(this.transaction);
            parcel.writeString(this.subEventSource);
            parcel.writeString(this.estimateGasFee);
            parcel.writeString(this.perTokenUsd);
            parcel.writeString(this.routerModeType);
            AdvancedMainConfig advancedMainConfig = this.config;
            if (advancedMainConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                advancedMainConfig.writeToParcel(parcel, i);
            }
            AutoSlippageInfo autoSlippageInfo = this.autoSlippageInfo;
            if (autoSlippageInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autoSlippageInfo.writeToParcel(parcel, i);
            }
            parcel.writeString(this.slippageMode.name());
            parcel.writeString(this.maxSlippage);
            parcel.writeString(this.totalFee);
            parcel.writeInt(this.supportReset ? 1 : 0);
            parcel.writeInt(this.isFreeGas ? 1 : 0);
            parcel.writeString(this.orderType.name());
            parcel.writeString(this.tradeMode.name());
            AdvancedQuoteUiData advancedQuoteUiData = this.quoteData;
            if (advancedQuoteUiData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                advancedQuoteUiData.writeToParcel(parcel, i);
            }
        }

        public Input(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, int i2, boolean z, int i3, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, AdvancedMainConfig advancedMainConfig, AutoSlippageInfo autoSlippageInfo, @NotNull SlippageMode slippageMode, String str10, @NotNull String str11, boolean z2, boolean z3, @NotNull TrackOrderType trackOrderType, @NotNull TradeMode tradeMode, AdvancedQuoteUiData advancedQuoteUiData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(trackOrderType, "");
            Intrinsics.checkNotNullParameter(tradeMode, "");
            this.sourceType = str;
            this.chainId = str2;
            this.slippageValue = str3;
            this.slippageFeeType = i;
            this.autoSlippageValue = str4;
            this.priorityValue = str5;
            this.priorityFeeType = i2;
            this.isOpenMev = z;
            this.transaction = i3;
            this.subEventSource = str6;
            this.estimateGasFee = str7;
            this.perTokenUsd = str8;
            this.routerModeType = str9;
            this.config = advancedMainConfig;
            this.autoSlippageInfo = autoSlippageInfo;
            this.slippageMode = slippageMode;
            this.maxSlippage = str10;
            this.totalFee = str11;
            this.supportReset = z2;
            this.isFreeGas = z3;
            this.orderType = trackOrderType;
            this.tradeMode = tradeMode;
            this.quoteData = advancedQuoteUiData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("cefi_mode") : (r27v0 java.lang.String))
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (r30v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (r33v0 int)
  (r34v0 boolean)
  (r35v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (r37v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.PresetRouteType:0x003a: SGET  A[WRAPPED] (LINE:39) com.okinc.business.dexlogic.bean.PresetRouteType.RouteTypeAuto com.okinc.business.dexlogic.bean.PresetRouteType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.PresetRouteType.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:39)) : (r39v0 java.lang.String))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig:?: TERNARY null = ((wrap:int:0x0044: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig) : (r40v0 com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig))
  (wrap:com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo:?: TERNARY null = ((wrap:int:0x004e: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo) : (r41v0 com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo))
  (r42v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (65536 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (131072 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (262144 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0078: ARITH (524288 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:com.okinc.business.dexlogic.bean.track.TrackOrderType:?: TERNARY null = ((wrap:int:0x0082: ARITH (1048576 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0087: SGET  A[WRAPPED] (LINE:47) com.okinc.business.dexlogic.bean.track.TrackOrderType.SWAP com.okinc.business.dexlogic.bean.track.TrackOrderType) : (r47v0 com.okinc.business.dexlogic.bean.track.TrackOrderType))
  (wrap:com.okinc.business.dexui.main.shared.model.TradeMode:?: TERNARY null = ((wrap:int:0x008e: ARITH (2097152 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0093: SGET  A[WRAPPED] (LINE:48) com.okinc.business.dexui.main.shared.model.TradeMode.Advanced com.okinc.business.dexui.main.shared.model.TradeMode) : (r48v0 com.okinc.business.dexui.main.shared.model.TradeMode))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData:?: TERNARY null = ((wrap:int:0x009a: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData) : (r49v0 com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig, com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, boolean, boolean, com.okinc.business.dexlogic.bean.track.TrackOrderType, com.okinc.business.dexui.main.shared.model.TradeMode, com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData):void (m)] (LINE:26) call: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract.Input.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig, com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, boolean, boolean, com.okinc.business.dexlogic.bean.track.TrackOrderType, com.okinc.business.dexui.main.shared.model.TradeMode, com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData):void type: THIS */
        public /* synthetic */ Input(String str, String str2, String str3, int i, String str4, String str5, int i2, boolean z, int i3, String str6, String str7, String str8, String str9, AdvancedMainConfig advancedMainConfig, AutoSlippageInfo autoSlippageInfo, SlippageMode slippageMode, String str10, String str11, boolean z2, boolean z3, TrackOrderType trackOrderType, TradeMode tradeMode, AdvancedQuoteUiData advancedQuoteUiData, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "cefi_mode" : str, str2, (i4 & 4) != 0 ? "" : str3, i, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, i2, z, i3, (i4 & 512) != 0 ? "" : str6, str7, (i4 & 2048) != 0 ? "" : str8, (i4 & 4096) != 0 ? PresetRouteType.RouteTypeAuto.getValue() : str9, (i4 & 8192) != 0 ? null : advancedMainConfig, (i4 & 16384) != 0 ? null : autoSlippageInfo, slippageMode, (65536 & i4) != 0 ? null : str10, (131072 & i4) != 0 ? "" : str11, (262144 & i4) != 0 ? false : z2, (524288 & i4) != 0 ? false : z3, (1048576 & i4) != 0 ? TrackOrderType.SWAP : trackOrderType, (2097152 & i4) != 0 ? TradeMode.Advanced : tradeMode, (i4 & 4194304) != 0 ? null : advancedQuoteUiData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull Input input) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(input, "");
        Intent intent = new Intent(context, (Class<?>) ActivityC30838lih.class);
        intent.putExtra("data", input);
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Input parseResult(int i, Intent intent) {
        Input input;
        if (i != -1 || intent == null || (input = (Input) ((Parcelable) IntentCompat.getParcelableExtra(intent, "result", Input.class))) == null) {
            return null;
        }
        return input;
    }
}
