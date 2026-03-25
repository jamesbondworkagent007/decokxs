package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.view.OrbitSearchResultFragment$setupObserver$1$1;
import com.okinc.im.imui.search.view.OrbitSearchResultFragment$setupObserver$1$2;
import com.okinc.im.imui.search.view.OrbitSearchResultFragment$setupObserver$1$3;
import com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC36573odX;
import o.C35399nuc;
import o.C37290oqz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37474ouX extends AbstractC37471ouU {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final ActivityResultLauncher<android.content.Intent> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final C37418otU DbNXlk = new C37418otU(new C37421otX());
    public final InterfaceC56387yDm djBIcL;
    public AbstractC33912nKl gEmmrt;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.ouX$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrbitSearchViewModel.SearchType.values().length];
            try {
                iArr[OrbitSearchViewModel.SearchType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrbitSearchViewModel.SearchType.CONTACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrbitSearchViewModel.SearchType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.QwvEab;
    }

    public C37474ouX() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrbitSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ouZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37474ouX.djBIcL(this.OLrzqt);
            }
        });
        this.AYXKKw = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ouY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37474ouX.gEmmrt(this.copydefault);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.ouW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37474ouX.isConnected(this.EZpvd);
            }
        });
    }

    public final OrbitSearchViewModel djBIcL() {
        return (OrbitSearchViewModel) this.AkhnZx.getValue();
    }

    private final java.util.List<SearchResultData> valueOf() {
        return (java.util.List) this.AhwBna.getValue();
    }

    private final java.lang.String AhwBna() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String gEmmrt(C37474ouX c37474ouX) {
        java.lang.String string = c37474ouX.requireArguments().getString("ARGS_KEYWORD");
        return string == null ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.ouU.EZpvd()V */
    public final OrbitSearchViewModel.SearchType EZpvd() {
        return (OrbitSearchViewModel.SearchType) this.values.getValue();
    }

    public static final OrbitSearchViewModel.SearchType isConnected(C37474ouX c37474ouX) {
        java.lang.String string = c37474ouX.requireArguments().getString("ARGS_SEARCH_TYPE");
        if (string == null) {
            string = "MESSAGE";
        }
        return OrbitSearchViewModel.SearchType.valueOf(string);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = AbstractC33912nKl.OLrzqt(view);
        gEmmrt();
        AYXKKw();
        AkhnZx();
        djBIcL().KWHzl(valueOf(), EZpvd(), AhwBna());
    }

    private final void gEmmrt() {
        C33537myN c33537myN;
        java.lang.String string;
        AbstractC33912nKl abstractC33912nKl = this.gEmmrt;
        if (abstractC33912nKl == null || (c33537myN = abstractC33912nKl.EZpvd) == null) {
            return;
        }
        android.widget.TextView title = c33537myN.getTitle();
        int i = StateListAnimator.copydefault[EZpvd().ordinal()];
        if (i == 1) {
            string = getString(C35399nuc.LoaderManager.DVmcag);
        } else if (i == 2) {
            string = getString(C35399nuc.LoaderManager.UnZVfq);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(C35399nuc.LoaderManager.UnZVfqExternalSyntheticApiModelOutline0);
        }
        title.setText(string);
    }

    private final void AYXKKw() {
        OrbitSearchViewModel orbitSearchViewModelDjBIcL = djBIcL();
        StateFlow<java.util.List<SearchResultData>> stateFlowEZpvd = orbitSearchViewModelDjBIcL.EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowEZpvd, viewLifecycleOwner, (Lifecycle.State) null, new OrbitSearchResultFragment$setupObserver$1$1(this, null), 2, (java.lang.Object) null);
        StateFlow<java.lang.Boolean> stateFlowKWHzl = orbitSearchViewModelDjBIcL.KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(stateFlowKWHzl, viewLifecycleOwner2, (Lifecycle.State) null, new OrbitSearchResultFragment$setupObserver$1$2(this, null), 2, (java.lang.Object) null);
        StateFlow<java.lang.Boolean> stateFlowOLrzqt = orbitSearchViewModelDjBIcL.OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(stateFlowOLrzqt, viewLifecycleOwner3, (Lifecycle.State) null, new OrbitSearchResultFragment$setupObserver$1$3(this, null), 2, (java.lang.Object) null);
    }

    private final void AkhnZx() {
        C33546myW c33546myW;
        RecyclerView recyclerView;
        C37418otU c37418otU = this.DbNXlk;
        int i = StateListAnimator.copydefault[EZpvd().ordinal()];
        if (i == 1) {
            c37418otU.EZpvd(new C37422otY(new Function0() { // from class: o.ovf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37474ouX.AkhnZx(this.OLrzqt);
                }
            }, new Function1() { // from class: o.ovb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37474ouX.KWHzl(this.KWHzl, (SearchResultData.Message) obj);
                }
            }));
        } else if (i == 2) {
            c37418otU.EZpvd(new C37479ouc(new Function0() { // from class: o.ovc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37474ouX.fetchVPNInfo(this.KWHzl);
                }
            }, new Function1() { // from class: o.ove
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37474ouX.OLrzqt(this.OLrzqt, (SearchResultData.ChatAndContact) obj);
                }
            }));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c37418otU.EZpvd(new C37482ouf(new Function0() { // from class: o.ovd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37474ouX.values(this.KWHzl);
                }
            }, new Function1() { // from class: o.ovk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37474ouX.OLrzqt(this.copydefault, (SearchResultData.GroupResult) obj);
                }
            }));
        }
        AbstractC33912nKl abstractC33912nKl = this.gEmmrt;
        if (abstractC33912nKl != null && (recyclerView = abstractC33912nKl.copydefault) != null) {
            recyclerView.setAdapter(this.DbNXlk);
            recyclerView.setItemAnimator(null);
            C37716ozA.EZpvd(recyclerView);
        }
        AbstractC33912nKl abstractC33912nKl2 = this.gEmmrt;
        if (abstractC33912nKl2 == null || (c33546myW = abstractC33912nKl2.OLrzqt) == null) {
            return;
        }
        c33546myW.djBIcL(false);
        c33546myW.AhwBna(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.ovj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C37474ouX.OLrzqt(this.EZpvd, interfaceC57934yrl);
            }
        });
    }

    public static final java.lang.String AkhnZx(C37474ouX c37474ouX) {
        return c37474ouX.AhwBna();
    }

    public static final Unit KWHzl(C37474ouX c37474ouX, SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        c37474ouX.copydefault(message);
        return Unit.INSTANCE;
    }

    public static final java.lang.String fetchVPNInfo(C37474ouX c37474ouX) {
        return c37474ouX.AhwBna();
    }

    public static final Unit OLrzqt(C37474ouX c37474ouX, SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        c37474ouX.OLrzqt(chatAndContact);
        return Unit.INSTANCE;
    }

    public static final java.lang.String values(C37474ouX c37474ouX) {
        return c37474ouX.AhwBna();
    }

    public static final Unit OLrzqt(C37474ouX c37474ouX, SearchResultData.GroupResult groupResult) {
        Intrinsics.checkNotNullParameter(groupResult, "");
        c37474ouX.OLrzqt(new SearchResultData.GroupResult(groupResult.getConversation(), groupResult.getSearchKeyword()));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C37474ouX c37474ouX, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c37474ouX.djBIcL().copydefault();
    }

    public final void copydefault(SearchResultData.Message message) {
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.AYXKKw.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : message.getConversation().getTargetId(), (452 & 4) != 0 ? null : message.getMessage(), (452 & 8) != 0 ? null : AhwBna(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
    }

    public final void OLrzqt(SearchResultData.ChatAndContact chatAndContact) {
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        OKConversation conversation = chatAndContact.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        RelationInfo relation = chatAndContact.getRelation();
        this.AYXKKw.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : targetId, (452 & 4) != 0 ? null : null, (452 & 8) != 0 ? null : AhwBna(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : relation != null ? relation.getContactsId() : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
    }

    public final void OLrzqt(SearchResultData.GroupResult groupResult) {
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        OKConversation conversation = groupResult.getConversation();
        this.AYXKKw.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : conversation != null ? conversation.getTargetId() : null, (452 & 4) != 0 ? null : null, (452 & 8) != 0 ? null : AhwBna(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        final Function0 function0 = null;
        ((C37454ouD) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37454ouD.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$onDestroy$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$onDestroy$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$onDestroy$$inlined$activityViewModels$default$3
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
        }).getValue()).copydefault();
        this.gEmmrt = null;
    }

    /* JADX INFO: renamed from: o.ouX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ouX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37474ouX AEQbTJ(@NotNull java.lang.String str, @NotNull OrbitSearchViewModel.SearchType searchType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(searchType, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ARGS_KEYWORD", str);
            bundle.putString("ARGS_SEARCH_TYPE", searchType.name());
            C37474ouX c37474ouX = new C37474ouX();
            c37474ouX.setArguments(bundle);
            return c37474ouX;
        }
    }

    public static final java.util.List djBIcL(final C37474ouX c37474ouX) {
        final Function0 function0 = null;
        return ((C37454ouD) FragmentViewModelLazyKt.createViewModelLazy(c37474ouX, C56524yIo.AEQbTJ(C37454ouD.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$resultList_delegate$lambda$0$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c37474ouX.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$resultList_delegate$lambda$0$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = c37474ouX.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.OrbitSearchResultFragment$resultList_delegate$lambda$0$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c37474ouX.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue()).EZpvd();
    }
}
