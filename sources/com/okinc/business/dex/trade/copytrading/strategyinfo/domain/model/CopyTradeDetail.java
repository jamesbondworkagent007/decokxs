package com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model;

import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings$$serializer;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset;
import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo;
import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo$$serializer;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings$$serializer;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CopyTradeDetail {
    private final BuySettings buySettings;
    private final String chainId;
    private final String chainLogo;
    private final String createTime;
    private final String expireTime;
    private final String expireTimeType;
    private final KolInfo kolInfo;
    private final String referralCode;
    private final String referrerAddress;
    private final SellSettings sellSettings;
    private final String strategyName;
    private final String strategyOrderId;
    private final TokenFilter tokenFilter;
    private final String trackedWalletAddress;
    private final String useStatus;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradeDetail() {
        this((BuySettings) null, (String) null, (String) null, (String) null, (String) null, (String) null, (KolInfo) null, (String) null, (String) null, (SellSettings) null, (String) null, (String) null, (TokenFilter) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySettings component1() {
        return this.buySettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellSettings component10() {
        return this.sellSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.strategyOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter component13() {
        return this.tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expireTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfo component7() {
        return this.kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradeDetail copy(@NotNull BuySettings buySettings, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull KolInfo kolInfo, @NotNull String str6, @NotNull String str7, @NotNull SellSettings sellSettings, @NotNull String str8, @NotNull String str9, @NotNull TokenFilter tokenFilter, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(buySettings, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(kolInfo, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(sellSettings, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new CopyTradeDetail(buySettings, str, str2, str3, str4, str5, kolInfo, str6, str7, sellSettings, str8, str9, tokenFilter, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradeDetail)) {
            return false;
        }
        CopyTradeDetail copyTradeDetail = (CopyTradeDetail) obj;
        return Intrinsics.EZpvd(this.buySettings, copyTradeDetail.buySettings) && Intrinsics.EZpvd((Object) this.chainId, (Object) copyTradeDetail.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) copyTradeDetail.chainLogo) && Intrinsics.EZpvd((Object) this.createTime, (Object) copyTradeDetail.createTime) && Intrinsics.EZpvd((Object) this.expireTime, (Object) copyTradeDetail.expireTime) && Intrinsics.EZpvd((Object) this.expireTimeType, (Object) copyTradeDetail.expireTimeType) && Intrinsics.EZpvd(this.kolInfo, copyTradeDetail.kolInfo) && Intrinsics.EZpvd((Object) this.referralCode, (Object) copyTradeDetail.referralCode) && Intrinsics.EZpvd((Object) this.referrerAddress, (Object) copyTradeDetail.referrerAddress) && Intrinsics.EZpvd(this.sellSettings, copyTradeDetail.sellSettings) && Intrinsics.EZpvd((Object) this.strategyName, (Object) copyTradeDetail.strategyName) && Intrinsics.EZpvd((Object) this.strategyOrderId, (Object) copyTradeDetail.strategyOrderId) && Intrinsics.EZpvd(this.tokenFilter, copyTradeDetail.tokenFilter) && Intrinsics.EZpvd((Object) this.trackedWalletAddress, (Object) copyTradeDetail.trackedWalletAddress) && Intrinsics.EZpvd((Object) this.useStatus, (Object) copyTradeDetail.useStatus) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) copyTradeDetail.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySettings getBuySettings() {
        return this.buySettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
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
    public final String getExpireTimeType() {
        return this.expireTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfo getKolInfo() {
        return this.kolInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferrerAddress() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellSettings getSellSettings() {
        return this.sellSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyName() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyOrderId() {
        return this.strategyOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter getTokenFilter() {
        return this.tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackedWalletAddress() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUseStatus() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.buySettings.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + this.expireTimeType.hashCode()) * 31) + this.kolInfo.hashCode()) * 31) + this.referralCode.hashCode()) * 31) + this.referrerAddress.hashCode()) * 31) + this.sellSettings.hashCode()) * 31) + this.strategyName.hashCode()) * 31) + this.strategyOrderId.hashCode()) * 31) + this.tokenFilter.hashCode()) * 31) + this.trackedWalletAddress.hashCode()) * 31) + this.useStatus.hashCode()) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradeDetail(buySettings=" + this.buySettings + ", chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", expireTimeType=" + this.expireTimeType + ", kolInfo=" + this.kolInfo + ", referralCode=" + this.referralCode + ", referrerAddress=" + this.referrerAddress + ", sellSettings=" + this.sellSettings + ", strategyName=" + this.strategyName + ", strategyOrderId=" + this.strategyOrderId + ", tokenFilter=" + this.tokenFilter + ", trackedWalletAddress=" + this.trackedWalletAddress + ", useStatus=" + this.useStatus + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradeDetail> serializer() {
            return CopyTradeDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradeDetail(int i, BuySettings buySettings, String str, String str2, String str3, String str4, String str5, KolInfo kolInfo, String str6, String str7, SellSettings sellSettings, String str8, String str9, TokenFilter tokenFilter, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        this.buySettings = (i & 1) == 0 ? new BuySettings(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null) : buySettings;
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str2;
        }
        if ((i & 8) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str3;
        }
        if ((i & 16) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str4;
        }
        if ((i & 32) == 0) {
            this.expireTimeType = "";
        } else {
            this.expireTimeType = str5;
        }
        this.kolInfo = (i & 64) == 0 ? new KolInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : kolInfo;
        if ((i & 128) == 0) {
            this.referralCode = "";
        } else {
            this.referralCode = str6;
        }
        if ((i & 256) == 0) {
            this.referrerAddress = "";
        } else {
            this.referrerAddress = str7;
        }
        this.sellSettings = (i & 512) == 0 ? new SellSettings(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null) : sellSettings;
        if ((i & 1024) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str8;
        }
        if ((i & 2048) == 0) {
            this.strategyOrderId = "";
        } else {
            this.strategyOrderId = str9;
        }
        this.tokenFilter = (i & 4096) == 0 ? new TokenFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null) : tokenFilter;
        if ((i & 8192) == 0) {
            this.trackedWalletAddress = "";
        } else {
            this.trackedWalletAddress = str10;
        }
        if ((i & 16384) == 0) {
            this.useStatus = "";
        } else {
            this.useStatus = str11;
        }
        if ((i & 32768) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=5] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradeDetail copyTradeDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(copyTradeDetail.buySettings, new BuySettings(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BuySettings$$serializer.INSTANCE, copyTradeDetail.buySettings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) copyTradeDetail.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, copyTradeDetail.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) copyTradeDetail.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, copyTradeDetail.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) copyTradeDetail.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, copyTradeDetail.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) copyTradeDetail.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, copyTradeDetail.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) copyTradeDetail.expireTimeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, copyTradeDetail.expireTimeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(copyTradeDetail.kolInfo, new KolInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, KolInfo$$serializer.INSTANCE, copyTradeDetail.kolInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) copyTradeDetail.referralCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, copyTradeDetail.referralCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) copyTradeDetail.referrerAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, copyTradeDetail.referrerAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(copyTradeDetail.sellSettings, new SellSettings(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, SellSettings$$serializer.INSTANCE, copyTradeDetail.sellSettings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) copyTradeDetail.strategyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, copyTradeDetail.strategyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) copyTradeDetail.strategyOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, copyTradeDetail.strategyOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, TokenFilter$$serializer.INSTANCE, copyTradeDetail.tokenFilter);
        } else {
            if (!Intrinsics.EZpvd(copyTradeDetail.tokenFilter, new TokenFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) (0 == true ? 1 : 0), (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) copyTradeDetail.trackedWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, copyTradeDetail.trackedWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) copyTradeDetail.useStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, copyTradeDetail.useStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) copyTradeDetail.userWalletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, copyTradeDetail.userWalletAddress);
    }

    public CopyTradeDetail(@NotNull BuySettings buySettings, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull KolInfo kolInfo, @NotNull String str6, @NotNull String str7, @NotNull SellSettings sellSettings, @NotNull String str8, @NotNull String str9, @NotNull TokenFilter tokenFilter, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(buySettings, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(kolInfo, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(sellSettings, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.buySettings = buySettings;
        this.chainId = str;
        this.chainLogo = str2;
        this.createTime = str3;
        this.expireTime = str4;
        this.expireTimeType = str5;
        this.kolInfo = kolInfo;
        this.referralCode = str6;
        this.referrerAddress = str7;
        this.sellSettings = sellSettings;
        this.strategyName = str8;
        this.strategyOrderId = str9;
        this.tokenFilter = tokenFilter;
        this.trackedWalletAddress = str10;
        this.useStatus = str11;
        this.userWalletAddress = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0112: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR 
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset:?: CAST (com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset) (null com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset))
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo:?: TERNARY null = ((wrap:int:0x0043: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r40v0 com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings:?: TERNARY null = ((wrap:int:0x0070: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: CONSTRUCTOR 
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset:?: CAST (com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset) (null com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(boolean, java.lang.String, java.util.List, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:22) call: com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings.<init>(boolean, java.lang.String, java.util.List, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r43v0 com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00cb: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (32767 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:25) call: com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r46v0 com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
 A[MD:(com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail.<init>(com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings, java.lang.String, java.lang.String, com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CopyTradeDetail(BuySettings buySettings, String str, String str2, String str3, String str4, String str5, KolInfo kolInfo, String str6, String str7, SellSettings sellSettings, String str8, String str9, TokenFilter tokenFilter, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BuySettings(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null) : buySettings, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? new KolInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : kolInfo, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? new SellSettings(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null) : sellSettings, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? new TokenFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null) : tokenFilter, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12);
    }
}
