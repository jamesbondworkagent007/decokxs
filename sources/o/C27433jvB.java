package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27433jvB implements InterfaceC27436jvE {
    public static final Application Companion = new Application(null);
    public final long AEQbTJ = java.lang.System.currentTimeMillis();
    public final float KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27433jvB copy$default(C27433jvB c27433jvB, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c27433jvB.KWHzl;
        }
        return c27433jvB.OLrzqt(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27433jvB OLrzqt(float f) {
        return new C27433jvB(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27433jvB) && java.lang.Float.compare(this.KWHzl, ((C27433jvB) obj).KWHzl) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Float.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiSpacing(spaceDp=" + this.KWHzl + ")";
    }

    /* JADX INFO: renamed from: o.jvB$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jvB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C27433jvB(float f) {
        this.KWHzl = f;
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27433jvB c27433jvB = interfaceC27436jvE instanceof C27433jvB ? (C27433jvB) interfaceC27436jvE : null;
        return c27433jvB != null && this.AEQbTJ == c27433jvB.AEQbTJ;
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27433jvB c27433jvB = interfaceC27436jvE instanceof C27433jvB ? (C27433jvB) interfaceC27436jvE : null;
        return c27433jvB != null && this.KWHzl == c27433jvB.KWHzl;
    }
}
