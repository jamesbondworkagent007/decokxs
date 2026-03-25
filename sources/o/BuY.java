package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.user.ReviewStatus;

/* JADX INFO: loaded from: classes14.dex */
public final class BuY {
    public static final int $stable = 8;
    public ReviewStatus AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.Boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuY copy$default(BuY buY, java.lang.String str, ReviewStatus reviewStatus, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = buY.EZpvd;
        }
        if ((i & 2) != 0) {
            reviewStatus = buY.AEQbTJ;
        }
        if ((i & 4) != 0) {
            bool = buY.KWHzl;
        }
        return buY.AEQbTJ(str, reviewStatus, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuY AEQbTJ(java.lang.String str, @NotNull ReviewStatus reviewStatus, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(reviewStatus, "");
        return new BuY(str, reviewStatus, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReviewStatus EZpvd() {
        return this.AEQbTJ;
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
        if (!(obj instanceof BuY)) {
            return false;
        }
        BuY buY = (BuY) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) buY.EZpvd) && this.AEQbTJ == buY.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, buY.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.Boolean bool = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AvatarInfo(avatar=" + this.EZpvd + ", avatarStatus=" + this.AEQbTJ + ", supportUploadedAvatar=" + this.KWHzl + ")";
    }

    public BuY(java.lang.String str, @NotNull ReviewStatus reviewStatus, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(reviewStatus, "");
        this.EZpvd = str;
        this.AEQbTJ = reviewStatus;
        this.KWHzl = bool;
    }
}
