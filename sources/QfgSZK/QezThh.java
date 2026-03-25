package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class QezThh extends QhsCdE {

    /* JADX INFO: Incorrect field signature: Lint; */
    static String DxSLAc = null;
    public static int ECt = 5150;
    public static int KME;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String ddpCNf;
    private String UvmTdv;
    private String aLOOzv;
    private Map<String, String> aRKiue;
    private String frdPCj;
    private String iqEfJT;
    private int zDvCOT;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        KME = 3653;
        sFt(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QezThh(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void sFt(boolean z) {
        if (z) {
            sFt(false);
        }
        if (ECt <= 5149) {
            while (true) {
                int i = ECt;
                int i2 = i + 26;
                if (i2 != 62) {
                    if (i2 == 202) {
                        ECt = (i ^ 4655) + i;
                        break;
                    } else if (i2 == 223) {
                        ECt = ((i + i) % 117) >> 75;
                    }
                } else {
                    break;
                }
            }
            ECt = (ECt ^ 2610) * 9064;
        }
        DxSLAc = GCXiNH.fsw("PtVXDE`r");
        ddpCNf = GCXiNH.fsw("AU\u0010");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        int i2;
        if (map == null) {
            return;
        }
        map.put(AhwBna.NUM_OF_CPU_CORES.DbNXlk(), Integer.toString(this.zDvCOT));
        if (ECt <= 5149) {
            while (true) {
                int i3 = ECt;
                int i4 = i3 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                if (i4 != 65) {
                    if (i4 == 89) {
                        ECt = (i3 * 45) + i3;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                ECt = (ECt >> 125) ^ 3745;
            }
        } else {
            if (this.frdPCj != null) {
                map.put(AhwBna.DEVICE_FINGERPRINT.DbNXlk(), UPbYzn.iTrKTi(this.frdPCj));
            }
            if (this.iqEfJT != null) {
                String strDbNXlk = AhwBna.CPU_NAME.DbNXlk();
                if (KME <= 3652) {
                    if (ECt <= 5149) {
                        while (true) {
                            i2 = ECt;
                            int i5 = i2 + 78;
                            if (i5 == 83) {
                                ECt = ((i2 * 124) % 88) >> 114;
                                break;
                            } else if (i5 == 122) {
                                break;
                            } else if (i5 == 268) {
                                ECt = i2 >> 88;
                            }
                        }
                        ECt = ((ECt + i2) + i2) ^ 1034;
                    }
                    while (KME + 78 != 70) {
                    }
                    while (true) {
                        KME = ((KME >> 6) % 74) % 39;
                    }
                } else {
                    map.put(strDbNXlk, UPbYzn.iTrKTi(this.iqEfJT));
                }
            }
            if (this.UvmTdv != null) {
                String strDbNXlk2 = AhwBna.CPU_SPEED.DbNXlk();
                String strITrKTi = UPbYzn.iTrKTi(this.UvmTdv);
                if (ECt <= 5149) {
                    while (true) {
                        int i6 = ECt;
                        int i7 = i6 + 65;
                        if (i7 == 48) {
                            ECt = (i6 >> 79) + i6;
                            break;
                        } else if (i7 == 96) {
                            while (true) {
                                ECt = ((ECt >> 37) % 65) + i6;
                            }
                        } else if (i7 == 282) {
                            break;
                        }
                    }
                    while (true) {
                        ECt = (ECt * 125) >> 22;
                    }
                } else {
                    map.put(strDbNXlk2, strITrKTi);
                }
            }
            if (this.aLOOzv == null) {
                return;
            }
            AhwBna ahwBna = AhwBna.MEM_TOTAL;
            if (ECt > 5149) {
                map.put(ahwBna.DbNXlk(), UPbYzn.iTrKTi(this.aLOOzv));
            } else {
                do {
                    i = ECt;
                } while (i + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 != 82);
                while (true) {
                    ECt = (ECt + i) ^ 1105;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DEVICEINFO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:45:0x00ac) to fix multi-entry loop: BACK_EDGE: B:45:0x00ac -> B:46:0x00ae */
    /* JADX DEBUG: Duplicate block (B:75:0x011e) to fix multi-entry loop: BACK_EDGE: B:74:0x0114 -> B:75:0x011e */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QfgSZK.QSusPL r4, java.util.Map<java.lang.String, java.lang.String> r5) throws java.lang.InterruptedException {
        /*
            r3 = this;
            QfgSZK.ZqidTP r5 = r4.aPFruk()
            if (r5 != 0) goto L7
            return
        L7:
            int r5 = QfgSZK.DGUQLI.gkJEwt()
            r3.zDvCOT = r5
            java.lang.String r5 = QfgSZK.DGUQLI.aJFbMH(r5)
            r3.UvmTdv = r5
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.aRKiue
            if (r5 != 0) goto L1d
            java.util.Map r5 = QfgSZK.DGUQLI.hlkKmr()
            r3.aRKiue = r5
        L1d:
            java.util.Map r5 = QfgSZK.DGUQLI.zKcAg()
            java.lang.String r0 = r3.frdPCj
            if (r0 != 0) goto L31
            QfgSZK.ZqidTP r4 = r4.aPFruk()
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.aRKiue
            java.lang.String r4 = QfgSZK.DGUQLI.QIZEnU(r4, r0, r5)
            r3.frdPCj = r4
        L31:
            java.lang.String r4 = r3.iqEfJT
            if (r4 != 0) goto L3d
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.aRKiue
            java.lang.String r4 = QfgSZK.DGUQLI.OTwTPd(r4)
            r3.iqEfJT = r4
        L3d:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L13d
            int r4 = QfgSZK.QezThh.ECt
            r4 = r4 ^ 5150(0x141e, float:7.217E-42)
            if (r4 == 0) goto L59
        L49:
            int r4 = QfgSZK.QezThh.ECt
            int r0 = r4 + 286
            r1 = 67
            if (r0 == r1) goto L52
            goto L49
        L52:
            int r4 = r4 + r4
            int r4 = r4 >> 87
            r4 = r4 ^ 3740(0xe9c, float:5.241E-42)
            QfgSZK.QezThh.ECt = r4
        L59:
            java.lang.String r4 = QfgSZK.QezThh.DxSLAc
            boolean r4 = r5.containsKey(r4)
            if (r4 == 0) goto Lc0
            java.lang.String r4 = QfgSZK.QezThh.DxSLAc
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r5 = QfgSZK.QezThh.KME
            r5 = r5 ^ 3653(0xe45, float:5.119E-42)
            if (r5 == 0) goto Lc1
        L6f:
            int r5 = QfgSZK.QezThh.KME
            int r0 = r5 + 91
            r1 = 75
            r2 = 85
            if (r0 == r1) goto Lb7
            r1 = 241(0xf1, float:3.38E-43)
            if (r0 == r1) goto L93
            r1 = 437(0x1b5, float:6.12E-43)
            if (r0 == r1) goto L8d
            r1 = 595(0x253, float:8.34E-43)
            if (r0 == r1) goto L86
            goto L6f
        L86:
            int r5 = r5 >> 76
            r5 = r5 ^ 2063(0x80f, float:2.891E-42)
            QfgSZK.QezThh.KME = r5
            goto Lc1
        L8d:
            int r5 = r5 + r5
            r5 = r5 ^ 1666(0x682, float:2.335E-42)
            QfgSZK.QezThh.KME = r5
            goto L6f
        L93:
            r5 = r5 ^ 3364(0xd24, float:4.714E-42)
            QfgSZK.QezThh.KME = r5
            int r5 = QfgSZK.QezThh.ECt
            r5 = r5 ^ 5150(0x141e, float:7.217E-42)
            if (r5 == 0) goto Lc1
        L9d:
            int r4 = QfgSZK.QezThh.ECt
            int r5 = r4 + 156
            if (r5 == r2) goto La8
            r4 = 201(0xc9, float:2.82E-43)
            if (r5 == r4) goto Lae
            goto L9d
        La8:
            int r4 = r4 % 46
            int r4 = r4 >> 82
        Lac:
            QfgSZK.QezThh.ECt = r4
        Lae:
            int r4 = QfgSZK.QezThh.ECt
            int r4 = r4 % 14
            r4 = r4 ^ 1327(0x52f, float:1.86E-42)
            int r4 = r4 % 126
            goto Lac
        Lb7:
            int r4 = QfgSZK.QezThh.KME
            int r4 = r4 >> r2
            int r4 = r4 + r5
            int r4 = r4 % 53
            QfgSZK.QezThh.KME = r4
            goto Lb7
        Lc0:
            r4 = 0
        Lc1:
            r3.aLOOzv = r4
            if (r4 == 0) goto L13d
            int r4 = QfgSZK.QezThh.KME
            r5 = 3652(0xe44, float:5.118E-42)
            if (r4 > r5) goto L131
        Lcb:
            int r4 = QfgSZK.QezThh.KME
            int r5 = r4 + 104
            r0 = 4
            if (r5 == r0) goto L126
            r0 = 93
            if (r5 == r0) goto Le2
            r0 = 267(0x10b, float:3.74E-43)
            if (r5 == r0) goto Ldb
            goto Lcb
        Ldb:
            r4 = r4 ^ 2234(0x8ba, float:3.13E-42)
            int r4 = r4 % 11
            QfgSZK.QezThh.KME = r4
            goto L131
        Le2:
            int r4 = QfgSZK.QezThh.KME
            r4 = r4 ^ 1751(0x6d7, float:2.454E-42)
            int r4 = r4 * 105
            QfgSZK.QezThh.KME = r4
            int r4 = QfgSZK.QezThh.ECt
            r5 = 5149(0x141d, float:7.215E-42)
            if (r4 > r5) goto Le2
        Lf0:
            int r4 = QfgSZK.QezThh.ECt
            int r5 = r4 + 208
            r0 = 48
            if (r5 == r0) goto L105
            r0 = 116(0x74, float:1.63E-43)
            if (r5 == r0) goto L10d
            r0 = 194(0xc2, float:2.72E-43)
            if (r5 == r0) goto L114
            r0 = 326(0x146, float:4.57E-43)
            if (r5 == r0) goto L11e
            goto Lf0
        L105:
            int r5 = QfgSZK.QezThh.ECt
            r5 = r5 ^ 4307(0x10d3, float:6.035E-42)
            int r5 = r5 + r4
            int r5 = r5 + r4
            QfgSZK.QezThh.ECt = r5
        L10d:
            int r5 = QfgSZK.QezThh.ECt
            int r5 = r5 + r4
            int r5 = r5 * 9052
            QfgSZK.QezThh.ECt = r5
        L114:
            int r5 = QfgSZK.QezThh.ECt
            int r5 = r5 % 70
            r5 = r5 ^ 1489(0x5d1, float:2.087E-42)
            int r5 = r5 >> 92
            QfgSZK.QezThh.ECt = r5
        L11e:
            int r5 = QfgSZK.QezThh.ECt
            int r5 = r5 + r4
            int r5 = r5 * 83
            QfgSZK.QezThh.ECt = r5
            goto L105
        L126:
            int r4 = QfgSZK.QezThh.KME
            int r4 = r4 % 74
            r4 = r4 ^ 1400(0x578, float:1.962E-42)
            int r4 = r4 >> 57
            QfgSZK.QezThh.KME = r4
            goto L126
        L131:
            java.lang.String r4 = r3.aLOOzv
            java.lang.String r5 = QfgSZK.QezThh.ddpCNf
            java.lang.String r0 = ""
            java.lang.String r4 = r4.replaceAll(r5, r0)
            r3.aLOOzv = r4
        L13d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.QezThh.zuBGHE(QfgSZK.QSusPL, java.util.Map):void");
    }
}
