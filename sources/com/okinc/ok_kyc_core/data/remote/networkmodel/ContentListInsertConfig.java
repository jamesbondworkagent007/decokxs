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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ContentListInsertConfig {
    private final JsonArray items;
    private final InsertPosition position;
    private final int targetContainerIndex;
    private final List<ContainerPathNode> targetContainerPath;
    private final String targetContainerType;
    private final Integer targetIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ContainerPathNode$$serializer.INSTANCE), InsertPosition.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListInsertConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentListInsertConfig copy$default(ContentListInsertConfig contentListInsertConfig, String str, int i, List list, InsertPosition insertPosition, Integer num, JsonArray jsonArray, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contentListInsertConfig.targetContainerType;
        }
        if ((i2 & 2) != 0) {
            i = contentListInsertConfig.targetContainerIndex;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = contentListInsertConfig.targetContainerPath;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            insertPosition = contentListInsertConfig.position;
        }
        InsertPosition insertPosition2 = insertPosition;
        if ((i2 & 16) != 0) {
            num = contentListInsertConfig.targetIndex;
        }
        Integer num2 = num;
        if ((i2 & 32) != 0) {
            jsonArray = contentListInsertConfig.items;
        }
        return contentListInsertConfig.copy(str, i3, list2, insertPosition2, num2, jsonArray);
    }

    @SerialName("targetContainerType")
    public static /* synthetic */ void getTargetContainerType$annotations() {
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
    public final InsertPosition component4() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component6() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentListInsertConfig copy(@NotNull String str, int i, List<ContainerPathNode> list, @NotNull InsertPosition insertPosition, Integer num, @NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(insertPosition, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new ContentListInsertConfig(str, i, list, insertPosition, num, jsonArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentListInsertConfig)) {
            return false;
        }
        ContentListInsertConfig contentListInsertConfig = (ContentListInsertConfig) obj;
        return Intrinsics.EZpvd((Object) this.targetContainerType, (Object) contentListInsertConfig.targetContainerType) && this.targetContainerIndex == contentListInsertConfig.targetContainerIndex && Intrinsics.EZpvd(this.targetContainerPath, contentListInsertConfig.targetContainerPath) && this.position == contentListInsertConfig.position && Intrinsics.EZpvd(this.targetIndex, contentListInsertConfig.targetIndex) && Intrinsics.EZpvd(this.items, contentListInsertConfig.items);
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
    public final Integer getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.targetContainerType.hashCode();
        int iHashCode2 = Integer.hashCode(this.targetContainerIndex);
        List<ContainerPathNode> list = this.targetContainerPath;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = this.position.hashCode();
        Integer num = this.targetIndex;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentListInsertConfig(targetContainerType=" + this.targetContainerType + ", targetContainerIndex=" + this.targetContainerIndex + ", targetContainerPath=" + this.targetContainerPath + ", position=" + this.position + ", targetIndex=" + this.targetIndex + ", items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListInsertConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentListInsertConfig> serializer() {
            return ContentListInsertConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentListInsertConfig(int i, String str, int i2, List list, InsertPosition insertPosition, Integer num, JsonArray jsonArray, SerializationConstructorMarker serializationConstructorMarker) {
        if (33 != (i & 33)) {
            PluginExceptionsKt.throwMissingFieldException(i, 33, ContentListInsertConfig$$serializer.INSTANCE.getDescriptor());
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
        if ((i & 8) == 0) {
            this.position = InsertPosition.Bottom;
        } else {
            this.position = insertPosition;
        }
        if ((i & 16) == 0) {
            this.targetIndex = null;
        } else {
            this.targetIndex = num;
        }
        this.items = jsonArray;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ContentListInsertConfig contentListInsertConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, contentListInsertConfig.targetContainerType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contentListInsertConfig.targetContainerIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, contentListInsertConfig.targetContainerIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || contentListInsertConfig.targetContainerPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], contentListInsertConfig.targetContainerPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || contentListInsertConfig.position != InsertPosition.Bottom) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], contentListInsertConfig.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contentListInsertConfig.targetIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, contentListInsertConfig.targetIndex);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, JsonArraySerializer.INSTANCE, contentListInsertConfig.items);
    }

    public ContentListInsertConfig(@NotNull String str, int i, List<ContainerPathNode> list, @NotNull InsertPosition insertPosition, Integer num, @NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(insertPosition, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.targetContainerType = str;
        this.targetContainerIndex = i;
        this.targetContainerPath = list;
        this.position = insertPosition;
        this.targetIndex = num;
        this.items = jsonArray;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition:0x0014: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition:0x0012: SGET  A[WRAPPED] (LINE:5300) com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition.Bottom com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition) : (r11v0 com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (r13v0 kotlinx.serialization.json.JsonArray)
 A[MD:(java.lang.String, int, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ContainerPathNode>, com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition, java.lang.Integer, kotlinx.serialization.json.JsonArray):void (m)] (LINE:5295) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListInsertConfig.<init>(java.lang.String, int, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition, java.lang.Integer, kotlinx.serialization.json.JsonArray):void type: THIS */
    public /* synthetic */ ContentListInsertConfig(String str, int i, List list, InsertPosition insertPosition, Integer num, JsonArray jsonArray, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? InsertPosition.Bottom : insertPosition, (i2 & 16) != 0 ? null : num, jsonArray);
    }
}
