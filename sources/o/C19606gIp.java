package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19606gIp extends android.widget.LinearLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C19614gIx EZpvd;
    public C19614gIx KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19606gIp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19606gIp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.gIp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19606gIp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19606gIp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        android.util.AttributeSet attributeSet2 = null;
        int i2 = 0;
        int i3 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C19614gIx c19614gIx = new C19614gIx(context, attributeSet2, i2, i3, defaultConstructorMarker);
        c19614gIx.setLayoutParams(layoutParams);
        this.EZpvd = c19614gIx;
        C19614gIx c19614gIx2 = new C19614gIx(context, attributeSet2, i2, i3, defaultConstructorMarker);
        c19614gIx2.setLayoutParams(layoutParams);
        this.KWHzl = c19614gIx2;
        setOrientation(1);
        addView(this.EZpvd);
        addView(this.KWHzl);
    }

    /* JADX INFO: renamed from: o.gIp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void startScrolling$default(C19606gIp c19606gIp, java.util.List list, java.util.List list2, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 20.0f;
        }
        c19606gIp.KWHzl(list, list2, f);
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, float f) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        pUU.KWHzl("AutoOppositeScrollingRecyclerView", "startScrolling: forward.size=" + list.size() + ", backward.size=" + list2.size());
        C19614gIx c19614gIx = this.EZpvd;
        c19614gIx.setAdapter(new C19612gIv(list));
        c19614gIx.setLayoutManager(new LinearLayoutManager(c19614gIx.getContext(), 0, false));
        C19614gIx c19614gIx2 = this.KWHzl;
        c19614gIx2.setAdapter(new C19612gIv(list2));
        c19614gIx2.setLayoutManager(new LinearLayoutManager(c19614gIx2.getContext(), 0, true));
        if (mNP.AEQbTJ.copydefault()) {
            return;
        }
        EZpvd(f);
        OLrzqt(f);
    }

    public final void EZpvd(float f) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C19616gIz c19616gIz = new C19616gIz(context, f);
        c19616gIz.setTargetPosition(2147483646);
        RecyclerView.LayoutManager layoutManager = this.EZpvd.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(c19616gIz);
        }
    }

    public final void OLrzqt(float f) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C19616gIz c19616gIz = new C19616gIz(context, f);
        c19616gIz.setTargetPosition(2147483646);
        RecyclerView.LayoutManager layoutManager = this.KWHzl.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(c19616gIz);
        }
    }
}
