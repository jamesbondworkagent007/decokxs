package o;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37248oqJ {
    public static final int KWHzl = RelationInfo.$stable;
    public final java.lang.String OLrzqt;
    public final RelationInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37248oqJ copy$default(C37248oqJ c37248oqJ, java.lang.String str, RelationInfo relationInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c37248oqJ.OLrzqt;
        }
        if ((i & 2) != 0) {
            relationInfo = c37248oqJ.copydefault;
        }
        return c37248oqJ.EZpvd(str, relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37248oqJ EZpvd(@NotNull java.lang.String str, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        return new C37248oqJ(str, relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37248oqJ)) {
            return false;
        }
        C37248oqJ c37248oqJ = (C37248oqJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c37248oqJ.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c37248oqJ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FriendRelation(savedPhonebookName=" + this.OLrzqt + ", relationInfo=" + this.copydefault + ")";
    }

    public C37248oqJ(@NotNull java.lang.String str, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        this.OLrzqt = str;
        this.copydefault = relationInfo;
    }
}
