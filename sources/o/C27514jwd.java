package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27514jwd {
    public final DisplayText EZpvd;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27514jwd copy$default(C27514jwd c27514jwd, DisplayText displayText, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            displayText = c27514jwd.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c27514jwd.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = c27514jwd.OLrzqt;
        }
        return c27514jwd.KWHzl(displayText, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27514jwd KWHzl(@NotNull DisplayText displayText, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(displayText, "");
        return new C27514jwd(displayText, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27514jwd)) {
            return false;
        }
        C27514jwd c27514jwd = (C27514jwd) obj;
        return Intrinsics.EZpvd(this.EZpvd, c27514jwd.EZpvd) && this.copydefault == c27514jwd.copydefault && this.OLrzqt == c27514jwd.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StepItem(displayText=" + this.EZpvd + ", isCurrent=" + this.copydefault + ", isCompleted=" + this.OLrzqt + ")";
    }

    public C27514jwd(@NotNull DisplayText displayText, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(displayText, "");
        this.EZpvd = displayText;
        this.copydefault = z;
        this.OLrzqt = z2;
    }
}
