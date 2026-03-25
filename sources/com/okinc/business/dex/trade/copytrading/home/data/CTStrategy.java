package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo;
import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTStrategy {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final StrategyTokenInfo boughtTokenInfo;
    private final int chainId;
    private final String chainLogo;
    private final int copyBuyNum;
    private final String copyTradeName;
    private final String createTime;
    private final String expireTime;
    private final KolInfo kolInfo;
    private final int sellNum;
    private final StrategyTokenInfo soldTokenInfo;
    private final String strategyId;
    private final PnLDetail totalPnL;
    private final String trackedAddress;
    private final int useStatus;
    private final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CTStrategy() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, (StrategyTokenInfo) null, (StrategyTokenInfo) null, (PnLDetail) null, (KolInfo) null, 32767, (DefaultConstructorMarker) null);
    }

    @SerialName("boughtTokenInfo")
    public static /* synthetic */ void getBoughtTokenInfo$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("chainLogo")
    public static /* synthetic */ void getChainLogo$annotations() {
    }

    @SerialName("copyBuyNum")
    public static /* synthetic */ void getCopyBuyNum$annotations() {
    }

    @SerialName("copyTradeName")
    public static /* synthetic */ void getCopyTradeName$annotations() {
    }

    @SerialName("createTime")
    public static /* synthetic */ void getCreateTime$annotations() {
    }

    @SerialName("expireTime")
    public static /* synthetic */ void getExpireTime$annotations() {
    }

    @SerialName("kolInfo")
    public static /* synthetic */ void getKolInfo$annotations() {
    }

    @SerialName("sellNum")
    public static /* synthetic */ void getSellNum$annotations() {
    }

    @SerialName("soldTokenInfo")
    public static /* synthetic */ void getSoldTokenInfo$annotations() {
    }

    @SerialName("strategyId")
    public static /* synthetic */ void getStrategyId$annotations() {
    }

    @SerialName("totalPnl")
    public static /* synthetic */ void getTotalPnL$annotations() {
    }

    @SerialName("trackedAddress")
    public static /* synthetic */ void getTrackedAddress$annotations() {
    }

    @SerialName("useStatus")
    public static /* synthetic */ void getUseStatus$annotations() {
    }

    @SerialName("walletAddress")
    public static /* synthetic */ void getWalletAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.copyBuyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.sellNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyTokenInfo component12() {
        return this.boughtTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyTokenInfo component13() {
        return this.soldTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail component14() {
        return this.totalPnL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfo component15() {
        return this.kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.copyTradeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.trackedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTStrategy copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2, @NotNull String str6, @NotNull String str7, int i3, int i4, @NotNull StrategyTokenInfo strategyTokenInfo, @NotNull StrategyTokenInfo strategyTokenInfo2, @NotNull PnLDetail pnLDetail, @NotNull KolInfo kolInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(strategyTokenInfo, "");
        Intrinsics.checkNotNullParameter(strategyTokenInfo2, "");
        Intrinsics.checkNotNullParameter(pnLDetail, "");
        Intrinsics.checkNotNullParameter(kolInfo, "");
        return new CTStrategy(i, str, str2, str3, str4, str5, i2, str6, str7, i3, i4, strategyTokenInfo, strategyTokenInfo2, pnLDetail, kolInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTStrategy)) {
            return false;
        }
        CTStrategy cTStrategy = (CTStrategy) obj;
        return this.chainId == cTStrategy.chainId && Intrinsics.EZpvd((Object) this.chainLogo, (Object) cTStrategy.chainLogo) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) cTStrategy.walletAddress) && Intrinsics.EZpvd((Object) this.strategyId, (Object) cTStrategy.strategyId) && Intrinsics.EZpvd((Object) this.copyTradeName, (Object) cTStrategy.copyTradeName) && Intrinsics.EZpvd((Object) this.trackedAddress, (Object) cTStrategy.trackedAddress) && this.useStatus == cTStrategy.useStatus && Intrinsics.EZpvd((Object) this.createTime, (Object) cTStrategy.createTime) && Intrinsics.EZpvd((Object) this.expireTime, (Object) cTStrategy.expireTime) && this.copyBuyNum == cTStrategy.copyBuyNum && this.sellNum == cTStrategy.sellNum && Intrinsics.EZpvd(this.boughtTokenInfo, cTStrategy.boughtTokenInfo) && Intrinsics.EZpvd(this.soldTokenInfo, cTStrategy.soldTokenInfo) && Intrinsics.EZpvd(this.totalPnL, cTStrategy.totalPnL) && Intrinsics.EZpvd(this.kolInfo, cTStrategy.kolInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyTokenInfo getBoughtTokenInfo() {
        return this.boughtTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCopyBuyNum() {
        return this.copyBuyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyTradeName() {
        return this.copyTradeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfo getKolInfo() {
        return this.kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSellNum() {
        return this.sellNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyTokenInfo getSoldTokenInfo() {
        return this.soldTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail getTotalPnL() {
        return this.totalPnL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackedAddress() {
        return this.trackedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUseStatus() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.chainId) * 31) + this.chainLogo.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.strategyId.hashCode()) * 31) + this.copyTradeName.hashCode()) * 31) + this.trackedAddress.hashCode()) * 31) + Integer.hashCode(this.useStatus)) * 31) + this.createTime.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + Integer.hashCode(this.copyBuyNum)) * 31) + Integer.hashCode(this.sellNum)) * 31) + this.boughtTokenInfo.hashCode()) * 31) + this.soldTokenInfo.hashCode()) * 31) + this.totalPnL.hashCode()) * 31) + this.kolInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTStrategy(chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", walletAddress=" + this.walletAddress + ", strategyId=" + this.strategyId + ", copyTradeName=" + this.copyTradeName + ", trackedAddress=" + this.trackedAddress + ", useStatus=" + this.useStatus + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", copyBuyNum=" + this.copyBuyNum + ", sellNum=" + this.sellNum + ", boughtTokenInfo=" + this.boughtTokenInfo + ", soldTokenInfo=" + this.soldTokenInfo + ", totalPnL=" + this.totalPnL + ", kolInfo=" + this.kolInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTStrategy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTStrategy> serializer() {
            return CTStrategy$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTStrategy(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, int i4, int i5, StrategyTokenInfo strategyTokenInfo, StrategyTokenInfo strategyTokenInfo2, PnLDetail pnLDetail, KolInfo kolInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = 0;
        } else {
            this.chainId = i2;
        }
        if ((i & 2) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str;
        }
        if ((i & 4) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
        if ((i & 8) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str3;
        }
        if ((i & 16) == 0) {
            this.copyTradeName = "";
        } else {
            this.copyTradeName = str4;
        }
        if ((i & 32) == 0) {
            this.trackedAddress = "";
        } else {
            this.trackedAddress = str5;
        }
        if ((i & 64) == 0) {
            this.useStatus = 0;
        } else {
            this.useStatus = i3;
        }
        if ((i & 128) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str6;
        }
        if ((i & 256) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str7;
        }
        if ((i & 512) == 0) {
            this.copyBuyNum = 0;
        } else {
            this.copyBuyNum = i4;
        }
        if ((i & 1024) == 0) {
            this.sellNum = 0;
        } else {
            this.sellNum = i5;
        }
        this.boughtTokenInfo = (i & 2048) == 0 ? new StrategyTokenInfo((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null) : strategyTokenInfo;
        this.soldTokenInfo = (i & 4096) == 0 ? new StrategyTokenInfo((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null) : strategyTokenInfo2;
        this.totalPnL = (i & 8192) == 0 ? new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null) : pnLDetail;
        this.kolInfo = (i & 16384) == 0 ? new KolInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [114=5] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTStrategy cTStrategy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cTStrategy.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, cTStrategy.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTStrategy.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTStrategy.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) cTStrategy.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cTStrategy.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) cTStrategy.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, cTStrategy.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) cTStrategy.copyTradeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, cTStrategy.copyTradeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cTStrategy.trackedAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, cTStrategy.trackedAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cTStrategy.useStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, cTStrategy.useStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) cTStrategy.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, cTStrategy.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) cTStrategy.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, cTStrategy.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || cTStrategy.copyBuyNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, cTStrategy.copyBuyNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || cTStrategy.sellNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, cTStrategy.sellNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(cTStrategy.boughtTokenInfo, new StrategyTokenInfo((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, StrategyTokenInfo$$serializer.INSTANCE, cTStrategy.boughtTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(cTStrategy.soldTokenInfo, new StrategyTokenInfo((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, StrategyTokenInfo$$serializer.INSTANCE, cTStrategy.soldTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(cTStrategy.totalPnL, new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, PnLDetail$$serializer.INSTANCE, cTStrategy.totalPnL);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd(cTStrategy.kolInfo, new KolInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, KolInfo$$serializer.INSTANCE, cTStrategy.kolInfo);
    }

    public CTStrategy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2, @NotNull String str6, @NotNull String str7, int i3, int i4, @NotNull StrategyTokenInfo strategyTokenInfo, @NotNull StrategyTokenInfo strategyTokenInfo2, @NotNull PnLDetail pnLDetail, @NotNull KolInfo kolInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(strategyTokenInfo, "");
        Intrinsics.checkNotNullParameter(strategyTokenInfo2, "");
        Intrinsics.checkNotNullParameter(pnLDetail, "");
        Intrinsics.checkNotNullParameter(kolInfo, "");
        this.chainId = i;
        this.chainLogo = str;
        this.walletAddress = str2;
        this.strategyId = str3;
        this.copyTradeName = str4;
        this.trackedAddress = str5;
        this.useStatus = i2;
        this.createTime = str6;
        this.expireTime = str7;
        this.copyBuyNum = i3;
        this.sellNum = i4;
        this.boughtTokenInfo = strategyTokenInfo;
        this.soldTokenInfo = strategyTokenInfo2;
        this.totalPnL = pnLDetail;
        this.kolInfo = kolInfo;
    }

    public /* synthetic */ CTStrategy(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, int i3, int i4, StrategyTokenInfo strategyTokenInfo, StrategyTokenInfo strategyTokenInfo2, PnLDetail pnLDetail, KolInfo kolInfo, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        StrategyTokenInfo strategyTokenInfo3;
        PnLDetail pnLDetail2;
        int i6 = (i5 & 1) != 0 ? 0 : i;
        String str8 = (i5 & 2) != 0 ? "" : str;
        String str9 = (i5 & 4) != 0 ? "" : str2;
        String str10 = (i5 & 8) != 0 ? "" : str3;
        String str11 = (i5 & 16) != 0 ? "" : str4;
        String str12 = (i5 & 32) != 0 ? "" : str5;
        int i7 = (i5 & 64) != 0 ? 0 : i2;
        String str13 = (i5 & 128) != 0 ? "" : str6;
        String str14 = (i5 & 256) == 0 ? str7 : "";
        int i8 = (i5 & 512) != 0 ? 0 : i3;
        int i9 = (i5 & 1024) == 0 ? i4 : 0;
        StrategyTokenInfo strategyTokenInfo4 = (i5 & 2048) != 0 ? new StrategyTokenInfo((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null) : strategyTokenInfo;
        StrategyTokenInfo strategyTokenInfo5 = (i5 & 4096) != 0 ? new StrategyTokenInfo((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null) : strategyTokenInfo2;
        if ((i5 & 8192) != 0) {
            strategyTokenInfo3 = strategyTokenInfo5;
            pnLDetail2 = new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            strategyTokenInfo3 = strategyTokenInfo5;
            pnLDetail2 = pnLDetail;
        }
        this(i6, str8, str9, str10, str11, str12, i7, str13, str14, i8, i9, strategyTokenInfo4, strategyTokenInfo3, pnLDetail2, (i5 & 16384) != 0 ? new KolInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : kolInfo);
    }
}
