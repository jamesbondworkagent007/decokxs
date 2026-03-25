package o;

import com.amplitude.core.platform.WriteQueueMessageType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5259Kv {
    public final C5242Ke EZpvd;
    public final WriteQueueMessageType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5259Kv copy$default(C5259Kv c5259Kv, WriteQueueMessageType writeQueueMessageType, C5242Ke c5242Ke, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            writeQueueMessageType = c5259Kv.KWHzl;
        }
        if ((i & 2) != 0) {
            c5242Ke = c5259Kv.EZpvd;
        }
        return c5259Kv.KWHzl(writeQueueMessageType, c5242Ke);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WriteQueueMessageType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5242Ke EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5259Kv KWHzl(@NotNull WriteQueueMessageType writeQueueMessageType, C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(writeQueueMessageType, "");
        return new C5259Kv(writeQueueMessageType, c5242Ke);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5259Kv)) {
            return false;
        }
        C5259Kv c5259Kv = (C5259Kv) obj;
        return this.KWHzl == c5259Kv.KWHzl && Intrinsics.EZpvd(this.EZpvd, c5259Kv.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        C5242Ke c5242Ke = this.EZpvd;
        return (iHashCode * 31) + (c5242Ke == null ? 0 : c5242Ke.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WriteQueueMessage(type=" + this.KWHzl + ", event=" + this.EZpvd + ')';
    }

    public C5259Kv(@NotNull WriteQueueMessageType writeQueueMessageType, C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(writeQueueMessageType, "");
        this.KWHzl = writeQueueMessageType;
        this.EZpvd = c5242Ke;
    }
}
