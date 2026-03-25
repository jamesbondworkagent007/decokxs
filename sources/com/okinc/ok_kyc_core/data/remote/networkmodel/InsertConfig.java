package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InsertConfig {
    private final JsonArray items;
    private final InsertPosition position;
    private final Integer targetContainerIndex;
    private final List<ContainerPathNode> targetContainerPath;
    private final String targetContainerType;
    private final Integer targetIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {InsertPosition.Companion.serializer(), null, null, null, new ArrayListSerializer(ContainerPathNode$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InsertConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsertConfig copy$default(InsertConfig insertConfig, InsertPosition insertPosition, Integer num, String str, Integer num2, List list, JsonArray jsonArray, int i, Object obj) {
        if ((i & 1) != 0) {
            insertPosition = insertConfig.position;
        }
        if ((i & 2) != 0) {
            num = insertConfig.targetIndex;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str = insertConfig.targetContainerType;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            num2 = insertConfig.targetContainerIndex;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            list = insertConfig.targetContainerPath;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            jsonArray = insertConfig.items;
        }
        return insertConfig.copy(insertPosition, num3, str2, num4, list2, jsonArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InsertPosition component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.targetContainerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.targetContainerIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContainerPathNode> component5() {
        return this.targetContainerPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component6() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InsertConfig copy(@NotNull InsertPosition insertPosition, Integer num, String str, Integer num2, List<ContainerPathNode> list, @NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(insertPosition, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new InsertConfig(insertPosition, num, str, num2, list, jsonArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertConfig)) {
            return false;
        }
        InsertConfig insertConfig = (InsertConfig) obj;
        return this.position == insertConfig.position && Intrinsics.EZpvd(this.targetIndex, insertConfig.targetIndex) && Intrinsics.EZpvd((Object) this.targetContainerType, (Object) insertConfig.targetContainerType) && Intrinsics.EZpvd(this.targetContainerIndex, insertConfig.targetContainerIndex) && Intrinsics.EZpvd(this.targetContainerPath, insertConfig.targetContainerPath) && Intrinsics.EZpvd(this.items, insertConfig.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InsertPosition getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTargetContainerIndex() {
        return this.targetContainerIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContainerPathNode> getTargetContainerPath() {
        return this.targetContainerPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetContainerType() {
        return this.targetContainerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.position.hashCode();
        Integer num = this.targetIndex;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.targetContainerType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num2 = this.targetContainerIndex;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        List<ContainerPathNode> list = this.targetContainerPath;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InsertConfig(position=" + this.position + ", targetIndex=" + this.targetIndex + ", targetContainerType=" + this.targetContainerType + ", targetContainerIndex=" + this.targetContainerIndex + ", targetContainerPath=" + this.targetContainerPath + ", items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InsertConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InsertConfig> serializer() {
            return InsertConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InsertConfig(int i, InsertPosition insertPosition, Integer num, String str, Integer num2, List list, JsonArray jsonArray, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, InsertConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.position = (i & 1) == 0 ? InsertPosition.Bottom : insertPosition;
        if ((i & 2) == 0) {
            this.targetIndex = null;
        } else {
            this.targetIndex = num;
        }
        if ((i & 4) == 0) {
            this.targetContainerType = null;
        } else {
            this.targetContainerType = str;
        }
        if ((i & 8) == 0) {
            this.targetContainerIndex = null;
        } else {
            this.targetContainerIndex = num2;
        }
        if ((i & 16) == 0) {
            this.targetContainerPath = null;
        } else {
            this.targetContainerPath = list;
        }
        this.items = jsonArray;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InsertConfig insertConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || insertConfig.position != InsertPosition.Bottom) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], insertConfig.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || insertConfig.targetIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, insertConfig.targetIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || insertConfig.targetContainerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, insertConfig.targetContainerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || insertConfig.targetContainerIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, insertConfig.targetContainerIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || insertConfig.targetContainerPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], insertConfig.targetContainerPath);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, JsonArraySerializer.INSTANCE, insertConfig.items);
    }

    public InsertConfig(@NotNull InsertPosition insertPosition, Integer num, String str, Integer num2, List<ContainerPathNode> list, @NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(insertPosition, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.position = insertPosition;
        this.targetIndex = num;
        this.targetContainerType = str;
        this.targetContainerIndex = num2;
        this.targetContainerPath = list;
        this.items = jsonArray;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition:0x0004: SGET  A[WRAPPED] (LINE:5285) com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition.Bottom com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition) : (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (r13v0 kotlinx.serialization.json.JsonArray)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ContainerPathNode>, kotlinx.serialization.json.JsonArray):void (m)] (LINE:5284) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InsertConfig.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.List, kotlinx.serialization.json.JsonArray):void type: THIS */
    public /* synthetic */ InsertConfig(InsertPosition insertPosition, Integer num, String str, Integer num2, List list, JsonArray jsonArray, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InsertPosition.Bottom : insertPosition, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : list, jsonArray);
    }
}
