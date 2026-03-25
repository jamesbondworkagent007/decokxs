package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class RecommendationSection {
    private final RecommendationCard recommendationCard;
    private final RelatedArticleListModel relatedArticles;
    private final SelfServiceTools selfServiceTools;
    private final TransactionBean transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendationSection() {
        this((RecommendationCard) null, (SelfServiceTools) null, (RelatedArticleListModel) null, (TransactionBean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecommendationSection copy$default(RecommendationSection recommendationSection, RecommendationCard recommendationCard, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, TransactionBean transactionBean, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendationCard = recommendationSection.recommendationCard;
        }
        if ((i & 2) != 0) {
            selfServiceTools = recommendationSection.selfServiceTools;
        }
        if ((i & 4) != 0) {
            relatedArticleListModel = recommendationSection.relatedArticles;
        }
        if ((i & 8) != 0) {
            transactionBean = recommendationSection.transaction;
        }
        return recommendationSection.copy(recommendationCard, selfServiceTools, relatedArticleListModel, transactionBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationCard component1() {
        return this.recommendationCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component2() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleListModel component3() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean component4() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationSection copy(RecommendationCard recommendationCard, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, TransactionBean transactionBean) {
        return new RecommendationSection(recommendationCard, selfServiceTools, relatedArticleListModel, transactionBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationSection)) {
            return false;
        }
        RecommendationSection recommendationSection = (RecommendationSection) obj;
        return Intrinsics.EZpvd(this.recommendationCard, recommendationSection.recommendationCard) && Intrinsics.EZpvd(this.selfServiceTools, recommendationSection.selfServiceTools) && Intrinsics.EZpvd(this.relatedArticles, recommendationSection.relatedArticles) && Intrinsics.EZpvd(this.transaction, recommendationSection.transaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationCard getRecommendationCard() {
        return this.recommendationCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleListModel getRelatedArticles() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RecommendationCard recommendationCard = this.recommendationCard;
        int iHashCode = recommendationCard == null ? 0 : recommendationCard.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        int iHashCode2 = selfServiceTools == null ? 0 : selfServiceTools.hashCode();
        RelatedArticleListModel relatedArticleListModel = this.relatedArticles;
        int iHashCode3 = relatedArticleListModel == null ? 0 : relatedArticleListModel.hashCode();
        TransactionBean transactionBean = this.transaction;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (transactionBean != null ? transactionBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendationSection(recommendationCard=" + this.recommendationCard + ", selfServiceTools=" + this.selfServiceTools + ", relatedArticles=" + this.relatedArticles + ", transaction=" + this.transaction + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.RecommendationSection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecommendationSection> serializer() {
            return RecommendationSection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecommendationSection(int i, RecommendationCard recommendationCard, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, TransactionBean transactionBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.recommendationCard = null;
        } else {
            this.recommendationCard = recommendationCard;
        }
        if ((i & 2) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
        if ((i & 4) == 0) {
            this.relatedArticles = null;
        } else {
            this.relatedArticles = relatedArticleListModel;
        }
        if ((i & 8) == 0) {
            this.transaction = null;
        } else {
            this.transaction = transactionBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RecommendationSection recommendationSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recommendationSection.recommendationCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RecommendationCard$$serializer.INSTANCE, recommendationSection.recommendationCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recommendationSection.selfServiceTools != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, recommendationSection.selfServiceTools);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recommendationSection.relatedArticles != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, RelatedArticleListModel$$serializer.INSTANCE, recommendationSection.relatedArticles);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && recommendationSection.transaction == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TransactionBean$$serializer.INSTANCE, recommendationSection.transaction);
    }

    public RecommendationSection(RecommendationCard recommendationCard, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, TransactionBean transactionBean) {
        this.recommendationCard = recommendationCard;
        this.selfServiceTools = selfServiceTools;
        this.relatedArticles = relatedArticleListModel;
        this.transaction = transactionBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.RecommendationCard:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.RecommendationCard) : (r2v0 com.okinc.okex.center.bean.RecommendationCard))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r3v0 com.okinc.okex.center.bean.SelfServiceTools))
  (wrap:com.okinc.okex.center.bean.RelatedArticleListModel:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.RelatedArticleListModel) : (r4v0 com.okinc.okex.center.bean.RelatedArticleListModel))
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r5v0 com.okinc.okex.center.bean.TransactionBean))
 A[MD:(com.okinc.okex.center.bean.RecommendationCard, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.RelatedArticleListModel, com.okinc.okex.center.bean.TransactionBean):void (m)] (LINE:26) call: com.okinc.okex.center.bean.RecommendationSection.<init>(com.okinc.okex.center.bean.RecommendationCard, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.RelatedArticleListModel, com.okinc.okex.center.bean.TransactionBean):void type: THIS */
    public /* synthetic */ RecommendationSection(RecommendationCard recommendationCard, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, TransactionBean transactionBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : recommendationCard, (i & 2) != 0 ? null : selfServiceTools, (i & 4) != 0 ? null : relatedArticleListModel, (i & 8) != 0 ? null : transactionBean);
    }
}
