package com.okinc.business.defi.wallet.home;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.MoreFunctionInfo;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.business.defi.wallet.home.DefiHomeContainerFragment;
import com.okinc.business.defi.wallet.home.WalletStateChecker;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC12782ctV;
import o.AbstractC32998moE;
import o.AbstractC58260yxt;
import o.ActivityC18621flp;
import o.C10604brb;
import o.C10854bwM;
import o.C10856bwO;
import o.C10948byA;
import o.C10954byG;
import o.C11607cUn;
import o.C12827cuN;
import o.C13754dXa;
import o.C14390dkZ;
import o.C14494dmX;
import o.C14728dqt;
import o.C15523eLm;
import o.C15572eNh;
import o.C16489ekr;
import o.C16588emk;
import o.C18060fbK;
import o.C18072fbW;
import o.C18141fcm;
import o.C32866mlf;
import o.C33070mpX;
import o.C33570myu;
import o.C43251rlk;
import o.C52761wXj;
import o.C5335Nt;
import o.C55230xfy;
import o.C55296xhK;
import o.C55298xhM;
import o.C56391yDq;
import o.C56444yFp;
import o.C56524yIo;
import o.C9925bel;
import o.InterfaceC18129fca;
import o.InterfaceC33171mrS;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.dTI;
import o.dTK;
import o.eLT;
import o.eUI;
import o.fDF;
import o.pUU;
import o.rVN;
import o.rXQ;
import o.rXT;
import o.rXZ;
import o.wYC;
import o.xXN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerFragment extends AbstractC32998moE implements View.OnClickListener, C18141fcm.StateListAnimator {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static boolean copydefault;
    public InterfaceC58217yxC AYXKKw;
    public C16588emk AhwBna;
    public Job AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public C9925bel EZpvd;
    public WalletStateChecker.WalletState fJNWhG;
    public String isConnected;
    public final InterfaceC56387yDm values;
    public final int gEmmrt = C13754dXa.TaskDescription.cBPFI;
    public final int KWHzl = C52761wXj.TaskDescription.createSocket;
    public ContainerState AEQbTJ = ContainerState.INITIAL;
    public Object valueOf = new Object();
    public long fetchVPNInfo = Long.MIN_VALUE;
    public final Observer<AbstractC12782ctV> djBIcL = new Observer() { // from class: o.eMR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            DefiHomeContainerFragment.OLrzqt(this.AEQbTJ, (AbstractC12782ctV) obj);
        }
    };

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletStateChecker.WalletState.values().length];
            try {
                iArr[WalletStateChecker.WalletState.ZERO_ASSETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStateChecker.WalletState.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStateChecker.WalletState.ONBOARDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStateChecker.WalletState.NOT_BACKED_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[WalletStatus.values().length];
            try {
                iArr2[WalletStatus.DemoWallet.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletStatus.RealWallets.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr2;
            int[] iArr3 = new int[ContainerState.values().length];
            try {
                iArr3[ContainerState.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ContainerState.WALLET_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ContainerState.WALLET_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            EZpvd = iArr3;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public DefiHomeContainerFragment() {
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DefiHomeContainerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$3
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(eUI.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$6
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18060fbK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$special$$inlined$activityViewModels$default$9
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
    }

    public final DefiHomeContainerViewModel AhwBna() {
        return (DefiHomeContainerViewModel) this.values.getValue();
    }

    public final eUI djBIcL() {
        return (eUI) this.AuCTel.getValue();
    }

    public final C18060fbK KWHzl() {
        return (C18060fbK) this.DbNXlk.getValue();
    }

    public final fDF gEmmrt() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(fDF.class.getName());
        if (fragmentFindFragmentByTag instanceof fDF) {
            return (fDF) fragmentFindFragmentByTag;
        }
        return null;
    }

    public static final void OLrzqt(DefiHomeContainerFragment defiHomeContainerFragment, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            return;
        }
        WalletStateChecker.WalletState walletStateCopydefault = WalletStateChecker.AEQbTJ.copydefault(defiHomeContainerFragment.AhwBna(), defiHomeContainerFragment.djBIcL());
        if (walletStateCopydefault == defiHomeContainerFragment.fJNWhG && Intrinsics.EZpvd((Object) defiHomeContainerFragment.djBIcL().DbNXlk(), (Object) abstractC12782ctV.DbNXlk())) {
            return;
        }
        defiHomeContainerFragment.fJNWhG = walletStateCopydefault;
        defiHomeContainerFragment.copydefault(abstractC12782ctV);
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        C16489ekr c16489ekr;
        ShapeableImageView shapeableImageView;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null || (shapeableImageView = c16489ekr.copydefault) == null) {
            return;
        }
        WalletStateChecker.WalletState walletState = this.fJNWhG;
        int i = walletState == null ? -1 : ActionBar.OLrzqt[walletState.ordinal()];
        if (i == 1 || i == 2) {
            shapeableImageView.setVisibility(0);
            int size = abstractC12782ctV.OFhtUX().size();
            if (size > 1) {
                KWHzl(abstractC12782ctV, "setTopRightNetworkIcon");
                return;
            }
            if (size == 1) {
                C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
                C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(Long.valueOf(chainAddress != null ? chainAddress.getCoinId() : 0L));
                this.isConnected = c10854bwMKWHzl != null ? c10854bwMKWHzl.copydefault() : null;
                this.fetchVPNInfo = c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : Long.MIN_VALUE;
                AEQbTJ(c10854bwMKWHzl);
                return;
            }
            return;
        }
        shapeableImageView.setVisibility(8);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        loadSelectIdData$default(this, null, "onResume", 1, null);
    }

    public static /* synthetic */ void loadSelectIdData$default(DefiHomeContainerFragment defiHomeContainerFragment, AbstractC12782ctV abstractC12782ctV, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC12782ctV = null;
        }
        defiHomeContainerFragment.KWHzl(abstractC12782ctV, str);
    }

    public final void KWHzl(AbstractC12782ctV abstractC12782ctV, String str) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DefiHomeContainerFragment$loadSelectIdData$1(abstractC12782ctV, this, null));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ DefiHomeContainerFragment AEQbTJ;
        public final /* synthetic */ C55230xfy EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, DefiHomeContainerFragment defiHomeContainerFragment, C55230xfy c55230xfy, String str) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = defiHomeContainerFragment;
            this.EZpvd = c55230xfy;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.fbW.pushSearchContainer$default(o.fca, o.xfy, java.lang.String, java.lang.String, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC18129fca interfaceC18129fcaEZpvd = C18072fbW.EZpvd(this.AEQbTJ);
                if (interfaceC18129fcaEZpvd != null) {
                    C18072fbW.pushSearchContainer$default(interfaceC18129fcaEZpvd, this.EZpvd, this.KWHzl, null, 4, null);
                }
            }
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void copydefault(boolean z) {
            DefiHomeContainerFragment.copydefault = z;
        }

        public final DefiHomeContainerFragment KWHzl(boolean z) {
            DefiHomeContainerFragment defiHomeContainerFragment = new DefiHomeContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show", z);
            defiHomeContainerFragment.setArguments(bundle);
            return defiHomeContainerFragment;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AhwBna = C16588emk.AEQbTJ(getLayoutInflater(), viewGroup, false);
        this.AYXKKw = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).djBIcL();
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk != null) {
            return c16588emk.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        EZpvd(context);
        C12827cuN.Application application = C12827cuN.Companion;
        if (C12827cuN.Application.getInstance$default(application, null, 1, null).fetchVPNInfo() != WalletStatus.DemoWallet && C12827cuN.Application.getInstance$default(application, null, 1, null).fetchVPNInfo() == WalletStatus.NoWallet) {
            AuCTel();
            KWHzl(ContainerState.INITIAL);
        } else {
            fIwbmz();
        }
        values();
        AhwBna().isConnected();
        AhwBna().AhwBna().observe(this, new Application(new Function1() { // from class: o.eNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerFragment.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        djBIcL().fARcdN().observe(getViewLifecycleOwner(), this.djBIcL);
        AhwBna().gEmmrt().observe(this, new Application(new Function1() { // from class: o.eNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerFragment.AEQbTJ(this.OLrzqt, (WalletStatus) obj);
            }
        }));
        RxBus.KWHzl(xXN.class, new String[0]).subscribe(new AnonymousClass3(this.valueOf));
        copydefault();
        AkhnZx();
    }

    public static final Unit AEQbTJ(DefiHomeContainerFragment defiHomeContainerFragment, Boolean bool) {
        C16489ekr c16489ekr;
        ConstraintLayout constraintLayout;
        FrameLayout frameLayout;
        if (bool == null) {
            return Unit.INSTANCE;
        }
        if (bool.booleanValue()) {
            C16588emk c16588emk = defiHomeContainerFragment.AhwBna;
            if (c16588emk != null && (frameLayout = c16588emk.copydefault) != null) {
                frameLayout.bringToFront();
            }
        } else {
            C16588emk c16588emk2 = defiHomeContainerFragment.AhwBna;
            if (c16588emk2 != null && (c16489ekr = c16588emk2.OLrzqt) != null && (constraintLayout = c16489ekr.AYXKKw) != null) {
                constraintLayout.bringToFront();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final DefiHomeContainerFragment defiHomeContainerFragment, WalletStatus walletStatus) {
        if (walletStatus != WalletStatus.NoWallet && C14728dqt.KWHzl.KWHzl()) {
            defiHomeContainerFragment.AhwBna().AEQbTJ();
        }
        int i = walletStatus == null ? -1 : ActionBar.KWHzl[walletStatus.ordinal()];
        if (i == 1) {
            defiHomeContainerFragment.fIwbmz();
            wYC wycOLrzqt = defiHomeContainerFragment.OLrzqt();
            if (wycOLrzqt != null) {
                wycOLrzqt.setVisibility(8);
            }
            AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(C12827cuN.deleteDemoWallet$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, 1, null));
            final Function1 function1 = new Function1() { // from class: o.eNe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerFragment.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eNg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DefiHomeContainerFragment.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eMS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerFragment.OLrzqt((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eMW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DefiHomeContainerFragment.OLrzqt(function12, obj);
                }
            });
        } else if (i == 2) {
            defiHomeContainerFragment.fIwbmz();
            wYC wycOLrzqt2 = defiHomeContainerFragment.OLrzqt();
            if (wycOLrzqt2 != null) {
                wycOLrzqt2.setVisibility(8);
            }
            RxBus.AEQbTJ(new C14390dkZ());
            C15523eLm.KWHzl.AYXKKw();
            FragmentManager childFragmentManager = defiHomeContainerFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, C15572eNh.class, null, "DefiHomeFragmentNew"), "");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            rVN.reportFullyDrawn$default((Fragment) defiHomeContainerFragment, true, (String) null, 2, (Object) null);
        } else {
            defiHomeContainerFragment.AuCTel();
            wYC wycOLrzqt3 = defiHomeContainerFragment.OLrzqt();
            if (wycOLrzqt3 != null) {
                wycOLrzqt3.setVisibility(0);
            }
            defiHomeContainerFragment.KWHzl(ContainerState.WALLET_DELETE);
            fDF fdfGEmmrt = defiHomeContainerFragment.gEmmrt();
            if (fdfGEmmrt != null) {
                fdfGEmmrt.dismissAllowingStateLoss();
            }
            dTI dti = (dTI) C43251rlk.OLrzqt(dTI.class);
            if (dti != null) {
                dti.copydefault(new dTK.Fragment(""));
            }
            FragmentManager childFragmentManager2 = defiHomeContainerFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager2.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2.replace(C13754dXa.ActionBar.XW, C18141fcm.class, null, "DefiOnboardingFragment"), "");
            fragmentTransactionBeginTransaction2.commitAllowingStateLoss();
            rVN.reportFullyDrawn$default((Fragment) defiHomeContainerFragment, true, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(DefiHomeContainerFragment defiHomeContainerFragment, Integer num) {
        defiHomeContainerFragment.AhwBna().values();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Throwable th) {
        Intrinsics.copydefault(th);
        pUU.KWHzl(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$initView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends RxBus.EventCallback<xXN> {
        public AnonymousClass3(Object obj) {
            super(obj);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.cUn.subscribeOnIO$default(o.yxt, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):o.yxC */
        /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
        @Override // com.okinc.rxutils.RxBus.EventCallback
        public void onEvent(xXN xxn) {
            Intrinsics.checkNotNullParameter(xxn, "");
            if (xxn.OLrzqt()) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                final DefiHomeContainerFragment defiHomeContainerFragment = DefiHomeContainerFragment.this;
                C11607cUn.subscribeOnIO$default(abstractC58260yxtCopydefault, (Function1) null, new Function1() { // from class: o.eNk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DefiHomeContainerFragment.AnonymousClass3.onEvent$lambda$0(defiHomeContainerFragment, (AbstractC12782ctV) obj);
                    }
                }, 1, (Object) null);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DefiHomeContainerFragment.this), null, null, new DefiHomeContainerFragment$initView$3$onEvent$2(DefiHomeContainerFragment.this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onEvent$lambda$0(DefiHomeContainerFragment defiHomeContainerFragment, AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            defiHomeContainerFragment.copydefault(abstractC12782ctV);
            return Unit.INSTANCE;
        }
    }

    @Override // o.C18141fcm.StateListAnimator
    public wYC OLrzqt() {
        C16489ekr c16489ekr;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null) {
            return null;
        }
        return c16489ekr.EZpvd;
    }

    public final void EZpvd(Context context) {
        C16489ekr c16489ekr;
        ShapeableImageView shapeableImageView;
        C16489ekr c16489ekr2;
        AppCompatImageView appCompatImageView;
        C16489ekr c16489ekr3;
        ConstraintLayout constraintLayoutKWHzl;
        C16489ekr c16489ekr4;
        ConstraintLayout constraintLayout;
        C16489ekr c16489ekr5;
        C55230xfy c55230xfy;
        C16489ekr c16489ekr6;
        C55230xfy c55230xfy2;
        if (C14728dqt.KWHzl.KWHzl()) {
            C16588emk c16588emk = this.AhwBna;
            if (c16588emk != null && (c16489ekr6 = c16588emk.OLrzqt) != null && (c55230xfy2 = c16489ekr6.djBIcL) != null) {
                c55230xfy2.setTransitionName("wallet_search_container_oksearchbar_wallet");
                c55230xfy2.setOnClickListener(new StateListAnimator(c55230xfy2, 1000L, this, c55230xfy2, "wallet_search_container_oksearchbar_wallet"));
            }
            C16588emk c16588emk2 = this.AhwBna;
            if (c16588emk2 != null && (c16489ekr5 = c16588emk2.OLrzqt) != null && (c55230xfy = c16489ekr5.djBIcL) != null) {
                c55230xfy.setOnSearchBarClick(new Function0() { // from class: o.eMU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DefiHomeContainerFragment.AEQbTJ();
                    }
                });
            }
        }
        C16588emk c16588emk3 = this.AhwBna;
        if (c16588emk3 != null && (c16489ekr4 = c16588emk3.OLrzqt) != null && (constraintLayout = c16489ekr4.AYXKKw) != null) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + C33570myu.AEQbTJ(context), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.height = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.KWHzl) + C33570myu.AEQbTJ(context);
            constraintLayout.setLayoutParams(layoutParams);
        }
        C16588emk c16588emk4 = this.AhwBna;
        if (c16588emk4 != null && (c16489ekr3 = c16588emk4.OLrzqt) != null && (constraintLayoutKWHzl = c16489ekr3.getRoot()) != null) {
            constraintLayoutKWHzl.setBackgroundColor(ContextCompat.getColor(context, C52761wXj.Activity.copydefault));
        }
        C16588emk c16588emk5 = this.AhwBna;
        if (c16588emk5 != null && (c16489ekr2 = c16588emk5.OLrzqt) != null && (appCompatImageView = c16489ekr2.AhwBna) != null) {
            appCompatImageView.setOnClickListener(this);
        }
        C16588emk c16588emk6 = this.AhwBna;
        if (c16588emk6 == null || (c16489ekr = c16588emk6.OLrzqt) == null || (shapeableImageView = c16489ekr.copydefault) == null) {
            return;
        }
        shapeableImageView.setOnClickListener(this);
    }

    public static final Unit AEQbTJ() {
        C32866mlf.onEvent$default("HomePage_GlobalSearch_InputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.eNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerFragment.OLrzqt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("source_id", "home", true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final ArrayList<Long> arrayList, final boolean z) {
        Object objM7377constructorimpl;
        FrameLayout frameLayoutAEQbTJ;
        pUU.copydefault(getTAG(), "showUpgradeChainDialog isHomepageShow = " + copydefault);
        if (!copydefault) {
            C16588emk c16588emk = this.AhwBna;
            if (c16588emk == null || (frameLayoutAEQbTJ = c16588emk.getRoot()) == null) {
                return;
            }
            frameLayoutAEQbTJ.postDelayed(new Runnable() { // from class: o.eMX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    DefiHomeContainerFragment.copydefault(this.EZpvd, arrayList, z);
                }
            }, 500L);
            return;
        }
        try {
            Result.Application application = Result.Companion;
            C9925bel c9925bel = this.EZpvd;
            if (c9925bel == null) {
                C9925bel c9925belCopydefault = C9925bel.Companion.copydefault(arrayList, z);
                this.EZpvd = c9925belCopydefault;
                if (c9925belCopydefault != null) {
                    c9925belCopydefault.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.eMZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            DefiHomeContainerFragment.copydefault(this.OLrzqt, dialogInterface);
                        }
                    });
                }
                C9925bel c9925bel2 = this.EZpvd;
                if (c9925bel2 != null) {
                    c9925bel2.showNow(getChildFragmentManager(), "ChainAddressUpgradeDialogFragment");
                }
            } else if (c9925bel != null) {
                c9925bel.AEQbTJ(arrayList, z);
            }
            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(getTAG(), "showUpgradeChainDialog error = " + thM7380exceptionOrNullimpl.getMessage());
        }
        Result.m7376boximpl(objM7377constructorimpl);
    }

    public static final void copydefault(DefiHomeContainerFragment defiHomeContainerFragment, DialogInterface dialogInterface) {
        defiHomeContainerFragment.EZpvd = null;
    }

    public static final void copydefault(DefiHomeContainerFragment defiHomeContainerFragment, ArrayList arrayList, boolean z) {
        defiHomeContainerFragment.OLrzqt((ArrayList<Long>) arrayList, z);
    }

    public final void fIwbmz() {
        C16489ekr c16489ekr;
        C55230xfy c55230xfy;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk != null && (c16489ekr = c16588emk.OLrzqt) != null && (c55230xfy = c16489ekr.djBIcL) != null) {
            c55230xfy.setVisibility(C14728dqt.KWHzl.KWHzl() ? 0 : 8);
        }
        C16588emk c16588emk2 = this.AhwBna;
        if (c16588emk2 != null && c16588emk2.OLrzqt != null) {
            KWHzl(true);
        }
        AYXKKw();
        KWHzl(ContainerState.WALLET_CREATE);
    }

    public final void AuCTel() {
        C16489ekr c16489ekr;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk != null && (c16489ekr = c16588emk.OLrzqt) != null) {
            C55230xfy c55230xfy = c16489ekr.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
            c55230xfy.setVisibility(8);
            KWHzl(false);
            KWHzl(new rXZ(0, 0));
            c16489ekr.copydefault.setVisibility(8);
        }
        Job job = this.AkhnZx;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        SubHelper.AEQbTJ(this.valueOf);
    }

    public final void KWHzl(boolean z) {
        C16489ekr c16489ekr;
        wYC wyc;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null || (wyc = c16489ekr.OLrzqt) == null) {
            return;
        }
        wyc.setVisibility(z ? 0 : 8);
    }

    public final void KWHzl(rXZ rxz) {
        C16489ekr c16489ekr;
        TextView textView;
        C16489ekr c16489ekr2;
        TextView textView2;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk != null && (c16489ekr2 = c16588emk.OLrzqt) != null && (textView2 = c16489ekr2.AEQbTJ) != null) {
            textView2.setVisibility(rxz.KWHzl() ? 0 : 8);
        }
        C16588emk c16588emk2 = this.AhwBna;
        if (c16588emk2 == null || (c16489ekr = c16588emk2.OLrzqt) == null || (textView = c16489ekr.AEQbTJ) == null) {
            return;
        }
        textView.setText(rxz.OLrzqt());
    }

    public final void values() {
        C16489ekr c16489ekr;
        if (C14728dqt.KWHzl.KWHzl()) {
            return;
        }
        pUU.KWHzl(getTAG(), "initSwitchTradeOrDefiMode");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        pUU.KWHzl(getTAG(), "initSwitchTradeOrDefiMode - getting AppModeSwitchView from OKAppService");
        Context context = getContext();
        if (context == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        View viewCopydefault = interfaceC33171mrS.copydefault(context, childFragmentManager, this, AppModeSwitchViewSource.Web3Home, new Function2() { // from class: o.eNf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DefiHomeContainerFragment.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
        pUU.KWHzl(getTAG(), "initSwitchTradeOrDefiMode - got AppModeSwitchView from OKAppService");
        C16588emk c16588emk = this.AhwBna;
        ConstraintLayout constraintLayoutKWHzl = (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null) ? null : c16489ekr.getRoot();
        pUU.KWHzl(getTAG(), "initSwitchTradeOrDefiMode - is layout null: " + (constraintLayoutKWHzl == null));
        if (constraintLayoutKWHzl != null) {
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.bottomToBottom = 0;
            layoutParams.endToEnd = 0;
            layoutParams.startToStart = 0;
            layoutParams.topToTop = 0;
            pUU.KWHzl(getTAG(), "initSwitchTradeOrDefiMode - AppModeSwitchView layout params set");
            constraintLayoutKWHzl.addView(viewCopydefault, layoutParams);
            pUU.KWHzl(getTAG(), "initSwitchTradeOrDefiMode - AppModeSwitchView added");
        }
    }

    public static final Unit EZpvd(DefiHomeContainerFragment defiHomeContainerFragment, int i, final int i2) {
        pUU.KWHzl(defiHomeContainerFragment.getTAG(), "initSwitchTradeOrDefiMode - got AppModeSwitchView onValueChange event");
        C32866mlf.onEvent$default("Web3HomePage_Toggle_SwitchToExchange_Click", (TrackChannel[]) null, new Function1() { // from class: o.eNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerFragment.AEQbTJ(i2, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        pUU.KWHzl(defiHomeContainerFragment.getTAG(), "initSwitchTradeOrDefiMode - AppModeSwitchView tracking event sent");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(int i, EventParamsList eventParamsList) {
        String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("terminal", "android", true);
        if (i == 0) {
            str = "unknown";
        } else if (i == 1) {
            str = "pro";
        } else if (i == 2) {
            str = "lite";
        } else if (i == 3) {
            str = "wallet";
        } else if (i != 5) {
            str = "exchange";
        }
        eventParamsList.put("web3_wallet_switch_mode_exchange", str, true);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        valueOf();
        rXQ rxq = (rXQ) C43251rlk.OLrzqt(rXQ.class);
        Flow<rXZ> flowEZpvd = rxq != null ? rxq.EZpvd() : null;
        if (flowEZpvd != null) {
            Job job = this.AkhnZx;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.AkhnZx = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeContainerFragment$initIMHomeEntrance$1(this, flowEZpvd, null), 3, null);
        }
    }

    public final void fetchVPNInfo() {
        rXQ rxq = (rXQ) C43251rlk.OLrzqt(rXQ.class);
        if (rxq != null) {
            rxq.KWHzl();
        }
    }

    public final void valueOf() {
        C16489ekr c16489ekr;
        wYC wyc;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null || (wyc = c16489ekr.OLrzqt) == null) {
            return;
        }
        KWHzl(true);
        wyc.setOnClickListener(new View.OnClickListener() { // from class: o.eMY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DefiHomeContainerFragment.KWHzl(this.AEQbTJ, view);
            }
        });
    }

    public static final void KWHzl(DefiHomeContainerFragment defiHomeContainerFragment, View view) {
        defiHomeContainerFragment.DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        SubHelper.AEQbTJ(this.valueOf);
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        Job job = this.AkhnZx;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void copydefault(rXZ rxz) {
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || c16588emk.OLrzqt == null) {
            return;
        }
        KWHzl(true);
        KWHzl(rxz);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C16489ekr c16489ekr;
        AhwBna().values();
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null) {
            return;
        }
        wYC wyc = c16489ekr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        if (wyc.getVisibility() == 0) {
            fetchVPNInfo();
        }
    }

    public final void copydefault() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeContainerFragment$checkForDexBindReferral$1(this, null), 3, null);
    }

    public final void AkhnZx() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeContainerFragment$observeServiceToolbarVisibility$1(this, null), 3, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.QhsCdE;
        if (numValueOf != null && numValueOf.intValue() == i) {
            isConnected();
            return;
        }
        int i2 = C13754dXa.ActionBar.QzqeNH;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            C32866mlf.onEvent$default("app_home_asset_networkFilter_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            eLT.TaskDescription taskDescription = eLT.Companion;
            Context context = getContext();
            if (context == null) {
                return;
            }
            taskDescription.copydefault(context, this.fetchVPNInfo, true);
        }
    }

    public final void isConnected() {
        MoreFunctionInfo moreFunctionInfo = null;
        if (AhwBna().gEmmrt().getValue() == WalletStatus.RealWallets) {
            try {
                Iterator<T> it = KWHzl().AEQbTJ(djBIcL().fARcdN().getValue()).iterator();
                while (it.hasNext()) {
                    List<MoreFunctionInfo> homeModules = ((MoreFunctionModuleInfo) it.next()).getHomeModules();
                    if (homeModules != null) {
                        for (MoreFunctionInfo moreFunctionInfo2 : homeModules) {
                            if (moreFunctionInfo2.getId() == 104) {
                                moreFunctionInfo = moreFunctionInfo2;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C10856bwO.copydefault(getTAG(), 0, "navigate to mine error " + e);
            }
        }
        C10856bwO.copydefault(getTAG(), 0, "navigateToWalletMineActivity: " + (getActivity() != null));
        ActivityC18621flp.Activity activity = ActivityC18621flp.Companion;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            return;
        }
        activity.copydefault(activity2, 1, moreFunctionInfo);
        copydefault("header_more", "user_setting", "header_more", "header_more");
    }

    public final void DbNXlk() {
        C32866mlf.onEvent$default("app_metax_message_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        rXT rxt = (rXT) C43251rlk.OLrzqt(rXT.class);
        if (rxt != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            rxt.copydefault(fragmentActivityRequireActivity, "defi");
        }
        trackButtonClickEvent$default(this, null, "message", "header_information", "header_information", 1, null);
    }

    public static /* synthetic */ void setMultiNetworkIcon$default(DefiHomeContainerFragment defiHomeContainerFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        defiHomeContainerFragment.copydefault(str);
    }

    public final void copydefault(String str) {
        C16489ekr c16489ekr;
        ShapeableImageView shapeableImageView;
        C5335Nt<Drawable> c5335NtAEQbTJ;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null || (shapeableImageView = c16489ekr.copydefault) == null) {
            return;
        }
        shapeableImageView.setClickable(true);
        if (str != null) {
            c5335NtAEQbTJ = Glide.KWHzl(shapeableImageView).EZpvd(str);
        } else {
            c5335NtAEQbTJ = Glide.KWHzl(shapeableImageView).AEQbTJ(C33070mpX.KWHzl(this.KWHzl));
        }
        Intrinsics.copydefault(c5335NtAEQbTJ);
        c5335NtAEQbTJ.KWHzl(C52761wXj.TaskDescription.fERRXa).AEQbTJ(C52761wXj.TaskDescription.fERRXa).EZpvd((ImageView) shapeableImageView);
    }

    public final void AEQbTJ(C10854bwM c10854bwM) {
        C16489ekr c16489ekr;
        ShapeableImageView shapeableImageView;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (c16489ekr = c16588emk.OLrzqt) == null || (shapeableImageView = c16489ekr.copydefault) == null) {
            return;
        }
        shapeableImageView.setClickable(false);
        Glide.KWHzl(shapeableImageView).EZpvd(c10854bwM != null ? c10854bwM.copydefault() : null).KWHzl(C52761wXj.TaskDescription.fERRXa).AEQbTJ(C52761wXj.TaskDescription.fERRXa).copydefault(C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null)).EZpvd((ImageView) shapeableImageView);
    }

    public static /* synthetic */ void trackButtonClickEvent$default(DefiHomeContainerFragment defiHomeContainerFragment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        defiHomeContainerFragment.copydefault(str, str2, str3, str4);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dmX.trackNewWalletMethodButtonClick$default(o.dmX, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public final void copydefault(String str, String str2, String str3, String str4) {
        int i = ActionBar.OLrzqt[WalletStateChecker.AEQbTJ.copydefault(AhwBna(), djBIcL()).ordinal()];
        if (i == 1) {
            if (str4 != null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeContainerFragment$trackButtonClickEvent$4$1(str4, null), 3, null);
                return;
            }
            return;
        }
        if (i == 2) {
            if (str2 != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeContainerFragment$trackButtonClickEvent$2$1(str2, null), 3, null);
            }
        } else if (i == 3) {
            if (str != null) {
                C14494dmX.trackNewWalletMethodButtonClick$default(C14494dmX.KWHzl, str, null, 2, null);
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (str3 != null) {
                C14494dmX.KWHzl.EZpvd(str3);
            }
        }
    }

    public final void KWHzl(ContainerState containerState) {
        FrameLayout frameLayout;
        int iOLrzqt;
        this.AEQbTJ = containerState;
        C16588emk c16588emk = this.AhwBna;
        if (c16588emk == null || (frameLayout = c16588emk.copydefault) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = ActionBar.EZpvd[containerState.ordinal()];
            if (i == 1) {
                iOLrzqt = 0;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.KWHzl) + C33570myu.AEQbTJ(getContext());
            }
            marginLayoutParams.topMargin = iOLrzqt;
            frameLayout.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ContainerState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ContainerState[] $VALUES;
        public static final ContainerState INITIAL = new ContainerState("INITIAL", 0);
        public static final ContainerState WALLET_CREATE = new ContainerState("WALLET_CREATE", 1);
        public static final ContainerState WALLET_DELETE = new ContainerState("WALLET_DELETE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ContainerState[] $values() {
            return new ContainerState[]{INITIAL, WALLET_CREATE, WALLET_DELETE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ContainerState> getEntries() {
            return $ENTRIES;
        }

        private ContainerState(String str, int i) {
        }

        static {
            ContainerState[] containerStateArr$values = $values();
            $VALUES = containerStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(containerStateArr$values);
        }

        public static ContainerState valueOf(String str) {
            return (ContainerState) Enum.valueOf(ContainerState.class, str);
        }

        public static ContainerState[] values() {
            return (ContainerState[]) $VALUES.clone();
        }
    }
}
