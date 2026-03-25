package QfgSZK;

import QfgSZK.GQzpsZ;
import QfgSZK.HJWChP;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.lexisnexisrisk.threatmetrix.NativeGathererHelper;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class AxsJAY {
    private static String DfIWbl = null;
    private static String DlIaRS = null;
    public static int ERr = 0;
    private static String fGOaWB = null;
    public static int hKe = 8026;
    boolean OlStwz;
    private boolean aXqpkH;
    private final NativeGathererHelper dXCuiz;
    private final Lock fLKRuX;

    public class axsJAY implements FilenameFilter {
        public static int Rqz = 3143;
        public static int czL = 5368;
        /* synthetic */ String hqNOJP;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public axsJAY(String str) {
            if (czL <= 5367) {
                while (true) {
                    int i = czL;
                    int i2 = i + 13;
                    if (i2 == 38) {
                        czL = (i + i) ^ 3837;
                    } else if (i2 == 129) {
                        czL = ((i * 97) ^ 2117) + i;
                        break;
                    } else if (i2 == 309) {
                        czL = ((i % 69) >> 11) ^ 3371;
                        break;
                    }
                }
            }
            this.hqNOJP = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.hqNOJP);
        }
    }

    public static class sNCnLh {
        private static final AxsJAY sYErk = new AxsJAY(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private sNCnLh() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r2 <= 8025) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if ((QfgSZK.AxsJAY.hKe ^ 8026) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        r0 = QfgSZK.AxsJAY.hKe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if ((r0 + 13) == 33) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        QfgSZK.AxsJAY.hKe = ((r0 * 40) % 52) + r0;
     */
    static {
        int i;
        int i2;
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        ERr = 2005;
        GCXiNH.OHr = 2270;
        fGOaWB = GCXiNH.fsw("SpOe]T!}cLG\u0019");
        String strFsw = GCXiNH.fsw("IyIiJU!wb\\GQX\\XS\u0016QQGWRDJZ\u0011\u001cORKW@Okc");
        if ((2005 ^ ERr) != 0) {
            if ((hKe ^ 8026) != 0) {
                while (true) {
                    int i3 = hKe;
                    int i4 = i3 + 26;
                    if (i4 == 75) {
                        break;
                    } else if (i4 == 238) {
                        hKe = (i3 * 6) ^ 3777;
                    }
                }
                while (true) {
                    hKe = (hKe >> WebSocketProtocol.PAYLOAD_SHORT) ^ 1567;
                }
            } else {
                do {
                    i = ERr;
                    i2 = i + 13;
                    if (i2 == 55) {
                        ERr = (i ^ 1836) + i;
                    }
                } while (i2 != 191);
                int i5 = hKe;
                if ((i5 ^ 8026) != 0) {
                    while (true) {
                        int i6 = hKe;
                        if (i6 + 65 == 48) {
                            hKe = (i6 + i6) * 9;
                        }
                    }
                } else {
                    ERr = (i * 14) ^ 5239;
                }
            }
        }
        DfIWbl = strFsw;
        DlIaRS = FQMcgE.hfdhUn(AxsJAY.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AxsJAY() {
        this.OlStwz = false;
        this.fLKRuX = new ReentrantLock();
        this.aXqpkH = false;
        this.dXCuiz = new NativeGathererHelper();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: QfgSZK.AxsJAY.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AxsJAY(axsJAY axsjay) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        QfgSZK.AxsJAY.ERr = (QfgSZK.AxsJAY.ERr * 3608) ^ 2190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if ((QfgSZK.AxsJAY.hKe ^ 8026) == 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static GQzpsZ.sQwTVT[] DTwDnp() {
        int i;
        try {
            if (uzCIH().gGvvIC()) {
                return (GQzpsZ.sQwTVT[]) uzCIH().QUSxYX().getAddresses(GQzpsZ.sQwTVT.class);
            }
            if ((ERr ^ 2005) == 0) {
                return null;
            }
            while (true) {
                int i2 = ERr;
                int i3 = i2 + 26;
                if (i3 != 16) {
                    if (i3 == 127) {
                        ERr = (i2 * 55) >> 38;
                        if (hKe > 8025) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            do {
                int i4 = hKe;
                i = i4 + 52;
                if (i == 17) {
                    hKe = ((i4 >> 33) ^ 3165) + i4;
                } else if (i != 33) {
                    if (i == 43) {
                        while (true) {
                            hKe = ((hKe + i4) + i4) % 39;
                        }
                    }
                }
                hKe = (hKe >> 60) + i4;
                break;
            } while (i != 65);
            while (true) {
                hKe ^= 4678;
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AxsJAY uzCIH() {
        return sNCnLh.sYErk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:29:0x0058) to fix multi-entry loop: BACK_EDGE: B:28:0x0052 -> B:29:0x0058 */
    public long ORxRYg(int i) {
        int i2;
        int i3;
        try {
            if (this.OlStwz) {
                return this.dXCuiz.getTamperCode(i);
            }
            if ((ERr ^ 2005) == 0) {
                return 0L;
            }
            do {
                i2 = ERr;
                i3 = i2 + 26;
                if (i3 == 87) {
                    ERr = (i2 % 95) ^ 4443;
                    if (hKe <= 8025) {
                        while (true) {
                            int i4 = hKe;
                            int i5 = i4 + 65;
                            if (i5 != 44) {
                                if (i5 == 140) {
                                    hKe = ((i4 * 35) % 72) >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                                }
                            }
                            hKe = (hKe >> 180) ^ 5057;
                        }
                    }
                } else if (i3 != 285) {
                    if (i3 == 447) {
                        while (true) {
                            ERr = (ERr ^ 1325) + i2;
                        }
                    }
                }
                while (true) {
                    ERr = (ERr >> 104) + i2;
                }
            } while (i3 != 643);
            do {
                ERr = (ERr * 122) + i2 + i2;
            } while (hKe > 8025);
            while (true) {
                int i6 = hKe;
                int i7 = i6 + 91;
                if (i7 != 98) {
                    if (i7 == 210) {
                        hKe = (i6 * 63) % 88;
                        break;
                    }
                    if (i7 == 344) {
                        hKe = ((i6 + i6) >> 32) + i6;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                hKe = (hKe >> 38) * 107;
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] OcIXYQ() throws InterruptedException {
        try {
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        String[] networkInfo = (!this.OlStwz || HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.dspUTZ) ? null : this.dXCuiz.getNetworkInfo();
        if (!Thread.interrupted()) {
            return networkInfo;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("IyIiJU!wb\\GQX\\XS\u0016QQGWRDJZ\u0011\u001cORKW@Okc"));
        throw new InterruptedException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String QKVWgx(byte[] bArr) {
        try {
            if (this.OlStwz && bArr != null && bArr.length > 0) {
                return this.dXCuiz.sha1Base32Encode(bArr);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long QOLQEE(String str, boolean z) {
        int i;
        int i2;
        try {
            if (this.OlStwz) {
                return this.dXCuiz.getAppTime(str, z);
            }
            if ((ERr ^ 2005) == 0) {
                return 0L;
            }
            do {
                i = ERr;
            } while (i + 26 != 10);
            while (true) {
                ERr = (ERr + i) >> 50;
                if (hKe <= 8025) {
                    do {
                        i2 = hKe;
                    } while (i2 + 52 != 70);
                    hKe = (i2 ^ 5451) * 57;
                }
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NativeGathererHelper QUSxYX() {
        return this.dXCuiz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QVAiDq(ZqidTP zqidTP, String str, boolean z, boolean z2) {
        String strOqCbbx = new HJWChP.zRXNTw(zqidTP).OqCbbx();
        try {
            if (!QVAiDq(str, z, z2)) {
                String[] list = new File(strOqCbbx).list(new axsJAY(str));
                if (list != null && list.length != 0) {
                    this.aXqpkH = true;
                }
            }
        } catch (SecurityException e) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("qxY,OXs{o\\MQS\tFHB\u0015UESX\\N\\QY\u001b") + e.toString());
            ORrpqH.uzCIH().seuMaA(e);
        }
        return this.OlStwz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        QfgSZK.AxsJAY.ERr = ((QfgSZK.AxsJAY.ERr + r4) + r4) >> 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if ((QfgSZK.AxsJAY.hKe ^ 8026) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean QVAiDq(String str, boolean z, boolean z2) {
        if (this.OlStwz) {
            return true;
        }
        try {
            this.fLKRuX.lock();
            boolean z3 = this.OlStwz;
            if (z3) {
                return z3;
            }
            try {
                boolean zDCwqvq = this.dXCuiz.dCwqvq(str, z, z2);
                this.OlStwz = zDCwqvq;
                FQMcgE.OijiEz(DlIaRS, zDCwqvq ? GCXiNH.fsw("qxY,JG`w`I@OO\t") : GCXiNH.fsw("qxY,E^u>m^CJFHJKS\u0015"));
            } catch (NullPointerException e) {
                e = e;
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("qxY,E^u>m^CJFHJKS\u0015") + e.getMessage());
                ORrpqH.uzCIH().seuMaA(e);
                this.OlStwz = false;
            } catch (SecurityException e2) {
                e = e2;
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("qxY,E^u>m^CJFHJKS\u0015") + e.getMessage());
                ORrpqH.uzCIH().seuMaA(e);
                this.OlStwz = false;
            } catch (UnsatisfiedLinkError e3) {
                e = e3;
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("qxY,E^u>m^CJFHJKS\u0015") + e.getMessage());
                ORrpqH.uzCIH().seuMaA(e);
                this.OlStwz = false;
            } catch (Throwable th) {
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
                this.OlStwz = false;
                ORrpqH.uzCIH().seuMaA(th);
            }
            this.fLKRuX.unlock();
            if ((ERr ^ 2005) == 0) {
                return this.OlStwz;
            }
            while (true) {
                int i = ERr;
                int i2 = i + 78;
                if (i2 != 68) {
                    if (i2 == 258) {
                        ERr = (i % 4) ^ 4590;
                        if ((hKe ^ 8026) == 0) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            while (true) {
                int i3 = hKe;
                int i4 = i3 + 104;
                if (i4 == 41) {
                    hKe = ((i3 % 61) + i3) % 75;
                } else if (i4 == 162) {
                    hKe = ((i3 >> 96) % 22) * 103;
                }
            }
        } finally {
            this.fLKRuX.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String QbewEr(int i) {
        try {
            if (this.OlStwz && i > 0) {
                return this.dXCuiz.getRandomString(i);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String QfsBiF(String str) {
        try {
            if (this.OlStwz && str != null) {
                return this.dXCuiz.md5(str);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:21:0x003e) to fix multi-entry loop: BACK_EDGE: B:20:0x0039 -> B:21:0x003e */
    public int RJOkX() {
        try {
            if (this.OlStwz) {
                return this.dXCuiz.cancel();
            }
            if (hKe > 8025) {
                return -1;
            }
            while (true) {
                int i = hKe;
                int i2 = i + 26;
                if (i2 != 80) {
                    if (i2 == 92) {
                        hKe = (i >> 66) ^ 2188;
                        break;
                    }
                    if (i2 == 246) {
                        hKe = (i * 119) ^ 2215;
                    } else if (i2 == 422) {
                        break;
                    }
                } else {
                    break;
                }
            }
            hKe = (hKe >> 80) * 29;
            while (true) {
                hKe >>= CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256;
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String RcXXUw(String str) {
        int i;
        int i2;
        int i3;
        try {
            if (this.OlStwz) {
                return this.dXCuiz.validatePackage(str);
            }
            if (ERr > 2004) {
                return null;
            }
            while (true) {
                int i4 = ERr;
                int i5 = i4 + 26;
                if (i5 != 15) {
                    if (i5 == 157) {
                        ERr = (i4 + i4) ^ 5270;
                        if (hKe > 8025) {
                            return null;
                        }
                        do {
                            i2 = hKe;
                        } while (i2 + 26 != 1);
                        hKe = ((i2 % 58) + i2) * 5;
                        return null;
                    }
                    if (i5 != 238) {
                        continue;
                    } else {
                        ERr = (i4 * 44) + i4 + i4;
                        if (hKe <= 8025) {
                            while (true) {
                                i3 = hKe;
                                int i6 = i3 + 52;
                                if (i6 == 60) {
                                    break;
                                }
                                if (i6 != 232) {
                                    if (i6 == 288) {
                                        hKe = i3 + i3 + i3;
                                    }
                                }
                                hKe = ((hKe % 100) % 72) % 7;
                            }
                            while (true) {
                                hKe = (hKe + i3) * WalletImportError.ERROR_CODE_AA_EXIST;
                            }
                        }
                    }
                }
                ERr = (ERr % WalletImportError.ERROR_CODE_AA_EXIST) % 106;
                if ((hKe ^ 8026) != 0) {
                    do {
                        i = hKe;
                    } while (i + 39 != 55);
                    while (true) {
                        hKe = (hKe ^ 4927) + i;
                    }
                }
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String UeEOUB(String str, AwvSrB awvSrB) throws InterruptedException {
        try {
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        String strHashFile = (this.OlStwz && UPbYzn.dTTfOR(str)) ? this.dXCuiz.hashFile(str, awvSrB.zPfaae) : null;
        if (!Thread.interrupted()) {
            return strHashFile;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("IyIiJU!wb\\GQX\\XS\u0016QQGWRDJZ\u0011\u001cORKW@Okc"));
        throw new InterruptedException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String aKErDB(ZqidTP zqidTP) {
        int i;
        try {
            if (this.OlStwz && HJWChP.RGtXKC.DKRTZD.diCPdz < HJWChP.RGtXKC.C0004RGtXKC.dspUTZ) {
                return this.dXCuiz.getConnections(zqidTP.Umbazn);
            }
            if ((ERr ^ 2005) == 0) {
                return null;
            }
            if ((hKe ^ 8026) != 0) {
                while (true) {
                    int i2 = hKe;
                    int i3 = i2 + 39;
                    if (i3 != 64) {
                        if (i3 == 165) {
                            hKe = ((i2 ^ 1148) % 15) * 55;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                hKe = (hKe % 115) ^ 1517;
            }
            do {
                i = ERr;
            } while (i + 26 != 93);
            while (true) {
                ERr = (ERr ^ 497) + i;
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZaDspl dNCPSb() throws InterruptedException {
        int selinuxMode;
        try {
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        ZaDspl zaDspl = (!this.OlStwz || ((selinuxMode = this.dXCuiz.getSelinuxMode()) < 0 && selinuxMode > 4)) ? null : ZaDspl.values()[selinuxMode];
        if (!Thread.interrupted()) {
            return zaDspl;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("IyIiJU!wb\\GQX\\XS\u0016QQGWRDJZ\u0011\u001cORKW@Okc"));
        throw new InterruptedException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009e A[EDGE_INSN: B:64:0x009e->B:75:? BREAK  A[LOOP:2: B:24:0x004d->B:66:0x004d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String djSkpj(String str) {
        boolean z;
        try {
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        int iJniDetectedDebugStatus = this.OlStwz ? this.dXCuiz.jniDetectedDebugStatus(str) : -1;
        if (-1 != iJniDetectedDebugStatus) {
            if (iJniDetectedDebugStatus <= 0) {
                z = false;
            } else if ((ERr ^ 2005) != 0) {
                if (hKe > 8025) {
                    while (true) {
                        int i = ERr;
                        int i2 = i + 78;
                        if (i2 != 27) {
                            if (i2 == 214) {
                                ERr = ((i + i) + i) ^ 4070;
                            } else if (i2 == 354) {
                                ERr = ((ERr + i) ^ 5140) >> 2;
                                if ((hKe ^ 8026) == 0) {
                                    break;
                                }
                            } else if (i2 != 528) {
                                continue;
                            } else {
                                ERr = ((i ^ 4442) * 43) >> 108;
                            }
                        }
                        ERr = ERr + i + i;
                        if (hKe <= 8025) {
                            while (hKe + 130 != 37) {
                            }
                            while (true) {
                                hKe = (hKe * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) % 36;
                            }
                        }
                        ERr = ((ERr + i) ^ 5140) >> 2;
                        if ((hKe ^ 8026) == 0) {
                        }
                    }
                }
                while (true) {
                    int i3 = hKe;
                    int i4 = i3 + 91;
                    if (i4 == 12) {
                        hKe = (i3 % WebSocketProtocol.PAYLOAD_SHORT) + i3;
                        break;
                    }
                    if (i4 == 78) {
                        break;
                    }
                }
                while (true) {
                    hKe = (hKe ^ 3588) % WebSocketProtocol.PAYLOAD_SHORT;
                }
            } else {
                z = true;
            }
            return String.valueOf(z);
        }
        if ((hKe ^ 8026) == 0) {
            return "";
        }
        while (hKe + 52 != 79) {
        }
        while (true) {
            hKe = (hKe % 122) ^ 1173;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String dvKsVJ(String str) {
        try {
            if (this.OlStwz) {
                return this.dXCuiz.getTextSectionHash(str);
            }
            if (ERr > 2004) {
                return "";
            }
            while (true) {
                int i = ERr;
                if (i + 26 == 31) {
                    ERr = (i % 94) ^ 3706;
                }
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String dxcTrN(String str, String str2) {
        try {
            if (this.OlStwz && UPbYzn.dTTfOR(str2) && UPbYzn.dTTfOR(str)) {
                return this.dXCuiz.xor(str, str2);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fFgQHt() {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            if (this.OlStwz) {
                return this.dXCuiz.waitUntilCancelled();
            }
            if (ERr > 2004) {
                return -1;
            }
            while (true) {
                int i5 = ERr;
                int i6 = i5 + 26;
                if (i6 == 34) {
                    ERr = ((i5 % 83) ^ MTPushConstants.MainWhat.TAG_ADD) >> 10;
                    if (hKe <= 8025) {
                        do {
                            i = hKe;
                        } while (i + 65 != 35);
                        while (true) {
                            hKe = (hKe % 81) + i + i;
                        }
                    }
                } else if (i6 != 41) {
                    if (i6 == 49) {
                        while (true) {
                            ERr = ((ERr * 92) + i5) % 10;
                            if (hKe <= 8025) {
                                do {
                                    i3 = hKe;
                                    i4 = i3 + 78;
                                    if (i4 == 65) {
                                        break;
                                    }
                                } while (i4 != 144);
                                hKe = (i3 % 107) ^ 5428;
                            }
                        }
                        while (true) {
                            hKe = (hKe ^ 1828) >> 114;
                        }
                    }
                }
                ERr = ((ERr % WebSocketProtocol.PAYLOAD_SHORT) ^ 1505) + i5;
                if (hKe <= 8025) {
                    while (true) {
                        i2 = hKe;
                        int i7 = i2 + 39;
                        if (i7 != 69) {
                            if (i7 == 224) {
                                hKe = i2 >> 81;
                                break;
                            }
                            if (i7 == 276) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    hKe = ((hKe % 35) * 71) + i2;
                    while (true) {
                        hKe = (hKe % 63) * 44;
                    }
                }
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] fZBcTu(String[] strArr) throws InterruptedException {
        try {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw(this.OlStwz ? "=pMmB]`|`M\u0002" : "s~O,JG`w`I@OO\t"));
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        String[] strArrCheckURLs = (!this.OlStwz || strArr == null) ? null : this.dXCuiz.checkURLs(strArr);
        if (!Thread.interrupted()) {
            return strArrCheckURLs;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("IyIiJU!wb\\GQX\\XS\u0016QQGWRDJZ\u0011\u001cORKW@Okc"));
        throw new InterruptedException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void finit() {
        if (this.OlStwz) {
            NativeGathererHelper nativeGathererHelper = this.dXCuiz;
            if (hKe <= 8025) {
                while (true) {
                    int i = hKe;
                    if (i + 26 == 77) {
                        hKe = (i >> 109) ^ 3116;
                    }
                }
            } else {
                nativeGathererHelper.finit();
            }
        }
        this.OlStwz = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String flVtFt(byte[] bArr) {
        try {
            if (this.OlStwz && bArr != null) {
                return this.dXCuiz.sha1HexEncode(bArr);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fvQaOB(byte[] bArr) {
        try {
            if (this.OlStwz && bArr != null) {
                return this.dXCuiz.sha256HexEncode(bArr);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gGvvIC() {
        return this.OlStwz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> gasjUx(String str) throws InterruptedException {
        String[] fontList;
        try {
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        List<String> listAsList = (!this.OlStwz || str == null || (fontList = this.dXCuiz.getFontList(str)) == null) ? null : Arrays.asList(fontList);
        if (!Thread.interrupted()) {
            return listAsList;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("IyIiJU!wb\\GQX\\XS\u0016QQGWRDJZ\u0011\u001cORKW@Okc"));
        throw new InterruptedException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void giSNqX(int i) {
        try {
            if (this.OlStwz) {
                this.dXCuiz.setInfoLogging(i);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:18:0x002b) to fix multi-entry loop: BACK_EDGE: B:18:0x002b -> B:19:0x0032 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        QfgSZK.AxsJAY.ERr = (QfgSZK.AxsJAY.ERr * okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT) ^ 1950;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (QfgSZK.AxsJAY.hKe > 8025) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r0 = QfgSZK.AxsJAY.hKe;
        r1 = r0 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r1 == 52) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r1 == 219) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r1 == 234) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r1 == 345) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        QfgSZK.AxsJAY.hKe ^= 4795;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        QfgSZK.AxsJAY.hKe = (r0 ^ 4619) % 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        QfgSZK.AxsJAY.hKe = (r0 ^ 1855) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        QfgSZK.AxsJAY.hKe = (QfgSZK.AxsJAY.hKe ^ 4751) * 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0032, code lost:
    
        QfgSZK.AxsJAY.ERr = (QfgSZK.AxsJAY.ERr + r0) >> com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int gkJEwt() {
        try {
            if (this.OlStwz) {
                return this.dXCuiz.getCpuCores();
            }
            if ((ERr ^ 2005) == 0) {
                return 0;
            }
            while (true) {
                int i = ERr;
                int i2 = i + 26;
                if (i2 != 54) {
                    if (i2 != 251) {
                        if (i2 == 413) {
                            break;
                        }
                        if (i2 == 497) {
                            ERr = i * 2318;
                            return 0;
                        }
                    }
                    ERr = (ERr + i) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                } else {
                    ERr = ((i + i) * 56) % 51;
                }
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String hUfVAv(String str) {
        try {
            if (this.OlStwz && str != null) {
                return this.dXCuiz.urlEncode(str);
            }
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean iRxXKY() {
        return this.aXqpkH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String iZzfmt() {
        try {
            if (this.OlStwz) {
                return this.dXCuiz.getBinaryArch();
            }
            return null;
        } catch (Throwable th) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("SpOe]T!}cLG\u0019"), th);
            ORrpqH.uzCIH().seuMaA(th);
            return null;
        }
    }
}
