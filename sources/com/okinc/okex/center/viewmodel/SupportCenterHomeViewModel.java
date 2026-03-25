package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.DisplayControl;
import com.okinc.okex.center.bean.LandingTransactionDisplayModel;
import com.okinc.okex.center.bean.RecentActivities;
import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.RecommendationCardLabel;
import com.okinc.okex.center.bean.RecommendationSection;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.SupportBannerBean;
import com.okinc.okex.center.bean.SupportLandingResponse;
import com.okinc.okex.center.bean.TopTopics;
import com.okinc.okex.center.bean.TopicBean;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.bean.enums.RecommendSection;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C33129mqd;
import o.C33492mxV;
import o.C44854sel;
import o.C44855sem;
import o.C44860ser;
import o.C45073sis;
import o.C45348soB;
import o.C45366soT;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final MutableLiveData<C32989mnw<Boolean>> AEQbTJ;
    public final MutableStateFlow<StateListAnimator> AYXKKw;
    public final SavedStateHandle AhwBna;
    public final MutableLiveData<C32989mnw<Pair<String, List<LandingTransactionDisplayModel>>>> EZpvd;
    public final MutableLiveData<C32989mnw<Boolean>> KWHzl;
    public final MutableLiveData<C32989mnw<SupportBannerBean>> OLrzqt;
    public final CoroutineDispatcher djBIcL;
    public final StateFlow<StateListAnimator> gEmmrt;
    public final C45348soB valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<SupportBannerBean>> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<String, List<LandingTransactionDisplayModel>>>> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> valueOf() {
        return this.KWHzl;
    }

    @yCM
    public SupportCenterHomeViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SavedStateHandle savedStateHandle, @NotNull C45348soB c45348soB) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c45348soB, "");
        this.djBIcL = coroutineDispatcher;
        this.AhwBna = savedStateHandle;
        this.valueOf = c45348soB;
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.ActionBar.copydefault);
        this.AYXKKw = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.OLrzqt = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends StateListAnimator {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends StateListAnimator {
            public final Pair<Boolean, Integer> AEQbTJ;
            public final boolean AYXKKw;
            public final List<TopicListItem> AhwBna;
            public final ChatbotEntryDisplayModel EZpvd;
            public final AnnouncementPopupDisplayModel KWHzl;
            public final List<SelfServiceDisplayModel> OLrzqt;
            public final List<RecommendCardDisplayModel.CommonDisplayModel> copydefault;
            public final boolean djBIcL;
            public final boolean valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull List<RecommendCardDisplayModel.CommonDisplayModel> list, @NotNull Pair<Boolean, Integer> pair, @NotNull List<? extends TopicListItem> list2, @NotNull List<SelfServiceDisplayModel> list3, ChatbotEntryDisplayModel chatbotEntryDisplayModel, boolean z, boolean z2, boolean z3, AnnouncementPopupDisplayModel announcementPopupDisplayModel) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(pair, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return new Activity(list, pair, list2, list3, chatbotEntryDisplayModel, z, z2, z3, announcementPopupDisplayModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<SelfServiceDisplayModel> AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AYXKKw() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<TopicListItem> AhwBna() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<RecommendCardDisplayModel.CommonDisplayModel> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pair<Boolean, Integer> KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AnnouncementPopupDisplayModel OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChatbotEntryDisplayModel copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean djBIcL() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && this.djBIcL == activity.djBIcL && this.valueOf == activity.valueOf && this.AYXKKw == activity.AYXKKw && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean gEmmrt() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                int iHashCode2 = this.AEQbTJ.hashCode();
                int iHashCode3 = this.AhwBna.hashCode();
                int iHashCode4 = this.OLrzqt.hashCode();
                ChatbotEntryDisplayModel chatbotEntryDisplayModel = this.EZpvd;
                int iHashCode5 = chatbotEntryDisplayModel == null ? 0 : chatbotEntryDisplayModel.hashCode();
                int iHashCode6 = Boolean.hashCode(this.djBIcL);
                int iHashCode7 = Boolean.hashCode(this.valueOf);
                int iHashCode8 = Boolean.hashCode(this.AYXKKw);
                AnnouncementPopupDisplayModel announcementPopupDisplayModel = this.KWHzl;
                return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (announcementPopupDisplayModel != null ? announcementPopupDisplayModel.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(recommendationSection=" + this.copydefault + ", recentActivitySection=" + this.AEQbTJ + ", topTopicsSection=" + this.AhwBna + ", selfServiceSection=" + this.OLrzqt + ", contactInformation=" + this.EZpvd + ", showExpandedContactUs=" + this.djBIcL + ", showSearchBar=" + this.valueOf + ", showTopTopicsViewAll=" + this.AYXKKw + ", popupAnnouncement=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.TopicListItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(@NotNull List<RecommendCardDisplayModel.CommonDisplayModel> list, @NotNull Pair<Boolean, Integer> pair, @NotNull List<? extends TopicListItem> list2, @NotNull List<SelfServiceDisplayModel> list3, ChatbotEntryDisplayModel chatbotEntryDisplayModel, boolean z, boolean z2, boolean z3, AnnouncementPopupDisplayModel announcementPopupDisplayModel) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(pair, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                this.copydefault = list;
                this.AEQbTJ = pair;
                this.AhwBna = list2;
                this.OLrzqt = list3;
                this.EZpvd = chatbotEntryDisplayModel;
                this.djBIcL = z;
                this.valueOf = z2;
                this.AYXKKw = z3;
                this.KWHzl = announcementPopupDisplayModel;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends StateListAnimator {
            public final Exception KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = application.KWHzl;
                }
                return application.EZpvd(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new Application(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.KWHzl = exc;
            }
        }
    }

    public final ChatbotEntryDisplayModel KWHzl() {
        ChatbotEntryDisplayModel chatbotEntryDisplayModel = (ChatbotEntryDisplayModel) this.AhwBna.get("KEY_CHATBOT_ATTRIBUTES");
        return chatbotEntryDisplayModel == null ? new ChatbotEntryDisplayModel(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null) : chatbotEntryDisplayModel;
    }

    public final String gEmmrt() {
        String str = (String) this.AhwBna.get("KEY_TOLL_FREE_NUMBER");
        return str == null ? "" : str;
    }

    public static /* synthetic */ void getSupportLandingCards$default(SupportCenterHomeViewModel supportCenterHomeViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        supportCenterHomeViewModel.EZpvd(z, str);
    }

    public final void EZpvd(boolean z, String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportCenterHomeViewModel$getSupportLandingCards$1(z, this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(SupportLandingResponse supportLandingResponse, Continuation<? super Unit> continuation) throws Throwable {
        SupportCenterHomeViewModel$parseLandingCards$1 supportCenterHomeViewModel$parseLandingCards$1;
        SupportCenterHomeViewModel supportCenterHomeViewModel;
        if (continuation instanceof SupportCenterHomeViewModel$parseLandingCards$1) {
            supportCenterHomeViewModel$parseLandingCards$1 = (SupportCenterHomeViewModel$parseLandingCards$1) continuation;
            int i = supportCenterHomeViewModel$parseLandingCards$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterHomeViewModel$parseLandingCards$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterHomeViewModel$parseLandingCards$1 = new SupportCenterHomeViewModel$parseLandingCards$1(this, continuation);
            }
        }
        Object objWithContext = supportCenterHomeViewModel$parseLandingCards$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterHomeViewModel$parseLandingCards$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            SupportCenterHomeViewModel$parseLandingCards$state$1 supportCenterHomeViewModel$parseLandingCards$state$1 = new SupportCenterHomeViewModel$parseLandingCards$state$1(supportLandingResponse, this, null);
            supportCenterHomeViewModel$parseLandingCards$1.L$0 = this;
            supportCenterHomeViewModel$parseLandingCards$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, supportCenterHomeViewModel$parseLandingCards$state$1, supportCenterHomeViewModel$parseLandingCards$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            supportCenterHomeViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            supportCenterHomeViewModel = (SupportCenterHomeViewModel) supportCenterHomeViewModel$parseLandingCards$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        MutableStateFlow<StateListAnimator> mutableStateFlow = supportCenterHomeViewModel.AYXKKw;
        supportCenterHomeViewModel$parseLandingCards$1.L$0 = null;
        supportCenterHomeViewModel$parseLandingCards$1.label = 2;
        if (mutableStateFlow.emit((StateListAnimator.Activity) objWithContext, supportCenterHomeViewModel$parseLandingCards$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Pair<Boolean, Integer> KWHzl(DisplayControl displayControl, RecentActivities recentActivities) {
        List<TransactionBean> list;
        if (!C44854sel.OLrzqt(displayControl, RecommendSection.RECENT_ACTIVITIES)) {
            return new Pair<>(Boolean.FALSE, 0);
        }
        if (recentActivities == null || (list = recentActivities.getList()) == null || list.isEmpty()) {
            return new Pair<>(Boolean.FALSE, 0);
        }
        Integer hasIssueCount = recentActivities.getHasIssueCount();
        return new Pair<>(Boolean.TRUE, Integer.valueOf(hasIssueCount != null ? hasIssueCount.intValue() : 0));
    }

    public final List<TopicListItem> OLrzqt(DisplayControl displayControl, TopTopics topTopics) {
        ArrayList arrayList;
        List<TopicBean> list;
        if (!C44854sel.OLrzqt(displayControl, RecommendSection.TOP_TOPICS)) {
            return yDY.AhwBna();
        }
        if (topTopics == null || (list = topTopics.getList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C44860ser.AEQbTJ((TopicBean) it.next()));
            }
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sis.toTransactionDisplayModel$default(com.okinc.okex.center.bean.TransactionBean, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List, int, java.lang.Object):com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<RecommendCardDisplayModel.CommonDisplayModel> KWHzl(DisplayControl displayControl, List<RecommendationSection> list) {
        RecommendCardDisplayModel.CommonDisplayModel commonDisplayModel;
        String typeIconBright;
        String titleListMode;
        String description;
        RecommendCardDisplayModel.CommonDisplayModel.CardTag cardTagKWHzl;
        if (!C44854sel.OLrzqt(displayControl, RecommendSection.RECOMMENDATION_CARDS)) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (RecommendationSection recommendationSection : list) {
                RecommendationCard recommendationCard = recommendationSection.getRecommendationCard();
                if (recommendationCard != null) {
                    SelfServiceTools selfServiceTools = recommendationSection.getSelfServiceTools();
                    List<SelfServiceDisplayModel> listOLrzqt = OLrzqt(displayControl, selfServiceTools != null ? selfServiceTools.getList() : null);
                    SelfServiceToolBean primaryAction = recommendationSection.getRecommendationCard().getPrimaryAction();
                    boolean z = primaryAction != null;
                    boolean zEZpvd = Intrinsics.EZpvd((Object) "transaction", (Object) recommendationSection.getRecommendationCard().getScenario());
                    TransactionBean transaction = recommendationSection.getTransaction();
                    TransactionDisplayModel transactionDisplayModel$default = transaction != null ? C45073sis.toTransactionDisplayModel$default(transaction, null, null, 3, null) : null;
                    TransactionBean transaction2 = recommendationSection.getTransaction();
                    if (!C33492mxV.OLrzqt() ? (typeIconBright = recommendationCard.getTypeIconBright()) == null : (typeIconBright = recommendationCard.getTypeIconDark()) == null) {
                        typeIconBright = "";
                    }
                    String type = recommendationCard.getType();
                    if (type == null) {
                        type = "";
                    }
                    if (zEZpvd) {
                        titleListMode = transactionDisplayModel$default != null ? transactionDisplayModel$default.getDisplayDescription() : null;
                        if (titleListMode == null) {
                            titleListMode = "";
                        }
                        description = recommendationCard.getDescription();
                        if (description == null) {
                            description = "";
                        }
                        String title = !z ? primaryAction.getTitle() : null;
                        Long createdDate = recommendationCard.getCreatedDate();
                        String displayAmount = (zEZpvd || transactionDisplayModel$default == null) ? null : transactionDisplayModel$default.getDisplayAmount();
                        if (C33129mqd.KWHzl((Collection) recommendationCard.getLabels())) {
                            cardTagKWHzl = null;
                        } else {
                            List<RecommendationCardLabel> labels = recommendationCard.getLabels();
                            Intrinsics.copydefault(labels);
                            cardTagKWHzl = KWHzl((RecommendationCardLabel) CollectionsKt___CollectionsKt.AuCTelauCTel(labels));
                        }
                        commonDisplayModel = new RecommendCardDisplayModel.CommonDisplayModel(recommendationCard, transaction2, typeIconBright, type, cardTagKWHzl, titleListMode, description, displayAmount, title, createdDate, !C33129mqd.KWHzl((Collection) listOLrzqt) ? (SelfServiceDisplayModel) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt) : null, primaryAction);
                    } else {
                        titleListMode = recommendationCard.getTitleListMode();
                        if (titleListMode == null) {
                        }
                        description = recommendationCard.getDescription();
                        if (description == null) {
                        }
                        if (!z) {
                        }
                        Long createdDate2 = recommendationCard.getCreatedDate();
                        if (zEZpvd) {
                            if (C33129mqd.KWHzl((Collection) recommendationCard.getLabels())) {
                            }
                            commonDisplayModel = new RecommendCardDisplayModel.CommonDisplayModel(recommendationCard, transaction2, typeIconBright, type, cardTagKWHzl, titleListMode, description, displayAmount, title, createdDate2, !C33129mqd.KWHzl((Collection) listOLrzqt) ? (SelfServiceDisplayModel) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt) : null, primaryAction);
                        }
                    }
                } else {
                    commonDisplayModel = null;
                }
                if (commonDisplayModel != null) {
                    arrayList2.add(commonDisplayModel);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecommendCardDisplayModel.CommonDisplayModel.CardTag KWHzl(@NotNull RecommendationCardLabel recommendationCardLabel) {
        int i;
        Intrinsics.checkNotNullParameter(recommendationCardLabel, "");
        String color = recommendationCardLabel.getColor();
        if (color == null) {
            i = 11;
        } else {
            int iHashCode = color.hashCode();
            if (iHashCode != -734239628) {
                if (iHashCode != 112785) {
                    if (iHashCode == 98619139 && color.equals("green")) {
                        i = 8;
                    }
                } else if (color.equals("red")) {
                    i = 9;
                }
            } else if (color.equals("yellow")) {
                i = 10;
            }
        }
        String title = recommendationCardLabel.getTitle();
        return new RecommendCardDisplayModel.CommonDisplayModel.CardTag(title != null ? title : "", i);
    }

    public final List<SelfServiceDisplayModel> OLrzqt(DisplayControl displayControl, List<SelfServiceToolBean> list) {
        ArrayList arrayList;
        if (!C44854sel.OLrzqt(displayControl, RecommendSection.SELF_SERVICE_TOOLS)) {
            return yDY.AhwBna();
        }
        if (list != null) {
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C44855sem.OLrzqt((SelfServiceToolBean) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final void AkhnZx() {
        C45366soT.KWHzl.AhwBna();
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportCenterHomeViewModel$checkSupportBanner$1(this, null), 3, null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SupportCenterHomeViewModel$checkHomeTicketNewMsgStatus$1(this, null), 2, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SupportCenterHomeViewModel$checkChatBotHasNewMessage$1(this, null), 2, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SupportCenterHomeViewModel$getSupportLandingTransactionsList$1(this, str, null), 2, null);
    }
}
