package o;

import androidx.work.WorkRequest;
import com.amplitude.experiment.ServerZone;
import com.amplitude.experiment.Source;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LG {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final boolean EZpvd;
    public final LN KWHzl;
    public final boolean OLrzqt;
    public final LR copydefault;
    public final LP djBIcL;
    public final LJ ejfBZ;
    public final ServerZone fIwbmz;
    public final Source fJNWhG;
    public final boolean fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.util.Map<java.lang.String, LP> isConnected;
    public final long valueOf;
    public final boolean values;

    public LG(boolean z, @NotNull java.lang.String str, @NotNull LP lp, java.lang.String str2, @NotNull java.util.Map<java.lang.String, LP> map, @NotNull Source source, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull ServerZone serverZone, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LJ lj, LR lr, LN ln) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lp, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(serverZone, "");
        this.EZpvd = z;
        this.AkhnZx = str;
        this.djBIcL = lp;
        this.AhwBna = str2;
        this.isConnected = map;
        this.fJNWhG = source;
        this.DbNXlk = str3;
        this.AYXKKw = str4;
        this.fIwbmz = serverZone;
        this.valueOf = j;
        this.fetchVPNInfo = z2;
        this.OLrzqt = z3;
        this.values = z4;
        this.gEmmrt = z5;
        this.AEQbTJ = z6;
        this.ejfBZ = lj;
        this.copydefault = lr;
        this.KWHzl = ln;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ed: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("$default_instance") : (r22v0 java.lang.String))
  (wrap:o.LP:?: TERNARY null = ((wrap:int:0x0013: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: INVOKE (wrap:o.LG$Activity:0x0017: SGET  A[WRAPPED] (LINE:27) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.KWHzl():o.LP A[MD:():o.LP (m), WRAPPED] (LINE:27)) : (r23v0 o.LP))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE (wrap:o.LG$Activity:0x0024: SGET  A[WRAPPED] (LINE:29) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.copydefault():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:29)) : (r24v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: INVOKE (wrap:o.LG$Activity:0x0031: SGET  A[WRAPPED] (LINE:31) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.EZpvd():java.util.Map A[MD:():java.util.Map<java.lang.String, o.LP> (m), WRAPPED] (LINE:31)) : (r25v0 java.util.Map))
  (wrap:com.amplitude.experiment.Source:?: TERNARY null = ((wrap:int:0x003a: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE (wrap:o.LG$Activity:0x003e: SGET  A[WRAPPED] (LINE:33) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.valueOf():com.amplitude.experiment.Source A[MD:():com.amplitude.experiment.Source (m), WRAPPED] (LINE:33)) : (r26v0 com.amplitude.experiment.Source))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("https://api.lab.amplitude.com/") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("https://flag.lab.amplitude.com/") : (r28v0 java.lang.String))
  (wrap:com.amplitude.experiment.ServerZone:?: TERNARY null = ((wrap:int:0x0059: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: INVOKE (wrap:o.LG$Activity:0x005d: SGET  A[WRAPPED] (LINE:39) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.djBIcL():com.amplitude.experiment.ServerZone A[MD:():com.amplitude.experiment.ServerZone (m), WRAPPED] (LINE:39)) : (r29v0 com.amplitude.experiment.ServerZone))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0066: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: SGET  A[WRAPPED] androidx.work.WorkRequest.MIN_BACKOFF_MILLIS long) : (r30v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006f: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007f: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r34v0 boolean))
  (wrap:boolean:0x008f: TERNARY null = ((wrap:int:0x0087: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0091: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:o.LJ:?: TERNARY null = ((wrap:int:0x009c: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a2: INVOKE (wrap:o.LG$Activity:0x00a0: SGET  A[WRAPPED] (LINE:53) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.AhwBna():o.LJ A[MD:():o.LJ (m), WRAPPED] (LINE:53)) : (r37v0 o.LJ))
  (wrap:o.LR:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b1: INVOKE (wrap:o.LG$Activity:0x00af: SGET  A[WRAPPED] (LINE:56) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.OLrzqt():o.LR A[MD:():o.LR (m), WRAPPED] (LINE:56)) : (r38v0 o.LR))
  (wrap:o.LN:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c0: INVOKE (wrap:o.LG$Activity:0x00be: SGET  A[WRAPPED] (LINE:58) o.LG.Activity.AYXKKw o.LG$Activity) VIRTUAL call: o.LG.Activity.AEQbTJ():o.LN A[MD:():o.LN (m), WRAPPED] (LINE:58)) : (r39v0 o.LN))
 A[MD:(boolean, java.lang.String, o.LP, java.lang.String, java.util.Map<java.lang.String, o.LP>, com.amplitude.experiment.Source, java.lang.String, java.lang.String, com.amplitude.experiment.ServerZone, long, boolean, boolean, boolean, boolean, boolean, o.LJ, o.LR, o.LN):void (m)] (LINE:21) call: o.LG.<init>(boolean, java.lang.String, o.LP, java.lang.String, java.util.Map, com.amplitude.experiment.Source, java.lang.String, java.lang.String, com.amplitude.experiment.ServerZone, long, boolean, boolean, boolean, boolean, boolean, o.LJ, o.LR, o.LN):void type: THIS */
    public /* synthetic */ LG(boolean z, java.lang.String str, LP lp, java.lang.String str2, java.util.Map map, Source source, java.lang.String str3, java.lang.String str4, ServerZone serverZone, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LJ lj, LR lr, LN ln, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "$default_instance" : str, (i & 4) != 0 ? Activity.AYXKKw.KWHzl() : lp, (i & 8) != 0 ? Activity.AYXKKw.copydefault() : str2, (i & 16) != 0 ? Activity.AYXKKw.EZpvd() : map, (i & 32) != 0 ? Activity.AYXKKw.valueOf() : source, (i & 64) != 0 ? "https://api.lab.amplitude.com/" : str3, (i & 128) != 0 ? "https://flag.lab.amplitude.com/" : str4, (i & 256) != 0 ? Activity.AYXKKw.djBIcL() : serverZone, (i & 512) != 0 ? WorkRequest.MIN_BACKOFF_MILLIS : j, (i & 1024) != 0 ? true : z2, (i & 2048) != 0 ? true : z3, (i & 4096) != 0 ? true : z4, (i & 8192) != 0 ? true : z5, (i & 16384) != 0 ? false : z6, (i & 32768) != 0 ? Activity.AYXKKw.AhwBna() : lj, (i & 65536) != 0 ? Activity.AYXKKw.OLrzqt() : lr, (i & 131072) != 0 ? Activity.AYXKKw.AEQbTJ() : ln);
    }

    public LG() {
        this(false, null, null, null, null, null, null, null, null, 0L, false, false, false, false, false, null, null, null, 262142, null);
    }

    public static final class Activity {
        public static final LR AEQbTJ = null;
        public static final LJ AhwBna = null;
        public static final LN EZpvd = null;
        public static final java.lang.String copydefault = null;
        public static final Activity AYXKKw = new Activity();
        public static final LP OLrzqt = new LP(null, null, null, null, null, 31, null);
        public static final java.util.Map<java.lang.String, LP> KWHzl = C56424yEw.KWHzl();
        public static final Source djBIcL = Source.LOCAL_STORAGE;
        public static final ServerZone gEmmrt = ServerZone.US;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LN AEQbTJ() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LJ AhwBna() {
            return AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, LP> EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LP KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LR OLrzqt() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServerZone djBIcL() {
            return gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Source valueOf() {
            return djBIcL;
        }

        private Activity() {
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final TaskDescription AEQbTJ() {
            return new TaskDescription();
        }
    }

    public static final class TaskDescription {
        public LN AEQbTJ;
        public java.lang.String AYXKKw;
        public long AhwBna;
        public java.lang.String AkhnZx;
        public java.lang.String DbNXlk = "$default_instance";
        public boolean EZpvd;
        public LR KWHzl;
        public boolean OLrzqt;
        public boolean copydefault;
        public java.lang.String djBIcL;
        public LJ ejfBZ;
        public ServerZone fARcdN;
        public Source fJNWhG;
        public java.util.Map<java.lang.String, LP> fetchVPNInfo;
        public boolean gEmmrt;
        public boolean isConnected;
        public LP valueOf;
        public boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.djBIcL = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(boolean z) {
            this.copydefault = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(LJ lj) {
            this.ejfBZ = lj;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(boolean z) {
            this.EZpvd = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull ServerZone serverZone) {
            Intrinsics.checkNotNullParameter(serverZone, "");
            this.fARcdN = serverZone;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull Source source) {
            Intrinsics.checkNotNullParameter(source, "");
            this.fJNWhG = source;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AkhnZx = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(LN ln) {
            this.AEQbTJ = ln;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(LR lr) {
            this.KWHzl = lr;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(boolean z) {
            this.values = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.DbNXlk = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.util.Map<java.lang.String, LP> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.fetchVPNInfo = map;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(boolean z) {
            this.isConnected = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(long j) {
            this.AhwBna = j;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(java.lang.String str) {
            this.AYXKKw = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull LP lp) {
            Intrinsics.checkNotNullParameter(lp, "");
            this.valueOf = lp;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(boolean z) {
            this.OLrzqt = z;
            return this;
        }

        public TaskDescription() {
            Activity activity = Activity.AYXKKw;
            this.valueOf = activity.KWHzl();
            this.AYXKKw = activity.copydefault();
            this.fetchVPNInfo = activity.EZpvd();
            this.fJNWhG = activity.valueOf();
            this.AkhnZx = "https://api.lab.amplitude.com/";
            this.djBIcL = "https://flag.lab.amplitude.com/";
            this.fARcdN = activity.djBIcL();
            this.AhwBna = WorkRequest.MIN_BACKOFF_MILLIS;
            this.values = true;
            this.copydefault = true;
            this.isConnected = true;
            this.gEmmrt = true;
            this.ejfBZ = activity.AhwBna();
            this.KWHzl = activity.OLrzqt();
            this.AEQbTJ = activity.AEQbTJ();
        }

        public final TaskDescription copydefault(java.lang.Boolean bool) {
            this.gEmmrt = bool != null ? bool.booleanValue() : true;
            return this;
        }

        public final LG EZpvd() {
            return new LG(this.EZpvd, this.DbNXlk, this.valueOf, this.AYXKKw, this.fetchVPNInfo, this.fJNWhG, this.AkhnZx, this.djBIcL, this.fARcdN, this.AhwBna, this.values, this.copydefault, this.isConnected, this.gEmmrt, this.OLrzqt, this.ejfBZ, this.KWHzl, this.AEQbTJ);
        }
    }

    public final TaskDescription copydefault() {
        return Companion.AEQbTJ().EZpvd(this.EZpvd).OLrzqt(this.AkhnZx).copydefault(this.djBIcL).copydefault(this.AhwBna).OLrzqt(this.isConnected).KWHzl(this.fJNWhG).KWHzl(this.DbNXlk).AEQbTJ(this.AYXKKw).KWHzl(this.fIwbmz).copydefault(this.valueOf).KWHzl(this.fetchVPNInfo).AEQbTJ(this.OLrzqt).OLrzqt(this.values).copydefault(java.lang.Boolean.valueOf(this.gEmmrt)).copydefault(this.AEQbTJ).EZpvd(this.ejfBZ).KWHzl(this.copydefault).KWHzl(this.KWHzl);
    }
}
