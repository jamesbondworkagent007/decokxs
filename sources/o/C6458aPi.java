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

/* JADX INFO: renamed from: o.aPi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6458aPi extends AbstractC6453aPd {
    public Function0<Unit> AhwBna;
    public Function0<Unit> djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.aPi$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aPi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aPi$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C6458aPi newInstance$default(TaskDescription taskDescription, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return taskDescription.KWHzl(function0, function02);
        }

        public final C6458aPi KWHzl(Function0<Unit> function0, Function0<Unit> function02) {
            C6458aPi c6458aPi = new C6458aPi();
            c6458aPi.djBIcL = function0;
            c6458aPi.AhwBna = function02;
            return c6458aPi;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        dismissAllowingStateLoss();
        Function0<Unit> function0 = this.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8267azX c8267azXCopydefault = C8267azX.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        android.widget.ImageView imageView = c8267azXCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        showStatusLottieAnimation$default(this, imageView, C52761wXj.PendingIntent.AhwBna, 0, 2, null);
        C52794wYp c52794wYp = c8267azXCopydefault.AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c8267azXCopydefault.KWHzl;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(C6458aPi c6458aPi, android.widget.ImageView imageView, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c6458aPi.EZpvd(imageView, i, i2);
    }

    private final void EZpvd(final android.widget.ImageView imageView, @androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(imageView.getContext(), i).addListener(new LottieListener() { // from class: o.aPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C6458aPi.EZpvd(imageView, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void EZpvd(android.widget.ImageView imageView, int i, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }

    /* JADX INFO: renamed from: o.aPi$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C6458aPi AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6458aPi c6458aPi) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c6458aPi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                Function0 function0 = this.AEQbTJ.djBIcL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aPi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C6458aPi OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6458aPi c6458aPi) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c6458aPi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                Function0 function0 = this.OLrzqt.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
