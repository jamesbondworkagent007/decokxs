package com.okinc.business.market.data.model.watchlist;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class GroupSortingRequest {
    public final String accountId;
    public final List<Integer> groupIds;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupSortingRequest() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.watchlist.GroupSortingRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupSortingRequest copy$default(GroupSortingRequest groupSortingRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupSortingRequest.accountId;
        }
        if ((i & 2) != 0) {
            str2 = groupSortingRequest.walletAddress;
        }
        if ((i & 4) != 0) {
            list = groupSortingRequest.groupIds;
        }
        return groupSortingRequest.copydefault(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupSortingRequest copydefault(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GroupSortingRequest(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupSortingRequest)) {
            return false;
        }
        GroupSortingRequest groupSortingRequest = (GroupSortingRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) groupSortingRequest.accountId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) groupSortingRequest.walletAddress) && Intrinsics.EZpvd(this.groupIds, groupSortingRequest.groupIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.accountId.hashCode() * 31) + this.walletAddress.hashCode()) * 31) + this.groupIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupSortingRequest(accountId=" + this.accountId + ", walletAddress=" + this.walletAddress + ", groupIds=" + this.groupIds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.GroupSortingRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupSortingRequest> serializer() {
            return GroupSortingRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupSortingRequest(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
        if ((i & 4) == 0) {
            this.groupIds = yDY.AhwBna();
        } else {
            this.groupIds = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(GroupSortingRequest groupSortingRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) groupSortingRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, groupSortingRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) groupSortingRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, groupSortingRequest.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(groupSortingRequest.groupIds, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], groupSortingRequest.groupIds);
    }

    public GroupSortingRequest(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.walletAddress = str2;
        this.groupIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.watchlist.GroupSortingRequest.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ GroupSortingRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
