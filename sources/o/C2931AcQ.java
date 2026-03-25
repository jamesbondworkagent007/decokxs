package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AcQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2931AcQ {
    public static final int $stable = 8;
    public AbstractC3107Afh OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2931AcQ copy$default(C2931AcQ c2931AcQ, AbstractC3107Afh abstractC3107Afh, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC3107Afh = c2931AcQ.OLrzqt;
        }
        return c2931AcQ.EZpvd(abstractC3107Afh);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC3107Afh AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2931AcQ EZpvd(@NotNull AbstractC3107Afh abstractC3107Afh) {
        Intrinsics.checkNotNullParameter(abstractC3107Afh, "");
        return new C2931AcQ(abstractC3107Afh);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2931AcQ) && Intrinsics.EZpvd(this.OLrzqt, ((C2931AcQ) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterOtpState(sendCodeState=" + this.OLrzqt + ")";
    }

    public C2931AcQ(@NotNull AbstractC3107Afh abstractC3107Afh) {
        Intrinsics.checkNotNullParameter(abstractC3107Afh, "");
        this.OLrzqt = abstractC3107Afh;
    }
}
