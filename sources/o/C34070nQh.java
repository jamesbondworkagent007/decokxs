package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.im.imui.group.announcement.AnnouncementMenuBottomSheet;
import com.okinc.im.imui.group.announcement.CreateEditNoticeActivity;
import com.okinc.im.imui.group.announcement.NoticeboardFragment$observeViewModel$1;
import com.okinc.im.imui.group.announcement.model.GroupAnnouncementData;
import com.okinc.im.imui.group.announcement.viewmodel.NoticeboardViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC34085nQw;
import o.AbstractC34088nQz;
import o.C35399nuc;
import o.C52761wXj;
import o.nPN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nQh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34070nQh extends AbstractC34065nQc {
    public C33882nJi AYXKKw;
    public final InterfaceC56387yDm DbNXlk;
    public final int djBIcL = C35399nuc.Dialog.dvKsVJ;
    public final ActivityResultLauncher<android.content.Intent> gEmmrt;
    public final ActivityResultLauncher<android.content.Intent> valueOf;
    public final InterfaceC56387yDm values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.nQh$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AnnouncementMenuBottomSheet.MenuAction.values().length];
            try {
                iArr[AnnouncementMenuBottomSheet.MenuAction.PIN_TO_CHAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AnnouncementMenuBottomSheet.MenuAction.EDIT_NOTICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnouncementMenuBottomSheet.MenuAction.REMOVE_NOTICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public C34070nQh() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.announcement.NoticeboardFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.announcement.NoticeboardFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NoticeboardViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.announcement.NoticeboardFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.announcement.NoticeboardFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.announcement.NoticeboardFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.nQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34070nQh.KWHzl(this.copydefault);
            }
        });
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C34070nQh.EZpvd(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C34070nQh.OLrzqt(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX DEBUG: Possible override for method o.nQc.OLrzqt()V */
    public final C33882nJi OLrzqt() {
        C33882nJi c33882nJi = this.AYXKKw;
        if (c33882nJi != null) {
            return c33882nJi;
        }
        throw new java.lang.IllegalStateException("Binding is only available between onCreateView and onDestroyView".toString());
    }

    public final NoticeboardViewModel djBIcL() {
        return (NoticeboardViewModel) this.values.getValue();
    }

    public final C34084nQv gEmmrt() {
        return (C34084nQv) this.DbNXlk.getValue();
    }

    public static final C34084nQv KWHzl(final C34070nQh c34070nQh) {
        return new C34084nQv(c34070nQh.djBIcL().AEQbTJ(), new Function1() { // from class: o.nQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34070nQh.OLrzqt(this.KWHzl, (GroupAnnouncementInfo) obj);
            }
        }, new Function1() { // from class: o.nQm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34070nQh.KWHzl(this.AEQbTJ, (GroupAnnouncementInfo) obj);
            }
        }, new Function1() { // from class: o.nQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34070nQh.AEQbTJ(this.KWHzl, ((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.nQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34070nQh.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final Unit OLrzqt(C34070nQh c34070nQh, GroupAnnouncementInfo groupAnnouncementInfo) {
        Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
        c34070nQh.djBIcL().OLrzqt(groupAnnouncementInfo);
        C32866mlf.onEvent$default("IMChat_Announcement_Announcement_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C34070nQh c34070nQh, GroupAnnouncementInfo groupAnnouncementInfo) {
        Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
        c34070nQh.djBIcL().AEQbTJ(groupAnnouncementInfo);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34070nQh c34070nQh, long j) {
        c34070nQh.djBIcL().EZpvd(j);
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(C34070nQh c34070nQh, java.lang.String str) {
        return c34070nQh.djBIcL().AEQbTJ(str);
    }

    public static final void EZpvd(C34070nQh c34070nQh, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            java.lang.String string = c34070nQh.getString(C35399nuc.LoaderManager.HrFqwD);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
            c34070nQh.djBIcL().AkhnZx();
        }
    }

    public static final void OLrzqt(C34070nQh c34070nQh, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            java.lang.String string = c34070nQh.getString(C35399nuc.LoaderManager.fzHEvu);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
            c34070nQh.djBIcL().AkhnZx();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AYXKKw = C33882nJi.AEQbTJ(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutAEQbTJ = OLrzqt().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutAEQbTJ, "");
        return constraintLayoutAEQbTJ;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        valueOf();
        values();
        AhwBna();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    private final void values() {
        RecyclerView recyclerView = OLrzqt().EZpvd;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(gEmmrt());
    }

    public final void AhwBna() {
        C52794wYp c52794wYp = OLrzqt().OLrzqt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    private final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NoticeboardFragment$observeViewModel$1(this, null), 3, null);
    }

    public final void copydefault(AbstractC34085nQw abstractC34085nQw) {
        if (abstractC34085nQw instanceof AbstractC34085nQw.StateListAnimator) {
            C55173xeu c55173xeu = OLrzqt().copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            RecyclerView recyclerView = OLrzqt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            return;
        }
        if (abstractC34085nQw instanceof AbstractC34085nQw.Application) {
            AbstractC34085nQw.Application application = (AbstractC34085nQw.Application) abstractC34085nQw;
            gEmmrt().submitList(application.AEQbTJ());
            gEmmrt().AEQbTJ(application.OLrzqt(), application.KWHzl());
            C55173xeu c55173xeu2 = OLrzqt().copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(8);
            RecyclerView recyclerView2 = OLrzqt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(0);
            copydefault(application.OLrzqt(), application.KWHzl().size(), application.EZpvd());
            requireActivity().invalidateOptionsMenu();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (abstractC34085nQw instanceof AbstractC34085nQw.Activity) {
            C52794wYp c52794wYp = OLrzqt().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            RecyclerView recyclerView3 = OLrzqt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            recyclerView3.setVisibility(8);
            C55173xeu c55173xeu3 = OLrzqt().copydefault;
            Intrinsics.copydefault(c55173xeu3);
            c55173xeu3.setVisibility(0);
            AbstractC34085nQw.Activity activity = (AbstractC34085nQw.Activity) abstractC34085nQw;
            c55173xeu3.EZpvd().setVisibility(activity.EZpvd() ? 0 : 8);
            c55173xeu3.AEQbTJ().setVisibility(activity.EZpvd() ? 0 : 8);
            c55173xeu3.setOnClickListener(new TaskDescription(c55173xeu3, 1000L, this));
            requireActivity().invalidateOptionsMenu();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (!(abstractC34085nQw instanceof AbstractC34085nQw.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        C44157sFk.KWHzl(((AbstractC34085nQw.TaskDescription) abstractC34085nQw).OLrzqt());
        C55173xeu c55173xeu4 = OLrzqt().copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
        c55173xeu4.setVisibility(8);
        RecyclerView recyclerView4 = OLrzqt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
        recyclerView4.setVisibility(0);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nQh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C34070nQh EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34070nQh c34070nQh) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c34070nQh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AbstractC34085nQw value = this.EZpvd.djBIcL().AYXKKw().getValue();
                if (!(value instanceof AbstractC34085nQw.Application) || !((AbstractC34085nQw.Application) value).OLrzqt()) {
                    this.EZpvd.djBIcL().copydefault();
                } else {
                    this.EZpvd.djBIcL().fetchVPNInfo();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.nQh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C34070nQh EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C34070nQh c34070nQh) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c34070nQh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.djBIcL().copydefault();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pTD.getFormattedQuantityString$default(androidx.fragment.app.Fragment, int, int, java.util.Map, int, java.lang.Object):java.lang.String */
    public final void KWHzl(AbstractC34088nQz abstractC34088nQz) {
        if (abstractC34088nQz instanceof AbstractC34088nQz.AssistContent) {
            C55326xho.toast$default(((AbstractC34088nQz.AssistContent) abstractC34088nQz).KWHzl(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.StateListAnimator) {
            GroupInfo groupInfoDjBIcL = djBIcL().djBIcL();
            if (groupInfoDjBIcL != null) {
                CreateEditNoticeActivity.ActionBar actionBar = CreateEditNoticeActivity.Companion;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                this.valueOf.launch(actionBar.KWHzl(contextRequireContext, groupInfoDjBIcL));
                return;
            }
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.Dialog) {
            CreateEditNoticeActivity.ActionBar actionBar2 = CreateEditNoticeActivity.Companion;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            this.gEmmrt.launch(actionBar2.AEQbTJ(contextRequireContext2, ((AbstractC34088nQz.Dialog) abstractC34088nQz).KWHzl()));
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.PictureInPictureParams) {
            C55326xho.toast$default("Over limit: " + ((AbstractC34088nQz.PictureInPictureParams) abstractC34088nQz).KWHzl(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.PendingIntent) {
            AEQbTJ(((AbstractC34088nQz.PendingIntent) abstractC34088nQz).copydefault());
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.FragmentManager) {
            EZpvd(((AbstractC34088nQz.FragmentManager) abstractC34088nQz).OLrzqt());
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.Fragment) {
            return;
        }
        if ((abstractC34088nQz instanceof AbstractC34088nQz.Activity) || (abstractC34088nQz instanceof AbstractC34088nQz.Application)) {
            requireActivity().invalidateOptionsMenu();
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.LoaderManager) {
            OLrzqt(((AbstractC34088nQz.LoaderManager) abstractC34088nQz).KWHzl());
            return;
        }
        if (abstractC34088nQz instanceof AbstractC34088nQz.TaskDescription) {
            C55326xho.toastWithSuccessfulIcon$default(pTD.getFormattedQuantityString$default(this, C35399nuc.Fragment.iwGUEr, ((AbstractC34088nQz.TaskDescription) abstractC34088nQz).EZpvd(), (java.util.Map) null, 4, (java.lang.Object) null), 0, 1, (java.lang.Object) null);
        } else {
            if (!(abstractC34088nQz instanceof AbstractC34088nQz.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String string = getString(C35399nuc.LoaderManager.nriSR);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.nQh$Activity */
    public static final class Activity implements MenuProvider {
        public Activity() {
        }

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
            Intrinsics.checkNotNullParameter(menu, "");
            Intrinsics.checkNotNullParameter(menuInflater, "");
            AbstractC34085nQw value = C34070nQh.this.djBIcL().AYXKKw().getValue();
            boolean z = value instanceof AbstractC34085nQw.Application;
            if (!z || !((AbstractC34085nQw.Application) value).OLrzqt()) {
                if (C34070nQh.this.djBIcL().AEQbTJ() && z) {
                    menu.add(0, 1001, 0, "Manage notices").setIcon(C52761wXj.TaskDescription.sCB).setShowAsAction(2);
                    return;
                }
                return;
            }
            menu.add(0, 1002, 0, "Close").setIcon(C52761wXj.TaskDescription.alsFma).setShowAsAction(2);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            int itemId = menuItem.getItemId();
            if (itemId == 1001) {
                C34070nQh.this.djBIcL().OLrzqt();
            } else {
                if (itemId != 1002) {
                    return false;
                }
                C34070nQh.this.djBIcL().KWHzl();
            }
            return true;
        }
    }

    public final void valueOf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        fragmentActivityRequireActivity.addMenuProvider(new Activity(), getViewLifecycleOwner(), Lifecycle.State.RESUMED);
    }

    public final void EZpvd(final GroupAnnouncementInfo groupAnnouncementInfo) {
        AnnouncementMenuBottomSheet announcementMenuBottomSheetKWHzl = AnnouncementMenuBottomSheet.Companion.KWHzl(djBIcL().AEQbTJ() && !groupAnnouncementInfo.isPin(), djBIcL().AEQbTJ(), djBIcL().AEQbTJ());
        announcementMenuBottomSheetKWHzl.KWHzl(new Function1() { // from class: o.nQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34070nQh.copydefault(this.OLrzqt, groupAnnouncementInfo, (AnnouncementMenuBottomSheet.MenuAction) obj);
            }
        });
        announcementMenuBottomSheetKWHzl.show(getChildFragmentManager(), AnnouncementMenuBottomSheet.class.getSimpleName());
    }

    public static final Unit copydefault(C34070nQh c34070nQh, GroupAnnouncementInfo groupAnnouncementInfo, AnnouncementMenuBottomSheet.MenuAction menuAction) {
        Intrinsics.checkNotNullParameter(menuAction, "");
        c34070nQh.AEQbTJ(menuAction, groupAnnouncementInfo);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AnnouncementMenuBottomSheet.MenuAction menuAction, GroupAnnouncementInfo groupAnnouncementInfo) {
        int i = Application.OLrzqt[menuAction.ordinal()];
        if (i == 1) {
            OLrzqt(groupAnnouncementInfo);
        } else if (i == 2) {
            djBIcL().EZpvd(groupAnnouncementInfo);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            djBIcL().KWHzl(groupAnnouncementInfo);
        }
    }

    public final void AEQbTJ(GroupAnnouncementInfo groupAnnouncementInfo) {
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) groupAnnouncementInfo.getUpdateBy(), (java.lang.Object) C44157sFk.KWHzl());
        nPN.Activity activity = nPN.Companion;
        long announceId = groupAnnouncementInfo.getAnnounceId();
        java.lang.String groupId = groupAnnouncementInfo.getGroupId();
        GroupMemberInfo announceAuthorInfo = groupAnnouncementInfo.getAnnounceAuthorInfo();
        java.lang.String content = groupAnnouncementInfo.getContent();
        boolean zIsPin = groupAnnouncementInfo.isPin();
        long createTime = groupAnnouncementInfo.getCreateTime();
        long createTime2 = groupAnnouncementInfo.getCreateTime();
        java.lang.Long editTime = groupAnnouncementInfo.getEditTime();
        boolean z = editTime == null || createTime2 != editTime.longValue();
        java.lang.String strAEQbTJ = djBIcL().AEQbTJ(groupAnnouncementInfo.getUpdateBy());
        if (strAEQbTJ == null) {
            strAEQbTJ = C33129mqd.gEmmrt(groupAnnouncementInfo.getUpdateByName());
        }
        activity.KWHzl(new GroupAnnouncementData(announceId, groupId, announceAuthorInfo, content, zIsPin, createTime, z, zEZpvd, strAEQbTJ, C33129mqd.gEmmrt(groupAnnouncementInfo.getCreateByName()))).show(getChildFragmentManager(), nPN.class.getSimpleName());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void copydefault(boolean z, int i, boolean z2) {
        java.lang.String str;
        C52794wYp c52794wYp = OLrzqt().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        if (z) {
            if (i > 0) {
                str = "Remove (" + i + " selected)";
            } else {
                str = "Remove (0 selected)";
            }
            OLrzqt().OLrzqt.setText(str);
            OLrzqt().OLrzqt.setEnabled(i > 0);
            return;
        }
        OLrzqt().OLrzqt.setText(getString(C35399nuc.LoaderManager.onLost));
        C52794wYp c52794wYp2 = OLrzqt().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(z2 ? 0 : 8);
        OLrzqt().OLrzqt.setEnabled(true);
    }

    public final void OLrzqt(final GroupAnnouncementInfo groupAnnouncementInfo) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.hwXsuq);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.izFvvl);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.sanrWj, new View.OnClickListener() { // from class: o.nQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34070nQh.OLrzqt(this.OLrzqt, groupAnnouncementInfo, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.DrqXHJ, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(C34070nQh c34070nQh, GroupAnnouncementInfo groupAnnouncementInfo, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c34070nQh.djBIcL().AEQbTJ(groupAnnouncementInfo.getGroupId(), groupAnnouncementInfo.getAnnounceId(), groupAnnouncementInfo.getContent(), true);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(int i) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(this, C35399nuc.LoaderManager.DzCpqu, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i)))));
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.HJWChPhFGucI);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.USBtdM, new View.OnClickListener() { // from class: o.nQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34070nQh.EZpvd(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(C34070nQh c34070nQh, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c34070nQh.djBIcL().EZpvd();
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.nQh$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nQh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C34070nQh newInstance$default(ActionBar actionBar, GroupInfo groupInfo, java.lang.Long l, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            if ((i & 4) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            return actionBar.EZpvd(groupInfo, l, bool);
        }

        public final C34070nQh EZpvd(@NotNull GroupInfo groupInfo, java.lang.Long l, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("info", groupInfo);
            if (l != null) {
                bundle.putLong("id", l.longValue());
            }
            bundle.putBoolean(BotWebHook.KEY_ACTION, Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE));
            C34070nQh c34070nQh = new C34070nQh();
            c34070nQh.setArguments(bundle);
            return c34070nQh;
        }
    }
}
