package com.okinc.okimcore.model.remote;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AddMembersResponse {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, List<String>> failed;
    private final Integer result;
    private final List<String> successList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddMembersResponse() {
        this((Integer) null, (Map) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.AddMembersResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddMembersResponse copy$default(AddMembersResponse addMembersResponse, Integer num, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = addMembersResponse.result;
        }
        if ((i & 2) != 0) {
            map = addMembersResponse.failed;
        }
        if ((i & 4) != 0) {
            list = addMembersResponse.successList;
        }
        return addMembersResponse.copy(num, map, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> component2() {
        return this.failed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.successList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddMembersResponse copy(Integer num, Map<String, ? extends List<String>> map, List<String> list) {
        return new AddMembersResponse(num, map, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddMembersResponse)) {
            return false;
        }
        AddMembersResponse addMembersResponse = (AddMembersResponse) obj;
        return Intrinsics.EZpvd(this.result, addMembersResponse.result) && Intrinsics.EZpvd(this.failed, addMembersResponse.failed) && Intrinsics.EZpvd(this.successList, addMembersResponse.successList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> getFailed() {
        return this.failed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSuccessList() {
        return this.successList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.result;
        int iHashCode = num == null ? 0 : num.hashCode();
        Map<String, List<String>> map = this.failed;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        List<String> list = this.successList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddMembersResponse(result=" + this.result + ", failed=" + this.failed + ", successList=" + this.successList + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.AddMembersResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddMembersResponse> serializer() {
            return AddMembersResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer))), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ AddMembersResponse(int i, Integer num, Map map, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.result = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.failed = null;
        } else {
            this.failed = map;
        }
        if ((i & 4) == 0) {
            this.successList = null;
        } else {
            this.successList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(AddMembersResponse addMembersResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = addMembersResponse.result) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, addMembersResponse.result);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addMembersResponse.failed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], addMembersResponse.failed);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && addMembersResponse.successList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], addMembersResponse.successList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public AddMembersResponse(Integer num, Map<String, ? extends List<String>> map, List<String> list) {
        this.result = num;
        this.failed = map;
        this.successList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.List<java.lang.String>):void (m)] (LINE:79) call: com.okinc.okimcore.model.remote.AddMembersResponse.<init>(java.lang.Integer, java.util.Map, java.util.List):void type: THIS */
    public /* synthetic */ AddMembersResponse(Integer num, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list);
    }
}
