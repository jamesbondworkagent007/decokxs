package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35743oCa {
    public final oBX AEQbTJ;
    public final androidx.fragment.app.Fragment KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35743oCa copy$default(C35743oCa c35743oCa, androidx.fragment.app.Fragment fragment, oBX obx, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fragment = c35743oCa.KWHzl;
        }
        if ((i & 2) != 0) {
            obx = c35743oCa.AEQbTJ;
        }
        return c35743oCa.EZpvd(fragment, obx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oBX AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35743oCa EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull oBX obx) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(obx, "");
        return new C35743oCa(fragment, obx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35743oCa)) {
            return false;
        }
        C35743oCa c35743oCa = (C35743oCa) obj;
        return Intrinsics.EZpvd(this.KWHzl, c35743oCa.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c35743oCa.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrendingGroupsFragmentResult(fragment=" + this.KWHzl + ", controller=" + this.AEQbTJ + ")";
    }

    public C35743oCa(@NotNull androidx.fragment.app.Fragment fragment, @NotNull oBX obx) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(obx, "");
        this.KWHzl = fragment;
        this.AEQbTJ = obx;
    }
}
