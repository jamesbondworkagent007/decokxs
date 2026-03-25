package o;

import com.okinc.components.security.scanner.utils.ResourceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32791mkJ {
    public static final Application Companion = new Application(null);
    public final long EZpvd;
    public final ResourceType KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32791mkJ copy$default(C32791mkJ c32791mkJ, ResourceType resourceType, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            resourceType = c32791mkJ.KWHzl;
        }
        if ((i2 & 2) != 0) {
            i = c32791mkJ.copydefault;
        }
        if ((i2 & 4) != 0) {
            j = c32791mkJ.EZpvd;
        }
        return c32791mkJ.KWHzl(resourceType, i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32791mkJ KWHzl(@NotNull ResourceType resourceType, int i, long j) {
        Intrinsics.checkNotNullParameter(resourceType, "");
        return new C32791mkJ(resourceType, i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32791mkJ)) {
            return false;
        }
        C32791mkJ c32791mkJ = (C32791mkJ) obj;
        return this.KWHzl == c32791mkJ.KWHzl && this.copydefault == c32791mkJ.copydefault && this.EZpvd == c32791mkJ.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChunkHeader(type=" + this.KWHzl + ", headerSize=" + this.copydefault + ", size=" + this.EZpvd + ")";
    }

    public C32791mkJ(@NotNull ResourceType resourceType, int i, long j) {
        Intrinsics.checkNotNullParameter(resourceType, "");
        this.KWHzl = resourceType;
        this.copydefault = i;
        this.EZpvd = j;
    }

    /* JADX INFO: renamed from: o.mkJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mkJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C32791mkJ EZpvd(@NotNull java.nio.ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            return new C32791mkJ(ResourceType.Companion.OLrzqt(C32790mkI.KWHzl(byteBuffer)), C32790mkI.KWHzl(byteBuffer), C32790mkI.OLrzqt(byteBuffer));
        }
    }
}
