package o;

import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZT implements InterfaceC40516qYt {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault;
    public final long AEQbTJ;
    public final java.lang.String EZpvd;
    public final kotlin.Pair<java.lang.Integer, java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final C40432qVq gEmmrt;
    public final Triple<java.lang.Integer, java.lang.Integer, C40432qVq> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = C40432qVq.copydefault;
        copydefault = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40432qVq AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Triple<java.lang.Integer, java.lang.Integer, C40432qVq> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pZT copydefault(long j, @NotNull Triple<java.lang.Integer, java.lang.Integer, C40432qVq> triple, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, kotlin.Pair<java.lang.Integer, java.lang.String> pair, C40432qVq c40432qVq) {
        Intrinsics.checkNotNullParameter(triple, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new pZT(j, triple, str, str2, str3, pair, c40432qVq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pZT)) {
            return false;
        }
        pZT pzt = (pZT) obj;
        return this.AEQbTJ == pzt.AEQbTJ && Intrinsics.EZpvd(this.valueOf, pzt.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) pzt.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pzt.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pzt.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, pzt.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, pzt.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.AEQbTJ);
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        kotlin.Pair<java.lang.Integer, java.lang.String> pair = this.KWHzl;
        int iHashCode6 = pair == null ? 0 : pair.hashCode();
        C40432qVq c40432qVq = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (c40432qVq != null ? c40432qVq.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BoostInfoVo(activityId=" + this.AEQbTJ + ", countDownInf=" + this.valueOf + ", title=" + this.djBIcL + ", btnTxt=" + this.EZpvd + ", bannerUrl=" + this.OLrzqt + ", bottomInfoVo=" + this.KWHzl + ", nextRefreshTime=" + this.gEmmrt + ")";
    }

    public pZT(long j, @NotNull Triple<java.lang.Integer, java.lang.Integer, C40432qVq> triple, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, kotlin.Pair<java.lang.Integer, java.lang.String> pair, C40432qVq c40432qVq) {
        Intrinsics.checkNotNullParameter(triple, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = j;
        this.valueOf = triple;
        this.djBIcL = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.KWHzl = pair;
        this.gEmmrt = c40432qVq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r12v0 long)
  (r14v0 kotlin.Triple)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r18v0 kotlin.Pair))
  (wrap:o.qVq:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null o.qVq) : (r19v0 o.qVq))
 A[MD:(long, kotlin.Triple<java.lang.Integer, java.lang.Integer, o.qVq>, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.String>, o.qVq):void (m)] (LINE:34) call: o.pZT.<init>(long, kotlin.Triple, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, o.qVq):void type: THIS */
    public /* synthetic */ pZT(long j, Triple triple, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.Pair pair, C40432qVq c40432qVq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, triple, str, str2, str3, (i & 32) != 0 ? null : pair, (i & 64) != 0 ? null : c40432qVq);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        pZT pzt = interfaceC40516qYt instanceof pZT ? (pZT) interfaceC40516qYt : null;
        return pzt != null && pzt.AEQbTJ == this.AEQbTJ;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pZT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
