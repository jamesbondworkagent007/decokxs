package o;

import o.C60045zuU;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.ahu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7338ahu implements C60045zuU.Application {
    @Override // o.C60045zuU.Application
    public void KWHzl(long j) {
        if (j <= 0) {
            return;
        }
        InterfaceC7292ahA interfaceC7292ahAAEQbTJ = C7323ahf.AEQbTJ();
        int iKWHzl = Globals.KWHzl();
        interfaceC7292ahAAEQbTJ.OLrzqt("MemoryListener", "%d lua VMs use memory: %s", java.lang.Integer.valueOf(iKWHzl), C60045zuU.copydefault(j));
        if (Globals.KWHzl() == 0) {
            Globals.valueOf();
        }
    }
}
