package o;

import android.text.TextUtils;
import android.view.View;
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
import com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC34064nQb;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ogD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36712ogD extends AbstractC36727ogS {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public nJB EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final int copydefault = C35399nuc.Dialog.ODWQjV;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.ogD$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final void OLrzqt(GroupInfo groupInfo) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public C36712ogD() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupAnnouncementBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ogO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36712ogD.copydefault(this.EZpvd);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ogL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36712ogD.AYXKKw(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.ogD$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ogD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_IS_LOADING_LEGACY";
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_BANNER_HEIGHT";
        }

        public final C36712ogD AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            C36712ogD c36712ogD = new C36712ogD();
            c36712ogD.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str2), C56390yDp.OLrzqt("ARG_FRAGMENT_REQUEST_KEY", str)));
            return c36712ogD;
        }
    }

    public final GroupAnnouncementBannerViewModel OLrzqt() {
        return (GroupAnnouncementBannerViewModel) this.valueOf.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String copydefault(C36712ogD c36712ogD) {
        android.os.Bundle arguments = c36712ogD.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String AYXKKw(C36712ogD c36712ogD) {
        java.lang.String string;
        android.os.Bundle arguments = c36712ogD.getArguments();
        return (arguments == null || (string = arguments.getString("ARG_FRAGMENT_REQUEST_KEY")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJB njbOLrzqt = nJB.OLrzqt(layoutInflater, viewGroup, false);
        this.EZpvd = njbOLrzqt;
        if (njbOLrzqt != null) {
            return njbOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OKAlertBanner root;
        OKAlertBanner oKAlertBanner;
        Intrinsics.checkNotNullParameter(view, "");
        nJB njb = this.EZpvd;
        if (njb != null && (oKAlertBanner = njb.EZpvd) != null) {
            oKAlertBanner.setOnClickListener(new Application(oKAlertBanner, 1000L, this));
            android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new StateListAnimator(imageViewOLrzqt, 1000L, this));
            oKAlertBanner.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.Dff));
        }
        nJB njb2 = this.EZpvd;
        if (njb2 != null && (root = njb2.getRoot()) != null) {
            android.view.ViewTreeObserver viewTreeObserver = root.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ActionBar(viewTreeObserver, root, this));
        }
        OLrzqt().AEQbTJ().observe(getViewLifecycleOwner(), new Observer() { // from class: o.ogF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36712ogD.OLrzqt((GroupInfo) obj);
            }
        });
        OLrzqt().AhwBna().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ogH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36712ogD.copydefault(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        OLrzqt().EZpvd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ogG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36712ogD.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        OLrzqt().OLrzqt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ogJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36712ogD.KWHzl(this.KWHzl, (GroupInfo) obj);
            }
        }));
        OLrzqt().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ogI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36712ogD.OLrzqt(this.EZpvd, (C36551odB) obj);
            }
        }));
        OLrzqt().AEQbTJ(valueOf());
    }

    public static final Unit copydefault(C36712ogD c36712ogD, java.lang.Boolean bool) {
        pUU.KWHzl(c36712ogD.getTAG(), "isLoadingLegacy updated: " + bool);
        FragmentKt.setFragmentResult(c36712ogD, Companion.KWHzl(c36712ogD.KWHzl()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_IS_LOADING", bool)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C36712ogD c36712ogD, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(c36712ogD.getTAG(), "toastEvent received: " + str);
        C55328xhq.show$default(C55328xhq.OLrzqt, (java.lang.CharSequence) str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 54, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36712ogD c36712ogD, GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        pUU.KWHzl(c36712ogD.getTAG(), "openGroupAnnouncementListEvent received: " + groupInfo.getGroupId());
        c36712ogD.copydefault(groupInfo);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36712ogD c36712ogD, C36551odB c36551odB) {
        pUU.KWHzl(c36712ogD.getTAG(), "groupAnnouncementBanner updated: " + c36551odB);
        c36712ogD.AEQbTJ(c36551odB);
        c36712ogD.AEQbTJ();
        c36712ogD.KWHzl(c36551odB);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36712ogD, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ogD$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C36712ogD KWHzl;
        public final /* synthetic */ android.view.ViewTreeObserver OLrzqt;

        public ActionBar(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36712ogD c36712ogD) {
            this.OLrzqt = viewTreeObserver;
            this.EZpvd = view;
            this.KWHzl = c36712ogD;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.OLrzqt.isAlive() ? this.OLrzqt : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.KWHzl.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.ogD$Dialog */
    public static final class Dialog implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C36712ogD EZpvd;
        public final /* synthetic */ android.view.ViewTreeObserver OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        public Dialog(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36712ogD c36712ogD) {
            this.OLrzqt = viewTreeObserver;
            this.copydefault = view;
            this.EZpvd = c36712ogD;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.OLrzqt.isAlive() ? this.OLrzqt : this.copydefault.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.EZpvd.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.ogD$FragmentManager */
    public static final class FragmentManager implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.ViewTreeObserver KWHzl;
        public final /* synthetic */ C36712ogD OLrzqt;

        public FragmentManager(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36712ogD c36712ogD) {
            this.KWHzl = viewTreeObserver;
            this.EZpvd = view;
            this.OLrzqt = c36712ogD;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.KWHzl.isAlive() ? this.KWHzl : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.OLrzqt.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.ogD$PendingIntent */
    public static final class PendingIntent implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.ViewTreeObserver AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C36712ogD OLrzqt;

        public PendingIntent(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36712ogD c36712ogD) {
            this.AEQbTJ = viewTreeObserver;
            this.EZpvd = view;
            this.OLrzqt = c36712ogD;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.AEQbTJ.isAlive() ? this.AEQbTJ : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.OLrzqt.EZpvd();
        }
    }

    public final void copydefault(GroupInfo groupInfo) {
        ActivityC34064nQb.Application application = ActivityC34064nQb.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        long groupNoticeId = groupInfo.getGroupNoticeId();
        startActivity(application.OLrzqt(fragmentActivityRequireActivity, groupInfo, java.lang.Long.valueOf(groupNoticeId), java.lang.Boolean.TRUE));
    }

    public final void AEQbTJ(C36551odB c36551odB) {
        OKAlertBanner oKAlertBanner;
        nJB njb = this.EZpvd;
        if (njb == null || (oKAlertBanner = njb.EZpvd) == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = oKAlertBanner.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new Dialog(viewTreeObserver, oKAlertBanner, this));
        oKAlertBanner.setVisibility(c36551odB != null ? 0 : 8);
    }

    public final void AEQbTJ() {
        OKAlertBanner oKAlertBanner;
        nJB njb = this.EZpvd;
        if (njb == null || (oKAlertBanner = njb.EZpvd) == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = oKAlertBanner.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new FragmentManager(viewTreeObserver, oKAlertBanner, this));
        oKAlertBanner.setTitle(getString(C35399nuc.LoaderManager.geAOna));
    }

    /* JADX INFO: renamed from: o.ogD$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C36712ogD EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C36712ogD c36712ogD) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c36712ogD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                pUU.KWHzl(this.EZpvd.getTAG(), "groupAnnouncementBanner clicked");
                GroupInfo value = this.EZpvd.OLrzqt().AEQbTJ().getValue();
                if (value == null || !value.isDissolve()) {
                    this.EZpvd.OLrzqt().AYXKKw();
                    C32866mlf.onEvent$default("IMChat_ChatList_Banner_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ogD$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C36712ogD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C36712ogD c36712ogD) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c36712ogD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                pUU.KWHzl(this.copydefault.getTAG(), "messageLabel clicked");
                GroupInfo value = this.copydefault.OLrzqt().AEQbTJ().getValue();
                if (value == null || !value.isDissolve()) {
                    this.copydefault.OLrzqt().AYXKKw();
                    C32866mlf.onEvent$default("IMChat_ChatList_Banner_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ogD$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C36712ogD KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C36712ogD c36712ogD) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c36712ogD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                pUU.KWHzl(this.KWHzl.getTAG(), "groupAnnouncementBanner close icon clicked");
                this.KWHzl.OLrzqt().KWHzl();
                C32866mlf.onEvent$default("IMChat_Banner_Dismiss_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
    }

    public final void KWHzl(C36551odB c36551odB) {
        OKAlertBanner oKAlertBanner;
        java.lang.String strOLrzqt;
        nJB njb = this.EZpvd;
        if (njb == null || (oKAlertBanner = njb.EZpvd) == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = oKAlertBanner.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new PendingIntent(viewTreeObserver, oKAlertBanner, this));
        if (c36551odB == null || (strOLrzqt = c36551odB.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        oKAlertBanner.setMessage(strOLrzqt);
        android.widget.TextView textViewKWHzl = oKAlertBanner.KWHzl();
        C34086nQx.setupAnnouncementText$default(C34086nQx.AEQbTJ, textViewKWHzl, 0, 2, false, null, 9, null);
        textViewKWHzl.setEllipsize(TextUtils.TruncateAt.END);
        textViewKWHzl.setClickable(true);
        textViewKWHzl.setFocusable(false);
        textViewKWHzl.setLongClickable(false);
        textViewKWHzl.setOnClickListener(new LoaderManager(textViewKWHzl, 1000L, this));
    }

    public final int copydefault(android.view.View view) {
        return view.getMeasuredHeight();
    }

    public final void EZpvd() {
        OKAlertBanner root;
        nJB njb = this.EZpvd;
        if (njb == null || (root = njb.getRoot()) == null) {
            return;
        }
        int iCopydefault = copydefault(root);
        if (root.getVisibility() != 0) {
            iCopydefault = 0;
        }
        FragmentKt.setFragmentResult(this, Companion.AEQbTJ(KWHzl()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_BANNER_HEIGHT", java.lang.Integer.valueOf(iCopydefault))));
    }
}
