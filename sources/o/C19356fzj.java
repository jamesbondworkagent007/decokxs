package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$1;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$3;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$4;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$5;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$6;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$observeData$7;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$onCreateContent$1;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.BindCeFiDeeplinkParams;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindCeFiDetailsConfirmViewModel;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19356fzj extends AbstractC19312fys {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public AbstractC16479ekh AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public Function0<Unit> DbNXlk;
    public BindCeFiDeeplinkParams djBIcL;
    public ValidateNonceResponseBody valueOf;
    public WalletInfo values;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    public C19356fzj() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletBindCeFiDetailsConfirmViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindConfirmBottomSheet$special$$inlined$viewModels$default$5
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
        this.AhwBna = "";
    }

    /* JADX DEBUG: Possible override for method o.fys.OLrzqt()V */
    public final WalletBindCeFiDetailsConfirmViewModel OLrzqt() {
        return (WalletBindCeFiDetailsConfirmViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: renamed from: o.fzj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fzj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fzj$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C19356fzj newInstance$default(Activity activity, WalletInfo walletInfo, ValidateNonceResponseBody validateNonceResponseBody, BindCeFiDeeplinkParams bindCeFiDeeplinkParams, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function0 = null;
            }
            return activity.EZpvd(walletInfo, validateNonceResponseBody, bindCeFiDeeplinkParams, function0);
        }

        public final C19356fzj EZpvd(WalletInfo walletInfo, ValidateNonceResponseBody validateNonceResponseBody, BindCeFiDeeplinkParams bindCeFiDeeplinkParams, Function0<Unit> function0) {
            C19356fzj c19356fzj = new C19356fzj();
            c19356fzj.DbNXlk = function0;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(MetricsSQLiteCacheKt.METRICS_PARAMS, bindCeFiDeeplinkParams);
            bundle.putParcelable("walletInfo", walletInfo);
            bundle.putParcelable("ceFiDetails", validateNonceResponseBody);
            c19356fzj.setArguments(bundle);
            return c19356fzj;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.EZpvd().setVisibility(8);
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String nonce;
        java.lang.String maskedUserName;
        java.lang.String threshold;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16479ekh abstractC16479ekhAEQbTJ = AbstractC16479ekh.AEQbTJ(getLayoutInflater(), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16479ekhAEQbTJ, "");
        this.AYXKKw = abstractC16479ekhAEQbTJ;
        constraintLayout.addView(abstractC16479ekhAEQbTJ.getRoot());
        android.os.Bundle arguments = getArguments();
        WalletInfo walletInfo = arguments != null ? (WalletInfo) arguments.getParcelable("walletInfo") : null;
        this.values = walletInfo;
        if (walletInfo == null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletBindConfirmBottomSheet$onCreateContent$1(this, null), 3, null);
        }
        android.os.Bundle arguments2 = getArguments();
        this.valueOf = arguments2 != null ? (ValidateNonceResponseBody) arguments2.getParcelable("ceFiDetails") : null;
        android.os.Bundle arguments3 = getArguments();
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams = arguments3 != null ? (BindCeFiDeeplinkParams) arguments3.getParcelable(MetricsSQLiteCacheKt.METRICS_PARAMS) : null;
        this.djBIcL = bindCeFiDeeplinkParams;
        if (bindCeFiDeeplinkParams == null || (nonce = bindCeFiDeeplinkParams.getNonce()) == null) {
            nonce = "";
        }
        this.AhwBna = nonce;
        android.widget.TextView textView = abstractC16479ekhAEQbTJ.AEQbTJ;
        int i = C13754dXa.FragmentManager.QKVWgx;
        ValidateNonceResponseBody validateNonceResponseBody = this.valueOf;
        if (validateNonceResponseBody == null || (maskedUserName = validateNonceResponseBody.getMaskedUserName()) == null) {
            maskedUserName = "";
        }
        textView.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("exchangeAccount", maskedUserName))));
        ValidateNonceResponseBody validateNonceResponseBody2 = this.valueOf;
        if (validateNonceResponseBody2 != null && (threshold = validateNonceResponseBody2.getThreshold()) != null) {
            str = threshold;
        }
        abstractC16479ekhAEQbTJ.EZpvd.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.AubY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatUpToMax$default(pTB.OLrzqt((java.lang.Object) str), 0, null, 3, null)))));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        if (this.valueOf == null) {
            OLrzqt().KWHzl(this.AhwBna);
        }
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DTwDnp));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ3, 1000L, this));
        }
        OLrzqt(wyf);
    }

    /* JADX INFO: renamed from: o.fzj$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C19356fzj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19356fzj c19356fzj) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c19356fzj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BindCeFiDeeplinkParams bindCeFiDeeplinkParams = this.copydefault.djBIcL;
                if ((bindCeFiDeeplinkParams != null ? bindCeFiDeeplinkParams.getIntention() : null) != Intention.WALLET_MANAGEMENT) {
                    BindCeFiDeeplinkParams bindCeFiDeeplinkParams2 = this.copydefault.djBIcL;
                    if ((bindCeFiDeeplinkParams2 != null ? bindCeFiDeeplinkParams2.getIntention() : null) != Intention.WALLET_WITHDRAW) {
                        BindCeFiDeeplinkParams bindCeFiDeeplinkParams3 = this.copydefault.djBIcL;
                        if (bindCeFiDeeplinkParams3 != null) {
                            WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModelOLrzqt = this.copydefault.OLrzqt();
                            java.lang.String sourceAppPackageName = bindCeFiDeeplinkParams3.getSourceAppPackageName();
                            if (sourceAppPackageName == null) {
                                sourceAppPackageName = "";
                            }
                            walletBindCeFiDetailsConfirmViewModelOLrzqt.KWHzl(sourceAppPackageName, bindCeFiDeeplinkParams3.getIntention());
                            return;
                        }
                        return;
                    }
                    this.copydefault.dismiss();
                    android.content.Context context = this.copydefault.getContext();
                    if (context != null) {
                        C17304fAj.EZpvd.AEQbTJ(context);
                        return;
                    }
                    return;
                }
                this.copydefault.dismiss();
                android.content.Context context2 = this.copydefault.getContext();
                if (context2 != null) {
                    C17304fAj.EZpvd.OLrzqt(context2, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.fzj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C19356fzj KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19356fzj c19356fzj) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c19356fzj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String publicKey;
            java.lang.String sourceAppPackageName;
            Intention intention;
            java.lang.String uid;
            java.lang.String verifyToken;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                WalletInfo walletInfo = this.KWHzl.values;
                if (walletInfo != null) {
                    WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModelOLrzqt = this.KWHzl.OLrzqt();
                    androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    java.lang.String str = this.KWHzl.AhwBna;
                    ValidateNonceResponseBody validateNonceResponseBody = this.KWHzl.valueOf;
                    if (validateNonceResponseBody == null || (publicKey = validateNonceResponseBody.getPublicKey()) == null) {
                        publicKey = "";
                    }
                    BindCeFiDeeplinkParams bindCeFiDeeplinkParams = this.KWHzl.djBIcL;
                    if (bindCeFiDeeplinkParams == null || (sourceAppPackageName = bindCeFiDeeplinkParams.getSourceAppPackageName()) == null) {
                        sourceAppPackageName = "";
                    }
                    BindCeFiDeeplinkParams bindCeFiDeeplinkParams2 = this.KWHzl.djBIcL;
                    if (bindCeFiDeeplinkParams2 == null || (intention = bindCeFiDeeplinkParams2.getIntention()) == null) {
                        intention = Intention.WALLET_MANAGEMENT;
                    }
                    ValidateNonceResponseBody validateNonceResponseBody2 = this.KWHzl.valueOf;
                    if (validateNonceResponseBody2 == null || (uid = validateNonceResponseBody2.getUid()) == null) {
                        uid = "";
                    }
                    BindCeFiDeeplinkParams bindCeFiDeeplinkParams3 = this.KWHzl.djBIcL;
                    if (bindCeFiDeeplinkParams3 == null || (verifyToken = bindCeFiDeeplinkParams3.getVerifyToken()) == null) {
                        verifyToken = "";
                    }
                    walletBindCeFiDetailsConfirmViewModelOLrzqt.EZpvd(childFragmentManager, walletInfo, str, publicKey, sourceAppPackageName, intention, uid, verifyToken);
                }
            }
        }
    }

    public final void OLrzqt(wYF wyf) {
        SharedFlow<java.lang.Boolean> sharedFlowEZpvd = OLrzqt().EZpvd();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle$default(sharedFlowEZpvd, lifecycle, null, 2, null)), new WalletBindConfirmBottomSheet$observeData$1(wyf, null)), LifecycleOwnerKt.getLifecycleScope(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletBindConfirmBottomSheet$observeData$2(this, null), 3, null);
        StateFlow<ValidateNonceResponseBody> stateFlowCopydefault = OLrzqt().copydefault();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowCopydefault, lifecycle2, null, 2, null), new WalletBindConfirmBottomSheet$observeData$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> sharedFlowDjBIcL = OLrzqt().djBIcL();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowDjBIcL, lifecycle3, null, 2, null), new WalletBindConfirmBottomSheet$observeData$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowOLrzqt = OLrzqt().OLrzqt();
        Lifecycle lifecycle4 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle4, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowOLrzqt, lifecycle4, null, 2, null), new WalletBindConfirmBottomSheet$observeData$5(null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowAYXKKw = OLrzqt().AYXKKw();
        Lifecycle lifecycle5 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle5, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowAYXKKw, lifecycle5, null, 2, null), new WalletBindConfirmBottomSheet$observeData$6(null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowAEQbTJ = OLrzqt().AEQbTJ();
        Lifecycle lifecycle6 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle6, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowAEQbTJ, lifecycle6, null, 2, null), new WalletBindConfirmBottomSheet$observeData$7(null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C17304fAj.EZpvd.AEQbTJ((WalletInfo) null);
        FragmentActivity activity = getActivity();
        if (activity == null || !(activity instanceof ActivityC19347fza)) {
            return;
        }
        ((ActivityC19347fza) activity).finish();
    }
}
