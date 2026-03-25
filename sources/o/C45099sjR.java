package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.event.SupportCenterEvent;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.ui.adapter.LoadingAdapter;
import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import com.okinc.okex.center.ui.adapter.TopicListAdapter;
import com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$initView$3;
import com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$onChatbotClicked$1$1;
import com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sjR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45099sjR extends AbstractC45035siG implements RatingChatbotAdapter.ActionBar, TopicListAdapter.StateListAnimator {
    public final InterfaceC56387yDm AhwBna;
    public AbstractC47345toL DbNXlk;
    public final int djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public ConcatAdapter gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.sjR$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C45099sjR() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportRecommendTopicViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.djBIcL = C47315tni.ActionBar.QbewEr;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45099sjR.AhwBna(this.KWHzl);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.sjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45099sjR.djBIcL(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.sjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45099sjR.gEmmrt();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ska
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45099sjR.valueOf();
            }
        });
        this.gEmmrt = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[0]);
    }

    public final SupportRecommendTopicViewModel djBIcL() {
        return (SupportRecommendTopicViewModel) this.isConnected.getValue();
    }

    private final RatingChatbotAdapter values() {
        return (RatingChatbotAdapter) this.fetchVPNInfo.getValue();
    }

    public static final RatingChatbotAdapter AhwBna(C45099sjR c45099sjR) {
        RatingChatbotAdapter ratingChatbotAdapter = new RatingChatbotAdapter();
        ratingChatbotAdapter.EZpvd(true);
        ratingChatbotAdapter.AEQbTJ(c45099sjR);
        ratingChatbotAdapter.copydefault(new Function1() { // from class: o.skf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45099sjR.AEQbTJ((EventParamsList) obj);
            }
        });
        return ratingChatbotAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", SupportCenterEvent.ArticlePageParam.ExploreTopics.getValue(), true);
        EventParamsList.put$default(eventParamsList, "page_topic_name", "", false, 4, null);
        eventParamsList.put("mini_support_page", "false", true);
        return Unit.INSTANCE;
    }

    private final TopicListAdapter AkhnZx() {
        return (TopicListAdapter) this.values.getValue();
    }

    public static final TopicListAdapter djBIcL(C45099sjR c45099sjR) {
        TopicListAdapter topicListAdapter = new TopicListAdapter(false);
        topicListAdapter.copydefault(c45099sjR);
        return topicListAdapter;
    }

    public final LoadingAdapter AhwBna() {
        return (LoadingAdapter) this.valueOf.getValue();
    }

    public static final LoadingAdapter gEmmrt() {
        return new LoadingAdapter(LoadingAdapter.LoadingStyle.RECENT_ACTIVITY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44987shL fetchVPNInfo() {
        return (C44987shL) this.AhwBna.getValue();
    }

    public static final C44987shL valueOf() {
        C44987shL c44987shL = new C44987shL();
        C44987shL.updateEmptyProperties$default(c44987shL, 6, C33070mpX.AYXKKw(C47315tni.PendingIntent.AubY), null, null, 12, null);
        return c44987shL;
    }

    /* JADX INFO: renamed from: o.sjR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sjR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C45099sjR KWHzl() {
            return new C45099sjR();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47345toL abstractC47345toLCopydefault = AbstractC47345toL.copydefault(view);
        this.DbNXlk = abstractC47345toLCopydefault;
        if (abstractC47345toLCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC47345toLCopydefault = null;
        }
        RecyclerView recyclerView = abstractC47345toLCopydefault.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new C45388sop(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA)));
        recyclerView.addItemDecoration(new C45393sou(values(), recyclerView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ODWQjV), 0, true, 4, null));
        ConcatAdapter concatAdapter = this.gEmmrt;
        concatAdapter.addAdapter(AkhnZx());
        concatAdapter.addAdapter(AhwBna());
        concatAdapter.addAdapter(fetchVPNInfo());
        concatAdapter.addAdapter(values());
        recyclerView.setAdapter(concatAdapter);
        C55173xeu c55173xeu = abstractC47345toLCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        new C45144skJ(c55173xeu).KWHzl(new View.OnClickListener() { // from class: o.sjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C45099sjR.AEQbTJ(this.KWHzl, view2);
            }
        });
        djBIcL().OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.sjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45099sjR.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SupportRecommendedTopicFragment$initView$3(this, null));
        djBIcL().KWHzl();
    }

    public static final void AEQbTJ(C45099sjR c45099sjR, android.view.View view) {
        c45099sjR.djBIcL().KWHzl();
    }

    public static final Unit copydefault(C45099sjR c45099sjR, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c45099sjR.values().KWHzl();
        } else {
            c45099sjR.values().EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.util.List<? extends TopicListItem> list) {
        TopicListAdapter topicListAdapterAkhnZx = AkhnZx();
        AbstractC47345toL abstractC47345toL = this.DbNXlk;
        if (abstractC47345toL == null) {
            Intrinsics.gEmmrt("");
            abstractC47345toL = null;
        }
        RecyclerView recyclerView = abstractC47345toL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        topicListAdapterAkhnZx.copydefault(recyclerView, (java.util.List) list);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sgn.createIntent$default(o.sgn, android.content.Context, com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.TopicListItem$TopicItem, com.okinc.okex.center.bean.RecommendationCard, java.lang.String, com.okinc.okex.center.bean.enums.IntegratedSolutionPageType, int, java.lang.Object):android.content.Intent */
    @Override // com.okinc.okex.center.ui.adapter.TopicListAdapter.StateListAnimator
    public void OLrzqt(@NotNull final TopicListItem.TopicItem topicItem) {
        Intrinsics.checkNotNullParameter(topicItem, "");
        android.content.Context context = getContext();
        if (context != null) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Topics_DetailPage_Click", false, new Function1() { // from class: o.sjS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45099sjR.OLrzqt(topicItem, (EventParamsList) obj);
                }
            }, 1, null);
            startActivity(C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : topicItem, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null, IntegratedSolutionPageType.HotTopic));
        }
    }

    public static final Unit OLrzqt(TopicListItem.TopicItem topicItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String slug = topicItem.getSlug();
        EventParamsList.put$default(eventParamsList, "topic_name", slug == null ? "" : slug, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void copydefault(final boolean z) {
        android.content.Context context;
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_HelpfulButton_Click", false, new Function1() { // from class: o.sjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45099sjR.OLrzqt(this.KWHzl, z, (EventParamsList) obj);
            }
        }, 1, null);
        djBIcL().gEmmrt();
        RatingResult value = djBIcL().copydefault().getValue();
        if (value == null || (context = getContext()) == null) {
            return;
        }
        sxK.copydefault.KWHzl(context, value, z);
    }

    public static final Unit OLrzqt(C45099sjR c45099sjR, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Function1<EventParamsList, Unit> function1Copydefault = c45099sjR.values().copydefault();
        if (function1Copydefault != null) {
            function1Copydefault.invoke(eventParamsList);
        }
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void iwGUEr() {
        C45363soQ.onSessionIdEvent$default("SupportCenter_TopicsList_Chatbot_Click", false, null, 3, null);
        C45359soM.copydefault.KWHzl();
        ChatBotRequest chatBotRequestOLrzqt = C6805aWM.OLrzqt(new Function1() { // from class: o.sjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45099sjR.copydefault((ChatBotRequest) obj);
            }
        });
        android.content.Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportRecommendedTopicFragment$onChatbotClicked$1$1(context, chatBotRequestOLrzqt, null), 3, null);
        }
    }

    public static final Unit copydefault(ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom("cg_hot-topics_list");
        return Unit.INSTANCE;
    }
}
