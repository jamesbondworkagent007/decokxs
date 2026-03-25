package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.paymentmethod.buy.BuyPaymentMethodViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.lKH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lOF extends C33005moL {
    public final InterfaceC56387yDm AhwBna;
    public AbstractC31480lun copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public java.lang.String OLrzqt = "";
    public java.lang.String EZpvd = "";
    public java.lang.String KWHzl = "";

    public lOF() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuyPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.view.InsufficientBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.view.InsufficientBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.view.InsufficientBottomSheet$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final BuyPaymentMethodViewModel AEQbTJ() {
        return (BuyPaymentMethodViewModel) this.AhwBna.getValue();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ lOF newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            return actionBar.KWHzl(str, str2, str3);
        }

        public final lOF KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            lOF lof = new lOF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("INSUFFICIENT_DIALOG_TITLE", str);
            bundle.putString("INSUFFICIENT_DIALOG_BODY", str2);
            bundle.putString("INSUFFICIENT_DIALOG_CTA", str3);
            lof.setArguments(bundle);
            return lof;
        }
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (viewGroup = (android.view.ViewGroup) window.findViewById(com.google.android.material.R.id.design_bottom_sheet)) == null) {
            return;
        }
        viewGroup.setBackgroundResource(C52761wXj.TaskDescription.dxcTrN);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        copydefault();
        AbstractC31480lun abstractC31480lun = (AbstractC31480lun) DataBindingUtil.inflate(layoutInflater, C31351lsQ.ActionBar.fJNWhG, null, false);
        this.copydefault = abstractC31480lun;
        if (abstractC31480lun != null) {
            return abstractC31480lun.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC31480lun abstractC31480lun = this.copydefault;
        if (abstractC31480lun != null) {
            abstractC31480lun.AEQbTJ.setText(this.OLrzqt);
            abstractC31480lun.copydefault.setText(this.EZpvd);
            abstractC31480lun.KWHzl.setText(this.KWHzl);
            C52794wYp c52794wYp = abstractC31480lun.KWHzl;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        }
    }

    private final void copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("INSUFFICIENT_DIALOG_TITLE");
            if (string == null) {
                string = "";
            }
            this.OLrzqt = string;
            java.lang.String string2 = arguments.getString("INSUFFICIENT_DIALOG_BODY");
            if (string2 == null) {
                string2 = "";
            }
            this.EZpvd = string2;
            java.lang.String string3 = arguments.getString("INSUFFICIENT_DIALOG_CTA");
            this.KWHzl = string3 != null ? string3 : "";
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ lOF KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, lOF lof) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = lof;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ().onEventTrigger(lKH.StateListAnimator.TaskDescription.copydefault);
                this.KWHzl.dismiss();
            }
        }
    }
}
