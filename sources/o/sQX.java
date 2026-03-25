package o;

import com.okinc.okimcore.model.share.IMMessageShareModelV2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQX {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final IMMessageShareModelV2 EZpvd;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sQX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ sQX copy$default(sQX sqx, java.util.List list, java.util.List list2, IMMessageShareModelV2 iMMessageShareModelV2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = sqx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = sqx.copydefault;
        }
        if ((i & 4) != 0) {
            iMMessageShareModelV2 = sqx.EZpvd;
        }
        return sqx.EZpvd(list, list2, iMMessageShareModelV2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMMessageShareModelV2 AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sQX EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull IMMessageShareModelV2 iMMessageShareModelV2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(iMMessageShareModelV2, "");
        return new sQX(list, list2, iMMessageShareModelV2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sQX)) {
            return false;
        }
        sQX sqx = (sQX) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, sqx.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, sqx.copydefault) && Intrinsics.EZpvd(this.EZpvd, sqx.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareContentPayload(channelIds=" + this.AEQbTJ + ", userUids=" + this.copydefault + ", content=" + this.EZpvd + ")";
    }

    public sQX(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull IMMessageShareModelV2 iMMessageShareModelV2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(iMMessageShareModelV2, "");
        this.AEQbTJ = list;
        this.copydefault = list2;
        this.EZpvd = iMMessageShareModelV2;
    }
}
