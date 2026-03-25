package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50391vMr extends android.widget.LinearLayout {
    public Function0<Unit> EZpvd;
    public final AbstractC50884vca OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtnClickListener(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrincipleClickListener(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.vMr.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C50391vMr(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50391vMr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50884vca abstractC50884vcaAEQbTJ = AbstractC50884vca.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50884vcaAEQbTJ, "");
        this.OLrzqt = abstractC50884vcaAEQbTJ;
        setOrientation(1);
        setPaddingRelative(0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0);
        C55317xhf c55317xhf = abstractC50884vcaAEQbTJ.KWHzl;
        c55317xhf.setOnClickListener(new ActionBar(c55317xhf, 1000L, this));
        C53518wmx c53518wmx = abstractC50884vcaAEQbTJ.EZpvd;
        c53518wmx.setOnClickListener(new Application(c53518wmx, 1000L, this));
    }

    public final void AEQbTJ() {
        this.OLrzqt.EZpvd.OLrzqt();
    }

    /* JADX INFO: renamed from: o.vMr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50391vMr KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50391vMr c50391vMr) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c50391vMr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vMr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50391vMr EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50391vMr c50391vMr) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c50391vMr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
