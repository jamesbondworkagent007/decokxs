package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39037pkj {
    public final java.util.Set<InterfaceC39046pks> AEQbTJ;
    public final java.util.Set<InterfaceC39040pkm> EZpvd;
    public final C39043pkp<?> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39043pkp<?> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<InterfaceC39040pkm> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<InterfaceC39046pks> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Set<? extends o.pkm> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Set<? extends o.pks> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39037pkj(@NotNull C39043pkp<?> c39043pkp, @NotNull java.util.Set<? extends InterfaceC39040pkm> set, @NotNull java.util.Set<? extends InterfaceC39046pks> set2) {
        Intrinsics.checkNotNullParameter(c39043pkp, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(set2, "");
        this.OLrzqt = c39043pkp;
        this.EZpvd = set;
        this.AEQbTJ = set2;
    }

    public java.lang.String toString() {
        return "Components(viewWrapper = " + this.OLrzqt + ",dataComponents = " + this.EZpvd + " , uiComponents = " + this.AEQbTJ + ")";
    }

    /* JADX INFO: renamed from: o.pkj$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final Function0<C39037pkj> OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<C39037pkj> OLrzqt() {
            return this.OLrzqt;
        }

        public TaskDescription(boolean z, @NotNull java.lang.String str, @NotNull Function0<C39037pkj> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.copydefault = z;
            this.AEQbTJ = str;
            this.OLrzqt = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("default") : (r2v0 java.lang.String))
  (r3v0 kotlin.jvm.functions.Function0)
 A[MD:(boolean, java.lang.String, kotlin.jvm.functions.Function0<o.pkj>):void (m)] (LINE:35) call: o.pkj.TaskDescription.<init>(boolean, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, java.lang.String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "default" : str, function0);
        }
    }
}
