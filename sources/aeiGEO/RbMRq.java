package aeiGEO;

import aeiGEO.GVpNrs;
import com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public class RbMRq implements Runnable {
    private static String DlIaRS;
    public static int sSF;
    private String fsdRGZ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GVpNrs.OTr = 9103;
        sSF = 3279;
        TMXProfilingConnections.OQs = 6659;
        TMXProfilingConnections.OHr = 2270;
        GVpNrs.dqk = 9094;
        DlIaRS = GVpNrs.hfdhUn(RbMRq.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RbMRq(String str) {
        this.fsdRGZ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Runnable
    public void run() {
        try {
            GVpNrs.fQMcgE.OijiEz(DlIaRS, TMXProfilingConnections.fsw("NeZ~_Xoy,llp\nEGH]@D"));
            InetAddress byName = InetAddress.getByName(this.fsdRGZ);
            GVpNrs.fQMcgE.sIqKDg(DlIaRS, TMXProfilingConnections.fsw("Y_h,JUeli[Q\u0003") + byName + TMXProfilingConnections.fsw("=}Tc@Dq>oGOSFL\\BR"));
        } catch (UnknownHostException unused) {
            GVpNrs.fQMcgE.OijiEz(DlIaRS, TMXProfilingConnections.fsw("[pR`NU!ZB{\u0002OEFCRF"));
        }
    }
}
