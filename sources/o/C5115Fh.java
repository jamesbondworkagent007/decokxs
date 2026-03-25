package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5115Fh implements InterfaceC5096Eo {
    public final java.lang.String copydefault;
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final C5115Fh KWHzl = new C5115Fh("member");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5115Fh copy$default(C5115Fh c5115Fh, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5115Fh.copydefault;
        }
        return c5115Fh.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5115Fh AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C5115Fh(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5115Fh) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C5115Fh) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "XmlCollectionName(element=" + this.copydefault + ')';
    }

    public C5115Fh(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX INFO: renamed from: o.Fh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Fh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C5115Fh OLrzqt() {
            return C5115Fh.KWHzl;
        }
    }
}
