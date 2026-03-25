package o;

import android.view.ViewTreeObserver;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerViewModel;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ojd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36897ojd extends AbstractC36898oje {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final int AYXKKw = C35399nuc.Dialog.DcqEDu;
    public nKJ AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C36897ojd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerifyIdentityBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ojf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36897ojd.OLrzqt(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ojj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36897ojd.AhwBna(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.ojd$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ojd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_BANNER_HEIGHT";
        }

        public final C36897ojd OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull IMPageType iMPageType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iMPageType, "");
            C36897ojd c36897ojd = new C36897ojd();
            c36897ojd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str2), C56390yDp.OLrzqt("ARG_FRAGMENT_REQUEST_KEY", str), C56390yDp.OLrzqt("ARG_PAGE_TYPE", iMPageType)));
            return c36897ojd;
        }
    }

    /* JADX DEBUG: Possible override for method o.oje.KWHzl()V */
    public final VerifyIdentityBannerViewModel KWHzl() {
        return (VerifyIdentityBannerViewModel) this.isConnected.getValue();
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String OLrzqt(C36897ojd c36897ojd) {
        android.os.Bundle arguments = c36897ojd.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String AhwBna(C36897ojd c36897ojd) {
        java.lang.String string;
        android.os.Bundle arguments = c36897ojd.getArguments();
        return (arguments == null || (string = arguments.getString("ARG_FRAGMENT_REQUEST_KEY")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nKJ nkjCopydefault = nKJ.copydefault(layoutInflater, viewGroup, false);
        this.AhwBna = nkjCopydefault;
        if (nkjCopydefault != null) {
            return nkjCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OKReminder root;
        OKReminder oKReminder;
        Intrinsics.checkNotNullParameter(view, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Top_KycGuide_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oja
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36897ojd.EZpvd((EventParamsList) obj);
            }
        });
        nKJ nkj = this.AhwBna;
        if (nkj != null && (oKReminder = nkj.AEQbTJ) != null) {
            oKReminder.setStyle(0);
            java.lang.String string = getString(C35399nuc.LoaderManager.DGUQLIekVPG);
            Intrinsics.checkNotNullExpressionValue(string, "");
            oKReminder.setTitle(string);
            oKReminder.setMessage(getString(C35399nuc.LoaderManager.gtCCJH));
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setPrimaryAction(getString(C35399nuc.LoaderManager.getPriority), new Function0() { // from class: o.ojb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36897ojd.AYXKKw(this.AEQbTJ);
                }
            });
        }
        nKJ nkj2 = this.AhwBna;
        if (nkj2 != null && (root = nkj2.getRoot()) != null) {
            android.view.ViewTreeObserver viewTreeObserver = root.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new Application(viewTreeObserver, root, this));
        }
        KWHzl().OLrzqt().observe(getViewLifecycleOwner(), new Observer() { // from class: o.ojh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36897ojd.copydefault(this.OLrzqt, (C36565odP) obj);
            }
        });
        KWHzl().EZpvd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36897ojd.KWHzl(this.AEQbTJ, (VerifyIdentityBannerViewModel.ActionBar) obj);
            }
        }));
        VerifyIdentityBannerViewModel verifyIdentityBannerViewModelKWHzl = KWHzl();
        java.lang.String strGEmmrt = gEmmrt();
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_PAGE_TYPE") : null;
        verifyIdentityBannerViewModelKWHzl.OLrzqt(strGEmmrt, serializable instanceof IMPageType ? (IMPageType) serializable : null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "IMChat_Top_KycGuide_View", "", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C36897ojd c36897ojd) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Top_KycGuide_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ojc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36897ojd.OLrzqt((EventParamsList) obj);
            }
        });
        c36897ojd.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "IMChat_Top_KycGuide_Click", "", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C36897ojd c36897ojd, C36565odP c36565odP) {
        OKReminder oKReminder;
        pUU.KWHzl(c36897ojd.getTAG(), "verify identity banner update: " + c36565odP);
        nKJ nkj = c36897ojd.AhwBna;
        if (nkj != null && (oKReminder = nkj.AEQbTJ) != null) {
            android.view.ViewTreeObserver viewTreeObserver = oKReminder.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator(viewTreeObserver, oKReminder, c36897ojd));
            oKReminder.setVisibility(c36565odP != null ? 0 : 8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36897ojd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C36897ojd c36897ojd, VerifyIdentityBannerViewModel.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (!Intrinsics.EZpvd(actionBar, VerifyIdentityBannerViewModel.ActionBar.StateListAnimator.copydefault)) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentKt.setFragmentResult(c36897ojd, "REQUEST_KEY_KYC_PASSED", BundleKt.bundleOf());
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        rTU.Application.checkAndRestrictsDistributary$default(rtu, fragmentActivityRequireActivity, new Function1() { // from class: o.oji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36897ojd.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }, java.lang.Boolean.TRUE, null, new Function1() { // from class: o.ojk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36897ojd.AEQbTJ((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.ojo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36897ojd.OLrzqt(this.copydefault, (ResultBackStatus) obj);
            }
        }, 8, null);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        pUU.KWHzl("VerifyIdentityBannerFragment", "KYC flow error: " + str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ojd$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C36897ojd AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.ViewTreeObserver KWHzl;

        public Application(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36897ojd c36897ojd) {
            this.KWHzl = viewTreeObserver;
            this.EZpvd = view;
            this.AEQbTJ = c36897ojd;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.KWHzl.isAlive() ? this.KWHzl : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.AEQbTJ.djBIcL();
        }
    }

    /* JADX INFO: renamed from: o.ojd$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.ViewTreeObserver AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C36897ojd OLrzqt;

        public StateListAnimator(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36897ojd c36897ojd) {
            this.AEQbTJ = viewTreeObserver;
            this.EZpvd = view;
            this.OLrzqt = c36897ojd;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.AEQbTJ.isAlive() ? this.AEQbTJ : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.OLrzqt.djBIcL();
        }
    }

    public static final Unit EZpvd(C36897ojd c36897ojd, boolean z) {
        if (!z) {
            c36897ojd.KWHzl().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36897ojd c36897ojd, ResultBackStatus resultBackStatus) {
        if (resultBackStatus == ResultBackStatus.Success) {
            c36897ojd.KWHzl().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    private final int OLrzqt(android.view.View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        OKReminder root;
        nKJ nkj = this.AhwBna;
        if (nkj == null || (root = nkj.getRoot()) == null) {
            return;
        }
        int iOLrzqt = OLrzqt(root);
        if (root.getVisibility() != 0) {
            iOLrzqt = 0;
        }
        FragmentKt.setFragmentResult(this, Companion.EZpvd(AYXKKw()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_BANNER_HEIGHT", java.lang.Integer.valueOf(iOLrzqt))));
    }
}
