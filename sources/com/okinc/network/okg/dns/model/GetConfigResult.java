package com.okinc.network.okg.dns.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class GetConfigResult {
    private int category;
    private final String data;
    private final List<String> hosts;
    private final String name;
    private final Integer ttl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetConfigResult() {
        this((String) null, (Integer) null, (List) null, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.network.okg.dns.model.GetConfigResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetConfigResult copy$default(GetConfigResult getConfigResult, String str, Integer num, List list, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getConfigResult.data;
        }
        if ((i2 & 2) != 0) {
            num = getConfigResult.ttl;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            list = getConfigResult.hosts;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            i = getConfigResult.category;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = getConfigResult.name;
        }
        return getConfigResult.copy(str, num2, list2, i3, str2);
    }

    @SerialName("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @SerialName("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("hosts")
    public static /* synthetic */ void getHosts$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("TTL")
    public static /* synthetic */ void getTtl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.hosts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetConfigResult copy(String str, Integer num, List<String> list, int i, String str2) {
        return new GetConfigResult(str, num, list, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConfigResult)) {
            return false;
        }
        GetConfigResult getConfigResult = (GetConfigResult) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) getConfigResult.data) && Intrinsics.EZpvd(this.ttl, getConfigResult.ttl) && Intrinsics.EZpvd(this.hosts, getConfigResult.hosts) && this.category == getConfigResult.category && Intrinsics.EZpvd((Object) this.name, (Object) getConfigResult.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHosts() {
        return this.hosts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTtl() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.data;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.ttl;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        List<String> list = this.hosts;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = Integer.hashCode(this.category);
        String str2 = this.name;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(int i) {
        this.category = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetConfigResult(data=" + this.data + ", ttl=" + this.ttl + ", hosts=" + this.hosts + ", category=" + this.category + ", name=" + this.name + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.GetConfigResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetConfigResult> serializer() {
            return GetConfigResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetConfigResult(int i, String str, Integer num, List list, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = str;
        }
        if ((i & 2) == 0) {
            this.ttl = null;
        } else {
            this.ttl = num;
        }
        if ((i & 4) == 0) {
            this.hosts = null;
        } else {
            this.hosts = list;
        }
        if ((i & 8) == 0) {
            this.category = 0;
        } else {
            this.category = i2;
        }
        if ((i & 16) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(GetConfigResult getConfigResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getConfigResult.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, getConfigResult.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getConfigResult.ttl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, getConfigResult.ttl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getConfigResult.hosts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], getConfigResult.hosts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getConfigResult.category != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, getConfigResult.category);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getConfigResult.name == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, getConfigResult.name);
    }

    public GetConfigResult(String str, Integer num, List<String> list, int i, String str2) {
        this.data = str;
        this.ttl = num;
        this.hosts = list;
        this.category = i;
        this.name = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.util.List<java.lang.String>, int, java.lang.String):void (m)] (LINE:119) call: com.okinc.network.okg.dns.model.GetConfigResult.<init>(java.lang.String, java.lang.Integer, java.util.List, int, java.lang.String):void type: THIS */
    public /* synthetic */ GetConfigResult(String str, Integer num, List list, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2);
    }
}
