package o;

import com.okinc.uilab.loading.OKLoadingView$pendingStartAnim$1;
import com.okinc.uilab.loading.OKLoadingView$processLoadingShownQPL$1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55113xdn extends C55353xiO {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;
    public WeakReference<androidx.fragment.app.Fragment> AYXKKw;
    public boolean KWHzl;
    public boolean OLrzqt;
    public Job copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55113xdn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55113xdn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomizedRawResId() {
        setCustomizedRawResId$default(this, 0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomizedRawResId(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] com.airbnb.lottie.R.attr.lottieAnimationViewStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.xdn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55113xdn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? com.airbnb.lottie.R.attr.lottieAnimationViewStyle : i);
    }

    /* JADX INFO: renamed from: o.xdn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xdn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd(int i) {
            return i == C52761wXj.PendingIntent.isConnected || i == C52761wXj.PendingIntent.values || i == 0;
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55113xdn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.airbnb.lottie.R.styleable.LottieAnimationView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getResourceId(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_rawRes, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_rawRes);
        if (!typedArrayObtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_fileName) && !zHasValue) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(C52761wXj.ActionBar.hrNTAI, typedValue, true);
            setAnimation(typedValue.resourceId);
        }
        setRepeatCount(Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        if (getContentDescription() == null) {
            setContentDescription("loadingView");
        }
    }

    public final void setAutoMirrored(boolean z) {
        this.OLrzqt = z;
        AEQbTJ();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        setScaleX((this.OLrzqt && getLayoutDirection() == 1) ? -1.0f : 1.0f);
    }

    public static /* synthetic */ void showLoading$default(C55113xdn c55113xdn, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        c55113xdn.KWHzl(j);
    }

    public final void KWHzl(long j) {
        EZpvd(j);
        OLrzqt();
    }

    public final void copydefault() {
        super.setVisibility(8);
        cancelAnimation();
    }

    public static /* synthetic */ void setCustomizedRawResId$default(C55113xdn c55113xdn, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        c55113xdn.setCustomizedRawResId(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            KWHzl();
            return;
        }
        super.resumeAnimation();
        OLrzqt();
    }

    @Override // android.view.View
    public void setAnimation(android.view.animation.Animation animation) {
        super.setAnimation(animation);
        this.AEQbTJ = 1;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setAnimation(java.io.InputStream inputStream, java.lang.String str) {
        super.setAnimation(inputStream, str);
        this.AEQbTJ = 1;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setAnimation(java.lang.String str) {
        super.setAnimation(str);
        this.AEQbTJ = 1;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setAnimationFromUrl(java.lang.String str) {
        super.setAnimationFromUrl(str);
        this.AEQbTJ = 1;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setAnimationFromUrl(java.lang.String str, java.lang.String str2) {
        super.setAnimationFromUrl(str, str2);
        this.AEQbTJ = 1;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setAnimation(int i) {
        super.setAnimation(i);
        this.AEQbTJ = i;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void playAnimation() {
        OLrzqt();
        if (Companion.EZpvd(this.AEQbTJ)) {
            pendingStartAnim$default(this, 0L, 1, null);
        } else {
            super.setVisibility(0);
            super.playAnimation();
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void pauseAnimation() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        super.pauseAnimation();
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void cancelAnimation() {
        KWHzl();
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        super.cancelAnimation();
    }

    public static /* synthetic */ void pendingStartAnim$default(C55113xdn c55113xdn, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        c55113xdn.EZpvd(j);
    }

    public final void EZpvd(long j) {
        if (j == 0) {
            super.setVisibility(0);
            super.playAnimation();
            return;
        }
        super.setVisibility(4);
        Job job = this.copydefault;
        if (job == null || (job != null && job.isCompleted())) {
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new OKLoadingView$pendingStartAnim$1(j, this, null), 3, null);
        }
    }

    public final void OLrzqt() {
        if (this.KWHzl) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OKLoadingView$processLoadingShownQPL$1(this, java.lang.System.currentTimeMillis(), null), 3, null);
    }

    public final void KWHzl() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        yHO<java.lang.Boolean, java.lang.Long, WeakReference<androidx.fragment.app.Fragment>, Unit> yhoOLrzqt = C55110xdk.OLrzqt.OLrzqt();
        if (yhoOLrzqt != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            yhoOLrzqt.invoke(bool, java.lang.Long.valueOf(jCurrentTimeMillis), this.AYXKKw);
        }
    }
}
