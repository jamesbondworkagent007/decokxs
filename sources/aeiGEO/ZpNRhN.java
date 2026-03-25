package aeiGEO;

import aeiGEO.GVpNrs;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public class ZpNRhN {
    private static String DlIaRS = null;
    private static final boolean RqVLPa;
    static final int SHA256_HASH_HEX_LENGTH = 64;
    public static int UNI;
    public static int fMg;
    private final STbtMW Ogueen;
    private final int iMQkBc;
    private byte[][] sEupnh;
    private byte[][] zBwwme;
    private final Map<String, String> hTAumt = new HashMap();
    private final TMXProfilingConnectionsInterface.TMXHttpResponseCode DkckDm = new TMXProfilingConnectionsInterface.TMXHttpResponseCode(-2);
    private URL TpLtq = null;
    private HttpsURLConnection QLLKwQ = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        TMXProfilingConnections.OQs = 6659;
        GVpNrs.OTr = 9103;
        UNI = 1037;
        fMg = 2129;
        TMXProfilingConnections.OHr = 2270;
        GVpNrs.dqk = 9094;
        DlIaRS = GVpNrs.hfdhUn(ZpNRhN.class);
        if (UNI > 1036) {
            RqVLPa = false;
        } else {
            while (UNI + 13 != 52) {
            }
            while (true) {
                UNI >>= 102;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZpNRhN(byte[][] bArr, byte[][] bArr2, int i) {
        this.sEupnh = bArr;
        this.zBwwme = bArr2;
        this.iMQkBc = i;
        this.Ogueen = RqVLPa ? new STbtMW() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:13:0x0033) to fix multi-entry loop: BACK_EDGE: B:12:0x0029 -> B:13:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0101 A[EDGE_INSN: B:102:0x0101->B:127:? BREAK  A[LOOP:4: B:38:0x009e->B:103:0x009e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int QAQCdZ(Certificate certificate) {
        String strDvMhtu;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArrDHEdFZ = UPbYzn.DHEdFZ(certificate.getPublicKey().getEncoded());
        if (UNI <= 1036) {
            do {
                i4 = UNI;
                i5 = i4 + 13;
                if (i5 != 17) {
                    if (i5 == 72) {
                        UNI = ((UNI >> 118) ^ 3953) % 66;
                    }
                }
                while (true) {
                    UNI = ((UNI % 55) ^ 4618) % 61;
                    UNI = ((UNI >> 118) ^ 3953) % 66;
                }
            } while (i5 != 117);
            UNI = (i4 * 4505) + i4;
        }
        if (bArrDHEdFZ != null) {
            if ((UNI ^ 1037) != 0) {
                while (true) {
                    int i6 = UNI;
                    int i7 = i6 + 130;
                    if (i7 == 3) {
                        break;
                    }
                    if (i7 == 75) {
                        UNI = (i6 ^ 130) >> 21;
                    } else if (i7 != 140) {
                    }
                    UNI = ((UNI * 58) ^ 3691) >> 9;
                }
                while (true) {
                    UNI = (UNI % 55) * 81;
                }
            } else if (gFTCsA(this.zBwwme, bArrDHEdFZ)) {
                return 200;
            }
        }
        String str = DlIaRS;
        StringBuilder sb = new StringBuilder();
        sb.append(TMXProfilingConnections.fsw("T\u007fMmGXe>|]@OCJ\bLSL\u0014[SBX\u0003\u001eUSHN\u0019QD\u0006pwjlf "));
        if (bArrDHEdFZ == null) {
            strDvMhtu = TMXProfilingConnections.fsw("sdW`");
            if (fMg <= 2128) {
                if (UNI > 1036) {
                    while (true) {
                        int i8 = fMg;
                        int i9 = i8 + 39;
                        if (i9 != 20) {
                            if (i9 != 144) {
                                if (i9 == 298) {
                                    fMg = ((i8 + i8) >> 38) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                                } else if (i9 != 431) {
                                    continue;
                                } else {
                                    fMg = ((fMg + i8) >> 44) + i8;
                                    if (UNI > 1036) {
                                        break;
                                    }
                                }
                            }
                            fMg ^= 3594;
                            if (UNI <= 1036) {
                                while (true) {
                                    i2 = UNI;
                                    int i10 = i2 + 117;
                                    if (i10 == 62) {
                                        i3 = ((i2 + i2) + i2) % 62;
                                    } else if (i10 == 260) {
                                        UNI = ((UNI >> 31) + i2) * 86;
                                    } else if (i10 == 271) {
                                        i3 = (i2 * 48) + i2;
                                    } else if (i10 == 276) {
                                        break;
                                    }
                                    UNI = i3;
                                    UNI = ((UNI >> 31) + i2) * 86;
                                }
                                UNI = (i2 * 80) + i2 + i2;
                            }
                            fMg = ((fMg + i8) >> 44) + i8;
                            if (UNI > 1036) {
                            }
                        } else {
                            while (true) {
                                fMg = (fMg >> 32) % 44;
                                if ((UNI ^ 1037) != 0) {
                                    do {
                                        i = UNI;
                                    } while (i + 78 != 4);
                                    UNI = (i % 30) % 85;
                                }
                            }
                        }
                    }
                }
                while (true) {
                    int i11 = UNI;
                    int i12 = i11 + 52;
                    if (i12 == 12) {
                        while (true) {
                            UNI = (UNI ^ 3542) + i11;
                        }
                    } else if (i12 == 167) {
                        UNI = ((i11 + i11) % 5) + i11;
                    } else if (i12 == 188) {
                        while (true) {
                            UNI = (UNI * 38) >> 213;
                        }
                    }
                }
            }
        } else {
            strDvMhtu = UPbYzn.DvMhtu(bArrDHEdFZ);
        }
        sb.append(strDvMhtu);
        GVpNrs.svhCHd(str, sb.toString());
        return -6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:128:0x01ec) to fix multi-entry loop: BACK_EDGE: B:128:0x01ec -> B:129:0x01ee */
    /* JADX DEBUG: Duplicate block (B:175:0x029a) to fix multi-entry loop: BACK_EDGE: B:174:0x0295 -> B:175:0x029a */
    /* JADX DEBUG: Duplicate block (B:213:0x0327) to fix multi-entry loop: BACK_EDGE: B:212:0x031d -> B:213:0x0327 */
    /* JADX DEBUG: Duplicate block (B:261:0x03d2) to fix multi-entry loop: BACK_EDGE: B:261:0x03d2 -> B:262:0x03d5 */
    /* JADX DEBUG: Duplicate block (B:318:0x04a4) to fix multi-entry loop: BACK_EDGE: B:318:0x04a4 -> B:319:0x04a6 */
    /* JADX DEBUG: Duplicate block (B:330:0x04d8) to fix multi-entry loop: BACK_EDGE: B:329:0x04d2 -> B:330:0x04d8 */
    /* JADX WARN: Path cross not found for [B:525:?, B:522:?], limit reached: 542 */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x054b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:237:0x0384 -> B:226:0x035b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x0447 -> B:301:0x0467). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void dhOYXF(java.lang.Exception r14) {
        /*
            r13 = this;
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            r1 = 7
            r2 = 28
            r3 = 59
            r4 = 108(0x6c, float:1.51E-43)
            r5 = 33
            r6 = 104(0x68, float:1.46E-43)
            r7 = 2128(0x850, float:2.982E-42)
            r8 = 1036(0x40c, float:1.452E-42)
            if (r0 == 0) goto L2a7
            java.lang.Throwable r0 = r14.getCause()
            int r9 = aeiGEO.ZpNRhN.UNI
            r10 = 36
            r11 = 26
            if (r9 > r8) goto L3f
        L23:
            int r9 = aeiGEO.ZpNRhN.UNI
            int r12 = r9 + 26
            if (r12 == r10) goto L39
            r9 = 222(0xde, float:3.11E-43)
            if (r12 == r9) goto L2e
            goto L23
        L2e:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 >> 92
            int r14 = r14 % 122
            int r14 = r14 * 4
            aeiGEO.ZpNRhN.UNI = r14
            goto L2e
        L39:
            r9 = r9 ^ 1589(0x635, float:2.227E-42)
            int r9 = r9 * r6
            int r9 = r9 >> r11
            aeiGEO.ZpNRhN.UNI = r9
        L3f:
            int r9 = aeiGEO.ZpNRhN.fMg
            r12 = 2
            if (r9 > r7) goto Ld9
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L4a
            goto Lc7
        L4a:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = aeiGEO.ZpNRhN.UNI
            r1 = r0 ^ 1037(0x40d, float:1.453E-42)
            if (r1 == 0) goto L83
        L52:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 741
            if (r0 == r12) goto L73
            r1 = 71
            if (r0 == r1) goto L6c
            if (r0 == r4) goto L63
            r14 = 303(0x12f, float:4.25E-43)
            if (r0 == r14) goto L7a
            goto L52
        L63:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * 51
            r14 = r14 ^ 34
            aeiGEO.ZpNRhN.UNI = r14
            goto L63
        L6c:
            int r0 = r14 + r14
            int r0 = r0 + r14
            int r0 = r0 % 61
            aeiGEO.ZpNRhN.UNI = r0
        L73:
            int r14 = aeiGEO.ZpNRhN.UNI
            r0 = 227(0xe3, float:3.18E-43)
            int r14 = r14 >> r0
            aeiGEO.ZpNRhN.UNI = r14
        L7a:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 8052(0x1f74, float:1.1283E-41)
            int r14 = r14 % 67
            aeiGEO.ZpNRhN.UNI = r14
            goto L52
        L83:
            int r1 = r14 + 169
            r3 = 96
            if (r1 == r3) goto L96
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 == r0) goto L8e
            goto L4a
        L8e:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r0 = r0 + r14
            int r0 = r0 * 103
            aeiGEO.ZpNRhN.fMg = r0
            goto L8e
        L96:
            if (r0 > r8) goto Lbb
        L98:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r1 = r0 + 780
            if (r1 == r11) goto Lb6
            r3 = 171(0xab, float:2.4E-43)
            if (r1 == r3) goto Lac
            r3 = 319(0x13f, float:4.47E-43)
            if (r1 == r3) goto La7
            goto L98
        La7:
            int r0 = r0 >> 92
            int r0 = r0 * 27
            goto Lb9
        Lac:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * 15
            int r14 = r14 + r0
            int r14 = r14 * 40
            aeiGEO.ZpNRhN.UNI = r14
            goto Lac
        Lb6:
            int r0 = r0 + r0
            int r0 = r0 >> 6
        Lb9:
            aeiGEO.ZpNRhN.UNI = r0
        Lbb:
            int r14 = r14 * 63
            r14 = r14 ^ 3963(0xf7b, float:5.553E-42)
            int r14 = r14 % 42
            aeiGEO.ZpNRhN.fMg = r14
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L4a
        Lc7:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 442
            r1 = 72
            if (r0 == r1) goto Ld0
            goto Lc7
        Ld0:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 + r14
            int r0 = r0 * r2
            r0 = r0 ^ 3908(0xf44, float:5.476E-42)
            aeiGEO.ZpNRhN.UNI = r0
            goto Ld0
        Ld9:
            java.lang.Class<java.security.cert.CertificateNotYetValidException> r9 = java.security.cert.CertificateNotYetValidException.class
            boolean r0 = iFnJKK(r0, r9)
            r9 = 53
            if (r0 == 0) goto L114
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 1037(0x40d, float:1.453E-42)
            if (r0 == 0) goto L109
        Leb:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r14 = r0 + 312
            if (r14 == r9) goto L100
            r0 = 149(0x95, float:2.09E-43)
            if (r14 == r0) goto Lf6
            goto Leb
        Lf6:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 >> 60
            int r14 = r14 * r5
            r14 = r14 ^ 4169(0x1049, float:5.842E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto Lf6
        L100:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1766(0x6e6, float:2.475E-42)
            int r14 = r14 + r0
            int r14 = r14 + r0
            aeiGEO.ZpNRhN.UNI = r14
            goto L100
        L109:
            r0 = -10
            r14.setHttpResponseCode(r0)
            int r14 = aeiGEO.ZpNRhN.fMg
            if (r14 > r7) goto L59c
            goto L51a
        L114:
            java.lang.Throwable r0 = r14.getCause()
            java.lang.Class<java.security.cert.CertificateExpiredException> r1 = java.security.cert.CertificateExpiredException.class
            boolean r0 = iFnJKK(r0, r1)
            if (r0 == 0) goto L1c8
            int r14 = aeiGEO.ZpNRhN.fMg
            if (r14 > r7) goto L1c2
        L124:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = r14 + 182
            r1 = 91
            if (r0 == r1) goto L14a
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L143
            r1 = 282(0x11a, float:3.95E-43)
            if (r0 == r1) goto L139
            r1 = 326(0x146, float:4.57E-43)
            if (r0 == r1) goto L191
            goto L124
        L139:
            int r0 = r14 * 79
            int r0 = r0 % r9
            aeiGEO.ZpNRhN.fMg = r0
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r8) goto L191
            goto L181
        L143:
            r0 = r14 ^ 1670(0x686, float:2.34E-42)
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.fMg = r0
            goto L1c2
        L14a:
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r8) goto L175
        L14e:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r1 = r0 + 598
            r2 = 95
            if (r1 == r2) goto L170
            r0 = 288(0x120, float:4.04E-43)
            if (r1 == r0) goto L166
            r0 = 360(0x168, float:5.04E-43)
            if (r1 == r0) goto L15f
            goto L14e
        L15f:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 979(0x3d3, float:1.372E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto L15f
        L166:
            int r14 = aeiGEO.ZpNRhN.UNI
            r0 = 167(0xa7, float:2.34E-43)
            int r14 = r14 >> r0
            int r14 = r14 % 68
            aeiGEO.ZpNRhN.UNI = r14
            goto L166
        L170:
            int r0 = r0 + r0
            int r0 = r0 >> 1
            aeiGEO.ZpNRhN.UNI = r0
        L175:
            int r0 = r14 + r14
            int r0 = r0 * r5
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.fMg = r0
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 1037(0x40d, float:1.453E-42)
            if (r0 == 0) goto L191
        L181:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 585
            r1 = 13
            if (r0 == r1) goto L18a
            goto L181
        L18a:
            int r14 = r14 + r14
            r14 = r14 ^ 2037(0x7f5, float:2.854E-42)
            int r14 = r14 % r10
            aeiGEO.ZpNRhN.UNI = r14
            goto L181
        L191:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r0 = r0 + r14
            int r14 = r0 >> 2
            aeiGEO.ZpNRhN.fMg = r14
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L124
        L19c:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 533
            r1 = 1
            if (r0 == r1) goto L1bb
            r1 = 80
            if (r0 == r1) goto L1b3
            r1 = 138(0x8a, float:1.93E-43)
            if (r0 == r1) goto L1ac
            goto L19c
        L1ac:
            int r0 = r14 >> 76
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.UNI = r0
            goto L124
        L1b3:
            int r14 = aeiGEO.ZpNRhN.UNI
            r0 = 164(0xa4, float:2.3E-43)
            int r14 = r14 >> r0
            aeiGEO.ZpNRhN.UNI = r14
            goto L1b3
        L1bb:
            int r14 = r14 * 53
            r14 = r14 ^ 5024(0x13a0, float:7.04E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto L19c
        L1c2:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -9
            goto L599
        L1c8:
            java.lang.Throwable r14 = r14.getCause()
            java.lang.Class<java.security.cert.CertificateEncodingException> r0 = java.security.cert.CertificateEncodingException.class
            boolean r14 = iFnJKK(r14, r0)
            if (r14 == 0) goto L2a2
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L1f4
        L1da:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 65
            r1 = 99
            if (r0 == r1) goto L1e7
            r1 = 293(0x125, float:4.1E-43)
            if (r0 == r1) goto L1ee
            goto L1da
        L1e7:
            int r0 = r14 % 9
            r1 = 184(0xb8, float:2.58E-43)
            int r0 = r0 >> r1
        L1ec:
            aeiGEO.ZpNRhN.UNI = r0
        L1ee:
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 5387(0x150b, float:7.549E-42)
            int r0 = r0 + r14
            goto L1ec
        L1f4:
            int r14 = aeiGEO.ZpNRhN.fMg
            r14 = r14 ^ 2129(0x851, float:2.983E-42)
            if (r14 == 0) goto L29d
        L1fa:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = r14 + 195
            r1 = 3
            if (r0 == r3) goto L263
            r5 = 71
            if (r0 == r5) goto L244
            r5 = 75
            if (r0 == r5) goto L216
            r1 = 233(0xe9, float:3.27E-43)
            if (r0 == r1) goto L20e
            goto L1fa
        L20e:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r0 = r0 + r14
            int r0 = r0 >> 103
            aeiGEO.ZpNRhN.fMg = r0
            goto L20e
        L216:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r14 = r14 * r4
            int r14 = r14 % 51
            aeiGEO.ZpNRhN.fMg = r14
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L216
        L221:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 403
            if (r0 == r1) goto L23e
            r3 = 31
            if (r0 == r3) goto L236
            if (r0 == r6) goto L22e
            goto L221
        L22e:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 >> 47
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.UNI = r0
            goto L22e
        L236:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 >> 51
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.UNI = r0
            goto L236
        L23e:
            r14 = r14 ^ 5071(0x13cf, float:7.106E-42)
            int r14 = r14 * r2
            aeiGEO.ZpNRhN.UNI = r14
            goto L221
        L244:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r1 = aeiGEO.ZpNRhN.UNI
            r1 = r1 ^ 1037(0x40d, float:1.453E-42)
            if (r1 == 0) goto L25b
        L24c:
            int r1 = aeiGEO.ZpNRhN.UNI
            int r2 = r1 + 728
            r3 = 98
            if (r2 == r3) goto L255
            goto L24c
        L255:
            int r1 = r1 * 9180
            int r1 = r1 % 68
            aeiGEO.ZpNRhN.UNI = r1
        L25b:
            r0 = r0 ^ 2120(0x848, float:2.971E-42)
            int r0 = r0 + r14
            int r0 = r0 >> 102
            aeiGEO.ZpNRhN.fMg = r0
            goto L244
        L263:
            int r14 = r14 * 91
            int r14 = r14 >> 19
            aeiGEO.ZpNRhN.fMg = r14
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L29d
        L26d:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 429
            r2 = 43
            if (r0 == r2) goto L295
            r2 = 234(0xea, float:3.28E-43)
            if (r0 == r2) goto L282
            r14 = 421(0x1a5, float:5.9E-43)
            if (r0 == r14) goto L286
            r14 = 480(0x1e0, float:6.73E-43)
            if (r0 == r14) goto L28e
            goto L26d
        L282:
            int r14 = r14 % r1
            int r14 = r14 % r3
            aeiGEO.ZpNRhN.UNI = r14
        L286:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 >> 124
            int r14 = r14 % 77
            aeiGEO.ZpNRhN.UNI = r14
        L28e:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * 10080
            int r14 = r14 >> 49
            goto L29a
        L295:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * r1
            int r14 = r14 % 63
        L29a:
            aeiGEO.ZpNRhN.UNI = r14
            goto L295
        L29d:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -8
            goto L599
        L2a2:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -7
            goto L599
        L2a7:
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertPathBuilderException
            if (r0 == 0) goto L2c2
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -12
            r14.setHttpResponseCode(r0)
            int r14 = aeiGEO.ZpNRhN.fMg
            if (r14 > r7) goto L59c
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L51a
            goto L4ed
        L2c2:
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertPathValidatorException
            r9 = 206(0xce, float:2.89E-43)
            if (r0 == 0) goto L2ee
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L2df
        L2d0:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 + 130
            if (r14 == r5) goto L2d7
            goto L2d0
        L2d7:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 >> r9
            int r14 = r14 % 29
            aeiGEO.ZpNRhN.UNI = r14
            goto L2d7
        L2df:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -13
            r14.setHttpResponseCode(r0)
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L59c
            goto L555
        L2ee:
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertStoreException
            if (r0 == 0) goto L2fc
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -14
            goto L599
        L2fc:
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof java.security.cert.CRLException
            if (r0 == 0) goto L34e
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L33f
        L30a:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 182
            if (r0 == r3) goto L337
            r14 = 118(0x76, float:1.65E-43)
            if (r0 == r14) goto L330
            r14 = 129(0x81, float:1.81E-43)
            if (r0 == r14) goto L31d
            r14 = 234(0xea, float:3.28E-43)
            if (r0 == r14) goto L327
            goto L30a
        L31d:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 4097(0x1001, float:5.741E-42)
            int r14 = r14 >> 46
            r14 = r14 ^ 2782(0xade, float:3.898E-42)
            aeiGEO.ZpNRhN.UNI = r14
        L327:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 >> 16
            int r14 = r14 * 7250
            aeiGEO.ZpNRhN.UNI = r14
            goto L31d
        L330:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * 3348
            aeiGEO.ZpNRhN.UNI = r14
            goto L330
        L337:
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 774(0x306, float:1.085E-42)
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.UNI = r0
            goto L337
        L33f:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -15
            r14.setHttpResponseCode(r0)
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L59c
            goto L555
        L34e:
            boolean r0 = r14 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L39d
            int r14 = aeiGEO.ZpNRhN.fMg
            if (r14 > r7) goto L389
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L35b
            goto L36e
        L35b:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = r14 + 247
            r1 = 42
            if (r0 == r1) goto L364
            goto L35b
        L364:
            r14 = r14 ^ 7161(0x1bf9, float:1.0035E-41)
            aeiGEO.ZpNRhN.fMg = r14
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L35b
        L36e:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 221
            r1 = 39
            if (r0 == r1) goto L384
            r1 = 196(0xc4, float:2.75E-43)
            if (r0 == r1) goto L37b
            goto L36e
        L37b:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 + r14
            r0 = r0 ^ 4692(0x1254, float:6.575E-42)
            int r0 = r0 % r4
            aeiGEO.ZpNRhN.UNI = r0
            goto L37b
        L384:
            r14 = r14 ^ 423(0x1a7, float:5.93E-43)
            aeiGEO.ZpNRhN.UNI = r14
            goto L35b
        L389:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -5
            r14.setHttpResponseCode(r0)
            int r14 = aeiGEO.ZpNRhN.fMg
            r14 = r14 ^ 2129(0x851, float:2.983E-42)
            if (r14 == 0) goto L59c
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L51a
            goto L4ed
        L39d:
            boolean r0 = r14 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L566
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 1037(0x40d, float:1.453E-42)
            if (r0 == 0) goto L3bb
        L3a9:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 + 715
            r0 = 9
            if (r14 == r0) goto L3b2
            goto L3a9
        L3b2:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 >> r6
            int r14 = r14 % 4
            int r14 = r14 % r5
            aeiGEO.ZpNRhN.UNI = r14
            goto L3b2
        L3bb:
            if (r14 > r7) goto L4af
            if (r0 == 0) goto L3e0
        L3bf:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 260
            r1 = 80
            if (r0 == r1) goto L3d0
            r1 = 139(0x8b, float:1.95E-43)
            if (r0 == r1) goto L3dc
            r1 = 322(0x142, float:4.51E-43)
            if (r0 == r1) goto L3d5
            goto L3bf
        L3d0:
            r0 = r14 ^ 1618(0x652, float:2.267E-42)
        L3d2:
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.UNI = r0
        L3d5:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 % 107
            int r0 = r0 % r4
            aeiGEO.ZpNRhN.UNI = r0
        L3dc:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 % r6
            goto L3d2
        L3e0:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = r14 + 260
            r3 = 61
            if (r0 == r3) goto L428
            r3 = 65
            if (r0 == r3) goto L420
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r3) goto L467
            r3 = 213(0xd5, float:2.98E-43)
            if (r0 == r3) goto L3f5
            goto L3e0
        L3f5:
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r8) goto L415
        L3f9:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 676
            r1 = 75
            if (r0 == r1) goto L40e
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L406
            goto L3f9
        L406:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 + r14
            int r0 = r0 * 14
            aeiGEO.ZpNRhN.UNI = r0
            goto L406
        L40e:
            int r14 = r14 >> 69
            int r14 = r14 % 121
            aeiGEO.ZpNRhN.UNI = r14
            goto L3f9
        L415:
            r3 = r14 ^ 2240(0x8c0, float:3.139E-42)
            int r3 = r3 * 123
            r3 = r3 ^ 3823(0xeef, float:5.357E-42)
            aeiGEO.ZpNRhN.fMg = r3
            if (r0 > r8) goto L467
            goto L449
        L420:
            int r14 = r14 >> 92
            r14 = r14 ^ 3948(0xf6c, float:5.532E-42)
            aeiGEO.ZpNRhN.fMg = r14
            goto L4af
        L428:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r3 = aeiGEO.ZpNRhN.UNI
            if (r3 > r8) goto L441
        L42e:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 + 754
            r0 = 78
            if (r14 == r0) goto L437
            goto L42e
        L437:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * r5
            r14 = r14 ^ 5089(0x13e1, float:7.131E-42)
            int r14 = r14 >> 119
            aeiGEO.ZpNRhN.UNI = r14
            goto L437
        L441:
            int r0 = r0 >> 110
            r0 = r0 ^ 6401(0x1901, float:8.97E-42)
            aeiGEO.ZpNRhN.fMg = r0
            if (r3 > r8) goto L467
        L449:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 650
            if (r0 == r2) goto L45c
            r1 = 151(0x97, float:2.12E-43)
            if (r0 == r1) goto L454
            goto L449
        L454:
            r0 = 192(0xc0, float:2.69E-43)
            int r14 = r14 >> r0
            r14 = r14 ^ 3698(0xe72, float:5.182E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto L449
        L45c:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * 118
            r14 = r14 ^ 4320(0x10e0, float:6.054E-42)
            int r14 = r14 % 55
            aeiGEO.ZpNRhN.UNI = r14
            goto L45c
        L467:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r3 = aeiGEO.ZpNRhN.UNI
            r4 = r3 ^ 1037(0x40d, float:1.453E-42)
            if (r4 == 0) goto L480
        L46f:
            int r4 = aeiGEO.ZpNRhN.UNI
            int r14 = r4 + 767
            r0 = 18
            if (r14 == r0) goto L478
            goto L46f
        L478:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 + r4
            r14 = r14 ^ 4345(0x10f9, float:6.089E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto L478
        L480:
            int r0 = r0 + r14
            r0 = r0 ^ 4880(0x1310, float:6.838E-42)
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.fMg = r0
            if (r3 > r8) goto L428
        L488:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 624
            if (r0 == r1) goto L49e
            r14 = 76
            if (r0 == r14) goto L497
            r14 = 129(0x81, float:1.81E-43)
            if (r0 == r14) goto L4a6
            goto L488
        L497:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1285(0x505, float:1.8E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto L497
        L49e:
            int r14 = r14 >> 30
            r14 = r14 ^ 3514(0xdba, float:4.924E-42)
            int r14 = r14 >> 85
        L4a4:
            aeiGEO.ZpNRhN.UNI = r14
        L4a6:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 % 83
            r14 = r14 ^ 4146(0x1032, float:5.81E-42)
            int r14 = r14 % 17
            goto L4a4
        L4af:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -3
            r14.setHttpResponseCode(r0)
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r8) goto L4e3
        L4bb:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r2 = r0 + 338
            r3 = 37
            if (r2 == r3) goto L4d2
            r3 = 46
            if (r2 == r3) goto L4ca
            if (r2 == r9) goto L4d8
            goto L4bb
        L4ca:
            int r2 = r0 >> 39
            int r2 = r2 + r0
            int r0 = r2 >> 64
            aeiGEO.ZpNRhN.UNI = r0
            goto L4e3
        L4d2:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 5748(0x1674, float:8.055E-42)
            aeiGEO.ZpNRhN.UNI = r14
        L4d8:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 % 111
            int r14 = r14 % 57
            r14 = r14 ^ 3618(0xe22, float:5.07E-42)
            aeiGEO.ZpNRhN.UNI = r14
            goto L4d2
        L4e3:
            r14 = r14 ^ 2129(0x851, float:2.983E-42)
            if (r14 == 0) goto L59c
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 1037(0x40d, float:1.453E-42)
            if (r14 == 0) goto L51a
        L4ed:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 104
            r2 = 10
            if (r0 == r2) goto L50f
            r2 = 84
            if (r0 == r2) goto L512
            r2 = 99
            if (r0 == r2) goto L508
            r2 = 145(0x91, float:2.03E-43)
            if (r0 == r2) goto L502
            goto L4ed
        L502:
            r14 = r14 ^ 3773(0xebd, float:5.287E-42)
            int r14 = r14 * 43
            aeiGEO.ZpNRhN.UNI = r14
        L508:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r14 = r14 * 44
            int r14 = r14 >> 64
            goto L510
        L50f:
            int r14 = r14 >> r6
        L510:
            aeiGEO.ZpNRhN.UNI = r14
        L512:
            int r14 = aeiGEO.ZpNRhN.UNI
            r14 = r14 ^ 3117(0xc2d, float:4.368E-42)
            int r14 = r14 >> 13
            aeiGEO.ZpNRhN.UNI = r14
        L51a:
            int r14 = aeiGEO.ZpNRhN.fMg
            int r0 = r14 + 39
            if (r0 == r1) goto L54b
            r2 = 134(0x86, float:1.88E-43)
            if (r0 == r2) goto L542
            r2 = 265(0x109, float:3.71E-43)
            if (r0 == r2) goto L529
            goto L51a
        L529:
            int r0 = r14 >> 88
            aeiGEO.ZpNRhN.fMg = r0
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r8) goto L542
        L531:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r1 = r0 + 507
            r2 = 52
            if (r1 == r2) goto L53a
            goto L531
        L53a:
            r0 = r0 ^ 1789(0x6fd, float:2.507E-42)
            int r0 = r0 * 44
            int r0 = r0 % 74
            aeiGEO.ZpNRhN.UNI = r0
        L542:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r0 = r0 + r14
            int r0 = r0 + r14
            r0 = r0 ^ 4117(0x1015, float:5.769E-42)
            aeiGEO.ZpNRhN.fMg = r0
            goto L542
        L54b:
            int r14 = r14 * 45
            int r14 = r14 >> 106
            aeiGEO.ZpNRhN.fMg = r14
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L59c
        L555:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 78
            r1 = 27
            if (r0 == r1) goto L55e
            goto L555
        L55e:
            int r14 = r14 + r14
            int r14 = r14 % 101
            int r14 = r14 >> 124
            aeiGEO.ZpNRhN.UNI = r14
            goto L59c
        L566:
            boolean r14 = r14 instanceof java.net.SocketTimeoutException
            if (r14 == 0) goto L58d
            int r14 = aeiGEO.ZpNRhN.UNI
            if (r14 > r8) goto L589
        L56e:
            int r14 = aeiGEO.ZpNRhN.UNI
            int r0 = r14 + 286
            r1 = 50
            if (r0 == r1) goto L582
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L57b
            goto L56e
        L57b:
            r14 = r14 ^ 3203(0xc83, float:4.488E-42)
            int r14 = r14 % 116
            aeiGEO.ZpNRhN.UNI = r14
            goto L589
        L582:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 * r5
            int r0 = r0 + r14
            aeiGEO.ZpNRhN.UNI = r0
            goto L582
        L589:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -4
            goto L599
        L58d:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            int r14 = r14.getHttpResponseCode()
            r0 = -2
            if (r14 != r0) goto L59c
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r13.DkckDm
            r0 = -1
        L599:
            r14.setHttpResponseCode(r0)
        L59c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aeiGEO.ZpNRhN.dhOYXF(java.lang.Exception):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static boolean gFTCsA(byte[][] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3;
        if (bArr2 != null && bArr != null) {
            int i4 = UNI;
            if (i4 <= 1036) {
                while (UNI + 26 != 27) {
                }
                while (true) {
                    UNI ^= 719;
                }
            } else if (bArr.length != 0) {
                int length = bArr.length;
                if (i4 <= 1036) {
                    while (true) {
                        int i5 = UNI;
                        int i6 = i5 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                        if (i6 != 43) {
                            if (i6 == 194) {
                                UNI = i5 + i5 + i5;
                            } else if (i6 != 371) {
                                if (i6 == 440) {
                                    UNI = (UNI + i5) >> 26;
                                }
                            }
                            UNI = (UNI ^ 4222) % 56;
                            UNI = (UNI + i5) >> 26;
                        }
                        UNI = (UNI >> WebSocketProtocol.PAYLOAD_SHORT) * 11;
                    }
                } else {
                    int i7 = 0;
                    while (i7 < length) {
                        if (UNI <= 1036) {
                            while (true) {
                                int i8 = UNI;
                                if (i8 + 52 == 87) {
                                    UNI = ((i8 ^ MTCoreConstants.MainWhat.ON_LOGIN_INTO) >> 14) ^ 4781;
                                }
                            }
                        } else {
                            if (Arrays.equals(bArr2, bArr[i7])) {
                                return true;
                            }
                            i7++;
                            if ((fMg ^ 2129) != 0) {
                                while (true) {
                                    int i9 = fMg;
                                    int i10 = i9 + 65;
                                    if (i10 != 97) {
                                        if (i10 == 184) {
                                            fMg = (i9 ^ 2643) * 54;
                                            if (UNI <= 1036) {
                                                while (true) {
                                                    i = UNI;
                                                    int i11 = i + 130;
                                                    if (i11 == 34) {
                                                        break;
                                                    }
                                                    if (i11 == 206) {
                                                        UNI = ((i * 18) % 108) ^ 2715;
                                                    }
                                                }
                                                while (true) {
                                                    UNI = ((UNI % 31) + i) ^ 4137;
                                                }
                                            }
                                        } else if (i10 != 355) {
                                            if (i10 == 497) {
                                                do {
                                                    fMg = (fMg + i9) >> 9;
                                                } while (UNI > 1036);
                                                do {
                                                    i3 = UNI;
                                                } while (i3 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 19);
                                                while (true) {
                                                    UNI = (UNI + i3) >> 52;
                                                }
                                            }
                                        }
                                        int i12 = fMg;
                                        if (UNI <= 1036) {
                                            do {
                                                int i13 = UNI;
                                                i2 = i13 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                                if (i2 == 79) {
                                                    UNI = (i13 + i13) % 6;
                                                }
                                            } while (i2 != 141);
                                            while (true) {
                                                UNI = ((UNI ^ 3853) * 23) % 58;
                                            }
                                        }
                                        fMg = ((i12 % 84) >> 41) * 35;
                                    }
                                    int i14 = fMg;
                                    if ((UNI ^ 1037) != 0) {
                                        while (true) {
                                            int i15 = UNI;
                                            if (i15 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 == 25) {
                                                UNI = (i15 * 4) + i15;
                                            }
                                        }
                                    } else {
                                        fMg = ((i14 % 10) % 25) ^ 1489;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:51:0x00ac) to fix multi-entry loop: BACK_EDGE: B:50:0x00a7 -> B:51:0x00ac */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        aeiGEO.ZpNRhN.fMg = ((aeiGEO.ZpNRhN.fMg ^ 3553) % 38) >> 34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if ((aeiGEO.ZpNRhN.UNI ^ 1037) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        r6 = aeiGEO.ZpNRhN.UNI;
        r7 = r6 + org.spongycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r7 == 44) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r7 == 93) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r7 == 288) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (r7 == 300) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        aeiGEO.ZpNRhN.UNI = (r6 ^ 5281) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
    
        aeiGEO.ZpNRhN.UNI = (aeiGEO.ZpNRhN.UNI * 3190) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        aeiGEO.ZpNRhN.UNI = ((r6 >> 27) % 12) % 86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ac, code lost:
    
        aeiGEO.ZpNRhN.UNI = (aeiGEO.ZpNRhN.UNI + r6) * 68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int gezFCt(boolean z, List<Certificate> list, URL url) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.sEupnh == null && this.zBwwme == null) {
            return 200;
        }
        if (!z) {
            str = DlIaRS;
            if ((fMg ^ 2129) != 0) {
                if (UNI <= 1036) {
                    do {
                        i4 = UNI;
                        i5 = i4 + 52;
                        if (i5 != 52) {
                            if (i5 != 59) {
                                if (i5 == 159) {
                                    UNI = (i4 + i4) * 91;
                                }
                            }
                            i6 = ((UNI >> 75) + i4) >> 10;
                        } else {
                            i6 = (i4 >> 61) % 11;
                        }
                        UNI = i6;
                    } while (i5 != 278);
                    while (true) {
                        UNI = ((UNI % 65) ^ 2216) + i4;
                    }
                }
                while (true) {
                    int i7 = fMg;
                    int i8 = i7 + 104;
                    if (i8 == 72) {
                        while (true) {
                            fMg = ((fMg + i7) % 93) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                            if (UNI <= 1036) {
                                do {
                                    i = UNI;
                                    i2 = i + 130;
                                    if (i2 == 55) {
                                        break;
                                    }
                                } while (i2 != 58);
                                UNI = (i ^ 4262) + i;
                            }
                        }
                        while (true) {
                            UNI = (UNI ^ 2598) % 42;
                        }
                    } else if (i8 == 185) {
                        fMg = (i7 % 58) ^ 4087;
                        if ((UNI ^ 1037) != 0) {
                            while (true) {
                                i3 = UNI;
                                int i9 = i3 + 39;
                                if (i9 == 17) {
                                    break;
                                }
                                if (i9 == 58) {
                                    UNI = ((i3 >> 7) ^ 4947) + i3;
                                }
                            }
                            while (true) {
                                UNI = ((UNI * 61) % 61) + i3;
                            }
                        }
                    } else {
                        if (i8 == 275) {
                            fMg = ((i7 >> 100) * 54) % 94;
                            break;
                        }
                        if (i8 == 319) {
                            break;
                        }
                    }
                }
            }
            str2 = "UpUhXY`ui\bDBCEMC";
        } else {
            if (list != null && !list.isEmpty()) {
                String host = url.getHost();
                if (!UPbYzn.dTTfOR(TMXProfilingConnections.hdOILI) || !UPbYzn.dTTfOR(host) || host.equalsIgnoreCase(TMXProfilingConnections.hdOILI)) {
                    Certificate certificate = list.get(0);
                    int iQAQCdZ = this.zBwwme != null ? QAQCdZ(certificate) : -6;
                    return (iQAQCdZ == 200 || this.sEupnh == null) ? iQAQCdZ : zNQIcI(certificate);
                }
                GVpNrs.fQMcgE.sIqKDg(DlIaRS, TMXProfilingConnections.fsw("u~Hx\u000b\u0019") + host + TMXProfilingConnections.fsw("41_cNBo9x\bOB^J@\u0007pe\u0014@WCFJL\u0013"));
                return 200;
            }
            str = DlIaRS;
            str2 = "^pU+_\u0011s{xZKF\\L\bDSG@ZTXSNJX";
        }
        GVpNrs.svhCHd(str, TMXProfilingConnections.fsw(str2));
        return -6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01f8 -> B:88:0x0200). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private javax.net.ssl.HttpsURLConnection hQkvHM(java.lang.String r17, byte[] r18, boolean r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = 0
            boolean r0 = aeiGEO.UPbYzn.dTTfOR(r17)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            if (r0 == 0) goto L2f
            java.lang.String r0 = "ueO|"
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r0)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            if (r0 != 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r0.<init>()     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.lang.String r5 = "ueO|X\u000b.1"
            java.lang.String r5 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r5)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r0.append(r5)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r0.append(r2)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.lang.String r0 = r0.toString()     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            goto L30
        L2f:
            r0 = r2
        L30:
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r5.<init>(r0)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.net.ProxySelector r6 = java.net.ProxySelector.getDefault()     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r7 = 1
            if (r6 != 0) goto L52
            java.lang.String r0 = aeiGEO.ZpNRhN.DlIaRS     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.lang.String r6 = "Yt]m^]u>|ZM[S\tAT\u0016[A_^"
            java.lang.String r6 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r6)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            aeiGEO.GVpNrs.fQMcgE.sIqKDg(r0, r6)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r0.<init>(r7)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.net.Proxy r6 = java.net.Proxy.NO_PROXY     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r0.add(r6)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            goto L5b
        L52:
            java.net.URI r8 = new java.net.URI     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            r8.<init>(r0)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
            java.util.List r0 = r6.select(r8)     // Catch: java.lang.SecurityException -> L2d3 java.net.URISyntaxException -> L2d9 java.net.MalformedURLException -> L2db
        L5b:
            java.util.Iterator r6 = r0.iterator()
            r8 = r4
        L60:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2b3
            java.lang.Object r0 = r6.next()
            r9 = r0
            java.net.Proxy r9 = (java.net.Proxy) r9
            r10 = 2128(0x850, float:2.982E-42)
            r11 = 1036(0x40c, float:1.452E-42)
            java.net.URLConnection r0 = r5.openConnection(r9)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            boolean r12 = r0 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            if (r12 != 0) goto La5
            java.lang.String r12 = aeiGEO.ZpNRhN.DlIaRS     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r13.<init>()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.String r14 = "T\u007fMmGXe>oGLMOJ\\NY[\u0014GKAU\u000f"
            java.lang.String r14 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r14)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r13.append(r14)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r13.append(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.String r0 = "=x\\bDCd>e\\\f"
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r13.append(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            aeiGEO.GVpNrs.fQMcgE.OijiEz(r12, r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            goto L60
        La5:
            aeiGEO.STbtMW r12 = r1.Ogueen     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            if (r12 == 0) goto Laf
            r13 = r0
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r13.setSSLSocketFactory(r12)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
        Laf:
            r12 = r0
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            int r0 = r1.iMQkBc     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            int r0 = r1.iMQkBc     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setInstanceFollowRedirects(r7)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r0 = 0
            r12.setUseCaches(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setDoInput(r7)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            if (r19 == 0) goto Ld5
            java.lang.String r13 = "M^hX"
            java.lang.String r13 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r13)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setRequestMethod(r13)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setDoOutput(r7)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            goto Le1
        Ld5:
            java.lang.String r13 = "ZTo"
            java.lang.String r13 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r13)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setRequestMethod(r13)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setDoOutput(r0)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
        Le1:
            java.util.Map<java.lang.String, java.lang.String> r13 = r1.hTAumt     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
        Leb:
            boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            if (r14 == 0) goto L107
            java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.Object r15 = r14.getKey()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            r12.setRequestProperty(r15, r14)     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            goto Leb
        L107:
            r12.connect()     // Catch: java.lang.Throwable -> L14d java.lang.IllegalArgumentException -> L150 java.lang.SecurityException -> L19e java.io.IOException -> L203 javax.net.ssl.SSLPeerUnverifiedException -> L295
            java.security.cert.Certificate[] r13 = r12.getServerCertificates()     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            java.util.List r13 = java.util.Arrays.asList(r13)     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r14 = r1.DkckDm     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            if (r13 == 0) goto L117
            r0 = r7
        L117:
            java.net.URL r15 = r12.getURL()     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            int r0 = r1.gezFCt(r0, r13, r15)     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            r14.setHttpResponseCode(r0)     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r0 = r1.DkckDm     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            int r0 = r0.getHttpResponseCode()     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            r13 = 200(0xc8, float:2.8E-43)
            if (r0 != r13) goto L13e
            if (r19 == 0) goto L13d
            if (r3 == 0) goto L13d
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            r0.write(r3)     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            r0.flush()     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
            r0.close()     // Catch: java.lang.IllegalArgumentException -> L143 java.lang.SecurityException -> L145 java.io.IOException -> L147 javax.net.ssl.SSLPeerUnverifiedException -> L14a java.lang.Throwable -> L2ab
        L13d:
            return r12
        L13e:
            r12.disconnect()
            goto L269
        L143:
            r0 = move-exception
            goto L152
        L145:
            r0 = move-exception
            goto L1a0
        L147:
            r0 = move-exception
            goto L205
        L14a:
            r0 = move-exception
            goto L297
        L14d:
            r0 = move-exception
            goto L2ad
        L150:
            r0 = move-exception
            r12 = r4
        L152:
            java.lang.String r10 = aeiGEO.ZpNRhN.DlIaRS     // Catch: java.lang.Throwable -> L2ab
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ab
            r13.<init>()     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r14 = "^~UbNRuwcF\u0002EK@DRDP\u000e\u0013{_FNRTX\u001bJKWO_%"
            java.lang.String r14 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r14)     // Catch: java.lang.Throwable -> L2ab
            r13.append(r14)     // Catch: java.lang.Throwable -> L2ab
            if (r9 == 0) goto L17e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ab
            r14.<init>()     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r15 = "ihKi\u000b"
            java.lang.String r15 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r15)     // Catch: java.lang.Throwable -> L2ab
            r14.append(r15)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2ab
            r14.append(r9)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r9 = r14.toString()     // Catch: java.lang.Throwable -> L2ab
            goto L184
        L17e:
            java.lang.String r9 = "mcTtR\u0011hm,FWOF\u0007"
            java.lang.String r9 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r9)     // Catch: java.lang.Throwable -> L2ab
        L184:
            r13.append(r9)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r9 = r13.toString()     // Catch: java.lang.Throwable -> L2ab
            aeiGEO.GVpNrs.fQMcgE.OijiEz(r10, r9)     // Catch: java.lang.Throwable -> L2ab
            if (r8 != 0) goto L191
            r8 = r0
        L191:
            if (r12 == 0) goto L269
            r12.disconnect()
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 1037(0x40d, float:1.453E-42)
            if (r0 == 0) goto L269
            goto L22d
        L19e:
            r0 = move-exception
            r12 = r4
        L1a0:
            java.lang.String r13 = aeiGEO.ZpNRhN.DlIaRS     // Catch: java.lang.Throwable -> L2ab
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ab
            r14.<init>()     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r15 = "^~UbNRuwcF\u0002EK@DRDP\u000e\u0013v^^\bJ\u001dTZL\\\u0018GCwijqriQB)pd*|{b6a|za1`}qee5"
            java.lang.String r15 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r15)     // Catch: java.lang.Throwable -> L2ab
            r14.append(r15)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2ab
            r14.append(r9)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r9 = r14.toString()     // Catch: java.lang.Throwable -> L2ab
            aeiGEO.GVpNrs.fQMcgE.OijiEz(r13, r9)     // Catch: java.lang.Throwable -> L2ab
            if (r8 != 0) goto L1c1
            r8 = r0
        L1c1:
            if (r12 == 0) goto L269
            r12.disconnect()
            int r0 = aeiGEO.ZpNRhN.fMg
            if (r0 > r10) goto L269
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 1037(0x40d, float:1.453E-42)
            if (r0 == 0) goto L211
        L1d0:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r2 = r0 + 299
            r3 = 6
            if (r2 == r3) goto L1f3
            r3 = 10
            if (r2 == r3) goto L1f8
            r3 = 202(0xca, float:2.83E-43)
            if (r2 == r3) goto L1ec
            r3 = 282(0x11a, float:3.95E-43)
            if (r2 == r3) goto L1e4
            goto L1d0
        L1e4:
            int r0 = r0 >> 84
            int r0 = r0 % 18
            r0 = r0 ^ 5429(0x1535, float:7.608E-42)
            aeiGEO.ZpNRhN.UNI = r0
        L1ec:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 >> 56
            r0 = r0 ^ 7132(0x1bdc, float:9.994E-42)
            goto L200
        L1f3:
            int r2 = r0 % 4
            int r2 = r2 + r0
            aeiGEO.ZpNRhN.UNI = r2
        L1f8:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 >> 93
            r0 = r0 ^ 4972(0x136c, float:6.967E-42)
            int r0 = r0 % 25
        L200:
            aeiGEO.ZpNRhN.UNI = r0
            goto L1f8
        L203:
            r0 = move-exception
            r12 = r4
        L205:
            if (r8 != 0) goto L208
            r8 = r0
        L208:
            if (r12 == 0) goto L269
            r12.disconnect()
            int r0 = aeiGEO.ZpNRhN.fMg
            if (r0 > r10) goto L269
        L211:
            int r0 = aeiGEO.ZpNRhN.fMg
            int r9 = r0 + 247
            r10 = 15
            if (r9 == r10) goto L25f
            r10 = 126(0x7e, float:1.77E-43)
            if (r9 == r10) goto L257
            r10 = 130(0x82, float:1.82E-43)
            if (r9 == r10) goto L222
            goto L211
        L222:
            r9 = r0 ^ 1627(0x65b, float:2.28E-42)
            int r9 = r9 + r0
            int r9 = r9 * 77
            aeiGEO.ZpNRhN.fMg = r9
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r11) goto L269
        L22d:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r2 = r0 + 260
            r3 = 22
            if (r2 == r3) goto L24c
            r4 = 61
            if (r2 == r4) goto L246
            r0 = 173(0xad, float:2.42E-43)
            if (r2 == r0) goto L23e
            goto L22d
        L23e:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 >> r3
            r0 = r0 ^ 2173(0x87d, float:3.045E-42)
            aeiGEO.ZpNRhN.UNI = r0
            goto L23e
        L246:
            int r0 = r0 % 90
            int r0 = r0 * 4
            aeiGEO.ZpNRhN.UNI = r0
        L24c:
            int r0 = aeiGEO.ZpNRhN.UNI
            r0 = r0 ^ 2098(0x832, float:2.94E-42)
            int r0 = r0 * 44
            int r0 = r0 % 125
            aeiGEO.ZpNRhN.UNI = r0
            goto L22d
        L257:
            int r9 = r0 % 60
            int r9 = r9 >> 116
            int r9 = r9 + r0
            aeiGEO.ZpNRhN.fMg = r9
            goto L211
        L25f:
            int r2 = aeiGEO.ZpNRhN.fMg
            int r2 = r2 >> 35
            r2 = r2 ^ 4148(0x1034, float:5.813E-42)
            int r2 = r2 + r0
            aeiGEO.ZpNRhN.fMg = r2
            goto L25f
        L269:
            int r0 = aeiGEO.ZpNRhN.UNI
            if (r0 > r11) goto L60
        L26d:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r9 = r0 + 104
            r10 = 72
            if (r9 == r10) goto L28d
            r10 = 236(0xec, float:3.31E-43)
            if (r9 == r10) goto L284
            r10 = 366(0x16e, float:5.13E-43)
            if (r9 == r10) goto L27e
            goto L26d
        L27e:
            r0 = r0 ^ 1122(0x462, float:1.572E-42)
            aeiGEO.ZpNRhN.UNI = r0
            goto L60
        L284:
            int r0 = aeiGEO.ZpNRhN.UNI
            int r0 = r0 * 42
            int r0 = r0 % 63
            aeiGEO.ZpNRhN.UNI = r0
            goto L284
        L28d:
            int r2 = aeiGEO.ZpNRhN.UNI
            int r2 = r2 + r0
            int r2 = r2 >> 85
            aeiGEO.ZpNRhN.UNI = r2
            goto L28d
        L295:
            r0 = move-exception
            r12 = r4
        L297:
            java.lang.String r2 = aeiGEO.ZpNRhN.DlIaRS     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r3 = "Mt^~\u000bDohiZKECLL"
            java.lang.String r3 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r3)     // Catch: java.lang.Throwable -> L2ab
            aeiGEO.GVpNrs.svhCHd(r2, r3, r0)     // Catch: java.lang.Throwable -> L2ab
            r1.dhOYXF(r0)     // Catch: java.lang.Throwable -> L2ab
            if (r12 == 0) goto L2aa
            r12.disconnect()
        L2aa:
            return r4
        L2ab:
            r0 = move-exception
            r4 = r12
        L2ad:
            if (r4 == 0) goto L2b2
            r4.disconnect()
        L2b2:
            throw r0
        L2b3:
            if (r8 == 0) goto L2d2
            java.lang.String r0 = aeiGEO.ZpNRhN.DlIaRS
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "^pUbDE!}cFLFI]\bSY\u0015FV_^DJ\u001eUSHN\u0019"
            java.lang.String r5 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r5)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            aeiGEO.GVpNrs.svhCHd(r0, r2, r8)
            r1.dhOYXF(r8)
        L2d2:
            return r4
        L2d3:
            r0 = move-exception
            java.lang.String r2 = aeiGEO.ZpNRhN.DlIaRS
            java.lang.String r3 = "NtXyYXug,ECMKNMU\u0016QQ][TT\u000f_^_^IJ"
            goto L2e0
        L2d9:
            r0 = move-exception
            goto L2dc
        L2db:
            r0 = move-exception
        L2dc:
            java.lang.String r2 = aeiGEO.ZpNRhN.DlIaRS
            java.lang.String r3 = "T\u007fMmGXe>Yzn"
        L2e0:
            java.lang.String r3 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r3)
            aeiGEO.GVpNrs.svhCHd(r2, r3, r0)
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r0 = r1.DkckDm
            r2 = -1
            r0.setHttpResponseCode(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aeiGEO.ZpNRhN.hQkvHM(java.lang.String, byte[], boolean):javax.net.ssl.HttpsURLConnection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static boolean iFnJKK(Throwable th, Class<?> cls) {
        int i;
        do {
            th = th.getCause();
            if (th == null) {
                return false;
            }
            if (UNI <= 1036) {
                while (true) {
                    i = UNI;
                    int i2 = i + 26;
                    if (i2 == 61) {
                        break;
                    }
                    if (i2 == 140) {
                        UNI = ((i >> 9) % 63) >> 80;
                    }
                }
                UNI = (i * 105) + i + i;
            }
        } while (!cls.isInstance(th));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private int zNQIcI(Certificate certificate) {
        String strDvMhtu;
        int i;
        try {
            byte[] bArrDHEdFZ = UPbYzn.DHEdFZ(certificate.getEncoded());
            if (bArrDHEdFZ != null && gFTCsA(this.sEupnh, bArrDHEdFZ)) {
                return 200;
            }
            String str = DlIaRS;
            StringBuilder sb = new StringBuilder();
            sb.append(TMXProfilingConnections.fsw("T\u007fMmGXe>oMPWCOADWAQ\u001f\u0012Y_\\J\u001dUH\u001aLK^Hb$"));
            if (bArrDHEdFZ == null) {
                strDvMhtu = TMXProfilingConnections.fsw("sdW`");
                if (UNI <= 1036) {
                    while (true) {
                        i = UNI;
                        int i2 = i + 52;
                        if (i2 == 49) {
                            UNI = i >> 84;
                        } else if (i2 == 63) {
                            break;
                        }
                    }
                    UNI = (i % 33) + i + i;
                }
            } else {
                strDvMhtu = UPbYzn.DvMhtu(bArrDHEdFZ);
            }
            sb.append(strDvMhtu);
            GVpNrs.svhCHd(str, sb.toString());
            return -6;
        } catch (CertificateEncodingException e) {
            GVpNrs.svhCHd(DlIaRS, TMXProfilingConnections.fsw("^pU+_\u0011w{~ADZ\nJMUB\\RZQPDJ\u001eFA"), e.toString());
            return -8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnectionsInterface.TMXHttpResponseCode OBzZra() {
        return this.DkckDm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:12:0x001c) to fix multi-entry loop: BACK_EDGE: B:12:0x001c -> B:13:0x001e */
    public void OmPrLP() {
        HttpsURLConnection httpsURLConnection = this.QLLKwQ;
        if (httpsURLConnection == null) {
            return;
        }
        if ((UNI ^ 1037) == 0) {
            httpsURLConnection.disconnect();
            this.QLLKwQ = null;
            return;
        }
        while (true) {
            int i = UNI;
            int i2 = i + 26;
            if (i2 == 4) {
                UNI = ((i % 93) % 65) >> 65;
                break;
            } else if (i2 == 80) {
                break;
            }
        }
        while (true) {
            UNI = (UNI * 109) ^ 4970;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void RYPzIz(Map<String, String> map) {
        this.hTAumt.putAll(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputStream arDRxL() throws IOException {
        HttpsURLConnection httpsURLConnection = this.QLLKwQ;
        if (httpsURLConnection == null) {
            return null;
        }
        return httpsURLConnection.getInputStream();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int ddauOi(String str, byte[] bArr) throws Throwable {
        HttpsURLConnection httpsURLConnectionHQkvHM = hQkvHM(str, bArr, true);
        if (httpsURLConnectionHQkvHM != null) {
            this.TpLtq = httpsURLConnectionHQkvHM.getURL();
            this.QLLKwQ = httpsURLConnectionHQkvHM;
            try {
                int responseCode = httpsURLConnectionHQkvHM.getResponseCode();
                this.DkckDm.setHttpResponseCode(responseCode);
                return responseCode;
            } catch (IOException e) {
                GVpNrs.svhCHd(DlIaRS, TMXProfilingConnections.fsw("^pUbDE!nc[V\u0002"), e);
                dhOYXF(e);
            }
        }
        return this.DkckDm.getHttpResponseCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String hijVBL() {
        URL url = this.TpLtq;
        if (url == null) {
            return null;
        }
        return url.getHost();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String sTbpmZ() {
        URL url = this.TpLtq;
        if (url == null) {
            return null;
        }
        return url.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int zLnOGN(String str) throws Throwable {
        HttpsURLConnection httpsURLConnectionHQkvHM = hQkvHM(str, null, false);
        if (httpsURLConnectionHQkvHM == null) {
            GVpNrs.svhCHd(DlIaRS, TMXProfilingConnections.fsw("^~UbNRuwcF\u0002EK@DRDP\u000e\u0013QP^\u000fPRH\u001bYK]VR`$`mon[O}mdd)|h6") + str);
        } else {
            this.TpLtq = httpsURLConnectionHQkvHM.getURL();
            this.QLLKwQ = httpsURLConnectionHQkvHM;
            try {
                int responseCode = httpsURLConnectionHQkvHM.getResponseCode();
                this.DkckDm.setHttpResponseCode(responseCode);
                return responseCode;
            } catch (IOException e) {
                GVpNrs.svhCHd(DlIaRS, TMXProfilingConnections.fsw("^~UbNRuwcF\u0002EK@DRDP\u0014\u001b") + str + TMXProfilingConnections.fsw("4+\u001b"), e);
                dhOYXF(e);
            }
        }
        return this.DkckDm.getHttpResponseCode();
    }
}
