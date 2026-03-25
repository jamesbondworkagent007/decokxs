package o;

import androidx.work.WorkRequest;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.okinc.lib.internal.monitor.thread.ThreadMonitorImpl$checkThreadCount$1$1$1;
import com.okinc.lib.internal.monitor.thread.ThreadMonitorImpl$start$1;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.InterfaceC38042pKb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38035pJv implements InterfaceC38042pKb {
    public int AEQbTJ;
    public long AYXKKw;
    public Job AhwBna;
    public int EZpvd;
    public boolean KWHzl;
    public long OLrzqt;
    public final CoroutineDispatcher copydefault;
    public InterfaceC38042pKb.StateListAnimator djBIcL;
    public long gEmmrt;
    public final CoroutineScope isConnected;
    public final java.util.Set<java.lang.Integer> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38042pKb
    public void KWHzl(@NotNull InterfaceC38042pKb.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.djBIcL = stateListAnimator;
    }

    public C38035pJv(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = coroutineDispatcher;
        this.isConnected = coroutineScope;
        this.valueOf = new LinkedHashSet();
        this.gEmmrt = WorkRequest.MIN_BACKOFF_MILLIS;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 kotlinx.coroutines.CoroutineDispatcher)
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineScope:0x000e: INVOKE 
  (wrap:kotlin.coroutines.CoroutineContext:0x000a: INVOKE 
  (wrap:kotlinx.coroutines.CompletableJob:0x0006: INVOKE 
  (wrap:kotlinx.coroutines.Job:?: CAST (kotlinx.coroutines.Job) (null kotlinx.coroutines.Job))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: kotlinx.coroutines.SupervisorKt.SupervisorJob$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob A[MD:(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob (m), WRAPPED] (LINE:28))
  (r1v0 kotlinx.coroutines.CoroutineDispatcher)
 INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:28))
 STATIC call: kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope A[MD:(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope (m), WRAPPED] (LINE:28)) : (r2v0 kotlinx.coroutines.CoroutineScope))
 A[MD:(kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineScope):void (m)] (LINE:26) call: o.pJv.<init>(kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineScope):void type: THIS */
    public /* synthetic */ C38035pJv(CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineDispatcher, (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher)) : coroutineScope);
    }

    @Override // o.pJH
    public void copydefault() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        this.valueOf.clear();
        this.EZpvd = 0;
        this.OLrzqt = 0L;
        this.AYXKKw = 0L;
        this.gEmmrt = WorkRequest.MIN_BACKOFF_MILLIS;
        this.AEQbTJ = 0;
        this.AhwBna = BuildersKt__Builders_commonKt.launch$default(this.isConnected, null, null, new ThreadMonitorImpl$start$1(this, null), 3, null);
    }

    @Override // o.pJH
    public void OLrzqt() {
        if (this.KWHzl) {
            this.KWHzl = false;
            Job job = this.AhwBna;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.AhwBna = null;
            this.OLrzqt = 0L;
            this.EZpvd = 0;
            this.gEmmrt = WorkRequest.MIN_BACKOFF_MILLIS;
            this.AEQbTJ = 0;
            this.valueOf.clear();
            this.djBIcL = null;
        }
    }

    public final void KWHzl() {
        try {
            int i = this.EZpvd;
            int iAEQbTJ = AEQbTJ();
            AEQbTJ(iAEQbTJ, i);
            for (int i2 : C38036pJw.EZpvd) {
                if (iAEQbTJ >= i2 && !this.valueOf.contains(java.lang.Integer.valueOf(i2))) {
                    this.valueOf.add(java.lang.Integer.valueOf(i2));
                    InterfaceC38042pKb.StateListAnimator stateListAnimator = this.djBIcL;
                    if (stateListAnimator != null) {
                        BuildersKt__Builders_commonKt.launch$default(this.isConnected, null, null, new ThreadMonitorImpl$checkThreadCount$1$1$1(stateListAnimator, iAEQbTJ, null), 3, null);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("Monitor.Thread", e);
            this.OLrzqt = 0L;
        }
    }

    public final int AEQbTJ() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int i = this.EZpvd;
        if (i > 0 && jCurrentTimeMillis - this.OLrzqt < 2000) {
            return i;
        }
        int iEZpvd = InterfaceC38042pKb.Companion.EZpvd();
        this.EZpvd = iEZpvd;
        this.OLrzqt = jCurrentTimeMillis;
        return iEZpvd;
    }

    public final void AEQbTJ(int i, int i2) {
        long j;
        if (java.lang.Math.abs(i - i2) <= 2) {
            this.AEQbTJ++;
        } else {
            this.AEQbTJ = 0;
        }
        int i3 = this.AEQbTJ;
        if (i3 >= 9) {
            j = 30000;
        } else if (i3 >= 3) {
            j = SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US;
        } else if (i >= yDV.iwGUEr(C38036pJw.EZpvd)) {
            j = 3000;
        } else if (i >= C38036pJw.EZpvd[1]) {
            j = 5000;
        } else {
            j = i >= C38036pJw.EZpvd[0] ? 8000L : WorkRequest.MIN_BACKOFF_MILLIS;
        }
        this.gEmmrt = j;
    }
}
