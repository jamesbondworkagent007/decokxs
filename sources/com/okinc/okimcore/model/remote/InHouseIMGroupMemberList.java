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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InHouseIMGroupMemberList {
    private final List<InHouseIMGroupMemberInfo> items;
    private final int pageCount;
    private final int pageIndex;
    private final int pageSize;
    private final int totalItemCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(InHouseIMGroupMemberInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupMemberList() {
        this(0, 0, 0, 0, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okimcore.model.remote.InHouseIMGroupMemberList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InHouseIMGroupMemberList copy$default(InHouseIMGroupMemberList inHouseIMGroupMemberList, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = inHouseIMGroupMemberList.pageIndex;
        }
        if ((i5 & 2) != 0) {
            i2 = inHouseIMGroupMemberList.pageSize;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = inHouseIMGroupMemberList.pageCount;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = inHouseIMGroupMemberList.totalItemCount;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            list = inHouseIMGroupMemberList.items;
        }
        return inHouseIMGroupMemberList.copy(i, i6, i7, i8, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.totalItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMGroupMemberInfo> component5() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberList copy(int i, int i2, int i3, int i4, @NotNull List<InHouseIMGroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InHouseIMGroupMemberList(i, i2, i3, i4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupMemberList)) {
            return false;
        }
        InHouseIMGroupMemberList inHouseIMGroupMemberList = (InHouseIMGroupMemberList) obj;
        return this.pageIndex == inHouseIMGroupMemberList.pageIndex && this.pageSize == inHouseIMGroupMemberList.pageSize && this.pageCount == inHouseIMGroupMemberList.pageCount && this.totalItemCount == inHouseIMGroupMemberList.totalItemCount && Intrinsics.EZpvd(this.items, inHouseIMGroupMemberList.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMGroupMemberInfo> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageCount() {
        return this.pageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalItemCount() {
        return this.totalItemCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.pageIndex) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.pageCount)) * 31) + Integer.hashCode(this.totalItemCount)) * 31) + this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupMemberList(pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", pageCount=" + this.pageCount + ", totalItemCount=" + this.totalItemCount + ", items=" + this.items + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupMemberList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupMemberList> serializer() {
            return InHouseIMGroupMemberList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupMemberList(int i, int i2, int i3, int i4, int i5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pageIndex = 0;
        } else {
            this.pageIndex = i2;
        }
        if ((i & 2) == 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = i3;
        }
        if ((i & 4) == 0) {
            this.pageCount = 0;
        } else {
            this.pageCount = i4;
        }
        if ((i & 8) == 0) {
            this.totalItemCount = 0;
        } else {
            this.totalItemCount = i5;
        }
        if ((i & 16) == 0) {
            this.items = yDY.AhwBna();
        } else {
            this.items = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupMemberList inHouseIMGroupMemberList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMGroupMemberList.pageIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, inHouseIMGroupMemberList.pageIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMGroupMemberList.pageSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, inHouseIMGroupMemberList.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMGroupMemberList.pageCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, inHouseIMGroupMemberList.pageCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupMemberList.totalItemCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, inHouseIMGroupMemberList.totalItemCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(inHouseIMGroupMemberList.items, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], inHouseIMGroupMemberList.items);
    }

    public InHouseIMGroupMemberList(int i, int i2, int i3, int i4, @NotNull List<InHouseIMGroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.pageIndex = i;
        this.pageSize = i2;
        this.pageCount = i3;
        this.totalItemCount = i4;
        this.items = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:71)) : (r8v0 java.util.List))
 A[MD:(int, int, int, int, java.util.List<com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo>):void (m)] (LINE:66) call: com.okinc.okimcore.model.remote.InHouseIMGroupMemberList.<init>(int, int, int, int, java.util.List):void type: THIS */
    public /* synthetic */ InHouseIMGroupMemberList(int i, int i2, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? yDY.AhwBna() : list);
    }
}
