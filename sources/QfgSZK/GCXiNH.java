package QfgSZK;

import QfgSZK.OeawrH;
import android.os.Process;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import okio.Utf8;

/* JADX INFO: loaded from: classes.dex */
public class GCXiNH {
    public static int Cwg = 3987;
    private static final int OGkDus = 32;
    public static int OHr = 2270;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String QnuwpL = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String QwcFkS = null;
    private static final int UpKVGV = 10;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String fBUFBC = null;
    public static char[] fYu = null;
    private static final int faOqjF = 120;
    private static final int gYmYPJ = 1024;
    private static final int hBETMO = 8192;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hRsUqX = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String iDIUip = null;
    private static final int imtWB = 48;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String sVtCdu;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String zQJTmN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        Dfm(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GCXiNH() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OeawrH.RnVkix DRGLNw() {
        char c;
        String strConcat = fBUFBC.concat(zQJTmN).concat(QnuwpL);
        char[] cArr = new char[8192];
        try {
            int i = -1;
            int length = -1;
            int length2 = -1;
            FileReader fileReader = new FileReader(QwcFkS + Process.myPid() + iDIUip);
            int i2 = 0;
            int iFTEjYi = 0;
            boolean z = false;
            boolean z2 = false;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (fileReader == null && i2 < 0) {
                    break;
                }
                if (z2) {
                    do {
                        try {
                            c = cArr[iFTEjYi];
                            iFTEjYi++;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            e = e;
                            ORrpqH.uzCIH().seuMaA(e);
                            return new OeawrH.RnVkix(i, length, i4, length2, z);
                        } catch (SecurityException e2) {
                            e = e2;
                            ORrpqH.uzCIH().seuMaA(e);
                            return new OeawrH.RnVkix(i, length, i4, length2, z);
                        }
                    } while (c != '\n');
                }
                i2 -= iFTEjYi - i3;
                i3 = iFTEjYi;
                while (fileReader != null && i2 < 1024) {
                    int iORWKdN = ORWKdN(cArr, i3, i2, fileReader);
                    if (iORWKdN < 0) {
                        fileReader = null;
                    } else {
                        i2 += iORWKdN;
                    }
                    i3 = 0;
                }
                int iFTEjYi2 = fTEjYi(cArr, i3);
                boolean z3 = false;
                while (true) {
                    char c2 = cArr[iFTEjYi2];
                    if (c2 == ' ') {
                        break;
                    }
                    if (c2 == 'x') {
                        z3 = true;
                    }
                    iFTEjYi2++;
                }
                iFTEjYi = iFTEjYi2 + 1;
                if (z3) {
                    iFTEjYi = fTEjYi(cArr, fTEjYi(cArr, iFTEjYi));
                    if (cArr[iFTEjYi] != '0' || cArr[iFTEjYi + 1] != ' ') {
                        int iFTEjYi3 = fTEjYi(cArr, iFTEjYi);
                        while (cArr[iFTEjYi3] == ' ') {
                            iFTEjYi3++;
                        }
                        int i5 = iFTEjYi3;
                        while (cArr[i5] != '\n') {
                            i5++;
                        }
                        String str = new String(cArr, iFTEjYi3, i5 - iFTEjYi3);
                        if (str.startsWith(hRsUqX)) {
                            i++;
                            length = (int) (((long) length) + new File(str).length());
                        } else if (str.startsWith(sVtCdu)) {
                            i4++;
                        } else if (str.endsWith(strConcat)) {
                            z = true;
                        } else {
                            i4++;
                            length2 = (int) (((long) length2) + new File(str).length());
                        }
                        iFTEjYi = i5 + 1;
                        z2 = false;
                    }
                }
                z2 = true;
            }
            return new OeawrH.RnVkix(i, length, i4, length2, z);
        } catch (FileNotFoundException unused) {
            return new OeawrH.RnVkix(-1, -1, -1, -1, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void Dfm(boolean z) {
        if (z) {
            Dfm(false);
        }
        QwcFkS = fsw("2aIcH\u001e");
        if ((Cwg ^ MTPushConstants.RemoteWhat.TAG_UPDATE) == 0) {
            iDIUip = fsw("2|Z|X");
            sVtCdu = fsw("2u^z");
            QnuwpL = fsw("3bT");
            hRsUqX = fsw("2bB\u007f_Tl");
            fBUFBC = fsw("qxY");
            zQJTmN = fsw("I\\c\\Y^gw`ALD\u0007\u0011\u0006\u0017\u001b\r\f\u001eX_Y");
            return;
        }
        while (true) {
            int i = Cwg;
            int i2 = i + 26;
            if (i2 == 12) {
                break;
            }
            if (i2 == 140) {
                while (true) {
                    Cwg = ((Cwg % 77) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) * 53;
                }
            } else if (i2 == 247) {
                Cwg = ((i % 25) + i) % 59;
                break;
            }
        }
        while (true) {
            Cwg = (Cwg % 117) % 44;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static int ORWKdN(char[] cArr, int i, int i2, FileReader fileReader) {
        if (i > 0) {
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        try {
            int i3 = fileReader.read(cArr, i2, 8192 - i2);
            if (i3 > 0) {
                return i3;
            }
            fileReader.close();
            return -1;
        } catch (IOException e) {
            ORrpqH.uzCIH().seuMaA(e);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static int fTEjYi(char[] cArr, int i) {
        int i2;
        while (cArr[i] != ' ') {
            int i3 = Cwg;
            if (i3 <= 3986) {
                while (Cwg + 78 != 45) {
                }
                while (true) {
                    Cwg = (Cwg ^ 2852) * 67;
                }
            } else {
                i++;
                if ((OHr ^ 2270) != 0) {
                    if ((i3 ^ MTPushConstants.RemoteWhat.TAG_UPDATE) == 0) {
                        while (true) {
                            int i4 = OHr;
                            int i5 = i4 + 26;
                            if (i5 == 31) {
                                OHr = (i4 >> 9) ^ 2148;
                                if ((Cwg ^ MTPushConstants.RemoteWhat.TAG_UPDATE) != 0) {
                                    break;
                                }
                            } else if (i5 == 97) {
                                OHr = (i4 + i4) % 73;
                            }
                        }
                    }
                    do {
                        i2 = Cwg;
                    } while (i2 + 39 != 78);
                    while (true) {
                        Cwg = (Cwg % 99) + i2;
                    }
                }
            }
        }
        return i + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Incorrect return type in method signature: ()V */
    public static /* synthetic */ String fsw(String str) {
        int i;
        int i2;
        int i3;
        if (fYu == null) {
            fYu = new char[32767];
            int i4 = 3;
            int i5 = 0;
            while (i5 < 32767) {
                if ((Cwg ^ MTPushConstants.RemoteWhat.TAG_UPDATE) != 0) {
                    while (true) {
                        i3 = Cwg;
                        int i6 = i3 + 130;
                        if (i6 == 9) {
                            break;
                        }
                        if (i6 == 163) {
                            Cwg = ((i3 * 124) % 82) >> 30;
                        }
                    }
                    Cwg = (i3 + i3) % 29;
                }
                i4 = ((i4 + (i4 ^ i5)) + 23) % 63;
                fYu[i5] = (char) i4;
                i5++;
                if ((OHr ^ 2270) != 0) {
                    while (true) {
                        i2 = OHr;
                        int i7 = i2 + 39;
                        if (i7 == 40) {
                            OHr = ((i2 ^ 2627) % 27) >> 70;
                            break;
                        }
                        if (i7 == 120) {
                            break;
                        }
                    }
                    do {
                        OHr = ((OHr ^ Utf8.MASK_2BYTES) + i2) % 103;
                    } while (Cwg > 3986);
                    while (true) {
                        int i8 = Cwg;
                        int i9 = i8 + 104;
                        if (i9 == 80) {
                            Cwg = (i8 % 77) + i8;
                        } else if (i9 == 227) {
                            Cwg = ((Cwg * 7) + i8) ^ 2202;
                        } else if (i9 != 373) {
                        }
                        Cwg = (Cwg >> 72) ^ 7940;
                        Cwg = ((Cwg * 7) + i8) ^ 2202;
                    }
                }
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if ((Cwg ^ MTPushConstants.RemoteWhat.TAG_UPDATE) != 0) {
                do {
                    i = Cwg + 78;
                    if (i == 56) {
                        while (true) {
                            Cwg *= 13530;
                        }
                    }
                } while (i != 230);
                while (true) {
                    Cwg = (Cwg * 7176) % 3;
                }
            } else {
                cArr[i10] = (char) (cArr[i10] + ((char) (charArray[i10] ^ fYu[i10])));
            }
        }
        return new String(cArr);
    }
}
