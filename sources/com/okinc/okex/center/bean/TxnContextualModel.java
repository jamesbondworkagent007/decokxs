package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.enums.ContextualScenario;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.GetSupportRatingBean$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TxnContextualModel {
    private final ContactInfoBean contactInformation;
    private final ContextualScenarioModel contextualScenario;
    private final GetSupportRatingBean rating;
    private final RelatedArticleListModel relatedArticles;
    private final ContextualScenario scenarioKey;
    private final SelfServiceTools selfServiceTools;
    private final TransactionBean transactionInformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, ContextualScenario.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxnContextualModel() {
        this((ContactInfoBean) null, (ContextualScenarioModel) null, (GetSupportRatingBean) null, (RelatedArticleListModel) null, (ContextualScenario) null, (SelfServiceTools) null, (TransactionBean) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxnContextualModel copy$default(TxnContextualModel txnContextualModel, ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, GetSupportRatingBean getSupportRatingBean, RelatedArticleListModel relatedArticleListModel, ContextualScenario contextualScenario, SelfServiceTools selfServiceTools, TransactionBean transactionBean, int i, Object obj) {
        if ((i & 1) != 0) {
            contactInfoBean = txnContextualModel.contactInformation;
        }
        if ((i & 2) != 0) {
            contextualScenarioModel = txnContextualModel.contextualScenario;
        }
        ContextualScenarioModel contextualScenarioModel2 = contextualScenarioModel;
        if ((i & 4) != 0) {
            getSupportRatingBean = txnContextualModel.rating;
        }
        GetSupportRatingBean getSupportRatingBean2 = getSupportRatingBean;
        if ((i & 8) != 0) {
            relatedArticleListModel = txnContextualModel.relatedArticles;
        }
        RelatedArticleListModel relatedArticleListModel2 = relatedArticleListModel;
        if ((i & 16) != 0) {
            contextualScenario = txnContextualModel.scenarioKey;
        }
        ContextualScenario contextualScenario2 = contextualScenario;
        if ((i & 32) != 0) {
            selfServiceTools = txnContextualModel.selfServiceTools;
        }
        SelfServiceTools selfServiceTools2 = selfServiceTools;
        if ((i & 64) != 0) {
            transactionBean = txnContextualModel.transactionInformation;
        }
        return txnContextualModel.copy(contactInfoBean, contextualScenarioModel2, getSupportRatingBean2, relatedArticleListModel2, contextualScenario2, selfServiceTools2, transactionBean);
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
    public final GetSupportRatingBean component3() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleListModel component4() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenario component5() {
        return this.scenarioKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component6() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean component7() {
        return this.transactionInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel copy(ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, GetSupportRatingBean getSupportRatingBean, RelatedArticleListModel relatedArticleListModel, @NotNull ContextualScenario contextualScenario, SelfServiceTools selfServiceTools, TransactionBean transactionBean) {
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        return new TxnContextualModel(contactInfoBean, contextualScenarioModel, getSupportRatingBean, relatedArticleListModel, contextualScenario, selfServiceTools, transactionBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxnContextualModel)) {
            return false;
        }
        TxnContextualModel txnContextualModel = (TxnContextualModel) obj;
        return Intrinsics.EZpvd(this.contactInformation, txnContextualModel.contactInformation) && Intrinsics.EZpvd(this.contextualScenario, txnContextualModel.contextualScenario) && Intrinsics.EZpvd(this.rating, txnContextualModel.rating) && Intrinsics.EZpvd(this.relatedArticles, txnContextualModel.relatedArticles) && this.scenarioKey == txnContextualModel.scenarioKey && Intrinsics.EZpvd(this.selfServiceTools, txnContextualModel.selfServiceTools) && Intrinsics.EZpvd(this.transactionInformation, txnContextualModel.transactionInformation);
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
    public final GetSupportRatingBean getRating() {
        return this.rating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleListModel getRelatedArticles() {
        return this.relatedArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenario getScenarioKey() {
        return this.scenarioKey;
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
        GetSupportRatingBean getSupportRatingBean = this.rating;
        int iHashCode3 = getSupportRatingBean == null ? 0 : getSupportRatingBean.hashCode();
        RelatedArticleListModel relatedArticleListModel = this.relatedArticles;
        int iHashCode4 = relatedArticleListModel == null ? 0 : relatedArticleListModel.hashCode();
        int iHashCode5 = this.scenarioKey.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        int iHashCode6 = selfServiceTools == null ? 0 : selfServiceTools.hashCode();
        TransactionBean transactionBean = this.transactionInformation;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (transactionBean != null ? transactionBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxnContextualModel(contactInformation=" + this.contactInformation + ", contextualScenario=" + this.contextualScenario + ", rating=" + this.rating + ", relatedArticles=" + this.relatedArticles + ", scenarioKey=" + this.scenarioKey + ", selfServiceTools=" + this.selfServiceTools + ", transactionInformation=" + this.transactionInformation + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TxnContextualModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxnContextualModel> serializer() {
            return TxnContextualModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxnContextualModel(int i, ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, GetSupportRatingBean getSupportRatingBean, RelatedArticleListModel relatedArticleListModel, ContextualScenario contextualScenario, SelfServiceTools selfServiceTools, TransactionBean transactionBean, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.rating = null;
        } else {
            this.rating = getSupportRatingBean;
        }
        if ((i & 8) == 0) {
            this.relatedArticles = null;
        } else {
            this.relatedArticles = relatedArticleListModel;
        }
        if ((i & 16) == 0) {
            this.scenarioKey = ContextualScenario.Unknown;
        } else {
            this.scenarioKey = contextualScenario;
        }
        if ((i & 32) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
        if ((i & 64) == 0) {
            this.transactionInformation = null;
        } else {
            this.transactionInformation = transactionBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TxnContextualModel txnContextualModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || txnContextualModel.contactInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ContactInfoBean$$serializer.INSTANCE, txnContextualModel.contactInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || txnContextualModel.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, txnContextualModel.contextualScenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || txnContextualModel.rating != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, GetSupportRatingBean$$serializer.INSTANCE, txnContextualModel.rating);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txnContextualModel.relatedArticles != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RelatedArticleListModel$$serializer.INSTANCE, txnContextualModel.relatedArticles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txnContextualModel.scenarioKey != ContextualScenario.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], txnContextualModel.scenarioKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txnContextualModel.selfServiceTools != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, SelfServiceTools$$serializer.INSTANCE, txnContextualModel.selfServiceTools);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && txnContextualModel.transactionInformation == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, TransactionBean$$serializer.INSTANCE, txnContextualModel.transactionInformation);
    }

    public TxnContextualModel(ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, GetSupportRatingBean getSupportRatingBean, RelatedArticleListModel relatedArticleListModel, @NotNull ContextualScenario contextualScenario, SelfServiceTools selfServiceTools, TransactionBean transactionBean) {
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        this.contactInformation = contactInfoBean;
        this.contextualScenario = contextualScenarioModel;
        this.rating = getSupportRatingBean;
        this.relatedArticles = relatedArticleListModel;
        this.scenarioKey = contextualScenario;
        this.selfServiceTools = selfServiceTools;
        this.transactionInformation = transactionBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.ContactInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContactInfoBean) : (r7v0 com.okinc.okex.center.bean.ContactInfoBean))
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r8v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean) : (r9v0 com.okinc.okex.rating.bean.GetSupportRatingBean))
  (wrap:com.okinc.okex.center.bean.RelatedArticleListModel:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.RelatedArticleListModel) : (r10v0 com.okinc.okex.center.bean.RelatedArticleListModel))
  (wrap:com.okinc.okex.center.bean.enums.ContextualScenario:0x0023: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okex.center.bean.enums.ContextualScenario:0x0021: SGET  A[WRAPPED] (LINE:15) com.okinc.okex.center.bean.enums.ContextualScenario.Unknown com.okinc.okex.center.bean.enums.ContextualScenario) : (r11v0 com.okinc.okex.center.bean.enums.ContextualScenario))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r12v0 com.okinc.okex.center.bean.SelfServiceTools))
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r13v0 com.okinc.okex.center.bean.TransactionBean))
 A[MD:(com.okinc.okex.center.bean.ContactInfoBean, com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.rating.bean.GetSupportRatingBean, com.okinc.okex.center.bean.RelatedArticleListModel, com.okinc.okex.center.bean.enums.ContextualScenario, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.TransactionBean):void (m)] (LINE:10) call: com.okinc.okex.center.bean.TxnContextualModel.<init>(com.okinc.okex.center.bean.ContactInfoBean, com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.rating.bean.GetSupportRatingBean, com.okinc.okex.center.bean.RelatedArticleListModel, com.okinc.okex.center.bean.enums.ContextualScenario, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.TransactionBean):void type: THIS */
    public /* synthetic */ TxnContextualModel(ContactInfoBean contactInfoBean, ContextualScenarioModel contextualScenarioModel, GetSupportRatingBean getSupportRatingBean, RelatedArticleListModel relatedArticleListModel, ContextualScenario contextualScenario, SelfServiceTools selfServiceTools, TransactionBean transactionBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contactInfoBean, (i & 2) != 0 ? null : contextualScenarioModel, (i & 4) != 0 ? null : getSupportRatingBean, (i & 8) != 0 ? null : relatedArticleListModel, (i & 16) != 0 ? ContextualScenario.Unknown : contextualScenario, (i & 32) != 0 ? null : selfServiceTools, (i & 64) != 0 ? null : transactionBean);
    }
}
