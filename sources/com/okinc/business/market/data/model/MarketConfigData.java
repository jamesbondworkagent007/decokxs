package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MarketConfigData {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<BannerConfigData> bannerConfig;
    public final HolderConfigData holderConfig;
    public final List<String> supportChainsHolderDesc;
    public final List<String> supportRugPull;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketConfigData() {
        this((List) null, (List) null, (HolderConfigData) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.MarketConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketConfigData copy$default(MarketConfigData marketConfigData, List list, List list2, HolderConfigData holderConfigData, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketConfigData.supportChainsHolderDesc;
        }
        if ((i & 2) != 0) {
            list2 = marketConfigData.bannerConfig;
        }
        if ((i & 4) != 0) {
            holderConfigData = marketConfigData.holderConfig;
        }
        if ((i & 8) != 0) {
            list3 = marketConfigData.supportRugPull;
        }
        return marketConfigData.OLrzqt(list, list2, holderConfigData, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderConfigData AEQbTJ() {
        return this.holderConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerConfigData> KWHzl() {
        return this.bannerConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketConfigData OLrzqt(List<String> list, List<BannerConfigData> list2, @NotNull HolderConfigData holderConfigData, List<String> list3) {
        Intrinsics.checkNotNullParameter(holderConfigData, "");
        return new MarketConfigData(list, list2, holderConfigData, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.supportRugPull;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> copydefault() {
        return this.supportChainsHolderDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketConfigData)) {
            return false;
        }
        MarketConfigData marketConfigData = (MarketConfigData) obj;
        return Intrinsics.EZpvd(this.supportChainsHolderDesc, marketConfigData.supportChainsHolderDesc) && Intrinsics.EZpvd(this.bannerConfig, marketConfigData.bannerConfig) && Intrinsics.EZpvd(this.holderConfig, marketConfigData.holderConfig) && Intrinsics.EZpvd(this.supportRugPull, marketConfigData.supportRugPull);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.supportChainsHolderDesc;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<BannerConfigData> list2 = this.bannerConfig;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        int iHashCode3 = this.holderConfig.hashCode();
        List<String> list3 = this.supportRugPull;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketConfigData(supportChainsHolderDesc=" + this.supportChainsHolderDesc + ", bannerConfig=" + this.bannerConfig + ", holderConfig=" + this.holderConfig + ", supportRugPull=" + this.supportRugPull + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.MarketConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketConfigData> serializer() {
            return MarketConfigData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(BannerConfigData$$serializer.INSTANCE), null, new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ MarketConfigData(int i, List list, List list2, HolderConfigData holderConfigData, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        List list4 = null;
        byte b = 0;
        if ((i & 1) == 0) {
            this.supportChainsHolderDesc = null;
        } else {
            this.supportChainsHolderDesc = list;
        }
        if ((i & 2) == 0) {
            this.bannerConfig = null;
        } else {
            this.bannerConfig = list2;
        }
        if ((i & 4) == 0) {
            this.holderConfig = new HolderConfigData(list4, 1, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            this.holderConfig = holderConfigData;
        }
        if ((i & 8) == 0) {
            this.supportRugPull = null;
        } else {
            this.supportRugPull = list3;
        }
    }

    public static final /* synthetic */ void OLrzqt(MarketConfigData marketConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || marketConfigData.supportChainsHolderDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], marketConfigData.supportChainsHolderDesc);
        }
        int i = 1;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || marketConfigData.bannerConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], marketConfigData.bannerConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(marketConfigData.holderConfig, new HolderConfigData((List) null, i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, HolderConfigData$$serializer.INSTANCE, marketConfigData.holderConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && marketConfigData.supportRugPull == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], marketConfigData.supportRugPull);
    }

    public MarketConfigData(List<String> list, List<BannerConfigData> list2, @NotNull HolderConfigData holderConfigData, List<String> list3) {
        Intrinsics.checkNotNullParameter(holderConfigData, "");
        this.supportChainsHolderDesc = list;
        this.bannerConfig = list2;
        this.holderConfig = holderConfigData;
        this.supportRugPull = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:com.okinc.business.market.data.model.HolderConfigData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.model.HolderConfigData:0x0012: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
 A[MD:(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.business.market.data.model.HolderConfigData.<init>(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.business.market.data.model.HolderConfigData))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.util.List<com.okinc.business.market.data.model.BannerConfigData>, com.okinc.business.market.data.model.HolderConfigData, java.util.List<java.lang.String>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.MarketConfigData.<init>(java.util.List, java.util.List, com.okinc.business.market.data.model.HolderConfigData, java.util.List):void type: THIS */
    public /* synthetic */ MarketConfigData(List list, List list2, HolderConfigData holderConfigData, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? new HolderConfigData((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : holderConfigData, (i & 8) != 0 ? null : list3);
    }
}
