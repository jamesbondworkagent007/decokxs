package com.okinc.okex.center.bean;

import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.bean.SupportFaqArticle$$serializer;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel$$serializer;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel$$serializer;
import com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel$$serializer;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel$$serializer;
import com.okinc.okex.rating.net.RatingResult;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class IntegratedSolutionPageData {
    private final List<TransactionBannerDisplayModel> banners;
    private final ChatbotEntryDisplayModel contactInformation;
    private final ContextualScenarioModel contextualScenario;
    private final MiniSupportResponse miniSupportResponse;
    private final AnnouncementPopupDisplayModel popupAnnouncement;
    private final List<SupportFaqArticle> relatedArticles;
    private final List<SelfServiceToolBean> selfServiceTools;
    private final boolean showFullArticleList;
    private final RatingResult supportRatingResult;
    private final TransactionDisplayModel transactionCard;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SelfServiceToolBean$$serializer.INSTANCE), new ArrayListSerializer(SupportFaqArticle$$serializer.INSTANCE), null, RatingResult.Companion.serializer(), null, null, new ArrayListSerializer(TransactionBannerDisplayModel$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntegratedSolutionPageData() {
        this((TransactionDisplayModel) null, (ContextualScenarioModel) null, (List) null, (List) null, false, (RatingResult) null, (ChatbotEntryDisplayModel) null, (MiniSupportResponse) null, (List) null, (AnnouncementPopupDisplayModel) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel component1() {
        return this.transactionCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnouncementPopupDisplayModel component10() {
        return this.popupAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component2() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelfServiceToolBean> component3() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> component4() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.showFullArticleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult component6() {
        return this.supportRatingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatbotEntryDisplayModel component7() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniSupportResponse component8() {
        return this.miniSupportResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBannerDisplayModel> component9() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntegratedSolutionPageData copy(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, @NotNull List<SelfServiceToolBean> list, @NotNull List<SupportFaqArticle> list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel, MiniSupportResponse miniSupportResponse, List<TransactionBannerDisplayModel> list3, AnnouncementPopupDisplayModel announcementPopupDisplayModel) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new IntegratedSolutionPageData(transactionDisplayModel, contextualScenarioModel, list, list2, z, ratingResult, chatbotEntryDisplayModel, miniSupportResponse, list3, announcementPopupDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegratedSolutionPageData)) {
            return false;
        }
        IntegratedSolutionPageData integratedSolutionPageData = (IntegratedSolutionPageData) obj;
        return Intrinsics.EZpvd(this.transactionCard, integratedSolutionPageData.transactionCard) && Intrinsics.EZpvd(this.contextualScenario, integratedSolutionPageData.contextualScenario) && Intrinsics.EZpvd(this.selfServiceTools, integratedSolutionPageData.selfServiceTools) && Intrinsics.EZpvd(this.relatedArticles, integratedSolutionPageData.relatedArticles) && this.showFullArticleList == integratedSolutionPageData.showFullArticleList && Intrinsics.EZpvd(this.supportRatingResult, integratedSolutionPageData.supportRatingResult) && Intrinsics.EZpvd(this.contactInformation, integratedSolutionPageData.contactInformation) && Intrinsics.EZpvd(this.miniSupportResponse, integratedSolutionPageData.miniSupportResponse) && Intrinsics.EZpvd(this.banners, integratedSolutionPageData.banners) && Intrinsics.EZpvd(this.popupAnnouncement, integratedSolutionPageData.popupAnnouncement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBannerDisplayModel> getBanners() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatbotEntryDisplayModel getContactInformation() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel getContextualScenario() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniSupportResponse getMiniSupportResponse() {
        return this.miniSupportResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnouncementPopupDisplayModel getPopupAnnouncement() {
        return this.popupAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> getRelatedArticles() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelfServiceToolBean> getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowFullArticleList() {
        return this.showFullArticleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult getSupportRatingResult() {
        return this.supportRatingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel getTransactionCard() {
        return this.transactionCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TransactionDisplayModel transactionDisplayModel = this.transactionCard;
        int iHashCode = transactionDisplayModel == null ? 0 : transactionDisplayModel.hashCode();
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode2 = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        int iHashCode3 = this.selfServiceTools.hashCode();
        int iHashCode4 = this.relatedArticles.hashCode();
        int iHashCode5 = Boolean.hashCode(this.showFullArticleList);
        RatingResult ratingResult = this.supportRatingResult;
        int iHashCode6 = ratingResult == null ? 0 : ratingResult.hashCode();
        ChatbotEntryDisplayModel chatbotEntryDisplayModel = this.contactInformation;
        int iHashCode7 = chatbotEntryDisplayModel == null ? 0 : chatbotEntryDisplayModel.hashCode();
        MiniSupportResponse miniSupportResponse = this.miniSupportResponse;
        int iHashCode8 = miniSupportResponse == null ? 0 : miniSupportResponse.hashCode();
        List<TransactionBannerDisplayModel> list = this.banners;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        AnnouncementPopupDisplayModel announcementPopupDisplayModel = this.popupAnnouncement;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (announcementPopupDisplayModel != null ? announcementPopupDisplayModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntegratedSolutionPageData(transactionCard=" + this.transactionCard + ", contextualScenario=" + this.contextualScenario + ", selfServiceTools=" + this.selfServiceTools + ", relatedArticles=" + this.relatedArticles + ", showFullArticleList=" + this.showFullArticleList + ", supportRatingResult=" + this.supportRatingResult + ", contactInformation=" + this.contactInformation + ", miniSupportResponse=" + this.miniSupportResponse + ", banners=" + this.banners + ", popupAnnouncement=" + this.popupAnnouncement + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.IntegratedSolutionPageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IntegratedSolutionPageData> serializer() {
            return IntegratedSolutionPageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IntegratedSolutionPageData(int i, TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List list, List list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel, MiniSupportResponse miniSupportResponse, List list3, AnnouncementPopupDisplayModel announcementPopupDisplayModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transactionCard = null;
        } else {
            this.transactionCard = transactionDisplayModel;
        }
        if ((i & 2) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 4) == 0) {
            this.selfServiceTools = yDY.AhwBna();
        } else {
            this.selfServiceTools = list;
        }
        if ((i & 8) == 0) {
            this.relatedArticles = yDY.AhwBna();
        } else {
            this.relatedArticles = list2;
        }
        if ((i & 16) == 0) {
            this.showFullArticleList = false;
        } else {
            this.showFullArticleList = z;
        }
        if ((i & 32) == 0) {
            this.supportRatingResult = null;
        } else {
            this.supportRatingResult = ratingResult;
        }
        if ((i & 64) == 0) {
            this.contactInformation = null;
        } else {
            this.contactInformation = chatbotEntryDisplayModel;
        }
        if ((i & 128) == 0) {
            this.miniSupportResponse = null;
        } else {
            this.miniSupportResponse = miniSupportResponse;
        }
        if ((i & 256) == 0) {
            this.banners = null;
        } else {
            this.banners = list3;
        }
        if ((i & 512) == 0) {
            this.popupAnnouncement = null;
        } else {
            this.popupAnnouncement = announcementPopupDisplayModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(IntegratedSolutionPageData integratedSolutionPageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || integratedSolutionPageData.transactionCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TransactionDisplayModel$$serializer.INSTANCE, integratedSolutionPageData.transactionCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || integratedSolutionPageData.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, integratedSolutionPageData.contextualScenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(integratedSolutionPageData.selfServiceTools, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], integratedSolutionPageData.selfServiceTools);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(integratedSolutionPageData.relatedArticles, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], integratedSolutionPageData.relatedArticles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || integratedSolutionPageData.showFullArticleList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, integratedSolutionPageData.showFullArticleList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || integratedSolutionPageData.supportRatingResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], integratedSolutionPageData.supportRatingResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || integratedSolutionPageData.contactInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ChatbotEntryDisplayModel$$serializer.INSTANCE, integratedSolutionPageData.contactInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || integratedSolutionPageData.miniSupportResponse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, MiniSupportResponse$$serializer.INSTANCE, integratedSolutionPageData.miniSupportResponse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || integratedSolutionPageData.banners != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], integratedSolutionPageData.banners);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && integratedSolutionPageData.popupAnnouncement == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, AnnouncementPopupDisplayModel$$serializer.INSTANCE, integratedSolutionPageData.popupAnnouncement);
    }

    public IntegratedSolutionPageData(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, @NotNull List<SelfServiceToolBean> list, @NotNull List<SupportFaqArticle> list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel, MiniSupportResponse miniSupportResponse, List<TransactionBannerDisplayModel> list3, AnnouncementPopupDisplayModel announcementPopupDisplayModel) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.transactionCard = transactionDisplayModel;
        this.contextualScenario = contextualScenarioModel;
        this.selfServiceTools = list;
        this.relatedArticles = list2;
        this.showFullArticleList = z;
        this.supportRatingResult = ratingResult;
        this.contactInformation = chatbotEntryDisplayModel;
        this.miniSupportResponse = miniSupportResponse;
        this.banners = list3;
        this.popupAnnouncement = announcementPopupDisplayModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel) : (r12v0 com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel))
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r13v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r15v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:com.okinc.okex.rating.net.RatingResult:?: TERNARY null = ((wrap:int:0x002d: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.net.RatingResult) : (r17v0 com.okinc.okex.rating.net.RatingResult))
  (wrap:com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel:?: TERNARY null = ((wrap:int:0x0035: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel) : (r18v0 com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel))
  (wrap:com.okinc.okex.center.bean.MiniSupportResponse:?: TERNARY null = ((wrap:int:0x003d: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.MiniSupportResponse) : (r19v0 com.okinc.okex.center.bean.MiniSupportResponse))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0045: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel:?: TERNARY null = ((wrap:int:0x004d: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel) : (null com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel))
 A[MD:(com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List<com.okinc.okex.center.bean.SelfServiceToolBean>, java.util.List<com.okinc.okex.article.bean.SupportFaqArticle>, boolean, com.okinc.okex.rating.net.RatingResult, com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel, com.okinc.okex.center.bean.MiniSupportResponse, java.util.List<com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel>, com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel):void (m)] (LINE:19) call: com.okinc.okex.center.bean.IntegratedSolutionPageData.<init>(com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List, java.util.List, boolean, com.okinc.okex.rating.net.RatingResult, com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel, com.okinc.okex.center.bean.MiniSupportResponse, java.util.List, com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel):void type: THIS */
    public /* synthetic */ IntegratedSolutionPageData(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List list, List list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel, MiniSupportResponse miniSupportResponse, List list3, AnnouncementPopupDisplayModel announcementPopupDisplayModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionDisplayModel, (i & 2) != 0 ? null : contextualScenarioModel, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : ratingResult, (i & 64) != 0 ? null : chatbotEntryDisplayModel, (i & 128) != 0 ? null : miniSupportResponse, (i & 256) != 0 ? null : list3, (i & 512) == 0 ? announcementPopupDisplayModel : null);
    }
}
