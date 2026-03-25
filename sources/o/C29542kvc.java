package o;

import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.features.smart_money.common.event_tracking.SignalButtonNameEvent;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalAlertViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFilterViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$checkLoginStatus$2;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$onToggleAlertClick$1;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$setupFilterBar$1$1;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$setupFilterBar$1$2;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$setupFilterBar$1$3;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$setupFilterBar$1$4;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$setupFilterBar$1$5;
import com.okinc.business.market.features.smart_money.signal.ui.SignalTab;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalFilterChip;
import com.okinc.business.market.features.smart_money.ui.SmartMoneySharedViewModel;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import com.okinc.core.util.SPUtils;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC29476kuP;
import o.C23274hvD;
import o.C29463kuC;
import o.C29642kxW;
import o.C31197lpV;
import o.C33625mzw;
import o.C44103sDl;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.kvc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29542kvc extends AbstractC29473kuM<C21595hFe> implements InterfaceC29606kwn, InterfaceC29633kxN {
    public static boolean AhwBna;
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public static boolean gEmmrt;
    public static boolean valueOf;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public TabLayoutMediator fJNWhG;
    public boolean fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public int values;

    /* JADX INFO: renamed from: o.kvc$BroadcastReceiver */
    public static final class BroadcastReceiver implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
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
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.kvc$ClipData */
    public static final class ClipData implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.KWHzl, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
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
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.kvc$ComponentName */
    public static final class ComponentName implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
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
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21595hFe valueOf(C29542kvc c29542kvc) {
        return (C21595hFe) c29542kvc.aX_();
    }

    public C29542kvc() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(broadcastReceiver));
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalAlertViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new ClipData(this)));
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartMoneySharedViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new ComponentName(this)));
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.kvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29542kvc.uzCIH(this.KWHzl);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.kvf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C29542kvc.iwGUEr(this.AEQbTJ));
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.kvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29542kvc.fARcdN(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.kvc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kvc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C29542kvc newInstance$default(Application application, SmartMoneyConfig smartMoneyConfig, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                str2 = null;
            }
            return application.OLrzqt(smartMoneyConfig, str, z, str2);
        }

        public final C29542kvc OLrzqt(@NotNull SmartMoneyConfig smartMoneyConfig, @NotNull java.lang.String str, boolean z, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(smartMoneyConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            C29542kvc c29542kvc = new C29542kvc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("keys.config", smartMoneyConfig);
            bundle.putString("module_name_english", str);
            bundle.putBoolean("isSmartAccount", z);
            bundle.putString("signalTab", str2);
            c29542kvc.setArguments(bundle);
            return c29542kvc;
        }
    }

    public final SignalAlertViewModel fARcdN() {
        return (SignalAlertViewModel) this.fARcdN.getValue();
    }

    public final SmartMoneySharedViewModel ejfBZ() {
        return (SmartMoneySharedViewModel) this.ejfBZ.getValue();
    }

    public final SignalFilterViewModel fJNWhG() {
        return (SignalFilterViewModel) this.fIwbmz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AubY() {
        return (java.lang.String) this.AkhnZx.getValue();
    }

    public static final java.lang.String uzCIH(C29542kvc c29542kvc) {
        java.lang.String string;
        android.os.Bundle arguments = c29542kvc.getArguments();
        return (arguments == null || (string = arguments.getString("module_name_english")) == null) ? "--" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zLjUOn() {
        return ((java.lang.Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean iwGUEr(C29542kvc c29542kvc) {
        android.os.Bundle arguments = c29542kvc.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isSmartAccount");
        }
        return false;
    }

    public final SignalTab AuCTel() {
        return (SignalTab) this.isConnected.getValue();
    }

    public static final SignalTab fARcdN(C29542kvc c29542kvc) {
        android.os.Bundle arguments = c29542kvc.getArguments();
        return SignalTab.Companion.KWHzl(arguments != null ? arguments.getString("signalTab") : null);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21595hFe KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21595hFe c21595hFeCopydefault = C21595hFe.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21595hFeCopydefault, "");
        return c21595hFeCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21595hFe c21595hFe, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21595hFe, "");
        wlaJM();
        ejfBZ().KWHzl(zLjUOn());
        ejfBZ().OLrzqt();
        fARcdN().copydefault();
        C25390ivn.collectOnViewLifecycle$default(this, ejfBZ().copydefault(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().AEQbTJ(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().KWHzl(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().djBIcL(), null, new FragmentManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fJNWhG().gEmmrt(), null, new Dialog(), 2, null);
        getFieldNames();
    }

    /* JADX INFO: renamed from: o.kvc$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(SmartMoneyConfig smartMoneyConfig, Continuation<? super Unit> continuation) {
            if (C29542kvc.this.ejfBZ().EZpvd()) {
                C29542kvc.this.KWHzl(smartMoneyConfig);
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C29542kvc.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kvc$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29463kuC c29463kuC, Continuation<? super Unit> continuation) {
            C29542kvc.this.AEQbTJ(c29463kuC);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kvc$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29542kvc EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C29542kvc c29542kvc) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c29542kvc;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.ktA.trackSignalPageClick$default(o.ktA, com.okinc.business.market.features.smart_money.common.event_tracking.SignalButtonNameEvent, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, boolean, com.okinc.business.market.features.smart_money.signal.ui.SignalTab, java.lang.String, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C29542kvc.onToggleAlertClick$default(this.EZpvd, null, 1, null);
                C29408ktA c29408ktA = C29408ktA.KWHzl;
                c29408ktA.copydefault(this.EZpvd.fARcdN().AEQbTJ().getValue().OLrzqt());
                SignalButtonNameEvent signalButtonNameEvent = SignalButtonNameEvent.ALERT_BUTTON;
                boolean zOLrzqt = this.EZpvd.fARcdN().AEQbTJ().getValue().OLrzqt();
                C29408ktA.trackSignalPageClick$default(c29408ktA, signalButtonNameEvent, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.valueOf(zOLrzqt), (java.lang.String) null, this.EZpvd.zLjUOn(), (SignalTab) null, (java.lang.String) null, 430, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kvc$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C29542kvc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C29542kvc c29542kvc) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c29542kvc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: o.kvc$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C29542kvc OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C29542kvc c29542kvc) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c29542kvc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.hDKMBd();
            }
        }
    }

    /* JADX INFO: renamed from: o.kvc$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29542kvc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C29542kvc c29542kvc) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c29542kvc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C29542kvc c29542kvc = this.copydefault;
                c29542kvc.KWHzl(c29542kvc.new LoaderManager());
            }
        }
    }

    /* JADX INFO: renamed from: o.kvc$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29542kvc KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C29542kvc c29542kvc) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c29542kvc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Application application = C29542kvc.Companion;
                C29542kvc.valueOf = true;
                this.KWHzl.fARcdN().OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.kvc$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC29476kuP abstractC29476kuP, Continuation<? super Unit> continuation) {
            C29542kvc.this.AEQbTJ(abstractC29476kuP);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kvc$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Number) obj).intValue(), continuation);
        }

        public final java.lang.Object OLrzqt(int i, Continuation<? super Unit> continuation) {
            java.lang.String string = C29542kvc.this.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kvc$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29481kuU c29481kuU, Continuation<? super Unit> continuation) {
            C29542kvc.this.zsXlph();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        SignalTab signalTabAEQbTJ;
        super.onResume();
        djBIcL();
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe == null || (signalTabAEQbTJ = SignalTab.Companion.AEQbTJ(c21595hFe.AYXKKw.getCurrentItem())) == null) {
            return;
        }
        C29408ktA.trackSignalPageView$default(C29408ktA.KWHzl, signalTabAEQbTJ.getTabValue(), null, zLjUOn(), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C29629kxJ c29629kxJ;
        super.onDestroyView();
        TabLayoutMediator tabLayoutMediator = this.fJNWhG;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.fJNWhG = null;
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe == null || (c29629kxJ = c21595hFe.EZpvd) == null) {
            return;
        }
        c29629kxJ.OLrzqt();
    }

    public final void KWHzl(SmartMoneyConfig smartMoneyConfig) {
        fJNWhG().copydefault(fetchVPNInfo(), C29556kvq.copydefault(smartMoneyConfig.copydefault(), smartMoneyConfig.KWHzl()), smartMoneyConfig.OLrzqt());
    }

    public final java.util.List<SignalMultiSelectUiModel> fetchVPNInfo() {
        InterfaceC56445yFq<InfluencerType> entries = InfluencerType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (InfluencerType influencerType : entries) {
            java.lang.String value = influencerType.getValue();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(influencerType.getStringRes());
            int drawableRes = influencerType.getDrawableRes();
            arrayList.add(new SignalMultiSelectUiModel(value, strAYXKKw, "", java.lang.Integer.valueOf(drawableRes), true, influencerType.getEventTrackingKey()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void wlaJM() {
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe != null) {
            uzCIH();
            AppCompatImageView appCompatImageView = c21595hFe.AhwBna;
            appCompatImageView.setOnClickListener(new Fragment(appCompatImageView, 1000L, this));
            AppCompatImageView appCompatImageView2 = c21595hFe.OLrzqt;
            appCompatImageView2.setOnClickListener(new PictureInPictureParams(appCompatImageView2, 1000L, this));
            AppCompatImageView appCompatImageView3 = c21595hFe.AEQbTJ;
            appCompatImageView3.setOnClickListener(new AssistContent(appCompatImageView3, 1000L, this));
            ViewPager2 viewPager2 = c21595hFe.AYXKKw;
            viewPager2.setAdapter(new Activity(this, this));
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.registerOnPageChangeCallback(new PendingIntent());
            viewPager2.setCurrentItem(AuCTel().getPosition(), false);
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c21595hFe.djBIcL.copydefault(), c21595hFe.AYXKKw, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kvm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C29542kvc.EZpvd(this.OLrzqt, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.fJNWhG = tabLayoutMediator;
            OKAlertBanner oKAlertBanner = c21595hFe.KWHzl;
            android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new VoiceInteractor(imageViewOLrzqt, 1000L, this));
            C52794wYp c52794wYpAEQbTJ = oKAlertBanner.AEQbTJ();
            c52794wYpAEQbTJ.setOnClickListener(new SharedElementCallback(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.kvc$PendingIntent */
    public static final class PendingIntent extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: o.kvc$PendingIntent$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SignalTab.values().length];
                try {
                    iArr[SignalTab.GEMS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[SignalTab.ACTIVITY.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[SignalTab.OVERVIEW.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                KWHzl = iArr;
            }
        }

        public PendingIntent() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            SignalButtonNameEvent signalButtonNameEvent;
            boolean z;
            C29629kxJ c29629kxJ;
            super.onPageSelected(i);
            SignalTab.TaskDescription taskDescription = SignalTab.Companion;
            SignalTab signalTabAEQbTJ = taskDescription.AEQbTJ(C29542kvc.this.values);
            SignalTab signalTabAEQbTJ2 = taskDescription.AEQbTJ(i);
            if (signalTabAEQbTJ2 == null) {
                return;
            }
            C21595hFe c21595hFeValueOf = C29542kvc.valueOf(C29542kvc.this);
            if (c21595hFeValueOf != null && (c29629kxJ = c21595hFeValueOf.EZpvd) != null) {
                c29629kxJ.copydefault(signalTabAEQbTJ2);
            }
            int i2 = Activity.KWHzl[signalTabAEQbTJ2.ordinal()];
            if (i2 == 1) {
                signalButtonNameEvent = SignalButtonNameEvent.GEMS_TAB;
            } else if (i2 == 2) {
                signalButtonNameEvent = SignalButtonNameEvent.ACTIVITIES_TAB;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                signalButtonNameEvent = SignalButtonNameEvent.OVERVIEWS_TAB;
            }
            SignalButtonNameEvent signalButtonNameEvent2 = signalButtonNameEvent;
            if (!C29542kvc.this.fetchVPNInfo || signalTabAEQbTJ == null) {
                z = true;
            } else {
                z = true;
                C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, signalButtonNameEvent2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, signalTabAEQbTJ2.getTabValue(), C29542kvc.this.zLjUOn(), signalTabAEQbTJ, (java.lang.String) null, 286, (java.lang.Object) null);
            }
            C29542kvc.this.values = i;
            C29542kvc.this.fetchVPNInfo = z;
        }
    }

    public static final void EZpvd(C29542kvc c29542kvc, TabLayout.Tab tab, int i) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tab, "");
        SignalTab signalTabAEQbTJ = SignalTab.Companion.AEQbTJ(i);
        if (signalTabAEQbTJ != null) {
            android.content.Context context = c29542kvc.getContext();
            java.lang.String string = context != null ? context.getString(signalTabAEQbTJ.getTitleResId()) : null;
            if (string != null) {
                str = string;
            }
        }
        tab.setText(str);
        tab.setContentDescription("web3_dex_market_signal_tab_" + i);
    }

    /* JADX INFO: renamed from: o.kvc$LoaderManager */
    public static final class LoaderManager implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C29542kvc.this.fARcdN().EZpvd();
        }
    }

    public final void djBIcL() {
        final android.content.Context context = getContext();
        if (context != null) {
            C33625mzw.OLrzqt().AEQbTJ(context, new C33625mzw.StateListAnimator() { // from class: o.kvl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C33625mzw.StateListAnimator
                public final void KWHzl(boolean z) {
                    C29542kvc.OLrzqt(this.AEQbTJ, context, z);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(final C29542kvc c29542kvc, android.content.Context context, boolean z) {
        OKAlertBanner oKAlertBanner;
        OKAlertBanner oKAlertBanner2;
        OKAlertBanner oKAlertBanner3;
        C21595hFe c21595hFe = (C21595hFe) c29542kvc.aX_();
        if (c21595hFe == null || (oKAlertBanner = c21595hFe.copydefault) == null) {
            return;
        }
        oKAlertBanner.setLeadingIcon(C33070mpX.EZpvd(C52761wXj.TaskDescription.GGlJim, context));
        if (!z) {
            AhwBna = true;
            oKAlertBanner.setStyle(-1);
            oKAlertBanner.setMessage(context.getString(C23274hvD.Fragment.UnZVfqExternalSyntheticApiModelOutline0));
            oKAlertBanner.gEmmrt().setVisibility(8);
            oKAlertBanner.setPrimaryAction(context.getString(C23274hvD.Fragment.m), new Function0() { // from class: o.kvg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29542kvc.ejfBZ(this.KWHzl);
                }
            });
            oKAlertBanner.setVisibility(0);
            return;
        }
        AhwBna = false;
        oKAlertBanner.setVisibility(8);
        C29463kuC value = c29542kvc.fARcdN().AEQbTJ().getValue();
        C21595hFe c21595hFe2 = (C21595hFe) c29542kvc.aX_();
        if (c21595hFe2 != null && (oKAlertBanner3 = c21595hFe2.KWHzl) != null) {
            oKAlertBanner3.setVisibility((!value.copydefault() || valueOf) ? 8 : 0);
        }
        C21595hFe c21595hFe3 = (C21595hFe) c29542kvc.aX_();
        if (c21595hFe3 == null || (oKAlertBanner2 = c21595hFe3.KWHzl) == null) {
            return;
        }
        oKAlertBanner2.setLeadingIcon(C33070mpX.EZpvd(C52761wXj.TaskDescription.GGlJim, context));
    }

    public static final Unit ejfBZ(C29542kvc c29542kvc) {
        C33625mzw.OLrzqt().EZpvd(c29542kvc.requireActivity());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kvc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkLoginStatus$default(C29542kvc c29542kvc, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.kvb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29542kvc.valueOf();
                }
            };
        }
        c29542kvc.KWHzl((Function0<Unit>) function0);
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(Function0<Unit> function0) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SignalFragment$checkLoginStatus$2(this, function0, null), 3, null);
    }

    public static /* synthetic */ void onToggleAlertClick$default(C29542kvc c29542kvc, C29463kuC.Application application, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            application = null;
        }
        c29542kvc.AEQbTJ(application);
    }

    public final void AEQbTJ(C29463kuC.Application application) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SignalFragment$onToggleAlertClick$1(this, application, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(C29463kuC c29463kuC) {
        C21595hFe c21595hFe;
        OKAlertBanner oKAlertBanner;
        AppCompatImageView appCompatImageView;
        C21595hFe c21595hFe2 = (C21595hFe) aX_();
        if (c21595hFe2 != null && (appCompatImageView = c21595hFe2.AEQbTJ) != null) {
            appCompatImageView.setImageResource(c29463kuC.OLrzqt() ? C52761wXj.TaskDescription.addPreRequisiteCollector : C52761wXj.TaskDescription.invokespecialhrnhsO);
        }
        if (AhwBna || (c21595hFe = (C21595hFe) aX_()) == null || (oKAlertBanner = c21595hFe.KWHzl) == null) {
            return;
        }
        oKAlertBanner.setVisibility((!c29463kuC.copydefault() || valueOf) ? 8 : 0);
    }

    public final void AEQbTJ(final AbstractC29476kuP abstractC29476kuP) {
        if (abstractC29476kuP == null) {
            return;
        }
        if (abstractC29476kuP instanceof AbstractC29476kuP.StateListAnimator) {
            AEQbTJ(((AbstractC29476kuP.StateListAnimator) abstractC29476kuP).OLrzqt());
        } else if (abstractC29476kuP instanceof AbstractC29476kuP.TaskDescription) {
            fARcdN().AEQbTJ(((AbstractC29476kuP.TaskDescription) abstractC29476kuP).copydefault());
        } else if (abstractC29476kuP instanceof AbstractC29476kuP.Application) {
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            interfaceC9854bdT.EZpvd(contextRequireContext, ((AbstractC29476kuP.Application) abstractC29476kuP).copydefault(), new Function1() { // from class: o.kuZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29542kvc.KWHzl(this.EZpvd, abstractC29476kuP, (android.os.Bundle) obj);
                }
            }, null);
        } else if (!(abstractC29476kuP instanceof AbstractC29476kuP.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        fARcdN().AhwBna();
    }

    public static final Unit KWHzl(C29542kvc c29542kvc, AbstractC29476kuP abstractC29476kuP, android.os.Bundle bundle) {
        c29542kvc.fARcdN().AEQbTJ(bundle, ((AbstractC29476kuP.Application) abstractC29476kuP).OLrzqt());
        return Unit.INSTANCE;
    }

    public final void hDKMBd() {
        new C29498kul().show(getParentFragmentManager(), "javaClass");
        C29408ktA.KWHzl.AEQbTJ();
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.String str, java.lang.String str2, Function0<Unit> function0) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            spannableString.setSpan(new TaskStackBuilder(function0), iIntValue, str2.length() + iIntValue, 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: o.kvc$TaskStackBuilder */
    public static final class TaskStackBuilder extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> copydefault;

        public TaskStackBuilder(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public final void getFieldNames() {
        final android.content.Context context = getContext();
        if (context == null || !C22416heu.AxsJAY() || gEmmrt) {
            return;
        }
        java.lang.String string = context.getString(C23274hvD.Fragment.dmfpNf);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = context.getString(C23274hvD.Fragment.DGUQLIDGUQLI);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.CharSequence charSequenceAEQbTJ = AEQbTJ(C33069mpW.KWHzl(context, C23274hvD.Fragment.QkdxfA, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("terms", string))), string, (Function0<Unit>) new Function0() { // from class: o.kuY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29542kvc.OLrzqt(context);
            }
        });
        java.lang.String string3 = context.getString(C23274hvD.Fragment.RKDWNf);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        C25352ivB.showOKDialogCheckboxWithCallback$default(context, string2, charSequenceAEQbTJ, string3, C23274hvD.Fragment.zLjUOn, null, new Function1() { // from class: o.kve
            private static final byte[] $$c = {57, -92, 62, -26};
            private static final int $$d = CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {49, 0, -7, -45, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
            private static final int $$b = 134;
            private static int gEmmrt = 0;
            private static int djBIcL = 1;
            private static char[] OLrzqt = {62876, 62944, 62946, 62959, 62974, 62945, 62950, 62872, 62954, 62957, 62971, 62861, 62970, 62955, 62911, 62972, 62951, 62948, 62875, 62973, 62968, 62947, 62869, 62850, 62956, 62849, 62863};
            private static int AEQbTJ = 585626975;
            private static boolean copydefault = true;
            private static boolean KWHzl = true;
            private static int[] EZpvd = {678355394, 1552572253, 1185650692, 2053025656, -1138211942, 139949706, 1347906646, -1300634321, 1965333663, 781151286, -1623453471, -1244391621, 1214399220, -1949479065, 736701892, 2111905674, -1446931113, 2026476745};

            /* JADX DEBUG: Duplicate block (B:10:0x0026) to fix multi-entry loop: BACK_EDGE: B:9:0x0024 -> B:10:0x0026 */
            private static java.lang.String $$e(byte b, int i, int i2) {
                byte[] bArr = $$c;
                int i3 = 110 - i2;
                int i4 = b * 3;
                int i5 = (i * 2) + 4;
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i5++;
                    i3 = i6 + i5;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    int i8 = bArr[i5];
                    i5++;
                    i3 += i8;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Duplicate block (B:10:0x0030) to fix multi-entry loop: BACK_EDGE: B:9:0x0029 -> B:10:0x0030 */
            private static void c(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
                int i = (b3 * 20) + 79;
                byte[] bArr = $$a;
                int i2 = (b2 * 10) + 4;
                int i3 = b * 5;
                byte[] bArr2 = new byte[i3 + 6];
                int i4 = i3 + 5;
                int i5 = -1;
                if (bArr == null) {
                    i5 = -1;
                    i = i4 + i2 + 8;
                    i2++;
                }
                while (true) {
                    int i6 = i5 + 1;
                    bArr2[i6] = (byte) i;
                    if (i6 == i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i7 = i;
                    int i8 = i2 + 1;
                    i5 = i6;
                    i = i7 + bArr[i2] + 8;
                    i2 = i8;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = djBIcL + 23;
                gEmmrt = i2 % 128;
                int i3 = i2 % 2;
                Unit unitKWHzl = C29542kvc.KWHzl(((java.lang.Boolean) obj).booleanValue());
                int i4 = djBIcL + 119;
                gEmmrt = i4 % 128;
                int i5 = i4 % 2;
                return unitKWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int[] iArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Zm zm = new Zm();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = EZpvd;
                int i3 = 698602880;
                if (iArr2 != null) {
                    int i4 = $11 + 85;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i6])};
                            java.lang.Object objEZpvd = YY.EZpvd(698602880);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            iArr3[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = EZpvd;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = $10 + 49;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        try {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr5[i7])};
                            java.lang.Object objEZpvd2 = YY.EZpvd(i3);
                            if (objEZpvd2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                            i7++;
                            i3 = 698602880;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                zm.OLrzqt = 0;
                while (zm.OLrzqt < iArr.length) {
                    int i10 = $10 + 37;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
                    cArr[1] = (char) iArr[zm.OLrzqt];
                    cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
                    cArr[3] = (char) iArr[zm.OLrzqt + 1];
                    zm.copydefault = (cArr[0] << 16) + cArr[1];
                    zm.KWHzl = (cArr[2] << 16) + cArr[3];
                    Zm.EZpvd(iArr4);
                    int i12 = 0;
                    while (i12 < 16) {
                        int i13 = $10 + 125;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            zm.copydefault ^= iArr4[i12];
                            java.lang.Object[] objArr4 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                            java.lang.Object objEZpvd3 = YY.EZpvd(984677556);
                            if (objEZpvd3 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objEZpvd3 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e(b5, b6, (byte) (b6 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                            }
                            int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue();
                            zm.copydefault = zm.KWHzl;
                            zm.KWHzl = iIntValue;
                            i12 += 127;
                        } else {
                            zm.copydefault ^= iArr4[i12];
                            try {
                                java.lang.Object[] objArr5 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                                java.lang.Object objEZpvd4 = YY.EZpvd(984677556);
                                if (objEZpvd4 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e(b7, b8, (byte) (b8 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                                }
                                int iIntValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                zm.copydefault = zm.KWHzl;
                                zm.KWHzl = iIntValue2;
                                i12++;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                    }
                    int i14 = zm.copydefault;
                    zm.copydefault = zm.KWHzl;
                    zm.KWHzl = i14;
                    zm.KWHzl ^= iArr4[16];
                    zm.copydefault ^= iArr4[17];
                    int i15 = zm.copydefault;
                    int i16 = zm.KWHzl;
                    cArr[0] = (char) (zm.copydefault >>> 16);
                    cArr[1] = (char) zm.copydefault;
                    cArr[2] = (char) (zm.KWHzl >>> 16);
                    cArr[3] = (char) zm.KWHzl;
                    Zm.EZpvd(iArr4);
                    cArr2[zm.OLrzqt * 2] = cArr[0];
                    cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
                    cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
                    cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr6 = {zm, zm};
                    java.lang.Object objEZpvd5 = YY.EZpvd(-1770687495);
                    if (objEZpvd5 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objEZpvd5 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$e(b9, b10, (byte) (b10 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6);
                    int i17 = $11 + 71;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [172=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(int i, char[] cArr, int[] iArr, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Ze ze = new Ze();
                char[] cArr2 = OLrzqt;
                if (cArr2 != null) {
                    int i3 = $10 + 95;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5])};
                            java.lang.Object objEZpvd = YY.EZpvd(-855574269);
                            if (objEZpvd == null) {
                                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AEQbTJ)};
                java.lang.Object objEZpvd2 = YY.EZpvd(-1914793274);
                if (objEZpvd2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd2 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$e(b, b2, (byte) (b2 | Ascii.VT)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                int i6 = -1317980492;
                if (KWHzl) {
                    int i7 = $11 + 69;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    ze.copydefault = bArr.length;
                    char[] cArr4 = new char[ze.copydefault];
                    ze.AEQbTJ = 0;
                    while (ze.AEQbTJ < ze.copydefault) {
                        cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                        java.lang.Object[] objArr4 = {ze, ze};
                        java.lang.Object objEZpvd3 = YY.EZpvd(-1317980492);
                        if (objEZpvd3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objEZpvd3 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b3, b4, (byte) (b4 | 9)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    }
                    objArr[0] = new java.lang.String(cArr4);
                    return;
                }
                if (!copydefault) {
                    ze.copydefault = iArr.length;
                    char[] cArr5 = new char[ze.copydefault];
                    ze.AEQbTJ = 0;
                    while (ze.AEQbTJ < ze.copydefault) {
                        int i9 = $11 + 55;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                        ze.AEQbTJ++;
                    }
                    objArr[0] = new java.lang.String(cArr5);
                    return;
                }
                int i11 = $11 + 29;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                ze.copydefault = cArr.length;
                char[] cArr6 = new char[ze.copydefault];
                ze.AEQbTJ = 0;
                while (ze.AEQbTJ < ze.copydefault) {
                    cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                    java.lang.Object[] objArr5 = {ze, ze};
                    java.lang.Object objEZpvd4 = YY.EZpvd(i6);
                    if (objEZpvd4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b5, b6, (byte) (b6 | 9)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                    i6 = -1317980492;
                }
                objArr[0] = new java.lang.String(cArr6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void OLrzqt(long j, long j2) throws java.lang.Throwable {
                long j3;
                java.lang.Object obj;
                int i = 2 % 2;
                int i2 = djBIcL + 23;
                gEmmrt = i2 % 128;
                if (i2 % 2 != 0) {
                    j3 = j / (j2 >>> 58);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(122, null, null, new byte[]{-122, -126, -121, -122, -123, -124, -125, -126, -127}, objArr);
                    obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                } else {
                    j3 = j ^ (j2 << 32);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-122, -126, -121, -122, -123, -124, -125, -126, -127}, objArr2);
                    obj = C44103sDl.class.getField((java.lang.String) objArr2[0]).get(null);
                }
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-105, -110, -112, -123, -108, -106, -106, -123, -127, -107, -119, -108, -115, -109, -110, -112, -115, -111, -112, -113, -114, -118, -126, -124, -115, -116, -117, -118, -123, -119, -120}, objArr3);
                    java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-117, -122, -115, -124, -124, -123}, objArr5);
                    java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr5[0], java.lang.String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, objArr4);
                    int i3 = gEmmrt + 33;
                    djBIcL = i3 % 128;
                    int i4 = i3 % 2;
                    java.lang.Object[] objArr6 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-117, -122, -115, -124, -124, -123}, objArr7);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr7[0], java.lang.Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr6);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-118, -115, -107, -123, -122, -123, -104, -107, -126, -106, -123, -121, -109, -122, -126, -121, -114, -112, -115, -114, -115, -109}, objArr8);
                    java.lang.String str = (java.lang.String) objArr8[0];
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(new int[]{712853618, -1819024950, -436749183, -2030551221}, 8, objArr9);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr9[0], null);
                    method3.setAccessible(true);
                    java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-107, -103, -125}, objArr10);
                    java.lang.String str2 = (java.lang.String) objArr10[0];
                    int i5 = djBIcL + 125;
                    gEmmrt = i5 % 128;
                    int i6 = i5 % 2;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(127, null, null, new byte[]{-118, -115, -114, -115, -125, -123, -118, -123, -101, -106, -106, -119, -102, -114, -126, -102, -110, -112, -115, -111, -112}, objArr11);
                    java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.String.class);
                    method4.setAccessible(true);
                    method4.invoke(null, objInvoke, str2);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        b(new int[]{-2009575252, 349897962, -963417714, -463245158, -1185906244, -1214644797, 1898203476, -769839259, -861723830, 1294117974, 1283715321, -499624086}, 23, objArr12);
                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).toString()};
                        java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                        declaredConstructor2.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr13));
                    }
                    java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, obj2);
                    java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method6.setAccessible(true);
                    method6.invoke(obj2, str, objInvoke);
                    byte[] bArr = $$a;
                    byte b = bArr[6];
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c(b, bArr[1], b, objArr14);
                    java.lang.reflect.Method method7 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr14[0], null);
                    method7.setAccessible(true);
                    java.lang.Object objInvoke2 = method7.invoke(obj, null);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b(new int[]{1889322838, -221563868, 1216872988, 685770440, -1312816766, -588218960, -939145085, 268733189, 1732307284, -811002573}, 18, objArr15);
                    DetectionInfoBean.class.getField((java.lang.String) objArr15[0]).setBoolean(objInvoke2, true);
                    byte b2 = bArr[6];
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    c(b2, bArr[1], b2, objArr16);
                    java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
                    method8.setAccessible(true);
                    java.lang.Object objInvoke3 = method8.invoke(obj, null);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b(new int[]{-515533997, -1437695541, -546131968, -715068232, -476259500, 1631946140}, 9, objArr17);
                    DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).set(objInvoke3, lValueOf);
                    int i7 = gEmmrt + 51;
                    djBIcL = i7 % 128;
                    int i8 = i7 % 2;
                    byte b3 = bArr[1];
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    c(b3, bArr[6], b3, objArr18);
                    java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                    method9.setAccessible(true);
                    method9.invoke(obj, null);
                    int i9 = djBIcL + 47;
                    gEmmrt = i9 % 128;
                    int i10 = i9 % 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }, 16, null);
        gEmmrt = true;
    }

    public static final Unit OLrzqt(android.content.Context context) {
        java.lang.String string = context.getString(C23274hvD.Fragment.IYdWPz);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C25352ivB.KWHzl(context, string);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z) {
        if (z) {
            SPUtils.put("dex_hide_smart_money_disclaimer", java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        C29629kxJ c29629kxJ;
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe == null || (c29629kxJ = c21595hFe.EZpvd) == null) {
            return;
        }
        c29629kxJ.setFilterTypeClick(new SignalFragment$setupFilterBar$1$1(this));
        c29629kxJ.setFilterInfluencerClick(new SignalFragment$setupFilterBar$1$2(this));
        c29629kxJ.setFilterChainClick(new SignalFragment$setupFilterBar$1$3(this));
        c29629kxJ.setSortTypeClick(new SignalFragment$setupFilterBar$1$4(this));
        c29629kxJ.setFilterButtonClick(new SignalFragment$setupFilterBar$1$5(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zsXlph() {
        C29629kxJ c29629kxJ;
        C29481kuU value = fJNWhG().gEmmrt().getValue();
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe == null || (c29629kxJ = c21595hFe.EZpvd) == null) {
            return;
        }
        c29629kxJ.copydefault(value.EZpvd());
        c29629kxJ.EZpvd(value.OLrzqt());
        c29629kxJ.EZpvd(value.copydefault());
        c29629kxJ.EZpvd(value.valueOf());
        c29629kxJ.EZpvd(fJNWhG().AhwBna());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        C29629kxJ c29629kxJ;
        java.util.List<C29635kxP> listAhwBna = AhwBna();
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe != null && (c29629kxJ = c21595hFe.EZpvd) != null) {
            c29629kxJ.copydefault(SignalFilterChip.GEM_TYPE, true);
        }
        C29642kxW.Companion.AEQbTJ(listAhwBna, java.lang.Integer.valueOf(C23274hvD.Fragment.invokespecialhrnhsO), new Function1() { // from class: o.kvj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29542kvc.OLrzqt(this.OLrzqt, (C29635kxP) obj);
            }
        }, java.lang.Integer.valueOf(C52761wXj.LoaderManager.DGOPHZ)).show(getParentFragmentManager(), "SignalSelectionBottomSheet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C29542kvc c29542kvc, C29635kxP c29635kxP) {
        C29629kxJ c29629kxJ;
        C21595hFe c21595hFe = (C21595hFe) c29542kvc.aX_();
        if (c21595hFe != null && (c29629kxJ = c21595hFe.EZpvd) != null) {
            c29629kxJ.copydefault(SignalFilterChip.GEM_TYPE, false);
        }
        if (c29635kxP != null) {
            SignalGemType signalGemTypeAEQbTJ = SignalGemType.Companion.AEQbTJ(c29635kxP.valueOf());
            c29542kvc.fJNWhG().OLrzqt(signalGemTypeAEQbTJ);
            C29408ktA.KWHzl.copydefault(signalGemTypeAEQbTJ, c29542kvc.ejfBZ().KWHzl());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.kuM.AhwBna()V */
    public final java.util.List<C29635kxP> AhwBna() {
        SignalGemType signalGemTypeEZpvd = fJNWhG().gEmmrt().getValue().EZpvd();
        android.content.Context context = getContext();
        if (context != null) {
            InterfaceC56445yFq<SignalGemType> entries = SignalGemType.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
            java.util.Iterator<SignalGemType> it = entries.iterator();
            while (it.hasNext()) {
                SignalGemType next = it.next();
                java.lang.String string = context.getString(next.getStringRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(new C29635kxP(string, null, null, null, next == signalGemTypeEZpvd, next.getValue(), 14, null));
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        C29629kxJ c29629kxJ;
        java.util.List<SignalMultiSelectUiModel> listCopydefault = fJNWhG().copydefault();
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe != null && (c29629kxJ = c21595hFe.EZpvd) != null) {
            c29629kxJ.copydefault(SignalFilterChip.INFLUENCER, true);
        }
        C29634kxO.Companion.copydefault(listCopydefault).show(getChildFragmentManager(), "SignalMultiSelectBottomSheet");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kxW.TaskDescription.newInstance$default(o.kxW$TaskDescription, java.util.List, java.lang.Integer, kotlin.jvm.functions.Function1, java.lang.Integer, int, java.lang.Object):o.kxW */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        C29629kxJ c29629kxJ;
        java.util.List<C29635kxP> listOLrzqt = fJNWhG().OLrzqt();
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe != null && (c29629kxJ = c21595hFe.EZpvd) != null) {
            c29629kxJ.copydefault(SignalFilterChip.CHAIN, true);
        }
        C29642kxW.TaskDescription.newInstance$default(C29642kxW.Companion, listOLrzqt, java.lang.Integer.valueOf(C23274hvD.Fragment.RlQdEF), new Function1() { // from class: o.kvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29542kvc.AEQbTJ(this.KWHzl, (C29635kxP) obj);
            }
        }, null, 8, null).show(getChildFragmentManager(), "DexSelectionBottomSheet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C29542kvc c29542kvc, C29635kxP c29635kxP) {
        C29629kxJ c29629kxJ;
        C21595hFe c21595hFe = (C21595hFe) c29542kvc.aX_();
        if (c21595hFe != null && (c29629kxJ = c21595hFe.EZpvd) != null) {
            c29629kxJ.copydefault(SignalFilterChip.CHAIN, false);
        }
        if (c29635kxP == null) {
            return Unit.INSTANCE;
        }
        c29542kvc.fJNWhG().OLrzqt(c29635kxP);
        C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.CHAIN, (java.lang.String) null, (java.lang.String) null, c29635kxP.AEQbTJ(), (java.lang.Boolean) null, (java.lang.String) null, c29542kvc.ejfBZ().KWHzl(), SignalTab.OVERVIEW, (java.lang.String) null, 310, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        java.util.List<C29635kxP> listValues = values();
        C29642kxW.TaskDescription taskDescription = C29642kxW.Companion;
        int i = C23274hvD.Fragment.FF;
        int i2 = C52761wXj.LoaderManager.DGOPHZ;
        taskDescription.AEQbTJ(listValues, java.lang.Integer.valueOf(i), new Function1() { // from class: o.kvi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29542kvc.djBIcL(this.KWHzl, (C29635kxP) obj);
            }
        }, java.lang.Integer.valueOf(i2)).show(getParentFragmentManager(), "SignalSelectionBottomSheet");
    }

    public static final Unit djBIcL(C29542kvc c29542kvc, C29635kxP c29635kxP) {
        if (c29635kxP != null) {
            SignalGemsUiSortType signalGemsUiSortTypeKWHzl = SignalGemsUiSortType.Companion.KWHzl(c29635kxP.valueOf());
            c29542kvc.fJNWhG().EZpvd(signalGemsUiSortTypeKWHzl);
            C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.RANKING_SORT, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, c29542kvc.ejfBZ().KWHzl(), SignalTab.GEMS, signalGemsUiSortTypeKWHzl.getEventTrackingKey(), 62, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<C29635kxP> values() {
        SignalGemsUiSortType signalGemsUiSortTypeValueOf = fJNWhG().gEmmrt().getValue().valueOf();
        android.content.Context context = getContext();
        if (context != null) {
            InterfaceC56445yFq<SignalGemsUiSortType> entries = SignalGemsUiSortType.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
            java.util.Iterator<SignalGemsUiSortType> it = entries.iterator();
            while (it.hasNext()) {
                SignalGemsUiSortType next = it.next();
                java.lang.String string = context.getString(next.getBottomSheetKey());
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(new C29635kxP(string, null, null, null, next == signalGemsUiSortTypeValueOf, next.getValue(), 14, null));
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    public final void isConnected() {
        SignalFilterBottomSheetParams signalFilterBottomSheetParamsAEQbTJ = fJNWhG().AEQbTJ();
        C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.FILTER_BUTTON, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, ejfBZ().KWHzl(), SignalTab.OVERVIEW, (java.lang.String) null, TypedValues.AttributesType.TYPE_PIVOT_TARGET, (java.lang.Object) null);
        C29597kwe.Companion.AEQbTJ(signalFilterBottomSheetParamsAEQbTJ).show(getChildFragmentManager(), C29597kwe.class.getName());
    }

    @Override // o.InterfaceC29606kwn
    public void AEQbTJ(C29601kwi c29601kwi) {
        fJNWhG().copydefault(c29601kwi);
        java.lang.String strEZpvd = fJNWhG().EZpvd();
        if (c29601kwi != null) {
            C29408ktA.KWHzl.AEQbTJ(ejfBZ().KWHzl(), SignalTab.OVERVIEW.getTabValue(), c29601kwi, strEZpvd);
        }
    }

    @Override // o.InterfaceC29633kxN
    public void EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        fJNWhG().OLrzqt(list);
        C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.INFLUENCER_FILTER, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, false, (SignalTab) null, InfluencerType.Companion.AEQbTJ(list), 254, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC29633kxN
    public void fIwbmz() {
        C29629kxJ c29629kxJ;
        C21595hFe c21595hFe = (C21595hFe) aX_();
        if (c21595hFe == null || (c29629kxJ = c21595hFe.EZpvd) == null) {
            return;
        }
        c29629kxJ.copydefault(SignalFilterChip.INFLUENCER, false);
    }

    /* JADX INFO: renamed from: o.kvc$Activity */
    public final class Activity extends FragmentStateAdapter {
        public final /* synthetic */ C29542kvc KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C29542kvc c29542kvc, androidx.fragment.app.Fragment fragment) {
            super(fragment.getChildFragmentManager(), fragment.getLifecycle());
            Intrinsics.checkNotNullParameter(fragment, "");
            this.KWHzl = c29542kvc;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return SignalTab.getEntries().size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (i == SignalTab.GEMS.getPosition()) {
                return C29571kwE.Companion.KWHzl(new SmartMoneyConfig(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), this.KWHzl.AubY());
            }
            if (i == SignalTab.OVERVIEW.getPosition()) {
                return C29586kwT.Companion.KWHzl(new SmartMoneyConfig(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), this.KWHzl.AubY());
            }
            return C29562kvw.Companion.copydefault(new SmartMoneyConfig(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), this.KWHzl.AubY());
        }
    }
}
