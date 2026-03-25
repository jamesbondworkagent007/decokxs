package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.IntegratedSolutionPageData;
import com.okinc.okex.center.bean.MiniSupportResponse;
import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.viewmodel.SupportIntegratedSolutionViewModel$fetchData$1$1;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC45235slv;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45217sld extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final MutableLiveData<IntegratedSolutionPageData> AEQbTJ;
    public final MutableStateFlow<AbstractC45235slv> AYXKKw;
    public final LiveData<ChatbotEntryDisplayModel> AhwBna;
    public java.util.List<SupportFaqArticle> AkhnZx;
    public final IntegratedSolutionPageType AuCTel;
    public final LiveData<java.lang.Boolean> DbNXlk;
    public final MutableLiveData<java.lang.Boolean> EZpvd;
    public final MutableLiveData<C32989mnw<kotlin.Pair<java.lang.String, java.lang.String>>> KWHzl;
    public final MutableLiveData<java.util.List<SupportFaqArticle>> copydefault;
    public final MutableLiveData<AnnouncementPopupDisplayModel> djBIcL;
    public final LiveData<RatingResult> ejfBZ;
    public final LiveData<java.util.List<SelfServiceToolBean>> fARcdN;
    public RecommendationCard fIwbmz;
    public final LiveData<java.lang.Boolean> fJNWhG;
    public java.lang.String fetchVPNInfo;
    public final MutableLiveData<java.lang.String> gEmmrt;
    public TransactionDisplayModel getFieldNames;
    public final StateFlow<AbstractC45235slv> getNewProxyInstance;
    public TopicListItem.TopicItem hDKMBd;
    public MiniSupportResponse isConnected;
    public final LiveData<TransactionDisplayModel> iwGUEr;
    public final C45352soF uzCIH;
    public final MutableLiveData<java.lang.String> valueOf;
    public final LiveData<java.lang.Boolean> values;

    /* JADX INFO: renamed from: o.sld$Application */
    public interface Application {
        C45217sld EZpvd(@NotNull IntegratedSolutionPageType integratedSolutionPageType);
    }

    /* JADX INFO: renamed from: o.sld$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IntegratedSolutionPageType.values().length];
            try {
                iArr[IntegratedSolutionPageType.RecommendationCard.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[IntegratedSolutionPageType.Transaction.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[IntegratedSolutionPageType.HotTopic.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[IntegratedSolutionPageType.MiniSupport.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[TransactionType.values().length];
            try {
                iArr2[TransactionType.P2P.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TransactionType.Withdrawal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[TransactionType.Deposit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(MiniSupportResponse miniSupportResponse) {
        this.isConnected = miniSupportResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniSupportResponse AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationCard AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopicListItem.TopicItem AuCTel() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<SupportFaqArticle>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ChatbotEntryDisplayModel> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TransactionDisplayModel> fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<SelfServiceToolBean>> fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RatingResult> fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC45235slv> getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> hDKMBd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> isConnected() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel uzCIH() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<kotlin.Pair<java.lang.String, java.lang.String>>> valueOf() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AnnouncementPopupDisplayModel> values() {
        return this.djBIcL;
    }

    public C45217sld(@NotNull C45352soF c45352soF, @NotNull IntegratedSolutionPageType integratedSolutionPageType) {
        Intrinsics.checkNotNullParameter(c45352soF, "");
        Intrinsics.checkNotNullParameter(integratedSolutionPageType, "");
        this.uzCIH = c45352soF;
        this.AuCTel = integratedSolutionPageType;
        MutableStateFlow<AbstractC45235slv> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC45235slv.ActionBar.copydefault);
        this.AYXKKw = MutableStateFlow;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow);
        MutableLiveData<IntegratedSolutionPageData> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.valueOf = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.iwGUEr = C32942mnB.KWHzl(mutableLiveData, new Function1() { // from class: o.sli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45217sld.AYXKKw((IntegratedSolutionPageData) obj);
            }
        });
        this.fARcdN = C32942mnB.KWHzl(mutableLiveData, new Function1() { // from class: o.slf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45217sld.djBIcL((IntegratedSolutionPageData) obj);
            }
        });
        this.AkhnZx = new java.util.ArrayList();
        this.copydefault = new MutableLiveData<>();
        this.DbNXlk = Transformations.map(EZpvd(), new Function1() { // from class: o.slh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C45217sld.OLrzqt(this.EZpvd, (java.util.List) obj));
            }
        });
        this.fJNWhG = Transformations.map(EZpvd(), new Function1() { // from class: o.sle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C45217sld.copydefault(this.EZpvd, (java.util.List) obj));
            }
        });
        MutableLiveData mutableLiveDataKWHzl = C32942mnB.KWHzl(mutableLiveData, new Function1() { // from class: o.slg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45217sld.gEmmrt((IntegratedSolutionPageData) obj);
            }
        });
        this.ejfBZ = mutableLiveDataKWHzl;
        MutableLiveData<java.lang.Boolean> mutableLiveData2 = new MutableLiveData<>(java.lang.Boolean.FALSE);
        this.EZpvd = mutableLiveData2;
        this.values = Transformations.map(C32942mnB.OLrzqt(mutableLiveDataKWHzl, mutableLiveData2), new Function1() { // from class: o.sln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C45217sld.copydefault((kotlin.Pair) obj));
            }
        });
        this.AhwBna = C32942mnB.KWHzl(mutableLiveData, new Function1() { // from class: o.slj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45217sld.KWHzl((IntegratedSolutionPageData) obj);
            }
        });
        this.KWHzl = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o.sld$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sld.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.sld$ActionBar$Application */
        public static final class Application implements ViewModelProvider.Factory {
            public final /* synthetic */ IntegratedSolutionPageType EZpvd;
            public final /* synthetic */ Application copydefault;

            public Application(Application application, IntegratedSolutionPageType integratedSolutionPageType) {
                this.copydefault = application;
                this.EZpvd = integratedSolutionPageType;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                Intrinsics.checkNotNullParameter(cls, "");
                C45217sld c45217sldEZpvd = this.copydefault.EZpvd(this.EZpvd);
                Intrinsics.copydefault(c45217sldEZpvd, "");
                return c45217sldEZpvd;
            }
        }

        public final ViewModelProvider.Factory copydefault(@NotNull Application application, @NotNull IntegratedSolutionPageType integratedSolutionPageType) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(integratedSolutionPageType, "");
            return new Application(application, integratedSolutionPageType);
        }
    }

    public static final TransactionDisplayModel AYXKKw(IntegratedSolutionPageData integratedSolutionPageData) {
        return integratedSolutionPageData.getTransactionCard();
    }

    public static final java.util.List djBIcL(IntegratedSolutionPageData integratedSolutionPageData) {
        return integratedSolutionPageData.getSelfServiceTools();
    }

    public final ContextualScenarioModel KWHzl() {
        IntegratedSolutionPageData value = this.AEQbTJ.getValue();
        if (value != null) {
            return value.getContextualScenario();
        }
        return null;
    }

    public static final boolean OLrzqt(C45217sld c45217sld, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c45217sld.AkhnZx.size() > 6 && list.size() < c45217sld.AkhnZx.size();
    }

    public static final boolean copydefault(C45217sld c45217sld, java.util.List list) {
        IntegratedSolutionPageData value;
        Intrinsics.checkNotNullParameter(list, "");
        return list.size() == c45217sld.AkhnZx.size() && (value = c45217sld.AEQbTJ.getValue()) != null && value.getShowFullArticleList();
    }

    public static final RatingResult gEmmrt(IntegratedSolutionPageData integratedSolutionPageData) {
        return integratedSolutionPageData.getSupportRatingResult();
    }

    public static final boolean copydefault(kotlin.Pair pair) {
        return Intrinsics.EZpvd((java.lang.Boolean) pair.component2(), java.lang.Boolean.FALSE) && sxK.copydefault.OLrzqt((RatingResult) pair.component1());
    }

    public static final ChatbotEntryDisplayModel KWHzl(IntegratedSolutionPageData integratedSolutionPageData) {
        return integratedSolutionPageData.getContactInformation();
    }

    public final boolean iwGUEr() {
        return this.AuCTel == IntegratedSolutionPageType.MiniSupport;
    }

    public final TransactionType copydefault() {
        TransactionDisplayModel transactionDisplayModel = this.getFieldNames;
        if (transactionDisplayModel != null) {
            return transactionDisplayModel.getTransactionType();
        }
        return null;
    }

    public static /* synthetic */ void initData$default(C45217sld c45217sld, TransactionDisplayModel transactionDisplayModel, TopicListItem.TopicItem topicItem, RecommendationCard recommendationCard, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionDisplayModel = null;
        }
        if ((i & 2) != 0) {
            topicItem = null;
        }
        if ((i & 4) != 0) {
            recommendationCard = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        c45217sld.OLrzqt(transactionDisplayModel, topicItem, recommendationCard, str);
    }

    public final void OLrzqt(TransactionDisplayModel transactionDisplayModel, TopicListItem.TopicItem topicItem, RecommendationCard recommendationCard, java.lang.String str) {
        int i = TaskDescription.OLrzqt[this.AuCTel.ordinal()];
        if (i == 1) {
            this.fetchVPNInfo = recommendationCard != null ? recommendationCard.getId() : null;
            MutableLiveData<java.lang.String> mutableLiveData = this.valueOf;
            java.lang.String title = recommendationCard != null ? recommendationCard.getTitle() : null;
            mutableLiveData.setValue(title != null ? title : "");
            this.fIwbmz = recommendationCard;
            return;
        }
        if (i == 2) {
            this.fetchVPNInfo = transactionDisplayModel != null ? transactionDisplayModel.getId() : null;
            this.getFieldNames = transactionDisplayModel;
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.fetchVPNInfo = str;
        } else {
            this.fetchVPNInfo = topicItem != null ? topicItem.getId() : null;
            MutableLiveData<java.lang.String> mutableLiveData2 = this.valueOf;
            java.lang.String title2 = topicItem != null ? topicItem.getTitle() : null;
            mutableLiveData2.setValue(title2 != null ? title2 : "");
            this.gEmmrt.setValue(topicItem != null ? topicItem.getDescription() : null);
            this.hDKMBd = topicItem;
        }
    }

    public final void AEQbTJ() {
        java.lang.String str = this.fetchVPNInfo;
        if (str == null || BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), C44711scA.EZpvd.KWHzl(), null, new SupportIntegratedSolutionViewModel$fetchData$1$1(this, str, null), 2, null) == null) {
            this.AYXKKw.setValue(AbstractC45235slv.StateListAnimator.copydefault);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void AuCTelauCTel() {
        this.EZpvd.setValue(java.lang.Boolean.TRUE);
    }

    public final void OLrzqt(java.util.List<SupportFaqArticle> list) {
        this.copydefault.setValue(list);
    }

    public final void getFieldNames() {
        OLrzqt(this.AkhnZx);
    }

    public final java.lang.String KWHzl(TransactionType transactionType) {
        int i = transactionType == null ? -1 : TaskDescription.copydefault[transactionType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C47315tni.PendingIntent.hDKMBd);
        }
        if (i != 2) {
            return i != 3 ? "" : C33070mpX.AYXKKw(C47315tni.PendingIntent.ejfBZ);
        }
        return C33070mpX.AYXKKw(C47315tni.PendingIntent.fJNWhG);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FullArticleListActivity.FullArticleListRequest DbNXlk() {
        java.lang.String strKWHzl;
        FullArticleListActivity.FilterListBy filterListBy;
        java.util.List<java.lang.String> tags;
        java.util.List<java.lang.String> tags2;
        FullArticleListActivity.FilterListBy filterListBy2;
        java.lang.String value;
        int i = TaskDescription.OLrzqt[this.AuCTel.ordinal()];
        if (i == 1) {
            java.lang.String value2 = isConnected().getValue();
            strKWHzl = value2 != null ? value2 : "";
            filterListBy = FullArticleListActivity.FilterListBy.TAGS;
            RecommendationCard recommendationCard = this.fIwbmz;
            if (recommendationCard == null || (tags = recommendationCard.getTags()) == null) {
                return null;
            }
        } else if (i == 2) {
            strKWHzl = KWHzl(copydefault());
            ContextualScenarioModel contextualScenarioModelKWHzl = KWHzl();
            if (contextualScenarioModelKWHzl != null) {
                FullArticleListActivity.FilterListBy filterListBy3 = FullArticleListActivity.FilterListBy.TAGS;
                tags2 = contextualScenarioModelKWHzl.getTags();
                filterListBy2 = filterListBy3;
                java.lang.String str = strKWHzl;
                TopicListItem.TopicItem topicItem = this.hDKMBd;
                java.lang.String slug = topicItem == null ? topicItem.getSlug() : null;
                RecommendationCard recommendationCard2 = this.fIwbmz;
                java.lang.String dataTrackingKey = recommendationCard2 == null ? recommendationCard2.getDataTrackingKey() : null;
                TransactionType transactionTypeCopydefault = copydefault();
                java.lang.String value3 = transactionTypeCopydefault == null ? transactionTypeCopydefault.getValue() : null;
                TransactionDisplayModel transactionDisplayModel = this.getFieldNames;
                return new FullArticleListActivity.FullArticleListRequest(str, filterListBy2, tags2, null, slug, transactionDisplayModel != null ? transactionDisplayModel.getStatusValue() : null, value3, dataTrackingKey, 8, null);
            }
            filterListBy = FullArticleListActivity.FilterListBy.TRANSACTION_TYPE;
            TransactionType transactionTypeCopydefault2 = copydefault();
            if (transactionTypeCopydefault2 == null || (value = transactionTypeCopydefault2.getValue()) == null || (tags = C56402yEa.EZpvd(value)) == null) {
                return null;
            }
        } else if (i == 3) {
            java.lang.String value4 = isConnected().getValue();
            strKWHzl = value4 != null ? value4 : "";
            filterListBy = FullArticleListActivity.FilterListBy.TAGS;
            TopicListItem.TopicItem topicItem2 = this.hDKMBd;
            if (topicItem2 == null || (tags = topicItem2.getTags()) == null) {
                return null;
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String value5 = isConnected().getValue();
            strKWHzl = value5 != null ? value5 : "";
            filterListBy = FullArticleListActivity.FilterListBy.TAGS;
            MiniSupportResponse miniSupportResponse = this.isConnected;
            if (miniSupportResponse == null || (tags = miniSupportResponse.getTags()) == null) {
                return null;
            }
        }
        filterListBy2 = filterListBy;
        tags2 = tags;
        java.lang.String str2 = strKWHzl;
        TopicListItem.TopicItem topicItem3 = this.hDKMBd;
        if (topicItem3 == null) {
        }
        RecommendationCard recommendationCard22 = this.fIwbmz;
        if (recommendationCard22 == null) {
        }
        TransactionType transactionTypeCopydefault3 = copydefault();
        if (transactionTypeCopydefault3 == null) {
        }
        TransactionDisplayModel transactionDisplayModel2 = this.getFieldNames;
        return new FullArticleListActivity.FullArticleListRequest(str2, filterListBy2, tags2, null, slug, transactionDisplayModel2 != null ? transactionDisplayModel2.getStatusValue() : null, value3, dataTrackingKey, 8, null);
    }

    public final C45299snF fIwbmz() {
        java.lang.Integer currencyId;
        TransactionDisplayModel value = this.iwGUEr.getValue();
        if (value == null || (currencyId = value.getCurrencyId()) == null) {
            return null;
        }
        return new C45299snF(currencyId.intValue(), value.getTransactionTag() == TransactionTagLabel.Untradable, null, 4, null);
    }
}
