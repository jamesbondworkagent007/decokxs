package com.okinc.business.dex.trade.copytrading.edit.data.model;

import com.okinc.business.dex.tee.domain.model.VerifySignInfo;
import com.okinc.business.dex.tee.domain.model.VerifySignInfo$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CopyTradingStrategy {
    private final BuySettings buySettings;
    private final String chainId;
    private final String expireTime;
    private final String expireTimeType;
    private final String referralCode;
    private final String referrerAddress;
    private final String reqStartTime;
    private final SellSettings sellSettings;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String sourceType;
    private final String strategyId;
    private final String strategyName;
    private final boolean teeSilentSignEnabled;
    private final TokenFilter tokenFilter;
    private final String trackedWalletAddress;
    private final String userWalletAddress;
    private final VerifySignInfo verifySignInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingStrategy() {
        this((String) null, (String) null, (VerifySignInfo) null, (String) null, (String) null, (String) null, (String) null, (BuySettings) null, (SellSettings) null, (TokenFilter) null, (ServiceFeeInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter component10() {
        return this.tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component11() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.expireTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifySignInfo component3() {
        return this.verifySignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.reqStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.trackedWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySettings component8() {
        return this.buySettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellSettings component9() {
        return this.sellSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingStrategy copy(@NotNull String str, @NotNull String str2, @NotNull VerifySignInfo verifySignInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull BuySettings buySettings, @NotNull SellSettings sellSettings, @NotNull TokenFilter tokenFilter, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(verifySignInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(buySettings, "");
        Intrinsics.checkNotNullParameter(sellSettings, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new CopyTradingStrategy(str, str2, verifySignInfo, str3, str4, str5, str6, buySettings, sellSettings, tokenFilter, serviceFeeInfo, str7, str8, str9, str10, str11, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradingStrategy)) {
            return false;
        }
        CopyTradingStrategy copyTradingStrategy = (CopyTradingStrategy) obj;
        return Intrinsics.EZpvd((Object) this.sourceType, (Object) copyTradingStrategy.sourceType) && Intrinsics.EZpvd((Object) this.chainId, (Object) copyTradingStrategy.chainId) && Intrinsics.EZpvd(this.verifySignInfo, copyTradingStrategy.verifySignInfo) && Intrinsics.EZpvd((Object) this.reqStartTime, (Object) copyTradingStrategy.reqStartTime) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) copyTradingStrategy.userWalletAddress) && Intrinsics.EZpvd((Object) this.trackedWalletAddress, (Object) copyTradingStrategy.trackedWalletAddress) && Intrinsics.EZpvd((Object) this.strategyName, (Object) copyTradingStrategy.strategyName) && Intrinsics.EZpvd(this.buySettings, copyTradingStrategy.buySettings) && Intrinsics.EZpvd(this.sellSettings, copyTradingStrategy.sellSettings) && Intrinsics.EZpvd(this.tokenFilter, copyTradingStrategy.tokenFilter) && Intrinsics.EZpvd(this.serviceFeeInfo, copyTradingStrategy.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.referralCode, (Object) copyTradingStrategy.referralCode) && Intrinsics.EZpvd((Object) this.referrerAddress, (Object) copyTradingStrategy.referrerAddress) && Intrinsics.EZpvd((Object) this.expireTime, (Object) copyTradingStrategy.expireTime) && Intrinsics.EZpvd((Object) this.expireTimeType, (Object) copyTradingStrategy.expireTimeType) && Intrinsics.EZpvd((Object) this.strategyId, (Object) copyTradingStrategy.strategyId) && this.teeSilentSignEnabled == copyTradingStrategy.teeSilentSignEnabled;
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
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTimeType() {
        return this.expireTimeType;
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
    public final String getReqStartTime() {
        return this.reqStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellSettings getSellSettings() {
        return this.sellSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyName() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTeeSilentSignEnabled() {
        return this.teeSilentSignEnabled;
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
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifySignInfo getVerifySignInfo() {
        return this.verifySignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.sourceType.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.verifySignInfo.hashCode()) * 31) + this.reqStartTime.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + this.trackedWalletAddress.hashCode()) * 31) + this.strategyName.hashCode()) * 31) + this.buySettings.hashCode()) * 31) + this.sellSettings.hashCode()) * 31) + this.tokenFilter.hashCode()) * 31) + this.serviceFeeInfo.hashCode()) * 31) + this.referralCode.hashCode()) * 31) + this.referrerAddress.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + this.expireTimeType.hashCode()) * 31) + this.strategyId.hashCode()) * 31) + Boolean.hashCode(this.teeSilentSignEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradingStrategy(sourceType=" + this.sourceType + ", chainId=" + this.chainId + ", verifySignInfo=" + this.verifySignInfo + ", reqStartTime=" + this.reqStartTime + ", userWalletAddress=" + this.userWalletAddress + ", trackedWalletAddress=" + this.trackedWalletAddress + ", strategyName=" + this.strategyName + ", buySettings=" + this.buySettings + ", sellSettings=" + this.sellSettings + ", tokenFilter=" + this.tokenFilter + ", serviceFeeInfo=" + this.serviceFeeInfo + ", referralCode=" + this.referralCode + ", referrerAddress=" + this.referrerAddress + ", expireTime=" + this.expireTime + ", expireTimeType=" + this.expireTimeType + ", strategyId=" + this.strategyId + ", teeSilentSignEnabled=" + this.teeSilentSignEnabled + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradingStrategy> serializer() {
            return CopyTradingStrategy$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradingStrategy(int i, String str, String str2, VerifySignInfo verifySignInfo, String str3, String str4, String str5, String str6, BuySettings buySettings, SellSettings sellSettings, TokenFilter tokenFilter, ServiceFeeInfo serviceFeeInfo, String str7, String str8, String str9, String str10, String str11, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sourceType = "";
        } else {
            this.sourceType = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        this.verifySignInfo = (i & 4) == 0 ? new VerifySignInfo((String) null, (String) null, C33129mqd.valueOf(this.chainId), (String) null, (String) null, (String) null, 59, (DefaultConstructorMarker) null) : verifySignInfo;
        if ((i & 8) == 0) {
            this.reqStartTime = "";
        } else {
            this.reqStartTime = str3;
        }
        if ((i & 16) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
        if ((i & 32) == 0) {
            this.trackedWalletAddress = "";
        } else {
            this.trackedWalletAddress = str5;
        }
        if ((i & 64) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str6;
        }
        this.buySettings = (i & 128) == 0 ? new BuySettings(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null) : buySettings;
        this.sellSettings = (i & 256) == 0 ? new SellSettings(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null) : sellSettings;
        this.tokenFilter = (i & 512) == 0 ? new TokenFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null) : tokenFilter;
        this.serviceFeeInfo = (i & 1024) == 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo;
        if ((i & 2048) == 0) {
            this.referralCode = "";
        } else {
            this.referralCode = str7;
        }
        if ((i & 4096) == 0) {
            this.referrerAddress = "";
        } else {
            this.referrerAddress = str8;
        }
        if ((i & 8192) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str9;
        }
        if ((i & 16384) == 0) {
            this.expireTimeType = "";
        } else {
            this.expireTimeType = str10;
        }
        if ((32768 & i) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str11;
        }
        this.teeSilentSignEnabled = (i & 65536) == 0 ? false : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [20=6] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradingStrategy copyTradingStrategy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) copyTradingStrategy.sourceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, copyTradingStrategy.sourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) copyTradingStrategy.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, copyTradingStrategy.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(copyTradingStrategy.verifySignInfo, new VerifySignInfo((String) null, (String) null, C33129mqd.valueOf(copyTradingStrategy.chainId), (String) null, (String) null, (String) null, 59, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, VerifySignInfo$$serializer.INSTANCE, copyTradingStrategy.verifySignInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) copyTradingStrategy.reqStartTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, copyTradingStrategy.reqStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) copyTradingStrategy.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, copyTradingStrategy.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) copyTradingStrategy.trackedWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, copyTradingStrategy.trackedWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) copyTradingStrategy.strategyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, copyTradingStrategy.strategyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(copyTradingStrategy.buySettings, new BuySettings(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, BuySettings$$serializer.INSTANCE, copyTradingStrategy.buySettings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(copyTradingStrategy.sellSettings, new SellSettings(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, SellSettings$$serializer.INSTANCE, copyTradingStrategy.sellSettings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, TokenFilter$$serializer.INSTANCE, copyTradingStrategy.tokenFilter);
        } else {
            if (!Intrinsics.EZpvd(copyTradingStrategy.tokenFilter, new TokenFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) (0 == true ? 1 : 0), (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(copyTradingStrategy.serviceFeeInfo, new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, ServiceFeeInfo$$serializer.INSTANCE, copyTradingStrategy.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) copyTradingStrategy.referralCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, copyTradingStrategy.referralCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) copyTradingStrategy.referrerAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, copyTradingStrategy.referrerAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) copyTradingStrategy.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, copyTradingStrategy.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) copyTradingStrategy.expireTimeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, copyTradingStrategy.expireTimeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) copyTradingStrategy.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, copyTradingStrategy.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || copyTradingStrategy.teeSilentSignEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, copyTradingStrategy.teeSilentSignEnabled);
        }
    }

    public CopyTradingStrategy(@NotNull String str, @NotNull String str2, @NotNull VerifySignInfo verifySignInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull BuySettings buySettings, @NotNull SellSettings sellSettings, @NotNull TokenFilter tokenFilter, @NotNull ServiceFeeInfo serviceFeeInfo, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(verifySignInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(buySettings, "");
        Intrinsics.checkNotNullParameter(sellSettings, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.sourceType = str;
        this.chainId = str2;
        this.verifySignInfo = verifySignInfo;
        this.reqStartTime = str3;
        this.userWalletAddress = str4;
        this.trackedWalletAddress = str5;
        this.strategyName = str6;
        this.buySettings = buySettings;
        this.sellSettings = sellSettings;
        this.tokenFilter = tokenFilter;
        this.serviceFeeInfo = serviceFeeInfo;
        this.referralCode = str7;
        this.referrerAddress = str8;
        this.expireTime = str9;
        this.expireTimeType = str10;
        this.strategyId = str11;
        this.teeSilentSignEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CopyTradingStrategy(String str, String str2, VerifySignInfo verifySignInfo, String str3, String str4, String str5, String str6, BuySettings buySettings, SellSettings sellSettings, TokenFilter tokenFilter, ServiceFeeInfo serviceFeeInfo, String str7, String str8, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str12 = (i & 1) != 0 ? "" : str;
        String str13 = (i & 2) != 0 ? "" : str2;
        this(str12, str13, (i & 4) != 0 ? new VerifySignInfo((String) null, (String) null, C33129mqd.valueOf(str13), (String) null, (String) null, (String) null, 59, (DefaultConstructorMarker) null) : verifySignInfo, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? new BuySettings(0, (String) null, (String) null, (String) null, (String) null, false, (CopyTradingPreset) null, 127, (DefaultConstructorMarker) null) : buySettings, (i & 256) != 0 ? new SellSettings(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null) : sellSettings, (i & 512) != 0 ? new TokenFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null) : tokenFilter, (i & 1024) != 0 ? new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : serviceFeeInfo, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? "" : str9, (i & 16384) != 0 ? "" : str10, (i & 32768) != 0 ? "" : str11, (i & 65536) != 0 ? false : z);
    }
}
