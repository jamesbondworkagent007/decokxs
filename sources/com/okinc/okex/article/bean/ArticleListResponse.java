package com.okinc.okex.article.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ArticleListResponse {
    private final List<SupportFaqArticle> list;
    private final int pageNum;
    private final int pageSize;
    private final GetSupportRatingBean rating;
    private final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SupportFaqArticle$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okex.article.bean.ArticleListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleListResponse copy$default(ArticleListResponse articleListResponse, List list, GetSupportRatingBean getSupportRatingBean, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = articleListResponse.list;
        }
        if ((i4 & 2) != 0) {
            getSupportRatingBean = articleListResponse.rating;
        }
        GetSupportRatingBean getSupportRatingBean2 = getSupportRatingBean;
        if ((i4 & 4) != 0) {
            i = articleListResponse.pageNum;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = articleListResponse.pageSize;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = articleListResponse.total;
        }
        return articleListResponse.copy(list, getSupportRatingBean2, i5, i6, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean component2() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArticleListResponse copy(@NotNull List<SupportFaqArticle> list, GetSupportRatingBean getSupportRatingBean, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ArticleListResponse(list, getSupportRatingBean, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleListResponse)) {
            return false;
        }
        ArticleListResponse articleListResponse = (ArticleListResponse) obj;
        return Intrinsics.EZpvd(this.list, articleListResponse.list) && Intrinsics.EZpvd(this.rating, articleListResponse.rating) && this.pageNum == articleListResponse.pageNum && this.pageSize == articleListResponse.pageSize && this.total == articleListResponse.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean getRating() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.list.hashCode();
        GetSupportRatingBean getSupportRatingBean = this.rating;
        return (((((((iHashCode * 31) + (getSupportRatingBean == null ? 0 : getSupportRatingBean.hashCode())) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArticleListResponse(list=" + this.list + ", rating=" + this.rating + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.article.bean.ArticleListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArticleListResponse> serializer() {
            return ArticleListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArticleListResponse(int i, List list, GetSupportRatingBean getSupportRatingBean, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (29 != (i & 29)) {
            PluginExceptionsKt.throwMissingFieldException(i, 29, ArticleListResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.list = list;
        if ((i & 2) == 0) {
            this.rating = null;
        } else {
            this.rating = getSupportRatingBean;
        }
        this.pageNum = i2;
        this.pageSize = i3;
        this.total = i4;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ArticleListResponse articleListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], articleListResponse.list);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || articleListResponse.rating != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, GetSupportRatingBean$$serializer.INSTANCE, articleListResponse.rating);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, articleListResponse.pageNum);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, articleListResponse.pageSize);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, articleListResponse.total);
    }

    public ArticleListResponse(@NotNull List<SupportFaqArticle> list, GetSupportRatingBean getSupportRatingBean, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
        this.rating = getSupportRatingBean;
        this.pageNum = i;
        this.pageSize = i2;
        this.total = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.util.List)
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean) : (r8v0 com.okinc.okex.rating.bean.GetSupportRatingBean))
  (r9v0 int)
  (r10v0 int)
  (r11v0 int)
 A[MD:(java.util.List<com.okinc.okex.article.bean.SupportFaqArticle>, com.okinc.okex.rating.bean.GetSupportRatingBean, int, int, int):void (m)] (LINE:9) call: com.okinc.okex.article.bean.ArticleListResponse.<init>(java.util.List, com.okinc.okex.rating.bean.GetSupportRatingBean, int, int, int):void type: THIS */
    public /* synthetic */ ArticleListResponse(List list, GetSupportRatingBean getSupportRatingBean, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i4 & 2) != 0 ? null : getSupportRatingBean, i, i2, i3);
    }
}
