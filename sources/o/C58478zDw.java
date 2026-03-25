package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58478zDw {
    public static final int $stable = 8;
    public AbstractC4401Bcs AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58478zDw copy$default(C58478zDw c58478zDw, AbstractC4401Bcs abstractC4401Bcs, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC4401Bcs = c58478zDw.AEQbTJ;
        }
        return c58478zDw.copydefault(abstractC4401Bcs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC4401Bcs EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58478zDw copydefault(@NotNull AbstractC4401Bcs abstractC4401Bcs) {
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        return new C58478zDw(abstractC4401Bcs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58478zDw) && Intrinsics.EZpvd(this.AEQbTJ, ((C58478zDw) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoginJourneyState(subdomainStrategy=" + this.AEQbTJ + ")";
    }

    public C58478zDw(@NotNull AbstractC4401Bcs abstractC4401Bcs) {
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        this.AEQbTJ = abstractC4401Bcs;
    }
}
