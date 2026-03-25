package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class UploadSettingConfigBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UploadSettingConfigBean> CREATOR = new Creator();
    private final String acctStpMode;
    private final String chasePriceConfirm;
    private final String confirm;
    private final String depthCountConfirm;
    private final String fundingFeeRateNoticeEnabled;
    private final String fundingFeeRateNoticeThreshold;
    private final String greekUnit;
    private final String inverseFuturesUnit;
    private final String invertTradeUnit;
    private final String isLead;
    private final String kLineWithPriceConfig;
    private final String limitOrderNotice;
    private final String linearTradeUnit;
    private final String liqPxSwitch;
    private final String liquidationGear;
    private final String manualKLineConfig;
    private final String marketOrderNotice;
    private final String mktCloseConfirm;
    private final String orderByConst;
    private final String orderCloneShare;
    private final String orderNotice;
    private final String placeLayoutConfig;
    private final String posMode;
    private final String preferredCoin;
    private final List<ButtonsItems> prepPositionShow;
    private final String reduceOnlyNotice;
    private final String reversePosConfirm;
    private final String shareName;
    private final String spotAverageConfig;
    private final List<String> tabCustomConfig;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<UploadSettingConfigBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadSettingConfigBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(ButtonsItems.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new UploadSettingConfigBean(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, arrayListCreateStringArrayList, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadSettingConfigBean[] newArray(int i) {
            return new UploadSettingConfigBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UploadSettingConfigBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.limitOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.reduceOnlyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fundingFeeRateNoticeEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.fundingFeeRateNoticeThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.liquidationGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.confirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.mktCloseConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.reversePosConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.chasePriceConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.acctStpMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.greekUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.liqPxSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.depthCountConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.kLineWithPriceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.orderCloneShare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component24() {
        return this.tabCustomConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ButtonsItems> component25() {
        return this.prepPositionShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.manualKLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.placeLayoutConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.orderByConst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.shareName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.linearTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.isLead;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.inverseFuturesUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.invertTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.preferredCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.spotAverageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.orderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.marketOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadSettingConfigBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull List<String> list, @NotNull List<ButtonsItems> list2, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        return new UploadSettingConfigBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, list, list2, str24, str25, str26, str27, str28);
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
        if (!(obj instanceof UploadSettingConfigBean)) {
            return false;
        }
        UploadSettingConfigBean uploadSettingConfigBean = (UploadSettingConfigBean) obj;
        return Intrinsics.EZpvd((Object) this.posMode, (Object) uploadSettingConfigBean.posMode) && Intrinsics.EZpvd((Object) this.greekUnit, (Object) uploadSettingConfigBean.greekUnit) && Intrinsics.EZpvd((Object) this.linearTradeUnit, (Object) uploadSettingConfigBean.linearTradeUnit) && Intrinsics.EZpvd((Object) this.inverseFuturesUnit, (Object) uploadSettingConfigBean.inverseFuturesUnit) && Intrinsics.EZpvd((Object) this.invertTradeUnit, (Object) uploadSettingConfigBean.invertTradeUnit) && Intrinsics.EZpvd((Object) this.preferredCoin, (Object) uploadSettingConfigBean.preferredCoin) && Intrinsics.EZpvd((Object) this.spotAverageConfig, (Object) uploadSettingConfigBean.spotAverageConfig) && Intrinsics.EZpvd((Object) this.orderNotice, (Object) uploadSettingConfigBean.orderNotice) && Intrinsics.EZpvd((Object) this.marketOrderNotice, (Object) uploadSettingConfigBean.marketOrderNotice) && Intrinsics.EZpvd((Object) this.limitOrderNotice, (Object) uploadSettingConfigBean.limitOrderNotice) && Intrinsics.EZpvd((Object) this.reduceOnlyNotice, (Object) uploadSettingConfigBean.reduceOnlyNotice) && Intrinsics.EZpvd((Object) this.fundingFeeRateNoticeEnabled, (Object) uploadSettingConfigBean.fundingFeeRateNoticeEnabled) && Intrinsics.EZpvd((Object) this.fundingFeeRateNoticeThreshold, (Object) uploadSettingConfigBean.fundingFeeRateNoticeThreshold) && Intrinsics.EZpvd((Object) this.liquidationGear, (Object) uploadSettingConfigBean.liquidationGear) && Intrinsics.EZpvd((Object) this.confirm, (Object) uploadSettingConfigBean.confirm) && Intrinsics.EZpvd((Object) this.mktCloseConfirm, (Object) uploadSettingConfigBean.mktCloseConfirm) && Intrinsics.EZpvd((Object) this.reversePosConfirm, (Object) uploadSettingConfigBean.reversePosConfirm) && Intrinsics.EZpvd((Object) this.chasePriceConfirm, (Object) uploadSettingConfigBean.chasePriceConfirm) && Intrinsics.EZpvd((Object) this.acctStpMode, (Object) uploadSettingConfigBean.acctStpMode) && Intrinsics.EZpvd((Object) this.liqPxSwitch, (Object) uploadSettingConfigBean.liqPxSwitch) && Intrinsics.EZpvd((Object) this.depthCountConfirm, (Object) uploadSettingConfigBean.depthCountConfirm) && Intrinsics.EZpvd((Object) this.kLineWithPriceConfig, (Object) uploadSettingConfigBean.kLineWithPriceConfig) && Intrinsics.EZpvd((Object) this.orderCloneShare, (Object) uploadSettingConfigBean.orderCloneShare) && Intrinsics.EZpvd(this.tabCustomConfig, uploadSettingConfigBean.tabCustomConfig) && Intrinsics.EZpvd(this.prepPositionShow, uploadSettingConfigBean.prepPositionShow) && Intrinsics.EZpvd((Object) this.manualKLineConfig, (Object) uploadSettingConfigBean.manualKLineConfig) && Intrinsics.EZpvd((Object) this.placeLayoutConfig, (Object) uploadSettingConfigBean.placeLayoutConfig) && Intrinsics.EZpvd((Object) this.orderByConst, (Object) uploadSettingConfigBean.orderByConst) && Intrinsics.EZpvd((Object) this.shareName, (Object) uploadSettingConfigBean.shareName) && Intrinsics.EZpvd((Object) this.isLead, (Object) uploadSettingConfigBean.isLead);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctStpMode() {
        return this.acctStpMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChasePriceConfirm() {
        return this.chasePriceConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfirm() {
        return this.confirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepthCountConfirm() {
        return this.depthCountConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFeeRateNoticeEnabled() {
        return this.fundingFeeRateNoticeEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFeeRateNoticeThreshold() {
        return this.fundingFeeRateNoticeThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreekUnit() {
        return this.greekUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInverseFuturesUnit() {
        return this.inverseFuturesUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvertTradeUnit() {
        return this.invertTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKLineWithPriceConfig() {
        return this.kLineWithPriceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderNotice() {
        return this.limitOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinearTradeUnit() {
        return this.linearTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxSwitch() {
        return this.liqPxSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidationGear() {
        return this.liquidationGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getManualKLineConfig() {
        return this.manualKLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketOrderNotice() {
        return this.marketOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCloseConfirm() {
        return this.mktCloseConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderByConst() {
        return this.orderByConst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderCloneShare() {
        return this.orderCloneShare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNotice() {
        return this.orderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceLayoutConfig() {
        return this.placeLayoutConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosMode() {
        return this.posMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreferredCoin() {
        return this.preferredCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ButtonsItems> getPrepPositionShow() {
        return this.prepPositionShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnlyNotice() {
        return this.reduceOnlyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReversePosConfirm() {
        return this.reversePosConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareName() {
        return this.shareName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotAverageConfig() {
        return this.spotAverageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTabCustomConfig() {
        return this.tabCustomConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.posMode.hashCode() * 31) + this.greekUnit.hashCode()) * 31) + this.linearTradeUnit.hashCode()) * 31) + this.inverseFuturesUnit.hashCode()) * 31) + this.invertTradeUnit.hashCode()) * 31) + this.preferredCoin.hashCode()) * 31) + this.spotAverageConfig.hashCode()) * 31) + this.orderNotice.hashCode()) * 31) + this.marketOrderNotice.hashCode()) * 31) + this.limitOrderNotice.hashCode()) * 31) + this.reduceOnlyNotice.hashCode()) * 31) + this.fundingFeeRateNoticeEnabled.hashCode()) * 31) + this.fundingFeeRateNoticeThreshold.hashCode()) * 31) + this.liquidationGear.hashCode()) * 31) + this.confirm.hashCode()) * 31) + this.mktCloseConfirm.hashCode()) * 31) + this.reversePosConfirm.hashCode()) * 31) + this.chasePriceConfirm.hashCode()) * 31) + this.acctStpMode.hashCode()) * 31) + this.liqPxSwitch.hashCode()) * 31) + this.depthCountConfirm.hashCode()) * 31) + this.kLineWithPriceConfig.hashCode()) * 31) + this.orderCloneShare.hashCode()) * 31) + this.tabCustomConfig.hashCode()) * 31) + this.prepPositionShow.hashCode()) * 31) + this.manualKLineConfig.hashCode()) * 31) + this.placeLayoutConfig.hashCode()) * 31) + this.orderByConst.hashCode()) * 31) + this.shareName.hashCode()) * 31) + this.isLead.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLead() {
        return this.isLead;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadSettingConfigBean(posMode=" + this.posMode + ", greekUnit=" + this.greekUnit + ", linearTradeUnit=" + this.linearTradeUnit + ", inverseFuturesUnit=" + this.inverseFuturesUnit + ", invertTradeUnit=" + this.invertTradeUnit + ", preferredCoin=" + this.preferredCoin + ", spotAverageConfig=" + this.spotAverageConfig + ", orderNotice=" + this.orderNotice + ", marketOrderNotice=" + this.marketOrderNotice + ", limitOrderNotice=" + this.limitOrderNotice + ", reduceOnlyNotice=" + this.reduceOnlyNotice + ", fundingFeeRateNoticeEnabled=" + this.fundingFeeRateNoticeEnabled + ", fundingFeeRateNoticeThreshold=" + this.fundingFeeRateNoticeThreshold + ", liquidationGear=" + this.liquidationGear + ", confirm=" + this.confirm + ", mktCloseConfirm=" + this.mktCloseConfirm + ", reversePosConfirm=" + this.reversePosConfirm + ", chasePriceConfirm=" + this.chasePriceConfirm + ", acctStpMode=" + this.acctStpMode + ", liqPxSwitch=" + this.liqPxSwitch + ", depthCountConfirm=" + this.depthCountConfirm + ", kLineWithPriceConfig=" + this.kLineWithPriceConfig + ", orderCloneShare=" + this.orderCloneShare + ", tabCustomConfig=" + this.tabCustomConfig + ", prepPositionShow=" + this.prepPositionShow + ", manualKLineConfig=" + this.manualKLineConfig + ", placeLayoutConfig=" + this.placeLayoutConfig + ", orderByConst=" + this.orderByConst + ", shareName=" + this.shareName + ", isLead=" + this.isLead + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posMode);
        parcel.writeString(this.greekUnit);
        parcel.writeString(this.linearTradeUnit);
        parcel.writeString(this.inverseFuturesUnit);
        parcel.writeString(this.invertTradeUnit);
        parcel.writeString(this.preferredCoin);
        parcel.writeString(this.spotAverageConfig);
        parcel.writeString(this.orderNotice);
        parcel.writeString(this.marketOrderNotice);
        parcel.writeString(this.limitOrderNotice);
        parcel.writeString(this.reduceOnlyNotice);
        parcel.writeString(this.fundingFeeRateNoticeEnabled);
        parcel.writeString(this.fundingFeeRateNoticeThreshold);
        parcel.writeString(this.liquidationGear);
        parcel.writeString(this.confirm);
        parcel.writeString(this.mktCloseConfirm);
        parcel.writeString(this.reversePosConfirm);
        parcel.writeString(this.chasePriceConfirm);
        parcel.writeString(this.acctStpMode);
        parcel.writeString(this.liqPxSwitch);
        parcel.writeString(this.depthCountConfirm);
        parcel.writeString(this.kLineWithPriceConfig);
        parcel.writeString(this.orderCloneShare);
        parcel.writeStringList(this.tabCustomConfig);
        List<ButtonsItems> list = this.prepPositionShow;
        parcel.writeInt(list.size());
        Iterator<ButtonsItems> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.manualKLineConfig);
        parcel.writeString(this.placeLayoutConfig);
        parcel.writeString(this.orderByConst);
        parcel.writeString(this.shareName);
        parcel.writeString(this.isLead);
    }

    public UploadSettingConfigBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull List<String> list, @NotNull List<ButtonsItems> list2, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        this.posMode = str;
        this.greekUnit = str2;
        this.linearTradeUnit = str3;
        this.inverseFuturesUnit = str4;
        this.invertTradeUnit = str5;
        this.preferredCoin = str6;
        this.spotAverageConfig = str7;
        this.orderNotice = str8;
        this.marketOrderNotice = str9;
        this.limitOrderNotice = str10;
        this.reduceOnlyNotice = str11;
        this.fundingFeeRateNoticeEnabled = str12;
        this.fundingFeeRateNoticeThreshold = str13;
        this.liquidationGear = str14;
        this.confirm = str15;
        this.mktCloseConfirm = str16;
        this.reversePosConfirm = str17;
        this.chasePriceConfirm = str18;
        this.acctStpMode = str19;
        this.liqPxSwitch = str20;
        this.depthCountConfirm = str21;
        this.kLineWithPriceConfig = str22;
        this.orderCloneShare = str23;
        this.tabCustomConfig = list;
        this.prepPositionShow = list2;
        this.manualKLineConfig = str24;
        this.placeLayoutConfig = str25;
        this.orderByConst = str26;
        this.shareName = str27;
        this.isLead = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0167: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r62v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r62v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r62v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r62v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r62v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r62v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r62v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r62v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r62v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r62v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r62v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r62v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r62v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r62v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r62v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r62v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r62v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r62v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r62v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r62v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r62v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r62v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r62v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00da: ARITH (r62v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00de: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5403)) : (r55v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r62v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00eb: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5404)) : (r56v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r62v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r62v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (r62v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0115: ARITH (r62v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0120: ARITH (r62v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.unify_trade.biz.ButtonsItems>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5377) call: com.okinc.unify_trade.biz.UploadSettingConfigBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UploadSettingConfigBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, List list, List list2, String str24, String str25, String str26, String str27, String str28, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? yDY.AhwBna() : list, (i & 16777216) != 0 ? yDY.AhwBna() : list2, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? "" : str25, (i & 134217728) != 0 ? "" : str26, (i & 268435456) != 0 ? "" : str27, (i & 536870912) != 0 ? "" : str28);
    }
}
