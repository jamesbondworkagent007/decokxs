package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9756bbb {
    public static final Activity Companion = new Activity(null);
    public final int KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9756bbb copy$default(C9756bbb c9756bbb, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c9756bbb.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str = c9756bbb.copydefault;
        }
        return c9756bbb.OLrzqt(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9756bbb OLrzqt(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C9756bbb(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9756bbb)) {
            return false;
        }
        C9756bbb c9756bbb = (C9756bbb) obj;
        return this.KWHzl == c9756bbb.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c9756bbb.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TonAddress(type=" + this.KWHzl + ", addr=" + this.copydefault + ")";
    }

    public C9756bbb(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = i;
        this.copydefault = str;
    }

    /* JADX INFO: renamed from: o.bbb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bbb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
