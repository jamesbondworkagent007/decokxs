package o;

import android.animation.Animator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$Companion$show$1;
import com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$onViewCreated$4$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tAI extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public tNS AEQbTJ;
    public OrbitBeanResp EZpvd;
    public Function1<? super java.lang.Boolean, Unit> KWHzl;
    public final boolean copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    public final Function1<java.lang.Boolean, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super java.lang.Boolean, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tAI$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$default(ActionBar actionBar, FragmentActivity fragmentActivity, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            actionBar.copydefault(fragmentActivity, function1);
        }

        public final void copydefault(@NotNull FragmentActivity fragmentActivity, Function1<? super java.lang.Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OrbitVipUpgradeBottomSheet$Companion$show$1(fragmentActivity, function1, null), 3, null);
        }
    }

    public tAI() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tAE.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$special$$inlined$viewModels$default$5
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

    public final tAE EZpvd() {
        return (tAE) this.gEmmrt.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = C46388tSm.Companion.KWHzl().EZpvd();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.AEQbTJ = tNS.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        wYF wyf2;
        wYF wyf3;
        C52794wYp c52794wYpCopydefault2;
        android.widget.TextView textView;
        wYF wyf4;
        C52794wYp c52794wYpCopydefault3;
        android.widget.TextView textView2;
        AppCompatTextView appCompatTextView;
        android.widget.TextView textView3;
        AppCompatTextView appCompatTextView2;
        android.widget.TextView textView4;
        wYF wyf5;
        C52794wYp c52794wYpCopydefault4;
        android.widget.TextView textView5;
        LottieAnimationView lottieAnimationView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(view);
        tNS tns = this.AEQbTJ;
        if (tns != null && (lottieAnimationView = tns.OLrzqt) != null) {
            lottieAnimationView.setAnimation(C47501trL.PendingIntent.AhwBna);
            lottieAnimationView.setMinFrame(0);
            lottieAnimationView.setMaxFrame(89);
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.addAnimatorListener(new TaskDescription(lottieAnimationView));
            lottieAnimationView.playAnimation();
        }
        tNS tns2 = this.AEQbTJ;
        if (tns2 != null && (textView5 = tns2.AEQbTJ) != null) {
            textView5.setOnClickListener(new Activity(textView5, 1000L, this));
        }
        OrbitBeanResp orbitBeanResp = this.EZpvd;
        if (orbitBeanResp != null) {
            if (orbitBeanResp.getVipLevel() <= 0) {
                C32866mlf.onEvent$default("Orbit_UpgradeToOrbiterPlus_Unqualified_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                tNS tns3 = this.AEQbTJ;
                if (tns3 != null && (wyf5 = tns3.EZpvd) != null && (c52794wYpCopydefault4 = wyf5.copydefault()) != null) {
                    c52794wYpCopydefault4.setEnabled(false);
                }
                tNS tns4 = this.AEQbTJ;
                if (tns4 != null && (textView4 = tns4.AEQbTJ) != null) {
                    textView4.setText(C33070mpX.AYXKKw(C47501trL.Fragment.awiJhF));
                }
                tNS tns5 = this.AEQbTJ;
                if (tns5 != null && (appCompatTextView2 = tns5.isConnected) != null) {
                    appCompatTextView2.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DPhTBN));
                }
                tNS tns6 = this.AEQbTJ;
                if (tns6 != null && (textView3 = tns6.gEmmrt) != null) {
                    textView3.setVisibility(C46388tSm.Companion.KWHzl().ejfBZ() ? 0 : 8);
                }
            } else {
                C32866mlf.onEvent$default("Orbit_UpgradeToOrbiterPlus_Qualified_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                tNS tns7 = this.AEQbTJ;
                if (tns7 != null && (appCompatTextView = tns7.isConnected) != null) {
                    appCompatTextView.setText(C33070mpX.AYXKKw(C47501trL.Fragment.zlvcHA));
                }
                tNS tns8 = this.AEQbTJ;
                if (tns8 != null && (textView2 = tns8.AEQbTJ) != null) {
                    textView2.setText(C33070mpX.AYXKKw(C47501trL.Fragment.fsSxsn));
                }
                tNS tns9 = this.AEQbTJ;
                if (tns9 != null && (wyf4 = tns9.EZpvd) != null && (c52794wYpCopydefault3 = wyf4.copydefault()) != null) {
                    c52794wYpCopydefault3.setEnabled(true);
                }
                tNS tns10 = this.AEQbTJ;
                if (tns10 != null && (textView = tns10.gEmmrt) != null) {
                    textView.setVisibility(8);
                }
            }
        }
        tNS tns11 = this.AEQbTJ;
        if (tns11 != null && (wyf3 = tns11.EZpvd) != null && (c52794wYpCopydefault2 = wyf3.copydefault()) != null) {
            c52794wYpCopydefault2.setOKDSType(257);
        }
        tNS tns12 = this.AEQbTJ;
        if (tns12 != null && (wyf2 = tns12.EZpvd) != null) {
            wyf2.setPrimaryText(C33070mpX.AYXKKw(C47501trL.Fragment.YqksP));
        }
        tNS tns13 = this.AEQbTJ;
        if (tns13 == null || (wyf = tns13.EZpvd) == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
    }

    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ LottieAnimationView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription(LottieAnimationView lottieAnimationView) {
            this.EZpvd = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.EZpvd.removeAllAnimatorListeners();
            this.EZpvd.setMaxFrame(269);
            this.EZpvd.setMinFrame(90);
            this.EZpvd.setRepeatCount(-1);
            this.EZpvd.playAnimation();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ tAI EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, tAI tai) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = tai;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_UpgradeToOrbiterPlus_Unqualified_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                kOH koh = (kOH) C43248rlh.KWHzl.AEQbTJ(kOH.class);
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                koh.KWHzl(fragmentActivityRequireActivity);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ tAI EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, tAI tai) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = tai;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_UpgradeToOrbiterPlus_Qualified_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new OrbitVipUpgradeBottomSheet$onViewCreated$4$1(this.EZpvd, null), 3, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        LottieAnimationView lottieAnimationView;
        super.onResume();
        tNS tns = this.AEQbTJ;
        if (tns == null || (lottieAnimationView = tns.OLrzqt) == null) {
            return;
        }
        lottieAnimationView.resumeAnimation();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LottieAnimationView lottieAnimationView;
        super.onPause();
        tNS tns = this.AEQbTJ;
        if (tns == null || (lottieAnimationView = tns.OLrzqt) == null) {
            return;
        }
        lottieAnimationView.pauseAnimation();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        LottieAnimationView lottieAnimationView;
        tNS tns = this.AEQbTJ;
        if (tns != null && (lottieAnimationView = tns.OLrzqt) != null) {
            lottieAnimationView.removeAllAnimatorListeners();
            lottieAnimationView.cancelAnimation();
        }
        super.onDestroyView();
    }

    public final void KWHzl(android.view.View view) {
        int color = requireContext().getResources().getColor(C52761wXj.Activity.djBIcL);
        float dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fvQaOB);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f});
        view.setBackground(gradientDrawable);
        setNavigationBarColor(color);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
    }
}
