package o;

import com.okinc.okapm.okqpl.reporter.QPLData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42540rWq {
    public final int AEQbTJ;
    public final QPLData KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C42540rWq copy$default(C42540rWq c42540rWq, int i, QPLData qPLData, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c42540rWq.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            qPLData = c42540rWq.KWHzl;
        }
        return c42540rWq.KWHzl(i, qPLData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QPLData EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42540rWq KWHzl(int i, @NotNull QPLData qPLData) {
        Intrinsics.checkNotNullParameter(qPLData, "");
        return new C42540rWq(i, qPLData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42540rWq)) {
            return false;
        }
        C42540rWq c42540rWq = (C42540rWq) obj;
        return this.AEQbTJ == c42540rWq.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c42540rWq.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QPLEntity(id=" + this.AEQbTJ + ", params=" + this.KWHzl + ")";
    }

    public C42540rWq(int i, @NotNull QPLData qPLData) {
        Intrinsics.checkNotNullParameter(qPLData, "");
        this.AEQbTJ = i;
        this.KWHzl = qPLData;
    }
}
