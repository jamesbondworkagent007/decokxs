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
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import com.okinc.okex.center.ui.adapter.TopicListAdapter;
import com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$initViewModel$1;
import com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$onChatbotClicked$1$1;
import com.okinc.okex.center.viewmodel.SupportAllTopicViewModel;
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

/* JADX INFO: renamed from: o.siZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45054siZ extends AbstractC45030siB implements TopicListAdapter.StateListAnimator, RatingChatbotAdapter.ActionBar {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public AbstractC47345toL AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final int valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.siZ$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return this.valueOf;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C45054siZ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportAllTopicViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportAllTopicsFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C47315tni.ActionBar.QbewEr;
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.sjg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45054siZ.valueOf(this.AEQbTJ);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45054siZ.djBIcL(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45054siZ.gEmmrt();
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45054siZ.AYXKKw(this.EZpvd);
            }
        });
    }

    public final SupportAllTopicViewModel DbNXlk() {
        return (SupportAllTopicViewModel) this.AkhnZx.getValue();
    }

    public final RatingChatbotAdapter valueOf() {
        return (RatingChatbotAdapter) this.values.getValue();
    }

    public static final RatingChatbotAdapter valueOf(C45054siZ c45054siZ) {
        RatingChatbotAdapter ratingChatbotAdapter = new RatingChatbotAdapter();
        ratingChatbotAdapter.EZpvd(true);
        ratingChatbotAdapter.AEQbTJ(c45054siZ);
        ratingChatbotAdapter.copydefault(new Function1() { // from class: o.sjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45054siZ.OLrzqt((EventParamsList) obj);
            }
        });
        return ratingChatbotAdapter;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", SupportCenterEvent.ArticlePageParam.ExploreTopics.getValue(), true);
        EventParamsList.put$default(eventParamsList, "page_topic_name", "", false, 4, null);
        eventParamsList.put("mini_support_page", "false", true);
        return Unit.INSTANCE;
    }

    public final TopicListAdapter AYXKKw() {
        return (TopicListAdapter) this.fetchVPNInfo.getValue();
    }

    public static final TopicListAdapter djBIcL(C45054siZ c45054siZ) {
        TopicListAdapter topicListAdapter = new TopicListAdapter(false, 1, null);
        topicListAdapter.copydefault(c45054siZ);
        return topicListAdapter;
    }

    public final C44987shL djBIcL() {
        return (C44987shL) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.shL.updateEmptyProperties$default(o.shL, int, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public static final C44987shL gEmmrt() {
        C44987shL c44987shL = new C44987shL();
        C44987shL.updateEmptyProperties$default(c44987shL, 6, C33070mpX.AYXKKw(C47315tni.PendingIntent.AubY), null, null, 12, null);
        return c44987shL;
    }

    public final ConcatAdapter AhwBna() {
        return (ConcatAdapter) this.djBIcL.getValue();
    }

    public static final ConcatAdapter AYXKKw(C45054siZ c45054siZ) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{c45054siZ.AYXKKw(), c45054siZ.djBIcL(), c45054siZ.valueOf()});
    }

    /* JADX INFO: renamed from: o.siZ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.siZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C45054siZ KWHzl() {
            return new C45054siZ();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47345toL abstractC47345toLCopydefault = AbstractC47345toL.copydefault(view);
        this.AhwBna = abstractC47345toLCopydefault;
        if (abstractC47345toLCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC47345toLCopydefault = null;
        }
        RecyclerView recyclerView = abstractC47345toLCopydefault.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new C45388sop(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA)));
        recyclerView.addItemDecoration(new ActionBar());
        recyclerView.addItemDecoration(new C45393sou(valueOf(), recyclerView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ODWQjV), 0, true, 4, null));
        recyclerView.setAdapter(AhwBna());
        C55173xeu c55173xeu = abstractC47345toLCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        new C45144skJ(c55173xeu).KWHzl(new View.OnClickListener() { // from class: o.sje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C45054siZ.OLrzqt(this.AEQbTJ, view2);
            }
        });
        values();
    }

    public static final void OLrzqt(C45054siZ c45054siZ, android.view.View view) {
        c45054siZ.DbNXlk().KWHzl();
    }

    private final void values() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SupportAllTopicsFragment$initViewModel$1(this, null));
        DbNXlk().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.sjh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45054siZ.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk().KWHzl();
    }

    public static final Unit AEQbTJ(C45054siZ c45054siZ, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c45054siZ.valueOf().KWHzl();
        } else {
            c45054siZ.valueOf().EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.List<? extends TopicListItem> list) {
        TopicListAdapter topicListAdapterAYXKKw = AYXKKw();
        AbstractC47345toL abstractC47345toL = this.AhwBna;
        if (abstractC47345toL == null) {
            Intrinsics.gEmmrt("");
            abstractC47345toL = null;
        }
        RecyclerView recyclerView = abstractC47345toL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        topicListAdapterAYXKKw.copydefault(recyclerView, (java.util.List) list);
    }

    @Override // com.okinc.okex.center.ui.adapter.TopicListAdapter.StateListAnimator
    public void OLrzqt(@NotNull final TopicListItem.TopicItem topicItem) {
        Intrinsics.checkNotNullParameter(topicItem, "");
        android.content.Context context = getContext();
        if (context != null) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_FAQ_Click", false, new Function1() { // from class: o.sji
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45054siZ.EZpvd(topicItem, (EventParamsList) obj);
                }
            }, 1, null);
            java.lang.String title = topicItem.getTitle();
            startActivity(FullArticleListActivity.Companion.OLrzqt(context, new FullArticleListActivity.FullArticleListRequest(title == null ? "" : title, FullArticleListActivity.FilterListBy.SECTIONS, yDY.OLrzqt(topicItem.getId()), FullArticleListActivity.FullArticleListRequest.FullArticleListSource.FAQS, topicItem.getSlug(), null, null, null, 224, null)));
        }
    }

    public static final Unit EZpvd(TopicListItem.TopicItem topicItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String slug = topicItem.getSlug();
        EventParamsList.put$default(eventParamsList, "faq_section", slug == null ? "" : slug, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void copydefault(final boolean z) {
        android.content.Context context;
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_HelpfulButton_Click", false, new Function1() { // from class: o.sjb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45054siZ.KWHzl(this.copydefault, z, (EventParamsList) obj);
            }
        }, 1, null);
        DbNXlk().copydefault();
        RatingResult value = DbNXlk().EZpvd().getValue();
        if (value == null || (context = getContext()) == null) {
            return;
        }
        sxK.copydefault.KWHzl(context, value, z);
    }

    public static final Unit KWHzl(C45054siZ c45054siZ, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Function1<EventParamsList, Unit> function1Copydefault = c45054siZ.valueOf().copydefault();
        if (function1Copydefault != null) {
            function1Copydefault.invoke(eventParamsList);
        }
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void iwGUEr() {
        C45363soQ.onSessionIdEvent$default("SupportCenter_FAQsectionList_Chatbot_Click", false, null, 3, null);
        C45359soM.copydefault.KWHzl();
        ChatBotRequest chatBotRequestOLrzqt = C6805aWM.OLrzqt(new Function1() { // from class: o.sjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45054siZ.EZpvd((ChatBotRequest) obj);
            }
        });
        android.content.Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportAllTopicsFragment$onChatbotClicked$1$1(context, chatBotRequestOLrzqt, null), 3, null);
        }
    }

    public static final Unit EZpvd(ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom("cg_all-topics_list");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.siZ$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar extends RecyclerView.ItemDecoration {
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final android.graphics.Paint copydefault;

        public ActionBar() {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE));
            this.copydefault = paint;
            this.KWHzl = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.wlaJM);
            this.OLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.getNewProxyInstance);
            this.EZpvd = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.copydefault(adapter, "");
            ConcatAdapter concatAdapter = (ConcatAdapter) adapter;
            RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) concatAdapter.getWrappedAdapterAndPosition(childAdapterPosition).first;
            if (childAdapterPosition > 0 && (adapter2 instanceof TopicListAdapter) && concatAdapter.getItemViewType(childAdapterPosition) == TopicListAdapter.TopicType.TOPIC_HEADER.ordinal()) {
                rect.top = this.KWHzl;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            RecyclerView.Adapter adapter;
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                Intrinsics.copydefault(adapter2, "");
                RecyclerView.Adapter adapter3 = (RecyclerView.Adapter) ((ConcatAdapter) adapter2).getWrappedAdapterAndPosition(i).first;
                float f = this.EZpvd;
                float width = recyclerView.getWidth();
                float f2 = this.EZpvd;
                if (childAdapterPosition > 0 && (adapter3 instanceof TopicListAdapter) && (adapter = recyclerView.getAdapter()) != null && adapter.getItemViewType(childAdapterPosition) == TopicListAdapter.TopicType.TOPIC_HEADER.ordinal()) {
                    canvas.drawRect(f, (childAt.getTop() - (this.KWHzl / 2)) + (this.OLrzqt / 2), width - f2, r4 + r2, this.copydefault);
                }
            }
        }
    }
}
