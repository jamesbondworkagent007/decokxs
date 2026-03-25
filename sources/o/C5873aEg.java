package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5873aEg extends AbstractC5813aDZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public Function0<Unit> AhwBna;
    public Function0<Unit> valueOf;

    /* JADX INFO: renamed from: o.aEg$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aEg$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C5873aEg newInstance$default(StateListAnimator stateListAnimator, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return stateListAnimator.KWHzl(function0, function02);
        }

        public final C5873aEg KWHzl(Function0<Unit> function0, Function0<Unit> function02) {
            C5873aEg c5873aEg = new C5873aEg();
            c5873aEg.AhwBna = function0;
            c5873aEg.valueOf = function02;
            return c5873aEg;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
        setCancelable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8261azR c8261azRCopydefault = C8261azR.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        android.widget.ImageView imageView = c8261azRCopydefault.KWHzl;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        android.widget.ImageView imageView2 = c8261azRCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        showStatusLottieAnimation$default(this, imageView2, C52761wXj.PendingIntent.valueOf, 0, 2, null);
        C52794wYp c52794wYp = c8261azRCopydefault.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c8261azRCopydefault.EZpvd;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(C5873aEg c5873aEg, android.widget.ImageView imageView, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c5873aEg.KWHzl(imageView, i, i2);
    }

    private final void KWHzl(final android.widget.ImageView imageView, @androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(imageView.getContext(), i).addListener(new LottieListener() { // from class: o.aEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C5873aEg.KWHzl(imageView, i2, (LottieComposition) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(android.widget.ImageView imageView, int i, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }

    /* JADX INFO: renamed from: o.aEg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5873aEg KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C5873aEg c5873aEg) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c5873aEg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C5873aEg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C5873aEg c5873aEg) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c5873aEg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                Function0 function0 = this.copydefault.valueOf;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aEg$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C5873aEg OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5873aEg c5873aEg) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c5873aEg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                Function0 function0 = this.OLrzqt.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
