package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment$$serializer;
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
public final class DashboardProtocolDetailsResponse {
    public static final KSerializer<Object>[] $childSerializers;
    public final long analysisPlatformId;
    public final List<InvestedToken> assets;
    public final List<InvestedToken> borrow;
    public final long chainId;
    public final HealthRate healthRate;
    public final String network;
    public final String platformName;
    public final String platformUrl;
    public final List<UnifiedRewardInfoByInvestment> rewards;
    public final String totalRewardValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardProtocolDetailsResponse() {
        this((String) null, 0L, (String) null, 0L, (String) null, (List) null, (List) null, (List) null, (HealthRate) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestedToken> AEQbTJ() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate AhwBna() {
        return this.healthRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardProtocolDetailsResponse EZpvd(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull String str3, @NotNull List<InvestedToken> list, @NotNull List<InvestedToken> list2, @NotNull List<UnifiedRewardInfoByInvestment> list3, HealthRate healthRate, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DashboardProtocolDetailsResponse(str, j, str2, j2, str3, list, list2, list3, healthRate, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestedToken> EZpvd() {
        return this.borrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardProtocolDetailsResponse)) {
            return false;
        }
        DashboardProtocolDetailsResponse dashboardProtocolDetailsResponse = (DashboardProtocolDetailsResponse) obj;
        return Intrinsics.EZpvd((Object) this.platformName, (Object) dashboardProtocolDetailsResponse.platformName) && this.analysisPlatformId == dashboardProtocolDetailsResponse.analysisPlatformId && Intrinsics.EZpvd((Object) this.platformUrl, (Object) dashboardProtocolDetailsResponse.platformUrl) && this.chainId == dashboardProtocolDetailsResponse.chainId && Intrinsics.EZpvd((Object) this.network, (Object) dashboardProtocolDetailsResponse.network) && Intrinsics.EZpvd(this.assets, dashboardProtocolDetailsResponse.assets) && Intrinsics.EZpvd(this.borrow, dashboardProtocolDetailsResponse.borrow) && Intrinsics.EZpvd(this.rewards, dashboardProtocolDetailsResponse.rewards) && Intrinsics.EZpvd(this.healthRate, dashboardProtocolDetailsResponse.healthRate) && Intrinsics.EZpvd((Object) this.totalRewardValue, (Object) dashboardProtocolDetailsResponse.totalRewardValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.platformName.hashCode();
        int iHashCode2 = Long.hashCode(this.analysisPlatformId);
        int iHashCode3 = this.platformUrl.hashCode();
        int iHashCode4 = Long.hashCode(this.chainId);
        int iHashCode5 = this.network.hashCode();
        int iHashCode6 = this.assets.hashCode();
        int iHashCode7 = this.borrow.hashCode();
        int iHashCode8 = this.rewards.hashCode();
        HealthRate healthRate = this.healthRate;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (healthRate == null ? 0 : healthRate.hashCode())) * 31) + this.totalRewardValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardProtocolDetailsResponse(platformName=" + this.platformName + ", analysisPlatformId=" + this.analysisPlatformId + ", platformUrl=" + this.platformUrl + ", chainId=" + this.chainId + ", network=" + this.network + ", assets=" + this.assets + ", borrow=" + this.borrow + ", rewards=" + this.rewards + ", healthRate=" + this.healthRate + ", totalRewardValue=" + this.totalRewardValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnifiedRewardInfoByInvestment> valueOf() {
        return this.rewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.totalRewardValue;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.DashboardProtocolDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardProtocolDetailsResponse> serializer() {
            return DashboardProtocolDetailsResponse$$serializer.INSTANCE;
        }
    }

    static {
        InvestedToken$$serializer investedToken$$serializer = InvestedToken$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(investedToken$$serializer), new ArrayListSerializer(investedToken$$serializer), new ArrayListSerializer(UnifiedRewardInfoByInvestment$$serializer.INSTANCE), null, null};
    }

    public /* synthetic */ DashboardProtocolDetailsResponse(int i, String str, long j, String str2, long j2, String str3, List list, List list2, List list3, HealthRate healthRate, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str;
        }
        if ((i & 2) == 0) {
            this.analysisPlatformId = 0L;
        } else {
            this.analysisPlatformId = j;
        }
        if ((i & 4) == 0) {
            this.platformUrl = "";
        } else {
            this.platformUrl = str2;
        }
        if ((i & 8) == 0) {
            this.chainId = -1L;
        } else {
            this.chainId = j2;
        }
        if ((i & 16) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 32) == 0) {
            this.assets = yDY.AhwBna();
        } else {
            this.assets = list;
        }
        if ((i & 64) == 0) {
            this.borrow = yDY.AhwBna();
        } else {
            this.borrow = list2;
        }
        if ((i & 128) == 0) {
            this.rewards = yDY.AhwBna();
        } else {
            this.rewards = list3;
        }
        if ((i & 256) == 0) {
            this.healthRate = null;
        } else {
            this.healthRate = healthRate;
        }
        if ((i & 512) == 0) {
            this.totalRewardValue = "";
        } else {
            this.totalRewardValue = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [272=4] */
    public static final /* synthetic */ void copydefault(DashboardProtocolDetailsResponse dashboardProtocolDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dashboardProtocolDetailsResponse.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dashboardProtocolDetailsResponse.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dashboardProtocolDetailsResponse.analysisPlatformId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, dashboardProtocolDetailsResponse.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dashboardProtocolDetailsResponse.platformUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardProtocolDetailsResponse.platformUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dashboardProtocolDetailsResponse.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, dashboardProtocolDetailsResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dashboardProtocolDetailsResponse.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dashboardProtocolDetailsResponse.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(dashboardProtocolDetailsResponse.assets, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], dashboardProtocolDetailsResponse.assets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(dashboardProtocolDetailsResponse.borrow, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], dashboardProtocolDetailsResponse.borrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(dashboardProtocolDetailsResponse.rewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], dashboardProtocolDetailsResponse.rewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dashboardProtocolDetailsResponse.healthRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, HealthRate$$serializer.INSTANCE, dashboardProtocolDetailsResponse.healthRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) dashboardProtocolDetailsResponse.totalRewardValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, dashboardProtocolDetailsResponse.totalRewardValue);
    }

    public DashboardProtocolDetailsResponse(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull String str3, @NotNull List<InvestedToken> list, @NotNull List<InvestedToken> list2, @NotNull List<UnifiedRewardInfoByInvestment> list3, HealthRate healthRate, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.platformName = str;
        this.analysisPlatformId = j;
        this.platformUrl = str2;
        this.chainId = j2;
        this.network = str3;
        this.assets = list;
        this.borrow = list2;
        this.rewards = list3;
        this.healthRate = healthRate;
        this.totalRewardValue = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r18v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002c: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:285)) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:287)) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0046: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:289)) : (r23v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.response.HealthRate:?: TERNARY null = ((wrap:int:0x004d: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.HealthRate) : (r24v0 com.okinc.business.invest_biz.data.bean.response.HealthRate))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, java.lang.String, long, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestedToken>, java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestedToken>, java.util.List<com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment>, com.okinc.business.invest_biz.data.bean.response.HealthRate, java.lang.String):void (m)] (LINE:273) call: com.okinc.business.invest_biz.data.bean.response.DashboardProtocolDetailsResponse.<init>(java.lang.String, long, java.lang.String, long, java.lang.String, java.util.List, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.response.HealthRate, java.lang.String):void type: THIS */
    public /* synthetic */ DashboardProtocolDetailsResponse(String str, long j, String str2, long j2, String str3, List list, List list2, List list3, HealthRate healthRate, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? -1L : j2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? yDY.AhwBna() : list2, (i & 128) != 0 ? yDY.AhwBna() : list3, (i & 256) != 0 ? null : healthRate, (i & 512) == 0 ? str4 : "");
    }
}
