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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SearchHeaderInfoResponse {
    public final List<SubTabsData> tabVoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SubTabsData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchHeaderInfoResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHeaderInfoResponse copy$default(SearchHeaderInfoResponse searchHeaderInfoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchHeaderInfoResponse.tabVoList;
        }
        return searchHeaderInfoResponse.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubTabsData> AEQbTJ() {
        return this.tabVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchHeaderInfoResponse OLrzqt(@NotNull List<SubTabsData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SearchHeaderInfoResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchHeaderInfoResponse) && Intrinsics.EZpvd(this.tabVoList, ((SearchHeaderInfoResponse) obj).tabVoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.tabVoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchHeaderInfoResponse(tabVoList=" + this.tabVoList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchHeaderInfoResponse> serializer() {
            return SearchHeaderInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchHeaderInfoResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tabVoList = yDY.AhwBna();
        } else {
            this.tabVoList = list;
        }
    }

    public static final /* synthetic */ void KWHzl(SearchHeaderInfoResponse searchHeaderInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(searchHeaderInfoResponse.tabVoList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], searchHeaderInfoResponse.tabVoList);
    }

    public SearchHeaderInfoResponse(@NotNull List<SubTabsData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tabVoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:515)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.SubTabsData>):void (m)] (LINE:513) call: com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SearchHeaderInfoResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
