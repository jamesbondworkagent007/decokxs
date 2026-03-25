package com.okinc.okex.center.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TopicSectionsResponse {
    private final List<TopicSection> list;
    private final GetSupportRatingBean rating;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TopicSection$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopicSectionsResponse() {
        this((List) null, (GetSupportRatingBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.TopicSectionsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicSectionsResponse copy$default(TopicSectionsResponse topicSectionsResponse, List list, GetSupportRatingBean getSupportRatingBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = topicSectionsResponse.list;
        }
        if ((i & 2) != 0) {
            getSupportRatingBean = topicSectionsResponse.rating;
        }
        return topicSectionsResponse.copy(list, getSupportRatingBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicSection> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean component2() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopicSectionsResponse copy(List<TopicSection> list, GetSupportRatingBean getSupportRatingBean) {
        return new TopicSectionsResponse(list, getSupportRatingBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicSectionsResponse)) {
            return false;
        }
        TopicSectionsResponse topicSectionsResponse = (TopicSectionsResponse) obj;
        return Intrinsics.EZpvd(this.list, topicSectionsResponse.list) && Intrinsics.EZpvd(this.rating, topicSectionsResponse.rating);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicSection> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean getRating() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<TopicSection> list = this.list;
        int iHashCode = list == null ? 0 : list.hashCode();
        GetSupportRatingBean getSupportRatingBean = this.rating;
        return (iHashCode * 31) + (getSupportRatingBean != null ? getSupportRatingBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopicSectionsResponse(list=" + this.list + ", rating=" + this.rating + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TopicSectionsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopicSectionsResponse> serializer() {
            return TopicSectionsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TopicSectionsResponse(int i, List list, GetSupportRatingBean getSupportRatingBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.list = null;
        } else {
            this.list = list;
        }
        if ((i & 2) == 0) {
            this.rating = null;
        } else {
            this.rating = getSupportRatingBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TopicSectionsResponse topicSectionsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || topicSectionsResponse.list != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], topicSectionsResponse.list);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && topicSectionsResponse.rating == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, GetSupportRatingBean$$serializer.INSTANCE, topicSectionsResponse.rating);
    }

    public TopicSectionsResponse(List<TopicSection> list, GetSupportRatingBean getSupportRatingBean) {
        this.list = list;
        this.rating = getSupportRatingBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean) : (r3v0 com.okinc.okex.rating.bean.GetSupportRatingBean))
 A[MD:(java.util.List<com.okinc.okex.center.bean.TopicSection>, com.okinc.okex.rating.bean.GetSupportRatingBean):void (m)] (LINE:12) call: com.okinc.okex.center.bean.TopicSectionsResponse.<init>(java.util.List, com.okinc.okex.rating.bean.GetSupportRatingBean):void type: THIS */
    public /* synthetic */ TopicSectionsResponse(List list, GetSupportRatingBean getSupportRatingBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : getSupportRatingBean);
    }
}
