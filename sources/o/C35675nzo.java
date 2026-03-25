package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35675nzo extends AbstractC35529nxA {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.nzo$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    public C35675nzo() {
        Function0 function0 = new Function0() { // from class: o.nzk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35675nzo.KWHzl();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.contacts.RemoveContactDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.contacts.RemoveContactDialogFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(nAG.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.contacts.RemoveContactDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.contacts.RemoveContactDialogFragment$special$$inlined$viewModels$default$4
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nzm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35675nzo.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public final nAG OLrzqt() {
        return (nAG) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory KWHzl() {
        return new ActionBar();
    }

    /* JADX INFO: renamed from: o.nzo$ActionBar */
    public static final class ActionBar implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null) {
                throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
            }
            return new nAG(interfaceC35180nqU.AEQbTJ().AEQbTJ());
        }
    }

    public final RelationInfo copydefault() {
        return (RelationInfo) this.KWHzl.getValue();
    }

    public static final RelationInfo AEQbTJ(C35675nzo c35675nzo) {
        RelationInfo relationInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            relationInfo = (RelationInfo) c35675nzo.requireArguments().getParcelable("info", RelationInfo.class);
        } else {
            android.os.Parcelable parcelable = c35675nzo.requireArguments().getParcelable("info");
            relationInfo = parcelable instanceof RelationInfo ? (RelationInfo) parcelable : null;
        }
        if (relationInfo != null) {
            return relationInfo;
        }
        throw new java.lang.IllegalArgumentException("RelationInfo is null");
    }

    /* JADX INFO: renamed from: o.nzo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C35675nzo AEQbTJ(@NotNull RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("info", relationInfo);
            C35675nzo c35675nzo = new C35675nzo();
            c35675nzo.setArguments(bundle);
            return c35675nzo;
        }
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C35399nuc.LoaderManager.dXhJGx, C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C44157sFk.getDisplayName$default(copydefault(), null, 1, null)))));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(this, C35399nuc.LoaderManager.QTtQrx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C44157sFk.getDisplayName$default(copydefault(), null, 1, null)))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.SaJVGb), new View.OnClickListener() { // from class: o.nzn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35675nzo.copydefault(this.EZpvd, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.DrqXHJ, new View.OnClickListener() { // from class: o.nzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35675nzo.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void copydefault(C35675nzo c35675nzo, android.view.View view) {
        c35675nzo.OLrzqt().OLrzqt(c35675nzo.copydefault().getContactsId());
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void AEQbTJ() {
        OLrzqt().OLrzqt().observe(this, new Application(new Function1() { // from class: o.nzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35675nzo.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        OLrzqt().AEQbTJ().observe(this, new C32991mny(new Function1() { // from class: o.nzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35675nzo.EZpvd(this.KWHzl, (Unit) obj);
            }
        }));
        OLrzqt().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.nzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35675nzo.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C35675nzo c35675nzo, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c35675nzo.showLoading();
        } else {
            c35675nzo.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C35675nzo c35675nzo, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        FragmentKt.setFragmentResult(c35675nzo, "KEY_REQUEST_REMOVE_CONTACT", BundleKt.bundleOf(C56390yDp.OLrzqt("result", java.lang.Boolean.TRUE)));
        c35675nzo.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C35675nzo c35675nzo, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        FragmentKt.setFragmentResult(c35675nzo, "KEY_REQUEST_REMOVE_CONTACT", BundleKt.bundleOf(C56390yDp.OLrzqt("result", java.lang.Boolean.FALSE)));
        java.lang.String strCopydefault = C44157sFk.copydefault(th);
        if (strCopydefault != null) {
            C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
