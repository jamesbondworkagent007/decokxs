package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$listenFragmentResult$1$1;
import com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$observeViewModel$2;
import com.okinc.im.imui.conversationlist.menu.home.HomeAddContactMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMyQRScannerMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeNewChatMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.NewMessageMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.NewOrbitPostPerformer;
import com.okinc.im.imui.conversationlist.menu.home.SettingsMenuItemPerformer;
import com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel;
import com.okinc.im.imui.conversationlist.viewmodel.ConversationListToolbarViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC37293orB;
import o.C35399nuc;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nFG extends nFV {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public nJA AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final int copydefault;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BaseConversationListViewModel.ConversationListType.values().length];
            try {
                iArr[BaseConversationListViewModel.ConversationListType.Restricted.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BaseConversationListViewModel.ConversationListType.Default.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public nFG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ConversationListToolbarViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.conversationlist.ConversationListToolbarFragment$special$$inlined$viewModels$default$5
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
        this.copydefault = C35399nuc.Dialog.DAIeex;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nFG.djBIcL(this.AEQbTJ);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(nFG.valueOf(this.EZpvd));
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.nFV.OLrzqt()V */
    public final ConversationListToolbarViewModel OLrzqt() {
        return (ConversationListToolbarViewModel) this.djBIcL.getValue();
    }

    private final BaseConversationListViewModel.ConversationListType djBIcL() {
        return (BaseConversationListViewModel.ConversationListType) this.EZpvd.getValue();
    }

    public static final BaseConversationListViewModel.ConversationListType djBIcL(nFG nfg) {
        android.os.Bundle arguments = nfg.getArguments();
        return BaseConversationListViewModel.ConversationListType.getEntries().get(arguments != null ? arguments.getInt("key_conversation_list_type") : BaseConversationListViewModel.ConversationListType.Default.ordinal());
    }

    public final boolean EZpvd() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean valueOf(nFG nfg) {
        android.os.Bundle arguments = nfg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key_is_show_back_button", false);
        }
        return false;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nFG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ nFG newInstance$default(ActionBar actionBar, BaseConversationListViewModel.ConversationListType conversationListType, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return actionBar.copydefault(conversationListType, z);
        }

        public final nFG copydefault(@NotNull BaseConversationListViewModel.ConversationListType conversationListType, boolean z) {
            Intrinsics.checkNotNullParameter(conversationListType, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("key_conversation_list_type", java.lang.Integer.valueOf(conversationListType.ordinal())), C56390yDp.OLrzqt("key_is_show_back_button", java.lang.Boolean.valueOf(z)));
            nFG nfg = new nFG();
            nfg.setArguments(bundleBundleOf);
            return nfg;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJA njaKWHzl = nJA.KWHzl(layoutInflater, viewGroup, false);
        this.AEQbTJ = njaKWHzl;
        if (njaKWHzl != null) {
            return njaKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        valueOf();
        AYXKKw();
        OLrzqt().EZpvd();
        AhwBna();
        view.post(new java.lang.Runnable() { // from class: o.nFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nFG.AYXKKw(this.EZpvd);
            }
        });
    }

    public static final void AYXKKw(nFG nfg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) nfg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        OLrzqt().copydefault().observe(this, new C32991mny(new Function1() { // from class: o.nFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nFG.copydefault(this.EZpvd, (ConversationListToolbarViewModel.Application) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConversationListToolbarFragment$observeViewModel$2(this, null), 3, null);
    }

    public static final Unit copydefault(nFG nfg, ConversationListToolbarViewModel.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        pUU.KWHzl("ChatActivity", "action event triggered: " + application);
        nfg.KWHzl(application);
        return Unit.INSTANCE;
    }

    public final void KWHzl(ConversationListToolbarViewModel.Application application) {
        if (application instanceof ConversationListToolbarViewModel.Application.Activity) {
            EZpvd(((ConversationListToolbarViewModel.Application.Activity) application).KWHzl());
        } else {
            if (!(application instanceof ConversationListToolbarViewModel.Application.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toast$default(((ConversationListToolbarViewModel.Application.TaskDescription) application).OLrzqt(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    private final void AYXKKw() {
        int i;
        nJA nja = this.AEQbTJ;
        if (nja != null) {
            nja.gEmmrt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPHhYHK));
            nja.AEQbTJ.setVisibility((!EZpvd() || sSI.copydefault.copydefault()) ? 4 : 0);
            android.widget.ImageView imageView = nja.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            int i2 = Application.OLrzqt[djBIcL().ordinal()];
            if (i2 == 1) {
                i = 8;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 0;
            }
            imageView.setVisibility(i);
            wYC wyc = nja.AEQbTJ;
            wyc.setOnClickListener(new StateListAnimator(wyc, 1000L, this));
            nja.KWHzl.setVisibility(sSI.copydefault.copydefault() ? 0 : 4);
            android.widget.ImageView imageView2 = nja.KWHzl;
            imageView2.setOnClickListener(new Activity(imageView2, 1000L, this));
            android.widget.ImageView imageView3 = nja.OLrzqt;
            imageView3.setOnClickListener(new TaskDescription(imageView3, 1000L, this));
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ nFG KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, nFG nfg) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = nfg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                interfaceC8104awT.copydefault(fragmentActivityRequireActivity);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ nFG AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, nFG nfg) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = nfg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.requireActivity().finish();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ nFG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, nFG nfg) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = nfg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (!Intrinsics.EZpvd(this.copydefault.OLrzqt().gEmmrt().getValue(), java.lang.Boolean.FALSE)) {
                    this.copydefault.OLrzqt().AYXKKw();
                    return;
                }
                rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
                FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                rTU.Application.checkAndRestrictsDistributary$default(rtu, fragmentActivityRequireActivity, null, null, null, null, null, 62, null);
            }
        }
    }

    public final void EZpvd(java.util.List<? extends IMenuItemPerformer> list) {
        C33810nGr c33810nGrEZpvd = C33810nGr.Companion.EZpvd(list);
        c33810nGrEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.nFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                nFG.KWHzl(this.KWHzl, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c33810nGrEZpvd.show(childFragmentManager);
    }

    public static final void KWHzl(nFG nfg, android.content.DialogInterface dialogInterface) {
        nfg.OLrzqt().OLrzqt(false);
    }

    private final void valueOf() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_IM_KEY_MENU_SELECTED", this, new FragmentResultListener() { // from class: o.nFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                nFG.EZpvd(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void EZpvd(nFG nfg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        IMenuItemPerformer iMenuItemPerformer = (IMenuItemPerformer) BundleCompat.getParcelable(bundle, "RESULT_IM_KEY_MENU", IMenuItemPerformer.class);
        pUU.KWHzl("ConversationListToolbarFragment", "menu item selected:" + iMenuItemPerformer);
        if (iMenuItemPerformer instanceof SettingsMenuItemPerformer) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("MessagingNotificationCenter_TopRight_Setting_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
            FragmentActivity fragmentActivityRequireActivity = nfg.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC8104awT.KWHzl(fragmentActivityRequireActivity);
            return;
        }
        if (iMenuItemPerformer instanceof NewMessageMenuItemPerformer) {
            ActivityC37293orB.Activity activity = ActivityC37293orB.Companion;
            android.content.Context contextRequireContext = nfg.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            nfg.startActivity(activity.copydefault(contextRequireContext));
            return;
        }
        if (iMenuItemPerformer instanceof HomeNewChatMenuItemPerformer) {
            FragmentKt.setFragmentResult(nfg, "REQUEST_KEY_START_NEW_CHAT", BundleKt.bundleOf());
            return;
        }
        if (iMenuItemPerformer instanceof NewOrbitPostPerformer) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(nfg), null, null, new ConversationListToolbarFragment$listenFragmentResult$1$1(nfg, null), 3, null);
            return;
        }
        if (iMenuItemPerformer instanceof HomeAddContactMenuItemPerformer) {
            FragmentKt.setFragmentResult(nfg, "REQUEST_KEY_START_ADD_CONTACT", BundleKt.bundleOf());
            return;
        }
        if (iMenuItemPerformer instanceof HomeMyQRScannerMenuItemPerformer) {
            if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fJNWhG()) {
                ScannerActivity.Activity activity2 = ScannerActivity.Companion;
                android.content.Context contextRequireContext2 = nfg.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                ScannerActivity.Activity.start$default(activity2, contextRequireContext2, ScanType.Companion.copydefault(), null, 4, null);
                return;
            }
            ScannerActivity.Activity activity3 = ScannerActivity.Companion;
            android.content.Context contextRequireContext3 = nfg.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            ScannerActivity.Activity.start$default(activity3, contextRequireContext3, ScanType.Companion.KWHzl(), null, 4, null);
        }
    }
}
