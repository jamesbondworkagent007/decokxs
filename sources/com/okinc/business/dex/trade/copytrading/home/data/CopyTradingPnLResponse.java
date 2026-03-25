package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo;
import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CopyTradingPnLResponse {
    private final int buyCount;
    private final String buyUsdValue;
    private final String chainIcon;
    private final String chainId;
    private final String chainName;
    private final List<CopyTradeStatGraphItem> copyTradeStatGraphList;
    private final String createTime;
    private final String expireTime;
    private final KolInfo kolInfo;
    private final String name;
    private final PnLInfo pnlInfo;
    private final int sellCount;
    private final String sellUsdValue;
    private final int status;
    private final String stoppedTime;
    private final String trackedWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CopyTradeStatGraphItem$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingPnLResponse() {
        this((PnLInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, (String) null, (List) null, (String) null, (String) null, (String) null, (KolInfo) null, 65535, (DefaultConstructorMarker) null);
    }

    @SerialName("buyCount")
    public static /* synthetic */ void getBuyCount$annotations() {
    }

    @SerialName("buyUsdValue")
    public static /* synthetic */ void getBuyUsdValue$annotations() {
    }

    @SerialName("chainIcon")
    public static /* synthetic */ void getChainIcon$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("chainName")
    public static /* synthetic */ void getChainName$annotations() {
    }

    @SerialName("copyTradeStatGraphList")
    public static /* synthetic */ void getCopyTradeStatGraphList$annotations() {
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

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("pnlInfo")
    public static /* synthetic */ void getPnlInfo$annotations() {
    }

    @SerialName("sellCount")
    public static /* synthetic */ void getSellCount$annotations() {
    }

    @SerialName("sellUsdValue")
    public static /* synthetic */ void getSellUsdValue$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("stoppedTime")
    public static /* synthetic */ void getStoppedTime$annotations() {
    }

    @SerialName("trackedWalletAddress")
    public static /* synthetic */ void getTrackedWalletAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLInfo component1() {
        return this.pnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sellUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CopyTradeStatGraphItem> component12() {
        return this.copyTradeStatGraphList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfo component16() {
        return this.kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stoppedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.buyUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPnLResponse copy(@NotNull PnLInfo pnLInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, int i2, @NotNull String str6, int i3, @NotNull String str7, @NotNull List<CopyTradeStatGraphItem> list, @NotNull String str8, @NotNull String str9, @NotNull String str10, KolInfo kolInfo) {
        Intrinsics.checkNotNullParameter(pnLInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new CopyTradingPnLResponse(pnLInfo, str, str2, str3, str4, str5, i, i2, str6, i3, str7, list, str8, str9, str10, kolInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradingPnLResponse)) {
            return false;
        }
        CopyTradingPnLResponse copyTradingPnLResponse = (CopyTradingPnLResponse) obj;
        return Intrinsics.EZpvd(this.pnlInfo, copyTradingPnLResponse.pnlInfo) && Intrinsics.EZpvd((Object) this.name, (Object) copyTradingPnLResponse.name) && Intrinsics.EZpvd((Object) this.createTime, (Object) copyTradingPnLResponse.createTime) && Intrinsics.EZpvd((Object) this.expireTime, (Object) copyTradingPnLResponse.expireTime) && Intrinsics.EZpvd((Object) this.stoppedTime, (Object) copyTradingPnLResponse.stoppedTime) && Intrinsics.EZpvd((Object) this.trackedWalletAddress, (Object) copyTradingPnLResponse.trackedWalletAddress) && this.status == copyTradingPnLResponse.status && this.buyCount == copyTradingPnLResponse.buyCount && Intrinsics.EZpvd((Object) this.buyUsdValue, (Object) copyTradingPnLResponse.buyUsdValue) && this.sellCount == copyTradingPnLResponse.sellCount && Intrinsics.EZpvd((Object) this.sellUsdValue, (Object) copyTradingPnLResponse.sellUsdValue) && Intrinsics.EZpvd(this.copyTradeStatGraphList, copyTradingPnLResponse.copyTradeStatGraphList) && Intrinsics.EZpvd((Object) this.chainName, (Object) copyTradingPnLResponse.chainName) && Intrinsics.EZpvd((Object) this.chainIcon, (Object) copyTradingPnLResponse.chainIcon) && Intrinsics.EZpvd((Object) this.chainId, (Object) copyTradingPnLResponse.chainId) && Intrinsics.EZpvd(this.kolInfo, copyTradingPnLResponse.kolInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBuyCount() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyUsdValue() {
        return this.buyUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CopyTradeStatGraphItem> getCopyTradeStatGraphList() {
        return this.copyTradeStatGraphList;
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
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLInfo getPnlInfo() {
        return this.pnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSellCount() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellUsdValue() {
        return this.sellUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStoppedTime() {
        return this.stoppedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackedWalletAddress() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pnlInfo.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.createTime.hashCode();
        int iHashCode4 = this.expireTime.hashCode();
        int iHashCode5 = this.stoppedTime.hashCode();
        int iHashCode6 = this.trackedWalletAddress.hashCode();
        int iHashCode7 = Integer.hashCode(this.status);
        int iHashCode8 = Integer.hashCode(this.buyCount);
        int iHashCode9 = this.buyUsdValue.hashCode();
        int iHashCode10 = Integer.hashCode(this.sellCount);
        int iHashCode11 = this.sellUsdValue.hashCode();
        int iHashCode12 = this.copyTradeStatGraphList.hashCode();
        int iHashCode13 = this.chainName.hashCode();
        int iHashCode14 = this.chainIcon.hashCode();
        int iHashCode15 = this.chainId.hashCode();
        KolInfo kolInfo = this.kolInfo;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (kolInfo == null ? 0 : kolInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradingPnLResponse(pnlInfo=" + this.pnlInfo + ", name=" + this.name + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", stoppedTime=" + this.stoppedTime + ", trackedWalletAddress=" + this.trackedWalletAddress + ", status=" + this.status + ", buyCount=" + this.buyCount + ", buyUsdValue=" + this.buyUsdValue + ", sellCount=" + this.sellCount + ", sellUsdValue=" + this.sellUsdValue + ", copyTradeStatGraphList=" + this.copyTradeStatGraphList + ", chainName=" + this.chainName + ", chainIcon=" + this.chainIcon + ", chainId=" + this.chainId + ", kolInfo=" + this.kolInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradingPnLResponse> serializer() {
            return CopyTradingPnLResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradingPnLResponse(int i, PnLInfo pnLInfo, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, int i4, String str7, List list, String str8, String str9, String str10, KolInfo kolInfo, SerializationConstructorMarker serializationConstructorMarker) {
        this.pnlInfo = (i & 1) == 0 ? new PnLInfo((PnLDetail) null, (PnLDetail) null, (PnLDetail) null, 7, (DefaultConstructorMarker) null) : pnLInfo;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str2;
        }
        if ((i & 8) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str3;
        }
        if ((i & 16) == 0) {
            this.stoppedTime = "";
        } else {
            this.stoppedTime = str4;
        }
        if ((i & 32) == 0) {
            this.trackedWalletAddress = "";
        } else {
            this.trackedWalletAddress = str5;
        }
        this.status = (i & 64) == 0 ? StrategyStatus.Pause.getStatus() : i2;
        if ((i & 128) == 0) {
            this.buyCount = 0;
        } else {
            this.buyCount = i3;
        }
        if ((i & 256) == 0) {
            this.buyUsdValue = "";
        } else {
            this.buyUsdValue = str6;
        }
        if ((i & 512) == 0) {
            this.sellCount = 0;
        } else {
            this.sellCount = i4;
        }
        if ((i & 1024) == 0) {
            this.sellUsdValue = "";
        } else {
            this.sellUsdValue = str7;
        }
        this.copyTradeStatGraphList = (i & 2048) == 0 ? yDY.AhwBna() : list;
        if ((i & 4096) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str8;
        }
        if ((i & 8192) == 0) {
            this.chainIcon = "";
        } else {
            this.chainIcon = str9;
        }
        if ((i & 16384) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str10;
        }
        this.kolInfo = (i & 32768) == 0 ? null : kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [22=4] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradingPnLResponse copyTradingPnLResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(copyTradingPnLResponse.pnlInfo, new PnLInfo((PnLDetail) null, (PnLDetail) null, (PnLDetail) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PnLInfo$$serializer.INSTANCE, copyTradingPnLResponse.pnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, copyTradingPnLResponse.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, copyTradingPnLResponse.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, copyTradingPnLResponse.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.stoppedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, copyTradingPnLResponse.stoppedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.trackedWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, copyTradingPnLResponse.trackedWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || copyTradingPnLResponse.status != StrategyStatus.Pause.getStatus()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, copyTradingPnLResponse.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || copyTradingPnLResponse.buyCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, copyTradingPnLResponse.buyCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.buyUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, copyTradingPnLResponse.buyUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || copyTradingPnLResponse.sellCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, copyTradingPnLResponse.sellCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.sellUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, copyTradingPnLResponse.sellUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(copyTradingPnLResponse.copyTradeStatGraphList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], copyTradingPnLResponse.copyTradeStatGraphList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, copyTradingPnLResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.chainIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, copyTradingPnLResponse.chainIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) copyTradingPnLResponse.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, copyTradingPnLResponse.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && copyTradingPnLResponse.kolInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, KolInfo$$serializer.INSTANCE, copyTradingPnLResponse.kolInfo);
    }

    public CopyTradingPnLResponse(@NotNull PnLInfo pnLInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, int i2, @NotNull String str6, int i3, @NotNull String str7, @NotNull List<CopyTradeStatGraphItem> list, @NotNull String str8, @NotNull String str9, @NotNull String str10, KolInfo kolInfo) {
        Intrinsics.checkNotNullParameter(pnLInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.pnlInfo = pnLInfo;
        this.name = str;
        this.createTime = str2;
        this.expireTime = str3;
        this.stoppedTime = str4;
        this.trackedWalletAddress = str5;
        this.status = i;
        this.buyCount = i2;
        this.buyUsdValue = str6;
        this.sellCount = i3;
        this.sellUsdValue = str7;
        this.copyTradeStatGraphList = list;
        this.chainName = str8;
        this.chainIcon = str9;
        this.chainId = str10;
        this.kolInfo = kolInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00be: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLInfo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: CAST (com.okinc.business.dex.trade.copytrading.home.data.PnLDetail) (null com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: CAST (com.okinc.business.dex.trade.copytrading.home.data.PnLDetail) (null com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: CAST (com.okinc.business.dex.trade.copytrading.home.data.PnLDetail) (null com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:26) call: com.okinc.business.dex.trade.copytrading.home.data.PnLInfo.<init>(com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.business.dex.trade.copytrading.home.data.PnLInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE 
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus:0x0042: SGET  A[WRAPPED] (LINE:38) com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus.Pause com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus)
 VIRTUAL call: com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus.getStatus():int A[MD:():int (m), WRAPPED] (LINE:38)) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r27v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006b: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo:?: TERNARY null = ((wrap:int:0x0094: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo) : (r33v0 com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo))
 A[MD:(com.okinc.business.dex.trade.copytrading.home.data.PnLInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, java.lang.String, java.util.List<com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatGraphItem>, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo):void (m)] (LINE:24) call: com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse.<init>(com.okinc.business.dex.trade.copytrading.home.data.PnLInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo):void type: THIS */
    public /* synthetic */ CopyTradingPnLResponse(PnLInfo pnLInfo, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, int i3, String str7, List list, String str8, String str9, String str10, KolInfo kolInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new PnLInfo((PnLDetail) null, (PnLDetail) null, (PnLDetail) null, 7, (DefaultConstructorMarker) null) : pnLInfo, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? StrategyStatus.Pause.getStatus() : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? "" : str6, (i4 & 512) == 0 ? i3 : 0, (i4 & 1024) != 0 ? "" : str7, (i4 & 2048) != 0 ? yDY.AhwBna() : list, (i4 & 4096) != 0 ? "" : str8, (i4 & 8192) != 0 ? "" : str9, (i4 & 16384) != 0 ? "" : str10, (i4 & 32768) != 0 ? null : kolInfo);
    }

    public final StrategyStatus getStrategyStatus() {
        return StrategyStatus.Companion.KWHzl(this.status);
    }
}
