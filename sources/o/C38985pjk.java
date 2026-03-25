package o;

import kotlin.jvm.internal.Intrinsics;
import o.oZI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38985pjk {
    public final android.view.View EZpvd;
    public final oZI.Application KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38985pjk copy$default(C38985pjk c38985pjk, android.view.View view, oZI.Application application, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            view = c38985pjk.EZpvd;
        }
        if ((i & 2) != 0) {
            application = c38985pjk.KWHzl;
        }
        return c38985pjk.AEQbTJ(view, application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38985pjk AEQbTJ(@NotNull android.view.View view, @NotNull oZI.Application application) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(application, "");
        return new C38985pjk(view, application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oZI.Application KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38985pjk)) {
            return false;
        }
        C38985pjk c38985pjk = (C38985pjk) obj;
        return Intrinsics.EZpvd(this.EZpvd, c38985pjk.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c38985pjk.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ViewCacheItem(view=" + this.EZpvd + ", viewHolder=" + this.KWHzl + ")";
    }

    public C38985pjk(@NotNull android.view.View view, @NotNull oZI.Application application) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = view;
        this.KWHzl = application;
    }
}
