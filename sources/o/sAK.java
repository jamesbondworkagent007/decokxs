package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.event.SupportCenterEvent;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1;
import com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter;
import com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel;
import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC44051sBn;
import o.ActivityC45850szP;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sAK extends AbstractC45847szM implements SupportSearchSuggestionsAdapter.ActionBar {
    public static final java.lang.String valueOf;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm djBIcL;
    public AbstractC47413tpa fetchVPNInfo;
    public final int gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public sAK() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchSuggestionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchSuggestionsFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C47315tni.ActionBar.RcXXUw;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sAK.djBIcL(this.KWHzl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSearchViewModel valueOf() {
        return (SupportSearchViewModel) this.AYXKKw.getValue();
    }

    public final SearchSuggestionsViewModel djBIcL() {
        return (SearchSuggestionsViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sAK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String EZpvd() {
            return sAK.valueOf;
        }

        public final sAK OLrzqt() {
            return new sAK();
        }
    }

    static {
        java.lang.String simpleName = sAK.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        valueOf = simpleName;
    }

    public final SupportSearchSuggestionsAdapter AhwBna() {
        return (SupportSearchSuggestionsAdapter) this.djBIcL.getValue();
    }

    public static final SupportSearchSuggestionsAdapter djBIcL(sAK sak) {
        SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter = new SupportSearchSuggestionsAdapter();
        supportSearchSuggestionsAdapter.KWHzl(sak);
        return supportSearchSuggestionsAdapter;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47413tpa abstractC47413tpaCopydefault = AbstractC47413tpa.copydefault(view);
        this.fetchVPNInfo = abstractC47413tpaCopydefault;
        if (abstractC47413tpaCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC47413tpaCopydefault = null;
        }
        abstractC47413tpaCopydefault.KWHzl.setAdapter(AhwBna());
        SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapterAhwBna = AhwBna();
        RecyclerView recyclerView = abstractC47413tpaCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        supportSearchSuggestionsAdapterAhwBna.copydefault(recyclerView, yDY.AhwBna());
        gEmmrt();
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchSuggestionsFragment$initViewModel$1(this, null), 3, null);
    }

    @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.ActionBar
    public void KWHzl(@NotNull final AbstractC44051sBn.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C45363soQ.onSessionIdEvent$default("SupportCenterSearch_Search_AIsearchRecommendationsDetails_Click", false, new Function1() { // from class: o.sAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sAK.OLrzqt(taskDescription, this, (EventParamsList) obj);
            }
        }, 1, null);
        FragmentKt.setFragmentResult(this, "KEY_FRAGMENT_EVENT", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_AISEARCH_TYPE", SupportCenterEvent.TypeAiSearchParam.AiResult)));
        valueOf().EZpvd(taskDescription.AEQbTJ(), taskDescription.KWHzl());
    }

    public static final Unit OLrzqt(AbstractC44051sBn.TaskDescription taskDescription, sAK sak, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "intent_id", taskDescription.KWHzl(), false, 4, null);
        eventParamsList.put("page", sak.valueOf().djBIcL(), true);
        EventParamsList.put$default(eventParamsList, "query", sak.valueOf().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "position", java.lang.String.valueOf(taskDescription.copydefault()), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.ActionBar
    public void KWHzl(@NotNull AbstractC44051sBn.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        android.content.Context context = getContext();
        if (context == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) application.KWHzl().getUrl()))) {
            return;
        }
        FragmentKt.setFragmentResult(this, "KEY_FRAGMENT_EVENT", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_AISEARCH_TYPE", SupportCenterEvent.TypeAiSearchParam.EsArticle)));
        ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", application.KWHzl().getUrl())), null, 4, null);
        valueOf().AEQbTJ(application.KWHzl());
    }
}
