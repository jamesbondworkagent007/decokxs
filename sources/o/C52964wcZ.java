package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52964wcZ extends AppCompatTextView {
    public android.os.CountDownTimer EZpvd;
    public long KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52964wcZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52964wcZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.wcZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52964wcZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52964wcZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "{timer}";
    }

    public final void copydefault(long j) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        EZpvd();
        long jCopydefault = C56548yJl.copydefault(j - java.lang.System.currentTimeMillis(), 1L);
        this.KWHzl = jCopydefault;
        this.EZpvd = new TaskDescription(booleanRef, jCopydefault).start();
        booleanRef.element = false;
    }

    /* JADX INFO: renamed from: o.wcZ$TaskDescription */
    public static final class TaskDescription extends android.os.CountDownTimer {
        public final /* synthetic */ Ref.BooleanRef AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(Ref.BooleanRef booleanRef, long j) {
            super(j, 1000L);
            this.AEQbTJ = booleanRef;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C52964wcZ c52964wcZ = C52964wcZ.this;
            c52964wcZ.setText(c52964wcZ.KWHzl(j, c52964wcZ.OLrzqt));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (!this.AEQbTJ.element) {
                C52964wcZ c52964wcZ = C52964wcZ.this;
                c52964wcZ.setText(c52964wcZ.KWHzl(0L, c52964wcZ.OLrzqt));
            }
            C52964wcZ.this.EZpvd();
        }
    }

    public final void EZpvd() {
        android.os.CountDownTimer countDownTimer = this.EZpvd;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.EZpvd = null;
    }

    public final void setFormat(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str + " {timer}";
        this.OLrzqt = str2;
        if (this.EZpvd != null || this.KWHzl > 0) {
            setText(KWHzl(this.KWHzl, str2));
        }
    }

    public final java.lang.String KWHzl(long j, java.lang.String str) {
        return C59449zhJ.replace$default(str, "{timer}", j <= 0 ? "--" : xMN.KWHzl(j), false, 4, (java.lang.Object) null);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EZpvd();
    }
}
