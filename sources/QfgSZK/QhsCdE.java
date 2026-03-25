package QfgSZK;

import QfgSZK.HJWChP;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public abstract class QhsCdE {
    private static String DlIaRS = null;
    public static int ENs = 1509;
    public static int ftb;
    private final long QIkcwJ;
    private List<QhsCdE> hGwvqh;
    private String rgvUR;
    private final boolean sbUjjs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: QfgSZK.QhsCdE$QhsCdE, reason: collision with other inner class name */
    public static final class EnumC0007QhsCdE {
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_ADVERTISING_ID;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_APP_INSTALLATION;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_CAMERA;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_CONNECTIONS;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_COOKIE;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DEVICE;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DEVICEINFO;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DEVICE_NAME;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DEVICE_STATE;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DISPLAY;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_DRM;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_EMULATOR;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_FINGERPRINT_CAPS;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_FONT;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_LOCALE_INFO;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_LOCATION;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_MALICIOUS_APPS;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_NETWORK;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_PHONE_CALL;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_PLUGIN_DETECTION;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_PUSH_TOKEN;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_RAT;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_ROOT_DETECTION;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_SELF_HASH;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_SELINUX_MODE;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_SHARED_LIB;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_SIM;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_STRONG_ID;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_SUBSCRIBER;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_SYSTEM_PROXY;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_TAMPER_CODE;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_TIMESTAMP;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_TIMEZONE_INFO;
        public static final EnumC0007QhsCdE COLLECTOR_TYPE_USER_PERM;
        public static int _NH;
        private static final /* synthetic */ EnumC0007QhsCdE[] gkhjaB;
        public static int ujQ;
        private final String asjXaH;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            _NH = 7349;
            ujQ = 2403;
            GCXiNH.OHr = 2270;
            COLLECTOR_TYPE_LOCALE_INFO = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwkyvu\u007fwnyaxr"), 0, GCXiNH.fsw("qx"));
            COLLECTOR_TYPE_TIMEZONE_INFO = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlws\u007fxqi}\u007fupwszt"), 1, GCXiNH.fsw("ix"));
            COLLECTOR_TYPE_DEVICE_NAME = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwcsc}pwn~nsx"), 2, GCXiNH.fsw("y\u007f"));
            COLLECTOR_TYPE_COOKIE = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwdyz\u007fzw"), 3, GCXiNH.fsw("~x"));
            COLLECTOR_TYPE_SIM = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwt\u007fx"), 4, GCXiNH.fsw("nx"));
            COLLECTOR_TYPE_DISPLAY = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwc\u007ffd\u007fsh"), 5, GCXiNH.fsw("yx"));
            COLLECTOR_TYPE_DEVICEINFO = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwcsc}pwx~iq"), 6, GCXiNH.fsw("ywR"));
            COLLECTOR_TYPE_SELF_HASH = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwtsyrlzpcg"), 7, GCXiNH.fsw("nyR"));
            COLLECTOR_TYPE_FONT = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlway{`"), 8, GCXiNH.fsw("{x"));
            COLLECTOR_TYPE_DEVICE_STATE = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwcsc}pwnc{\u007fiy"), 9, GCXiNH.fsw("ybR"));
            COLLECTOR_TYPE_NETWORK = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwisac|`z"), 10, GCXiNH.fsw("sx"));
            COLLECTOR_TYPE_SUBSCRIBER = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwtcwgp`xrjl"), 11, GCXiNH.fsw("nxU"));
            COLLECTOR_TYPE_ADVERTISING_ID = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwfrcqafxcfpzcr~"), 12, GCXiNH.fsw("|x"));
            COLLECTOR_TYPE_SELINUX_MODE = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwtsy}}giobqyy"), 13, GCXiNH.fsw("n|"));
            COLLECTOR_TYPE_SHARED_LIB = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwt~tfvvn|f|"), 14, GCXiNH.fsw("n}R"));
            COLLECTOR_TYPE_CONNECTIONS = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwdy{zvqey`pn"), 15, GCXiNH.fsw("~xU"));
            COLLECTOR_TYPE_APP_INSTALLATION = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwffekz|bdnrq}osvv"), 16, GCXiNH.fsw("t\u007fR"));
            COLLECTOR_TYPE_SYSTEM_PROXY = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwtof`v\u007fn`}qee"), 17, GCXiNH.fsw("mx"));
            COLLECTOR_TYPE_MALICIOUS_APPS = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwjwy}p{~e|a|lki"), 18, GCXiNH.fsw("ppR"));
            COLLECTOR_TYPE_DEVICE = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwcsc}pw"), 19, GCXiNH.fsw("ytR"));
            COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwcsc}pwnua}oeknfyybZWWCUUm"), 20, GCXiNH.fsw("ytU"));
            COLLECTOR_TYPE_PLUGIN_DETECTION = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwwz`sz|ntjjx\u007fosvv"), 21, GCXiNH.fsw("muR"));
            COLLECTOR_TYPE_TAMPER_CODE = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwswxdv`ns`zx"), 22, GCXiNH.fsw("ir"));
            COLLECTOR_TYPE_EMULATOR = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwb{`xrf~b"), 23, GCXiNH.fsw("xaR"));
            COLLECTOR_TYPE_LOCATION = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwkyvug{~~"), 24, GCXiNH.fsw("q~R"));
            COLLECTOR_TYPE_ROOT_DETECTION = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwuyz`lvtdj}iutt"), 25, GCXiNH.fsw("ouR"));
            COLLECTOR_TYPE_PUSH_TOKEN = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwwcf|lf~{jp"), 26, GCXiNH.fsw("meR"));
            COLLECTOR_TYPE_FINGERPRINT_CAPS = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwa\u007f{sv`abfpicx{ik"), 27, GCXiNH.fsw("{rR"));
            COLLECTOR_TYPE_STRONG_ID = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwtbg{}unyk"), 28, GCXiNH.fsw("nxR"));
            COLLECTOR_TYPE_PHONE_CALL = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlww~zzvmrqcr"), 29, GCXiNH.fsw("mrR"));
            COLLECTOR_TYPE_USER_PERM = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwrepflbtbb"), 30, GCXiNH.fsw("haR"));
            COLLECTOR_TYPE_RAT = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwuwa"), 31, GCXiNH.fsw("oe_e"));
            COLLECTOR_TYPE_TIMESTAMP = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlws\u007fxq`fp}\u007f"), 32, GCXiNH.fsw("ibR"));
            COLLECTOR_TYPE_DRM = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwcdx"), 33, GCXiNH.fsw("ycV"));
            COLLECTOR_TYPE_CAMERA = new EnumC0007QhsCdE(GCXiNH.fsw("^^w@nrUQ^wvzzlwdwxqas"), 34, GCXiNH.fsw("~pV"));
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private EnumC0007QhsCdE(String str, int i, String str2) {
            this.asjXaH = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ EnumC0007QhsCdE[] gEmmrt() {
            int i;
            int i2;
            int i3;
            EnumC0007QhsCdE[] enumC0007QhsCdEArr = new EnumC0007QhsCdE[35];
            enumC0007QhsCdEArr[0] = COLLECTOR_TYPE_LOCALE_INFO;
            enumC0007QhsCdEArr[1] = COLLECTOR_TYPE_TIMEZONE_INFO;
            enumC0007QhsCdEArr[2] = COLLECTOR_TYPE_DEVICE_NAME;
            enumC0007QhsCdEArr[3] = COLLECTOR_TYPE_COOKIE;
            enumC0007QhsCdEArr[4] = COLLECTOR_TYPE_SIM;
            enumC0007QhsCdEArr[5] = COLLECTOR_TYPE_DISPLAY;
            enumC0007QhsCdEArr[6] = COLLECTOR_TYPE_DEVICEINFO;
            enumC0007QhsCdEArr[7] = COLLECTOR_TYPE_SELF_HASH;
            if ((_NH ^ 7349) != 0) {
                while (true) {
                    int i4 = _NH;
                    int i5 = i4 + 13;
                    if (i5 == 36) {
                        _NH = (i4 ^ 1227) >> 9;
                        break;
                    }
                    if (i5 == 88) {
                        break;
                    }
                    if (i5 == 278) {
                        i3 = ((i4 >> 73) ^ 1679) * 37;
                    } else if (i5 == 325) {
                        i3 = ((i4 >> 118) % 125) ^ 1197;
                    }
                    _NH = i3;
                }
                _NH = ((_NH ^ 3250) * 50) % 66;
            }
            enumC0007QhsCdEArr[8] = COLLECTOR_TYPE_FONT;
            enumC0007QhsCdEArr[9] = COLLECTOR_TYPE_DEVICE_STATE;
            enumC0007QhsCdEArr[10] = COLLECTOR_TYPE_NETWORK;
            enumC0007QhsCdEArr[11] = COLLECTOR_TYPE_SUBSCRIBER;
            enumC0007QhsCdEArr[12] = COLLECTOR_TYPE_ADVERTISING_ID;
            enumC0007QhsCdEArr[13] = COLLECTOR_TYPE_SELINUX_MODE;
            enumC0007QhsCdEArr[14] = COLLECTOR_TYPE_SHARED_LIB;
            enumC0007QhsCdEArr[15] = COLLECTOR_TYPE_CONNECTIONS;
            enumC0007QhsCdEArr[16] = COLLECTOR_TYPE_APP_INSTALLATION;
            enumC0007QhsCdEArr[17] = COLLECTOR_TYPE_SYSTEM_PROXY;
            enumC0007QhsCdEArr[18] = COLLECTOR_TYPE_MALICIOUS_APPS;
            enumC0007QhsCdEArr[19] = COLLECTOR_TYPE_DEVICE;
            enumC0007QhsCdEArr[20] = COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS;
            EnumC0007QhsCdE enumC0007QhsCdE = COLLECTOR_TYPE_PLUGIN_DETECTION;
            int i6 = _NH;
            if (i6 > 7348) {
                enumC0007QhsCdEArr[21] = enumC0007QhsCdE;
                enumC0007QhsCdEArr[22] = COLLECTOR_TYPE_TAMPER_CODE;
                enumC0007QhsCdEArr[23] = COLLECTOR_TYPE_EMULATOR;
                enumC0007QhsCdEArr[24] = COLLECTOR_TYPE_LOCATION;
                enumC0007QhsCdEArr[25] = COLLECTOR_TYPE_ROOT_DETECTION;
                if (i6 <= 7348) {
                    while (true) {
                        i = _NH;
                        int i7 = i + 26;
                        if (i7 == 82) {
                            _NH = ((i % 3) % 26) + i;
                        } else if (i7 == 226) {
                            break;
                        }
                    }
                    _NH = (i + i) >> 56;
                }
                enumC0007QhsCdEArr[26] = COLLECTOR_TYPE_PUSH_TOKEN;
                enumC0007QhsCdEArr[27] = COLLECTOR_TYPE_FINGERPRINT_CAPS;
                enumC0007QhsCdEArr[28] = COLLECTOR_TYPE_STRONG_ID;
                enumC0007QhsCdEArr[29] = COLLECTOR_TYPE_PHONE_CALL;
                enumC0007QhsCdEArr[30] = COLLECTOR_TYPE_USER_PERM;
                enumC0007QhsCdEArr[31] = COLLECTOR_TYPE_RAT;
                enumC0007QhsCdEArr[32] = COLLECTOR_TYPE_TIMESTAMP;
                enumC0007QhsCdEArr[33] = COLLECTOR_TYPE_DRM;
                enumC0007QhsCdEArr[34] = COLLECTOR_TYPE_CAMERA;
                return enumC0007QhsCdEArr;
            }
            do {
                i2 = _NH;
            } while (i2 + 65 != 48);
            while (true) {
                _NH = (_NH + i2) >> 69;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static EnumC0007QhsCdE valueOf(String str) {
            return (EnumC0007QhsCdE) Enum.valueOf(EnumC0007QhsCdE.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static EnumC0007QhsCdE[] values() {
            return (EnumC0007QhsCdE[]) gkhjaB.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String glXhWM() {
            return this.asjXaH;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x0044) to fix multi-entry loop: BACK_EDGE: B:16:0x003f -> B:17:0x0044 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        QfgSZK.QhsCdE.ENs = (QfgSZK.QhsCdE.ENs + r0) >> 45;
     */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        ftb = 6254;
        GCXiNH.OHr = 2270;
        if ((ENs ^ 1509) != 0) {
            while (true) {
                int i = ENs;
                int i2 = i + 13;
                if (i2 != 54) {
                    if (i2 != 215) {
                        if (i2 == 247) {
                            ENs = i ^ 6987;
                            break;
                        } else if (i2 == 285) {
                            ENs = i >> 172;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            ENs = ((ENs * 52) % 76) ^ 5409;
        }
        FQMcgE.usN = 6842;
        DlIaRS = FQMcgE.hfdhUn(QhsCdE.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QhsCdE(long j) {
        this(j, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QhsCdE(long j, boolean z) {
        if ((ENs ^ 1509) == 0) {
            this.QIkcwJ = j;
            this.sbUjjs = z;
        } else {
            while (ENs + 13 != 56) {
            }
            while (true) {
                ENs = (ENs % 32) * 59;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ void $invoke$special$hrnhsO(OmYuqg omYuqg) throws InterruptedException {
        if (omYuqg != null && omYuqg.hfFNez()) {
            throw new InterruptedException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void addPreRequisiteCollector(QhsCdE qhsCdE) {
        if (qhsCdE == null) {
            return;
        }
        if (this.hGwvqh == null) {
            this.hGwvqh = new ArrayList();
        }
        this.hGwvqh.add(qhsCdE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fWSAZA(long j, QSusPL qSusPL, boolean z) throws InterruptedException {
        HashMap map;
        if (qSusPL == null) {
            return;
        }
        this.rgvUR = "";
        try {
            List<QhsCdE> list = this.hGwvqh;
            if (list == null || list.isEmpty()) {
                map = null;
            } else {
                map = new HashMap();
                for (QhsCdE qhsCdE : this.hGwvqh) {
                    if (qhsCdE != null) {
                        qhsCdE.fWSAZA(j, qSusPL, z);
                        qhsCdE.zSsVtY(j, map);
                        if (UPbYzn.dTTfOR(qhsCdE.zFZsbn())) {
                            this.rgvUR += qhsCdE.zFZsbn();
                        }
                    }
                }
            }
            if (this.sbUjjs == z) {
                $invoke$special$hrnhsO(qSusPL.hdBMmm());
                long j2 = this.QIkcwJ;
                if (j2 == 0 || (j & j2) != 0) {
                    long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
                    zuBGHE(qSusPL, map);
                    if (sSMYrx() != null) {
                        Ohcwxs.uzCIH().DarRvM(sSMYrx().glXhWM(), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP));
                    }
                }
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th) {
            this.rgvUR += th;
            if (sSMYrx() != null) {
                this.rgvUR += "(" + sSMYrx().glXhWM() + GCXiNH.fsw("4*");
            }
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("xiXi[Ehqb\bM@I\\ZUSQ\u000e\u0013") + th);
        }
    }

    public abstract void gHZMYf(Map<String, String> map);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void hrnhsO(OmYuqg omYuqg) throws InterruptedException {
        $invoke$special$hrnhsO(omYuqg);
    }

    public abstract EnumC0007QhsCdE sSMYrx();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String zFZsbn() {
        return this.rgvUR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:132:0x01ec) to fix multi-entry loop: BACK_EDGE: B:131:0x01e8 -> B:132:0x01ec */
    /* JADX DEBUG: Duplicate block (B:76:0x0119) to fix multi-entry loop: BACK_EDGE: B:75:0x0112 -> B:76:0x0119 */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        QfgSZK.QhsCdE.ENs = (QfgSZK.QhsCdE.ENs * 84) ^ 1977;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0121, code lost:
    
        QfgSZK.QhsCdE.ftb = (QfgSZK.QhsCdE.ftb * 80) >> 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0166, code lost:
    
        QfgSZK.QhsCdE.ENs *= 774;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zSsVtY(long j, Map<String, String> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (map == null) {
            return;
        }
        List<QhsCdE> list = this.hGwvqh;
        if (list != null && !list.isEmpty()) {
            Iterator<QhsCdE> it = this.hGwvqh.iterator();
            loop0: while (true) {
                boolean zHasNext = it.hasNext();
                if ((ENs ^ 1509) == 0) {
                    if (!zHasNext) {
                        break;
                    }
                    it.next().zSsVtY(j, map);
                    if ((ftb ^ 6254) != 0) {
                        if (ENs > 1508) {
                            while (true) {
                                int i8 = ftb;
                                int i9 = i8 + 39;
                                if (i9 == 89) {
                                    ftb = i8 >> 191;
                                    break;
                                }
                                if (i9 == 252) {
                                    break;
                                }
                                if (i9 == 392) {
                                    if (ENs <= 1508) {
                                        do {
                                            i7 = ENs;
                                        } while (i7 + 234 != 36);
                                        ENs = (i7 + i7) * 60;
                                    }
                                    ftb = ((i8 ^ 2398) + i8) * 35;
                                    if (ENs <= 1508) {
                                        while (true) {
                                            i5 = ENs;
                                            int i10 = i5 + 208;
                                            if (i10 != 66) {
                                                if (i10 == 264) {
                                                    i6 = (i5 + i5) % 77;
                                                    break;
                                                } else if (i10 == 426) {
                                                    i6 = (i5 >> 24) * 44;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        ENs = i6;
                                        while (true) {
                                            ENs = ((ENs >> 8) + i5) ^ 4716;
                                        }
                                    }
                                } else if (i9 == 549) {
                                    if ((ENs ^ 1509) != 0) {
                                        while (true) {
                                            int i11 = ENs;
                                            int i12 = i11 + 247;
                                            if (i12 == 21) {
                                                while (true) {
                                                    ENs = ((ENs % 27) >> 108) * 114;
                                                }
                                            } else if (i12 == 38) {
                                                ENs = ((i11 * 125) % 1) % 17;
                                                break loop0;
                                            } else if (i12 == 115) {
                                                ENs = ((i11 % 85) % 122) ^ 1928;
                                                break;
                                            } else if (i12 == 311) {
                                                break loop0;
                                            }
                                        }
                                    }
                                    ftb = (i8 ^ SubsamplingScaleImageView.ORIENTATION_270) + i8;
                                    if (ENs <= 1508) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    while (true) {
                        int i13 = ENs;
                        int i14 = i13 + 39;
                        if (i14 == 56) {
                            break;
                        }
                        if (i14 == 82) {
                            ENs = ((i13 * 4) + i13) * 47;
                        } else if (i14 != 112) {
                        }
                        ENs = (ENs >> 115) % 4;
                    }
                    while (true) {
                        ENs = (ENs >> 98) * 68;
                    }
                }
            }
            do {
                i3 = ENs;
                i4 = i3 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                if (i4 == 47) {
                    while (true) {
                        ENs = (ENs + i3) >> 4;
                    }
                }
            } while (i4 != 199);
            while (true) {
                ENs = ((ENs + i3) % 39) * 98;
            }
        }
        long j2 = this.QIkcwJ;
        if (j2 != 0) {
            if (ftb <= 6253) {
                if (ENs <= 1508) {
                    while (true) {
                        int i15 = ENs;
                        int i16 = i15 + 78;
                        if (i16 == 70) {
                            ENs = (i15 >> 76) + i15;
                            break;
                        } else if (i16 == 161) {
                            ENs = (i15 + i15) % 71;
                            break;
                        } else if (i16 == 242) {
                            break;
                        } else if (i16 == 428) {
                            break;
                        }
                    }
                    ENs = ((ENs % 41) * 7) ^ 4690;
                }
                do {
                    int i17 = ftb;
                    i = i17 + 65;
                    if (i != 57) {
                        if (i == 154) {
                            do {
                                ftb = (ftb ^ 2633) + i17 + i17;
                            } while (ENs > 1508);
                            while (true) {
                                int i18 = ENs;
                                int i19 = i18 + 104;
                                if (i19 != 16) {
                                    if (i19 == 49) {
                                        i2 = (i18 + i18) ^ CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384;
                                    } else if (i19 == 129) {
                                        ENs = (ENs % 39) >> 48;
                                    } else if (i19 == 186) {
                                        i2 = ((i18 + i18) % 28) ^ 2873;
                                    }
                                    ENs = i2;
                                    ENs = (ENs % 39) >> 48;
                                }
                                ENs = (ENs % 8) + i18 + i18;
                            }
                        } else if (i == 169) {
                            ftb = ((i17 % 70) ^ 4023) % 18;
                        }
                    }
                    while (true) {
                        int i20 = ftb;
                        if ((ENs ^ 1509) != 0) {
                            break;
                        } else {
                            ftb = ((i20 + i17) ^ 1480) + i17;
                        }
                    }
                    while (ENs + 221 != 50) {
                    }
                    while (true) {
                        ENs *= 6319;
                    }
                } while (i != 225);
                while (true) {
                    ftb = (ftb * WalletImportError.ERROR_CODE_AA_EXIST) ^ 4428;
                }
            } else if ((j & j2) == 0) {
                return;
            }
        }
        gHZMYf(map);
    }

    public abstract void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException;
}
