package o;

import com.okinc.business.market.features.coindetail.ui.snipers.HoldActivity;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26041jPt implements kMU {
    public final java.util.List<TagWrapper> AEQbTJ;
    public final java.lang.String EZpvd;
    public final HoldActivity OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jPt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26041jPt copy$default(C26041jPt c26041jPt, HoldActivity holdActivity, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            holdActivity = c26041jPt.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c26041jPt.EZpvd;
        }
        if ((i & 4) != 0) {
            list = c26041jPt.AEQbTJ;
        }
        return c26041jPt.EZpvd(holdActivity, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TagWrapper> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26041jPt EZpvd(@NotNull HoldActivity holdActivity, @NotNull java.lang.String str, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(holdActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C26041jPt(holdActivity, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldActivity OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26041jPt)) {
            return false;
        }
        C26041jPt c26041jPt = (C26041jPt) obj;
        return this.OLrzqt == c26041jPt.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c26041jPt.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c26041jPt.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SniperHolderUiModel(status=" + this.OLrzqt + ", holderWalletAddress=" + this.EZpvd + ", newTagList=" + this.AEQbTJ + ")";
    }

    public C26041jPt(@NotNull HoldActivity holdActivity, @NotNull java.lang.String str, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(holdActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = holdActivity;
        this.EZpvd = str;
        this.AEQbTJ = list;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
