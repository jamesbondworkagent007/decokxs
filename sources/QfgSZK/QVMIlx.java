package QfgSZK;

import QfgSZK.FQMcgE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
class QVMIlx {
    private static String DlIaRS;
    public static int zFl;

    /* JADX INFO: renamed from: QfgSZK.QVMIlx$QVMIlx, reason: collision with other inner class name */
    /* synthetic */ class C0006QVMIlx {
        static final /* synthetic */ int[] ijQSnv;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            AwvSrB.KDQ = 3655;
            AwvSrB.ELD = 3385;
            int[] iArr = new int[AwvSrB.values().length];
            ijQSnv = iArr;
            try {
                iArr[AwvSrB.MD5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ijQSnv[AwvSrB.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        zFl = 7536;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        if ((7536 ^ zFl) == 0) {
            GCXiNH.OHr = 2270;
            DlIaRS = FQMcgE.hfdhUn(QVMIlx.class);
            return;
        }
        while (true) {
            int i = zFl;
            int i2 = i + 13;
            if (i2 == 15) {
                zFl = (i % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) ^ 4975;
            } else if (i2 == 18) {
                break;
            }
        }
        while (true) {
            zFl *= 5605;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DkGEDn(ZqidTP zqidTP, AwvSrB awvSrB) throws InterruptedException {
        String strDGgnkA = DGUQLI.DGgnkA(zqidTP);
        FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("n~N~HTEw~\u0012\u0002") + strDGgnkA);
        if (UPbYzn.dTTfOR(strDGgnkA)) {
            return fdazkH(strDGgnkA, awvSrB);
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[LOOP:1: B:36:0x00c7->B:52:?, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String fdazkH(String str, AwvSrB awvSrB) throws InterruptedException {
        int i;
        if (AxsJAY.uzCIH().gGvvIC()) {
            return AxsJAY.uzCIH().UeEOUB(str, awvSrB);
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[pW`B_f>nIAH\n]G\u0007[TZRUTT\u000f]RX^\u001a_WE\u0006mepjhnY"));
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                MessageDigest messageDigestKcQGz = kcQGz(awvSrB.hOJZuC);
                String strFsw = GCXiNH.fsw(C0006QVMIlx.ijQSnv[awvSrB.ordinal()] != 1 ? "8'\u000f\u007f" : "8\"\t\u007f");
                if (messageDigestKcQGz == null) {
                    fileInputStream.close();
                    return null;
                }
                byte[] bArr = new byte[8192];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 <= 0) {
                        String strReplace = String.format(strFsw, new BigInteger(1, messageDigestKcQGz.digest()).toString(16)).replace(' ', '0');
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Z~O,\u0011\u0011") + strReplace);
                        fileInputStream.close();
                        return strReplace;
                    }
                    messageDigestKcQGz.update(bArr, 0, i2);
                }
            } finally {
            }
        } catch (FileNotFoundException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("XiXi[Ehqb\bUKCEM\u0007QP@G[_W\u000fxTP^sWHBRVpqg`m"), (Throwable) e);
            ORrpqH.uzCIH().seuMaA(e);
            if ((zFl ^ 7536) != 0) {
            }
        } catch (IOException e2) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("H\u007fZnGT!jc\bRQEJMTE\u0015RZ^T\u0010IQO\u001cS[JP^Hb"), (Throwable) e2);
            ORrpqH.uzCIH().seuMaA(e2);
        }
        FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("XiXi[Ehqb\bUKCEM\u0007QP@G[_W\u000fxTP^sWHBRVpqg`m"), (Throwable) e);
        ORrpqH.uzCIH().seuMaA(e);
        if ((zFl ^ 7536) != 0) {
            do {
                i = zFl + 117;
                if (i == 70) {
                    while (true) {
                        zFl = (zFl % 27) ^ 4290;
                    }
                }
            } while (i != 166);
            while (true) {
                zFl = ((zFl % 89) >> 125) * 18;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static MessageDigest kcQGz(String str) {
        if (AxsJAY.uzCIH().gGvvIC()) {
            return null;
        }
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, str + GCXiNH.fsw("=uRkNBu>jIKOOM"), (Throwable) e);
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }
}
