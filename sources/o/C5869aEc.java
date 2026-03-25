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

/* JADX INFO: renamed from: o.aEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5869aEc extends AbstractC5811aDX {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public Function0<Unit> gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX INFO: renamed from: o.aEc$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aEc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C5869aEc newInstance$default(Application application, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return application.EZpvd(function0, function02);
        }

        public final C5869aEc EZpvd(Function0<Unit> function0, Function0<Unit> function02) {
            C5869aEc c5869aEc = new C5869aEc();
            c5869aEc.valueOf = function0;
            c5869aEc.gEmmrt = function02;
            return c5869aEc;
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
        C8260azQ c8260azQKWHzl = C8260azQ.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        android.widget.ImageView imageView = c8260azQKWHzl.KWHzl;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        android.widget.ImageView imageView2 = c8260azQKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        showStatusLottieAnimation$default(this, imageView2, C52761wXj.PendingIntent.AhwBna, 0, 2, null);
        C52794wYp c52794wYp = c8260azQKWHzl.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c8260azQKWHzl.AEQbTJ;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(C5869aEc c5869aEc, android.widget.ImageView imageView, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c5869aEc.copydefault(imageView, i, i2);
    }

    public final void copydefault(final android.widget.ImageView imageView, @androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(imageView.getContext(), i).addListener(new LottieListener() { // from class: o.aEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C5869aEc.copydefault(imageView, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void copydefault(android.widget.ImageView imageView, int i, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }

    /* JADX INFO: renamed from: o.aEc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C5869aEc AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5869aEc c5869aEc) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c5869aEc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5869aEc EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C5869aEc c5869aEc) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c5869aEc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
                Function0 function0 = this.EZpvd.gEmmrt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aEc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C5869aEc AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5869aEc c5869aEc) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c5869aEc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                Function0 function0 = this.AEQbTJ.valueOf;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
