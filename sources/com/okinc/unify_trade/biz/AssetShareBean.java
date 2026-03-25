package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AssetShareBean extends BaseAShareBean {
    private String businessType;
    private String buyType;
    private String chainLogoUrl;
    private String coinType;
    private String commonTipsTitle;
    private String commonTipsValue;
    private boolean isCedefi;
    private boolean isLong;
    private boolean isRedUpGreenDown;
    private String lastPrice;
    private String lastText;
    private String level;
    private int leverColor;
    private String longShort;
    private int longShortColor;
    private String netBuyCcy;
    private String netBuyText;
    private String netBuyValue;
    private String openPrice;
    private String openText;
    private String pnlShowText;
    private String pnlShowUnit;
    private String profitRate;
    private String profitRateDesc;
    private String rate;
    private RoundingMode rateRoundingMode;
    private String rateTitle;
    private String shareFrom;
    private String shareTime;
    private String shareTitle;
    private Boolean showNetBuy;
    private int spotCoinFromEndIndex;
    private int spotCoinFromIndex;
    private String state;
    private String status;
    private String symbol;
    private String tokenAddress;
    private String tokenLogoURL;
    private boolean yieldHunterShowAll;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetShareBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("java.math.RoundingMode", RoundingMode.values()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AssetShareBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetShareBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new AssetShareBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetShareBean[] newArray(int i) {
            return new AssetShareBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessType() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyType() {
        return this.buyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommonTipsTitle() {
        return this.commonTipsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommonTipsValue() {
        return this.commonTipsValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastText() {
        return this.lastText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLeverColor() {
        return this.leverColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongShort() {
        return this.longShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLongShortColor() {
        return this.longShortColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetBuyCcy() {
        return this.netBuyCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetBuyText() {
        return this.netBuyText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetBuyValue() {
        return this.netBuyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPrice() {
        return this.openPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenText() {
        return this.openText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlShowText() {
        return this.pnlShowText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlShowUnit() {
        return this.pnlShowUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitRate() {
        return this.profitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitRateDesc() {
        return this.profitRateDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RoundingMode getRateRoundingMode() {
        return this.rateRoundingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTitle() {
        return this.rateTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareFrom() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareTime() {
        return this.shareTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareTitle() {
        return this.shareTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowNetBuy() {
        return this.showNetBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSpotCoinFromEndIndex() {
        return this.spotCoinFromEndIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSpotCoinFromIndex() {
        return this.spotCoinFromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoURL() {
        return this.tokenLogoURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getYieldHunterShowAll() {
        return this.yieldHunterShowAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCedefi() {
        return this.isCedefi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLong() {
        return this.isLong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRedUpGreenDown() {
        return this.isRedUpGreenDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBusinessType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.businessType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyType(String str) {
        this.buyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCedefi(boolean z) {
        this.isCedefi = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(String str) {
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommonTipsTitle(String str) {
        this.commonTipsTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommonTipsValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.commonTipsValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.level = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverColor(int i) {
        this.leverColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLong(boolean z) {
        this.isLong = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongShort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.longShort = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongShortColor(int i) {
        this.longShortColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetBuyCcy(String str) {
        this.netBuyCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetBuyText(String str) {
        this.netBuyText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetBuyValue(String str) {
        this.netBuyValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlShowText(String str) {
        this.pnlShowText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlShowUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlShowUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitRateDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitRateDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRoundingMode(@NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        this.rateRoundingMode = roundingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateTitle(String str) {
        this.rateTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedUpGreenDown(boolean z) {
        this.isRedUpGreenDown = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareFrom(String str) {
        this.shareFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareTime(String str) {
        this.shareTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareTitle(String str) {
        this.shareTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowNetBuy(Boolean bool) {
        this.showNetBuy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotCoinFromEndIndex(int i) {
        this.spotCoinFromEndIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotCoinFromIndex(int i) {
        this.spotCoinFromIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogoURL(String str) {
        this.tokenLogoURL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYieldHunterShowAll(boolean z) {
        this.yieldHunterShowAll = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AssetShareBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetShareBean> serializer() {
            return AssetShareBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetShareBean(int i, int i2, String str, String str2, Boolean bool, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, boolean z2, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, RoundingMode roundingMode, String str24, String str25, String str26, String str27, int i3, boolean z3, boolean z4, String str28, String str29, String str30, String str31, int i4, int i5, int i6, String str32, String str33, String str34, String str35, String str36, boolean z5, String str37, String str38, String str39, String str40, String str41, String str42, Boolean bool2, String str43, String str44, String str45, boolean z6, SerializationConstructorMarker serializationConstructorMarker) {
        AssetShareBean assetShareBean;
        super(i, str, str2, bool, str3, z, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, num, str14, str15, z2, str16, serializationConstructorMarker);
        if ((i & 1048576) == 0) {
            assetShareBean = this;
            assetShareBean.coinType = "";
        } else {
            assetShareBean = this;
            assetShareBean.coinType = str17;
        }
        if ((i & 2097152) == 0) {
            assetShareBean.shareTitle = "";
        } else {
            assetShareBean.shareTitle = str18;
        }
        if ((i & 4194304) == 0) {
            assetShareBean.businessType = "";
        } else {
            assetShareBean.businessType = str19;
        }
        if ((i & 8388608) == 0) {
            assetShareBean.shareTime = "";
        } else {
            assetShareBean.shareTime = str20;
        }
        if ((i & 16777216) == 0) {
            assetShareBean.buyType = "";
        } else {
            assetShareBean.buyType = str21;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            assetShareBean.state = "";
        } else {
            assetShareBean.state = str22;
        }
        if ((i & 67108864) == 0) {
            assetShareBean.symbol = "";
        } else {
            assetShareBean.symbol = str23;
        }
        assetShareBean.rateRoundingMode = (i & 134217728) == 0 ? RoundingMode.DOWN : roundingMode;
        if ((i & 268435456) == 0) {
            assetShareBean.rate = "";
        } else {
            assetShareBean.rate = str24;
        }
        if ((i & 536870912) == 0) {
            assetShareBean.openPrice = "";
        } else {
            assetShareBean.openPrice = str25;
        }
        if ((i & 1073741824) == 0) {
            assetShareBean.lastPrice = "";
        } else {
            assetShareBean.lastPrice = str26;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            assetShareBean.longShort = "";
        } else {
            assetShareBean.longShort = str27;
        }
        if ((i2 & 1) == 0) {
            assetShareBean.longShortColor = 0;
        } else {
            assetShareBean.longShortColor = i3;
        }
        if ((i2 & 2) == 0) {
            assetShareBean.isLong = false;
        } else {
            assetShareBean.isLong = z3;
        }
        if ((i2 & 4) == 0) {
            assetShareBean.isRedUpGreenDown = false;
        } else {
            assetShareBean.isRedUpGreenDown = z4;
        }
        if ((i2 & 8) == 0) {
            assetShareBean.status = "";
        } else {
            assetShareBean.status = str28;
        }
        if ((i2 & 16) == 0) {
            assetShareBean.openText = "";
        } else {
            assetShareBean.openText = str29;
        }
        if ((i2 & 32) == 0) {
            assetShareBean.lastText = "";
        } else {
            assetShareBean.lastText = str30;
        }
        if ((i2 & 64) == 0) {
            assetShareBean.level = "";
        } else {
            assetShareBean.level = str31;
        }
        if ((i2 & 128) == 0) {
            assetShareBean.leverColor = 0;
        } else {
            assetShareBean.leverColor = i4;
        }
        if ((i2 & 256) == 0) {
            assetShareBean.spotCoinFromIndex = 0;
        } else {
            assetShareBean.spotCoinFromIndex = i5;
        }
        if ((i2 & 512) == 0) {
            assetShareBean.spotCoinFromEndIndex = 0;
        } else {
            assetShareBean.spotCoinFromEndIndex = i6;
        }
        if ((i2 & 1024) == 0) {
            assetShareBean.pnlShowText = null;
        } else {
            assetShareBean.pnlShowText = str32;
        }
        if ((i2 & 2048) == 0) {
            assetShareBean.pnlShowUnit = "";
        } else {
            assetShareBean.pnlShowUnit = str33;
        }
        if ((i2 & 4096) == 0) {
            assetShareBean.shareFrom = null;
        } else {
            assetShareBean.shareFrom = str34;
        }
        if ((i2 & 8192) == 0) {
            assetShareBean.profitRateDesc = "";
        } else {
            assetShareBean.profitRateDesc = str35;
        }
        if ((i2 & 16384) == 0) {
            assetShareBean.profitRate = "";
        } else {
            assetShareBean.profitRate = str36;
        }
        if ((32768 & i2) == 0) {
            assetShareBean.yieldHunterShowAll = false;
        } else {
            assetShareBean.yieldHunterShowAll = z5;
        }
        if ((65536 & i2) == 0) {
            assetShareBean.rateTitle = null;
        } else {
            assetShareBean.rateTitle = str37;
        }
        if ((131072 & i2) == 0) {
            assetShareBean.netBuyText = "";
        } else {
            assetShareBean.netBuyText = str38;
        }
        if ((262144 & i2) == 0) {
            assetShareBean.netBuyValue = "";
        } else {
            assetShareBean.netBuyValue = str39;
        }
        if ((524288 & i2) == 0) {
            assetShareBean.commonTipsTitle = "";
        } else {
            assetShareBean.commonTipsTitle = str40;
        }
        if ((1048576 & i2) == 0) {
            assetShareBean.commonTipsValue = "";
        } else {
            assetShareBean.commonTipsValue = str41;
        }
        if ((i2 & 2097152) == 0) {
            assetShareBean.netBuyCcy = "";
        } else {
            assetShareBean.netBuyCcy = str42;
        }
        assetShareBean.showNetBuy = (i2 & 4194304) == 0 ? Boolean.FALSE : bool2;
        if ((i2 & 8388608) == 0) {
            assetShareBean.tokenLogoURL = "";
        } else {
            assetShareBean.tokenLogoURL = str43;
        }
        if ((i2 & 16777216) == 0) {
            assetShareBean.chainLogoUrl = "";
        } else {
            assetShareBean.chainLogoUrl = str44;
        }
        if ((i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            assetShareBean.tokenAddress = "";
        } else {
            assetShareBean.tokenAddress = str45;
        }
        if ((i2 & 67108864) == 0) {
            assetShareBean.isCedefi = false;
        } else {
            assetShareBean.isCedefi = z6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AssetShareBean assetShareBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseAShareBean.write$Self(assetShareBean, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) assetShareBean.coinType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, assetShareBean.coinType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) assetShareBean.shareTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, assetShareBean.shareTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) assetShareBean.businessType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, assetShareBean.businessType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) assetShareBean.shareTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, assetShareBean.shareTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) assetShareBean.buyType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, assetShareBean.buyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) assetShareBean.state, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, assetShareBean.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) assetShareBean.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, assetShareBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || assetShareBean.rateRoundingMode != RoundingMode.DOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 27, kSerializerArr[27], assetShareBean.rateRoundingMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) assetShareBean.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, assetShareBean.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) assetShareBean.openPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, assetShareBean.openPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) assetShareBean.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, assetShareBean.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) assetShareBean.longShort, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, assetShareBean.longShort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || assetShareBean.longShortColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 32, assetShareBean.longShortColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || assetShareBean.isLong) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, assetShareBean.isLong);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || assetShareBean.isRedUpGreenDown) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, assetShareBean.isRedUpGreenDown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) assetShareBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, assetShareBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) assetShareBean.openText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, assetShareBean.openText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) assetShareBean.lastText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, assetShareBean.lastText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) assetShareBean.level, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, assetShareBean.level);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || assetShareBean.leverColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 39, assetShareBean.leverColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || assetShareBean.spotCoinFromIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 40, assetShareBean.spotCoinFromIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || assetShareBean.spotCoinFromEndIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 41, assetShareBean.spotCoinFromEndIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || assetShareBean.pnlShowText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, assetShareBean.pnlShowText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) assetShareBean.pnlShowUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, assetShareBean.pnlShowUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || assetShareBean.shareFrom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, assetShareBean.shareFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) assetShareBean.profitRateDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, assetShareBean.profitRateDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) assetShareBean.profitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, assetShareBean.profitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || assetShareBean.yieldHunterShowAll) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 47, assetShareBean.yieldHunterShowAll);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || assetShareBean.rateTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, assetShareBean.rateTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) assetShareBean.netBuyText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, StringSerializer.INSTANCE, assetShareBean.netBuyText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) assetShareBean.netBuyValue, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, assetShareBean.netBuyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) assetShareBean.commonTipsTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, assetShareBean.commonTipsTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) assetShareBean.commonTipsValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, assetShareBean.commonTipsValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) assetShareBean.netBuyCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, assetShareBean.netBuyCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd(assetShareBean.showNetBuy, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, BooleanSerializer.INSTANCE, assetShareBean.showNetBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) assetShareBean.tokenLogoURL, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, assetShareBean.tokenLogoURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) assetShareBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, assetShareBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) assetShareBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, assetShareBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || assetShareBean.isCedefi) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 58, assetShareBean.isCedefi);
        }
    }

    public AssetShareBean() {
        this.coinType = "";
        this.shareTitle = "";
        this.businessType = "";
        this.shareTime = "";
        this.buyType = "";
        this.state = "";
        this.symbol = "";
        this.rateRoundingMode = RoundingMode.DOWN;
        this.rate = "";
        this.openPrice = "";
        this.lastPrice = "";
        this.longShort = "";
        this.status = "";
        this.openText = "";
        this.lastText = "";
        this.level = "";
        this.pnlShowUnit = "";
        this.profitRateDesc = "";
        this.profitRate = "";
        this.netBuyText = "";
        this.netBuyValue = "";
        this.commonTipsTitle = "";
        this.commonTipsValue = "";
        this.netBuyCcy = "";
        this.showNetBuy = Boolean.FALSE;
        this.tokenLogoURL = "";
        this.chainLogoUrl = "";
        this.tokenAddress = "";
    }
}
