package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32795mkN {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final long AEQbTJ;
    public final long EZpvd;
    public final long KWHzl;
    public final long OLrzqt;
    public final C32791mkJ copydefault;
    public final long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32795mkN KWHzl(@NotNull C32791mkJ c32791mkJ, long j, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(c32791mkJ, "");
        return new C32795mkN(c32791mkJ, j, j2, j3, j4, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32791mkJ OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32795mkN)) {
            return false;
        }
        C32795mkN c32795mkN = (C32795mkN) obj;
        return Intrinsics.EZpvd(this.copydefault, c32795mkN.copydefault) && this.AEQbTJ == c32795mkN.AEQbTJ && this.OLrzqt == c32795mkN.OLrzqt && this.EZpvd == c32795mkN.EZpvd && this.KWHzl == c32795mkN.KWHzl && this.gEmmrt == c32795mkN.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StringPoolHeader(chunkHeader=" + this.copydefault + ", stringCount=" + this.AEQbTJ + ", styleCount=" + this.OLrzqt + ", flags=" + this.EZpvd + ", stringStart=" + this.KWHzl + ", styleStart=" + this.gEmmrt + ")";
    }

    public C32795mkN(@NotNull C32791mkJ c32791mkJ, long j, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(c32791mkJ, "");
        this.copydefault = c32791mkJ;
        this.AEQbTJ = j;
        this.OLrzqt = j2;
        this.EZpvd = j3;
        this.KWHzl = j4;
        this.gEmmrt = j5;
    }

    /* JADX INFO: renamed from: o.mkN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mkN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C32795mkN KWHzl(@NotNull java.nio.ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            return new C32795mkN(C32791mkJ.Companion.EZpvd(byteBuffer), C32790mkI.OLrzqt(byteBuffer), C32790mkI.OLrzqt(byteBuffer), C32790mkI.OLrzqt(byteBuffer), C32790mkI.OLrzqt(byteBuffer), C32790mkI.OLrzqt(byteBuffer));
        }
    }
}
