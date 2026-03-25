package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.mhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32625mhC {
    public static final C32625mhC KWHzl = new C32625mhC();
    public static final Regex AYXKKw = new Regex("VmSize:\\s*(\\d+)\\s*kB");
    public static final Regex valueOf = new Regex("VmRSS:\\s*(\\d+)\\s*kB");
    public static final Regex AhwBna = new Regex("Threads:\\s*(\\d+)\\s*");
    public static final Regex djBIcL = new Regex("MemTotal:\\s*(\\d+)\\s*kB");
    public static final Regex OLrzqt = new Regex("MemFree:\\s*(\\d+)\\s*kB");
    public static final Regex AEQbTJ = new Regex("MemAvailable:\\s*(\\d+)\\s*kB");
    public static final Regex copydefault = new Regex("CmaTotal:\\s*(\\d+)\\s*kB");
    public static StateListAnimator values = new StateListAnimator(0, 0, 0, 7, null);
    public static ActionBar DbNXlk = new ActionBar(0, 0, 0, 0, 0.0f, 31, null);
    public static TaskDescription gEmmrt = new TaskDescription(0, 0, 0, 0, 0.0f, 31, null);
    public static java.io.File isConnected = new java.io.File("/proc/self/status");
    public static java.io.File AkhnZx = new java.io.File("/proc/meminfo");
    public static java.lang.Runtime fetchVPNInfo = java.lang.Runtime.getRuntime();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription EZpvd() {
        return gEmmrt;
    }

    private C32625mhC() {
    }

    public final void KWHzl() {
        gEmmrt = new TaskDescription(0L, 0L, 0L, 0L, 0.0f, 31, null);
        values = new StateListAnimator(0, 0, 0, 7, null);
        DbNXlk = new ActionBar(0, 0, 0, 0, 0.0f, 31, null);
        gEmmrt.AEQbTJ(fetchVPNInfo.maxMemory());
        gEmmrt.copydefault(fetchVPNInfo.totalMemory());
        gEmmrt.KWHzl(fetchVPNInfo.freeMemory());
        TaskDescription taskDescription = gEmmrt;
        taskDescription.EZpvd(taskDescription.OLrzqt() - gEmmrt.copydefault());
        gEmmrt.copydefault((r0.EZpvd() * 1.0f) / gEmmrt.AEQbTJ());
        forEachLineQuietly$default(this, isConnected, null, new Function1() { // from class: o.mhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32625mhC.AEQbTJ((java.lang.String) obj);
            }
        }, 1, null);
        forEachLineQuietly$default(this, AkhnZx, null, new Function1() { // from class: o.mhG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32625mhC.copydefault((java.lang.String) obj);
            }
        }, 1, null);
        DbNXlk.AEQbTJ((r0.AEQbTJ() * 1.0f) / DbNXlk.EZpvd());
        pUU.KWHzl("MemoryInfo", "----Current Memory Print----");
        float f = 100;
        pUU.KWHzl("MemoryInfo", "[java] max:" + (gEmmrt.AEQbTJ() / ((long) 1024)) + "kB used ratio:" + ((int) (gEmmrt.KWHzl() * f)) + "%");
        pUU.KWHzl("MemoryInfo", "[proc] VmSize:" + values.copydefault() + "kB vmPeak:" + values.KWHzl() + "kB Threads:" + values.AEQbTJ());
        pUU.KWHzl("MemoryInfo", "[meminfo] MemTotal:" + DbNXlk.EZpvd() + "kB MemFree:" + DbNXlk.copydefault() + "kB MemAvailable:" + DbNXlk.AEQbTJ() + "kB");
        pUU.KWHzl("MemoryInfo", "avaliable ratio:" + ((int) (DbNXlk.KWHzl() * f)) + "% CmaTotal:" + DbNXlk.OLrzqt() + "kB");
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (values.copydefault() != 0 && values.KWHzl() != 0 && values.AEQbTJ() != 0) {
            return Unit.INSTANCE;
        }
        if (C59449zhJ.startsWith$default(str, "VmSize", false, 2, null)) {
            values.copydefault(KWHzl.copydefault(AYXKKw, str));
        } else if (C59449zhJ.startsWith$default(str, "VmRSS", false, 2, null)) {
            values.EZpvd(KWHzl.copydefault(valueOf, str));
        } else if (C59449zhJ.startsWith$default(str, "Threads", false, 2, null)) {
            values.AEQbTJ(KWHzl.copydefault(AhwBna, str));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.startsWith$default(str, "MemTotal", false, 2, null)) {
            DbNXlk.AEQbTJ(KWHzl.copydefault(djBIcL, str));
        } else if (C59449zhJ.startsWith$default(str, "MemFree", false, 2, null)) {
            DbNXlk.OLrzqt(KWHzl.copydefault(OLrzqt, str));
        } else if (C59449zhJ.startsWith$default(str, "MemAvailable", false, 2, null)) {
            DbNXlk.EZpvd(KWHzl.copydefault(AEQbTJ, str));
        } else if (C59449zhJ.startsWith$default(str, "CmaTotal", false, 2, null)) {
            DbNXlk.copydefault(KWHzl.copydefault(copydefault, str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mhC$StateListAnimator */
    public static final class StateListAnimator {
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(0, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = stateListAnimator.copydefault;
            }
            if ((i4 & 2) != 0) {
                i2 = stateListAnimator.KWHzl;
            }
            if ((i4 & 4) != 0) {
                i3 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.copydefault = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(int i, int i2, int i3) {
            return new StateListAnimator(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.KWHzl = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.copydefault == stateListAnimator.copydefault && this.KWHzl == stateListAnimator.KWHzl && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ProcStatus(thread=" + this.copydefault + ", vmSizeKb=" + this.KWHzl + ", vmPeakKb=" + this.OLrzqt + ")";
        }

        public StateListAnimator(int i, int i2, int i3) {
            this.copydefault = i;
            this.KWHzl = i2;
            this.OLrzqt = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int, int):void (m)] (LINE:103) call: o.mhC.StateListAnimator.<init>(int, int, int):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    /* JADX INFO: renamed from: o.mhC$ActionBar */
    public static final class ActionBar {
        public int AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0, 0, 0, 0, 0.0f, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, int i3, int i4, float f, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = actionBar.EZpvd;
            }
            if ((i5 & 2) != 0) {
                i2 = actionBar.KWHzl;
            }
            int i6 = i2;
            if ((i5 & 4) != 0) {
                i3 = actionBar.OLrzqt;
            }
            int i7 = i3;
            if ((i5 & 8) != 0) {
                i4 = actionBar.AEQbTJ;
            }
            int i8 = i4;
            if ((i5 & 16) != 0) {
                f = actionBar.copydefault;
            }
            return actionBar.KWHzl(i, i6, i7, i8, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(int i, int i2, int i3, int i4, float f) {
            return new ActionBar(i, i2, i3, i4, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.KWHzl = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.EZpvd == actionBar.EZpvd && this.KWHzl == actionBar.KWHzl && this.OLrzqt == actionBar.OLrzqt && this.AEQbTJ == actionBar.AEQbTJ && java.lang.Float.compare(this.copydefault, actionBar.copydefault) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Float.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MemInfo(totalInKb=" + this.EZpvd + ", freeInKb=" + this.KWHzl + ", availableInKb=" + this.OLrzqt + ", cmaTotal=" + this.AEQbTJ + ", rate=" + this.copydefault + ")";
        }

        public ActionBar(int i, int i2, int i3, int i4, float f) {
            this.EZpvd = i;
            this.KWHzl = i2;
            this.OLrzqt = i3;
            this.AEQbTJ = i4;
            this.copydefault = f;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r8v0 float))
 A[MD:(int, int, int, int, float):void (m)] (LINE:110) call: o.mhC.ActionBar.<init>(int, int, int, int, float):void type: THIS */
        public /* synthetic */ ActionBar(int i, int i2, int i3, int i4, float f, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? 0.0f : f);
        }
    }

    /* JADX INFO: renamed from: o.mhC$TaskDescription */
    public static final class TaskDescription {
        public long AEQbTJ;
        public long EZpvd;
        public long KWHzl;
        public long OLrzqt;
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0L, 0L, 0L, 0L, 0.0f, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(long j) {
            this.KWHzl = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(long j) {
            this.OLrzqt = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(long j, long j2, long j3, long j4, float f) {
            return new TaskDescription(j, j2, j3, j4, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(long j) {
            this.EZpvd = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(long j) {
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.KWHzl == taskDescription.KWHzl && this.AEQbTJ == taskDescription.AEQbTJ && this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt && java.lang.Float.compare(this.copydefault, taskDescription.copydefault) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Long.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "JavaHeap(max=" + this.KWHzl + ", total=" + this.AEQbTJ + ", free=" + this.EZpvd + ", used=" + this.OLrzqt + ", rate=" + this.copydefault + ")";
        }

        public TaskDescription(long j, long j2, long j3, long j4, float f) {
            this.KWHzl = j;
            this.AEQbTJ = j2;
            this.EZpvd = j3;
            this.OLrzqt = j4;
            this.copydefault = f;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r19v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r16v0 long) : (0 long))
  (wrap:float:?: TERNARY null = ((wrap:int:0x001e: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r18v0 float))
 A[MD:(long, long, long, long, float):void (m)] (LINE:122) call: o.mhC.TaskDescription.<init>(long, long, long, long, float):void type: THIS */
        public /* synthetic */ TaskDescription(long j, long j2, long j3, long j4, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) == 0 ? j4 : 0L, (i & 16) != 0 ? 0.0f : f);
        }
    }

    public final int copydefault(Regex regex, java.lang.String str) {
        java.util.List<java.lang.String> listOLrzqt;
        java.lang.String str2;
        MatchResult matchResultMatchEntire = regex.matchEntire(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString());
        if (matchResultMatchEntire == null || (listOLrzqt = matchResultMatchEntire.OLrzqt()) == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt, 1)) == null) {
            return 0;
        }
        return java.lang.Integer.parseInt(str2);
    }

    public static /* synthetic */ void forEachLineQuietly$default(C32625mhC c32625mhC, java.io.File file, java.nio.charset.Charset charset, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        c32625mhC.KWHzl(file, charset, function1);
    }

    public final void KWHzl(java.io.File file, java.nio.charset.Charset charset, Function1<? super java.lang.String, Unit> function1) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            yFK.AEQbTJ(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset)), function1);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
        }
    }
}
