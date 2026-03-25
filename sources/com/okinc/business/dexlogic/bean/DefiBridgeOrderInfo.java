package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C22380heK;
import o.C23313hvq;
import o.C33129mqd;
import o.InterfaceC9738bbJ;
import o.pTB;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DefiBridgeOrderInfo implements Parcelable {
    private String anyTokenSymbol;
    private String chainId;
    private String chainLogoUrl;
    private DefiPlatformInfos defiPlatformInfo;
    private long estimatedSecond;
    private String estimatedTime;
    private String exploreUrl;
    private String extendStatus;
    private String formatTime;
    private String fromAmount;
    private String fromChainName;
    private String fromIcon;
    private String fromTokenSymbol;
    private boolean isShowCancel;
    private boolean isShowSpeedUp;
    private boolean isShowSpeedUpCancel;
    private String orderId;
    private String price;
    private String replaceTokenSymbol;
    private boolean showLine;
    private String specialOrderType;
    private String speedUpTxHash;
    private String status;
    private String swapTradeType;
    private String time;
    private String toAmount;
    private String toChainId;
    private String toChainLogoUrl;
    private String toChainName;
    private String toIcon;
    private String toTokenSymbol;
    private String transactionHash;
    private String txId;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DefiBridgeOrderInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DefiBridgeOrderInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiBridgeOrderInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DefiBridgeOrderInfo(parcel.readString(), DefiPlatformInfos.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiBridgeOrderInfo[] newArray(int i) {
            return new DefiBridgeOrderInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiBridgeOrderInfo() {
        this((String) null, (DefiPlatformInfos) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 0L, (String) null, false, false, false, (String) null, (String) null, (String) null, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefiBridgeOrderInfo copy$default(DefiBridgeOrderInfo defiBridgeOrderInfo, String str, DefiPlatformInfos defiPlatformInfos, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, boolean z, String str22, String str23, String str24, long j, String str25, boolean z2, boolean z3, boolean z4, String str26, String str27, String str28, int i, int i2, Object obj) {
        return defiBridgeOrderInfo.copy((i & 1) != 0 ? defiBridgeOrderInfo.chainId : str, (i & 2) != 0 ? defiBridgeOrderInfo.defiPlatformInfo : defiPlatformInfos, (i & 4) != 0 ? defiBridgeOrderInfo.exploreUrl : str2, (i & 8) != 0 ? defiBridgeOrderInfo.fromAmount : str3, (i & 16) != 0 ? defiBridgeOrderInfo.fromTokenSymbol : str4, (i & 32) != 0 ? defiBridgeOrderInfo.fromChainName : str5, (i & 64) != 0 ? defiBridgeOrderInfo.fromIcon : str6, (i & 128) != 0 ? defiBridgeOrderInfo.toIcon : str7, (i & 256) != 0 ? defiBridgeOrderInfo.toChainName : str8, (i & 512) != 0 ? defiBridgeOrderInfo.price : str9, (i & 1024) != 0 ? defiBridgeOrderInfo.status : str10, (i & 2048) != 0 ? defiBridgeOrderInfo.time : str11, (i & 4096) != 0 ? defiBridgeOrderInfo.toAmount : str12, (i & 8192) != 0 ? defiBridgeOrderInfo.toTokenSymbol : str13, (i & 16384) != 0 ? defiBridgeOrderInfo.transactionHash : str14, (i & 32768) != 0 ? defiBridgeOrderInfo.userWalletAddress : str15, (i & 65536) != 0 ? defiBridgeOrderInfo.chainLogoUrl : str16, (i & 131072) != 0 ? defiBridgeOrderInfo.orderId : str17, (i & 262144) != 0 ? defiBridgeOrderInfo.swapTradeType : str18, (i & 524288) != 0 ? defiBridgeOrderInfo.toChainId : str19, (i & 1048576) != 0 ? defiBridgeOrderInfo.toChainLogoUrl : str20, (i & 2097152) != 0 ? defiBridgeOrderInfo.formatTime : str21, (i & 4194304) != 0 ? defiBridgeOrderInfo.showLine : z, (i & 8388608) != 0 ? defiBridgeOrderInfo.anyTokenSymbol : str22, (i & 16777216) != 0 ? defiBridgeOrderInfo.replaceTokenSymbol : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? defiBridgeOrderInfo.estimatedTime : str24, (i & 67108864) != 0 ? defiBridgeOrderInfo.estimatedSecond : j, (i & 134217728) != 0 ? defiBridgeOrderInfo.extendStatus : str25, (268435456 & i) != 0 ? defiBridgeOrderInfo.isShowSpeedUp : z2, (i & 536870912) != 0 ? defiBridgeOrderInfo.isShowCancel : z3, (i & 1073741824) != 0 ? defiBridgeOrderInfo.isShowSpeedUpCancel : z4, (i & Integer.MIN_VALUE) != 0 ? defiBridgeOrderInfo.speedUpTxHash : str26, (i2 & 1) != 0 ? defiBridgeOrderInfo.txId : str27, (i2 & 2) != 0 ? defiBridgeOrderInfo.specialOrderType : str28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfos component2() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.formatTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.showLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.anyTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.replaceTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component27() {
        return this.estimatedSecond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.specialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiBridgeOrderInfo copy(@NotNull String str, @NotNull DefiPlatformInfos defiPlatformInfos, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, boolean z, @NotNull String str22, @NotNull String str23, @NotNull String str24, long j, @NotNull String str25, boolean z2, boolean z3, boolean z4, @NotNull String str26, @NotNull String str27, @NotNull String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfos, "");
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
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        return new DefiBridgeOrderInfo(str, defiPlatformInfos, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, z, str22, str23, str24, j, str25, z2, z3, z4, str26, str27, str28);
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
        if (!(obj instanceof DefiBridgeOrderInfo)) {
            return false;
        }
        DefiBridgeOrderInfo defiBridgeOrderInfo = (DefiBridgeOrderInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) defiBridgeOrderInfo.chainId) && Intrinsics.EZpvd(this.defiPlatformInfo, defiBridgeOrderInfo.defiPlatformInfo) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) defiBridgeOrderInfo.exploreUrl) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) defiBridgeOrderInfo.fromAmount) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) defiBridgeOrderInfo.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.fromChainName, (Object) defiBridgeOrderInfo.fromChainName) && Intrinsics.EZpvd((Object) this.fromIcon, (Object) defiBridgeOrderInfo.fromIcon) && Intrinsics.EZpvd((Object) this.toIcon, (Object) defiBridgeOrderInfo.toIcon) && Intrinsics.EZpvd((Object) this.toChainName, (Object) defiBridgeOrderInfo.toChainName) && Intrinsics.EZpvd((Object) this.price, (Object) defiBridgeOrderInfo.price) && Intrinsics.EZpvd((Object) this.status, (Object) defiBridgeOrderInfo.status) && Intrinsics.EZpvd((Object) this.time, (Object) defiBridgeOrderInfo.time) && Intrinsics.EZpvd((Object) this.toAmount, (Object) defiBridgeOrderInfo.toAmount) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) defiBridgeOrderInfo.toTokenSymbol) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) defiBridgeOrderInfo.transactionHash) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) defiBridgeOrderInfo.userWalletAddress) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) defiBridgeOrderInfo.chainLogoUrl) && Intrinsics.EZpvd((Object) this.orderId, (Object) defiBridgeOrderInfo.orderId) && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) defiBridgeOrderInfo.swapTradeType) && Intrinsics.EZpvd((Object) this.toChainId, (Object) defiBridgeOrderInfo.toChainId) && Intrinsics.EZpvd((Object) this.toChainLogoUrl, (Object) defiBridgeOrderInfo.toChainLogoUrl) && Intrinsics.EZpvd((Object) this.formatTime, (Object) defiBridgeOrderInfo.formatTime) && this.showLine == defiBridgeOrderInfo.showLine && Intrinsics.EZpvd((Object) this.anyTokenSymbol, (Object) defiBridgeOrderInfo.anyTokenSymbol) && Intrinsics.EZpvd((Object) this.replaceTokenSymbol, (Object) defiBridgeOrderInfo.replaceTokenSymbol) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) defiBridgeOrderInfo.estimatedTime) && this.estimatedSecond == defiBridgeOrderInfo.estimatedSecond && Intrinsics.EZpvd((Object) this.extendStatus, (Object) defiBridgeOrderInfo.extendStatus) && this.isShowSpeedUp == defiBridgeOrderInfo.isShowSpeedUp && this.isShowCancel == defiBridgeOrderInfo.isShowCancel && this.isShowSpeedUpCancel == defiBridgeOrderInfo.isShowSpeedUpCancel && Intrinsics.EZpvd((Object) this.speedUpTxHash, (Object) defiBridgeOrderInfo.speedUpTxHash) && Intrinsics.EZpvd((Object) this.txId, (Object) defiBridgeOrderInfo.txId) && Intrinsics.EZpvd((Object) this.specialOrderType, (Object) defiBridgeOrderInfo.specialOrderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnyTokenSymbol() {
        return this.anyTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCreateTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfos getDefiPlatformInfo() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEstimatedSecond() {
        return this.estimatedSecond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtendStatus() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFormatTime() {
        return this.formatTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainName() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromIcon() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReplaceTokenSymbol() {
        return this.replaceTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowLine() {
        return this.showLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpecialOrderType() {
        return this.specialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpeedUpTxHash() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapTradeType() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainLogoUrl() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainName() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToIcon() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.defiPlatformInfo.hashCode()) * 31) + this.exploreUrl.hashCode()) * 31) + this.fromAmount.hashCode()) * 31) + this.fromTokenSymbol.hashCode()) * 31) + this.fromChainName.hashCode()) * 31) + this.fromIcon.hashCode()) * 31) + this.toIcon.hashCode()) * 31) + this.toChainName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.status.hashCode()) * 31) + this.time.hashCode()) * 31) + this.toAmount.hashCode()) * 31) + this.toTokenSymbol.hashCode()) * 31) + this.transactionHash.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.swapTradeType.hashCode()) * 31) + this.toChainId.hashCode()) * 31) + this.toChainLogoUrl.hashCode()) * 31) + this.formatTime.hashCode()) * 31) + Boolean.hashCode(this.showLine)) * 31) + this.anyTokenSymbol.hashCode()) * 31) + this.replaceTokenSymbol.hashCode()) * 31) + this.estimatedTime.hashCode()) * 31) + Long.hashCode(this.estimatedSecond)) * 31) + this.extendStatus.hashCode()) * 31) + Boolean.hashCode(this.isShowSpeedUp)) * 31) + Boolean.hashCode(this.isShowCancel)) * 31) + Boolean.hashCode(this.isShowSpeedUpCancel)) * 31) + this.speedUpTxHash.hashCode()) * 31) + this.txId.hashCode()) * 31) + this.specialOrderType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCancel() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUp() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUpCancel() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnyTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.anyTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefiPlatformInfo(@NotNull DefiPlatformInfos defiPlatformInfos) {
        Intrinsics.checkNotNullParameter(defiPlatformInfos, "");
        this.defiPlatformInfo = defiPlatformInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedSecond(long j) {
        this.estimatedSecond = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtendStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extendStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFormatTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromChainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReplaceTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.replaceTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCancel(boolean z) {
        this.isShowCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowLine(boolean z) {
        this.showLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUp(boolean z) {
        this.isShowSpeedUp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUpCancel(boolean z) {
        this.isShowSpeedUpCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecialOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.specialOrderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpeedUpTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.speedUpTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapTradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.time = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toChainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toChainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiBridgeOrderInfo(chainId=" + this.chainId + ", defiPlatformInfo=" + this.defiPlatformInfo + ", exploreUrl=" + this.exploreUrl + ", fromAmount=" + this.fromAmount + ", fromTokenSymbol=" + this.fromTokenSymbol + ", fromChainName=" + this.fromChainName + ", fromIcon=" + this.fromIcon + ", toIcon=" + this.toIcon + ", toChainName=" + this.toChainName + ", price=" + this.price + ", status=" + this.status + ", time=" + this.time + ", toAmount=" + this.toAmount + ", toTokenSymbol=" + this.toTokenSymbol + ", transactionHash=" + this.transactionHash + ", userWalletAddress=" + this.userWalletAddress + ", chainLogoUrl=" + this.chainLogoUrl + ", orderId=" + this.orderId + ", swapTradeType=" + this.swapTradeType + ", toChainId=" + this.toChainId + ", toChainLogoUrl=" + this.toChainLogoUrl + ", formatTime=" + this.formatTime + ", showLine=" + this.showLine + ", anyTokenSymbol=" + this.anyTokenSymbol + ", replaceTokenSymbol=" + this.replaceTokenSymbol + ", estimatedTime=" + this.estimatedTime + ", estimatedSecond=" + this.estimatedSecond + ", extendStatus=" + this.extendStatus + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedUpCancel=" + this.isShowSpeedUpCancel + ", speedUpTxHash=" + this.speedUpTxHash + ", txId=" + this.txId + ", specialOrderType=" + this.specialOrderType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        this.defiPlatformInfo.writeToParcel(parcel, i);
        parcel.writeString(this.exploreUrl);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.fromTokenSymbol);
        parcel.writeString(this.fromChainName);
        parcel.writeString(this.fromIcon);
        parcel.writeString(this.toIcon);
        parcel.writeString(this.toChainName);
        parcel.writeString(this.price);
        parcel.writeString(this.status);
        parcel.writeString(this.time);
        parcel.writeString(this.toAmount);
        parcel.writeString(this.toTokenSymbol);
        parcel.writeString(this.transactionHash);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.orderId);
        parcel.writeString(this.swapTradeType);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.toChainLogoUrl);
        parcel.writeString(this.formatTime);
        parcel.writeInt(this.showLine ? 1 : 0);
        parcel.writeString(this.anyTokenSymbol);
        parcel.writeString(this.replaceTokenSymbol);
        parcel.writeString(this.estimatedTime);
        parcel.writeLong(this.estimatedSecond);
        parcel.writeString(this.extendStatus);
        parcel.writeInt(this.isShowSpeedUp ? 1 : 0);
        parcel.writeInt(this.isShowCancel ? 1 : 0);
        parcel.writeInt(this.isShowSpeedUpCancel ? 1 : 0);
        parcel.writeString(this.speedUpTxHash);
        parcel.writeString(this.txId);
        parcel.writeString(this.specialOrderType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiBridgeOrderInfo> serializer() {
            return DefiBridgeOrderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiBridgeOrderInfo(int i, int i2, String str, DefiPlatformInfos defiPlatformInfos, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, boolean z, String str22, String str23, String str24, long j, String str25, boolean z2, boolean z3, boolean z4, String str26, String str27, String str28, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        this.defiPlatformInfo = (i & 2) == 0 ? new DefiPlatformInfos("", "") : defiPlatformInfos;
        if ((i & 4) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str2;
        }
        if ((i & 8) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
        if ((i & 16) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str4;
        }
        if ((i & 32) == 0) {
            this.fromChainName = "";
        } else {
            this.fromChainName = str5;
        }
        if ((i & 64) == 0) {
            this.fromIcon = "";
        } else {
            this.fromIcon = str6;
        }
        if ((i & 128) == 0) {
            this.toIcon = "";
        } else {
            this.toIcon = str7;
        }
        if ((i & 256) == 0) {
            this.toChainName = "";
        } else {
            this.toChainName = str8;
        }
        if ((i & 512) == 0) {
            this.price = "";
        } else {
            this.price = str9;
        }
        if ((i & 1024) == 0) {
            this.status = "";
        } else {
            this.status = str10;
        }
        if ((i & 2048) == 0) {
            this.time = "";
        } else {
            this.time = str11;
        }
        if ((i & 4096) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str12;
        }
        if ((i & 8192) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str13;
        }
        if ((i & 16384) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str14;
        }
        if ((32768 & i) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str15;
        }
        if ((65536 & i) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str16;
        }
        if ((131072 & i) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str17;
        }
        if ((262144 & i) == 0) {
            this.swapTradeType = "";
        } else {
            this.swapTradeType = str18;
        }
        if ((524288 & i) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str19;
        }
        if ((1048576 & i) == 0) {
            this.toChainLogoUrl = "";
        } else {
            this.toChainLogoUrl = str20;
        }
        if ((2097152 & i) == 0) {
            this.formatTime = "";
        } else {
            this.formatTime = str21;
        }
        if ((4194304 & i) == 0) {
            this.showLine = false;
        } else {
            this.showLine = z;
        }
        if ((8388608 & i) == 0) {
            this.anyTokenSymbol = "";
        } else {
            this.anyTokenSymbol = str22;
        }
        if ((16777216 & i) == 0) {
            this.replaceTokenSymbol = "";
        } else {
            this.replaceTokenSymbol = str23;
        }
        if ((33554432 & i) == 0) {
            this.estimatedTime = "";
        } else {
            this.estimatedTime = str24;
        }
        this.estimatedSecond = (67108864 & i) == 0 ? 0L : j;
        if ((134217728 & i) == 0) {
            this.extendStatus = "";
        } else {
            this.extendStatus = str25;
        }
        if ((268435456 & i) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z2;
        }
        if ((536870912 & i) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z3;
        }
        this.isShowSpeedUpCancel = (1073741824 & i) != 0 ? z4 : false;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.speedUpTxHash = "";
        } else {
            this.speedUpTxHash = str26;
        }
        if ((i2 & 1) == 0) {
            this.txId = "";
        } else {
            this.txId = str27;
        }
        if ((i2 & 2) == 0) {
            this.specialOrderType = "";
        } else {
            this.specialOrderType = str28;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DefiBridgeOrderInfo defiBridgeOrderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defiBridgeOrderInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(defiBridgeOrderInfo.defiPlatformInfo, new DefiPlatformInfos("", ""))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, DefiPlatformInfos$$serializer.INSTANCE, defiBridgeOrderInfo.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, defiBridgeOrderInfo.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, defiBridgeOrderInfo.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, defiBridgeOrderInfo.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.fromChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, defiBridgeOrderInfo.fromChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.fromIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, defiBridgeOrderInfo.fromIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.toIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, defiBridgeOrderInfo.toIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.toChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, defiBridgeOrderInfo.toChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, defiBridgeOrderInfo.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, defiBridgeOrderInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.time, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, defiBridgeOrderInfo.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, defiBridgeOrderInfo.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.toTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, defiBridgeOrderInfo.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, defiBridgeOrderInfo.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, defiBridgeOrderInfo.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, defiBridgeOrderInfo.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.getOrderId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, defiBridgeOrderInfo.getOrderId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.swapTradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, defiBridgeOrderInfo.swapTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, defiBridgeOrderInfo.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.toChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, defiBridgeOrderInfo.toChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.getFormatTime(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, defiBridgeOrderInfo.getFormatTime());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || defiBridgeOrderInfo.showLine) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, defiBridgeOrderInfo.showLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.anyTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, defiBridgeOrderInfo.anyTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.replaceTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, defiBridgeOrderInfo.replaceTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.estimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, defiBridgeOrderInfo.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || defiBridgeOrderInfo.estimatedSecond != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 26, defiBridgeOrderInfo.estimatedSecond);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.extendStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, defiBridgeOrderInfo.extendStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || defiBridgeOrderInfo.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, defiBridgeOrderInfo.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || defiBridgeOrderInfo.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, defiBridgeOrderInfo.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || defiBridgeOrderInfo.isShowSpeedUpCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 30, defiBridgeOrderInfo.isShowSpeedUpCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.speedUpTxHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, defiBridgeOrderInfo.speedUpTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) defiBridgeOrderInfo.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, defiBridgeOrderInfo.txId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) && Intrinsics.EZpvd((Object) defiBridgeOrderInfo.specialOrderType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 33, defiBridgeOrderInfo.specialOrderType);
    }

    public DefiBridgeOrderInfo(@NotNull String str, @NotNull DefiPlatformInfos defiPlatformInfos, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, boolean z, @NotNull String str22, @NotNull String str23, @NotNull String str24, long j, @NotNull String str25, boolean z2, boolean z3, boolean z4, @NotNull String str26, @NotNull String str27, @NotNull String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfos, "");
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
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        this.chainId = str;
        this.defiPlatformInfo = defiPlatformInfos;
        this.exploreUrl = str2;
        this.fromAmount = str3;
        this.fromTokenSymbol = str4;
        this.fromChainName = str5;
        this.fromIcon = str6;
        this.toIcon = str7;
        this.toChainName = str8;
        this.price = str9;
        this.status = str10;
        this.time = str11;
        this.toAmount = str12;
        this.toTokenSymbol = str13;
        this.transactionHash = str14;
        this.userWalletAddress = str15;
        this.chainLogoUrl = str16;
        this.orderId = str17;
        this.swapTradeType = str18;
        this.toChainId = str19;
        this.toChainLogoUrl = str20;
        this.formatTime = str21;
        this.showLine = z;
        this.anyTokenSymbol = str22;
        this.replaceTokenSymbol = str23;
        this.estimatedTime = str24;
        this.estimatedSecond = j;
        this.extendStatus = str25;
        this.isShowSpeedUp = z2;
        this.isShowCancel = z3;
        this.isShowSpeedUpCancel = z4;
        this.speedUpTxHash = str26;
        this.txId = str27;
        this.specialOrderType = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0197: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfos:?: TERNARY null = ((wrap:int:0x000c: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: CONSTRUCTOR (""), ("") A[MD:(java.lang.String, java.lang.String):void (m), WRAPPED] (LINE:89) call: com.okinc.business.dexlogic.bean.DefiPlatformInfos.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR) : (r37v0 com.okinc.business.dexlogic.bean.DefiPlatformInfos))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r71v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r71v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r71v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r71v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r71v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r71v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r71v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r71v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r71v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r71v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r71v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r71v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r71v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r71v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r71v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (r71v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r71v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r71v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r71v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r71v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d3: ARITH (r71v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r71v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r71v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r71v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0101: ARITH (r71v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r62v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r71v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0117: ARITH (r71v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0122: ARITH (r71v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? false : (r66v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x012d: ARITH (r71v0 int) & (1073741824 int) A[WRAPPED]) == (0 int)) ? (r67v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0136: ARITH (r71v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0148: ARITH (r72v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DefiPlatformInfos, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:87) call: com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DefiPlatformInfos, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DefiBridgeOrderInfo(String str, DefiPlatformInfos defiPlatformInfos, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, boolean z, String str22, String str23, String str24, long j, String str25, boolean z2, boolean z3, boolean z4, String str26, String str27, String str28, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new DefiPlatformInfos("", "") : defiPlatformInfos, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? false : z, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? 0L : j, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? false : z2, (i & 536870912) != 0 ? false : z3, (i & 1073741824) == 0 ? z4 : false, (i & Integer.MIN_VALUE) != 0 ? "" : str26, (i2 & 1) != 0 ? "" : str27, (i2 & 2) != 0 ? "" : str28);
    }

    public final boolean isSingleChain() {
        return this.swapTradeType.equals("1") || C23313hvq.copydefault(this.swapTradeType, "4");
    }

    public final Pair<Boolean, String> getOutOfFormatTime() {
        long j = this.estimatedSecond;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((Object) C23313hvq.divCheckS$default(Long.valueOf(j - jElapsedRealtime), C23313hvq.mulCheckS$default(60, 1000, null, null, null, 14, null), 0, null, RoundingMode.UP, 4, null));
        return new Pair<>(Boolean.valueOf(C23313hvq.OLrzqt(bigDecimalOLrzqt, 0)), pTB.formatUpToMax$default(bigDecimalOLrzqt, 0, null, 3, null));
    }

    public void calcEstimatedSecond(long j) {
        this.estimatedSecond = C33129mqd.valueOf(C23313hvq.mulCheckS$default(this.estimatedTime, 1000, null, null, null, 14, null)) + j;
    }

    public final boolean showFacetSwapButton(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(str).fARcdN().AEQbTJ();
        return yDY.gEmmrt("11", "200", "202").contains(this.status) && !(interfaceC9738bbJAEQbTJ != null && interfaceC9738bbJAEQbTJ.QfsBiF());
    }
}
