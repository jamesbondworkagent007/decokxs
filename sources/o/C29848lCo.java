package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.buysell.data.ConvertChipAmount;
import com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$onViewCreated$1;
import com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$updateCryptoFiatWidget$4;
import com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$updateCryptoFiatWidget$7;
import com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$updateCryptoFiatWidget$8;
import com.okinc.buysell.ui.bsc.convert.ConvertViewModel;
import com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.util.PaymentFeatureFlag;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.presentation.InputAmountSharedDataSource;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.ConvertPreviewParameters;
import com.okinc.okx.paymentapi.service.CurrencyPreviewPageParameters;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.okx.paymentapi.uv.AccountFrozenStatus;
import com.okinc.okx.paymentapi.uv.UnifiedTradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C31351lsQ;
import o.InterfaceC47251tmX;
import o.InterfaceC8224ayh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C29848lCo extends AbstractC29881lDu<AbstractC31464luX> {
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm values;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.lCo$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[com.okinc.buysell.ui.bsc.util.InputType.values().length];
            try {
                iArr[com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[VerificationStatus.values().length];
            try {
                iArr2[VerificationStatus.PRE_LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[VerificationStatus.PRE_KYC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final void EZpvd(android.view.View view) {
    }

    @Override // o.lzN
    public void djBIcL() {
    }

    public final void fARcdN() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31464luX AEQbTJ(C29848lCo c29848lCo) {
        return (AbstractC31464luX) c29848lCo.KWHzl();
    }

    public C29848lCo() {
        super(C31351lsQ.ActionBar.AwvSrB);
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ConvertViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$special$$inlined$viewModels$default$5
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

    private final BSCMasterViewModel QfsBiF() {
        return (BSCMasterViewModel) this.values.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lDu.fJNWhG()V */
    public final ConvertViewModel fJNWhG() {
        return (ConvertViewModel) this.fetchVPNInfo.getValue();
    }

    @Override // o.lzR
    public BSCMasterViewModel isConnected() {
        return QfsBiF();
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return fJNWhG();
    }

    @Override // o.lzN
    public void AYXKKw() {
        AuCTel();
        copydefault(false);
        fARcdN();
    }

    @Override // o.lzN
    public void EZpvd() {
        QUSxYX();
        zuBGHE();
        wlaJM();
        zLjUOn();
        AxsJAY();
        gHZMYf();
        AuCTelauCTel();
        getFieldNames();
        AwvSrB();
        sSMYrx();
        zsXlph();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ConvertFragmentV3$onViewCreated$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ConstraintLayout constraintLayout = ((AbstractC31464luX) KWHzl()).values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (constraintLayout.getVisibility() == 0) {
            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            if (c43453rpa.KWHzl(contextRequireContext)) {
                AubY();
                return;
            }
            return;
        }
        fJNWhG().AEQbTJ(QfsBiF().fJNWhG());
    }

    /* JADX INFO: renamed from: o.lCo$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = actionBar.KWHzl;
            }
            if ((i & 8) != 0) {
                str4 = actionBar.EZpvd;
            }
            return actionBar.EZpvd(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            return new ActionBar(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.KWHzl;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FromTokenData(fromIconUrl=" + this.copydefault + ", fromTokenName=" + this.AEQbTJ + ", fromAmount=" + this.KWHzl + ", fromAmountLabel=" + this.EZpvd + ")";
        }

        public ActionBar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
            this.EZpvd = str4;
        }
    }

    /* JADX INFO: renamed from: o.lCo$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = taskDescription.copydefault;
            }
            if ((i & 8) != 0) {
                str4 = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            return new TaskDescription(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.copydefault;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToTokenData(toAmount=" + this.OLrzqt + ", toIconUrl=" + this.AEQbTJ + ", toTokenName=" + this.copydefault + ", earnRate=" + this.EZpvd + ")";
        }

        public TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.copydefault = str3;
            this.EZpvd = str4;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        ((AbstractC31464luX) KWHzl()).fARcdN.setSwapAnimationEnabled(true);
        java.lang.Object objCollect = FlowKt.combine(FlowKt.combine(fJNWhG().hDKMBd(), fJNWhG().uzCIH(), fJNWhG().AuCTel(), fJNWhG().iwGUEr(), ConvertFragmentV3$updateCryptoFiatWidget$4.INSTANCE), FlowKt.combine(fJNWhG().aKErDB(), fJNWhG().RcXXUw(), fJNWhG().dxcTrN(), fJNWhG().djSkpj(), ConvertFragmentV3$updateCryptoFiatWidget$7.INSTANCE), new ConvertFragmentV3$updateCryptoFiatWidget$8(this, null)).collect(new StateListAnimator(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation) {
        return new ActionBar(str, str2, str3, str4);
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation) {
        return new TaskDescription(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: o.lCo$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C31437ltx c31437ltx, Continuation<? super Unit> continuation) {
            C29848lCo.AEQbTJ(C29848lCo.this).fARcdN.KWHzl(c31437ltx);
            return Unit.INSTANCE;
        }
    }

    public final void OcIXYQ() {
        C31354lsT.trackButtonClick$default(C31354lsT.KWHzl, "Lite_Trade_FullButton_Click", "to_currency_list_button", false, 4, null);
        BSCMasterViewModel bSCMasterViewModelQfsBiF = QfsBiF();
        CryptoListBottomSheet.ListType listType = CryptoListBottomSheet.ListType.CONVERT_TO;
        java.util.List<CurrencyToken> listEZpvd = EZpvd(fJNWhG().values());
        java.lang.String symbol = fJNWhG().fIwbmz().getSymbol();
        java.lang.String isoCode = fJNWhG().fIwbmz().getIsoCode();
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) CollectionsKt___CollectionsKt.firstOrNull(fJNWhG().values());
        bSCMasterViewModelQfsBiF.EZpvd(new BSCMasterViewModel.ActionBar(listType, listEZpvd, symbol, isoCode, C33129mqd.AEQbTJ(convertCurrencyBean != null ? convertCurrencyBean.getLocalCurrencyToUsdRate() : null), C33129mqd.gEmmrt(fJNWhG().ejfBZ().getCcy()), null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(fJNWhG().fetchVPNInfo().getCcyId())), 64, null));
        new CryptoListBottomSheet(new Function2() { // from class: o.lCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C29848lCo.EZpvd(this.AEQbTJ, (CurrencyToken) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }).show(getChildFragmentManager(), "CryptoListBottomSheet");
    }

    public static final Unit EZpvd(C29848lCo c29848lCo, CurrencyToken currencyToken, boolean z) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(currencyToken, "");
        ConvertViewModel convertViewModelFJNWhG = c29848lCo.fJNWhG();
        ConvertCurrencyBean convertCurrencyBeanOLrzqt = lyC.AEQbTJ.OLrzqt(currencyToken);
        if (Intrinsics.EZpvd(convertCurrencyBeanOLrzqt.getFiatFlag(), java.lang.Boolean.TRUE) && convertCurrencyBeanOLrzqt.getSign().length() == 0) {
            java.util.Iterator<T> it = c29848lCo.fJNWhG().isConnected().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((ConvertCurrencyBean) next).getCcy(), (java.lang.Object) convertCurrencyBeanOLrzqt.getCcy())) {
                    break;
                }
            }
            ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) next;
            java.lang.String sign = convertCurrencyBean != null ? convertCurrencyBean.getSign() : null;
            convertCurrencyBeanOLrzqt.setSign(sign != null ? sign : "");
        }
        convertViewModelFJNWhG.KWHzl(convertCurrencyBeanOLrzqt);
        c29848lCo.fJNWhG().AEQbTJ(c29848lCo.fJNWhG().fetchVPNInfo(), c29848lCo.fJNWhG().ejfBZ());
        return Unit.INSTANCE;
    }

    public final void QOLQEE() {
        C31354lsT.trackButtonClick$default(C31354lsT.KWHzl, "Lite_Trade_FullButton_Click", "from_currency_list_button", false, 4, null);
        QfsBiF().EZpvd(new BSCMasterViewModel.ActionBar(CryptoListBottomSheet.ListType.CONVERT_FROM, EZpvd(fJNWhG().isConnected()), fJNWhG().fIwbmz().getSymbol(), null, AudioStats.AUDIO_AMPLITUDE_NONE, C33129mqd.gEmmrt(fJNWhG().fetchVPNInfo().getCcy()), null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(fJNWhG().ejfBZ().getCcyId())), 88, null));
        new CryptoListBottomSheet(new Function2() { // from class: o.lCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C29848lCo.KWHzl(this.AEQbTJ, (CurrencyToken) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }).show(getChildFragmentManager(), CryptoListBottomSheet.class.getSimpleName());
    }

    public static final Unit KWHzl(C29848lCo c29848lCo, CurrencyToken currencyToken, boolean z) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        c29848lCo.fJNWhG().OLrzqt(lyC.AEQbTJ.OLrzqt(currencyToken));
        c29848lCo.fJNWhG().KWHzl(c29848lCo.fJNWhG().fetchVPNInfo(), c29848lCo.fJNWhG().ejfBZ());
        return Unit.INSTANCE;
    }

    public final void AwvSrB() {
        OLrzqt(new Function1() { // from class: o.lCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.KWHzl(this.copydefault, (CurrencyToken) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(final C29848lCo c29848lCo, final CurrencyToken currencyToken) {
        final boolean z;
        Intrinsics.checkNotNullParameter(currencyToken, "");
        BSCMasterViewModel bSCMasterViewModelQfsBiF = c29848lCo.QfsBiF();
        if (bSCMasterViewModelQfsBiF.AEQbTJ(TargetTab.CONVERT)) {
            z = false;
        } else {
            BuySellConvertParameters fieldNames = bSCMasterViewModelQfsBiF.getFieldNames();
            java.lang.String strValues = fieldNames != null ? fieldNames.values() : null;
            if ((strValues == null || strValues.length() == 0) && c29848lCo.fJNWhG().flVtFt()) {
                z = true;
            }
        }
        if (z) {
            c29848lCo.fJNWhG().EZpvd(lyC.AEQbTJ.OLrzqt(currencyToken));
        }
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<java.lang.Boolean>> mutableLiveDataRJOkX = c29848lCo.fJNWhG().RJOkX();
        LifecycleOwner viewLifecycleOwner = c29848lCo.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataRJOkX, viewLifecycleOwner, new Function1() { // from class: o.lCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.EZpvd(z, c29848lCo, currencyToken, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(boolean z, C29848lCo c29848lCo, CurrencyToken currencyToken, boolean z2) {
        if (z2 && z) {
            c29848lCo.AEQbTJ(currencyToken);
        }
        return Unit.INSTANCE;
    }

    public final void zsXlph() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataQKVWgx = fJNWhG().QKVWgx();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataQKVWgx, viewLifecycleOwner, new Function1() { // from class: o.lDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.KWHzl(this.OLrzqt, (Unit) obj);
            }
        });
    }

    public static final Unit KWHzl(C29848lCo c29848lCo, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c29848lCo.AubY();
        return Unit.INSTANCE;
    }

    public final void sSMYrx() {
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<java.lang.Boolean>> mutableLiveDataQUSxYX = fJNWhG().QUSxYX();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataQUSxYX, viewLifecycleOwner, new Function1() { // from class: o.lDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AYXKKw(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AYXKKw(C29848lCo c29848lCo, boolean z) {
        if (z) {
            c29848lCo.showLoading(2000L);
        } else {
            c29848lCo.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        ConvertViewModel.onBothTokenSwitched$default(fJNWhG(), fJNWhG().ejfBZ(), fJNWhG().fetchVPNInfo(), false, 4, null);
    }

    public final void getFieldNames() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.String>> liveDataFFgQHt = fJNWhG().fFgQHt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataFFgQHt, viewLifecycleOwner, new Function1() { // from class: o.lDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.valueOf(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(final C29848lCo c29848lCo, java.lang.String str) {
        AbstractC31464luX abstractC31464luX = (AbstractC31464luX) c29848lCo.KWHzl();
        abstractC31464luX.valueOf.setVisibility(8);
        abstractC31464luX.djBIcL.setVisibility(4);
        abstractC31464luX.KWHzl.setVisibility(4);
        abstractC31464luX.values.setVisibility(0);
        C55173xeu c55173xeu = abstractC31464luX.fetchVPNInfo;
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hUfVAv));
        c55173xeu.AEQbTJ().setVisibility(0);
        c55173xeu.AEQbTJ().setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fvQaOB));
        c55173xeu.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29848lCo.values(this.OLrzqt, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void values(C29848lCo c29848lCo, android.view.View view) {
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context contextRequireContext = c29848lCo.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (c43453rpa.KWHzl(contextRequireContext)) {
            c29848lCo.AubY();
        }
    }

    public final void AuCTelauCTel() {
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<java.lang.Boolean>> mutableLiveDataQfsBiF = fJNWhG().QfsBiF();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataQfsBiF, viewLifecycleOwner, new Function1() { // from class: o.lDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AhwBna(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(final C29848lCo c29848lCo, boolean z) {
        if (z) {
            AbstractC31464luX abstractC31464luX = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX.valueOf.setVisibility(8);
            abstractC31464luX.djBIcL.setVisibility(4);
            abstractC31464luX.KWHzl.setVisibility(4);
            abstractC31464luX.values.setVisibility(0);
            C55173xeu c55173xeu = abstractC31464luX.fetchVPNInfo;
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hUfVAv));
            c55173xeu.AEQbTJ().setVisibility(0);
            c55173xeu.AEQbTJ().setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fvQaOB));
            c55173xeu.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lDb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.uzCIH(this.EZpvd, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void uzCIH(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.AubY();
    }

    public final void gHZMYf() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.Boolean>> liveDataQVAiDq = fJNWhG().QVAiDq();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataQVAiDq, viewLifecycleOwner, new Function1() { // from class: o.lDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.gEmmrt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C29848lCo c29848lCo, boolean z) {
        if (z) {
            ((AbstractC31464luX) c29848lCo.KWHzl()).AuCTel.OLrzqt(0L);
        } else {
            ((AbstractC31464luX) c29848lCo.KWHzl()).AuCTel.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(final java.util.List<kotlin.Pair<java.lang.Double, java.lang.String>> list, final Function2<? super java.lang.Double, ? super java.lang.String, Unit> function2) {
        java.util.List listGEmmrt = yDY.gEmmrt(((AbstractC31464luX) KWHzl()).copydefault, ((AbstractC31464luX) KWHzl()).AEQbTJ, ((AbstractC31464luX) KWHzl()).OLrzqt, ((AbstractC31464luX) KWHzl()).EZpvd);
        java.lang.String string = getString(C31351lsQ.Activity.fARcdN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C31351lsQ.Activity.AuCTel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (list.size() == 1 && (Intrinsics.EZpvd((java.lang.Object) list.get(0).getSecond(), (java.lang.Object) string) || Intrinsics.EZpvd((java.lang.Object) list.get(0).getSecond(), (java.lang.Object) string2))) {
            java.util.Iterator it = listGEmmrt.iterator();
            while (it.hasNext()) {
                ((C54984xbQ) it.next()).setVisibility(8);
            }
            C52794wYp c52794wYp = ((AbstractC31464luX) KWHzl()).gEmmrt;
            c52794wYp.setVisibility(0);
            c52794wYp.setText(list.get(0).getSecond());
            c52794wYp.setEnabled(true);
            c52794wYp.setClickable(true);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lCs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.KWHzl(function2, list, view);
                }
            });
            fJNWhG().EZpvd(true);
        } else {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair = (kotlin.Pair) obj;
                final double dDoubleValue = ((java.lang.Number) pair.component1()).doubleValue();
                final java.lang.String str = (java.lang.String) pair.component2();
                C54984xbQ c54984xbQ = (C54984xbQ) CollectionsKt___CollectionsKt.AkhnZx(listGEmmrt, i);
                if (c54984xbQ != null) {
                    lIH.OLrzqt(c54984xbQ);
                    c54984xbQ.setText(str);
                    c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.lCq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C29848lCo.AEQbTJ(function2, dDoubleValue, str, view);
                        }
                    });
                    c54984xbQ.setVisibility(0);
                }
                i++;
            }
            java.util.Iterator it2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listGEmmrt, list.size()).iterator();
            while (it2.hasNext()) {
                ((C54984xbQ) it2.next()).setVisibility(8);
            }
            C52794wYp c52794wYp2 = ((AbstractC31464luX) KWHzl()).gEmmrt;
            c52794wYp2.setOnClickListener(null);
            c52794wYp2.setVisibility(8);
            fJNWhG().EZpvd(false);
        }
        fARcdN();
    }

    public static final void KWHzl(Function2 function2, java.util.List list, android.view.View view) {
        function2.invoke(((kotlin.Pair) list.get(0)).getFirst(), ((kotlin.Pair) list.get(0)).getSecond());
    }

    public static final void AEQbTJ(Function2 function2, double d, java.lang.String str, android.view.View view) {
        function2.invoke(java.lang.Double.valueOf(d), str);
    }

    public final void zLjUOn() {
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<ConvertViewModel.TaskDescription>> mutableLiveDataSSMYrx = fJNWhG().sSMYrx();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataSSMYrx, viewLifecycleOwner, new Function1() { // from class: o.lDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AEQbTJ(this.copydefault, (ConvertViewModel.TaskDescription) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v102, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v118, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v134, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v139, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v144, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v158, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v173, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v62, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v86, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v51, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final C29848lCo c29848lCo, final ConvertViewModel.TaskDescription taskDescription) {
        java.lang.String errorAmountText$default;
        java.lang.String errorAmountText$default2;
        java.lang.String errorAmountText$default3;
        java.lang.String errorAmountText$default4;
        java.lang.String errorAmountText$default5;
        java.lang.String errorAmountText$default6;
        java.lang.String errorAmountText$default7;
        java.lang.String errorAmountText$default8;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        ((AbstractC31464luX) c29848lCo.KWHzl()).DbNXlk.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29848lCo.EZpvd(view);
            }
        });
        java.lang.Object objAEQbTJ = mHA.OLrzqt.AEQbTJ(c29848lCo.fJNWhG().gGvvIC());
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i = Intrinsics.EZpvd(objAEQbTJ, bool) ? 4 : 0;
        C31597lwz c31597lwz = ((AbstractC31464luX) c29848lCo.KWHzl()).DbNXlk;
        if (taskDescription instanceof ConvertViewModel.TaskDescription.ActionBar) {
            c31597lwz.getRoot().setVisibility(0);
            ConvertViewModel.TaskDescription.ActionBar actionBar = (ConvertViewModel.TaskDescription.ActionBar) taskDescription;
            java.lang.String fiatAmountForConvertFrom$default = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), actionBar.KWHzl(), false, 2, null);
            android.widget.TextView textView = c31597lwz.EZpvd;
            int i2 = C31351lsQ.Activity.DcMfJKfNLfdT;
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                strOLrzqt2 = c29848lCo.OLrzqt(actionBar.KWHzl(), actionBar.copydefault(), RoundingMode.UP);
            } else {
                strOLrzqt2 = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default, RoundingMode.UP);
            }
            textView.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strOLrzqt2))));
            c31597lwz.AEQbTJ.setVisibility(8);
            AbstractC31464luX abstractC31464luX = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX.AYXKKw.setIsErrorInput(true);
            abstractC31464luX.AuCTel.setVisibility(8);
            abstractC31464luX.AhwBna.setVisibility(8);
            abstractC31464luX.AhwBna.setEnabled(false);
        } else if (taskDescription instanceof ConvertViewModel.TaskDescription.StateListAnimator) {
            c31597lwz.getRoot().setVisibility(0);
            ConvertViewModel.TaskDescription.StateListAnimator stateListAnimator = (ConvertViewModel.TaskDescription.StateListAnimator) taskDescription;
            java.lang.String fiatAmountForConvertFrom$default2 = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), stateListAnimator.AEQbTJ(), false, 2, null);
            android.widget.TextView textView2 = c31597lwz.EZpvd;
            int i3 = C31351lsQ.Activity.DcMfJKfNLfdT;
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                strOLrzqt = c29848lCo.OLrzqt(stateListAnimator.AEQbTJ(), stateListAnimator.OLrzqt(), RoundingMode.UP);
            } else {
                strOLrzqt = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default2, RoundingMode.UP);
            }
            textView2.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strOLrzqt))));
            c31597lwz.AEQbTJ.setVisibility(8);
            AbstractC31464luX abstractC31464luX2 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX2.AYXKKw.setIsErrorInput(true);
            abstractC31464luX2.AuCTel.setVisibility(8);
            abstractC31464luX2.AhwBna.setVisibility(8);
            abstractC31464luX2.AhwBna.setEnabled(false);
        } else if (Intrinsics.EZpvd(taskDescription, ConvertViewModel.TaskDescription.LoaderManager.EZpvd) || Intrinsics.EZpvd(taskDescription, ConvertViewModel.TaskDescription.PendingIntent.OLrzqt) || Intrinsics.EZpvd(taskDescription, ConvertViewModel.TaskDescription.Activity.OLrzqt)) {
            c31597lwz.getRoot().setVisibility(8);
            c29848lCo.copydefault(true);
            c29848lCo.uzCIH();
            AbstractC31464luX abstractC31464luX3 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX3.AYXKKw.setIsErrorInput(false);
            abstractC31464luX3.AuCTel.setVisibility(0);
            abstractC31464luX3.AhwBna.setVisibility(8);
            abstractC31464luX3.AhwBna.setEnabled(false);
            InputAmountSharedDataSource.copydefault.copydefault(c29848lCo.copydefault(c29848lCo.fJNWhG().AEQbTJ(c29848lCo.fJNWhG().fJNWhG())));
        } else if (Intrinsics.EZpvd(taskDescription, ConvertViewModel.TaskDescription.SharedElementCallback.EZpvd)) {
            c31597lwz.getRoot().setVisibility(8);
            c29848lCo.uzCIH();
            AbstractC31464luX abstractC31464luX4 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX4.AYXKKw.setIsErrorInput(false);
            abstractC31464luX4.AuCTel.setVisibility(8);
            abstractC31464luX4.AhwBna.setVisibility(0);
            abstractC31464luX4.AhwBna.setEnabled(true);
            InputAmountSharedDataSource.copydefault.copydefault(c29848lCo.copydefault("0"));
        } else if (Intrinsics.EZpvd(taskDescription, ConvertViewModel.TaskDescription.VoiceInteractor.OLrzqt)) {
            c31597lwz.getRoot().setVisibility(8);
            c29848lCo.uzCIH();
            AbstractC31464luX abstractC31464luX5 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX5.AYXKKw.setIsErrorInput(false);
            abstractC31464luX5.AuCTel.setVisibility(0);
            abstractC31464luX5.AuCTel.setEnabled(false);
            abstractC31464luX5.AhwBna.setVisibility(8);
            abstractC31464luX5.AhwBna.setEnabled(false);
            InputAmountSharedDataSource.copydefault.copydefault(c29848lCo.copydefault("0"));
        } else if (taskDescription instanceof ConvertViewModel.TaskDescription.Application) {
            c31597lwz.getRoot().setVisibility(0);
            ConvertViewModel.TaskDescription.Application application = (ConvertViewModel.TaskDescription.Application) taskDescription;
            java.lang.String strCopydefault = c29848lCo.fJNWhG().copydefault(application.copydefault(), true);
            android.widget.TextView textView3 = c31597lwz.EZpvd;
            int i4 = C31351lsQ.Activity.DcMfJKffREWX;
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool)) {
                errorAmountText$default8 = c29848lCo.OLrzqt(strCopydefault, RoundingMode.DOWN);
            } else {
                errorAmountText$default8 = getErrorAmountText$default(c29848lCo, application.copydefault(), application.KWHzl(), null, 4, null);
            }
            textView3.setText(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default8))));
            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.fARcdN(this.EZpvd, view);
                }
            });
            c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDcMfJK));
            c31597lwz.AEQbTJ.setVisibility(0);
            AbstractC31464luX abstractC31464luX6 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX6.AYXKKw.setIsErrorInput(true);
            abstractC31464luX6.AuCTel.setVisibility(8);
            abstractC31464luX6.AhwBna.setVisibility(8);
            abstractC31464luX6.AhwBna.setEnabled(false);
        } else if (taskDescription instanceof ConvertViewModel.TaskDescription.C0383TaskDescription) {
            c31597lwz.getRoot().setVisibility(0);
            ConvertViewModel.TaskDescription.C0383TaskDescription c0383TaskDescription = (ConvertViewModel.TaskDescription.C0383TaskDescription) taskDescription;
            java.lang.String strCopydefault2 = c29848lCo.fJNWhG().copydefault(c0383TaskDescription.OLrzqt(), true);
            android.widget.TextView textView4 = c31597lwz.EZpvd;
            int i5 = C31351lsQ.Activity.DcMfJKffREWX;
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool)) {
                errorAmountText$default7 = c29848lCo.OLrzqt(strCopydefault2, RoundingMode.DOWN);
            } else {
                errorAmountText$default7 = getErrorAmountText$default(c29848lCo, c0383TaskDescription.OLrzqt(), c0383TaskDescription.AEQbTJ(), null, 4, null);
            }
            textView4.setText(C33069mpW.copydefault(i5, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default7))));
            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.AuCTel(this.KWHzl, view);
                }
            });
            c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDcMfJK));
            c31597lwz.AEQbTJ.setVisibility(0);
            AbstractC31464luX abstractC31464luX7 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX7.AYXKKw.setIsErrorInput(true);
            abstractC31464luX7.AuCTel.setVisibility(8);
            abstractC31464luX7.AhwBna.setVisibility(8);
            abstractC31464luX7.AhwBna.setEnabled(false);
        } else if (taskDescription instanceof ConvertViewModel.TaskDescription.Fragment) {
            c31597lwz.getRoot().setVisibility(0);
            ConvertViewModel.TaskDescription.Fragment fragment = (ConvertViewModel.TaskDescription.Fragment) taskDescription;
            java.lang.String fiatAmountForConvertFrom$default3 = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), fragment.copydefault(), false, 2, null);
            android.widget.TextView textView5 = c31597lwz.EZpvd;
            int i6 = C31351lsQ.Activity.DcMfJKfbSiEC;
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                errorAmountText$default6 = getErrorAmountText$default(c29848lCo, fragment.copydefault(), fragment.OLrzqt(), null, 4, null);
            } else {
                errorAmountText$default6 = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default3, RoundingMode.DOWN);
            }
            textView5.setText(C33069mpW.copydefault(i6, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default6))));
            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.AEQbTJ(this.EZpvd, taskDescription, view);
                }
            });
            c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKdMCrTj));
            c31597lwz.AEQbTJ.setVisibility(0);
            AbstractC31464luX abstractC31464luX8 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX8.AYXKKw.setIsErrorInput(true);
            abstractC31464luX8.AuCTel.setVisibility(8);
            abstractC31464luX8.AhwBna.setVisibility(8);
            abstractC31464luX8.AhwBna.setEnabled(false);
        } else if (taskDescription instanceof ConvertViewModel.TaskDescription.FragmentManager) {
            c31597lwz.getRoot().setVisibility(0);
            ConvertViewModel.TaskDescription.FragmentManager fragmentManager = (ConvertViewModel.TaskDescription.FragmentManager) taskDescription;
            java.lang.String fiatAmountForConvertFrom$default4 = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), fragmentManager.AEQbTJ(), false, 2, null);
            android.widget.TextView textView6 = c31597lwz.EZpvd;
            int i7 = C31351lsQ.Activity.DcMfJKfbSiEC;
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                errorAmountText$default5 = getErrorAmountText$default(c29848lCo, fragmentManager.AEQbTJ(), fragmentManager.copydefault(), null, 4, null);
            } else {
                errorAmountText$default5 = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default4, RoundingMode.DOWN);
            }
            textView6.setText(C33069mpW.copydefault(i7, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default5))));
            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.KWHzl(this.KWHzl, taskDescription, view);
                }
            });
            c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKdMCrTj));
            c31597lwz.AEQbTJ.setVisibility(0);
            AbstractC31464luX abstractC31464luX9 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX9.AYXKKw.setIsErrorInput(true);
            abstractC31464luX9.AuCTel.setVisibility(8);
            abstractC31464luX9.AhwBna.setVisibility(8);
            abstractC31464luX9.AhwBna.setEnabled(false);
        } else if (taskDescription instanceof ConvertViewModel.TaskDescription.PictureInPictureParams) {
            c31597lwz.getRoot().setVisibility(0);
            ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.setToggleContainerVisibility(c29848lCo.ORxRYg() ? 4 : i);
            ConvertViewModel.TaskDescription.PictureInPictureParams pictureInPictureParams = (ConvertViewModel.TaskDescription.PictureInPictureParams) taskDescription;
            java.lang.String fiatAmountForConvertFrom$default5 = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), pictureInPictureParams.KWHzl(), false, 2, null);
            if (((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw() && c29848lCo.fJNWhG().fetchVPNInfo().getTransferable()) {
                android.widget.TextView textView7 = c31597lwz.EZpvd;
                int i8 = C31351lsQ.Activity.DcMfJKfNUfqk;
                if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                    errorAmountText$default4 = getErrorAmountText$default(c29848lCo, pictureInPictureParams.KWHzl(), pictureInPictureParams.OLrzqt(), null, 4, null);
                } else {
                    errorAmountText$default4 = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default5, RoundingMode.UP);
                }
                textView7.setText(C33069mpW.copydefault(i8, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default4))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fbC));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C29848lCo.fJNWhG(this.EZpvd, view);
                    }
                });
            } else {
                android.widget.TextView textView8 = c31597lwz.EZpvd;
                int i9 = C31351lsQ.Activity.Hx;
                if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                    errorAmountText$default3 = getErrorAmountText$default(c29848lCo, pictureInPictureParams.KWHzl(), pictureInPictureParams.OLrzqt(), null, 4, null);
                } else {
                    errorAmountText$default3 = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default5, RoundingMode.UP);
                }
                textView8.setText(C33069mpW.copydefault(i9, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default3))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool)) {
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C29848lCo.ejfBZ(this.OLrzqt, view);
                        }
                    });
                } else {
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C29848lCo.fIwbmz(this.AEQbTJ, view);
                        }
                    });
                }
            }
            c31597lwz.AEQbTJ.setVisibility(0);
            AbstractC31464luX abstractC31464luX10 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX10.AYXKKw.setIsErrorInput(true);
            abstractC31464luX10.AuCTel.setVisibility(8);
            abstractC31464luX10.AhwBna.setVisibility(8);
            abstractC31464luX10.AhwBna.setEnabled(false);
        } else {
            if (!(taskDescription instanceof ConvertViewModel.TaskDescription.Dialog)) {
                throw new NoWhenBranchMatchedException();
            }
            c31597lwz.getRoot().setVisibility(0);
            ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.setToggleContainerVisibility(c29848lCo.ORxRYg() ? 4 : i);
            ConvertViewModel.TaskDescription.Dialog dialog = (ConvertViewModel.TaskDescription.Dialog) taskDescription;
            java.lang.String fiatAmountForConvertFrom$default6 = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), dialog.EZpvd(), false, 2, null);
            if (((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw() && c29848lCo.fJNWhG().fetchVPNInfo().getTransferable()) {
                android.widget.TextView textView9 = c31597lwz.EZpvd;
                int i10 = C31351lsQ.Activity.DcMfJKfNUfqk;
                if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                    errorAmountText$default2 = getErrorAmountText$default(c29848lCo, dialog.EZpvd(), dialog.OLrzqt(), null, 4, null);
                } else {
                    errorAmountText$default2 = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default6, RoundingMode.UP);
                }
                textView9.setText(C33069mpW.copydefault(i10, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default2))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fbC));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C29848lCo.iwGUEr(this.KWHzl, view);
                    }
                });
            } else {
                android.widget.TextView textView10 = c31597lwz.EZpvd;
                int i11 = C31351lsQ.Activity.Hx;
                if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool) || c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                    errorAmountText$default = getErrorAmountText$default(c29848lCo, dialog.EZpvd(), dialog.OLrzqt(), null, 4, null);
                } else {
                    errorAmountText$default = c29848lCo.OLrzqt(fiatAmountForConvertFrom$default6, RoundingMode.UP);
                }
                textView10.setText(C33069mpW.copydefault(i11, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, errorAmountText$default))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), bool)) {
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C29848lCo.hDKMBd(this.AEQbTJ, view);
                        }
                    });
                } else {
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lCB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C29848lCo.getFieldNames(this.copydefault, view);
                        }
                    });
                }
            }
            c31597lwz.AEQbTJ.setVisibility(0);
            AbstractC31464luX abstractC31464luX11 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX11.AYXKKw.setIsErrorInput(true);
            abstractC31464luX11.AuCTel.setVisibility(8);
            abstractC31464luX11.AhwBna.setVisibility(8);
            abstractC31464luX11.AhwBna.setEnabled(false);
        }
        c29848lCo.fARcdN();
        return Unit.INSTANCE;
    }

    public static final void fARcdN(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.fJNWhG().gasjUx();
    }

    public static final void AuCTel(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.fJNWhG().gasjUx();
    }

    public static final void AEQbTJ(C29848lCo c29848lCo, ConvertViewModel.TaskDescription taskDescription, android.view.View view) {
        c29848lCo.fJNWhG().copydefault(((ConvertViewModel.TaskDescription.Fragment) taskDescription).copydefault());
    }

    public static final void KWHzl(C29848lCo c29848lCo, ConvertViewModel.TaskDescription taskDescription, android.view.View view) {
        c29848lCo.fJNWhG().copydefault(((ConvertViewModel.TaskDescription.FragmentManager) taskDescription).AEQbTJ());
    }

    public static final void fJNWhG(C29848lCo c29848lCo, android.view.View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity = c29848lCo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, new TransferDetail(new TransferDetail.Target(18), new TransferDetail.Target(6), java.lang.Integer.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()), null, false, false, null, 120, null));
    }

    public static final void ejfBZ(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.fJNWhG().fvQaOB();
    }

    public static final void fIwbmz(C29848lCo c29848lCo, android.view.View view) {
        InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
        FragmentActivity fragmentActivityRequireActivity = c29848lCo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC8224ayh.TaskDescription.goToDeposit$default(interfaceC8224ayh, fragmentActivityRequireActivity, new DepositEntryPoint.SpecificCryptoPage(C33129mqd.AhwBna(java.lang.Integer.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()))), null, null, null, null, 60, null);
    }

    public static final void iwGUEr(C29848lCo c29848lCo, android.view.View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity = c29848lCo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, new TransferDetail(new TransferDetail.Target(18), new TransferDetail.Target(6), java.lang.Integer.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()), null, false, false, null, 120, null));
    }

    public static final void hDKMBd(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.fJNWhG().fvQaOB();
    }

    public static final void getFieldNames(C29848lCo c29848lCo, android.view.View view) {
        InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
        FragmentActivity fragmentActivityRequireActivity = c29848lCo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC8224ayh.TaskDescription.goToDeposit$default(interfaceC8224ayh, fragmentActivityRequireActivity, new DepositEntryPoint.SpecificCryptoPage(C33129mqd.AhwBna(java.lang.Integer.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()))), null, null, null, null, 60, null);
    }

    public final void AuCTel() {
        BuySellConvertParameters fieldNames = QfsBiF().getFieldNames();
        if (fieldNames != null && AEQbTJ(fieldNames)) {
            fJNWhG().AEQbTJ(fieldNames);
        } else {
            AubY();
        }
    }

    public final boolean AEQbTJ(BuySellConvertParameters buySellConvertParameters) {
        return buySellConvertParameters.fJNWhG() && buySellConvertParameters.isConnected() == TargetTab.CONVERT && buySellConvertParameters.copydefault().length() == 0 && buySellConvertParameters.values().length() == 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AubY() {
        fJNWhG().valueOf(true);
        ((AbstractC31464luX) KWHzl()).values.setVisibility(8);
        fJNWhG().OLrzqt(QfsBiF());
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<ConvertCurrencyBean>> mutableLiveDataORxRYg = fJNWhG().ORxRYg();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataORxRYg, viewLifecycleOwner, new Function1() { // from class: o.lCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.EZpvd(this.AEQbTJ, (ConvertCurrencyBean) obj);
            }
        });
        mha.copydefault(fJNWhG().AubY(), this, new Function1() { // from class: o.lCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AYXKKw(this.OLrzqt, (kotlin.Pair) obj);
            }
        });
        MutableLiveData<C32989mnw<java.lang.String>> mutableLiveDataUeEOUB = fJNWhG().UeEOUB();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(mutableLiveDataUeEOUB, viewLifecycleOwner2, new Function1() { // from class: o.lCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.gEmmrt(this.KWHzl, (java.lang.String) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C29848lCo c29848lCo, ConvertCurrencyBean convertCurrencyBean) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.copydefault(convertCurrencyBean.getCcy(), true);
        c29848lCo.fJNWhG().AhwBna(c29848lCo.ejfBZ());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(final C29848lCo c29848lCo, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) pair.component1();
        c29848lCo.fJNWhG().OLrzqt("0");
        C30019lIx c30019lIx = ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw;
        c30019lIx.copydefault(convertCurrencyBean.getCcy(), true);
        c30019lIx.setNumberInputText("0");
        c30019lIx.EZpvd(c29848lCo.fJNWhG().EZpvd("0"));
        c30019lIx.setMaxDecimalValue(c29848lCo.fJNWhG().zuBGHE());
        c29848lCo.fJNWhG().AhwBna(c29848lCo.ejfBZ());
        c29848lCo.OLrzqt(new Function1() { // from class: o.lCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.copydefault(this.copydefault, (ConvertCurrencyBean) obj);
            }
        }, new Function0() { // from class: o.lCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29848lCo.djBIcL(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C29848lCo c29848lCo, ConvertCurrencyBean convertCurrencyBean) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        ConvertViewModel convertViewModelFJNWhG = c29848lCo.fJNWhG();
        BuySellConvertParameters fieldNames = c29848lCo.QfsBiF().getFieldNames();
        java.lang.String strValues = fieldNames != null ? fieldNames.values() : null;
        if (strValues == null || strValues.length() == 0) {
            convertViewModelFJNWhG.EZpvd(convertCurrencyBean);
        }
        convertViewModelFJNWhG.valueOf(false);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C29848lCo c29848lCo) {
        ConvertViewModel convertViewModelFJNWhG = c29848lCo.fJNWhG();
        convertViewModelFJNWhG.gEmmrt(true);
        convertViewModelFJNWhG.valueOf(false);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C29848lCo c29848lCo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(c29848lCo.fJNWhG().ejfBZ().getFiatFlag(), java.lang.Boolean.TRUE) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && C33129mqd.valueOf(str, java.lang.Double.valueOf(0.01d))) {
            c29848lCo.fJNWhG().AYXKKw("<0.01 " + c29848lCo.fJNWhG().ejfBZ().getCcy());
            return Unit.INSTANCE;
        }
        c29848lCo.fJNWhG().AYXKKw(C31661lzi.appendCryptoSymbol$default(str, c29848lCo.fJNWhG().ejfBZ().getCcy(), c29848lCo.fJNWhG().ejfBZ().getScale(), C38307pTy.Companion.KWHzl(0, c29848lCo.fJNWhG().ejfBZ().getScale()), null, null, 24, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QUSxYX() {
        ((AbstractC31464luX) KWHzl()).AYXKKw.setCurrencyToggleOnClickListener(new View.OnClickListener() { // from class: o.lCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29848lCo.getNewProxyInstance(this.copydefault, view);
            }
        });
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<com.okinc.buysell.ui.bsc.util.InputType>> liveDataAwvSrB = fJNWhG().AwvSrB();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAwvSrB, viewLifecycleOwner, new Function1() { // from class: o.lCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.KWHzl(this.EZpvd, (com.okinc.buysell.ui.bsc.util.InputType) obj);
            }
        });
        MutableLiveData<C32989mnw<kotlin.Pair<java.lang.String, ConvertCurrencyBean>>> mutableLiveDataAxsJAY = fJNWhG().AxsJAY();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(mutableLiveDataAxsJAY, viewLifecycleOwner2, new Function1() { // from class: o.lCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.valueOf(this.copydefault, (kotlin.Pair) obj);
            }
        });
        MutableLiveData<C32989mnw<java.lang.String>> mutableLiveDataAuCTelauCTel = fJNWhG().AuCTelauCTel();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(mutableLiveDataAuCTelauCTel, viewLifecycleOwner3, new Function1() { // from class: o.lCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AYXKKw(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        MutableLiveData<C32989mnw<Unit>> mutableLiveDataWlaJM = fJNWhG().wlaJM();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(mutableLiveDataWlaJM, viewLifecycleOwner4, new Function1() { // from class: o.lCS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.EZpvd(this.AEQbTJ, (Unit) obj);
            }
        });
        MutableLiveData<C32989mnw<java.lang.Boolean>> mutableLiveDataGGvvIC = fJNWhG().gGvvIC();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(mutableLiveDataGGvvIC, viewLifecycleOwner5, new Function1() { // from class: o.lCQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.djBIcL(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataQbewEr = fJNWhG().QbewEr();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataQbewEr, viewLifecycleOwner6, new Function1() { // from class: o.lCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.valueOf(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<CurrencyToken>> liveDataQOLQEE = fJNWhG().QOLQEE();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataQOLQEE, viewLifecycleOwner7, new Function1() { // from class: o.lCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.copydefault(this.EZpvd, (CurrencyToken) obj);
            }
        });
        MutableLiveData<C32989mnw<C31389ltB>> mutableLiveDataZsXlph = fJNWhG().zsXlph();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        mha.copydefault(mutableLiveDataZsXlph, viewLifecycleOwner8, new Function1() { // from class: o.lCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.KWHzl(this.OLrzqt, (C31389ltB) obj);
            }
        });
        C30019lIx c30019lIx = ((AbstractC31464luX) KWHzl()).AYXKKw;
        uzCIH();
        ((AbstractC31464luX) KWHzl()).AkhnZx.setEditable(c30019lIx.AEQbTJ());
        ((AbstractC31464luX) KWHzl()).AkhnZx.setOKDSSize(C30018lIw.OLrzqt(c30019lIx.getContext()));
        c30019lIx.setDebounceOnTextChangedListener(new Function1() { // from class: o.lCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AhwBna(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final void getNewProxyInstance(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.fJNWhG().gkJEwt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C29848lCo c29848lCo, com.okinc.buysell.ui.bsc.util.InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        c29848lCo.fJNWhG().OLrzqt("0");
        C30019lIx c30019lIx = ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw;
        c30019lIx.setNumberInputText("0");
        c30019lIx.setMaxDecimalValue(c29848lCo.fJNWhG().zuBGHE());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C29848lCo c29848lCo, kotlin.Pair pair) {
        java.lang.String fiatAmountForConvertFrom$default;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.component1();
        c29848lCo.fJNWhG().OLrzqt(c29848lCo.fJNWhG().AEQbTJ(str));
        int i = Application.EZpvd[c29848lCo.fJNWhG().fARcdN().ordinal()];
        if (i == 1) {
            ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.setNumberInputText(c29848lCo.fJNWhG().fJNWhG());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), java.lang.Boolean.TRUE)) {
                fiatAmountForConvertFrom$default = c29848lCo.fJNWhG().fJNWhG();
            } else {
                fiatAmountForConvertFrom$default = ConvertViewModel.getFiatAmountForConvertFrom$default(c29848lCo.fJNWhG(), c29848lCo.fJNWhG().fJNWhG(), false, 2, null);
            }
            ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.setNumberInputText(fiatAmountForConvertFrom$default);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C29848lCo c29848lCo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivityRequireActivity = c29848lCo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default(interfaceC47251tmX, fragmentActivityRequireActivity, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPaymentSelectionPage(str), OKPaymentSource.LITE_CONVERT_TOPUP), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C29848lCo c29848lCo, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        if (c29848lCo.fIwbmz()) {
            if (c29848lCo.DbNXlk()) {
                android.content.Context contextRequireContext = c29848lCo.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C30018lIw.AEQbTJ(contextRequireContext, (Function0<Unit>) new Function0() { // from class: o.lCJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C29848lCo.AhwBna(this.copydefault);
                    }
                });
                c29848lCo.fJNWhG().OLrzqt(c29848lCo.QfsBiF().fJNWhG(), c29848lCo.fJNWhG().fJNWhG());
            } else {
                InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
                FragmentActivity fragmentActivityRequireActivity = c29848lCo.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, new TransferDetail(new TransferDetail.Target(6), new TransferDetail.Target(18), java.lang.Integer.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()), null, false, false, null, 120, null));
            }
        } else {
            InterfaceC31670lzr interfaceC31670lzr2 = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            FragmentActivity fragmentActivityRequireActivity2 = c29848lCo.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            interfaceC31670lzr2.copydefault(fragmentActivityRequireActivity2, new TransferDetail(new TransferDetail.Target(18), new TransferDetail.Target(6), java.lang.Integer.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()), null, false, false, null, 120, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C29848lCo c29848lCo) {
        C29846lCm.Companion.AEQbTJ(c29848lCo.fJNWhG().fetchVPNInfo().getCcyId()).showNow(c29848lCo.getChildFragmentManager(), "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C29848lCo c29848lCo, boolean z) {
        if (Intrinsics.EZpvd(c29848lCo.fJNWhG().ejfBZ().getFiatFlag(), java.lang.Boolean.TRUE) && c29848lCo.fJNWhG().fARcdN() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
            c29848lCo.fJNWhG().OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        }
        ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.setToggleContainerVisibility(z ? 4 : 0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C29848lCo c29848lCo, boolean z) {
        if (z) {
            AbstractC31464luX abstractC31464luX = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX.valueOf.setVisibility(0);
            abstractC31464luX.djBIcL.setVisibility(4);
            abstractC31464luX.KWHzl.setVisibility(4);
        } else {
            lIE.showPaymentSelectorContent$default(((AbstractC31464luX) c29848lCo.KWHzl()).fARcdN, false, 1, null);
            AbstractC31464luX abstractC31464luX2 = (AbstractC31464luX) c29848lCo.KWHzl();
            abstractC31464luX2.valueOf.setVisibility(8);
            abstractC31464luX2.djBIcL.setVisibility(0);
            abstractC31464luX2.KWHzl.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C29848lCo c29848lCo, CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        if (Intrinsics.EZpvd(c29848lCo.fJNWhG().fetchVPNInfo().getFiatFlag(), java.lang.Boolean.FALSE) && c29848lCo.QfsBiF().AEQbTJ(TargetTab.CONVERT) && c29848lCo.fJNWhG().flVtFt()) {
            c29848lCo.QfsBiF().OLrzqt(currencyToken);
            c29848lCo.fJNWhG().KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C29848lCo c29848lCo, C31389ltB c31389ltB) {
        Intrinsics.checkNotNullParameter(c31389ltB, "");
        c29848lCo.AEQbTJ(false);
        c29848lCo.fJNWhG().OLrzqt(c29848lCo.QfsBiF().fJNWhG(), c29848lCo.fJNWhG().fJNWhG());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C29848lCo c29848lCo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c29848lCo.AEQbTJ(true);
        c29848lCo.fJNWhG().OLrzqt(c29848lCo.QfsBiF().fJNWhG(), c29848lCo.fJNWhG().fJNWhG());
        c29848lCo.fARcdN();
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        ConvertChipAmount convertChipAmount = ConvertChipAmount.TWENTY_FIVE_PERCENT;
        ConvertChipAmount convertChipAmount2 = ConvertChipAmount.FIFTY_PERCENT;
        ConvertChipAmount convertChipAmount3 = ConvertChipAmount.SEVENTY_FIVE_PERCENT;
        ConvertChipAmount convertChipAmount4 = ConvertChipAmount.ALL;
        double percentDecimal = convertChipAmount.getPercentDecimal();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        kotlin.Pair pair = new kotlin.Pair(java.lang.Double.valueOf(percentDecimal), C31433ltt.OLrzqt(convertChipAmount, contextRequireContext));
        double percentDecimal2 = convertChipAmount2.getPercentDecimal();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        kotlin.Pair pair2 = new kotlin.Pair(java.lang.Double.valueOf(percentDecimal2), C31433ltt.OLrzqt(convertChipAmount2, contextRequireContext2));
        double percentDecimal3 = convertChipAmount3.getPercentDecimal();
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        kotlin.Pair pair3 = new kotlin.Pair(java.lang.Double.valueOf(percentDecimal3), C31433ltt.OLrzqt(convertChipAmount3, contextRequireContext3));
        double percentDecimal4 = convertChipAmount4.getPercentDecimal();
        android.content.Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
        copydefault(yDY.AhwBna(pair, pair2, pair3, new kotlin.Pair(java.lang.Double.valueOf(percentDecimal4), C31433ltt.OLrzqt(convertChipAmount4, contextRequireContext4))), new Function2() { // from class: o.lDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C29848lCo.AEQbTJ(this.EZpvd, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(C29848lCo c29848lCo, double d, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onChipClicked$default(c29848lCo, str, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(boolean z) {
        java.lang.String strKWHzl = ((AbstractC31464luX) KWHzl()).AYXKKw.KWHzl();
        java.lang.String ccy = fJNWhG().fetchVPNInfo().getCcy();
        int i = Application.EZpvd[fJNWhG().fARcdN().ordinal()];
        if (i == 1) {
            if (!fJNWhG().finit()) {
                fJNWhG().OLrzqt(strKWHzl);
            }
            java.lang.String fiatAmountForConvertFrom$default = ConvertViewModel.getFiatAmountForConvertFrom$default(fJNWhG(), fJNWhG().fJNWhG(), false, 2, null);
            C30019lIx c30019lIx = ((AbstractC31464luX) KWHzl()).AYXKKw;
            c30019lIx.setTokenCurrency(ccy);
            c30019lIx.EZpvd(fJNWhG().EZpvd(fiatAmountForConvertFrom$default));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (fJNWhG().finit()) {
                ((AbstractC31464luX) KWHzl()).AYXKKw.EZpvd(fJNWhG().EZpvd(fJNWhG().fJNWhG()));
            } else {
                ConvertViewModel convertViewModelFJNWhG = fJNWhG();
                java.lang.Boolean fiatFlag = fJNWhG().fetchVPNInfo().getFiatFlag();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!Intrinsics.EZpvd(fiatFlag, bool)) {
                    strKWHzl = fJNWhG().KWHzl(strKWHzl);
                }
                convertViewModelFJNWhG.OLrzqt(strKWHzl);
                C30019lIx c30019lIx2 = ((AbstractC31464luX) KWHzl()).AYXKKw;
                if (Intrinsics.EZpvd(fJNWhG().fetchVPNInfo().getFiatFlag(), bool)) {
                    c30019lIx2.setTokenCurrency(fJNWhG().fetchVPNInfo().getCcy());
                } else {
                    c30019lIx2.setTokenCurrency(fJNWhG().fIwbmz().getIsoCode());
                }
                c30019lIx2.EZpvd(fJNWhG().EZpvd(fJNWhG().fJNWhG()));
            }
        }
        fJNWhG().EZpvd(fJNWhG().fetchVPNInfo(), fJNWhG().ejfBZ(), fJNWhG().fJNWhG(), z);
        if (fJNWhG().finit()) {
            fJNWhG().AEQbTJ(false);
        }
    }

    public final void zuBGHE() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.String>> liveDataDNCPSb = fJNWhG().dNCPSb();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataDNCPSb, viewLifecycleOwner, new Function1() { // from class: o.lCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        });
        MutableLiveData<C32989mnw<kotlin.Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> mutableLiveDataOcIXYQ = fJNWhG().OcIXYQ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(mutableLiveDataOcIXYQ, viewLifecycleOwner2, new Function1() { // from class: o.lCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.gEmmrt(this.copydefault, (kotlin.Pair) obj);
            }
        });
    }

    public static final Unit djBIcL(C29848lCo c29848lCo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        lTZ ltz = lTZ.KWHzl;
        android.content.Context contextRequireContext = c29848lCo.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ltz.KWHzl(contextRequireContext, str, 5, true, 5000L);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C29848lCo c29848lCo, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) pair.getFirst();
        ConvertCurrencyBean convertCurrencyBean2 = (ConvertCurrencyBean) pair.getSecond();
        ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.copydefault(convertCurrencyBean.getCcy(), false);
        c29848lCo.fJNWhG().AhwBna(c29848lCo.ejfBZ());
        c29848lCo.fJNWhG().OLrzqt("0");
        c29848lCo.fJNWhG().AYXKKw("0 " + convertCurrencyBean2.getCcy());
        ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.EZpvd(c29848lCo.fJNWhG().EZpvd("0"));
        ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw.setNumberInputText("0");
        return Unit.INSTANCE;
    }

    public final void AxsJAY() {
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<kotlin.Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> mutableLiveDataDTwDnp = fJNWhG().DTwDnp();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataDTwDnp, viewLifecycleOwner, new Function1() { // from class: o.lCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.AhwBna(this.copydefault, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C29848lCo c29848lCo, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) pair.getFirst();
        C30019lIx c30019lIx = ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw;
        c30019lIx.copydefault(convertCurrencyBean.getCcy(), false);
        c30019lIx.setMaxDecimalValue(c29848lCo.fJNWhG().zuBGHE());
        if (C33129mqd.valueOf(c29848lCo.fJNWhG().fetchVPNInfo().getAvailable(), "0")) {
            c30019lIx.setNumberInputText("0");
            c30019lIx.EZpvd(c29848lCo.fJNWhG().EZpvd("0"));
        }
        c29848lCo.fJNWhG().AhwBna(c29848lCo.ejfBZ());
        c29848lCo.fJNWhG().OLrzqt(c29848lCo.QfsBiF().fJNWhG(), c29848lCo.fJNWhG().fJNWhG());
        return Unit.INSTANCE;
    }

    public final java.lang.String ejfBZ() {
        ConvertCurrencyBean convertCurrencyBeanFetchVPNInfo = fJNWhG().fetchVPNInfo();
        if (Intrinsics.EZpvd(fJNWhG().fetchVPNInfo().getFiatFlag(), java.lang.Boolean.TRUE)) {
            return C31661lzi.copydefault(convertCurrencyBeanFetchVPNInfo.getAvailable(), convertCurrencyBeanFetchVPNInfo.getCcy(), convertCurrencyBeanFetchVPNInfo.getSign(), C38307pTy.Companion.AEQbTJ(convertCurrencyBeanFetchVPNInfo.getScale()), RoundingMode.DOWN, true);
        }
        return C31661lzi.appendCryptoSymbol$default(convertCurrencyBeanFetchVPNInfo.getAvailable(), convertCurrencyBeanFetchVPNInfo.getCcy(), convertCurrencyBeanFetchVPNInfo.getScale(), C38307pTy.Companion.KWHzl(0, convertCurrencyBeanFetchVPNInfo.getScale()), null, null, 24, null);
    }

    public static /* synthetic */ java.lang.String getErrorAmountText$default(C29848lCo c29848lCo, java.lang.String str, ConvertCurrencyBean convertCurrencyBean, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c29848lCo.OLrzqt(str, convertCurrencyBean, roundingMode);
    }

    public final java.lang.String OLrzqt(java.lang.String str, ConvertCurrencyBean convertCurrencyBean, RoundingMode roundingMode) {
        if (Intrinsics.EZpvd(convertCurrencyBean.getFiatFlag(), java.lang.Boolean.TRUE)) {
            return C31661lzi.copydefault(str, convertCurrencyBean.getCcy(), convertCurrencyBean.getSign(), C38307pTy.Companion.KWHzl(0, convertCurrencyBean.getScale()), RoundingMode.DOWN, true);
        }
        return C31661lzi.appendCryptoSymbol$default(str, convertCurrencyBean.getCcy(), convertCurrencyBean.getScale(), C38307pTy.Companion.KWHzl(0, convertCurrencyBean.getScale()), roundingMode, null, 16, null);
    }

    public static /* synthetic */ java.lang.String getFiatErrorAmountText$default(C29848lCo c29848lCo, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c29848lCo.OLrzqt(str, roundingMode);
    }

    public final java.lang.String OLrzqt(java.lang.String str, RoundingMode roundingMode) {
        return C31661lzi.copydefault(str, fJNWhG().fIwbmz().getIsoCode(), fJNWhG().fIwbmz().getSymbol(), C38307pTy.Companion.KWHzl(0, 2), roundingMode, true);
    }

    public final void wlaJM() {
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<kotlin.Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> mutableLiveDataGHZMYf = fJNWhG().gHZMYf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataGHZMYf, viewLifecycleOwner, new Function1() { // from class: o.lCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.djBIcL(this.EZpvd, (kotlin.Pair) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C29848lCo c29848lCo, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) pair.getFirst();
        c29848lCo.fJNWhG().OLrzqt("0");
        C30019lIx c30019lIx = ((AbstractC31464luX) c29848lCo.KWHzl()).AYXKKw;
        c30019lIx.copydefault(convertCurrencyBean.getCcy(), false);
        c30019lIx.setMaxDecimalValue(c29848lCo.fJNWhG().zuBGHE());
        c30019lIx.EZpvd(c29848lCo.fJNWhG().EZpvd("0"));
        c30019lIx.setNumberInputText("0");
        c29848lCo.fJNWhG().AhwBna(c29848lCo.ejfBZ());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        C52794wYp c52794wYp = ((AbstractC31464luX) KWHzl()).AuCTel;
        VerificationStatus verificationStatusFJNWhG = QfsBiF().fJNWhG();
        int i = verificationStatusFJNWhG == null ? -1 : Application.OLrzqt[verificationStatusFJNWhG.ordinal()];
        if (i == -1) {
            c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dvKsVJ));
            c52794wYp.setEnabled(z);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lDj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.zLjUOn(this.OLrzqt, view);
                }
            });
        } else if (i == 1) {
            c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.RcXXUw));
            c52794wYp.setEnabled(true);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lDm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.AubY(this.EZpvd, view);
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dxcTrN));
            c52794wYp.setEnabled(true);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lDk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29848lCo.wlaJM(this.OLrzqt, view);
                }
            });
        }
        Intrinsics.copydefault(c52794wYp);
        C30018lIw.AEQbTJ(c52794wYp, true);
    }

    public static final void AubY(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.AkhnZx();
    }

    public static final void wlaJM(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.fetchVPNInfo();
    }

    public static final void zLjUOn(C29848lCo c29848lCo, android.view.View view) {
        c29848lCo.iwGUEr();
    }

    public final void iwGUEr() {
        fJNWhG().AhwBna(true);
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        interfaceC47251tmX.OLrzqt(contextRequireContext, viewLifecycleOwner, UnifiedTradeType.CONVERT, false, new Function1() { // from class: o.lCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29848lCo.KWHzl(this.KWHzl, (AccountFrozenStatus) obj);
            }
        });
    }

    public static final Unit KWHzl(C29848lCo c29848lCo, AccountFrozenStatus accountFrozenStatus) {
        Intrinsics.checkNotNullParameter(accountFrozenStatus, "");
        if (Intrinsics.EZpvd(accountFrozenStatus, AccountFrozenStatus.AccountFrozen.KWHzl)) {
            c29848lCo.fJNWhG().AhwBna(false);
        } else {
            if (!Intrinsics.EZpvd(accountFrozenStatus, AccountFrozenStatus.AccountVerified.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            c29848lCo.hDKMBd();
            c29848lCo.fJNWhG().AhwBna(false);
        }
        return Unit.INSTANCE;
    }

    public final void hDKMBd() {
        ConvertViewModel.Activity.ActionBar actionBarFZBcTu = fJNWhG().fZBcTu();
        java.lang.String strAEQbTJ = fJNWhG().AEQbTJ(fJNWhG().fJNWhG());
        C47249tmV c47249tmV = C47249tmV.OLrzqt;
        c47249tmV.copydefault();
        c47249tmV.OLrzqt(actionBarFZBcTu.AEQbTJ());
        c47249tmV.AEQbTJ(actionBarFZBcTu.EZpvd());
        fJNWhG().OLrzqt(QfsBiF().fARcdN());
        InterfaceC47311tne interfaceC47311tne = (InterfaceC47311tne) C43251rlk.copydefault(InterfaceC47311tne.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC47311tne.KWHzl(fragmentActivityRequireActivity, copydefault(strAEQbTJ));
    }

    public final CurrencyPreviewPageParameters copydefault(java.lang.String str) {
        int i;
        java.lang.String symbol;
        java.lang.String isoCode = fJNWhG().fIwbmz().getIsoCode();
        int i2 = Application.EZpvd[fJNWhG().fARcdN().ordinal()];
        if (i2 == 1) {
            i = 0;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        java.lang.Boolean fiatFlag = fJNWhG().fetchVPNInfo().getFiatFlag();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(fiatFlag, bool)) {
            symbol = fJNWhG().fetchVPNInfo().getSign();
        } else if (Intrinsics.EZpvd(fJNWhG().ejfBZ().getFiatFlag(), bool)) {
            symbol = fJNWhG().ejfBZ().getSign();
        } else {
            symbol = fJNWhG().fIwbmz().getSymbol();
        }
        java.lang.String ccy = fJNWhG().fetchVPNInfo().getCcy();
        java.lang.String icon = fJNWhG().fetchVPNInfo().getIcon();
        java.lang.String ccy2 = fJNWhG().ejfBZ().getCcy();
        java.lang.String icon2 = fJNWhG().ejfBZ().getIcon();
        int ccyId = fJNWhG().fetchVPNInfo().getCcyId();
        int ccyId2 = fJNWhG().ejfBZ().getCcyId();
        return new CurrencyPreviewPageParameters(isoCode, null, symbol, "", null, null, false, i, 0, null, null, null, null, null, null, false, new ConvertPreviewParameters(ccy, icon, ccy2, icon2, java.lang.String.valueOf(ccyId), java.lang.String.valueOf(ccyId2), str, ConvertViewModel.getFiatAmountForConvertFrom$default(fJNWhG(), str, false, 2, null), "0", null, Intrinsics.EZpvd(fJNWhG().fetchVPNInfo().getFiatFlag(), bool), Intrinsics.EZpvd(fJNWhG().ejfBZ().getFiatFlag(), bool), fJNWhG().EZpvd(fJNWhG().ejfBZ().getEarnOption()), 512, null), null, null, bool, null, false, 3604338, null);
    }

    public final void AEQbTJ(CurrencyToken currencyToken) {
        ConvertCurrencyBean convertCurrencyBeanOLrzqt = lyC.AEQbTJ.OLrzqt(currencyToken);
        ConvertViewModel convertViewModelFJNWhG = fJNWhG();
        convertViewModelFJNWhG.copydefault(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        if (!Intrinsics.EZpvd((java.lang.Object) convertViewModelFJNWhG.fetchVPNInfo().getCcy(), (java.lang.Object) convertCurrencyBeanOLrzqt.getCcy()) && fJNWhG().giSNqX()) {
            convertViewModelFJNWhG.OLrzqt(convertCurrencyBeanOLrzqt);
        }
        convertViewModelFJNWhG.copydefault(convertViewModelFJNWhG.fetchVPNInfo(), convertViewModelFJNWhG.ejfBZ(), fJNWhG().giSNqX());
    }

    public final boolean ORxRYg() {
        BuySellConvertParameters fieldNames = QfsBiF().getFieldNames();
        return C33129mqd.OLrzqt((java.lang.CharSequence) (fieldNames != null ? fieldNames.copydefault() : null)) && QfsBiF().AEQbTJ(BSCLevel.LEVEL2) && C30327lUg.OLrzqt(PaymentFeatureFlag.SIMPLE_TRADE_L2_TOKEN_CARRYOVER) && (Intrinsics.EZpvd(mHA.OLrzqt.AEQbTJ(fJNWhG().gGvvIC()), java.lang.Boolean.TRUE) || C33129mqd.valueOf(fJNWhG().fetchVPNInfo().getAvailable(), "0"));
    }

    public final void OLrzqt(Function1<? super ConvertCurrencyBean, Unit> function1, Function0<Unit> function0) {
        BuySellConvertParameters fieldNames = QfsBiF().getFieldNames();
        java.lang.Object obj = null;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (fieldNames != null ? fieldNames.copydefault() : null));
        boolean zAEQbTJ = QfsBiF().AEQbTJ(BSCLevel.LEVEL2);
        boolean zAEQbTJ2 = QfsBiF().AEQbTJ(TargetTab.CONVERT);
        java.util.Iterator<T> it = fJNWhG().isConnected().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String ccy = ((ConvertCurrencyBean) next).getCcy();
            BuySellConvertParameters fieldNames2 = QfsBiF().getFieldNames();
            if (Intrinsics.EZpvd((java.lang.Object) ccy, (java.lang.Object) (fieldNames2 != null ? fieldNames2.copydefault() : null))) {
                obj = next;
                break;
            }
        }
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) obj;
        if (C30327lUg.OLrzqt(PaymentFeatureFlag.SIMPLE_TRADE_L2_TOKEN_CARRYOVER) && zOLrzqt && zAEQbTJ && zAEQbTJ2 && convertCurrencyBean != null) {
            function1.invoke(convertCurrencyBean);
        } else {
            function0.invoke();
        }
    }

    public static /* synthetic */ kotlin.Pair getChipPair$default(C29848lCo c29848lCo, double d, ConvertChipAmount convertChipAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return c29848lCo.KWHzl(d, convertChipAmount);
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> KWHzl(double d, ConvertChipAmount convertChipAmount) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new kotlin.Pair<>(java.lang.Double.valueOf(d), C31433ltt.OLrzqt(convertChipAmount, contextRequireContext));
    }

    public static /* synthetic */ void onChipClicked$default(C29848lCo c29848lCo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c29848lCo.OLrzqt(str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            ConvertViewModel convertViewModelFJNWhG = fJNWhG();
            ConvertChipAmount.Activity activity = ConvertChipAmount.Companion;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            convertViewModelFJNWhG.KWHzl(activity.copydefault(contextRequireContext, str), str2);
            return;
        }
        ConvertViewModel convertViewModelFJNWhG2 = fJNWhG();
        ConvertChipAmount.Activity activity2 = ConvertChipAmount.Companion;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        ConvertViewModel.onChipClicked$default(convertViewModelFJNWhG2, activity2.copydefault(contextRequireContext2, str), null, 2, null);
    }

    /* JADX INFO: renamed from: o.lCo$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lCo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C29848lCo EZpvd() {
            return new C29848lCo();
        }
    }

    public final java.util.List<CurrencyToken> EZpvd(java.util.List<ConvertCurrencyBean> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lyC.AEQbTJ.EZpvd((ConvertCurrencyBean) it.next()));
        }
        return arrayList;
    }
}
