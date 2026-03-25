package o;

import com.okinc.im.imui.share.model.SearchPayload;
import com.okinc.im.imui.share.model.SelectionStatus;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37580owX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = ShareTarget.copydefault;
    public final java.lang.String AEQbTJ;
    public final ShareTarget OLrzqt;
    public final SelectionStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37580owX copy$default(C37580owX c37580owX, ShareTarget shareTarget, java.lang.String str, SelectionStatus selectionStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            shareTarget = c37580owX.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c37580owX.AEQbTJ;
        }
        if ((i & 4) != 0) {
            selectionStatus = c37580owX.copydefault;
        }
        return c37580owX.OLrzqt(shareTarget, str, selectionStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionStatus AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareTarget OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37580owX OLrzqt(@NotNull ShareTarget shareTarget, java.lang.String str, @NotNull SelectionStatus selectionStatus) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        Intrinsics.checkNotNullParameter(selectionStatus, "");
        return new C37580owX(shareTarget, str, selectionStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37580owX)) {
            return false;
        }
        C37580owX c37580owX = (C37580owX) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c37580owX.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c37580owX.AEQbTJ) && this.copydefault == c37580owX.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareMessageOption(shareTarget=" + this.OLrzqt + ", keyword=" + this.AEQbTJ + ", selectionStatus=" + this.copydefault + ")";
    }

    public C37580owX(@NotNull ShareTarget shareTarget, java.lang.String str, @NotNull SelectionStatus selectionStatus) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        Intrinsics.checkNotNullParameter(selectionStatus, "");
        this.OLrzqt = shareTarget;
        this.AEQbTJ = str;
        this.copydefault = selectionStatus;
    }

    /* JADX INFO: renamed from: o.owX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.owX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SearchPayload OLrzqt(@NotNull C37580owX c37580owX, @NotNull C37580owX c37580owX2) {
            Intrinsics.checkNotNullParameter(c37580owX, "");
            Intrinsics.checkNotNullParameter(c37580owX2, "");
            if (Intrinsics.EZpvd((java.lang.Object) c37580owX.EZpvd(), (java.lang.Object) c37580owX2.EZpvd()) && c37580owX.AEQbTJ() == c37580owX2.AEQbTJ()) {
                return null;
            }
            return SearchPayload.KEYWORD_OR_SELECTION;
        }
    }
}
