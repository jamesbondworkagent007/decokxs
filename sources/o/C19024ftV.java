package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.TopDAppFragment$observeData$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.SearchMainViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.dZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ftV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19024ftV extends AbstractC19050ftv {
    public final InterfaceC56387yDm AYXKKw;
    public RecyclerView.OnScrollListener djBIcL;
    public C16565emN gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.ftV$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(SearchMainViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.AEQbTJ.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C19024ftV() {
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new StateListAnimator(this)));
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchMainViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.fue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19024ftV.djBIcL();
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.fub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19024ftV.OLrzqt(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.ftV$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ftV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C19024ftV newInstance$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.KWHzl(str);
        }

        public final C19024ftV KWHzl(java.lang.String str) {
            C19024ftV c19024ftV = new C19024ftV();
            c19024ftV.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_source", str)));
            return c19024ftV;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchMainViewModel gEmmrt() {
        return (SearchMainViewModel) this.valueOf.getValue();
    }

    public static final C19191fwd djBIcL() {
        return new C19191fwd();
    }

    public final C19191fwd AhwBna() {
        return (C19191fwd) this.AYXKKw.getValue();
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.isConnected.getValue();
    }

    public static final java.lang.String OLrzqt(C19024ftV c19024ftV) {
        android.os.Bundle arguments = c19024ftV.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16565emN c16565emNKWHzl = C16565emN.KWHzl(layoutInflater, viewGroup, false);
        this.gEmmrt = c16565emNKWHzl;
        if (c16565emNKWHzl != null) {
            return c16565emNKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AkhnZx();
        valueOf();
    }

    private final void AkhnZx() {
        final RecyclerView recyclerView;
        AhwBna().register(C18987fsl.class, new C19182fwU(new Function1() { // from class: o.ftX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19024ftV.EZpvd(this.EZpvd, (C18987fsl) obj);
            }
        }));
        C16565emN c16565emN = this.gEmmrt;
        if (c16565emN == null || (recyclerView = c16565emN.KWHzl) == null) {
            return;
        }
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(AhwBna());
        recyclerView.postDelayed(new java.lang.Runnable() { // from class: o.ftW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19024ftV.KWHzl(this.AEQbTJ, recyclerView);
            }
        }, 500L);
    }

    public static final Unit EZpvd(C19024ftV c19024ftV, C18987fsl c18987fsl) {
        Intrinsics.checkNotNullParameter(c18987fsl, "");
        c19024ftV.KWHzl(c18987fsl);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C19024ftV c19024ftV, RecyclerView recyclerView) {
        FragmentActivity activity = c19024ftV.getActivity();
        if (activity == null) {
            return;
        }
        c19024ftV.djBIcL = C17779fRz.OLrzqt(recyclerView, activity);
    }

    private final void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TopDAppFragment$observeData$1(this, null), 3, null);
    }

    public final void KWHzl(final C18987fsl c18987fsl) {
        InterfaceC18922frZ interfaceC18922frZCopydefault;
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null || (interfaceC18922frZCopydefault = C18976fsa.copydefault(this)) == null) {
            return;
        }
        searchItemNavigationHandler.copydefault(activity, interfaceC18922frZCopydefault, c18987fsl.KWHzl(), C33129mqd.gEmmrt(java.lang.Long.valueOf(c18987fsl.AEQbTJ())), c18987fsl.EZpvd(), c18987fsl.copydefault());
        C32866mlf.onEvent$default("GlobalSearch_TopSearch_Dapp_Click", (TrackChannel[]) null, new Function1() { // from class: o.fud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19024ftV.copydefault(c18987fsl, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C18987fsl c18987fsl, C19024ftV c19024ftV, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_DAppUrl", c18987fsl.KWHzl(), false, 4, null);
        java.lang.String strAYXKKw = c19024ftV.AYXKKw();
        eventParamsList.put("source_id", strAYXKKw != null ? strAYXKKw : "", true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C16565emN c16565emN;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.djBIcL;
        if (onScrollListener != null && (c16565emN = this.gEmmrt) != null && (recyclerView = c16565emN.KWHzl) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.djBIcL = null;
        this.gEmmrt = null;
    }
}
