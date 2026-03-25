package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ReplaceConfig {
    private final JsonElement item;
    private final Integer targetContainerIndex;
    private final List<ContainerPathNode> targetContainerPath;
    private final String targetContainerType;
    private final int targetIndex;
    private final String targetType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ContainerPathNode$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.ReplaceConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReplaceConfig copy$default(ReplaceConfig replaceConfig, String str, Integer num, List list, String str2, int i, JsonElement jsonElement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = replaceConfig.targetContainerType;
        }
        if ((i2 & 2) != 0) {
            num = replaceConfig.targetContainerIndex;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            list = replaceConfig.targetContainerPath;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            str2 = replaceConfig.targetType;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            i = replaceConfig.targetIndex;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            jsonElement = replaceConfig.item;
        }
        return replaceConfig.copy(str, num2, list2, str3, i3, jsonElement);
    }

    @SerialName("targetContainerType")
    public static /* synthetic */ void getTargetContainerType$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getTargetType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.targetContainerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.targetContainerIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContainerPathNode> component3() {
        return this.targetContainerPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component6() {
        return this.item;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReplaceConfig copy(String str, Integer num, List<ContainerPathNode> list, @NotNull String str2, int i, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new ReplaceConfig(str, num, list, str2, i, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceConfig)) {
            return false;
        }
        ReplaceConfig replaceConfig = (ReplaceConfig) obj;
        return Intrinsics.EZpvd((Object) this.targetContainerType, (Object) replaceConfig.targetContainerType) && Intrinsics.EZpvd(this.targetContainerIndex, replaceConfig.targetContainerIndex) && Intrinsics.EZpvd(this.targetContainerPath, replaceConfig.targetContainerPath) && Intrinsics.EZpvd((Object) this.targetType, (Object) replaceConfig.targetType) && this.targetIndex == replaceConfig.targetIndex && Intrinsics.EZpvd(this.item, replaceConfig.item);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getItem() {
        return this.item;
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
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.targetContainerType;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.targetContainerIndex;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        List<ContainerPathNode> list = this.targetContainerPath;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.targetType.hashCode()) * 31) + Integer.hashCode(this.targetIndex)) * 31) + this.item.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReplaceConfig(targetContainerType=" + this.targetContainerType + ", targetContainerIndex=" + this.targetContainerIndex + ", targetContainerPath=" + this.targetContainerPath + ", targetType=" + this.targetType + ", targetIndex=" + this.targetIndex + ", item=" + this.item + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ReplaceConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReplaceConfig> serializer() {
            return ReplaceConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReplaceConfig(int i, String str, Integer num, List list, String str2, int i2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (40 != (i & 40)) {
            PluginExceptionsKt.throwMissingFieldException(i, 40, ReplaceConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.targetContainerType = null;
        } else {
            this.targetContainerType = str;
        }
        if ((i & 2) == 0) {
            this.targetContainerIndex = null;
        } else {
            this.targetContainerIndex = num;
        }
        if ((i & 4) == 0) {
            this.targetContainerPath = null;
        } else {
            this.targetContainerPath = list;
        }
        this.targetType = str2;
        if ((i & 16) == 0) {
            this.targetIndex = 0;
        } else {
            this.targetIndex = i2;
        }
        this.item = jsonElement;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ReplaceConfig replaceConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || replaceConfig.targetContainerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, replaceConfig.targetContainerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || replaceConfig.targetContainerIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, replaceConfig.targetContainerIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || replaceConfig.targetContainerPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], replaceConfig.targetContainerPath);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, replaceConfig.targetType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || replaceConfig.targetIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, replaceConfig.targetIndex);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, replaceConfig.item);
    }

    public ReplaceConfig(String str, Integer num, List<ContainerPathNode> list, @NotNull String str2, int i, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.targetContainerType = str;
        this.targetContainerIndex = num;
        this.targetContainerPath = list;
        this.targetType = str2;
        this.targetIndex = i;
        this.item = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (r13v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (r15v0 kotlinx.serialization.json.JsonElement)
 A[MD:(java.lang.String, java.lang.Integer, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ContainerPathNode>, java.lang.String, int, kotlinx.serialization.json.JsonElement):void (m)] (LINE:5307) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ReplaceConfig.<init>(java.lang.String, java.lang.Integer, java.util.List, java.lang.String, int, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ ReplaceConfig(String str, Integer num, List list, String str2, int i, JsonElement jsonElement, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : list, str2, (i2 & 16) != 0 ? 0 : i, jsonElement);
    }
}
