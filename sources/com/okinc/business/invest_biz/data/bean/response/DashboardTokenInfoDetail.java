package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.bean.HealthFactor;
import com.okinc.business.invest_biz.data.bean.HealthFactor$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardTokenInfoDetail {
    public final long analysisPlatformId;
    public final String assetsTokenInvestName;
    public final List<DashboardAssetToken> assetsTokens;
    public final long chainId;
    public final String containAvailableReward;
    public final String containMarketReward;
    public final String currencyAmount;
    public final List<DashboardInvestmentInfo> dashboardInvestmentInfos;
    public final String feeRate;
    public final HealthFactor healthFactor;
    public final String network;
    public final String networkLogo;
    public final String platformName;
    public final String platformUrl;
    public final String totalEarnings;
    public final String yesterdayProfit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DashboardAssetToken$$serializer.INSTANCE), new ArrayListSerializer(DashboardInvestmentInfo$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardTokenInfoDetail() {
        this(0L, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (HealthFactor) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DashboardInvestmentInfo> AYXKKw() {
        return this.dashboardInvestmentInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.containAvailableReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.assetsTokenInvestName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenInfoDetail copydefault(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<DashboardAssetToken> list, @NotNull List<DashboardInvestmentInfo> list2, @NotNull String str8, @NotNull String str9, HealthFactor healthFactor, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new DashboardTokenInfoDetail(j, str, str2, str3, str4, j2, str5, str6, str7, list, list2, str8, str9, healthFactor, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DashboardAssetToken> copydefault() {
        return this.assetsTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.containMarketReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.yesterdayProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTokenInfoDetail)) {
            return false;
        }
        DashboardTokenInfoDetail dashboardTokenInfoDetail = (DashboardTokenInfoDetail) obj;
        return this.analysisPlatformId == dashboardTokenInfoDetail.analysisPlatformId && Intrinsics.EZpvd((Object) this.platformName, (Object) dashboardTokenInfoDetail.platformName) && Intrinsics.EZpvd((Object) this.platformUrl, (Object) dashboardTokenInfoDetail.platformUrl) && Intrinsics.EZpvd((Object) this.network, (Object) dashboardTokenInfoDetail.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) dashboardTokenInfoDetail.networkLogo) && this.chainId == dashboardTokenInfoDetail.chainId && Intrinsics.EZpvd((Object) this.feeRate, (Object) dashboardTokenInfoDetail.feeRate) && Intrinsics.EZpvd((Object) this.assetsTokenInvestName, (Object) dashboardTokenInfoDetail.assetsTokenInvestName) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) dashboardTokenInfoDetail.currencyAmount) && Intrinsics.EZpvd(this.assetsTokens, dashboardTokenInfoDetail.assetsTokens) && Intrinsics.EZpvd(this.dashboardInvestmentInfos, dashboardTokenInfoDetail.dashboardInvestmentInfos) && Intrinsics.EZpvd((Object) this.containAvailableReward, (Object) dashboardTokenInfoDetail.containAvailableReward) && Intrinsics.EZpvd((Object) this.containMarketReward, (Object) dashboardTokenInfoDetail.containMarketReward) && Intrinsics.EZpvd(this.healthFactor, dashboardTokenInfoDetail.healthFactor) && Intrinsics.EZpvd((Object) this.totalEarnings, (Object) dashboardTokenInfoDetail.totalEarnings) && Intrinsics.EZpvd((Object) this.yesterdayProfit, (Object) dashboardTokenInfoDetail.yesterdayProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.analysisPlatformId);
        int iHashCode2 = this.platformName.hashCode();
        int iHashCode3 = this.platformUrl.hashCode();
        int iHashCode4 = this.network.hashCode();
        int iHashCode5 = this.networkLogo.hashCode();
        int iHashCode6 = Long.hashCode(this.chainId);
        int iHashCode7 = this.feeRate.hashCode();
        int iHashCode8 = this.assetsTokenInvestName.hashCode();
        int iHashCode9 = this.currencyAmount.hashCode();
        int iHashCode10 = this.assetsTokens.hashCode();
        int iHashCode11 = this.dashboardInvestmentInfos.hashCode();
        int iHashCode12 = this.containAvailableReward.hashCode();
        int iHashCode13 = this.containMarketReward.hashCode();
        HealthFactor healthFactor = this.healthFactor;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (healthFactor == null ? 0 : healthFactor.hashCode())) * 31) + this.totalEarnings.hashCode()) * 31) + this.yesterdayProfit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthFactor isConnected() {
        return this.healthFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardTokenInfoDetail(analysisPlatformId=" + this.analysisPlatformId + ", platformName=" + this.platformName + ", platformUrl=" + this.platformUrl + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", chainId=" + this.chainId + ", feeRate=" + this.feeRate + ", assetsTokenInvestName=" + this.assetsTokenInvestName + ", currencyAmount=" + this.currencyAmount + ", assetsTokens=" + this.assetsTokens + ", dashboardInvestmentInfos=" + this.dashboardInvestmentInfos + ", containAvailableReward=" + this.containAvailableReward + ", containMarketReward=" + this.containMarketReward + ", healthFactor=" + this.healthFactor + ", totalEarnings=" + this.totalEarnings + ", yesterdayProfit=" + this.yesterdayProfit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.networkLogo;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfoDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardTokenInfoDetail> serializer() {
            return DashboardTokenInfoDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardTokenInfoDetail(int i, long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, List list, List list2, String str8, String str9, HealthFactor healthFactor, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.analysisPlatformId = 0L;
        } else {
            this.analysisPlatformId = j;
        }
        if ((i & 2) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str;
        }
        if ((i & 4) == 0) {
            this.platformUrl = "";
        } else {
            this.platformUrl = str2;
        }
        if ((i & 8) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 16) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str4;
        }
        if ((i & 32) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j2;
        }
        if ((i & 64) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str5;
        }
        if ((i & 128) == 0) {
            this.assetsTokenInvestName = "";
        } else {
            this.assetsTokenInvestName = str6;
        }
        if ((i & 256) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str7;
        }
        this.assetsTokens = (i & 512) == 0 ? yDY.AhwBna() : list;
        this.dashboardInvestmentInfos = (i & 1024) == 0 ? yDY.AhwBna() : list2;
        if ((i & 2048) == 0) {
            this.containAvailableReward = "";
        } else {
            this.containAvailableReward = str8;
        }
        if ((i & 4096) == 0) {
            this.containMarketReward = "";
        } else {
            this.containMarketReward = str9;
        }
        this.healthFactor = (i & 8192) == 0 ? null : healthFactor;
        if ((i & 16384) == 0) {
            this.totalEarnings = "";
        } else {
            this.totalEarnings = str10;
        }
        if ((i & 32768) == 0) {
            this.yesterdayProfit = "";
        } else {
            this.yesterdayProfit = str11;
        }
    }

    public static final /* synthetic */ void copydefault(DashboardTokenInfoDetail dashboardTokenInfoDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dashboardTokenInfoDetail.analysisPlatformId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, dashboardTokenInfoDetail.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dashboardTokenInfoDetail.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.platformUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardTokenInfoDetail.platformUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dashboardTokenInfoDetail.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dashboardTokenInfoDetail.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dashboardTokenInfoDetail.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, dashboardTokenInfoDetail.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dashboardTokenInfoDetail.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.assetsTokenInvestName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dashboardTokenInfoDetail.assetsTokenInvestName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dashboardTokenInfoDetail.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(dashboardTokenInfoDetail.assetsTokens, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], dashboardTokenInfoDetail.assetsTokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(dashboardTokenInfoDetail.dashboardInvestmentInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], dashboardTokenInfoDetail.dashboardInvestmentInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.containAvailableReward, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dashboardTokenInfoDetail.containAvailableReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.containMarketReward, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dashboardTokenInfoDetail.containMarketReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dashboardTokenInfoDetail.healthFactor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, HealthFactor$$serializer.INSTANCE, dashboardTokenInfoDetail.healthFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.totalEarnings, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dashboardTokenInfoDetail.totalEarnings);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) dashboardTokenInfoDetail.yesterdayProfit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, dashboardTokenInfoDetail.yesterdayProfit);
    }

    public DashboardTokenInfoDetail(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<DashboardAssetToken> list, @NotNull List<DashboardInvestmentInfo> list2, @NotNull String str8, @NotNull String str9, HealthFactor healthFactor, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.analysisPlatformId = j;
        this.platformName = str;
        this.platformUrl = str2;
        this.network = str3;
        this.networkLogo = str4;
        this.chainId = j2;
        this.feeRate = str5;
        this.assetsTokenInvestName = str6;
        this.currencyAmount = str7;
        this.assetsTokens = list;
        this.dashboardInvestmentInfos = list2;
        this.containAvailableReward = str8;
        this.containMarketReward = str9;
        this.healthFactor = healthFactor;
        this.totalEarnings = str10;
        this.yesterdayProfit = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b9: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r37v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r25v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004d: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:69)) : (r30v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0058: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:71)) : (r31v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:0x0076: TERNARY null = ((wrap:int:0x006d: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.HealthFactor:0x0080: TERNARY null = ((wrap:int:0x0078: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.HealthFactor) : (r34v0 com.okinc.business.invest_biz.data.bean.HealthFactor))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken>, java.util.List<com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo>, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HealthFactor, java.lang.String, java.lang.String):void (m)] (LINE:49) call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfoDetail.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HealthFactor, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DashboardTokenInfoDetail(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, List list, List list2, String str8, String str9, HealthFactor healthFactor, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? j2 : 0L, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) != 0 ? yDY.AhwBna() : list2, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? null : healthFactor, (i & 16384) != 0 ? "" : str10, (i & 32768) != 0 ? "" : str11);
    }
}
