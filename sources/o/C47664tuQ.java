package o;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.tuQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47664tuQ extends ViewModel {
    public final StateFlow<TaskDescription> AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public final MutableStateFlow<TaskDescription> OLrzqt;
    public boolean copydefault;
    public boolean gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AhwBna;
    }

    public C47664tuQ() {
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(new TaskDescription(false, false, false, false, false, false, false, false, false, false, false, false, 0L, 8191, null));
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = MutableStateFlow;
    }

    /* JADX INFO: renamed from: o.tuQ$TaskDescription */
    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final boolean AkhnZx;
        public final long DbNXlk;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final boolean djBIcL;
        public final boolean fetchVPNInfo;
        public final boolean gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(false, false, false, false, false, false, false, false, false, false, false, false, 0L, 8191, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j, int i, java.lang.Object obj) {
            return taskDescription.OLrzqt((i & 1) != 0 ? taskDescription.AhwBna : z, (i & 2) != 0 ? taskDescription.AYXKKw : z2, (i & 4) != 0 ? taskDescription.gEmmrt : z3, (i & 8) != 0 ? taskDescription.EZpvd : z4, (i & 16) != 0 ? taskDescription.KWHzl : z5, (i & 32) != 0 ? taskDescription.OLrzqt : z6, (i & 64) != 0 ? taskDescription.fetchVPNInfo : z7, (i & 128) != 0 ? taskDescription.djBIcL : z8, (i & 256) != 0 ? taskDescription.AEQbTJ : z9, (i & 512) != 0 ? taskDescription.AkhnZx : z10, (i & 1024) != 0 ? taskDescription.copydefault : z11, (i & 2048) != 0 ? taskDescription.valueOf : z12, (i & 4096) != 0 ? taskDescription.DbNXlk : j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AYXKKw() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return (this.AhwBna || this.AYXKKw || this.gEmmrt || this.EZpvd || this.KWHzl || this.OLrzqt) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.fetchVPNInfo && this.djBIcL && this.AEQbTJ && this.AkhnZx && this.copydefault && this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j) {
            return new TaskDescription(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.gEmmrt;
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
            return this.AhwBna == taskDescription.AhwBna && this.AYXKKw == taskDescription.AYXKKw && this.gEmmrt == taskDescription.gEmmrt && this.EZpvd == taskDescription.EZpvd && this.KWHzl == taskDescription.KWHzl && this.OLrzqt == taskDescription.OLrzqt && this.fetchVPNInfo == taskDescription.fetchVPNInfo && this.djBIcL == taskDescription.djBIcL && this.AEQbTJ == taskDescription.AEQbTJ && this.AkhnZx == taskDescription.AkhnZx && this.copydefault == taskDescription.copydefault && this.valueOf == taskDescription.valueOf && this.DbNXlk == taskDescription.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((java.lang.Boolean.hashCode(this.AhwBna) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.AkhnZx)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Long.hashCode(this.DbNXlk);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LeaderboardContentState(hasTopTradersContent=" + this.AhwBna + ", hasTopOrbitersContent=" + this.AYXKKw + ", hasTrendingGroupContent=" + this.gEmmrt + ", hasSpotlightContent=" + this.EZpvd + ", hasFollowingContent=" + this.KWHzl + ", hasLatestNewsContent=" + this.OLrzqt + ", tradersLoaded=" + this.fetchVPNInfo + ", orbitersLoaded=" + this.djBIcL + ", groupsLoaded=" + this.AEQbTJ + ", spotlightLoaded=" + this.AkhnZx + ", followingLoaded=" + this.copydefault + ", latestNewsLoaded=" + this.valueOf + ", version=" + this.DbNXlk + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.AhwBna;
        }

        public TaskDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j) {
            this.AhwBna = z;
            this.AYXKKw = z2;
            this.gEmmrt = z3;
            this.EZpvd = z4;
            this.KWHzl = z5;
            this.OLrzqt = z6;
            this.fetchVPNInfo = z7;
            this.djBIcL = z8;
            this.AEQbTJ = z9;
            this.AkhnZx = z10;
            this.copydefault = z11;
            this.valueOf = z12;
            this.DbNXlk = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0087: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 boolean) : false)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0062: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r28v0 long))
 A[MD:(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, long):void (m)] (LINE:9) call: o.tuQ.TaskDescription.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, long):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) != 0 ? false : z11, (i & 2048) == 0 ? z12 : false, (i & 4096) != 0 ? 0L : j);
        }
    }

    public static /* synthetic */ void updateTopTradersState$default(C47664tuQ c47664tuQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47664tuQ.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), z, false, false, false, false, false, z2, false, false, false, false, false, this.OLrzqt.getValue().AYXKKw() + 1, 4030, null));
    }

    public static /* synthetic */ void updateTopOrbitersState$default(C47664tuQ c47664tuQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47664tuQ.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, z, false, false, false, false, false, z2, false, false, false, false, this.OLrzqt.getValue().AYXKKw() + 1, 3965, null));
    }

    public static /* synthetic */ void updateTrendingGroupState$default(C47664tuQ c47664tuQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47664tuQ.gEmmrt(z, z2);
    }

    public final void gEmmrt(boolean z, boolean z2) {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, z, false, false, false, false, false, z2, false, false, false, this.OLrzqt.getValue().AYXKKw() + 1, 3835, null));
    }

    public static /* synthetic */ void updateSpotlightState$default(C47664tuQ c47664tuQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47664tuQ.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, z, false, false, false, false, false, z2, false, false, this.OLrzqt.getValue().AYXKKw() + 1, 3575, null));
    }

    public static /* synthetic */ void updateFollowingState$default(C47664tuQ c47664tuQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47664tuQ.KWHzl(z, z2);
    }

    public final void KWHzl(boolean z, boolean z2) {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, false, z, false, false, false, false, false, z2, false, this.OLrzqt.getValue().AYXKKw() + 1, 3055, null));
    }

    public static /* synthetic */ void updateLatestNewsState$default(C47664tuQ c47664tuQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47664tuQ.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, false, false, z, false, false, false, false, false, z2, this.OLrzqt.getValue().AYXKKw() + 1, 2015, null));
    }

    public final void AhwBna() {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, false, false, false, false, false, false, false, false, false, 0L, 4159, null));
    }
}
