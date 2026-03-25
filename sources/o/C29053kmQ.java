package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29053kmQ extends android.widget.LinearLayout {
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29053kmQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29053kmQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:10) call: o.kmQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29053kmQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29053kmQ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29053kmQ.OLrzqt(context, this);
            }
        });
    }

    private final C23531hzw EZpvd() {
        return (C23531hzw) this.EZpvd.getValue();
    }

    public static final C23531hzw OLrzqt(android.content.Context context, C29053kmQ c29053kmQ) {
        return C23531hzw.EZpvd(android.view.LayoutInflater.from(context), c29053kmQ, true);
    }

    public final int copydefault() {
        return EZpvd().OLrzqt.getId();
    }

    public final void setOnTitleClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.widget.LinearLayout linearLayout = EZpvd().EZpvd;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, function0));
    }

    /* JADX INFO: renamed from: o.kmQ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }
}
