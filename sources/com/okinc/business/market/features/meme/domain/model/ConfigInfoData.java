package com.okinc.business.market.features.meme.domain.model;

import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ChainInfoData$$serializer;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class ConfigInfoData {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<ChainInfoData> chainInfos;
    private final List<ProtocolFilterInfoData> protocolFilterInfos;
    private final List<ProtocolInfoData> protocolInfos;
    private final List<RankInfoData> rankInfos;
    private final List<String> sameCarPriority;
    private final List<String> tagKeyInfos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConfigInfoData() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.meme.domain.model.ConfigInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigInfoData copy$default(ConfigInfoData configInfoData, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = configInfoData.chainInfos;
        }
        if ((i & 2) != 0) {
            list2 = configInfoData.protocolInfos;
        }
        List list7 = list2;
        if ((i & 4) != 0) {
            list3 = configInfoData.rankInfos;
        }
        List list8 = list3;
        if ((i & 8) != 0) {
            list4 = configInfoData.tagKeyInfos;
        }
        List list9 = list4;
        if ((i & 16) != 0) {
            list5 = configInfoData.protocolFilterInfos;
        }
        List list10 = list5;
        if ((i & 32) != 0) {
            list6 = configInfoData.sameCarPriority;
        }
        return configInfoData.copy(list, list7, list8, list9, list10, list6);
    }

    @SerialName("chainInfos")
    public static /* synthetic */ void getChainInfos$annotations() {
    }

    @SerialName("protocolFilterInfos")
    public static /* synthetic */ void getProtocolFilterInfos$annotations() {
    }

    @SerialName("protocolInfos")
    public static /* synthetic */ void getProtocolInfos$annotations() {
    }

    @SerialName("rankInfos")
    public static /* synthetic */ void getRankInfos$annotations() {
    }

    @SerialName("sameCarPriority")
    public static /* synthetic */ void getSameCarPriority$annotations() {
    }

    @SerialName("tagKeyInfos")
    public static /* synthetic */ void getTagKeyInfos$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfoData> component1() {
        return this.chainInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolInfoData> component2() {
        return this.protocolInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RankInfoData> component3() {
        return this.rankInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.tagKeyInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolFilterInfoData> component5() {
        return this.protocolFilterInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.sameCarPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfigInfoData copy(@NotNull List<ChainInfoData> list, @NotNull List<ProtocolInfoData> list2, @NotNull List<RankInfoData> list3, @NotNull List<String> list4, @NotNull List<ProtocolFilterInfoData> list5, @NotNull List<String> list6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        return new ConfigInfoData(list, list2, list3, list4, list5, list6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigInfoData)) {
            return false;
        }
        ConfigInfoData configInfoData = (ConfigInfoData) obj;
        return Intrinsics.EZpvd(this.chainInfos, configInfoData.chainInfos) && Intrinsics.EZpvd(this.protocolInfos, configInfoData.protocolInfos) && Intrinsics.EZpvd(this.rankInfos, configInfoData.rankInfos) && Intrinsics.EZpvd(this.tagKeyInfos, configInfoData.tagKeyInfos) && Intrinsics.EZpvd(this.protocolFilterInfos, configInfoData.protocolFilterInfos) && Intrinsics.EZpvd(this.sameCarPriority, configInfoData.sameCarPriority);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfoData> getChainInfos() {
        return this.chainInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolFilterInfoData> getProtocolFilterInfos() {
        return this.protocolFilterInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolInfoData> getProtocolInfos() {
        return this.protocolInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RankInfoData> getRankInfos() {
        return this.rankInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSameCarPriority() {
        return this.sameCarPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTagKeyInfos() {
        return this.tagKeyInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainInfos.hashCode() * 31) + this.protocolInfos.hashCode()) * 31) + this.rankInfos.hashCode()) * 31) + this.tagKeyInfos.hashCode()) * 31) + this.protocolFilterInfos.hashCode()) * 31) + this.sameCarPriority.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfigInfoData(chainInfos=" + this.chainInfos + ", protocolInfos=" + this.protocolInfos + ", rankInfos=" + this.rankInfos + ", tagKeyInfos=" + this.tagKeyInfos + ", protocolFilterInfos=" + this.protocolFilterInfos + ", sameCarPriority=" + this.sameCarPriority + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.domain.model.ConfigInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConfigInfoData> serializer() {
            return ConfigInfoData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(ChainInfoData$$serializer.INSTANCE), new ArrayListSerializer(ProtocolInfoData$$serializer.INSTANCE), new ArrayListSerializer(RankInfoData$$serializer.INSTANCE), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(ProtocolFilterInfoData$$serializer.INSTANCE), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ ConfigInfoData(int i, List list, List list2, List list3, List list4, List list5, List list6, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainInfos = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.protocolInfos = yDY.AhwBna();
        } else {
            this.protocolInfos = list2;
        }
        if ((i & 4) == 0) {
            this.rankInfos = yDY.AhwBna();
        } else {
            this.rankInfos = list3;
        }
        if ((i & 8) == 0) {
            this.tagKeyInfos = yDY.AhwBna();
        } else {
            this.tagKeyInfos = list4;
        }
        if ((i & 16) == 0) {
            this.protocolFilterInfos = yDY.AhwBna();
        } else {
            this.protocolFilterInfos = list5;
        }
        if ((i & 32) == 0) {
            this.sameCarPriority = yDY.AhwBna();
        } else {
            this.sameCarPriority = list6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [51=7] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ConfigInfoData configInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(configInfoData.chainInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], configInfoData.chainInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(configInfoData.protocolInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], configInfoData.protocolInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(configInfoData.rankInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], configInfoData.rankInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(configInfoData.tagKeyInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], configInfoData.tagKeyInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(configInfoData.protocolFilterInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], configInfoData.protocolFilterInfos);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(configInfoData.sameCarPriority, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], configInfoData.sameCarPriority);
    }

    public ConfigInfoData(@NotNull List<ChainInfoData> list, @NotNull List<ProtocolInfoData> list2, @NotNull List<RankInfoData> list3, @NotNull List<String> list4, @NotNull List<ProtocolFilterInfoData> list5, @NotNull List<String> list6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        this.chainInfos = list;
        this.protocolInfos = list2;
        this.rankInfos = list3;
        this.tagKeyInfos = list4;
        this.protocolFilterInfos = list5;
        this.sameCarPriority = list6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:55)) : (r5v0 java.util.List))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:57)) : (r6v0 java.util.List))
  (wrap:java.util.List:0x0019: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:59)) : (r7v0 java.util.List))
  (wrap:java.util.List:0x0022: TERNARY null = ((wrap:int:0x001a: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:61)) : (r8v0 java.util.List))
  (wrap:java.util.List:0x002b: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002c: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0030: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:65)) : (r10v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.common.ChainInfoData>, java.util.List<com.okinc.business.market.data.model.common.ProtocolInfoData>, java.util.List<com.okinc.business.market.features.meme.domain.model.RankInfoData>, java.util.List<java.lang.String>, java.util.List<com.okinc.business.market.features.meme.domain.model.ProtocolFilterInfoData>, java.util.List<java.lang.String>):void (m)] (LINE:53) call: com.okinc.business.market.features.meme.domain.model.ConfigInfoData.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ConfigInfoData(List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4, (i & 16) != 0 ? yDY.AhwBna() : list5, (i & 32) != 0 ? yDY.AhwBna() : list6);
    }
}
