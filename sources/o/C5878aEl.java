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

/* JADX INFO: renamed from: o.aEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5878aEl extends AbstractC5867aEa {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public Function0<Unit> AYXKKw;
    public Function0<Unit> djBIcL;

    /* JADX INFO: renamed from: o.aEl$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aEl$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C5878aEl newInstance$default(Application application, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return application.KWHzl(function0, function02);
        }

        public final C5878aEl KWHzl(Function0<Unit> function0, Function0<Unit> function02) {
            C5878aEl c5878aEl = new C5878aEl();
            c5878aEl.AYXKKw = function0;
            c5878aEl.djBIcL = function02;
            return c5878aEl;
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
        C8265azV c8265azVAEQbTJ = C8265azV.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        android.widget.ImageView imageView = c8265azVAEQbTJ.copydefault;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        android.widget.ImageView imageView2 = c8265azVAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        showStatusLottieAnimation$default(this, imageView2, C52761wXj.PendingIntent.AhwBna, 0, 2, null);
        C52794wYp c52794wYp = c8265azVAEQbTJ.KWHzl;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c8265azVAEQbTJ.OLrzqt;
        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(C5878aEl c5878aEl, android.widget.ImageView imageView, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c5878aEl.copydefault(imageView, i, i2);
    }

    private final void copydefault(final android.widget.ImageView imageView, @androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(imageView.getContext(), i).addListener(new LottieListener() { // from class: o.aEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C5878aEl.copydefault(imageView, i2, (LottieComposition) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(android.widget.ImageView imageView, int i, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }

    /* JADX INFO: renamed from: o.aEl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C5878aEl EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5878aEl c5878aEl) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c5878aEl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
                Function0 function0 = this.EZpvd.djBIcL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aEl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5878aEl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C5878aEl c5878aEl) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c5878aEl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                Function0 function0 = this.OLrzqt.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aEl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C5878aEl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5878aEl c5878aEl) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c5878aEl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
