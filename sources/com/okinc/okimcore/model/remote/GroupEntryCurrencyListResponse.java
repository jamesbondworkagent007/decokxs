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
public final class GroupEntryCurrencyListResponse {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<GroupEntryCurrency> assetList;
    private final List<GroupEntryCurrency> tokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEntryCurrencyListResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.GroupEntryCurrencyListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupEntryCurrencyListResponse copy$default(GroupEntryCurrencyListResponse groupEntryCurrencyListResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupEntryCurrencyListResponse.assetList;
        }
        if ((i & 2) != 0) {
            list2 = groupEntryCurrencyListResponse.tokenList;
        }
        return groupEntryCurrencyListResponse.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupEntryCurrency> component1() {
        return this.assetList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupEntryCurrency> component2() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryCurrencyListResponse copy(List<GroupEntryCurrency> list, List<GroupEntryCurrency> list2) {
        return new GroupEntryCurrencyListResponse(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupEntryCurrencyListResponse)) {
            return false;
        }
        GroupEntryCurrencyListResponse groupEntryCurrencyListResponse = (GroupEntryCurrencyListResponse) obj;
        return Intrinsics.EZpvd(this.assetList, groupEntryCurrencyListResponse.assetList) && Intrinsics.EZpvd(this.tokenList, groupEntryCurrencyListResponse.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupEntryCurrency> getAssetList() {
        return this.assetList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupEntryCurrency> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<GroupEntryCurrency> list = this.assetList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<GroupEntryCurrency> list2 = this.tokenList;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEntryCurrencyListResponse(assetList=" + this.assetList + ", tokenList=" + this.tokenList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupEntryCurrencyListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupEntryCurrencyListResponse> serializer() {
            return GroupEntryCurrencyListResponse$$serializer.INSTANCE;
        }
    }

    static {
        GroupEntryCurrency$$serializer groupEntryCurrency$$serializer = GroupEntryCurrency$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(groupEntryCurrency$$serializer), new ArrayListSerializer(groupEntryCurrency$$serializer)};
    }

    public /* synthetic */ GroupEntryCurrencyListResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.assetList = null;
        } else {
            this.assetList = list;
        }
        if ((i & 2) == 0) {
            this.tokenList = null;
        } else {
            this.tokenList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupEntryCurrencyListResponse groupEntryCurrencyListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupEntryCurrencyListResponse.assetList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupEntryCurrencyListResponse.assetList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && groupEntryCurrencyListResponse.tokenList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupEntryCurrencyListResponse.tokenList);
    }

    public GroupEntryCurrencyListResponse(List<GroupEntryCurrency> list, List<GroupEntryCurrency> list2) {
        this.assetList = list;
        this.tokenList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okimcore.model.remote.GroupEntryCurrency>, java.util.List<com.okinc.okimcore.model.remote.GroupEntryCurrency>):void (m)] (LINE:97) call: com.okinc.okimcore.model.remote.GroupEntryCurrencyListResponse.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ GroupEntryCurrencyListResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
