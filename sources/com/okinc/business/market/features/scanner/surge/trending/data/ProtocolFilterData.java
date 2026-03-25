package com.okinc.business.market.features.scanner.surge.trending.data;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class ProtocolFilterData {
    public static final KSerializer<Object>[] $childSerializers;
    public final String chainId;
    public final List<String> defaultProtocolIdList;
    public final List<String> protocolIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolFilterData() {
        this((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.scanner.surge.trending.data.ProtocolFilterData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolFilterData copy$default(ProtocolFilterData protocolFilterData, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocolFilterData.chainId;
        }
        if ((i & 2) != 0) {
            list = protocolFilterData.protocolIdList;
        }
        if ((i & 4) != 0) {
            list2 = protocolFilterData.defaultProtocolIdList;
        }
        return protocolFilterData.copydefault(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> EZpvd() {
        return this.defaultProtocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.protocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolFilterData copydefault(String str, List<String> list, List<String> list2) {
        return new ProtocolFilterData(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolFilterData)) {
            return false;
        }
        ProtocolFilterData protocolFilterData = (ProtocolFilterData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) protocolFilterData.chainId) && Intrinsics.EZpvd(this.protocolIdList, protocolFilterData.protocolIdList) && Intrinsics.EZpvd(this.defaultProtocolIdList, protocolFilterData.defaultProtocolIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.protocolIdList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.defaultProtocolIdList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolFilterData(chainId=" + this.chainId + ", protocolIdList=" + this.protocolIdList + ", defaultProtocolIdList=" + this.defaultProtocolIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.data.ProtocolFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolFilterData> serializer() {
            return ProtocolFilterData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ ProtocolFilterData(int i, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.protocolIdList = null;
        } else {
            this.protocolIdList = list;
        }
        if ((i & 4) == 0) {
            this.defaultProtocolIdList = null;
        } else {
            this.defaultProtocolIdList = list2;
        }
    }

    public static final /* synthetic */ void OLrzqt(ProtocolFilterData protocolFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || protocolFilterData.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, protocolFilterData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || protocolFilterData.protocolIdList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], protocolFilterData.protocolIdList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && protocolFilterData.defaultProtocolIdList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], protocolFilterData.defaultProtocolIdList);
    }

    public ProtocolFilterData(String str, List<String> list, List<String> list2) {
        this.chainId = str;
        this.protocolIdList = list;
        this.defaultProtocolIdList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:24) call: com.okinc.business.market.features.scanner.surge.trending.data.ProtocolFilterData.<init>(java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ProtocolFilterData(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
