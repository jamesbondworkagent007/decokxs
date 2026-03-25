package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.market.features.smart_money.common.event_tracking.SignalButtonNameEvent;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFilterViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalGemsViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalTab;
import com.okinc.business.market.features.smart_money.signal.ui.gems.SignalGemsFragment$adapter$2$1$1;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.model.SingleOverviewDetailFragmentParams;
import com.okinc.business.market.features.smart_money.ui.SmartMoneySharedViewModel;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C29525kvL;
import o.C31197lpV;
import o.C52761wXj;
import o.InterfaceC29553kvn;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29571kwE extends AbstractC29568kwB<C21591hFa> implements InterfaceC29581kwO {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public C29481kuU AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public InterfaceC29581kwO AkhnZx;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm values;

    public C29571kwE() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        TaskDescription taskDescription = new TaskDescription(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(taskDescription));
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalGemsViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new ActionBar(this)));
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartMoneySharedViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new FragmentManager(this)));
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29571kwE.AhwBna(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.kwE$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kwE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C29571kwE KWHzl(@NotNull SmartMoneyConfig smartMoneyConfig, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(smartMoneyConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            C29571kwE c29571kwE = new C29571kwE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("keys.config", smartMoneyConfig);
            bundle.putString("module_name_english", str);
            c29571kwE.setArguments(bundle);
            return c29571kwE;
        }
    }

    /* JADX INFO: renamed from: o.kwE$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.OLrzqt, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29644kxY) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.kwE$FragmentManager */
    public static final class FragmentManager implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29644kxY) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.kwE$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.OLrzqt, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29644kxY) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    public final SignalGemsViewModel AYXKKw() {
        return (SignalGemsViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartMoneySharedViewModel gEmmrt() {
        return (SmartMoneySharedViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignalFilterViewModel AhwBna() {
        return (SignalFilterViewModel) this.gEmmrt.getValue();
    }

    private final kMM valueOf() {
        return (kMM) this.AhwBna.getValue();
    }

    public static final kMM AhwBna(C29571kwE c29571kwE) {
        kMM kmm = new kMM();
        kmm.register(SignalGemsCardsUiModel.class, new C29532kvS(new SignalGemsFragment$adapter$2$1$1(c29571kwE)));
        return kmm;
    }

    public final void copydefault(SignalGemsCardsUiModel signalGemsCardsUiModel) {
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PictureInPictureParams.EZpvd);
        C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.TOKEN_DETAILS, signalGemsCardsUiModel.values(), (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, gEmmrt().KWHzl(), SignalTab.GEMS, (java.lang.String) null, TypedValues.AttributesType.TYPE_PATH_ROTATE, (java.lang.Object) null);
        DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this);
        if (dexFragmentNavigatorAEQbTJ != null) {
            C29652kxg c29652kxgOLrzqt = C29652kxg.Companion.OLrzqt(new SingleOverviewDetailFragmentParams(signalGemsCardsUiModel.EZpvd(), signalGemsCardsUiModel.djBIcL(), gEmmrt().KWHzl()));
            dexFragmentNavigatorAEQbTJ.EZpvd(c29652kxgOLrzqt, (6 & 2) != 0 ? c29652kxgOLrzqt.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21591hFa c21591hFa, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21591hFa, "");
        fetchVPNInfo();
        this.AkhnZx = new C29578kwL(this);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().KWHzl(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().gEmmrt(), null, new Activity(), 2, null);
    }

    /* JADX INFO: renamed from: o.kwE$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC29553kvn interfaceC29553kvn, Continuation<? super Unit> continuation) {
            C29571kwE.this.copydefault(interfaceC29553kvn);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kwE$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29481kuU c29481kuU, Continuation<? super Unit> continuation) {
            if (!C29571kwE.this.gEmmrt().EZpvd()) {
                return Unit.INSTANCE;
            }
            if (C29571kwE.this.AhwBna().OLrzqt(C29571kwE.this.AYXKKw)) {
                C29481kuU c29481kuU2 = C29571kwE.this.AYXKKw;
                if (!Intrinsics.EZpvd(c29481kuU2 != null ? c29481kuU2.copydefault() : null, c29481kuU.copydefault())) {
                    C29571kwE.this.AYXKKw().KWHzl(c29481kuU);
                } else {
                    C29571kwE.this.AYXKKw().AEQbTJ(c29481kuU);
                }
                C29571kwE.this.AYXKKw = c29481kuU;
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        C21591hFa c21591hFa = (C21591hFa) aX_();
        if (c21591hFa != null) {
            c21591hFa.gEmmrt.setAdapter(valueOf());
            c21591hFa.gEmmrt.setItemAnimator(null);
            c21591hFa.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.kwG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29571kwE.KWHzl(this.EZpvd, view);
                }
            });
            C33546myW c33546myW = c21591hFa.AYXKKw;
            c21591hFa.valueOf.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
            c33546myW.djBIcL(false);
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.kwF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C29571kwE.EZpvd(this.OLrzqt, interfaceC57934yrl);
                }
            });
        }
    }

    public static final void KWHzl(C29571kwE c29571kwE, android.view.View view) {
        c29571kwE.gEmmrt().OLrzqt();
        c29571kwE.AYXKKw().KWHzl(c29571kwE.AhwBna().gEmmrt().getValue());
    }

    public static final void EZpvd(C29571kwE c29571kwE, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c29571kwE.AYXKKw().KWHzl(c29571kwE.AhwBna().gEmmrt().getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(InterfaceC29553kvn interfaceC29553kvn) {
        final C21591hFa c21591hFa = (C21591hFa) aX_();
        if (c21591hFa != null) {
            android.widget.LinearLayout linearLayout = c21591hFa.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            boolean z = interfaceC29553kvn instanceof InterfaceC29553kvn.StateListAnimator;
            linearLayout.setVisibility(z ? 0 : 8);
            C55113xdn c55113xdn = c21591hFa.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            boolean z2 = interfaceC29553kvn instanceof InterfaceC29553kvn.TaskDescription;
            c55113xdn.setVisibility(z2 ? 0 : 8);
            C55173xeu c55173xeu = c21591hFa.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            boolean z3 = interfaceC29553kvn instanceof InterfaceC29553kvn.Activity;
            c55173xeu.setVisibility(z3 ? 0 : 8);
            if (z2) {
                kMM.setData$default(valueOf(), yDY.AhwBna(), null, 2, null);
            }
            if (z) {
                InterfaceC29553kvn.StateListAnimator stateListAnimator = (InterfaceC29553kvn.StateListAnimator) interfaceC29553kvn;
                boolean zIsEmpty = stateListAnimator.OLrzqt().isEmpty();
                boolean z4 = !zIsEmpty;
                C55173xeu c55173xeu2 = c21591hFa.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(zIsEmpty ? 0 : 8);
                C33546myW c33546myW = c21591hFa.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                c33546myW.setVisibility(z4 ? 0 : 8);
                kMM.setData$default(valueOf(), stateListAnimator.OLrzqt(), null, 2, null);
                if (!z4) {
                    OLrzqt(stateListAnimator.AEQbTJ());
                }
                if (AYXKKw().copydefault()) {
                    c21591hFa.gEmmrt.post(new java.lang.Runnable() { // from class: o.kwD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29571kwE.OLrzqt(c21591hFa);
                        }
                    });
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (z3) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                kMM.setData$default(valueOf(), yDY.AhwBna(), null, 2, null);
            } else {
                kMM.setData$default(valueOf(), yDY.AhwBna(), null, 2, null);
            }
            c21591hFa.AYXKKw.AEQbTJ();
        }
    }

    public static final void OLrzqt(C21591hFa c21591hFa) {
        c21591hFa.gEmmrt.smoothScrollToPosition(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        C55173xeu c55173xeu;
        C21591hFa c21591hFa = (C21591hFa) aX_();
        if (c21591hFa == null || (c55173xeu = c21591hFa.KWHzl) == null) {
            return;
        }
        if (z) {
            c55173xeu.AEQbTJ().setVisibility(8);
            c55173xeu.setEmptyTypeImage(7);
            java.lang.String string = getString(C23274hvD.Fragment.onRestoreInstanceState);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            return;
        }
        c55173xeu.AEQbTJ().setVisibility(0);
        c55173xeu.setEmptyTypeImage(6);
        java.lang.String string2 = getString(C23274hvD.Fragment.svUkWZ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setTitle(string2);
        java.lang.String string3 = getString(C23274hvD.Fragment.ActivityResultRegistry1);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29571kwE.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(C29571kwE c29571kwE, android.view.View view) {
        c29571kwE.AYXKKw().KWHzl(c29571kwE.AhwBna().gEmmrt().getValue());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21591hFa KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21591hFa c21591hFaCopydefault = C21591hFa.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21591hFaCopydefault, "");
        return c21591hFaCopydefault;
    }

    @Override // o.InterfaceC29581kwO
    public void AEQbTJ(@NotNull InterfaceC29579kwM interfaceC29579kwM) {
        Intrinsics.checkNotNullParameter(interfaceC29579kwM, "");
        if (!(interfaceC29579kwM instanceof InterfaceC29579kwM.Dialog)) {
            InterfaceC29581kwO interfaceC29581kwO = this.AkhnZx;
            if (interfaceC29581kwO != null) {
                interfaceC29581kwO.AEQbTJ(interfaceC29579kwM);
                return;
            }
            return;
        }
        C29525kvL.TaskDescription taskDescription = C29525kvL.Companion;
        InterfaceC29579kwM.Dialog dialog = (InterfaceC29579kwM.Dialog) interfaceC29579kwM;
        java.lang.String strOLrzqt = dialog.OLrzqt();
        java.lang.String strKWHzl = dialog.KWHzl();
        InterfaceC56445yFq<InfluencerType> entries = InfluencerType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        java.util.Iterator<InfluencerType> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(C33129mqd.AhwBna(it.next().getValue())));
        }
        C29525kvL c29525kvLEZpvd = taskDescription.EZpvd(strOLrzqt, strKWHzl, arrayList);
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c29525kvLEZpvd.show(parentFragmentManager);
    }
}
