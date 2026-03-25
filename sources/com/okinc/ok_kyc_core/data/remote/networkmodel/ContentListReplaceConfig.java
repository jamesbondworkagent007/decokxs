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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ContentListReplaceConfig {
    private final JsonElement item;
    private final int targetContainerIndex;
    private final List<ContainerPathNode> targetContainerPath;
    private final String targetContainerType;
    private final int targetIndex;
    private final String targetType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ContainerPathNode$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListReplaceConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentListReplaceConfig copy$default(ContentListReplaceConfig contentListReplaceConfig, String str, int i, List list, String str2, int i2, JsonElement jsonElement, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = contentListReplaceConfig.targetContainerType;
        }
        if ((i3 & 2) != 0) {
            i = contentListReplaceConfig.targetContainerIndex;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            list = contentListReplaceConfig.targetContainerPath;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            str2 = contentListReplaceConfig.targetType;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            i2 = contentListReplaceConfig.targetIndex;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            jsonElement = contentListReplaceConfig.item;
        }
        return contentListReplaceConfig.copy(str, i4, list2, str3, i5, jsonElement);
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
    public final int component2() {
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
    public final ContentListReplaceConfig copy(@NotNull String str, int i, List<ContainerPathNode> list, @NotNull String str2, int i2, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new ContentListReplaceConfig(str, i, list, str2, i2, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentListReplaceConfig)) {
            return false;
        }
        ContentListReplaceConfig contentListReplaceConfig = (ContentListReplaceConfig) obj;
        return Intrinsics.EZpvd((Object) this.targetContainerType, (Object) contentListReplaceConfig.targetContainerType) && this.targetContainerIndex == contentListReplaceConfig.targetContainerIndex && Intrinsics.EZpvd(this.targetContainerPath, contentListReplaceConfig.targetContainerPath) && Intrinsics.EZpvd((Object) this.targetType, (Object) contentListReplaceConfig.targetType) && this.targetIndex == contentListReplaceConfig.targetIndex && Intrinsics.EZpvd(this.item, contentListReplaceConfig.item);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getItem() {
        return this.item;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetContainerIndex() {
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
        int iHashCode = this.targetContainerType.hashCode();
        int iHashCode2 = Integer.hashCode(this.targetContainerIndex);
        List<ContainerPathNode> list = this.targetContainerPath;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.targetType.hashCode()) * 31) + Integer.hashCode(this.targetIndex)) * 31) + this.item.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentListReplaceConfig(targetContainerType=" + this.targetContainerType + ", targetContainerIndex=" + this.targetContainerIndex + ", targetContainerPath=" + this.targetContainerPath + ", targetType=" + this.targetType + ", targetIndex=" + this.targetIndex + ", item=" + this.item + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListReplaceConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentListReplaceConfig> serializer() {
            return ContentListReplaceConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentListReplaceConfig(int i, String str, int i2, List list, String str2, int i3, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (41 != (i & 41)) {
            PluginExceptionsKt.throwMissingFieldException(i, 41, ContentListReplaceConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.targetContainerType = str;
        if ((i & 2) == 0) {
            this.targetContainerIndex = 0;
        } else {
            this.targetContainerIndex = i2;
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
            this.targetIndex = i3;
        }
        this.item = jsonElement;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ContentListReplaceConfig contentListReplaceConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, contentListReplaceConfig.targetContainerType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contentListReplaceConfig.targetContainerIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, contentListReplaceConfig.targetContainerIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || contentListReplaceConfig.targetContainerPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], contentListReplaceConfig.targetContainerPath);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, contentListReplaceConfig.targetType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contentListReplaceConfig.targetIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, contentListReplaceConfig.targetIndex);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, contentListReplaceConfig.item);
    }

    public ContentListReplaceConfig(@NotNull String str, int i, List<ContainerPathNode> list, @NotNull String str2, int i2, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.targetContainerType = str;
        this.targetContainerIndex = i;
        this.targetContainerPath = list;
        this.targetType = str2;
        this.targetIndex = i2;
        this.item = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (r13v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (r15v0 kotlinx.serialization.json.JsonElement)
 A[MD:(java.lang.String, int, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ContainerPathNode>, java.lang.String, int, kotlinx.serialization.json.JsonElement):void (m)] (LINE:5320) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListReplaceConfig.<init>(java.lang.String, int, java.util.List, java.lang.String, int, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ ContentListReplaceConfig(String str, int i, List list, String str2, int i2, JsonElement jsonElement, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : list, str2, (i3 & 16) != 0 ? 0 : i2, jsonElement);
    }
}
