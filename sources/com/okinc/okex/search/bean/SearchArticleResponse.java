package com.okinc.okex.search.bean;

import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.GetSupportRatingBean$$serializer;
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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchArticleResponse {
    private final List<SearchArticleBean> list;
    private final Integer pageNum;
    private final Integer pageSize;
    private final GetSupportRatingBean rating;
    private final Integer startIndex;
    private final Integer total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SearchArticleBean$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchArticleResponse() {
        this((List) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (GetSupportRatingBean) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.search.bean.SearchArticleResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchArticleResponse copy$default(SearchArticleResponse searchArticleResponse, List list, Integer num, Integer num2, Integer num3, Integer num4, GetSupportRatingBean getSupportRatingBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchArticleResponse.list;
        }
        if ((i & 2) != 0) {
            num = searchArticleResponse.startIndex;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = searchArticleResponse.pageNum;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            num3 = searchArticleResponse.pageSize;
        }
        Integer num7 = num3;
        if ((i & 16) != 0) {
            num4 = searchArticleResponse.total;
        }
        Integer num8 = num4;
        if ((i & 32) != 0) {
            getSupportRatingBean = searchArticleResponse.rating;
        }
        return searchArticleResponse.copy(list, num5, num6, num7, num8, getSupportRatingBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchArticleBean> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.startIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean component6() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchArticleResponse copy(List<SearchArticleBean> list, Integer num, Integer num2, Integer num3, Integer num4, GetSupportRatingBean getSupportRatingBean) {
        return new SearchArticleResponse(list, num, num2, num3, num4, getSupportRatingBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchArticleResponse)) {
            return false;
        }
        SearchArticleResponse searchArticleResponse = (SearchArticleResponse) obj;
        return Intrinsics.EZpvd(this.list, searchArticleResponse.list) && Intrinsics.EZpvd(this.startIndex, searchArticleResponse.startIndex) && Intrinsics.EZpvd(this.pageNum, searchArticleResponse.pageNum) && Intrinsics.EZpvd(this.pageSize, searchArticleResponse.pageSize) && Intrinsics.EZpvd(this.total, searchArticleResponse.total) && Intrinsics.EZpvd(this.rating, searchArticleResponse.rating);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchArticleBean> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean getRating() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStartIndex() {
        return this.startIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SearchArticleBean> list = this.list;
        int iHashCode = list == null ? 0 : list.hashCode();
        Integer num = this.startIndex;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.pageNum;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.pageSize;
        int iHashCode4 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.total;
        int iHashCode5 = num4 == null ? 0 : num4.hashCode();
        GetSupportRatingBean getSupportRatingBean = this.rating;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (getSupportRatingBean != null ? getSupportRatingBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchArticleResponse(list=" + this.list + ", startIndex=" + this.startIndex + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ", rating=" + this.rating + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchArticleResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchArticleResponse> serializer() {
            return SearchArticleResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchArticleResponse(int i, List list, Integer num, Integer num2, Integer num3, Integer num4, GetSupportRatingBean getSupportRatingBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.list = null;
        } else {
            this.list = list;
        }
        if ((i & 2) == 0) {
            this.startIndex = null;
        } else {
            this.startIndex = num;
        }
        if ((i & 4) == 0) {
            this.pageNum = null;
        } else {
            this.pageNum = num2;
        }
        if ((i & 8) == 0) {
            this.pageSize = null;
        } else {
            this.pageSize = num3;
        }
        if ((i & 16) == 0) {
            this.total = null;
        } else {
            this.total = num4;
        }
        if ((i & 32) == 0) {
            this.rating = null;
        } else {
            this.rating = getSupportRatingBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchArticleResponse searchArticleResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchArticleResponse.list != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], searchArticleResponse.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchArticleResponse.startIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, searchArticleResponse.startIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || searchArticleResponse.pageNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, searchArticleResponse.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || searchArticleResponse.pageSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, searchArticleResponse.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || searchArticleResponse.total != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, searchArticleResponse.total);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && searchArticleResponse.rating == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, GetSupportRatingBean$$serializer.INSTANCE, searchArticleResponse.rating);
    }

    public SearchArticleResponse(List<SearchArticleBean> list, Integer num, Integer num2, Integer num3, Integer num4, GetSupportRatingBean getSupportRatingBean) {
        this.list = list;
        this.startIndex = num;
        this.pageNum = num2;
        this.pageSize = num3;
        this.total = num4;
        this.rating = getSupportRatingBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean) : (r11v0 com.okinc.okex.rating.bean.GetSupportRatingBean))
 A[MD:(java.util.List<com.okinc.okex.search.bean.SearchArticleBean>, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okex.rating.bean.GetSupportRatingBean):void (m)] (LINE:10) call: com.okinc.okex.search.bean.SearchArticleResponse.<init>(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.okex.rating.bean.GetSupportRatingBean):void type: THIS */
    public /* synthetic */ SearchArticleResponse(List list, Integer num, Integer num2, Integer num3, Integer num4, GetSupportRatingBean getSupportRatingBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : getSupportRatingBean);
    }
}
