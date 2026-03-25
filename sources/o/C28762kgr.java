package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterViewModel;
import com.okinc.business.market.features.meme.filter.ui.MemeUnitSelectionBottomSheetParams;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C28729kgK;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28762kgr extends AbstractC28686kfU implements InterfaceC28728kgJ, InterfaceC28689kfX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public boolean AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C21567hEd djBIcL;

    public C28762kgr() {
        final Function0 function0 = new Function0() { // from class: o.kgo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28762kgr.gEmmrt(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterMetricsFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterMetricsFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterMetricsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterMetricsFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.kgr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kgr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28762kgr EZpvd(MemeFilterParams memeFilterParams) {
            C28762kgr c28762kgr = new C28762kgr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.meme_filter_params", memeFilterParams);
            c28762kgr.setArguments(bundle);
            return c28762kgr;
        }
    }

    private final MemeFilterParams valueOf() {
        MemeFilterParams memeFilterParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeFilterParams = (MemeFilterParams) BundleCompat.getParcelable(arguments, "key.meme_filter_params", MemeFilterParams.class)) == null) ? new MemeFilterParams(null, null, null, 0, false, 31, null) : memeFilterParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeFilterViewModel values() {
        return (MemeFilterViewModel) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(C28762kgr c28762kgr) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28762kgr.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21567hEd c21567hEdCopydefault = C21567hEd.copydefault(layoutInflater, viewGroup, false);
        this.djBIcL = c21567hEdCopydefault;
        if (c21567hEdCopydefault != null) {
            return c21567hEdCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo();
        isConnected();
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd != null) {
            android.widget.TextView textView = c21567hEd.gHZMYf;
            int i = C23274hvD.Fragment.sEAkxl;
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", c23272hvB.OLrzqt().getSymbol()))));
            c21567hEd.djSkpj.setText(C33069mpW.copydefault(C23274hvD.Fragment.onLocationChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", c23272hvB.OLrzqt().getSymbol()))));
            if (bundle == null) {
                values().OLrzqt(valueOf());
                MemeFilter memeFilterKWHzl = valueOf().KWHzl();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (memeFilterKWHzl != null ? memeFilterKWHzl.getKeyword() : null))) {
                    C55008xbo c55008xbo = c21567hEd.gEmmrt;
                    MemeFilter memeFilterKWHzl2 = valueOf().KWHzl();
                    c55008xbo.setText(java.lang.String.valueOf(memeFilterKWHzl2 != null ? memeFilterKWHzl2.getKeyword() : null));
                }
                MemeFilter memeFilterKWHzl3 = valueOf().KWHzl();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (memeFilterKWHzl3 != null ? memeFilterKWHzl3.getKeywordExclude() : null))) {
                    C55008xbo c55008xbo2 = c21567hEd.AhwBna;
                    MemeFilter memeFilterKWHzl4 = valueOf().KWHzl();
                    c55008xbo2.setText(java.lang.String.valueOf(memeFilterKWHzl4 != null ? memeFilterKWHzl4.getKeywordExclude() : null));
                }
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.kgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C28762kgr.AhwBna(this.copydefault);
            }
        });
    }

    public static final void AhwBna(C28762kgr c28762kgr) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28762kgr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void fetchVPNInfo() {
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd != null) {
            C55008xbo c55008xbo = c21567hEd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = c21567hEd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            KWHzl(c55008xbo, c55008xbo2, new Function2() { // from class: o.kgq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.isConnected(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo3 = c21567hEd.values;
            Intrinsics.checkNotNullExpressionValue(c55008xbo3, "");
            C55008xbo c55008xbo4 = c21567hEd.isConnected;
            Intrinsics.checkNotNullExpressionValue(c55008xbo4, "");
            KWHzl(c55008xbo3, c55008xbo4, new Function2() { // from class: o.kgv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.fetchVPNInfo(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo5 = c21567hEd.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55008xbo5, "");
            C55008xbo c55008xbo6 = c21567hEd.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55008xbo6, "");
            KWHzl(c55008xbo5, c55008xbo6, new Function2() { // from class: o.kgw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.values(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo7 = c21567hEd.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(c55008xbo7, "");
            C55008xbo c55008xbo8 = c21567hEd.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c55008xbo8, "");
            KWHzl(c55008xbo7, c55008xbo8, new Function2() { // from class: o.kgu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.fARcdN(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo9 = c21567hEd.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55008xbo9, "");
            C55008xbo c55008xbo10 = c21567hEd.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55008xbo10, "");
            KWHzl(c55008xbo9, c55008xbo10, new Function2() { // from class: o.kgs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.AuCTel(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo11 = c21567hEd.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55008xbo11, "");
            C55008xbo c55008xbo12 = c21567hEd.fARcdN;
            Intrinsics.checkNotNullExpressionValue(c55008xbo12, "");
            KWHzl(c55008xbo11, c55008xbo12, new Function2() { // from class: o.kgy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.ejfBZ(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo13 = c21567hEd.AuCTel;
            Intrinsics.checkNotNullExpressionValue(c55008xbo13, "");
            C55008xbo c55008xbo14 = c21567hEd.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo14, "");
            KWHzl(c55008xbo13, c55008xbo14, new Function2() { // from class: o.kgz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.djBIcL(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo15 = c21567hEd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo15, "");
            C55008xbo c55008xbo16 = c21567hEd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo16, "");
            KWHzl(c55008xbo15, c55008xbo16, new Function2() { // from class: o.kgx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.DbNXlk(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            C55008xbo c55008xbo17 = c21567hEd.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55008xbo17, "");
            C55008xbo c55008xbo18 = c21567hEd.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55008xbo18, "");
            KWHzl(c55008xbo17, c55008xbo18, new Function2() { // from class: o.kgA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28762kgr.AkhnZx(this.EZpvd, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            LinearLayoutCompat linearLayoutCompat = c21567hEd.AEQbTJ;
            linearLayoutCompat.setOnClickListener(new ComponentCallbacks2(linearLayoutCompat, 1000L, this, c21567hEd));
            AYXKKw();
            gEmmrt();
            djBIcL();
        }
    }

    public static final Unit isConnected(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().AEQbTJ(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().AYXKKw(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit values(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().valueOf(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().values(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().djBIcL(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().EZpvd(str, str2, c28762kgr.values().fIwbmz().getValue().copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().AkhnZx(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().OLrzqt(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C28762kgr c28762kgr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c28762kgr.values().isConnected(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kgr$SharedElementCallback */
    public static final class SharedElementCallback implements android.text.TextWatcher {
        public final /* synthetic */ C55008xbo KWHzl;
        public final /* synthetic */ C55008xbo OLrzqt;
        public final /* synthetic */ Function2<java.lang.String, java.lang.String, Unit> copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public SharedElementCallback(C55008xbo c55008xbo, C55008xbo c55008xbo2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            this.OLrzqt = c55008xbo;
            this.KWHzl = c55008xbo2;
            this.copydefault = function2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            android.text.Editable text;
            android.text.Editable text2;
            if (C28762kgr.this.AYXKKw) {
                return;
            }
            C55001xbh c55001xbhAkhnZx = this.OLrzqt.AkhnZx();
            java.lang.String string = null;
            java.lang.String string2 = (c55001xbhAkhnZx == null || (text2 = c55001xbhAkhnZx.getText()) == null) ? null : text2.toString();
            if (string2 == null) {
                string2 = "";
            }
            C55001xbh c55001xbhAkhnZx2 = this.KWHzl.AkhnZx();
            if (c55001xbhAkhnZx2 != null && (text = c55001xbhAkhnZx2.getText()) != null) {
                string = text.toString();
            }
            this.copydefault.invoke(string2, string != null ? string : "");
        }
    }

    private final void KWHzl(C55008xbo c55008xbo, C55008xbo c55008xbo2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        SharedElementCallback sharedElementCallback = new SharedElementCallback(c55008xbo, c55008xbo2, function2);
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(sharedElementCallback);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(sharedElementCallback);
        }
    }

    /* JADX INFO: renamed from: o.kgr$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ C28762kgr EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C21567hEd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, C28762kgr c28762kgr, C21567hEd c21567hEd) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c28762kgr;
            this.copydefault = c21567hEd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AhwBna();
                this.copydefault.uzCIH.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.dUDNAs));
            }
        }
    }

    /* JADX INFO: renamed from: o.kgr$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28762kgr OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C28762kgr c28762kgr) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c28762kgr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C28683kfR.Companion.EZpvd(this.OLrzqt.values().values().getSelectedSocialData()).show(this.OLrzqt.getChildFragmentManager(), "SocialPickerBottomSheet");
            }
        }
    }

    /* JADX INFO: renamed from: o.kgr$AssistContent */
    public static final class AssistContent implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public AssistContent() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            MemeFilterViewModel memeFilterViewModelValues = C28762kgr.this.values();
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            memeFilterViewModelValues.EZpvd(string);
        }
    }

    public final void AYXKKw() {
        C55008xbo c55008xbo;
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd == null || (c55008xbo = c21567hEd.gEmmrt) == null) {
            return;
        }
        c55008xbo.OLrzqt(new AssistContent());
    }

    /* JADX INFO: renamed from: o.kgr$TaskStackBuilder */
    public static final class TaskStackBuilder implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskStackBuilder() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            MemeFilterViewModel memeFilterViewModelValues = C28762kgr.this.values();
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            memeFilterViewModelValues.copydefault(string);
        }
    }

    public final void gEmmrt() {
        C55008xbo c55008xbo;
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd == null || (c55008xbo = c21567hEd.AhwBna) == null) {
            return;
        }
        c55008xbo.OLrzqt(new TaskStackBuilder());
    }

    public final void djBIcL() {
        android.widget.LinearLayout linearLayout;
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd == null || (linearLayout = c21567hEd.iwGUEr) == null) {
            return;
        }
        linearLayout.setOnClickListener(new VoiceInteractor(linearLayout, 1000L, this));
    }

    private final void isConnected() {
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd != null) {
            C25390ivn.collectOnViewLifecycle$default(this, values().AkhnZx(), null, new TaskDescription(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().fARcdN(), null, new Application(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().DbNXlk(), null, new Activity(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().ejfBZ(), null, new Fragment(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().isConnected(), null, new Dialog(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().fIwbmz(), null, new LoaderManager(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().AuCTel(), null, new FragmentManager(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().fetchVPNInfo(), null, new PendingIntent(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().fJNWhG(), null, new PictureInPictureParams(c21567hEd), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, values().iwGUEr(), null, new ActionBar(c21567hEd), 2, null);
        }
    }

    /* JADX INFO: renamed from: o.kgr$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C21567hEd c21567hEd) {
            this.copydefault = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.copydefault.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$Application */
    public static final class Application<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C21567hEd c21567hEd) {
            this.KWHzl = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.KWHzl.values;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.KWHzl.isConnected;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.KWHzl.AxsJAY;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$Activity */
    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C21567hEd c21567hEd) {
            this.KWHzl = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.KWHzl.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.KWHzl.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.KWHzl.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(C21567hEd c21567hEd) {
            this.copydefault = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.copydefault.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.copydefault.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.copydefault.RcXXUw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(C21567hEd c21567hEd) {
            this.AEQbTJ = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.AEQbTJ.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.AEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.AEQbTJ.zsXlph;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(C21567hEd c21567hEd) {
            this.EZpvd = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28666kfA c28666kfA, Continuation<? super Unit> continuation) {
            ConstraintLayout root;
            android.content.Context context;
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.EZpvd.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.EZpvd.fARcdN;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.EZpvd.QVAiDq;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28666kfA.KWHzl());
            android.widget.TextView textView2 = this.EZpvd.QbewEr;
            C21567hEd c21567hEd = C28762kgr.this.djBIcL;
            java.lang.String string = (c21567hEd == null || (root = c21567hEd.getRoot()) == null || (context = root.getContext()) == null) ? null : context.getString(c28666kfA.copydefault().toDisplayString());
            textView2.setText(string != null ? string : "");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(C21567hEd c21567hEd) {
            this.EZpvd = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.EZpvd.AuCTel;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.EZpvd.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.EZpvd.QfsBiF;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(C21567hEd c21567hEd) {
            this.copydefault = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.copydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.copydefault.AuCTelauCTel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$PictureInPictureParams */
    public static final class PictureInPictureParams<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(C21567hEd c21567hEd) {
            this.OLrzqt = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28717kfz c28717kfz, Continuation<? super Unit> continuation) {
            C28762kgr c28762kgr = C28762kgr.this;
            C55008xbo c55008xbo = this.OLrzqt.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = this.OLrzqt.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            android.widget.TextView textView = this.OLrzqt.QOLQEE;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c28762kgr.AEQbTJ(c55008xbo, c55008xbo2, textView, c28717kfz);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kgr$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        public final /* synthetic */ C21567hEd OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C21567hEd c21567hEd) {
            this.OLrzqt = c21567hEd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) {
            android.widget.TextView textView = this.OLrzqt.DTwDnp;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
            this.OLrzqt.DTwDnp.setText(java.lang.String.valueOf(list.size()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(C55008xbo c55008xbo, C55008xbo c55008xbo2, android.view.View view, C28717kfz c28717kfz) {
        C55001xbh c55001xbhAkhnZx;
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx2;
        android.text.Editable text2;
        this.AYXKKw = true;
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
        this.AYXKKw = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    public final void AhwBna() {
        ConstraintLayout root;
        android.content.Context context;
        C28729kgK.StateListAnimator stateListAnimator = C28729kgK.Companion;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.openFileOutput);
        java.util.List<TokenAgeType> listGEmmrt = yDY.gEmmrt(TokenAgeType.m, TokenAgeType.H, TokenAgeType.D);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (TokenAgeType tokenAgeType : listGEmmrt) {
            int value = tokenAgeType.getValue();
            C21567hEd c21567hEd = this.djBIcL;
            java.lang.String string = (c21567hEd == null || (root = c21567hEd.getRoot()) == null || (context = root.getContext()) == null) ? null : context.getString(tokenAgeType.toDisplayString());
            arrayList.add(new MemeSelection(string == null ? "" : string, null, null, null, values().fIwbmz().getValue().copydefault().getValue() == tokenAgeType.getValue(), java.lang.String.valueOf(value), null, 78, null));
        }
        C28729kgK c28729kgKAEQbTJ = stateListAnimator.AEQbTJ(new MemeUnitSelectionBottomSheetParams(strAYXKKw, arrayList));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28729kgKAEQbTJ.show(childFragmentManager);
    }

    @Override // o.InterfaceC28728kgJ
    public void EZpvd(MemeSelection memeSelection) {
        android.widget.ImageView imageView;
        if (memeSelection != null) {
            values().EZpvd(values().fIwbmz().getValue().KWHzl().AEQbTJ(), values().fIwbmz().getValue().KWHzl().EZpvd(), TokenAgeType.Companion.AEQbTJ(C33129mqd.AhwBna(memeSelection.KWHzl())));
        }
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd == null || (imageView = c21567hEd.uzCIH) == null) {
            return;
        }
        imageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.QSLkRj));
    }

    @Override // o.InterfaceC28728kgJ
    public void KWHzl() {
        android.widget.ImageView imageView;
        C21567hEd c21567hEd = this.djBIcL;
        if (c21567hEd == null || (imageView = c21567hEd.uzCIH) == null) {
            return;
        }
        imageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.QSLkRj));
    }

    @Override // o.InterfaceC28689kfX
    public void KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        values().AEQbTJ(list);
    }
}
