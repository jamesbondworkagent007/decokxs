package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$setupRecyclerViews$1;
import com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$setupRecyclerViews$2;
import com.okinc.im.widgets.emojipicker.EmojiPickerViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oIL extends oIO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public Function0<Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public oII OLrzqt;

    /* JADX INFO: loaded from: classes18.dex */
    public interface Activity {
        void OLrzqt(@NotNull java.lang.String str);
    }

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
    public final void OLrzqt(Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0) {
        this.AEQbTJ = function1;
        this.EZpvd = function0;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public oIL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(EmojiPickerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.widgets.emojipicker.EmojiPickerBottomSheet$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.oIO.KWHzl()V */
    public final EmojiPickerViewModel KWHzl() {
        return (EmojiPickerViewModel) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.oIL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setEmojiClickCallbacks$default(oIL oil, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        oil.OLrzqt(function1, function0);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater.from(constraintLayout.getContext()).inflate(C35399nuc.Dialog.QbewEr, (android.view.ViewGroup) constraintLayout, true);
        RecyclerView recyclerView = (RecyclerView) constraintLayout.findViewById(C35399nuc.StateListAnimator.Qsauvs);
        RecyclerView recyclerView2 = (RecyclerView) constraintLayout.findViewById(C35399nuc.StateListAnimator.onReceive);
        ((android.widget.TextView) constraintLayout.findViewById(C35399nuc.StateListAnimator.kcQGz)).setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DQzvGNdrmXxudrmXxu));
        Intrinsics.copydefault(recyclerView);
        Intrinsics.copydefault(recyclerView2);
        AEQbTJ(recyclerView, recyclerView2);
        djBIcL();
    }

    public final void AEQbTJ(RecyclerView recyclerView, RecyclerView recyclerView2) {
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 7, 1, false));
        oII oii = new oII(yDY.AhwBna(), new EmojiPickerBottomSheet$setupRecyclerViews$1(this));
        this.OLrzqt = oii;
        recyclerView.setAdapter(oii);
        recyclerView2.setLayoutManager(new GridLayoutManager(requireContext(), 7));
        recyclerView2.setAdapter(new oII(CollectionsKt___CollectionsKt.QbewEr(KWHzl().AEQbTJ()), new EmojiPickerBottomSheet$setupRecyclerViews$2(this)));
    }

    private final void djBIcL() {
        KWHzl().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.oIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oIL.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(oIL oil, java.util.List list) {
        oII oii = oil.OLrzqt;
        if (oii != null) {
            Intrinsics.copydefault(list);
            oii.copydefault(list);
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Function1<androidx.fragment.app.Fragment, androidx.fragment.app.Fragment> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.Fragment invoke(androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return fragment.getParentFragment();
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oIL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.oIL$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ oIL newInstance$default(ActionBar actionBar, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            return actionBar.AEQbTJ(function1, function0);
        }

        public final oIL AEQbTJ(Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0) {
            oIL oil = new oIL();
            oil.OLrzqt(function1, function0);
            return oil;
        }
    }

    public final void EZpvd(java.lang.String str) {
        java.lang.Object next;
        Activity activity;
        Function1<? super java.lang.String, Unit> function1 = this.AEQbTJ;
        if (function1 == null && this.EZpvd == null) {
            java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) Application.copydefault)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((androidx.fragment.app.Fragment) next) instanceof Activity) {
                        break;
                    }
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment == null) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                activity = (Activity) (fragmentActivityRequireActivity instanceof Activity ? fragmentActivityRequireActivity : null);
            } else {
                activity = (Activity) (fragment instanceof Activity ? fragment : null);
            }
            if (activity != null) {
                activity.OLrzqt(str);
            }
        } else {
            if (function1 != null) {
                function1.invoke(str);
            }
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }
        dismissAllowingStateLoss();
    }
}
