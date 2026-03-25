package com.okinc.okimcore.model.remote;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreateBroadcastChannelRequest {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int SOURCE_TYPE_AFFILIATE = 2;
    public static final int SOURCE_TYPE_IM = 0;
    public static final int SOURCE_TYPE_P2P = 1;
    private final JsonObject extra;
    private final List<Long> groupIds;
    private final GroupScenarioType scenarioType;
    private final int sourceType;
    private final List<Long> userIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateBroadcastChannelRequest copy$default(CreateBroadcastChannelRequest createBroadcastChannelRequest, int i, List list, List list2, GroupScenarioType groupScenarioType, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createBroadcastChannelRequest.sourceType;
        }
        if ((i2 & 2) != 0) {
            list = createBroadcastChannelRequest.userIds;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            list2 = createBroadcastChannelRequest.groupIds;
        }
        List list4 = list2;
        if ((i2 & 8) != 0) {
            groupScenarioType = createBroadcastChannelRequest.scenarioType;
        }
        GroupScenarioType groupScenarioType2 = groupScenarioType;
        if ((i2 & 16) != 0) {
            jsonObject = createBroadcastChannelRequest.extra;
        }
        return createBroadcastChannelRequest.copy(i, list3, list4, groupScenarioType2, jsonObject);
    }

    @SerialName(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR)
    public static /* synthetic */ void getExtra$annotations() {
    }

    @SerialName("groupIds")
    public static /* synthetic */ void getGroupIds$annotations() {
    }

    @SerialName("scenarioType")
    public static /* synthetic */ void getScenarioType$annotations() {
    }

    @SerialName("sourceType")
    public static /* synthetic */ void getSourceType$annotations() {
    }

    @SerialName("userUids")
    public static /* synthetic */ void getUserIds$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.userIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component3() {
        return this.groupIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType component4() {
        return this.scenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component5() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateBroadcastChannelRequest copy(int i, List<Long> list, List<Long> list2, @NotNull GroupScenarioType groupScenarioType, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new CreateBroadcastChannelRequest(i, list, list2, groupScenarioType, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateBroadcastChannelRequest)) {
            return false;
        }
        CreateBroadcastChannelRequest createBroadcastChannelRequest = (CreateBroadcastChannelRequest) obj;
        return this.sourceType == createBroadcastChannelRequest.sourceType && Intrinsics.EZpvd(this.userIds, createBroadcastChannelRequest.userIds) && Intrinsics.EZpvd(this.groupIds, createBroadcastChannelRequest.groupIds) && this.scenarioType == createBroadcastChannelRequest.scenarioType && Intrinsics.EZpvd(this.extra, createBroadcastChannelRequest.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getGroupIds() {
        return this.groupIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType getScenarioType() {
        return this.scenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getUserIds() {
        return this.userIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.sourceType);
        List<Long> list = this.userIds;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<Long> list2 = this.groupIds;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.scenarioType.hashCode()) * 31) + this.extra.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateBroadcastChannelRequest(sourceType=" + this.sourceType + ", userIds=" + this.userIds + ", groupIds=" + this.groupIds + ", scenarioType=" + this.scenarioType + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ CreateBroadcastChannelRequest(int i, int i2, List list, List list2, GroupScenarioType groupScenarioType, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i & 25)) {
            PluginExceptionsKt.throwMissingFieldException(i, 25, CreateBroadcastChannelRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceType = i2;
        if ((i & 2) == 0) {
            this.userIds = null;
        } else {
            this.userIds = list;
        }
        if ((i & 4) == 0) {
            this.groupIds = null;
        } else {
            this.groupIds = list2;
        }
        this.scenarioType = groupScenarioType;
        this.extra = jsonObject;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CreateBroadcastChannelRequest createBroadcastChannelRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, createBroadcastChannelRequest.sourceType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || createBroadcastChannelRequest.userIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], createBroadcastChannelRequest.userIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || createBroadcastChannelRequest.groupIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], createBroadcastChannelRequest.groupIds);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], createBroadcastChannelRequest.scenarioType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, JsonObjectSerializer.INSTANCE, createBroadcastChannelRequest.extra);
    }

    public CreateBroadcastChannelRequest(int i, List<Long> list, List<Long> list2, @NotNull GroupScenarioType groupScenarioType, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.sourceType = i;
        this.userIds = list;
        this.groupIds = list2;
        this.scenarioType = groupScenarioType;
        this.extra = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (r11v0 com.okinc.okimcore.model.remote.GroupScenarioType)
  (r12v0 kotlinx.serialization.json.JsonObject)
 A[MD:(int, java.util.List<java.lang.Long>, java.util.List<java.lang.Long>, com.okinc.okimcore.model.remote.GroupScenarioType, kotlinx.serialization.json.JsonObject):void (m)] (LINE:10) call: com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest.<init>(int, java.util.List, java.util.List, com.okinc.okimcore.model.remote.GroupScenarioType, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ CreateBroadcastChannelRequest(int i, List list, List list2, GroupScenarioType groupScenarioType, JsonObject jsonObject, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, groupScenarioType, jsonObject);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateBroadcastChannelRequest> serializer() {
            return CreateBroadcastChannelRequest$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer), GroupScenarioType.Companion.serializer(), null};
    }
}
