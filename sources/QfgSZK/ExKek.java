package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class ExKek {
    private static String DlIaRS;
    static String DuCHIx;
    static final Map<String, String> ULvezi;
    private static String aisKea;
    public static int cFY;
    public static int dGD;
    private static final Pattern geFsUf;
    private static final Map<String, String> iwclrx;
    String OuEEPx;
    private String QSGMPe;
    String sznweJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        cFY = 4588;
        DGUQLI._LG = 2347;
        FQMcgE.RQa = 9057;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        dGD = 1865;
        DGUQLI.EDt = 7426;
        aisKea = GCXiNH.fsw("ueO|X\u000b.1");
        DlIaRS = FQMcgE.hfdhUn(ExKek.class);
        geFsUf = Pattern.compile(GCXiNH.fsw("CJZ!Qp,D<\u0005\u001b~Q\u0011U\u0003"));
        HashMap map = new HashMap();
        map.put(GCXiNH.fsw("^pXdN\u001cBqb\\PLF"), GCXiNH.fsw("s~\u0016oJRi{ \bLL\u0007Z\\HDP\u0018\u0013_DC[\u0013OYM[UQSGqa/\"oo\u0013X{eeyogu{"));
        ULvezi = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap(map);
        DuCHIx = DGUQLI.DsrFlB();
        map2.put(GCXiNH.fsw("\\rXi[E,RmFEVKNM"), DuCHIx);
        iwclrx = Collections.unmodifiableMap(map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:25:0x004a) to fix multi-entry loop: BACK_EDGE: B:24:0x0045 -> B:25:0x004a */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r0 = QfgSZK.ExKek.dGD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if ((QfgSZK.ExKek.cFY ^ 4588) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r4 = QfgSZK.ExKek.cFY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if ((r4 + 91) == 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        QfgSZK.ExKek.cFY = (r4 % 73) >> 86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        QfgSZK.ExKek.dGD = ((r0 ^ 1386) + r6) >> 96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExKek(String str, String str2, String str3) {
        int i;
        this.QSGMPe = str3;
        if ((dGD ^ 1865) != 0) {
            if (cFY > 4587) {
                while (true) {
                    int i2 = dGD;
                    int i3 = i2 + 13;
                    if (i3 != 37) {
                        if (i3 == 94) {
                            dGD = (i2 % 56) >> 49;
                            break;
                        } else if (i3 == 127) {
                            dGD = (i2 * 70) >> WebSocketProtocol.PAYLOAD_SHORT;
                        } else if (i3 != 221) {
                            continue;
                        } else {
                            dGD = (i2 % 50) * 48;
                            if (cFY <= 4587) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            while (true) {
                i = cFY;
                int i4 = i + 26;
                if (i4 != 80) {
                    if (i4 == 148) {
                        cFY = ((i ^ 2883) >> 58) % 117;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                cFY = (cFY >> 38) + i;
            }
        }
        this.OuEEPx = str2;
        this.sznweJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean DGGHxk(String str) {
        if (str == null) {
            str = GCXiNH.fsw("u<Hh@\u001fnp`ALF\u0007DMSD\\L\u001d\\TD");
        }
        try {
            new URL(GCXiNH.fsw("ueO|X\u000b.1") + str);
            return false;
        } catch (MalformedURLException e) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>dGQWDHEB\u0016") + str, e);
            ORrpqH.uzCIH().seuMaA(e);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Map<String, String> QWpYiD(OeawrH oeawrH, String str, int i) {
        HashMap map = new HashMap(iwclrx);
        if (!UPbYzn.dTTfOR(str)) {
            str = null;
        }
        if (oeawrH != null) {
            map.put(GCXiNH.fsw("Ot]iYTs"), oeawrH.DrTEiU);
            if (str == null && UPbYzn.dTTfOR(oeawrH.zbwZFc)) {
                str = oeawrH.zbwZFc;
            }
            map.put(GCXiNH.fsw("^~TgBT"), GCXiNH.fsw("iyCSLDhz1") + oeawrH.adICYR);
        }
        if (str != null) {
            map.put(GCXiNH.fsw("Hb^~\u0006pf{b\\"), str);
        }
        if (i > 0) {
            map.put(GCXiNH.fsw("^~UxN_u3XQRF"), GCXiNH.fsw("|aK`BR`jeGL\fR\u0004_PA\u0018R\\@\\\u001dZLQYUYV\\RB"));
            map.put(GCXiNH.fsw("^~UxN_u3IFALN@F@"), GCXiNH.fsw("zkR|"));
            map.put(GCXiNH.fsw("^~UxN_u3@MLD^A"), Integer.toString(i));
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0033) to fix multi-entry loop: BACK_EDGE: B:16:0x0033 -> B:17:0x0035 */
    public static boolean gGNlxh(String str) {
        int i;
        int i2;
        if (str != null) {
            boolean zIsEmpty = str.isEmpty();
            if (cFY <= 4587) {
                do {
                    i = cFY;
                    i2 = i + 52;
                    if (i2 == 54) {
                        cFY = (i % WalletImportError.ERROR_CODE_AA_CREATE_KEY) >> 65;
                    } else if (i2 == 60) {
                        cFY = (i + i) % 36;
                    } else if (i2 != 106) {
                    }
                    while (true) {
                        cFY = ((cFY % 47) >> 106) % 94;
                    }
                } while (i2 != 183);
                while (true) {
                    cFY = (cFY ^ AuthCode.StatusCode.CERT_FINGERPRINT_ERROR) + i;
                }
            }
            if (!zIsEmpty && geFsUf.matcher(str).find()) {
                return true;
            }
        }
        FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>cZE|CM"));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:48:0x00ba) to fix multi-entry loop: BACK_EDGE: B:47:0x00b3 -> B:48:0x00ba */
    /* JADX DEBUG: Duplicate block (B:60:0x00ee) to fix multi-entry loop: BACK_EDGE: B:60:0x00ee -> B:61:0x00f0 */
    public String QslYrK(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        StringBuilder sb = new StringBuilder(str);
        if (UPbYzn.iSpHlg(str3) || UPbYzn.iSpHlg(str4)) {
            str5 = DlIaRS;
            str6 = "[pR`NU!jc\bEFDLZFBP\u0014w|b\u0010KQP]RT\u0003\u0018^Hseoke PCggn*fz'r{gW}|qfp";
        } else {
            String strQKVWgx = UPbYzn.QKVWgx(str2.getBytes());
            int iIndexOf = str4.indexOf(JwtUtilsKt.JWT_DELIMITER);
            int length2 = str.length();
            if (strQKVWgx != null) {
                length = strQKVWgx.length();
                if ((dGD ^ 1865) != 0) {
                    if (cFY <= 4587) {
                        do {
                            i5 = cFY;
                        } while (i5 + 65 != 23);
                        cFY = (i5 ^ 3315) % 21;
                    }
                    do {
                        i4 = dGD;
                    } while (i4 + 52 != 91);
                    dGD = (i4 + i4 + i4) * 75;
                    if ((cFY ^ 4588) != 0) {
                        while (true) {
                            int i6 = cFY;
                            int i7 = i6 + 52;
                            if (i7 == 33) {
                                while (true) {
                                    cFY = (cFY ^ 1802) % 10;
                                }
                            } else {
                                if (i7 == 201) {
                                    cFY = i6 + i6 + i6;
                                    break;
                                }
                                if (i7 == 346) {
                                    break;
                                }
                            }
                        }
                        while (true) {
                            cFY = ((cFY * 24) % 75) % 55;
                        }
                    }
                }
            } else {
                length = 0;
            }
            int length3 = str3.length();
            if (iIndexOf < 0) {
                iIndexOf = str4.length();
            } else if ((dGD ^ 1865) != 0) {
                if ((cFY ^ 4588) != 0) {
                    while (true) {
                        i3 = cFY;
                        int i8 = i3 + 104;
                        if (i8 == 78) {
                            break;
                        }
                        if (i8 == 219) {
                            cFY = ((i3 >> 62) ^ 5197) % 6;
                        } else if (i8 == 322) {
                            cFY = ((cFY >> 36) % 77) ^ 1152;
                            break;
                        }
                    }
                    while (true) {
                        cFY = (cFY + i3) >> 57;
                        cFY = ((cFY >> 36) % 77) ^ 1152;
                    }
                } else {
                    do {
                        i = dGD;
                    } while (i + 78 != 98);
                    do {
                        dGD = ((dGD >> 87) + i) * 124;
                    } while ((cFY ^ 4588) == 0);
                    while (true) {
                        i2 = cFY;
                        int i9 = i2 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                        if (i9 == 15) {
                            cFY = (i2 + i2) >> 43;
                            break;
                        }
                        if (i9 == 99) {
                            break;
                        }
                    }
                    while (true) {
                        cFY = ((cFY ^ 2308) % 8) + i2;
                    }
                }
            }
            if (length2 + length + length3 + iIndexOf < 64) {
                sb.append(strQKVWgx);
                sb.append(str3);
                sb.append(str4);
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[@\u007fB\u000bXr>") + sb.toString());
                return sb.toString();
            }
            str5 = DlIaRS;
            str6 = "^~VnB_dz,GPD\n@L\u000b\u0016FQ@AX_A\u001eTX\u0017\u001aWWYE`$+mqtWCgeg#)iir5d|aevff=uh:mwx'IJJz.H_p\u0005ECVR\u0007FXW^\u001c[LaHmT[H";
        }
        FQMcgE.fQMcgE.sIqKDg(str5, GCXiNH.fsw(str6));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DCJXGO dbwnZN(String str, String str2, String str3) {
        DCJXGO dcjxgo = new DCJXGO();
        dcjxgo.DarRvM(GCXiNH.fsw("rc\\SBU"), str);
        dcjxgo.DarRvM(GCXiNH.fsw("ntH\u007fB^oAeL"), str2);
        dcjxgo.DarRvM(GCXiNH.fsw("rb"), DGUQLI.DNMMPQ());
        dcjxgo.DarRvM(GCXiNH.fsw("rbmiYBhqb"), HJWChP.RGtXKC.DKRTZD.RXvltA);
        dcjxgo.DarRvM(GCXiNH.fsw("nuPS]TsmeGL"), GCXiNH.fsw("%?\u000b!\u0013\t"));
        String str4 = this.QSGMPe;
        if (str4 != null && !str4.isEmpty()) {
            dcjxgo.DarRvM(GCXiNH.fsw("|aRS@Tx"), this.QSGMPe);
        }
        if (UPbYzn.dTTfOR(str3)) {
            dcjxgo.DarRvM(GCXiNH.fsw("iyC"), str3);
        }
        return dcjxgo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fVjYLc() {
        return GCXiNH.fsw("ueO|X\u000b.1") + this.sznweJ + GCXiNH.fsw("2wK#F^cw`M\r@EGN");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String gsvlRV(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(GCXiNH.fsw("ueO|X\u000b.1"));
        sb.append(str);
        sb.append(GCXiNH.fsw("2wK#"));
        sb.append(str3);
        if (UPbYzn.dTTfOR(str2)) {
            sb.append(GCXiNH.fsw("&Rr_\u0018bHZ1"));
            sb.append(str2);
        }
        return sb.toString();
    }
}
