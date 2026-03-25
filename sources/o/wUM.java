package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wUM extends LinearLayoutCompat {
    public final C48327uNj EZpvd;
    public android.os.CountDownTimer KWHzl;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetTimestamp(long j) {
        this.copydefault = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.wUM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wUM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wUM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C48327uNj c48327uNjKWHzl = C48327uNj.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c48327uNjKWHzl, "");
        this.EZpvd = c48327uNjKWHzl;
    }

    public final void EZpvd() {
        AEQbTJ();
        this.KWHzl = new TaskDescription(this.copydefault - java.lang.System.currentTimeMillis(), this).start();
    }

    public static final class TaskDescription extends android.os.CountDownTimer {
        public final /* synthetic */ wUM OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(long j, wUM wum) {
            super(j, 1000L);
            this.OLrzqt = wum;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.OLrzqt.copydefault(j);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.OLrzqt.AEQbTJ();
            wUM.updateCountDownText$default(this.OLrzqt, 0L, 1, null);
        }
    }

    public static /* synthetic */ void updateCountDownText$default(wUM wum, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        wum.copydefault(j);
    }

    public final void copydefault(long j) {
        C48327uNj c48327uNj = this.EZpvd;
        android.widget.TextView textView = c48327uNj.OLrzqt;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        textView.setText(C33129mqd.AYXKKw(java.lang.Long.valueOf(timeUnit.toDays(j))));
        android.widget.TextView textView2 = c48327uNj.copydefault;
        long j2 = 24;
        long hours = timeUnit.toHours(j) % j2;
        textView2.setText(C33129mqd.AYXKKw(java.lang.Integer.valueOf((int) (hours + (j2 & (((hours ^ j2) & ((-hours) | hours)) >> 63))))));
        android.widget.TextView textView3 = c48327uNj.KWHzl;
        long j3 = 60;
        long minutes = timeUnit.toMinutes(j) % j3;
        textView3.setText(C33129mqd.AYXKKw(java.lang.Integer.valueOf((int) (minutes + ((((minutes ^ j3) & ((-minutes) | minutes)) >> 63) & j3)))));
        android.widget.TextView textView4 = c48327uNj.EZpvd;
        long seconds = timeUnit.toSeconds(j) % j3;
        textView4.setText(C33129mqd.AYXKKw(java.lang.Integer.valueOf((int) (seconds + ((((seconds ^ j3) & ((-seconds) | seconds)) >> 63) & j3)))));
    }

    public final void AEQbTJ() {
        android.os.CountDownTimer countDownTimer = this.KWHzl;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.KWHzl = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AEQbTJ();
    }
}
