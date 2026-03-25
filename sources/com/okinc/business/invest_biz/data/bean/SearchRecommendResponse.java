package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SearchRecommendResponse {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<InvestSearchData> platformList;
    public final List<InvestSearchData> tokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchRecommendResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.SearchRecommendResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchRecommendResponse copy$default(SearchRecommendResponse searchRecommendResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchRecommendResponse.platformList;
        }
        if ((i & 2) != 0) {
            list2 = searchRecommendResponse.tokenList;
        }
        return searchRecommendResponse.copydefault(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSearchData> AEQbTJ() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSearchData> OLrzqt() {
        return this.platformList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchRecommendResponse copydefault(@NotNull List<InvestSearchData> list, @NotNull List<InvestSearchData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SearchRecommendResponse(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRecommendResponse)) {
            return false;
        }
        SearchRecommendResponse searchRecommendResponse = (SearchRecommendResponse) obj;
        return Intrinsics.EZpvd(this.platformList, searchRecommendResponse.platformList) && Intrinsics.EZpvd(this.tokenList, searchRecommendResponse.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.platformList.hashCode() * 31) + this.tokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchRecommendResponse(platformList=" + this.platformList + ", tokenList=" + this.tokenList + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SearchRecommendResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchRecommendResponse> serializer() {
            return SearchRecommendResponse$$serializer.INSTANCE;
        }
    }

    static {
        InvestSearchData$$serializer investSearchData$$serializer = InvestSearchData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(investSearchData$$serializer), new ArrayListSerializer(investSearchData$$serializer)};
    }

    public /* synthetic */ SearchRecommendResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.platformList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.tokenList = yDY.AhwBna();
        } else {
            this.tokenList = list2;
        }
    }

    public static final /* synthetic */ void copydefault(SearchRecommendResponse searchRecommendResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(searchRecommendResponse.platformList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], searchRecommendResponse.platformList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(searchRecommendResponse.tokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], searchRecommendResponse.tokenList);
    }

    public SearchRecommendResponse(@NotNull List<InvestSearchData> list, @NotNull List<InvestSearchData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.platformList = list;
        this.tokenList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:521)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:523)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestSearchData>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestSearchData>):void (m)] (LINE:519) call: com.okinc.business.invest_biz.data.bean.SearchRecommendResponse.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SearchRecommendResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
