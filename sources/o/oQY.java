package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oQY extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public RecyclerView OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oQY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oQY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefreshClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.oQY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oQY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oQY(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.oRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oQY.KWHzl(context, this);
            }
        });
        final LinearLayoutCompat linearLayoutCompat = copydefault().EZpvd;
        linearLayoutCompat.post(new java.lang.Runnable() { // from class: o.oQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oQY.AEQbTJ(linearLayoutCompat, this);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oQY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final oPR copydefault() {
        return (oPR) this.KWHzl.getValue();
    }

    public static final oPR KWHzl(android.content.Context context, oQY oqy) {
        return oPR.EZpvd(android.view.LayoutInflater.from(context), oqy);
    }

    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (i2 >= 0 || oQY.this.AEQbTJ <= 0) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                oQY oqy = oQY.this;
                if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() <= oqy.AEQbTJ) {
                    oqy.OLrzqt();
                    pUU.KWHzl("RefreshOverlayLayout", "manually scroll to top");
                }
            }
        }
    }

    public final void AEQbTJ(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        if (this.OLrzqt == recyclerView) {
            return;
        }
        this.OLrzqt = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new ActionBar());
        }
    }

    public final void copydefault(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = this.AEQbTJ + i;
        this.AEQbTJ = i2;
        pUU.KWHzl("RefreshOverlayLayout", "add count: " + i + ", total is " + i2);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().AEQbTJ.setText(str);
        final LinearLayoutCompat linearLayoutCompat = copydefault().EZpvd;
        linearLayoutCompat.animate().alpha(1.0f).withStartAction(new java.lang.Runnable() { // from class: o.oRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oQY.copydefault(linearLayoutCompat);
            }
        }).start();
        pUU.KWHzl("RefreshOverlayLayout", "showOverlay: " + str);
    }

    public static final void copydefault(LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.copydefault(linearLayoutCompat);
        linearLayoutCompat.setVisibility(0);
    }

    public final void OLrzqt() {
        final LinearLayoutCompat linearLayoutCompat = copydefault().EZpvd;
        linearLayoutCompat.animate().alpha(0.0f).withEndAction(new java.lang.Runnable() { // from class: o.oQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oQY.EZpvd(linearLayoutCompat);
            }
        }).start();
        this.AEQbTJ = 0;
        pUU.KWHzl("RefreshOverlayLayout", "hideOverlay, reset newCount to 0");
    }

    public static final void EZpvd(LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.copydefault(linearLayoutCompat);
        linearLayoutCompat.setVisibility(8);
    }

    public static final void AEQbTJ(LinearLayoutCompat linearLayoutCompat, oQY oqy) {
        linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, oqy));
        linearLayoutCompat.bringToFront();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ oQY AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, oQY oqy) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = oqy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                RecyclerView recyclerView = this.AEQbTJ.OLrzqt;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(0);
                }
                this.AEQbTJ.OLrzqt();
                Function0 function0 = this.AEQbTJ.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
                pUU.KWHzl("RefreshOverlayLayout", "click to scroll to top");
            }
        }
    }
}
