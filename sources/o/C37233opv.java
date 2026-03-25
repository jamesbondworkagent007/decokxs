package o;

import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37233opv {
    public final OKMessage AEQbTJ;
    public final IMImageModel OLrzqt;
    public final OKMediaMessageContent copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37233opv copy$default(C37233opv c37233opv, OKMessage oKMessage, OKMediaMessageContent oKMediaMessageContent, IMImageModel iMImageModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c37233opv.AEQbTJ;
        }
        if ((i & 2) != 0) {
            oKMediaMessageContent = c37233opv.copydefault;
        }
        if ((i & 4) != 0) {
            iMImageModel = c37233opv.OLrzqt;
        }
        return c37233opv.AEQbTJ(oKMessage, oKMediaMessageContent, iMImageModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37233opv AEQbTJ(@NotNull OKMessage oKMessage, @NotNull OKMediaMessageContent oKMediaMessageContent, @NotNull IMImageModel iMImageModel) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKMediaMessageContent, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        return new C37233opv(oKMessage, oKMediaMessageContent, iMImageModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMediaMessageContent EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMImageModel OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37233opv)) {
            return false;
        }
        C37233opv c37233opv = (C37233opv) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c37233opv.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c37233opv.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c37233opv.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MediaInfo(message=" + this.AEQbTJ + ", content=" + this.copydefault + ", imageInfo=" + this.OLrzqt + ")";
    }

    public C37233opv(@NotNull OKMessage oKMessage, @NotNull OKMediaMessageContent oKMediaMessageContent, @NotNull IMImageModel iMImageModel) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKMediaMessageContent, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        this.AEQbTJ = oKMessage;
        this.copydefault = oKMediaMessageContent;
        this.OLrzqt = iMImageModel;
    }
}
