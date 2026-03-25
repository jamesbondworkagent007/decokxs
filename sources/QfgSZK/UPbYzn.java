package QfgSZK;

import QfgSZK.FQMcgE;
import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.util.ULocale;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class UPbYzn {
    private static final char[] DECfsU;
    private static String DlIaRS = null;
    static final int MAX_ATTR_LEN = 255;
    static final int MAX_LONG_BYTE_INDEX = 8;
    private static final Pattern OvQhkN;
    private static final Pattern QYtakl;
    private static String QgeBgA = null;
    public static int RcO = 0;
    private static final Pattern Rggsdr;
    private static final MessageDigest UKIlvF;
    static final int UNLIMITED_ATTR_LEN = -1;
    private static final int aHLIhE = 262144;
    public static int dnY = 0;
    private static final SecureRandom drgvuH;
    private static final int fBlqYs = 128;
    private static final char[] fsmMas;
    private static final MessageDigest gfxeLY;
    private static final Pattern ipHmHR;
    private static final int smqgSc = 5;
    private static final MessageDigest zQTubx;
    private static final int zXGvkV = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        FQMcgE.fQMcgE.CEb = 9231;
        RcO = 8237;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        ORrpqH.fYm = 8848;
        FQMcgE.RQa = 9057;
        ORrpqH.Chu = 7915;
        dnY = 5346;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        QgeBgA = GCXiNH.fsw("na^oBPm>|ZMNE]AHX");
        DlIaRS = FQMcgE.hfdhUn(UPbYzn.class);
        DECfsU = GCXiNH.fsw("- \t?\u001f\u00047)4\u0011CAIMMA").toCharArray();
        QYtakl = Pattern.compile(GCXiNH.fsw("CJZ!Mp,X<\u0005\u001b~Q\u001f\u001cZ\u0012"));
        OvQhkN = Pattern.compile(GCXiNH.fsw("C9`<\u0006\b@3JI\u000fEwR\u001aZ\f\u001cO\u0003\u001e\u0004M\u0007e\r\u0011\u0002{\u0014~V\u000bcYx0|)\u001a"));
        ipHmHR = Pattern.compile(GCXiNH.fsw("C9\u000bw\u001a\u001d3c6\u0001Y\u0013\u0006\u001cU\u000f\u0006N\u0005\u001f\u0000L\u0019\u000b"));
        Rggsdr = Pattern.compile(GCXiNH.fsw("CJ\u000b!v\u001a%"));
        drgvuH = new SecureRandom();
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("ZtOxB_f>_`c\u0012\nMA@SF@"));
        MessageDigest messageDigest3 = null;
        try {
            messageDigest = MessageDigest.getInstance(GCXiNH.fsw("NYz="));
        } catch (NoSuchAlgorithmException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("NYz=\u000bUhyi[V\u0003LHAKSQ"), (Throwable) e);
            ORrpqH.uzCIH().seuMaA(e);
            messageDigest = null;
        }
        zQTubx = messageDigest;
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("ZtOxB_f>Al\u0017\u0003N@OBEA"));
        try {
            messageDigest2 = MessageDigest.getInstance(GCXiNH.fsw("PU\u000e"));
        } catch (NoSuchAlgorithmException e2) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("PU\u000e,OXf{\u007f\\\u0002EK@DBR"), (Throwable) e2);
            ORrpqH.uzCIH().seuMaA(e2);
            messageDigest2 = null;
        }
        gfxeLY = messageDigest2;
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("ZtOxB_f>_`c\u0011\u001f\u001f\bC_RQ@F"));
        try {
            messageDigest3 = MessageDigest.getInstance(GCXiNH.fsw("NYz!\u0019\u00047"));
        } catch (NoSuchAlgorithmException e3) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("NYz>\u001e\u0007!zeOGP^\tNF_YQW"), (Throwable) e3);
            ORrpqH.uzCIH().seuMaA(e3);
        }
        UKIlvF = messageDigest3;
        fsmMas = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', ULocale.PRIVATE_USE_EXTENSION, 'y', 'z', '2', '3', '4', '5', '6', '7', '='};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UPbYzn() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:27:0x0053) to fix multi-entry loop: BACK_EDGE: B:27:0x0053 -> B:28:0x0055 */
    public static String DDxOgT(String str, String str2, String str3, boolean z) {
        String lowerCase;
        int i;
        int i2;
        int i3;
        if (iSpHlg(str) || iSpHlg(str3)) {
            return null;
        }
        if (iSpHlg(str2)) {
            return str;
        }
        if (z) {
            lowerCase = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            lowerCase = str;
        }
        int iIndexOf = lowerCase.indexOf(str2);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = lowerCase.indexOf(str3, iIndexOf + 1);
        int i4 = RcO;
        if (i4 <= 8236) {
            while (true) {
                int i5 = RcO;
                int i6 = i5 + 65;
                if (i6 == 23) {
                    RcO = (i5 ^ 1135) * 95;
                    break;
                }
                if (i6 == 70) {
                    RcO = ((i5 % 19) >> 96) + i5;
                } else if (i6 == 218) {
                    break;
                }
            }
            while (true) {
                RcO = (RcO * 50) >> 101;
            }
        } else if ((dnY ^ 5346) != 0) {
            do {
                i2 = dnY;
            } while (i2 + 104 != 36);
            while (true) {
                dnY = (dnY + i2) * 103;
                if (RcO <= 8236) {
                    do {
                        i3 = RcO;
                    } while (i3 + 130 != 20);
                    RcO = (i3 % 55) + i3;
                }
            }
        } else {
            if (iIndexOf2 == -1) {
                return str.substring(iIndexOf);
            }
            if ((i4 ^ 8237) == 0) {
                return str.substring(iIndexOf, iIndexOf2);
            }
            do {
                i = RcO;
            } while (i + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 != 1);
            while (true) {
                RcO = ((RcO % 63) % 81) + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static byte[] DHEdFZ(byte[] bArr) {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        if (bArr == null || bArr.length == 0 || (messageDigest = UKIlvF) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            bArrDigest = messageDigest.digest();
            messageDigest.reset();
        }
        return bArrDigest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DRtzUu(String str) {
        int i;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < str.length() && i4 < 128; i5++) {
            char cCharAt = str.charAt(i5);
            if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || cCharAt == '_' || cCharAt == '/' || cCharAt == '-')) {
                sb.append(cCharAt);
                i4++;
                if ((dnY ^ 5346) != 0) {
                    do {
                        i = dnY;
                        i2 = i + 78;
                        if (i2 == 13) {
                            while (true) {
                                dnY *= WebSocketProtocol.PAYLOAD_SHORT;
                                if ((RcO ^ 8237) != 0) {
                                    do {
                                        i3 = RcO;
                                    } while (i3 + 117 != 55);
                                    RcO = (i3 % 115) + i3 + i3;
                                }
                            }
                        }
                    } while (i2 != 49);
                    while (true) {
                        dnY = (dnY * 3705) + i;
                    }
                }
            } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                sb.append(Character.toLowerCase(cCharAt));
                i4++;
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DRuYWY(String str) {
        if (iSpHlg(str)) {
            return null;
        }
        if (AxsJAY.uzCIH().gGvvIC()) {
            return AxsJAY.uzCIH().QfsBiF(str);
        }
        byte[] bArrOTJFaA = OTJFaA(str);
        if (bArrOTJFaA != null) {
            return DvMhtu(bArrOTJFaA);
        }
        if ((RcO ^ 8237) == 0) {
            return null;
        }
        while (true) {
            int i = RcO;
            int i2 = i + 52;
            if (i2 == 90) {
                RcO = ((i * 84) % 92) ^ 1145;
            } else if (i2 == 130) {
                break;
            }
        }
        while (true) {
            RcO = (RcO % 121) >> 69;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x002d) to fix multi-entry loop: BACK_EDGE: B:16:0x002d -> B:17:0x002f */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0191, code lost:
    
        if (r9 == 63) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0194, code lost:
    
        QfgSZK.UPbYzn.RcO = (QfgSZK.UPbYzn.RcO * 19) % 88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        QfgSZK.UPbYzn.RcO = ((QfgSZK.UPbYzn.RcO * 96) ^ 1688) % 101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        if ((r2 ^ 8237) != 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        r2 = QfgSZK.UPbYzn.dnY;
        r4 = r2 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
    
        if (r4 == 15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010b, code lost:
    
        if (r4 == 48) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010f, code lost:
    
        if (r4 == 170) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
    
        if (r4 == 279) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        QfgSZK.UPbYzn.dnY = ((r2 ^ 4117) % 100) >> 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        if ((QfgSZK.UPbYzn.RcO ^ 8237) == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
    
        r2 = QfgSZK.UPbYzn.RcO;
        r4 = r2 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012a, code lost:
    
        if (r4 == 38) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012e, code lost:
    
        if (r4 == 97) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0132, code lost:
    
        if (r4 == 122) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
    
        if (r4 == 199) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        QfgSZK.UPbYzn.RcO = (r2 % 81) ^ 2007;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013f, code lost:
    
        r4 = ((QfgSZK.UPbYzn.RcO + r2) * 102) % 71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0147, code lost:
    
        r4 = ((r2 % 57) + r2) * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014c, code lost:
    
        QfgSZK.UPbYzn.RcO = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014f, code lost:
    
        QfgSZK.UPbYzn.RcO = ((r2 >> 60) % 58) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
    
        QfgSZK.UPbYzn.dnY = ((r2 + r2) + r2) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015f, code lost:
    
        if (QfgSZK.UPbYzn.RcO > 8236) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0167, code lost:
    
        if ((QfgSZK.UPbYzn.RcO + 104) == 12) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016a, code lost:
    
        QfgSZK.UPbYzn.RcO ^= 772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0171, code lost:
    
        QfgSZK.UPbYzn.dnY = ((QfgSZK.UPbYzn.dnY >> 57) * 33) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017a, code lost:
    
        QfgSZK.UPbYzn.dnY = (QfgSZK.UPbYzn.dnY ^ 1670) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0185, code lost:
    
        if ((QfgSZK.UPbYzn.RcO ^ 8237) == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
    
        r9 = QfgSZK.UPbYzn.RcO + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r9 == 30) goto L135;
     */
    /* JADX WARN: Path cross not found for [B:134:?, B:126:?], limit reached: 167 */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x003e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x014f -> B:64:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String DvMhtu(byte[] bArr) {
        int i;
        int i2;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = RcO;
            if (i4 <= 8236) {
                while (true) {
                    int i5 = RcO;
                    int i6 = i5 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                    if (i6 == 91) {
                        RcO = (i5 % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) * 52;
                        break;
                    }
                    if (i6 == 143) {
                        while (true) {
                            RcO = (RcO % 34) * 99;
                        }
                    } else if (i6 == 299) {
                        break;
                    }
                }
                while (true) {
                    RcO = (RcO * 32) >> 59;
                }
            } else {
                byte b = bArr[i3];
                int i7 = dnY;
                if ((i7 ^ 5346) != 0) {
                    while (true) {
                        int i8 = dnY;
                        int i9 = i8 + 39;
                        if (i9 != 40) {
                            if (i9 == 84) {
                                dnY = (i8 + i8) >> 2;
                                if ((RcO ^ 8237) != 0) {
                                    do {
                                        i = RcO;
                                    } while (i + 39 != 87);
                                    RcO = ((i >> 49) * 37) >> 5;
                                }
                            } else if (i9 == 198) {
                                dnY = ((i8 >> 108) * WalletImportError.ERROR_CODE_AA_CREATE_KEY) ^ 3074;
                                if ((RcO ^ 8237) != 0) {
                                    do {
                                        i2 = RcO;
                                    } while (i2 + 130 != 27);
                                    while (true) {
                                        RcO = ((RcO + i2) % 94) ^ 3415;
                                    }
                                }
                            } else if (i9 == 217) {
                                dnY = (dnY ^ 5073) + i8;
                                if (RcO > 8236) {
                                    do {
                                        i = RcO;
                                    } while (i + 39 != 87);
                                    RcO = ((i >> 49) * 37) >> 5;
                                }
                            }
                        }
                        dnY = (dnY * 79) % 53;
                        if (RcO <= 8236) {
                            while (true) {
                                int i10 = RcO;
                                int i11 = i10 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                if (i11 == 83) {
                                    while (true) {
                                        RcO = ((RcO + i10) % WalletImportError.ERROR_CODE_AA_CREATE_KEY) >> 69;
                                    }
                                } else if (i11 == 154) {
                                    RcO = ((i10 ^ 4542) * 29) ^ 2497;
                                } else if (i11 == 178) {
                                    while (true) {
                                        RcO = RcO + i10 + i10 + i10;
                                    }
                                } else if (i11 == 303) {
                                    RcO = ((i10 ^ 1759) >> 95) ^ 3838;
                                    break;
                                }
                            }
                        }
                        dnY = (dnY ^ 5073) + i8;
                        if (RcO > 8236) {
                        }
                    }
                } else {
                    int i12 = i3 * 2;
                    char[] cArr2 = DECfsU;
                    cArr[i12] = cArr2[(b & UnsignedBytes.MAX_VALUE) >>> 4];
                    cArr[i12 + 1] = cArr2[b & Ascii.SI];
                    i3++;
                    if (i7 > 5345) {
                    }
                }
            }
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static byte[] OTJFaA(String str) {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        if (iSpHlg(str) || (messageDigest = gfxeLY) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(str.getBytes());
            bArrDigest = messageDigest.digest();
            messageDigest.reset();
        }
        return bArrDigest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static byte OsDdEf(char c) throws IllegalArgumentException {
        switch (c) {
            case '0':
                return (byte) 0;
            case '1':
                return (byte) 1;
            case '2':
                return (byte) 2;
            case '3':
                return (byte) 3;
            case '4':
                return (byte) 4;
            case '5':
                return (byte) 5;
            case '6':
                return (byte) 6;
            case '7':
                return (byte) 7;
            case '8':
                return (byte) 8;
            case '9':
                return (byte) 9;
            default:
                switch (c) {
                    case 'A':
                        return (byte) 10;
                    case 'B':
                        return Ascii.VT;
                    case 'C':
                        return Ascii.FF;
                    case 'D':
                        return Ascii.CR;
                    case 'E':
                        return Ascii.SO;
                    case 'F':
                        return Ascii.SI;
                    default:
                        switch (c) {
                            case 'a':
                                return (byte) 10;
                            case 'b':
                                return Ascii.VT;
                            case 'c':
                                return Ascii.FF;
                            case 'd':
                                return Ascii.CR;
                            case 'e':
                                return Ascii.SO;
                            case 'f':
                                return Ascii.SI;
                            default:
                                throw new IllegalArgumentException(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + c + GCXiNH.fsw("?1R\u007f\u000b_nj,I\u0002UKEAC\u0016]QK[UULWP]W\u001aZPVTdgwgs"));
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String QKVWgx(byte[] bArr) {
        String strASdHwS;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (AxsJAY.uzCIH().gGvvIC()) {
            return AxsJAY.uzCIH().QKVWgx(bArr);
        }
        MessageDigest messageDigest = zQTubx;
        if (messageDigest == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.reset();
            strASdHwS = aSdHwS(bArrDigest);
        }
        return strASdHwS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:20:0x0038) to fix multi-entry loop: BACK_EDGE: B:20:0x0038 -> B:21:0x003a */
    /* JADX DEBUG: Duplicate block (B:50:0x0097) to fix multi-entry loop: BACK_EDGE: B:50:0x0097 -> B:51:0x0099 */
    /* JADX DEBUG: Duplicate block (B:89:0x0119) to fix multi-entry loop: BACK_EDGE: B:88:0x0117 -> B:89:0x0119 */
    /* JADX DEBUG: Duplicate block (B:90:0x0122) to fix multi-entry loop: BACK_EDGE: B:90:0x0122 -> B:91:0x0129 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static boolean QWSkGZ(java.lang.String r9) {
        /*
            boolean r0 = iSpHlg(r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            r2 = r0
        La:
            int r3 = r9.length()
            if (r2 >= r3) goto L13b
            int r3 = QfgSZK.UPbYzn.RcO
            r4 = 64
            r5 = 32
            r6 = 8236(0x202c, float:1.1541E-41)
            if (r3 > r6) goto L48
        L1a:
            int r3 = QfgSZK.UPbYzn.RcO
            int r9 = r3 + 39
            if (r9 == r5) goto L40
            if (r9 == r4) goto L33
            r0 = 124(0x7c, float:1.74E-43)
            if (r9 == r0) goto L3a
            r0 = 242(0xf2, float:3.39E-43)
            if (r9 == r0) goto L2b
            goto L1a
        L2b:
            int r9 = QfgSZK.UPbYzn.RcO
            int r9 = r9 % 63
            int r9 = r9 + r3
            QfgSZK.UPbYzn.RcO = r9
            goto L2b
        L33:
            r9 = r3 ^ 3061(0xbf5, float:4.29E-42)
            int r9 = r9 + r3
            int r9 = r9 % 39
        L38:
            QfgSZK.UPbYzn.RcO = r9
        L3a:
            int r9 = QfgSZK.UPbYzn.RcO
            int r9 = r9 * 74
            int r9 = r9 + r3
            goto L38
        L40:
            int r9 = QfgSZK.UPbYzn.RcO
            r9 = r9 ^ 3703(0xe77, float:5.189E-42)
            int r9 = r9 + r3
            QfgSZK.UPbYzn.RcO = r9
            goto L40
        L48:
            char r3 = r9.charAt(r2)
            r7 = 13
            if (r3 == r5) goto L5b
            r5 = 9
            if (r3 == r5) goto L5b
            r5 = 10
            if (r3 == r5) goto L5b
            if (r3 == r7) goto L5b
            return r0
        L5b:
            int r2 = r2 + 1
            int r3 = QfgSZK.UPbYzn.dnY
            int r5 = QfgSZK.UPbYzn.RcO
            r8 = r5 ^ 8237(0x202d, float:1.1542E-41)
            if (r8 == 0) goto L78
        L65:
            int r8 = QfgSZK.UPbYzn.RcO
            int r9 = r8 + 52
            r0 = 36
            if (r9 == r0) goto L6e
            goto L65
        L6e:
            int r9 = QfgSZK.UPbYzn.RcO
            int r9 = r9 % 3
            int r9 = r9 * 47
            int r9 = r9 + r8
            QfgSZK.UPbYzn.RcO = r9
            goto L6e
        L78:
            r8 = 5345(0x14e1, float:7.49E-42)
            if (r3 > r8) goto La
            if (r5 > r6) goto Lae
        L7e:
            int r9 = QfgSZK.UPbYzn.RcO
            int r0 = r9 + 91
            r2 = 86
            if (r0 == r2) goto La2
            r2 = 205(0xcd, float:2.87E-43)
            if (r0 == r2) goto La7
            r2 = 271(0x10f, float:3.8E-43)
            if (r0 == r2) goto L93
            r9 = 384(0x180, float:5.38E-43)
            if (r0 == r9) goto L99
            goto L7e
        L93:
            int r9 = r9 * 47
            int r9 = r9 % 103
        L97:
            QfgSZK.UPbYzn.RcO = r9
        L99:
            int r9 = QfgSZK.UPbYzn.RcO
            int r9 = r9 % 82
            int r9 = r9 % 112
            int r9 = r9 >> 46
            goto L97
        La2:
            int r9 = r9 + r9
            r9 = r9 ^ 3735(0xe97, float:5.234E-42)
            QfgSZK.UPbYzn.RcO = r9
        La7:
            int r9 = QfgSZK.UPbYzn.RcO
            r0 = 133(0x85, float:1.86E-43)
            int r9 = r9 >> r0
            QfgSZK.UPbYzn.RcO = r9
        Lae:
            int r3 = QfgSZK.UPbYzn.dnY
            int r9 = r3 + 52
            if (r9 == r4) goto L122
            r0 = 83
            if (r9 == r0) goto Lc1
            r0 = 186(0xba, float:2.6E-43)
            if (r9 == r0) goto L131
            r0 = 241(0xf1, float:3.38E-43)
            if (r9 == r0) goto L129
            goto Lae
        Lc1:
            int r9 = QfgSZK.UPbYzn.RcO
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 > r6) goto Le9
        Lc7:
            int r9 = QfgSZK.UPbYzn.RcO
            int r1 = r9 + 195
            r2 = 18
            if (r1 == r2) goto Le3
            r2 = 61
            if (r1 == r2) goto Ld6
            if (r1 == r0) goto Ldb
            goto Lc7
        Ld6:
            int r9 = r9 + r9
            int r9 = r9 >> 73
            QfgSZK.UPbYzn.RcO = r9
        Ldb:
            int r9 = QfgSZK.UPbYzn.RcO
            int r9 = r9 >> r7
            r9 = r9 ^ 5087(0x13df, float:7.128E-42)
            QfgSZK.UPbYzn.RcO = r9
            goto Lc7
        Le3:
            int r1 = r9 * 38
            int r1 = r1 + r9
            QfgSZK.UPbYzn.RcO = r1
            goto Lc7
        Le9:
            int r2 = r3 % 74
            int r2 = r2 * 59
            int r0 = r2 >> 110
            QfgSZK.UPbYzn.dnY = r0
            r9 = r9 ^ 8237(0x202d, float:1.1542E-41)
            if (r9 == 0) goto L131
        Lf5:
            int r9 = QfgSZK.UPbYzn.RcO
            int r0 = r9 + 130
            if (r0 == r1) goto L112
            r2 = 75
            if (r0 == r2) goto L10e
            r2 = 144(0x90, float:2.02E-43)
            if (r0 == r2) goto L119
            r2 = 183(0xb7, float:2.56E-43)
            if (r0 == r2) goto L108
            goto Lf5
        L108:
            int r9 = r9 + r9
            int r9 = r9 >> 16
            QfgSZK.UPbYzn.RcO = r9
            goto L131
        L10e:
            int r0 = r9 % 95
            int r0 = r0 + r9
            goto L117
        L112:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 + r9
            int r0 = r0 >> 91
        L117:
            QfgSZK.UPbYzn.RcO = r0
        L119:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 >> 87
            int r0 = r0 * 46
            QfgSZK.UPbYzn.RcO = r0
            goto L112
        L122:
            int r9 = QfgSZK.UPbYzn.dnY
            int r9 = r9 % r7
            r9 = r9 ^ 3348(0xd14, float:4.692E-42)
            QfgSZK.UPbYzn.dnY = r9
        L129:
            int r9 = QfgSZK.UPbYzn.dnY
            int r9 = r9 * 3904
            int r9 = r9 % 99
            QfgSZK.UPbYzn.dnY = r9
        L131:
            int r9 = QfgSZK.UPbYzn.dnY
            int r9 = r9 * 111
            int r9 = r9 + r3
            r9 = r9 ^ 4889(0x1319, float:6.851E-42)
            QfgSZK.UPbYzn.dnY = r9
            goto L122
        L13b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UPbYzn.QWSkGZ(java.lang.String):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:32:0x0073) to fix multi-entry loop: BACK_EDGE: B:31:0x0071 -> B:32:0x0073 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String QbewEr(int r5) {
        /*
            java.lang.String r0 = QfgSZK.UPbYzn.DlIaRS
            java.lang.String r1 = "ztOxB_f>m\bPBDMGJ\u0016F@A[_W\u000fITHS\u001aU]YAql#mg EQ)"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            int r2 = QfgSZK.UPbYzn.RcO
            r2 = r2 ^ 8237(0x202d, float:1.1542E-41)
            r3 = 35
            if (r2 == 0) goto L20
        L10:
            int r5 = QfgSZK.UPbYzn.RcO
            int r5 = r5 + 156
            if (r5 == r3) goto L17
            goto L10
        L17:
            int r5 = QfgSZK.UPbYzn.RcO
            int r5 = r5 % 116
            int r5 = r5 % 40
            QfgSZK.UPbYzn.RcO = r5
            goto L17
        L20:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r0, r1, r2)
            QfgSZK.AxsJAY r0 = QfgSZK.AxsJAY.uzCIH()
            boolean r0 = r0.gGvvIC()
            int r1 = QfgSZK.UPbYzn.dnY
            r2 = 5345(0x14e1, float:7.49E-42)
            if (r1 > r2) goto L105
            int r5 = QfgSZK.UPbYzn.RcO
            r0 = 8236(0x202c, float:1.1541E-41)
            if (r5 > r0) goto L3c
            goto L57
        L3c:
            int r5 = QfgSZK.UPbYzn.dnY
            int r1 = r5 + 39
            r2 = 99
            if (r1 == r2) goto Lce
            r2 = 221(0xdd, float:3.1E-43)
            if (r1 == r2) goto L7b
            r2 = 338(0x152, float:4.74E-43)
            if (r1 == r2) goto L4d
            goto L3c
        L4d:
            int r5 = r5 >> 19
            r5 = r5 ^ 2754(0xac2, float:3.859E-42)
            QfgSZK.UPbYzn.dnY = r5
            int r5 = QfgSZK.UPbYzn.RcO
            if (r5 > r0) goto L3c
        L57:
            int r5 = QfgSZK.UPbYzn.RcO
            int r0 = r5 + 65
            if (r0 == r3) goto L6b
            r1 = 48
            if (r0 == r1) goto L66
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L73
            goto L57
        L66:
            int r0 = r5 * 40
            int r0 = r0 >> 32
            goto L71
        L6b:
            int r0 = QfgSZK.UPbYzn.RcO
            r0 = r0 ^ 3808(0xee0, float:5.336E-42)
            int r0 = r0 % 46
        L71:
            QfgSZK.UPbYzn.RcO = r0
        L73:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 % 101
            int r0 = r0 + r5
            QfgSZK.UPbYzn.RcO = r0
            goto L6b
        L7b:
            int r5 = QfgSZK.UPbYzn.dnY
            int r1 = QfgSZK.UPbYzn.RcO
            if (r1 > r0) goto L9c
        L81:
            int r5 = QfgSZK.UPbYzn.RcO
            int r0 = r5 + 117
            r1 = 66
            if (r0 == r1) goto L8e
            r5 = 175(0xaf, float:2.45E-43)
            if (r0 == r5) goto L95
            goto L81
        L8e:
            int r5 = r5 + r5
            r5 = r5 ^ 2475(0x9ab, float:3.468E-42)
            int r5 = r5 * 107
            QfgSZK.UPbYzn.RcO = r5
        L95:
            int r5 = QfgSZK.UPbYzn.RcO
            int r5 = r5 * 12282
            QfgSZK.UPbYzn.RcO = r5
            goto L81
        L9c:
            int r5 = r5 * 51
            int r5 = r5 % 38
            int r5 = r5 % 73
            QfgSZK.UPbYzn.dnY = r5
            r5 = r1 ^ 8237(0x202d, float:1.1542E-41)
            if (r5 == 0) goto L7b
        La8:
            int r5 = QfgSZK.UPbYzn.RcO
            int r1 = r5 + 91
            r2 = 78
            if (r1 == r2) goto Lc9
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto Lc1
            r2 = 128(0x80, float:1.794E-43)
            if (r1 == r2) goto Lb9
            goto La8
        Lb9:
            int r1 = r5 * 15
            int r1 = r1 >> 70
            int r1 = r1 + r5
            QfgSZK.UPbYzn.RcO = r1
            goto L7b
        Lc1:
            int r1 = r5 >> 6
            int r1 = r1 * 62
            int r1 = r1 + r5
            QfgSZK.UPbYzn.RcO = r1
            goto La8
        Lc9:
            int r5 = r5 >> 55
            QfgSZK.UPbYzn.RcO = r5
            goto L7b
        Lce:
            int r5 = QfgSZK.UPbYzn.dnY
            int r5 = r5 * 110
            r5 = r5 ^ 3829(0xef5, float:5.366E-42)
            QfgSZK.UPbYzn.dnY = r5
            int r5 = QfgSZK.UPbYzn.RcO
            r5 = r5 ^ 8237(0x202d, float:1.1542E-41)
            if (r5 == 0) goto Lce
        Ldc:
            int r5 = QfgSZK.UPbYzn.RcO
            int r0 = r5 + 78
            r1 = 63
            if (r0 == r1) goto Lf7
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 == r1) goto Lfc
            r1 = 333(0x14d, float:4.67E-43)
            if (r0 == r1) goto Led
            goto Ldc
        Led:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 * 34
            r0 = r0 ^ 4405(0x1135, float:6.173E-42)
            int r0 = r0 + r5
            QfgSZK.UPbYzn.RcO = r0
            goto Led
        Lf7:
            int r0 = r5 * 75
            int r0 = r0 + r5
            QfgSZK.UPbYzn.RcO = r0
        Lfc:
            int r5 = QfgSZK.UPbYzn.RcO
            int r5 = r5 >> 122
            int r5 = r5 * 11
            QfgSZK.UPbYzn.RcO = r5
            goto Lfc
        L105:
            r1 = 97
            if (r0 == 0) goto L143
            QfgSZK.AxsJAY r0 = QfgSZK.AxsJAY.uzCIH()
            java.lang.String r0 = r0.QbewEr(r5)
            int r2 = QfgSZK.UPbYzn.RcO
            r2 = r2 ^ 8237(0x202d, float:1.1542E-41)
            if (r2 == 0) goto L140
        L117:
            int r2 = QfgSZK.UPbYzn.RcO
            int r3 = r2 + 169
            if (r3 == r1) goto L138
            r4 = 285(0x11d, float:4.0E-43)
            if (r3 == r4) goto L12f
            r4 = 459(0x1cb, float:6.43E-43)
            if (r3 == r4) goto L126
            goto L117
        L126:
            int r2 = r2 * 50
            int r2 = r2 >> 7
            r2 = r2 ^ 3620(0xe24, float:5.073E-42)
            QfgSZK.UPbYzn.RcO = r2
            goto L140
        L12f:
            r2 = r2 ^ 4037(0xfc5, float:5.657E-42)
            int r2 = r2 * 122
            r2 = r2 ^ 2427(0x97b, float:3.401E-42)
            QfgSZK.UPbYzn.RcO = r2
            goto L117
        L138:
            int r3 = r2 * 104
            int r3 = r3 + r2
            int r3 = r3 * 52
            QfgSZK.UPbYzn.RcO = r3
            goto L117
        L140:
            if (r0 == 0) goto L143
            return r0
        L143:
            int r0 = r5 + 1
            int r0 = r0 / 2
            int r2 = QfgSZK.UPbYzn.RcO
            r2 = r2 ^ 8237(0x202d, float:1.1542E-41)
            if (r2 == 0) goto L181
        L14d:
            int r2 = QfgSZK.UPbYzn.RcO
            int r3 = r2 + 26
            r4 = 61
            if (r3 == r4) goto L178
            r4 = 113(0x71, float:1.58E-43)
            if (r3 == r4) goto L170
            r4 = 227(0xe3, float:3.18E-43)
            if (r3 == r4) goto L167
            r4 = 405(0x195, float:5.68E-43)
            if (r3 == r4) goto L162
            goto L14d
        L162:
            int r3 = r2 * 71
            int r3 = r3 + r2
            QfgSZK.UPbYzn.RcO = r3
        L167:
            int r2 = QfgSZK.UPbYzn.RcO
            int r2 = r2 * 13608
            int r2 = r2 >> 16
            QfgSZK.UPbYzn.RcO = r2
            goto L178
        L170:
            int r3 = r2 % 49
            int r3 = r3 * 69
            int r3 = r3 + r2
            QfgSZK.UPbYzn.RcO = r3
            goto L181
        L178:
            int r2 = QfgSZK.UPbYzn.RcO
            int r2 = r2 % 30
            r2 = r2 ^ 3202(0xc82, float:4.487E-42)
            QfgSZK.UPbYzn.RcO = r2
            goto L14d
        L181:
            byte[] r0 = new byte[r0]
            java.security.SecureRandom r2 = QfgSZK.UPbYzn.drgvuH
            r2.nextBytes(r0)
            java.lang.String r0 = DvMhtu(r0)
            int r2 = QfgSZK.UPbYzn.RcO
            r2 = r2 ^ 8237(0x202d, float:1.1542E-41)
            if (r2 == 0) goto L19f
        L192:
            int r2 = QfgSZK.UPbYzn.RcO
            int r3 = r2 + 182
            if (r3 == r1) goto L199
            goto L192
        L199:
            r1 = r2 ^ 3752(0xea8, float:5.258E-42)
            int r1 = r1 * 8547
            QfgSZK.UPbYzn.RcO = r1
        L19f:
            int r1 = r0.length()
            if (r1 > r5) goto L1a6
            return r0
        L1a6:
            r1 = 0
            java.lang.String r5 = r0.substring(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UPbYzn.QbewEr(int):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:41:0x0087) to fix multi-entry loop: BACK_EDGE: B:41:0x0087 -> B:42:0x008a */
    /* JADX DEBUG: Duplicate block (B:52:0x00ab) to fix multi-entry loop: BACK_EDGE: B:52:0x00ab -> B:53:0x00ad */
    /* JADX DEBUG: Duplicate block (B:68:0x00e9) to fix multi-entry loop: BACK_EDGE: B:67:0x00e1 -> B:68:0x00e9 */
    public static int QfgJNx(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        while (i7 < 8) {
            int i9 = (int) ((j >> (i7 * 8)) & 255);
            if (RcO <= 8236) {
                while (true) {
                    i6 = RcO;
                    int i10 = i6 + 130;
                    if (i10 == 7) {
                        RcO = (i6 * 117) ^ 3511;
                        break;
                    }
                    if (i10 != 109) {
                        if (i10 == 287) {
                            RcO = ((i6 % 65) ^ 5133) + i6;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                RcO = (RcO + i6) * 12;
            }
            if (dnY > 5345) {
                int i11 = i8 ^ i9;
                int i12 = 0;
                while (i12 < 8) {
                    int i13 = i11 << 1;
                    if ((i11 & 128) != 0) {
                        i11 = i13 ^ 7;
                        if (RcO <= 8236) {
                            while (true) {
                                i5 = RcO;
                                int i14 = i5 + 104;
                                if (i14 == 97) {
                                    RcO = ((i5 + i5) % 77) + i5;
                                    break;
                                }
                                if (i14 == 292) {
                                    break;
                                }
                            }
                            while (true) {
                                RcO = ((RcO * 121) ^ 5398) + i5;
                            }
                        }
                    } else {
                        i11 = i13;
                    }
                    i12++;
                    if ((RcO ^ 8237) != 0) {
                        while (true) {
                            i4 = RcO;
                            int i15 = i4 + 52;
                            if (i15 == 47) {
                                RcO = (i4 * 8) % 63;
                                break;
                            }
                            if (i15 == 162) {
                                break;
                            }
                        }
                        while (true) {
                            RcO = (RcO % 84) + i4;
                        }
                    }
                }
                i8 = i11 & 255;
                i7++;
                if (RcO <= 8236) {
                    do {
                        i2 = RcO;
                        i3 = i2 + 65;
                        if (i3 != 3) {
                            if (i3 == 192) {
                                while (true) {
                                    RcO = (RcO + i2) ^ 1379;
                                }
                            } else if (i3 == 237) {
                                RcO = (RcO >> 23) ^ 5020;
                            }
                        }
                        while (true) {
                            RcO = (RcO >> 18) * 324;
                            RcO = (RcO >> 23) ^ 5020;
                        }
                    } while (i3 != 282);
                    while (true) {
                        RcO = ((RcO + i2) % 72) % 34;
                    }
                }
            } else if (RcO <= 8236) {
                while (true) {
                    int i16 = RcO;
                    if (i16 + 39 == 70) {
                        RcO = ((i16 + i16) + i16) % 101;
                    }
                }
            } else {
                do {
                    i = dnY;
                } while (i + 91 != 97);
                while (true) {
                    dnY = ((dnY >> 35) * 33) + i;
                }
            }
        }
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:37:0x0086) to fix multi-entry loop: BACK_EDGE: B:37:0x0086 -> B:38:0x0088 */
    /* JADX DEBUG: Duplicate block (B:56:0x00cb) to fix multi-entry loop: BACK_EDGE: B:56:0x00cb -> B:57:0x00cd */
    public static byte[] QfsBiF(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (iSpHlg(str)) {
            return null;
        }
        if (!AxsJAY.uzCIH().gGvvIC()) {
            return OTJFaA(str);
        }
        String strQfsBiF = AxsJAY.uzCIH().QfsBiF(str);
        if (dnY <= 5345) {
            if ((RcO ^ 8237) != 0) {
                do {
                    int i7 = RcO;
                    i6 = i7 + 52;
                    if (i6 == 34) {
                        while (true) {
                            RcO = (RcO * 31) >> 26;
                        }
                    } else if (i6 == 119) {
                        while (true) {
                            RcO = (RcO ^ 4940) * 34;
                        }
                    } else if (i6 == 210) {
                        RcO = (i7 + i7) % 70;
                    }
                } while (i6 != 326);
                while (true) {
                    RcO = ((RcO % 91) * 36) ^ 5270;
                }
            }
            do {
                i4 = dnY;
            } while (i4 + 65 != 40);
            dnY = (i4 + i4) >> 103;
            if ((RcO ^ 8237) != 0) {
                while (true) {
                    i5 = RcO;
                    int i8 = i5 + 39;
                    if (i8 == 52) {
                        while (true) {
                            RcO = (RcO * 85) + i5;
                        }
                    } else {
                        if (i8 == 244) {
                            RcO = (i5 >> 63) ^ 4840;
                            break;
                        }
                        if (i8 == 337) {
                            break;
                        }
                    }
                }
                while (true) {
                    RcO = ((RcO + i5) * 107) + i5;
                }
            }
        }
        if (!iSpHlg(strQfsBiF)) {
            return strQfsBiF.getBytes(StandardCharsets.UTF_8);
        }
        if ((RcO ^ 8237) != 0) {
            do {
                i2 = RcO;
                i3 = i2 + 78;
                if (i3 == 52) {
                    RcO = ((i2 + i2) ^ 2063) % 89;
                } else if (i3 != 109) {
                    if (i3 == 187) {
                        while (true) {
                            RcO = (RcO + i2) ^ 5129;
                        }
                    }
                }
                while (true) {
                    RcO >>= 58;
                }
            } while (i3 != 319);
            RcO = (i2 >> CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256) + i2;
        }
        if ((dnY ^ 5346) == 0) {
            return null;
        }
        while (true) {
            i = dnY;
            int i9 = i + 52;
            if (i9 == 96) {
                dnY = ((i * 63) ^ 3963) % 42;
            } else if (i9 == 240) {
                break;
            }
        }
        while (true) {
            dnY = (dnY + i) * 103;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean RAaltf(String str) {
        return dTTfOR(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String RgaQzq(String str, int i) {
        return (str == null || i < 0 || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198 A[LOOP:0: B:8:0x0018->B:88:0x0198, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007e -> B:36:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String aSdHwS(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int length = bArr.length;
        int i20 = 5;
        StringBuilder sb = new StringBuilder((((length + 4) / 5) * 8) + 1);
        int i21 = 0;
        while (length >= 1) {
            if (length >= i20) {
                i = i21;
                i2 = length;
                length = i20;
            } else if (dnY > 5345) {
                i = i21;
                i2 = length;
            } else if (RcO <= 8236) {
                i = i21;
                i2 = length;
                break;
                do {
                    i19 = RcO;
                } while (i19 + 78 != 65);
                RcO = ((i19 * 27) % 75) % 103;
                while (true) {
                    int i22 = dnY;
                    i16 = i22 + 65;
                    if (i16 != 3) {
                        dnY = ((i22 >> 121) % 62) * 71;
                        if ((RcO ^ 8237) == 0) {
                        }
                        break;
                    }
                    if (i16 == 34) {
                        dnY = (i22 * 60) + i22;
                        if ((RcO ^ 8237) != 0) {
                            do {
                                i17 = RcO;
                                i18 = i17 + 65;
                                if (i18 == 72) {
                                    while (true) {
                                        RcO = (RcO % 33) ^ 2202;
                                    }
                                } else if (i18 == 270) {
                                    RcO = ((i17 >> 74) * 69) >> 83;
                                }
                            } while (i18 != 375);
                            while (true) {
                                RcO = ((RcO >> 85) % 122) + i17;
                            }
                        }
                    }
                }
            } else {
                i = i21;
                i2 = length;
                while (true) {
                    int i222 = dnY;
                    i16 = i222 + 65;
                    if (i16 != 3) {
                    }
                }
            }
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length == 4) {
                            i15 = 0;
                            i6 = 0;
                        } else if (length != i20) {
                            i3 = 0;
                            i10 = 0;
                            i11 = 0;
                            i5 = 0;
                            i6 = 0;
                            i7 = 0;
                            i8 = 0;
                            i9 = 0;
                            if (length == 1) {
                                if (length != 2) {
                                    if (length != 3) {
                                        if (length == 4) {
                                        }
                                        char[] cArr = fsmMas;
                                        sb.append(cArr[i11]);
                                        sb.append(cArr[i10]);
                                        sb.append(cArr[i9]);
                                        sb.append(cArr[i3]);
                                        sb.append(cArr[i7]);
                                        sb.append(cArr[i8]);
                                        sb.append(cArr[i5]);
                                        sb.append(cArr[i6]);
                                        if ((dnY ^ 5346) != 0) {
                                            if ((RcO ^ 8237) == 0) {
                                                while (true) {
                                                    int i23 = dnY;
                                                    int i24 = i23 + 221;
                                                    if (i24 != 87) {
                                                        if (i24 == 107) {
                                                            dnY = ((i23 + i23) >> 22) * 39;
                                                        } else if (i24 != 179) {
                                                            continue;
                                                        }
                                                        dnY = (dnY * 3) + i23 + i23;
                                                        if ((RcO ^ 8237) != 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        while (true) {
                                                            dnY = ((dnY ^ 3608) % 50) % 70;
                                                        }
                                                    }
                                                }
                                            }
                                            do {
                                                i12 = RcO;
                                            } while (i12 + 247 != 62);
                                            while (true) {
                                                RcO = ((RcO >> 20) + i12) >> 96;
                                            }
                                        } else {
                                            int i25 = i2 - length;
                                            i21 = i + length;
                                            length = i25;
                                            i20 = 5;
                                        }
                                    }
                                    i6 = 32;
                                    char[] cArr2 = fsmMas;
                                    sb.append(cArr2[i11]);
                                    sb.append(cArr2[i10]);
                                    sb.append(cArr2[i9]);
                                    sb.append(cArr2[i3]);
                                    sb.append(cArr2[i7]);
                                    sb.append(cArr2[i8]);
                                    sb.append(cArr2[i5]);
                                    sb.append(cArr2[i6]);
                                    if ((dnY ^ 5346) != 0) {
                                    }
                                }
                                i5 = 32;
                                i8 = 32;
                                i6 = 32;
                                char[] cArr22 = fsmMas;
                                sb.append(cArr22[i11]);
                                sb.append(cArr22[i10]);
                                sb.append(cArr22[i9]);
                                sb.append(cArr22[i3]);
                                sb.append(cArr22[i7]);
                                sb.append(cArr22[i8]);
                                sb.append(cArr22[i5]);
                                sb.append(cArr22[i6]);
                                if ((dnY ^ 5346) != 0) {
                                }
                            } else {
                                i3 = 32;
                                i9 = 32;
                            }
                            i7 = 32;
                            i5 = 32;
                            i8 = 32;
                            i6 = 32;
                            char[] cArr222 = fsmMas;
                            sb.append(cArr222[i11]);
                            sb.append(cArr222[i10]);
                            sb.append(cArr222[i9]);
                            sb.append(cArr222[i3]);
                            sb.append(cArr222[i7]);
                            sb.append(cArr222[i8]);
                            sb.append(cArr222[i5]);
                            sb.append(cArr222[i6]);
                            if ((dnY ^ 5346) != 0) {
                            }
                        } else {
                            byte b = bArr[i + 4];
                            i6 = b & Ascii.US;
                            i15 = (b & 224) >> i20;
                        }
                        byte b2 = bArr[i + 3];
                        i5 = i15 | ((b2 & 3) << 3);
                        i8 = (b2 & 124) >> 2;
                        i14 = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) >> 7;
                    } else {
                        i5 = 0;
                        i6 = 0;
                        i14 = 0;
                        i8 = 0;
                    }
                    byte b3 = bArr[i + 2];
                    i7 = i14 | ((b3 & Ascii.SI) << 1);
                    i13 = (b3 & 240) >> 4;
                } else {
                    i13 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                }
                byte b4 = bArr[i + 1];
                i3 = i13 | ((b4 & 1) << 4);
                i9 = (b4 & 62) >> 1;
                i4 = (b4 & 192) >> 6;
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
            }
            byte b5 = bArr[i];
            i10 = i4 | ((b5 & 7) << 2);
            i11 = (b5 & 248) >> 3;
            if (length == 1) {
            }
            i7 = 32;
            i5 = 32;
            i8 = 32;
            i6 = 32;
            char[] cArr2222 = fsmMas;
            sb.append(cArr2222[i11]);
            sb.append(cArr2222[i10]);
            sb.append(cArr2222[i9]);
            sb.append(cArr2222[i3]);
            sb.append(cArr2222[i7]);
            sb.append(cArr2222[i8]);
            sb.append(cArr2222[i5]);
            sb.append(cArr2222[i6]);
            if ((dnY ^ 5346) != 0) {
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:19:0x003d) to fix multi-entry loop: BACK_EDGE: B:18:0x0038 -> B:19:0x003d */
    /* JADX DEBUG: Duplicate block (B:41:0x0086) to fix multi-entry loop: BACK_EDGE: B:41:0x0086 -> B:42:0x0088 */
    /* JADX DEBUG: Duplicate block (B:67:0x00f0) to fix multi-entry loop: BACK_EDGE: B:67:0x00f0 -> B:68:0x00f2 */
    /* JADX DEBUG: Duplicate block (B:83:0x012c) to fix multi-entry loop: BACK_EDGE: B:83:0x012c -> B:84:0x012e */
    /* JADX WARN: Path cross not found for [B:174:?, B:167:?], limit reached: 166 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016e A[EDGE_INSN: B:165:0x016e->B:103:0x016e BREAK  A[LOOP:18: B:101:0x0168->B:168:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x019e A[EDGE_INSN: B:170:0x019e->B:115:0x019e BREAK  A[LOOP:19: B:109:0x0188->B:171:0x0188], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x019e -> B:101:0x0168). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean ahrCSq(java.lang.String r7) {
        /*
            boolean r0 = dTTfOR(r7)
            if (r0 == 0) goto L1a7
            int r0 = QfgSZK.UPbYzn.RcO
            r0 = r0 ^ 8237(0x202d, float:1.1542E-41)
            r1 = 37
            if (r0 == 0) goto L40
        Le:
            int r0 = QfgSZK.UPbYzn.RcO
            int r7 = r0 + 26
            if (r7 == r1) goto L38
            r2 = 214(0xd6, float:3.0E-43)
            if (r7 == r2) goto L33
            r0 = 364(0x16c, float:5.1E-43)
            if (r7 == r0) goto L2a
            r0 = 518(0x206, float:7.26E-43)
            if (r7 == r0) goto L21
            goto Le
        L21:
            int r7 = QfgSZK.UPbYzn.RcO
            r7 = r7 ^ 4168(0x1048, float:5.84E-42)
            int r7 = r7 >> 116
            QfgSZK.UPbYzn.RcO = r7
            goto L21
        L2a:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 % 27
            r7 = r7 ^ 4701(0x125d, float:6.588E-42)
            QfgSZK.UPbYzn.RcO = r7
            goto L2a
        L33:
            r7 = r0 ^ 4138(0x102a, float:5.799E-42)
            int r7 = r7 * 38
            goto L3d
        L38:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 % 41
            int r7 = r7 + r0
        L3d:
            QfgSZK.UPbYzn.RcO = r7
            goto L38
        L40:
            java.lang.String r0 = "na^oBPm>|ZMNE]AHX"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r0 = r7.equals(r0)
            int r2 = QfgSZK.UPbYzn.dnY
            r3 = 5345(0x14e1, float:7.49E-42)
            r4 = 50
            r5 = 57
            if (r2 > r3) goto Lf9
        L54:
            int r2 = QfgSZK.UPbYzn.dnY
            int r3 = r2 + 39
            if (r3 == r5) goto L9f
            r6 = 76
            if (r3 == r6) goto L94
            r6 = 87
            if (r3 == r6) goto Lf2
            r6 = 252(0xfc, float:3.53E-43)
            if (r3 == r6) goto L67
            goto L54
        L67:
            int r2 = r2 * 7832
            QfgSZK.UPbYzn.dnY = r2
            int r2 = QfgSZK.UPbYzn.RcO
            r2 = r2 ^ 8237(0x202d, float:1.1542E-41)
            if (r2 == 0) goto Lf9
        L71:
            int r2 = QfgSZK.UPbYzn.RcO
            int r3 = r2 + 143
            r6 = 78
            if (r3 == r6) goto L8e
            r6 = 270(0x10e, float:3.78E-43)
            if (r3 == r6) goto L82
            r2 = 426(0x1aa, float:5.97E-43)
            if (r3 == r2) goto L88
            goto L71
        L82:
            r7 = r2 ^ 2407(0x967, float:3.373E-42)
            int r7 = r7 % 125
        L86:
            QfgSZK.UPbYzn.RcO = r7
        L88:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 * 236
            int r7 = r7 % r4
            goto L86
        L8e:
            r2 = r2 ^ 4041(0xfc9, float:5.663E-42)
            int r2 = r2 * r1
            QfgSZK.UPbYzn.RcO = r2
            goto Lf9
        L94:
            int r7 = QfgSZK.UPbYzn.dnY
            r7 = r7 ^ 3441(0xd71, float:4.822E-42)
            int r7 = r7 % 107
            int r7 = r7 >> 26
            QfgSZK.UPbYzn.dnY = r7
            goto L94
        L9f:
            int r7 = QfgSZK.UPbYzn.RcO
            r7 = r7 ^ 8237(0x202d, float:1.1542E-41)
            if (r7 == 0) goto Lce
        La5:
            int r7 = QfgSZK.UPbYzn.RcO
            int r0 = r7 + 117
            r1 = 91
            if (r0 == r1) goto Lc4
            r1 = 229(0xe5, float:3.21E-43)
            if (r0 == r1) goto Lbb
            r1 = 233(0xe9, float:3.27E-43)
            if (r0 == r1) goto Lb6
            goto La5
        Lb6:
            r7 = r7 ^ 273(0x111, float:3.83E-43)
            QfgSZK.UPbYzn.RcO = r7
            goto Lc4
        Lbb:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 >> 123
            int r7 = r7 % 107
            QfgSZK.UPbYzn.RcO = r7
            goto Lbb
        Lc4:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 * 80
            r7 = r7 ^ 2094(0x82e, float:2.934E-42)
            int r7 = r7 >> 75
            QfgSZK.UPbYzn.RcO = r7
        Lce:
            int r7 = QfgSZK.UPbYzn.RcO
            r7 = r7 ^ 8237(0x202d, float:1.1542E-41)
            if (r7 == 0) goto Led
        Ld4:
            int r7 = QfgSZK.UPbYzn.RcO
            int r0 = r7 + 247
            r1 = 20
            if (r0 == r1) goto Le1
            r1 = 207(0xcf, float:2.9E-43)
            if (r0 == r1) goto Le5
            goto Ld4
        Le1:
            r0 = r7 ^ 7586(0x1da2, float:1.063E-41)
            QfgSZK.UPbYzn.RcO = r0
        Le5:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 + r7
            r7 = r0 ^ 1720(0x6b8, float:2.41E-42)
            QfgSZK.UPbYzn.RcO = r7
            goto Ld4
        Led:
            r7 = r2 ^ 791(0x317, float:1.108E-42)
            int r7 = r7 + r2
        Lf0:
            QfgSZK.UPbYzn.dnY = r7
        Lf2:
            int r7 = QfgSZK.UPbYzn.dnY
            int r7 = r7 >> 70
            int r7 = r7 * 2622
            goto Lf0
        Lf9:
            if (r0 != 0) goto L1a7
            java.util.regex.Pattern r0 = QfgSZK.UPbYzn.Rggsdr
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r7 = r7.find()
            if (r7 != 0) goto L1a7
            int r7 = QfgSZK.UPbYzn.RcO
            r0 = 8236(0x202c, float:1.1541E-41)
            if (r7 > r0) goto L135
        L10d:
            int r7 = QfgSZK.UPbYzn.RcO
            int r0 = r7 + 39
            r1 = 81
            if (r0 == r1) goto L126
            r1 = 195(0xc3, float:2.73E-43)
            if (r0 == r1) goto L12e
            r1 = 277(0x115, float:3.88E-43)
            if (r0 == r1) goto L11e
            goto L10d
        L11e:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 + r7
            int r0 = r0 % 27
            QfgSZK.UPbYzn.RcO = r0
            goto L11e
        L126:
            int r7 = r7 % 121
            r7 = r7 ^ 1337(0x539, float:1.874E-42)
            int r7 = r7 % 99
        L12c:
            QfgSZK.UPbYzn.RcO = r7
        L12e:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 % 60
            r7 = r7 ^ 2001(0x7d1, float:2.804E-42)
            goto L12c
        L135:
            int r2 = QfgSZK.UPbYzn.dnY
            r2 = r2 ^ 5346(0x14e2, float:7.491E-42)
            if (r2 == 0) goto L1a5
            r7 = r7 ^ 8237(0x202d, float:1.1542E-41)
            if (r7 == 0) goto L150
        L13f:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 + 156
            r0 = 65
            if (r7 == r0) goto L148
            goto L13f
        L148:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 % 26
            int r7 = r7 >> r1
            QfgSZK.UPbYzn.RcO = r7
            goto L148
        L150:
            int r7 = QfgSZK.UPbYzn.dnY
            int r1 = r7 + 26
            if (r1 == r4) goto L15b
            r2 = 234(0xea, float:3.28E-43)
            if (r1 == r2) goto L168
            goto L150
        L15b:
            int r1 = r7 + r7
            int r1 = r1 * 95
            int r1 = r1 % 18
            QfgSZK.UPbYzn.dnY = r1
            int r1 = QfgSZK.UPbYzn.RcO
            if (r1 > r0) goto L168
            goto L188
        L168:
            int r1 = QfgSZK.UPbYzn.dnY
            int r2 = QfgSZK.UPbYzn.RcO
            if (r2 > r0) goto L180
        L16e:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 + 208
            r0 = 58
            if (r7 == r0) goto L177
            goto L16e
        L177:
            int r7 = QfgSZK.UPbYzn.RcO
            int r7 = r7 >> 42
            r7 = r7 ^ 5120(0x1400, float:7.175E-42)
            QfgSZK.UPbYzn.RcO = r7
            goto L177
        L180:
            int r1 = r1 + r7
            int r1 = r1 * r5
            r1 = r1 ^ 3616(0xe20, float:5.067E-42)
            QfgSZK.UPbYzn.dnY = r1
            if (r2 > r0) goto L168
        L188:
            int r1 = QfgSZK.UPbYzn.RcO
            int r2 = r1 + 182
            r3 = 82
            if (r2 == r3) goto L19e
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == r3) goto L195
            goto L188
        L195:
            int r1 = r1 >> 111
            int r1 = r1 % 99
            int r1 = r1 >> 49
            QfgSZK.UPbYzn.RcO = r1
            goto L188
        L19e:
            int r1 = r1 >> 18
            r1 = r1 ^ 2153(0x869, float:3.017E-42)
            QfgSZK.UPbYzn.RcO = r1
            goto L168
        L1a5:
            r7 = 1
            goto L1a8
        L1a7:
            r7 = 0
        L1a8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UPbYzn.ahrCSq(java.lang.String):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean dPaqAf(String str) {
        if (dTTfOR(str) && !GCXiNH.fsw("-#\u0001<\u001b\u000b1.6\u0018\u0012\u0019\u001a\u0019\u0012\u0017\u0006").equals(str) && !ipHmHR.matcher(str).find()) {
            Pattern pattern = OvQhkN;
            if ((RcO ^ 8237) != 0) {
                while (true) {
                    int i = RcO;
                    int i2 = i + 65;
                    if (i2 != 33) {
                        if (i2 == 163) {
                            RcO = (i % 30) ^ 1883;
                        }
                    }
                    RcO = ((RcO ^ 5443) >> 24) * 5;
                }
            } else if (pattern.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean dTTfOR(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if ((RcO ^ 8237) == 0) {
            return true;
        }
        do {
            i = RcO;
        } while (i + 26 != 34);
        while (true) {
            RcO = (RcO + i) ^ 4078;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String ddhgMB() {
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOxB_f>Y}kg"));
        return QbewEr(32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:21:0x003d) to fix multi-entry loop: BACK_EDGE: B:21:0x003d -> B:22:0x003f */
    /* JADX DEBUG: Duplicate block (B:77:0x0137) to fix multi-entry loop: BACK_EDGE: B:76:0x012d -> B:77:0x0137 */
    public static String dxcTrN(String str, String str2) {
        int i;
        int i2;
        if (str == null || str.length() > 262144 || str2 == null) {
            return null;
        }
        if (!AxsJAY.uzCIH().gGvvIC()) {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            byte[] bytes2 = str2.getBytes(charset);
            byte[] bytes3 = (bytes.length + ContainerUtils.FIELD_DELIMITER).getBytes(charset);
            byte[] bArr = new byte[bytes.length + bytes3.length];
            int length = bytes2.length;
            int length2 = bytes3.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length2) {
                int i6 = i4 + 1;
                bArr[i5] = (byte) ((bytes2[i4] & 10) ^ bytes3[i3]);
                i4 = i6 >= length ? 0 : i6;
                i3++;
                if ((dnY ^ 5346) != 0) {
                    do {
                        int i7 = dnY;
                        i = i7 + 78;
                        if (i != 34) {
                            if (i == 168) {
                                dnY = i7 + i7 + i7;
                            } else if (i == 319) {
                                do {
                                    dnY = ((dnY ^ 4488) >> 21) + i7;
                                } while (RcO > 8236);
                                while (true) {
                                    int i8 = RcO;
                                    int i9 = i8 + 247;
                                    if (i9 != 97) {
                                        if (i9 == 172) {
                                            RcO = (i8 + i8) ^ 2039;
                                        }
                                    }
                                    RcO = ((RcO + i8) * 43) ^ 2718;
                                }
                            }
                        }
                        dnY = (dnY + i7) >> 9;
                        if ((RcO ^ 8237) != 0) {
                            while (true) {
                                int i10 = RcO;
                                int i11 = i10 + 260;
                                if (i11 == 74) {
                                    while (true) {
                                        RcO = ((RcO + i10) + i10) >> 91;
                                    }
                                } else if (i11 == 250) {
                                    while (true) {
                                        RcO = (RcO >> 68) * 109;
                                    }
                                } else if (i11 != 369) {
                                    if (i11 == 511) {
                                        RcO = ((RcO >> 24) % 51) * 44;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                RcO = ((RcO % 114) % 71) % 103;
                                RcO = ((RcO >> 24) % 51) * 44;
                            }
                        }
                        dnY = (dnY % 98) % 45;
                    } while (i != 447);
                    dnY = (dnY % 98) % 45;
                }
                i5++;
            }
            int length3 = bytes.length;
            int i12 = 0;
            while (i12 < length3) {
                int i13 = i4 + 1;
                bArr[i5] = (byte) (bytes[i12] ^ (bytes2[i4] & 10));
                i4 = i13 >= length ? 0 : i13;
                i12++;
                if (RcO <= 8236) {
                    while (true) {
                        int i14 = RcO;
                        int i15 = i14 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                        if (i15 == 16) {
                            RcO = ((i14 >> 66) % 26) >> 40;
                        } else if (i15 == 128) {
                            break;
                        }
                    }
                    while (true) {
                        RcO = (RcO % 48) >> 124;
                    }
                } else {
                    i5++;
                }
            }
            return DvMhtu(bArr);
        }
        AxsJAY axsJAYUzCIH = AxsJAY.uzCIH();
        if (dnY > 5345) {
            return axsJAYUzCIH.dxcTrN(str, str2);
        }
        if ((RcO ^ 8237) != 0) {
            while (true) {
                int i16 = RcO;
                int i17 = i16 + 65;
                if (i17 == 73) {
                    while (true) {
                        RcO = ((RcO % 48) ^ 3331) + i16;
                    }
                } else {
                    if (i17 == 267) {
                        RcO = (i16 ^ 5121) * 4292;
                        break;
                    }
                    if (i17 == 310) {
                        break;
                    }
                }
            }
            while (true) {
                RcO = (RcO ^ 2754) >> 122;
            }
        } else {
            while (true) {
                int i18 = dnY;
                int i19 = i18 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                if (i19 != 90) {
                    if (i19 == 177) {
                        i2 = (i18 ^ 2643) * 54;
                        dnY = i2;
                    } else if (i19 == 276) {
                        dnY = ((i18 % 84) >> 41) * 35;
                    }
                }
                i2 = ((dnY ^ 5412) % 25) ^ 1489;
                dnY = i2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long fACtfg(long j, int i) {
        if (i >= 0 && i <= 7) {
            int i2 = i * 8;
            j &= ~(255 << i2);
            try {
                return j | ((255 & ((long) QfgJNx(j))) << i2);
            } catch (Exception e) {
                ORrpqH.uzCIH().seuMaA(e);
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String fObYrO(byte[] bArr) {
        int i;
        int i2;
        int i3;
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i4 = 0;
        while (i4 < bArr.length) {
            byte b = bArr[i4];
            int i5 = i4 * 3;
            char[] cArr2 = DECfsU;
            char c = cArr2[(b & UnsignedBytes.MAX_VALUE) >>> 4];
            if ((dnY ^ 5346) != 0) {
                while (true) {
                    i = dnY;
                    int i6 = i + 52;
                    if (i6 == 25) {
                        break;
                    }
                    if (i6 == 170) {
                        dnY = ((i + i) * 57) ^ 4773;
                        if (RcO <= 8236) {
                            while (true) {
                                i3 = RcO;
                                int i7 = i3 + 39;
                                if (i7 == 7) {
                                    break;
                                }
                                if (i7 == 90) {
                                    RcO = (i3 + i3) >> 198;
                                }
                            }
                            RcO = ((i3 % 35) ^ 1004) + i3;
                        }
                    }
                }
                do {
                    dnY = ((dnY + i) + i) ^ 1212;
                } while ((RcO ^ 8237) == 0);
                while (true) {
                    i2 = RcO;
                    int i8 = i2 + 78;
                    if (i8 == 30) {
                        break;
                    }
                    if (i8 != 228) {
                        if (i8 == 319) {
                            RcO = (i2 ^ 5268) * 86;
                        }
                    }
                    RcO = (RcO ^ 1067) + i2;
                }
                while (true) {
                    RcO = (RcO + i2) * 40;
                }
            } else {
                cArr[i5] = c;
                cArr[i5 + 1] = cArr2[b & Ascii.SI];
                if (i4 < bArr.length - 1) {
                    cArr[i5 + 2] = AbstractJsonLexerKt.COLON;
                }
                i4++;
                if (RcO <= 8236) {
                    while (true) {
                        int i9 = RcO;
                        int i10 = i9 + 65;
                        if (i10 == 40) {
                            while (true) {
                                RcO = (RcO >> 102) % 81;
                            }
                        } else if (i10 != 231) {
                            if (i10 == 385) {
                                RcO = ((i9 ^ 3608) + i9) * 94;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    RcO = (RcO ^ 4266) % 20;
                }
            }
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String flVtFt(byte[] bArr) {
        String strDvMhtu;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (AxsJAY.uzCIH().gGvvIC()) {
            return AxsJAY.uzCIH().flVtFt(bArr);
        }
        MessageDigest messageDigest = zQTubx;
        if (messageDigest == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.reset();
            strDvMhtu = DvMhtu(bArrDigest);
        }
        return strDvMhtu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String fvQaOB(byte[] bArr) {
        String strDvMhtu;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (AxsJAY.uzCIH().gGvvIC()) {
            return AxsJAY.uzCIH().fvQaOB(bArr);
        }
        MessageDigest messageDigest = UKIlvF;
        if (messageDigest == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.reset();
            strDvMhtu = DvMhtu(bArrDigest);
        }
        return strDvMhtu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:59:0x00fd) to fix multi-entry loop: BACK_EDGE: B:58:0x00f7 -> B:59:0x00fd */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        QfgSZK.UPbYzn.RcO = ((QfgSZK.UPbYzn.RcO * 78) + r1) + r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<URI> getUriFromString(List<String> list) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        loop0: while (it.hasNext()) {
            try {
                URI uri = new URI(it.next());
                if (uri.getScheme() != null) {
                    arrayList.add(uri);
                } else {
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bEF^\t]UZ\u0015GPZT]J\u001e[NTW\u0003\u0018") + uri);
                }
            } catch (URISyntaxException e) {
                FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("ppWjDCl{h\bAKOJC\u0007CGX"), (Throwable) e);
                ORrpqH.uzCIH().seuMaA(e);
            }
            if (dnY <= 5345) {
                while (true) {
                    i = dnY;
                    int i3 = i + 65;
                    if (i3 == 45) {
                        dnY = ((i * 17) ^ 4170) + i;
                        if ((RcO ^ 8237) != 0) {
                            while (true) {
                                int i4 = RcO;
                                int i5 = i4 + 130;
                                if (i5 == 81) {
                                    i2 = (i4 + i4) >> 34;
                                    break;
                                }
                                if (i5 == 231) {
                                    RcO = i4 * 1776;
                                } else {
                                    if (i5 == 282) {
                                        i2 = (i4 % 93) >> CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                        break;
                                    }
                                    if (i5 == 445) {
                                        while (true) {
                                            RcO = (RcO >> 36) ^ 4834;
                                        }
                                    }
                                }
                            }
                            RcO = i2;
                        }
                    } else if (i3 == 235) {
                        dnY = ((i + i) >> 32) * 50;
                        if ((RcO ^ 8237) == 0) {
                            continue;
                        }
                    } else {
                        if (i3 == 368) {
                            dnY = ((i % 20) % 28) >> 22;
                            break;
                        }
                        if (i3 == 454) {
                            break;
                        }
                    }
                }
                dnY = ((dnY + i) % 15) >> 64;
                if (RcO <= 8236) {
                    while (true) {
                        int i6 = RcO;
                        int i7 = i6 + 65;
                        if (i7 != 20) {
                            if (i7 == 170) {
                                RcO = (i6 ^ 4229) >> 30;
                                break;
                            }
                            if (i7 != 313) {
                                if (i7 == 475) {
                                    RcO = (i6 * 64) + i6;
                                    break loop0;
                                }
                            } else {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    while (true) {
                        RcO = (RcO * 34) % 32;
                    }
                } else {
                    continue;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String hErYDe(Map<String, Object> map) {
        return hErYDe(map, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String hErYDe(Map<String, Object> map, boolean z) {
        return hErYDe(map, z, 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x0055) to fix multi-entry loop: BACK_EDGE: B:33:0x0055 -> B:34:0x0057 */
    /* JADX DEBUG: Duplicate block (B:74:0x0143) to fix multi-entry loop: BACK_EDGE: B:73:0x013d -> B:74:0x0143 */
    public static String hErYDe(Map<String, Object> map, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        if (i > 262144) {
            if (RcO <= 8236) {
                do {
                    i8 = RcO;
                } while (i8 + 52 != 59);
                while (true) {
                    RcO = ((RcO + i8) >> 100) ^ 4738;
                }
            } else {
                i = 262144;
            }
        }
        if (i > 0) {
            i2 = i;
        } else if (RcO <= 8236) {
            while (true) {
                i7 = RcO;
                int i9 = i7 + 78;
                if (i9 == 50) {
                    while (true) {
                        RcO = ((RcO ^ 1962) * 10) % 57;
                    }
                } else {
                    if (i9 == 186) {
                        RcO = ((i7 ^ 3403) >> 23) ^ 2888;
                        break;
                    }
                    if (i9 == 188) {
                        break;
                    }
                    if (i9 == 359) {
                        RcO = ((i7 ^ 2310) >> 1) * 54;
                    }
                }
            }
            while (true) {
                RcO = ((RcO * 91) ^ 5122) + i7;
            }
        } else {
            i2 = 128;
        }
        StringBuilder sb = new StringBuilder(i2);
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        int length = 1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (i == -1 || length < i) {
                String str = GCXiNH.fsw("13") + next.getKey() + GCXiNH.fsw("?+");
                Object value = next.getValue();
                if (z) {
                    value = flVtFt(String.valueOf(value).getBytes());
                }
                if (!(value instanceof Number)) {
                    value = ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + value + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
                }
                String str2 = str + String.valueOf(value);
                if (i != -1 && str2.length() + length > i) {
                    break;
                }
                sb.append(str2);
                length += str2.length();
                if (dnY <= 5345) {
                    if (RcO <= 8236) {
                        while (true) {
                            i3 = RcO;
                            int i10 = i3 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                            if (i10 != 96) {
                                if (i10 == 266) {
                                    RcO >>= 29;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            RcO = RcO + i3 + i3;
                            RcO >>= 29;
                        }
                    } else {
                        do {
                            i4 = dnY;
                        } while (i4 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 != 5);
                        dnY = ((i4 * 76) + i4) ^ 4302;
                        if (RcO <= 8236) {
                            do {
                                int i11 = RcO;
                                i5 = i11 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                if (i5 != 44) {
                                    if (i5 == 148) {
                                        RcO = ((i11 + i11) % 79) ^ 4045;
                                    }
                                }
                                RcO = RcO + i11 + i11;
                                break;
                            } while (i5 != 154);
                            while (true) {
                                RcO = (RcO >> 27) ^ 4197;
                            }
                        }
                    }
                }
            } else if ((dnY ^ 5346) != 0) {
                do {
                    int i12 = dnY;
                    i6 = i12 + 91;
                    if (i6 == 42) {
                        while (true) {
                            dnY = (dnY + i12) >> 89;
                        }
                    }
                } while (i6 != 93);
                while (true) {
                    dnY = ((dnY ^ 2475) % 51) % 70;
                }
            }
        }
        sb.replace(0, 1, "{").append("}");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:22:0x0047) to fix multi-entry loop: BACK_EDGE: B:21:0x0041 -> B:22:0x0047 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if ((QfgSZK.UPbYzn.RcO ^ 8237) != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        r2 = QfgSZK.UPbYzn.dnY;
        r3 = r2 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        if (r3 == 82) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
    
        if (r3 == 217) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
    
        if (r3 == 331) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
    
        QfgSZK.UPbYzn.dnY = (QfgSZK.UPbYzn.dnY ^ 4372) * com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_AA_EXIST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e0, code lost:
    
        if ((QfgSZK.UPbYzn.RcO ^ 8237) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        r5 = QfgSZK.UPbYzn.RcO;
        r0 = r5 + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        if (r0 == 35) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        if (r0 == 89) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:
    
        if (r0 == 221) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
    
        QfgSZK.UPbYzn.RcO = (QfgSZK.UPbYzn.RcO ^ 3245) >> 49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        QfgSZK.UPbYzn.RcO = (QfgSZK.UPbYzn.RcO >> 61) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0104, code lost:
    
        QfgSZK.UPbYzn.RcO = (QfgSZK.UPbYzn.RcO % 1) >> com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
    
        QfgSZK.UPbYzn.dnY = (r2 >> org.spongycastle.crypto.tls.CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256) % 58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        QfgSZK.UPbYzn.dnY = (r2 * 95) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        if ((QfgSZK.UPbYzn.RcO ^ 8237) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0121, code lost:
    
        r2 = QfgSZK.UPbYzn.RcO;
        r3 = r2 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0127, code lost:
    
        if (r3 == 79) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012b, code lost:
    
        if (r3 == 261) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012f, code lost:
    
        if (r3 == 366) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0133, code lost:
    
        if (r3 == 474) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:
    
        QfgSZK.UPbYzn.RcO = (QfgSZK.UPbYzn.RcO >> 37) % 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013f, code lost:
    
        QfgSZK.UPbYzn.RcO = ((r2 + r2) ^ 1594) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0148, code lost:
    
        QfgSZK.UPbYzn.RcO = (r2 * 60) % 46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0150, code lost:
    
        QfgSZK.UPbYzn.RcO = r2 >> 51;
     */
    /* JADX WARN: Path cross not found for [B:128:?, B:120:?], limit reached: 131 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x013f -> B:48:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0148 -> B:48:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String hErYDe(String... strArr) {
        int i;
        int i2;
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        if ((dnY ^ 5346) == 0) {
            if (length % 2 > 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder(GCXiNH.fsw("f3"));
            int i3 = 0;
            while (i3 < strArr.length - 1) {
                int i4 = i3 + 1;
                if (dTTfOR(strArr[i4])) {
                    if (i3 > 0) {
                        sb.append(GCXiNH.fsw("?=\u0019"));
                    }
                    sb.append(strArr[i3]);
                    sb.append(GCXiNH.fsw("?+\u0019"));
                    sb.append(strArr[i4]);
                }
                i3 += 2;
                if ((dnY ^ 5346) == 0) {
                }
            }
            sb.append(GCXiNH.fsw("?l"));
            return sb.toString();
        }
        while (true) {
            int i5 = dnY;
            int i6 = i5 + 91;
            if (i6 != 62) {
                if (i6 != 86) {
                    continue;
                } else {
                    dnY = ((i5 >> 62) % 94) % 83;
                    if (RcO <= 8236) {
                        do {
                            i = RcO;
                            i2 = i + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                            if (i2 != 2) {
                                if (i2 == 136) {
                                    RcO = (i >> 42) * 40;
                                }
                            }
                            while (true) {
                                RcO = (RcO >> 95) + i + i;
                            }
                        } while (i2 != 255);
                        while (true) {
                            RcO = (RcO * 10) + i;
                        }
                    }
                }
            }
            dnY = ((dnY ^ 1233) % WalletImportError.ERROR_CODE_AA_CREATE_KEY) >> 13;
            if ((RcO ^ 8237) != 0) {
                while (true) {
                    int i7 = RcO;
                    int i8 = i7 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                    if (i8 == 72) {
                        RcO = (i7 >> 43) % 52;
                    } else if (i8 != 210) {
                    }
                    RcO = (RcO % 71) % 109;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String hUfVAv(String str) {
        if (iSpHlg(str)) {
            return null;
        }
        if (AxsJAY.uzCIH().gGvvIC()) {
            return AxsJAY.uzCIH().hUfVAv(str);
        }
        try {
            return URLEncoder.encode(str, GCXiNH.fsw("HE}!\u0013"));
        } catch (UnsupportedEncodingException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`NU!k~D\u0002FDJGC_[S"), (Throwable) e);
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:18:0x0030) to fix multi-entry loop: BACK_EDGE: B:17:0x0027 -> B:18:0x0030 */
    /* JADX DEBUG: Duplicate block (B:20:0x003f) to fix multi-entry loop: BACK_EDGE: B:20:0x003f -> B:21:0x0041 */
    /* JADX DEBUG: Duplicate block (B:34:0x006e) to fix multi-entry loop: BACK_EDGE: B:33:0x0068 -> B:34:0x006e */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        QfgSZK.UPbYzn.RcO = (QfgSZK.UPbYzn.RcO + r1) >> 34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean iSpHlg(String str) {
        int i;
        int i2;
        int i3;
        if (str != null && !str.isEmpty()) {
            return false;
        }
        int i4 = RcO ^ 8237;
        if (i4 == 0) {
            if (dnY <= 5345) {
                if (i4 != 0) {
                    do {
                        i = RcO;
                        i2 = i + 52;
                        if (i2 != 3) {
                            if (i2 == 194) {
                                RcO = ((RcO >> 1) * 66) % 46;
                            }
                        }
                        while (true) {
                            RcO ^= 1393;
                            RcO = ((RcO >> 1) * 66) % 46;
                        }
                    } while (i2 != 221);
                    RcO = ((i * 69) + i) >> 69;
                }
                while (true) {
                    int i5 = dnY;
                    int i6 = i5 + 39;
                    if (i6 == 83) {
                        dnY = ((i5 ^ 4711) >> 13) ^ 5138;
                        if (RcO <= 8236) {
                            while (true) {
                                int i7 = RcO;
                                int i8 = i7 + 91;
                                if (i8 != 48) {
                                    if (i8 == 201) {
                                        RcO = ((i7 % 115) * 99) >> 61;
                                    } else if (i8 == 360) {
                                        break;
                                    }
                                }
                                RcO = ((RcO >> 74) * 66) >> 109;
                            }
                            while (true) {
                                RcO = (RcO >> 70) ^ 3691;
                            }
                        }
                    } else if (i6 == 86) {
                        if (RcO <= 8236) {
                            while (true) {
                                int i9 = RcO;
                                int i10 = i9 + 104;
                                if (i10 == 35) {
                                    RcO = (i9 % WalletImportError.ERROR_CODE_AA_CREATE_KEY) >> 66;
                                    break;
                                }
                                if (i10 == 225) {
                                    break;
                                }
                            }
                            RcO = (RcO >> 114) * 2832;
                        }
                        dnY = ((i5 >> 100) * 122) >> 103;
                    } else if (i6 == 198) {
                        break;
                    }
                }
                while (true) {
                    dnY = (dnY * 748) % 26;
                }
            }
            return true;
        }
        while (true) {
            i3 = RcO;
            int i11 = i3 + 39;
            if (i11 == 33) {
                RcO = ((i3 ^ 4812) % 14) * 85;
                break;
            }
            if (i11 != 114) {
                if (i11 == 123) {
                    break;
                }
                if (i11 == 274) {
                    RcO = (RcO >> 124) * 67;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            RcO = ((RcO + i3) * 23) >> 46;
            RcO = (RcO >> 124) * 67;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String iTrKTi(String str) {
        return str != null ? str.toLowerCase(Locale.US) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:25:0x0069) to fix multi-entry loop: BACK_EDGE: B:24:0x0062 -> B:25:0x0069 */
    /* JADX DEBUG: Duplicate block (B:27:0x0071) to fix multi-entry loop: BACK_EDGE: B:27:0x0071 -> B:28:0x0073 */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        QfgSZK.UPbYzn.dnY = ((QfgSZK.UPbYzn.dnY >> 115) + r3) >> 69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String ikEgkI(String str) {
        int i;
        if (iSpHlg(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bytes[i2];
            if (b < 32) {
                sb.append(GCXiNH.fsw("Ai"));
                sb.append(String.format(GCXiNH.fsw("8!\tt"), Byte.valueOf(b)));
            } else {
                sb.append((char) b);
            }
            i2++;
            if (dnY <= 5345) {
                while (true) {
                    i = dnY;
                    int i3 = i + 65;
                    if (i3 == 54) {
                        dnY = ((i % 57) % 55) + i;
                        break;
                    }
                    if (i3 != 78) {
                        if (i3 == 165) {
                            dnY = (i * 39) % 121;
                            break;
                        }
                        if (i3 == 254) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    dnY = ((dnY + i) + i) >> 1;
                }
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int iluEmO(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (str == null) {
            return 0;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (RcO > 8236) {
            int i8 = 0;
            while (i7 < length) {
                int i9 = RcO;
                if (i9 <= 8236) {
                    while (true) {
                        int i10 = RcO;
                        if (i10 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 == 90) {
                            RcO = ((i10 % 101) % 6) >> 87;
                        }
                    }
                } else {
                    i8 += bytes[i7];
                    if (i9 <= 8236) {
                        while (true) {
                            int i11 = RcO;
                            int i12 = i11 + 39;
                            if (i12 == 83) {
                                while (true) {
                                    RcO = (RcO + i11 + i11) * 8;
                                }
                            } else if (i12 == 107) {
                                RcO = i11 * 7504;
                            } else if (i12 == 248) {
                                RcO = (i11 ^ 2140) * WebSocketProtocol.PAYLOAD_SHORT;
                                break;
                            }
                        }
                    }
                    i7++;
                    int i13 = dnY;
                    if ((RcO ^ 8237) != 0) {
                        do {
                            i5 = RcO;
                        } while (i5 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 57);
                        RcO = (i5 + i5) % 115;
                    }
                    if (i13 <= 5345) {
                        if ((RcO ^ 8237) != 0) {
                            do {
                                i4 = RcO;
                            } while (i4 + 52 != 45);
                            RcO = ((i4 ^ 5459) >> 82) * 64;
                        }
                        while (true) {
                            int i14 = dnY;
                            int i15 = i14 + 26;
                            if (i15 != 24) {
                                if (i15 == 106) {
                                    dnY = (i14 * 18) ^ 5368;
                                    break;
                                }
                                if (i15 == 116) {
                                    dnY = ((i14 + i14) * 34) + i14;
                                    if ((RcO ^ 8237) != 0) {
                                        while (RcO + 117 != 77) {
                                        }
                                        while (true) {
                                            RcO = (RcO >> 57) % 17;
                                        }
                                    }
                                } else if (i15 == 265) {
                                    if (RcO <= 8236) {
                                        do {
                                            i = RcO;
                                            i2 = i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                            if (i2 == 55) {
                                                i3 = (i ^ 5252) * 32;
                                            } else if (i2 == 185) {
                                                i3 = i >> 203;
                                            }
                                            RcO = i3;
                                            break;
                                        } while (i2 != 238);
                                        RcO = ((i + i) ^ 3192) + i;
                                    }
                                    dnY = ((i14 * 74) >> 43) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                                }
                            }
                            dnY = (dnY ^ 5331) >> 3;
                        }
                    }
                }
            }
            return i8;
        }
        while (true) {
            i6 = RcO;
            int i16 = i6 + 26;
            if (i16 == 93) {
                RcO = ((i6 * 40) ^ 3235) + i6;
            } else {
                if (i16 == 287) {
                    break;
                }
                if (i16 == 470) {
                    RcO = ((i6 ^ 4624) + i6) * 39;
                } else if (i16 != 654) {
                }
            }
            RcO = (RcO + i6) >> 90;
        }
        while (true) {
            RcO = ((RcO * 27) >> 55) + i6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:26:0x004e) to fix multi-entry loop: BACK_EDGE: B:26:0x004e -> B:27:0x0050 */
    /* JADX DEBUG: Duplicate block (B:30:0x0063) to fix multi-entry loop: BACK_EDGE: B:29:0x005b -> B:30:0x0063 */
    /* JADX DEBUG: Duplicate block (B:60:0x00cf) to fix multi-entry loop: BACK_EDGE: B:60:0x00cf -> B:61:0x00d1 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.util.List<java.lang.String> rsEnD(java.lang.String r3, java.lang.String r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            int r1 = r3.indexOf(r4)
            r2 = -1
            if (r1 != r2) goto L16
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L15
            r0.add(r3)
        L15:
            return r0
        L16:
            r2 = 1
            if (r1 < r2) goto L21
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r1)
            r0.add(r2)
        L21:
            int r2 = r4.length()
            int r1 = r1 + r2
            java.lang.String r3 = r3.substring(r1)
            int r1 = QfgSZK.UPbYzn.dnY
            r2 = 5345(0x14e1, float:7.49E-42)
            if (r1 > r2) goto L5
            int r3 = QfgSZK.UPbYzn.RcO
            r3 = r3 ^ 8237(0x202d, float:1.1542E-41)
            if (r3 == 0) goto L66
        L36:
            int r3 = QfgSZK.UPbYzn.RcO
            int r4 = r3 + 65
            r0 = 68
            if (r4 == r0) goto L5b
            r1 = 148(0x94, float:2.07E-43)
            if (r4 == r1) goto L58
            r0 = 319(0x13f, float:4.47E-43)
            if (r4 == r0) goto L4b
            r0 = 445(0x1bd, float:6.24E-43)
            if (r4 == r0) goto L50
            goto L36
        L4b:
            int r4 = r3 * 72
            int r4 = r4 + r3
        L4e:
            QfgSZK.UPbYzn.RcO = r4
        L50:
            int r4 = QfgSZK.UPbYzn.RcO
            int r4 = r4 + r3
            int r4 = r4 * 52
            int r4 = r4 % 86
            goto L4e
        L58:
            int r3 = r3 + r3
            int r3 = r3 >> r0
            goto L63
        L5b:
            int r3 = QfgSZK.UPbYzn.RcO
            int r3 = r3 % 32
            r3 = r3 ^ 5139(0x1413, float:7.201E-42)
            int r3 = r3 >> 77
        L63:
            QfgSZK.UPbYzn.RcO = r3
            goto L5b
        L66:
            int r3 = QfgSZK.UPbYzn.dnY
            int r4 = r3 + 52
            r0 = 91
            if (r4 == r0) goto Le0
            r1 = 106(0x6a, float:1.49E-43)
            r2 = 8236(0x202c, float:1.1541E-41)
            if (r4 == r1) goto La2
            r1 = 160(0xa0, float:2.24E-43)
            if (r4 == r1) goto L79
            goto L66
        L79:
            int r4 = r3 + r3
            int r4 = r4 * 17
            QfgSZK.UPbYzn.dnY = r4
            int r4 = QfgSZK.UPbYzn.RcO
            if (r4 > r2) goto La2
        L83:
            int r3 = QfgSZK.UPbYzn.RcO
            int r4 = r3 + 91
            r0 = 58
            if (r4 == r0) goto L9b
            r3 = 180(0xb4, float:2.52E-43)
            if (r4 == r3) goto L90
            goto L83
        L90:
            int r3 = QfgSZK.UPbYzn.RcO
            int r3 = r3 % 8
            int r3 = r3 % 10
            int r3 = r3 >> 113
            QfgSZK.UPbYzn.RcO = r3
            goto L90
        L9b:
            int r3 = r3 >> 85
            int r3 = r3 % 94
            QfgSZK.UPbYzn.RcO = r3
            goto L83
        La2:
            int r4 = QfgSZK.UPbYzn.dnY
            int r4 = r4 + r3
            int r4 = r4 % 20
            QfgSZK.UPbYzn.dnY = r4
            int r4 = QfgSZK.UPbYzn.RcO
            if (r4 > r2) goto Le0
        Lad:
            int r4 = QfgSZK.UPbYzn.RcO
            int r3 = r4 + 78
            r1 = 48
            if (r3 == r1) goto Lca
            r1 = 197(0xc5, float:2.76E-43)
            if (r3 == r1) goto Lda
            r1 = 285(0x11d, float:4.0E-43)
            if (r3 == r1) goto Ld1
            r4 = 325(0x145, float:4.55E-43)
            if (r3 == r4) goto Lc2
            goto Lad
        Lc2:
            int r3 = QfgSZK.UPbYzn.RcO
            r3 = r3 ^ 3818(0xeea, float:5.35E-42)
            int r3 = r3 >> r0
            QfgSZK.UPbYzn.RcO = r3
            goto Lc2
        Lca:
            r3 = r4 ^ 2415(0x96f, float:3.384E-42)
            int r3 = r3 >> 100
            int r3 = r3 + r4
        Lcf:
            QfgSZK.UPbYzn.RcO = r3
        Ld1:
            int r3 = QfgSZK.UPbYzn.RcO
            int r3 = r3 + r4
            int r3 = r3 >> 79
            r3 = r3 ^ 1464(0x5b8, float:2.052E-42)
            QfgSZK.UPbYzn.RcO = r3
        Lda:
            int r3 = QfgSZK.UPbYzn.RcO
            int r3 = r3 + r4
            r3 = r3 ^ 5195(0x144b, float:7.28E-42)
            goto Lcf
        Le0:
            int r4 = QfgSZK.UPbYzn.dnY
            int r4 = r4 + r3
            int r3 = r4 >> 37
            QfgSZK.UPbYzn.dnY = r3
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UPbYzn.rsEnD(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (QfgSZK.UPbYzn.RcO <= 8236) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if ((QfgSZK.UPbYzn.RcO ^ 8237) != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        r8 = QfgSZK.UPbYzn.RcO;
        r0 = r8 + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (r0 == 15) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        if (r0 == 50) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
    
        if (r0 == 187) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        QfgSZK.UPbYzn.RcO = ((r8 + r8) + r8) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        r8 = (r8 % 20) ^ 1460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
    
        r8 = (r8 ^ 5179) * 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c3, code lost:
    
        QfgSZK.UPbYzn.RcO = r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00a0 -> B:61:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String sanitizeSessionIdIgnoreCase(String str) {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length() && i4 < 128) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == '/' || cCharAt == '-'))) {
                sb.append(cCharAt);
                i4++;
            }
            i3++;
            if (dnY <= 5345) {
                if (RcO <= 8236) {
                    do {
                        int i5 = RcO;
                        i2 = i5 + 104;
                        if (i2 == 59) {
                            RcO = ((i5 % 12) ^ 4885) + i5;
                        } else if (i2 != 105) {
                        }
                        RcO = (RcO + i5) * 5994;
                        break;
                    } while (i2 != 110);
                    while (true) {
                        RcO = ((RcO * 42) ^ 2775) % 7;
                    }
                } else {
                    while (true) {
                        i = dnY;
                        int i6 = i + 91;
                        if (i6 == 80) {
                            break;
                        }
                        if (i6 == 147) {
                            dnY = ((i >> 88) ^ 3343) + i;
                        } else if (i6 == 295) {
                            break;
                        }
                    }
                    dnY = ((dnY * 59) + i) * 115;
                    if (RcO <= 8236) {
                        while (true) {
                            int i7 = RcO;
                            int i8 = i7 + 117;
                            if (i8 == 45) {
                                RcO = (i7 % 124) ^ 1499;
                            } else if (i8 == 106) {
                                while (true) {
                                    RcO = (RcO % 97) + i7;
                                }
                            } else if (i8 == 224) {
                                while (true) {
                                    RcO = (RcO ^ 2773) + i7;
                                }
                            }
                        }
                    }
                    dnY = ((dnY + i) >> 35) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                }
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0031) to fix multi-entry loop: BACK_EDGE: B:15:0x002b -> B:16:0x0031 */
    public static void validateAndPutInMap(String str, String str2, Map<String, String> map) {
        int i;
        if (dTTfOR(str)) {
            if ((RcO ^ 8237) != 0) {
                while (true) {
                    i = RcO;
                    int i2 = i + 26;
                    if (i2 != 40) {
                        if (i2 == 230) {
                            RcO = (i * 97) % 16;
                            break;
                        } else if (i2 == 373) {
                            RcO = ((i >> 62) % 122) ^ 2843;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    RcO = (RcO % 83) + i + i;
                }
            }
            map.put(str2, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:29:0x0063) to fix multi-entry loop: BACK_EDGE: B:28:0x005d -> B:29:0x0063 */
    /* JADX DEBUG: Duplicate block (B:44:0x00a0) to fix multi-entry loop: BACK_EDGE: B:43:0x0096 -> B:44:0x00a0 */
    /* JADX DEBUG: Duplicate block (B:61:0x00e0) to fix multi-entry loop: BACK_EDGE: B:61:0x00e0 -> B:62:0x00e2 */
    public static boolean validateSHA256(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (dTTfOR(str)) {
            Pattern pattern = QYtakl;
            if ((RcO ^ 8237) != 0) {
                while (true) {
                    int i7 = RcO;
                    int i8 = i7 + 26;
                    if (i8 == 18) {
                        RcO = ((i7 ^ 3709) + i7) % 68;
                    } else if (i8 != 145) {
                        if (i8 == 234) {
                            RcO = i7 >> 46;
                            break;
                        }
                        if (i8 == 419) {
                            while (true) {
                                RcO = (RcO ^ 1745) * 57;
                            }
                        }
                    }
                    RcO = (RcO + i7) >> 115;
                }
            }
            if ((dnY ^ 5346) != 0) {
                if ((RcO ^ 8237) != 0) {
                    while (true) {
                        int i9 = RcO;
                        int i10 = i9 + 130;
                        if (i10 != 94) {
                            if (i10 == 195) {
                                RcO = (i9 * 1739) >> 18;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        RcO = (RcO * 98) >> 119;
                    }
                } else {
                    while (dnY + 39 != 2) {
                    }
                    do {
                        dnY = (dnY ^ 4692) % 95;
                    } while (RcO > 8236);
                    do {
                        int i11 = RcO;
                        i6 = i11 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                        if (i6 != 90) {
                            if (i6 == 239) {
                                RcO = (RcO + i11) * 1665;
                            }
                        }
                        while (true) {
                            RcO = ((RcO ^ 4205) % 36) % 119;
                            RcO = (RcO + i11) * 1665;
                        }
                    } while (i6 != 283);
                    while (true) {
                        RcO = (RcO * 13) ^ 1568;
                    }
                }
            } else if (pattern.matcher(str).find()) {
                if ((dnY ^ 5346) == 0) {
                    return true;
                }
                if ((RcO ^ 8237) != 0) {
                    do {
                        i4 = RcO;
                        i5 = i4 + 52;
                        if (i5 != 70) {
                            if (i5 == 121) {
                                RcO = (i4 >> 83) * 56;
                            } else if (i5 != 234) {
                            }
                            while (true) {
                                RcO = ((RcO * 122) % 21) ^ 3444;
                            }
                        } else {
                            while (true) {
                                RcO = (RcO * 12) >> 1;
                            }
                        }
                    } while (i5 != 364);
                    while (true) {
                        RcO = ((RcO * 117) + i4) ^ 2407;
                    }
                } else {
                    while (true) {
                        int i12 = dnY;
                        int i13 = i12 + 26;
                        if (i13 != 17) {
                            if (i13 == 166) {
                                i3 = ((i12 >> 101) + i12) >> 119;
                            } else if (i13 == 324) {
                                while (true) {
                                    dnY = (dnY >> 125) + i12;
                                }
                            } else if (i13 == 378) {
                                i3 = (i12 >> 106) * 32;
                            }
                            dnY = i3;
                        } else {
                            dnY = i12 * 65;
                            if ((RcO ^ 8237) == 0) {
                                return true;
                            }
                            do {
                                i = RcO;
                                i2 = i + 39;
                                if (i2 == 11) {
                                    while (true) {
                                        RcO = (RcO ^ 4274) * 68;
                                    }
                                }
                            } while (i2 != 18);
                            while (true) {
                                RcO = (RcO * 15) + i;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String zUtmHU(List<String> list, String str) {
        return zUtmHU(list, str, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String zUtmHU(List<String> list, String str, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (!str2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(str2);
            }
            if ((RcO ^ 8237) != 0) {
                do {
                    i = RcO;
                } while (i + 52 != 74);
                RcO = ((i >> 81) + i) ^ 3074;
            }
        }
        if (z && sb.length() > 0) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:44:0x00a9) to fix multi-entry loop: BACK_EDGE: B:44:0x00a9 -> B:45:0x00b0 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static byte[] zeUJxr(java.lang.String r6) throws java.lang.IllegalArgumentException {
        /*
            int r0 = r6.length()
            int r0 = r0 / 2
            int r1 = r0 * 2
            int r2 = r6.length()
            if (r1 != r2) goto L12e
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L12d
            int r3 = r2 * 2
            char r4 = r6.charAt(r3)
            byte r4 = OsDdEf(r4)
            int r3 = r3 + 1
            char r3 = r6.charAt(r3)
            byte r3 = OsDdEf(r3)
            int r4 = r4 << 4
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            int r3 = QfgSZK.UPbYzn.dnY
            r4 = 5345(0x14e1, float:7.49E-42)
            if (r3 > r4) goto L11
            int r3 = QfgSZK.UPbYzn.RcO
            r3 = r3 ^ 8237(0x202d, float:1.1542E-41)
            if (r3 == 0) goto L6c
        L3b:
            int r3 = QfgSZK.UPbYzn.RcO
            int r4 = r3 + 52
            r5 = 91
            if (r4 == r5) goto L55
            r5 = 139(0x8b, float:1.95E-43)
            if (r4 == r5) goto L63
            r5 = 230(0xe6, float:3.22E-43)
            if (r4 == r5) goto L50
            r5 = 298(0x12a, float:4.18E-43)
            if (r4 == r5) goto L5d
            goto L3b
        L50:
            int r3 = r3 >> 43
            int r3 = r3 % 58
            goto L6a
        L55:
            int r4 = r3 % 79
            r4 = r4 ^ 4178(0x1052, float:5.855E-42)
            int r4 = r4 * 62
            QfgSZK.UPbYzn.RcO = r4
        L5d:
            int r4 = QfgSZK.UPbYzn.RcO
            r4 = r4 ^ 7882(0x1eca, float:1.1045E-41)
            QfgSZK.UPbYzn.RcO = r4
        L63:
            int r4 = QfgSZK.UPbYzn.RcO
            int r4 = r4 + r3
            int r3 = r4 >> 86
            int r3 = r3 % 43
        L6a:
            QfgSZK.UPbYzn.RcO = r3
        L6c:
            int r3 = QfgSZK.UPbYzn.dnY
            int r4 = r3 + 39
            r5 = 82
            if (r4 == r5) goto L101
            r5 = 95
            if (r4 == r5) goto Lbb
            r5 = 166(0xa6, float:2.33E-43)
            if (r4 == r5) goto L7d
            goto L6c
        L7d:
            r4 = r3 ^ 2566(0xa06, float:3.596E-42)
            int r4 = r4 + r3
            QfgSZK.UPbYzn.dnY = r4
            int r3 = QfgSZK.UPbYzn.RcO
            r4 = 8236(0x202c, float:1.1541E-41)
            if (r3 > r4) goto L11
        L88:
            int r3 = QfgSZK.UPbYzn.RcO
            int r6 = r3 + 39
            r0 = 35
            if (r6 == r0) goto La1
            r0 = 142(0x8e, float:1.99E-43)
            if (r6 == r0) goto L9d
            r0 = 186(0xba, float:2.6E-43)
            if (r6 == r0) goto La9
            r0 = 220(0xdc, float:3.08E-43)
            if (r6 == r0) goto Lb0
            goto L88
        L9d:
            int r6 = r3 * 32
            int r6 = r6 + r3
            goto Lb8
        La1:
            int r6 = QfgSZK.UPbYzn.RcO
            int r6 = r6 + r3
            int r6 = r6 + r3
            int r6 = r6 % 98
            QfgSZK.UPbYzn.RcO = r6
        La9:
            int r6 = QfgSZK.UPbYzn.RcO
            int r6 = r6 + r3
            r6 = r6 ^ 7363(0x1cc3, float:1.0318E-41)
            QfgSZK.UPbYzn.RcO = r6
        Lb0:
            int r6 = QfgSZK.UPbYzn.RcO
            int r6 = r6 % 83
            r6 = r6 ^ 1876(0x754, float:2.629E-42)
            int r6 = r6 % 34
        Lb8:
            QfgSZK.UPbYzn.RcO = r6
            goto La1
        Lbb:
            int r6 = QfgSZK.UPbYzn.dnY
            r6 = r6 ^ 2240(0x8c0, float:3.139E-42)
            int r6 = r6 * 123
            r6 = r6 ^ 3823(0xeef, float:5.357E-42)
            QfgSZK.UPbYzn.dnY = r6
            int r6 = QfgSZK.UPbYzn.RcO
            r6 = r6 ^ 8237(0x202d, float:1.1542E-41)
            if (r6 == 0) goto Lbb
        Lcb:
            int r6 = QfgSZK.UPbYzn.RcO
            int r0 = r6 + 78
            r1 = 49
            if (r0 == r1) goto Lfa
            r1 = 209(0xd1, float:2.93E-43)
            if (r0 == r1) goto Lf2
            r1 = 279(0x117, float:3.91E-43)
            if (r0 == r1) goto Le9
            r6 = 464(0x1d0, float:6.5E-43)
            if (r0 == r6) goto Le0
            goto Lcb
        Le0:
            int r6 = QfgSZK.UPbYzn.RcO
            r6 = r6 ^ 4688(0x1250, float:6.569E-42)
            int r6 = r6 % 68
            QfgSZK.UPbYzn.RcO = r6
            goto Le0
        Le9:
            int r6 = r6 % 109
            int r6 = r6 % 27
            int r6 = r6 * 40
            QfgSZK.UPbYzn.RcO = r6
            goto Lbb
        Lf2:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 + r6
            int r0 = r0 * 84
            QfgSZK.UPbYzn.RcO = r0
            goto Lf2
        Lfa:
            r6 = r6 ^ 2539(0x9eb, float:3.558E-42)
            int r6 = r6 * 70
            QfgSZK.UPbYzn.RcO = r6
            goto Lcb
        L101:
            int r6 = QfgSZK.UPbYzn.dnY
            int r6 = r6 + r3
            r6 = r6 ^ 4880(0x1310, float:6.838E-42)
            int r6 = r6 + r3
            QfgSZK.UPbYzn.dnY = r6
            int r6 = QfgSZK.UPbYzn.RcO
            r6 = r6 ^ 8237(0x202d, float:1.1542E-41)
            if (r6 == 0) goto L101
        L10f:
            int r6 = QfgSZK.UPbYzn.RcO
            int r0 = r6 + 65
            if (r0 == r5) goto L123
            r6 = 241(0xf1, float:3.38E-43)
            if (r0 == r6) goto L11a
            goto L10f
        L11a:
            int r6 = QfgSZK.UPbYzn.RcO
            r6 = r6 ^ 2284(0x8ec, float:3.2E-42)
            int r6 = r6 >> 98
            QfgSZK.UPbYzn.RcO = r6
            goto L11a
        L123:
            int r0 = QfgSZK.UPbYzn.RcO
            int r0 = r0 % 1
            int r0 = r0 + r6
            r0 = r0 ^ 5319(0x14c7, float:7.454E-42)
            QfgSZK.UPbYzn.RcO = r0
            goto L123
        L12d:
            return r1
        L12e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\""
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "?1SmX\u0011`p,GFG\nG]JTPF\u0013]W\u0010LV\\NZYM]EU"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r0.append(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UPbYzn.zeUJxr(java.lang.String):byte[]");
    }
}
