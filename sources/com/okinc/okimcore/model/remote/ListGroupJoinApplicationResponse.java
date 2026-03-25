package com.okinc.okimcore.model.remote;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ListGroupJoinApplicationResponse {
    private final List<GroupJoinApplicationResponse> items;
    private final Integer pageSize;
    private final Integer totalItemCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(GroupJoinApplicationResponse$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ListGroupJoinApplicationResponse() {
        this((Integer) null, (Integer) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.ListGroupJoinApplicationResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListGroupJoinApplicationResponse copy$default(ListGroupJoinApplicationResponse listGroupJoinApplicationResponse, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = listGroupJoinApplicationResponse.pageSize;
        }
        if ((i & 2) != 0) {
            num2 = listGroupJoinApplicationResponse.totalItemCount;
        }
        if ((i & 4) != 0) {
            list = listGroupJoinApplicationResponse.items;
        }
        return listGroupJoinApplicationResponse.copy(num, num2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.totalItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupJoinApplicationResponse> component3() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListGroupJoinApplicationResponse copy(Integer num, Integer num2, @NotNull List<GroupJoinApplicationResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ListGroupJoinApplicationResponse(num, num2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListGroupJoinApplicationResponse)) {
            return false;
        }
        ListGroupJoinApplicationResponse listGroupJoinApplicationResponse = (ListGroupJoinApplicationResponse) obj;
        return Intrinsics.EZpvd(this.pageSize, listGroupJoinApplicationResponse.pageSize) && Intrinsics.EZpvd(this.totalItemCount, listGroupJoinApplicationResponse.totalItemCount) && Intrinsics.EZpvd(this.items, listGroupJoinApplicationResponse.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupJoinApplicationResponse> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotalItemCount() {
        return this.totalItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.pageSize;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.totalItemCount;
        return (((iHashCode * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListGroupJoinApplicationResponse(pageSize=" + this.pageSize + ", totalItemCount=" + this.totalItemCount + ", items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.ListGroupJoinApplicationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListGroupJoinApplicationResponse> serializer() {
            return ListGroupJoinApplicationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListGroupJoinApplicationResponse(int i, Integer num, Integer num2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pageSize = null;
        } else {
            this.pageSize = num;
        }
        if ((i & 2) == 0) {
            this.totalItemCount = null;
        } else {
            this.totalItemCount = num2;
        }
        if ((i & 4) == 0) {
            this.items = yDY.AhwBna();
        } else {
            this.items = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ListGroupJoinApplicationResponse listGroupJoinApplicationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || listGroupJoinApplicationResponse.pageSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, listGroupJoinApplicationResponse.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || listGroupJoinApplicationResponse.totalItemCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, listGroupJoinApplicationResponse.totalItemCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(listGroupJoinApplicationResponse.items, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], listGroupJoinApplicationResponse.items);
    }

    public ListGroupJoinApplicationResponse(Integer num, Integer num2, @NotNull List<GroupJoinApplicationResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.pageSize = num;
        this.totalItemCount = num2;
        this.items = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r4v0 java.util.List))
 A[MD:(java.lang.Integer, java.lang.Integer, java.util.List<com.okinc.okimcore.model.remote.GroupJoinApplicationResponse>):void (m)] (LINE:47) call: com.okinc.okimcore.model.remote.ListGroupJoinApplicationResponse.<init>(java.lang.Integer, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ ListGroupJoinApplicationResponse(Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
