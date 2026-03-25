package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35249nrk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final long AEQbTJ;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final float OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35249nrk copy$default(C35249nrk c35249nrk, java.lang.String str, long j, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c35249nrk.EZpvd;
        }
        if ((i2 & 2) != 0) {
            j = c35249nrk.AEQbTJ;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = c35249nrk.KWHzl;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            f = c35249nrk.OLrzqt;
        }
        return c35249nrk.copydefault(str, j2, i3, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35249nrk copydefault(@NotNull java.lang.String str, long j, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C35249nrk(str, j, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35249nrk)) {
            return false;
        }
        C35249nrk c35249nrk = (C35249nrk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c35249nrk.EZpvd) && this.AEQbTJ == c35249nrk.AEQbTJ && this.KWHzl == c35249nrk.KWHzl && java.lang.Float.compare(this.OLrzqt, c35249nrk.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Float.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlayAudioState(conversationId=" + this.EZpvd + ", messageId=" + this.AEQbTJ + ", state=" + this.KWHzl + ", progress=" + this.OLrzqt + ")";
    }

    public C35249nrk(@NotNull java.lang.String str, long j, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.AEQbTJ = j;
        this.KWHzl = i;
        this.OLrzqt = f;
    }

    /* JADX INFO: renamed from: o.nrk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
