package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$internalCancel$1;
import com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$internalDismiss$1;
import com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$onCreate$1;
import com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$onCreate$2;
import com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragmentViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35464nvp extends AbstractC35463nvo {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public C34026nOr AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nvq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35464nvp.OLrzqt(this.KWHzl);
        }
    });
    public java.lang.String gEmmrt = "ACTION_DISMISS";
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.nvp$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nvp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_LEAVE";
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_CANCEL";
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_DISMISS";
        }

        public final C35464nvp copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C35464nvp c35464nvp = new C35464nvp();
            c35464nvp.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FRAGMENT_RESULT_KEY", str)));
            return c35464nvp;
        }
    }

    public C35464nvp() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LeaveThisChatDialogFragmentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.leavethischatdialog.LeaveThisChatDialogFragment$special$$inlined$viewModels$default$5
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
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String OLrzqt(C35464nvp c35464nvp) {
        java.lang.String string;
        android.os.Bundle arguments = c35464nvp.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_FRAGMENT_RESULT_KEY")) == null) ? "" : string;
    }

    public final LeaveThisChatDialogFragmentViewModel AhwBna() {
        return (LeaveThisChatDialogFragmentViewModel) this.valueOf.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
        this.gEmmrt = "ACTION_DISMISS";
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        FlowKt.launchIn(FlowKt.onEach(AhwBna().copydefault(), new LeaveThisChatDialogFragment$onCreate$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(AhwBna().KWHzl(), new LeaveThisChatDialogFragment$onCreate$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        final C34026nOr c34026nOrCopydefault = C34026nOr.copydefault(getLayoutInflater());
        c34026nOrCopydefault.KWHzl.setText(getString(C35399nuc.LoaderManager.OuxcSI));
        Intrinsics.checkNotNullExpressionValue(c34026nOrCopydefault, "");
        this.AYXKKw = c34026nOrCopydefault;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C35399nuc.LoaderManager.finit));
        viewOnClickListenerC54939xaY.EZpvd(getString(C35399nuc.LoaderManager.fFgQHt));
        java.lang.String string = getString(C35399nuc.LoaderManager.ODWQjV);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.nvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35464nvp.KWHzl(this.copydefault, c34026nOrCopydefault, view);
            }
        });
        java.lang.String string2 = getString(C35399nuc.LoaderManager.iwGUEr);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.nvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35464nvp.EZpvd(this.KWHzl, view);
            }
        });
        android.widget.LinearLayout root = c34026nOrCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.OLrzqt(root, C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void KWHzl(C35464nvp c35464nvp, C34026nOr c34026nOr, android.view.View view) {
        c35464nvp.gEmmrt = "ACTION_LEAVE";
        c35464nvp.AhwBna().copydefault(c34026nOr.KWHzl.isChecked());
    }

    public static final void EZpvd(C35464nvp c35464nvp, android.view.View view) {
        c35464nvp.valueOf();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.gEmmrt = "ACTION_CANCEL";
        KWHzl();
        super.onCancel(dialogInterface);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        KWHzl();
        super.onDismiss(dialogInterface);
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LeaveThisChatDialogFragment$internalDismiss$1(this, null), 3, null);
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LeaveThisChatDialogFragment$internalCancel$1(this, null), 3, null);
    }

    public final void KWHzl() {
        java.lang.String strEZpvd;
        java.lang.String str = this.gEmmrt;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ACTION_LEAVE")) {
            strEZpvd = Companion.AEQbTJ(gEmmrt());
        } else {
            strEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ACTION_CANCEL") ? Companion.EZpvd(gEmmrt()) : Companion.OLrzqt(gEmmrt());
        }
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "");
        FragmentKt.setFragmentResult(this, strEZpvd, bundle);
    }
}
