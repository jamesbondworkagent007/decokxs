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
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.TopTokenFragment$observeData$1;
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

/* JADX INFO: renamed from: o.fua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19082fua extends AbstractC19052ftx {
    public C16565emN AhwBna;
    public RecyclerView.OnScrollListener djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.fua$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.copydefault.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(SearchMainViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.copydefault.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C19082fua() {
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new TaskDescription(this)));
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchMainViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.fuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19082fua.AhwBna();
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ful
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19082fua.AEQbTJ(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.fua$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fua.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C19082fua newInstance$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.KWHzl(str);
        }

        public final C19082fua KWHzl(java.lang.String str) {
            C19082fua c19082fua = new C19082fua();
            c19082fua.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_source", str)));
            return c19082fua;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchMainViewModel gEmmrt() {
        return (SearchMainViewModel) this.valueOf.getValue();
    }

    public static final C19194fwg AhwBna() {
        return new C19194fwg();
    }

    public final C19194fwg djBIcL() {
        return (C19194fwg) this.fetchVPNInfo.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String AEQbTJ(C19082fua c19082fua) {
        android.os.Bundle arguments = c19082fua.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16565emN c16565emNKWHzl = C16565emN.KWHzl(layoutInflater, viewGroup, false);
        this.AhwBna = c16565emNKWHzl;
        if (c16565emNKWHzl != null) {
            return c16565emNKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
        AYXKKw();
    }

    private final void isConnected() {
        final RecyclerView recyclerView;
        djBIcL().register(C18988fsm.class, new C19245fxe(new Function1() { // from class: o.fui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19082fua.KWHzl(this.KWHzl, (C18988fsm) obj);
            }
        }, new Function1() { // from class: o.fuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19082fua.AEQbTJ((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.fuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19082fua.KWHzl(this.EZpvd, (TagEventProperty) obj);
            }
        }));
        C16565emN c16565emN = this.AhwBna;
        if (c16565emN == null || (recyclerView = c16565emN.KWHzl) == null) {
            return;
        }
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(djBIcL());
        recyclerView.postDelayed(new java.lang.Runnable() { // from class: o.fuf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19082fua.AEQbTJ(this.AEQbTJ, recyclerView);
            }
        }, 500L);
    }

    public static final Unit KWHzl(C19082fua c19082fua, C18988fsm c18988fsm) {
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        c19082fua.AEQbTJ(c18988fsm);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C19082fua c19082fua, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        android.content.Context context = c19082fua.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        C18956fsG.EZpvd(tagEventProperty, context);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C19082fua c19082fua, RecyclerView recyclerView) {
        FragmentActivity activity = c19082fua.getActivity();
        if (activity == null) {
            return;
        }
        c19082fua.djBIcL = C17779fRz.OLrzqt(recyclerView, activity);
    }

    private final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TopTokenFragment$observeData$1(this, null), 3, null);
    }

    public final void AEQbTJ(final C18988fsm c18988fsm) {
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        searchItemNavigationHandler.EZpvd(activity, c18988fsm.OLrzqt(), c18988fsm.fetchVPNInfo(), c18988fsm.isConnected());
        C32866mlf.onEvent$default("GlobalSearch_TopSearch_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.fug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19082fua.OLrzqt(c18988fsm, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C18988fsm c18988fsm, C19082fua c19082fua, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_TokenCA", c18988fsm.fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_TokenChainid", java.lang.String.valueOf(c18988fsm.OLrzqt()), false, 4, null);
        java.lang.String strValueOf = c19082fua.valueOf();
        eventParamsList.put("source_id", strValueOf != null ? strValueOf : "", true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C16565emN c16565emN;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.djBIcL;
        if (onScrollListener != null && (c16565emN = this.AhwBna) != null && (recyclerView = c16565emN.KWHzl) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.djBIcL = null;
        this.AhwBna = null;
    }
}
