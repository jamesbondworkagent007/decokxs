package com.okinc.planet.domain.remote.dto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class TagList {
    public final List<ResponseCashTag> cashTagList;
    public final List<ResponseHashTag> hashTagList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ResponseCashTag$$serializer.INSTANCE), new ArrayListSerializer(ResponseHashTag$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagList() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.domain.remote.dto.TagList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagList copy$default(TagList tagList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tagList.cashTagList;
        }
        if ((i & 2) != 0) {
            list2 = tagList.hashTagList;
        }
        return tagList.KWHzl(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagList KWHzl(List<ResponseCashTag> list, List<ResponseHashTag> list2) {
        return new TagList(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagList)) {
            return false;
        }
        TagList tagList = (TagList) obj;
        return Intrinsics.EZpvd(this.cashTagList, tagList.cashTagList) && Intrinsics.EZpvd(this.hashTagList, tagList.hashTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ResponseCashTag> list = this.cashTagList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<ResponseHashTag> list2 = this.hashTagList;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagList(cashTagList=" + this.cashTagList + ", hashTagList=" + this.hashTagList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.TagList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagList> serializer() {
            return TagList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TagList(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cashTagList = null;
        } else {
            this.cashTagList = list;
        }
        if ((i & 2) == 0) {
            this.hashTagList = null;
        } else {
            this.hashTagList = list2;
        }
    }

    public static final /* synthetic */ void KWHzl(TagList tagList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tagList.cashTagList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tagList.cashTagList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && tagList.hashTagList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], tagList.hashTagList);
    }

    public TagList(List<ResponseCashTag> list, List<ResponseHashTag> list2) {
        this.cashTagList = list;
        this.hashTagList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.planet.domain.remote.dto.ResponseCashTag>, java.util.List<com.okinc.planet.domain.remote.dto.ResponseHashTag>):void (m)] (LINE:37) call: com.okinc.planet.domain.remote.dto.TagList.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TagList(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
