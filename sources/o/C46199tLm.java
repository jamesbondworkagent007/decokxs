package o;

import com.okinc.planet.biz_userprofile.data.PlanetRoleType;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46198tLl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46199tLm {
    public static final C46199tLm KWHzl = new C46199tLm();

    private C46199tLm() {
    }

    public final java.util.List<InterfaceC46198tLl> AEQbTJ(@NotNull C46189tLc c46189tLc, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(c46189tLc, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        PlanetRoleType planetRoleTypeEjfBZ = c46189tLc.ejfBZ();
        PlanetRoleType planetRoleType = PlanetRoleType.LeadTrader;
        boolean z7 = planetRoleTypeEjfBZ == planetRoleType;
        boolean z8 = c46189tLc.fARcdN() == planetRoleType;
        boolean z9 = c46189tLc.hDKMBd() == planetRoleType;
        boolean z10 = c46189tLc.fJNWhG() == planetRoleType;
        pUU.EZpvd("PlanetUserProfile", "planet_isWoner =" + z4 + " \nisLeader = " + c46189tLc.getNewProxyInstance() + ", \nisSpotLeadTrader =" + z7 + ", \nisSwapLeadTrader=" + z8 + ", \nisStrategyLeadTrader=" + z9 + ", \nisSignalLeadTrader=" + z10 + ",\niAmSpotLeadTrader=" + z2 + ",\n iAmSwapLeadTrader=" + z3);
        if (z4 || c46189tLc.getFieldNames()) {
            listOLrzqt.add(0, new InterfaceC46198tLl.Application(!c46189tLc.getFieldNames()));
        }
        if (z5) {
            listOLrzqt.add(0, InterfaceC46198tLl.Activity.OLrzqt);
        }
        if (z6) {
            listOLrzqt.add(InterfaceC46198tLl.TaskDescription.KWHzl);
        }
        if (listOLrzqt.isEmpty()) {
            listOLrzqt.add(InterfaceC46198tLl.ActionBar.OLrzqt);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }
}
