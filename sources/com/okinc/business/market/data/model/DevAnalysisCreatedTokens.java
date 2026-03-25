package com.okinc.business.market.data.model;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DevAnalysisCreatedTokens {
    public final String abnormalHoldingRatio;
    public final String chainId;
    public final String chainLogo;
    public final String devHoldingRatio;
    public final String marketCap;
    public final String memeLogoUrl;
    public final String migratedProgress;
    public final String migratedStatus;
    public final String rugDuration;
    public final String rugTime;
    public final String rugType;
    public final boolean rugged;
    public final String suspectedInsiderTradingRatio;
    public final String suspiciousHoldingRatio;
    public final List<CompactTagData> tags;
    public final String tokenContractAddress;
    public final String tokenCreateTime;
    public final String tokenLogoUrl;
    public final String tokenSymbol;
    public final HashMap<String, TokenTag> tokenTagVO;
    public final String volume24H;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, new HashMapSerializer(StringSerializer.INSTANCE, TokenTag$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.suspiciousHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.migratedProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.tokenCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevAnalysisCreatedTokens copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, @NotNull String str12, @NotNull List<CompactTagData> list, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull HashMap<String, TokenTag> map, @NotNull String str17, @NotNull String str18) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        return new DevAnalysisCreatedTokens(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11, str12, list, str13, str14, str15, str16, map, str17, str18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.rugged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevAnalysisCreatedTokens)) {
            return false;
        }
        DevAnalysisCreatedTokens devAnalysisCreatedTokens = (DevAnalysisCreatedTokens) obj;
        return Intrinsics.EZpvd((Object) this.abnormalHoldingRatio, (Object) devAnalysisCreatedTokens.abnormalHoldingRatio) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) devAnalysisCreatedTokens.chainLogo) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) devAnalysisCreatedTokens.devHoldingRatio) && Intrinsics.EZpvd((Object) this.marketCap, (Object) devAnalysisCreatedTokens.marketCap) && Intrinsics.EZpvd((Object) this.memeLogoUrl, (Object) devAnalysisCreatedTokens.memeLogoUrl) && Intrinsics.EZpvd((Object) this.migratedProgress, (Object) devAnalysisCreatedTokens.migratedProgress) && Intrinsics.EZpvd((Object) this.migratedStatus, (Object) devAnalysisCreatedTokens.migratedStatus) && Intrinsics.EZpvd((Object) this.rugDuration, (Object) devAnalysisCreatedTokens.rugDuration) && Intrinsics.EZpvd((Object) this.rugTime, (Object) devAnalysisCreatedTokens.rugTime) && Intrinsics.EZpvd((Object) this.rugType, (Object) devAnalysisCreatedTokens.rugType) && this.rugged == devAnalysisCreatedTokens.rugged && Intrinsics.EZpvd((Object) this.suspectedInsiderTradingRatio, (Object) devAnalysisCreatedTokens.suspectedInsiderTradingRatio) && Intrinsics.EZpvd((Object) this.suspiciousHoldingRatio, (Object) devAnalysisCreatedTokens.suspiciousHoldingRatio) && Intrinsics.EZpvd(this.tags, devAnalysisCreatedTokens.tags) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) devAnalysisCreatedTokens.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenCreateTime, (Object) devAnalysisCreatedTokens.tokenCreateTime) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) devAnalysisCreatedTokens.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) devAnalysisCreatedTokens.tokenSymbol) && Intrinsics.EZpvd(this.tokenTagVO, devAnalysisCreatedTokens.tokenTagVO) && Intrinsics.EZpvd((Object) this.volume24H, (Object) devAnalysisCreatedTokens.volume24H) && Intrinsics.EZpvd((Object) this.chainId, (Object) devAnalysisCreatedTokens.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.volume24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.rugType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.abnormalHoldingRatio.hashCode() * 31) + this.chainLogo.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.memeLogoUrl.hashCode()) * 31) + this.migratedProgress.hashCode()) * 31) + this.migratedStatus.hashCode()) * 31) + this.rugDuration.hashCode()) * 31) + this.rugTime.hashCode()) * 31) + this.rugType.hashCode()) * 31) + Boolean.hashCode(this.rugged)) * 31) + this.suspectedInsiderTradingRatio.hashCode()) * 31) + this.suspiciousHoldingRatio.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenCreateTime.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenTagVO.hashCode()) * 31) + this.volume24H.hashCode()) * 31) + this.chainId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> isConnected() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DevAnalysisCreatedTokens(abnormalHoldingRatio=" + this.abnormalHoldingRatio + ", chainLogo=" + this.chainLogo + ", devHoldingRatio=" + this.devHoldingRatio + ", marketCap=" + this.marketCap + ", memeLogoUrl=" + this.memeLogoUrl + ", migratedProgress=" + this.migratedProgress + ", migratedStatus=" + this.migratedStatus + ", rugDuration=" + this.rugDuration + ", rugTime=" + this.rugTime + ", rugType=" + this.rugType + ", rugged=" + this.rugged + ", suspectedInsiderTradingRatio=" + this.suspectedInsiderTradingRatio + ", suspiciousHoldingRatio=" + this.suspiciousHoldingRatio + ", tags=" + this.tags + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", tokenTagVO=" + this.tokenTagVO + ", volume24H=" + this.volume24H + ", chainId=" + this.chainId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.migratedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.tokenLogoUrl;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.DevAnalysisCreatedTokens.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DevAnalysisCreatedTokens> serializer() {
            return DevAnalysisCreatedTokens$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DevAnalysisCreatedTokens(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, List list, String str13, String str14, String str15, String str16, HashMap map, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if (8192 != (i & 8192)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8192, DevAnalysisCreatedTokens$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.abnormalHoldingRatio = "";
        } else {
            this.abnormalHoldingRatio = str;
        }
        if ((i & 2) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str2;
        }
        if ((i & 4) == 0) {
            this.devHoldingRatio = "";
        } else {
            this.devHoldingRatio = str3;
        }
        if ((i & 8) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str4;
        }
        if ((i & 16) == 0) {
            this.memeLogoUrl = "";
        } else {
            this.memeLogoUrl = str5;
        }
        if ((i & 32) == 0) {
            this.migratedProgress = "";
        } else {
            this.migratedProgress = str6;
        }
        if ((i & 64) == 0) {
            this.migratedStatus = "";
        } else {
            this.migratedStatus = str7;
        }
        if ((i & 128) == 0) {
            this.rugDuration = "";
        } else {
            this.rugDuration = str8;
        }
        if ((i & 256) == 0) {
            this.rugTime = "";
        } else {
            this.rugTime = str9;
        }
        if ((i & 512) == 0) {
            this.rugType = "";
        } else {
            this.rugType = str10;
        }
        this.rugged = (i & 1024) == 0 ? false : z;
        if ((i & 2048) == 0) {
            this.suspectedInsiderTradingRatio = "";
        } else {
            this.suspectedInsiderTradingRatio = str11;
        }
        if ((i & 4096) == 0) {
            this.suspiciousHoldingRatio = "";
        } else {
            this.suspiciousHoldingRatio = str12;
        }
        this.tags = list;
        if ((i & 16384) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str13;
        }
        if ((32768 & i) == 0) {
            this.tokenCreateTime = "";
        } else {
            this.tokenCreateTime = str14;
        }
        if ((65536 & i) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str15;
        }
        if ((131072 & i) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str16;
        }
        this.tokenTagVO = (262144 & i) == 0 ? new HashMap() : map;
        if ((524288 & i) == 0) {
            this.volume24H = "";
        } else {
            this.volume24H = str17;
        }
        if ((i & 1048576) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str18;
        }
    }

    public static final /* synthetic */ void OLrzqt(DevAnalysisCreatedTokens devAnalysisCreatedTokens, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.abnormalHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, devAnalysisCreatedTokens.abnormalHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, devAnalysisCreatedTokens.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.devHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, devAnalysisCreatedTokens.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, devAnalysisCreatedTokens.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.memeLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, devAnalysisCreatedTokens.memeLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.migratedProgress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, devAnalysisCreatedTokens.migratedProgress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.migratedStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, devAnalysisCreatedTokens.migratedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.rugDuration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, devAnalysisCreatedTokens.rugDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.rugTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, devAnalysisCreatedTokens.rugTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.rugType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, devAnalysisCreatedTokens.rugType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || devAnalysisCreatedTokens.rugged) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, devAnalysisCreatedTokens.rugged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.suspectedInsiderTradingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, devAnalysisCreatedTokens.suspectedInsiderTradingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.suspiciousHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, devAnalysisCreatedTokens.suspiciousHoldingRatio);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], devAnalysisCreatedTokens.tags);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, devAnalysisCreatedTokens.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.tokenCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, devAnalysisCreatedTokens.tokenCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, devAnalysisCreatedTokens.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, devAnalysisCreatedTokens.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(devAnalysisCreatedTokens.tokenTagVO, new HashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], devAnalysisCreatedTokens.tokenTagVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.volume24H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, devAnalysisCreatedTokens.volume24H);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) devAnalysisCreatedTokens.chainId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, devAnalysisCreatedTokens.chainId);
    }

    public DevAnalysisCreatedTokens(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, @NotNull String str12, @NotNull List<CompactTagData> list, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull HashMap<String, TokenTag> map, @NotNull String str17, @NotNull String str18) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.abnormalHoldingRatio = str;
        this.chainLogo = str2;
        this.devHoldingRatio = str3;
        this.marketCap = str4;
        this.memeLogoUrl = str5;
        this.migratedProgress = str6;
        this.migratedStatus = str7;
        this.rugDuration = str8;
        this.rugTime = str9;
        this.rugType = str10;
        this.rugged = z;
        this.suspectedInsiderTradingRatio = str11;
        this.suspiciousHoldingRatio = str12;
        this.tags = list;
        this.tokenContractAddress = str13;
        this.tokenCreateTime = str14;
        this.tokenLogoUrl = str15;
        this.tokenSymbol = str16;
        this.tokenTagVO = map;
        this.volume24H = str17;
        this.chainId = str18;
    }
}
