package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import QfgSZK.QhsCdE;
import android.os.Process;
import android.system.Os;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class SqfPTR extends QhsCdE {
    private static String DlIaRS;
    public static int OlC;
    private int QIAIdF;
    private String QWnzcR;
    private int fbXpKO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        int i2;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        OlC = MfaResponse.VERIFICATION_FAILURE;
        FQMcgE.RQa = 9057;
        FQMcgE.usN = 6842;
        if ((5005 ^ OlC) != 0) {
            do {
                i = OlC;
                i2 = i + 13;
                if (i2 == 74) {
                    OlC = i + i + i;
                }
            } while (i2 != 174);
            while (true) {
                OlC = (OlC + i) ^ 3717;
            }
        }
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(SqfPTR.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SqfPTR(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.AGENT_OS_VERSION.DbNXlk(), UPbYzn.iTrKTi(HJWChP.RGtXKC.DKRTZD.RXvltA));
        if (HJWChP.RGtXKC.DKRTZD.iLnVex != null) {
            map.put(AhwBna.AGENT_SECURITY_PATCH_LEVEL.DbNXlk(), UPbYzn.iTrKTi(HJWChP.RGtXKC.DKRTZD.iLnVex));
        }
        map.put(AhwBna.AGENT_LANGUAGE.DbNXlk(), UPbYzn.iTrKTi(ExKek.DuCHIx));
        map.put(AhwBna.AGENT_BRAND.DbNXlk(), UPbYzn.iTrKTi(HJWChP.RGtXKC.dBYqkj + GCXiNH.fsw("11") + HJWChP.RGtXKC.fJilMR));
        map.put(AhwBna.AGENT_DEVICE.DbNXlk(), UPbYzn.iTrKTi(HJWChP.RGtXKC.aqVCWV));
        map.put(AhwBna.AGENT_MODEL.DbNXlk(), UPbYzn.iTrKTi(HJWChP.RGtXKC.srURBG));
        map.put(AhwBna.AGENT_OS.DbNXlk(), UPbYzn.iTrKTi(DGUQLI.RVsVBY()));
        map.put(AhwBna.AGENT_CONF_OS.DbNXlk(), DGUQLI.DNMMPQ());
        map.put(AhwBna.AGENT_TYPE.DbNXlk(), GCXiNH.fsw("|v^b_nlqnANF"));
        map.put(AhwBna.AGENT_VERSION.DbNXlk(), GCXiNH.fsw("%?\u000b!\u0013\t"));
        map.put(AhwBna.AGENT_APP_INFO.DbNXlk(), this.QWnzcR);
        map.put(AhwBna.DEVICE_VERSION_BRAND.DbNXlk(), GCXiNH.fsw("|\u007f_~DXe3") + HJWChP.RGtXKC.DKRTZD.RXvltA + " " + HJWChP.RGtXKC.dBYqkj + ":" + HJWChP.RGtXKC.aqVCWV);
        map.put(AhwBna.AGENT_PROCESS_ID.DbNXlk(), Integer.toString(this.fbXpKO));
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb) {
            map.put(AhwBna.AGENT_PARENT_PID.DbNXlk(), Integer.toString(this.QIAIdF));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DEVICE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null || this.QWnzcR != null) {
            return;
        }
        this.QWnzcR = DGUQLI.RKcVTr(qSusPL.aPFruk());
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("z~O,JVdpxwCSZvAIPZ\u000e\u0013") + this.QWnzcR);
        this.fbXpKO = Process.myPid();
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb) {
            this.QIAIdF = Os.getppid();
        }
    }
}
