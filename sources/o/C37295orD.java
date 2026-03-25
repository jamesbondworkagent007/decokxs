package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.affiliate.bean.AffiliateIMActionType;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.im.imui.relationlist.model.ListButton;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1;
import com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC35578nxx;
import o.ActivityC36573odX;
import o.ActivityC37326ori;
import o.ActivityC37373osc;
import o.ActivityC37424ota;
import o.C35399nuc;
import o.C37259oqU;
import o.C37262oqX;
import o.C37290oqz;
import o.C37295orD;
import o.C37320orc;
import o.C37321ord;
import o.C37322ore;
import o.InterfaceC8171axh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.orD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37295orD extends AbstractC37342ory {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final ActivityResultLauncher<android.content.Intent> AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AkhnZx;
    public final FragmentManager AuCTel;
    public final TaskDescription djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final PendingIntent fARcdN;
    public C33905nKe fIwbmz;
    public C43319rmz fetchVPNInfo;
    public final Application gEmmrt;
    public final ActionBar isConnected;
    public final ActivityResultLauncher<android.content.Intent> values;
    public final int AhwBna = C35399nuc.Dialog.QCjLjM;
    public final C59534zip DbNXlk = new C59534zip();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C37295orD() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$special$$inlined$viewModels$default$2
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NewMessageViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$special$$inlined$viewModels$default$5
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
        this.values = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.orG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C37295orD.OLrzqt(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.orF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C37295orD.AEQbTJ(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AkhnZx = activityResultLauncherRegisterForActivityResult2;
        this.djBIcL = new TaskDescription();
        this.AuCTel = new FragmentManager();
        this.gEmmrt = new Application();
        this.isConnected = new ActionBar();
        this.fARcdN = new PendingIntent();
    }

    /* JADX INFO: renamed from: o.orD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.orD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C37295orD OLrzqt() {
            return new C37295orD();
        }
    }

    public final NewMessageViewModel djBIcL() {
        return (NewMessageViewModel) this.ejfBZ.getValue();
    }

    public static final void OLrzqt(C37295orD c37295orD, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            C37290oqz c37290oqz = C37290oqz.copydefault;
            FragmentActivity fragmentActivityRequireActivity = c37295orD.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
        }
    }

    public static final void AEQbTJ(C37295orD c37295orD, ActivityResult activityResult) {
        C33791nFz c33791nFz = C33791nFz.KWHzl;
        android.content.Context contextRequireContext = c37295orD.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C33791nFz.navigateToConversationList$default(c33791nFz, contextRequireContext, null, 2, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33905nKe c33905nKeAEQbTJ = C33905nKe.AEQbTJ(layoutInflater, viewGroup, false);
        this.fIwbmz = c33905nKeAEQbTJ;
        if (c33905nKeAEQbTJ != null) {
            return c33905nKeAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMContactPage_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.orJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37295orD.OLrzqt((EventParamsList) obj);
            }
        });
        djBIcL().OLrzqt(valueOf());
        fetchVPNInfo();
        isConnected();
        AYXKKw();
        values();
        EZpvd();
        gEmmrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "IMContactPage_Full_Page_View", "", false, 4, null);
        return Unit.INSTANCE;
    }

    private final boolean valueOf() {
        C37242oqD c37242oqD = C37242oqD.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return c37242oqD.AEQbTJ(contextRequireContext);
    }

    private final void values() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_created_affiliate_group");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.orI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37295orD.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.orL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37295orD.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C37295orD c37295orD, java.lang.String str) {
        C37290oqz c37290oqz = C37290oqz.copydefault;
        FragmentActivity fragmentActivityRequireActivity = c37295orD.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C55230xfy c55230xfy;
        C33905nKe c33905nKe = this.fIwbmz;
        if (c33905nKe == null || (c55230xfy = c33905nKe.OLrzqt) == null) {
            return;
        }
        c55230xfy.setOnClickListener(new StateListAnimator(c55230xfy, 1000L, this, c55230xfy));
    }

    private final void fetchVPNInfo() {
        djBIcL().AEQbTJ().observe(this, new Observer() { // from class: o.orO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37295orD.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        });
        djBIcL().EZpvd().observe(this, new C32991mny(new Function1() { // from class: o.orR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37295orD.copydefault(this.OLrzqt, (NewMessageViewModel.ActionBar) obj);
            }
        }));
        djBIcL().AYXKKw().observe(this, new Observer() { // from class: o.orN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37295orD.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final void AEQbTJ(C37295orD c37295orD, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C43319rmz c43319rmz = c37295orD.fetchVPNInfo;
        if (c43319rmz == null) {
            Intrinsics.gEmmrt("");
            c43319rmz = null;
        }
        c43319rmz.OLrzqt(list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37295orD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(C37295orD c37295orD, NewMessageViewModel.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        pUU.KWHzl("ChatActivity", "action event triggered: " + actionBar);
        c37295orD.OLrzqt(actionBar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.orD$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C55230xfy EZpvd;
        public final /* synthetic */ C37295orD OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C37295orD c37295orD, C55230xfy c55230xfy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c37295orD;
            this.EZpvd = c55230xfy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC37373osc.Application application = ActivityC37373osc.Companion;
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                android.content.Intent intentKWHzl = application.KWHzl(contextRequireContext);
                ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.OLrzqt.requireActivity(), this.EZpvd, "shared_element_name");
                Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeSceneTransitionAnimation, "");
                this.OLrzqt.AYXKKw.launch(intentKWHzl, activityOptionsCompatMakeSceneTransitionAnimation);
            }
        }
    }

    public static final void EZpvd(C37295orD c37295orD, boolean z) {
        if (z) {
            c37295orD.showLoading();
        } else {
            c37295orD.releaseLoading();
        }
    }

    public final void OLrzqt(NewMessageViewModel.ActionBar actionBar) {
        if (actionBar instanceof NewMessageViewModel.ActionBar.Activity) {
            C37314orW c37314orWKWHzl = C37314orW.Companion.KWHzl(((NewMessageViewModel.ActionBar.Activity) actionBar).copydefault());
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c37314orWKWHzl.show(childFragmentManager);
            return;
        }
        if (actionBar instanceof NewMessageViewModel.ActionBar.C0475ActionBar) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ChatOrigin chatOrigin = ChatOrigin.NEW_CHAT_FRIEND_LIST;
            IMPageType iMPageType = IMPageType.NORMAL_IM;
            NewMessageViewModel.ActionBar.C0475ActionBar c0475ActionBar = (NewMessageViewModel.ActionBar.C0475ActionBar) actionBar;
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, c0475ActionBar.copydefault(), chatOrigin, null, null, c0475ActionBar.OLrzqt(), iMPageType, null, null, 408, null);
            C37290oqz c37290oqz = C37290oqz.copydefault;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
            return;
        }
        if (actionBar instanceof NewMessageViewModel.ActionBar.StateListAnimator) {
            C55326xho.toastWithFailedIcon$default(((NewMessageViewModel.ActionBar.StateListAnimator) actionBar).AEQbTJ(), 0, 1, (java.lang.Object) null);
        } else {
            if (!(actionBar instanceof NewMessageViewModel.ActionBar.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl(((NewMessageViewModel.ActionBar.TaskDescription) actionBar).OLrzqt());
        }
    }

    private final void isConnected() {
        C59534zip c59534zip = this.DbNXlk;
        C37321ord c37321ord = new C37321ord();
        c37321ord.copydefault(this.AuCTel);
        Unit unit = Unit.INSTANCE;
        c59534zip.register(C37251oqM.class, c37321ord);
        C37261oqW c37261oqW = new C37261oqW();
        c37261oqW.AEQbTJ(new Function0() { // from class: o.orM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37295orD.AYXKKw(this.copydefault);
            }
        });
        c59534zip.register(C37243oqE.class, c37261oqW);
        c59534zip.register(AbstractC37253oqO.class, new C37318ora());
        c59534zip.register(C37249oqK.class, new C37260oqV());
        C37320orc c37320orc = new C37320orc();
        c37320orc.copydefault(this.gEmmrt);
        c59534zip.register(ListButton.class, c37320orc);
        C37259oqU c37259oqU = new C37259oqU();
        c37259oqU.EZpvd(this.djBIcL);
        c59534zip.register(C37248oqJ.class, c37259oqU);
        C37262oqX c37262oqX = new C37262oqX();
        c37262oqX.OLrzqt(this.isConnected);
        c59534zip.register(C37246oqH.class, c37262oqX);
        C37322ore c37322ore = new C37322ore();
        c37322ore.OLrzqt(this.fARcdN);
        c59534zip.register(VipManagerRelationInfo.class, c37322ore);
        this.fetchVPNInfo = new C37282oqr(this.DbNXlk);
        C33905nKe c33905nKe = this.fIwbmz;
        if (c33905nKe != null) {
            RecyclerView recyclerView = c33905nKe.AEQbTJ;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(this.DbNXlk);
        }
    }

    public static final Unit AYXKKw(C37295orD c37295orD) {
        c37295orD.djBIcL().copydefault(null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.orD$TaskDescription */
    public static final class TaskDescription implements C37259oqU.Activity {
        public TaskDescription() {
        }

        @Override // o.C37259oqU.Activity
        public void EZpvd(RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            pUU.KWHzl("MessageListMainFragment", "Friend item clicked:" + relationInfo.getContactsId());
            ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
            FragmentActivity fragmentActivityRequireActivity = C37295orD.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C37295orD.this.AkhnZx.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : null, (452 & 4) != 0 ? null : null, (452 & 8) != 0 ? null : null, (452 & 16) != 0 ? null : ChatOrigin.NEW_CHAT_FRIEND_LIST, (452 & 32) != 0 ? null : relationInfo.getContactsId(), (452 & 64) != 0 ? null : IMPageType.NORMAL_IM, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
        }
    }

    /* JADX INFO: renamed from: o.orD$FragmentManager */
    public static final class FragmentManager implements C37321ord.StateListAnimator {
        public FragmentManager() {
        }

        @Override // o.C37321ord.StateListAnimator
        public void KWHzl(C37251oqM c37251oqM) {
            Intrinsics.checkNotNullParameter(c37251oqM, "");
            pUU.KWHzl("MessageListMainFragment", "Permission banner item clicked");
            C37242oqD c37242oqD = C37242oqD.EZpvd;
            final C37295orD c37295orD = C37295orD.this;
            c37242oqD.KWHzl(c37295orD, new Function0() { // from class: o.orU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37295orD.FragmentManager.AEQbTJ(c37295orD);
                }
            });
        }

        public static final Unit AEQbTJ(C37295orD c37295orD) {
            c37295orD.AhwBna();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.orD$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements C37320orc.Application {

        /* JADX INFO: renamed from: o.orD$Application$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[GroupType.values().length];
                try {
                    iArr[GroupType.PREMIUM.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[GroupType.STANDARD.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
                int[] iArr2 = new int[ListButton.values().length];
                try {
                    iArr2[ListButton.NEW_GROUP.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr2[ListButton.ADD_BY_PHONE_NUMBER.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ListButton.NEW_INVITEES_GROUP.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ListButton.NEW_BROADCAST.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr2[ListButton.ADD_BY_UUID.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                KWHzl = iArr2;
            }
        }

        public Application() {
        }

        @Override // o.C37320orc.Application
        public void copydefault(ListButton listButton) {
            Intrinsics.checkNotNullParameter(listButton, "");
            pUU.KWHzl("MessageListMainFragment", "List button item clicked:" + listButton);
            int i = ActionBar.KWHzl[listButton.ordinal()];
            if (i == 1) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("IMContactPage_Top_NewGroupButton_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.orQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37295orD.Application.EZpvd((EventParamsList) obj);
                    }
                });
                OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
                if (oKComplianceRestrictionService == null || oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.IM_PAID) || !C37295orD.this.djBIcL().AhwBna()) {
                    ActivityResultLauncher activityResultLauncher = C37295orD.this.AYXKKw;
                    ActivityC37424ota.TaskDescription taskDescription = ActivityC37424ota.Companion;
                    android.content.Context contextRequireContext = C37295orD.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    activityResultLauncher.launch(taskDescription.KWHzl(contextRequireContext, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : SelectionActionType.CREATE_GROUP, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null));
                    return;
                }
                final C37295orD c37295orD = C37295orD.this;
                C34106nRq c34106nRq = new C34106nRq(new Function1() { // from class: o.orP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37295orD.Application.copydefault(c37295orD, (GroupType) obj);
                    }
                });
                androidx.fragment.app.FragmentManager childFragmentManager = C37295orD.this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c34106nRq.show(childFragmentManager);
                return;
            }
            if (i == 2) {
                TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("IMContactPage_Top_AddPhoneNumber_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.orT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37295orD.Application.KWHzl((EventParamsList) obj);
                    }
                });
                ActivityResultLauncher activityResultLauncher2 = C37295orD.this.values;
                ActivityC37326ori.ActionBar actionBar = ActivityC37326ori.Companion;
                android.content.Context contextRequireContext2 = C37295orD.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                activityResultLauncher2.launch(actionBar.EZpvd(contextRequireContext2));
                return;
            }
            if (i == 3) {
                InterfaceC8171axh interfaceC8171axh = (InterfaceC8171axh) C43251rlk.OLrzqt(InterfaceC8171axh.class);
                if (interfaceC8171axh != null) {
                    FragmentActivity fragmentActivityRequireActivity = C37295orD.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    InterfaceC8171axh.Application.navAffiliateIMDataSelect$default(interfaceC8171axh, fragmentActivityRequireActivity, null, 2, null);
                    return;
                }
                return;
            }
            if (i == 4) {
                InterfaceC8171axh interfaceC8171axh2 = (InterfaceC8171axh) C43251rlk.OLrzqt(InterfaceC8171axh.class);
                if (interfaceC8171axh2 != null) {
                    FragmentActivity fragmentActivityRequireActivity2 = C37295orD.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                    interfaceC8171axh2.KWHzl(fragmentActivityRequireActivity2, AffiliateIMActionType.BroadcastMessage);
                    return;
                }
                return;
            }
            if (i == 5) {
                ActivityResultLauncher activityResultLauncher3 = C37295orD.this.values;
                ActivityC35578nxx.Application application = ActivityC35578nxx.Companion;
                android.content.Context contextRequireContext3 = C37295orD.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                activityResultLauncher3.launch(application.OLrzqt(contextRequireContext3));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static final Unit EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "IMContactPage_Top_NewGroupButton_Click", "", false, 4, null);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.ota.TaskDescription.createIntent$default(o.ota$TaskDescription, android.content.Context, java.util.List, com.okinc.im.imui.relationlist.model.SelectionActionType, java.lang.String, java.lang.Boolean, int, java.lang.Object):android.content.Intent */
        public static final Unit copydefault(C37295orD c37295orD, GroupType groupType) {
            Intrinsics.checkNotNullParameter(groupType, "");
            int i = ActionBar.AEQbTJ[groupType.ordinal()];
            if (i == 1) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(c37295orD.djBIcL()), null, null, new NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1(c37295orD, null), 3, null);
            } else if (i == 2) {
                ActivityResultLauncher activityResultLauncher = c37295orD.AYXKKw;
                ActivityC37424ota.TaskDescription taskDescription = ActivityC37424ota.Companion;
                android.content.Context contextRequireContext = c37295orD.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                activityResultLauncher.launch(taskDescription.KWHzl(contextRequireContext, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : SelectionActionType.CREATE_GROUP, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "IMContactPage_Top_AddPhoneNumber_Click", "", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.orD$ActionBar */
    public static final class ActionBar implements C37262oqX.Activity {
        public ActionBar() {
        }

        @Override // o.C37262oqX.Activity
        public void KWHzl(C37246oqH c37246oqH) {
            Intrinsics.checkNotNullParameter(c37246oqH, "");
            pUU.KWHzl("MessageListMainFragment", "Phone contact item clicked");
            C37295orD.this.djBIcL().KWHzl(c37246oqH);
        }
    }

    /* JADX INFO: renamed from: o.orD$PendingIntent */
    public static final class PendingIntent implements C37322ore.Application {
        public PendingIntent() {
        }

        @Override // o.C37322ore.Application
        public void copydefault(VipManagerRelationInfo vipManagerRelationInfo) {
            Intrinsics.checkNotNullParameter(vipManagerRelationInfo, "");
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL != null) {
                android.content.Context contextRequireContext = C37295orD.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC6804aWL.copydefault(contextRequireContext, C6805aWM.OLrzqt(new Function1() { // from class: o.orS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37295orD.PendingIntent.OLrzqt((ChatBotRequest) obj);
                    }
                }));
            }
        }

        public static final Unit OLrzqt(ChatBotRequest chatBotRequest) {
            Intrinsics.checkNotNullParameter(chatBotRequest, "");
            chatBotRequest.setOkaFrom("dedicatedvip_imcont_chat");
            return Unit.INSTANCE;
        }
    }

    private final void KWHzl(C37246oqH c37246oqH) {
        C37341orx c37341orxOLrzqt = C37341orx.Companion.OLrzqt(c37246oqH.EZpvd(), c37246oqH.OLrzqt());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c37341orxOLrzqt.show(childFragmentManager);
    }

    private final void gEmmrt() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LOCAL_RELATION", this, new FragmentResultListener() { // from class: o.orK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37295orD.copydefault(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void copydefault(C37295orD c37295orD, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        PhoneRelation phoneRelation = (PhoneRelation) BundleCompat.getParcelable(bundle, "RESULT_KEY_SELECTED_RELATION", PhoneRelation.class);
        if (phoneRelation != null) {
            c37295orD.djBIcL().OLrzqt(phoneRelation);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isReenter()) {
            djBIcL().KWHzl(valueOf());
            djBIcL().OLrzqt();
        }
        djBIcL().isConnected();
    }

    public final void EZpvd() {
        C37242oqD c37242oqD = C37242oqD.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (c37242oqD.AEQbTJ(contextRequireContext)) {
            djBIcL().OLrzqt();
        }
    }

    @Override // o.AbstractC32996moC, o.C60121zwJ.Activity
    public void onPermissionsGranted(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsGranted(i, list);
        if (i == 101) {
            AhwBna();
        }
    }

    @Override // o.AbstractC32996moC, o.C60121zwJ.Activity
    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsDenied(i, list);
        C37242oqD c37242oqD = C37242oqD.EZpvd;
        if (c37242oqD.AEQbTJ(this)) {
            c37242oqD.KWHzl(this);
        }
    }

    public final void AhwBna() {
        djBIcL().KWHzl(true);
        djBIcL().OLrzqt();
    }
}
