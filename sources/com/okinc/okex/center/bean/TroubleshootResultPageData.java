package com.okinc.okex.center.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.bean.SupportFaqArticle$$serializer;
import com.okinc.okex.center.bean.enums.ContextualScenario;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel$$serializer;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel$$serializer;
import com.okinc.okex.rating.net.RatingResult;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TroubleshootResultPageData implements Parcelable {
    private final ChatbotEntryDisplayModel contactInformation;
    private final ContextualScenarioModel contextualScenario;
    private final List<SupportFaqArticle> relatedArticles;
    private final ContextualScenario scenarioKey;
    private final List<SelfServiceToolBean> selfServiceTools;
    private final boolean showFullArticleList;
    private final RatingResult supportRatingResult;
    private final TransactionDisplayModel transactionCard;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TroubleshootResultPageData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, ContextualScenario.Companion.serializer(), null, new ArrayListSerializer(SelfServiceToolBean$$serializer.INSTANCE), new ArrayListSerializer(SupportFaqArticle$$serializer.INSTANCE), null, RatingResult.Companion.serializer(), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TroubleshootResultPageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TroubleshootResultPageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TransactionDisplayModel transactionDisplayModelCreateFromParcel = parcel.readInt() == 0 ? null : TransactionDisplayModel.CREATOR.createFromParcel(parcel);
            ContextualScenario contextualScenarioValueOf = ContextualScenario.valueOf(parcel.readString());
            ContextualScenarioModel contextualScenarioModelCreateFromParcel = parcel.readInt() == 0 ? null : ContextualScenarioModel.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SelfServiceToolBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(SupportFaqArticle.CREATOR.createFromParcel(parcel));
            }
            return new TroubleshootResultPageData(transactionDisplayModelCreateFromParcel, contextualScenarioValueOf, contextualScenarioModelCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0, (RatingResult) parcel.readParcelable(TroubleshootResultPageData.class.getClassLoader()), parcel.readInt() != 0 ? ChatbotEntryDisplayModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TroubleshootResultPageData[] newArray(int i) {
            return new TroubleshootResultPageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TroubleshootResultPageData() {
        this((TransactionDisplayModel) null, (ContextualScenario) null, (ContextualScenarioModel) null, (List) null, (List) null, false, (RatingResult) null, (ChatbotEntryDisplayModel) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel component1() {
        return this.transactionCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenario component2() {
        return this.scenarioKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component3() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelfServiceToolBean> component4() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportFaqArticle> component5() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.showFullArticleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult component7() {
        return this.supportRatingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatbotEntryDisplayModel component8() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TroubleshootResultPageData copy(TransactionDisplayModel transactionDisplayModel, @NotNull ContextualScenario contextualScenario, ContextualScenarioModel contextualScenarioModel, @NotNull List<SelfServiceToolBean> list, @NotNull List<SupportFaqArticle> list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel) {
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TroubleshootResultPageData(transactionDisplayModel, contextualScenario, contextualScenarioModel, list, list2, z, ratingResult, chatbotEntryDisplayModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TroubleshootResultPageData)) {
            return false;
        }
        TroubleshootResultPageData troubleshootResultPageData = (TroubleshootResultPageData) obj;
        return Intrinsics.EZpvd(this.transactionCard, troubleshootResultPageData.transactionCard) && this.scenarioKey == troubleshootResultPageData.scenarioKey && Intrinsics.EZpvd(this.contextualScenario, troubleshootResultPageData.contextualScenario) && Intrinsics.EZpvd(this.selfServiceTools, troubleshootResultPageData.selfServiceTools) && Intrinsics.EZpvd(this.relatedArticles, troubleshootResultPageData.relatedArticles) && this.showFullArticleList == troubleshootResultPageData.showFullArticleList && Intrinsics.EZpvd(this.supportRatingResult, troubleshootResultPageData.supportRatingResult) && Intrinsics.EZpvd(this.contactInformation, troubleshootResultPageData.contactInformation);
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
    public final List<SupportFaqArticle> getRelatedArticles() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenario getScenarioKey() {
        return this.scenarioKey;
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
        int iHashCode2 = this.scenarioKey.hashCode();
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode3 = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        int iHashCode4 = this.selfServiceTools.hashCode();
        int iHashCode5 = this.relatedArticles.hashCode();
        int iHashCode6 = Boolean.hashCode(this.showFullArticleList);
        RatingResult ratingResult = this.supportRatingResult;
        int iHashCode7 = ratingResult == null ? 0 : ratingResult.hashCode();
        ChatbotEntryDisplayModel chatbotEntryDisplayModel = this.contactInformation;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (chatbotEntryDisplayModel != null ? chatbotEntryDisplayModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TroubleshootResultPageData(transactionCard=" + this.transactionCard + ", scenarioKey=" + this.scenarioKey + ", contextualScenario=" + this.contextualScenario + ", selfServiceTools=" + this.selfServiceTools + ", relatedArticles=" + this.relatedArticles + ", showFullArticleList=" + this.showFullArticleList + ", supportRatingResult=" + this.supportRatingResult + ", contactInformation=" + this.contactInformation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        TransactionDisplayModel transactionDisplayModel = this.transactionCard;
        if (transactionDisplayModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionDisplayModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.scenarioKey.name());
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        if (contextualScenarioModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contextualScenarioModel.writeToParcel(parcel, i);
        }
        List<SelfServiceToolBean> list = this.selfServiceTools;
        parcel.writeInt(list.size());
        Iterator<SelfServiceToolBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<SupportFaqArticle> list2 = this.relatedArticles;
        parcel.writeInt(list2.size());
        Iterator<SupportFaqArticle> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showFullArticleList ? 1 : 0);
        parcel.writeParcelable(this.supportRatingResult, i);
        ChatbotEntryDisplayModel chatbotEntryDisplayModel = this.contactInformation;
        if (chatbotEntryDisplayModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatbotEntryDisplayModel.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TroubleshootResultPageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TroubleshootResultPageData> serializer() {
            return TroubleshootResultPageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TroubleshootResultPageData(int i, TransactionDisplayModel transactionDisplayModel, ContextualScenario contextualScenario, ContextualScenarioModel contextualScenarioModel, List list, List list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transactionCard = null;
        } else {
            this.transactionCard = transactionDisplayModel;
        }
        if ((i & 2) == 0) {
            this.scenarioKey = ContextualScenario.Unknown;
        } else {
            this.scenarioKey = contextualScenario;
        }
        if ((i & 4) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 8) == 0) {
            this.selfServiceTools = yDY.AhwBna();
        } else {
            this.selfServiceTools = list;
        }
        if ((i & 16) == 0) {
            this.relatedArticles = yDY.AhwBna();
        } else {
            this.relatedArticles = list2;
        }
        if ((i & 32) == 0) {
            this.showFullArticleList = false;
        } else {
            this.showFullArticleList = z;
        }
        if ((i & 64) == 0) {
            this.supportRatingResult = null;
        } else {
            this.supportRatingResult = ratingResult;
        }
        if ((i & 128) == 0) {
            this.contactInformation = null;
        } else {
            this.contactInformation = chatbotEntryDisplayModel;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [16=4] */
    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TroubleshootResultPageData troubleshootResultPageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || troubleshootResultPageData.transactionCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TransactionDisplayModel$$serializer.INSTANCE, troubleshootResultPageData.transactionCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || troubleshootResultPageData.scenarioKey != ContextualScenario.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], troubleshootResultPageData.scenarioKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || troubleshootResultPageData.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ContextualScenarioModel$$serializer.INSTANCE, troubleshootResultPageData.contextualScenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(troubleshootResultPageData.selfServiceTools, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], troubleshootResultPageData.selfServiceTools);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(troubleshootResultPageData.relatedArticles, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], troubleshootResultPageData.relatedArticles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || troubleshootResultPageData.showFullArticleList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, troubleshootResultPageData.showFullArticleList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || troubleshootResultPageData.supportRatingResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], troubleshootResultPageData.supportRatingResult);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && troubleshootResultPageData.contactInformation == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, ChatbotEntryDisplayModel$$serializer.INSTANCE, troubleshootResultPageData.contactInformation);
    }

    public TroubleshootResultPageData(TransactionDisplayModel transactionDisplayModel, @NotNull ContextualScenario contextualScenario, ContextualScenarioModel contextualScenarioModel, @NotNull List<SelfServiceToolBean> list, @NotNull List<SupportFaqArticle> list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel) {
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.transactionCard = transactionDisplayModel;
        this.scenarioKey = contextualScenario;
        this.contextualScenario = contextualScenarioModel;
        this.selfServiceTools = list;
        this.relatedArticles = list2;
        this.showFullArticleList = z;
        this.supportRatingResult = ratingResult;
        this.contactInformation = chatbotEntryDisplayModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel) : (r10v0 com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel))
  (wrap:com.okinc.okex.center.bean.enums.ContextualScenario:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:21) com.okinc.okex.center.bean.enums.ContextualScenario.Unknown com.okinc.okex.center.bean.enums.ContextualScenario) : (r11v0 com.okinc.okex.center.bean.enums.ContextualScenario))
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r12v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r14v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:com.okinc.okex.rating.net.RatingResult:?: TERNARY null = ((wrap:int:0x0034: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.net.RatingResult) : (r16v0 com.okinc.okex.rating.net.RatingResult))
  (wrap:com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel:?: TERNARY null = ((wrap:int:0x003c: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel) : (null com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel))
 A[MD:(com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.enums.ContextualScenario, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List<com.okinc.okex.center.bean.SelfServiceToolBean>, java.util.List<com.okinc.okex.article.bean.SupportFaqArticle>, boolean, com.okinc.okex.rating.net.RatingResult, com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel):void (m)] (LINE:19) call: com.okinc.okex.center.bean.TroubleshootResultPageData.<init>(com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.enums.ContextualScenario, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List, java.util.List, boolean, com.okinc.okex.rating.net.RatingResult, com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel):void type: THIS */
    public /* synthetic */ TroubleshootResultPageData(TransactionDisplayModel transactionDisplayModel, ContextualScenario contextualScenario, ContextualScenarioModel contextualScenarioModel, List list, List list2, boolean z, RatingResult ratingResult, ChatbotEntryDisplayModel chatbotEntryDisplayModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionDisplayModel, (i & 2) != 0 ? ContextualScenario.Unknown : contextualScenario, (i & 4) != 0 ? null : contextualScenarioModel, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : ratingResult, (i & 128) == 0 ? chatbotEntryDisplayModel : null);
    }
}
