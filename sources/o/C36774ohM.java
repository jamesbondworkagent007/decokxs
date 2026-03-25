package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$initView$3;
import com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerViewModel;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ohM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36774ohM extends AbstractC36770ohI {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public C33910nKj AhwBna;
    public final int gEmmrt = C35399nuc.Dialog.USBtdM;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.ohM$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.ohM$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BillingCyclePaymentStatus.values().length];
            try {
                iArr[BillingCyclePaymentStatus.OVERDUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BillingCyclePaymentStatus.DUE_SOON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public C36774ohM() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaidGroupStatusBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ohL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36774ohM.KWHzl(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ohN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36774ohM.AYXKKw(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.ohM$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ohM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_BANNER_HEIGHT";
        }

        public final C36774ohM OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull IMPageType iMPageType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iMPageType, "");
            C36774ohM c36774ohM = new C36774ohM();
            c36774ohM.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str2), C56390yDp.OLrzqt("ARG_FRAGMENT_REQUEST_KEY", str), C56390yDp.OLrzqt("ARG_PAGE_TYPE", iMPageType)));
            return c36774ohM;
        }
    }

    /* JADX DEBUG: Possible override for method o.ohI.EZpvd()V */
    public final PaidGroupStatusBannerViewModel EZpvd() {
        return (PaidGroupStatusBannerViewModel) this.isConnected.getValue();
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String KWHzl(C36774ohM c36774ohM) {
        android.os.Bundle arguments = c36774ohM.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String AYXKKw(C36774ohM c36774ohM) {
        java.lang.String string;
        android.os.Bundle arguments = c36774ohM.getArguments();
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
        C33910nKj c33910nKjOLrzqt = C33910nKj.OLrzqt(layoutInflater, viewGroup, false);
        this.AhwBna = c33910nKjOLrzqt;
        if (c33910nKjOLrzqt != null) {
            return c33910nKjOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OKAlertBanner root;
        Intrinsics.checkNotNullParameter(view, "");
        C33910nKj c33910nKj = this.AhwBna;
        if (c33910nKj != null && (root = c33910nKj.getRoot()) != null) {
            android.view.ViewTreeObserver viewTreeObserver = root.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator(viewTreeObserver, root, this));
        }
        EZpvd().EZpvd().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ohK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36774ohM.AEQbTJ(this.OLrzqt, (GroupInfo) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PaidGroupStatusBannerFragment$initView$3(this, null), 3, null);
        PaidGroupStatusBannerViewModel paidGroupStatusBannerViewModelEZpvd = EZpvd();
        java.lang.String strGEmmrt = gEmmrt();
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_PAGE_TYPE") : null;
        paidGroupStatusBannerViewModelEZpvd.AEQbTJ(strGEmmrt, serializable instanceof IMPageType ? (IMPageType) serializable : null);
    }

    public static final Unit AEQbTJ(C36774ohM c36774ohM, GroupInfo groupInfo) {
        OKAlertBanner oKAlertBanner;
        PaidGroupInfo paidGroupInfo;
        PaidGroupMemberStatus paidGroupMemberStatus;
        BillingCyclePaymentStatus billingCyclePaymentStatus = (groupInfo == null || (paidGroupInfo = groupInfo.getPaidGroupInfo()) == null || (paidGroupMemberStatus = paidGroupInfo.getPaidGroupMemberStatus()) == null) ? null : paidGroupMemberStatus.getBillingCyclePaymentStatus();
        int i = billingCyclePaymentStatus == null ? -1 : TaskDescription.copydefault[billingCyclePaymentStatus.ordinal()];
        if (i == 1 || i == 2) {
            PaidGroupInfo paidGroupInfo2 = groupInfo.getPaidGroupInfo();
            if (paidGroupInfo2 != null) {
                c36774ohM.EZpvd(paidGroupInfo2, billingCyclePaymentStatus == BillingCyclePaymentStatus.OVERDUE);
            }
        } else {
            C33910nKj c33910nKj = c36774ohM.AhwBna;
            if (c33910nKj != null && (oKAlertBanner = c33910nKj.AEQbTJ) != null) {
                oKAlertBanner.setVisibility(8);
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36774ohM, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ohM$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C36774ohM KWHzl;
        public final /* synthetic */ android.view.ViewTreeObserver OLrzqt;

        public Application(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36774ohM c36774ohM) {
            this.OLrzqt = viewTreeObserver;
            this.AEQbTJ = view;
            this.KWHzl = c36774ohM;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.OLrzqt.isAlive() ? this.OLrzqt : this.AEQbTJ.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.KWHzl.djBIcL();
        }
    }

    /* JADX INFO: renamed from: o.ohM$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.ViewTreeObserver AEQbTJ;
        public final /* synthetic */ C36774ohM EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        public StateListAnimator(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36774ohM c36774ohM) {
            this.AEQbTJ = viewTreeObserver;
            this.OLrzqt = view;
            this.EZpvd = c36774ohM;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.AEQbTJ.isAlive() ? this.AEQbTJ : this.OLrzqt.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.EZpvd.djBIcL();
        }
    }

    public final void EZpvd(PaidGroupInfo paidGroupInfo, boolean z) {
        OKAlertBanner oKAlertBanner;
        GroupEntryBillingModel billingModel = paidGroupInfo.getBillingModel();
        java.lang.String currencySign = billingModel != null ? billingModel.getCurrencySign() : null;
        if (currencySign == null) {
            currencySign = "";
        }
        java.lang.String outstandingAmount = paidGroupInfo.getOutstandingAmount();
        java.lang.String str = currencySign + pTB.formatLocalizedWithMinPrecision$default(outstandingAmount != null ? outstandingAmount : "", 2, null, 2, null);
        C33910nKj c33910nKj = this.AhwBna;
        if (c33910nKj == null || (oKAlertBanner = c33910nKj.AEQbTJ) == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = oKAlertBanner.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new Application(viewTreeObserver, oKAlertBanner, this));
        oKAlertBanner.setVisibility(0);
        if (!z) {
            PaidGroupMemberStatus paidGroupMemberStatus = paidGroupInfo.getPaidGroupMemberStatus();
            oKAlertBanner.setTitle(pTD.copydefault(this, C35399nuc.LoaderManager.DzOuPm, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Long.valueOf(AEQbTJ(C33129mqd.valueOf(paidGroupMemberStatus != null ? paidGroupMemberStatus.getNextPaymentDatetime() : null)))), null, 1, null)))));
            oKAlertBanner.setMessage(pTD.copydefault(this, C35399nuc.LoaderManager.DPVBvL, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
            oKAlertBanner.setType(0);
        } else {
            oKAlertBanner.setTitle(getString(C35399nuc.LoaderManager.adwzgZ));
            oKAlertBanner.setMessage(pTD.copydefault(this, C35399nuc.LoaderManager.OKSWiw, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
            oKAlertBanner.setType(3);
        }
        oKAlertBanner.setOnClickListener(new LoaderManager(oKAlertBanner, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ohM$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C36774ohM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C36774ohM c36774ohM) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c36774ohM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd().KWHzl();
            }
        }
    }

    public final long AEQbTJ(long j) {
        return java.lang.Math.abs(java.util.concurrent.TimeUnit.MILLISECONDS.toDays(java.lang.System.currentTimeMillis() - j));
    }

    private final int AEQbTJ(android.view.View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        OKAlertBanner root;
        C33910nKj c33910nKj = this.AhwBna;
        if (c33910nKj == null || (root = c33910nKj.getRoot()) == null) {
            return;
        }
        int iAEQbTJ = AEQbTJ(root);
        if (root.getVisibility() != 0) {
            iAEQbTJ = 0;
        }
        FragmentKt.setFragmentResult(this, Companion.EZpvd(AYXKKw()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_BANNER_HEIGHT", java.lang.Integer.valueOf(iAEQbTJ))));
    }
}
