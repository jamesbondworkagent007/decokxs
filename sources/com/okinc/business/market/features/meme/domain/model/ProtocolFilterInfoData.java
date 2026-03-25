package com.okinc.business.market.features.meme.domain.model;

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
public final class ProtocolFilterInfoData {
    private static final KSerializer<Object>[] $childSerializers;
    private final String chainId;
    private final List<String> defaultProtocolIdList;
    private final List<String> protocolIdList;
    private final String rankType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolFilterInfoData() {
        this((String) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.domain.model.ProtocolFilterInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolFilterInfoData copy$default(ProtocolFilterInfoData protocolFilterInfoData, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocolFilterInfoData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = protocolFilterInfoData.rankType;
        }
        if ((i & 4) != 0) {
            list = protocolFilterInfoData.protocolIdList;
        }
        if ((i & 8) != 0) {
            list2 = protocolFilterInfoData.defaultProtocolIdList;
        }
        return protocolFilterInfoData.copy(str, str2, list, list2);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("defaultProtocolIdList")
    public static /* synthetic */ void getDefaultProtocolIdList$annotations() {
    }

    @SerialName("protocolIdList")
    public static /* synthetic */ void getProtocolIdList$annotations() {
    }

    @SerialName("rankType")
    public static /* synthetic */ void getRankType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.protocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.defaultProtocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolFilterInfoData copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new ProtocolFilterInfoData(str, str2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolFilterInfoData)) {
            return false;
        }
        ProtocolFilterInfoData protocolFilterInfoData = (ProtocolFilterInfoData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) protocolFilterInfoData.chainId) && Intrinsics.EZpvd((Object) this.rankType, (Object) protocolFilterInfoData.rankType) && Intrinsics.EZpvd(this.protocolIdList, protocolFilterInfoData.protocolIdList) && Intrinsics.EZpvd(this.defaultProtocolIdList, protocolFilterInfoData.defaultProtocolIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDefaultProtocolIdList() {
        return this.defaultProtocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getProtocolIdList() {
        return this.protocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRankType() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chainId.hashCode() * 31) + this.rankType.hashCode()) * 31) + this.protocolIdList.hashCode()) * 31) + this.defaultProtocolIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolFilterInfoData(chainId=" + this.chainId + ", rankType=" + this.rankType + ", protocolIdList=" + this.protocolIdList + ", defaultProtocolIdList=" + this.defaultProtocolIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.domain.model.ProtocolFilterInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolFilterInfoData> serializer() {
            return ProtocolFilterInfoData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ ProtocolFilterInfoData(int i, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.rankType = "";
        } else {
            this.rankType = str2;
        }
        if ((i & 4) == 0) {
            this.protocolIdList = yDY.AhwBna();
        } else {
            this.protocolIdList = list;
        }
        if ((i & 8) == 0) {
            this.defaultProtocolIdList = yDY.AhwBna();
        } else {
            this.defaultProtocolIdList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ProtocolFilterInfoData protocolFilterInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) protocolFilterInfoData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, protocolFilterInfoData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) protocolFilterInfoData.rankType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, protocolFilterInfoData.rankType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(protocolFilterInfoData.protocolIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], protocolFilterInfoData.protocolIdList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(protocolFilterInfoData.defaultProtocolIdList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], protocolFilterInfoData.defaultProtocolIdList);
    }

    public ProtocolFilterInfoData(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.chainId = str;
        this.rankType = str2;
        this.protocolIdList = list;
        this.defaultProtocolIdList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:28) call: com.okinc.business.market.features.meme.domain.model.ProtocolFilterInfoData.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ProtocolFilterInfoData(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2);
    }
}
