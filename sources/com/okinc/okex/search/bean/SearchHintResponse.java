package com.okinc.okex.search.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchHintResponse {
    private final List<SearchArticleBean> articleHints;
    private final List<SearchIntentHint> intentHints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SearchIntentHint$$serializer.INSTANCE), new ArrayListSerializer(SearchArticleBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchHintResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.search.bean.SearchHintResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHintResponse copy$default(SearchHintResponse searchHintResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchHintResponse.intentHints;
        }
        if ((i & 2) != 0) {
            list2 = searchHintResponse.articleHints;
        }
        return searchHintResponse.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchIntentHint> component1() {
        return this.intentHints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchArticleBean> component2() {
        return this.articleHints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchHintResponse copy(List<SearchIntentHint> list, List<SearchArticleBean> list2) {
        return new SearchHintResponse(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHintResponse)) {
            return false;
        }
        SearchHintResponse searchHintResponse = (SearchHintResponse) obj;
        return Intrinsics.EZpvd(this.intentHints, searchHintResponse.intentHints) && Intrinsics.EZpvd(this.articleHints, searchHintResponse.articleHints);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchArticleBean> getArticleHints() {
        return this.articleHints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchIntentHint> getIntentHints() {
        return this.intentHints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SearchIntentHint> list = this.intentHints;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<SearchArticleBean> list2 = this.articleHints;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchHintResponse(intentHints=" + this.intentHints + ", articleHints=" + this.articleHints + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchHintResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchHintResponse> serializer() {
            return SearchHintResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchHintResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.intentHints = null;
        } else {
            this.intentHints = list;
        }
        if ((i & 2) == 0) {
            this.articleHints = null;
        } else {
            this.articleHints = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchHintResponse searchHintResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchHintResponse.intentHints != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], searchHintResponse.intentHints);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && searchHintResponse.articleHints == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], searchHintResponse.articleHints);
    }

    public SearchHintResponse(List<SearchIntentHint> list, List<SearchArticleBean> list2) {
        this.intentHints = list;
        this.articleHints = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okex.search.bean.SearchIntentHint>, java.util.List<com.okinc.okex.search.bean.SearchArticleBean>):void (m)] (LINE:8) call: com.okinc.okex.search.bean.SearchHintResponse.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SearchHintResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
