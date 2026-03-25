package o;

import android.animation.Animator;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.common.view.DefiBaseCreateWalletLoadingDFragment$showFragment$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14702dqT extends AbstractC57671ymn {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.lang.String AYXKKw;
    public Job AkhnZx;
    public java.lang.Runnable DbNXlk;
    public boolean EZpvd;
    public int gEmmrt;
    public java.lang.Float AEQbTJ = java.lang.Float.valueOf(0.9999f);
    public final int valueOf = -1;
    public final int copydefault = 1;
    public final int djBIcL = 2000;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.dqP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC14702dqT.EZpvd();
        }
    });
    public boolean OLrzqt = true;
    public long AhwBna = java.lang.System.currentTimeMillis();

    public abstract android.widget.TextView AYXKKw();

    @Override // o.C33003moJ
    public boolean AhwBna() {
        return false;
    }

    public abstract long DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AYXKKw = str;
    }

    public abstract C55113xdn djBIcL();

    public abstract int gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.EZpvd;
    }

    public abstract android.widget.TextView valueOf();

    /* JADX INFO: renamed from: o.dqT$Activity */
    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("DefiCreateWalletLoadingDFragment", "showFragmentScope: CoroutineExceptionHandler", th);
        }
    }

    public final CoroutineScope values() {
        return (CoroutineScope) this.values.getValue();
    }

    public static final CoroutineScope EZpvd() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new Activity(CoroutineExceptionHandler.Key)));
    }

    /* JADX INFO: renamed from: o.dqT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC57671ymn, o.C33003moJ
    public void AEQbTJ() {
        setStyle(0, C13754dXa.LoaderManager.values);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        KWHzl(false);
        if (getContext() != null) {
            if (getResources().getConfiguration().getLayoutDirection() == 1) {
                android.widget.TextView textViewValueOf = valueOf();
                if (textViewValueOf != null) {
                    textViewValueOf.setTextDirection(4);
                }
                android.widget.TextView textViewAYXKKw = AYXKKw();
                if (textViewAYXKKw != null) {
                    textViewAYXKKw.setTextDirection(4);
                }
            } else {
                android.widget.TextView textViewValueOf2 = valueOf();
                if (textViewValueOf2 != null) {
                    textViewValueOf2.setTextDirection(5);
                }
                android.widget.TextView textViewAYXKKw2 = AYXKKw();
                if (textViewAYXKKw2 != null) {
                    textViewAYXKKw2.setTextDirection(5);
                }
            }
        }
        EZpvd(C52761wXj.Activity.aBDePw);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        showLoadingAnim$default(this, null, 1, null);
        view.post(new java.lang.Runnable() { // from class: o.dqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC14702dqT.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(AbstractC14702dqT abstractC14702dqT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC14702dqT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Job job = this.AkhnZx;
        pUU.EZpvd("DefiCreateWalletLoadingDFragment", "showFragment, showJob?.isActive=" + (job != null ? java.lang.Boolean.valueOf(job.isActive()) : null));
        Job job2 = this.AkhnZx;
        if (job2 == null || !job2.isActive()) {
            long jDbNXlk = DbNXlk();
            if (jDbNXlk > 0) {
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(values(), null, null, new DefiBaseCreateWalletLoadingDFragment$showFragment$1(jDbNXlk, this, fragmentManager, str, null), 3, null);
                jobLaunch$default.invokeOnCompletion(new Function1() { // from class: o.dqQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC14702dqT.AEQbTJ((java.lang.Throwable) obj);
                    }
                });
                this.AkhnZx = jobLaunch$default;
                return;
            }
            pUU.EZpvd("DefiCreateWalletLoadingDFragment", "showFragment: directly");
            try {
                if (!fragmentManager.isStateSaved()) {
                    show(fragmentManager, str);
                    fragmentManager.executePendingTransactions();
                } else {
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    fragmentTransactionBeginTransaction.add(this, str);
                    fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        if (th != null) {
            pUU.AEQbTJ("DefiCreateWalletLoadingDFragment", "showFragment: showJob completed exceptionally", th);
        } else {
            pUU.EZpvd("DefiCreateWalletLoadingDFragment", "showFragment: showJob completed normally");
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        Job job = this.AkhnZx;
        pUU.EZpvd("DefiCreateWalletLoadingDFragment", "dismissFragment, showJob?.isActive=" + (job != null ? java.lang.Boolean.valueOf(job.isActive()) : null));
        if (job != null && job.isActive()) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        } else {
            dismissAllowingStateLoss();
        }
    }

    public final void AkhnZx() {
        C55113xdn c55113xdnDjBIcL = djBIcL();
        if (c55113xdnDjBIcL != null) {
            c55113xdnDjBIcL.pauseAnimation();
        }
    }

    public final void fetchVPNInfo() {
        C55113xdn c55113xdnDjBIcL = djBIcL();
        if (c55113xdnDjBIcL != null) {
            c55113xdnDjBIcL.resumeAnimation();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        super.onResume();
        if (this.OLrzqt) {
            int statusBarColor = 0;
            this.OLrzqt = false;
            FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                statusBarColor = window.getStatusBarColor();
            }
            this.gEmmrt = statusBarColor;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            C33567myr.AEQbTJ(activity2, C52761wXj.Activity.EZpvd);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dqT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startAnim$default(AbstractC14702dqT abstractC14702dqT, java.lang.String str, int i, int i2, Function0 function0, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAnim");
        }
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        abstractC14702dqT.AEQbTJ(str, i, i2, function0);
    }

    public final void AEQbTJ(java.lang.String str, int i, int i2, Function0<Unit> function0) {
        pUU.EZpvd("DefiCreateWalletLoadingDFragment", "startAnim: loadingText=" + str + ", repeatCount=" + i + ", repeatMode=" + i2);
        C55113xdn c55113xdnDjBIcL = djBIcL();
        if (c55113xdnDjBIcL != null) {
            c55113xdnDjBIcL.removeAllAnimatorListeners();
        }
        C55113xdn c55113xdnDjBIcL2 = djBIcL();
        if (c55113xdnDjBIcL2 != null) {
            c55113xdnDjBIcL2.cancelAnimation();
        }
        android.widget.TextView textViewValueOf = valueOf();
        if (textViewValueOf != null) {
            textViewValueOf.setText(str);
        }
        C55113xdn c55113xdnDjBIcL3 = djBIcL();
        if (c55113xdnDjBIcL3 != null) {
            c55113xdnDjBIcL3.setAnimation(gEmmrt());
        }
        C55113xdn c55113xdnDjBIcL4 = djBIcL();
        if (c55113xdnDjBIcL4 != null) {
            c55113xdnDjBIcL4.setRepeatMode(i2);
        }
        C55113xdn c55113xdnDjBIcL5 = djBIcL();
        if (c55113xdnDjBIcL5 != null) {
            c55113xdnDjBIcL5.setRepeatCount(i);
        }
        C55113xdn c55113xdnDjBIcL6 = djBIcL();
        if (c55113xdnDjBIcL6 != null) {
            c55113xdnDjBIcL6.playAnimation();
        }
        C55113xdn c55113xdnDjBIcL7 = djBIcL();
        if (c55113xdnDjBIcL7 != null) {
            c55113xdnDjBIcL7.addAnimatorListener(new Application(function0));
        }
    }

    /* JADX INFO: renamed from: o.dqT$Application */
    public static final class Application implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

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

        public Application(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function0<Unit> function0 = this.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dqT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showLoadingAnim$default(AbstractC14702dqT abstractC14702dqT, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadingAnim");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        abstractC14702dqT.KWHzl((Function0<Unit>) function0);
    }

    public final void KWHzl(Function0<Unit> function0) {
        java.lang.String string = this.AYXKKw;
        if (string == null) {
            string = getString(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0);
        } else {
            Intrinsics.copydefault((java.lang.Object) string);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        AEQbTJ(string, this.valueOf, this.copydefault, function0);
        this.AhwBna = java.lang.System.currentTimeMillis();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dqT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSuccessAnim$default(AbstractC14702dqT abstractC14702dqT, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSuccessAnim");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        abstractC14702dqT.OLrzqt((Function0<Unit>) function0);
    }

    public final void OLrzqt(final Function0<Unit> function0) {
        pUU.EZpvd("DefiCreateWalletLoadingDFragment", "showSuccessAnim");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.AhwBna;
        long j2 = jCurrentTimeMillis - j;
        pUU.KWHzl("DefiCreateWalletLoadingDFragment", "showSuccessAnim: current=" + jCurrentTimeMillis + ", start=" + j + ", diff=" + j2);
        long j3 = (long) this.djBIcL;
        if (j2 > j3) {
            pUU.KWHzl("DefiCreateWalletLoadingDFragment", "showSuccessAnim: immediately");
            OLrzqt(this, function0);
            return;
        }
        long j4 = j3 - j2;
        pUU.KWHzl("DefiCreateWalletLoadingDFragment", "showSuccessAnim: delay=" + j4 + ", root == null: " + (getView() == null));
        this.DbNXlk = new java.lang.Runnable() { // from class: o.dqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC14702dqT.copydefault(this.AEQbTJ, function0);
            }
        };
        android.view.View view = getView();
        if (view != null) {
            java.lang.Runnable runnable = this.DbNXlk;
            Intrinsics.copydefault(runnable);
            view.postDelayed(runnable, j4);
        }
    }

    public static final void OLrzqt(AbstractC14702dqT abstractC14702dqT, Function0<Unit> function0) {
        pUU.EZpvd("DefiCreateWalletLoadingDFragment", "setSuccessAnim, context == null: " + (abstractC14702dqT.getContext() == null));
        if (abstractC14702dqT.getContext() == null || function0 == null) {
            return;
        }
        function0.invoke();
    }

    public static final void copydefault(AbstractC14702dqT abstractC14702dqT, Function0 function0) {
        pUU.KWHzl("DefiCreateWalletLoadingDFragment", "showSuccessAnim: after delayed");
        OLrzqt(abstractC14702dqT, (Function0<Unit>) function0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.view.View view;
        super.onDestroyView();
        java.lang.Runnable runnable = this.DbNXlk;
        if (runnable != null && (view = getView()) != null) {
            view.removeCallbacks(runnable);
        }
        this.DbNXlk = null;
        C55113xdn c55113xdnDjBIcL = djBIcL();
        if (c55113xdnDjBIcL != null) {
            c55113xdnDjBIcL.removeAllAnimatorListeners();
        }
        C55113xdn c55113xdnDjBIcL2 = djBIcL();
        if (c55113xdnDjBIcL2 != null) {
            c55113xdnDjBIcL2.cancelAnimation();
        }
        CoroutineScopeKt.cancel$default(values(), null, 1, null);
        FragmentActivity activity = getActivity();
        android.view.Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (window != null) {
            window.setStatusBarColor(this.gEmmrt);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            fragmentManager.beginTransaction().remove(this).commit();
            super.show(fragmentManager, str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
