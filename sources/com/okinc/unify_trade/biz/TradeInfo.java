package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeInfo {
    private final String ccy;
    private String chasePriceConfirm;
    private final String confirm;
    private Integer curPosHostingShow;
    private final String depthCountConfirm;
    private boolean enableUseNewPotential;
    private final String greekUnit;
    private Integer hostingShow;
    private Integer hostingStatus;
    private final String inverseFuturesUnit;
    private final String invertTradeUnit;
    private final String kLineConfig;
    private final String kLineWithPriceConfig;
    private final String linearTradeUnit;
    private final String liqPxSwitch;
    private final String manualKLineConfig;
    private final String mktCloseConfirm;
    private String placeLayoutConfig;
    private String realizedPnlSwitch;
    private String reversePosConfirm;
    private String reversePosEnable;
    private Integer scaleOrderNum;
    private String simpleBorrowAgreementConfirm;
    private String spotAverageConfig;
    private String stableCoin;
    private List<StableCoin> supportedStableCoin;
    private List<String> tabCustomConfig;
    private String uplPriceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(StableCoin$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (List) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.invertTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.manualKLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.mktCloseConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.liqPxSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.uplPriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.reversePosEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.placeLayoutConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.reversePosConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component17() {
        return this.tabCustomConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StableCoin> component19() {
        return this.supportedStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inverseFuturesUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.hostingShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.hostingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.curPosHostingShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.spotAverageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.scaleOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.enableUseNewPotential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.chasePriceConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.simpleBorrowAgreementConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.realizedPnlSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.linearTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.confirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.depthCountConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.kLineWithPriceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.greekUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.kLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, String str14, String str15, String str16, List<String> list, String str17, List<StableCoin> list2, Integer num, Integer num2, Integer num3, String str18, Integer num4, boolean z, String str19, String str20, String str21) {
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
        return new TradeInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, list, str17, list2, num, num2, num3, str18, num4, z, str19, str20, str21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeInfo)) {
            return false;
        }
        TradeInfo tradeInfo = (TradeInfo) obj;
        return Intrinsics.EZpvd((Object) this.invertTradeUnit, (Object) tradeInfo.invertTradeUnit) && Intrinsics.EZpvd((Object) this.inverseFuturesUnit, (Object) tradeInfo.inverseFuturesUnit) && Intrinsics.EZpvd((Object) this.linearTradeUnit, (Object) tradeInfo.linearTradeUnit) && Intrinsics.EZpvd((Object) this.confirm, (Object) tradeInfo.confirm) && Intrinsics.EZpvd((Object) this.depthCountConfirm, (Object) tradeInfo.depthCountConfirm) && Intrinsics.EZpvd((Object) this.kLineWithPriceConfig, (Object) tradeInfo.kLineWithPriceConfig) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradeInfo.ccy) && Intrinsics.EZpvd((Object) this.greekUnit, (Object) tradeInfo.greekUnit) && Intrinsics.EZpvd((Object) this.kLineConfig, (Object) tradeInfo.kLineConfig) && Intrinsics.EZpvd((Object) this.manualKLineConfig, (Object) tradeInfo.manualKLineConfig) && Intrinsics.EZpvd((Object) this.mktCloseConfirm, (Object) tradeInfo.mktCloseConfirm) && Intrinsics.EZpvd((Object) this.liqPxSwitch, (Object) tradeInfo.liqPxSwitch) && Intrinsics.EZpvd((Object) this.uplPriceType, (Object) tradeInfo.uplPriceType) && Intrinsics.EZpvd((Object) this.reversePosEnable, (Object) tradeInfo.reversePosEnable) && Intrinsics.EZpvd((Object) this.placeLayoutConfig, (Object) tradeInfo.placeLayoutConfig) && Intrinsics.EZpvd((Object) this.reversePosConfirm, (Object) tradeInfo.reversePosConfirm) && Intrinsics.EZpvd(this.tabCustomConfig, tradeInfo.tabCustomConfig) && Intrinsics.EZpvd((Object) this.stableCoin, (Object) tradeInfo.stableCoin) && Intrinsics.EZpvd(this.supportedStableCoin, tradeInfo.supportedStableCoin) && Intrinsics.EZpvd(this.hostingShow, tradeInfo.hostingShow) && Intrinsics.EZpvd(this.hostingStatus, tradeInfo.hostingStatus) && Intrinsics.EZpvd(this.curPosHostingShow, tradeInfo.curPosHostingShow) && Intrinsics.EZpvd((Object) this.spotAverageConfig, (Object) tradeInfo.spotAverageConfig) && Intrinsics.EZpvd(this.scaleOrderNum, tradeInfo.scaleOrderNum) && this.enableUseNewPotential == tradeInfo.enableUseNewPotential && Intrinsics.EZpvd((Object) this.chasePriceConfirm, (Object) tradeInfo.chasePriceConfirm) && Intrinsics.EZpvd((Object) this.simpleBorrowAgreementConfirm, (Object) tradeInfo.simpleBorrowAgreementConfirm) && Intrinsics.EZpvd((Object) this.realizedPnlSwitch, (Object) tradeInfo.realizedPnlSwitch);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
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
    public final Integer getCurPosHostingShow() {
        return this.curPosHostingShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepthCountConfirm() {
        return this.depthCountConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableUseNewPotential() {
        return this.enableUseNewPotential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreekUnit() {
        return this.greekUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHostingShow() {
        return this.hostingShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHostingStatus() {
        return this.hostingStatus;
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
    public final String getKLineConfig() {
        return this.kLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKLineWithPriceConfig() {
        return this.kLineWithPriceConfig;
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
    public final String getManualKLineConfig() {
        return this.manualKLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCloseConfirm() {
        return this.mktCloseConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceLayoutConfig() {
        return this.placeLayoutConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnlSwitch() {
        return this.realizedPnlSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReversePosConfirm() {
        return this.reversePosConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReversePosEnable() {
        return this.reversePosEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getScaleOrderNum() {
        return this.scaleOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleBorrowAgreementConfirm() {
        return this.simpleBorrowAgreementConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotAverageConfig() {
        return this.spotAverageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStableCoin() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StableCoin> getSupportedStableCoin() {
        return this.supportedStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTabCustomConfig() {
        return this.tabCustomConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplPriceType() {
        return this.uplPriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.invertTradeUnit.hashCode();
        int iHashCode2 = this.inverseFuturesUnit.hashCode();
        int iHashCode3 = this.linearTradeUnit.hashCode();
        int iHashCode4 = this.confirm.hashCode();
        int iHashCode5 = this.depthCountConfirm.hashCode();
        int iHashCode6 = this.kLineWithPriceConfig.hashCode();
        int iHashCode7 = this.ccy.hashCode();
        int iHashCode8 = this.greekUnit.hashCode();
        int iHashCode9 = this.kLineConfig.hashCode();
        int iHashCode10 = this.manualKLineConfig.hashCode();
        int iHashCode11 = this.mktCloseConfirm.hashCode();
        int iHashCode12 = this.liqPxSwitch.hashCode();
        String str = this.uplPriceType;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        String str2 = this.reversePosEnable;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.placeLayoutConfig;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.reversePosConfirm;
        int iHashCode16 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.tabCustomConfig;
        int iHashCode17 = list == null ? 0 : list.hashCode();
        String str5 = this.stableCoin;
        int iHashCode18 = str5 == null ? 0 : str5.hashCode();
        List<StableCoin> list2 = this.supportedStableCoin;
        int iHashCode19 = list2 == null ? 0 : list2.hashCode();
        Integer num = this.hostingShow;
        int iHashCode20 = num == null ? 0 : num.hashCode();
        Integer num2 = this.hostingStatus;
        int iHashCode21 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.curPosHostingShow;
        int iHashCode22 = num3 == null ? 0 : num3.hashCode();
        String str6 = this.spotAverageConfig;
        int iHashCode23 = str6 == null ? 0 : str6.hashCode();
        Integer num4 = this.scaleOrderNum;
        int iHashCode24 = num4 == null ? 0 : num4.hashCode();
        int iHashCode25 = Boolean.hashCode(this.enableUseNewPotential);
        String str7 = this.chasePriceConfirm;
        int iHashCode26 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.simpleBorrowAgreementConfirm;
        int iHashCode27 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.realizedPnlSwitch;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChasePriceConfirm(String str) {
        this.chasePriceConfirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurPosHostingShow(Integer num) {
        this.curPosHostingShow = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableUseNewPotential(boolean z) {
        this.enableUseNewPotential = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHostingShow(Integer num) {
        this.hostingShow = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHostingStatus(Integer num) {
        this.hostingStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaceLayoutConfig(String str) {
        this.placeLayoutConfig = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealizedPnlSwitch(String str) {
        this.realizedPnlSwitch = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReversePosConfirm(String str) {
        this.reversePosConfirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReversePosEnable(String str) {
        this.reversePosEnable = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScaleOrderNum(Integer num) {
        this.scaleOrderNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimpleBorrowAgreementConfirm(String str) {
        this.simpleBorrowAgreementConfirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotAverageConfig(String str) {
        this.spotAverageConfig = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStableCoin(String str) {
        this.stableCoin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedStableCoin(List<StableCoin> list) {
        this.supportedStableCoin = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabCustomConfig(List<String> list) {
        this.tabCustomConfig = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUplPriceType(String str) {
        this.uplPriceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeInfo(invertTradeUnit=" + this.invertTradeUnit + ", inverseFuturesUnit=" + this.inverseFuturesUnit + ", linearTradeUnit=" + this.linearTradeUnit + ", confirm=" + this.confirm + ", depthCountConfirm=" + this.depthCountConfirm + ", kLineWithPriceConfig=" + this.kLineWithPriceConfig + ", ccy=" + this.ccy + ", greekUnit=" + this.greekUnit + ", kLineConfig=" + this.kLineConfig + ", manualKLineConfig=" + this.manualKLineConfig + ", mktCloseConfirm=" + this.mktCloseConfirm + ", liqPxSwitch=" + this.liqPxSwitch + ", uplPriceType=" + this.uplPriceType + ", reversePosEnable=" + this.reversePosEnable + ", placeLayoutConfig=" + this.placeLayoutConfig + ", reversePosConfirm=" + this.reversePosConfirm + ", tabCustomConfig=" + this.tabCustomConfig + ", stableCoin=" + this.stableCoin + ", supportedStableCoin=" + this.supportedStableCoin + ", hostingShow=" + this.hostingShow + ", hostingStatus=" + this.hostingStatus + ", curPosHostingShow=" + this.curPosHostingShow + ", spotAverageConfig=" + this.spotAverageConfig + ", scaleOrderNum=" + this.scaleOrderNum + ", enableUseNewPotential=" + this.enableUseNewPotential + ", chasePriceConfirm=" + this.chasePriceConfirm + ", simpleBorrowAgreementConfirm=" + this.simpleBorrowAgreementConfirm + ", realizedPnlSwitch=" + this.realizedPnlSwitch + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeInfo> serializer() {
            return TradeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, String str17, List list2, Integer num, Integer num2, Integer num3, String str18, Integer num4, boolean z, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.invertTradeUnit = "";
        } else {
            this.invertTradeUnit = str;
        }
        if ((i & 2) == 0) {
            this.inverseFuturesUnit = "";
        } else {
            this.inverseFuturesUnit = str2;
        }
        if ((i & 4) == 0) {
            this.linearTradeUnit = "";
        } else {
            this.linearTradeUnit = str3;
        }
        if ((i & 8) == 0) {
            this.confirm = "";
        } else {
            this.confirm = str4;
        }
        if ((i & 16) == 0) {
            this.depthCountConfirm = "";
        } else {
            this.depthCountConfirm = str5;
        }
        if ((i & 32) == 0) {
            this.kLineWithPriceConfig = "";
        } else {
            this.kLineWithPriceConfig = str6;
        }
        if ((i & 64) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str7;
        }
        if ((i & 128) == 0) {
            this.greekUnit = "";
        } else {
            this.greekUnit = str8;
        }
        if ((i & 256) == 0) {
            this.kLineConfig = "1";
        } else {
            this.kLineConfig = str9;
        }
        if ((i & 512) == 0) {
            this.manualKLineConfig = "1";
        } else {
            this.manualKLineConfig = str10;
        }
        if ((i & 1024) == 0) {
            this.mktCloseConfirm = "1";
        } else {
            this.mktCloseConfirm = str11;
        }
        if ((i & 2048) == 0) {
            this.liqPxSwitch = "1";
        } else {
            this.liqPxSwitch = str12;
        }
        if ((i & 4096) == 0) {
            this.uplPriceType = "";
        } else {
            this.uplPriceType = str13;
        }
        if ((i & 8192) == 0) {
            this.reversePosEnable = "";
        } else {
            this.reversePosEnable = str14;
        }
        if ((i & 16384) == 0) {
            this.placeLayoutConfig = "";
        } else {
            this.placeLayoutConfig = str15;
        }
        if ((32768 & i) == 0) {
            this.reversePosConfirm = "";
        } else {
            this.reversePosConfirm = str16;
        }
        if ((65536 & i) == 0) {
            this.tabCustomConfig = null;
        } else {
            this.tabCustomConfig = list;
        }
        if ((131072 & i) == 0) {
            this.stableCoin = "";
        } else {
            this.stableCoin = str17;
        }
        if ((262144 & i) == 0) {
            this.supportedStableCoin = null;
        } else {
            this.supportedStableCoin = list2;
        }
        if ((524288 & i) == 0) {
            this.hostingShow = null;
        } else {
            this.hostingShow = num;
        }
        if ((1048576 & i) == 0) {
            this.hostingStatus = null;
        } else {
            this.hostingStatus = num2;
        }
        if ((2097152 & i) == 0) {
            this.curPosHostingShow = null;
        } else {
            this.curPosHostingShow = num3;
        }
        if ((4194304 & i) == 0) {
            this.spotAverageConfig = null;
        } else {
            this.spotAverageConfig = str18;
        }
        if ((8388608 & i) == 0) {
            this.scaleOrderNum = null;
        } else {
            this.scaleOrderNum = num4;
        }
        this.enableUseNewPotential = (16777216 & i) == 0 ? false : z;
        if ((33554432 & i) == 0) {
            this.chasePriceConfirm = null;
        } else {
            this.chasePriceConfirm = str19;
        }
        if ((67108864 & i) == 0) {
            this.simpleBorrowAgreementConfirm = null;
        } else {
            this.simpleBorrowAgreementConfirm = str20;
        }
        if ((i & 134217728) == 0) {
            this.realizedPnlSwitch = null;
        } else {
            this.realizedPnlSwitch = str21;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeInfo tradeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeInfo.invertTradeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeInfo.invertTradeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeInfo.inverseFuturesUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeInfo.inverseFuturesUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeInfo.linearTradeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeInfo.linearTradeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeInfo.confirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeInfo.confirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeInfo.depthCountConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeInfo.depthCountConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeInfo.kLineWithPriceConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeInfo.kLineWithPriceConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeInfo.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeInfo.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeInfo.greekUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeInfo.greekUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeInfo.kLineConfig, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeInfo.kLineConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeInfo.manualKLineConfig, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeInfo.manualKLineConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeInfo.mktCloseConfirm, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeInfo.mktCloseConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeInfo.liqPxSwitch, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeInfo.liqPxSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeInfo.uplPriceType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tradeInfo.uplPriceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeInfo.reversePosEnable, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, tradeInfo.reversePosEnable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeInfo.placeLayoutConfig, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, tradeInfo.placeLayoutConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeInfo.reversePosConfirm, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, tradeInfo.reversePosConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || tradeInfo.tabCustomConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], tradeInfo.tabCustomConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeInfo.stableCoin, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, tradeInfo.stableCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || tradeInfo.supportedStableCoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], tradeInfo.supportedStableCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || tradeInfo.hostingShow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, tradeInfo.hostingShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || tradeInfo.hostingStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, tradeInfo.hostingStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || tradeInfo.curPosHostingShow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, tradeInfo.curPosHostingShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || tradeInfo.spotAverageConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, tradeInfo.spotAverageConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || tradeInfo.scaleOrderNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, tradeInfo.scaleOrderNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || tradeInfo.enableUseNewPotential) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, tradeInfo.enableUseNewPotential);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || tradeInfo.chasePriceConfirm != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, tradeInfo.chasePriceConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || tradeInfo.simpleBorrowAgreementConfirm != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, tradeInfo.simpleBorrowAgreementConfirm);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) && tradeInfo.realizedPnlSwitch == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, tradeInfo.realizedPnlSwitch);
    }

    public TradeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, String str14, String str15, String str16, List<String> list, String str17, List<StableCoin> list2, Integer num, Integer num2, Integer num3, String str18, Integer num4, boolean z, String str19, String str20, String str21) {
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
        this.invertTradeUnit = str;
        this.inverseFuturesUnit = str2;
        this.linearTradeUnit = str3;
        this.confirm = str4;
        this.depthCountConfirm = str5;
        this.kLineWithPriceConfig = str6;
        this.ccy = str7;
        this.greekUnit = str8;
        this.kLineConfig = str9;
        this.manualKLineConfig = str10;
        this.mktCloseConfirm = str11;
        this.liqPxSwitch = str12;
        this.uplPriceType = str13;
        this.reversePosEnable = str14;
        this.placeLayoutConfig = str15;
        this.reversePosConfirm = str16;
        this.tabCustomConfig = list;
        this.stableCoin = str17;
        this.supportedStableCoin = list2;
        this.hostingShow = num;
        this.hostingStatus = num2;
        this.curPosHostingShow = num3;
        this.spotAverageConfig = str18;
        this.scaleOrderNum = num4;
        this.enableUseNewPotential = z;
        this.chasePriceConfirm = str19;
        this.simpleBorrowAgreementConfirm = str20;
        this.realizedPnlSwitch = str21;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x014a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r59v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r59v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r59v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r59v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r59v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r59v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r59v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r59v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r59v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("1") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r59v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("1") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r59v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("1") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r59v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r42v0 java.lang.String) : ("1"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r59v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r59v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r59v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r59v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008e: ARITH (r59v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r47v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r59v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r59v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r49v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r59v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r59v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r51v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r59v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r59v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r59v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r54v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r59v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r59v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r59v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r59v0 int) & (134217728 int) A[WRAPPED]) == (0 int)) ? (r58v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StableCoin>, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:201) call: com.okinc.unify_trade.biz.TradeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, String str17, List list2, Integer num, Integer num2, Integer num3, String str18, Integer num4, boolean z, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "1" : str9, (i & 512) != 0 ? "1" : str10, (i & 1024) != 0 ? "1" : str11, (i & 2048) == 0 ? str12 : "1", (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? null : list, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? null : list2, (i & 524288) != 0 ? null : num, (i & 1048576) != 0 ? null : num2, (i & 2097152) != 0 ? null : num3, (i & 4194304) != 0 ? null : str18, (i & 8388608) != 0 ? null : num4, (i & 16777216) != 0 ? false : z, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str19, (i & 67108864) != 0 ? null : str20, (i & 134217728) == 0 ? str21 : null);
    }
}
