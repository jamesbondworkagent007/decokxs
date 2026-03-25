package o;

import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.common.SwapBottomViewModel;
import com.okinc.business.dex.trade.order.domain.model.OrderListPageType;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.error.NoWallet;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import com.okinc.business.dexui.main.swap.trade.TriggeredFrom;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC19753gOa;
import o.kTF;
import o.xWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24473ieW extends AbstractC24474ieX {
    public C23497hzO gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public Function1<? super java.lang.String, Unit> valueOf;
    public SwapBottomParamsBean values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;
    public static final int AhwBna = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
    public final InterfaceC56387yDm fetchVPNInfo = C31200lpY.copydefault(this);
    public final java.lang.Object djBIcL = new java.lang.Object();
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.ieU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C24473ieW.isConnected(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.ifb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24473ieW.DbNXlk(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.ieW$Dialog */
    public static final class Dialog implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public C24473ieW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapBottomFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapBottomFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SwapBottomViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapBottomFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapBottomFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.SwapBottomFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.ieW$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ieW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C24473ieW newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, SwapBottomParamsBean swapBottomParamsBean, boolean z, TriggeredFrom triggeredFrom, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                triggeredFrom = TriggeredFrom.SwapMarket;
            }
            return stateListAnimator.AEQbTJ(str, swapBottomParamsBean, z, triggeredFrom);
        }

        public final C24473ieW AEQbTJ(@NotNull java.lang.String str, @NotNull SwapBottomParamsBean swapBottomParamsBean, boolean z, @NotNull TriggeredFrom triggeredFrom) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(swapBottomParamsBean, "");
            Intrinsics.checkNotNullParameter(triggeredFrom, "");
            C24473ieW c24473ieW = new C24473ieW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", swapBottomParamsBean);
            C31200lpY.EZpvd(bundle, str);
            bundle.putBoolean("extra_universal_1", z);
            bundle.putSerializable("extra_triggered_from", triggeredFrom);
            c24473ieW.setArguments(bundle);
            return c24473ieW;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean isConnected(C24473ieW c24473ieW) {
        android.os.Bundle arguments = c24473ieW.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_1");
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.ieX.EZpvd()V */
    public final TriggeredFrom EZpvd() {
        return (TriggeredFrom) this.AkhnZx.getValue();
    }

    public static final TriggeredFrom DbNXlk(C24473ieW c24473ieW) {
        android.os.Bundle arguments = c24473ieW.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("extra_triggered_from") : null;
        TriggeredFrom triggeredFrom = serializable instanceof TriggeredFrom ? (TriggeredFrom) serializable : null;
        return triggeredFrom == null ? TriggeredFrom.SwapMarket : triggeredFrom;
    }

    public final SwapBottomViewModel valueOf() {
        return (SwapBottomViewModel) this.isConnected.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C32866mlf.onEvent$default("DEXSwap_Swap_ViewMore_View", (TrackChannel[]) null, new Function1() { // from class: o.ifd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24473ieW.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C23497hzO c23497hzOAEQbTJ = C23497hzO.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.gEmmrt = c23497hzOAEQbTJ;
        if (c23497hzOAEQbTJ != null) {
            android.os.Bundle arguments = getArguments();
            SwapBottomParamsBean swapBottomParamsBean = arguments != null ? (SwapBottomParamsBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", SwapBottomParamsBean.class)) : null;
            this.values = swapBottomParamsBean;
            if (swapBottomParamsBean != null) {
                OKRegularCell oKRegularCell = c23497hzOAEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
                oKRegularCell.setVisibility(true ^ swapBottomParamsBean.AhwBna() ? 0 : 8);
                c23497hzOAEQbTJ.EZpvd.setAlpha(swapBottomParamsBean.gEmmrt() ? 1.0f : 0.5f);
                c23497hzOAEQbTJ.djBIcL.setText(swapBottomParamsBean.OLrzqt());
                android.widget.TextView textView = c23497hzOAEQbTJ.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(swapBottomParamsBean.gEmmrt() ? 0 : 8);
                OKRegularCell oKRegularCell2 = c23497hzOAEQbTJ.copydefault;
                Intrinsics.checkNotNullExpressionValue(oKRegularCell2, "");
                oKRegularCell2.setVisibility((!C22416heu.zsXlph() || EZpvd() == TriggeredFrom.Bridge) ? 8 : 0);
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C55251xgS c55251xgS = new C55251xgS(contextRequireContext, null, 0, 6, null);
            c55251xgS.setOKDSSize(-4);
            c55251xgS.setOKDSStyle(7);
            c55251xgS.setText(getString(C23274hvD.Fragment.sSMYrx));
            OKRegularCell oKRegularCell3 = c23497hzOAEQbTJ.AEQbTJ;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            OKRegularCell.addViewBehindTitle$default(oKRegularCell3, c55251xgS, C55298xhM.OLrzqt(4, contextRequireContext2), 0, 4, null);
        }
        DbNXlk();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.iff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24473ieW.values(this.copydefault);
            }
        });
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ieW$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C24473ieW EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24473ieW c24473ieW) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c24473ieW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl(DexTrackEventParameter.ButtonName.FAQ.getValue());
                C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, this.EZpvd.AYXKKw(), DexSwapFullClick.FAQ.getValue(), false, null, 12, null);
                android.content.Intent intent = new android.content.Intent(this.EZpvd.requireContext(), (java.lang.Class<?>) ActivityC21811hNe.class);
                C31200lpY.EZpvd(intent, this.EZpvd.AYXKKw());
                SwapBottomParamsBean swapBottomParamsBean = this.EZpvd.values;
                intent.putExtra("swap_type", (swapBottomParamsBean == null || !swapBottomParamsBean.djBIcL()) ? "Web3_DEX_LIMIT_ORDER" : "Web3_DEX_SWAP");
                this.EZpvd.startActivity(intent);
                this.EZpvd.dismiss();
                Function1 function1 = this.EZpvd.valueOf;
                if (function1 != null) {
                    function1.invoke(TrackButtonName.FAQ.getButtonName());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ieW$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C24473ieW AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C24473ieW c24473ieW) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c24473ieW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("app_swap_history_click", (TrackChannel[]) null, Activity.AEQbTJ, 1, (java.lang.Object) null);
                this.AEQbTJ.djBIcL();
                this.AEQbTJ.KWHzl(DexTrackEventParameter.ButtonName.ORDER_HISTORY.getValue());
                Function1 function1 = this.AEQbTJ.valueOf;
                if (function1 != null) {
                    function1.invoke(TrackButtonName.TRANSACTION_HISTORY.getButtonName());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ieW$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C24473ieW AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C24473ieW c24473ieW) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c24473ieW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.AEQbTJ.values != null && (!r1.gEmmrt())) {
                    C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.unregisterMediaButtonEventReceiver), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                }
                C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, this.AEQbTJ.AYXKKw(), DexSwapFullClick.LIQUIDITY_SOURCES.getValue(), false, null, 12, null);
                FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                java.lang.String strAYXKKw = this.AEQbTJ.AYXKKw();
                SwapBottomParamsBean swapBottomParamsBean = this.AEQbTJ.values;
                java.lang.String strAEQbTJ = swapBottomParamsBean != null ? swapBottomParamsBean.AEQbTJ() : null;
                C25352ivB.OLrzqt(fragmentActivityRequireActivity, strAYXKKw, strAEQbTJ != null ? strAEQbTJ : "", this.AEQbTJ.gEmmrt());
                this.AEQbTJ.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.ieW$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C24473ieW AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C24473ieW c24473ieW) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c24473ieW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.startActivity(new android.content.Intent(this.AEQbTJ.requireContext(), (java.lang.Class<?>) ActivityC24781ikM.class));
                this.AEQbTJ.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.ieW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C24473ieW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24473ieW c24473ieW) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c24473ieW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AhwBna();
                kTV.Companion.OLrzqt();
                C24473ieW c24473ieW = this.OLrzqt;
                kTF.ActionBar actionBar = kTF.Companion;
                android.content.Context contextRequireContext = c24473ieW.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c24473ieW.startActivity(actionBar.KWHzl(contextRequireContext, this.OLrzqt.EZpvd().toAutoConfirmEntryType(), "dex_more"));
                this.OLrzqt.dismiss();
            }
        }
    }

    public static final void values(C24473ieW c24473ieW) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24473ieW, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void DbNXlk() {
        C23497hzO c23497hzO = this.gEmmrt;
        if (c23497hzO != null) {
            OKRegularCell oKRegularCell = c23497hzO.KWHzl;
            Intrinsics.copydefault(oKRegularCell);
            EZpvd(oKRegularCell);
            OKRegularCell oKRegularCell2 = c23497hzO.copydefault;
            Intrinsics.copydefault(oKRegularCell2);
            OLrzqt(oKRegularCell2);
            OKRegularCell oKRegularCell3 = c23497hzO.EZpvd;
            Intrinsics.copydefault(oKRegularCell3);
            copydefault(oKRegularCell3);
            OKRegularCell oKRegularCell4 = c23497hzO.AEQbTJ;
            Intrinsics.copydefault(oKRegularCell4);
            AEQbTJ(oKRegularCell4);
            OKRegularCell oKRegularCell5 = c23497hzO.OLrzqt;
            Intrinsics.copydefault(oKRegularCell5);
            KWHzl(oKRegularCell5);
        }
        C25390ivn.collectOnViewLifecycle$default(this, valueOf().OLrzqt(), null, new LoaderManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.ieW$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC19753gOa interfaceC19753gOa, Continuation<? super Unit> continuation) {
            OKRegularCell oKRegularCell;
            android.widget.TextView textView;
            android.widget.TextView textView2;
            OKRegularCell oKRegularCell2;
            android.widget.TextView textView3;
            android.widget.TextView textView4;
            OKRegularCell oKRegularCell3;
            OKRegularCell oKRegularCell4;
            if (C24473ieW.this.EZpvd() == TriggeredFrom.Bridge) {
                C23497hzO c23497hzO = C24473ieW.this.gEmmrt;
                if (c23497hzO != null && (oKRegularCell4 = c23497hzO.AEQbTJ) != null) {
                    oKRegularCell4.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
            if (Intrinsics.EZpvd(interfaceC19753gOa, InterfaceC19753gOa.Activity.EZpvd)) {
                C23497hzO c23497hzO2 = C24473ieW.this.gEmmrt;
                if (c23497hzO2 != null && (oKRegularCell3 = c23497hzO2.AEQbTJ) != null) {
                    oKRegularCell3.setVisibility(0);
                }
                C23497hzO c23497hzO3 = C24473ieW.this.gEmmrt;
                if (c23497hzO3 != null && (textView4 = c23497hzO3.gEmmrt) != null) {
                    textView4.setText(C24473ieW.this.getString(C23274hvD.Fragment.DPHNDa));
                }
                C23497hzO c23497hzO4 = C24473ieW.this.gEmmrt;
                if (c23497hzO4 != null && (textView3 = c23497hzO4.gEmmrt) != null) {
                    textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.OJuSTm));
                }
            } else if (Intrinsics.EZpvd(interfaceC19753gOa, InterfaceC19753gOa.StateListAnimator.KWHzl)) {
                C23497hzO c23497hzO5 = C24473ieW.this.gEmmrt;
                if (c23497hzO5 != null && (oKRegularCell2 = c23497hzO5.AEQbTJ) != null) {
                    oKRegularCell2.setVisibility(0);
                }
                C23497hzO c23497hzO6 = C24473ieW.this.gEmmrt;
                if (c23497hzO6 != null && (textView2 = c23497hzO6.gEmmrt) != null) {
                    textView2.setText(C24473ieW.this.getString(C23274hvD.Fragment.fGQ));
                }
                C23497hzO c23497hzO7 = C24473ieW.this.gEmmrt;
                if (c23497hzO7 != null && (textView = c23497hzO7.gEmmrt) != null) {
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                }
            } else if (Intrinsics.EZpvd(interfaceC19753gOa, InterfaceC19753gOa.ActionBar.copydefault)) {
                C23497hzO c23497hzO8 = C24473ieW.this.gEmmrt;
                if (c23497hzO8 != null && (oKRegularCell = c23497hzO8.AEQbTJ) != null) {
                    oKRegularCell.setVisibility(8);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(OKRegularCell oKRegularCell) {
        AYXKKw(oKRegularCell);
        oKRegularCell.setOnClickListener(new Application(oKRegularCell, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ieW$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("business_type", BusinessType.SWAP.getValue(), true);
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexSwapFullClick.ORDER_HISTORY.getValue(), false, 4, null);
        }
    }

    public final void OLrzqt(OKRegularCell oKRegularCell) {
        AYXKKw(oKRegularCell);
        oKRegularCell.setOnClickListener(new FragmentManager(oKRegularCell, 1000L, this));
    }

    public final void copydefault(OKRegularCell oKRegularCell) {
        AYXKKw(oKRegularCell);
        oKRegularCell.setOnClickListener(new Fragment(oKRegularCell, 1000L, this));
    }

    public final void AEQbTJ(OKRegularCell oKRegularCell) {
        AYXKKw(oKRegularCell);
        oKRegularCell.setOnClickListener(new TaskDescription(oKRegularCell, 1000L, this));
    }

    public final void AhwBna() {
        final java.lang.String str = gEmmrt() ? "swap" : TabTitleInfo.KEY_BRIDGE;
        C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.ifh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24473ieW.OLrzqt(this.OLrzqt, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C24473ieW c24473ieW, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c24473ieW.valueOf().EZpvd()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.AUTO_CONFIRM.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(OKRegularCell oKRegularCell) {
        AYXKKw(oKRegularCell);
        oKRegularCell.setOnClickListener(new ActionBar(oKRegularCell, 1000L, this));
    }

    public final void AYXKKw(OKRegularCell oKRegularCell) {
        int i = AhwBna;
        oKRegularCell.setIconSize(i, i);
        android.widget.TextView textViewEZpvd = oKRegularCell.EZpvd();
        textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        textViewEZpvd.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        textViewEZpvd.setMaxLines(1);
        textViewEZpvd.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void djBIcL() {
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(C22380heK.OLrzqt.copydefault(AYXKKw()).fARcdN().OLrzqt(), this, Lifecycle.Event.ON_PAUSE);
        final Function1 function1 = new Function1() { // from class: o.ieY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24473ieW.EZpvd(this.AEQbTJ, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ifa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24473ieW.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ifc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24473ieW.copydefault(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ieZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24473ieW.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.djBIcL);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C24473ieW c24473ieW, InterfaceC9738bbJ interfaceC9738bbJ) {
        OrderListPageType orderListPageType;
        if (interfaceC9738bbJ.zsXlph()) {
            c24473ieW.fetchVPNInfo();
        } else {
            boolean z = c24473ieW.EZpvd() == TriggeredFrom.Bridge;
            SwapBottomParamsBean swapBottomParamsBean = c24473ieW.values;
            boolean z2 = swapBottomParamsBean != null && swapBottomParamsBean.EZpvd() > 0;
            if (z) {
                orderListPageType = OrderListPageType.Bridge;
            } else if (z2) {
                orderListPageType = OrderListPageType.OpenOrder;
            } else {
                orderListPageType = OrderListPageType.History;
            }
            android.content.Intent intent = new android.content.Intent(c24473ieW.requireContext(), (java.lang.Class<?>) ActivityC22185hab.class);
            Intrinsics.copydefault(orderListPageType, "");
            intent.putExtra("type", (android.os.Parcelable) orderListPageType);
            c24473ieW.startActivity(intent);
            c24473ieW.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C24473ieW c24473ieW, java.lang.Throwable th) {
        if (th instanceof NoWallet) {
            c24473ieW.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.djBIcL);
    }

    private final void fetchVPNInfo() {
        xWO xwo = (xWO) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWO.class));
        if (xwo != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            xWO.ActionBar.showConnectWalletDialog$default(xwo, childFragmentManager, new Dialog(), (java.util.List) null, (java.util.List) null, (InterfaceC54856xXw) null, 28, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        java.lang.String str2 = gEmmrt() ? "swap" : TabTitleInfo.KEY_BRIDGE;
        SwapBottomParamsBean swapBottomParamsBean = this.values;
        java.lang.String strKWHzl = swapBottomParamsBean != null ? swapBottomParamsBean.KWHzl() : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        java.lang.String strCopydefault = C25295ity.copydefault(C22372heC.EZpvd(AYXKKw()));
        SwapBottomParamsBean swapBottomParamsBean2 = this.values;
        java.lang.String strCopydefault2 = swapBottomParamsBean2 != null ? swapBottomParamsBean2.copydefault() : null;
        C25295ity.KWHzl(str2, strKWHzl, strCopydefault, str, strCopydefault2 != null ? strCopydefault2 : "");
    }
}
