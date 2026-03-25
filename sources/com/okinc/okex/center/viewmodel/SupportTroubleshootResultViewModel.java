package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SuggestedActionBean;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.bean.enums.ContextualScenario;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel;
import com.okinc.okex.rating.net.RatingResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import o.AbstractC33073mpa;
import o.AbstractC45235slv;
import o.C32942mnB;
import o.C33492mxV;
import o.C44711scA;
import o.C45074sit;
import o.C45076siv;
import o.C45077siw;
import o.C45299snF;
import o.C45361soO;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC56387yDm;
import o.sxK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootResultViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableLiveData<Boolean> AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final LiveData<Boolean> AhwBna;
    public final LiveData<RatingResult> AkhnZx;
    public final StateFlow<AbstractC45235slv> DbNXlk;
    public final MutableLiveData<List<SupportFaqArticle>> EZpvd;
    public final MutableLiveData<TroubleshootResultAdapter.TaskDescription> KWHzl;
    public final MutableLiveData<TroubleshootResultPageData> copydefault;
    public final LiveData<ChatbotEntryDisplayModel> djBIcL;
    public final MutableLiveData<List<SelfServiceToolBean>> gEmmrt;
    public final LiveData<Boolean> isConnected;
    public final MutableStateFlow<AbstractC45235slv> valueOf;
    public final InterfaceC56387yDm values;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContextualScenario.values().length];
            try {
                iArr[ContextualScenario.TransactionDepositCompleted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositUntradable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositUnfinished.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<SupportFaqArticle>> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ChatbotEntryDisplayModel> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> ejfBZ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC45235slv> fIwbmz() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TroubleshootResultAdapter.TaskDescription> gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<SelfServiceToolBean>> valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RatingResult> values() {
        return this.AkhnZx;
    }

    public SupportTroubleshootResultViewModel() {
        MutableStateFlow<AbstractC45235slv> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC45235slv.ActionBar.copydefault);
        this.valueOf = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableLiveData<TroubleshootResultPageData> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.KWHzl = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.AhwBna = Transformations.map(AYXKKw(), new Function1() { // from class: o.slp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SupportTroubleshootResultViewModel.KWHzl(this.KWHzl, (java.util.List) obj));
            }
        });
        this.isConnected = Transformations.map(AYXKKw(), new Function1() { // from class: o.slr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SupportTroubleshootResultViewModel.OLrzqt(this.KWHzl, (java.util.List) obj));
            }
        });
        MutableLiveData mutableLiveDataKWHzl = C32942mnB.KWHzl(mutableLiveData, new Function1() { // from class: o.slo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultViewModel.AEQbTJ((TroubleshootResultPageData) obj);
            }
        });
        this.AkhnZx = mutableLiveDataKWHzl;
        this.gEmmrt = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this.AEQbTJ = mutableLiveData2;
        this.AYXKKw = Transformations.map(C32942mnB.OLrzqt(mutableLiveDataKWHzl, mutableLiveData2), new Function1() { // from class: o.slq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SupportTroubleshootResultViewModel.AEQbTJ((kotlin.Pair) obj));
            }
        });
        this.djBIcL = C32942mnB.KWHzl(mutableLiveData, new Function1() { // from class: o.slu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultViewModel.KWHzl((TroubleshootResultPageData) obj);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.slx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportTroubleshootResultViewModel.KWHzl();
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final int AEQbTJ() {
        List<SupportFaqArticle> relatedArticles;
        TroubleshootResultPageData value = this.copydefault.getValue();
        if (value == null || (relatedArticles = value.getRelatedArticles()) == null) {
            return 0;
        }
        return relatedArticles.size();
    }

    public static final boolean KWHzl(SupportTroubleshootResultViewModel supportTroubleshootResultViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return supportTroubleshootResultViewModel.AEQbTJ() > 6 && list.size() < supportTroubleshootResultViewModel.AEQbTJ();
    }

    public static final boolean OLrzqt(SupportTroubleshootResultViewModel supportTroubleshootResultViewModel, List list) {
        TroubleshootResultPageData value;
        Intrinsics.checkNotNullParameter(list, "");
        return list.size() == supportTroubleshootResultViewModel.AEQbTJ() && (value = supportTroubleshootResultViewModel.copydefault.getValue()) != null && value.getShowFullArticleList();
    }

    public static final RatingResult AEQbTJ(TroubleshootResultPageData troubleshootResultPageData) {
        return troubleshootResultPageData.getSupportRatingResult();
    }

    public static final boolean AEQbTJ(Pair pair) {
        return Intrinsics.EZpvd((Boolean) pair.component2(), Boolean.FALSE) && sxK.copydefault.OLrzqt((RatingResult) pair.component1());
    }

    public final void fARcdN() {
        this.AEQbTJ.setValue(Boolean.TRUE);
    }

    public static final ChatbotEntryDisplayModel KWHzl(TroubleshootResultPageData troubleshootResultPageData) {
        return troubleshootResultPageData.getContactInformation();
    }

    public final TransactionDisplayModel isConnected() {
        TroubleshootResultPageData value = this.copydefault.getValue();
        if (value != null) {
            return value.getTransactionCard();
        }
        return null;
    }

    public final TransactionType fJNWhG() {
        TransactionDisplayModel transactionDisplayModelIsConnected = isConnected();
        if (transactionDisplayModelIsConnected != null) {
            return transactionDisplayModelIsConnected.getTransactionType();
        }
        return null;
    }

    public final String AuCTel() {
        TransactionDisplayModel transactionDisplayModelIsConnected = isConnected();
        if (transactionDisplayModelIsConnected != null) {
            return transactionDisplayModelIsConnected.getStatusValue();
        }
        return null;
    }

    private final ContextualScenarioModel getNewProxyInstance() {
        TroubleshootResultPageData value = this.copydefault.getValue();
        if (value != null) {
            return value.getContextualScenario();
        }
        return null;
    }

    public final String djBIcL() {
        ContextualScenarioModel newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            return newProxyInstance.getSlug();
        }
        return null;
    }

    public final String DbNXlk() {
        return (String) this.values.getValue();
    }

    public static final String KWHzl() {
        return "cg_" + IntegratedSolutionPageType.Transaction.getChatbotSuffix() + "_depositselfservicetool";
    }

    public final void OLrzqt(@NotNull TroubleshootResultPageData troubleshootResultPageData) {
        Intrinsics.checkNotNullParameter(troubleshootResultPageData, "");
        this.copydefault.setValue(troubleshootResultPageData);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportTroubleshootResultViewModel$processPageData$1(this, troubleshootResultPageData, null), 3, null);
    }

    public final String KWHzl(@NotNull ContextualScenario contextualScenario) {
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        int i = StateListAnimator.AEQbTJ[contextualScenario.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? "transaction_found" : contextualScenario.getValue();
    }

    public final void OLrzqt(boolean z) {
        List<SupportFaqArticle> relatedArticles;
        TroubleshootResultPageData value = this.copydefault.getValue();
        if (value == null || (relatedArticles = value.getRelatedArticles()) == null) {
            return;
        }
        MutableLiveData<List<SupportFaqArticle>> mutableLiveData = this.EZpvd;
        if (z) {
            relatedArticles = CollectionsKt___CollectionsKt.AhwBna((Iterable) relatedArticles, 6);
        }
        mutableLiveData.setValue(relatedArticles);
    }

    public final FullArticleListActivity.FullArticleListRequest OLrzqt() {
        ContextualScenarioModel newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            return new FullArticleListActivity.FullArticleListRequest(newProxyInstance.getTitle(), FullArticleListActivity.FilterListBy.TAGS, newProxyInstance.getTags(), null, null, null, null, null, 248, null);
        }
        return null;
    }

    public final C45299snF fetchVPNInfo() {
        TransactionDisplayModel transactionCard;
        Integer currencyId;
        TroubleshootResultPageData value = this.copydefault.getValue();
        if (value == null || (transactionCard = value.getTransactionCard()) == null || (currencyId = transactionCard.getCurrencyId()) == null) {
            return null;
        }
        return new C45299snF(currencyId.intValue(), transactionCard.getTransactionTag() == TransactionTagLabel.Untradable, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(TroubleshootResultPageData troubleshootResultPageData, Continuation<? super TroubleshootResultAdapter.TaskDescription> continuation) throws Throwable {
        SupportTroubleshootResultViewModel$parseResultData$1 supportTroubleshootResultViewModel$parseResultData$1;
        SupportTroubleshootResultViewModel supportTroubleshootResultViewModel;
        ParseResult parseResult;
        if (continuation instanceof SupportTroubleshootResultViewModel$parseResultData$1) {
            supportTroubleshootResultViewModel$parseResultData$1 = (SupportTroubleshootResultViewModel$parseResultData$1) continuation;
            int i = supportTroubleshootResultViewModel$parseResultData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportTroubleshootResultViewModel$parseResultData$1.label = i - Integer.MIN_VALUE;
            } else {
                supportTroubleshootResultViewModel$parseResultData$1 = new SupportTroubleshootResultViewModel$parseResultData$1(this, continuation);
            }
        }
        Object objWithContext = supportTroubleshootResultViewModel$parseResultData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportTroubleshootResultViewModel$parseResultData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherEZpvd = C44711scA.EZpvd.EZpvd();
            SupportTroubleshootResultViewModel$parseResultData$2 supportTroubleshootResultViewModel$parseResultData$2 = new SupportTroubleshootResultViewModel$parseResultData$2(troubleshootResultPageData, this, null);
            supportTroubleshootResultViewModel$parseResultData$1.L$0 = this;
            supportTroubleshootResultViewModel$parseResultData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherEZpvd, supportTroubleshootResultViewModel$parseResultData$2, supportTroubleshootResultViewModel$parseResultData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            supportTroubleshootResultViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                parseResult = (ParseResult) supportTroubleshootResultViewModel$parseResultData$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                return parseResult.getModel();
            }
            supportTroubleshootResultViewModel = (SupportTroubleshootResultViewModel) supportTroubleshootResultViewModel$parseResultData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        ParseResult parseResult2 = (ParseResult) objWithContext;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        SupportTroubleshootResultViewModel$parseResultData$3$1 supportTroubleshootResultViewModel$parseResultData$3$1 = new SupportTroubleshootResultViewModel$parseResultData$3$1(parseResult2, supportTroubleshootResultViewModel, null);
        supportTroubleshootResultViewModel$parseResultData$1.L$0 = parseResult2;
        supportTroubleshootResultViewModel$parseResultData$1.label = 2;
        if (BuildersKt.withContext(main, supportTroubleshootResultViewModel$parseResultData$3$1, supportTroubleshootResultViewModel$parseResultData$1) == objCopydefault) {
            return objCopydefault;
        }
        parseResult = parseResult2;
        return parseResult.getModel();
    }

    public static final class ParseResult {
        private final Throwable error;
        private final TroubleshootResultAdapter.TaskDescription model;
        private final List<SelfServiceToolBean> selfServiceTools;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel$ParseResult */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParseResult copy$default(ParseResult parseResult, TroubleshootResultAdapter.TaskDescription taskDescription, List list, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                taskDescription = parseResult.model;
            }
            if ((i & 2) != 0) {
                list = parseResult.selfServiceTools;
            }
            if ((i & 4) != 0) {
                th = parseResult.error;
            }
            return parseResult.copy(taskDescription, list, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TroubleshootResultAdapter.TaskDescription component1() {
            return this.model;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SelfServiceToolBean> component2() {
            return this.selfServiceTools;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Throwable component3() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ParseResult copy(TroubleshootResultAdapter.TaskDescription taskDescription, List<SelfServiceToolBean> list, Throwable th) {
            return new ParseResult(taskDescription, list, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParseResult)) {
                return false;
            }
            ParseResult parseResult = (ParseResult) obj;
            return Intrinsics.EZpvd(this.model, parseResult.model) && Intrinsics.EZpvd(this.selfServiceTools, parseResult.selfServiceTools) && Intrinsics.EZpvd(this.error, parseResult.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TroubleshootResultAdapter.TaskDescription getModel() {
            return this.model;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SelfServiceToolBean> getSelfServiceTools() {
            return this.selfServiceTools;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            TroubleshootResultAdapter.TaskDescription taskDescription = this.model;
            int iHashCode = taskDescription == null ? 0 : taskDescription.hashCode();
            List<SelfServiceToolBean> list = this.selfServiceTools;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            Throwable th = this.error;
            return (((iHashCode * 31) + iHashCode2) * 31) + (th != null ? th.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ParseResult(model=" + this.model + ", selfServiceTools=" + this.selfServiceTools + ", error=" + this.error + ")";
        }

        public ParseResult(TroubleshootResultAdapter.TaskDescription taskDescription, List<SelfServiceToolBean> list, Throwable th) {
            this.model = taskDescription;
            this.selfServiceTools = list;
            this.error = th;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter$TaskDescription)
  (r2v0 java.util.List)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter$TaskDescription, java.util.List<com.okinc.okex.center.bean.SelfServiceToolBean>, java.lang.Throwable):void (m)] (LINE:258) call: com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel.ParseResult.<init>(com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter$TaskDescription, java.util.List, java.lang.Throwable):void type: THIS */
        public /* synthetic */ ParseResult(TroubleshootResultAdapter.TaskDescription taskDescription, List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(taskDescription, list, (i & 4) != 0 ? null : th);
        }
    }

    public final C45076siv KWHzl(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel) {
        String iconBright;
        String id = transactionDisplayModel.getId();
        TransactionType transactionType = transactionDisplayModel.getTransactionType();
        String cause = contextualScenarioModel.getCause();
        if (C33492mxV.OLrzqt()) {
            iconBright = contextualScenarioModel.getIconDark();
        } else {
            iconBright = contextualScenarioModel.getIconBright();
        }
        return new C45076siv(id, transactionType, cause, iconBright, transactionDisplayModel.getDisplayAmountHeader(), transactionDisplayModel.getDisplayAmountFullColour(), transactionDisplayModel.getDisplayTransactionTag(), transactionDisplayModel.getDisplayDescription(), transactionDisplayModel.getDisplayStatus(), transactionDisplayModel.getDisplayDateTime());
    }

    public final C45077siw EZpvd(ContextualScenarioModel contextualScenarioModel, SelfServiceToolBean selfServiceToolBean) {
        return new C45077siw(contextualScenarioModel.getCause(), contextualScenarioModel.getTitle(), contextualScenarioModel.getDescription(), selfServiceToolBean);
    }

    public final C45074sit copydefault(ContextualScenarioModel contextualScenarioModel, List<SuggestedActionBean> list) {
        String title = contextualScenarioModel.getTitle();
        String description = contextualScenarioModel.getDescription();
        if (list == null) {
            list = yDY.AhwBna();
        }
        return new C45074sit(title, description, list);
    }

    public final List<SuggestedActionBean> copydefault(SelfServiceToolBean selfServiceToolBean) {
        JsonArray jsonArrayOLrzqt;
        if (selfServiceToolBean == null || (jsonArrayOLrzqt = C45361soO.OLrzqt(selfServiceToolBean.getExtra(), "items")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(jsonArrayOLrzqt, 10));
        int i = 0;
        for (JsonElement jsonElement : jsonArrayOLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            JsonElement jsonElement2 = jsonElement;
            String strCopydefault = C45361soO.copydefault(JsonElementKt.getJsonObject(jsonElement2), "title");
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            String strCopydefault2 = C45361soO.copydefault(JsonElementKt.getJsonObject(jsonElement2), "description");
            arrayList.add(new SuggestedActionBean(strCopydefault, strCopydefault2 != null ? strCopydefault2 : "", i == yDY.AuCTel(jsonArrayOLrzqt) ? selfServiceToolBean : null));
            i++;
        }
        return arrayList;
    }
}
