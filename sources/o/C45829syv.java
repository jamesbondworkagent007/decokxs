package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.syv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45829syv extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final int KWHzl = C47315tni.ActionBar.DTwDnp;
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC47337toD copydefault;

    /* JADX INFO: renamed from: o.syv$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public C45829syv() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RatingSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.core.submit.footer.RatingSubmitFooterFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.core.submit.footer.RatingSubmitFooterFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.rating.ui.core.submit.footer.RatingSubmitFooterFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.syv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C45829syv copydefault() {
            return new C45829syv();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RatingSubmitViewModel copydefault() {
        return (RatingSubmitViewModel) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47337toD abstractC47337toDCopydefault = AbstractC47337toD.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47337toDCopydefault, "");
        this.copydefault = abstractC47337toDCopydefault;
        android.view.View root = abstractC47337toDCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47337toD abstractC47337toD = this.copydefault;
        if (abstractC47337toD != null) {
            abstractC47337toD.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.syu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C45829syv.EZpvd(this.EZpvd, compoundButton, z);
                }
            });
            C52794wYp c52794wYp = abstractC47337toD.AEQbTJ;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 600L, this));
        }
        RatingSubmitViewModel ratingSubmitViewModelCopydefault = copydefault();
        ratingSubmitViewModelCopydefault.zLjUOn().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45829syv.EZpvd(this.copydefault, (RatingSubmitViewModel.IsAgreeToJoinResearchModel) obj);
            }
        }));
        ratingSubmitViewModelCopydefault.DbNXlk().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.syt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45829syv.AEQbTJ(this.KWHzl, (RatingSubmitViewModel.Activity) obj);
            }
        }));
        ratingSubmitViewModelCopydefault.wlaJM().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.sys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45829syv.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        view.post(new java.lang.Runnable() { // from class: o.syB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45829syv.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C45829syv c45829syv, android.widget.CompoundButton compoundButton, boolean z) {
        c45829syv.copydefault().EZpvd(z);
    }

    public static final Unit EZpvd(C45829syv c45829syv, RatingSubmitViewModel.IsAgreeToJoinResearchModel isAgreeToJoinResearchModel) {
        c45829syv.KWHzl(isAgreeToJoinResearchModel);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45829syv c45829syv, RatingSubmitViewModel.Activity activity) {
        c45829syv.KWHzl(activity);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45829syv c45829syv, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        c45829syv.EZpvd(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C45829syv c45829syv) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45829syv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    public final void KWHzl(RatingSubmitViewModel.IsAgreeToJoinResearchModel isAgreeToJoinResearchModel) {
        wYK wyk;
        AbstractC47337toD abstractC47337toD = this.copydefault;
        if (abstractC47337toD == null || (wyk = abstractC47337toD.KWHzl) == null) {
            return;
        }
        wyk.setVisibility(isAgreeToJoinResearchModel != null ? 0 : 8);
        wyk.setText(isAgreeToJoinResearchModel != null ? isAgreeToJoinResearchModel.OLrzqt() : null);
        wyk.setChecked(isAgreeToJoinResearchModel != null ? isAgreeToJoinResearchModel.copydefault() : false);
    }

    public final void KWHzl(RatingSubmitViewModel.Activity activity) {
        C52794wYp c52794wYp;
        java.lang.String string;
        AbstractC47337toD abstractC47337toD = this.copydefault;
        if (abstractC47337toD == null || (c52794wYp = abstractC47337toD.AEQbTJ) == null) {
            return;
        }
        c52794wYp.setVisibility(activity != null ? 0 : 8);
        boolean z = activity instanceof RatingSubmitViewModel.Activity.ActionBar;
        if (z) {
            string = getString(C47315tni.PendingIntent.DWgRXt);
        } else {
            string = activity instanceof RatingSubmitViewModel.Activity.C0550Activity ? getString(C47315tni.PendingIntent.fHqPtx) : null;
        }
        c52794wYp.setText(string);
        c52794wYp.setEnabled((!z && (activity instanceof RatingSubmitViewModel.Activity.C0550Activity)) ? ((RatingSubmitViewModel.Activity.C0550Activity) activity).AEQbTJ() : true);
    }

    public final void EZpvd(boolean z) {
        C52794wYp c52794wYp;
        AbstractC47337toD abstractC47337toD = this.copydefault;
        if (abstractC47337toD == null || (c52794wYp = abstractC47337toD.AEQbTJ) == null) {
            return;
        }
        if (z) {
            C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        } else {
            c52794wYp.fIwbmz();
        }
    }

    /* JADX INFO: renamed from: o.syv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C45829syv OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C45829syv c45829syv) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c45829syv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                RatingSubmitViewModel.Activity value = this.OLrzqt.copydefault().DbNXlk().getValue();
                if (value instanceof RatingSubmitViewModel.Activity.C0550Activity) {
                    this.OLrzqt.copydefault().DTwDnp();
                } else if (value instanceof RatingSubmitViewModel.Activity.ActionBar) {
                    this.OLrzqt.copydefault().gEmmrt();
                }
            }
        }
    }
}
