package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ogT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36728ogT extends AbstractC36734ogZ {
    public final InterfaceC56387yDm EZpvd;
    public nJH KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.ogT$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.DCUTEI;
    }

    public C36728ogT() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupLimitationBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerFragment$special$$inlined$viewModels$default$5
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
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ogP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36728ogT.AhwBna(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ogU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36728ogT.gEmmrt(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.ogT$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ogT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C36728ogT copydefault(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            C36728ogT c36728ogT = new C36728ogT();
            c36728ogT.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str2), C56390yDp.OLrzqt("ARG_FRAGMENT_REQUEST_KEY", str)));
            return c36728ogT;
        }
    }

    public final GroupLimitationBannerViewModel AEQbTJ() {
        return (GroupLimitationBannerViewModel) this.OLrzqt.getValue();
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AhwBna(C36728ogT c36728ogT) {
        android.os.Bundle arguments = c36728ogT.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AhwBna() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String gEmmrt(C36728ogT c36728ogT) {
        java.lang.String string;
        android.os.Bundle arguments = c36728ogT.getArguments();
        return (arguments == null || (string = arguments.getString("ARG_FRAGMENT_REQUEST_KEY")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJH njhEZpvd = nJH.EZpvd(layoutInflater, viewGroup, false);
        this.KWHzl = njhEZpvd;
        if (njhEZpvd != null) {
            return njhEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt();
        AEQbTJ().AEQbTJ(djBIcL());
    }

    public final void OLrzqt() {
        AEQbTJ().EZpvd().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ogX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36728ogT.copydefault(this.OLrzqt, (GroupInfo) obj);
            }
        }));
    }

    public static final Unit copydefault(C36728ogT c36728ogT, GroupInfo groupInfo) {
        java.lang.String strAYXKKw;
        java.lang.Integer groupCapacity;
        nJH njh = c36728ogT.KWHzl;
        if (njh != null) {
            OKAlertBanner oKAlertBanner = njh.copydefault;
            oKAlertBanner.setVisibility((!InHouseIMSuperGroupConfig.IncreaseGroupStatus.Companion.OLrzqt(groupInfo != null ? groupInfo.getIncreaseGroupStatus() : null) || c36728ogT.AEQbTJ().AEQbTJ()) ? 8 : 0);
            if ((groupInfo != null ? groupInfo.getIncreaseGroupStatus() : null) == InHouseIMSuperGroupConfig.IncreaseGroupStatus.ALMOST_FULL) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.FQNKFG);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.aeJQwa);
            }
            oKAlertBanner.setTitle(strAYXKKw);
            oKAlertBanner.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.QgUVrU));
            oKAlertBanner.setDescription(C33069mpW.copydefault(c36728ogT, C35399nuc.LoaderManager.dlRikr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(java.lang.Integer.valueOf((groupInfo == null || (groupCapacity = groupInfo.getGroupCapacity()) == null) ? 0 : groupCapacity.intValue()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null)))));
            android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new TaskDescription(imageViewOLrzqt, 1000L, c36728ogT));
            oKAlertBanner.setOnClickListener(new Activity(oKAlertBanner, 1000L, c36728ogT));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36728ogT, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ogT$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C36728ogT AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C36728ogT c36728ogT) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c36728ogT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C36728ogT c36728ogT = this.AEQbTJ;
                FragmentKt.setFragmentResult(c36728ogT, c36728ogT.AhwBna(), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_FRAGMENT_BANNER_CLICK", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("ARG_FRAGMENT_IS_GROUP_ALREADY_FULL", java.lang.Boolean.valueOf(this.AEQbTJ.AEQbTJ().copydefault())), C56390yDp.OLrzqt("ARG_FRAGMENT_GROUP_CAPACITY", java.lang.Integer.valueOf(this.AEQbTJ.AEQbTJ().KWHzl()))));
            }
        }
    }

    /* JADX INFO: renamed from: o.ogT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C36728ogT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C36728ogT c36728ogT) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c36728ogT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            OKAlertBanner oKAlertBanner;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AEQbTJ().OLrzqt();
                nJH njh = this.copydefault.KWHzl;
                if (njh == null || (oKAlertBanner = njh.copydefault) == null) {
                    return;
                }
                oKAlertBanner.setVisibility(8);
            }
        }
    }
}
