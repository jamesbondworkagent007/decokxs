package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import QfgSZK.OeawrH;
import QfgSZK.RjCdvp;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.media.MediaDrm;
import android.os.Debug;
import android.os.Environment;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentTransaction;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public class DGUQLI {
    private static String DlIaRS;
    public static int EDt;
    private static String RvDOIF;
    public static int _LG;
    private static String aesNIM;
    private static final Method dtVnaF;
    static String hXNsxp;
    private static String sqLYTM;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: QfgSZK.DGUQLI$DGUQLI, reason: collision with other inner class name */
    public static final class EnumC0001DGUQLI {
        public static final EnumC0001DGUQLI CDMA;
        public static final EnumC0001DGUQLI GSM;
        public static final EnumC0001DGUQLI LTE;
        public static final EnumC0001DGUQLI UNKOWN;
        public static final EnumC0001DGUQLI WCDMA;
        public static int dKE = 0;
        private static final /* synthetic */ EnumC0001DGUQLI[] gkhjaB;
        public static int sr_ = 4544;
        private final String QMfgOI;
        private final int aQgGRc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            dKE = 3704;
            GCXiNH.OHr = 2270;
            CDMA = new EnumC0001DGUQLI(GCXiNH.fsw("^UvM"), 0, GCXiNH.fsw("^UvM"), 3);
            GSM = new EnumC0001DGUQLI(GCXiNH.fsw("ZBv"), 1, GCXiNH.fsw("ZBv"), 1);
            LTE = new EnumC0001DGUQLI(GCXiNH.fsw("QE~"), 2, GCXiNH.fsw("QE~"), 0);
            UNKOWN = new EnumC0001DGUQLI(GCXiNH.fsw("H_pC|\u007f"), 3, GCXiNH.fsw("REsIy"), 99);
            WCDMA = new EnumC0001DGUQLI(GCXiNH.fsw("JR\u007fAj"), 4, GCXiNH.fsw("H\\o_"), 2);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:15:0x0026) to fix multi-entry loop: BACK_EDGE: B:15:0x0026 -> B:16:0x0028 */
        /* JADX DEBUG: Duplicate block (B:18:0x0037) to fix multi-entry loop: BACK_EDGE: B:17:0x0030 -> B:18:0x0037 */
        /* JADX DEBUG: Duplicate block (B:48:0x00a1) to fix multi-entry loop: BACK_EDGE: B:48:0x00a1 -> B:49:0x00a3 */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0037, code lost:
        
            QfgSZK.DGUQLI.EnumC0001DGUQLI.sr_ = ((QfgSZK.DGUQLI.EnumC0001DGUQLI.sr_ * 36) + r1) >> 120;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EnumC0001DGUQLI(String str, int i, String str2, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = sr_;
            if (i9 > 4543) {
                if ((dKE ^ 3704) != 0) {
                    if (i9 <= 4543) {
                        while (true) {
                            int i10 = sr_;
                            int i11 = i10 + 26;
                            if (i11 != 40) {
                                if (i11 == 63) {
                                    sr_ = ((i10 >> 32) % 106) >> 56;
                                }
                            }
                            sr_ = sr_ + i10 + i10;
                        }
                    } else {
                        do {
                            int i12 = dKE;
                            i3 = i12 + 13;
                            if (i3 == 7) {
                                dKE = (i12 + i12) * 53;
                                if ((sr_ ^ 4544) != 0) {
                                    do {
                                        i4 = sr_;
                                        i5 = i4 + 65;
                                        if (i5 == 54) {
                                            sr_ = i4 + i4 + i4;
                                        } else if (i5 == 59) {
                                            sr_ = (sr_ ^ 4948) >> 47;
                                        } else if (i5 != 81) {
                                        }
                                        sr_ = (sr_ + i4) * 13;
                                        sr_ = (sr_ ^ 4948) >> 47;
                                    } while (i5 != 174);
                                    while (true) {
                                        sr_ = (sr_ ^ 4603) + i4;
                                    }
                                }
                            }
                        } while (i3 != 56);
                        do {
                            dKE = (dKE * 50) ^ 3383;
                        } while ((sr_ ^ 4544) == 0);
                        do {
                            i6 = sr_;
                            i7 = i6 + 52;
                            if (i7 == 96) {
                                sr_ = (i6 * 60) ^ 7950;
                            } else if (i7 != 251) {
                                if (i7 == 345) {
                                    while (true) {
                                        sr_ = ((sr_ % 67) + i6) ^ 3665;
                                    }
                                }
                            }
                            sr_ = ((sr_ >> 53) % 13) % 45;
                            while (true) {
                                sr_ = ((sr_ % 67) + i6) ^ 3665;
                            }
                        } while (i7 != 507);
                        while (true) {
                            sr_ = ((sr_ + i6) % 7) + i6;
                        }
                    }
                }
                this.QMfgOI = str2;
                this.aQgGRc = i2;
                return;
            }
            while (true) {
                i8 = sr_;
                int i13 = i8 + 13;
                if (i13 != 13) {
                    if (i13 == 169) {
                        sr_ = (i8 % 120) * 16;
                        break;
                    } else if (i13 == 264) {
                        sr_ = i8 + i8 + i8;
                        break;
                    } else if (i13 == 387) {
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                sr_ = ((sr_ >> 78) * 83) + i8;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ EnumC0001DGUQLI[] gEmmrt() {
            EnumC0001DGUQLI[] enumC0001DGUQLIArr = new EnumC0001DGUQLI[5];
            enumC0001DGUQLIArr[0] = CDMA;
            enumC0001DGUQLIArr[1] = GSM;
            if ((sr_ ^ 4544) == 0) {
                enumC0001DGUQLIArr[2] = LTE;
                enumC0001DGUQLIArr[3] = UNKOWN;
                enumC0001DGUQLIArr[4] = WCDMA;
                return enumC0001DGUQLIArr;
            }
            while (sr_ + 13 != 76) {
            }
            while (true) {
                sr_ = (sr_ >> WebSocketProtocol.PAYLOAD_SHORT) * 19;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static EnumC0001DGUQLI valueOf(String str) {
            return (EnumC0001DGUQLI) Enum.valueOf(EnumC0001DGUQLI.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static EnumC0001DGUQLI[] values() {
            return (EnumC0001DGUQLI[]) gkhjaB.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getLabel() {
            return this.QMfgOI;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getPriority() {
            return this.aQgGRc;
        }
    }

    public class OvDItG implements Callable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RYVTbL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            DTg(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void DTg(boolean z) {
            if (z) {
                DTg(false);
            }
            RYVTbL = GCXiNH.fsw("ytMeHTTpeYWFcM");
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        public String call() {
            try {
                MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                try {
                    byte[] propertyByteArray = mediaDrm.getPropertyByteArray(RYVTbL);
                    if (DGUQLI.zlvcHA(propertyByteArray)) {
                        mediaDrm.release();
                        return null;
                    }
                    String strEncodeToString = Base64.encodeToString(propertyByteArray, 2);
                    mediaDrm.release();
                    return strEncodeToString;
                } finally {
                }
            } catch (Exception unused) {
                return null;
            }
            return null;
        }
    }

    public static class dZmdUa {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QenIvJ = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RhealG = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String ggGwYk = null;
        public static int zHU = 6313;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String zLImVk;
        public static int zkp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i;
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            if ((zHU ^ 6313) != 0) {
                do {
                    i = zHU;
                } while (i + 13 != 43);
                zHU = (i ^ 1554) + i;
            }
            zkp = 7916;
            fBE(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private dZmdUa() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:64:0x00fc) to fix multi-entry loop: BACK_EDGE: B:64:0x00fc -> B:63:0x00f7 */
        /* JADX DEBUG: Duplicate block (B:78:0x0137) to fix multi-entry loop: BACK_EDGE: B:77:0x012e -> B:78:0x0137 */
        public static /* synthetic */ void fBE(boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            if (z) {
                fBE(false);
            }
            QenIvJ = GCXiNH.fsw("ytHoYXqjeGL");
            if (zkp > 7915) {
                RhealG = GCXiNH.fsw("otHyGE");
                String strFsw = GCXiNH.fsw("^}TbNU");
                if ((zHU ^ 6313) != 0) {
                    while (true) {
                        i = zHU;
                        int i6 = i + 52;
                        if (i6 == 73) {
                            zHU = ((i % 94) % 11) * 92;
                            break;
                        } else {
                            if (i6 == 84) {
                                break;
                            }
                            if (i6 == 234) {
                                zHU = (i % WebSocketProtocol.PAYLOAD_SHORT) >> 69;
                            } else if (i6 == 237) {
                                zHU = ((zHU * 15) + i) ^ 1790;
                                break;
                            }
                        }
                    }
                    while (true) {
                        zHU = ((zHU % 33) + i) * 23;
                        zHU = ((zHU * 15) + i) ^ 1790;
                    }
                }
                zLImVk = strFsw;
                ggGwYk = GCXiNH.fsw("WBtB\u000bRs{m\\KLD\tNF_YAAW\u0011");
                return;
            }
            if (zHU <= 6312) {
                while (true) {
                    int i7 = zHU;
                    int i8 = i7 + 39;
                    if (i8 == 57) {
                        break;
                    } else if (i8 == 189) {
                        zHU = ((i7 >> 48) % 14) >> 3;
                    }
                }
                while (true) {
                    zHU = (zHU ^ 4515) * WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                }
            } else {
                while (true) {
                    i2 = zkp;
                    if ((zHU ^ 6313) != 0) {
                        do {
                            i4 = zHU;
                            i5 = i4 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                            if (i5 == 42) {
                                while (true) {
                                    zHU = (zHU % 98) * 33;
                                }
                            }
                        } while (i5 != 47);
                        zHU = (i4 >> 41) + i4;
                    }
                    int i9 = i2 + 26;
                    if (i9 != 48) {
                        if (i9 != 67) {
                            if (i9 == 220) {
                                zkp = (zkp * 16) + i2;
                                break;
                            }
                            if (i9 == 330) {
                                zkp = (zkp * 12) ^ 2928;
                                if ((zHU ^ 6313) != 0) {
                                    while (true) {
                                        int i10 = zHU;
                                        int i11 = i10 + 65;
                                        if (i11 != 74) {
                                            if (i11 != 235) {
                                                if (i11 == 259) {
                                                    zHU = ((i10 % 41) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) ^ 2465;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    zHU = ((zHU ^ 2927) >> 77) ^ 4770;
                                    zHU = (zHU * 6600) ^ 3110;
                                }
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                int i12 = zkp;
                int i13 = zHU;
                int i14 = i13 ^ 6313;
                if (i14 != 0) {
                    while (zHU + 117 != 85) {
                    }
                    while (true) {
                        zHU ^= 764;
                    }
                } else if (i14 != 0) {
                    while (zHU + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 != 99) {
                    }
                    while (true) {
                        zHU = ((zHU * 49) ^ 4485) >> 69;
                    }
                } else {
                    zkp = ((i12 + i2) % 64) >> 39;
                    if (i13 <= 6312) {
                        do {
                            i3 = zHU;
                        } while (i3 + 78 != 69);
                        while (true) {
                            zHU = (zHU % 90) + i3;
                        }
                    }
                    while (true) {
                        zkp = (zkp + i2) * 44;
                    }
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static RjCdvp.EnumC0008RjCdvp gtCCJH(String str) {
            if (UPbYzn.iSpHlg(str)) {
                return RjCdvp.EnumC0008RjCdvp.COULD_NOT_CHECK;
            }
            try {
                return RjCdvp.EnumC0008RjCdvp.valueOf(str.toUpperCase());
            } catch (IllegalArgumentException e) {
                ORrpqH.uzCIH().seuMaA(e);
                return RjCdvp.EnumC0008RjCdvp.COULD_NOT_CHECK;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String zSsVtY(RjCdvp.EnumC0008RjCdvp enumC0008RjCdvp) {
            if (enumC0008RjCdvp == null) {
                return RjCdvp.UKISMj;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(QenIvJ, enumC0008RjCdvp.dBFhBU);
                if (enumC0008RjCdvp.zrZlgc) {
                    jSONObject.put(RhealG, zLImVk);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                FQMcgE.fQMcgE.svhCHd(DGUQLI.DlIaRS, ggGwYk + e.toString());
                ORrpqH.uzCIH().seuMaA(e);
                return RjCdvp.feYVnX;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String zSsVtY(String str) {
            return zSsVtY(gtCCJH(str));
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class ekVPG {
        static final int CELL_INFO_MIN_COUNT = 3;
        public static int Eps = 6475;
        static String GWPjH = null;
        static final int INVALID_SIGNAL_STRENGTH = 99;
        static String ODeSxk;
        static String OYSuiT;
        static String OaAXHF;
        static String RQlHLZ;
        static String aZDIZb;
        static String bSZTb;
        static String dBzApi;
        static String dCsLsZ;
        static String dewVnW;
        static String fCEvCg;
        static String gRqiYi;
        static String hqMsjh;
        static String zzGicR;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            OaAXHF = GCXiNH.fsw("s~");
            RQlHLZ = GCXiNH.fsw("s~U");
            bSZTb = GCXiNH.fsw("srdeX^");
            OYSuiT = GCXiNH.fsw("nbdhi\\");
            dBzApi = GCXiNH.fsw("n}dMxd");
            dCsLsZ = GCXiNH.fsw("n}deEE");
            ODeSxk = GCXiNH.fsw("~x_");
            GWPjH = GCXiNH.fsw("qpX");
            zzGicR = GCXiNH.fsw("mbX");
            gRqiYi = GCXiNH.fsw("~xR");
            aZDIZb = GCXiNH.fsw("\u007fbd`JE");
            hqMsjh = GCXiNH.fsw("\u007fbd`EV");
            fCEvCg = GCXiNH.fsw("nx_");
            dewVnW = GCXiNH.fsw("\u007fbRh");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private ekVPG() {
        }
    }

    public static class hJrIAr {
        public static int OnP = 4161;
        public static int Rbs = 8531;
        int hpWntT;
        int zCOrnd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:15:0x0026) to fix multi-entry loop: BACK_EDGE: B:15:0x0026 -> B:16:0x0028 */
        /* JADX DEBUG: Duplicate block (B:18:0x0039) to fix multi-entry loop: BACK_EDGE: B:17:0x0031 -> B:18:0x0039 */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            QfgSZK.DGUQLI.hJrIAr.Rbs = ((QfgSZK.DGUQLI.hJrIAr.Rbs % 122) >> 105) % 82;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public hJrIAr() {
            if ((Rbs ^ 8531) == 0) {
                this.zCOrnd = 0;
                this.hpWntT = 0;
                return;
            }
            while (true) {
                int i = Rbs;
                int i2 = i + 13;
                if (i2 != 80) {
                    if (i2 == 158) {
                        Rbs = (i * 107) >> 76;
                        break;
                    } else if (i2 == 223) {
                        Rbs = (i + i) ^ 5066;
                        break;
                    } else if (i2 == 312) {
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                Rbs = ((Rbs ^ 1854) * 100) >> 121;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:28:0x00b0) to fix multi-entry loop: BACK_EDGE: B:27:0x00a8 -> B:28:0x00b0 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static {
        /*
            r0 = 9057(0x2361, float:1.2692E-41)
            QfgSZK.FQMcgE.RQa = r0
            r0 = 4889(0x1319, float:6.851E-42)
            QfgSZK.AuCTel.ztU = r0
            r0 = 9231(0x240f, float:1.2935E-41)
            QfgSZK.FQMcgE.fQMcgE.CEb = r0
            r0 = 2347(0x92b, float:3.289E-42)
            QfgSZK.DGUQLI._LG = r0
            r1 = 3987(0xf93, float:5.587E-42)
            QfgSZK.GCXiNH.Cwg = r1
            r1 = 9383(0x24a7, float:1.3148E-41)
            QfgSZK.AuCTel.kWh = r1
            r1 = 2270(0x8de, float:3.181E-42)
            QfgSZK.GCXiNH.OHr = r1
            r1 = 6842(0x1aba, float:9.588E-42)
            QfgSZK.FQMcgE.usN = r1
            r1 = 7426(0x1d02, float:1.0406E-41)
            QfgSZK.DGUQLI.EDt = r1
            java.lang.String r1 = "sxW"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            QfgSZK.DGUQLI.aesNIM = r1
            int r1 = QfgSZK.DGUQLI._LG
            r1 = r1 ^ r0
            if (r1 == 0) goto L42
        L31:
            int r1 = QfgSZK.DGUQLI._LG
            int r0 = r1 + 52
            r2 = 74
            if (r0 == r2) goto L3a
            goto L31
        L3a:
            int r0 = QfgSZK.DGUQLI._LG
            r0 = r0 ^ 2091(0x82b, float:2.93E-42)
            int r0 = r0 + r1
            QfgSZK.DGUQLI._LG = r0
            goto L3a
        L42:
            java.lang.String r1 = "|v^b_nlqnANF"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            QfgSZK.DGUQLI.hXNsxp = r1
            java.lang.String r1 = "IyIiJEL{xZK[gFJNZPgwynd"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            QfgSZK.DGUQLI.sqLYTM = r1
            java.lang.String r1 = "Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            QfgSZK.DGUQLI.RvDOIF = r1
            java.lang.Class<QfgSZK.DGUQLI> r1 = QfgSZK.DGUQLI.class
            java.lang.String r1 = QfgSZK.FQMcgE.hfdhUn(r1)
            QfgSZK.DGUQLI.DlIaRS = r1
            int r1 = QfgSZK.DGUQLI.EDt
            r2 = 7425(0x1d01, float:1.0405E-41)
            if (r1 > r2) goto Lb3
        L68:
            int r1 = QfgSZK.DGUQLI.EDt
            int r2 = r1 + 13
            r3 = 65
            if (r2 == r3) goto L71
            goto L68
        L71:
            int r1 = r1 * 98
            int r1 = r1 >> 107
            QfgSZK.DGUQLI.EDt = r1
            int r1 = QfgSZK.DGUQLI._LG
            r1 = r1 ^ r0
            if (r1 == 0) goto Lb3
        L7c:
            int r0 = QfgSZK.DGUQLI._LG
            int r1 = r0 + 13
            r2 = 32
            if (r1 == r2) goto L9e
            r2 = 78
            if (r1 == r2) goto L95
            r2 = 100
            if (r1 == r2) goto La8
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L91
            goto L7c
        L91:
            int r0 = r0 * 2112
            QfgSZK.DGUQLI._LG = r0
        L95:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 >> 115
            int r0 = r0 % 98
            int r0 = r0 % 41
            goto Lb0
        L9e:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 % 52
            int r0 = r0 % 27
            r0 = r0 ^ 4417(0x1141, float:6.19E-42)
            QfgSZK.DGUQLI._LG = r0
        La8:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 % 29
            r0 = r0 ^ 4975(0x136f, float:6.971E-42)
            int r0 = r0 >> 36
        Lb0:
            QfgSZK.DGUQLI._LG = r0
            goto L9e
        Lb3:
            QfgSZK.AuCTel$auCTel r1 = QfgSZK.AuCTel.auCTel.SYSTEM_PROPERTIES
            java.lang.Class r1 = QfgSZK.AuCTel.wlaJM(r1)
            java.lang.String r2 = "ztO"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)
            int r3 = QfgSZK.DGUQLI._LG
            r0 = r0 ^ r3
            if (r0 == 0) goto Lf9
        Lc4:
            int r0 = QfgSZK.DGUQLI._LG
            int r3 = r0 + 65
            r4 = 54
            if (r3 == r4) goto Lee
            r4 = 246(0xf6, float:3.45E-43)
            if (r3 == r4) goto Le7
            r4 = 398(0x18e, float:5.58E-43)
            if (r3 == r4) goto Le0
            r4 = 572(0x23c, float:8.02E-43)
            if (r3 == r4) goto Ld9
            goto Lc4
        Ld9:
            int r3 = r0 * 14
            int r3 = r3 + r0
            int r0 = r3 >> 8
            QfgSZK.DGUQLI._LG = r0
        Le0:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 >> 40
            int r0 = r0 * 25
            goto Leb
        Le7:
            int r0 = r0 * 14
            r0 = r0 ^ 4980(0x1374, float:6.978E-42)
        Leb:
            QfgSZK.DGUQLI._LG = r0
            goto Lf9
        Lee:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 >> 111
            r0 = r0 ^ 2011(0x7db, float:2.818E-42)
            int r0 = r0 * 30
            QfgSZK.DGUQLI._LG = r0
            goto Lee
        Lf9:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.reflect.Method r0 = QfgSZK.AuCTel.zLjUOn(r1, r2, r0)
            QfgSZK.DGUQLI.dtVnaF = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DGUQLI.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static String DBxZfM(Map<String, String> map) {
        if (map.size() >= 3) {
            return map.toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DGgnkA(ZqidTP zqidTP) {
        return new HJWChP.zRXNTw(zqidTP).DGgnkA();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DNMMPQ() {
        return GCXiNH.fsw("|\u007f_~DXe");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DaRZkR(Context context, Set<String> set) {
        if (set != null && !set.isEmpty()) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (String str : set) {
                    int iIndexOf = listAsList.indexOf(str);
                    if (iIndexOf != -1) {
                        String strSubstring = str.substring(str.lastIndexOf(JwtUtilsKt.JWT_DELIMITER) + 1);
                        if ((packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(strSubstring);
                        } else {
                            if (sb2.length() > 0) {
                                sb2.append(",");
                            }
                            sb2.append(strSubstring);
                        }
                    }
                }
                if (sb.length() == 0 && sb2.length() == 0) {
                    return null;
                }
                StringBuilder sb3 = new StringBuilder("[");
                if (sb.length() > 0) {
                    sb3.append(GCXiNH.fsw("?vImEEdz6"));
                    sb3.append((CharSequence) sb);
                    sb3.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                }
                if (sb2.length() > 0) {
                    if (sb.length() > 0) {
                        sb3.append(",");
                    }
                    sb3.append(GCXiNH.fsw("?u^bBTe$"));
                    sb3.append((CharSequence) sb2);
                    sb3.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                }
                sb3.append("]");
                return sb3.toString();
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DsrFlB() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String OTwTPd(Map<String, String> map) {
        int i;
        int i2;
        int i3;
        if (map.isEmpty()) {
            return null;
        }
        String str = map.get(GCXiNH.fsw("UpIh\\Ps{"));
        String str2 = map.get(GCXiNH.fsw("McToNBrq~"));
        if (str != null && str2 != null) {
            return str2 + GCXiNH.fsw("=<\u001b") + str;
        }
        if (str == null) {
            return str2;
        }
        if ((EDt ^ 7426) == 0) {
            return str;
        }
        if ((_LG ^ 2347) != 0) {
            do {
                i3 = _LG;
            } while (i3 + 65 != 84);
            _LG = (i3 * 27) % 94;
        }
        while (EDt + 52 != 35) {
        }
        do {
            EDt = ((EDt % 92) >> 36) ^ 4556;
        } while ((_LG ^ 2347) == 0);
        do {
            i = _LG;
            i2 = i + 78;
            if (i2 == 95) {
                while (true) {
                    _LG = (_LG % 15) + i;
                }
            }
        } while (i2 != 106);
        while (true) {
            _LG = ((_LG % 93) ^ 2566) + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static GQzpsZ OcIXYQ(ZqidTP zqidTP) throws InterruptedException {
        return FYtjSf.sYcwUD(zqidTP.Umbazn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean QDqgQU(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName.isAnyLocalAddress()) {
                return true;
            }
            return byName.isLoopbackAddress();
        } catch (UnknownHostException e) {
            ORrpqH.uzCIH().seuMaA(e);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:100:0x01ed) to fix multi-entry loop: BACK_EDGE: B:99:0x01e5 -> B:100:0x01ed */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f4, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 42) >> 68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        if (QfgSZK.DGUQLI._LG <= 2346) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012a, code lost:
    
        r6 = QfgSZK.DGUQLI.EDt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        if ((r6 + 117) == 60) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
    
        QfgSZK.DGUQLI.EDt = ((r6 >> 6) % 56) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        if ((QfgSZK.DGUQLI._LG ^ 2347) == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r6 = QfgSZK.DGUQLI._LG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        if ((r6 + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA) == 67) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        QfgSZK.DGUQLI._LG = ((r6 % 36) % 115) ^ 1050;
     */
    /* JADX WARN: Path cross not found for [B:142:?, B:140:?], limit reached: 159 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0149 -> B:53:0x012a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String QIZEnU(ZqidTP zqidTP, Map<String, String> map, Map<String, String> map2) throws InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOHNGh}inKMMLZWD\\ZG\u001a\u0018"));
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (Thread.currentThread().isInterrupted()) {
            return "";
        }
        try {
            Object systemService = zqidTP.Umbazn.getApplicationContext().getSystemService(GCXiNH.fsw("myTbN"));
            if (!(systemService instanceof TelephonyManager)) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            String strFsw = GCXiNH.fsw("H\u007fPbDFo");
            if (telephonyManager.getPhoneType() == 1) {
                strFsw = telephonyManager.getNetworkOperatorName();
            }
            sb.append(strFsw);
            sb.append(telephonyManager.getSimCountryIso());
            sb.append(((akftKQ() / 1024.0f) / 1024.0f) / 1024.0f);
            ZxnNGp zxnNGp = new ZxnNGp(zqidTP);
            int iSGvRiA = zxnNGp.sGvRiA();
            int iDjzMc = zxnNGp.DjzMc();
            if (iSGvRiA >= iDjzMc) {
                sb.append(iSGvRiA);
                sb.append("x");
                sb.append(iDjzMc);
                if ((EDt ^ 7426) != 0) {
                    do {
                        i2 = EDt;
                        i3 = i2 + 78;
                        if (i3 != 39) {
                            if (i3 == 180) {
                                EDt = (i2 % 33) >> 63;
                            }
                        }
                        do {
                            EDt = (EDt * 62) % 31;
                        } while ((_LG ^ 2347) == 0);
                        while (true) {
                            int i6 = _LG;
                            int i7 = i6 + 247;
                            if (i7 == 58) {
                                _LG = ((i6 % 87) % 61) % 72;
                            } else if (i7 != 242) {
                            }
                            _LG = (_LG >> 49) ^ 4429;
                        }
                    } while (i3 != 251);
                    EDt = (i2 + i2) % 59;
                    if (_LG <= 2346) {
                        do {
                            i4 = _LG;
                            i5 = i4 + 78;
                            if (i5 == 16) {
                                while (true) {
                                    _LG = (_LG >> 20) ^ 5163;
                                }
                            }
                        } while (i5 != 158);
                        _LG = ((i4 >> 95) + i4) ^ 2599;
                    }
                }
            } else {
                sb.append(iDjzMc);
                sb.append("x");
                sb.append(iSGvRiA);
            }
            if (!map.isEmpty()) {
                Iterator<String> it = map.values().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ",");
                    if ((EDt ^ 7426) != 0) {
                    }
                }
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pW`B_f>kMVnODaIPZ"));
            if (!map2.isEmpty()) {
                String str2 = map2.get(GCXiNH.fsw("PtVXDE`r"));
                if (str2 != null) {
                    if ((EDt ^ 7426) != 0) {
                        if (_LG <= 2346) {
                            while (true) {
                                i = _LG;
                                int i8 = i + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                if (i8 == 52) {
                                    break;
                                }
                                if (i8 == 135) {
                                    _LG = (i >> 25) + i;
                                }
                            }
                            _LG = (i + i) % 9;
                        }
                        while (true) {
                            int i9 = EDt;
                            int i10 = i9 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                            if (i10 == 4) {
                                loop11: while (true) {
                                    EDt = (EDt ^ 1000) >> CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
                                    if (_LG <= 2346) {
                                        while (true) {
                                            int i11 = _LG;
                                            int i12 = i11 + 208;
                                            if (i12 == 96) {
                                                _LG = i11 * 4;
                                                break;
                                            }
                                            if (i12 == 262) {
                                                break;
                                            }
                                            if (i12 != 422) {
                                                if (i12 == 515) {
                                                    _LG = ((i11 ^ 3342) >> 4) ^ 1504;
                                                    break loop11;
                                                }
                                            } else {
                                                break loop11;
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    _LG = ((_LG >> 27) % 19) ^ MTCoreConstants.MainWhat.ON_REGISTER_INTO;
                                }
                            } else if (i10 == 192) {
                                EDt = ((i9 ^ 2034) * 28) >> 47;
                            } else if (i10 == 259) {
                                while (true) {
                                    EDt = ((EDt >> 40) + i9) ^ 2620;
                                }
                            }
                        }
                    } else {
                        str = str2;
                    }
                }
                sb.append(str);
            }
            sb.append(HJWChP.RGtXKC.aqVCWV);
            sb.append(" ");
            sb.append(HJWChP.RGtXKC.srURBG);
            sb.append(" ");
            sb.append(HJWChP.RGtXKC.UKZhRO);
            sb.append(" ");
            sb.append(HJWChP.RGtXKC.fJilMR);
            sb.append(" ");
            sb.append(HJWChP.RGtXKC.DKRTZD.RXvltA);
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOHNGh}iaLEE\tZBB@F]WU\n\u000fV\\OS\u0012") + ((Object) sb) + ")");
            return UPbYzn.DRuYWY(sb.toString());
        } catch (SecurityException e) {
            e = e;
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e);
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            return "";
        } catch (Exception e2) {
            e = e2;
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0116 -> B:61:0x0118). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String QKudOq(QfgSZK.ZqidTP r6) {
        /*
            java.lang.String r0 = ":"
            int r1 = QfgSZK.HJWChP.RGtXKC.DKRTZD.diCPdz
            int r2 = QfgSZK.HJWChP.RGtXKC.C0004RGtXKC.UIwVdu
            if (r1 < r2) goto Lf
            java.lang.String r6 = QfgSZK.DAIeex.QKudOq(r6)
            if (r6 == 0) goto Lf
            return r6
        Lf:
            r6 = 0
            java.lang.String r1 = "ueO|\u0005AsqtQjLY]"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r1 = java.lang.System.getProperty(r1, r6)     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r2 = "ueO|\u0005AsqtQrLX]"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r2 = java.lang.System.getProperty(r2, r6)     // Catch: java.lang.SecurityException -> L11e
            boolean r3 = QfgSZK.UPbYzn.dTTfOR(r1)     // Catch: java.lang.SecurityException -> L11e
            if (r3 == 0) goto L8e
            boolean r3 = QfgSZK.UPbYzn.dTTfOR(r2)     // Catch: java.lang.SecurityException -> L11e
            if (r3 == 0) goto L8e
            java.lang.String r3 = QfgSZK.DGUQLI.DlIaRS     // Catch: java.lang.SecurityException -> L11e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L11e
            r4.<init>()     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r5 = "mcTtR\u0011hpjGPNK]AHX\u0015"
            java.lang.String r5 = QfgSZK.GCXiNH.fsw(r5)     // Catch: java.lang.SecurityException -> L11e
            r4.append(r5)     // Catch: java.lang.SecurityException -> L11e
            r4.append(r1)     // Catch: java.lang.SecurityException -> L11e
            r4.append(r0)     // Catch: java.lang.SecurityException -> L11e
            r4.append(r2)     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.SecurityException -> L11e
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r3, r4)     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r3 = "0 "
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.SecurityException -> L11e
            boolean r3 = r3.equals(r2)     // Catch: java.lang.SecurityException -> L11e
            if (r3 != 0) goto L82
            java.lang.String r3 = "q~XmGYnmx"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.SecurityException -> L11e
            boolean r3 = r3.equalsIgnoreCase(r1)     // Catch: java.lang.SecurityException -> L11e
            if (r3 != 0) goto L82
            boolean r3 = QDqgQU(r1)     // Catch: java.lang.SecurityException -> L11e
            if (r3 == 0) goto L6f
            goto L82
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L11e
            r3.<init>()     // Catch: java.lang.SecurityException -> L11e
            r3.append(r1)     // Catch: java.lang.SecurityException -> L11e
            r3.append(r0)     // Catch: java.lang.SecurityException -> L11e
            r3.append(r2)     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r6 = r3.toString()     // Catch: java.lang.SecurityException -> L11e
            return r6
        L82:
            java.lang.String r0 = QfgSZK.DGUQLI.DlIaRS     // Catch: java.lang.SecurityException -> L11e
            java.lang.String r1 = "TvUcYXoy,ALUKEAC\u0016EF\\JH"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)     // Catch: java.lang.SecurityException -> L11e
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r0, r1)     // Catch: java.lang.SecurityException -> L11e
            return r6
        L8e:
            int r0 = QfgSZK.DGUQLI.EDt
            r0 = r0 ^ 7426(0x1d02, float:1.0406E-41)
            if (r0 == 0) goto L131
            int r0 = QfgSZK.DGUQLI._LG
            r1 = 2346(0x92a, float:3.287E-42)
            if (r0 > r1) goto Lc2
        L9a:
            int r0 = QfgSZK.DGUQLI._LG
            int r2 = r0 + 78
            r3 = 9
            if (r2 == r3) goto Lbc
            r3 = 190(0xbe, float:2.66E-43)
            if (r2 == r3) goto Lb3
            r3 = 203(0xcb, float:2.84E-43)
            if (r2 == r3) goto Lab
            goto L9a
        Lab:
            int r2 = r0 % 58
            int r2 = r2 + r0
            int r2 = r2 % 61
            QfgSZK.DGUQLI._LG = r2
            goto L9a
        Lb3:
            int r6 = QfgSZK.DGUQLI._LG
            int r6 = r6 % 68
            int r6 = r6 * 12524
            QfgSZK.DGUQLI._LG = r6
            goto Lb3
        Lbc:
            int r2 = r0 % 104
            int r2 = r2 + r0
            int r2 = r2 + r0
            QfgSZK.DGUQLI._LG = r2
        Lc2:
            int r0 = QfgSZK.DGUQLI.EDt
            int r2 = r0 + 65
            r3 = 84
            if (r2 == r3) goto Le6
            r3 = 242(0xf2, float:3.39E-43)
            if (r2 == r3) goto Ldb
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 == r3) goto Ld3
            goto Lc2
        Ld3:
            int r1 = r0 >> 115
            int r1 = r1 + r0
            int r1 = r1 * 37
            QfgSZK.DGUQLI.EDt = r1
            goto L131
        Ldb:
            int r6 = QfgSZK.DGUQLI.EDt
            int r6 = r6 % 99
            r6 = r6 ^ 2284(0x8ec, float:3.2E-42)
            int r6 = r6 * 86
            QfgSZK.DGUQLI.EDt = r6
            goto Ldb
        Le6:
            int r0 = r0 + r0
            int r0 = r0 % 119
            QfgSZK.DGUQLI.EDt = r0
            int r0 = QfgSZK.DGUQLI._LG
            if (r0 > r1) goto L131
        Lef:
            int r0 = QfgSZK.DGUQLI._LG
            int r6 = r0 + 65
            r1 = 43
            if (r6 == r1) goto L109
            r1 = 101(0x65, float:1.42E-43)
            if (r6 == r1) goto L10f
            r1 = 117(0x75, float:1.64E-43)
            if (r6 == r1) goto L104
            r1 = 192(0xc0, float:2.69E-43)
            if (r6 == r1) goto L118
            goto Lef
        L104:
            int r6 = r0 >> 88
            int r6 = r6 * 1316
            goto L116
        L109:
            int r6 = r0 % 60
            int r6 = r6 * 10
            QfgSZK.DGUQLI._LG = r6
        L10f:
            int r6 = QfgSZK.DGUQLI._LG
            int r6 = r6 % 70
            r6 = r6 ^ 2479(0x9af, float:3.474E-42)
            int r6 = r6 + r0
        L116:
            QfgSZK.DGUQLI._LG = r6
        L118:
            int r6 = QfgSZK.DGUQLI._LG
            int r6 = r6 + r0
            int r6 = r6 * 78
            goto L116
        L11e:
            r0 = move-exception
            java.lang.String r1 = QfgSZK.DGUQLI.DlIaRS
            java.lang.String r2 = "NtXyYXugAILDO[\bEZZWXA\u0011QL]XOH\u001aMW\u0017VwksgstWIz"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)
            QfgSZK.FQMcgE.fQMcgE.svhCHd(r1, r2)
            QfgSZK.ORrpqH r1 = QfgSZK.ORrpqH.uzCIH()
            r1.seuMaA(r0)
        L131:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DGUQLI.QKudOq(QfgSZK.ZqidTP):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String QXDzTk() {
        String str;
        OvDItG ovDItG = new OvDItG();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(ovDItG);
        try {
            str = (String) futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            futureSubmit.cancel(true);
            str = null;
        }
        executorServiceNewSingleThreadExecutor.shutdownNow();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:26:0x007e) to fix multi-entry loop: BACK_EDGE: B:26:0x007e -> B:27:0x0080 */
    public static String RKcVTr(ZqidTP zqidTP) {
        int i;
        int i2;
        String strGeAOna = new HJWChP.zRXNTw(zqidTP).geAOna();
        HJWChP.URsaBn uRsaBn = new HJWChP.URsaBn(zqidTP.Umbazn, strGeAOna, HJWChP.QPAeHI.dCpxnE);
        int iIqeXgQ = uRsaBn.iqeXgQ();
        String strIkIEnW = uRsaBn.ikIEnW();
        StringBuilder sb = new StringBuilder();
        sb.append(strGeAOna);
        sb.append(":");
        String str = "-";
        if (strIkIEnW == null) {
            if ((EDt ^ 7426) == 0) {
                strIkIEnW = "-";
            } else if ((_LG ^ 2347) != 0) {
                while (_LG + 39 != 43) {
                }
                while (true) {
                    _LG = (_LG ^ 1866) >> 23;
                }
            } else {
                while (true) {
                    int i3 = EDt;
                    int i4 = i3 + 26;
                    if (i4 == 1) {
                        break;
                    }
                    if (i4 == 167) {
                        EDt = ((i3 * 108) % 24) + i3;
                    }
                }
                do {
                    EDt = (EDt >> 2) % 125;
                } while (_LG > 2346);
                while (true) {
                    i2 = _LG;
                    int i5 = i2 + 117;
                    if (i5 == 70) {
                        _LG = ((i2 % 53) * 51) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                        break;
                    }
                    if (i5 == 185) {
                        break;
                    }
                }
                while (true) {
                    _LG = ((_LG ^ 5307) + i2) ^ 3267;
                }
            }
        }
        sb.append(strIkIEnW);
        sb.append(":");
        sb.append(iIqeXgQ == -1 ? "-" : Integer.valueOf(iIqeXgQ));
        String strIZzfmt = AxsJAY.uzCIH().iZzfmt();
        sb.append(":");
        if (strIZzfmt != null) {
            str = strIZzfmt;
        } else if ((EDt ^ 7426) != 0) {
            do {
                i = EDt;
            } while (i + 78 != 41);
            EDt = i + i + i;
            if ((_LG ^ 2347) != 0) {
                while (true) {
                    int i6 = _LG;
                    int i7 = i6 + 91;
                    if (i7 != 7) {
                        if (i7 == 199) {
                            _LG = (i6 >> 16) + i6;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    _LG = ((_LG ^ FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN) >> 121) % 75;
                }
            }
        }
        sb.append(str);
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("zpUz"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("\\aK`BR`jeGL\u0003cGNH\u0016") + sb.toString());
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String RVsVBY() {
        return GCXiNH.fsw("\\\u007f_~DXe");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long RXzakW() {
        UvfnWv uvfnWv = new UvfnWv(Environment.getDataDirectory().getPath());
        long jOfWYUE = uvfnWv.OfWYUE();
        long jFdcJU = uvfnWv.FdcJU();
        long j = 0;
        if (jOfWYUE != 0 && jFdcJU != 0) {
            j = ((((jOfWYUE * jFdcJU) >> 20) << 20) / 10) * 10;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("zwH"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[c^i\u000bBq\u007foM\u0002LD\t\\OS\u0015D[]_U\u000f") + j);
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long TarCU(String str) {
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb) {
            try {
                return HJWChP.hFGucI.aBDePw(str);
            } catch (Exception e) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Iy^,XE`j,irj\n@[\u0007XZ@\u0013SGQFR\\^W_\u0019WE\u0006lp#d`iRIm*"));
                ORrpqH.uzCIH().seuMaA(e);
            }
        }
        try {
            return new File(str).lastModified();
        } catch (SecurityException e2) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pUbDE!liIF\u0003^AM\u0007P\\XV") + str);
            ORrpqH.uzCIH().seuMaA(e2);
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String ULRxlR(ZqidTP zqidTP) {
        return DQzvGN.gdmIOq(zqidTP.Umbazn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String Ufzxmz() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("_");
                sb.append(country);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:49:0x011a) to fix multi-entry loop: BACK_EDGE: B:48:0x0114 -> B:49:0x011a */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void UhxbNG(TelephonyManager telephonyManager, Map<String, String> map) {
        int i;
        List<NeighboringCellInfo> list;
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.UIwVdu || !HJWChP.fvRMlC.gLWkOL()) {
            return;
        }
        try {
            Method methodZLjUOn = AuCTel.zLjUOn(TelephonyManager.class, GCXiNH.fsw("ztOBNXfvnGPJDNkBZY}]T^"), new Class[0]);
            if (methodZLjUOn != null) {
                Object objFIwbmz = AuCTel.fIwbmz(telephonyManager, methodZLjUOn, new Object[0]);
                list = objFIwbmz instanceof List ? (List) objFIwbmz : null;
            }
            if (list == null || list.size() <= 0) {
                return;
            }
            for (NeighboringCellInfo neighboringCellInfo : list) {
                if (neighboringCellInfo.getCid() != -1 && neighboringCellInfo.getRssi() != 99 && (String.valueOf(neighboringCellInfo.getCid()).equalsIgnoreCase(map.get(GCXiNH.fsw("~x_"))) || String.valueOf(neighboringCellInfo.getCid()).equalsIgnoreCase(map.get(GCXiNH.fsw("\u007fbRh"))))) {
                    map.put(GCXiNH.fsw("n}dMxd"), String.valueOf(neighboringCellInfo.getRssi()));
                }
            }
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e.getMessage());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            if ((EDt ^ 7426) == 0) {
                return;
            }
            do {
                i = EDt;
            } while (i + 104 != 58);
            do {
                EDt = ((EDt + i) * 27) >> 73;
            } while (_LG > 2346);
            while (true) {
                int i2 = _LG;
                int i3 = i2 + 130;
                if (i3 == 68) {
                    break;
                }
                if (i3 == 232) {
                    break;
                }
                if (i3 == 261) {
                    _LG = (i2 * 71) ^ 3075;
                    break;
                }
            }
            _LG = ((_LG ^ 3448) * 75) >> 114;
            while (true) {
                _LG = (_LG * 16) >> 96;
            }
        } catch (Exception e2) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean UscePu(ZqidTP zqidTP) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ContentResolver contentResolver = zqidTP.Umbazn.getContentResolver();
        if ((_LG ^ 2347) == 0) {
            String strHwXsuq = HJWChP.iaHEvk.hwXsuq(contentResolver, GCXiNH.fsw("p~Xgt]n}m\\KLD"));
            if (strHwXsuq == null || !strHwXsuq.equals("1")) {
                return false;
            }
            if ((EDt ^ 7426) != 0) {
                do {
                    i = EDt;
                    i2 = i + 26;
                    if (i2 == 58) {
                        do {
                            EDt = (EDt + i) ^ 3710;
                        } while ((_LG ^ 2347) == 0);
                        while (true) {
                            i3 = _LG;
                            int i6 = i3 + 65;
                            if (i6 != 15) {
                                if (i6 != 21) {
                                    if (i6 == 121) {
                                        _LG = ((i3 + i3) ^ 5298) >> 46;
                                    } else if (i6 == 193) {
                                        break;
                                    }
                                }
                                i4 = ((_LG ^ 3215) >> 81) % 90;
                            } else {
                                i4 = ((i3 + i3) ^ 4533) % 46;
                            }
                            _LG = i4;
                        }
                        while (true) {
                            _LG = _LG + i3 + i3;
                        }
                    }
                } while (i2 != 67);
                EDt = i >> 138;
            }
            return true;
        }
        do {
            i5 = _LG;
        } while (i5 + 13 != 27);
        while (true) {
            _LG = ((_LG ^ 1990) + i5) % 10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String aHXSQp(ZqidTP zqidTP) {
        return HJWChP.iaHEvk.DzCpqu(zqidTP.Umbazn.getContentResolver(), GCXiNH.fsw("|uYSN_`|`MF"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String aJFbMH(int i) {
        String line;
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < i) {
            File file = new File(GCXiNH.fsw("2bB\u007f\u0004UdheKGP\u0005ZQTBPY\u001cQAE\u0000]MI") + i3 + GCXiNH.fsw("2rKyMCdo#[ABF@F@iVAAmWBJO"));
            boolean zExists = file.exists();
            if (i == 1 && !zExists) {
                file = new File(GCXiNH.fsw("2bB\u007f\u0004UdheKGP\u0005ZQTBPY\u001cQAE\u0000]MI\u0014YIMQT`u,qbaREgcTi|zXpgqb"));
                zExists = file.exists();
            }
            if (zExists) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("xcIcY\u001co") + i3, (Throwable) e);
                    line = "0";
                }
                if (sb.length() > 0) {
                    sb.append(",");
                }
                if (line != null) {
                    sb.append(line);
                }
            }
            i3++;
            if ((EDt ^ 7426) != 0) {
                while (true) {
                    int i4 = EDt;
                    int i5 = i4 + 104;
                    if (i5 == 32) {
                        EDt = (i4 ^ 1495) >> 90;
                    } else if (i5 != 147) {
                        if (i5 == 187) {
                            EDt = (i4 ^ 2679) + i4;
                            break;
                        }
                    }
                    EDt = (EDt >> 61) * 32;
                    if (_LG <= 2346) {
                        while (true) {
                            i2 = _LG;
                            int i6 = i2 + 117;
                            if (i6 == 4) {
                                while (true) {
                                    _LG = ((_LG + i2) % 56) * 41;
                                }
                            } else {
                                if (i6 == 203) {
                                    break;
                                }
                                if (i6 == 226) {
                                    while (true) {
                                        _LG = (_LG >> 57) % 17;
                                    }
                                } else if (i6 == 240) {
                                    _LG = i2 ^ 6181;
                                    break;
                                }
                            }
                        }
                        _LG = (_LG >> CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256) + i2;
                    } else {
                        continue;
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long akftKQ() {
        UvfnWv uvfnWv = new UvfnWv(Environment.getDataDirectory().getPath());
        return uvfnWv.shErWi() * uvfnWv.FdcJU();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x0053) to fix multi-entry loop: BACK_EDGE: B:23:0x004a -> B:24:0x0053 */
    /* JADX DEBUG: Duplicate block (B:37:0x0092) to fix multi-entry loop: BACK_EDGE: B:36:0x008c -> B:37:0x0092 */
    /* JADX WARN: Path cross not found for [B:96:?, B:93:?], limit reached: 103 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109 A[EDGE_INSN: B:95:0x0109->B:68:0x0109 BREAK  A[LOOP:7: B:62:0x00f4->B:98:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0101 -> B:60:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long alsFma(java.lang.String r5) {
        /*
            boolean r0 = QfgSZK.UPbYzn.iSpHlg(r5)
            r1 = 2346(0x92a, float:3.287E-42)
            if (r0 == 0) goto L29
            java.lang.String r5 = QfgSZK.DGUQLI.DlIaRS
            int r0 = QfgSZK.DGUQLI._LG
            if (r0 > r1) goto L1d
        Le:
            int r0 = QfgSZK.DGUQLI._LG
            int r1 = r0 + 26
            r2 = 19
            if (r1 == r2) goto L17
            goto Le
        L17:
            r0 = r0 ^ 3334(0xd06, float:4.672E-42)
            int r0 = r0 >> 91
            QfgSZK.DGUQLI._LG = r0
        L1d:
            java.lang.String r0 = "T\u007fMmGXe>!\bVKO\tNNZPdRFY\u0010\\JOUU]\u0019QD\u0006`isvx."
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r5, r0)
            r0 = 0
            return r0
        L29:
            QfgSZK.AxsJAY r0 = QfgSZK.AxsJAY.uzCIH()
            boolean r0 = r0.gGvvIC()
            if (r0 == 0) goto L111
            int r0 = QfgSZK.DGUQLI._LG
            r0 = r0 ^ 2347(0x92b, float:3.289E-42)
            r2 = 53
            if (r0 == 0) goto L65
        L3b:
            int r5 = QfgSZK.DGUQLI._LG
            int r0 = r5 + 52
            if (r0 == r2) goto L5d
            r1 = 233(0xe9, float:3.27E-43)
            if (r0 == r1) goto L4a
            r1 = 281(0x119, float:3.94E-43)
            if (r0 == r1) goto L53
            goto L3b
        L4a:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 % 40
            int r0 = r0 + r5
            r0 = r0 ^ 3742(0xe9e, float:5.244E-42)
            QfgSZK.DGUQLI._LG = r0
        L53:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 * 50
            int r0 = r0 + r5
            r0 = r0 ^ 1808(0x710, float:2.534E-42)
            QfgSZK.DGUQLI._LG = r0
            goto L4a
        L5d:
            int r0 = r5 + r5
            int r0 = r0 % 66
            int r0 = r0 + r5
            QfgSZK.DGUQLI._LG = r0
            goto L3b
        L65:
            QfgSZK.AxsJAY r0 = QfgSZK.AxsJAY.uzCIH()
            r3 = 1
            long r3 = r0.QOLQEE(r5, r3)
            int r0 = QfgSZK.DGUQLI.EDt
            r0 = r0 ^ 7426(0x1d02, float:1.0406E-41)
            if (r0 == 0) goto L115
            int r5 = QfgSZK.DGUQLI._LG
            if (r5 > r1) goto L95
        L78:
            int r5 = QfgSZK.DGUQLI._LG
            int r0 = r5 + 78
            r1 = 44
            if (r0 == r1) goto L8c
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L85
            goto L78
        L85:
            int r0 = r5 % 93
            int r0 = r0 >> 65
            int r0 = r0 * 46
            goto L92
        L8c:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 % r2
            int r0 = r0 % 87
            int r0 = r0 + r5
        L92:
            QfgSZK.DGUQLI._LG = r0
            goto L8c
        L95:
            int r0 = QfgSZK.DGUQLI.EDt
            int r5 = r0 + 39
            r2 = 75
            if (r5 == r2) goto Le7
            r2 = 150(0x96, float:2.1E-43)
            if (r5 == r2) goto Lb1
            r2 = 200(0xc8, float:2.8E-43)
            if (r5 == r2) goto La6
            goto L95
        La6:
            int r5 = r0 + r0
            int r5 = r5 % 52
            QfgSZK.DGUQLI.EDt = r5
            int r5 = QfgSZK.DGUQLI._LG
            if (r5 > r1) goto Le7
            goto Lf4
        Lb1:
            int r5 = QfgSZK.DGUQLI.EDt
            r5 = r5 ^ 3265(0xcc1, float:4.575E-42)
            int r5 = r5 * 68
            QfgSZK.DGUQLI.EDt = r5
            int r5 = QfgSZK.DGUQLI._LG
            r5 = r5 ^ 2347(0x92b, float:3.289E-42)
            if (r5 == 0) goto Lb1
        Lbf:
            int r5 = QfgSZK.DGUQLI._LG
            int r0 = r5 + 104
            r1 = 31
            if (r0 == r1) goto Ld7
            r1 = 133(0x85, float:1.86E-43)
            if (r0 == r1) goto Ld0
            r1 = 331(0x14b, float:4.64E-43)
            if (r0 == r1) goto Ldd
            goto Lbf
        Ld0:
            int r5 = r5 % 115
            r5 = r5 ^ 3892(0xf34, float:5.454E-42)
            QfgSZK.DGUQLI._LG = r5
            goto Lb1
        Ld7:
            int r0 = r5 + r5
            int r0 = r0 * 46
            QfgSZK.DGUQLI._LG = r0
        Ldd:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 * 97
            int r0 = r0 + r5
            int r0 = r0 * 92
            QfgSZK.DGUQLI._LG = r0
            goto Lbf
        Le7:
            int r5 = QfgSZK.DGUQLI.EDt
            int r5 = r5 + r0
            int r5 = r5 * 107
            QfgSZK.DGUQLI.EDt = r5
            int r5 = QfgSZK.DGUQLI._LG
            r5 = r5 ^ 2347(0x92b, float:3.289E-42)
            if (r5 == 0) goto Le7
        Lf4:
            int r5 = QfgSZK.DGUQLI._LG
            int r1 = r5 + 91
            r2 = 94
            if (r1 == r2) goto L109
            r2 = 113(0x71, float:1.58E-43)
            if (r1 == r2) goto L101
            goto Lf4
        L101:
            int r1 = r5 * 34
            int r1 = r1 + r5
            int r1 = r1 % 52
            QfgSZK.DGUQLI._LG = r1
            goto Le7
        L109:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 + r5
            int r0 = r0 + r5
            int r0 = r0 + r5
            QfgSZK.DGUQLI._LG = r0
            goto L109
        L111:
            long r3 = TarCU(r5)
        L115:
            java.lang.String r0 = QfgSZK.DGUQLI.DlIaRS
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Iy^,_Xl{\u007f\\CNZ\tGA\u0016A\\V\u0012WYC[\u001d"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "=xU,XTbm!\b"
            java.lang.String r5 = QfgSZK.GCXiNH.fsw(r5)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r5 = r1.toString()
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r0, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DGUQLI.alsFma(java.lang.String):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:27:0x006f) to fix multi-entry loop: BACK_EDGE: B:26:0x006a -> B:27:0x006f */
    public static OeawrH.C0005OeawrH apNbdB(Location location, boolean z) {
        int i;
        Float fValueOf = null;
        if (location == null) {
            return null;
        }
        boolean zQYNZmZ = OWSZPf.QYNZmZ(location);
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        double altitude = location.getAltitude();
        if (location.hasAccuracy()) {
            fValueOf = Float.valueOf(location.getAccuracy());
            if (EDt <= 7425) {
                while (true) {
                    int i2 = EDt;
                    int i3 = i2 + 39;
                    if (i3 == 50) {
                        do {
                            EDt = (EDt ^ 5216) >> 43;
                        } while ((_LG ^ 2347) == 0);
                        while (true) {
                            i = _LG;
                            int i4 = i + 65;
                            if (i4 != 71) {
                                if (i4 == 130) {
                                    _LG = ((i + i) >> 57) + i;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            _LG = (_LG + i) * 39;
                        }
                    } else if (i3 == 212) {
                        EDt = (i2 ^ 755) * 95;
                    } else if (i3 == 215) {
                        while (true) {
                            EDt = (EDt % 125) >> 40;
                        }
                    }
                }
            }
        }
        return new OeawrH.C0005OeawrH(latitude, longitude, altitude, fValueOf, OWSZPf.OAUGar(location), zQYNZmZ, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:102:0x019c) to fix multi-entry loop: BACK_EDGE: B:101:0x0195 -> B:102:0x019c */
    /* JADX DEBUG: Duplicate block (B:34:0x0089) to fix multi-entry loop: BACK_EDGE: B:33:0x0081 -> B:34:0x0089 */
    /* JADX DEBUG: Duplicate block (B:67:0x0112) to fix multi-entry loop: BACK_EDGE: B:67:0x0112 -> B:68:0x0114 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad A[LOOP:14: B:106:0x01ad->B:177:0x01ad, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01d5 -> B:104:0x01a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String dLBcXg(java.lang.StringBuilder r9) throws java.lang.InterruptedException {
        /*
            QfgSZK.AxsJAY r0 = QfgSZK.AxsJAY.uzCIH()
            boolean r0 = r0.gGvvIC()
            r1 = 33
            r2 = 2
            r3 = 2346(0x92a, float:3.287E-42)
            if (r0 == 0) goto L121
            QfgSZK.AxsJAY r0 = QfgSZK.AxsJAY.uzCIH()
            java.lang.String r4 = "2bB\u007f_Tl1jGLWY"
            java.lang.String r4 = QfgSZK.GCXiNH.fsw(r4)
            java.util.List r0 = r0.gasjUx(r4)
            int r4 = QfgSZK.DGUQLI._LG
            r4 = r4 ^ 2347(0x92b, float:3.289E-42)
            r5 = 46
            if (r4 == 0) goto L56
        L25:
            int r4 = QfgSZK.DGUQLI._LG
            int r6 = r4 + 26
            if (r6 == r5) goto L46
            r7 = 50
            if (r6 == r7) goto L3f
            r7 = 228(0xe4, float:3.2E-43)
            if (r6 == r7) goto L4c
            r7 = 354(0x162, float:4.96E-43)
            if (r6 == r7) goto L38
            goto L25
        L38:
            r6 = r4 ^ 3242(0xcaa, float:4.543E-42)
            int r6 = r6 + r4
            int r6 = r6 + r4
            QfgSZK.DGUQLI._LG = r6
            goto L56
        L3f:
            int r4 = r4 >> 10
            r4 = r4 ^ 3446(0xd76, float:4.829E-42)
            QfgSZK.DGUQLI._LG = r4
            goto L25
        L46:
            int r6 = r4 + r4
            int r6 = r6 >> 77
            QfgSZK.DGUQLI._LG = r6
        L4c:
            int r6 = QfgSZK.DGUQLI._LG
            int r6 = r6 * 4
            int r6 = r6 + r4
            int r6 = r6 % 30
            QfgSZK.DGUQLI._LG = r6
            goto L25
        L56:
            r4 = 143(0x8f, float:2.0E-43)
            r6 = 7425(0x1d01, float:1.0405E-41)
            if (r0 == 0) goto La6
            int r7 = r0.size()
            int r8 = QfgSZK.DGUQLI.EDt
            if (r8 > r6) goto L92
        L64:
            int r9 = QfgSZK.DGUQLI.EDt
            int r0 = r9 + 78
            r2 = 84
            if (r0 == r2) goto L6d
            goto L64
        L6d:
            int r9 = r9 * 2128
            r9 = r9 ^ 3789(0xecd, float:5.31E-42)
            QfgSZK.DGUQLI.EDt = r9
            int r9 = QfgSZK.DGUQLI._LG
            if (r9 > r3) goto L64
        L77:
            int r9 = QfgSZK.DGUQLI._LG
            int r9 = r9 + r4
            if (r9 == r1) goto L81
            r0 = 124(0x7c, float:1.74E-43)
            if (r9 == r0) goto L89
            goto L77
        L81:
            int r9 = QfgSZK.DGUQLI._LG
            r9 = r9 ^ 4927(0x133f, float:6.904E-42)
            int r9 = r9 * 72
            QfgSZK.DGUQLI._LG = r9
        L89:
            int r9 = QfgSZK.DGUQLI._LG
            int r9 = r9 >> 23
            r9 = r9 ^ 2228(0x8b4, float:3.122E-42)
            QfgSZK.DGUQLI._LG = r9
            goto L81
        L92:
            if (r7 != r2) goto La6
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r9.append(r0)
            goto La7
        La6:
            r1 = 0
        La7:
            int r9 = QfgSZK.DGUQLI.EDt
            if (r9 > r6) goto L1ed
            int r9 = QfgSZK.DGUQLI._LG
            r9 = r9 ^ 2347(0x92b, float:3.289E-42)
            if (r9 == 0) goto Lce
        Lb1:
            int r9 = QfgSZK.DGUQLI._LG
            int r0 = r9 + 104
            r1 = 96
            if (r0 == r1) goto Lc3
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 == r1) goto Lbe
            goto Lb1
        Lbe:
            int r0 = r9 * 122
            int r0 = r0 + r9
            QfgSZK.DGUQLI._LG = r0
        Lc3:
            int r9 = QfgSZK.DGUQLI._LG
            r9 = r9 ^ 2814(0xafe, float:3.943E-42)
            int r9 = r9 >> 114
            int r9 = r9 * 114
            QfgSZK.DGUQLI._LG = r9
            goto Lb1
        Lce:
            int r9 = QfgSZK.DGUQLI.EDt
            int r0 = r9 + 39
            r1 = 11
            if (r0 == r1) goto Le3
            if (r0 == r4) goto Ld9
            goto Lce
        Ld9:
            int r0 = QfgSZK.DGUQLI.EDt
            int r0 = r0 >> 21
            r0 = r0 ^ 4711(0x1267, float:6.602E-42)
            int r0 = r0 + r9
            QfgSZK.DGUQLI.EDt = r0
            goto Ld9
        Le3:
            int r0 = QfgSZK.DGUQLI.EDt
            int r0 = r0 >> 53
            int r0 = r0 + r9
            int r0 = r0 >> 53
            QfgSZK.DGUQLI.EDt = r0
            int r0 = QfgSZK.DGUQLI._LG
            if (r0 > r3) goto Le3
        Lf0:
            int r0 = QfgSZK.DGUQLI._LG
            int r1 = r0 + 117
            r2 = 36
            if (r1 == r2) goto L119
            r4 = 196(0xc4, float:2.75E-43)
            if (r1 == r4) goto L10e
            r4 = 371(0x173, float:5.2E-43)
            if (r1 == r4) goto L105
            r0 = 551(0x227, float:7.72E-43)
            if (r1 == r0) goto L114
            goto Lf0
        L105:
            int r0 = r0 % 124
            int r0 = r0 % 53
            int r0 = r0 * 66
            QfgSZK.DGUQLI._LG = r0
            goto L119
        L10e:
            int r9 = r0 >> 97
            int r9 = r9 % 97
        L112:
            QfgSZK.DGUQLI._LG = r9
        L114:
            int r9 = QfgSZK.DGUQLI._LG
            int r9 = r9 % r2
            int r9 = r9 % r5
            goto L112
        L119:
            int r0 = QfgSZK.DGUQLI._LG
            r1 = 134(0x86, float:1.88E-43)
            int r0 = r0 >> r1
            QfgSZK.DGUQLI._LG = r0
            goto Le3
        L121:
            java.util.List r0 = gasjUx()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L12e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1de
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            int r6 = QfgSZK.DGUQLI.EDt
            r6 = r6 ^ 7426(0x1d02, float:1.0406E-41)
            if (r6 == 0) goto L12e
            int r9 = QfgSZK.DGUQLI._LG
            if (r9 > r3) goto L156
        L147:
            int r9 = QfgSZK.DGUQLI._LG
            int r0 = r9 + 65
            r1 = 24
            if (r0 == r1) goto L150
            goto L147
        L150:
            int r0 = r9 % 10
            int r0 = r0 + r9
            QfgSZK.DGUQLI._LG = r0
            goto L147
        L156:
            int r9 = QfgSZK.DGUQLI.EDt
            int r0 = r9 + 65
            r4 = 91
            if (r0 == r4) goto L173
            r9 = 219(0xdb, float:3.07E-43)
            if (r0 == r9) goto L1d5
            r9 = 326(0x146, float:4.57E-43)
            if (r0 == r9) goto L1a3
            r9 = 433(0x1b1, float:6.07E-43)
            if (r0 == r9) goto L16b
            goto L156
        L16b:
            int r9 = QfgSZK.DGUQLI.EDt
            int r9 = r9 % 26
            int r9 = r9 % r2
            QfgSZK.DGUQLI.EDt = r9
            goto L16b
        L173:
            int r9 = r9 >> 87
            r9 = r9 ^ 4303(0x10cf, float:6.03E-42)
            QfgSZK.DGUQLI.EDt = r9
            int r9 = QfgSZK.DGUQLI._LG
            if (r9 > r3) goto L1a3
        L17d:
            int r9 = QfgSZK.DGUQLI._LG
            int r0 = r9 + 195
            r2 = 59
            if (r0 == r2) goto L19f
            r2 = 193(0xc1, float:2.7E-43)
            if (r0 == r2) goto L195
            r2 = 282(0x11a, float:3.95E-43)
            if (r0 == r2) goto L18e
            goto L17d
        L18e:
            r0 = r9 ^ 2915(0xb63, float:4.085E-42)
            int r0 = r0 % 12
            int r0 = r0 * 125
            goto L19c
        L195:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 % 21
            int r0 = r0 % 120
            int r0 = r0 + r9
        L19c:
            QfgSZK.DGUQLI._LG = r0
            goto L195
        L19f:
            int r9 = r9 * 5456
            QfgSZK.DGUQLI._LG = r9
        L1a3:
            int r9 = QfgSZK.DGUQLI.EDt
            int r9 = r9 * 2838
            QfgSZK.DGUQLI.EDt = r9
            int r9 = QfgSZK.DGUQLI._LG
            if (r9 > r3) goto L1d5
        L1ad:
            int r9 = QfgSZK.DGUQLI._LG
            int r0 = r9 + 182
            r2 = 47
            if (r0 == r2) goto L1cc
            r2 = 212(0xd4, float:2.97E-43)
            if (r0 == r2) goto L1c5
            r2 = 368(0x170, float:5.16E-43)
            if (r0 == r2) goto L1be
            goto L1ad
        L1be:
            int r9 = r9 >> 102
            int r9 = r9 * 10591
            QfgSZK.DGUQLI._LG = r9
            goto L1d5
        L1c5:
            int r9 = r9 + r9
            int r9 = r9 * r1
            int r9 = r9 % 68
            QfgSZK.DGUQLI._LG = r9
            goto L1ad
        L1cc:
            int r9 = QfgSZK.DGUQLI._LG
            int r9 = r9 * 440
            int r9 = r9 % 38
            QfgSZK.DGUQLI._LG = r9
            goto L1cc
        L1d5:
            int r9 = QfgSZK.DGUQLI.EDt
            r9 = r9 ^ 3964(0xf7c, float:5.555E-42)
            int r9 = r9 >> 64
            QfgSZK.DGUQLI.EDt = r9
            goto L1a3
        L1de:
            int r0 = r0.size()
            r9.append(r0)
            java.lang.String r9 = r4.toString()
            java.lang.String r1 = QfgSZK.UPbYzn.DRuYWY(r9)
        L1ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DGUQLI.dLBcXg(java.lang.StringBuilder):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ZaDspl dNCPSb() throws InterruptedException {
        ZaDspl zaDsplDNCPSb = AxsJAY.uzCIH().dNCPSb();
        return zaDsplDNCPSb != null ? zaDsplDNCPSb : GhqvEQ.dNCPSb();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:59:0x013c) to fix multi-entry loop: BACK_EDGE: B:59:0x013c -> B:60:0x013e */
    public static String dvImUD(ZqidTP zqidTP) {
        if (!HJWChP.fvRMlC.izFvvl()) {
            return null;
        }
        HJWChP.OZOJIj oZOJIj = new HJWChP.OZOJIj(zqidTP.Umbazn);
        boolean zRcvFxC = oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbzrt|g{iFEWKNN"), zqidTP.Umbazn.getPackageName());
        boolean zRcvFxC2 = oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mb\u007ft{kkryIK@CUIqb"), zqidTP.Umbazn.getPackageName());
        if (!zRcvFxC && !zRcvFxC2) {
            return null;
        }
        try {
            Object systemService = zqidTP.Umbazn.getApplicationContext().getSystemService(GCXiNH.fsw("myTbN"));
            if (!(systemService instanceof TelephonyManager)) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            HashMap map = new HashMap();
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperator != null && !"".equals(networkOperator.trim())) {
                    map.put(GCXiNH.fsw("s~"), networkOperator);
                }
                if (networkOperatorName != null && !"".equals(networkOperatorName.trim())) {
                    map.put(GCXiNH.fsw("s~U"), networkOperatorName);
                }
                if (networkCountryIso != null && !"".equals(networkCountryIso.trim())) {
                    map.put(GCXiNH.fsw("srdeX^"), networkCountryIso);
                }
            } catch (SecurityException e) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e.toString());
                DwQSDd.glVQsU(e);
                ORrpqH.uzCIH().seuMaA(e);
                if ((EDt ^ 7426) != 0) {
                    if ((_LG ^ 2347) != 0) {
                        while (_LG + 117 != 66) {
                        }
                        while (true) {
                            _LG = (_LG >> WebSocketProtocol.PAYLOAD_SHORT) ^ 5185;
                        }
                    } else {
                        while (true) {
                            int i = EDt;
                            int i2 = i + 104;
                            if (i2 == 68) {
                                EDt = ((i * 16) % 34) ^ 1693;
                                if ((_LG ^ 2347) != 0) {
                                    while (true) {
                                        int i3 = _LG;
                                        int i4 = i3 + 104;
                                        if (i4 == 55) {
                                            _LG = (i3 % 117) % 66;
                                            break;
                                        }
                                        if (i4 == 177) {
                                            _LG = (i3 * 43) + i3;
                                            break;
                                        }
                                        if (i4 == 270) {
                                            break;
                                        }
                                    }
                                    while (true) {
                                        _LG = (_LG ^ 2970) * 81;
                                    }
                                }
                            } else if (i2 != 78) {
                                if (i2 == 187) {
                                    EDt = ((i % 75) + i) ^ 1134;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        EDt = (EDt * 3905) % 54;
                    }
                }
            } catch (Exception e2) {
                FQMcgE.fQMcgE.svhCHd(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
            if (zRcvFxC) {
                gmHjFq(zqidTP.Umbazn, telephonyManager, map);
            }
            UhxbNG(telephonyManager, map);
            return DBxZfM(map);
        } catch (SecurityException e3) {
            e = e3;
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        } catch (Exception e4) {
            e = e4;
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String fLIjIY(ZqidTP zqidTP) {
        return HJWChP.iaHEvk.DzCpqu(zqidTP.Umbazn.getContentResolver(), GCXiNH.fsw("ytMiG^qsiFV|YL\\S_[S@mT^N\\QY_"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:18:0x0034) to fix multi-entry loop: BACK_EDGE: B:18:0x0034 -> B:17:0x0032 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        r0 = ((QfgSZK.DGUQLI.EDt + r2) ^ 1513) % 102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String fXHmeK(ZqidTP zqidTP) {
        boolean z;
        int i;
        int i2;
        if ((new HJWChP.zRXNTw(zqidTP).DpxfQh() & 2) != 0) {
            if (EDt <= 7425) {
                while (true) {
                    i = EDt;
                    int i3 = i + 26;
                    if (i3 == 12) {
                        EDt = ((i * 75) >> 78) * 53;
                        break;
                    }
                    if (i3 == 93) {
                        i2 = ((i % 120) % 32) >> 27;
                        break;
                    }
                    if (i3 != 114) {
                        if (i3 == 184) {
                            i2 = (i * 79) + i;
                            break;
                        }
                    }
                    i2 = ((EDt + i) ^ 1513) % 102;
                }
                while (true) {
                    EDt = i2;
                    i2 = ((EDt + i) ^ 1513) % 102;
                }
            }
            z = true;
        } else {
            z = false;
        }
        return String.valueOf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:142:0x027a) to fix multi-entry loop: BACK_EDGE: B:141:0x0272 -> B:142:0x027a */
    /* JADX DEBUG: Duplicate block (B:72:0x0169) to fix multi-entry loop: BACK_EDGE: B:71:0x0163 -> B:72:0x0169 */
    /* JADX DEBUG: Duplicate block (B:96:0x01cc) to fix multi-entry loop: BACK_EDGE: B:95:0x01c4 -> B:96:0x01cc */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[LOOP:5: B:169:0x02f4->B:283:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x013b A[EDGE_INSN: B:291:0x013b->B:59:0x013b BREAK  A[LOOP:8: B:53:0x0127->B:293:0x0127], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<String> fZBcTu(ZqidTP zqidTP, List<String> list) throws InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            int i12 = 0;
            String[] strArrFZBcTu = AxsJAY.uzCIH().fZBcTu((String[]) list.toArray(new String[0]));
            String str = HJWChP.RGtXKC.RgAfOb;
            HJWChP.OZOJIj oZOJIj = new HJWChP.OZOJIj(zqidTP.Umbazn);
            HashMap map = new HashMap();
            int i13 = 0;
            int size = 0;
            do {
                boolean zExists = true;
                if (i13 < list.size()) {
                    String str2 = list.get(i13);
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                    if (str2.startsWith(GCXiNH.fsw("{xWi\u0011\u001e."))) {
                        try {
                            URI uri = new URI(str2);
                            if (uri.getScheme() != null) {
                                zExists = new File(uri).exists();
                                z = false;
                                if (!zExists) {
                                    arrayList.add(str2);
                                    if (_LG <= 2346) {
                                        do {
                                            i7 = _LG;
                                        } while (i7 + 117 != 21);
                                        while (true) {
                                            _LG = ((_LG * 43) % 10) + i7;
                                        }
                                    }
                                } else if (!z) {
                                    size++;
                                }
                            } else {
                                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bEF^\t]UZ\u0015GPZT]J\u001e[NTW\u0003\u0018") + uri);
                                z = false;
                                if (!zExists) {
                                }
                            }
                        } catch (URISyntaxException e) {
                            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("ppWjDCl{h\bAKOJC\u0007CGX"), (Throwable) e);
                            ORrpqH.uzCIH().seuMaA(e);
                            if ((EDt ^ 7426) != 0) {
                                if (_LG <= 2346) {
                                }
                                while (true) {
                                    i3 = EDt;
                                    i4 = i3 + 117;
                                    if (i4 != 26) {
                                    }
                                }
                                loop9: while (true) {
                                    EDt = ((EDt + i3) >> 30) + i3;
                                    if ((_LG ^ 2347) == 0) {
                                    }
                                }
                                while (true) {
                                    _LG ^= 7548;
                                    _LG *= 4200;
                                }
                            }
                        }
                    } else {
                        if (str2.startsWith(GCXiNH.fsw("ip\\\u007f\u0011\u001e."))) {
                            String strSubstring = str2.substring(7);
                            zExists = (str == null || !UPbYzn.dTTfOR(strSubstring)) ? false : str.contains(strSubstring);
                        } else {
                            if (str2.startsWith(GCXiNH.fsw("mz\\6\u0004\u001e"))) {
                                zExists = oZOJIj.iLAtSv(str2.substring(6), HJWChP.QPAeHI.zJGdPJ);
                                if ((_LG ^ 2347) != 0) {
                                    while (_LG + 104 != 71) {
                                    }
                                    while (true) {
                                        _LG = (_LG >> 15) % 79;
                                    }
                                }
                            } else if (str2.startsWith(GCXiNH.fsw("mcT|\u0011\u001e."))) {
                                String[] strArrSplit = str2.substring(7).split(GCXiNH.fsw("A."), 2);
                                if (strArrSplit.length >= 2) {
                                    String str3 = strArrSplit[0];
                                    String str4 = strArrSplit[1];
                                    if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"^GQY@GI\u0018V[WW_QB["))) {
                                        if (str4.equalsIgnoreCase(HJWChP.RGtXKC.DKRTZD.dVMTtz)) {
                                            if ((_LG ^ 2347) != 0) {
                                                while (_LG + 104 != 71) {
                                                }
                                                while (true) {
                                                    _LG = (_LG >> 15) % 79;
                                                }
                                            }
                                        }
                                        zExists = false;
                                        z = false;
                                    } else if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"LCWO\u0007]SU"))) {
                                        if (str4.equalsIgnoreCase(String.valueOf(HJWChP.RGtXKC.aHCWqJ))) {
                                            if ((EDt ^ 7426) != 0) {
                                                if (_LG <= 2346) {
                                                    while (true) {
                                                        int i14 = _LG + 221;
                                                        if (i14 == 76) {
                                                            break;
                                                        }
                                                        if (i14 == 146) {
                                                            _LG = ((_LG * 35) >> 13) % 13;
                                                            break;
                                                        }
                                                    }
                                                    while (true) {
                                                        _LG = (_LG ^ 688) % 82;
                                                        _LG = ((_LG * 35) >> 13) % 13;
                                                    }
                                                }
                                                do {
                                                    int i15 = EDt;
                                                    i8 = i15 + 104;
                                                    if (i8 != 83) {
                                                        EDt = (i15 >> 123) * 62;
                                                        if (_LG <= 2346) {
                                                            while (true) {
                                                                i9 = _LG;
                                                                int i16 = i9 + 481;
                                                                if (i16 != 37) {
                                                                    if (i16 == 97) {
                                                                        break;
                                                                    }
                                                                    if (i16 == 240) {
                                                                        _LG = ((_LG ^ 3521) % 94) >> 90;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    while (true) {
                                                                        _LG = (_LG * 34) ^ 3867;
                                                                    }
                                                                }
                                                            }
                                                            while (true) {
                                                                _LG = ((_LG + i9) * 42) + i9;
                                                                _LG = ((_LG ^ 3521) % 94) >> 90;
                                                            }
                                                        }
                                                    } else if (i8 == 253) {
                                                        EDt = (i15 * 59) % 13;
                                                    } else if (i8 != 257) {
                                                    }
                                                    EDt = (EDt + i15) ^ 3674;
                                                    if (_LG > 2346) {
                                                        do {
                                                            EDt = (EDt % 44) ^ 2116;
                                                        } while (_LG > 2346);
                                                    }
                                                    while (true) {
                                                        int i17 = _LG;
                                                        i10 = i17 + 494;
                                                        if (i10 != 20) {
                                                            _LG = ((i17 >> 54) + i17) >> 123;
                                                        } else if (i10 == 88) {
                                                            _LG = (_LG * 8750) >> 64;
                                                        } else if (i10 == 158) {
                                                            i11 = ((i17 ^ 1664) * 105) >> 85;
                                                            _LG = i11;
                                                            _LG = (_LG * 8750) >> 64;
                                                        } else if (i10 != 181) {
                                                        }
                                                        i11 = (_LG ^ 4214) * 1150;
                                                        _LG = i11;
                                                        _LG = (_LG * 8750) >> 64;
                                                    }
                                                } while (i8 != 405);
                                                do {
                                                    EDt = (EDt % 44) ^ 2116;
                                                } while (_LG > 2346);
                                                while (true) {
                                                    int i172 = _LG;
                                                    i10 = i172 + 494;
                                                    if (i10 != 20) {
                                                    }
                                                    i11 = (_LG ^ 4214) * 1150;
                                                    _LG = i11;
                                                    _LG = (_LG * 8750) >> 64;
                                                }
                                            }
                                        }
                                        zExists = false;
                                        z = false;
                                    } else if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"\\[SO"))) {
                                        if (str4.equalsIgnoreCase(HJWChP.RGtXKC.zrWpAT)) {
                                            if ((_LG ^ 2347) != 0) {
                                                while (_LG + 104 != 71) {
                                                }
                                                while (true) {
                                                    _LG = (_LG >> 15) % 79;
                                                }
                                            }
                                        }
                                        zExists = false;
                                        z = false;
                                    } else if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"\\CDY"))) {
                                        if (str4.equalsIgnoreCase(HJWChP.RGtXKC.RgAfOb)) {
                                            if (_LG <= 2346) {
                                                while (_LG + 104 != 71) {
                                                }
                                                while (true) {
                                                    _LG = (_LG >> 15) % 79;
                                                }
                                            }
                                        }
                                        zExists = false;
                                        z = false;
                                    } else if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"@MP^"))) {
                                        if (!str4.equalsIgnoreCase(HJWChP.RGtXKC.gaObuc)) {
                                            zExists = false;
                                            z = false;
                                        }
                                    } else if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"]QFX"))) {
                                        if (str4.equalsIgnoreCase(HJWChP.RGtXKC.zbEZWi)) {
                                            if (EDt <= 7425) {
                                                do {
                                                    int i152 = EDt;
                                                    i8 = i152 + 104;
                                                    if (i8 != 83) {
                                                    }
                                                    EDt = (EDt + i152) ^ 3674;
                                                    if (_LG > 2346) {
                                                    }
                                                    while (true) {
                                                        int i1722 = _LG;
                                                        i10 = i1722 + 494;
                                                        if (i10 != 20) {
                                                        }
                                                        i11 = (_LG ^ 4214) * 1150;
                                                        _LG = i11;
                                                        _LG = (_LG * 8750) >> 64;
                                                    }
                                                } while (i8 != 405);
                                                do {
                                                    EDt = (EDt % 44) ^ 2116;
                                                } while (_LG > 2346);
                                                while (true) {
                                                    int i17222 = _LG;
                                                    i10 = i17222 + 494;
                                                    if (i10 != 20) {
                                                    }
                                                    i11 = (_LG ^ 4214) * 1150;
                                                    _LG = i11;
                                                    _LG = (_LG * 8750) >> 64;
                                                }
                                            }
                                        }
                                        zExists = false;
                                        z = false;
                                    } else if (str3.equals(GCXiNH.fsw("o~\u0015n^Xmz\"AF"))) {
                                        if (str4.equalsIgnoreCase(HJWChP.RGtXKC.hKzrhT)) {
                                            if ((_LG ^ 2347) != 0) {
                                                while (_LG + 104 != 71) {
                                                }
                                                while (true) {
                                                    _LG = (_LG >> 15) % 79;
                                                }
                                            }
                                        }
                                        zExists = false;
                                        z = false;
                                    } else {
                                        Map map2 = (Map) map.get(str3);
                                        if (map2 == null) {
                                            map2 = new HashMap();
                                            map.put(str3, map2);
                                        }
                                        map2.put(str4, str2);
                                        z = true;
                                        zExists = false;
                                    }
                                } else if (EDt <= 7425) {
                                    if (_LG <= 2346) {
                                        while (true) {
                                            i6 = _LG;
                                            int i18 = i6 + 130;
                                            if (i18 == 91) {
                                                break;
                                            }
                                            if (i18 == 274) {
                                                _LG = (i6 % 51) + i6;
                                            }
                                        }
                                        _LG = ((i6 * 12) % 10) + i6;
                                    }
                                    while (true) {
                                        i3 = EDt;
                                        i4 = i3 + 117;
                                        if (i4 != 26) {
                                            break;
                                        }
                                        if (i4 == 170) {
                                            EDt = (i3 * 72) ^ 4827;
                                        }
                                    }
                                    loop9: while (true) {
                                        EDt = ((EDt + i3) >> 30) + i3;
                                        if ((_LG ^ 2347) == 0) {
                                            while (true) {
                                                int i19 = _LG;
                                                int i20 = i19 + TypedValues.PositionType.TYPE_PERCENT_Y;
                                                if (i20 == 40) {
                                                    i5 = i19 >> 125;
                                                    break;
                                                }
                                                if (i20 == 140) {
                                                    break loop9;
                                                }
                                                if (i20 == 198) {
                                                    _LG *= 4200;
                                                    break loop9;
                                                }
                                                if (i20 == 286) {
                                                    i5 = (i19 >> 65) ^ 4967;
                                                    break;
                                                }
                                            }
                                            _LG = i5;
                                        }
                                    }
                                    while (true) {
                                        _LG ^= 7548;
                                        _LG *= 4200;
                                    }
                                }
                            }
                            if (!zExists) {
                            }
                        }
                        z = false;
                        if (!zExists) {
                        }
                    }
                    i13++;
                } else {
                    if (!map.isEmpty()) {
                        HashMap map3 = new HashMap();
                        if (HJWChP.RGtXKC.DKRTZD.diCPdz < HJWChP.RGtXKC.C0004RGtXKC.dspUTZ) {
                            map3.putAll(iPSTqm(GCXiNH.fsw("2u^jJDmj\"XPLZ"), map.keySet(), ContainerUtils.KEY_VALUE_DELIMITER));
                            map3.putAll(iPSTqm(GCXiNH.fsw("2bB\u007f_Tl1n]KON\u0007XUYE"), map.keySet(), ContainerUtils.KEY_VALUE_DELIMITER));
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            String strZYHWMc = (String) map3.get(entry.getKey());
                            if (strZYHWMc == null) {
                                strZYHWMc = zYHWMc((String) entry.getKey());
                            }
                            if (strZYHWMc != null) {
                                String str5 = (String) ((Map) entry.getValue()).get(strZYHWMc);
                                if (str5 != null) {
                                    arrayList.add(str5);
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                String str6 = (String) ((Map) entry.getValue()).get(GCXiNH.fsw("sxW"));
                                if (str6 != null) {
                                    i2++;
                                    arrayList.add(str6);
                                }
                            } else {
                                i2 = 0;
                            }
                            size += ((Map) entry.getValue()).size() - i2;
                            if (_LG <= 2346) {
                                while (_LG + 403 != 5) {
                                }
                                while (true) {
                                    _LG = (_LG ^ 2065) >> 106;
                                }
                            }
                        }
                    }
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("ppOoCTe>") + size + "/" + list.size());
                    if (strArrFZBcTu != null && strArrFZBcTu.length > 0) {
                        int length = strArrFZBcTu.length;
                        while (i12 < length) {
                            arrayList.add(IEncryptorType.DEFAULT_ENCRYPTOR + strArrFZBcTu[i12]);
                            i12++;
                            if (_LG <= 2346) {
                                while (true) {
                                    int i21 = _LG;
                                    int i22 = i21 + 429;
                                    if (i22 != 50) {
                                        if (i22 == 122) {
                                            i = (i21 ^ InputDeviceCompat.SOURCE_GAMEPAD) >> 101;
                                        } else if (i22 == 289) {
                                            i = (i21 % 77) >> CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                        } else if (i22 == 418) {
                                            while (true) {
                                                _LG = (_LG >> 230) ^ 4627;
                                            }
                                        }
                                        _LG = i;
                                    } else {
                                        while (true) {
                                            _LG = (_LG * 123) >> 55;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Collections.sort(arrayList);
                    if (!arrayList.isEmpty() && FQMcgE.OEgNct()) {
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("{~NbO\u0011") + UPbYzn.zUtmHU(arrayList, ";"));
                    }
                }
            } while ((_LG ^ 2347) == 0);
            while (true) {
                int i23 = _LG;
                int i24 = i23 + 325;
                if (i24 == 24) {
                    break;
                }
                if (i24 == 39) {
                    _LG = ((i23 + i23) >> 56) % 10;
                }
            }
            while (true) {
                _LG = (_LG ^ 1080) % 119;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean fsSxsn(hJrIAr hjriar) {
        if (hjriar == null) {
            throw new IllegalArgumentException(GCXiNH.fsw("ikrbM^!}mFLL^\tJB\u0016[A_^"));
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (timeZone == null) {
            FQMcgE.fQMcgE.DFbvW(DlIaRS, GCXiNH.fsw("ztOXB\\dDcFGjDOG\u001d\u0016suz~tt"));
            return false;
        }
        hjriar.zCOrnd = timeZone.getRawOffset() / 60000;
        hjriar.hpWntT = timeZone.getDSTSavings() / 60000;
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("zeAe"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOXB\\dDcFGjDOG\u001d\u0016QGGvXVI\u0003") + hjriar.hpWntT + GCXiNH.fsw("=vVjdWgmi\\\u001f") + hjriar.zCOrnd);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int gSBher(ZqidTP zqidTP) {
        return HJWChP.OKBmQN.gSBher(zqidTP.Umbazn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long gUEfcq(ZqidTP zqidTP) throws InterruptedException {
        int i;
        String str = zqidTP.Umbazn.getApplicationInfo().dataDir;
        if ((_LG ^ 2347) != 0) {
            do {
                i = _LG;
            } while (i + 39 != 38);
            while (true) {
                _LG = (_LG + i) % 47;
            }
        } else {
            long jSwzYdv = swzYdv(str);
            if (_LG > 2346) {
                return jSwzYdv != 0 ? jSwzYdv : zDUObI(zqidTP);
            }
            while (_LG + 13 != 69) {
            }
            while (true) {
                _LG = (_LG ^ 4047) * 37;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:38:0x0093) to fix multi-entry loop: BACK_EDGE: B:38:0x0093 -> B:17:0x004d */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (QfgSZK.DGUQLI._LG <= 2346) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r6 = QfgSZK.DGUQLI.EDt;
        r8 = r6 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r8 == 29) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r8 == 141) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r8 == 182) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == 284) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        QfgSZK.DGUQLI.EDt = (r6 ^ 1913) * 82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        QfgSZK.DGUQLI.EDt = (QfgSZK.DGUQLI.EDt ^ 4210) >> 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (QfgSZK.DGUQLI._LG > 2346) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r6 = QfgSZK.DGUQLI._LG;
        r8 = r6 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r8 == 59) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r8 == 108) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r8 == 162) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        QfgSZK.DGUQLI._LG = (r6 * 67) % 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG * 114) ^ 3310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 115) % 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        QfgSZK.DGUQLI.EDt = ((r6 + r6) ^ 4036) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        if (QfgSZK.DGUQLI._LG > 2346) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        r8 = QfgSZK.DGUQLI._LG;
        r9 = r8 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r9 == 87) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (r9 == 157) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r9 == 165) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        QfgSZK.DGUQLI._LG = ((r8 * 90) % 5) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        QfgSZK.DGUQLI._LG = ((r8 + r8) + r8) >> 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 38) % 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        QfgSZK.DGUQLI.EDt = ((QfgSZK.DGUQLI.EDt * 96) + r6) * 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (QfgSZK.DGUQLI._LG > 2346) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r0 = QfgSZK.DGUQLI._LG;
        r1 = r0 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if (r1 == 77) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        if (r1 == 200) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (r1 == 230) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG + r0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG + r0) % 89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:
    
        QfgSZK.DGUQLI._LG ^= 1619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004d, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 115) % 19;
     */
    /* JADX WARN: Path cross not found for [B:83:?, B:80:?], limit reached: 93 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<String> gasjUx() {
        ArrayList arrayList = new ArrayList();
        File file = new File(GCXiNH.fsw("2bB\u007f_Tl1jGLWY\u0006"));
        String strFsw = GCXiNH.fsw("3eOj");
        String[] list = file.list();
        if (list == null) {
            return arrayList;
        }
        int length = list.length;
        int i = 0;
        while (i < length) {
            String str = list[i];
            if (str != null && str.endsWith(strFsw)) {
                arrayList.add(new StringBuilder(str).substring(0, r7.length() - 4));
            }
            i++;
            if (EDt > 7425) {
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:34:0x0068) to fix multi-entry loop: BACK_EDGE: B:34:0x0068 -> B:35:0x006a */
    /* JADX DEBUG: Duplicate block (B:63:0x00d8) to fix multi-entry loop: BACK_EDGE: B:62:0x00d0 -> B:63:0x00d8 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if ((QfgSZK.DGUQLI._LG ^ 2347) != 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r0 = QfgSZK.DGUQLI.EDt;
        r1 = r0 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r1 == 28) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r1 == 124) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r1 == 222) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r1 == 398) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r1 = QfgSZK.DGUQLI._LG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if ((r1 ^ 2347) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r0 = QfgSZK.DGUQLI._LG;
        r1 = r0 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r1 == 59) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r1 == 222) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG * 105) >> 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        QfgSZK.DGUQLI.EDt = (r0 * 1120) >> 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r1 > 2346) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        r0 = QfgSZK.DGUQLI._LG;
        r1 = r0 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r1 == 44) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r1 == 119) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r1 == 289) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        QfgSZK.DGUQLI._LG = (r0 * com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG + r0) >> 190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 107) * 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        QfgSZK.DGUQLI.EDt = r0 ^ 2653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
    
        r1 = QfgSZK.DGUQLI.EDt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (QfgSZK.DGUQLI._LG > 2346) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r2 = QfgSZK.DGUQLI._LG;
        r4 = r2 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r4 == 6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        if (r4 == 111) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        if (r4 == 168) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
    
        if (r4 == 284) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c3, code lost:
    
        QfgSZK.DGUQLI._LG = r2 * 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        QfgSZK.DGUQLI._LG = ((r2 % 33) % 91) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG ^ 6377) >> 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d8, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 1) ^ 291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        QfgSZK.DGUQLI.EDt = ((r1 % 73) * 37) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e9, code lost:
    
        QfgSZK.DGUQLI.EDt = (QfgSZK.DGUQLI.EDt % 115) * 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f3, code lost:
    
        if (QfgSZK.DGUQLI._LG > 2346) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
    
        r0 = QfgSZK.DGUQLI._LG;
        r1 = r0 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fb, code lost:
    
        if (r1 == 57) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        if (r1 == 122) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        QfgSZK.DGUQLI._LG = ((r0 ^ 4901) >> 22) ^ 4696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010c, code lost:
    
        QfgSZK.DGUQLI._LG = ((QfgSZK.DGUQLI._LG * 2) + r0) ^ 3550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006a, code lost:
    
        QfgSZK.DGUQLI._LG = ((r0 >> 69) % 15) * 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d8, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG % 1) ^ 291;
     */
    /* JADX WARN: Path cross not found for [B:94:?, B:91:?], limit reached: 111 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0102 -> B:18:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int gkJEwt() {
        int i;
        int iGkJEwt = AxsJAY.uzCIH().gkJEwt();
        if (iGkJEwt > 0) {
            return iGkJEwt;
        }
        if ((_LG ^ 2347) != 0) {
            while (true) {
                i = _LG;
                int i2 = i + 26;
                if (i2 != 46) {
                    if (i2 == 179) {
                        _LG = (i % 85) % 100;
                        break;
                    }
                } else {
                    break;
                }
            }
            _LG = ((_LG % 107) >> 105) + i;
        }
        if ((EDt ^ 7426) != 0) {
        }
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static void gmHjFq(Context context, TelephonyManager telephonyManager, Map<String, String> map) {
        int i;
        CdmaCellLocation cdmaCellLocation;
        int baseStationLongitude;
        String strFsw;
        Map<String, String> mapDWgRXt = DGOPHZ.DWgRXt(context);
        if (mapDWgRXt != null) {
            map.putAll(mapDWgRXt);
        }
        if (HJWChP.fvRMlC.xxhdY() || HJWChP.fvRMlC.RZMhtF()) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                if (cellLocation == null) {
                    return;
                }
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                    if (gsmCellLocation == null) {
                        return;
                    }
                    int lac = gsmCellLocation.getLac();
                    if (lac != -1) {
                        map.put(GCXiNH.fsw("qpX"), String.valueOf(lac));
                    }
                    int cid = gsmCellLocation.getCid();
                    if (cid != -1) {
                        map.put(GCXiNH.fsw("~x_"), String.valueOf(cid));
                    }
                    baseStationLongitude = gsmCellLocation.getPsc();
                    if (baseStationLongitude == -1) {
                        return;
                    } else {
                        strFsw = GCXiNH.fsw("mbX");
                    }
                } else {
                    if (!(cellLocation instanceof CdmaCellLocation) || (cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation()) == null) {
                        return;
                    }
                    int systemId = cdmaCellLocation.getSystemId();
                    if (systemId != -1) {
                        map.put(GCXiNH.fsw("nx_"), String.valueOf(systemId));
                    }
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    if (baseStationId != -1) {
                        map.put(GCXiNH.fsw("\u007fbRh"), String.valueOf(baseStationId));
                    }
                    int baseStationLatitude = cdmaCellLocation.getBaseStationLatitude();
                    if (baseStationLatitude != Integer.MAX_VALUE) {
                        map.put(GCXiNH.fsw("\u007fbd`JE"), String.valueOf(baseStationLatitude));
                    }
                    baseStationLongitude = cdmaCellLocation.getBaseStationLongitude();
                    if (baseStationLongitude == Integer.MAX_VALUE) {
                        return;
                    } else {
                        strFsw = GCXiNH.fsw("\u007fbd`EV");
                    }
                }
                map.put(strFsw, String.valueOf(baseStationLongitude));
            } catch (SecurityException e) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e.toString());
                DwQSDd.glVQsU(e);
                ORrpqH.uzCIH().seuMaA(e);
                if ((_LG ^ 2347) != 0) {
                    while (true) {
                        i = _LG;
                        int i2 = i + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                        if (i2 == 34) {
                            _LG = (i * 10) >> 41;
                            return;
                        } else if (i2 != 163) {
                            if (i2 == 228) {
                                _LG = ((i >> 30) % 36) + i;
                                break;
                            } else if (i2 == 390) {
                                _LG = (i % 38) >> 97;
                            }
                        } else {
                            break;
                        }
                    }
                    _LG = (_LG * 75) + i;
                }
            } catch (Exception e2) {
                FQMcgE.fQMcgE.svhCHd(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:99:0x0198) to fix multi-entry loop: BACK_EDGE: B:99:0x0198 -> B:100:0x019b */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x019b, code lost:
    
        QfgSZK.DGUQLI._LG = ((r8 % 99) >> 95) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0160, code lost:
    
        QfgSZK.DGUQLI.EDt = ((QfgSZK.DGUQLI.EDt % 76) ^ 3101) % 102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016e, code lost:
    
        if ((QfgSZK.DGUQLI._LG ^ 2347) == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        r8 = QfgSZK.DGUQLI._LG;
        r0 = r8 + 273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
    
        if (r0 == 61) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017a, code lost:
    
        if (r0 == 240) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017e, code lost:
    
        if (r0 == 407) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0182, code lost:
    
        if (r0 == 513) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG ^ 4062) * 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018e, code lost:
    
        QfgSZK.DGUQLI._LG = (r8 % 53) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0198, code lost:
    
        QfgSZK.DGUQLI._LG = ((QfgSZK.DGUQLI._LG ^ 1075) + r8) + r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String hCLrkq(ZqidTP zqidTP) {
        int i;
        if (!HJWChP.fvRMlC.izFvvl() || !new HJWChP.OZOJIj(zqidTP.Umbazn).RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbzrt|g{iFEWKNN"), zqidTP.Umbazn.getPackageName())) {
            return null;
        }
        String strHCLrkq = DGOPHZ.hCLrkq(zqidTP.Umbazn);
        if (UPbYzn.iSpHlg(strHCLrkq) && (HJWChP.fvRMlC.xxhdY() || HJWChP.fvRMlC.RZMhtF())) {
            try {
                Object systemService = zqidTP.Umbazn.getApplicationContext().getSystemService(GCXiNH.fsw("myTbN"));
                if (!(systemService instanceof TelephonyManager)) {
                    return null;
                }
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                CellLocation cellLocation = telephonyManager.getCellLocation();
                StringBuilder sb = new StringBuilder();
                Object objValueOf = "";
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                    int cid = gsmCellLocation.getCid();
                    int lac = gsmCellLocation.getLac();
                    if (cid == -1 && lac == -1) {
                        return null;
                    }
                    sb.append(GCXiNH.fsw("ZBv6"));
                    sb.append(cid == -1 ? "" : Integer.valueOf(cid));
                    sb.append(GCXiNH.fsw("'+\u0001"));
                    if (lac != -1) {
                        objValueOf = Integer.valueOf(lac);
                    }
                    sb.append(objValueOf);
                    return sb.toString();
                }
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation();
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    int systemId = cdmaCellLocation.getSystemId();
                    int networkId = cdmaCellLocation.getNetworkId();
                    if (baseStationId == -1 && systemId == -1 && networkId == -1) {
                        return null;
                    }
                    sb.append(GCXiNH.fsw("^UvM\u0011"));
                    sb.append(baseStationId == -1 ? "" : Integer.valueOf(baseStationId));
                    sb.append(":");
                    sb.append(systemId == -1 ? "" : Integer.valueOf(systemId));
                    sb.append(":");
                    if (networkId != -1) {
                        objValueOf = Integer.valueOf(networkId);
                    }
                    sb.append(objValueOf);
                    return sb.toString();
                }
                if (EDt <= 7425) {
                    while (true) {
                        i = EDt;
                        int i2 = i + 39;
                        if (i2 != 2) {
                            if (i2 == 168) {
                                EDt = (i * 75) % 2;
                                break;
                            }
                            if (i2 == 180) {
                                break;
                            }
                            if (i2 == 268) {
                                EDt = (i + i) ^ 5622;
                                if ((_LG ^ 2347) == 0) {
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        EDt = ((EDt ^ 1440) * 2) + i;
                        if ((_LG ^ 2347) != 0) {
                            while (true) {
                                int i3 = _LG;
                                int i4 = i3 + 299;
                                if (i4 == 27) {
                                    _LG = (i3 ^ 452) * 84;
                                } else {
                                    if (i4 == 111) {
                                        _LG = ((i3 * 5) >> 50) + i3;
                                        break;
                                    }
                                    if (i4 != 190) {
                                        if (i4 == 318) {
                                            _LG = ((i3 % 40) * 69) + i3;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            _LG = (_LG * 25) >> 93;
                        }
                    }
                }
            } catch (SecurityException e) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e.getMessage());
                DwQSDd.glVQsU(e);
                ORrpqH.uzCIH().seuMaA(e);
                if (_LG <= 2346) {
                    while (true) {
                        int i5 = _LG;
                        int i6 = i5 + 39;
                        if (i6 == 73) {
                            break;
                        }
                        if (i6 != 126) {
                            if (i6 == 235) {
                                _LG = (i5 >> 78) * WalletImportError.ERROR_CODE_AA_EXIST;
                            } else if (i6 != 313) {
                            }
                            _LG = (_LG ^ 5087) % 72;
                        }
                        _LG = (_LG >> 3) * 73;
                    }
                    while (true) {
                        _LG = ((_LG % WalletImportError.ERROR_CODE_AA_EXIST) % 64) >> 32;
                    }
                }
            } catch (Exception e2) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
        return strHCLrkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Map<String, String> hlkKmr() {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, GCXiNH.fsw("McToNBrq~"), GCXiNH.fsw("UpIh\\Ps{"), GCXiNH.fsw("NtIeJ]"));
        Map<String, String> mapIPSTqm = iPSTqm(GCXiNH.fsw("2aIcH\u001ebnyALEE"), new HashSet(arrayList), ":");
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("zrR"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOO{dHpjG\u0002QO]]UXPP\t\u0012") + mapIPSTqm);
        return mapIPSTqm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:22:0x0047) to fix multi-entry loop: BACK_EDGE: B:22:0x0047 -> B:23:0x0049 */
    /* JADX DEBUG: Duplicate block (B:38:0x008c) to fix multi-entry loop: BACK_EDGE: B:37:0x0086 -> B:38:0x008c */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008c, code lost:
    
        QfgSZK.DGUQLI._LG = (QfgSZK.DGUQLI._LG * com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) >> 13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String hvKCwS() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        if (stackTrace.length <= 0) {
            return null;
        }
        int i = _LG;
        if (i <= 2346) {
            while (true) {
                int i2 = _LG;
                if (i2 + 26 == 8) {
                    _LG = (i2 * WalletImportError.ERROR_CODE_AA_EXIST) ^ 1471;
                }
            }
        } else {
            StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
            if (i <= 2346) {
                while (true) {
                    int i3 = _LG;
                    int i4 = i3 + 65;
                    if (i4 == 88) {
                        while (true) {
                            _LG = (_LG >> 8) + i3;
                        }
                    } else if (i4 == 208) {
                        _LG = (i3 ^ 1651) >> 7;
                    } else {
                        if (i4 == 318) {
                            _LG = ((i3 ^ 4080) >> 29) % WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                            break;
                        }
                        if (i4 == 370) {
                            break;
                        }
                    }
                }
                while (true) {
                    _LG = (_LG % 29) ^ 1363;
                }
            } else {
                String className = stackTraceElement.getClassName();
                if ((_LG ^ 2347) != 0) {
                    while (true) {
                        int i5 = _LG;
                        int i6 = i5 + 117;
                        if (i6 != 4) {
                            if (i6 == 62) {
                                _LG = ((i5 ^ 3009) % 78) % 125;
                                break;
                            }
                            if (i6 == 178) {
                                _LG = (i5 >> 39) % 28;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                boolean zEquals = className.equals(GCXiNH.fsw("~~V\"J_elcAF\rCG\\BD[U_\u001c^C\u0001dD[TN\\qYOq"));
                if ((_LG ^ 2347) == 0) {
                    if (zEquals || className.equals(GCXiNH.fsw("ypWzBZ/mu[VFG\u0007fFB\\BVaEQ]J"))) {
                        return null;
                    }
                    int iLastIndexOf = className.lastIndexOf(JwtUtilsKt.JWT_DELIMITER);
                    return iLastIndexOf != -1 ? className.substring(iLastIndexOf + 1) : className;
                }
                while (true) {
                    int i7 = _LG;
                    int i8 = i7 + 52;
                    if (i8 == 97) {
                        _LG = ((i7 % 10) + i7) % 64;
                    } else if (i8 == 135) {
                        _LG = (i7 + i7) % 19;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Map<String, String> iPSTqm(String str, Set<String> set, String str2) {
        HashMap map = new HashMap();
        if (str != null && set != null) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            List<String> listRsEnD = UPbYzn.rsEnD(line, str2);
                            if (!listRsEnD.isEmpty()) {
                                String strTrim = listRsEnD.get(0).trim();
                                if (strTrim.length() != 0 && set.contains(strTrim)) {
                                    map.put(strTrim, listRsEnD.size() > 1 ? listRsEnD.get(1).trim() : "");
                                }
                            }
                        } finally {
                        }
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("ztO,B_gq,\u0015\u0002ek`dbr\u0015ON"), e.toString());
                    ORrpqH.uzCIH().seuMaA(e);
                }
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:20:0x003c) to fix multi-entry loop: BACK_EDGE: B:19:0x0036 -> B:20:0x003c */
    public static String sSMYrx(ZqidTP zqidTP) {
        int i;
        String strUCQKYV = HJWChP.iaHEvk.UCQKYV(zqidTP.Umbazn.getContentResolver());
        if (UPbYzn.dTTfOR(strUCQKYV)) {
            return strUCQKYV;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getName();
            }
            if ((_LG ^ 2347) == 0) {
                return null;
            }
            while (true) {
                i = _LG;
                int i2 = i + 39;
                if (i2 == 41) {
                    while (true) {
                        _LG = ((_LG * 79) + i) ^ 2281;
                    }
                } else if (i2 != 188) {
                    if (i2 == 257) {
                        _LG = (i * 98) + i;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                _LG = ((_LG * 91) % 68) + i;
            }
        } catch (Exception e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("XiXi[Ehqb\bKM\nHKDSFGZ\\V\u0010MRHYOUVL_\u0006aaukbe\u001eWt"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:62:0x00f3) to fix multi-entry loop: BACK_EDGE: B:62:0x00f3 -> B:61:0x00f1 */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        QfgSZK.DGUQLI.EDt = (QfgSZK.DGUQLI.EDt ^ 2378) >> 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if ((QfgSZK.DGUQLI._LG ^ 2347) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r6 = QfgSZK.DGUQLI._LG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if ((r6 + 130) == 93) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        QfgSZK.DGUQLI._LG = (r6 >> 59) * com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        QfgSZK.DGUQLI.EDt = (QfgSZK.DGUQLI.EDt % 99) % 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if ((QfgSZK.DGUQLI._LG ^ 2347) == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:
    
        r0 = ((QfgSZK.DGUQLI._LG + r6) * 91) ^ 4435;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String sTzBva(ZqidTP zqidTP) {
        RjCdvp.EnumC0008RjCdvp enumC0008RjCdvp;
        int i;
        int i2;
        int i3;
        int i4;
        HJWChP.zRXNTw zrxntw = new HJWChP.zRXNTw(zqidTP);
        String strSEAkxl = zrxntw.sEAkxl();
        String strRcXXUw = AxsJAY.uzCIH().RcXXUw(strSEAkxl);
        if (strRcXXUw != null) {
            return dZmdUa.zSsVtY(strRcXXUw);
        }
        String[] strArrSplit = strSEAkxl.split("/");
        int length = strArrSplit.length;
        int i5 = 0;
        do {
            if (i5 >= length) {
                String[] packagesForUid = zqidTP.Umbazn.getPackageManager().getPackagesForUid(zrxntw.DGgkXd());
                enumC0008RjCdvp = (packagesForUid == null || packagesForUid.length <= 1) ? RjCdvp.EnumC0008RjCdvp.NOT_CLONED : RjCdvp.EnumC0008RjCdvp.MULTIPLE_PID;
            } else {
                String str = strArrSplit[i5];
                if (!str.contains(JwtUtilsKt.JWT_DELIMITER) || str.equalsIgnoreCase(zqidTP.Umbazn.getPackageName())) {
                    i5++;
                } else {
                    enumC0008RjCdvp = RjCdvp.EnumC0008RjCdvp.INCONSISTENT_PATH;
                }
            }
            return dZmdUa.zSsVtY(enumC0008RjCdvp);
        } while (EDt > 7425);
        if ((_LG ^ 2347) != 0) {
            while (true) {
                int i6 = _LG;
                int i7 = i6 + 65;
                if (i7 == 94) {
                    i4 = ((i6 % 20) ^ 1288) >> 65;
                    break;
                }
                if (i7 == 172) {
                    _LG = ((i6 + i6) * 77) + i6;
                    break;
                }
                if (i7 == 332) {
                    i4 = ((i6 + i6) ^ 2794) >> 40;
                    break;
                }
            }
            _LG = i4;
        }
        while (true) {
            int i8 = EDt;
            int i9 = i8 + 52;
            if (i9 != 24) {
                if (i9 == 45) {
                    EDt = ((i8 % 64) * 69) % 97;
                    if (_LG > 2346) {
                        break;
                    }
                } else {
                    if (i9 == 50) {
                        EDt = ((i8 % 56) * 63) + i8;
                        break;
                    }
                    if (i9 == 124) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        do {
            i = _LG;
            i2 = i + 91;
            if (i2 != 70) {
                if (i2 != 237) {
                    if (i2 != 403) {
                    }
                }
                i3 = ((_LG + i) * 91) ^ 4435;
            } else {
                _LG = (i % 46) >> 94;
            }
            i3 = (_LG % 75) >> 115;
            while (true) {
                _LG = i3;
                i3 = ((_LG + i) * 91) ^ 4435;
            }
        } while (i2 != 511);
        while (true) {
            _LG = ((_LG >> 117) + i) ^ 1699;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean sVXHln(ZqidTP zqidTP) {
        Context context = zqidTP.Umbazn;
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.dWbSXj) {
            return SePrCP.sVXHln(context);
        }
        if (!HJWChP.UUMfbK.sVXHln()) {
            return true;
        }
        try {
            Object systemService = context.getSystemService(GCXiNH.fsw("m~LiY"));
            if (systemService instanceof PowerManager) {
                return ((PowerManager) systemService).isScreenOn();
            }
            return true;
        } catch (SecurityException e) {
            e = e;
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017") + e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            return true;
        } catch (Exception e2) {
            e = e2;
            FQMcgE.fQMcgE.svhCHd(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long swzYdv(String str) {
        if (str != null) {
            long jQOLQEE = AxsJAY.uzCIH().QOLQEE(str, false);
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Z~O,JAq>xAOF\nOZH[\u0015zRFXFJy\\HS_K]E\u0006ckq\"qaJD3") + str + GCXiNH.fsw("11") + jQOLQEE);
            return jQOLQEE;
        }
        String str2 = DlIaRS;
        if ((EDt ^ 7426) != 0) {
            while (true) {
                int i = EDt;
                int i2 = i + 26;
                if (i2 == 66) {
                    EDt = (i >> 97) ^ 3495;
                    break;
                }
                if (i2 == 250) {
                    break;
                }
            }
            EDt = (EDt >> 43) ^ 2630;
        }
        FQMcgE.fQMcgE.sIqKDg(str2, GCXiNH.fsw("Z~O,JAq>xAOF\nOZH[\u0015ZF^]\u0010__IT"));
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String tIwhY() {
        return String.valueOf(Debug.isDebuggerConnected());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OeawrH.RnVkix vLaW() {
        return GCXiNH.DRGLNw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:32:0x007d) to fix multi-entry loop: BACK_EDGE: B:32:0x007d -> B:33:0x007f */
    public static long zAEkPU(ZqidTP zqidTP) throws InterruptedException {
        int i;
        int i2;
        long jSwzYdv = swzYdv(zqidTP.Umbazn.getApplicationInfo().sourceDir);
        if (EDt > 7425) {
            return jSwzYdv != 0 ? jSwzYdv : zDUObI(zqidTP);
        }
        do {
            i = EDt;
            if ((_LG ^ 2347) != 0) {
                while (true) {
                    i2 = _LG;
                    int i3 = i2 + 78;
                    if (i3 == 64) {
                        _LG = ((i2 % 37) % 89) >> 105;
                    } else {
                        if (i3 == 261) {
                            _LG = (i2 ^ 2278) % 30;
                            break;
                        }
                        if (i3 != 349) {
                            if (i3 == 516) {
                                break;
                            }
                        }
                    }
                    _LG = ((_LG % 82) >> 51) % 76;
                }
                while (true) {
                    _LG = ((_LG % 33) % 50) + i2;
                }
            }
        } while (i + 26 != 30);
        loop1: while (true) {
            EDt = ((EDt * 107) + i) * 31;
            if ((_LG ^ 2347) != 0) {
                while (true) {
                    int i4 = _LG;
                    int i5 = i4 + 52;
                    if (i5 == 11) {
                        _LG = ((i4 + i4) + i4) >> 18;
                        break;
                    }
                    if (i5 == 151) {
                        _LG = ((i4 + i4) * 86) >> 27;
                        break loop1;
                    }
                    if (i5 == 223) {
                        break loop1;
                    }
                }
            }
        }
        while (true) {
            _LG = ((_LG >> 57) * 41) >> 78;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long zDUObI(ZqidTP zqidTP) throws InterruptedException {
        ClassCastException e;
        long jCurrentTimeMillis;
        SharedPreferences sharedPreferences = zqidTP.Umbazn.getSharedPreferences(GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwynd"), 0);
        try {
            jCurrentTimeMillis = HJWChP.HhYHK.dSJNDS(sharedPreferences, GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwynd"), 0L);
        } catch (ClassCastException e2) {
            e = e2;
            jCurrentTimeMillis = 0;
        }
        try {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        } catch (ClassCastException e3) {
            e = e3;
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("T\u007fXcFA`jeJNF\n]QWS\u0015R\\@\u0011q\u007fnbhrw|"));
            ORrpqH.uzCIH().seuMaA(e);
        }
        if (jCurrentTimeMillis == 0) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[~NbO\u0011oqx@KMM\tAI\u0016F\\R@TT\u000fNOY]I\u0015\u0018PCkaqcuiPK)E[ZV\\N[P"));
            jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorOxbLUn = HJWChP.HhYHK.OxbLUn(sharedPreferences);
            if (editorOxbLUn != null) {
                HJWChP.HhYHK.DVmcag(GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwynd"), jCurrentTimeMillis, editorOxbLUn);
                editorOxbLUn.apply();
            }
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Z~O,JAq>xAOF\nOZH[\u0015g[SCUKnOY]_K]YE`w#dnr\u001eGl}1^azbwaYvfcywSr~rv|KSLzq\b=") + jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Map<String, String> zKcAg() {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, GCXiNH.fsw("PtVXDE`r"));
        Map<String, String> mapIPSTqm = iPSTqm(GCXiNH.fsw("2aIcH\u001el{aALEE"), hashSet, ":");
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("z|R"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOAN\\HpjG\u0002QO]]UXPP\t\u0012") + mapIPSTqm);
        return mapIPSTqm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long zOIQXb() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - HJWChP.dNQGVJ.dNxZaP()) / 1000;
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("zsO"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("=v^xi^njXAOF\u0010\t") + jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0037) to fix multi-entry loop: BACK_EDGE: B:15:0x0030 -> B:16:0x0037 */
    public static String zYHWMc(String str) {
        int i;
        int i2;
        String str2 = (String) AuCTel.fIwbmz(null, dtVnaF, str);
        if ((_LG ^ 2347) == 0) {
            if (UPbYzn.dTTfOR(str2)) {
                return str2;
            }
            return null;
        }
        while (true) {
            i = _LG;
            int i3 = i + 52;
            if (i3 == 72) {
                i2 = (i ^ 1191) % 3;
            } else if (i3 != 193) {
                if (i3 == 385) {
                    _LG = (i ^ 2636) + i;
                    break;
                }
                if (i3 == 387) {
                    i2 = i >> CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA;
                }
            } else {
                break;
            }
            _LG = i2;
        }
        while (true) {
            _LG = ((_LG * 56) + i) >> 69;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:27:0x0077) to fix multi-entry loop: BACK_EDGE: B:26:0x006f -> B:27:0x0077 */
    /* JADX DEBUG: Duplicate block (B:40:0x00af) to fix multi-entry loop: BACK_EDGE: B:40:0x00af -> B:41:0x00b1 */
    /* JADX DEBUG: Duplicate block (B:71:0x0121) to fix multi-entry loop: BACK_EDGE: B:71:0x0121 -> B:60:0x00f4 */
    /* JADX DEBUG: Duplicate block (B:88:0x0178) to fix multi-entry loop: BACK_EDGE: B:88:0x0178 -> B:89:0x017a */
    /* JADX WARN: Path cross not found for [B:114:0x00cf, B:115:0x00e9], limit reached: 130 */
    /* JADX WARN: Path cross not found for [B:114:0x00cf, B:116:0x00dd], limit reached: 130 */
    /* JADX WARN: Path cross not found for [B:125:?, B:121:?], limit reached: 130 */
    /* JADX WARN: Path cross not found for [B:44:0x00c2, B:115:0x00e9], limit reached: 130 */
    /* JADX WARN: Path cross not found for [B:46:0x00c6, B:116:0x00dd], limit reached: 130 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Map<java.lang.String, java.lang.Object> zhUgOk(QfgSZK.ZqidTP r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001frnjiyicf{\u007fgKCFF"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            r2.<init>(r3)
            android.content.Context r11 = r11.Umbazn
            r3 = 0
            android.content.Intent r11 = r11.registerReceiver(r3, r2)
            if (r11 != 0) goto L1b
            return r0
        L1b:
            java.lang.String r2 = "neZx^B"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r2)
            r4 = -1
            int r3 = r11.getIntExtra(r3, r4)
            r5 = 46
            r6 = 274(0x112, float:3.84E-43)
            java.lang.String r7 = "h\u007fPbDFo"
            r8 = 7425(0x1d01, float:1.0405E-41)
            if (r3 == r1) goto L81
            r1 = 3
            if (r3 == r1) goto L4d
            r1 = 4
            if (r3 == r1) goto L4d
            r1 = 5
            if (r3 == r1) goto L3f
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r7)
            goto L12b
        L3f:
            java.lang.String r1 = "{dW`"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            int r3 = QfgSZK.DGUQLI.EDt
            r3 = r3 ^ 7426(0x1d02, float:1.0406E-41)
            if (r3 == 0) goto L12b
            goto Lb8
        L4d:
            java.lang.String r1 = "h\u007fK`^Vf{h"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            int r3 = QfgSZK.DGUQLI._LG
            r3 = r3 ^ 2347(0x92b, float:3.289E-42)
            if (r3 == 0) goto L12b
        L59:
            int r3 = QfgSZK.DGUQLI._LG
            int r9 = r3 + 78
            r10 = 18
            if (r9 == r10) goto L6f
            r10 = 196(0xc4, float:2.75E-43)
            if (r9 == r10) goto L68
            if (r9 == r6) goto L77
            goto L59
        L68:
            int r3 = r3 + r3
            r3 = r3 ^ 4722(0x1272, float:6.617E-42)
            QfgSZK.DGUQLI._LG = r3
            goto L12b
        L6f:
            int r11 = QfgSZK.DGUQLI._LG
            int r11 = r11 >> 120
            r11 = r11 ^ 3619(0xe23, float:5.071E-42)
            QfgSZK.DGUQLI._LG = r11
        L77:
            int r11 = QfgSZK.DGUQLI._LG
            int r11 = r11 * 62
            int r11 = r11 % 90
            int r11 = r11 % r5
            QfgSZK.DGUQLI._LG = r11
            goto L6f
        L81:
            java.lang.String r1 = "~yZ~LXoy"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            int r3 = QfgSZK.DGUQLI.EDt
            if (r3 > r8) goto L12b
            int r11 = QfgSZK.DGUQLI._LG
            r11 = r11 ^ 2347(0x92b, float:3.289E-42)
            if (r11 == 0) goto Lb8
        L91:
            int r11 = QfgSZK.DGUQLI._LG
            int r0 = r11 + 91
            r1 = 66
            if (r0 == r1) goto La9
            r11 = 134(0x86, float:1.88E-43)
            if (r0 == r11) goto La0
            if (r0 == r6) goto Lb1
            goto L91
        La0:
            int r11 = QfgSZK.DGUQLI._LG
            r0 = 38130(0x94f2, float:5.3432E-41)
            int r11 = r11 * r0
            QfgSZK.DGUQLI._LG = r11
            goto La0
        La9:
            int r11 = r11 * 21
            int r11 = r11 % 36
            int r11 = r11 % 65
        Laf:
            QfgSZK.DGUQLI._LG = r11
        Lb1:
            int r11 = QfgSZK.DGUQLI._LG
            int r11 = r11 % 38
            int r11 = r11 * 11
            goto Laf
        Lb8:
            int r11 = QfgSZK.DGUQLI.EDt
            int r0 = r11 + 78
            r1 = 58
            r3 = 2346(0x92a, float:3.287E-42)
            if (r0 == r1) goto Le9
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == r1) goto Ldd
            r1 = 418(0x1a2, float:5.86E-43)
            if (r0 == r1) goto Lf4
            r1 = 452(0x1c4, float:6.33E-43)
            if (r0 == r1) goto Lcf
            goto Lb8
        Lcf:
            int r0 = r11 >> 115
            r0 = r0 ^ 1501(0x5dd, float:2.103E-42)
            int r0 = r0 + r11
            QfgSZK.DGUQLI.EDt = r0
            int r11 = QfgSZK.DGUQLI._LG
            r11 = r11 ^ 2347(0x92b, float:3.289E-42)
            if (r11 == 0) goto Lf4
            goto L100
        Ldd:
            r0 = r11 ^ 1868(0x74c, float:2.618E-42)
            int r0 = r0 + r11
            int r0 = r0 % 99
            QfgSZK.DGUQLI.EDt = r0
            int r11 = QfgSZK.DGUQLI._LG
            if (r11 > r3) goto Lf4
            goto L100
        Le9:
            r11 = r11 ^ 4694(0x1256, float:6.578E-42)
            int r11 = r11 >> 91
            QfgSZK.DGUQLI.EDt = r11
            int r11 = QfgSZK.DGUQLI._LG
            if (r11 > r3) goto Lf4
            goto L100
        Lf4:
            int r11 = QfgSZK.DGUQLI.EDt
            int r11 = r11 >> 55
            int r11 = r11 * 55
            QfgSZK.DGUQLI.EDt = r11
            int r11 = QfgSZK.DGUQLI._LG
            if (r11 > r3) goto Lf4
        L100:
            int r11 = QfgSZK.DGUQLI._LG
            int r0 = r11 + 182
            r1 = 76
            if (r0 == r1) goto L11a
            r1 = 165(0xa5, float:2.31E-43)
            if (r0 == r1) goto L121
            r11 = 316(0x13c, float:4.43E-43)
            if (r0 == r11) goto L111
            goto L100
        L111:
            int r11 = QfgSZK.DGUQLI._LG
            int r11 = r11 * 6
            r11 = r11 ^ 1078(0x436, float:1.51E-42)
            QfgSZK.DGUQLI._LG = r11
            goto L111
        L11a:
            int r0 = r11 + r11
            int r0 = r0 + r11
            int r0 = r0 * 77
            QfgSZK.DGUQLI._LG = r0
        L121:
            int r0 = QfgSZK.DGUQLI._LG
            int r0 = r0 % 123
            r0 = r0 ^ 3884(0xf2c, float:5.443E-42)
            int r0 = r0 + r11
            QfgSZK.DGUQLI._LG = r0
            goto Lf4
        L12b:
            java.lang.String r3 = "qtMiG"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r3)
            int r4 = r11.getIntExtra(r6, r4)
            java.lang.String r6 = "nrZ`N"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r9 = 100
            int r11 = r11.getIntExtra(r6, r9)
            if (r11 > 0) goto L19a
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r3)
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r7)
            r0.put(r11, r3)
            int r11 = QfgSZK.DGUQLI.EDt
            if (r11 > r8) goto L1a8
            int r11 = QfgSZK.DGUQLI._LG
            r11 = r11 ^ 2347(0x92b, float:3.289E-42)
            if (r11 == 0) goto L187
        L158:
            int r11 = QfgSZK.DGUQLI._LG
            int r0 = r11 + 130
            r1 = 23
            if (r0 == r1) goto L181
            if (r0 == r5) goto L174
            r1 = 78
            if (r0 == r1) goto L17a
            r1 = 82
            if (r0 == r1) goto L16b
            goto L158
        L16b:
            int r11 = r11 >> 19
            r11 = r11 ^ 5461(0x1555, float:7.652E-42)
            int r11 = r11 % 12
            QfgSZK.DGUQLI._LG = r11
            goto L158
        L174:
            r11 = r11 ^ 4796(0x12bc, float:6.72E-42)
            int r11 = r11 >> 51
        L178:
            QfgSZK.DGUQLI._LG = r11
        L17a:
            int r11 = QfgSZK.DGUQLI._LG
            r11 = r11 ^ 1198(0x4ae, float:1.679E-42)
            int r11 = r11 >> 68
            goto L178
        L181:
            int r11 = r11 % 79
            r11 = r11 ^ 2438(0x986, float:3.416E-42)
            QfgSZK.DGUQLI._LG = r11
        L187:
            int r11 = QfgSZK.DGUQLI.EDt
            int r0 = r11 + 104
            r1 = 33
            if (r0 == r1) goto L190
            goto L187
        L190:
            int r0 = QfgSZK.DGUQLI.EDt
            int r0 = r0 + r11
            int r0 = r0 % 110
            int r0 = r0 * 95
            QfgSZK.DGUQLI.EDt = r0
            goto L190
        L19a:
            float r4 = (float) r4
            float r11 = (float) r11
            float r4 = r4 / r11
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            r0.put(r11, r3)
        L1a8:
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r2)
            r0.put(r11, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DGUQLI.zhUgOk(QfgSZK.ZqidTP):java.util.Map");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:47:0x00a3) to fix multi-entry loop: BACK_EDGE: B:46:0x009b -> B:47:0x00a3 */
    public static boolean zlvcHA(byte[] bArr) {
        int i;
        int i2;
        int i3;
        if (bArr == null) {
            return true;
        }
        int length = bArr.length;
        int i4 = 0;
        while ((EDt ^ 7426) == 0) {
            if (i4 >= length) {
                return true;
            }
            byte b = bArr[i4];
            if (_LG <= 2346) {
                do {
                    int i5 = _LG;
                    i3 = i5 + 104;
                    if (i3 == 22) {
                        while (true) {
                            _LG = (_LG + i5) ^ 5142;
                        }
                    } else if (i3 == 203) {
                        _LG = ((i5 + i5) ^ 1744) % 77;
                    }
                } while (i3 != 297);
                while (true) {
                    _LG = (_LG >> 71) % 2;
                }
            }
            if (b != 0) {
                return false;
            }
            i4++;
            if ((_LG ^ 2347) != 0) {
                do {
                    i = _LG;
                    i2 = i + 52;
                    if (i2 != 48) {
                        if (i2 == 175) {
                            while (true) {
                                _LG = (_LG ^ 4613) + i;
                            }
                        } else if (i2 == 278) {
                            _LG = ((_LG + i) % 124) + i;
                        }
                    }
                    while (true) {
                        _LG = (_LG % 12) ^ 1241;
                        _LG = ((_LG + i) % 124) + i;
                    }
                } while (i2 != 398);
                _LG = ((i >> 12) % 91) + i;
            }
        }
        if ((_LG ^ 2347) != 0) {
            while (true) {
                int i6 = _LG;
                if (i6 + 39 == 20) {
                    _LG = ((i6 % 109) * 42) + i6;
                }
            }
        } else {
            while (EDt + 65 != 27) {
            }
            while (true) {
                EDt = (EDt * 49) ^ 3140;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String zqTOFw(long j, long j2) {
        String strDRuYWY = UPbYzn.DRuYWY(j + "-" + j2);
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("zuH"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOHNGh}i{VB^L\u0012\u0007") + strDRuYWY);
        return strDRuYWY;
    }
}
