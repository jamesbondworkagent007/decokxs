package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import QfgSZK.OeawrH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.camera.video.AudioStats;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.TMXConfig;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class GiPPlL {
    private static String DjLnxS;
    private static String DlIaRS;
    public static int JCj;
    public static int cgC;
    private OeawrH.C0005OeawrH QsSAnx;
    private long RKAAMt;
    private Context Umbazn;
    private HrFqwD ZacCi;
    private String dXmhBK;
    private int idBaO;
    private long sFxuYV;
    private LocationManager saJVGa;
    private final AtomicBoolean swhTcj = new AtomicBoolean(false);
    private final AtomicBoolean iatxYe = new AtomicBoolean(false);
    private final AtomicBoolean DQcFPM = new AtomicBoolean(false);
    private final AtomicBoolean gXFWUg = new AtomicBoolean(false);
    private final HandlerThread sZFEdC = new HandlerThread(GCXiNH.fsw("IYv@DR`jeGLkKGLKSG"));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QAswws {
        public static final QAswws COARSE;
        public static final QAswws FINE;
        public static final QAswws NONE;
        public static int RTA = 0;
        private static final /* synthetic */ QAswws[] gkhjaB;
        public static int zMS = 3870;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            RTA = 3177;
            GCXiNH.OHr = 2270;
            NONE = new QAswws(GCXiNH.fsw("S^uI"), 0);
            FINE = new QAswws(GCXiNH.fsw("[XuI"), 1);
            COARSE = new QAswws(GCXiNH.fsw("^^z^xt"), 2);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private QAswws(String str, int i) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:62:0x00d9) to fix multi-entry loop: BACK_EDGE: B:62:0x00d9 -> B:63:0x00db */
        /* JADX DEBUG: Duplicate block (B:66:0x00ee) to fix multi-entry loop: BACK_EDGE: B:65:0x00e8 -> B:66:0x00ee */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
        
            if ((QfgSZK.GiPPlL.QAswws.zMS ^ 3870) != 0) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
        
            if ((QfgSZK.GiPPlL.QAswws.zMS ^ 3870) != 0) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
        
            r0 = QfgSZK.GiPPlL.QAswws.zMS;
            r1 = r0 + 117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        
            if (r1 == 31) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
        
            if (r1 == 38) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
        
            QfgSZK.GiPPlL.QAswws.zMS = r0 ^ 6506;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
        
            QfgSZK.GiPPlL.QAswws.zMS = (QfgSZK.GiPPlL.QAswws.zMS * 13530) % 119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00ee, code lost:
        
            QfgSZK.GiPPlL.QAswws.zMS = (QfgSZK.GiPPlL.QAswws.zMS ^ 3639) * 34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ QAswws[] gEmmrt() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            QAswws[] qAswwsArr = new QAswws[3];
            qAswwsArr[0] = NONE;
            if (zMS <= 3869) {
                while (true) {
                    i8 = zMS;
                    int i9 = i8 + 13;
                    if (i9 == 55) {
                        zMS = (i8 >> 48) + i8 + i8;
                    } else {
                        if (i9 == 213) {
                            break;
                        }
                        if (i9 != 276) {
                        }
                    }
                    zMS = (zMS % 8) >> 14;
                }
                zMS = (i8 ^ 1214) >> CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
            }
            if ((RTA ^ 3177) != 0) {
                if (zMS <= 3869) {
                    do {
                        i7 = zMS;
                    } while (i7 + 39 != 11);
                    while (true) {
                        zMS = (zMS * 26) + i7;
                    }
                } else {
                    do {
                        i3 = RTA;
                        i4 = i3 + 13;
                        if (i4 == 68) {
                            while (true) {
                                RTA = ((RTA >> 33) + i3) >> 107;
                                if (zMS <= 3869) {
                                    while (true) {
                                        i5 = zMS;
                                        int i10 = i5 + 52;
                                        if (i10 == 61) {
                                            zMS = i5 + i5 + i5;
                                            break;
                                        }
                                        if (i10 == 252) {
                                            zMS = ((i5 ^ 4323) >> 86) + i5;
                                        } else if (i10 == 267) {
                                            break;
                                        }
                                    }
                                }
                            }
                            while (true) {
                                zMS = ((zMS % WebSocketProtocol.PAYLOAD_SHORT) >> 14) + i5;
                            }
                        } else if (i4 == 130) {
                            while (true) {
                                int i11 = RTA;
                                if (zMS <= 3869) {
                                    break;
                                }
                                RTA = ((i11 * 95) + i3) % 40;
                            }
                            while (true) {
                                i6 = zMS;
                                int i12 = i6 + 104;
                                if (i12 != 75) {
                                    if (i12 == 251) {
                                        zMS = (i6 >> 69) ^ 4048;
                                        break;
                                    }
                                    if (i12 == 345) {
                                        zMS = (i6 + i6) * 10;
                                        break;
                                    }
                                    if (i12 == 422) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                zMS = ((zMS * 104) + i6) >> 28;
                            }
                        } else if (i4 == 182) {
                            RTA = i3 ^ 763;
                        }
                    } while (i4 != 252);
                    if ((zMS ^ 3870) != 0) {
                        while (true) {
                            int i13 = zMS;
                            int i14 = i13 + 130;
                            if (i14 == 14) {
                                zMS = (i13 ^ 4816) + i13 + i13;
                                break;
                            }
                            if (i14 == 44) {
                                break;
                            }
                        }
                        zMS = ((zMS ^ 5298) * 117) ^ 2679;
                    }
                    RTA = ((i3 ^ 1409) % 68) + i3;
                }
            }
            qAswwsArr[1] = FINE;
            if (zMS <= 3869) {
                do {
                    i = zMS;
                    i2 = i + 26;
                    if (i2 == 39) {
                        while (true) {
                            zMS = (zMS + i) % 19;
                        }
                    }
                } while (i2 != 185);
                zMS = ((i % 115) ^ 2922) % 44;
            }
            qAswwsArr[2] = COARSE;
            return qAswwsArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static QAswws valueOf(String str) {
            return (QAswws) Enum.valueOf(QAswws.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static QAswws[] values() {
            return (QAswws[]) gkhjaB.clone();
        }
    }

    public class RPuVlr extends BroadcastReceiver {
        public static int CKi;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String JQeGj;
        public static int ccB;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String dOkklJ;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String dcBvFP;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            ccB = 7047;
            CKi = 7124;
            GCXiNH.OHr = 2270;
            Dff(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RPuVlr() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void Dff(boolean z) {
            if (z) {
                Dff(false);
            }
            JQeGj = GCXiNH.fsw("~~UbNRuwzAVZ");
            dcBvFP = GCXiNH.fsw("|\u007f_~DXe0bMV\rIFFI\u0018v{}|ts{wkuocf{\u007fgKCF");
            dOkklJ = GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbr~nnwemZWWCUE");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i;
            if (!dcBvFP.equals(intent.getAction()) || !HJWChP.DXdlte.RhjxDW() || !new HJWChP.OZOJIj(context).RcvFxC(dOkklJ, GiPPlL.this.Umbazn.getPackageName())) {
                return;
            }
            try {
                Object systemService = context.getSystemService(JQeGj);
                if (systemService instanceof ConnectivityManager) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                        GiPPlL.this.pause();
                    } else {
                        GiPPlL.this.resume();
                    }
                }
            } catch (SecurityException e) {
                DwQSDd.glVQsU(e, GiPPlL.DlIaRS);
                ORrpqH.uzCIH().seuMaA(e);
                if (CKi > 7123) {
                    return;
                }
                if (ccB <= 7046) {
                    while (true) {
                        int i2 = ccB;
                        int i3 = i2 + 117;
                        if (i3 == 67) {
                            i = ((i2 % 27) ^ 1315) * 56;
                        } else if (i3 == 113) {
                            i = (i2 * 114) ^ 1814;
                        } else if (i3 == 163) {
                            i = (i2 ^ 1803) % 20;
                        }
                        ccB = i;
                    }
                } else {
                    while (CKi + 104 != 95) {
                    }
                    while (true) {
                        CKi = (CKi % 109) % 62;
                    }
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(GiPPlL.DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
    }

    public class giPPlL extends BroadcastReceiver {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String OTEOrB = null;
        public static int ROD = 3778;
        public static int sXO;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            sXO = 4335;
            GCXiNH.OHr = 2270;
            fZc(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public giPPlL() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void fZc(boolean z) {
            if (z) {
                fZc(false);
            }
            OTEOrB = GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001frnjiyicftxq");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:100:0x0167) to fix multi-entry loop: BACK_EDGE: B:100:0x0167 -> B:101:0x0169 */
        /* JADX DEBUG: Duplicate block (B:127:0x01d7) to fix multi-entry loop: BACK_EDGE: B:126:0x01d0 -> B:127:0x01d7 */
        /* JADX DEBUG: Duplicate block (B:16:0x003a) to fix multi-entry loop: BACK_EDGE: B:15:0x0034 -> B:16:0x003a */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                java.lang.String r5 = QfgSZK.GiPPlL.giPPlL.OTEOrB
                java.lang.String r6 = r6.getAction()
                boolean r5 = r5.equals(r6)
                int r6 = QfgSZK.GiPPlL.giPPlL.sXO
                r0 = 4334(0x10ee, float:6.073E-42)
                r1 = 3777(0xec1, float:5.293E-42)
                if (r6 > r0) goto La8
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                r5 = r5 ^ 3778(0xec2, float:5.294E-42)
                if (r5 == 0) goto L3d
            L18:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r5 + 104
                r0 = 1
                if (r6 == r0) goto L34
                r0 = 113(0x71, float:1.58E-43)
                if (r6 == r0) goto L2c
                r0 = 220(0xdc, float:3.08E-43)
                if (r6 == r0) goto L28
                goto L18
            L28:
                int r5 = r5 + r5
                int r5 = r5 * 73
                goto L3a
            L2c:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r6 + r5
                int r6 = r6 * 12
                QfgSZK.GiPPlL.giPPlL.ROD = r6
                goto L2c
            L34:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r5 = r5 * 117
                r5 = r5 ^ 5367(0x14f7, float:7.521E-42)
            L3a:
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L34
            L3d:
                int r5 = QfgSZK.GiPPlL.giPPlL.sXO
                int r6 = r5 + 39
                r0 = 24
                if (r6 == r0) goto L81
                r0 = 99
                if (r6 == r0) goto L4e
                r5 = 243(0xf3, float:3.4E-43)
                if (r6 == r5) goto L8e
                goto L3d
            L4e:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                if (r6 > r1) goto L79
            L52:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                int r0 = r6 + 156
                r2 = 11
                if (r0 == r2) goto L72
                r2 = 16
                if (r0 == r2) goto L63
                r2 = 60
                if (r0 == r2) goto L69
                goto L52
            L63:
                r0 = 277992(0x43de8, float:3.8955E-40)
                int r0 = r0 * r6
                QfgSZK.GiPPlL.giPPlL.ROD = r0
            L69:
                int r0 = QfgSZK.GiPPlL.giPPlL.ROD
                int r0 = r0 + r6
                int r0 = r0 % 33
                int r0 = r0 * 119
                QfgSZK.GiPPlL.giPPlL.ROD = r0
            L72:
                int r0 = QfgSZK.GiPPlL.giPPlL.ROD
                int r0 = r0 % 44
                int r0 = r0 + r6
                QfgSZK.GiPPlL.giPPlL.ROD = r0
            L79:
                int r6 = r5 + r5
                int r6 = r6 + r5
                int r6 = r6 % 74
                QfgSZK.GiPPlL.giPPlL.sXO = r6
                goto L8e
            L81:
                r5 = r5 ^ 2662(0xa66, float:3.73E-42)
                int r5 = r5 * 107
                QfgSZK.GiPPlL.giPPlL.sXO = r5
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                r5 = r5 ^ 3778(0xec2, float:5.294E-42)
                if (r5 == 0) goto L8e
                goto L98
            L8e:
                int r5 = QfgSZK.GiPPlL.giPPlL.sXO
                r5 = r5 ^ 3836(0xefc, float:5.375E-42)
                QfgSZK.GiPPlL.giPPlL.sXO = r5
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                if (r5 > r1) goto L8e
            L98:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r5 + 143
                r0 = 4
                if (r6 == r0) goto La0
                goto L98
            La0:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r6 * 31
                int r6 = r6 + r5
                QfgSZK.GiPPlL.giPPlL.ROD = r6
                goto La0
            La8:
                if (r5 == 0) goto L1da
                QfgSZK.GiPPlL r5 = QfgSZK.GiPPlL.this
                r5.pause()
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                if (r5 > r1) goto Le7
            Lb3:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r5 + 39
                r0 = 90
                if (r6 == r0) goto Ld6
                r0 = 156(0x9c, float:2.19E-43)
                if (r6 == r0) goto Lde
                r0 = 236(0xec, float:3.31E-43)
                if (r6 == r0) goto Lcd
                r0 = 349(0x15d, float:4.89E-43)
                if (r6 == r0) goto Lc8
                goto Lb3
            Lc8:
                r5 = r5 ^ 1191(0x4a7, float:1.669E-42)
                int r5 = r5 * 68
                goto Le4
            Lcd:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r5 = r5 >> 45
                r5 = r5 ^ 3770(0xeba, float:5.283E-42)
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto Lcd
            Ld6:
                int r5 = r5 * 6
                int r5 = r5 >> 6
                r5 = r5 ^ 2411(0x96b, float:3.379E-42)
                QfgSZK.GiPPlL.giPPlL.ROD = r5
            Lde:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                r6 = 956032(0xe9680, float:1.339686E-39)
                int r5 = r5 * r6
            Le4:
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto Lb3
            Le7:
                int r6 = QfgSZK.GiPPlL.giPPlL.sXO
                r6 = r6 ^ 4335(0x10ef, float:6.075E-42)
                if (r6 == 0) goto L1df
                if (r5 > r1) goto L101
            Lef:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r5 + 52
                r0 = 54
                if (r6 == r0) goto Lf8
                goto Lef
            Lf8:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r6 + r5
                int r6 = r6 * 75
                int r6 = r6 + r5
                QfgSZK.GiPPlL.giPPlL.ROD = r6
                goto Lf8
            L101:
                int r5 = QfgSZK.GiPPlL.giPPlL.sXO
                int r5 = r5 + 26
                r6 = 43
                r0 = 62
                if (r5 == r0) goto L14c
                r0 = 105(0x69, float:1.47E-43)
                if (r5 == r0) goto L110
                goto L101
            L110:
                int r5 = QfgSZK.GiPPlL.giPPlL.sXO
                r5 = r5 ^ 4606(0x11fe, float:6.454E-42)
                int r5 = r5 % 100
                QfgSZK.GiPPlL.giPPlL.sXO = r5
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                if (r5 > r1) goto L110
            L11c:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r0 = r5 + 78
                if (r0 == r6) goto L146
                r2 = 112(0x70, float:1.57E-43)
                if (r0 == r2) goto L141
                r5 = 176(0xb0, float:2.47E-43)
                if (r0 == r5) goto L138
                r5 = 211(0xd3, float:2.96E-43)
                if (r0 == r5) goto L12f
                goto L11c
            L12f:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                r5 = r5 ^ 2152(0x868, float:3.016E-42)
                int r5 = r5 >> 88
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L12f
            L138:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r5 = r5 >> 123
                int r5 = r5 * 8282
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L138
            L141:
                r5 = r5 ^ 1356(0x54c, float:1.9E-42)
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L11c
            L146:
                int r0 = r5 % 33
                int r0 = r0 + r5
                QfgSZK.GiPPlL.giPPlL.ROD = r0
                goto L110
            L14c:
                int r5 = QfgSZK.GiPPlL.giPPlL.sXO
                int r2 = QfgSZK.GiPPlL.giPPlL.ROD
                if (r2 > r1) goto L178
            L152:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r1 = r5 + 91
                r2 = 69
                if (r1 == r2) goto L163
                r5 = 199(0xc7, float:2.79E-43)
                if (r1 == r5) goto L171
                r5 = 215(0xd7, float:3.01E-43)
                if (r1 == r5) goto L169
                goto L152
            L163:
                r5 = r5 ^ 1420(0x58c, float:1.99E-42)
                int r5 = r5 % 2
            L167:
                QfgSZK.GiPPlL.giPPlL.ROD = r5
            L169:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r5 = r5 >> 13
                r5 = r5 ^ 5292(0x14ac, float:7.416E-42)
                QfgSZK.GiPPlL.giPPlL.ROD = r5
            L171:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r5 = r5 % r6
                int r5 = r5 >> r0
                int r5 = r5 * 14
                goto L167
            L178:
                r3 = r2 ^ 3778(0xec2, float:5.294E-42)
                if (r3 == 0) goto L1a7
            L17c:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r5 + 195
                r0 = 84
                if (r6 == r0) goto L1a0
                r0 = 190(0xbe, float:2.66E-43)
                if (r6 == r0) goto L196
                r5 = 379(0x17b, float:5.31E-43)
                if (r6 == r5) goto L18d
                goto L17c
            L18d:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                r5 = r5 ^ 2301(0x8fd, float:3.224E-42)
                int r5 = r5 * 315
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L18d
            L196:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r6 >> 9
                int r6 = r6 + r5
                int r6 = r6 * 72
                QfgSZK.GiPPlL.giPPlL.ROD = r6
                goto L196
            L1a0:
                int r5 = r5 * 99
                r5 = r5 ^ 3348(0xd14, float:4.692E-42)
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L17c
            L1a7:
                r5 = r5 ^ 2811(0xafb, float:3.939E-42)
                int r5 = r5 * 14
                int r5 = r5 >> 65
                QfgSZK.GiPPlL.giPPlL.sXO = r5
                if (r2 > r1) goto L14c
            L1b1:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r5 + 65
                r0 = 28
                if (r6 == r0) goto L1d0
                r0 = 147(0x93, float:2.06E-43)
                if (r6 == r0) goto L1cb
                r5 = 330(0x14a, float:4.62E-43)
                if (r6 == r5) goto L1c2
                goto L1b1
            L1c2:
                int r5 = QfgSZK.GiPPlL.giPPlL.ROD
                r5 = r5 ^ 1852(0x73c, float:2.595E-42)
                int r5 = r5 * 53
                QfgSZK.GiPPlL.giPPlL.ROD = r5
                goto L1c2
            L1cb:
                r6 = r5 ^ 4592(0x11f0, float:6.435E-42)
                int r6 = r6 * 75
                goto L1d7
            L1d0:
                int r6 = QfgSZK.GiPPlL.giPPlL.ROD
                int r6 = r6 >> 27
                int r6 = r6 % 100
                int r6 = r6 + r5
            L1d7:
                QfgSZK.GiPPlL.giPPlL.ROD = r6
                goto L1d0
            L1da:
                QfgSZK.GiPPlL r5 = QfgSZK.GiPPlL.this
                r5.resume()
            L1df:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.GiPPlL.giPPlL.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:11:0x002a) to fix multi-entry loop: BACK_EDGE: B:11:0x002a -> B:12:0x0031 */
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
            r0 = 1871(0x74f, float:2.622E-42)
            QfgSZK.GiPPlL.JCj = r0
            r1 = 3987(0xf93, float:5.587E-42)
            QfgSZK.GCXiNH.Cwg = r1
            r1 = 2270(0x8de, float:3.181E-42)
            QfgSZK.GCXiNH.OHr = r1
            r1 = 9160(0x23c8, float:1.2836E-41)
            QfgSZK.GiPPlL.cgC = r1
            int r1 = QfgSZK.GiPPlL.JCj
            r0 = r0 ^ r1
            if (r0 == 0) goto L44
        L19:
            int r0 = QfgSZK.GiPPlL.JCj
            int r1 = r0 + 13
            r2 = 97
            if (r1 == r2) goto L2a
            r2 = 153(0x99, float:2.14E-43)
            if (r1 == r2) goto L3a
            r2 = 272(0x110, float:3.81E-43)
            if (r1 == r2) goto L31
            goto L19
        L2a:
            int r1 = QfgSZK.GiPPlL.JCj
            int r1 = r1 * 2727
            int r1 = r1 + r0
            QfgSZK.GiPPlL.JCj = r1
        L31:
            int r1 = QfgSZK.GiPPlL.JCj
            int r1 = r1 >> 114
            int r1 = r1 + r0
            int r1 = r1 >> 18
            QfgSZK.GiPPlL.JCj = r1
        L3a:
            int r1 = QfgSZK.GiPPlL.JCj
            r2 = 196(0xc4, float:2.75E-43)
            int r1 = r1 >> r2
            int r1 = r1 % 22
            QfgSZK.GiPPlL.JCj = r1
            goto L2a
        L44:
            r0 = 6842(0x1aba, float:9.588E-42)
            QfgSZK.FQMcgE.usN = r0
            java.lang.String r0 = "[pR`NU!jc\bPFM@[SSG\u0014_]RQ[WRRh_KN^E`w9\""
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            QfgSZK.GiPPlL.DjLnxS = r0
            java.lang.Class<QfgSZK.GiPPlL> r0 = QfgSZK.GiPPlL.class
            java.lang.String r0 = QfgSZK.FQMcgE.hfdhUn(r0)
            QfgSZK.GiPPlL.DlIaRS = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.GiPPlL.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private boolean OStAOF(LocationManager locationManager, String str, long j, Criteria criteria, Looper looper) {
        if (looper == null) {
            return false;
        }
        try {
            if (this.ZacCi != null && RcvFxC(this.Umbazn)) {
                if (str != null) {
                    if (RcvFxC(this.Umbazn)) {
                        locationManager.requestLocationUpdates(str, this.sFxuYV, j, this.ZacCi, looper);
                    }
                } else if (RcvFxC(this.Umbazn)) {
                    locationManager.requestLocationUpdates(this.sFxuYV, j, criteria, this.ZacCi, looper);
                }
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("o}N"));
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("IUwcHPuwcFoBDHOBD\u0015WAWPDJZ\u0007\u001c") + locationManager.getBestProvider(criteria, true));
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            FQMcgE.DFbvW(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bPFM@[SSG\u0014_]RQ[WRRh_KN^E`w9\"") + e);
            ORrpqH.uzCIH().seuMaA(e);
            if ((JCj ^ 1871) == 0) {
                return false;
            }
            while (true) {
                int i = JCj;
                int i2 = i + 65;
                if (i2 == 58) {
                    break;
                }
                if (i2 == 175) {
                    JCj = ((i % WalletImportError.ERROR_CODE_AA_CREATE_KEY) >> 84) * 107;
                }
            }
            while (true) {
                JCj = ((JCj >> 61) * 37) ^ 1653;
            }
        } catch (SecurityException e2) {
            FQMcgE.DFbvW(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bPFM@[SSG\u0014_]RQ[WRRh_KN^E`w9\"") + e2);
            DwQSDd.glVQsU(e2);
            ORrpqH.uzCIH().seuMaA(e2);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Location hgxRZI() {
        int i;
        int i2;
        Location location = null;
        if (RcvFxC(this.Umbazn) && this.iatxYe.get()) {
            LocationManager locationManager = this.saJVGa;
            if (locationManager == null) {
                return null;
            }
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("z}W"));
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("\\eOiFAuwbO\u0002WE\tNNXQ\u0014R\\\u0011UWWNHRT^\u0018[Ifewknn\u001eXf${x`eb6a|z|vc"));
            try {
                long j = 0;
                float f = Float.MAX_VALUE;
                for (String str : locationManager.getAllProviders()) {
                    if (str == null) {
                        FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("sdW`\u000bAsqzAFFX\t\u0000PCA\u000b\u001a"));
                    } else if (zvzmfz(this.Umbazn) != QAswws.COARSE || str.equals(GCXiNH.fsw("stO{DCj"))) {
                        if (RcvFxC(this.Umbazn)) {
                            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztO@JBuRcKCWCFF\u000f\u001f\u0015\u000e\u0013") + str);
                            Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                            if (lastKnownLocation != null) {
                                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("z}WbE"));
                                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztO@JBuRcKCWCFF\u000f\u001f\u0015\u000e\u0013") + lastKnownLocation.getProvider() + ":" + lastKnownLocation.getLatitude() + ":" + lastKnownLocation.getLongitude() + ":" + lastKnownLocation.getAccuracy());
                                float accuracy = lastKnownLocation.getAccuracy();
                                long time = lastKnownLocation.getTime();
                                long j2 = this.RKAAMt;
                                if (time > j2 && accuracy < f) {
                                    f = accuracy;
                                } else if (time >= j2 || f != Float.MAX_VALUE || time <= j) {
                                }
                                location = lastKnownLocation;
                                j = time;
                            }
                        }
                    }
                }
            } catch (SecurityException e) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x"), e.toString());
                DwQSDd.glVQsU(e);
                ORrpqH.uzCIH().seuMaA(e);
                if (JCj <= 1870) {
                    do {
                        i = JCj;
                        i2 = i + 130;
                        if (i2 == 62) {
                            while (true) {
                                JCj = JCj + i + i;
                            }
                        }
                    } while (i2 != 167);
                    JCj = (i % 16) ^ 2468;
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
        return location;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void zzJhsT() {
        if (new HJWChP.OZOJIj(this.Umbazn).RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbr~nnwemZWWCUE"), this.Umbazn.getPackageName())) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(GCXiNH.fsw("|\u007f_~DXe0bMV\rIFFI\u0018v{}|ts{wkuocf{\u007fgKCF"));
            this.Umbazn.registerReceiver(new RPuVlr(), intentFilter);
        }
        if (this.swhTcj.get()) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001frnjiyicftxq"));
            intentFilter2.addAction(GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001frnjiyicfw|g\\"));
            intentFilter2.addAction(GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001fqljtsueiw`cW[@MON{o]AO"));
            this.Umbazn.registerReceiver(new giPPlL(), intentFilter2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OmJATG() {
        int i;
        if (RcvFxC(this.Umbazn) && this.iatxYe.get() && this.ZacCi != null) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("o}H"));
            FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("ot\\eXEdl@GAB^@GIePFE[RU\\\u0004\u001dPTM\u0019HXQ`v#") + this.RKAAMt + GCXiNH.fsw("=yRkC\u0011qq{MP\u0003") + this.sFxuYV + GCXiNH.fsw("=fRxC\u0011`}o]PBIP\b") + this.idBaO);
            try {
                Object systemService = this.Umbazn.getSystemService(GCXiNH.fsw("q~Xm_Xnp"));
                if (!(systemService instanceof LocationManager)) {
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("Q~Xm_Xnp,eCMKNMU\u0016\\G\u0013\\^D\u000f_K]RVXZ[C"));
                    return;
                }
                LocationManager locationManager = (LocationManager) systemService;
                this.saJVGa = locationManager;
                if (RcvFxC(this.Umbazn)) {
                    locationManager.removeUpdates(this.ZacCi);
                }
                Criteria criteria = new Criteria();
                criteria.setAccuracy(this.idBaO);
                criteria.setAltitudeRequired(false);
                criteria.setBearingAccuracy(0);
                criteria.setCostAllowed(false);
                criteria.setSpeedAccuracy(0);
                criteria.setSpeedRequired(false);
                criteria.setVerticalAccuracy(0);
                Criteria criteria2 = new Criteria();
                criteria2.setPowerRequirement(1);
                criteria2.setAccuracy(2);
                String bestProvider = locationManager.getBestProvider(criteria, true);
                if (bestProvider != null) {
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("{xUi\u000bAsqzAFFX\u0013\b") + bestProvider);
                }
                String bestProvider2 = locationManager.getBestProvider(criteria2, true);
                if (bestProvider2 != null) {
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("~~N~XT!n~GTJNLZ\u001d\u0016") + bestProvider2);
                }
                if (bestProvider == null && bestProvider2 == null) {
                    this.saJVGa = null;
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("H\u007fZnGT!jc\bDJDM\bKYVUG[^^\u000fNOSMS]]E\n%tlqri\\@p$bdjgudpwg2au}stohsvvd)\u0005fLxmE\u0010vMLX\u0005GILKURX\u0013Ne]mXFO\\YY\u0016hIHI^]PSnCQW@YKGZ[OURP?Oc2rzqdxqn\u0000DcSr{rPNAC\u0006fijyW`rGgOum{q~ycsvb3wF\u0000MUU"));
                    return;
                }
                Location locationHgxRZI = RcvFxC(this.Umbazn) ? hgxRZI() : null;
                boolean zEquals = (bestProvider == null || bestProvider2 == null) ? false : bestProvider.equals(bestProvider2);
                if (locationHgxRZI != null) {
                    this.ZacCi.onLocationChanged(locationHgxRZI);
                }
                boolean zOStAOF = RcvFxC(this.Umbazn) ? OStAOF(locationManager, bestProvider2, 0L, criteria2, this.sZFEdC.getLooper()) : false;
                if (RcvFxC(this.Umbazn) && !zEquals && !zOStAOF) {
                    zOStAOF = OStAOF(locationManager, bestProvider, 0L, criteria, this.sZFEdC.getLooper());
                }
                if (zOStAOF) {
                    return;
                }
                this.saJVGa = null;
            } catch (SecurityException e) {
                DwQSDd.glVQsU(e, DlIaRS);
                this.saJVGa = null;
                ORrpqH.uzCIH().seuMaA(e);
                if (cgC <= 9159) {
                    do {
                        i = cgC;
                    } while (i + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 != 12);
                    cgC = ((i % 91) % 16) % 64;
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(DlIaRS, e2.toString());
                this.saJVGa = null;
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:15:0x002c) to fix multi-entry loop: BACK_EDGE: B:14:0x0024 -> B:15:0x002c */
    public boolean QMuEJi() {
        int i;
        int i2;
        int i3;
        int i4;
        if (RihMUf()) {
            LocationManager locationManager = this.saJVGa;
            if (JCj <= 1870) {
                while (true) {
                    int i5 = JCj;
                    int i6 = i5 + 26;
                    if (i6 == 63) {
                        while (true) {
                            JCj = ((JCj * 50) + i5) ^ 1284;
                        }
                    } else if (i6 != 193) {
                        if (i6 == 326) {
                            JCj = (i5 % 122) >> 73;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    JCj = ((JCj ^ 1781) % 77) ^ 2372;
                }
            } else if (locationManager != null && this.ZacCi != null) {
                if ((cgC ^ 9160) == 0) {
                    return true;
                }
                while (true) {
                    i = cgC;
                    int i7 = i + 26;
                    if (i7 == 9) {
                        break;
                    }
                    if (i7 == 197) {
                        cgC = (i >> 38) * 103;
                        if ((JCj ^ 1871) != 0) {
                            while (true) {
                                i4 = JCj;
                                int i8 = i4 + 52;
                                if (i8 != 97) {
                                    if (i8 == 288) {
                                        JCj = (i4 ^ 3597) * 80;
                                    } else if (i8 == 356) {
                                        JCj = (JCj * 6365) + i4;
                                    } else if (i8 == 507) {
                                        break;
                                    }
                                }
                                JCj = ((JCj + i4) ^ 3557) >> 45;
                                JCj = (JCj * 6365) + i4;
                            }
                            JCj = (i4 * 98) ^ 3874;
                        }
                    }
                }
                while (true) {
                    cgC = ((cgC + i) % 118) % 45;
                    if ((JCj ^ 1871) != 0) {
                        do {
                            i2 = JCj;
                            i3 = i2 + 65;
                            if (i3 == 84) {
                                break;
                            }
                        } while (i3 != 190);
                        JCj = i2 >> 108;
                    }
                }
                while (true) {
                    JCj *= 2581;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean RcvFxC(Context context) {
        int i;
        int i2;
        int i3;
        HJWChP.OZOJIj oZOJIj = new HJWChP.OZOJIj(context);
        if (!oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mb\u007ft{kkryIK@CUIqb"), this.dXmhBK) && !oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbzrt|g{iFEWKNN"), this.dXmhBK)) {
            return false;
        }
        if ((cgC ^ 9160) == 0) {
            return true;
        }
        if (JCj <= 1870) {
            do {
                i3 = JCj;
            } while (i3 + 52 != 53);
            while (true) {
                JCj = (JCj * 26) + i3;
            }
        } else {
            while (cgC + 39 != 73) {
            }
            while (true) {
                cgC = (cgC % 99) >> 36;
                if ((JCj ^ 1871) != 0) {
                    do {
                        i = JCj;
                        i2 = i + 65;
                        if (i2 == 30) {
                            while (true) {
                                JCj = ((JCj * 31) >> 118) ^ 4769;
                            }
                        } else if (i2 == 127) {
                            JCj = (i + i) % 13;
                        }
                    } while (i2 != 178);
                    while (true) {
                        JCj = ((JCj >> 41) % 94) + i;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean RihMUf() {
        if (!HJWChP.frwjPh.gdwsGQ() || !HJWChP.frwjPh.RihMUf()) {
            return false;
        }
        if ((JCj ^ 1871) == 0) {
            return true;
        }
        while (JCj + 26 != 88) {
        }
        while (true) {
            JCj >>= 102;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void config(TMXConfig tMXConfig) {
        ZqidTP zqidTPZrcPaS = tMXConfig.zrcPaS();
        if (zqidTPZrcPaS == null || zqidTPZrcPaS.Umbazn == null) {
            return;
        }
        this.iatxYe.set(tMXConfig.zdmjIa());
        this.swhTcj.set(tMXConfig.YGgET());
        Context context = zqidTPZrcPaS.Umbazn;
        this.Umbazn = context;
        this.dXmhBK = context.getPackageName();
        this.RKAAMt = tMXConfig.DEZRQt();
        this.sFxuYV = tMXConfig.dUjeuS();
        this.idBaO = tMXConfig.hMnsts();
        this.ZacCi = new HrFqwD();
        try {
            this.sZFEdC.start();
            if (QMuEJi()) {
                zzJhsT();
            }
            OmJATG();
        } catch (Throwable th) {
            FQMcgE.OijiEz(DlIaRS, th.toString());
            ORrpqH.uzCIH().seuMaA(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:43:0x00b1) to fix multi-entry loop: BACK_EDGE: B:42:0x00aa -> B:43:0x00b1 */
    /* JADX DEBUG: Duplicate block (B:53:0x00da) to fix multi-entry loop: BACK_EDGE: B:52:0x00d6 -> B:53:0x00da */
    public void fhUrPt() {
        HrFqwD hrFqwD;
        int i;
        int i2;
        int i3;
        LocationManager locationManager = this.saJVGa;
        if (!RcvFxC(this.Umbazn) || (hrFqwD = this.ZacCi) == null || locationManager == null) {
            return;
        }
        try {
            locationManager.removeUpdates(hrFqwD);
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x"), e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            if ((cgC ^ 9160) == 0) {
                return;
            }
            if ((JCj ^ 1871) == 0) {
                while (true) {
                    int i4 = cgC;
                    int i5 = i4 + 13;
                    if (i5 != 33) {
                        if (i5 == 211) {
                            do {
                                cgC *= MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED;
                            } while ((JCj ^ 1871) == 0);
                            do {
                                i = JCj;
                                i2 = i + 52;
                                if (i2 != 51) {
                                    if (i2 == 142) {
                                        JCj = ((i + i) * 37) + i;
                                    } else if (i2 != 272) {
                                    }
                                    i3 = (JCj >> 48) ^ 2650;
                                    break;
                                }
                                break;
                            } while (i2 != 301);
                            i3 = (i * 99) ^ 1027;
                            JCj = i3;
                            while (true) {
                                JCj = ((JCj + i) >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) ^ 2713;
                            }
                        } else if (i5 == 342) {
                            cgC = ((i4 * 36) >> 31) % 38;
                        } else if (i5 == 473) {
                            cgC = (i4 >> 80) ^ 2016;
                            return;
                        }
                    }
                    cgC = ((cgC * 30) % WalletImportError.ERROR_CODE_AA_CREATE_KEY) >> 26;
                    if ((JCj ^ 1871) != 0) {
                        break;
                    }
                }
            }
            while (true) {
                int i6 = JCj;
                int i7 = i6 + 26;
                if (i7 != 60) {
                    if (i7 == 244) {
                        JCj = (i6 >> 23) ^ 300;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                JCj ^= 351;
            }
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:50:0x00a6) to fix multi-entry loop: BACK_EDGE: B:49:0x009e -> B:50:0x00a6 */
    /* JADX DEBUG: Duplicate block (B:62:0x00d5) to fix multi-entry loop: BACK_EDGE: B:62:0x00d5 -> B:63:0x00d7 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        QfgSZK.GiPPlL.JCj = ((QfgSZK.GiPPlL.JCj + r0) + r0) % 52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OeawrH.C0005OeawrH getLocation() {
        HrFqwD hrFqwD;
        Location locationHgxRZI;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.gXFWUg.get()) {
            return this.QsSAnx;
        }
        if (!RcvFxC(this.Umbazn) || !this.iatxYe.get()) {
            return null;
        }
        OeawrH.C0005OeawrH c0005OeawrH = this.QsSAnx;
        if (c0005OeawrH != null) {
            return c0005OeawrH;
        }
        if (!RcvFxC(this.Umbazn)) {
            return null;
        }
        if (JCj <= 1870) {
            do {
                i4 = JCj;
                i5 = i4 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                if (i5 == 92) {
                    while (true) {
                        JCj = (JCj ^ 2379) * 70;
                    }
                }
            } while (i5 != 223);
            JCj = ((i4 >> 125) % 88) ^ 1645;
        }
        AtomicBoolean atomicBoolean = this.iatxYe;
        if ((cgC ^ 9160) != 0) {
            if ((JCj ^ 1871) != 0) {
                while (true) {
                    int i6 = JCj;
                    int i7 = i6 + 91;
                    if (i7 == 4) {
                        JCj = (i6 + i6) >> 123;
                        break;
                    }
                    if (i7 != 30) {
                        if (i7 == 116) {
                            JCj = (i6 % 63) * 31;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            while (cgC + 130 != 96) {
            }
            do {
                int i8 = cgC;
                i = JCj;
                if (i <= 1870) {
                    while (true) {
                        i2 = JCj;
                        int i9 = i2 + 208;
                        if (i9 != 34) {
                            if (i9 == 213) {
                                JCj = JCj + i2 + i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        JCj = (JCj ^ 8075) * 67;
                        JCj = JCj + i2 + i2;
                    }
                } else {
                    cgC = ((i8 * 33) ^ 3199) % 81;
                }
            } while (i > 1870);
            do {
                int i10 = JCj;
                i3 = i10 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                if (i3 == 7) {
                    JCj = ((i10 ^ 3319) * 51) + i10;
                } else if (i3 != 16) {
                }
                while (true) {
                    JCj = (JCj + i10) >> 92;
                }
            } while (i3 != 205);
            while (true) {
                JCj = (JCj % 13) * 1520;
            }
        } else {
            if (!atomicBoolean.get() || (hrFqwD = this.ZacCi) == null || (locationHgxRZI = hrFqwD.hgxRZI()) == null) {
                return null;
            }
            double latitude = locationHgxRZI.getLatitude();
            if (JCj > 1870) {
                if (latitude == AudioStats.AUDIO_AMPLITUDE_NONE && locationHgxRZI.getLongitude() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return null;
                }
                return DGUQLI.apNbdB(locationHgxRZI, false);
            }
            while (true) {
                int i11 = JCj;
                int i12 = i11 + 117;
                if (i12 == 70) {
                    break;
                }
                if (i12 == 135) {
                    JCj = (i11 * 106) + i11 + i11;
                }
            }
            while (true) {
                JCj = (JCj ^ 6962) * 79;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void pause() {
        if (RcvFxC(this.Umbazn) && this.iatxYe.get() && !this.DQcFPM.get()) {
            fhUrPt();
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("mpN\u007fNU!PCf\u000fe\u007fzmc\u0016Y[PSEY@P\u001dO^HOQTCv"));
            this.DQcFPM.set(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void resume() {
        if (!RcvFxC(this.Umbazn) || !this.iatxYe.get()) {
            return;
        }
        boolean z = this.DQcFPM.get();
        if ((JCj ^ 1871) == 0) {
            if (z) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("otHyFXoy,fmm\u0007o}tsq\u0014_]RQ[WRR\u001bI\\JAOfap"));
                OmJATG();
                this.DQcFPM.set(false);
                return;
            }
            return;
        }
        while (true) {
            int i = JCj;
            if (i + 26 == 52) {
                JCj = ((i ^ 5281) >> 108) % 114;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean sElUiK() {
        return this.iatxYe.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLocationManually(OeawrH.C0005OeawrH c0005OeawrH) {
        this.QsSAnx = c0005OeawrH;
        this.gXFWUg.set(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void unregister() {
        fhUrPt();
        this.ZacCi = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QAswws zvzmfz(Context context) {
        QAswws qAswws = QAswws.NONE;
        HJWChP.OZOJIj oZOJIj = new HJWChP.OZOJIj(context);
        if (oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mb\u007ft{kkryIK@CUIqb"), context.getPackageName())) {
            qAswws = QAswws.COARSE;
        }
        return oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbzrt|g{iFEWKNN"), context.getPackageName()) ? QAswws.FINE : qAswws;
    }
}
