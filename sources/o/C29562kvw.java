package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.smart_money.common.event_tracking.SignalButtonNameEvent;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFilterViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalTab;
import com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel;
import com.okinc.business.market.features.smart_money.ui.SmartMoneySharedViewModel;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22421hez;
import o.AbstractC29483kuW;
import o.C23274hvD;
import o.C31197lpV;
import o.C52761wXj;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29562kvw extends AbstractC29560kvu<hEW> implements InterfaceC29581kwO {
    public InterfaceC29581kwO AYXKKw;
    public boolean AkhnZx;
    public RecyclerView.OnScrollListener DbNXlk;
    public C29481kuU djBIcL;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.kvz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29562kvw.valueOf(this.copydefault);
        }
    });
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    public C29562kvw() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        Fragment fragment = new Fragment(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(fragment));
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartMoneySharedViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new PendingIntent(this)));
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityFragment$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityFragment$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityFragment$special$$inlined$viewModels$default$5
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.kvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29562kvw.AhwBna(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.kvw$Fragment */
    public static final class Fragment implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(androidx.fragment.app.Fragment fragment) {
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

    /* JADX INFO: renamed from: o.kvw$PendingIntent */
    public static final class PendingIntent implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(androidx.fragment.app.Fragment fragment) {
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

    /* JADX INFO: renamed from: o.kvw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kvw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29562kvw copydefault(@NotNull SmartMoneyConfig smartMoneyConfig, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(smartMoneyConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            C29562kvw c29562kvw = new C29562kvw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("keys.config", smartMoneyConfig);
            bundle.putString("module_name_english", str);
            c29562kvw.setArguments(bundle);
            return c29562kvw;
        }
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.values.getValue();
    }

    public static final java.lang.String valueOf(C29562kvw c29562kvw) {
        java.lang.String string;
        android.os.Bundle arguments = c29562kvw.getArguments();
        return (arguments == null || (string = arguments.getString("module_name_english")) == null) ? "--" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartMoneySharedViewModel values() {
        return (SmartMoneySharedViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignalFilterViewModel AkhnZx() {
        return (SignalFilterViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kvu.AYXKKw()V */
    public final SignalActivityViewModel AYXKKw() {
        return (SignalActivityViewModel) this.fJNWhG.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM DbNXlk() {
        return (kMM) this.gEmmrt.getValue();
    }

    public static final kMM AhwBna(C29562kvw c29562kvw) {
        kMM kmm = new kMM();
        kmm.register(SignalUiModel.class, new C29535kvV(c29562kvw, c29562kvw.fetchVPNInfo()));
        return kmm;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public hEW KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hEW hewAEQbTJ = hEW.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hewAEQbTJ, "");
        return hewAEQbTJ;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        AYXKKw().AEQbTJ(AkhnZx().KWHzl());
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AYXKKw().EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        hEW hew;
        RecyclerView recyclerView;
        super.onDestroy();
        RecyclerView.OnScrollListener onScrollListener = this.DbNXlk;
        if (onScrollListener != null && (hew = (hEW) aX_()) != null && (recyclerView = hew.djBIcL) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        AYXKKw().EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hEW hew, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hew, "");
        fARcdN();
        valueOf();
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().gEmmrt(), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().KWHzl(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AEQbTJ(), null, new Application(), 2, null);
    }

    /* JADX INFO: renamed from: o.kvw$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29481kuU c29481kuU, Continuation<? super Unit> continuation) {
            if (!C29562kvw.this.values().EZpvd()) {
                return Unit.INSTANCE;
            }
            if (C29562kvw.this.AkhnZx().KWHzl(C29562kvw.this.djBIcL)) {
                C29562kvw.this.gEmmrt();
                C29562kvw c29562kvw = C29562kvw.this;
                c29562kvw.AkhnZx = c29562kvw.AYXKKw().EZpvd(c29481kuU);
                C29562kvw.this.djBIcL = c29481kuU;
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kvw$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29558kvs c29558kvs, Continuation<? super Unit> continuation) {
            C29562kvw.this.copydefault(c29558kvs);
            if (!c29558kvs.copydefault()) {
                rVN.reportFullyDrawn$default(C29562kvw.this, c29558kvs.OLrzqt() == null, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kvw$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC29483kuW abstractC29483kuW, Continuation<? super Unit> continuation) {
            if (abstractC29483kuW instanceof AbstractC29483kuW.StateListAnimator) {
                C29562kvw.this.KWHzl(((AbstractC29483kuW.StateListAnimator) abstractC29483kuW).KWHzl());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<SignalUiModel> list) {
        if (((hEW) aX_()) == null || list.isEmpty()) {
            return;
        }
        if (this.AkhnZx) {
            this.AkhnZx = false;
            kMM.forceReset$default(DbNXlk(), list, null, 2, null);
        } else {
            kMM.setData$default(DbNXlk(), list, null, 2, null);
        }
    }

    public final void gEmmrt() {
        SignalActivityViewModel.loadData$default(AYXKKw(), AkhnZx().KWHzl(), null, null, AkhnZx().gEmmrt().getValue(), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void isConnected() {
        java.lang.String str;
        java.lang.String str2;
        if (AYXKKw().AEQbTJ().getValue() instanceof AbstractC29483kuW.StateListAnimator) {
            AbstractC29483kuW value = AYXKKw().AEQbTJ().getValue();
            Intrinsics.copydefault(value, "");
            SignalUiModel signalUiModel = (SignalUiModel) CollectionsKt___CollectionsKt.wlaJM(((AbstractC29483kuW.StateListAnimator) value).KWHzl());
            java.lang.String strDjBIcL = signalUiModel != null ? signalUiModel.djBIcL() : null;
            str = strDjBIcL == null ? "" : strDjBIcL;
        }
        if (AYXKKw().AEQbTJ().getValue() instanceof AbstractC29483kuW.StateListAnimator) {
            AbstractC29483kuW value2 = AYXKKw().AEQbTJ().getValue();
            Intrinsics.copydefault(value2, "");
            SignalUiModel signalUiModel2 = (SignalUiModel) CollectionsKt___CollectionsKt.wlaJM(((AbstractC29483kuW.StateListAnimator) value2).KWHzl());
            java.lang.String strAYXKKw = signalUiModel2 != null ? signalUiModel2.AYXKKw() : null;
            str2 = strAYXKKw == null ? "" : strAYXKKw;
        }
        SignalActivityViewModel.loadData$default(AYXKKw(), null, str, str2, AkhnZx().gEmmrt().getValue(), 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fARcdN() {
        hEW hew = (hEW) aX_();
        if (hew != null) {
            hew.djBIcL.setAdapter(DbNXlk());
            hew.djBIcL.addItemDecoration(new C24290iaz(C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), true));
            hew.djBIcL.setItemAnimator(null);
            hew.copydefault.setRetryClickListener(new View.OnClickListener() { // from class: o.kvt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29562kvw.copydefault(this.EZpvd, view);
                }
            });
            C33546myW c33546myW = hew.AhwBna;
            hew.valueOf.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
            c33546myW.djBIcL(true);
            c33546myW.gEmmrt();
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.kvA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C29562kvw.copydefault(this.OLrzqt, interfaceC57934yrl);
                }
            });
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.kvB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C29562kvw.EZpvd(this.AEQbTJ, interfaceC57934yrl);
                }
            });
            AhwBna();
        }
    }

    public static final void copydefault(C29562kvw c29562kvw, android.view.View view) {
        c29562kvw.values().OLrzqt();
        if (!c29562kvw.AkhnZx().AhwBna()) {
            c29562kvw.AkhnZx().copydefault((C29601kwi) null);
        }
        c29562kvw.gEmmrt();
    }

    public static final void copydefault(C29562kvw c29562kvw, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c29562kvw.isConnected();
    }

    public static final void EZpvd(C29562kvw c29562kvw, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c29562kvw.gEmmrt();
    }

    public final void valueOf() {
        this.AYXKKw = new C29578kwL(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(C29558kvs c29558kvs) {
        boolean z;
        java.util.List<SignalUiModel> listKWHzl;
        hEW hew = (hEW) aX_();
        if (hew != null) {
            if (c29558kvs.OLrzqt() != null) {
                z = true;
            } else {
                AbstractC29483kuW value = AYXKKw().AEQbTJ().getValue();
                if (value != null) {
                    AbstractC29483kuW.StateListAnimator stateListAnimator = value instanceof AbstractC29483kuW.StateListAnimator ? (AbstractC29483kuW.StateListAnimator) value : null;
                    if (stateListAnimator == null || (listKWHzl = stateListAnimator.KWHzl()) == null || !listKWHzl.isEmpty()) {
                    }
                }
                z = false;
            }
            C55113xdn c55113xdn = hew.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(c29558kvs.copydefault() ? 0 : 8);
            C55173xeu c55173xeu = hew.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility((c29558kvs.copydefault() || !z) ? 8 : 0);
            C33546myW c33546myW = hew.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility((c29558kvs.copydefault() || z) ? 8 : 0);
            if (z) {
                EZpvd(!AkhnZx().AhwBna());
            }
            if (c29558kvs.copydefault()) {
                kMM.setData$default(DbNXlk(), yDY.AhwBna(), null, 2, null);
            }
            hew.AhwBna.KWHzl(!c29558kvs.EZpvd());
            if (!c29558kvs.AEQbTJ()) {
                hew.AhwBna.valueOf();
            }
            if (c29558kvs.EZpvd() && c29558kvs.OLrzqt() == null) {
                return;
            }
            hew.AhwBna.valueOf();
            C33546myW c33546myW2 = hew.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
            C57589ylK.KWHzl(c33546myW2, true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        C55173xeu c55173xeu;
        hEW hew = (hEW) aX_();
        if (hew == null || (c55173xeu = hew.copydefault) == null) {
            return;
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        if (z) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.DbNXlk));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21Callback));
        } else {
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.hkDICb));
        }
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    @Override // o.InterfaceC29581kwO
    public void AEQbTJ(@NotNull InterfaceC29579kwM interfaceC29579kwM) {
        Intrinsics.checkNotNullParameter(interfaceC29579kwM, "");
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Fragment) {
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PictureInPictureParams.EZpvd);
            C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.BUY_BUTTON, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, values().KWHzl(), SignalTab.ACTIVITY, (java.lang.String) null, TypedValues.AttributesType.TYPE_PIVOT_TARGET, (java.lang.Object) null);
            InterfaceC29581kwO interfaceC29581kwO = this.AYXKKw;
            if (interfaceC29581kwO != null) {
                interfaceC29581kwO.AEQbTJ(interfaceC29579kwM);
                return;
            }
            return;
        }
        if (!(interfaceC29579kwM instanceof InterfaceC29579kwM.Application)) {
            InterfaceC29581kwO interfaceC29581kwO2 = this.AYXKKw;
            if (interfaceC29581kwO2 != null) {
                interfaceC29581kwO2.AEQbTJ(interfaceC29579kwM);
                return;
            }
            return;
        }
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.SharedElementCallback.EZpvd);
        C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.TOKEN_DETAILS, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, values().KWHzl(), SignalTab.ACTIVITY, (java.lang.String) null, TypedValues.AttributesType.TYPE_PIVOT_TARGET, (java.lang.Object) null);
        java.lang.String str = values().KWHzl() ? "scanner_signal" : "signal";
        InterfaceC29581kwO interfaceC29581kwO3 = this.AYXKKw;
        if (interfaceC29581kwO3 != null) {
            interfaceC29581kwO3.AEQbTJ(InterfaceC29579kwM.Application.copy$default((InterfaceC29579kwM.Application) interfaceC29579kwM, null, 0, null, str, 7, null));
        }
    }

    /* JADX INFO: renamed from: o.kvw$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition == -1) {
                    iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                } else if (iFindLastCompletelyVisibleItemPosition != -1 && iFindLastCompletelyVisibleItemPosition > iFindFirstCompletelyVisibleItemPosition) {
                    iFindFirstCompletelyVisibleItemPosition = (iFindFirstCompletelyVisibleItemPosition + iFindLastCompletelyVisibleItemPosition) / 2;
                }
                if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindFirstCompletelyVisibleItemPosition >= C29562kvw.this.DbNXlk().getItemCount()) {
                    return;
                }
                java.util.List<?> items = C29562kvw.this.DbNXlk().getItems();
                Intrinsics.checkNotNullExpressionValue(items, "");
                java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, iFindFirstCompletelyVisibleItemPosition);
                SignalUiModel signalUiModel = objAkhnZx instanceof SignalUiModel ? (SignalUiModel) objAkhnZx : null;
                C29408ktA.KWHzl.AEQbTJ(C33129mqd.gEmmrt(signalUiModel != null ? signalUiModel.djBIcL() : null), C33129mqd.gEmmrt(java.lang.Integer.valueOf(iFindFirstCompletelyVisibleItemPosition + 1)));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        RecyclerView recyclerView;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.DbNXlk = stateListAnimator;
        hEW hew = (hEW) aX_();
        if (hew == null || (recyclerView = hew.djBIcL) == null) {
            return;
        }
        recyclerView.addOnScrollListener(stateListAnimator);
    }
}
