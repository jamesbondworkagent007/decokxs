package QfgSZK;

import android.content.Context;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.lexisnexisrisk.threatmetrix.TMXStrongAuth;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
final class OAjjVP extends SaJVGb {
    public static int CvZ = 0;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String DdXXUk = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String JEnqe = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String ORzhKI = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String OWgeAR = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String RAdHKE = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String RYVvec = null;
    public static int RzN = 3156;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String UOMrdv;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String VsQlL;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String WUEUq;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String aGcrDY;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String dUUNrU;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String gQgvpP;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hSAPJh;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String ifaBEK;
    private Object DBIutL;
    private Object QasQDA;
    private Object RRFhHG;
    private Object afdURx;
    private Object hVCtwg;
    private Object isckgF;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        CvZ = 3937;
        GCXiNH.OHr = 2270;
        fJk(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:49:0x00c5) to fix multi-entry loop: BACK_EDGE: B:48:0x00bd -> B:49:0x00c5 */
    /* JADX DEBUG: Duplicate block (B:76:0x0141) to fix multi-entry loop: BACK_EDGE: B:76:0x0141 -> B:77:0x0143 */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        QfgSZK.OAjjVP.CvZ = (QfgSZK.OAjjVP.CvZ * 80) >> 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c5, code lost:
    
        QfgSZK.OAjjVP.CvZ = (QfgSZK.OAjjVP.CvZ >> org.spongycastle.crypto.tls.CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256) + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OAjjVP(Object obj, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        super(obj, str);
        if (!(obj instanceof Map)) {
            return;
        }
        Map map = (Map) obj;
        if (RzN <= 3155) {
            while (true) {
                i4 = RzN;
                int i5 = i4 + 130;
                if (i5 == 34) {
                    RzN = (i4 % WalletImportError.ERROR_CODE_AA_CREATE_KEY) ^ 3934;
                } else if (i5 != 66) {
                    if (i5 == 261) {
                        RzN = (i4 % 26) ^ 2345;
                        break;
                    }
                } else {
                    break;
                }
            }
            RzN = ((RzN % 125) + i4) * 61;
        }
        this.QasQDA = map.get(hSAPJh);
        this.afdURx = map.get(RYVvec);
        if ((CvZ ^ 3937) == 0) {
            this.hVCtwg = map.get(DdXXUk);
            this.isckgF = map.get(aGcrDY);
            if (RzN <= 3155) {
                while (true) {
                    int i6 = RzN;
                    int i7 = i6 + 52;
                    if (i7 != 38) {
                        if (i7 != 60) {
                            if (i7 == 158) {
                                RzN = ((i6 % 13) * 84) % 84;
                            }
                        }
                        RzN ^= 655;
                    }
                    RzN = ((RzN >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 49) * 13;
                }
            } else {
                this.DBIutL = map.get(ifaBEK);
                if (RzN > 3155) {
                    this.RRFhHG = map.get(JEnqe);
                    return;
                }
                do {
                    int i8 = RzN;
                    i = i8 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                    if (i != 77) {
                        if (i == 111) {
                            RzN = ((i8 ^ 4073) % 19) ^ 1491;
                        } else if (i != 189) {
                        }
                        RzN >>= CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                    }
                    RzN = ((RzN + i8) + i8) ^ 1784;
                    break;
                } while (i != 210);
                while (true) {
                    RzN = (RzN >> 108) % 56;
                }
            }
        } else if (RzN <= 3155) {
            while (true) {
                int i9 = RzN;
                int i10 = i9 + 39;
                if (i10 != 98) {
                    if (i10 == 119) {
                        RzN = ((i9 * 55) ^ 3550) + i9;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                RzN = (RzN >> 71) * 72;
            }
        } else {
            while (true) {
                i2 = CvZ;
                int i11 = i2 + 26;
                if (i11 == 4) {
                    break;
                }
                if (i11 == 19) {
                    break;
                }
                if (i11 == 142) {
                    CvZ = (i2 >> 31) * 8;
                    if ((RzN ^ 3156) != 0) {
                        while (true) {
                            i3 = RzN;
                            int i12 = i3 + 78;
                            if (i12 != 27) {
                                if (i12 == 178) {
                                    RzN = (i3 ^ 5308) + i3 + i3;
                                } else if (i12 == 371) {
                                    break;
                                }
                            }
                            RzN = (RzN % 32) % 27;
                        }
                        RzN = ((i3 ^ 3872) >> 40) + i3;
                    }
                } else if (i11 == 307) {
                    CvZ = (CvZ >> CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256) + i2;
                    break;
                }
            }
            while (true) {
                CvZ = (CvZ >> 104) + i2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void fJk(boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            fJk(false);
        }
        OWgeAR = GCXiNH.fsw("ihKi");
        aGcrDY = GCXiNH.fsw("|eOiXERj~GLDcM`FXQXV@");
        String strFsw = GCXiNH.fsw("tbum_Xw{@A@b\\HAKWWXVzP^KRXN");
        if (RzN <= 3155) {
            do {
                i3 = RzN;
            } while (i3 + 52 != 20);
            while (true) {
                RzN = (RzN ^ 6790) + i3;
            }
        } else {
            ifaBEK = strFsw;
            DdXXUk = GCXiNH.fsw("ne^|~AI\u007fbLNFX");
            RYVvec = GCXiNH.fsw("ytIiLXrjiZjBDMDBD");
            ORzhKI = GCXiNH.fsw("ICnI");
            VsQlL = GCXiNH.fsw("xcIcY");
            UOMrdv = GCXiNH.fsw("opUhD\\");
            WUEUq = GCXiNH.fsw("vtB");
            RAdHKE = GCXiNH.fsw("t|KcYEdz");
            if ((RzN ^ 3156) != 0) {
                while (true) {
                    int i4 = RzN;
                    int i5 = i4 + 39;
                    if (i5 != 19) {
                        if (i5 == 85) {
                            RzN = ((i4 * 91) ^ MTPushConstants.RemoteWhat.TAG_ADD) % 21;
                        }
                    }
                    RzN = (RzN + i4) >> 95;
                }
            } else {
                hSAPJh = GCXiNH.fsw("ot\\eXEdlDILGFLZ");
                dUUNrU = GCXiNH.fsw("ypOi");
                if (RzN > 3155) {
                    JEnqe = GCXiNH.fsw("tbn\u007fNCBqb\\G[^{M@_F@V@TTg_SXW_K");
                    gQgvpP = GCXiNH.fsw("nx\\bJEtli");
                    return;
                }
                do {
                    i = RzN;
                    i2 = i + 65;
                    if (i2 == 48) {
                        while (true) {
                            RzN = (RzN * 73) % 123;
                        }
                    }
                } while (i2 != 220);
                while (true) {
                    RzN = (RzN >> 10) + i;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QzqeNH() {
        int i;
        ArrayList arrayList = new ArrayList();
        ikcuIV((Method) this.DBIutL, false, arrayList);
        if (arrayList.isEmpty() || ((String) arrayList.get(0)).compareTo(ORzhKI) != 0) {
            return false;
        }
        if (RzN > 3155) {
            return true;
        }
        do {
            int i2 = RzN;
            i = i2 + 39;
            if (i == 43) {
                while (true) {
                    RzN = (RzN + i2) % 47;
                }
            }
        } while (i != 202);
        while (true) {
            RzN = (RzN % 90) >> 12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:28:0x0048) to fix multi-entry loop: BACK_EDGE: B:27:0x0042 -> B:28:0x0048 */
    /* JADX DEBUG: Duplicate block (B:74:0x00dc) to fix multi-entry loop: BACK_EDGE: B:73:0x00d7 -> B:74:0x00dc */
    @Override // QfgSZK.SaJVGb
    public boolean aJZHYI() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.iinWke != null && this.ONLQiq != null && this.dicSHd != null && this.deDbSP != null && this.fgIkfx != null && this.QasQDA != null) {
            if (CvZ <= 3936) {
                if (RzN <= 3155) {
                    while (true) {
                        i4 = RzN;
                        int i5 = i4 + 39;
                        if (i5 != 22) {
                            if (i5 == 193) {
                                RzN = ((i4 + i4) >> 23) ^ 5040;
                                break;
                            }
                            if (i5 == 375) {
                                RzN = (i4 >> 57) ^ 6035;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        RzN = ((RzN + i4) + i4) % 55;
                    }
                }
                while (CvZ + 39 != 27) {
                }
                while (true) {
                    CvZ = ((CvZ * 63) ^ 1835) >> 75;
                }
            } else if (this.afdURx != null && this.hVCtwg != null) {
                if (RzN <= 3155) {
                    while (true) {
                        int i6 = RzN;
                        int i7 = i6 + 130;
                        if (i7 != 88) {
                            if (i7 == 202) {
                                RzN = (i6 >> 29) ^ 6715;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    RzN = (RzN ^ 7090) % 124;
                }
                if (this.isckgF != null && this.DBIutL != null) {
                    int i8 = RzN;
                    if (i8 <= 3155) {
                        do {
                            i2 = RzN;
                            i3 = i2 + 52;
                            if (i3 == 32) {
                                while (true) {
                                    RzN = ((RzN % 46) + i2) % 39;
                                }
                            }
                        } while (i3 != 34);
                        while (true) {
                            RzN = ((RzN ^ 2364) + i2) ^ 5473;
                        }
                    } else if (this.fjapMg != null && this.RRFhHG != null) {
                        if ((CvZ ^ 3937) == 0) {
                            return true;
                        }
                        if ((i8 ^ 3156) != 0) {
                            while (true) {
                                i = RzN;
                                int i9 = i + 78;
                                if (i9 != 35) {
                                    if (i9 == 155) {
                                        RzN = (i * 97) ^ 1298;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                RzN = (RzN + i) ^ 2677;
                            }
                        } else {
                            while (CvZ + 26 != 33) {
                            }
                            while (true) {
                                CvZ = (CvZ * 52) ^ 1943;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStrongAuth.AuthParamResult aWuQzD(String str) {
        ArrayList arrayList = new ArrayList();
        ikcuIV((Method) this.RRFhHG, false, str, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStrongAuth.AuthParamResult adevsa(Context context, TMXStrongAuth.AuthMethod authMethod, String str, String str2, String str3, byte[] bArr, TMXStrongAuth.StrongAuthCallback strongAuthCallback, boolean z, PrivateKey privateKey, long j) {
        ArrayList arrayList = new ArrayList();
        ikcuIV((Method) this.hVCtwg, false, context, authMethod, str, str2, str3, bArr, strongAuthCallback, Boolean.valueOf(z), privateKey, Long.valueOf(j), arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZAwExL dYepVG(String str, String str2, Context context) {
        ZAwExL zAwExL = new ZAwExL();
        HashMap map = new HashMap();
        ikcuIV((Method) this.isckgF, false, str, str2, context, map);
        if (map.containsKey(gQgvpP)) {
            zAwExL.dagZNr = (String) map.get(gQgvpP);
        }
        if (map.containsKey(UOMrdv)) {
            zAwExL.OxCLlq = (String) map.get(UOMrdv);
        }
        if (map.containsKey(OWgeAR)) {
            zAwExL.RNqxeV = (String) map.get(OWgeAR);
        }
        if (map.containsKey(dUUNrU)) {
            zAwExL.OrLXTL = (String) map.get(dUUNrU);
        }
        if (map.containsKey(WUEUq)) {
            zAwExL.dISzzS = (String) map.get(WUEUq);
        }
        if (map.containsKey(RAdHKE)) {
            zAwExL.fgqVGA = (String) map.get(RAdHKE);
        }
        if (map.containsKey(VsQlL)) {
            zAwExL.dddPMR = (String) map.get(VsQlL);
        }
        return zAwExL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStrongAuth.AuthParamResult seuMaA(Context context, String str, String str2, String str3, byte[] bArr, TMXStrongAuth.StrongAuthCallback strongAuthCallback) {
        ArrayList arrayList = new ArrayList();
        ikcuIV((Method) this.QasQDA, false, context, str, str2, str3, bArr, strongAuthCallback, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStrongAuth.AuthParamResult znKlvJ(String str) {
        ArrayList arrayList = new ArrayList();
        ikcuIV((Method) this.afdURx, false, str, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }
}
