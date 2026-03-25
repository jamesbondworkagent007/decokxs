package com.okinc.business.invest_biz.data.usecase;

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
public final class SearchKeywordRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<Integer> platformIds;
    public final List<Integer> tokenIds;
    public final int tokenSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchKeywordRequest() {
        this((List) null, (List) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.usecase.SearchKeywordRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchKeywordRequest copy$default(SearchKeywordRequest searchKeywordRequest, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = searchKeywordRequest.platformIds;
        }
        if ((i2 & 2) != 0) {
            list2 = searchKeywordRequest.tokenIds;
        }
        if ((i2 & 4) != 0) {
            i = searchKeywordRequest.tokenSize;
        }
        return searchKeywordRequest.copydefault(list, list2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchKeywordRequest copydefault(@NotNull List<Integer> list, @NotNull List<Integer> list2, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SearchKeywordRequest(list, list2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchKeywordRequest)) {
            return false;
        }
        SearchKeywordRequest searchKeywordRequest = (SearchKeywordRequest) obj;
        return Intrinsics.EZpvd(this.platformIds, searchKeywordRequest.platformIds) && Intrinsics.EZpvd(this.tokenIds, searchKeywordRequest.tokenIds) && this.tokenSize == searchKeywordRequest.tokenSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.platformIds.hashCode() * 31) + this.tokenIds.hashCode()) * 31) + Integer.hashCode(this.tokenSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchKeywordRequest(platformIds=" + this.platformIds + ", tokenIds=" + this.tokenIds + ", tokenSize=" + this.tokenSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.usecase.SearchKeywordRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchKeywordRequest> serializer() {
            return SearchKeywordRequest$$serializer.INSTANCE;
        }
    }

    static {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), null};
    }

    public /* synthetic */ SearchKeywordRequest(int i, List list, List list2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.platformIds = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.tokenIds = yDY.AhwBna();
        } else {
            this.tokenIds = list2;
        }
        if ((i & 4) == 0) {
            this.tokenSize = 0;
        } else {
            this.tokenSize = i2;
        }
    }

    public static final /* synthetic */ void OLrzqt(SearchKeywordRequest searchKeywordRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(searchKeywordRequest.platformIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], searchKeywordRequest.platformIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(searchKeywordRequest.tokenIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], searchKeywordRequest.tokenIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && searchKeywordRequest.tokenSize == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, searchKeywordRequest.tokenSize);
    }

    public SearchKeywordRequest(@NotNull List<Integer> list, @NotNull List<Integer> list2, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.platformIds = list;
        this.tokenIds = list2;
        this.tokenSize = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r2v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>, int):void (m)] (LINE:17) call: com.okinc.business.invest_biz.data.usecase.SearchKeywordRequest.<init>(java.util.List, java.util.List, int):void type: THIS */
    public /* synthetic */ SearchKeywordRequest(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? yDY.AhwBna() : list, (i2 & 2) != 0 ? yDY.AhwBna() : list2, (i2 & 4) != 0 ? 0 : i);
    }
}
