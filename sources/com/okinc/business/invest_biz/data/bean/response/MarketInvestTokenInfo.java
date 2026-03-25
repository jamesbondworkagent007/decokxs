package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment$$serializer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MarketInvestTokenInfo {
    public final Map<String, List<InvestedToken>> assetMap;
    public final HealthRate healthRate;
    public final String investTypeName;
    public final String investmentId;
    public final String markerId;
    public final String marketRewardTotalValue;
    public final List<InvestUserRewardInfoByInvestment> marketRewards;
    public final String totalValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InvestUserRewardInfoByInvestment$$serializer.INSTANCE), null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(InvestedToken$$serializer.INSTANCE))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketInvestTokenInfo() {
        this((HealthRate) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.markerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate EZpvd() {
        return this.healthRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<InvestedToken>> KWHzl() {
        return this.assetMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInvestTokenInfo OLrzqt(HealthRate healthRate, @NotNull List<InvestUserRewardInfoByInvestment> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Map<String, ? extends List<InvestedToken>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new MarketInvestTokenInfo(healthRate, list, str, str2, str3, str4, str5, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.investTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketInvestTokenInfo)) {
            return false;
        }
        MarketInvestTokenInfo marketInvestTokenInfo = (MarketInvestTokenInfo) obj;
        return Intrinsics.EZpvd(this.healthRate, marketInvestTokenInfo.healthRate) && Intrinsics.EZpvd(this.marketRewards, marketInvestTokenInfo.marketRewards) && Intrinsics.EZpvd((Object) this.investTypeName, (Object) marketInvestTokenInfo.investTypeName) && Intrinsics.EZpvd((Object) this.investmentId, (Object) marketInvestTokenInfo.investmentId) && Intrinsics.EZpvd((Object) this.marketRewardTotalValue, (Object) marketInvestTokenInfo.marketRewardTotalValue) && Intrinsics.EZpvd((Object) this.totalValue, (Object) marketInvestTokenInfo.totalValue) && Intrinsics.EZpvd((Object) this.markerId, (Object) marketInvestTokenInfo.markerId) && Intrinsics.EZpvd(this.assetMap, marketInvestTokenInfo.assetMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> gEmmrt() {
        return this.marketRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        HealthRate healthRate = this.healthRate;
        return ((((((((((((((healthRate == null ? 0 : healthRate.hashCode()) * 31) + this.marketRewards.hashCode()) * 31) + this.investTypeName.hashCode()) * 31) + this.investmentId.hashCode()) * 31) + this.marketRewardTotalValue.hashCode()) * 31) + this.totalValue.hashCode()) * 31) + this.markerId.hashCode()) * 31) + this.assetMap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketInvestTokenInfo(healthRate=" + this.healthRate + ", marketRewards=" + this.marketRewards + ", investTypeName=" + this.investTypeName + ", investmentId=" + this.investmentId + ", marketRewardTotalValue=" + this.marketRewardTotalValue + ", totalValue=" + this.totalValue + ", markerId=" + this.markerId + ", assetMap=" + this.assetMap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketInvestTokenInfo> serializer() {
            return MarketInvestTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketInvestTokenInfo(int i, HealthRate healthRate, List list, String str, String str2, String str3, String str4, String str5, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.healthRate = (i & 1) == 0 ? null : healthRate;
        if ((i & 2) == 0) {
            this.marketRewards = yDY.AhwBna();
        } else {
            this.marketRewards = list;
        }
        if ((i & 4) == 0) {
            this.investTypeName = "";
        } else {
            this.investTypeName = str;
        }
        if ((i & 8) == 0) {
            this.investmentId = "";
        } else {
            this.investmentId = str2;
        }
        if ((i & 16) == 0) {
            this.marketRewardTotalValue = "";
        } else {
            this.marketRewardTotalValue = str3;
        }
        if ((i & 32) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str4;
        }
        if ((i & 64) == 0) {
            this.markerId = "";
        } else {
            this.markerId = str5;
        }
        if ((i & 128) == 0) {
            this.assetMap = C56424yEw.KWHzl();
        } else {
            this.assetMap = map;
        }
    }

    public static final /* synthetic */ void EZpvd(MarketInvestTokenInfo marketInvestTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || marketInvestTokenInfo.healthRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, HealthRate$$serializer.INSTANCE, marketInvestTokenInfo.healthRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(marketInvestTokenInfo.marketRewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], marketInvestTokenInfo.marketRewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketInvestTokenInfo.investTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketInvestTokenInfo.investTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketInvestTokenInfo.investmentId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketInvestTokenInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketInvestTokenInfo.marketRewardTotalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketInvestTokenInfo.marketRewardTotalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketInvestTokenInfo.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marketInvestTokenInfo.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketInvestTokenInfo.markerId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketInvestTokenInfo.markerId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd(marketInvestTokenInfo.assetMap, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], marketInvestTokenInfo.assetMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestedToken>> */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketInvestTokenInfo(HealthRate healthRate, @NotNull List<InvestUserRewardInfoByInvestment> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Map<String, ? extends List<InvestedToken>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.healthRate = healthRate;
        this.marketRewards = list;
        this.investTypeName = str;
        this.investmentId = str2;
        this.marketRewardTotalValue = str3;
        this.totalValue = str4;
        this.markerId = str5;
        this.assetMap = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.response.HealthRate:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.HealthRate) : (r10v0 com.okinc.business.invest_biz.data.bean.response.HealthRate))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:59)) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0038: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003c: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:71)) : (r17v0 java.util.Map))
 A[MD:(com.okinc.business.invest_biz.data.bean.response.HealthRate, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestedToken>>):void (m)] (LINE:55) call: com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo.<init>(com.okinc.business.invest_biz.data.bean.response.HealthRate, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ MarketInvestTokenInfo(HealthRate healthRate, List list, String str, String str2, String str3, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : healthRate, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "", (i & 128) != 0 ? C56424yEw.KWHzl() : map);
    }
}
