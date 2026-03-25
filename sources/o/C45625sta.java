package o;

import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.feedback.FeedbackRejectDialogFragment$confirm$1;
import com.okinc.okex.feedback.FeedbackRejectDialogFragment$initViewModel$1;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45625sta extends AbstractC45606stH {
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC47382tow KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ssY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C45625sta.djBIcL(this.AEQbTJ));
        }
    });

    public C45625sta() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FeedbackListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.feedback.FeedbackRejectDialogFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.feedback.FeedbackRejectDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.feedback.FeedbackRejectDialogFragment$special$$inlined$activityViewModels$default$3
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
    public final FeedbackListViewModel gEmmrt() {
        return (FeedbackListViewModel) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AYXKKw() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int djBIcL(C45625sta c45625sta) {
        android.os.Bundle arguments = c45625sta.getArguments();
        if (arguments != null) {
            return arguments.getInt("id");
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47382tow abstractC47382towCopydefault = AbstractC47382tow.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47382towCopydefault, "");
        this.KWHzl = abstractC47382towCopydefault;
        djBIcL();
        android.view.View root = abstractC47382towCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final void djBIcL() {
        java.lang.String string;
        AbstractC47382tow abstractC47382tow = this.KWHzl;
        if (abstractC47382tow != null) {
            abstractC47382tow.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ssZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45625sta.copydefault(this.AEQbTJ, view);
                }
            });
            OKEditText oKEditText = abstractC47382tow.KWHzl;
            java.lang.String str = "";
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            oKEditText.addTextChangedListener(new StateListAnimator(abstractC47382tow));
            abstractC47382tow.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.stb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45625sta.OLrzqt(this.OLrzqt, view);
                }
            });
            android.os.Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("title")) != null) {
                str = string;
            }
            abstractC47382tow.AYXKKw.setText(C33069mpW.copydefault(this, C47315tni.PendingIntent.zlvcHA, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("title", str))));
        }
        AhwBna();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.stc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45625sta.AYXKKw(this.OLrzqt);
                }
            });
        }
    }

    public static final void copydefault(C45625sta c45625sta, android.view.View view) {
        c45625sta.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(C45625sta c45625sta, android.view.View view) {
        c45625sta.OLrzqt();
    }

    public static final void AYXKKw(C45625sta c45625sta) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45625sta, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new FeedbackRejectDialogFragment$initViewModel$1(this, null));
    }

    /* JADX INFO: renamed from: o.sta$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ AbstractC47382tow OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(AbstractC47382tow abstractC47382tow) {
            this.OLrzqt = abstractC47382tow;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            this.OLrzqt.copydefault.setEnabled(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) java.lang.String.valueOf(editable)));
        }
    }

    private final void OLrzqt() {
        showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FeedbackRejectDialogFragment$confirm$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(int i) {
        gEmmrt().copydefault(AYXKKw(), i);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        WindowManager.LayoutParams attributes;
        android.view.Window window;
        android.view.Window window2;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window2 = dialog.getWindow()) == null || (attributes = window2.getAttributes()) == null) {
            attributes = null;
        } else {
            attributes.gravity = 80;
            attributes.height = -2;
            attributes.width = -1;
        }
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setAttributes(attributes);
    }
}
