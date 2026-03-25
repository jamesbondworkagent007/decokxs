package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_setting.TopPadding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46104tHz extends InterfaceC47500trK {
    TopPadding AEQbTJ();

    java.lang.String AYXKKw();

    C46095tHq EZpvd();

    boolean KWHzl();

    float OLrzqt();

    boolean copydefault();

    java.lang.String djBIcL();

    boolean gEmmrt();

    /* JADX INFO: renamed from: o.tHz$TaskDescription */
    public static final class TaskDescription implements InterfaceC46104tHz {
        public final java.lang.Throwable AEQbTJ;
        public final boolean AhwBna;
        public final TopPadding EZpvd;
        public final C46095tHq KWHzl;
        public final float OLrzqt;
        public final boolean copydefault;
        public final boolean djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, TopPadding topPadding, float f, C46095tHq c46095tHq, boolean z, boolean z2, java.lang.Throwable th, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                topPadding = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                f = taskDescription.OLrzqt;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                c46095tHq = taskDescription.KWHzl;
            }
            C46095tHq c46095tHq2 = c46095tHq;
            if ((i & 8) != 0) {
                z = taskDescription.copydefault;
            }
            boolean z4 = z;
            if ((i & 16) != 0) {
                z2 = taskDescription.AhwBna;
            }
            boolean z5 = z2;
            if ((i & 32) != 0) {
                th = taskDescription.AEQbTJ;
            }
            java.lang.Throwable th2 = th;
            if ((i & 64) != 0) {
                z3 = taskDescription.djBIcL;
            }
            return taskDescription.copydefault(topPadding, f2, c46095tHq2, z4, z5, th2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public TopPadding AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public C46095tHq EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull TopPadding topPadding, float f, @NotNull C46095tHq c46095tHq, boolean z, boolean z2, @NotNull java.lang.Throwable th, boolean z3) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            Intrinsics.checkNotNullParameter(c46095tHq, "");
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskDescription(topPadding, f, c46095tHq, z, z2, th, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean copydefault() {
            return this.AhwBna;
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
            return this.EZpvd == taskDescription.EZpvd && java.lang.Float.compare(this.OLrzqt, taskDescription.OLrzqt) == 0 && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && this.copydefault == taskDescription.copydefault && this.AhwBna == taskDescription.AhwBna && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && this.djBIcL == taskDescription.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.EZpvd.hashCode() * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetError(paddingTop=" + this.EZpvd + ", rootHeight=" + this.OLrzqt + ", button=" + this.KWHzl + ", alignCenter=" + this.copydefault + ", smallTitleSize=" + this.AhwBna + ", error=" + this.AEQbTJ + ", useBottomSheetBackground=" + this.djBIcL + ")";
        }

        public TaskDescription(@NotNull TopPadding topPadding, float f, @NotNull C46095tHq c46095tHq, boolean z, boolean z2, @NotNull java.lang.Throwable th, boolean z3) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            Intrinsics.checkNotNullParameter(c46095tHq, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd = topPadding;
            this.OLrzqt = f;
            this.KWHzl = c46095tHq;
            this.copydefault = z;
            this.AhwBna = z2;
            this.AEQbTJ = th;
            this.djBIcL = z3;
        }

        public java.util.List<InterfaceC46104tHz> valueOf() {
            return Activity.copydefault(this);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (wrap:com.okinc.planet.biz_setting.TopPadding:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:158) com.okinc.planet.biz_setting.TopPadding.Default com.okinc.planet.biz_setting.TopPadding) : (r15v0 com.okinc.planet.biz_setting.TopPadding))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0009: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r16v0 float))
  (r17v0 o.tHq)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0023: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: CONSTRUCTOR 
  (0 int)
  (wrap:java.lang.String:0x002c: INVOKE (wrap:int:0x002a: SGET  A[WRAPPED] o.trL.Fragment.DbNXlk int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED])
  (null com.google.gson.JsonObject)
  (null java.lang.Throwable)
  (13 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(int, java.lang.String, com.google.gson.JsonObject, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:163) call: com.okinc.network.okg.response.OKServerException.<init>(int, java.lang.String, com.google.gson.JsonObject, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
 A[MD:(com.okinc.planet.biz_setting.TopPadding, float, o.tHq, boolean, boolean, java.lang.Throwable, boolean):void (m)] (LINE:157) call: o.tHz.TaskDescription.<init>(com.okinc.planet.biz_setting.TopPadding, float, o.tHq, boolean, boolean, java.lang.Throwable, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(TopPadding topPadding, float f, C46095tHq c46095tHq, boolean z, boolean z2, java.lang.Throwable th, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TopPadding.Default : topPadding, (i & 2) != 0 ? 0.0f : f, c46095tHq, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? new OKServerException(0, C33070mpX.AYXKKw(C47501trL.Fragment.DbNXlk), null, null, 13, null) : th, (i & 64) != 0 ? false : z3);
        }

        @Override // o.InterfaceC46104tHz
        public java.lang.String djBIcL() {
            return C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKffREWX);
        }

        @Override // o.InterfaceC46104tHz
        public java.lang.String AYXKKw() {
            return tRK.EZpvd(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.tHz$Application */
    public static final class Application implements InterfaceC46104tHz {
        public final C46095tHq AEQbTJ;
        public final boolean AYXKKw;
        public final java.lang.String AhwBna;
        public final TopPadding EZpvd;
        public final float KWHzl;
        public final int OLrzqt;
        public final boolean copydefault;
        public final java.lang.String djBIcL;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, 0.0f, null, null, false, 0, false, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public TopPadding AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(java.lang.String str, @NotNull TopPadding topPadding, float f, java.lang.String str2, C46095tHq c46095tHq, boolean z, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            return new Application(str, topPadding, f, str2, c46095tHq, z, i, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public C46095tHq EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public float OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public java.lang.String djBIcL() {
            return this.AhwBna;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && this.EZpvd == application.EZpvd && java.lang.Float.compare(this.KWHzl, application.KWHzl) == 0 && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && this.copydefault == application.copydefault && this.OLrzqt == application.OLrzqt && this.valueOf == application.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AhwBna;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = java.lang.Float.hashCode(this.KWHzl);
            java.lang.String str2 = this.djBIcL;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            C46095tHq c46095tHq = this.AEQbTJ;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c46095tHq != null ? c46095tHq.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoLogin(title=" + this.AhwBna + ", paddingTop=" + this.EZpvd + ", rootHeight=" + this.KWHzl + ", subtitle=" + this.djBIcL + ", button=" + this.AEQbTJ + ", alignCenter=" + this.copydefault + ", iconRes=" + this.OLrzqt + ", useBottomSheetBackground=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.OLrzqt;
        }

        public Application(java.lang.String str, @NotNull TopPadding topPadding, float f, java.lang.String str2, C46095tHq c46095tHq, boolean z, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            this.AhwBna = str;
            this.EZpvd = topPadding;
            this.KWHzl = f;
            this.djBIcL = str2;
            this.AEQbTJ = c46095tHq;
            this.copydefault = z;
            this.OLrzqt = i;
            this.valueOf = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.planet.biz_setting.TopPadding:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:172) com.okinc.planet.biz_setting.TopPadding.Default com.okinc.planet.biz_setting.TopPadding) : (r11v0 com.okinc.planet.biz_setting.TopPadding))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r12v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:o.tHq:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 o.tHq) : (null o.tHq))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: SGET  A[WRAPPED] o.wXj.TaskDescription.HJWChPRGtXKCDKRTZD int) : (r16v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
 A[MD:(java.lang.String, com.okinc.planet.biz_setting.TopPadding, float, java.lang.String, o.tHq, boolean, int, boolean):void (m)] (LINE:170) call: o.tHz.Application.<init>(java.lang.String, com.okinc.planet.biz_setting.TopPadding, float, java.lang.String, o.tHq, boolean, int, boolean):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, TopPadding topPadding, float f, java.lang.String str2, C46095tHq c46095tHq, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? TopPadding.Default : topPadding, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? c46095tHq : null, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? C52761wXj.TaskDescription.HJWChPRGtXKCDKRTZD : i, (i2 & 128) == 0 ? z2 : false);
        }
    }

    /* JADX INFO: renamed from: o.tHz$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC46104tHz {
        public final TopPadding AEQbTJ;
        public final boolean AhwBna;
        public final int EZpvd;
        public final C46095tHq KWHzl;
        public final boolean OLrzqt;
        public final float copydefault;
        public final java.lang.String djBIcL;
        public final boolean gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public TopPadding AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(java.lang.String str, @NotNull TopPadding topPadding, float f, C46095tHq c46095tHq, java.lang.String str2, boolean z, boolean z2, int i, boolean z3) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            return new StateListAnimator(str, topPadding, f, c46095tHq, str2, z, z2, i, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public C46095tHq EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public java.lang.String djBIcL() {
            return this.djBIcL;
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
            return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && this.AEQbTJ == stateListAnimator.AEQbTJ && java.lang.Float.compare(this.copydefault, stateListAnimator.copydefault) == 0 && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && this.OLrzqt == stateListAnimator.OLrzqt && this.AhwBna == stateListAnimator.AhwBna && this.EZpvd == stateListAnimator.EZpvd && this.gEmmrt == stateListAnimator.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.djBIcL;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = java.lang.Float.hashCode(this.copydefault);
            C46095tHq c46095tHq = this.KWHzl;
            int iHashCode4 = c46095tHq == null ? 0 : c46095tHq.hashCode();
            java.lang.String str2 = this.valueOf;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoData(title=" + this.djBIcL + ", paddingTop=" + this.AEQbTJ + ", rootHeight=" + this.copydefault + ", button=" + this.KWHzl + ", subtitle=" + this.valueOf + ", alignCenter=" + this.OLrzqt + ", smallTitleSize=" + this.AhwBna + ", iconRes=" + this.EZpvd + ", useBottomSheetBackground=" + this.gEmmrt + ")";
        }

        public StateListAnimator(java.lang.String str, @NotNull TopPadding topPadding, float f, C46095tHq c46095tHq, java.lang.String str2, boolean z, boolean z2, int i, boolean z3) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            this.djBIcL = str;
            this.AEQbTJ = topPadding;
            this.copydefault = f;
            this.KWHzl = c46095tHq;
            this.valueOf = str2;
            this.OLrzqt = z;
            this.AhwBna = z2;
            this.EZpvd = i;
            this.gEmmrt = z3;
        }

        public java.util.List<InterfaceC46104tHz> valueOf() {
            return Activity.copydefault(this);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:com.okinc.planet.biz_setting.TopPadding:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] (LINE:185) com.okinc.planet.biz_setting.TopPadding.Default com.okinc.planet.biz_setting.TopPadding) : (r15v0 com.okinc.planet.biz_setting.TopPadding))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r16v0 float))
  (wrap:o.tHq:?: TERNARY null = ((wrap:int:0x001c: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.tHq) : (r17v0 o.tHq))
  (r18v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] o.wXj.TaskDescription.HJWChPRGtXKC int) : (r21v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
 A[MD:(java.lang.String, com.okinc.planet.biz_setting.TopPadding, float, o.tHq, java.lang.String, boolean, boolean, int, boolean):void (m)] (LINE:183) call: o.tHz.StateListAnimator.<init>(java.lang.String, com.okinc.planet.biz_setting.TopPadding, float, o.tHq, java.lang.String, boolean, boolean, int, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, TopPadding topPadding, float f, C46095tHq c46095tHq, java.lang.String str2, boolean z, boolean z2, int i, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? TopPadding.Default : topPadding, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? null : c46095tHq, str2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? C52761wXj.TaskDescription.HJWChPRGtXKC : i, (i2 & 256) != 0 ? false : z3);
        }
    }

    /* JADX INFO: renamed from: o.tHz$ActionBar */
    public static final class ActionBar implements InterfaceC46104tHz {
        public final float AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final C46095tHq EZpvd;
        public final TopPadding KWHzl;
        public final boolean OLrzqt;
        public final int copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public TopPadding AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(java.lang.String str, @NotNull TopPadding topPadding, float f, C46095tHq c46095tHq, java.lang.String str2, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            return new ActionBar(str, topPadding, f, c46095tHq, str2, i, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public C46095tHq EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public float OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public java.lang.String djBIcL() {
            return this.gEmmrt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && this.KWHzl == actionBar.KWHzl && java.lang.Float.compare(this.AEQbTJ, actionBar.AEQbTJ) == 0 && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) actionBar.djBIcL) && this.copydefault == actionBar.copydefault && this.OLrzqt == actionBar.OLrzqt && this.AYXKKw == actionBar.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46104tHz
        public boolean gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.gEmmrt;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = java.lang.Float.hashCode(this.AEQbTJ);
            C46095tHq c46095tHq = this.EZpvd;
            int iHashCode4 = c46095tHq == null ? 0 : c46095tHq.hashCode();
            java.lang.String str2 = this.djBIcL;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Custom(title=" + this.gEmmrt + ", paddingTop=" + this.KWHzl + ", rootHeight=" + this.AEQbTJ + ", button=" + this.EZpvd + ", subtitle=" + this.djBIcL + ", iconRes=" + this.copydefault + ", alignCenter=" + this.OLrzqt + ", useBottomSheetBackground=" + this.AYXKKw + ")";
        }

        public ActionBar(java.lang.String str, @NotNull TopPadding topPadding, float f, C46095tHq c46095tHq, java.lang.String str2, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(topPadding, "");
            this.gEmmrt = str;
            this.KWHzl = topPadding;
            this.AEQbTJ = f;
            this.EZpvd = c46095tHq;
            this.djBIcL = str2;
            this.copydefault = i;
            this.OLrzqt = z;
            this.AYXKKw = z2;
        }
    }

    /* JADX INFO: renamed from: o.tHz$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public static java.util.List<InterfaceC46104tHz> copydefault(@NotNull InterfaceC46104tHz interfaceC46104tHz) {
            return C56402yEa.EZpvd(interfaceC46104tHz);
        }
    }
}
