package o;

import android.os.Handler;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import com.tencent.matrix.lifecycle.owners.TimerChecker$task$2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC57957ysH;
import o.C58013ytK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57957ysH {
    public final int AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final java.lang.String AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public volatile int KWHzl;
    public final long OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public abstract boolean KWHzl();

    public AbstractC57957ysH(@NotNull java.lang.String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.OLrzqt = j;
        this.AEQbTJ = i;
        this.copydefault = C56392yDr.copydefault(new Function0<android.os.Handler>() { // from class: com.tencent.matrix.lifecycle.owners.TimerChecker$runningHandler$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Handler invoke() {
                return MatrixLifecycleThread.EZpvd.OLrzqt();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0<Activity>() { // from class: com.tencent.matrix.lifecycle.owners.TimerChecker$intervalFactory$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC57957ysH.Activity invoke() {
                return new AbstractC57957ysH.Activity(this.this$0.OLrzqt);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0<TimerChecker$task$2.AnonymousClass5>() { // from class: com.tencent.matrix.lifecycle.owners.TimerChecker$task$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.matrix.lifecycle.owners.TimerChecker$task$2$5] */
            @Override // kotlin.jvm.functions.Function0
            public final AnonymousClass5 invoke() {
                final AbstractC57957ysH abstractC57957ysH = this.this$0;
                return new Runnable() { // from class: com.tencent.matrix.lifecycle.owners.TimerChecker$task$2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C58013ytK.EZpvd(abstractC57957ysH.AhwBna, "run check task", new Object[0]);
                        if (!abstractC57957ysH.KWHzl()) {
                            abstractC57957ysH.KWHzl = 0;
                            return;
                        }
                        if (abstractC57957ysH.AEQbTJ != -1) {
                            AbstractC57957ysH abstractC57957ysH2 = abstractC57957ysH;
                            int i2 = abstractC57957ysH2.KWHzl;
                            abstractC57957ysH2.KWHzl = i2 + 1;
                            if (i2 >= abstractC57957ysH.AEQbTJ) {
                                C58013ytK.EZpvd(abstractC57957ysH.AhwBna, "paused polling check", new Object[0]);
                                return;
                            }
                        }
                        long jOLrzqt = abstractC57957ysH.EZpvd().OLrzqt();
                        C58013ytK.EZpvd(abstractC57957ysH.AhwBna, "need recheck: next " + jOLrzqt, new Object[0]);
                        abstractC57957ysH.OLrzqt().postDelayed(this, jOLrzqt);
                    }
                };
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(java.lang.String, long, int):void (m)] (LINE:10) call: o.ysH.<init>(java.lang.String, long, int):void type: THIS */
    public /* synthetic */ AbstractC57957ysH(java.lang.String str, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i2 & 4) != 0 ? -1 : i);
    }

    public final android.os.Handler OLrzqt() {
        return (android.os.Handler) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.ysH$Activity */
    public static final class Activity {
        public java.lang.Long[] AEQbTJ;
        public final long KWHzl;
        public final java.lang.Long[] copydefault;

        public Activity(long j) {
            this.KWHzl = j;
            java.lang.Long[] lArr = {13L, 21L};
            this.copydefault = lArr;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(lArr, 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.AEQbTJ = (java.lang.Long[]) objArrCopyOf;
        }

        public final long OLrzqt() {
            long jLongValue = this.AEQbTJ[0].longValue() + this.AEQbTJ[1].longValue();
            java.lang.Long[] lArr = this.AEQbTJ;
            lArr[0] = lArr[1];
            lArr[1] = java.lang.Long.valueOf(jLongValue);
            return java.lang.Math.min(jLongValue, this.KWHzl);
        }

        public final void copydefault() {
            java.lang.Long[] lArr = this.copydefault;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(lArr, lArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.AEQbTJ = (java.lang.Long[]) objArrCopyOf;
        }
    }

    public final Activity EZpvd() {
        return (Activity) this.EZpvd.getValue();
    }

    public final TimerChecker$task$2.AnonymousClass5 AEQbTJ() {
        return (TimerChecker$task$2.AnonymousClass5) this.AYXKKw.getValue();
    }

    public final boolean copydefault() {
        C58013ytK.EZpvd(this.AhwBna, "checkAndPostIfNeeded", new java.lang.Object[0]);
        OLrzqt().removeCallbacks(AEQbTJ());
        if (!KWHzl()) {
            return false;
        }
        OLrzqt().postDelayed(AEQbTJ(), EZpvd().OLrzqt());
        return true;
    }

    public final void valueOf() {
        EZpvd().copydefault();
        long jOLrzqt = EZpvd().OLrzqt();
        C58013ytK.EZpvd(this.AhwBna, "post check: " + jOLrzqt, new java.lang.Object[0]);
        OLrzqt().removeCallbacks(AEQbTJ());
        OLrzqt().postDelayed(AEQbTJ(), jOLrzqt);
    }

    public final void AhwBna() {
        this.KWHzl = 0;
        C58013ytK.EZpvd(this.AhwBna, "stop", new java.lang.Object[0]);
        EZpvd().copydefault();
        OLrzqt().removeCallbacks(AEQbTJ());
    }
}
