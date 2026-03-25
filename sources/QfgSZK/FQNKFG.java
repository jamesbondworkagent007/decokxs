package QfgSZK;

import android.app.Activity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.HybridAppSupport;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class FQNKFG implements HybridAppSupport {
    private static String DlIaRS;
    public static int UXg;
    public static int fjT;
    final AtomicBoolean aCMSVn;
    final DCUTEI aZlpDA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        UXg = 2418;
        fjT = 2058;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        DlIaRS = FQMcgE.hfdhUn(FQNKFG.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FQNKFG() {
        this.aCMSVn = new AtomicBoolean(false);
        this.aZlpDA = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FQNKFG(DCUTEI dcutei) {
        this.aCMSVn = new AtomicBoolean(false);
        this.aZlpDA = dcutei;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.HybridAppSupport
    public void clearRegistrations(Activity activity) {
        int i;
        int i2;
        int i3;
        if (this.aCMSVn.get()) {
            DCUTEI dcutei = this.aZlpDA;
            if ((fjT ^ 2058) != 0) {
                if ((UXg ^ 2418) != 0) {
                    while (true) {
                        int i4 = UXg;
                        int i5 = i4 + 39;
                        if (i5 == 96) {
                            UXg = (i4 + i4) * 122;
                            break;
                        } else if (i5 == 261) {
                            UXg = (i4 * 76) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                            break;
                        } else if (i5 == 391) {
                            break;
                        }
                    }
                    while (true) {
                        UXg = ((UXg % 121) ^ 1330) % 18;
                    }
                }
                do {
                    i = fjT;
                    i2 = i + 39;
                    if (i2 == 36) {
                        fjT = (i >> 32) + i;
                        if ((UXg ^ 2418) != 0) {
                            do {
                                i3 = UXg;
                            } while (i3 + 26 != 57);
                            while (true) {
                                UXg = ((UXg >> 96) + i3) >> 31;
                            }
                        }
                    }
                } while (i2 != 68);
                do {
                    fjT = (fjT + i) * 79;
                } while ((UXg ^ 2418) == 0);
                while (true) {
                    int i6 = UXg;
                    if (i6 + 78 == 16) {
                        UXg = i6 + i6 + i6;
                    }
                }
            }
            if (dcutei != null) {
                this.aZlpDA.aUsmxb(activity);
                return;
            }
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQF^\tXFQP\u0014]S\\U\u0015\u001eiqcjKWQOimme!iM\fgk\u007f*jgip|sf`tt/qo<zh~mzbKQ\u0004t}\u000e^mQ\rZDJNL\u0017"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void finishInit() {
        this.aCMSVn.set(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.HybridAppSupport
    public void setPageName(Activity activity, String str) {
        int i;
        if (this.aCMSVn.get() && this.aZlpDA != null) {
            if (fjT <= 2057) {
                if ((UXg ^ 2418) == 0) {
                    while (true) {
                        int i2 = fjT;
                        int i3 = i2 + 39;
                        if (i3 == 24) {
                            fjT = (i2 + i2) % 83;
                            if ((UXg ^ 2418) != 0) {
                                break;
                            }
                        } else if (i3 == 177) {
                            fjT = (i2 ^ 5399) * 27;
                            if (UXg <= 2417) {
                                break;
                            }
                        } else if (i3 == 289) {
                            while (true) {
                                fjT = (fjT >> 104) % 88;
                            }
                        }
                    }
                }
                do {
                    i = UXg;
                } while (i + 39 != 33);
                while (true) {
                    UXg = ((UXg * 27) ^ 3756) + i;
                }
            } else if (activity != null && !UPbYzn.iSpHlg(str)) {
                this.aZlpDA.OxVOHk(activity, str);
                return;
            }
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bAOOHZ\u0007c|\u0014AWVY\\JO]OSVVD\u001c%PNZQrQJ`hbdn(ne5z|f1s`p{u|ok}s'JW\u0004||IEo@CX\u0005OT\bWUO\u001cK_lFd\u001f"));
    }
}
