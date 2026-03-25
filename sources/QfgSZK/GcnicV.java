package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class GcnicV extends QhsCdE {

    /* JADX INFO: Incorrect field signature: Lint; */
    static String QnuwpL = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String UYGpYn = null;
    public static int _HW = 6321;
    public static int flv;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hRYCGI;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hRwBzU;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String zQJTmN;
    private String DdvEHR;
    private String OBpfYH;
    private String UuiWOi;
    private String fVhIDO;
    private String sXrEmc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        flv = 9452;
        GCXiNH.OHr = 2270;
        DXd(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GcnicV(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void DXd(boolean z) {
        if (z) {
            DXd(false);
        }
        UYGpYn = GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs");
        QnuwpL = GCXiNH.fsw("3bT");
        if (_HW > 6320) {
            hRYCGI = GCXiNH.fsw("2}Rn");
            zQJTmN = GCXiNH.fsw("I\\c\\Y^gw`ALD\u0007\u0011\u0006\u0017\u001b\r\f\u001eX_Y");
            hRwBzU = GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie");
        } else {
            while (true) {
                int i = _HW;
                if (i + 52 == 73) {
                    _HW = (i * 14) + i + i;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private String hKJZrr(DCUTEI dcutei, String str, ZqidTP zqidTP) {
        int i;
        String str2 = zqidTP.Umbazn.getApplicationInfo().nativeLibraryDir;
        String strOJuSTm = dcutei.OJuSTm(str);
        boolean zDTTfOR = UPbYzn.dTTfOR(str2);
        if ((_HW ^ 6321) == 0) {
            if (!zDTTfOR || !UPbYzn.dTTfOR(strOJuSTm)) {
                return "";
            }
            String str3 = hRYCGI;
            if ((_HW ^ 6321) != 0) {
                do {
                    i = _HW;
                } while (i + 39 != 38);
                _HW = (i >> 150) % 73;
            }
            return str2.concat(str3.concat(strOJuSTm).concat(QnuwpL));
        }
        while (true) {
            int i2 = _HW;
            int i3 = i2 + 13;
            if (i3 != 26) {
                if (i3 != 95) {
                    if (i3 == 135) {
                        _HW = (i2 + i2) ^ 1565;
                    } else if (i3 == 301) {
                        while (true) {
                            _HW = ((_HW + i2) + i2) % 91;
                        }
                    }
                }
                _HW = ((_HW % 122) ^ 3937) * 3;
            } else {
                while (true) {
                    _HW = ((_HW >> 123) * 114) % 60;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        int i2;
        if (map == null) {
            return;
        }
        if (UPbYzn.dTTfOR(this.OBpfYH)) {
            map.put(AhwBna.APP_SELF_HASH_MD5.DbNXlk(), this.OBpfYH);
        }
        boolean zDTTfOR = UPbYzn.dTTfOR(this.sXrEmc);
        if ((_HW ^ 6321) != 0) {
            while (true) {
                i2 = _HW;
                int i3 = i2 + 104;
                if (i3 == 55) {
                    _HW = (i2 * 52) + i2;
                    break;
                } else if (i3 == 64) {
                    while (true) {
                        _HW = (_HW ^ 3477) % 77;
                    }
                } else if (i3 == 155) {
                    break;
                } else if (i3 == 334) {
                    _HW = (i2 ^ 3585) % 2;
                }
            }
            _HW = (_HW + i2) >> 52;
        }
        if (zDTTfOR) {
            map.put(AhwBna.APP_SELF_HASH_SHA256.DbNXlk(), this.sXrEmc);
        }
        if (UPbYzn.dTTfOR(this.fVhIDO)) {
            AhwBna ahwBna = AhwBna.SELF_HASH_BASE_MODULE;
            if (_HW <= 6320) {
                do {
                    i = _HW;
                } while (i + 65 != 50);
                while (true) {
                    _HW = ((_HW + i) >> 86) * 22;
                }
            } else {
                map.put(ahwBna.DbNXlk(), this.fVhIDO);
            }
        }
        if (UPbYzn.dTTfOR(this.UuiWOi)) {
            map.put(AhwBna.SELF_HASH_AUTH_MODULE.DbNXlk(), this.UuiWOi);
        }
        if (UPbYzn.dTTfOR(this.DdvEHR)) {
            map.put(AhwBna.SELF_HASH_DSH_MODULE.DbNXlk(), this.DdvEHR);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_SELF_HASH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null || qSusPL.RcLksq() == null) {
            return;
        }
        if (this.OBpfYH == null) {
            this.OBpfYH = QVMIlx.DkGEDn(qSusPL.aPFruk(), AwvSrB.MD5);
            this.sXrEmc = QVMIlx.DkGEDn(qSusPL.aPFruk(), AwvSrB.SHA256);
        }
        String str = qSusPL.aPFruk().Umbazn.getApplicationInfo().nativeLibraryDir;
        if (UPbYzn.dTTfOR(str)) {
            String strConcat = str.concat(hRYCGI.concat(zQJTmN).concat(QnuwpL));
            AxsJAY axsJAYUzCIH = AxsJAY.uzCIH();
            if ((_HW ^ 6321) != 0) {
                while (true) {
                    int i = _HW;
                    int i2 = i + 91;
                    if (i2 == 30) {
                        break;
                    } else if (i2 == 114) {
                        _HW = (i * 100) >> 118;
                    }
                }
                while (true) {
                    _HW ^= 2290;
                }
            } else {
                this.fVhIDO = axsJAYUzCIH.dvKsVJ(strConcat);
            }
        }
        String strHKJZrr = hKJZrr(qSusPL.RcLksq(), UYGpYn, qSusPL.aPFruk());
        if (UPbYzn.dTTfOR(strHKJZrr)) {
            this.UuiWOi = AxsJAY.uzCIH().dvKsVJ(strHKJZrr);
        }
        String strHKJZrr2 = hKJZrr(qSusPL.RcLksq(), hRwBzU, qSusPL.aPFruk());
        if (UPbYzn.dTTfOR(strHKJZrr2)) {
            this.DdvEHR = AxsJAY.uzCIH().dvKsVJ(strHKJZrr2);
        }
    }
}
