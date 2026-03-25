package o;

import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.manager.OrbitStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46126tIu {
    public final OrbitStatus AEQbTJ;
    public final java.util.List<InterfaceC46130tIy> KWHzl;
    public final PlanetBasicUserInfoResp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tIu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46126tIu copy$default(C46126tIu c46126tIu, PlanetBasicUserInfoResp planetBasicUserInfoResp, OrbitStatus orbitStatus, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetBasicUserInfoResp = c46126tIu.copydefault;
        }
        if ((i & 2) != 0) {
            orbitStatus = c46126tIu.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list = c46126tIu.KWHzl;
        }
        return c46126tIu.KWHzl(planetBasicUserInfoResp, orbitStatus, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBasicUserInfoResp AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46126tIu KWHzl(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, @NotNull OrbitStatus orbitStatus, @NotNull java.util.List<? extends InterfaceC46130tIy> list) {
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        Intrinsics.checkNotNullParameter(orbitStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C46126tIu(planetBasicUserInfoResp, orbitStatus, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC46130tIy> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrbitStatus copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46126tIu)) {
            return false;
        }
        C46126tIu c46126tIu = (C46126tIu) obj;
        return Intrinsics.EZpvd(this.copydefault, c46126tIu.copydefault) && this.AEQbTJ == c46126tIu.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c46126tIu.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetProfileSettingData(basicInfo=" + this.copydefault + ", orbitStatus=" + this.AEQbTJ + ", settings=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.tIy> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46126tIu(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, @NotNull OrbitStatus orbitStatus, @NotNull java.util.List<? extends InterfaceC46130tIy> list) {
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        Intrinsics.checkNotNullParameter(orbitStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = planetBasicUserInfoResp;
        this.AEQbTJ = orbitStatus;
        this.KWHzl = list;
    }
}
