package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Locale;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class QYvkLl extends QhsCdE {
    static final int APP_INSTALL_TIMEOUT_SEC = 300;
    private static String DlIaRS;
    public static int RDk;
    public static int kcP;
    long OOCXdF;
    long ahitRw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        kcP = 4730;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        RDk = 2513;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(QYvkLl.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QYvkLl(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void UkCIYP() {
        long j = this.OOCXdF;
        long j2 = this.ahitRw;
        if (j <= j2) {
            return;
        }
        if (j - j2 >= 300) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("\\aK,B_rjmDN\u0003^@EB\u0016\\G\u0013^PDJL\u001dHS[W\u0018ZIame{!tWAl>+") + String.format(Locale.ENGLISH, GCXiNH.fsw("t\u007fHxJ]mJeEGx\u000fMu\u000b\u0016X[W[WI{WPY`\u001f]e"), Long.valueOf(this.OOCXdF), Long.valueOf(this.ahitRw)));
            this.OOCXdF = 0L;
        }
        this.ahitRw = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:105:0x0171) to fix multi-entry loop: BACK_EDGE: B:104:0x016d -> B:105:0x0171 */
    /* JADX DEBUG: Duplicate block (B:69:0x00e6) to fix multi-entry loop: BACK_EDGE: B:68:0x00de -> B:69:0x00e6 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            QfgSZK.AhwBna r0 = QfgSZK.AhwBna.APP_INSTALLATION_TIME
            java.lang.String r0 = r0.DbNXlk()
            long r1 = r10.OOCXdF
            int r3 = QfgSZK.QYvkLl.kcP
            r4 = 4729(0x1279, float:6.627E-42)
            if (r3 > r4) goto L28
        L11:
            int r3 = QfgSZK.QYvkLl.kcP
            int r5 = r3 + 26
            r6 = 13
            if (r5 == r6) goto L23
            r6 = 159(0x9f, float:2.23E-43)
            if (r5 == r6) goto L1e
            goto L11
        L1e:
            int r3 = r3 >> 83
            r3 = r3 ^ 5289(0x14a9, float:7.411E-42)
            goto L26
        L23:
            int r3 = r3 + r3
            r3 = r3 ^ 3102(0xc1e, float:4.347E-42)
        L26:
            QfgSZK.QYvkLl.kcP = r3
        L28:
            int r3 = QfgSZK.QYvkLl.RDk
            r3 = r3 ^ 2513(0x9d1, float:3.521E-42)
            r5 = 28
            if (r3 == 0) goto Lb4
            int r3 = QfgSZK.QYvkLl.kcP
            r3 = r3 ^ 4730(0x127a, float:6.628E-42)
            if (r3 == 0) goto L56
        L36:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 156
            r1 = 52
            if (r0 == r1) goto L4d
            r1 = 243(0xf3, float:3.4E-43)
            if (r0 == r1) goto L43
            goto L36
        L43:
            int r0 = QfgSZK.QYvkLl.kcP
            int r0 = r0 % 16
            int r0 = r0 + r11
            int r0 = r0 * 76
            QfgSZK.QYvkLl.kcP = r0
            goto L43
        L4d:
            int r11 = QfgSZK.QYvkLl.kcP
            int r11 = r11 >> 14
            int r11 = r11 * 20
            QfgSZK.QYvkLl.kcP = r11
            goto L4d
        L56:
            int r3 = QfgSZK.QYvkLl.RDk
            int r6 = r3 + 78
            r7 = 3
            if (r6 == r7) goto L5e
            goto L56
        L5e:
            int r6 = QfgSZK.QYvkLl.kcP
            r6 = r6 ^ 4730(0x127a, float:6.628E-42)
            if (r6 == 0) goto L7f
        L64:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 182
            if (r0 == r5) goto L78
            r11 = 70
            if (r0 == r11) goto L6f
            goto L64
        L6f:
            int r11 = QfgSZK.QYvkLl.kcP
            int r11 = r11 >> 92
            int r11 = r11 % 87
            QfgSZK.QYvkLl.kcP = r11
            goto L6f
        L78:
            int r11 = r11 * 75
            int r11 = r11 % 99
            QfgSZK.QYvkLl.kcP = r11
            goto L64
        L7f:
            if (r6 == 0) goto Lae
        L81:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 247
            r1 = 95
            if (r0 == r1) goto La0
            r2 = 131(0x83, float:1.84E-43)
            if (r0 == r2) goto L9c
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 == r1) goto La5
            r1 = 336(0x150, float:4.71E-43)
            if (r0 == r1) goto L96
            goto L81
        L96:
            int r11 = r11 + r11
            int r11 = r11 % 64
            int r11 = r11 >> 66
            goto Lab
        L9c:
            r11 = r11 ^ 3291(0xcdb, float:4.612E-42)
            int r11 = r11 >> r1
            goto La3
        La0:
            r0 = 206(0xce, float:2.89E-43)
            int r11 = r11 >> r0
        La3:
            QfgSZK.QYvkLl.kcP = r11
        La5:
            int r11 = QfgSZK.QYvkLl.kcP
            r11 = r11 ^ 4212(0x1074, float:5.902E-42)
            int r11 = r11 >> 43
        Lab:
            QfgSZK.QYvkLl.kcP = r11
            goto L81
        Lae:
            int r3 = r3 * 1643
            r3 = r3 ^ 2527(0x9df, float:3.541E-42)
            QfgSZK.QYvkLl.RDk = r3
        Lb4:
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r2 = 0
            r3 = 75
            if (r1 != 0) goto L176
            int r1 = QfgSZK.QYvkLl.RDk
            int r8 = QfgSZK.QYvkLl.kcP
            if (r8 > r4) goto Lf8
        Lc3:
            int r9 = QfgSZK.QYvkLl.kcP
            int r11 = r9 + 91
            r0 = 84
            if (r11 == r0) goto Lf1
            r0 = 260(0x104, float:3.64E-43)
            if (r11 == r0) goto Lde
            r0 = 301(0x12d, float:4.22E-43)
            if (r11 == r0) goto Ld8
            r0 = 461(0x1cd, float:6.46E-43)
            if (r11 == r0) goto Le6
            goto Lc3
        Ld8:
            int r9 = r9 % r5
            int r9 = r9 % 111
            QfgSZK.QYvkLl.kcP = r9
            goto Le6
        Lde:
            int r11 = QfgSZK.QYvkLl.kcP
            int r11 = r11 * 7194
            int r11 = r11 % 66
            QfgSZK.QYvkLl.kcP = r11
        Le6:
            int r11 = QfgSZK.QYvkLl.kcP
            r11 = r11 ^ 3050(0xbea, float:4.274E-42)
            int r11 = r11 % 61
            int r11 = r11 % 92
            QfgSZK.QYvkLl.kcP = r11
            goto Lde
        Lf1:
            int r11 = QfgSZK.QYvkLl.kcP
            int r11 = r11 + r9
            int r11 = r11 >> r3
            QfgSZK.QYvkLl.kcP = r11
            goto Lf1
        Lf8:
            r5 = 2512(0x9d0, float:3.52E-42)
            if (r1 > r5) goto L174
            r1 = r8 ^ 4730(0x127a, float:6.628E-42)
            if (r1 == 0) goto L10f
        L100:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 104
            r1 = 45
            if (r0 == r1) goto L109
            goto L100
        L109:
            r0 = r11 ^ 1757(0x6dd, float:2.462E-42)
            int r0 = r0 + r11
            QfgSZK.QYvkLl.kcP = r0
            goto L100
        L10f:
            int r1 = QfgSZK.QYvkLl.RDk
            int r5 = r1 + 39
            r8 = 8
            if (r5 == r8) goto L136
            r8 = 114(0x72, float:1.6E-43)
            if (r5 == r8) goto L11c
            goto L10f
        L11c:
            int r1 = r1 % 118
            int r1 = r1 % 67
            QfgSZK.QYvkLl.RDk = r1
            int r1 = QfgSZK.QYvkLl.kcP
            if (r1 > r4) goto L174
        L126:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 143
            r1 = 19
            if (r0 == r1) goto L12f
            goto L126
        L12f:
            r11 = r11 ^ 2368(0x940, float:3.318E-42)
            int r11 = r11 >> 16
            QfgSZK.QYvkLl.kcP = r11
            goto L126
        L136:
            int r11 = QfgSZK.QYvkLl.RDk
            r11 = r11 ^ 1138(0x472, float:1.595E-42)
            int r11 = r11 * 80
            QfgSZK.QYvkLl.RDk = r11
            int r11 = QfgSZK.QYvkLl.kcP
            if (r11 > r4) goto L136
        L142:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 117
            r1 = 53
            if (r0 == r1) goto L165
            r1 = 248(0xf8, float:3.48E-43)
            if (r0 == r1) goto L16d
            r1 = 281(0x119, float:3.94E-43)
            if (r0 == r1) goto L15c
            r1 = 295(0x127, float:4.13E-43)
            if (r0 == r1) goto L157
            goto L142
        L157:
            int r0 = r11 % 48
            r0 = r0 ^ 4002(0xfa2, float:5.608E-42)
            goto L171
        L15c:
            int r0 = QfgSZK.QYvkLl.kcP
            int r0 = r0 % 102
            int r0 = r0 + r11
            int r0 = r0 + r11
            QfgSZK.QYvkLl.kcP = r0
            goto L15c
        L165:
            int r0 = QfgSZK.QYvkLl.kcP
            r0 = r0 ^ 2447(0x98f, float:3.429E-42)
            int r0 = r0 % 37
            QfgSZK.QYvkLl.kcP = r0
        L16d:
            int r0 = QfgSZK.QYvkLl.kcP
            int r0 = r0 + r11
            int r0 = r0 + r11
        L171:
            QfgSZK.QYvkLl.kcP = r0
            goto L165
        L174:
            r1 = r2
            goto L17c
        L176:
            long r4 = r10.OOCXdF
            java.lang.String r1 = java.lang.Long.toString(r4)
        L17c:
            r11.put(r0, r1)
            QfgSZK.AhwBna r0 = QfgSZK.AhwBna.APP_MODIFICATION_TIME
            java.lang.String r0 = r0.DbNXlk()
            long r4 = r10.ahitRw
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L1c2
            int r1 = QfgSZK.QYvkLl.RDk
            r1 = r1 ^ 2513(0x9d1, float:3.521E-42)
            if (r1 == 0) goto L1c6
        L191:
            int r11 = QfgSZK.QYvkLl.RDk
            int r0 = r11 + 65
            if (r0 == r3) goto L198
            goto L191
        L198:
            int r0 = r11 * 2356
            int r0 = r0 + r11
            QfgSZK.QYvkLl.RDk = r0
            int r11 = QfgSZK.QYvkLl.kcP
            r11 = r11 ^ 4730(0x127a, float:6.628E-42)
            if (r11 == 0) goto L191
        L1a3:
            int r11 = QfgSZK.QYvkLl.kcP
            int r0 = r11 + 65
            r1 = 68
            if (r0 == r1) goto L1b8
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L1b0
            goto L1a3
        L1b0:
            int r0 = r11 * 10
            int r0 = r0 % 34
            int r0 = r0 + r11
            QfgSZK.QYvkLl.kcP = r0
            goto L1a3
        L1b8:
            int r0 = QfgSZK.QYvkLl.kcP
            int r0 = r0 % 101
            int r0 = r0 + r11
            int r0 = r0 * 86
            QfgSZK.QYvkLl.kcP = r0
            goto L1b8
        L1c2:
            java.lang.String r2 = java.lang.Long.toString(r4)
        L1c6:
            r11.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.QYvkLl.gHZMYf(java.util.Map):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_APP_INSTALLATION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:65:0x00ec) to fix multi-entry loop: BACK_EDGE: B:65:0x00ec -> B:66:0x00ee */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if ((r3 ^ 4730) != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if ((QfgSZK.QYvkLl.kcP ^ 4730) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
    
        r9 = QfgSZK.QYvkLl.kcP;
        r10 = r9 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0108, code lost:
    
        if (r10 == 92) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010c, code lost:
    
        if (r10 == 191) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010f, code lost:
    
        QfgSZK.QYvkLl.kcP = ((QfgSZK.QYvkLl.kcP * com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) + r9) % 59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0119, code lost:
    
        QfgSZK.QYvkLl.kcP = (QfgSZK.QYvkLl.kcP >> 89) * okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00cf -> B:67:0x00f5). Please report as a decompilation issue!!! */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (qSusPL.aPFruk() == null) {
            return;
        }
        long j = this.OOCXdF;
        if (kcP <= 4729) {
            do {
                int i10 = kcP;
                i9 = i10 + 26;
                if (i9 == 7) {
                    while (true) {
                        kcP = (kcP + i10) ^ 951;
                    }
                }
            } while (i9 != 40);
            while (true) {
                kcP = (kcP * 39) >> 61;
            }
        } else {
            if (RDk <= 2512) {
                do {
                    i = RDk;
                    i2 = kcP;
                    if (i2 <= 4729) {
                        while (true) {
                            i3 = kcP;
                            int i11 = i3 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                            if (i11 == 28) {
                                break;
                            } else if (i11 == 135) {
                                kcP = ((i3 ^ 4306) % 11) * 17;
                            }
                        }
                        while (true) {
                            kcP = kcP + i3 + i3 + i3;
                        }
                    } else {
                        i4 = i + 39;
                        if (i4 != 49) {
                            if (i4 == 141) {
                                RDk = (i % 36) * 7848;
                            } else if (i4 == 332) {
                                RDk = (RDk + i) % 4;
                            }
                        }
                        int i12 = RDk;
                        if ((kcP ^ 4730) != 0) {
                            do {
                                i7 = kcP;
                            } while (i7 + 117 != 6);
                            kcP = ((i7 >> 59) + i7) ^ 1728;
                        }
                        if (kcP <= 4729) {
                            do {
                                i6 = kcP;
                            } while (i6 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 != 83);
                            kcP = ((i6 >> 66) + i6) * 37;
                        }
                        RDk = ((i12 ^ 3265) + i) ^ 3138;
                        if (kcP <= 4729) {
                            do {
                                int i13 = kcP;
                                i5 = i13 + 91;
                                if (i5 == 33) {
                                    kcP = ((i13 ^ 5499) >> 6) % 119;
                                } else if (i5 != 52) {
                                }
                                kcP >>= 52;
                                break;
                            } while (i5 != 124);
                            while (true) {
                                kcP = ((kcP ^ 1203) % 6) % 28;
                            }
                        }
                        RDk = (RDk + i) % 4;
                    }
                } while (i4 != 454);
                RDk = ((i * 86) ^ 4112) >> 84;
                if ((i2 ^ 4730) != 0) {
                    do {
                        int i14 = kcP;
                        i8 = i14 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                        if (i8 == 74) {
                            while (true) {
                                kcP = (kcP + i14) % 87;
                            }
                        }
                    } while (i8 != 135);
                    while (true) {
                        kcP = (kcP >> 73) * 63;
                    }
                }
            }
            if (j != 0 || this.ahitRw != 0) {
                return;
            }
            this.OOCXdF = DGUQLI.gUEfcq(qSusPL.aPFruk());
            if ((kcP ^ 4730) == 0) {
                this.ahitRw = DGUQLI.zAEkPU(qSusPL.aPFruk());
                UkCIYP();
                return;
            }
            while (true) {
                int i15 = kcP;
                int i16 = i15 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                if (i16 != 27) {
                    if (i16 == 190) {
                        kcP = (i15 + i15) >> 32;
                    }
                }
                kcP = ((kcP % 27) ^ 5153) * 45;
            }
        }
    }
}
