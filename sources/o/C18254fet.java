package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$handleBindWalletResult$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeAddressBalanceState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeBindToCefiState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeIndependentBindToCefiState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeRegisterState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeUIState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeWalletAddressRegisterCheckState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeWalletSupportCheckState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterAddressResultData;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterResultType;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.SupportChainAddressBean;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel.WalletUsdgActivityViewModel;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.WalletCefiBindingService;
import com.okinc.web.WebActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC54840xXg;
import o.ActivityC18238fed;
import o.ActivityC21325gxd;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC9739bbK;
import o.pHH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fet, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18254fet extends AbstractC18229feU implements gJR {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final java.lang.String OLrzqt = "DefiUsdgOnboardFragment";
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public gJR AkhnZx;
    public final java.lang.Object DbNXlk;
    public InterfaceC58217yxC KWHzl;
    public final ActivityResultLauncher<BindWalletInput> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public C16698eoo valueOf;
    public final ActivityResultLauncher<android.content.Context> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.dzkkkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void zsXlph() {
        this.AkhnZx = this;
    }

    public C18254fet() {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(WalletAddressBindViewModel.class);
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        };
        final byte b = 0 == true ? 1 : 0;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = b;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(WalletUsdgActivityViewModel.class);
        Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        };
        final byte b2 = 0 == true ? 1 : 0;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ2, function02, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function03 = b2;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.DbNXlk = new java.lang.Object();
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.fer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.AhwBna();
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.feE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.isConnected();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.feC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.DbNXlk();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.feJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.AkhnZx();
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.feI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.fetchVPNInfo();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.feG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.gEmmrt();
            }
        });
        InterfaceC8107awW interfaceC8107awWFARcdN = fARcdN();
        this.copydefault = interfaceC8107awWFARcdN != null ? registerForActivityResult(interfaceC8107awWFARcdN.copydefault(), new ActivityResultCallback() { // from class: o.feK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C18254fet.AEQbTJ(this.OLrzqt, (BindWalletResult) obj);
            }
        }) : null;
        InterfaceC8106awV newProxyInstance = getNewProxyInstance();
        this.values = newProxyInstance != null ? registerForActivityResult(newProxyInstance.OLrzqt(true), new ActivityResultCallback() { // from class: o.feH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C18254fet.EZpvd(this.KWHzl, (java.lang.Boolean) obj);
            }
        }) : null;
    }

    public final WalletAddressBindViewModel ejfBZ() {
        return (WalletAddressBindViewModel) this.djBIcL.getValue();
    }

    public final WalletUsdgActivityViewModel getFieldNames() {
        return (WalletUsdgActivityViewModel) this.fetchVPNInfo.getValue();
    }

    public static final InterfaceC8107awW AhwBna() {
        return (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
    }

    public final InterfaceC8107awW fARcdN() {
        return (InterfaceC8107awW) this.gEmmrt.getValue();
    }

    public static final InterfaceC8106awV isConnected() {
        return (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
    }

    public final InterfaceC8106awV getNewProxyInstance() {
        return (InterfaceC8106awV) this.isConnected.getValue();
    }

    public static final gKO DbNXlk() {
        return (gKO) C43251rlk.copydefault(gKO.class);
    }

    public final gKO fJNWhG() {
        return (gKO) this.AhwBna.getValue();
    }

    public static final InterfaceC43294rma AkhnZx() {
        return (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
    }

    private final InterfaceC43294rma QbewEr() {
        return (InterfaceC43294rma) this.AYXKKw.getValue();
    }

    public final OKComplianceRestrictionService hDKMBd() {
        return (OKComplianceRestrictionService) this.ejfBZ.getValue();
    }

    public static final OKComplianceRestrictionService fetchVPNInfo() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public final InterfaceC54824xWr AuCTel() {
        return (InterfaceC54824xWr) this.AEQbTJ.getValue();
    }

    public static final InterfaceC54824xWr gEmmrt() {
        return (InterfaceC54824xWr) C43251rlk.copydefault(InterfaceC54824xWr.class);
    }

    /* JADX INFO: renamed from: o.fet$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final SupportChainAddressBean OLrzqt(WalletUsdgActivityViewModel walletUsdgActivityViewModel) {
        return (SupportChainAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletUsdgActivityViewModel.AhwBna().getValue());
    }

    public static final void AEQbTJ(C18254fet c18254fet, BindWalletResult bindWalletResult) {
        Intrinsics.copydefault(bindWalletResult);
        c18254fet.KWHzl(bindWalletResult);
    }

    public static final void EZpvd(C18254fet c18254fet, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c18254fet.getFieldNames().gEmmrt();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = C16698eoo.copydefault(view);
        AuCTelauCTel();
        QfsBiF();
        zsXlph();
        fIwbmz();
        QKVWgx();
        getFieldNames().AEQbTJ();
    }

    public final void QKVWgx() {
        C52794wYp c52794wYp;
        C16698eoo c16698eoo = this.valueOf;
        if (c16698eoo == null || (c52794wYp = c16698eoo.AEQbTJ) == null) {
            return;
        }
        c52794wYp.OLrzqt(0L);
        c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRelationshipValidationResult));
        c52794wYp.setEnabled(false);
    }

    public final void AuCTelauCTel() {
        zLjUOn();
        AubY();
    }

    public final void AubY() {
        android.widget.TextView textView;
        C16698eoo c16698eoo = this.valueOf;
        if (c16698eoo == null || (textView = c16698eoo.AYXKKw) == null) {
            return;
        }
        textView.setText(OLrzqt(C13754dXa.FragmentManager.ODWQjV, new Function0() { // from class: o.few
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.fJNWhG(this.EZpvd);
            }
        }));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static final Unit fJNWhG(C18254fet c18254fet) {
        c18254fet.KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onTransact));
        return Unit.INSTANCE;
    }

    public final void zLjUOn() {
        AppCompatImageView appCompatImageView;
        android.widget.TextView textView;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = C33069mpW.KWHzl(contextRequireContext, C13754dXa.FragmentManager.updateVisuals, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("apy", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsServiceStub))));
        android.text.SpannableString spannableString = new android.text.SpannableString(strKWHzl);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsServiceStub);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(getContext(), C13754dXa.LoaderManager.fetchVPNInfo), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strKWHzl, strAYXKKw, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strKWHzl, strAYXKKw, 0, false, 6, (java.lang.Object) null) + strAYXKKw.length(), 17);
        C16698eoo c16698eoo = this.valueOf;
        if (c16698eoo != null && (textView = c16698eoo.AhwBna) != null) {
            textView.setText(spannableString);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        C16698eoo c16698eoo2 = this.valueOf;
        if (c16698eoo2 == null || (appCompatImageView = c16698eoo2.KWHzl) == null) {
            return;
        }
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.USDGOnboardPage);
    }

    /* JADX INFO: renamed from: o.fet$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C16698eoo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C16698eoo c16698eoo) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c16698eoo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C16698eoo c16698eoo = this.copydefault;
                c16698eoo.AEQbTJ.setEnabled(c16698eoo.OLrzqt.isChecked());
            }
        }
    }

    private final void QfsBiF() {
        QUSxYX();
        ORxRYg();
        AwvSrB();
        wlaJM();
        AxsJAY();
        zuBGHE();
        sSMYrx();
        gHZMYf();
    }

    public final void ORxRYg() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeWalletSupportCheckState$1(this, null), 3, null);
    }

    public final void AwvSrB() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeWalletAddressRegisterCheckState$1(this, null), 3, null);
    }

    public final void wlaJM() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeAddressBalanceState$1(this, null), 3, null);
    }

    public final void AxsJAY() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1(this, null), 3, null);
    }

    public final void sSMYrx() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeBindToCefiState$1(this, null), 3, null);
    }

    public final void gHZMYf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeRegisterState$1(this, null), 3, null);
    }

    private final void QUSxYX() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeUIState$1(this, null), 3, null);
    }

    public final void fIwbmz() {
        C33527myD.subscribeOnIO$default(C58156yvv.EZpvd(C33527myD.KWHzl(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null)), this), (Function1) null, new Function0() { // from class: o.fey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.DbNXlk(this.EZpvd);
            }
        }, (Function1) null, 5, (java.lang.Object) null);
    }

    public static final Unit DbNXlk(C18254fet c18254fet) {
        c18254fet.ejfBZ().AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(BindWalletResult bindWalletResult) {
        showLoading();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$handleBindWalletResult$1(bindWalletResult, this, null), 3, null);
    }

    public final void uzCIH() {
        java.lang.String strOcIXYQ;
        java.lang.String strDbNXlk;
        java.lang.String strOcIXYQ2;
        java.lang.String strDbNXlk2;
        SupportChainAddressBean supportChainAddressBeanOLrzqt = OLrzqt(getFieldNames());
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(supportChainAddressBeanOLrzqt != null ? java.lang.Long.valueOf(supportChainAddressBeanOLrzqt.getCoinId()) : null);
        java.lang.String str = OLrzqt;
        if (c10854bwMKWHzl == null || (strOcIXYQ = c10854bwMKWHzl.OcIXYQ()) == null) {
            strOcIXYQ = "";
        }
        AbstractC12782ctV abstractC12782ctVValueOf = getFieldNames().valueOf();
        if (abstractC12782ctVValueOf == null || (strDbNXlk = abstractC12782ctVValueOf.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        pUU.copydefault(str, "metaId:" + strOcIXYQ + ", walletId:" + strDbNXlk);
        if (c10854bwMKWHzl != null && (strOcIXYQ2 = c10854bwMKWHzl.OcIXYQ()) != null) {
            ActivityC21325gxd.Application application = ActivityC21325gxd.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            AbstractC12782ctV abstractC12782ctVValueOf2 = getFieldNames().valueOf();
            if (abstractC12782ctVValueOf2 == null || (strDbNXlk2 = abstractC12782ctVValueOf2.DbNXlk()) == null) {
                return;
            } else {
                application.copydefault(fragmentActivityRequireActivity, strOcIXYQ2, strDbNXlk2, c10854bwMKWHzl.AEQbTJ());
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void iwGUEr() {
        java.lang.String strDbNXlk;
        SupportChainAddressBean supportChainAddressBeanOLrzqt = OLrzqt(getFieldNames());
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(supportChainAddressBeanOLrzqt != null ? java.lang.Long.valueOf(supportChainAddressBeanOLrzqt.getCoinId()) : null);
        gKO gkoFJNWhG = fJNWhG();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC12782ctV abstractC12782ctVValueOf = getFieldNames().valueOf();
        if (abstractC12782ctVValueOf == null || (strDbNXlk = abstractC12782ctVValueOf.DbNXlk()) == null) {
            return;
        }
        gkoFJNWhG.EZpvd(contextRequireContext, viewLifecycleOwner, new TradeParam(strDbNXlk, "wallet_trade", new CoinInfo((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 15, (DefaultConstructorMarker) null), new CoinInfo(C33129mqd.gEmmrt(supportChainAddressBeanOLrzqt != null ? java.lang.Long.valueOf(supportChainAddressBeanOLrzqt.getGeneralChainId()) : null), supportChainAddressBeanOLrzqt != null ? supportChainAddressBeanOLrzqt.getTokenAddress() : null, c10854bwMKWHzl != null ? c10854bwMKWHzl.AuCTel() : false, (java.lang.String) null, 8, (DefaultConstructorMarker) null), "", supportChainAddressBeanOLrzqt != null ? java.lang.Integer.valueOf(supportChainAddressBeanOLrzqt.getAddressType()) : null, "", true, (java.lang.String) null, (java.lang.Boolean) null, false, (java.lang.String) null, 0, (java.lang.String) null, 16128, (DefaultConstructorMarker) null), new Function1() { // from class: o.feP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18254fet.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(C18254fet c18254fet, boolean z) {
        if (z) {
            c18254fet.showLoading();
        } else {
            c18254fet.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(int i, View.OnClickListener onClickListener) {
        C16698eoo c16698eoo = this.valueOf;
        if (c16698eoo != null) {
            android.widget.TextView textView = c16698eoo.djBIcL;
            textView.setVisibility(0);
            textView.setText(values());
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            c16698eoo.OLrzqt.setVisibility(0);
            wYK wyk = c16698eoo.OLrzqt;
            wyk.setOnClickListener(new Application(wyk, 1000L, c16698eoo));
            C52794wYp c52794wYp = c16698eoo.AEQbTJ;
            c52794wYp.fIwbmz();
            c52794wYp.setEnabled(c16698eoo.OLrzqt.isChecked());
            c52794wYp.setVisibility(0);
            c52794wYp.setText(C33070mpX.AYXKKw(i));
            C55296xhK.singleClick$default(c52794wYp, onClickListener, 0L, 2, (java.lang.Object) null);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final android.text.Spannable values() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C33069mpW.copydefault(contextRequireContext, C13754dXa.FragmentManager.onKeyDown, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("termsservice", OLrzqt(C13754dXa.FragmentManager.getEnabledChangedCallbackactivity_release, new Function0() { // from class: o.fex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18254fet.fetchVPNInfo(this.EZpvd);
            }
        }))));
    }

    public static final Unit fetchVPNInfo(C18254fet c18254fet) {
        c18254fet.KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsCallbackStubProxy));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fet$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ C18254fet KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;

        public TaskDescription(Function0<Unit> function0, C18254fet c18254fet) {
            this.OLrzqt = function0;
            this.KWHzl = c18254fet;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(this.KWHzl.requireContext(), C52761wXj.Activity.Dmq));
        }
    }

    public final void KWHzl(java.lang.String str) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt(OtcExtraKeys.FLAG, java.lang.Boolean.TRUE), C56390yDp.OLrzqt("set_token", java.lang.Boolean.FALSE));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, bundleBundleOf, null, 4, null);
    }

    public final void QOLQEE() {
        C34704nhP c34704nhP = C34704nhP.copydefault;
        java.lang.String str = (java.lang.String) yDV.zsXlph(c34704nhP.KWHzl());
        java.lang.String strAEQbTJ = c34704nhP.AEQbTJ();
        if (str == null || str.length() == 0) {
            str = strAEQbTJ;
        }
        java.lang.String str2 = str + "://" + DeeplinkMode.WALLET.getMode() + "/wallet/detail";
        InterfaceC43294rma interfaceC43294rmaQbewEr = QbewEr();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rmaQbewEr, contextRequireContext, str2, null, new Function1() { // from class: o.fez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18254fet.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void checkRestrictionsAndActivate$default(C18254fet c18254fet, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        c18254fet.OLrzqt(z, str);
    }

    public final void OLrzqt(final boolean z, final java.lang.String str) {
        OKComplianceRestrictionService oKComplianceRestrictionServiceHDKMBd = hDKMBd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        pHH.StateListAnimator.fetchLatestFeatureRestrictionStatus$default(oKComplianceRestrictionServiceHDKMBd, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, new Function1() { // from class: o.fes
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18254fet.AEQbTJ(this.KWHzl, z, str, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    public static final Unit AEQbTJ(C18254fet c18254fet, boolean z, java.lang.String str, boolean z2) {
        C52794wYp c52794wYp;
        OKComplianceRestrictionService oKComplianceRestrictionServiceHDKMBd = c18254fet.hDKMBd();
        OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.EASY_CONNECT;
        if (oKComplianceRestrictionServiceHDKMBd.OLrzqt(feature) || c18254fet.hDKMBd().AEQbTJ(feature)) {
            c18254fet.copydefault(RegisterResultType.TYPE_REGION_NOT_SUPPORTED, false, false);
        } else if (z) {
            C16698eoo c16698eoo = c18254fet.valueOf;
            if (c16698eoo != null && (c52794wYp = c16698eoo.AEQbTJ) != null) {
                C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
            }
            c18254fet.getFieldNames().EZpvd();
        } else if (C34703nhO.copydefault()) {
            c18254fet.AEQbTJ(str);
        } else {
            c18254fet.ejfBZ().copydefault(str);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1(this, str, null), 3, null);
    }

    public final void zuBGHE() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiUsdgOnboardFragment$observeIndependentBindToCefiState$1(this, null), 3, null);
    }

    public final void copydefault(RegisterResultType registerResultType, boolean z, boolean z2) {
        FragmentActivity activity;
        SupportChainAddressBean supportChainAddressBeanOLrzqt = OLrzqt(getFieldNames());
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(supportChainAddressBeanOLrzqt != null ? java.lang.Long.valueOf(supportChainAddressBeanOLrzqt.getCoinId()) : null);
        ActivityC18238fed.StateListAnimator stateListAnimator = ActivityC18238fed.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.util.ArrayList<java.lang.Long> arrayListAkhnZx = getFieldNames().AkhnZx();
        if (arrayListAkhnZx == null) {
            arrayListAkhnZx = new java.util.ArrayList<>();
        }
        int value = registerResultType.getValue();
        java.lang.Long lValueOf = c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna()) : null;
        AbstractC12782ctV abstractC12782ctVValueOf = getFieldNames().valueOf();
        RegisterAddressResultData registerAddressResultData = new RegisterAddressResultData(value, lValueOf, abstractC12782ctVValueOf != null ? abstractC12782ctVValueOf.DbNXlk() : null, supportChainAddressBeanOLrzqt != null ? java.lang.Integer.valueOf(supportChainAddressBeanOLrzqt.getAddressType()) : null, z, getFieldNames().DbNXlk());
        java.lang.Long lAYXKKw = getFieldNames().AYXKKw();
        stateListAnimator.AEQbTJ(contextRequireContext, arrayListAkhnZx, registerAddressResultData, lAYXKKw != null ? lAYXKKw.longValue() : -1L);
        if (!z2 || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // o.gJR
    public void OLrzqt(@NotNull WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult) {
        Intrinsics.checkNotNullParameter(walletCefiBindingResult, "");
        if ((walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.Success) || (walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.WalletAlreadyBound)) {
            copydefault(RegisterResultType.TYPE_REGISTERING, false, true);
        } else if (!(walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.Cancel)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this.DbNXlk);
        this.valueOf = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.AkhnZx = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DTwDnp();
    }

    public final void DTwDnp() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xWW.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.feA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18254fet.copydefault(this.AEQbTJ, (xWW) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.feB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18254fet.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.feD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18254fet.copydefault((java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.feF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18254fet.KWHzl(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C18254fet c18254fet, xWW xww) {
        c18254fet.KWHzl(xww.EZpvd());
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        pUU.copydefault(OLrzqt, "subscribeBindResultEvent Error: " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractC54840xXg abstractC54840xXg) {
        C16698eoo c16698eoo;
        C52794wYp c52794wYp;
        if (abstractC54840xXg instanceof AbstractC54840xXg.PictureInPictureParams) {
            getFieldNames().EZpvd(((AbstractC54840xXg.PictureInPictureParams) abstractC54840xXg).copydefault());
            copydefault(RegisterResultType.TYPE_REGISTERING, false, true);
        } else if (Intrinsics.EZpvd(abstractC54840xXg, AbstractC54840xXg.TaskStackBuilder.AEQbTJ)) {
            getFieldNames().OLrzqt(true);
        } else {
            if (!Intrinsics.EZpvd(abstractC54840xXg, AbstractC54840xXg.VoiceInteractor.KWHzl) || (c16698eoo = this.valueOf) == null || (c52794wYp = c16698eoo.AEQbTJ) == null) {
                return;
            }
            c52794wYp.fIwbmz();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.KWHzl = null;
    }

    public final android.text.Spannable OLrzqt(int i, Function0<Unit> function0) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        TaskDescription taskDescription = new TaskDescription(function0, this);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(i));
        spannableStringBuilder.setSpan(taskDescription, length, spannableStringBuilder.length(), 17);
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        return spannableStringValueOf;
    }
}
