package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
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
import com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C35652nzR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oiq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36857oiq extends AbstractC36849oii {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public nKC AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final int djBIcL = C35399nuc.Dialog.call;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.oiq$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public static final void OLrzqt(OKConversation oKConversation) {
    }

    public static final void copydefault(RelationInfo relationInfo) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public C36857oiq() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrangerRelationBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.oiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36857oiq.KWHzl(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36857oiq.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.oiq$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oiq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C36857oiq EZpvd(java.lang.String str, @NotNull IMPageType iMPageType) {
            Intrinsics.checkNotNullParameter(iMPageType, "");
            C36857oiq c36857oiq = new C36857oiq();
            c36857oiq.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str), C56390yDp.OLrzqt("ARG_PAGE_TYPE", iMPageType)));
            return c36857oiq;
        }
    }

    /* JADX DEBUG: Possible override for method o.oii.EZpvd()V */
    public final StrangerRelationBannerViewModel EZpvd() {
        return (StrangerRelationBannerViewModel) this.isConnected.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String KWHzl(C36857oiq c36857oiq) {
        android.os.Bundle arguments = c36857oiq.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    private final IMPageType AhwBna() {
        return (IMPageType) this.AhwBna.getValue();
    }

    public static final IMPageType copydefault(C36857oiq c36857oiq) {
        android.os.Bundle arguments = c36857oiq.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_PAGE_TYPE") : null;
        if (serializable instanceof IMPageType) {
            return (IMPageType) serializable;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nKC nkcEZpvd = nKC.EZpvd(layoutInflater, viewGroup, false);
        this.AYXKKw = nkcEZpvd;
        if (nkcEZpvd != null) {
            return nkcEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        wYF wyf;
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd().EZpvd().observe(getViewLifecycleOwner(), new Observer() { // from class: o.oim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36857oiq.OLrzqt((OKConversation) obj);
            }
        });
        EZpvd().KWHzl().observe(getViewLifecycleOwner(), new Observer() { // from class: o.oin
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36857oiq.copydefault((RelationInfo) obj);
            }
        });
        EZpvd().copydefault().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.oio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36857oiq.EZpvd(this.OLrzqt, (RelationInfo) obj);
            }
        }));
        EZpvd().OLrzqt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.oip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36857oiq.OLrzqt(this.copydefault, (RelationInfo) obj);
            }
        }));
        EZpvd().AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.oit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36857oiq.EZpvd(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        nKC nkc = this.AYXKKw;
        if (nkc != null && (wyf = nkc.copydefault) != null) {
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSSize(32);
                c52794wYpCopydefault.setOKDSType(259);
                c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOKDSSize(32);
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
            }
        }
        EZpvd().AEQbTJ(valueOf(), AhwBna());
        gEmmrt();
    }

    public static final Unit EZpvd(C36857oiq c36857oiq, RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        C35652nzR c35652nzRNewInstance$default = C35652nzR.ActionBar.newInstance$default(C35652nzR.Companion, "FRAGMENT_REQUEST_KEY_ADD_RELATION", relationInfo, "private_message", null, 8, null);
        androidx.fragment.app.FragmentManager childFragmentManager = c36857oiq.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c35652nzRNewInstance$default.show(childFragmentManager, (java.lang.String) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C36857oiq c36857oiq, RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        C35580nxz c35580nxzAEQbTJ = C35580nxz.Companion.AEQbTJ("FRAGMENT_REQUEST_KEY_BLOCK_RELATION", relationInfo);
        androidx.fragment.app.FragmentManager childFragmentManager = c36857oiq.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c35580nxzAEQbTJ.show(childFragmentManager, (java.lang.String) null);
        FragmentKt.setFragmentResultListener(c35580nxzAEQbTJ, "FRAGMENT_REQUEST_KEY_BLOCK_RELATION", new Function2() { // from class: o.ois
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C36857oiq.KWHzl(this.KWHzl, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36857oiq c36857oiq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "KEY_REQUEST_BLOCK_CONTACT") && bundle.getBoolean("KEY_BLOCK_CONTACT_RESULT", false)) {
            c36857oiq.EZpvd().djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36857oiq c36857oiq, java.lang.Boolean bool) {
        android.widget.LinearLayout root;
        nKC nkc = c36857oiq.AYXKKw;
        if (nkc != null && (root = nkc.getRoot()) != null) {
            root.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36857oiq, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.oiq$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "IMChat_Bottom_AddFriends_Click", "", false, 4, null);
        }
    }

    private final void gEmmrt() {
        FragmentKt.setFragmentResultListener(this, "REQUEST_KEY_KYC_PASSED", new Function2() { // from class: o.oir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C36857oiq.OLrzqt(this.OLrzqt, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        getParentFragmentManager().setFragmentResultListener("FRAGMENT_RESULT_KEY_REFRESH_INFO_COMPLETED", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.oiA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C36857oiq.djBIcL(this.copydefault, str, bundle);
            }
        });
    }

    public static final Unit OLrzqt(C36857oiq c36857oiq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36857oiq.EZpvd().AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(C36857oiq c36857oiq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36857oiq.EZpvd().AhwBna();
    }

    /* JADX INFO: renamed from: o.oiq$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C36857oiq OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C36857oiq c36857oiq) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c36857oiq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("IMChat_Bottom_AddFriends_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), StateListAnimator.AEQbTJ);
                this.OLrzqt.EZpvd().AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.oiq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C36857oiq OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C36857oiq c36857oiq) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c36857oiq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.EZpvd().gEmmrt();
            }
        }
    }
}
