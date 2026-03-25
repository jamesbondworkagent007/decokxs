package o;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.RenderMode;
import com.okinc.cruilib.view.tab.OKCRTradeTabView$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31939mJn extends android.widget.LinearLayout {
    public Function0<Unit> AYXKKw;
    public LottieComposition AhwBna;
    public C31881mHj EZpvd;
    public LottieComposition KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public final CoroutineScope gEmmrt;
    public Function0<Unit> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFrom(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setShowTradeOptionsCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTabSelectCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31939mJn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
        this.gEmmrt = CoroutineScope;
        C31881mHj c31881mHjAEQbTJ = C31881mHj.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c31881mHjAEQbTJ, "");
        this.EZpvd = c31881mHjAEQbTJ;
        android.widget.LinearLayout linearLayout = c31881mHjAEQbTJ.AEQbTJ;
        linearLayout.setOnClickListener(new ActionBar(linearLayout, 400L, this));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OKCRTradeTabView$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.mJn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mJn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.EZpvd.OLrzqt.setEnabled(z);
    }

    public static /* synthetic */ java.lang.Object loadLottieCompositionFromRaw$default(C31939mJn c31939mJn, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = "unknown";
        }
        return c31939mJn.copydefault(i, str, continuation);
    }

    public final java.lang.Object copydefault(int i, java.lang.String str, Continuation<? super LottieComposition> continuation) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        LottieTask<LottieComposition> lottieTaskFromRawRes = LottieCompositionFactory.fromRawRes(getContext(), i);
        lottieTaskFromRawRes.addListener(new TaskDescription(booleanRef, jCurrentTimeMillis, str, cancellableContinuationImpl));
        lottieTaskFromRawRes.addFailureListener(new StateListAnimator(booleanRef, jCurrentTimeMillis, str, cancellableContinuationImpl, i));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    /* JADX INFO: renamed from: o.mJn$TaskDescription */
    public static final class TaskDescription<T> implements LottieListener {
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ CancellableContinuation<LottieComposition> OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.airbnb.lottie.LottieComposition> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Ref.BooleanRef booleanRef, long j, java.lang.String str, CancellableContinuation<? super LottieComposition> cancellableContinuation) {
            this.EZpvd = booleanRef;
            this.copydefault = j;
            this.KWHzl = str;
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final void onResult(LottieComposition lottieComposition) {
            Ref.BooleanRef booleanRef = this.EZpvd;
            if (booleanRef.element) {
                return;
            }
            booleanRef.element = true;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.copydefault;
            pUU.EZpvd("TradeTabView", "Loading " + this.KWHzl + ": " + (jCurrentTimeMillis - j) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
            CancellableContinuation<LottieComposition> cancellableContinuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(lottieComposition));
        }
    }

    /* JADX INFO: renamed from: o.mJn$StateListAnimator */
    public static final class StateListAnimator<T> implements LottieListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ CancellableContinuation<LottieComposition> EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.airbnb.lottie.LottieComposition> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Ref.BooleanRef booleanRef, long j, java.lang.String str, CancellableContinuation<? super LottieComposition> cancellableContinuation, int i) {
            this.copydefault = booleanRef;
            this.AEQbTJ = j;
            this.OLrzqt = str;
            this.EZpvd = cancellableContinuation;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final void onResult(java.lang.Throwable th) {
            Ref.BooleanRef booleanRef = this.copydefault;
            if (booleanRef.element) {
                return;
            }
            booleanRef.element = true;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.AEQbTJ;
            pUU.AEQbTJ("TradeTabView", "Loading " + this.OLrzqt + " failed: " + (jCurrentTimeMillis - j) + com.ibm.icu.text.DateFormat.MINUTE_SECOND, th);
            CancellableContinuation<LottieComposition> cancellableContinuation = this.EZpvd;
            Result.Application application = Result.Companion;
            if (th == null) {
                th = new java.lang.Exception("Failed to load raw resource " + this.KWHzl);
            }
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
        }
    }

    /* JADX INFO: renamed from: o.mJn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C31939mJn KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C31939mJn c31939mJn) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c31939mJn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.KWHzl.OLrzqt) {
                    Function0 function0 = this.KWHzl.valueOf;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                Function0 function02 = this.KWHzl.AYXKKw;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }
    }

    public final void AEQbTJ(LottieComposition lottieComposition, float f) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.EZpvd.OLrzqt.cancelAnimation();
        if (C57601ylW.KWHzl.AhwBna() && Build.VERSION.SDK_INT == 29) {
            this.EZpvd.OLrzqt.setRenderMode(RenderMode.SOFTWARE);
        }
        LottieAnimationView lottieAnimationView = this.EZpvd.OLrzqt;
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (lottieComposition != null) {
            lottieAnimationView.setComposition(lottieComposition);
        }
        lottieAnimationView.setSpeed(f);
        lottieAnimationView.playAnimation();
        pUU.EZpvd("TradeTabView", "Rendering time: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int EZpvd() {
        return C33492mxV.OLrzqt() ? C52761wXj.PendingIntent.DbNXlk : C52761wXj.PendingIntent.AkhnZx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int copydefault() {
        return C33492mxV.OLrzqt() ? C52761wXj.PendingIntent.fJNWhG : C52761wXj.PendingIntent.AuCTel;
    }
}
