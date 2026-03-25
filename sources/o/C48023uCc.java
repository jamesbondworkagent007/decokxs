package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48023uCc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final C48023uCc OLrzqt = new C48023uCc("0", "0", -1, -1);
    public final int AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48023uCc copy$default(C48023uCc c48023uCc, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c48023uCc.KWHzl;
        }
        if ((i3 & 2) != 0) {
            str2 = c48023uCc.copydefault;
        }
        if ((i3 & 4) != 0) {
            i = c48023uCc.AEQbTJ;
        }
        if ((i3 & 8) != 0) {
            i2 = c48023uCc.EZpvd;
        }
        return c48023uCc.OLrzqt(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48023uCc OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C48023uCc(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48023uCc)) {
            return false;
        }
        C48023uCc c48023uCc = (C48023uCc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48023uCc.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48023uCc.copydefault) && this.AEQbTJ == c48023uCc.AEQbTJ && this.EZpvd == c48023uCc.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MinMax(min=" + this.KWHzl + ", max=" + this.copydefault + ", minIndex=" + this.AEQbTJ + ", maxIndex=" + this.EZpvd + ")";
    }

    public C48023uCc(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.AEQbTJ = i;
        this.EZpvd = i2;
    }

    /* JADX INFO: renamed from: o.uCc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C48023uCc copydefault() {
            return C48023uCc.OLrzqt;
        }
    }
}
