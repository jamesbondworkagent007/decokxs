package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.CdnResourceType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$setupViewModelListeners$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$setupViewModelListeners$2;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$setupViewModelListeners$3;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$setupViewModelListeners$4;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel.NotificationCenterViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC44644san;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44656saz extends AbstractC44645sao {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public C44637sag AYXKKw;
    public C44619saO AkhnZx;
    public C42603rYz djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.saA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44656saz.valueOf();
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.saE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44656saz.djBIcL(this.KWHzl);
        }
    });
    public final int gEmmrt = rXV.StateListAnimator.AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C44656saz() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NotificationCenterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterFragment$special$$inlined$activityViewModels$default$3
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

    public final NotificationCenterViewModel AhwBna() {
        return (NotificationCenterViewModel) this.fetchVPNInfo.getValue();
    }

    public final C59534zip AYXKKw() {
        return (C59534zip) this.AhwBna.getValue();
    }

    public static final C59534zip valueOf() {
        return new C59534zip();
    }

    public final rXL djBIcL() {
        return (rXL) this.values.getValue();
    }

    public static final rXL djBIcL(C44656saz c44656saz) {
        java.lang.String string;
        android.os.Bundle arguments = c44656saz.getArguments();
        if (arguments == null || (string = arguments.getString("ARG_NOTIFICATION_CHANNEL_ID")) == null) {
            return null;
        }
        return rXL.Companion.EZpvd(string);
    }

    /* JADX INFO: renamed from: o.saz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.saz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C44656saz newInstance$default(StateListAnimator stateListAnimator, rXL rxl, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rxl = null;
            }
            return stateListAnimator.AEQbTJ(rxl);
        }

        public final C44656saz AEQbTJ(rXL rxl) {
            C44656saz c44656saz = new C44656saz();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ARG_NOTIFICATION_CHANNEL_ID", rxl != null ? rxl.EZpvd() : null);
            c44656saz.setArguments(bundle);
            return c44656saz;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("MessageCenter_Notification_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        this.djBIcL = C42603rYz.EZpvd(view);
        isConnected();
        values();
        AhwBna().AuCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onDestroyView();
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz != null && (recyclerView2 = c42603rYz.djBIcL) != null) {
            C44619saO c44619saO = this.AkhnZx;
            if (c44619saO != null) {
                recyclerView2.removeItemDecoration(c44619saO);
            }
            recyclerView2.setAdapter(null);
        }
        C42603rYz c42603rYz2 = this.djBIcL;
        if (c42603rYz2 != null && (recyclerView = c42603rYz2.AYXKKw) != null) {
            recyclerView.setAdapter(null);
        }
        this.AkhnZx = null;
        this.AYXKKw = null;
        this.djBIcL = null;
    }

    public final void isConnected() {
        AYXKKw().register(SystemNotification.class, new C44614saJ(new Function2() { // from class: o.saD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C44656saz.copydefault(this.KWHzl, (SystemNotification) obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        AYXKKw().register(C44617saM.class, new C44618saN());
        AYXKKw().register(InterfaceC44644san.class, new C44642sal());
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        c42603rYz.djBIcL.setAdapter(AYXKKw());
        C44619saO c44619saO = new C44619saO(AYXKKw());
        this.AkhnZx = c44619saO;
        RecyclerView recyclerView = c42603rYz.djBIcL;
        Intrinsics.copydefault(c44619saO);
        recyclerView.addItemDecoration(c44619saO);
        C44637sag c44637sag = new C44637sag(new Function1() { // from class: o.saC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44656saz.OLrzqt(this.EZpvd, (NotificationCategoryBean) obj);
            }
        });
        this.AYXKKw = c44637sag;
        c42603rYz.AYXKKw.setAdapter(c44637sag);
        c42603rYz.AhwBna.KWHzl(new InterfaceC57900yrD() { // from class: o.saF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C44656saz.AEQbTJ(this.KWHzl, interfaceC57934yrl);
            }
        });
        c42603rYz.AhwBna.OLrzqt(new InterfaceC57903yrG() { // from class: o.saH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C44656saz.EZpvd(this.OLrzqt, interfaceC57934yrl);
            }
        });
    }

    public static final Unit copydefault(C44656saz c44656saz, SystemNotification systemNotification, int i) {
        Intrinsics.checkNotNullParameter(systemNotification, "");
        c44656saz.AhwBna().KWHzl(systemNotification);
        c44656saz.AYXKKw().notifyItemChanged(i);
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c44656saz.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        java.lang.String url = systemNotification.getUrl();
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, url == null ? "" : url, null, new Function1() { // from class: o.sav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44656saz.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C44656saz c44656saz, NotificationCategoryBean notificationCategoryBean) {
        Intrinsics.checkNotNullParameter(notificationCategoryBean, "");
        c44656saz.AhwBna().KWHzl(notificationCategoryBean.getId());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C44656saz c44656saz, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c44656saz.AhwBna().values();
    }

    public static final void EZpvd(C44656saz c44656saz, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c44656saz.AhwBna().fIwbmz();
    }

    public final void values() {
        StateFlow<C42584rYg<SystemNotification>> stateFlowValueOf = AhwBna().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C42588rYk.collectLatestOnLifecycle$default(stateFlowValueOf, viewLifecycleOwner, null, new NotificationCenterFragment$setupViewModelListeners$1(this, null), 2, null);
        StateFlow<java.lang.Integer> stateFlowIsConnected = AhwBna().isConnected();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C42588rYk.collectLatestOnLifecycle$default(stateFlowIsConnected, viewLifecycleOwner2, null, new NotificationCenterFragment$setupViewModelListeners$2(this, null), 2, null);
        StateFlow<java.util.List<C44646sap>> stateFlowOLrzqt = AhwBna().OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C42588rYk.collectLatestOnLifecycle$default(stateFlowOLrzqt, viewLifecycleOwner3, null, new NotificationCenterFragment$setupViewModelListeners$3(this, null), 2, null);
        StateFlow<NotificationCenterViewModel.TaskDescription> stateFlowEZpvd = AhwBna().EZpvd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C42588rYk.collectOnLifecycle$default(stateFlowEZpvd, viewLifecycleOwner4, null, new NotificationCenterFragment$setupViewModelListeners$4(this, null), 2, null);
        AhwBna().copydefault(djBIcL());
    }

    public final void AEQbTJ(boolean z) {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        if (z) {
            c42603rYz.djBIcL.smoothScrollToPosition(0);
        } else {
            c42603rYz.AhwBna.AEQbTJ();
        }
    }

    public final void AkhnZx() {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        C33546myW c33546myW = c42603rYz.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c33546myW.setVisibility(8);
        C55173xeu c55173xeu = c42603rYz.OLrzqt;
        java.lang.String string = getString(rXV.TaskDescription.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(rXV.TaskDescription.valueOf);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.saB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C44656saz.KWHzl(this.OLrzqt, view);
            }
        });
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(0);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(C44656saz c44656saz, android.view.View view) {
        if (c44656saz.djBIcL() == null) {
            c44656saz.AhwBna().copydefault(c44656saz.djBIcL());
        } else {
            NotificationCenterViewModel.loadNotificationList$default(c44656saz.AhwBna(), null, false, false, 7, null);
        }
    }

    public final void DbNXlk() {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        C33546myW c33546myW = c42603rYz.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c33546myW.setVisibility(8);
        C55173xeu c55173xeu = c42603rYz.OLrzqt;
        java.lang.String string = getString(rXV.TaskDescription.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(rXV.TaskDescription.KWHzl);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setRetry("");
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(0);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(java.util.List<SystemNotification> list, boolean z) {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        if (!AhwBna().EZpvd().getValue().OLrzqt()) {
            C33546myW c33546myW = c42603rYz.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(0);
        }
        RecyclerView recyclerView = c42603rYz.djBIcL;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(0);
        C55173xeu c55173xeu = c42603rYz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        AYXKKw().setItems(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) AhwBna().KWHzl(list), (java.lang.Iterable) yDY.OLrzqt(KWHzl(z))));
        AYXKKw().notifyDataSetChanged();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final InterfaceC44644san KWHzl(boolean z) {
        rXO rxo = (rXO) C43251rlk.OLrzqt(rXO.class);
        boolean zAEQbTJ = rxo != null ? rxo.AEQbTJ() : false;
        if (z) {
            return null;
        }
        if (djBIcL() != null) {
            return InterfaceC44644san.TaskDescription.OLrzqt;
        }
        if (zAEQbTJ || C42597rYt.copydefault()) {
            return InterfaceC44644san.Application.KWHzl;
        }
        return InterfaceC44644san.StateListAnimator.OLrzqt;
    }

    public final void EZpvd(NotificationCenterViewModel.TaskDescription taskDescription) {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        AEQbTJ(taskDescription.AEQbTJ());
        java.lang.String str = djBIcL() == null ? "lottie/notification_center/notifications_list.lottie" : "lottie/notification_center/notification_settings.lottie";
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CdnResourceType cdnResourceType = CdnResourceType.Lottie;
        java.lang.String strKWHzl = C42589rYl.KWHzl(str, contextRequireContext, cdnResourceType, true);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        java.lang.String strKWHzl2 = C42589rYl.KWHzl("lottie/notification_center/notification_navigation.lottie", contextRequireContext2, cdnResourceType, true);
        AEQbTJ(taskDescription);
        boolean z = djBIcL() != null;
        OLrzqt(z);
        boolean z2 = taskDescription.KWHzl() && !z;
        boolean z3 = taskDescription.OLrzqt() && !taskDescription.AEQbTJ();
        if (z2) {
            RecyclerView recyclerView = c42603rYz.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
        }
        C55113xdn c55113xdn = c42603rYz.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        copydefault(c55113xdn, strKWHzl2, z2);
        C55113xdn c55113xdn2 = c42603rYz.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        copydefault(c55113xdn2, strKWHzl, z3);
        copydefault(z2, z3, z);
    }

    public final void AEQbTJ(NotificationCenterViewModel.TaskDescription taskDescription) {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        int i = 8;
        if (taskDescription.OLrzqt() && !taskDescription.AEQbTJ()) {
            C33546myW c33546myW = c42603rYz.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(8);
        } else {
            if (taskDescription.OLrzqt() || taskDescription.AEQbTJ()) {
                return;
            }
            C42584rYg<SystemNotification> value = AhwBna().valueOf().getValue();
            C33546myW c33546myW2 = c42603rYz.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
            if (!value.copydefault() && (!value.OLrzqt().isEmpty())) {
                i = 0;
            }
            c33546myW2.setVisibility(i);
        }
    }

    public final void copydefault(C55113xdn c55113xdn, java.lang.String str, boolean z) {
        if (z) {
            c55113xdn.setAnimationFromUrl(str);
            c55113xdn.setAutoMirrored(true);
            c55113xdn.setScaleType(ImageView.ScaleType.FIT_CENTER);
            c55113xdn.setVisibility(0);
            c55113xdn.playAnimation();
            return;
        }
        c55113xdn.pauseAnimation();
        c55113xdn.setVisibility(8);
    }

    public final void copydefault(boolean z, boolean z2, boolean z3) {
        if (z3 && z2) {
            setNotificationLoadingConstraints$default(this, false, true, 1, null);
            return;
        }
        if (z && z2) {
            gEmmrt();
            setNotificationLoadingConstraints$default(this, false, false, 3, null);
        } else if (!z && z2) {
            EZpvd(4);
            setNotificationLoadingConstraints$default(this, true, false, 2, null);
        } else {
            EZpvd(10);
            gEmmrt();
            setNotificationLoadingConstraints$default(this, false, false, 3, null);
        }
    }

    public final void EZpvd(int i) {
        int iDpInt$default;
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        if (i == 4) {
            iDpInt$default = C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            iDpInt$default = C55298xhM.dpInt$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        RecyclerView recyclerView = c42603rYz.AYXKKw;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), c42603rYz.AYXKKw.getPaddingTop(), c42603rYz.AYXKKw.getPaddingRight(), iDpInt$default);
    }

    public final void gEmmrt() {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        C55113xdn c55113xdn = c42603rYz.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        ViewGroup.LayoutParams layoutParams = c55113xdn.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.UeEOUB);
            layoutParams2.topToBottom = c42603rYz.AYXKKw.getId();
            c55113xdn.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public static /* synthetic */ void setNotificationLoadingConstraints$default(C44656saz c44656saz, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c44656saz.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        C55113xdn c55113xdn = c42603rYz.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        ViewGroup.LayoutParams layoutParams = c55113xdn.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (z2) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            layoutParams2.topToBottom = -1;
            layoutParams2.topToTop = 0;
        } else if (z) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            layoutParams2.topToBottom = c42603rYz.AYXKKw.getId();
            layoutParams2.topToTop = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            layoutParams2.topToBottom = c42603rYz.EZpvd.getId();
            layoutParams2.topToTop = -1;
        }
        c55113xdn.setLayoutParams(layoutParams2);
    }

    public final void OLrzqt(boolean z) {
        C42603rYz c42603rYz = this.djBIcL;
        if (c42603rYz == null) {
            return;
        }
        if (z) {
            C33546myW c33546myW = c42603rYz.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            ViewGroup.LayoutParams layoutParams = c33546myW.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                layoutParams2.topToBottom = -1;
                layoutParams2.topToTop = 0;
                c33546myW.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C33546myW c33546myW2 = c42603rYz.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
        ViewGroup.LayoutParams layoutParams3 = c33546myW2.getLayoutParams();
        if (layoutParams3 != null) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
            layoutParams4.topToBottom = c42603rYz.AYXKKw.getId();
            layoutParams4.topToTop = -1;
            c33546myW2.setLayoutParams(layoutParams4);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
