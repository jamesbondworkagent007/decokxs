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
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$internalCancel$1;
import com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$internalDismiss$1;
import com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$onCreate$1;
import com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$onCreate$2;
import com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragmentViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35445nvW extends AbstractC35448nvZ {
    public C34026nOr djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nwc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35445nvW.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nwb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C35445nvW.EZpvd(this.copydefault));
        }
    });
    public java.lang.String gEmmrt = "ACTION_DISMISS";

    /* JADX INFO: renamed from: o.nvW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nvW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_SEND_NOW";
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_CANCEL";
        }

        public final java.lang.String KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_DISMISS";
        }

        public final C35445nvW OLrzqt(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            C35445nvW c35445nvW = new C35445nvW();
            c35445nvW.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FRAGMENT_RESULT_KEY", str), C56390yDp.OLrzqt("KEY_TOTAL_RECIPIENT", java.lang.Integer.valueOf(i))));
            return c35445nvW;
        }
    }

    public C35445nvW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SendConfirmationDialogFragmentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.sendconfirmationdialog.SendConfirmationDialogFragment$special$$inlined$viewModels$default$5
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

    private final java.lang.String AhwBna() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String AEQbTJ(C35445nvW c35445nvW) {
        java.lang.String string;
        android.os.Bundle arguments = c35445nvW.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_FRAGMENT_RESULT_KEY")) == null) ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.nvZ.AEQbTJ()V */
    public final int AEQbTJ() {
        return ((java.lang.Number) this.valueOf.getValue()).intValue();
    }

    public static final int EZpvd(C35445nvW c35445nvW) {
        android.os.Bundle arguments = c35445nvW.getArguments();
        if (arguments != null) {
            return arguments.getInt("KEY_TOTAL_RECIPIENT");
        }
        return 0;
    }

    public final SendConfirmationDialogFragmentViewModel gEmmrt() {
        return (SendConfirmationDialogFragmentViewModel) this.fetchVPNInfo.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
        this.gEmmrt = "ACTION_DISMISS";
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().KWHzl(), new SendConfirmationDialogFragment$onCreate$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().OLrzqt(), new SendConfirmationDialogFragment$onCreate$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        final C34026nOr c34026nOrCopydefault = C34026nOr.copydefault(getLayoutInflater());
        c34026nOrCopydefault.KWHzl.setText(getString(C35399nuc.LoaderManager.OuxcSI));
        Intrinsics.checkNotNullExpressionValue(c34026nOrCopydefault, "");
        this.djBIcL = c34026nOrCopydefault;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C35399nuc.LoaderManager.gGvvIC));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(this, C35399nuc.LoaderManager.dvKsVJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(AEQbTJ())), null, 1, null)))));
        java.lang.String string = getString(C35399nuc.LoaderManager.getPostValueLengthLimit);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.nwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35445nvW.AEQbTJ(this.EZpvd, c34026nOrCopydefault, view);
            }
        });
        java.lang.String string2 = getString(C35399nuc.LoaderManager.iwGUEr);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.nwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35445nvW.KWHzl(this.OLrzqt, view);
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

    public static final void AEQbTJ(C35445nvW c35445nvW, C34026nOr c34026nOr, android.view.View view) {
        c35445nvW.gEmmrt = "ACTION_SEND_NOW";
        c35445nvW.gEmmrt().KWHzl(c34026nOr.KWHzl.isChecked());
    }

    public static final void KWHzl(C35445nvW c35445nvW, android.view.View view) {
        c35445nvW.valueOf();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.gEmmrt = "ACTION_CANCEL";
        AYXKKw();
        super.onCancel(dialogInterface);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        AYXKKw();
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SendConfirmationDialogFragment$internalDismiss$1(this, null), 3, null);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SendConfirmationDialogFragment$internalCancel$1(this, null), 3, null);
    }

    private final void AYXKKw() {
        java.lang.String strAEQbTJ;
        java.lang.String str = this.gEmmrt;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ACTION_SEND_NOW")) {
            strAEQbTJ = Companion.EZpvd(AhwBna());
        } else {
            strAEQbTJ = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ACTION_CANCEL") ? Companion.AEQbTJ(AhwBna()) : Companion.KWHzl(AhwBna());
        }
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "");
        FragmentKt.setFragmentResult(this, strAEQbTJ, bundle);
    }
}
