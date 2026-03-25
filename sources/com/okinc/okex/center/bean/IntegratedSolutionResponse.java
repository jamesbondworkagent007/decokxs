package com.okinc.okex.center.bean;

import androidx.core.app.FrameMetricsAggregator;
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
public final class IntegratedSolutionResponse {
    private final List<BannerItem> banners;
    private final ContactInfoBean contactInformation;
    private final ContextualScenarioModel contextualScenario;
    private final MiniSupportResponse miniSupportPage;
    private final PopupAnnouncements popupAnnouncements;
    private final GetSupportRatingBean rating;
    private final RelatedArticleListModel relatedArticles;
    private final SelfServiceTools selfServiceTools;
    private final TransactionBean transactionInformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(BannerItem$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntegratedSolutionResponse() {
        this((ContactInfoBean) null, (ContextualScenarioModel) null, (MiniSupportResponse) null, (TransactionBean) null, (SelfServiceTools) null, (RelatedArticleListModel) null, (GetSupportRatingBean) null, (List) null, (PopupAnnouncements) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactInfoBean component1() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component2() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniSupportResponse component3() {
        return this.miniSupportPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean component4() {
        return this.transactionInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component5() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleListModel component6() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean component7() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerItem> component8() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncements component9() {
        return this.popupAnnouncements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntegratedSolutionResponse copy(ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, MiniSupportResponse miniSupportResponse, TransactionBean transactionBean, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, GetSupportRatingBean getSupportRatingBean, List<BannerItem> list, PopupAnnouncements popupAnnouncements) {
        return new IntegratedSolutionResponse(contactInfoBean, contextualScenarioModel, miniSupportResponse, transactionBean, selfServiceTools, relatedArticleListModel, getSupportRatingBean, list, popupAnnouncements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegratedSolutionResponse)) {
            return false;
        }
        IntegratedSolutionResponse integratedSolutionResponse = (IntegratedSolutionResponse) obj;
        return Intrinsics.EZpvd(this.contactInformation, integratedSolutionResponse.contactInformation) && Intrinsics.EZpvd(this.contextualScenario, integratedSolutionResponse.contextualScenario) && Intrinsics.EZpvd(this.miniSupportPage, integratedSolutionResponse.miniSupportPage) && Intrinsics.EZpvd(this.transactionInformation, integratedSolutionResponse.transactionInformation) && Intrinsics.EZpvd(this.selfServiceTools, integratedSolutionResponse.selfServiceTools) && Intrinsics.EZpvd(this.relatedArticles, integratedSolutionResponse.relatedArticles) && Intrinsics.EZpvd(this.rating, integratedSolutionResponse.rating) && Intrinsics.EZpvd(this.banners, integratedSolutionResponse.banners) && Intrinsics.EZpvd(this.popupAnnouncements, integratedSolutionResponse.popupAnnouncements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerItem> getBanners() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactInfoBean getContactInformation() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel getContextualScenario() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniSupportResponse getMiniSupportPage() {
        return this.miniSupportPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncements getPopupAnnouncements() {
        return this.popupAnnouncements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean getRating() {
        return this.rating;
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
    public final TransactionBean getTransactionInformation() {
        return this.transactionInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ContactInfoBean contactInfoBean = this.contactInformation;
        int iHashCode = contactInfoBean == null ? 0 : contactInfoBean.hashCode();
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode2 = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        MiniSupportResponse miniSupportResponse = this.miniSupportPage;
        int iHashCode3 = miniSupportResponse == null ? 0 : miniSupportResponse.hashCode();
        TransactionBean transactionBean = this.transactionInformation;
        int iHashCode4 = transactionBean == null ? 0 : transactionBean.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        int iHashCode5 = selfServiceTools == null ? 0 : selfServiceTools.hashCode();
        RelatedArticleListModel relatedArticleListModel = this.relatedArticles;
        int iHashCode6 = relatedArticleListModel == null ? 0 : relatedArticleListModel.hashCode();
        GetSupportRatingBean getSupportRatingBean = this.rating;
        int iHashCode7 = getSupportRatingBean == null ? 0 : getSupportRatingBean.hashCode();
        List<BannerItem> list = this.banners;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        PopupAnnouncements popupAnnouncements = this.popupAnnouncements;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (popupAnnouncements != null ? popupAnnouncements.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntegratedSolutionResponse(contactInformation=" + this.contactInformation + ", contextualScenario=" + this.contextualScenario + ", miniSupportPage=" + this.miniSupportPage + ", transactionInformation=" + this.transactionInformation + ", selfServiceTools=" + this.selfServiceTools + ", relatedArticles=" + this.relatedArticles + ", rating=" + this.rating + ", banners=" + this.banners + ", popupAnnouncements=" + this.popupAnnouncements + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.IntegratedSolutionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IntegratedSolutionResponse> serializer() {
            return IntegratedSolutionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IntegratedSolutionResponse(int i, ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, MiniSupportResponse miniSupportResponse, TransactionBean transactionBean, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, GetSupportRatingBean getSupportRatingBean, List list, PopupAnnouncements popupAnnouncements, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contactInformation = null;
        } else {
            this.contactInformation = contactInfoBean;
        }
        if ((i & 2) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 4) == 0) {
            this.miniSupportPage = null;
        } else {
            this.miniSupportPage = miniSupportResponse;
        }
        if ((i & 8) == 0) {
            this.transactionInformation = null;
        } else {
            this.transactionInformation = transactionBean;
        }
        if ((i & 16) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
        if ((i & 32) == 0) {
            this.relatedArticles = null;
        } else {
            this.relatedArticles = relatedArticleListModel;
        }
        if ((i & 64) == 0) {
            this.rating = null;
        } else {
            this.rating = getSupportRatingBean;
        }
        if ((i & 128) == 0) {
            this.banners = null;
        } else {
            this.banners = list;
        }
        if ((i & 256) == 0) {
            this.popupAnnouncements = null;
        } else {
            this.popupAnnouncements = popupAnnouncements;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(IntegratedSolutionResponse integratedSolutionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || integratedSolutionResponse.contactInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ContactInfoBean$$serializer.INSTANCE, integratedSolutionResponse.contactInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || integratedSolutionResponse.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, integratedSolutionResponse.contextualScenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || integratedSolutionResponse.miniSupportPage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, MiniSupportResponse$$serializer.INSTANCE, integratedSolutionResponse.miniSupportPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || integratedSolutionResponse.transactionInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TransactionBean$$serializer.INSTANCE, integratedSolutionResponse.transactionInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || integratedSolutionResponse.selfServiceTools != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SelfServiceTools$$serializer.INSTANCE, integratedSolutionResponse.selfServiceTools);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || integratedSolutionResponse.relatedArticles != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, RelatedArticleListModel$$serializer.INSTANCE, integratedSolutionResponse.relatedArticles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || integratedSolutionResponse.rating != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, GetSupportRatingBean$$serializer.INSTANCE, integratedSolutionResponse.rating);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || integratedSolutionResponse.banners != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], integratedSolutionResponse.banners);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && integratedSolutionResponse.popupAnnouncements == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, PopupAnnouncements$$serializer.INSTANCE, integratedSolutionResponse.popupAnnouncements);
    }

    public IntegratedSolutionResponse(ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, MiniSupportResponse miniSupportResponse, TransactionBean transactionBean, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, GetSupportRatingBean getSupportRatingBean, List<BannerItem> list, PopupAnnouncements popupAnnouncements) {
        this.contactInformation = contactInfoBean;
        this.contextualScenario = contextualScenarioModel;
        this.miniSupportPage = miniSupportResponse;
        this.transactionInformation = transactionBean;
        this.selfServiceTools = selfServiceTools;
        this.relatedArticles = relatedArticleListModel;
        this.rating = getSupportRatingBean;
        this.banners = list;
        this.popupAnnouncements = popupAnnouncements;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.ContactInfoBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContactInfoBean) : (r11v0 com.okinc.okex.center.bean.ContactInfoBean))
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r12v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:com.okinc.okex.center.bean.MiniSupportResponse:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.MiniSupportResponse) : (r13v0 com.okinc.okex.center.bean.MiniSupportResponse))
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r14v0 com.okinc.okex.center.bean.TransactionBean))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r15v0 com.okinc.okex.center.bean.SelfServiceTools))
  (wrap:com.okinc.okex.center.bean.RelatedArticleListModel:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.RelatedArticleListModel) : (r16v0 com.okinc.okex.center.bean.RelatedArticleListModel))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean) : (r17v0 com.okinc.okex.rating.bean.GetSupportRatingBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:com.okinc.okex.center.bean.PopupAnnouncements:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.okex.center.bean.PopupAnnouncements) : (null com.okinc.okex.center.bean.PopupAnnouncements))
 A[MD:(com.okinc.okex.center.bean.ContactInfoBean, com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.center.bean.MiniSupportResponse, com.okinc.okex.center.bean.TransactionBean, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.RelatedArticleListModel, com.okinc.okex.rating.bean.GetSupportRatingBean, java.util.List<com.okinc.okex.center.bean.BannerItem>, com.okinc.okex.center.bean.PopupAnnouncements):void (m)] (LINE:13) call: com.okinc.okex.center.bean.IntegratedSolutionResponse.<init>(com.okinc.okex.center.bean.ContactInfoBean, com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.center.bean.MiniSupportResponse, com.okinc.okex.center.bean.TransactionBean, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.RelatedArticleListModel, com.okinc.okex.rating.bean.GetSupportRatingBean, java.util.List, com.okinc.okex.center.bean.PopupAnnouncements):void type: THIS */
    public /* synthetic */ IntegratedSolutionResponse(ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, MiniSupportResponse miniSupportResponse, TransactionBean transactionBean, SelfServiceTools selfServiceTools, RelatedArticleListModel relatedArticleListModel, GetSupportRatingBean getSupportRatingBean, List list, PopupAnnouncements popupAnnouncements, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contactInfoBean, (i & 2) != 0 ? null : contextualScenarioModel, (i & 4) != 0 ? null : miniSupportResponse, (i & 8) != 0 ? null : transactionBean, (i & 16) != 0 ? null : selfServiceTools, (i & 32) != 0 ? null : relatedArticleListModel, (i & 64) != 0 ? null : getSupportRatingBean, (i & 128) != 0 ? null : list, (i & 256) == 0 ? popupAnnouncements : null);
    }
}
