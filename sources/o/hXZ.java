package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hXZ extends ConstraintLayout {
    public TaskDescription AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public long EZpvd;
    public Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> KWHzl;
    public long OLrzqt;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDownTimer(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedTime(long j) {
        this.OLrzqt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCountDownCallback(Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.hXZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hXZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hYb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXZ.KWHzl(this.OLrzqt);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.OxbLUn, (android.view.ViewGroup) this, true);
    }

    public static final AppCompatTextView KWHzl(hXZ hxz) {
        return (AppCompatTextView) hxz.findViewById(C23274hvD.Application.setSplitBackgroundDrawable);
    }

    private final AppCompatTextView copydefault() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jValueOf = C33129mqd.valueOf(C23313hvq.mulCheckS$default(str, 1000, null, null, null, 14, null));
        long jValueOf2 = C33129mqd.valueOf(C23313hvq.mulCheckS$default(str2, 1000, null, null, null, 14, null));
        this.copydefault = jValueOf2;
        this.EZpvd = C33129mqd.valueOf(C23313hvq.mulCheckS$default(java.lang.Long.valueOf(jValueOf2), java.lang.Double.valueOf(0.2d), null, null, null, 14, null));
        this.OLrzqt = jValueOf;
        KWHzl(jValueOf);
    }

    private final void KWHzl(long j) {
        if (this.AEQbTJ != null) {
            EZpvd();
        }
        this.AEQbTJ = new TaskDescription(j, 1000L);
        if (C23313hvq.EZpvd(java.lang.Long.valueOf(j), 0)) {
            KWHzl();
        } else {
            EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(long j) {
        copydefault().setText(pTA.formatTime$default(new Date(j), OKTimeEnum.TIME_FORMAT_MS, null, null, false, 14, null));
    }

    private final void KWHzl() {
        TaskDescription taskDescription = this.AEQbTJ;
        if (taskDescription != null) {
            taskDescription.cancel();
        }
        TaskDescription taskDescription2 = this.AEQbTJ;
        if (taskDescription2 != null) {
            taskDescription2.start();
        }
    }

    public final void EZpvd() {
        TaskDescription taskDescription = this.AEQbTJ;
        if (taskDescription != null) {
            taskDescription.cancel();
        }
    }

    public final void AEQbTJ(long j) {
        if (j == -1 || C23313hvq.KWHzl(java.lang.Long.valueOf(j), java.lang.Long.valueOf(this.EZpvd))) {
            Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                function1.invoke(C56390yDp.OLrzqt(java.lang.Long.valueOf(j), -1L));
                return;
            }
            return;
        }
        Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function12 = this.KWHzl;
        if (function12 != null) {
            function12.invoke(C56390yDp.OLrzqt(java.lang.Long.valueOf(j), java.lang.Long.valueOf(this.copydefault)));
        }
    }

    public final class TaskDescription extends android.os.CountDownTimer {
        public TaskDescription(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            hXZ.this.copydefault(j);
            hXZ.this.AEQbTJ(j);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            hXZ.this.AEQbTJ(-1L);
            hXZ.this.setVisibility(4);
        }
    }
}
