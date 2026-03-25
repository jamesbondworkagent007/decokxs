package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36560odK {
    public static final int AEQbTJ = GroupInfo.$stable | OKMessage.$stable;
    public final GroupInfo KWHzl;
    public final OKMessage copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C36560odK copy$default(C36560odK c36560odK, OKMessage oKMessage, GroupInfo groupInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c36560odK.copydefault;
        }
        if ((i & 2) != 0) {
            groupInfo = c36560odK.KWHzl;
        }
        return c36560odK.OLrzqt(oKMessage, groupInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInfo OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36560odK OLrzqt(@NotNull OKMessage oKMessage, @NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(groupInfo, "");
        return new C36560odK(oKMessage, groupInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36560odK)) {
            return false;
        }
        C36560odK c36560odK = (C36560odK) obj;
        return Intrinsics.EZpvd(this.copydefault, c36560odK.copydefault) && Intrinsics.EZpvd(this.KWHzl, c36560odK.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MentionMemberModel(message=" + this.copydefault + ", groupInfo=" + this.KWHzl + ")";
    }

    public C36560odK(@NotNull OKMessage oKMessage, @NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(groupInfo, "");
        this.copydefault = oKMessage;
        this.KWHzl = groupInfo;
    }
}
