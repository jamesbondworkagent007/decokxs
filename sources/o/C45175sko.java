package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.ui.adapter.TopicListHomeCardAdapter;
import com.okinc.okex.center.ui.fragment.SupportTopTopicsListFragment$initView$2;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC44889sfT;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45175sko extends AbstractC32996moC implements TopicListHomeCardAdapter.TaskDescription {
    public static final java.lang.String EZpvd;
    public boolean AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC47416tpd OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.skp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45175sko.valueOf(this.copydefault);
        }
    });
    public final int AEQbTJ = C47315tni.ActionBar.fFgQHt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C45175sko() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportCenterHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.SupportTopTopicsListFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.SupportTopTopicsListFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.SupportTopTopicsListFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.sko$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sko.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C45175sko OLrzqt() {
            return new C45175sko();
        }
    }

    static {
        java.lang.String simpleName = C45175sko.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        EZpvd = simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportCenterHomeViewModel KWHzl() {
        return (SupportCenterHomeViewModel) this.KWHzl.getValue();
    }

    public final TopicListHomeCardAdapter OLrzqt() {
        return (TopicListHomeCardAdapter) this.djBIcL.getValue();
    }

    public static final TopicListHomeCardAdapter valueOf(C45175sko c45175sko) {
        TopicListHomeCardAdapter topicListHomeCardAdapter = new TopicListHomeCardAdapter(false);
        topicListHomeCardAdapter.copydefault(c45175sko);
        return topicListHomeCardAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        if (this.AhwBna != z) {
            this.AhwBna = z;
            AbstractC47416tpd abstractC47416tpd = this.OLrzqt;
            if (abstractC47416tpd == null) {
                Intrinsics.gEmmrt("");
                abstractC47416tpd = null;
            }
            android.view.View root = abstractC47416tpd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(this.AhwBna ^ true ? 8 : 0);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47416tpd abstractC47416tpdAEQbTJ = AbstractC47416tpd.AEQbTJ(view);
        this.OLrzqt = abstractC47416tpdAEQbTJ;
        if (abstractC47416tpdAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC47416tpdAEQbTJ = null;
        }
        android.view.View root = abstractC47416tpdAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(8);
        AbstractC47416tpd abstractC47416tpd = this.OLrzqt;
        if (abstractC47416tpd == null) {
            Intrinsics.gEmmrt("");
            abstractC47416tpd = null;
        }
        C45146skL c45146skL = abstractC47416tpd.KWHzl;
        c45146skL.setOnClickListener(new TaskDescription(c45146skL, 1000L, this));
        copydefault();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportTopTopicsListFragment$initView$2(this, null), 3, null);
    }

    @Override // com.okinc.okex.center.ui.adapter.TopicListHomeCardAdapter.TaskDescription
    public void KWHzl(@NotNull final TopicListItem.TopicItem topicItem) {
        Intrinsics.checkNotNullParameter(topicItem, "");
        android.content.Context context = getContext();
        if (context != null) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Topics_LandingPage_Click", false, new Function1() { // from class: o.skm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45175sko.OLrzqt(topicItem, (EventParamsList) obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd() {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Topics_ExpandButton_Click", false, null, 3, null);
        ActivityC44889sfT.TaskDescription taskDescription = ActivityC44889sfT.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        startActivity(ActivityC44889sfT.TaskDescription.createIntent$default(taskDescription, contextRequireContext, null, 2, null));
    }

    private final void copydefault() {
        AbstractC47416tpd abstractC47416tpd = this.OLrzqt;
        if (abstractC47416tpd == null) {
            Intrinsics.gEmmrt("");
            abstractC47416tpd = null;
        }
        RecyclerView recyclerView = abstractC47416tpd.EZpvd;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(OLrzqt());
    }

    /* JADX INFO: renamed from: o.sko$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C45175sko copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C45175sko c45175sko) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c45175sko;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd();
            }
        }
    }
}
