package o;

import android.animation.Animator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35057noD extends AbstractC49393unh {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> EZpvd;
    public C42646raO copydefault;

    /* JADX INFO: renamed from: o.noD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.noD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.noD$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$OKMarket_market_impl$default(Application application, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            application.KWHzl(fragmentManager, function0);
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            if (fragmentManager.isStateSaved()) {
                pUU.valueOf("StockNewerGuideFragment", "Cannot show dialog after onSaveInstanceState, skipping");
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            C35057noD c35057noD = new C35057noD();
            c35057noD.EZpvd = function0;
            c35057noD.show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        SPUtils.put("has_showed_stock_guide" + C55697xoo.OLrzqt.gEmmrt(), java.lang.Boolean.TRUE);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        final java.lang.String strOLrzqt;
        android.content.res.Configuration configuration;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42646raO c42646raOCopydefault = C42646raO.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        LottieAnimationView lottieAnimationView = c42646raOCopydefault.AYXKKw;
        android.content.res.Resources resources = lottieAnimationView.getContext().getResources();
        java.lang.Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.uiMode & 48);
        if (numValueOf != null && numValueOf.intValue() == 32) {
            strOLrzqt = C27992kKx.copydefault.OLrzqt("stock_guide_dark.lottie");
        } else {
            strOLrzqt = C27992kKx.copydefault.OLrzqt("stock_guide.lottie");
        }
        lottieAnimationView.setFailureListener(new LottieListener() { // from class: o.noF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C35057noD.OLrzqt(strOLrzqt, (java.lang.Throwable) obj);
            }
        });
        lottieAnimationView.setAnimationFromUrl(strOLrzqt);
        lottieAnimationView.setMinAndMaxFrame(0, 359);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.addAnimatorListener(new ActionBar(lottieAnimationView, this));
        lottieAnimationView.playAnimation();
        C52794wYp c52794wYp = c42646raOCopydefault.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        this.copydefault = c42646raOCopydefault;
    }

    public static final void OLrzqt(java.lang.String str, java.lang.Throwable th) {
        pUU.copydefault("StockNewerGuideFragment", "Failed to load " + str + ": " + th.getMessage());
    }

    /* JADX INFO: renamed from: o.noD$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ C35057noD AEQbTJ;
        public final /* synthetic */ LottieAnimationView OLrzqt;

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

        public ActionBar(LottieAnimationView lottieAnimationView, C35057noD c35057noD) {
            this.OLrzqt = lottieAnimationView;
            this.AEQbTJ = c35057noD;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.removeAnimatorListener(this);
            if (!this.AEQbTJ.isAdded() || this.AEQbTJ.isDetached()) {
                return;
            }
            this.OLrzqt.setMinAndMaxFrame(60, 359);
            this.OLrzqt.setRepeatCount(-1);
            this.OLrzqt.playAnimation();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        LottieAnimationView lottieAnimationView;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C42646raO c42646raO = this.copydefault;
        if (c42646raO != null && (lottieAnimationView = c42646raO.AYXKKw) != null) {
            lottieAnimationView.cancelAnimation();
        }
        Function0<Unit> function0 = this.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        this.EZpvd = null;
    }

    /* JADX INFO: renamed from: o.noD$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C35057noD AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C35057noD c35057noD) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c35057noD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    sZQ.EZpvd.AEQbTJ(context, "Stock");
                }
                this.AEQbTJ.dismiss();
            }
        }
    }
}
