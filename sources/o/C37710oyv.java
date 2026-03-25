package o;

import com.okinc.im.imui.tracking.model.MediaType;
import com.okinc.im.imui.tracking.model.ResultState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37710oyv {
    public final ResultState AEQbTJ;
    public final MediaType KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37710oyv copy$default(C37710oyv c37710oyv, java.lang.String str, ResultState resultState, java.lang.String str2, MediaType mediaType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c37710oyv.copydefault;
        }
        if ((i & 2) != 0) {
            resultState = c37710oyv.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = c37710oyv.OLrzqt;
        }
        if ((i & 8) != 0) {
            mediaType = c37710oyv.KWHzl;
        }
        return c37710oyv.copydefault(str, resultState, str2, mediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultState OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37710oyv copydefault(@NotNull java.lang.String str, @NotNull ResultState resultState, @NotNull java.lang.String str2, MediaType mediaType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(resultState, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C37710oyv(str, resultState, str2, mediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37710oyv)) {
            return false;
        }
        C37710oyv c37710oyv = (C37710oyv) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c37710oyv.copydefault) && this.AEQbTJ == c37710oyv.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c37710oyv.OLrzqt) && this.KWHzl == c37710oyv.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        MediaType mediaType = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (mediaType == null ? 0 : mediaType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MediaMessageTrackerEventData(conversationId=" + this.copydefault + ", resultState=" + this.AEQbTJ + ", sendOrReceiveTime=" + this.OLrzqt + ", mediaType=" + this.KWHzl + ")";
    }

    public C37710oyv(@NotNull java.lang.String str, @NotNull ResultState resultState, @NotNull java.lang.String str2, MediaType mediaType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(resultState, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = resultState;
        this.OLrzqt = str2;
        this.KWHzl = mediaType;
    }
}
