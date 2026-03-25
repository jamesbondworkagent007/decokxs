package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25265itU extends LinearLayoutCompat {
    public Function1<? super java.lang.String, Unit> EZpvd;
    public final C21586hEw OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25265itU(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackCallback(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:18) call: o.itU.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C25265itU(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25265itU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21586hEw c21586hEwEZpvd = C21586hEw.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c21586hEwEZpvd, "");
        this.OLrzqt = c21586hEwEZpvd;
        setOrientation(1);
    }

    private final C25330iug AEQbTJ() {
        C25330iug c25330iug = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c25330iug, "");
        return c25330iug;
    }

    private final MemeErrorNoticeView copydefault() {
        MemeErrorNoticeView memeErrorNoticeView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(memeErrorNoticeView, "");
        return memeErrorNoticeView;
    }

    public final MemeErrorNoticeView OLrzqt() {
        return copydefault();
    }

    public final C25330iug KWHzl() {
        return AEQbTJ();
    }

    public final void setErrorNoticeViewVisible(boolean z) {
        copydefault().setVisibility(z ? 0 : 8);
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C25330iug c25330iugAEQbTJ = AEQbTJ();
        c25330iugAEQbTJ.setOnClickListener(new Activity(c25330iugAEQbTJ, 1000L, function0));
    }

    public final void setPriorityFeeValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().setPriorityFeeValue(str);
    }

    public final void EZpvd() {
        AEQbTJ().gEmmrt();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        AEQbTJ().setEnabled(z);
    }

    /* JADX INFO: renamed from: o.itU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }
}
