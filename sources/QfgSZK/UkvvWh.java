package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.content.Context;
import android.security.KeyChain;
import android.security.KeyPairGeneratorSpec;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class UkvvWh {
    private static String DglbCd = null;
    private static String DlIaRS = null;
    public static int J_T = 0;
    public static int KeB = 7996;
    private static String OmPrvs = null;
    private static String QfHANa = null;
    private static String dBxXwc = null;
    private static boolean fZwuIs = false;
    private static PublicKey fuZRRl = null;
    static long gatkcr = 0;
    private static final long iNQVsq = 1656633600000L;
    static PrivateKey sDMsbj;
    private static boolean zYEBiQ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0067) to fix multi-entry loop: BACK_EDGE: B:16:0x0067 -> B:17:0x0069 */
    static {
        int i;
        int i2;
        int i3;
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        J_T = 2931;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        QfHANa = GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M");
        OmPrvs = GCXiNH.fsw("IcN\u007f_udxiFFFXzll");
        DglbCd = GCXiNH.fsw("upIh\\Ps{S[KGu");
        DlIaRS = FQMcgE.hfdhUn(UkvvWh.class);
        int i4 = KeB;
        if ((i4 ^ 7996) != 0) {
            do {
                int i5 = KeB;
                i3 = i5 + 13;
                if (i3 == 7) {
                    KeB = (i5 * 17) >> 48;
                } else if (i3 == 203) {
                    while (true) {
                        KeB = ((KeB % 46) * 72) + i5;
                    }
                } else if (i3 != 363) {
                }
                while (true) {
                    KeB = ((KeB % 91) + i5) ^ 3501;
                }
            } while (i3 != 397);
            while (true) {
                KeB = ((KeB % 43) * 76) >> 17;
            }
        } else {
            gatkcr = 0L;
            dBxXwc = null;
            fuZRRl = null;
            if (i4 > 7995) {
                sDMsbj = null;
                fZwuIs = false;
                zYEBiQ = false;
                return;
            }
            do {
                i = KeB;
                i2 = i + 26;
                if (i2 == 85) {
                    while (true) {
                        KeB = ((KeB >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + i) ^ 2150;
                    }
                } else if (i2 == 90) {
                    while (true) {
                        KeB = ((KeB + i) + i) >> 107;
                    }
                } else if (i2 == 185) {
                    while (true) {
                        KeB ^= 6372;
                    }
                }
            } while (i2 != 344);
            while (true) {
                KeB = (KeB + i) >> 19;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UkvvWh() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(PrivateKey privateKey, String str) {
        int i;
        if (privateKey == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011bviKI\u0003ALQ\u0007FG[CWCDF[N\u001c\u0013HLVCOha#gyc[\\}mdd (|k"), th.toString());
            ORrpqH.uzCIH().seuMaA(th);
        }
        if (HJWChP.QdUnVm.RWIpjU()) {
            return AEQbTJ.EZpvd(privateKey, str);
        }
        if (HJWChP.RGtXKC.DKRTZD.diCPdz < HJWChP.RGtXKC.C0004RGtXKC.UIwVdu && HJWChP.QdUnVm.ONJgbh()) {
            return KeyChain.isBoundKeyAlgorithm(privateKey.getAlgorithm());
        }
        if (J_T <= 2930) {
            if ((KeB ^ 7996) != 0) {
                do {
                    i = KeB;
                } while (i + 65 != 16);
                KeB = ((i >> 35) % 101) * 47;
            }
            while (true) {
                int i2 = J_T;
                int i3 = i2 + 52;
                if (i3 == 52) {
                    break;
                }
                if (i3 == 203) {
                    J_T = ((i2 + i2) * 118) >> 72;
                }
            }
            while (true) {
                J_T = (J_T % 10) % 117;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:30:0x00a6) to fix multi-entry loop: BACK_EDGE: B:29:0x009f -> B:30:0x00a6 */
    /* JADX DEBUG: Duplicate block (B:67:0x0160) to fix multi-entry loop: BACK_EDGE: B:66:0x0158 -> B:67:0x0160 */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        QfgSZK.UkvvWh.KeB = (QfgSZK.UkvvWh.KeB + r8) ^ 5122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if (QfgSZK.UkvvWh.KeB <= 7995) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        if (QfgSZK.UkvvWh.KeB <= 7995) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0111, code lost:
    
        r8 = QfgSZK.UkvvWh.KeB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if ((r8 + 65) == 75) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        QfgSZK.UkvvWh.KeB = ((r8 >> 103) * 25) ^ 4018;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        r8 = QfgSZK.UkvvWh.J_T + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (r8 == 20) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        if (r8 == 133) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        QfgSZK.UkvvWh.J_T = (QfgSZK.UkvvWh.J_T >> 50) * 115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        if (QfgSZK.UkvvWh.KeB > 7995) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        r8 = QfgSZK.UkvvWh.KeB;
        r9 = r8 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        if (r9 == 69) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
    
        if (r9 == 82) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
    
        if (r9 == 280) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
    
        QfgSZK.UkvvWh.KeB = (QfgSZK.UkvvWh.KeB + r8) >> 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        QfgSZK.UkvvWh.KeB = (r8 >> 63) % okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0163, code lost:
    
        QfgSZK.UkvvWh.J_T = ((QfgSZK.UkvvWh.J_T % 52) ^ 1740) >> 115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        if (QfgSZK.UkvvWh.KeB > 7995) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:
    
        r8 = QfgSZK.UkvvWh.KeB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0175, code lost:
    
        if ((r8 + 78) == 25) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0178, code lost:
    
        QfgSZK.UkvvWh.KeB = r8 >> org.spongycastle.crypto.tls.CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a6, code lost:
    
        QfgSZK.UkvvWh.KeB = (QfgSZK.UkvvWh.KeB >> 44) ^ 1595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0160, code lost:
    
        QfgSZK.UkvvWh.KeB = ((QfgSZK.UkvvWh.KeB % 114) * com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_AA_EXIST) >> 88;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KeyPair OLrzqt(String str, Context context, String str2, String str3) {
        int i;
        if (!KeyChain.isKeyAlgorithmSupported(str)) {
            return null;
        }
        try {
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if ((J_T ^ 2931) != 0) {
            }
        } catch (NoSuchAlgorithmException e2) {
            FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012JM"), e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
            if ((J_T ^ 2931) != 0) {
            }
        } catch (NoSuchProviderException e3) {
            e = e3;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if ((J_T ^ 2931) != 0) {
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012\u0011\u0018]KSHRW\\\u0018R^fasvhoP\u0005)\u007fv"), th.toString());
            ORrpqH.uzCIH().seuMaA(th);
        }
        if (HJWChP.QdUnVm.RWIpjU()) {
            return AEQbTJ.OLrzqt(str, str2, str3);
        }
        if (HJWChP.RGtXKC.DKRTZD.diCPdz < HJWChP.RGtXKC.C0004RGtXKC.UIwVdu && HJWChP.QdUnVm.ONJgbh()) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 99);
            KeyPairGeneratorSpec.Builder keyType = new KeyPairGeneratorSpec.Builder(context).setAlias(str3).setSubject(new X500Principal(GCXiNH.fsw("^_\u0006XYDrjHMDFDMMUeq\u007f\u0013}\fdGLX]Ow\\LEO}"))).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).setKeyType(str);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, str2);
            keyPairGenerator.initialize(keyType.build());
            return keyPairGenerator.generateKeyPair();
        }
        if (KeB <= 7995) {
            while (true) {
                i = KeB;
                int i2 = i + 52;
                if (i2 != 98) {
                    if (i2 == 202) {
                        KeB = ((i ^ 2400) + i) * 50;
                        break;
                    }
                    if (i2 == 258) {
                        KeB = (KeB >> 44) ^ 1595;
                        break;
                    }
                    if (i2 == 444) {
                        break;
                    }
                } else {
                    break;
                }
            }
            KeB = (KeB >> 130) + i;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean djBIcL(PrivateKey privateKey, String str) {
        if (HJWChP.QdUnVm.RWIpjU()) {
            return AEQbTJ.djBIcL(privateKey, str);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[LOOP:0: B:36:0x00b4->B:56:0x00b4, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] fhwtiV(String str) {
        int i;
        try {
            if (!HJWChP.QdUnVm.gCNefq()) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u000e\u0003XLYR_GQW\u0012R\\NMNYH\u001aXJR\u0006kkw\"`v_Eeeifl&"));
                return null;
            }
            if (sDMsbj == null) {
                KeyStore keyStore = KeyStore.getInstance(GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"));
                keyStore.load(null);
                KeyStore.Entry entry = keyStore.getEntry(GCXiNH.fsw("IcN\u007f_udxiFFFXzll"), null);
                if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    return null;
                }
                sDMsbj = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            }
            Signature signature = Signature.getInstance(GCXiNH.fsw(GCXiNH.fsw("XR").equalsIgnoreCase(sDMsbj.getAlgorithm()) ? "NYz>\u001e\u0007vwx@g`nzi" : "NYz>\u001e\u0007vwx@ppk"));
            signature.initSign(sDMsbj);
            signature.update(str.getBytes());
            return signature.sign();
        } catch (IOException e) {
            e = e;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
                while (true) {
                    i = KeB;
                    int i2 = i + 78;
                    if (i2 != 3) {
                        if (i2 == 95) {
                            KeB = i >> 71;
                        } else {
                            if (i2 == 130) {
                                KeB = (i ^ 6911) % 123;
                                break;
                            }
                            if (i2 == 270) {
                                break;
                            }
                        }
                    }
                    KeB = ((KeB % 109) % 69) >> 61;
                }
                KeB = (KeB + i) * 41;
            }
            return null;
        } catch (InvalidKeyException e2) {
            e = e2;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
            }
            return null;
        } catch (KeyStoreException e3) {
            e = e3;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
            }
            return null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
            }
            return null;
        } catch (SignatureException e5) {
            e = e5;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
            }
            return null;
        } catch (UnrecoverableEntryException e6) {
            e = e6;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
            }
            return null;
        } catch (CertificateException e7) {
            e = e7;
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012JM"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (KeB <= 7995) {
            }
            return null;
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011rwkF\u0002WBL\bNXEAG\u0012\u0019BZPIUV_\u0019]OE`twknn\u0017\fry"), th.toString());
            ORrpqH.uzCIH().seuMaA(th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:39:0x00e1) to fix multi-entry loop: BACK_EDGE: B:39:0x00e1 -> B:40:0x00e3 */
    /* JADX DEBUG: Duplicate block (B:57:0x0126) to fix multi-entry loop: BACK_EDGE: B:56:0x011f -> B:57:0x0126 */
    public static ZAwExL gxJrGF(String str, ZqidTP zqidTP, String str2) {
        String str3;
        String strFsw;
        String strFsw2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ZAwExL zAwExL = new ZAwExL();
        if (zqidTP == null || UPbYzn.iSpHlg(str)) {
            str3 = "upIh\\Ps{S[KGu@FQWY]WmAQ]_P";
        } else if (fZwuIs || !sWlOSi(zqidTP.Umbazn)) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\n\u0006\bUSAFZWGU\u000fuXEk[PJ\u0017@wkn\"JeG\u007f}kyo"));
            str3 = "upIh\\Ps{S[KGuOINZPPlF^oH[SYI[M]hM`}schr";
        } else {
            if (sDMsbj != null && fuZRRl != null && dBxXwc != null) {
                String strQbewEr = UPbYzn.QbewEr(10);
                String strConcat = strQbewEr.concat(str).concat(String.valueOf(gatkcr)).concat(dBxXwc).concat(str2);
                byte[] bArrFhwtiV = fhwtiV(strConcat);
                if (bArrFhwtiV != null) {
                    String strDvMhtu = UPbYzn.DvMhtu(bArrFhwtiV);
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Nx\\bNU!") + strConcat + GCXiNH.fsw("=C^\u007f^]u>e[\u0002") + strDvMhtu);
                    zAwExL.dagZNr = strDvMhtu;
                    zAwExL.OxCLlq = UPbYzn.hUfVAv(strQbewEr);
                    zAwExL.OrLXTL = UPbYzn.hUfVAv(String.valueOf(gatkcr));
                    zAwExL.RNqxeV = UPbYzn.hUfVAv(dBxXwc);
                    zAwExL.dISzzS = UPbYzn.DvMhtu(fuZRRl.getEncoded());
                    if (zYEBiQ) {
                        strFsw2 = GCXiNH.fsw("icNi");
                        if (J_T <= 2930) {
                            if ((KeB ^ 7996) != 0) {
                                do {
                                    int i7 = KeB;
                                    i6 = i7 + 130;
                                    if (i6 != 25) {
                                        if (i6 == 59) {
                                            KeB = ((i7 + i7) % 77) + i7;
                                        } else if (i6 == 233) {
                                            KeB = ((i7 ^ 1820) % 30) + i7;
                                        }
                                    }
                                    KeB = (KeB * 72) >> 6;
                                    break;
                                } while (i6 != 352);
                                while (true) {
                                    KeB = (KeB >> 55) * 38;
                                }
                            }
                            do {
                                i = J_T;
                                i2 = i + 117;
                                if (i2 == 13) {
                                    while (true) {
                                        J_T >>= CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                                        if ((KeB ^ 7996) != 0) {
                                            do {
                                                int i8 = KeB;
                                                i3 = i8 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                                if (i3 == 96) {
                                                    KeB = ((i8 % 54) ^ 5335) + i8;
                                                }
                                            } while (i3 != 172);
                                        }
                                    }
                                    while (true) {
                                        KeB = (KeB % 73) >> 87;
                                    }
                                }
                            } while (i2 != 172);
                            J_T = ((i % 40) + i) * 2;
                            if ((KeB ^ 7996) != 0) {
                                while (true) {
                                    i4 = KeB;
                                    int i9 = i4 + 117;
                                    if (i9 != 89) {
                                        if (i9 == 253) {
                                            i5 = (i4 * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) ^ 1305;
                                            break;
                                        }
                                        if (i9 == 341) {
                                            i5 = (i4 + i4) ^ 1036;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                KeB = i5;
                                while (true) {
                                    KeB = ((KeB >> 44) ^ 3465) + i4;
                                }
                            }
                        }
                    } else {
                        strFsw2 = "";
                    }
                    zAwExL.fgqVGA = strFsw2;
                    strFsw = null;
                } else {
                    strFsw = GCXiNH.fsw("upIh\\Ps{S[KGuG]KZjGZU_Q[KOY");
                }
                zAwExL.dddPMR = strFsw;
                return zAwExL;
            }
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("MdY`BR!1,xPJ\\H\\B\u0016~QJ\u0012XC\u000fPHPW\u0014"));
            str3 = "upIh\\Ps{S[KGu@FQWY]WmZUV";
        }
        zAwExL.dddPMR = GCXiNH.fsw(str3);
        return zAwExL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isAvailable(Context context) {
        if (fZwuIs) {
            return false;
        }
        return sWlOSi(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0202, code lost:
    
        if ((QfgSZK.UkvvWh.J_T ^ 2931) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0224, code lost:
    
        if (QfgSZK.UkvvWh.J_T <= 2930) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean sWlOSi(Context context) {
        String str;
        String str2;
        if (!HJWChP.QdUnVm.ORmwhf()) {
            str = DlIaRS;
            str2 = "UpIh\\Ps{,{VQEGO\u0007\u007fq\u0014ZA\u0011^@J\u001d]M[PTVDia";
        } else if (fZwuIs) {
            str = DlIaRS;
            str2 = "\\}IiJUx>xZKFN\t\\H\u0016RQG\u0012YQ]ZJ]I_\u0019ZVEnag\"JeG|hmy*hfc6suz~tt";
        } else {
            if (sDMsbj != null && fuZRRl != null) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("\\}IiJUx>kGV\u0003Z[AQWAQ\u0013S_T\u000fNH^WSZ\u0018\\C|"));
                return true;
            }
            try {
                KeyStore keyStore = KeyStore.getInstance(GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"));
                Key key = null;
                keyStore.load(null);
                Key key2 = keyStore.getKey(GCXiNH.fsw("IcN\u007f_udxiFFFXzll"), null);
                if (!(key2 instanceof PrivateKey) || djBIcL((PrivateKey) key2, GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"))) {
                    key = key2;
                } else {
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("VtB,BB!pc\\\u0002DOGMUWAQW\u001e\u0011TJRXH^\u001aPL\u0017Gk`#edn[^hpnn)i'xpc3}\u007fu"));
                    zYEBiQ = true;
                    sYOsaF(keyStore);
                }
                if (key instanceof PrivateKey) {
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("\\}IiJUx>dITF\nH\blSLdR[C\u0010ZMTR\\\u001aMPVR"));
                    PrivateKey privateKey = (PrivateKey) key;
                    if (!EZpvd(privateKey, GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"))) {
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Iy^,@Tx>eF\u0002WBL\blSLgG]CU\u000fWN\u001cUUM\u0018_Gw`tcse\u001eNhg`om"));
                        fZwuIs = true;
                        return false;
                    }
                    fuZRRl = keyStore.getCertificate(GCXiNH.fsw("IcN\u007f_udxiFFFXzll")).getPublicKey();
                    sDMsbj = privateKey;
                } else {
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^c^m_Xoy,I\u0002MO^\blSLdR[C"));
                    KeyPair keyPairOLrzqt = OLrzqt(GCXiNH.fsw("XR"), context, GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"), GCXiNH.fsw("IcN\u007f_udxiFFFXzll"));
                    if (keyPairOLrzqt == null || !EZpvd(keyPairOLrzqt.getPrivate(), GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"))) {
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nH\blSLdR[C\u0010XWIT\u001b\u007fUT^Vqm`\"BuLZl$jfngu\u007fa|~2~b/wi<ri9vxs\u0005MEojYQp@\rNDELM]\u0016\u001bHOGiAg\u0011got"));
                        keyPairOLrzqt = OLrzqt(GCXiNH.fsw("OBz"), context, GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"), GCXiNH.fsw("IcN\u007f_udxiFFFXzll"));
                        if (keyPairOLrzqt != null) {
                            if (!EZpvd(keyPairOLrzqt.getPrivate(), GCXiNH.fsw("\\\u007f_~DXeUiQqWE[M"))) {
                            }
                        }
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011bliIVF\nbM^fT]A\u0012FY[V\u001dnh{\u0019Y[Ajvjvim\u001eXfk'*fz'\u007fa4za1~`j=tzh}ovu@\u0005F|mEUf"));
                        fZwuIs = true;
                        return false;
                    }
                    sDMsbj = keyPairOLrzqt.getPrivate();
                    fuZRRl = keyPairOLrzqt.getPublic();
                }
                if (sDMsbj == null) {
                    return false;
                }
                gatkcr = Math.min(keyStore.getCreationDate(GCXiNH.fsw("IcN\u007f_udxiFFFXzll")).getTime(), iNQVsq);
                dBxXwc = GCXiNH.fsw("neIcEV;").concat(GCXiNH.fsw("XR").equalsIgnoreCase(sDMsbj.getAlgorithm()) ? GCXiNH.fsw("xr_\u007fJ") : sDMsbj.getAlgorithm()).toLowerCase(Locale.US);
                return true;
            } catch (IOException e) {
                e = e;
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011mqmL\u0002WBL\blSLgG]CU\u000fE@"), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
            } catch (KeyStoreException e2) {
                e = e2;
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011s{xZKF\\L\bLSL\u0014U@^]\u000fuXEhNVJR\u0006~y"), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011s{xZKF\\L\bLSL\u0014U@^]\u000fuXEhNVJR\u0006~y"), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
            } catch (UnrecoverableEntryException e4) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("VtBIEEsg,AQ\u0003DF\\\u0007DPW\\DTBN\\QY\u001bAD"), e4.toString());
                ORrpqH.uzCIH().seuMaA(e4);
                if (J_T <= 2930) {
                    if ((KeB ^ 7996) != 0) {
                        while (true) {
                            int i = KeB;
                            int i2 = i + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                            if (i2 != 60) {
                                if (i2 != 129) {
                                    if (i2 != 136) {
                                        if (i2 == 193) {
                                            KeB = ((i + i) * 6) ^ 3182;
                                        }
                                    }
                                }
                                KeB = ((KeB ^ 5084) >> WalletImportError.ERROR_CODE_AA_EXIST) * 12;
                            } else {
                                KeB = i ^ 7644;
                            }
                            KeB = ((KeB + i) * 66) % 64;
                            KeB = ((KeB ^ 5084) >> WalletImportError.ERROR_CODE_AA_EXIST) * 12;
                        }
                    }
                    while (J_T + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 != 7) {
                    }
                    do {
                        J_T = (J_T ^ 5291) % 61;
                    } while ((KeB ^ 7996) == 0);
                    while (true) {
                        int i3 = KeB;
                        int i4 = i3 + 208;
                        if (i4 != 3) {
                            if (i4 == 143) {
                                KeB = (i3 * 103) + i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        KeB = ((KeB % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) * 59) % 115;
                    }
                }
                return false;
            } catch (CertificateException e5) {
                e = e5;
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011mqmL\u0002WBL\blSLgG]CU\u000fE@"), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
            } catch (Throwable th) {
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011mqmL\u0002WBL\blSLgG]CU\u000f\u0016OIUNPUR\u0006`|`gqtWCg-+qt"), th.toString());
                ORrpqH.uzCIH().seuMaA(th);
                return false;
            }
        }
        FQMcgE.fQMcgE.sIqKDg(str, GCXiNH.fsw(str2));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static void sYOsaF(KeyStore keyStore) {
        if (keyStore == null) {
            return;
        }
        try {
            keyStore.deleteEntry(GCXiNH.fsw("IcN\u007f_udxiFFFXzll"));
        } catch (KeyStoreException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("^pU+_\u0011e{`MVFN\t\\OS\u0015[_V\u0011[JG\u001dZIUT\u0018|C|Wwmse\u001eWt"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
        }
    }
}
