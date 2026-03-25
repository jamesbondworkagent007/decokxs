package com.okinc.okex.center.bean;

import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.bean.SupportFaqArticle$$serializer;
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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class RelatedArticleListModel {
    private final boolean hasMore;
    private final List<SupportFaqArticle> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SupportFaqArticle$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RelatedArticleListModel() {
        this((List) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.RelatedArticleListModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelatedArticleListModel copy$default(RelatedArticleListModel relatedArticleListModel, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relatedArticleListModel.list;
        }
        if ((i & 2) != 0) {
            z = relatedArticleListModel.hasMore;
        }
        return relatedArticleListModel.copy(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleListModel copy(@NotNull List<SupportFaqArticle> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RelatedArticleListModel(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedArticleListModel)) {
            return false;
        }
        RelatedArticleListModel relatedArticleListModel = (RelatedArticleListModel) obj;
        return Intrinsics.EZpvd(this.list, relatedArticleListModel.list) && this.hasMore == relatedArticleListModel.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.list.hashCode() * 31) + Boolean.hashCode(this.hasMore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RelatedArticleListModel(list=" + this.list + ", hasMore=" + this.hasMore + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.RelatedArticleListModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RelatedArticleListModel> serializer() {
            return RelatedArticleListModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RelatedArticleListModel(int i, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.list = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RelatedArticleListModel relatedArticleListModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(relatedArticleListModel.list, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], relatedArticleListModel.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || relatedArticleListModel.hasMore) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, relatedArticleListModel.hasMore);
        }
    }

    public RelatedArticleListModel(@NotNull List<SupportFaqArticle> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
        this.hasMore = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.util.List<com.okinc.okex.article.bean.SupportFaqArticle>, boolean):void (m)] (LINE:9) call: com.okinc.okex.center.bean.RelatedArticleListModel.<init>(java.util.List, boolean):void type: THIS */
    public /* synthetic */ RelatedArticleListModel(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z);
    }
}
