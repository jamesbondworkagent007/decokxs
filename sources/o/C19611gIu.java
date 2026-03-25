package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import com.okinc.business.defi.wallet.ui.autoscrollingrvs.AutoScrollingRecyclerView$startCoroutine$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19611gIu extends RecyclerView {
    public boolean EZpvd;
    public final CoroutineScope KWHzl;
    public Job OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19611gIu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19611gIu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.gIu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19611gIu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19611gIu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = 20.0f;
        this.KWHzl = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }

    public static /* synthetic */ void startScrolling$default(C19611gIu c19611gIu, java.util.List list, float f, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 20.0f;
        }
        c19611gIu.KWHzl(list, f, yho);
    }

    public final void KWHzl(@NotNull java.util.List<DefiOnboardingTile.TaskDescription.ActionBar> list, float f, @NotNull yHO<? super java.lang.Integer, ? super C18190fdi, ? super C18126fcX, Unit> yho) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.copydefault = f;
        setAdapter(new C19610gIt(list, yho));
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        if (list.isEmpty()) {
            this.EZpvd = false;
        } else {
            this.EZpvd = true;
            AEQbTJ(f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (this.EZpvd && i == 0) {
            AEQbTJ(this.copydefault);
        }
    }

    public final void AEQbTJ() {
        this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new AutoScrollingRecyclerView$startCoroutine$1(this, null), 3, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        boolean z = getScrollState() == 2;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 0 || !z) {
            return zOnInterceptTouchEvent;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        stopScroll();
        return false;
    }

    public final void AEQbTJ(float f) {
        if (mNP.AEQbTJ.copydefault()) {
            return;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C19616gIz c19616gIz = new C19616gIz(context, f);
        c19616gIz.setTargetPosition(2147483646);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(c19616gIz);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.EZpvd) {
            AEQbTJ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
