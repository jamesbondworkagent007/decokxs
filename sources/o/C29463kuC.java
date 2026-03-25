package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29463kuC {
    public final boolean AEQbTJ;
    public final java.util.Set<Application> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29463kuC() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kuC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29463kuC copy$default(C29463kuC c29463kuC, boolean z, boolean z2, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29463kuC.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c29463kuC.copydefault;
        }
        if ((i & 4) != 0) {
            set = c29463kuC.OLrzqt;
        }
        return c29463kuC.KWHzl(z, z2, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<Application> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29463kuC KWHzl(boolean z, boolean z2, @NotNull java.util.Set<Application> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new C29463kuC(z, z2, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29463kuC)) {
            return false;
        }
        C29463kuC c29463kuC = (C29463kuC) obj;
        return this.AEQbTJ == c29463kuC.AEQbTJ && this.copydefault == c29463kuC.copydefault && Intrinsics.EZpvd(this.OLrzqt, c29463kuC.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalAlertUiModel(isShowNotificationsBanner=" + this.AEQbTJ + ", isGeneralAlertSet=" + this.copydefault + ", tokenAlerts=" + this.OLrzqt + ")";
    }

    public C29463kuC(boolean z, boolean z2, @NotNull java.util.Set<Application> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.OLrzqt = set;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Set:0x000f: INVOKE  STATIC call: o.yEE.copydefault():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:107)) : (r4v0 java.util.Set))
 A[MD:(boolean, boolean, java.util.Set<o.kuC$Application>):void (m)] (LINE:104) call: o.kuC.<init>(boolean, boolean, java.util.Set):void type: THIS */
    public /* synthetic */ C29463kuC(boolean z, boolean z2, java.util.Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? yEE.copydefault() : set);
    }

    /* JADX INFO: renamed from: o.kuC$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.AEQbTJ;
            }
            return application.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenAlert(chainId=" + this.OLrzqt + ", tokenContractAddress=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:109) call: o.kuC.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }
}
