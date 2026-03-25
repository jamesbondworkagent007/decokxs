package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23630iDm {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final C23630iDm OLrzqt = new C23630iDm(null, null, null, 7, null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23630iDm() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23630iDm copy$default(C23630iDm c23630iDm, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c23630iDm.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c23630iDm.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = c23630iDm.AEQbTJ;
        }
        return c23630iDm.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23630iDm OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C23630iDm(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23630iDm)) {
            return false;
        }
        C23630iDm c23630iDm = (C23630iDm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23630iDm.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23630iDm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c23630iDm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenPrice(marketCap=" + this.KWHzl + ", price=" + this.EZpvd + ", precision=" + this.AEQbTJ + ")";
    }

    public C23630iDm(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: o.iDm.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C23630iDm(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX INFO: renamed from: o.iDm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iDm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C23630iDm KWHzl() {
            return C23630iDm.OLrzqt;
        }
    }
}
