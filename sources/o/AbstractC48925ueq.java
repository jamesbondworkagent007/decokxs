package o;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.Color;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.rxutils.RxBus;
import com.okinc.share.BaseShareDialogFragment$onCreate$1;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.platforms.SharePlatform;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C48931uew;
import o.C48974ufm;
import o.C49340umh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48925ueq extends C32995moB implements C49340umh.Application, InterfaceC48892ueJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final C48974ufm.Activity<kotlin.Pair<SharePlatform, AbstractC49100uiF>> copydefault = new C48974ufm.Activity<>("share_result_event", 0, 2, null);
    public final CopyOnWriteArrayList<InterfaceC48899ueQ> AEQbTJ = new CopyOnWriteArrayList<>();
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC49097uiC AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public boolean OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public MultiShareConfig gEmmrt;
    public final InterfaceC56387yDm valueOf;

    @Override // o.InterfaceC48892ueJ
    public void AuCTel() {
    }

    @Override // o.InterfaceC48892ueJ
    public androidx.fragment.app.DialogFragment EZpvd() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC49097uiC interfaceC49097uiC) {
        this.AhwBna = interfaceC49097uiC;
    }

    public abstract android.view.View KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull MultiShareConfig multiShareConfig) {
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        this.gEmmrt = multiShareConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.OLrzqt;
    }

    public abstract android.view.View isConnected();

    @Override // o.C32995moB
    public boolean isTranslucent() {
        return true;
    }

    public AbstractC48925ueq() {
        Function0 function0 = new Function0() { // from class: o.uer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC48925ueq.valueOf(this.OLrzqt);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C48934uez.class), new Function0<ViewModelStore>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C48974ufm.class), new Function0<ViewModelStore>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$9
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
                Function0 function05 = function03;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.share.BaseShareDialogFragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AbstractC48925ueq.OLrzqt(this.copydefault));
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.uev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(AbstractC48925ueq.djBIcL(this.copydefault));
            }
        });
    }

    /* JADX INFO: renamed from: o.ueq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ueq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C48974ufm.Activity<kotlin.Pair<SharePlatform, AbstractC49100uiF>> EZpvd() {
            return AbstractC48925ueq.copydefault;
        }
    }

    public final void OLrzqt(@NotNull SharePlatform sharePlatform, @NotNull AbstractC49100uiF abstractC49100uiF) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        Intrinsics.checkNotNullParameter(abstractC49100uiF, "");
        InterfaceC49097uiC interfaceC49097uiC = this.AhwBna;
        if (interfaceC49097uiC != null) {
            interfaceC49097uiC.OLrzqt(sharePlatform, abstractC49100uiF);
        }
    }

    public final MultiShareConfig AhwBna() {
        MultiShareConfig multiShareConfig = this.gEmmrt;
        if (multiShareConfig != null) {
            return multiShareConfig;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.ueq$TaskDescription */
    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C48934uez(AbstractC48925ueq.this.AhwBna());
        }
    }

    public final C48934uez valueOf() {
        return (C48934uez) this.AYXKKw.getValue();
    }

    public static final ViewModelProvider.Factory valueOf(AbstractC48925ueq abstractC48925ueq) {
        return abstractC48925ueq.new TaskDescription();
    }

    public final C48974ufm fetchVPNInfo() {
        return (C48974ufm) this.djBIcL.getValue();
    }

    @Override // o.InterfaceC48892ueJ
    public void KWHzl(@NotNull InterfaceC48899ueQ interfaceC48899ueQ) {
        Intrinsics.checkNotNullParameter(interfaceC48899ueQ, "");
        this.AEQbTJ.add(interfaceC48899ueQ);
    }

    @Override // o.InterfaceC48892ueJ
    public void OLrzqt(@NotNull InterfaceC48899ueQ interfaceC48899ueQ) {
        Intrinsics.checkNotNullParameter(interfaceC48899ueQ, "");
        this.AEQbTJ.remove(interfaceC48899ueQ);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        android.os.Parcelable parcelable = requireArguments().getParcelable("config");
        Intrinsics.copydefault(parcelable);
        copydefault((MultiShareConfig) parcelable);
    }

    public final boolean fJNWhG() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(AbstractC48925ueq abstractC48925ueq) {
        FragmentActivity fragmentActivityRequireActivity = abstractC48925ueq.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        return ((AppCompatActivity) fragmentActivityRequireActivity).getDelegate().getLocalNightMode() == 2;
    }

    public final int DbNXlk() {
        return ((java.lang.Number) this.valueOf.getValue()).intValue();
    }

    public static final int djBIcL(AbstractC48925ueq abstractC48925ueq) {
        return Color.parseColor(abstractC48925ueq.fJNWhG() ? "#A6000000" : "#66000000");
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o.uep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                return AbstractC48925ueq.AEQbTJ(this.AEQbTJ, dialogInterface, i, keyEvent);
            }
        });
        return dialogOnCreateDialog;
    }

    public static final boolean AEQbTJ(AbstractC48925ueq abstractC48925ueq, android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        abstractC48925ueq.ejfBZ();
        return true;
    }

    @Override // o.InterfaceC48892ueJ
    public void ejfBZ() {
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        super.onStart();
        try {
            android.app.Dialog dialog = getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33472mxB c33472mxB = new C33472mxB(contextRequireContext, window);
            c33472mxB.AEQbTJ();
            android.view.View viewFindViewById = dialog.findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                c33472mxB.AEQbTJ(viewFindViewById);
            }
            int iCopydefault = C33070mpX.copydefault(C32113mPz.ActionBar.QKVWgx);
            boolean zCopydefault = c33472mxB.copydefault();
            c33472mxB.KWHzl(iCopydefault, zCopydefault);
            c33472mxB.EZpvd(false, !zCopydefault);
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKShare", "ShareDialogFragment->onStart->error:" + e.getMessage());
        }
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C48931uew.Dialog.KWHzl);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseShareDialogFragment$onCreate$1(this, null), 3, null);
    }

    public BottomSheetBehavior<android.view.View> copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        BottomSheetBehavior<android.view.View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(view);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "");
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setHideable(true);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new Activity());
        return bottomSheetBehaviorFrom;
    }

    /* JADX INFO: renamed from: o.ueq$Activity */
    public static final class Activity extends BottomSheetBehavior.BottomSheetCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 4 || i == 5) {
                AbstractC48925ueq.this.copydefault();
            }
        }
    }

    public final void values() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.QVAiDq, new C49338umf(), "header_panel_tag").commitNowAllowingStateLoss();
    }

    public final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.fZBcTu, fragment, "platforms_panel_tag").commitNowAllowingStateLoss();
    }

    public final androidx.fragment.app.Fragment djBIcL() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return childFragmentManager.findFragmentByTag("platforms_panel_tag");
    }

    public final androidx.fragment.app.Fragment AYXKKw() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return childFragmentManager.findFragmentByTag("edit_panel_tag");
    }

    private final void copydefault(ShareConfig shareConfig) {
        IShareParams shareParams = shareConfig.getShareParams();
        C48992ugD c48992ugD = C48992ugD.KWHzl;
        c48992ugD.AEQbTJ(shareParams.getShareFrom());
        c48992ugD.KWHzl(shareParams.getTriggerSource(), shareParams.getShareFrom());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairEZpvd = MultiShareConfig.Companion.EZpvd(AhwBna());
        if (!pairEZpvd.getFirst().booleanValue()) {
            C55326xho.toast$default("invalid multi share config:" + ((java.lang.Object) pairEZpvd.getSecond()), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            copydefault();
            return;
        }
        ShareConfig value = valueOf().OLrzqt().getValue();
        Intrinsics.copydefault(value);
        copydefault(value);
    }

    @Override // o.C49340umh.Application
    public void KWHzl(int i) {
        valueOf().OLrzqt(i);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AhwBna = null;
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        RxBus.KWHzl("event_wallet_share_callback");
        RxBus.KWHzl("event_welfare_share_callback");
    }

    public final void copydefault() {
        try {
            if (isAdded()) {
                dismissAllowingStateLoss();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.InterfaceC48892ueJ
    public InterfaceC48969ufh<?, ?> AkhnZx() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("preview_panel_tag");
        if (fragmentFindFragmentByTag == null) {
            throw new java.lang.IllegalStateException("previewer is not exist");
        }
        return (AbstractC48908ueZ) fragmentFindFragmentByTag;
    }

    @Override // o.InterfaceC48892ueJ
    public boolean fARcdN() {
        androidx.fragment.app.Fragment fragmentAYXKKw = AYXKKw();
        if ((fragmentAYXKKw instanceof InterfaceC48897ueO) && fragmentAYXKKw.isAdded() && !fragmentAYXKKw.isHidden()) {
            return true;
        }
        return djBIcL() instanceof InterfaceC48897ueO;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC48897ueO AEQbTJ() {
        androidx.fragment.app.Fragment fragmentAYXKKw = AYXKKw();
        if ((fragmentAYXKKw instanceof InterfaceC48897ueO) && fragmentAYXKKw.isAdded() && !fragmentAYXKKw.isHidden()) {
            return (InterfaceC48897ueO) fragmentAYXKKw;
        }
        ActivityResultCaller activityResultCallerDjBIcL = djBIcL();
        if (activityResultCallerDjBIcL instanceof InterfaceC48897ueO) {
            return (InterfaceC48897ueO) activityResultCallerDjBIcL;
        }
        return null;
    }

    public final android.animation.Animator OLrzqt(@NotNull java.lang.Runnable runnable) {
        android.animation.AnimatorSet animatorSetCopydefault;
        Intrinsics.checkNotNullParameter(runnable, "");
        android.view.View viewKWHzl = KWHzl();
        android.view.View viewIsConnected = isConnected();
        android.animation.ObjectAnimator objectAnimatorCopydefault = viewIsConnected != null ? C33616mzn.copydefault(viewIsConnected, 500, C33616mzn.valueOf, null, -viewIsConnected.getHeight(), 0.0f) : null;
        android.view.animation.Interpolator interpolator = C33616mzn.OLrzqt;
        android.animation.ObjectAnimator objectAnimatorCopydefault2 = C33616mzn.copydefault(viewKWHzl, 300, interpolator, new Application(viewKWHzl, runnable), viewKWHzl.getHeight(), 0.0f);
        android.animation.ValueAnimator valueAnimatorKWHzl = C33616mzn.KWHzl(300, interpolator, new ValueAnimator.AnimatorUpdateListener() { // from class: o.uet
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                AbstractC48925ueq.copydefault(this.OLrzqt, valueAnimator);
            }
        }, null, 0, java.lang.Integer.valueOf(DbNXlk()));
        if (objectAnimatorCopydefault != null) {
            animatorSetCopydefault = C33616mzn.copydefault(objectAnimatorCopydefault, objectAnimatorCopydefault2, valueAnimatorKWHzl);
        } else {
            animatorSetCopydefault = C33616mzn.copydefault(objectAnimatorCopydefault2, valueAnimatorKWHzl);
        }
        animatorSetCopydefault.start();
        Intrinsics.copydefault(animatorSetCopydefault);
        return animatorSetCopydefault;
    }

    /* JADX INFO: renamed from: o.ueq$Application */
    public static final class Application extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.Runnable copydefault;

        public Application(android.view.View view, java.lang.Runnable runnable) {
            this.AEQbTJ = view;
            this.copydefault = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.setLayerType(2, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.setLayerType(0, null);
            this.copydefault.run();
        }
    }

    public static final void copydefault(AbstractC48925ueq abstractC48925ueq, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.view.View view = abstractC48925ueq.getView();
        if (view != null) {
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            view.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }

    public final void EZpvd(boolean z) {
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((InterfaceC48899ueQ) it.next()).copydefault(z);
        }
    }
}
