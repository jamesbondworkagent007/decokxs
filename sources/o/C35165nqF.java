package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35165nqF {
    public static final Activity Companion = new Activity(null);
    public static final C35165nqF OLrzqt = new C35165nqF(30000, "PopupPriorityMgr");
    public final long AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35165nqF copy$default(C35165nqF c35165nqF, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c35165nqF.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c35165nqF.copydefault;
        }
        return c35165nqF.EZpvd(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35165nqF EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C35165nqF(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35165nqF)) {
            return false;
        }
        C35165nqF c35165nqF = (C35165nqF) obj;
        return this.AEQbTJ == c35165nqF.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35165nqF.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PopupBuildConfig(popupTimeoutMillis=" + this.AEQbTJ + ", tag=" + this.copydefault + ")";
    }

    public C35165nqF(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = j;
        this.copydefault = str;
    }

    /* JADX INFO: renamed from: o.nqF$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nqF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C35165nqF KWHzl() {
            return C35165nqF.OLrzqt;
        }
    }
}
