package o;

import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterAuditFragment$observeViewModel$6;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterAuditFragment$observeViewModel$7;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28746kgb extends AbstractC28685kfT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public boolean AhwBna;
    public C21568hEe gEmmrt;
    public final InterfaceC56387yDm valueOf;

    public C28746kgb() {
        final Function0 function0 = new Function0() { // from class: o.kfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28746kgb.valueOf(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterAuditFragment$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterAuditFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterAuditFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterAuditFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: renamed from: o.kgb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kgb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C28746kgb OLrzqt(MemeFilterParams memeFilterParams) {
            C28746kgb c28746kgb = new C28746kgb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.meme_filter_params", memeFilterParams);
            c28746kgb.setArguments(bundle);
            return c28746kgb;
        }
    }

    /* JADX DEBUG: Possible override for method o.kfT.OLrzqt()V */
    public final C21568hEe OLrzqt() {
        C21568hEe c21568hEe = this.gEmmrt;
        Intrinsics.copydefault(c21568hEe);
        return c21568hEe;
    }

    private final MemeFilterParams AYXKKw() {
        MemeFilterParams memeFilterParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeFilterParams = (MemeFilterParams) BundleCompat.getParcelable(arguments, "key.meme_filter_params", MemeFilterParams.class)) == null) ? new MemeFilterParams(null, null, null, 0, false, 31, null) : memeFilterParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeFilterViewModel AhwBna() {
        return (MemeFilterViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner valueOf(C28746kgb c28746kgb) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28746kgb.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.gEmmrt = C21568hEe.OLrzqt(layoutInflater, viewGroup, false);
        NestedScrollView root = OLrzqt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        gEmmrt();
        if (bundle == null) {
            AhwBna().OLrzqt(AYXKKw());
        }
        view.post(new java.lang.Runnable() { // from class: o.kga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C28746kgb.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final void gEmmrt(C28746kgb c28746kgb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28746kgb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void valueOf() {
        C21568hEe c21568hEeOLrzqt = OLrzqt();
        C55008xbo c55008xbo = c21568hEeOLrzqt.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        C55008xbo c55008xbo2 = c21568hEeOLrzqt.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        copydefault(c55008xbo, c55008xbo2, new Function2() { // from class: o.kfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.djBIcL(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        C55008xbo c55008xbo3 = c21568hEeOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55008xbo3, "");
        C55008xbo c55008xbo4 = c21568hEeOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo4, "");
        copydefault(c55008xbo3, c55008xbo4, new Function2() { // from class: o.kge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.valueOf(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        C55008xbo c55008xbo5 = c21568hEeOLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55008xbo5, "");
        C55008xbo c55008xbo6 = c21568hEeOLrzqt.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo6, "");
        copydefault(c55008xbo5, c55008xbo6, new Function2() { // from class: o.kgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.gEmmrt(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        C55008xbo c55008xbo7 = c21568hEeOLrzqt.values;
        Intrinsics.checkNotNullExpressionValue(c55008xbo7, "");
        C55008xbo c55008xbo8 = c21568hEeOLrzqt.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c55008xbo8, "");
        copydefault(c55008xbo7, c55008xbo8, new Function2() { // from class: o.kgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.DbNXlk(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        C55008xbo c55008xbo9 = c21568hEeOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55008xbo9, "");
        C55008xbo c55008xbo10 = c21568hEeOLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo10, "");
        copydefault(c55008xbo9, c55008xbo10, new Function2() { // from class: o.kgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.fetchVPNInfo(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        C55008xbo c55008xbo11 = c21568hEeOLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55008xbo11, "");
        C55008xbo c55008xbo12 = c21568hEeOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo12, "");
        copydefault(c55008xbo11, c55008xbo12, new Function2() { // from class: o.kgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.isConnected(this.EZpvd, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        C55008xbo c55008xbo13 = c21568hEeOLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55008xbo13, "");
        C55008xbo c55008xbo14 = c21568hEeOLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55008xbo14, "");
        copydefault(c55008xbo13, c55008xbo14, new Function2() { // from class: o.kgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28746kgb.values(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit djBIcL(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().DbNXlk(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().copydefault(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().AhwBna(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().fetchVPNInfo(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().EZpvd(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().KWHzl(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit values(C28746kgb c28746kgb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28746kgb.AhwBna().gEmmrt(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kgb$LoaderManager */
    public static final class LoaderManager implements android.text.TextWatcher {
        public final /* synthetic */ C55008xbo KWHzl;
        public final /* synthetic */ Function2<java.lang.String, java.lang.String, Unit> OLrzqt;
        public final /* synthetic */ C55008xbo copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(C55008xbo c55008xbo, C55008xbo c55008xbo2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            this.copydefault = c55008xbo;
            this.KWHzl = c55008xbo2;
            this.OLrzqt = function2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            android.text.Editable text;
            android.text.Editable text2;
            if (C28746kgb.this.AhwBna) {
                return;
            }
            C55001xbh c55001xbhAkhnZx = this.copydefault.AkhnZx();
            java.lang.String string = null;
            java.lang.String string2 = (c55001xbhAkhnZx == null || (text2 = c55001xbhAkhnZx.getText()) == null) ? null : text2.toString();
            if (string2 == null) {
                string2 = "";
            }
            C55001xbh c55001xbhAkhnZx2 = this.KWHzl.AkhnZx();
            if (c55001xbhAkhnZx2 != null && (text = c55001xbhAkhnZx2.getText()) != null) {
                string = text.toString();
            }
            this.OLrzqt.invoke(string2, string != null ? string : "");
        }
    }

    public final void copydefault(C55008xbo c55008xbo, C55008xbo c55008xbo2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        LoaderManager loaderManager = new LoaderManager(c55008xbo, c55008xbo2, function2);
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(loaderManager);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(loaderManager);
        }
    }

    private final void gEmmrt() {
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().AhwBna(), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().OLrzqt(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().KWHzl(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().valueOf(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().copydefault(), null, new Dialog(), 2, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MemeFilterAuditFragment$observeViewModel$6(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new MemeFilterAuditFragment$observeViewModel$7(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.kgb$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28746kgb c28746kgb = C28746kgb.this;
            C55008xbo c55008xbo = c28746kgb.OLrzqt().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = C28746kgb.this.OLrzqt().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = C28746kgb.this.OLrzqt().zLjUOn;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28746kgb.OLrzqt(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgb$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28746kgb c28746kgb = C28746kgb.this;
            C55008xbo c55008xbo = c28746kgb.OLrzqt().copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = C28746kgb.this.OLrzqt().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = C28746kgb.this.OLrzqt().fJNWhG;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28746kgb.OLrzqt(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgb$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28746kgb c28746kgb = C28746kgb.this;
            C55008xbo c55008xbo = c28746kgb.OLrzqt().djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = C28746kgb.this.OLrzqt().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = C28746kgb.this.OLrzqt().uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28746kgb.OLrzqt(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgb$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28746kgb c28746kgb = C28746kgb.this;
            C55008xbo c55008xbo = c28746kgb.OLrzqt().values;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = C28746kgb.this.OLrzqt().AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = C28746kgb.this.OLrzqt().zsXlph;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28746kgb.OLrzqt(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgb$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28746kgb c28746kgb = C28746kgb.this;
            C55008xbo c55008xbo = c28746kgb.OLrzqt().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = C28746kgb.this.OLrzqt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = C28746kgb.this.OLrzqt().ejfBZ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28746kgb.OLrzqt(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(C55008xbo c55008xbo, C55008xbo c55008xbo2, android.view.View view, C28717kfz c28717kfz) {
        C55001xbh c55001xbhAkhnZx;
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx2;
        android.text.Editable text2;
        this.AhwBna = true;
        C55001xbh c55001xbhAkhnZx3 = c55008xbo.AkhnZx();
        java.lang.String string = null;
        if (!Intrinsics.EZpvd((java.lang.Object) ((c55001xbhAkhnZx3 == null || (text2 = c55001xbhAkhnZx3.getText()) == null) ? null : text2.toString()), (java.lang.Object) c28717kfz.AEQbTJ()) && (c55001xbhAkhnZx2 = c55008xbo.AkhnZx()) != null) {
            c55001xbhAkhnZx2.setText(c28717kfz.AEQbTJ());
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx4 != null && (text = c55001xbhAkhnZx4.getText()) != null) {
            string = text.toString();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) c28717kfz.EZpvd()) && (c55001xbhAkhnZx = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx.setText(c28717kfz.EZpvd());
        }
        if (c28717kfz.copydefault()) {
            c55008xbo.setState(2);
            c55008xbo2.setState(2);
        } else {
            if (c55008xbo.hasFocus()) {
                c55008xbo.setState(1);
            } else {
                c55008xbo.setState(0);
            }
            if (c55008xbo2.hasFocus()) {
                c55008xbo2.setState(1);
            } else {
                c55008xbo2.setState(0);
            }
        }
        view.setVisibility(c28717kfz.copydefault() ? 0 : 8);
        c55008xbo.setErrorShowing(c28717kfz.copydefault());
        c55008xbo2.setErrorShowing(c28717kfz.copydefault());
        this.AhwBna = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }
}
