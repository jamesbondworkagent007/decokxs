package com.okinc.business.market.data.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AdvancedFilterData {
    public static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int categoryType;
    public final String chainId;
    public final String changeMax;
    public final String changeMin;
    public final TimeIntervalType changePeriod;
    public final boolean desc;
    public final String holdersMax;
    public final String holdersMin;
    public final String liquidityMax;
    public final String liquidityMin;
    public final String marketCapMax;
    public final String marketCapMin;
    public final TimeIntervalType mentionedPeriod;
    public final boolean openSource;
    public final int page;
    public final int pageSize;
    public final TimeIntervalType periodType;
    public final String projectIds;
    public final RankingType rankBy;
    public final boolean riskFilter;
    public final boolean stableTokenFilter;
    public final String tokenAgeMax;
    public final String tokenAgeMin;
    public final TokenAgeType tokenAgeType;
    public final int totalPage;
    public final String tradeNumMax;
    public final String tradeNumMin;
    public final TimeIntervalType tradeNumPeriod;
    public final String txsMax;
    public final String txsMin;
    public final TimeIntervalType txsPeriod;
    public final String uniqueTraderMax;
    public final String uniqueTraderMin;
    public final TimeIntervalType uniqueTraderPeriod;
    public final String volumeMax;
    public final String volumeMin;
    public final TimeIntervalType volumePeriod;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedFilterData() {
        this((String) null, (TimeIntervalType) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, false, (TimeIntervalType) null, false, false, (TimeIntervalType) null, (String) null, (String) null, (TimeIntervalType) null, (String) null, (String) null, (String) null, (String) null, (TimeIntervalType) null, 0, (RankingType) null, (TokenAgeType) null, (String) null, (String) null, 0, 0, 0, (TimeIntervalType) null, (String) null, (String) null, (TimeIntervalType) null, (String) null, (String) null, (String) null, -1, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.holdersMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.liquidityMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.riskFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType AkhnZx() {
        return this.volumePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType EZpvd() {
        return this.changePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilterData copydefault(@NotNull String str, @NotNull TimeIntervalType timeIntervalType, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2, @NotNull TimeIntervalType timeIntervalType2, boolean z3, boolean z4, @NotNull TimeIntervalType timeIntervalType3, @NotNull String str8, @NotNull String str9, @NotNull TimeIntervalType timeIntervalType4, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull TimeIntervalType timeIntervalType5, int i, @NotNull RankingType rankingType, @NotNull TokenAgeType tokenAgeType, @NotNull String str14, @NotNull String str15, int i2, int i3, int i4, @NotNull TimeIntervalType timeIntervalType6, @NotNull String str16, @NotNull String str17, @NotNull TimeIntervalType timeIntervalType7, @NotNull String str18, @NotNull String str19, @NotNull String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(timeIntervalType2, "");
        Intrinsics.checkNotNullParameter(timeIntervalType3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(timeIntervalType4, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(timeIntervalType5, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(timeIntervalType6, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(timeIntervalType7, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        return new AdvancedFilterData(str, timeIntervalType, str2, str3, z, str4, str5, str6, str7, z2, timeIntervalType2, z3, z4, timeIntervalType3, str8, str9, timeIntervalType4, str10, str11, str12, str13, timeIntervalType5, i, rankingType, tokenAgeType, str14, str15, i2, i3, i4, timeIntervalType6, str16, str17, timeIntervalType7, str18, str19, str20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.stableTokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedFilterData)) {
            return false;
        }
        AdvancedFilterData advancedFilterData = (AdvancedFilterData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) advancedFilterData.chainId) && this.changePeriod == advancedFilterData.changePeriod && Intrinsics.EZpvd((Object) this.changeMin, (Object) advancedFilterData.changeMin) && Intrinsics.EZpvd((Object) this.changeMax, (Object) advancedFilterData.changeMax) && this.desc == advancedFilterData.desc && Intrinsics.EZpvd((Object) this.holdersMin, (Object) advancedFilterData.holdersMin) && Intrinsics.EZpvd((Object) this.holdersMax, (Object) advancedFilterData.holdersMax) && Intrinsics.EZpvd((Object) this.liquidityMin, (Object) advancedFilterData.liquidityMin) && Intrinsics.EZpvd((Object) this.liquidityMax, (Object) advancedFilterData.liquidityMax) && this.openSource == advancedFilterData.openSource && this.periodType == advancedFilterData.periodType && this.riskFilter == advancedFilterData.riskFilter && this.stableTokenFilter == advancedFilterData.stableTokenFilter && this.tradeNumPeriod == advancedFilterData.tradeNumPeriod && Intrinsics.EZpvd((Object) this.tradeNumMin, (Object) advancedFilterData.tradeNumMin) && Intrinsics.EZpvd((Object) this.tradeNumMax, (Object) advancedFilterData.tradeNumMax) && this.txsPeriod == advancedFilterData.txsPeriod && Intrinsics.EZpvd((Object) this.txsMin, (Object) advancedFilterData.txsMin) && Intrinsics.EZpvd((Object) this.txsMax, (Object) advancedFilterData.txsMax) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) advancedFilterData.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) advancedFilterData.volumeMax) && this.volumePeriod == advancedFilterData.volumePeriod && this.categoryType == advancedFilterData.categoryType && this.rankBy == advancedFilterData.rankBy && this.tokenAgeType == advancedFilterData.tokenAgeType && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) advancedFilterData.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) advancedFilterData.tokenAgeMax) && this.pageSize == advancedFilterData.pageSize && this.page == advancedFilterData.page && this.totalPage == advancedFilterData.totalPage && this.uniqueTraderPeriod == advancedFilterData.uniqueTraderPeriod && Intrinsics.EZpvd((Object) this.uniqueTraderMin, (Object) advancedFilterData.uniqueTraderMin) && Intrinsics.EZpvd((Object) this.uniqueTraderMax, (Object) advancedFilterData.uniqueTraderMax) && this.mentionedPeriod == advancedFilterData.mentionedPeriod && Intrinsics.EZpvd((Object) this.projectIds, (Object) advancedFilterData.projectIds) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) advancedFilterData.marketCapMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) advancedFilterData.marketCapMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType fetchVPNInfo() {
        return this.txsPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType gEmmrt() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.changePeriod.hashCode()) * 31) + this.changeMin.hashCode()) * 31) + this.changeMax.hashCode()) * 31) + Boolean.hashCode(this.desc)) * 31) + this.holdersMin.hashCode()) * 31) + this.holdersMax.hashCode()) * 31) + this.liquidityMin.hashCode()) * 31) + this.liquidityMax.hashCode()) * 31) + Boolean.hashCode(this.openSource)) * 31) + this.periodType.hashCode()) * 31) + Boolean.hashCode(this.riskFilter)) * 31) + Boolean.hashCode(this.stableTokenFilter)) * 31) + this.tradeNumPeriod.hashCode()) * 31) + this.tradeNumMin.hashCode()) * 31) + this.tradeNumMax.hashCode()) * 31) + this.txsPeriod.hashCode()) * 31) + this.txsMin.hashCode()) * 31) + this.txsMax.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.volumePeriod.hashCode()) * 31) + Integer.hashCode(this.categoryType)) * 31) + this.rankBy.hashCode()) * 31) + this.tokenAgeType.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.totalPage)) * 31) + this.uniqueTraderPeriod.hashCode()) * 31) + this.uniqueTraderMin.hashCode()) * 31) + this.uniqueTraderMax.hashCode()) * 31) + this.mentionedPeriod.hashCode()) * 31) + this.projectIds.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.marketCapMax.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedFilterData(chainId=" + this.chainId + ", changePeriod=" + this.changePeriod + ", changeMin=" + this.changeMin + ", changeMax=" + this.changeMax + ", desc=" + this.desc + ", holdersMin=" + this.holdersMin + ", holdersMax=" + this.holdersMax + ", liquidityMin=" + this.liquidityMin + ", liquidityMax=" + this.liquidityMax + ", openSource=" + this.openSource + ", periodType=" + this.periodType + ", riskFilter=" + this.riskFilter + ", stableTokenFilter=" + this.stableTokenFilter + ", tradeNumPeriod=" + this.tradeNumPeriod + ", tradeNumMin=" + this.tradeNumMin + ", tradeNumMax=" + this.tradeNumMax + ", txsPeriod=" + this.txsPeriod + ", txsMin=" + this.txsMin + ", txsMax=" + this.txsMax + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", volumePeriod=" + this.volumePeriod + ", categoryType=" + this.categoryType + ", rankBy=" + this.rankBy + ", tokenAgeType=" + this.tokenAgeType + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", pageSize=" + this.pageSize + ", page=" + this.page + ", totalPage=" + this.totalPage + ", uniqueTraderPeriod=" + this.uniqueTraderPeriod + ", uniqueTraderMin=" + this.uniqueTraderMin + ", uniqueTraderMax=" + this.uniqueTraderMax + ", mentionedPeriod=" + this.mentionedPeriod + ", projectIds=" + this.projectIds + ", marketCapMin=" + this.marketCapMin + ", marketCapMax=" + this.marketCapMax + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType valueOf() {
        return this.tradeNumPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.volumeMin;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.AdvancedFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedFilterData> serializer() {
            return AdvancedFilterData$$serializer.INSTANCE;
        }
    }

    static {
        TimeIntervalType.Companion companion = TimeIntervalType.Companion;
        $childSerializers = new KSerializer[]{null, companion.serializer(), null, null, null, null, null, null, null, null, companion.serializer(), null, null, companion.serializer(), null, null, companion.serializer(), null, null, null, null, companion.serializer(), null, RankingType.Companion.serializer(), TokenAgeType.Companion.serializer(), null, null, null, null, null, companion.serializer(), null, null, companion.serializer(), null, null, null};
    }

    public /* synthetic */ AdvancedFilterData(int i, int i2, String str, TimeIntervalType timeIntervalType, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, boolean z2, TimeIntervalType timeIntervalType2, boolean z3, boolean z4, TimeIntervalType timeIntervalType3, String str8, String str9, TimeIntervalType timeIntervalType4, String str10, String str11, String str12, String str13, TimeIntervalType timeIntervalType5, int i3, RankingType rankingType, TokenAgeType tokenAgeType, String str14, String str15, int i4, int i5, int i6, TimeIntervalType timeIntervalType6, String str16, String str17, TimeIntervalType timeIntervalType7, String str18, String str19, String str20, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? "all" : str;
        this.changePeriod = (i & 2) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType;
        if ((i & 4) == 0) {
            this.changeMin = "";
        } else {
            this.changeMin = str2;
        }
        if ((i & 8) == 0) {
            this.changeMax = "";
        } else {
            this.changeMax = str3;
        }
        if ((i & 16) == 0) {
            this.desc = true;
        } else {
            this.desc = z;
        }
        if ((i & 32) == 0) {
            this.holdersMin = "";
        } else {
            this.holdersMin = str4;
        }
        if ((i & 64) == 0) {
            this.holdersMax = "";
        } else {
            this.holdersMax = str5;
        }
        if ((i & 128) == 0) {
            this.liquidityMin = "";
        } else {
            this.liquidityMin = str6;
        }
        if ((i & 256) == 0) {
            this.liquidityMax = "";
        } else {
            this.liquidityMax = str7;
        }
        if ((i & 512) == 0) {
            this.openSource = false;
        } else {
            this.openSource = z2;
        }
        this.periodType = (i & 1024) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType2;
        if ((i & 2048) == 0) {
            this.riskFilter = true;
        } else {
            this.riskFilter = z3;
        }
        if ((i & 4096) == 0) {
            this.stableTokenFilter = true;
        } else {
            this.stableTokenFilter = z4;
        }
        this.tradeNumPeriod = (i & 8192) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType3;
        if ((i & 16384) == 0) {
            this.tradeNumMin = "";
        } else {
            this.tradeNumMin = str8;
        }
        if ((32768 & i) == 0) {
            this.tradeNumMax = "";
        } else {
            this.tradeNumMax = str9;
        }
        this.txsPeriod = (65536 & i) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType4;
        if ((131072 & i) == 0) {
            this.txsMin = "";
        } else {
            this.txsMin = str10;
        }
        if ((262144 & i) == 0) {
            this.txsMax = "";
        } else {
            this.txsMax = str11;
        }
        if ((524288 & i) == 0) {
            this.volumeMin = "";
        } else {
            this.volumeMin = str12;
        }
        if ((1048576 & i) == 0) {
            this.volumeMax = "";
        } else {
            this.volumeMax = str13;
        }
        this.volumePeriod = (2097152 & i) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType5;
        this.categoryType = (4194304 & i) == 0 ? 4 : i3;
        this.rankBy = (8388608 & i) == 0 ? RankingType.SEARCH : rankingType;
        this.tokenAgeType = (16777216 & i) == 0 ? TokenAgeType.HOUR : tokenAgeType;
        if ((33554432 & i) == 0) {
            this.tokenAgeMin = "";
        } else {
            this.tokenAgeMin = str14;
        }
        if ((67108864 & i) == 0) {
            this.tokenAgeMax = "";
        } else {
            this.tokenAgeMax = str15;
        }
        this.pageSize = (134217728 & i) == 0 ? 200 : i4;
        if ((268435456 & i) == 0) {
            this.page = 1;
        } else {
            this.page = i5;
        }
        this.totalPage = (536870912 & i) != 0 ? i6 : 0;
        this.uniqueTraderPeriod = (1073741824 & i) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType6;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.uniqueTraderMin = "";
        } else {
            this.uniqueTraderMin = str16;
        }
        if ((i2 & 1) == 0) {
            this.uniqueTraderMax = "";
        } else {
            this.uniqueTraderMax = str17;
        }
        this.mentionedPeriod = (i2 & 2) == 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType7;
        if ((i2 & 4) == 0) {
            this.projectIds = "";
        } else {
            this.projectIds = str18;
        }
        if ((i2 & 8) == 0) {
            this.marketCapMin = "";
        } else {
            this.marketCapMin = str19;
        }
        if ((i2 & 16) == 0) {
            this.marketCapMax = "";
        } else {
            this.marketCapMax = str20;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [12=10] */
    public static final /* synthetic */ void KWHzl(AdvancedFilterData advancedFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) advancedFilterData.chainId, (Object) "all")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, advancedFilterData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || advancedFilterData.changePeriod != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], advancedFilterData.changePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) advancedFilterData.changeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, advancedFilterData.changeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) advancedFilterData.changeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, advancedFilterData.changeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !advancedFilterData.desc) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, advancedFilterData.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) advancedFilterData.holdersMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, advancedFilterData.holdersMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) advancedFilterData.holdersMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, advancedFilterData.holdersMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) advancedFilterData.liquidityMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, advancedFilterData.liquidityMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) advancedFilterData.liquidityMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, advancedFilterData.liquidityMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || advancedFilterData.openSource) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, advancedFilterData.openSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || advancedFilterData.periodType != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], advancedFilterData.periodType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !advancedFilterData.riskFilter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, advancedFilterData.riskFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !advancedFilterData.stableTokenFilter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, advancedFilterData.stableTokenFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || advancedFilterData.tradeNumPeriod != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], advancedFilterData.tradeNumPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) advancedFilterData.tradeNumMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, advancedFilterData.tradeNumMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) advancedFilterData.tradeNumMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, advancedFilterData.tradeNumMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || advancedFilterData.txsPeriod != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], advancedFilterData.txsPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) advancedFilterData.txsMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, advancedFilterData.txsMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) advancedFilterData.txsMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, advancedFilterData.txsMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) advancedFilterData.volumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, advancedFilterData.volumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) advancedFilterData.volumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, advancedFilterData.volumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || advancedFilterData.volumePeriod != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], advancedFilterData.volumePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || advancedFilterData.categoryType != 4) {
            compositeEncoder.encodeIntElement(serialDescriptor, 22, advancedFilterData.categoryType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || advancedFilterData.rankBy != RankingType.SEARCH) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], advancedFilterData.rankBy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || advancedFilterData.tokenAgeType != TokenAgeType.HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], advancedFilterData.tokenAgeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) advancedFilterData.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, advancedFilterData.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) advancedFilterData.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, advancedFilterData.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || advancedFilterData.pageSize != 200) {
            compositeEncoder.encodeIntElement(serialDescriptor, 27, advancedFilterData.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || advancedFilterData.page != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 28, advancedFilterData.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || advancedFilterData.totalPage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 29, advancedFilterData.totalPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || advancedFilterData.uniqueTraderPeriod != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 30, kSerializerArr[30], advancedFilterData.uniqueTraderPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) advancedFilterData.uniqueTraderMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, advancedFilterData.uniqueTraderMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) advancedFilterData.uniqueTraderMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, advancedFilterData.uniqueTraderMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || advancedFilterData.mentionedPeriod != TimeIntervalType.ONE_HOUR) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 33, kSerializerArr[33], advancedFilterData.mentionedPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) advancedFilterData.projectIds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, advancedFilterData.projectIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) advancedFilterData.marketCapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, advancedFilterData.marketCapMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) && Intrinsics.EZpvd((Object) advancedFilterData.marketCapMax, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 36, advancedFilterData.marketCapMax);
    }

    public AdvancedFilterData(@NotNull String str, @NotNull TimeIntervalType timeIntervalType, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2, @NotNull TimeIntervalType timeIntervalType2, boolean z3, boolean z4, @NotNull TimeIntervalType timeIntervalType3, @NotNull String str8, @NotNull String str9, @NotNull TimeIntervalType timeIntervalType4, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull TimeIntervalType timeIntervalType5, int i, @NotNull RankingType rankingType, @NotNull TokenAgeType tokenAgeType, @NotNull String str14, @NotNull String str15, int i2, int i3, int i4, @NotNull TimeIntervalType timeIntervalType6, @NotNull String str16, @NotNull String str17, @NotNull TimeIntervalType timeIntervalType7, @NotNull String str18, @NotNull String str19, @NotNull String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(timeIntervalType2, "");
        Intrinsics.checkNotNullParameter(timeIntervalType3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(timeIntervalType4, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(timeIntervalType5, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(timeIntervalType6, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(timeIntervalType7, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        this.chainId = str;
        this.changePeriod = timeIntervalType;
        this.changeMin = str2;
        this.changeMax = str3;
        this.desc = z;
        this.holdersMin = str4;
        this.holdersMax = str5;
        this.liquidityMin = str6;
        this.liquidityMax = str7;
        this.openSource = z2;
        this.periodType = timeIntervalType2;
        this.riskFilter = z3;
        this.stableTokenFilter = z4;
        this.tradeNumPeriod = timeIntervalType3;
        this.tradeNumMin = str8;
        this.tradeNumMax = str9;
        this.txsPeriod = timeIntervalType4;
        this.txsMin = str10;
        this.txsMax = str11;
        this.volumeMin = str12;
        this.volumeMax = str13;
        this.volumePeriod = timeIntervalType5;
        this.categoryType = i;
        this.rankBy = rankingType;
        this.tokenAgeType = tokenAgeType;
        this.tokenAgeMin = str14;
        this.tokenAgeMax = str15;
        this.pageSize = i2;
        this.page = i3;
        this.totalPage = i4;
        this.uniqueTraderPeriod = timeIntervalType6;
        this.uniqueTraderMin = str16;
        this.uniqueTraderMax = str17;
        this.mentionedPeriod = timeIntervalType7;
        this.projectIds = str18;
        this.marketCapMin = str19;
        this.marketCapMax = str20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01b8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("all") : (r38v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:17) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r39v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r75v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r75v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r75v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r42v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r75v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r75v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r75v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r75v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r75v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0056: ARITH (r75v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: SGET  A[WRAPPED] (LINE:35) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r48v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r75v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r49v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (r75v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r50v0 boolean))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x006f: ARITH (r75v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: SGET  A[WRAPPED] (LINE:41) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r51v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r75v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r75v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0091: ARITH (r75v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0095: SGET  A[WRAPPED] (LINE:47) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r54v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (r75v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r75v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r75v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r75v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r75v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00cc: SGET  A[WRAPPED] (LINE:57) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r59v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d3: ARITH (r75v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r60v0 int))
  (wrap:com.okinc.business.market.common.constants.RankingType:?: TERNARY null = ((wrap:int:0x00de: ARITH (r75v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e2: SGET  A[WRAPPED] (LINE:61) com.okinc.business.market.common.constants.RankingType.SEARCH com.okinc.business.market.common.constants.RankingType) : (r61v0 com.okinc.business.market.common.constants.RankingType))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: TERNARY null = ((wrap:int:0x00e9: ARITH (r75v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ed: SGET  A[WRAPPED] (LINE:63) com.okinc.business.market.common.constants.TokenAgeType.HOUR com.okinc.business.market.common.constants.TokenAgeType) : (r62v0 com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r75v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r75v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x010a: ARITH (r75v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (200 int) : (r65v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0115: ARITH (r75v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r66v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0120: ARITH (r75v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r67v0 int))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x012b: ARITH (r75v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x012f: SGET  A[WRAPPED] (LINE:75) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r68v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0136: ARITH (r75v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (r76v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0148: ARITH (r76v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x014c: SGET  A[WRAPPED] (LINE:81) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r71v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0151: ARITH (r76v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015a: ARITH (r76v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0163: ARITH (r76v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.TimeIntervalType, boolean, boolean, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, int, com.okinc.business.market.common.constants.RankingType, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, int, int, int, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.market.data.model.AdvancedFilterData.<init>(java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.TimeIntervalType, boolean, boolean, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, int, com.okinc.business.market.common.constants.RankingType, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, int, int, int, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedFilterData(String str, TimeIntervalType timeIntervalType, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, boolean z2, TimeIntervalType timeIntervalType2, boolean z3, boolean z4, TimeIntervalType timeIntervalType3, String str8, String str9, TimeIntervalType timeIntervalType4, String str10, String str11, String str12, String str13, TimeIntervalType timeIntervalType5, int i, RankingType rankingType, TokenAgeType tokenAgeType, String str14, String str15, int i2, int i3, int i4, TimeIntervalType timeIntervalType6, String str16, String str17, TimeIntervalType timeIntervalType7, String str18, String str19, String str20, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "all" : str, (i5 & 2) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? "" : str3, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? "" : str4, (i5 & 64) != 0 ? "" : str5, (i5 & 128) != 0 ? "" : str6, (i5 & 256) != 0 ? "" : str7, (i5 & 512) != 0 ? false : z2, (i5 & 1024) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType2, (i5 & 2048) != 0 ? true : z3, (i5 & 4096) != 0 ? true : z4, (i5 & 8192) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType3, (i5 & 16384) != 0 ? "" : str8, (i5 & 32768) != 0 ? "" : str9, (i5 & 65536) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType4, (i5 & 131072) != 0 ? "" : str10, (i5 & 262144) != 0 ? "" : str11, (i5 & 524288) != 0 ? "" : str12, (i5 & 1048576) != 0 ? "" : str13, (i5 & 2097152) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType5, (i5 & 4194304) != 0 ? 4 : i, (i5 & 8388608) != 0 ? RankingType.SEARCH : rankingType, (i5 & 16777216) != 0 ? TokenAgeType.HOUR : tokenAgeType, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str14, (i5 & 67108864) != 0 ? "" : str15, (i5 & 134217728) != 0 ? 200 : i2, (i5 & 268435456) != 0 ? 1 : i3, (i5 & 536870912) != 0 ? 0 : i4, (i5 & 1073741824) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType6, (i5 & Integer.MIN_VALUE) != 0 ? "" : str16, (i6 & 1) != 0 ? "" : str17, (i6 & 2) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType7, (i6 & 4) != 0 ? "" : str18, (i6 & 8) != 0 ? "" : str19, (i6 & 16) != 0 ? "" : str20);
    }
}
