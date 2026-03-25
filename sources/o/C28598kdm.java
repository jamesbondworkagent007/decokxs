package o;

import com.okinc.business.market.common.constants.TimeIntervalType;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28598kdm implements kMU {
    public final boolean EZpvd;
    public final TimeIntervalType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28598kdm copy$default(C28598kdm c28598kdm, TimeIntervalType timeIntervalType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeIntervalType = c28598kdm.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c28598kdm.EZpvd;
        }
        return c28598kdm.copydefault(timeIntervalType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28598kdm copydefault(@NotNull TimeIntervalType timeIntervalType, boolean z) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        return new C28598kdm(timeIntervalType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28598kdm)) {
            return false;
        }
        C28598kdm c28598kdm = (C28598kdm) obj;
        return this.OLrzqt == c28598kdm.OLrzqt && this.EZpvd == c28598kdm.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IntervalSelectionUiModel(interval=" + this.OLrzqt + ", isSelected=" + this.EZpvd + ")";
    }

    public C28598kdm(@NotNull TimeIntervalType timeIntervalType, boolean z) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        this.OLrzqt = timeIntervalType;
        this.EZpvd = z;
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
