package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupRecommendationResponse {
    private final List<GroupRecommendations> groupInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(GroupRecommendations$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupRecommendationResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.GroupRecommendationResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupRecommendationResponse copy$default(GroupRecommendationResponse groupRecommendationResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupRecommendationResponse.groupInfoList;
        }
        return groupRecommendationResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupRecommendations> component1() {
        return this.groupInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRecommendationResponse copy(List<GroupRecommendations> list) {
        return new GroupRecommendationResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupRecommendationResponse) && Intrinsics.EZpvd(this.groupInfoList, ((GroupRecommendationResponse) obj).groupInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupRecommendations> getGroupInfoList() {
        return this.groupInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<GroupRecommendations> list = this.groupInfoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupRecommendationResponse(groupInfoList=" + this.groupInfoList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupRecommendationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupRecommendationResponse> serializer() {
            return GroupRecommendationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupRecommendationResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupInfoList = null;
        } else {
            this.groupInfoList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupRecommendationResponse groupRecommendationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && groupRecommendationResponse.groupInfoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupRecommendationResponse.groupInfoList);
    }

    public GroupRecommendationResponse(List<GroupRecommendations> list) {
        this.groupInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okimcore.model.remote.GroupRecommendations>):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.GroupRecommendationResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ GroupRecommendationResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
