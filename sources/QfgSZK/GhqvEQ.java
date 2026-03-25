package QfgSZK;

import QfgSZK.FQMcgE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class GhqvEQ {
    private static String DlIaRS = null;
    public static int JFJ = 0;
    public static int OTR = 1739;
    private static final int QiCRgE = 10;
    private static String hmrICN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        FQMcgE.usN = 6842;
        JFJ = 7738;
        GCXiNH.OHr = 2270;
        hmrICN = GCXiNH.fsw("ntWeEDyx\u007f");
        DlIaRS = FQMcgE.hfdhUn(GhqvEQ.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GhqvEQ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static ZaDspl RckOJh(File file) {
        int i;
        byte[] bArr = new byte[10];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 >= 10) {
                    ZaDspl zaDspl = ZaDspl.UNKNOWN;
                    fileInputStream.close();
                    return zaDspl;
                }
                if ("1".equalsIgnoreCase(new String(Arrays.copyOf(bArr, i2)))) {
                    ZaDspl zaDspl2 = ZaDspl.ENFORCING;
                    fileInputStream.close();
                    return zaDspl2;
                }
                ZaDspl zaDspl3 = ZaDspl.PERMISSIVE;
                fileInputStream.close();
                return zaDspl3;
            } finally {
            }
        } catch (IOException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`\u000bEn>cXGM\nOAKS\u0015ON"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if ((OTR ^ 1739) != 0) {
                while (true) {
                    int i3 = OTR;
                    int i4 = i3 + 52;
                    if (i4 == 84) {
                        i = i3 ^ 2963;
                    } else if (i4 == 233) {
                        i = (i3 ^ 1910) + i3;
                    }
                    OTR = i + i3;
                }
            }
            return ZaDspl.UNKNOWN;
        } catch (SecurityException e2) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
            return ZaDspl.UNKNOWN;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x0044) to fix multi-entry loop: BACK_EDGE: B:23:0x003c -> B:24:0x0044 */
    public static ZaDspl dNCPSb() {
        try {
            String strIdLUrz = idLUrz();
            if (strIdLUrz == null) {
                return fQQVvf() ? ZaDspl.UNKNOWN : ZaDspl.NONE;
            }
            if (JFJ > 7737) {
                File file = new File(strIdLUrz + GCXiNH.fsw("2tUjDCb{"));
                ZaDspl zaDsplRckOJh = RckOJh(file);
                ZaDspl zaDspl = ZaDspl.UNKNOWN;
                if (zaDsplRckOJh == zaDspl) {
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011s{mL\u0002FDOGUUP\u0014U[]U\u000fE@"));
                    if (file.exists()) {
                        return ZaDspl.ENFORCING;
                    }
                }
                return zaDspl;
            }
            while (true) {
                int i = JFJ;
                if (i + 39 == 63) {
                    JFJ = (i * 109) ^ 2094;
                    if (OTR <= 1738) {
                        break;
                    }
                }
            }
            while (true) {
                int i2 = OTR;
                int i3 = i2 + 52;
                if (i3 != 63) {
                    if (i3 == 85) {
                        OTR = (i2 + i2) % 37;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                OTR = ((OTR ^ 4254) >> 12) % 57;
            }
        } catch (IOException e) {
            ORrpqH.uzCIH().seuMaA(e);
            return ZaDspl.UNKNOWN;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static boolean fQQVvf() throws IOException {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(GCXiNH.fsw("2aIcH\u001egw`MQZY]MJE"));
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                do {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        fileInputStream.close();
                        return false;
                    }
                } while (!line.contains(GCXiNH.fsw("ntWeEDyx\u007f")));
                fileInputStream.close();
                return true;
            } finally {
            }
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static String idLUrz() throws IOException {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        try {
            fileInputStream = new FileInputStream(GCXiNH.fsw("2aIcH\u001elqyFVP"));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } finally {
            }
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                fileInputStream.close();
                return null;
            }
            String[] strArrSplit = line.split(" ");
            if (strArrSplit.length >= 3 && GCXiNH.fsw("ntWeEDyx\u007f").equals(strArrSplit[2])) {
                String str = strArrSplit[1];
                fileInputStream.close();
                return str;
            }
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }
}
