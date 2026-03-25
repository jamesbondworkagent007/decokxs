package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jZV extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jZV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jZV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.jZV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ jZV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jZV(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jZV.copydefault(context, this);
            }
        });
    }

    private final C21649hHe AEQbTJ() {
        return (C21649hHe) this.EZpvd.getValue();
    }

    public static final C21649hHe copydefault(android.content.Context context, jZV jzv) {
        return C21649hHe.copydefault(android.view.LayoutInflater.from(context), jzv, true);
    }

    public final void setState(boolean z) {
        android.widget.ImageView imageView = AEQbTJ().AEQbTJ;
        android.graphics.drawable.Drawable drawableCopydefault = null;
        if (z) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GQzpsZsQwTVT);
            if (drawableKWHzl != null) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = AEQbTJ().getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                drawableCopydefault = C33057mpK.copydefault(drawableKWHzl, C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
            }
        } else {
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.getValue);
            if (drawableKWHzl2 != null) {
                drawableCopydefault = C33057mpK.copydefault(drawableKWHzl2, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
        }
        imageView.setImageDrawable(drawableCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.jZV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setupActions$default(jZV jzv, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        if ((i & 4) != 0) {
            function03 = null;
        }
        jzv.setupActions(function0, function02, function03);
    }

    public final void setupActions(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        C21649hHe c21649hHeAEQbTJ = AEQbTJ();
        C52794wYp c52794wYp = c21649hHeAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(function0 != null ? 0 : 8);
        C52794wYp c52794wYp2 = c21649hHeAEQbTJ.OLrzqt;
        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, function0));
        android.widget.ImageView imageView = c21649hHeAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(function02 != null ? 0 : 8);
        android.widget.ImageView imageView2 = c21649hHeAEQbTJ.AEQbTJ;
        imageView2.setOnClickListener(new StateListAnimator(imageView2, 1000L, function02));
        android.widget.ImageView imageView3 = c21649hHeAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(function03 != null ? 0 : 8);
        android.widget.ImageView imageView4 = c21649hHeAEQbTJ.KWHzl;
        imageView4.setOnClickListener(new TaskDescription(imageView4, 1000L, function03));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
