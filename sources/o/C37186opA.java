package o;

import com.okinc.im.imui.preview.model.ImageState;
import com.okinc.im.imui.preview.model.PagerState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37186opA {
    public final PagerState AEQbTJ;
    public final ImageState KWHzl;
    public final boolean OLrzqt;
    public final C37233opv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37186opA copy$default(C37186opA c37186opA, C37233opv c37233opv, PagerState pagerState, ImageState imageState, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c37233opv = c37186opA.copydefault;
        }
        if ((i & 2) != 0) {
            pagerState = c37186opA.AEQbTJ;
        }
        if ((i & 4) != 0) {
            imageState = c37186opA.KWHzl;
        }
        if ((i & 8) != 0) {
            z = c37186opA.OLrzqt;
        }
        return c37186opA.EZpvd(c37233opv, pagerState, imageState, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PagerState AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37186opA EZpvd(@NotNull C37233opv c37233opv, @NotNull PagerState pagerState, ImageState imageState, boolean z) {
        Intrinsics.checkNotNullParameter(c37233opv, "");
        Intrinsics.checkNotNullParameter(pagerState, "");
        return new C37186opA(c37233opv, pagerState, imageState, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageState KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37233opv OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37186opA)) {
            return false;
        }
        C37186opA c37186opA = (C37186opA) obj;
        return Intrinsics.EZpvd(this.copydefault, c37186opA.copydefault) && this.AEQbTJ == c37186opA.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c37186opA.KWHzl) && this.OLrzqt == c37186opA.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        ImageState imageState = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (imageState == null ? 0 : imageState.hashCode())) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MediaPagerDisplayModel(mediaInfo=" + this.copydefault + ", pagerState=" + this.AEQbTJ + ", imageState=" + this.KWHzl + ", isCurrentItem=" + this.OLrzqt + ")";
    }

    public C37186opA(@NotNull C37233opv c37233opv, @NotNull PagerState pagerState, ImageState imageState, boolean z) {
        Intrinsics.checkNotNullParameter(c37233opv, "");
        Intrinsics.checkNotNullParameter(pagerState, "");
        this.copydefault = c37233opv;
        this.AEQbTJ = pagerState;
        this.KWHzl = imageState;
        this.OLrzqt = z;
    }
}
