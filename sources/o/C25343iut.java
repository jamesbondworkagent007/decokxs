package o;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25343iut implements kMU {
    public final java.lang.String AEQbTJ;
    public boolean EZpvd;
    public PresetRouteType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25343iut copy$default(C25343iut c25343iut, boolean z, java.lang.String str, PresetRouteType presetRouteType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25343iut.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c25343iut.AEQbTJ;
        }
        if ((i & 4) != 0) {
            presetRouteType = c25343iut.OLrzqt;
        }
        return c25343iut.copydefault(z, str, presetRouteType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25343iut copydefault(boolean z, @NotNull java.lang.String str, @NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        return new C25343iut(z, str, presetRouteType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25343iut)) {
            return false;
        }
        C25343iut c25343iut = (C25343iut) obj;
        return this.EZpvd == c25343iut.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25343iut.AEQbTJ) && this.OLrzqt == c25343iut.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RouteItemUiModel(select=" + this.EZpvd + ", title=" + this.AEQbTJ + ", routeType=" + this.OLrzqt + ")";
    }

    public C25343iut(boolean z, @NotNull java.lang.String str, @NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        this.EZpvd = z;
        this.AEQbTJ = str;
        this.OLrzqt = presetRouteType;
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
