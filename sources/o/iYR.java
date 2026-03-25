package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iYR {

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements iYR {
        public final java.util.List<C27296jsX> AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.Integer AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String DbNXlk;
        public final boolean EZpvd;
        public final long KWHzl;
        public final java.lang.String OLrzqt;
        public final long copydefault;
        public final java.lang.Integer djBIcL;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @androidx.annotation.StringRes java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, @NotNull java.lang.String str7, @NotNull java.util.List<C27296jsX> list, long j, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(str, str2, str3, num, num2, str4, str5, str6, z, str7, list, j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C27296jsX> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) application.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) application.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) application.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && this.EZpvd == application.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) application.DbNXlk) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && this.KWHzl == application.KWHzl && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.valueOf.hashCode();
            java.lang.String str = this.AkhnZx;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            java.lang.Integer num = this.AhwBna;
            int iHashCode4 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.djBIcL;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.DbNXlk.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(title=" + this.valueOf + ", warning=" + this.AkhnZx + ", name=" + this.OLrzqt + ", tagLabel=" + this.AhwBna + ", tagStyle=" + this.djBIcL + ", trailingText=" + this.fetchVPNInfo + ", positionRange=" + this.AYXKKw + ", positionReverseRange=" + this.gEmmrt + ", isReverse=" + this.EZpvd + ", totalValue=" + this.DbNXlk + ", details=" + this.AEQbTJ + ", investmentId=" + this.KWHzl + ", chainId=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public Application(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @androidx.annotation.StringRes java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, @NotNull java.lang.String str7, @NotNull java.util.List<C27296jsX> list, long j, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.valueOf = str;
            this.AkhnZx = str2;
            this.OLrzqt = str3;
            this.AhwBna = num;
            this.djBIcL = num2;
            this.fetchVPNInfo = str4;
            this.AYXKKw = str5;
            this.gEmmrt = str6;
            this.EZpvd = z;
            this.DbNXlk = str7;
            this.AEQbTJ = list;
            this.KWHzl = j;
            this.copydefault = j2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (r30v0 java.util.List)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0056: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r31v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0060: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List<o.jsX>, long, long):void (m)] (LINE:9) call: o.iYR.Application.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List, long, long):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, java.lang.String str7, java.util.List list, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? false : z, (i & 512) != 0 ? "" : str7, list, (i & 2048) != 0 ? 0L : j, (i & 4096) != 0 ? 0L : j2);
        }
    }

    public static final class StateListAnimator implements iYR {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements iYR {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            return taskDescription.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}
