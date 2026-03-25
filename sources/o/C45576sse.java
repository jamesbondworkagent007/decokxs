package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.feedback.FeedbackApproveDialogFragment$confirm$1;
import com.okinc.okex.feedback.FeedbackApproveDialogFragment$initViewModel$1;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45576sse extends AbstractC45602stD {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ssa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C45576sse.AEQbTJ(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC47377tor copydefault;

    public C45576sse() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FeedbackListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.feedback.FeedbackApproveDialogFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.feedback.FeedbackApproveDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.feedback.FeedbackApproveDialogFragment$special$$inlined$activityViewModels$default$3
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
    public final FeedbackListViewModel AhwBna() {
        return (FeedbackListViewModel) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.stD.OLrzqt()V */
    public final int OLrzqt() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int AEQbTJ(C45576sse c45576sse) {
        android.os.Bundle arguments = c45576sse.getArguments();
        if (arguments != null) {
            return arguments.getInt("id");
        }
        return 0;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(0);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.ssi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C45576sse.valueOf(this.KWHzl, view);
            }
        });
    }

    public static final void valueOf(C45576sse c45576sse, android.view.View view) {
        c45576sse.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC47377tor abstractC47377torOLrzqt = AbstractC47377tor.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(abstractC47377torOLrzqt, "");
        this.copydefault = abstractC47377torOLrzqt;
        AYXKKw();
    }

    private final void AYXKKw() {
        java.lang.String string;
        AbstractC47377tor abstractC47377tor = this.copydefault;
        if (abstractC47377tor != null) {
            abstractC47377tor.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ssj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45576sse.AEQbTJ(this.AEQbTJ, view);
                }
            });
            abstractC47377tor.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ssf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45576sse.copydefault(this.copydefault, view);
                }
            });
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("title")) == null) {
                string = "";
            }
            abstractC47377tor.EZpvd.setText(C33069mpW.copydefault(this, C47315tni.PendingIntent.tIwhY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("title", string))));
        }
        djBIcL();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.ssg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45576sse.valueOf(this.EZpvd);
                }
            });
        }
    }

    public static final void AEQbTJ(C45576sse c45576sse, android.view.View view) {
        c45576sse.dismissAllowingStateLoss();
    }

    public static final void copydefault(C45576sse c45576sse, android.view.View view) {
        c45576sse.valueOf();
    }

    public static final void valueOf(C45576sse c45576sse) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45576sse, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FeedbackApproveDialogFragment$initViewModel$1(this, null), 3, null);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FeedbackApproveDialogFragment$confirm$1(this, null), 3, null);
    }

    public final void EZpvd(int i) {
        AhwBna().copydefault(OLrzqt(), i);
    }
}
