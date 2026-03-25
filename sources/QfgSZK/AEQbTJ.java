package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.security.keystore.KeyInfo;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes.dex */
class AEQbTJ {
    private static String DlIaRS;
    public static int Eei;
    public static int fYu;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        fYu = 6474;
        FQMcgE.usN = 6842;
        Eei = 9585;
        if (fYu > 6473) {
            GCXiNH.OHr = 2270;
            DlIaRS = FQMcgE.hfdhUn(AEQbTJ.class);
            return;
        }
        while (true) {
            int i = fYu;
            int i2 = i + 13;
            if (i2 == 4) {
                fYu = (i % 97) * 73;
            } else if (i2 == 14) {
                break;
            }
        }
        while (true) {
            fYu *= 40204;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(PrivateKey privateKey, String str) {
        KeyInfo keyInfoKWHzl = KWHzl(privateKey, str);
        if (keyInfoKWHzl != null) {
            boolean zIsInsideSecureHardware = keyInfoKWHzl.isInsideSecureHardware();
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("UpIh\\Ps{,JC@ALL\u0007") + zIsInsideSecureHardware);
            return zIsInsideSecureHardware;
        }
        if ((fYu ^ 6474) == 0) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011bviKI\u0003ALQ\u0007BLDV\u001e\u0011BJOHUI_]\u0018TJdwpgr _^l$ee}(f`t}\u007fss|j0"));
            return false;
        }
        while (true) {
            int i = fYu;
            if (i + 26 == 91) {
                fYu = ((i % 23) ^ 2321) * 66;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:54:0x0105) to fix multi-entry loop: BACK_EDGE: B:53:0x00fc -> B:54:0x0105 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[LOOP:5: B:17:0x0061->B:79:0x0061, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static KeyInfo KWHzl(PrivateKey privateKey, String str) {
        int i;
        int i2;
        int i3;
        if (!HJWChP.QdUnVm.RWIpjU() || HJWChP.RGtXKC.DKRTZD.diCPdz < 23 || privateKey == null) {
            return null;
        }
        try {
            return (KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), str).getKeySpec(privateKey, KeyInfo.class);
        } catch (NoSuchAlgorithmException e) {
            FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011mqmL\u0002WBL\blSLgG]CU\u000fE@"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if ((Eei ^ 9585) == 0) {
                return null;
            }
            do {
                int i4 = Eei;
                i = i4 + 39;
                if (i == 78) {
                    Eei = (i4 * 15) >> 90;
                } else if (i != 113) {
                    if (i == 297) {
                        Eei = ((Eei % 49) % 96) % 125;
                        if (fYu > 6473) {
                            do {
                                Eei = (Eei >> 26) % 71;
                            } while ((fYu ^ 6474) == 0);
                        }
                        while (true) {
                            i2 = fYu;
                            i3 = i2 + 104;
                            if (i3 == 67) {
                                while (true) {
                                    fYu = (fYu >> 92) ^ 2582;
                                }
                            } else if (i3 != 147) {
                                if (i3 == 291) {
                                    fYu = (fYu + i2) % 69;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            fYu = ((fYu + i2) >> 101) ^ 4881;
                            fYu = (fYu + i2) % 69;
                        }
                    }
                }
                Eei = (Eei % 63) ^ 2722;
                Eei = ((Eei % 49) % 96) % 125;
                if (fYu > 6473) {
                }
                while (true) {
                    i2 = fYu;
                    i3 = i2 + 104;
                    if (i3 == 67) {
                    }
                }
                while (true) {
                    fYu = ((fYu + i2) >> 101) ^ 4881;
                    fYu = (fYu + i2) % 69;
                }
            } while (i != 388);
            do {
                Eei = (Eei >> 26) % 71;
            } while ((fYu ^ 6474) == 0);
            while (true) {
                i2 = fYu;
                i3 = i2 + 104;
                if (i3 == 67) {
                }
            }
            while (true) {
                fYu = ((fYu + i2) >> 101) ^ 4881;
                fYu = (fYu + i2) % 69;
            }
        } catch (NoSuchProviderException e2) {
            e = e2;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if ((fYu ^ 6474) != 0) {
                return null;
            }
            while (true) {
                int i5 = fYu;
                int i6 = i5 + 39;
                if (i6 != 82) {
                    if (i6 == 187) {
                        fYu = (fYu ^ 1053) >> 29;
                    } else if (i6 == 246) {
                        fYu = ((i5 % 62) >> 96) * 2;
                    }
                }
                fYu = ((fYu + i5) * 27) ^ 1744;
                fYu = (fYu ^ 1053) >> 29;
            }
        } catch (InvalidKeySpecException e3) {
            e = e3;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if ((fYu ^ 6474) != 0) {
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012\u0019BZPIUV_\u0019]OE`twknn\u0017\fry"), th.toString());
            ORrpqH.uzCIH().seuMaA(th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:29:0x00b6) to fix multi-entry loop: BACK_EDGE: B:29:0x00b6 -> B:28:0x00b4 */
    /* JADX WARN: Path cross not found for [B:90:?, B:81:?], limit reached: 102 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x016f -> B:57:0x0133). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.security.KeyPair OLrzqt(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "^pU+_\u0011bliIVF\nbM^fT]A\u0012JM"
            boolean r1 = QfgSZK.HJWChP.QdUnVm.RWIpjU()
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r6 = QfgSZK.AEQbTJ.DlIaRS
            java.lang.String r7 = "^pU+_\u0011f{bMPB^L\bLSLG\u001f\u0012CU^KTN^^\u0019[[Gvwfq!aLI)jd~)iqw|xrp}u!"
            java.lang.String r7 = QfgSZK.GCXiNH.fsw(r7)
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r6, r7)
            return r2
        L15:
            boolean r1 = android.security.KeyChain.isKeyAlgorithmSupported(r6)
            if (r1 != 0) goto L1c
            return r2
        L1c:
            java.security.KeyPairGenerator r7 = java.security.KeyPairGenerator.getInstance(r6, r7)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            r3 = 5
            r1.<init>(r8, r3)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            r8 = 1
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            java.lang.String r4 = "NYz!\u0019\u00047"
            java.lang.String r4 = QfgSZK.GCXiNH.fsw(r4)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setDigests(r3)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            java.lang.String r3 = "OBz"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            boolean r6 = r3.equals(r6)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            if (r6 == 0) goto L50
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            java.lang.String r8 = "MZx_\u001a"
            java.lang.String r8 = QfgSZK.GCXiNH.fsw(r8)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            r6[r5] = r8     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setSignaturePaddings(r6)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
        L50:
            android.security.keystore.KeyGenParameterSpec r6 = r1.build()     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            r7.initialize(r6)     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            java.security.KeyPair r6 = r7.generateKeyPair()     // Catch: java.lang.Throwable -> L5c java.security.NoSuchAlgorithmException -> L79 java.security.NoSuchProviderException -> Lbd java.security.InvalidAlgorithmParameterException -> Lbf
            return r6
        L5c:
            r6 = move-exception
            java.lang.String r7 = QfgSZK.AEQbTJ.DlIaRS
            java.lang.String r8 = "^pU+_\u0011bliIVF\nbM^fT]A\u0012\u0019BZPIUV_\u0019]OE`twknn\u0017\fry"
            java.lang.String r8 = QfgSZK.GCXiNH.fsw(r8)
            java.lang.String r0 = r6.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            QfgSZK.FQMcgE.svhCHd(r7, r8, r0)
            QfgSZK.ORrpqH r7 = QfgSZK.ORrpqH.uzCIH()
            r7.seuMaA(r6)
            goto L176
        L79:
            r6 = move-exception
            java.lang.String r7 = QfgSZK.AEQbTJ.DlIaRS
            java.lang.String r8 = QfgSZK.GCXiNH.fsw(r0)
            java.lang.String r0 = r6.toString()
            QfgSZK.FQMcgE.fQMcgE.OijiEz(r7, r8, r0)
            QfgSZK.ORrpqH r7 = QfgSZK.ORrpqH.uzCIH()
            r7.seuMaA(r6)
            int r6 = QfgSZK.AEQbTJ.fYu
            r6 = r6 ^ 6474(0x194a, float:9.072E-42)
            if (r6 == 0) goto L176
        L94:
            int r6 = QfgSZK.AEQbTJ.fYu
            int r7 = r6 + 52
            r8 = 51
            if (r7 == r8) goto Lac
            r8 = 59
            if (r7 == r8) goto Lb6
            r8 = 181(0xb5, float:2.54E-43)
            if (r7 == r8) goto La5
            goto L94
        La5:
            int r7 = r6 % 68
            r7 = r7 ^ 2520(0x9d8, float:3.531E-42)
            int r7 = r7 + r6
            QfgSZK.AEQbTJ.fYu = r7
        Lac:
            int r6 = QfgSZK.AEQbTJ.fYu
            int r6 = r6 * 102
            int r6 = r6 % 16
            int r6 = r6 * 96
        Lb4:
            QfgSZK.AEQbTJ.fYu = r6
        Lb6:
            int r6 = QfgSZK.AEQbTJ.fYu
            int r6 = r6 % 60
            int r6 = r6 * 28
            goto Lb4
        Lbd:
            r6 = move-exception
            goto Lc0
        Lbf:
            r6 = move-exception
        Lc0:
            java.lang.String r7 = QfgSZK.AEQbTJ.DlIaRS
            java.lang.String r8 = QfgSZK.GCXiNH.fsw(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            QfgSZK.FQMcgE.OijiEz(r7, r8, r0)
            QfgSZK.ORrpqH r7 = QfgSZK.ORrpqH.uzCIH()
            r7.seuMaA(r6)
            int r6 = QfgSZK.AEQbTJ.Eei
            r7 = 9584(0x2570, float:1.343E-41)
            if (r6 > r7) goto L176
        Lde:
            int r6 = QfgSZK.AEQbTJ.Eei
            int r7 = r6 + 52
            r8 = 42
            if (r7 == r8) goto L133
            r8 = 56
            if (r7 == r8) goto Lfc
            r8 = 159(0x9f, float:2.23E-43)
            if (r7 == r8) goto Lef
            goto Lde
        Lef:
            int r7 = r6 * 4
            int r7 = r7 >> 78
            QfgSZK.AEQbTJ.Eei = r7
            int r7 = QfgSZK.AEQbTJ.fYu
            r7 = r7 ^ 6474(0x194a, float:9.072E-42)
            if (r7 == 0) goto L133
            goto L140
        Lfc:
            int r6 = QfgSZK.AEQbTJ.Eei
            int r6 = r6 % 66
            r6 = r6 ^ 2688(0xa80, float:3.767E-42)
            QfgSZK.AEQbTJ.Eei = r6
            int r6 = QfgSZK.AEQbTJ.fYu
            r7 = 6473(0x1949, float:9.07E-42)
            if (r6 > r7) goto Lfc
        L10a:
            int r6 = QfgSZK.AEQbTJ.fYu
            int r7 = r6 + 91
            r8 = 99
            if (r7 == r8) goto L12c
            r8 = 198(0xc6, float:2.77E-43)
            if (r7 == r8) goto L122
            r8 = 383(0x17f, float:5.37E-43)
            if (r7 == r8) goto L11b
            goto L10a
        L11b:
            int r7 = QfgSZK.AEQbTJ.fYu
            int r7 = r7 + r6
            int r7 = r7 + r6
            QfgSZK.AEQbTJ.fYu = r7
            goto L11b
        L122:
            int r6 = QfgSZK.AEQbTJ.fYu
            int r6 = r6 * 58
            r7 = 169(0xa9, float:2.37E-43)
            int r6 = r6 >> r7
            QfgSZK.AEQbTJ.fYu = r6
            goto L122
        L12c:
            int r6 = r6 >> 9
            int r6 = r6 % 81
            QfgSZK.AEQbTJ.fYu = r6
            goto L10a
        L133:
            int r7 = QfgSZK.AEQbTJ.Eei
            int r7 = r7 + r6
            r7 = r7 ^ 2639(0xa4f, float:3.698E-42)
            QfgSZK.AEQbTJ.Eei = r7
            int r7 = QfgSZK.AEQbTJ.fYu
            r7 = r7 ^ 6474(0x194a, float:9.072E-42)
            if (r7 == 0) goto L133
        L140:
            int r7 = QfgSZK.AEQbTJ.fYu
            int r8 = r7 + 78
            r0 = 91
            if (r8 == r0) goto L16f
            r0 = 269(0x10d, float:3.77E-43)
            if (r8 == r0) goto L166
            r0 = 367(0x16f, float:5.14E-43)
            if (r8 == r0) goto L15f
            r0 = 493(0x1ed, float:6.91E-43)
            if (r8 == r0) goto L155
            goto L140
        L155:
            int r6 = QfgSZK.AEQbTJ.fYu
            int r6 = r6 >> 82
            int r6 = r6 + r7
            int r6 = r6 >> 20
            QfgSZK.AEQbTJ.fYu = r6
            goto L155
        L15f:
            int r8 = r7 * 100
            int r8 = r8 + r7
            int r8 = r8 * 39
            QfgSZK.AEQbTJ.fYu = r8
        L166:
            int r8 = QfgSZK.AEQbTJ.fYu
            int r8 = r8 + r7
            int r8 = r8 >> 83
            int r8 = r8 + r7
            QfgSZK.AEQbTJ.fYu = r8
            goto L140
        L16f:
            int r8 = r7 * 76
            int r8 = r8 + r7
            int r8 = r8 + r7
            QfgSZK.AEQbTJ.fYu = r8
            goto L133
        L176:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.AEQbTJ.OLrzqt(java.lang.String, java.lang.String, java.lang.String):java.security.KeyPair");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean djBIcL(PrivateKey privateKey, String str) {
        int i;
        int i2;
        KeyInfo keyInfoKWHzl = KWHzl(privateKey, str);
        if (keyInfoKWHzl == null) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011bviKI\u0003ALQ\u0007YG]T[_\u001c\u000fLXMNSK]S\u0006fhbqreM\fhvn*ggs6tbr{}qmrx2"));
            return true;
        }
        if (keyInfoKWHzl.getOrigin() != 1) {
            return false;
        }
        if (fYu > 6473) {
            return true;
        }
        do {
            i = fYu;
            i2 = i + 39;
            if (i2 == 44) {
                while (true) {
                    fYu *= 3024;
                }
            } else if (i2 == 205) {
                while (true) {
                    fYu = (fYu % 63) * 101;
                }
            }
        } while (i2 != 245);
        while (true) {
            fYu = (fYu + i) ^ 2227;
        }
    }
}
