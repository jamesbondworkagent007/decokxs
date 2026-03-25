package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.just.agentweb.ActionActivity;
import com.okinc.im.imui.contacts.addcontact.AddContactDialogFragment$internalCancel$1;
import com.okinc.im.imui.contacts.addcontact.AddContactDialogFragment$internalDismiss$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33632nAb;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35652nzR extends C32995moB {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public RelationInfo KWHzl;
    public java.lang.String OLrzqt;

    /* JADX INFO: renamed from: o.nzR$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public C35652nzR() {
        Function0 function0 = new Function0() { // from class: o.nzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35652nzR.AhwBna();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.contacts.addcontact.AddContactDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.contacts.addcontact.AddContactDialogFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C33632nAb.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.contacts.addcontact.AddContactDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.contacts.addcontact.AddContactDialogFragment$special$$inlined$viewModels$default$4
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35652nzR.OLrzqt(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.nzR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C35652nzR newInstance$default(ActionBar actionBar, java.lang.String str, RelationInfo relationInfo, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return actionBar.AEQbTJ(str, relationInfo, str2, str3);
        }

        public final C35652nzR AEQbTJ(@NotNull java.lang.String str, @NotNull RelationInfo relationInfo, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putParcelable("info", relationInfo);
            bundle.putString("origin", str2);
            bundle.putString("groupId", str3);
            C35652nzR c35652nzR = new C35652nzR();
            c35652nzR.setArguments(bundle);
            return c35652nzR;
        }
    }

    public final C33632nAb EZpvd() {
        return (C33632nAb) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory AhwBna() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.nzR$TaskDescription */
    public static final class TaskDescription implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null) {
                throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
            }
            return new C33632nAb(interfaceC35180nqU.AEQbTJ().AEQbTJ());
        }
    }

    private final java.lang.String copydefault() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String OLrzqt(C35652nzR c35652nzR) {
        java.lang.String string;
        android.os.Bundle arguments = c35652nzR.getArguments();
        if (arguments != null && (string = arguments.getString("id")) != null) {
            return string;
        }
        java.lang.String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
        this.KWHzl = null;
    }

    private final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AddContactDialogFragment$internalDismiss$1(this, null), 3, null);
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AddContactDialogFragment$internalCancel$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        java.lang.String displayName$default;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        int i = C35399nuc.LoaderManager.zuBGHE;
        RelationInfo value = EZpvd().OLrzqt().getValue();
        if (value != null && (displayName$default = C44157sFk.getDisplayName$default(value, null, 1, null)) != null) {
            str = displayName$default;
        }
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", str))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.zsXlph), new View.OnClickListener() { // from class: o.nzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35652nzR.EZpvd(this.KWHzl, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OqFWZa), new View.OnClickListener() { // from class: o.nAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35652nzR.copydefault(this.copydefault, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void EZpvd(C35652nzR c35652nzR, android.view.View view) {
        c35652nzR.OLrzqt = "ACTION_ADD_CONTACT";
        c35652nzR.KWHzl = null;
        c35652nzR.EZpvd().AEQbTJ();
    }

    public static final void copydefault(C35652nzR c35652nzR, android.view.View view) {
        c35652nzR.AEQbTJ();
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        pUU.EZpvd("AddContactConfirmDialogFragment", "onDismiss: lastAction=" + this.OLrzqt + ", lastAddContactResult=" + this.KWHzl);
        FragmentKt.setFragmentResult(this, copydefault(), BundleKt.bundleOf(C56390yDp.OLrzqt(ActionActivity.KEY_ACTION, this.OLrzqt), C56390yDp.OLrzqt("KEY_ADD_CONTACT_RESULT", this.KWHzl)));
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.OLrzqt = "ACTION_CANCEL";
        pUU.EZpvd("AddContactConfirmDialogFragment", "onCancel: lastAction=ACTION_CANCEL, lastAddContactResult=" + this.KWHzl);
        FragmentKt.setFragmentResult(this, copydefault(), BundleKt.bundleOf(C56390yDp.OLrzqt(ActionActivity.KEY_ACTION, this.OLrzqt), C56390yDp.OLrzqt("KEY_ADD_CONTACT_RESULT", this.KWHzl)));
        super.onCancel(dialogInterface);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        RelationInfo relationInfo = arguments != null ? (RelationInfo) arguments.getParcelable("info") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString("groupId") : null;
        if (bundle == null) {
            EZpvd().copydefault(relationInfo, string);
        }
        EZpvd().EZpvd().observe(this, new Activity(new Function1() { // from class: o.nzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35652nzR.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        EZpvd().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.nzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35652nzR.KWHzl(this.copydefault, (C33632nAb.TaskDescription) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C35652nzR c35652nzR, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c35652nzR.showLoading();
        } else {
            c35652nzR.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C35652nzR c35652nzR, C33632nAb.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        pUU.EZpvd("AddContactConfirmDialogFragment", "addContactResult: " + taskDescription);
        if (taskDescription instanceof C33632nAb.TaskDescription.Application) {
            c35652nzR.copydefault((C33632nAb.TaskDescription.Application) taskDescription);
        } else if (taskDescription instanceof C33632nAb.TaskDescription.StateListAnimator) {
            c35652nzR.OLrzqt((C33632nAb.TaskDescription.StateListAnimator) taskDescription);
        } else {
            if (!(taskDescription instanceof C33632nAb.TaskDescription.C0888TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            c35652nzR.AEQbTJ((C33632nAb.TaskDescription.C0888TaskDescription) taskDescription);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(C33632nAb.TaskDescription.Application application) {
        C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.OcIXYQ, 0, 1, (java.lang.Object) null);
        this.OLrzqt = "ACTION_ADD_CONTACT";
        this.KWHzl = application.AEQbTJ();
        OLrzqt();
    }

    public final void OLrzqt(C33632nAb.TaskDescription.StateListAnimator stateListAnimator) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.AhwBna);
        java.lang.String strCopydefault = C44157sFk.copydefault(stateListAnimator.EZpvd());
        if (strCopydefault != null) {
            strAYXKKw = strCopydefault;
        }
        C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (java.lang.Object) null);
        this.OLrzqt = "ACTION_ADD_CONTACT";
        this.KWHzl = null;
        OLrzqt();
    }

    public final void AEQbTJ(C33632nAb.TaskDescription.C0888TaskDescription c0888TaskDescription) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.AhwBna);
        java.lang.String strCopydefault = C44157sFk.copydefault(c0888TaskDescription.KWHzl());
        if (strCopydefault != null) {
            C35659nzY c35659nzYKWHzl = C35659nzY.Companion.KWHzl("FRAGMENT_REQUEST_KEY_UNABLE_TO_ADD_CONTACT", strCopydefault);
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c35659nzYKWHzl.show(childFragmentManager, C35659nzY.class.getSimpleName());
            FragmentKt.setFragmentResultListener(c35659nzYKWHzl, "FRAGMENT_REQUEST_KEY_UNABLE_TO_ADD_CONTACT", new Function2() { // from class: o.nzX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C35652nzR.KWHzl(this.copydefault, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            return;
        }
        C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (java.lang.Object) null);
        this.OLrzqt = "ACTION_ADD_CONTACT";
        this.KWHzl = null;
        OLrzqt();
    }

    public static final Unit KWHzl(C35652nzR c35652nzR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString(ActionActivity.KEY_ACTION);
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1779047261) {
                if (iHashCode == -1179462705 && string.equals("ACTION_VIEW_CONTACT")) {
                    c35652nzR.OLrzqt = "ACTION_ADD_CONTACT";
                    c35652nzR.KWHzl = null;
                    c35652nzR.OLrzqt();
                }
            } else if (string.equals("ACTION_CANCEL")) {
                c35652nzR.OLrzqt = "ACTION_ADD_CONTACT";
                c35652nzR.KWHzl = null;
                c35652nzR.OLrzqt();
            }
        }
        return Unit.INSTANCE;
    }
}
