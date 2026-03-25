package QfgSZK;

import QfgSZK.DcMfJK;
import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.ibm.icu.text.DateFormat;
import com.lexisnexisrisk.threatmetrix.TMXConfig;
import com.lexisnexisrisk.threatmetrix.TMXModuleClassLoader;
import com.lexisnexisrisk.threatmetrix.TMXModuleInitializerInterface;
import com.lexisnexisrisk.threatmetrix.TMXModuleMetadataProviderInterface;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.TMXScanEndNotifier;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public class DCUTEI {
    public static int CVC = 0;
    private static String DgJUQc = null;
    private static String DlIaRS = null;
    private static String DpvvQs = null;
    static final long MODULE_FLAG_DEVICE_SECURITY = 4;
    static final long MODULE_FLAG_SENSORS = 8;
    private static String QEdNDr = null;
    private static final Map<String, String> QwNZnX;
    private static String UGNXTk = null;
    private static final long aNfxqM = 1;
    private static String aedxwm = null;
    private static String gbKuDA = null;
    private static String gbZFSe = null;
    private static final long gbmYDU = 2;
    static final Map<String, String> gcJYRw;
    private static String hWBAcA;
    private static String hmmPXQ;
    private static String iLtUbY;
    private static final Map<String, Long> spUnqd;
    public static int zWr;
    private static String zwTtMx;
    private static String zxXNZZ;
    private final Map<String, SaJVGb> ajBqpt = new TreeMap();
    private long diggZZ;

    public class dCUTEI implements Callable {
        public static int CSc;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QBBmxw;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QuKVur;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String ROLCCm;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String grFsBm;
        public static int kjC;
        final /* synthetic */ Class gDxRgH;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            CSc = 4302;
            GCXiNH.OHr = 2270;
            kjC = 5827;
            Dmq(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public dCUTEI(Class cls) {
            this.gDxRgH = cls;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:14:0x003b) to fix multi-entry loop: BACK_EDGE: B:13:0x0033 -> B:14:0x003b */
        public static /* synthetic */ void Dmq(boolean z) {
            int i;
            if (z) {
                Dmq(false);
            }
            ROLCCm = GCXiNH.fsw("[pR`NU!jc\bEF^\t");
            QBBmxw = GCXiNH.fsw("t\u007fO");
            String strFsw = GCXiNH.fsw("[pR`NU!jc\bALDOA@CGQ\u0013ATBYW^Y\u001bVVYSCw$+y|)\u0004\fry");
            if ((CSc ^ 4302) == 0) {
                QuKVur = strFsw;
                grFsBm = GCXiNH.fsw("=rWmXB!rcIFFX");
                return;
            }
            while (true) {
                i = CSc;
                int i2 = i + 39;
                if (i2 == 71) {
                    while (true) {
                        CSc = (CSc * 64) + i;
                    }
                } else if (i2 != 201) {
                    if (i2 == 298) {
                        CSc = ((CSc * 53) + i) % 18;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                CSc = (CSc ^ 3408) % 4;
                CSc = ((CSc * 53) + i) % 18;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        public ArrayList<T> call() {
            try {
                ClassLoader classLoader = this.gDxRgH.getClassLoader();
                if (classLoader != null) {
                    return DCUTEI.QHmsKR(ServiceLoader.load(this.gDxRgH, new TMXModuleClassLoader(classLoader)).iterator(), this.gDxRgH);
                }
                throw new ClassNotFoundException(ROLCCm + this.gDxRgH.getSimpleName() + grFsBm);
            } catch (ClassNotFoundException | SecurityException | ServiceConfigurationError e) {
                DCUTEI.QwNZnX.put(this.gDxRgH.getName(), QBBmxw);
                FQMcgE.svhCHd(DCUTEI.DlIaRS, QuKVur, this.gDxRgH.getSimpleName(), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
                return null;
            }
        }
    }

    public class ddSDPG implements Runnable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String OczcNd = null;
        public static int fAH = 0;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String fkSBvT = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String hWAIun = null;
        public static int hxI = 7771;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String sjMgxz;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String snsJDp;
        final /* synthetic */ TMXScanEndNotifier ODJnDd;
        final /* synthetic */ int Qufecd;
        final /* synthetic */ boolean fMSVAf;
        final /* synthetic */ OmYuqg fOmeTO;
        final /* synthetic */ long iOIrNX;
        final /* synthetic */ SaJVGb mWudO;
        final /* synthetic */ DcMfJK.fNLfdT sadatZ;
        final /* synthetic */ ZqidTP zEdbMC;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            fAH = 2192;
            WS(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ddSDPG(DcMfJK.fNLfdT fnlfdt, SaJVGb saJVGb, ZqidTP zqidTP, boolean z, long j, int i, OmYuqg omYuqg, TMXScanEndNotifier tMXScanEndNotifier) {
            this.sadatZ = fnlfdt;
            this.mWudO = saJVGb;
            this.zEdbMC = zqidTP;
            this.fMSVAf = z;
            this.iOIrNX = j;
            this.Qufecd = i;
            this.fOmeTO = omYuqg;
            this.ODJnDd = tMXScanEndNotifier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r1 = ((QfgSZK.DCUTEI.ddSDPG.hxI * 73) + r4) * com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        
            QfgSZK.DCUTEI.ddSDPG.hxI = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void WS(boolean z) {
            int i;
            int i2;
            if (z) {
                WS(false);
            }
            if (hxI <= 7770) {
                do {
                    i = hxI;
                    i2 = i + 26;
                    if (i2 == 64) {
                        hxI = (i * 120) ^ MTCoreConstants.MainWhat.ON_LOGIN_INTO;
                    }
                } while (i2 != 91);
                while (true) {
                    hxI = (hxI + i) ^ 4680;
                }
            }
            snsJDp = GCXiNH.fsw("nrZb{PbumOGP\u0002RU\u000e\f\u0015YR@ZYAY\u001dOX[W\u0018VU%wwcst[H");
            OczcNd = GCXiNH.fsw("H\u007f^t[TbjiL\u0002FRJMWB\\[]\u0012^SLKON^^\u0019O_Ck$`cmlWBn$NdmFhb|rzwc0");
            hWAIun = GCXiNH.fsw("nrZb{PbumOGP\u0002");
            String strFsw = GCXiNH.fsw("4+\u001boD\\qri\\G");
            if (hxI > 7770) {
                sjMgxz = strFsw;
                fkSBvT = GCXiNH.fsw("XiXi[Ehqb\bKP\nYID]TSV\u0012BSNP");
                return;
            }
            while (true) {
                int i3 = hxI;
                int i4 = i3 + 39;
                if (i4 != 3) {
                    if (i4 != 162) {
                        if (i4 == 356) {
                            int i5 = (i3 >> 122) + i3 + i3;
                            break;
                        } else if (i4 == 486) {
                            hxI = ((i3 % 76) ^ 1486) >> 79;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                hxI = (hxI % 91) >> 104;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:33:0x00c7) to fix multi-entry loop: BACK_EDGE: B:33:0x00c7 -> B:34:0x00c9 */
        /* JADX DEBUG: Duplicate block (B:35:0x00d1) to fix multi-entry loop: BACK_EDGE: B:35:0x00d1 -> B:36:0x00d9 */
        /* JADX DEBUG: Duplicate block (B:49:0x0107) to fix multi-entry loop: BACK_EDGE: B:48:0x0101 -> B:49:0x0107 */
        /* JADX DEBUG: Duplicate block (B:82:0x01ea) to fix multi-entry loop: BACK_EDGE: B:81:0x01e4 -> B:82:0x01ea */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[LOOP:2: B:23:0x00ae->B:123:?, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e7 A[LOOP:4: B:38:0x00e7->B:130:0x00e7, LOOP_START] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ac -> B:36:0x00d9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            /*
                r10 = this;
                r0 = 10
                r1 = 141(0x8d, float:1.98E-43)
                r2 = 7770(0x1e5a, float:1.0888E-41)
                java.lang.String r3 = QfgSZK.DCUTEI.RKDWNf()     // Catch: java.lang.Throwable -> L143
                java.lang.String r4 = QfgSZK.DCUTEI.ddSDPG.snsJDp     // Catch: java.lang.Throwable -> L143
                r5 = 1
                java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L143
                QfgSZK.DcMfJK$fNLfdT r6 = r10.sadatZ     // Catch: java.lang.Throwable -> L143
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L143
                r7 = 0
                r5[r7] = r6     // Catch: java.lang.Throwable -> L143
                QfgSZK.FQMcgE.OijiEz(r3, r4, r5)     // Catch: java.lang.Throwable -> L143
                QfgSZK.SaJVGb r3 = r10.mWudO     // Catch: java.lang.Throwable -> L143
                r4 = r3
                QfgSZK.OUcgGI r4 = (QfgSZK.OUcgGI) r4     // Catch: java.lang.Throwable -> L143
                QfgSZK.ZqidTP r3 = r10.zEdbMC     // Catch: java.lang.Throwable -> L143
                android.content.Context r5 = r3.Umbazn     // Catch: java.lang.Throwable -> L143
                boolean r6 = r10.fMSVAf     // Catch: java.lang.Throwable -> L143
                long r7 = r10.iOIrNX     // Catch: java.lang.Throwable -> L143
                int r9 = r10.Qufecd     // Catch: java.lang.Throwable -> L143
                r4.spnCvw(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L143
                java.lang.String r3 = QfgSZK.DCUTEI.RKDWNf()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = QfgSZK.DCUTEI.ddSDPG.hWAIun
                r4.append(r5)
                QfgSZK.DcMfJK$fNLfdT r5 = r10.sadatZ
                r4.append(r5)
                java.lang.String r5 = QfgSZK.DCUTEI.ddSDPG.sjMgxz
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                QfgSZK.FQMcgE.fQMcgE.sIqKDg(r3, r4)
                QfgSZK.OmYuqg r3 = r10.fOmeTO
                r3.aChkwz()
                com.lexisnexisrisk.threatmetrix.TMXScanEndNotifier r3 = r10.ODJnDd
                if (r3 == 0) goto L1ed
                r3.complete()     // Catch: java.lang.Throwable -> L5a
                goto L1ed
            L5a:
                r3 = move-exception
                java.lang.String r4 = QfgSZK.DCUTEI.RKDWNf()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = QfgSZK.DCUTEI.ddSDPG.OczcNd
                r5.append(r6)
                java.lang.String r6 = r3.toString()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                QfgSZK.FQMcgE.svhCHd(r4, r5)
                QfgSZK.ORrpqH r4 = QfgSZK.ORrpqH.uzCIH()
                r4.seuMaA(r3)
                int r3 = QfgSZK.DCUTEI.ddSDPG.fAH
                r4 = 2191(0x88f, float:3.07E-42)
                if (r3 > r4) goto L1ed
            L84:
                int r3 = QfgSZK.DCUTEI.ddSDPG.fAH
                int r4 = r3 + 13
                r5 = 23
                if (r4 == r5) goto L11a
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 == r5) goto La0
                r5 = 211(0xd3, float:2.96E-43)
                if (r4 == r5) goto Ld9
                r5 = 249(0xf9, float:3.49E-43)
                if (r4 == r5) goto L99
                goto L84
            L99:
                int r3 = r3 * 96
                r3 = r3 ^ 1109(0x455, float:1.554E-42)
                QfgSZK.DCUTEI.ddSDPG.fAH = r3
                goto L84
            La0:
                int r2 = QfgSZK.DCUTEI.ddSDPG.fAH
                int r2 = r2 >> 65
                int r2 = r2 * 3
                QfgSZK.DCUTEI.ddSDPG.fAH = r2
                int r2 = QfgSZK.DCUTEI.ddSDPG.hxI
                r2 = r2 ^ 7771(0x1e5b, float:1.089E-41)
                if (r2 == 0) goto Ld9
            Lae:
                int r2 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r3 = r2 + 78
                if (r3 == r0) goto Ld1
                r4 = 72
                if (r3 == r4) goto Lc5
                if (r3 == r1) goto Lbf
                r4 = 267(0x10b, float:3.74E-43)
                if (r3 == r4) goto Lc9
                goto Lae
            Lbf:
                int r3 = r2 + r2
                int r3 = r3 + r2
                QfgSZK.DCUTEI.ddSDPG.hxI = r3
                goto Ld1
            Lc5:
                int r0 = r2 >> 96
            Lc7:
                QfgSZK.DCUTEI.ddSDPG.hxI = r0
            Lc9:
                int r0 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r0 = r0 + r2
                int r0 = r0 % 109
                int r0 = r0 >> 93
                goto Lc7
            Ld1:
                int r2 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r2 = r2 >> 19
                int r2 = r2 % 42
                QfgSZK.DCUTEI.ddSDPG.hxI = r2
            Ld9:
                int r2 = QfgSZK.DCUTEI.ddSDPG.fAH
                int r2 = r2 % 21
                r2 = r2 ^ 999(0x3e7, float:1.4E-42)
                QfgSZK.DCUTEI.ddSDPG.fAH = r2
                int r2 = QfgSZK.DCUTEI.ddSDPG.hxI
                r2 = r2 ^ 7771(0x1e5b, float:1.089E-41)
                if (r2 == 0) goto La0
            Le7:
                int r0 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r1 = r0 + 65
                r2 = 22
                if (r1 == r2) goto L10a
                r3 = 159(0x9f, float:2.23E-43)
                if (r1 == r3) goto L111
                r3 = 185(0xb9, float:2.59E-43)
                if (r1 == r3) goto L101
                r3 = 361(0x169, float:5.06E-43)
                if (r1 == r3) goto Lfc
                goto Le7
            Lfc:
                int r0 = r0 + r0
                int r0 = r0 >> r2
                r0 = r0 ^ 5295(0x14af, float:7.42E-42)
                goto L107
            L101:
                int r0 = QfgSZK.DCUTEI.ddSDPG.hxI
                r1 = 716720(0xaefb0, float:1.004339E-39)
                int r0 = r0 * r1
            L107:
                QfgSZK.DCUTEI.ddSDPG.hxI = r0
                goto L101
            L10a:
                int r1 = r0 % 53
                int r1 = r1 % 46
                int r1 = r1 + r0
                QfgSZK.DCUTEI.ddSDPG.hxI = r1
            L111:
                int r0 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r0 = r0 >> 78
                r0 = r0 ^ 5364(0x14f4, float:7.517E-42)
                QfgSZK.DCUTEI.ddSDPG.hxI = r0
                goto Le7
            L11a:
                int r4 = r3 * 45
                int r4 = r4 % 102
                int r4 = r4 + r3
                QfgSZK.DCUTEI.ddSDPG.fAH = r4
                int r3 = QfgSZK.DCUTEI.ddSDPG.hxI
                if (r3 > r2) goto L84
            L125:
                int r3 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r4 = r3 + 26
                r5 = 26
                if (r4 == r5) goto L132
                r3 = 119(0x77, float:1.67E-43)
                if (r4 == r3) goto L137
                goto L125
            L132:
                int r4 = r3 * 126
                int r4 = r4 + r3
                QfgSZK.DCUTEI.ddSDPG.hxI = r4
            L137:
                int r3 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r3 = r3 >> 46
                int r3 = r3 % 43
                int r3 = r3 >> 59
                QfgSZK.DCUTEI.ddSDPG.hxI = r3
                goto L84
            L143:
                r3 = move-exception
                java.lang.String r4 = QfgSZK.DCUTEI.RKDWNf()     // Catch: java.lang.Throwable -> L1ee
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ee
                r5.<init>()     // Catch: java.lang.Throwable -> L1ee
                java.lang.String r6 = QfgSZK.DCUTEI.ddSDPG.fkSBvT     // Catch: java.lang.Throwable -> L1ee
                r5.append(r6)     // Catch: java.lang.Throwable -> L1ee
                java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L1ee
                r5.append(r6)     // Catch: java.lang.Throwable -> L1ee
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1ee
                QfgSZK.FQMcgE.fQMcgE.svhCHd(r4, r5)     // Catch: java.lang.Throwable -> L1ee
                QfgSZK.ORrpqH r4 = QfgSZK.ORrpqH.uzCIH()     // Catch: java.lang.Throwable -> L1ee
                r4.seuMaA(r3)     // Catch: java.lang.Throwable -> L1ee
                java.lang.String r3 = QfgSZK.DCUTEI.RKDWNf()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = QfgSZK.DCUTEI.ddSDPG.hWAIun
                r4.append(r5)
                QfgSZK.DcMfJK$fNLfdT r5 = r10.sadatZ
                r4.append(r5)
                java.lang.String r5 = QfgSZK.DCUTEI.ddSDPG.sjMgxz
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                QfgSZK.FQMcgE.fQMcgE.sIqKDg(r3, r4)
                QfgSZK.OmYuqg r3 = r10.fOmeTO
                r3.aChkwz()
                com.lexisnexisrisk.threatmetrix.TMXScanEndNotifier r3 = r10.ODJnDd
                if (r3 == 0) goto L1ed
                r3.complete()     // Catch: java.lang.Throwable -> L193
                goto L1ed
            L193:
                r3 = move-exception
                java.lang.String r4 = QfgSZK.DCUTEI.RKDWNf()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = QfgSZK.DCUTEI.ddSDPG.OczcNd
                r5.append(r6)
                java.lang.String r6 = r3.toString()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                QfgSZK.FQMcgE.svhCHd(r4, r5)
                QfgSZK.ORrpqH r4 = QfgSZK.ORrpqH.uzCIH()
                r4.seuMaA(r3)
                int r3 = QfgSZK.DCUTEI.ddSDPG.hxI
                if (r3 > r2) goto L1ed
            L1bb:
                int r2 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r3 = r2 + 13
                r4 = 36
                if (r3 == r4) goto L1e4
                if (r3 == r1) goto L1de
                r4 = 161(0xa1, float:2.26E-43)
                if (r3 == r4) goto L1d4
                r4 = 313(0x139, float:4.39E-43)
                if (r3 == r4) goto L1ce
                goto L1bb
            L1ce:
                int r0 = r2 + r2
                int r0 = r0 + r2
                QfgSZK.DCUTEI.ddSDPG.hxI = r0
                goto L1de
            L1d4:
                int r1 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r1 = r1 >> r0
                int r1 = r1 % 30
                r1 = r1 ^ 2034(0x7f2, float:2.85E-42)
                QfgSZK.DCUTEI.ddSDPG.hxI = r1
                goto L1d4
            L1de:
                int r0 = QfgSZK.DCUTEI.ddSDPG.hxI
                int r0 = r0 * 62
                int r0 = r0 + r2
                goto L1ea
            L1e4:
                int r0 = QfgSZK.DCUTEI.ddSDPG.hxI
                r0 = r0 ^ 3418(0xd5a, float:4.79E-42)
                int r0 = r0 >> 84
            L1ea:
                QfgSZK.DCUTEI.ddSDPG.hxI = r0
                goto L1e4
            L1ed:
                return
            L1ee:
                r0 = move-exception
                java.lang.String r1 = QfgSZK.DCUTEI.RKDWNf()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = QfgSZK.DCUTEI.ddSDPG.hWAIun
                r2.append(r3)
                QfgSZK.DcMfJK$fNLfdT r3 = r10.sadatZ
                r2.append(r3)
                java.lang.String r3 = QfgSZK.DCUTEI.ddSDPG.sjMgxz
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                QfgSZK.FQMcgE.fQMcgE.sIqKDg(r1, r2)
                QfgSZK.OmYuqg r1 = r10.fOmeTO
                r1.aChkwz()
                com.lexisnexisrisk.threatmetrix.TMXScanEndNotifier r1 = r10.ODJnDd
                if (r1 == 0) goto L23f
                r1.complete()     // Catch: java.lang.Throwable -> L21b
                goto L23f
            L21b:
                r1 = move-exception
                java.lang.String r2 = QfgSZK.DCUTEI.RKDWNf()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = QfgSZK.DCUTEI.ddSDPG.OczcNd
                r3.append(r4)
                java.lang.String r4 = r1.toString()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                QfgSZK.FQMcgE.svhCHd(r2, r3)
                QfgSZK.ORrpqH r2 = QfgSZK.ORrpqH.uzCIH()
                r2.seuMaA(r1)
            L23f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.ddSDPG.run():void");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        CVC = 5466;
        zWr = 2633;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        hmmPXQ = GCXiNH.fsw("%?\u000b!\u0013\t");
        zwTtMx = GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\SpnfW@`jl");
        UGNXTk = GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019Rh|spnfW@`jliffisv`z}\u007fc!JPDKhv~~kLKC^a@^gFYEJHT");
        aedxwm = GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\Bwuh[B}mhk}ahx");
        gbZFSe = GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\AgiaHEfWni");
        gbKuDA = GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\Ggwi]IZah\u007f{aso]qr~ex");
        hWBAcA = GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\PgosQ^z");
        DgJUQc = GCXiNH.fsw("~~Uj");
        iLtUbY = GCXiNH.fsw("odU");
        DpvvQs = GCXiNH.fsw("rw]");
        QEdNDr = GCXiNH.fsw("t\u007fO");
        zxXNZZ = DateFormat.ABBR_GENERIC_TZ;
        DlIaRS = FQMcgE.hfdhUn(DCUTEI.class);
        HashMap map = new HashMap();
        spUnqd = map;
        QwNZnX = new HashMap();
        HashMap map2 = new HashMap();
        gcJYRw = map2;
        map.put(GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs"), 1L);
        map.put(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"), 2L);
        map.put(GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"), 4L);
        map.put(GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg"), 8L);
        map2.put(GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\SpnfW@`jl"), GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}u"));
        map2.put(GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019Rh|spnfW@`jliffisv`z}\u007fc!JPDKhv~~kLKC^a@^gFYEJHT"), GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}uns`psyxnpwyu"));
        map2.put(GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\Bwuh[B}mhk}ahx"), GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs"));
        map2.put(GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\AgiaHEfWni"), GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        map2.put(GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\Ggwi]IZah\u007f{aso]qr~ex"), GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"));
        map2.put(GCXiNH.fsw("~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019rH\\PgosQ^z"), GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:29:0x0068) to fix multi-entry loop: BACK_EDGE: B:28:0x0063 -> B:29:0x0068 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0063 A[EDGE_INSN: B:85:0x0063->B:89:? BREAK  A[LOOP:4: B:22:0x0050->B:88:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, Object> OBJEWx(String str, Context context, TMXConfig tMXConfig) {
        byte b;
        int i;
        int i2;
        HashMap map = new HashMap();
        int iHashCode = str.hashCode();
        if (iHashCode != -1951042291) {
            if (iHashCode != -96285750) {
                b = (iHashCode == 1026190327 && str.equals(GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"))) ? (byte) 2 : (byte) -1;
            } else if (str.equals(GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs"))) {
                if (CVC > 5465) {
                    b = 1;
                }
                while (true) {
                    i = CVC;
                    i2 = i + 13;
                    if (i2 != 42) {
                        if (i2 == 88) {
                            CVC = ((i + i) * 73) + i;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    CVC = (CVC + i) ^ 3284;
                }
            }
        } else if (str.equals(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"))) {
            if ((CVC ^ 5466) == 0) {
                b = 0;
            }
            while (true) {
                i = CVC;
                i2 = i + 13;
                if (i2 != 42) {
                }
            }
            while (true) {
                CVC = (CVC + i) ^ 3284;
            }
        }
        if (b == 0) {
            map.put(GCXiNH.fsw("t\u007fX`^UdzMKVJ\\@\\NSF"), tMXConfig.dMqZSI());
            map.put(GCXiNH.fsw("ppHgNUGwiDFP"), tMXConfig.gIsMnX());
            map.put(GCXiNH.fsw("nyTyGUHpfMAW`H^FEVFZBE"), Boolean.valueOf(tMXConfig.izaUzn()));
            map.put(GCXiNH.fsw("jtYJBTmzELGM^@NNSGuGFCYMKIY"), tMXConfig.DbOFhN());
            map.put(GCXiNH.fsw("hb^XJVGq~jJPcM"), Boolean.valueOf(tMXConfig.aIxqGW()));
            if ((CVC ^ 5466) != 0) {
                while (true) {
                    int i3 = CVC;
                    int i4 = i3 + 65;
                    if (i4 == 96) {
                        CVC = i3 ^ 7811;
                    } else if (i4 != 244) {
                    }
                    CVC = ((CVC * 50) % 35) ^ 3247;
                }
            }
        } else if (b == 1) {
            map.put(GCXiNH.fsw("|\u007f_~DXeHiZQJEG"), Integer.valueOf(HJWChP.RGtXKC.DKRTZD.diCPdz));
            map.put(GCXiNH.fsw("tbsmYUv\u007f~MqWXFF@\u007fqwR\\bYHP"), Boolean.valueOf(HJWChP.QdUnVm.gCNefq()));
            map.put(GCXiNH.fsw("tbsmYUv\u007f~MqWXFF@\u007fquC[\u0000\bnH\\UW[[TR"), Boolean.valueOf(HJWChP.QdUnVm.ONJgbh()));
            map.put(GCXiNH.fsw("tbsmYUv\u007f~MqWXFF@\u007fquC[\u0003\u0003nH\\UW[[TR"), Boolean.valueOf(HJWChP.QdUnVm.RWIpjU()));
            if ((zWr ^ 2633) != 0) {
                if (CVC <= 5465) {
                    while (true) {
                        int i5 = CVC;
                        int i6 = i5 + 117;
                        if (i6 == 94) {
                            break;
                        }
                        if (i6 == 287) {
                            CVC = (i5 % 39) % WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                        } else if (i6 == 318) {
                            CVC = ((i5 * 117) + i5) * 36;
                            break;
                        }
                    }
                    while (true) {
                        CVC = (CVC * 6831) >> 3;
                    }
                } else {
                    while (true) {
                        int i7 = zWr;
                        if (i7 + 65 == 52) {
                            zWr = (i7 >> 60) + i7;
                        }
                    }
                }
            }
        } else if (b == 2) {
            map.put(GCXiNH.fsw("t\u007f]cg^fyeFEp^H\\RE"), Boolean.valueOf(FQMcgE.dPkBzA()));
            map.put(GCXiNH.fsw("s~UJJE`r@GEDCGOtBT@FA"), Boolean.valueOf(FQMcgE.UfveVb()));
            map.put(GCXiNH.fsw("|\u007f_~DXeHiZQJEG"), Integer.valueOf(HJWChP.RGtXKC.DKRTZD.diCPdz));
            map.put(GCXiNH.fsw("~pUOJ]mYi\\kMY]IKZPPrBA\\F]\\HRUWK"), Boolean.valueOf(new HJWChP.OZOJIj(context).DjwCMv()));
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> ArrayList<T> QHmsKR(Iterator<T> it, Class cls) {
        int i;
        int i2;
        if (it == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        while (it.hasNext()) {
            try {
                T next = it.next();
                if (next instanceof TMXModuleMetadataProviderInterface) {
                    String moduleVersion = ((TMXModuleMetadataProviderInterface) next).getModuleVersion();
                    if (dmfpNf(GCXiNH.fsw("%?\u000b!\u0013\t"), moduleVersion)) {
                        arrayList.add(next);
                    } else {
                        String str = gcJYRw.get(next.getClass().getName());
                        if (str != null) {
                            QwNZnX.put(str, DateFormat.ABBR_GENERIC_TZ + moduleVersion);
                        }
                        FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("p~_yGT!eq\bTFXZAHX\u0015YZA\\Q[]U\u0014^BI]TR``#y|,\u001eMjp~ke(|k<"), next.getClass().getSimpleName(), GCXiNH.fsw("%?\u000b!\u0013\t"), moduleVersion);
                    }
                }
            } catch (SecurityException | ServiceConfigurationError e) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bNLKM\bJYQA_W\u0011\u0018TC\u0014\u0006\u001bAD"), cls.getSimpleName(), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
                if ((CVC ^ 5466) != 0) {
                    while (true) {
                        int i3 = CVC;
                        int i4 = i3 + 78;
                        if (i4 == 19) {
                            while (true) {
                                CVC = (CVC * WalletImportError.ERROR_CODE_AA_EXIST) % 95;
                            }
                        } else {
                            if (i4 == 154) {
                                i2 = (i3 * 11) ^ 2123;
                                break;
                            }
                            if (i4 == 180) {
                                i2 = i3 ^ 6764;
                                break;
                            }
                        }
                    }
                    CVC = i2;
                } else {
                    continue;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if ((zWr ^ 2633) == 0) {
            return null;
        }
        if (CVC <= 5465) {
            while (CVC + 117 != 61) {
            }
            while (true) {
                CVC >>= AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
            }
        } else {
            do {
                i = zWr;
            } while (i + 104 != 70);
            while (true) {
                zWr = (zWr * 80) + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 61 out of bounds for length 42
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:93)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
     */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static boolean QSBOWP(java.lang.String r8, QfgSZK.SaJVGb r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            int r1 = r8.hashCode()
            r2 = 2
            r3 = 11
            r4 = 1
            r5 = 3
            r6 = 2632(0xa48, float:3.688E-42)
            r7 = 5465(0x1559, float:7.658E-42)
            switch(r1) {
                case -1951042291: goto L9f;
                case -1393351993: goto L90;
                case -96285750: goto L7c;
                case 1026190327: goto L16;
                default: goto L14;
            }
        L14:
            goto L114
        L16:
            java.lang.String r1 = "P^\u007fYgt^JUxg|nl~nupk`wre}wie"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            boolean r8 = r8.equals(r1)
            int r1 = QfgSZK.DCUTEI.CVC
            if (r1 > r7) goto L52
        L24:
            int r8 = QfgSZK.DCUTEI.CVC
            int r9 = r8 + 117
            r0 = 26
            if (r9 == r0) goto L3e
            r0 = 131(0x83, float:1.84E-43)
            if (r9 == r0) goto L39
            r0 = 203(0xcb, float:2.84E-43)
            if (r9 == r0) goto L4a
            r0 = 381(0x17d, float:5.34E-43)
            if (r9 == r0) goto L44
            goto L24
        L39:
            int r9 = r8 * 3572
            int r9 = r9 >> 71
            goto L42
        L3e:
            int r9 = r8 >> 28
            r9 = r9 ^ 2724(0xaa4, float:3.817E-42)
        L42:
            QfgSZK.DCUTEI.CVC = r9
        L44:
            int r9 = QfgSZK.DCUTEI.CVC
            int r9 = r9 >> 126
            QfgSZK.DCUTEI.CVC = r9
        L4a:
            int r9 = QfgSZK.DCUTEI.CVC
            int r9 = r9 + r8
            int r9 = r9 % 111
            QfgSZK.DCUTEI.CVC = r9
            goto L24
        L52:
            if (r8 == 0) goto L114
            int r8 = QfgSZK.DCUTEI.zWr
            r1 = r1 ^ 5466(0x155a, float:7.66E-42)
            if (r1 == 0) goto L74
        L5a:
            int r8 = QfgSZK.DCUTEI.CVC
            int r9 = r8 + 195
            if (r9 == r3) goto L6e
            r8 = 102(0x66, float:1.43E-43)
            if (r9 == r8) goto L65
            goto L5a
        L65:
            int r8 = QfgSZK.DCUTEI.CVC
            int r8 = r8 >> 17
            r8 = r8 ^ 3354(0xd1a, float:4.7E-42)
            QfgSZK.DCUTEI.CVC = r8
            goto L65
        L6e:
            int r9 = r8 % 15
            int r9 = r9 + r8
            QfgSZK.DCUTEI.CVC = r9
            goto L5a
        L74:
            r8 = r8 ^ 2633(0xa49, float:3.69E-42)
            if (r8 == 0) goto L79
            goto Lc7
        L79:
            r8 = r2
            goto L115
        L7c:
            java.lang.String r1 = "P^\u007fYgt^JUxg|k||os{`zqpdfqs"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L114
            int r8 = QfgSZK.DCUTEI.zWr
            if (r8 > r6) goto L8d
            goto Lc7
        L8d:
            r8 = r0
            goto L115
        L90:
            java.lang.String r1 = "P^\u007fYgt^JUxg|ylftygg"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L114
            r8 = r5
            goto L115
        L9f:
            java.lang.String r1 = "P^\u007fYgt^JUxg|h`gjsafzqb"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L114
            int r8 = QfgSZK.DCUTEI.zWr
            if (r8 > r6) goto L112
            int r8 = QfgSZK.DCUTEI.CVC
            if (r8 > r7) goto Lc7
        Lb3:
            int r8 = QfgSZK.DCUTEI.CVC
            int r8 = r8 + 104
            r9 = 51
            if (r8 == r9) goto Lbc
            goto Lb3
        Lbc:
            int r8 = QfgSZK.DCUTEI.CVC
            r8 = r8 ^ 3843(0xf03, float:5.385E-42)
            int r8 = r8 >> 112
            int r8 = r8 % 73
            QfgSZK.DCUTEI.CVC = r8
            goto Lbc
        Lc7:
            int r8 = QfgSZK.DCUTEI.zWr
            int r9 = r8 + 26
            r0 = 62
            if (r9 == r0) goto Ld0
            goto Lc7
        Ld0:
            int r9 = QfgSZK.DCUTEI.zWr
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r7) goto L10a
        Ld6:
            int r8 = QfgSZK.DCUTEI.CVC
            int r9 = r8 + 247
            r0 = 52
            if (r9 == r0) goto Lfa
            r0 = 113(0x71, float:1.58E-43)
            if (r9 == r0) goto L101
            r0 = 184(0xb8, float:2.58E-43)
            if (r9 == r0) goto Leb
            r0 = 332(0x14c, float:4.65E-43)
            if (r9 == r0) goto Lf1
            goto Ld6
        Leb:
            int r9 = r8 + r8
            r9 = r9 ^ 1475(0x5c3, float:2.067E-42)
            QfgSZK.DCUTEI.CVC = r9
        Lf1:
            int r9 = QfgSZK.DCUTEI.CVC
            int r9 = r9 * 78
            r9 = r9 ^ 4813(0x12cd, float:6.744E-42)
            int r9 = r9 + r8
            QfgSZK.DCUTEI.CVC = r9
        Lfa:
            int r9 = QfgSZK.DCUTEI.CVC
            int r9 = r9 + r8
            int r9 = r9 * r3
            int r9 = r9 + r8
            QfgSZK.DCUTEI.CVC = r9
        L101:
            int r8 = QfgSZK.DCUTEI.CVC
            int r8 = r8 * 101
            int r8 = r8 >> 63
            QfgSZK.DCUTEI.CVC = r8
            goto Ld6
        L10a:
            int r9 = r9 * 105
            r9 = r9 ^ 4731(0x127b, float:6.63E-42)
            int r9 = r9 + r8
            QfgSZK.DCUTEI.zWr = r9
            goto Ld0
        L112:
            r8 = r4
            goto L115
        L114:
            r8 = -1
        L115:
            if (r8 == 0) goto L127
            if (r8 == r4) goto L124
            if (r8 == r2) goto L121
            if (r8 == r5) goto L11e
            return r0
        L11e:
            boolean r8 = r9 instanceof QfgSZK.IYdWPz
            return r8
        L121:
            boolean r8 = r9 instanceof QfgSZK.OUcgGI
            return r8
        L124:
            boolean r8 = r9 instanceof QfgSZK.DLGVGj
            return r8
        L127:
            boolean r8 = r9 instanceof QfgSZK.OAjjVP
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.QSBOWP(java.lang.String, QfgSZK.SaJVGb):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x0047) to fix multi-entry loop: BACK_EDGE: B:16:0x003f -> B:17:0x0047 */
    /* JADX DEBUG: Duplicate block (B:47:0x00a6) to fix multi-entry loop: BACK_EDGE: B:47:0x00a6 -> B:48:0x00a8 */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static QfgSZK.SaJVGb QkdxfA(java.lang.String r10, java.lang.Object r11, java.lang.String r12) {
        /*
            int r0 = r10.hashCode()
            r1 = 88
            r2 = 2632(0xa48, float:3.688E-42)
            r3 = 63
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 5465(0x1559, float:7.658E-42)
            switch(r0) {
                case -1951042291: goto Lc6;
                case -1393351993: goto Lb7;
                case -96285750: goto L5b;
                case 1026190327: goto L14;
                default: goto L12;
            }
        L12:
            goto L1bc
        L14:
            java.lang.String r0 = "P^\u007fYgt^JUxg|nl~nupk`wre}wie"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r10 = r10.equals(r0)
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r7) goto L4a
        L22:
            int r10 = QfgSZK.DCUTEI.CVC
            int r11 = r10 + 104
            r12 = 64
            if (r11 == r12) goto L3f
            r12 = 181(0xb5, float:2.54E-43)
            if (r11 == r12) goto L3b
            r12 = 369(0x171, float:5.17E-43)
            if (r11 == r12) goto L33
            goto L22
        L33:
            int r11 = QfgSZK.DCUTEI.CVC
            int r11 = r11 >> 79
            int r11 = r11 + r10
            QfgSZK.DCUTEI.CVC = r11
            goto L33
        L3b:
            int r10 = r10 + r10
            r10 = r10 ^ 558(0x22e, float:7.82E-43)
            goto L47
        L3f:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 % 19
            int r10 = r10 * 51
            int r10 = r10 >> 95
        L47:
            QfgSZK.DCUTEI.CVC = r10
            goto L3f
        L4a:
            if (r10 == 0) goto L1bc
            int r10 = QfgSZK.DCUTEI.zWr
            r10 = r10 ^ 2633(0xa49, float:3.69E-42)
            if (r10 == 0) goto L58
            if (r0 > r7) goto L55
            goto L93
        L55:
            r0 = r5
            goto L17f
        L58:
            r0 = r5
            goto L1bd
        L5b:
            java.lang.String r0 = "P^\u007fYgt^JUxg|k||os{`zqpdfqs"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r10 = r10.equals(r0)
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L88
        L6b:
            int r0 = QfgSZK.DCUTEI.CVC
            int r8 = r0 + 78
            r9 = 69
            if (r8 == r9) goto L81
            r0 = 224(0xe0, float:3.14E-43)
            if (r8 == r0) goto L78
            goto L6b
        L78:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 % 43
            int r10 = r10 >> 19
            QfgSZK.DCUTEI.CVC = r10
            goto L78
        L81:
            int r8 = r0 * 97
            int r8 = r8 + r0
            int r8 = r8 * 15
            QfgSZK.DCUTEI.CVC = r8
        L88:
            if (r10 == 0) goto L1bc
            int r10 = QfgSZK.DCUTEI.zWr
            r0 = 0
            if (r10 > r2) goto L1bd
            int r10 = QfgSZK.DCUTEI.CVC
            if (r10 > r7) goto L17f
        L93:
            int r10 = QfgSZK.DCUTEI.CVC
            int r11 = r10 + 182
            if (r11 == r3) goto Lad
            r12 = 106(0x6a, float:1.49E-43)
            if (r11 == r12) goto La2
            r12 = 212(0xd4, float:2.97E-43)
            if (r11 == r12) goto La8
            goto L93
        La2:
            int r11 = r10 + r10
            r11 = r11 ^ 5422(0x152e, float:7.598E-42)
        La6:
            QfgSZK.DCUTEI.CVC = r11
        La8:
            int r11 = QfgSZK.DCUTEI.CVC
            int r11 = r11 + r10
            int r11 = r11 + r10
            goto La6
        Lad:
            int r11 = QfgSZK.DCUTEI.CVC
            r11 = r11 ^ 5201(0x1451, float:7.288E-42)
            int r11 = r11 >> 99
            int r11 = r11 + r10
            QfgSZK.DCUTEI.CVC = r11
            goto Lad
        Lb7:
            java.lang.String r0 = "P^\u007fYgt^JUxg|ylftygg"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L1bc
            r0 = r4
            goto L1bd
        Lc6:
            java.lang.String r0 = "P^\u007fYgt^JUxg|h`gjsafzqb"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r10 = r10.equals(r0)
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r7) goto Lf1
        Ld4:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 + 91
            r11 = 50
            if (r10 == r11) goto Le8
            if (r10 == r3) goto Ldf
            goto Ld4
        Ldf:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 >> 57
            r10 = r10 ^ 927(0x39f, float:1.299E-42)
            QfgSZK.DCUTEI.CVC = r10
            goto Ldf
        Le8:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 % 85
            int r10 = r10 >> 118
            QfgSZK.DCUTEI.CVC = r10
            goto Le8
        Lf1:
            int r3 = QfgSZK.DCUTEI.zWr
            r7 = r3 ^ 2633(0xa49, float:3.69E-42)
            if (r7 == 0) goto L17a
            r10 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r10 == 0) goto L12d
        Lfb:
            int r10 = QfgSZK.DCUTEI.CVC
            int r11 = r10 + 195
            r12 = 31
            if (r11 == r12) goto L11b
            r12 = 143(0x8f, float:2.0E-43)
            if (r11 == r12) goto L115
            r12 = 152(0x98, float:2.13E-43)
            if (r11 == r12) goto L124
            r12 = 276(0x114, float:3.87E-43)
            if (r11 == r12) goto L110
            goto Lfb
        L110:
            r11 = 208(0xd0, float:2.91E-43)
            int r11 = r10 >> r11
            goto L122
        L115:
            r11 = r10 ^ 5626(0x15fa, float:7.884E-42)
            int r11 = r11 >> 26
            QfgSZK.DCUTEI.CVC = r11
        L11b:
            int r11 = QfgSZK.DCUTEI.CVC
            int r11 = r11 + r10
            r11 = r11 ^ 4169(0x1049, float:5.842E-42)
            int r11 = r11 * 110
        L122:
            QfgSZK.DCUTEI.CVC = r11
        L124:
            int r11 = QfgSZK.DCUTEI.CVC
            int r11 = r11 + r10
            r11 = r11 ^ 5042(0x13b2, float:7.065E-42)
            int r11 = r11 + r10
            QfgSZK.DCUTEI.CVC = r11
            goto Lfb
        L12d:
            int r0 = QfgSZK.DCUTEI.zWr
            int r10 = r0 + 143
            r11 = 78
            if (r10 == r11) goto L144
            r11 = 174(0xae, float:2.44E-43)
            if (r10 == r11) goto L13a
            goto L12d
        L13a:
            int r10 = QfgSZK.DCUTEI.zWr
            r10 = r10 ^ 4049(0xfd1, float:5.674E-42)
            int r10 = r10 + r0
            r10 = r10 ^ 3357(0xd1d, float:4.704E-42)
            QfgSZK.DCUTEI.zWr = r10
            goto L13a
        L144:
            int r10 = QfgSZK.DCUTEI.zWr
            int r10 = r10 + r0
            int r10 = r10 * 27
            QfgSZK.DCUTEI.zWr = r10
            int r10 = QfgSZK.DCUTEI.CVC
            r10 = r10 ^ 5466(0x155a, float:7.66E-42)
            if (r10 == 0) goto L144
        L151:
            int r10 = QfgSZK.DCUTEI.CVC
            int r11 = r10 + 208
            if (r11 == r1) goto L171
            r12 = 182(0xb6, float:2.55E-43)
            if (r11 == r12) goto L166
            r12 = 356(0x164, float:4.99E-43)
            if (r11 == r12) goto L160
            goto L151
        L160:
            int r10 = r10 * 46
            int r10 = r10 % 42
            QfgSZK.DCUTEI.CVC = r10
        L166:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 * 60
            int r10 = r10 % 95
            int r10 = r10 * 40
            QfgSZK.DCUTEI.CVC = r10
            goto L144
        L171:
            int r10 = QfgSZK.DCUTEI.CVC
            int r10 = r10 % 16
            r10 = r10 ^ 2308(0x904, float:3.234E-42)
            QfgSZK.DCUTEI.CVC = r10
            goto L171
        L17a:
            if (r10 == 0) goto L1bc
            r0 = r6
            if (r3 > r2) goto L1bd
        L17f:
            int r10 = QfgSZK.DCUTEI.zWr
            int r2 = r10 + 13
            r3 = 24
            if (r2 == r3) goto L194
            r3 = 193(0xc1, float:2.7E-43)
            if (r2 == r3) goto L18c
            goto L17f
        L18c:
            int r2 = r10 >> 45
            int r2 = r2 + r10
            int r10 = r2 >> 21
            QfgSZK.DCUTEI.zWr = r10
            goto L17f
        L194:
            int r10 = r10 >> r1
            int r10 = r10 % 72
            r10 = r10 ^ 1888(0x760, float:2.646E-42)
            QfgSZK.DCUTEI.zWr = r10
            int r10 = QfgSZK.DCUTEI.CVC
            r10 = r10 ^ 5466(0x155a, float:7.66E-42)
            if (r10 == 0) goto L1bd
        L1a1:
            int r10 = QfgSZK.DCUTEI.CVC
            int r1 = r10 + 13
            r2 = 52
            if (r1 == r2) goto L1b5
            r2 = 168(0xa8, float:2.35E-43)
            if (r1 == r2) goto L1ae
            goto L1a1
        L1ae:
            r1 = r10 ^ 3637(0xe35, float:5.097E-42)
            int r1 = r1 + r10
            int r1 = r1 + r10
            QfgSZK.DCUTEI.CVC = r1
            goto L1bd
        L1b5:
            int r10 = r10 >> 27
            int r10 = r10 % 28
            QfgSZK.DCUTEI.CVC = r10
            goto L1a1
        L1bc:
            r0 = -1
        L1bd:
            if (r0 == 0) goto L1d9
            if (r0 == r6) goto L1d3
            if (r0 == r5) goto L1cd
            if (r0 == r4) goto L1c7
            r10 = 0
            return r10
        L1c7:
            QfgSZK.IYdWPz r10 = new QfgSZK.IYdWPz
            r10.<init>(r11, r12)
            return r10
        L1cd:
            QfgSZK.OUcgGI r10 = new QfgSZK.OUcgGI
            r10.<init>(r11, r12)
            return r10
        L1d3:
            QfgSZK.DLGVGj r10 = new QfgSZK.DLGVGj
            r10.<init>(r11, r12)
            return r10
        L1d9:
            QfgSZK.OAjjVP r10 = new QfgSZK.OAjjVP
            r10.<init>(r11, r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.QkdxfA(java.lang.String, java.lang.Object, java.lang.String):QfgSZK.SaJVGb");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:49:0x00b5) to fix multi-entry loop: BACK_EDGE: B:48:0x00ae -> B:49:0x00b5 */
    /* JADX DEBUG: Duplicate block (B:76:0x012b) to fix multi-entry loop: BACK_EDGE: B:76:0x012b -> B:77:0x012d */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de A[LOOP:12: B:55:0x00de->B:141:0x00de, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101 A[LOOP:10: B:64:0x0101->B:136:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141 A[LOOP:14: B:80:0x0141->B:149:0x0141, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00dc -> B:62:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void RdAHlO(com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface r6) {
        /*
            if (r6 == 0) goto L171
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = "~~V\"GTyw\u007fFG[CZZNE^\u001aGZCUNJPYOHP@\u0019Rh|spnfW@`jliffisv`z}\u007fc!JPDKhv~~kLKC^a@^gFYEJHT"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            int r1 = QfgSZK.DCUTEI.CVC
            r1 = r1 ^ 5466(0x155a, float:7.66E-42)
            r2 = 99
            if (r1 == 0) goto L34
        L18:
            int r6 = QfgSZK.DCUTEI.CVC
            int r0 = r6 + 26
            r1 = 86
            if (r0 == r1) goto L2d
            if (r0 == r2) goto L23
            goto L18
        L23:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 % 74
            r0 = r0 ^ 3267(0xcc3, float:4.578E-42)
            int r0 = r0 + r6
            QfgSZK.DCUTEI.CVC = r0
            goto L23
        L2d:
            int r6 = r6 >> 123
            int r6 = r6 * 58
            QfgSZK.DCUTEI.CVC = r6
            goto L18
        L34:
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L171
            int r6 = QfgSZK.DCUTEI.zWr
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L54
        L42:
            int r6 = QfgSZK.DCUTEI.CVC
            int r6 = r6 + 195
            r0 = 62
            if (r6 == r0) goto L4b
            goto L42
        L4b:
            int r6 = QfgSZK.DCUTEI.CVC
            r6 = r6 ^ 4091(0xffb, float:5.733E-42)
            int r6 = r6 % 102
            QfgSZK.DCUTEI.CVC = r6
            goto L4b
        L54:
            r6 = r6 ^ 2633(0xa49, float:3.69E-42)
            if (r6 == 0) goto L16f
            if (r0 == 0) goto L6e
        L5a:
            int r6 = QfgSZK.DCUTEI.CVC
            int r6 = r6 + 65
            r0 = 72
            if (r6 == r0) goto L63
            goto L5a
        L63:
            int r6 = QfgSZK.DCUTEI.CVC
            int r6 = r6 * 31
            int r6 = r6 % 95
            int r6 = r6 % 42
            QfgSZK.DCUTEI.CVC = r6
            goto L63
        L6e:
            int r6 = QfgSZK.DCUTEI.zWr
            int r0 = r6 + 26
            r1 = 44
            r3 = 5465(0x1559, float:7.658E-42)
            if (r0 == r1) goto Lc9
            r1 = 47
            if (r0 == r1) goto Ld3
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 == r1) goto Lf9
            r1 = 250(0xfa, float:3.5E-43)
            if (r0 == r1) goto L85
            goto L6e
        L85:
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r3) goto Lc1
        L89:
            int r6 = QfgSZK.DCUTEI.CVC
            int r0 = r6 + 182
            r1 = 78
            if (r0 == r1) goto Lb8
            r1 = 275(0x113, float:3.85E-43)
            if (r0 == r1) goto Lae
            r1 = 440(0x1b8, float:6.17E-43)
            if (r0 == r1) goto La7
            r6 = 606(0x25e, float:8.49E-43)
            if (r0 == r6) goto L9e
            goto L89
        L9e:
            int r6 = QfgSZK.DCUTEI.CVC
            r6 = r6 ^ 4035(0xfc3, float:5.654E-42)
            int r6 = r6 * 20
            QfgSZK.DCUTEI.CVC = r6
            goto L9e
        La7:
            int r0 = r6 + r6
            int r0 = r0 % 50
            int r0 = r0 % 29
            goto Lb5
        Lae:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r6
            int r0 = r0 >> 109
            int r0 = r0 * 76
        Lb5:
            QfgSZK.DCUTEI.CVC = r0
            goto Lae
        Lb8:
            int r6 = r6 % 85
            int r6 = r6 * 87
            r6 = r6 ^ 3980(0xf8c, float:5.577E-42)
            QfgSZK.DCUTEI.CVC = r6
            goto L89
        Lc1:
            int r0 = r6 >> 68
            int r0 = r0 + r6
            int r0 = r0 % 122
            QfgSZK.DCUTEI.zWr = r0
            goto Lf9
        Lc9:
            int r0 = QfgSZK.DCUTEI.zWr
            int r0 = r0 >> 51
            int r0 = r0 * 69
            r0 = r0 ^ 1341(0x53d, float:1.879E-42)
            QfgSZK.DCUTEI.zWr = r0
        Ld3:
            int r0 = QfgSZK.DCUTEI.zWr
            int r0 = r0 + r6
            int r0 = r0 * 95
            QfgSZK.DCUTEI.zWr = r0
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r3) goto Lf9
        Lde:
            int r6 = QfgSZK.DCUTEI.CVC
            int r0 = r6 + 104
            r1 = 81
            if (r0 == r1) goto Lf3
            r6 = 190(0xbe, float:2.66E-43)
            if (r0 == r6) goto Leb
            goto Lde
        Leb:
            int r6 = QfgSZK.DCUTEI.CVC
            r6 = r6 ^ 3455(0xd7f, float:4.841E-42)
            int r6 = r6 % r2
            QfgSZK.DCUTEI.CVC = r6
            goto Leb
        Lf3:
            int r6 = r6 + r6
            int r6 = r6 % 104
            QfgSZK.DCUTEI.CVC = r6
            goto Lde
        Lf9:
            int r0 = QfgSZK.DCUTEI.zWr
            int r1 = QfgSZK.DCUTEI.CVC
            r1 = r1 ^ 5466(0x155a, float:7.66E-42)
            if (r1 == 0) goto L136
        L101:
            int r1 = QfgSZK.DCUTEI.CVC
            int r4 = r1 + 130
            r5 = 11
            if (r4 == r5) goto L127
            r5 = 146(0x92, float:2.05E-43)
            if (r4 == r5) goto L12d
            r5 = 311(0x137, float:4.36E-43)
            if (r4 == r5) goto L11e
            r5 = 399(0x18f, float:5.59E-43)
            if (r4 == r5) goto L116
            goto L101
        L116:
            r4 = r1 ^ 4865(0x1301, float:6.817E-42)
            int r4 = r4 >> 19
            int r4 = r4 % 123
            QfgSZK.DCUTEI.CVC = r4
        L11e:
            int r4 = QfgSZK.DCUTEI.CVC
            r4 = r4 ^ 2330(0x91a, float:3.265E-42)
            int r4 = r4 + r1
            int r4 = r4 + r1
            QfgSZK.DCUTEI.CVC = r4
            goto L136
        L127:
            r6 = r1 ^ 4021(0xfb5, float:5.635E-42)
            int r6 = r6 * 5
        L12b:
            QfgSZK.DCUTEI.CVC = r6
        L12d:
            int r6 = QfgSZK.DCUTEI.CVC
            int r6 = r6 % 3
            int r6 = r6 % 65
            r6 = r6 ^ 3162(0xc5a, float:4.431E-42)
            goto L12b
        L136:
            r0 = r0 ^ 3168(0xc60, float:4.44E-42)
            int r0 = r0 >> 70
            int r0 = r0 + r6
            QfgSZK.DCUTEI.zWr = r0
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r3) goto Lc9
        L141:
            int r6 = QfgSZK.DCUTEI.CVC
            int r0 = r6 + 78
            r1 = 7
            if (r0 == r1) goto L160
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == r1) goto L15a
            r1 = 220(0xdc, float:3.08E-43)
            if (r0 == r1) goto L155
            r6 = 381(0x17d, float:5.34E-43)
            if (r0 == r6) goto L166
            goto L141
        L155:
            int r6 = r6 * 79
            int r6 = r6 >> 85
            goto L164
        L15a:
            r6 = r6 ^ 3600(0xe10, float:5.045E-42)
            int r6 = r6 % 90
            QfgSZK.DCUTEI.CVC = r6
        L160:
            int r6 = QfgSZK.DCUTEI.CVC
            int r6 = r6 >> 117
        L164:
            QfgSZK.DCUTEI.CVC = r6
        L166:
            int r6 = QfgSZK.DCUTEI.CVC
            r6 = r6 ^ 2745(0xab9, float:3.847E-42)
            int r6 = r6 % 117
            QfgSZK.DCUTEI.CVC = r6
            goto L141
        L16f:
            r6 = 1
            goto L172
        L171:
            r6 = 0
        L172:
            java.util.Map<java.lang.String, java.lang.String> r0 = QfgSZK.DCUTEI.QwNZnX
            java.lang.String r1 = "P^\u007fYgt^JUxg|z{ga\u007fy}}uns`psyxnpwyu"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            if (r6 == 0) goto L17f
            java.lang.String r6 = "odU"
            goto L181
        L17f:
            java.lang.String r6 = "rw]"
        L181:
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r0.put(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.RdAHlO(com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r2 = (QfgSZK.DCUTEI.CVC ^ 4904) + r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TMXProfilingConnectionsInterface dHguZz() {
        int i;
        ArrayList arrayListGwTjWJ = gwTjWJ(TMXProfilingConnectionsInterface.class);
        if (arrayListGwTjWJ == null) {
            return null;
        }
        if (CVC <= 5465) {
            while (true) {
                i = CVC;
                int i2 = i + 26;
                if (i2 == 23) {
                    CVC = ((i >> 29) + i) * 32;
                    break;
                }
                if (i2 == 114) {
                    CVC = (i * 2210) >> 26;
                    break;
                }
                if (i2 == 163) {
                    break;
                }
                if (i2 == 357) {
                    break;
                }
            }
            int i3 = (CVC + i + i) * WalletImportError.ERROR_CODE_AA_EXIST;
            CVC = i3;
        }
        if (arrayListGwTjWJ.isEmpty()) {
            return null;
        }
        return (TMXProfilingConnectionsInterface) arrayListGwTjWJ.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean dmfpNf(String str, String str2) {
        int iIndexOf;
        int i;
        if (!UPbYzn.iSpHlg(str)) {
            if (CVC > 5465) {
                if (!UPbYzn.iSpHlg(str2) && (iIndexOf = str.indexOf(45)) > 0) {
                    return str.regionMatches(0, str2, 0, iIndexOf);
                }
                return false;
            }
            while (true) {
                int i2 = CVC;
                int i3 = i2 + 52;
                if (i3 != 60) {
                    if (i3 != 173) {
                        if (i3 == 267) {
                            CVC = (CVC + i2) * 84;
                        } else if (i3 == 397) {
                            CVC = ((i2 + i2) * WebSocketProtocol.PAYLOAD_SHORT) >> 25;
                        }
                    }
                    i = ((CVC ^ 5161) + i2) ^ 4847;
                } else {
                    i = (i2 * 82) + i2;
                }
                CVC = i;
                CVC = (CVC + i2) * 84;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static <T> ArrayList<T> gwTjWJ(Class cls) {
        try {
            dCUTEI dcutei = new dCUTEI(cls);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            ArrayList<T> arrayList = (ArrayList) executorServiceNewSingleThreadExecutor.submit(dcutei).get();
            executorServiceNewSingleThreadExecutor.shutdown();
            return arrayList;
        } catch (InterruptedException | NullPointerException | CancellationException | ExecutionException | RejectedExecutionException e) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bNLKM\bJYQA_W\u0019KR\u0017\u0007\u001c@G"), cls.getSimpleName(), e.toString());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:138:0x0202) to fix multi-entry loop: BACK_EDGE: B:137:0x01fc -> B:138:0x0202 */
    /* JADX DEBUG: Duplicate block (B:186:0x02b1) to fix multi-entry loop: BACK_EDGE: B:186:0x02b1 -> B:187:0x02b3 */
    /* JADX DEBUG: Duplicate block (B:237:0x0367) to fix multi-entry loop: BACK_EDGE: B:237:0x0367 -> B:238:0x036f */
    /* JADX DEBUG: Duplicate block (B:69:0x0110) to fix multi-entry loop: BACK_EDGE: B:68:0x010b -> B:69:0x0110 */
    /* JADX DEBUG: Duplicate block (B:71:0x0119) to fix multi-entry loop: BACK_EDGE: B:71:0x0119 -> B:72:0x011b */
    /* JADX DEBUG: Duplicate block (B:84:0x0147) to fix multi-entry loop: BACK_EDGE: B:84:0x0147 -> B:85:0x0149 */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 163 out of bounds for length 154
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:93)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x03ea -> B:246:0x0389). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cc -> B:49:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.lang.String hBpjJd(java.lang.String r15) {
        /*
            int r0 = r15.hashCode()
            r1 = 1
            r2 = 198(0xc6, float:2.77E-43)
            r3 = 99
            r4 = 52
            r5 = 9
            r6 = 220(0xdc, float:3.08E-43)
            r7 = 5
            r8 = 26
            r9 = 27
            r10 = 180(0xb4, float:2.52E-43)
            r11 = 3
            r12 = 2632(0xa48, float:3.688E-42)
            r13 = 4
            r14 = 5465(0x1559, float:7.658E-42)
            switch(r0) {
                case -1951042291: goto L3f3;
                case -1393351993: goto L33f;
                case -457744524: goto L2c9;
                case -96285750: goto L287;
                case -16047894: goto Ldf;
                case 1026190327: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L430
        L21:
            java.lang.String r0 = "P^\u007fYgt^JUxg|nl~nupk`wre}wie"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r15 = r15.equals(r0)
            int r0 = QfgSZK.DCUTEI.zWr
            int r3 = QfgSZK.DCUTEI.CVC
            r3 = r3 ^ 5466(0x155a, float:7.66E-42)
            if (r3 == 0) goto L4e
        L33:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 559
            if (r0 == r13) goto L46
            if (r0 == r2) goto L3c
            goto L33
        L3c:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 % 16
            int r0 = r0 + r15
            int r0 = r0 * 19
            QfgSZK.DCUTEI.CVC = r0
            goto L3c
        L46:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 >> 13
            int r15 = r15 * r9
            QfgSZK.DCUTEI.CVC = r15
            goto L46
        L4e:
            if (r0 > r12) goto Ld4
            if (r3 == 0) goto L65
        L52:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 169
            r1 = 84
            if (r0 == r1) goto L5b
            goto L52
        L5b:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r15
            r0 = r0 ^ 2258(0x8d2, float:3.164E-42)
            int r0 = r0 % 39
            QfgSZK.DCUTEI.CVC = r0
            goto L5b
        L65:
            int r2 = QfgSZK.DCUTEI.zWr
            int r15 = r2 + 234
            if (r15 == r4) goto L8f
            r0 = 177(0xb1, float:2.48E-43)
            if (r15 == r0) goto Lcc
            r0 = 208(0xd0, float:2.91E-43)
            if (r15 == r0) goto L74
            goto L65
        L74:
            int r15 = QfgSZK.DCUTEI.CVC
            r15 = r15 ^ 5466(0x155a, float:7.66E-42)
            if (r15 == 0) goto L8a
        L7a:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 338
            r1 = 47
            if (r0 == r1) goto L83
            goto L7a
        L83:
            r15 = r15 ^ 1098(0x44a, float:1.539E-42)
            int r15 = r15 * 82
            QfgSZK.DCUTEI.CVC = r15
            goto L7a
        L8a:
            int r15 = r2 + r2
            int r15 = r15 % 117
            goto Ld0
        L8f:
            int r15 = r2 * 37
            r15 = r15 ^ 2188(0x88c, float:3.066E-42)
            int r15 = r15 >> 14
            QfgSZK.DCUTEI.zWr = r15
            int r15 = QfgSZK.DCUTEI.CVC
            if (r15 > r14) goto Lcc
        L9b:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 312
            if (r0 == r9) goto Lc6
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto Lb7
            r1 = 364(0x16c, float:5.1E-43)
            if (r0 == r1) goto Lbc
            r15 = 416(0x1a0, float:5.83E-43)
            if (r0 == r15) goto Lae
            goto L9b
        Lae:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 % 105
            int r15 = r15 % 86
            QfgSZK.DCUTEI.CVC = r15
            goto Lae
        Lb7:
            int r0 = r15 + r15
            int r0 = r0 >> r10
            QfgSZK.DCUTEI.CVC = r0
        Lbc:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r15
            int r0 = r0 % 68
            int r15 = r0 >> 4
            QfgSZK.DCUTEI.CVC = r15
            goto L9b
        Lc6:
            int r15 = r15 * 40
            int r15 = r15 >> 93
            QfgSZK.DCUTEI.CVC = r15
        Lcc:
            int r15 = QfgSZK.DCUTEI.zWr
            int r15 = r15 >> 43
        Ld0:
            int r15 = r15 + r2
            QfgSZK.DCUTEI.zWr = r15
            goto Lcc
        Ld4:
            if (r15 == 0) goto L430
            r15 = r0 ^ 2633(0xa49, float:3.69E-42)
            if (r15 == 0) goto Ldc
            goto L32b
        Ldc:
            r15 = r13
            goto L431
        Ldf:
            java.lang.String r0 = "P^\u007fYgt^JUxg|z{ga\u007fy}}uns`psyxnpwyu"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r15 = r15.equals(r0)
            int r0 = QfgSZK.DCUTEI.zWr
            r0 = r0 ^ 2633(0xa49, float:3.69E-42)
            if (r0 == 0) goto L24f
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r14) goto L123
        Lf3:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 377
            if (r0 == r3) goto L113
            if (r0 == r6) goto L11b
            r1 = 235(0xeb, float:3.3E-43)
            if (r0 == r1) goto L10b
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 == r1) goto L104
            goto Lf3
        L104:
            int r0 = r15 >> 106
            int r0 = r0 % 81
            int r0 = r0 % 115
            goto L110
        L10b:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r15
            int r0 = r0 % 61
        L110:
            QfgSZK.DCUTEI.CVC = r0
            goto L10b
        L113:
            int r15 = r15 % 81
            r15 = r15 ^ 2868(0xb34, float:4.019E-42)
            int r15 = r15 >> 79
        L119:
            QfgSZK.DCUTEI.CVC = r15
        L11b:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 >> 102
            int r15 = r15 * 110
            int r15 = r15 % r7
            goto L119
        L123:
            int r0 = QfgSZK.DCUTEI.zWr
            int r2 = QfgSZK.DCUTEI.CVC
            r4 = r2 ^ 5466(0x155a, float:7.66E-42)
            if (r4 == 0) goto L14e
        L12b:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 611
            if (r0 == r9) goto L142
            r1 = 208(0xd0, float:2.91E-43)
            if (r0 == r1) goto L13a
            r15 = 269(0x10d, float:3.77E-43)
            if (r0 == r15) goto L149
            goto L12b
        L13a:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r15
            int r0 = r0 % 116
            QfgSZK.DCUTEI.CVC = r0
            goto L13a
        L142:
            int r15 = r15 + r15
            int r15 = r15 % 12
            int r15 = r15 * 116
        L147:
            QfgSZK.DCUTEI.CVC = r15
        L149:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 * 1568
            goto L147
        L14e:
            int r5 = r0 + 195
            r12 = 32
            if (r5 == r12) goto L1ce
            r12 = 225(0xe1, float:3.15E-43)
            if (r5 == r12) goto L18a
            r4 = 397(0x18d, float:5.56E-43)
            if (r5 == r4) goto L1af
            r4 = 494(0x1ee, float:6.92E-43)
            if (r5 == r4) goto L161
            goto L123
        L161:
            if (r2 > r14) goto L17e
        L163:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 468
            r1 = 14
            if (r0 == r1) goto L175
            r1 = 49
            if (r0 == r1) goto L170
            goto L163
        L170:
            int r0 = r15 + r15
            int r0 = r0 + r15
            QfgSZK.DCUTEI.CVC = r0
        L175:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 >> 113
            int r15 = r15 * 72
            QfgSZK.DCUTEI.CVC = r15
            goto L175
        L17e:
            int r0 = r0 >> 48
            int r0 = r0 * 105
            r0 = r0 ^ 4800(0x12c0, float:6.726E-42)
            QfgSZK.DCUTEI.zWr = r0
            if (r2 > r14) goto L24f
            goto L21e
        L18a:
            r0 = r0 ^ 1276(0x4fc, float:1.788E-42)
            int r0 = r0 * 54
            r0 = r0 ^ 4805(0x12c5, float:6.733E-42)
            QfgSZK.DCUTEI.zWr = r0
            if (r4 == 0) goto L1af
        L194:
            int r0 = QfgSZK.DCUTEI.CVC
            int r2 = r0 + 416
            r4 = 44
            if (r2 == r4) goto L1a9
            r4 = 62
            if (r2 == r4) goto L1a1
            goto L194
        L1a1:
            int r2 = r0 + r0
            int r2 = r2 * 117
            int r2 = r2 + r0
            QfgSZK.DCUTEI.CVC = r2
            goto L194
        L1a9:
            r2 = r0 ^ 2780(0xadc, float:3.896E-42)
            int r2 = r2 + r0
            int r2 = r2 + r0
            QfgSZK.DCUTEI.CVC = r2
        L1af:
            int r0 = QfgSZK.DCUTEI.zWr
            int r2 = QfgSZK.DCUTEI.CVC
            if (r2 > r14) goto L1c6
        L1b5:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 455
            r1 = 35
            if (r0 == r1) goto L1be
            goto L1b5
        L1be:
            int r0 = r15 % 64
            int r0 = r0 + r15
            int r0 = r0 % 50
            QfgSZK.DCUTEI.CVC = r0
            goto L1b5
        L1c6:
            int r0 = r0 >> 74
            int r0 = r0 * 375
            QfgSZK.DCUTEI.zWr = r0
            goto L24f
        L1ce:
            if (r2 > r14) goto L1e2
        L1d0:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 + 442
            r0 = 60
            if (r15 == r0) goto L1d9
            goto L1d0
        L1d9:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 % 117
            int r15 = r15 >> 97
            QfgSZK.DCUTEI.CVC = r15
            goto L1d9
        L1e2:
            if (r2 > r14) goto L212
        L1e4:
            int r2 = QfgSZK.DCUTEI.CVC
            int r4 = r2 + 663
            r5 = 82
            if (r4 == r5) goto L205
            if (r4 == r10) goto L1fc
            r5 = 246(0xf6, float:3.45E-43)
            if (r4 == r5) goto L1f7
            r5 = 404(0x194, float:5.66E-43)
            if (r4 == r5) goto L20b
            goto L1e4
        L1f7:
            int r2 = r2 * 113
            int r15 = r2 >> 33
            goto L202
        L1fc:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 % 102
            int r15 = r15 >> 75
        L202:
            QfgSZK.DCUTEI.CVC = r15
            goto L1fc
        L205:
            int r4 = r2 + r2
            int r4 = r4 % 118
            QfgSZK.DCUTEI.CVC = r4
        L20b:
            int r4 = QfgSZK.DCUTEI.CVC
            int r4 = r4 + r2
            int r2 = r4 >> 120
            QfgSZK.DCUTEI.CVC = r2
        L212:
            int r0 = r0 >> 56
            int r0 = r0 % 69
            int r0 = r0 >> 83
            QfgSZK.DCUTEI.zWr = r0
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r14) goto L24f
        L21e:
            int r0 = QfgSZK.DCUTEI.CVC
            int r2 = r0 + 520
            r4 = 98
            if (r2 == r4) goto L241
            r4 = 199(0xc7, float:2.79E-43)
            if (r2 == r4) goto L238
            r4 = 236(0xec, float:3.31E-43)
            if (r2 == r4) goto L233
            r0 = 349(0x15d, float:4.89E-43)
            if (r2 == r0) goto L247
            goto L21e
        L233:
            r0 = r0 ^ 3201(0xc81, float:4.486E-42)
            int r0 = r0 % 81
            goto L24d
        L238:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 % 78
            int r15 = r15 * r8
            int r15 = r15 >> r11
            QfgSZK.DCUTEI.CVC = r15
            goto L238
        L241:
            int r0 = r0 % 80
            int r0 = r0 * 30
            QfgSZK.DCUTEI.CVC = r0
        L247:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 * 126
            r0 = r0 ^ 509(0x1fd, float:7.13E-43)
        L24d:
            QfgSZK.DCUTEI.CVC = r0
        L24f:
            if (r15 == 0) goto L430
            int r15 = QfgSZK.DCUTEI.zWr
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L278
        L259:
            int r0 = QfgSZK.DCUTEI.CVC
            int r2 = r0 + 572
            if (r2 == r8) goto L271
            if (r2 == r6) goto L26c
            r4 = 233(0xe9, float:3.27E-43)
            if (r2 == r4) goto L266
            goto L259
        L266:
            int r2 = r0 * 3400
            int r2 = r2 + r0
            QfgSZK.DCUTEI.CVC = r2
            goto L259
        L26c:
            int r0 = r0 >> 78
            int r0 = r0 * 74
            goto L276
        L271:
            int r0 = r0 + r0
            int r0 = r0 % 125
            r0 = r0 ^ 3403(0xd4b, float:4.769E-42)
        L276:
            QfgSZK.DCUTEI.CVC = r0
        L278:
            r15 = r15 ^ 2633(0xa49, float:3.69E-42)
            if (r15 == 0) goto L284
            int r15 = QfgSZK.DCUTEI.CVC
            r15 = r15 ^ 5466(0x155a, float:7.66E-42)
            if (r15 == 0) goto L32b
            goto L2f4
        L284:
            r15 = r1
            goto L431
        L287:
            java.lang.String r0 = "P^\u007fYgt^JUxg|k||os{`zqpdfqs"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r15 = r15.equals(r0)
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L2bb
        L297:
            int r2 = QfgSZK.DCUTEI.CVC
            int r15 = r2 + 130
            if (r15 == r4) goto L2ad
            if (r15 == r10) goto L2a4
            r0 = 285(0x11d, float:4.0E-43)
            if (r15 == r0) goto L2b3
            goto L297
        L2a4:
            r15 = r2 ^ 3486(0xd9e, float:4.885E-42)
            int r15 = r15 % 58
            int r15 = r15 >> 104
            QfgSZK.DCUTEI.CVC = r15
            goto L297
        L2ad:
            r15 = r2 ^ 2405(0x965, float:3.37E-42)
            int r15 = r15 * 81
        L2b1:
            QfgSZK.DCUTEI.CVC = r15
        L2b3:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 % 115
            int r15 = r15 * 21
            int r15 = r15 + r2
            goto L2b1
        L2bb:
            if (r15 == 0) goto L430
            int r15 = QfgSZK.DCUTEI.zWr
            r15 = r15 ^ 2633(0xa49, float:3.69E-42)
            if (r15 == 0) goto L2c6
            if (r0 == 0) goto L32b
            goto L2f4
        L2c6:
            r15 = 2
            goto L431
        L2c9:
            java.lang.String r0 = "P^\u007fYgt^JUxg|z{ga\u007fy}}u"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            int r2 = QfgSZK.DCUTEI.CVC
            r2 = r2 ^ 5466(0x155a, float:7.66E-42)
            if (r2 == 0) goto L2e4
        L2d5:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 104
            if (r0 == r5) goto L2dc
            goto L2d5
        L2dc:
            int r0 = r15 * 120
            r0 = r0 ^ 3845(0xf05, float:5.388E-42)
            int r0 = r0 + r15
            QfgSZK.DCUTEI.CVC = r0
            goto L2d5
        L2e4:
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L430
            int r15 = QfgSZK.DCUTEI.zWr
            if (r15 > r12) goto L33c
            int r15 = QfgSZK.DCUTEI.CVC
            r15 = r15 ^ 5466(0x155a, float:7.66E-42)
            if (r15 == 0) goto L32b
        L2f4:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 195
            r1 = 28
            if (r0 == r1) goto L322
            r1 = 142(0x8e, float:1.99E-43)
            if (r0 == r1) goto L311
            r1 = 277(0x115, float:3.88E-43)
            if (r0 == r1) goto L318
            r1 = 313(0x139, float:4.39E-43)
            if (r0 == r1) goto L309
            goto L2f4
        L309:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r15
            int r0 = r0 + r15
            int r0 = r0 * r3
            QfgSZK.DCUTEI.CVC = r0
            goto L309
        L311:
            int r0 = r15 % 59
            int r0 = r0 + r15
            r0 = r0 ^ 4198(0x1066, float:5.883E-42)
            QfgSZK.DCUTEI.CVC = r0
        L318:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 * 17
            int r0 = r0 % 35
            int r0 = r0 + r15
            QfgSZK.DCUTEI.CVC = r0
            goto L2f4
        L322:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 >> 94
            int r15 = r15 % 120
            QfgSZK.DCUTEI.CVC = r15
            goto L322
        L32b:
            int r15 = QfgSZK.DCUTEI.zWr
            int r0 = r15 + 13
            r1 = 12
            if (r0 == r1) goto L334
            goto L32b
        L334:
            r0 = r15 ^ 1453(0x5ad, float:2.036E-42)
            int r0 = r0 + r15
            int r0 = r0 * 116
            QfgSZK.DCUTEI.zWr = r0
            goto L32b
        L33c:
            r15 = 0
            goto L431
        L33f:
            java.lang.String r0 = "P^\u007fYgt^JUxg|ylftygg"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L430
            int r15 = QfgSZK.DCUTEI.CVC
            if (r15 > r14) goto L380
        L34f:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 182
            r1 = 92
            if (r0 == r1) goto L377
            if (r0 == r2) goto L367
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L362
            r1 = 397(0x18d, float:5.56E-43)
            if (r0 == r1) goto L36f
            goto L34f
        L362:
            r0 = r15 ^ 4718(0x126e, float:6.611E-42)
            int r0 = r0 * 76
            goto L374
        L367:
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 3641(0xe39, float:5.102E-42)
            int r0 = r0 * 7
            QfgSZK.DCUTEI.CVC = r0
        L36f:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r15
            int r0 = r0 + r15
            int r0 = r0 + r15
        L374:
            QfgSZK.DCUTEI.CVC = r0
            goto L367
        L377:
            int r15 = QfgSZK.DCUTEI.CVC
            r15 = r15 ^ 5450(0x154a, float:7.637E-42)
            int r15 = r15 * 63
            QfgSZK.DCUTEI.CVC = r15
            goto L377
        L380:
            int r0 = QfgSZK.DCUTEI.zWr
            if (r0 > r12) goto L3f1
            r15 = r15 ^ 5466(0x155a, float:7.66E-42)
            if (r15 == 0) goto L389
            goto L3c2
        L389:
            int r15 = QfgSZK.DCUTEI.zWr
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L3ad
        L391:
            int r0 = QfgSZK.DCUTEI.CVC
            int r1 = r0 + 624
            r2 = 58
            if (r1 == r2) goto L3a5
            r2 = 93
            if (r1 == r2) goto L39e
            goto L391
        L39e:
            r0 = r0 ^ 3347(0xd13, float:4.69E-42)
            int r0 = r0 % 89
            QfgSZK.DCUTEI.CVC = r0
            goto L391
        L3a5:
            int r0 = r0 % 63
            int r0 = r0 >> 120
            int r0 = r0 % 17
            QfgSZK.DCUTEI.CVC = r0
        L3ad:
            int r15 = r15 + 247
            r0 = 10
            if (r15 == r0) goto L3b4
            goto L389
        L3b4:
            int r15 = QfgSZK.DCUTEI.zWr
            r15 = r15 ^ 1288(0x508, float:1.805E-42)
            int r15 = r15 >> 124
            QfgSZK.DCUTEI.zWr = r15
            int r15 = QfgSZK.DCUTEI.CVC
            r15 = r15 ^ 5466(0x155a, float:7.66E-42)
            if (r15 == 0) goto L389
        L3c2:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 481
            r1 = 20
            if (r0 == r1) goto L3dd
            r1 = 76
            if (r0 == r1) goto L3ea
            if (r0 == r6) goto L3e3
            r1 = 356(0x164, float:4.99E-43)
            if (r0 == r1) goto L3d5
            goto L3c2
        L3d5:
            int r15 = r15 + r15
            r15 = r15 ^ 2473(0x9a9, float:3.465E-42)
            int r15 = r15 * 108
            QfgSZK.DCUTEI.CVC = r15
            goto L3ea
        L3dd:
            int r0 = r15 * 88
            r0 = r0 ^ 5084(0x13dc, float:7.124E-42)
            QfgSZK.DCUTEI.CVC = r0
        L3e3:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 * 5472
            int r0 = r0 + r15
            QfgSZK.DCUTEI.CVC = r0
        L3ea:
            int r15 = QfgSZK.DCUTEI.CVC
            r15 = r15 ^ 4587(0x11eb, float:6.428E-42)
            QfgSZK.DCUTEI.CVC = r15
            goto L389
        L3f1:
            r15 = r7
            goto L431
        L3f3:
            java.lang.String r0 = "P^\u007fYgt^JUxg|h`gjsafzqb"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L430
            int r15 = QfgSZK.DCUTEI.CVC
            if (r15 > r14) goto L42e
        L403:
            int r15 = QfgSZK.DCUTEI.CVC
            int r0 = r15 + 13
            r2 = 15
            if (r0 == r2) goto L428
            r2 = 109(0x6d, float:1.53E-43)
            if (r0 == r2) goto L41d
            r2 = 169(0xa9, float:2.37E-43)
            if (r0 == r2) goto L414
            goto L403
        L414:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 % 91
            int r0 = r0 * r5
            int r0 = r0 + r15
            QfgSZK.DCUTEI.CVC = r0
            goto L414
        L41d:
            int r15 = QfgSZK.DCUTEI.CVC
            int r15 = r15 * 124
            int r15 = r15 >> 112
            int r15 = r15 % 91
            QfgSZK.DCUTEI.CVC = r15
            goto L41d
        L428:
            int r0 = r15 * 119
            int r0 = r0 % r8
            int r0 = r0 + r15
            QfgSZK.DCUTEI.CVC = r0
        L42e:
            r15 = r11
            goto L431
        L430:
            r15 = -1
        L431:
            if (r15 == 0) goto L44f
            if (r15 == r1) goto L44c
            r0 = 2
            if (r15 == r0) goto L449
            if (r15 == r11) goto L446
            if (r15 == r13) goto L443
            if (r15 == r7) goto L440
            r15 = 0
            return r15
        L440:
            java.lang.String r15 = "ntU\u007f"
            goto L451
        L443:
            java.lang.String r15 = "pu"
            goto L451
        L446:
            java.lang.String r15 = "\u007fyH"
            goto L451
        L449:
            java.lang.String r15 = "|dOd"
            goto L451
        L44c:
            java.lang.String r15 = "se"
            goto L451
        L44f:
            java.lang.String r15 = "mcTj"
        L451:
            java.lang.String r15 = QfgSZK.GCXiNH.fsw(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.hBpjJd(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:30:0x0068) to fix multi-entry loop: BACK_EDGE: B:30:0x0068 -> B:31:0x006a */
    /* JADX DEBUG: Duplicate block (B:45:0x00a0) to fix multi-entry loop: BACK_EDGE: B:45:0x00a0 -> B:46:0x00a2 */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 133 out of bounds for length 96
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:93)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
     */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private boolean hrNTAI(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            r1 = 33
            r2 = 0
            r3 = 70
            r4 = 1
            r5 = 3
            r6 = 2
            r7 = 5465(0x1559, float:7.658E-42)
            switch(r0) {
                case -1951042291: goto L1da;
                case -1393351993: goto L1b9;
                case -96285750: goto L82;
                case 1026190327: goto L13;
                default: goto L11;
            }
        L11:
            goto L238
        L13:
            java.lang.String r0 = "P^\u007fYgt^JUxg|nl~nupk`wre}wie"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r13 = r13.equals(r0)
            int r0 = QfgSZK.DCUTEI.zWr
            r8 = 2632(0xa48, float:3.688E-42)
            if (r0 > r8) goto L75
            int r0 = QfgSZK.DCUTEI.CVC
            if (r0 > r7) goto L43
        L27:
            int r13 = QfgSZK.DCUTEI.CVC
            int r0 = r13 + 247
            if (r0 == r1) goto L39
            r2 = 180(0xb4, float:2.52E-43)
            if (r0 == r2) goto L32
            goto L27
        L32:
            int r0 = r13 * 87
            r0 = r0 ^ 5240(0x1478, float:7.343E-42)
            int r0 = r0 >> r6
            QfgSZK.DCUTEI.CVC = r0
        L39:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r13
            int r0 = r0 * 57
            int r13 = r0 >> 103
            QfgSZK.DCUTEI.CVC = r13
            goto L27
        L43:
            int r0 = QfgSZK.DCUTEI.zWr
            int r1 = r0 + 117
            r8 = 75
            if (r1 == r8) goto L4c
            goto L43
        L4c:
            int r1 = QfgSZK.DCUTEI.CVC
            if (r1 > r7) goto L6f
        L50:
            int r13 = QfgSZK.DCUTEI.CVC
            int r0 = r13 + 273
            if (r0 == r3) goto L66
            r1 = 149(0x95, float:2.09E-43)
            if (r0 == r1) goto L5f
            r13 = 230(0xe6, float:3.22E-43)
            if (r0 == r13) goto L6a
            goto L50
        L5f:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r13
            int r0 = r0 + r13
            QfgSZK.DCUTEI.CVC = r0
            goto L5f
        L66:
            r13 = r13 ^ 321(0x141, float:4.5E-43)
        L68:
            QfgSZK.DCUTEI.CVC = r13
        L6a:
            int r13 = QfgSZK.DCUTEI.CVC
            r13 = r13 ^ 7999(0x1f3f, float:1.1209E-41)
            goto L68
        L6f:
            int r0 = r0 % 96
            r0 = r0 ^ 347(0x15b, float:4.86E-43)
            QfgSZK.DCUTEI.zWr = r0
        L75:
            if (r13 == 0) goto L238
            int r13 = QfgSZK.DCUTEI.zWr
            r13 = r13 ^ 2633(0xa49, float:3.69E-42)
            if (r13 == 0) goto L7f
            goto L1ec
        L7f:
            r13 = r6
            goto L239
        L82:
            java.lang.String r0 = "P^\u007fYgt^JUxg|k||os{`zqpdfqs"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r13 = r13.equals(r0)
            int r0 = QfgSZK.DCUTEI.CVC
            r8 = 81
            if (r0 > r7) goto La8
        L92:
            int r0 = QfgSZK.DCUTEI.CVC
            int r13 = r0 + 91
            r1 = 43
            if (r13 == r1) goto L9d
            if (r13 == r8) goto La2
            goto L92
        L9d:
            r13 = r0 ^ 1753(0x6d9, float:2.456E-42)
            int r13 = r13 >> r5
        La0:
            QfgSZK.DCUTEI.CVC = r13
        La2:
            int r13 = QfgSZK.DCUTEI.CVC
            int r13 = r13 * 5916
            int r13 = r13 + r0
            goto La0
        La8:
            int r0 = QfgSZK.DCUTEI.zWr
            r0 = r0 ^ 2633(0xa49, float:3.69E-42)
            if (r0 == 0) goto L18b
        Lae:
            int r0 = QfgSZK.DCUTEI.zWr
            int r9 = r0 + 104
            r10 = 60
            if (r9 == r10) goto L161
            r10 = 126(0x7e, float:1.77E-43)
            r11 = 74
            if (r9 == r10) goto L103
            r10 = 269(0x10d, float:3.77E-43)
            if (r9 == r10) goto Lc5
            r10 = 307(0x133, float:4.3E-43)
            if (r9 == r10) goto Lfa
            goto Lae
        Lc5:
            int r8 = QfgSZK.DCUTEI.CVC
            r8 = r8 ^ 5466(0x155a, float:7.66E-42)
            if (r8 == 0) goto Lf3
        Lcb:
            int r8 = QfgSZK.DCUTEI.CVC
            int r9 = r8 + 377
            if (r9 == r11) goto Lee
            r10 = 117(0x75, float:1.64E-43)
            if (r9 == r10) goto Le9
            r10 = 277(0x115, float:3.88E-43)
            if (r9 == r10) goto Le3
            r10 = 329(0x149, float:4.61E-43)
            if (r9 == r10) goto Lde
            goto Lcb
        Lde:
            int r9 = r8 * 53
            int r9 = r9 % 7
            goto Lf0
        Le3:
            int r9 = r8 >> 12
            int r9 = r9 * 5236
            QfgSZK.DCUTEI.CVC = r9
        Le9:
            int r9 = QfgSZK.DCUTEI.CVC
            int r9 = r9 >> 103
            goto Lf0
        Lee:
            r9 = r8 ^ 2019(0x7e3, float:2.829E-42)
        Lf0:
            int r9 = r9 + r8
            QfgSZK.DCUTEI.CVC = r9
        Lf3:
            int r8 = r0 + r0
            r8 = r8 ^ 1887(0x75f, float:2.644E-42)
            int r8 = r8 + r0
            QfgSZK.DCUTEI.zWr = r8
        Lfa:
            int r8 = QfgSZK.DCUTEI.zWr
            int r8 = r8 + r0
            int r0 = r8 >> 71
            QfgSZK.DCUTEI.zWr = r0
            goto L18b
        L103:
            int r13 = QfgSZK.DCUTEI.zWr
            int r1 = QfgSZK.DCUTEI.CVC
            r1 = r1 ^ 5466(0x155a, float:7.66E-42)
            r2 = 94
            if (r1 == 0) goto L125
        L10d:
            int r1 = QfgSZK.DCUTEI.CVC
            int r4 = r1 + 221
            if (r4 == r3) goto L11c
            if (r4 == r2) goto L116
            goto L10d
        L116:
            int r1 = r1 + r1
            r1 = r1 ^ 2376(0x948, float:3.33E-42)
            QfgSZK.DCUTEI.CVC = r1
            goto L125
        L11c:
            int r13 = QfgSZK.DCUTEI.CVC
            int r13 = r13 >> r11
            int r13 = r13 + r1
            int r13 = r13 >> 114
            QfgSZK.DCUTEI.CVC = r13
            goto L11c
        L125:
            int r13 = r13 + r0
            int r13 = r13 * 927
            QfgSZK.DCUTEI.zWr = r13
            int r13 = QfgSZK.DCUTEI.CVC
            if (r13 > r7) goto L103
        L12e:
            int r13 = QfgSZK.DCUTEI.CVC
            int r0 = r13 + 182
            r1 = 83
            if (r0 == r1) goto L158
            if (r0 == r2) goto L14c
            r1 = 289(0x121, float:4.05E-43)
            if (r0 == r1) goto L152
            r13 = 331(0x14b, float:4.64E-43)
            if (r0 == r13) goto L141
            goto L12e
        L141:
            int r13 = QfgSZK.DCUTEI.CVC
            r13 = r13 ^ 1095(0x447, float:1.534E-42)
            int r13 = r13 * 119
            int r13 = r13 % 103
            QfgSZK.DCUTEI.CVC = r13
            goto L141
        L14c:
            r0 = r13 ^ 4094(0xffe, float:5.737E-42)
            int r0 = r0 >> 99
            QfgSZK.DCUTEI.CVC = r0
        L152:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + r13
            int r13 = r0 >> 110
            goto L15e
        L158:
            int r13 = r13 >> 80
            int r13 = r13 * 112
            int r13 = r13 >> 71
        L15e:
            QfgSZK.DCUTEI.CVC = r13
            goto L12e
        L161:
            int r13 = QfgSZK.DCUTEI.zWr
            int r1 = QfgSZK.DCUTEI.CVC
            if (r1 > r7) goto L184
        L167:
            int r1 = QfgSZK.DCUTEI.CVC
            int r13 = r1 + 364
            r0 = 47
            if (r13 == r0) goto L17c
            r0 = 187(0xbb, float:2.62E-43)
            if (r13 == r0) goto L174
            goto L167
        L174:
            int r1 = r1 % 52
            int r1 = r1 % r8
            int r1 = r1 * 92
            QfgSZK.DCUTEI.CVC = r1
            goto L167
        L17c:
            int r13 = QfgSZK.DCUTEI.CVC
            int r13 = r13 + r1
            int r13 = r13 >> 105
            QfgSZK.DCUTEI.CVC = r13
            goto L17c
        L184:
            r13 = r13 ^ 4544(0x11c0, float:6.368E-42)
            int r13 = r13 * r6
            int r13 = r13 + r0
            QfgSZK.DCUTEI.zWr = r13
            goto L161
        L18b:
            if (r13 == 0) goto L238
            int r13 = QfgSZK.DCUTEI.zWr
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L1b1
        L195:
            int r0 = QfgSZK.DCUTEI.CVC
            int r8 = r0 + 130
            r9 = 19
            if (r8 == r9) goto L1a9
            r9 = 154(0x9a, float:2.16E-43)
            if (r8 == r9) goto L1a2
            goto L195
        L1a2:
            int r0 = r0 % 110
            r0 = r0 ^ 1264(0x4f0, float:1.771E-42)
            QfgSZK.DCUTEI.CVC = r0
            goto L1b1
        L1a9:
            int r0 = r0 >> 47
            int r0 = r0 * r1
            r0 = r0 ^ 4119(0x1017, float:5.772E-42)
            QfgSZK.DCUTEI.CVC = r0
            goto L195
        L1b1:
            r13 = r13 ^ 2633(0xa49, float:3.69E-42)
            if (r13 == 0) goto L1b6
            goto L1ec
        L1b6:
            r13 = r4
            goto L239
        L1b9:
            java.lang.String r0 = "P^\u007fYgt^JUxg|ylftygg"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L238
            int r13 = QfgSZK.DCUTEI.CVC
            if (r13 > r7) goto L1d8
        L1c9:
            int r13 = QfgSZK.DCUTEI.CVC
            int r0 = r13 + 117
            r1 = 29
            if (r0 == r1) goto L1d2
            goto L1c9
        L1d2:
            r13 = r13 ^ 1176(0x498, float:1.648E-42)
            int r13 = r13 * 35
            QfgSZK.DCUTEI.CVC = r13
        L1d8:
            r13 = r5
            goto L239
        L1da:
            java.lang.String r0 = "P^\u007fYgt^JUxg|h`gjsafzqb"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L238
            int r13 = QfgSZK.DCUTEI.zWr
            r13 = r13 ^ 2633(0xa49, float:3.69E-42)
            if (r13 == 0) goto L236
        L1ec:
            int r13 = QfgSZK.DCUTEI.zWr
            int r13 = r13 + 13
            r0 = 76
            if (r13 == r0) goto L1f5
            goto L1ec
        L1f5:
            int r13 = QfgSZK.DCUTEI.zWr
            int r13 = r13 % 106
            r13 = r13 ^ 3110(0xc26, float:4.358E-42)
            QfgSZK.DCUTEI.zWr = r13
            int r13 = QfgSZK.DCUTEI.CVC
            if (r13 > r7) goto L1f5
        L201:
            int r13 = QfgSZK.DCUTEI.CVC
            int r1 = r13 + 299
            r2 = 82
            if (r1 == r2) goto L22c
            r2 = 205(0xcd, float:2.87E-43)
            if (r1 == r2) goto L226
            r2 = 284(0x11c, float:3.98E-43)
            if (r1 == r2) goto L21f
            r13 = 364(0x16c, float:5.1E-43)
            if (r1 == r13) goto L216
            goto L201
        L216:
            int r13 = QfgSZK.DCUTEI.CVC
            int r13 = r13 % 66
            int r13 = r13 >> r3
            int r13 = r13 * r0
            QfgSZK.DCUTEI.CVC = r13
            goto L216
        L21f:
            int r1 = r13 * 39
            int r1 = r1 + r13
            int r1 = r1 + r13
            QfgSZK.DCUTEI.CVC = r1
            goto L1f5
        L226:
            int r1 = r13 % 62
            r1 = r1 ^ 2702(0xa8e, float:3.786E-42)
            QfgSZK.DCUTEI.CVC = r1
        L22c:
            int r1 = QfgSZK.DCUTEI.CVC
            int r1 = r1 + r13
            r13 = r1 ^ 2652(0xa5c, float:3.716E-42)
            int r13 = r13 % 124
            QfgSZK.DCUTEI.CVC = r13
            goto L201
        L236:
            r13 = r2
            goto L239
        L238:
            r13 = -1
        L239:
            if (r13 == 0) goto L242
            if (r13 == r4) goto L242
            if (r13 == r6) goto L242
            if (r13 == r5) goto L242
            return r2
        L242:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.hrNTAI(java.lang.String):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> DLWbHP(long j) {
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"));
        if (!QSBOWP(GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"), saJVGbODXsMY)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(GCXiNH.fsw("raOeD_r"), Long.valueOf(j));
        return saJVGbODXsMY.sQOHWT(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SaJVGb ODXsMY(String str) {
        if (!this.ajBqpt.containsKey(str)) {
            return null;
        }
        if (CVC > 5465) {
            SaJVGb saJVGb = this.ajBqpt.get(str);
            if (QSBOWP(str, saJVGb) && saJVGb.OFQuKP()) {
                return this.ajBqpt.get(str);
            }
            return null;
        }
        while (true) {
            int i = CVC;
            int i2 = i + 52;
            if (i2 == 61) {
                CVC = ((i * 35) ^ 5292) + i;
            } else if (i2 == 257) {
                break;
            }
        }
        while (true) {
            CVC = ((CVC ^ 5047) * 46) % 37;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OFhtUX() {
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg"));
        if (QSBOWP(GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg"), saJVGbODXsMY)) {
            saJVGbODXsMY.sQOHWT(new HashMap());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long OHqIaq(String str, int i) {
        SaJVGb saJVGbODXsMY = ODXsMY(str);
        if (QSBOWP(str, saJVGbODXsMY)) {
            return saJVGbODXsMY.OHqIaq(i);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OJuSTm(String str) {
        int i;
        SaJVGb saJVGbODXsMY = ODXsMY(str);
        if ((CVC ^ 5466) != 0) {
            while (true) {
                i = CVC;
                int i2 = i + 13;
                if (i2 == 41) {
                    break;
                }
                if (i2 == 83) {
                    CVC = ((i % 96) >> 60) ^ 1902;
                }
            }
            CVC = i >> CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384;
        }
        if (QSBOWP(str, saJVGbODXsMY)) {
            return saJVGbODXsMY.zagaMW();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OxVOHk(Activity activity, String str) {
        int i;
        int i2;
        int i3;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        if ((CVC ^ 5466) != 0) {
            do {
                i3 = CVC;
            } while (i3 + 39 != 78);
            CVC = ((i3 % 90) + i3) * 52;
        }
        boolean zIKEqwx = DLGVGj.iKEqwx(saJVGbODXsMY);
        if ((CVC ^ 5466) != 0) {
            while (true) {
                int i4 = CVC;
                int i5 = i4 + 13;
                if (i5 == 62) {
                    i = ((i4 ^ 3791) >> 33) * 22;
                    break;
                }
                if (i5 == 252) {
                    i2 = (i4 % 48) ^ 1916;
                } else if (i5 == 356) {
                    i = (i4 + i4) >> 67;
                    break;
                } else if (i5 == 519) {
                    i2 = ((i4 >> 19) ^ 4610) >> 42;
                }
                CVC = i2;
            }
            CVC = i;
        }
        if (zIKEqwx) {
            ((DLGVGj) saJVGbODXsMY).OxVOHk(activity, str);
        } else {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQF^\tXFQP\u0014]S\\U\u0015\u001epS_OU]\u0017Ov$mmu [Bhfgom(hd5}`2x~y\u007fqu\u007f"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OAjjVP QCjLjM() {
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs"));
        if (saJVGbODXsMY == null || !saJVGbODXsMY.OFQuKP()) {
            return null;
        }
        return (OAjjVP) saJVGbODXsMY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x0059) to fix multi-entry loop: BACK_EDGE: B:23:0x0055 -> B:24:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set<String> QSLkRj() {
        int i;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, SaJVGb>> it = this.ajBqpt.entrySet().iterator();
        while (it.hasNext()) {
            SaJVGb value = it.next().getValue();
            if (value != null) {
                if (value.OFQuKP()) {
                    hashSet.addAll(value.QSLkRj());
                }
                if ((CVC ^ 5466) != 0) {
                    while (true) {
                        int i2 = CVC;
                        i = i2 + 39;
                        if (i != 92) {
                        }
                    }
                    while (true) {
                        CVC ^= 4252;
                    }
                }
            } else if ((CVC ^ 5466) != 0) {
                while (true) {
                    int i22 = CVC;
                    i = i22 + 39;
                    if (i != 92) {
                        while (true) {
                            CVC >>= 216;
                        }
                    } else if (i != 190) {
                        if (i == 385) {
                            CVC = ((i22 >> 34) % 34) * 14;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    CVC ^= 4252;
                }
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:113:0x024f) to fix multi-entry loop: BACK_EDGE: B:112:0x0248 -> B:113:0x024f */
    /* JADX DEBUG: Duplicate block (B:130:0x02a7) to fix multi-entry loop: BACK_EDGE: B:129:0x02a1 -> B:130:0x02a7 */
    /* JADX DEBUG: Duplicate block (B:31:0x0075) to fix multi-entry loop: BACK_EDGE: B:30:0x006f -> B:31:0x0075 */
    public List<String> QVAiDq(TMXConfig tMXConfig) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SaJVGb saJVGbQkdxfA;
        int i6;
        int i7;
        Context context = tMXConfig.zrcPaS().Umbazn;
        ArrayList<TMXModuleInitializerInterface> arrayListGwTjWJ = gwTjWJ(TMXModuleInitializerInterface.class);
        int i8 = CVC;
        if (i8 <= 5465) {
            while (true) {
                int i9 = CVC;
                int i10 = i9 + 13;
                if (i10 == 57) {
                    break;
                }
                if (i10 == 172) {
                    i7 = (i9 % 11) ^ 3425;
                } else if (i10 == 283) {
                    CVC = (CVC + i9) >> WalletImportError.ERROR_CODE_AA_EXIST;
                } else if (i10 == 328) {
                    i7 = ((i9 + i9) >> 115) * 101;
                }
                CVC = i7;
                CVC = (CVC + i9) >> WalletImportError.ERROR_CODE_AA_EXIST;
            }
            while (true) {
                CVC = (CVC % 102) ^ 2973;
            }
        } else {
            if ((zWr ^ 2633) == 0) {
                if (arrayListGwTjWJ == null) {
                    FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("p~_yGT!re[V\u0003CZ\bICYX"));
                    return null;
                }
                for (TMXModuleInitializerInterface tMXModuleInitializerInterface : arrayListGwTjWJ) {
                    FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("t\u007fRx\u000b\\nzyDG\u0003") + tMXModuleInitializerInterface);
                    Pair<String, Object> pairInitialize = tMXModuleInitializerInterface.initialize();
                    if (pairInitialize != null) {
                        if (!hrNTAI((String) pairInitialize.first) || (saJVGbQkdxfA = QkdxfA((String) pairInitialize.first, pairInitialize.second, tMXModuleInitializerInterface.getNativeLibName())) == null || !saJVGbQkdxfA.aJZHYI()) {
                            QwNZnX.put((String) pairInitialize.first, GCXiNH.fsw("t\u007fO"));
                        } else if (!this.ajBqpt.containsKey(pairInitialize.first)) {
                            this.ajBqpt.put((String) pairInitialize.first, saJVGbQkdxfA);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                this.diggZZ = 0L;
                loop10: for (Map.Entry<String, SaJVGb> entry : this.ajBqpt.entrySet()) {
                    SaJVGb value = entry.getValue();
                    if (value == null) {
                        QwNZnX.put(entry.getKey(), GCXiNH.fsw("t\u007fO"));
                        if (CVC <= 5465) {
                            do {
                                i = CVC;
                                i2 = i + 104;
                                if (i2 == 41) {
                                    while (true) {
                                        CVC = (CVC % 83) >> CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
                                    }
                                }
                            } while (i2 != 194);
                            CVC = ((i ^ 4884) % 36) % 49;
                        } else {
                            continue;
                        }
                    } else {
                        if (value.OhRmUC(context, OBJEWx(entry.getKey(), context, tMXConfig))) {
                            arrayList.add(value.gAnGwV());
                            Map<String, Long> map = spUnqd;
                            if (map.containsKey(entry.getKey())) {
                                Long l = map.get(entry.getKey());
                                if (l != null) {
                                    this.diggZZ |= l.longValue();
                                }
                                entry.getValue().dXhJGx(true);
                                entry.getValue().haRtnV(true);
                                QwNZnX.put(entry.getKey(), GCXiNH.fsw("~~Uj"));
                                if (zWr <= 2632) {
                                    while (true) {
                                        int i11 = zWr;
                                        int i12 = i11 + 130;
                                        if (i12 == 91) {
                                            do {
                                                zWr = (zWr % 62) + i11;
                                            } while ((CVC ^ 5466) == 0);
                                            while (true) {
                                                i4 = CVC;
                                                int i13 = i4 + 247;
                                                if (i13 != 19) {
                                                    if (i13 == 76) {
                                                        break;
                                                    }
                                                    if (i13 == 252) {
                                                        CVC = (i4 * 17) % 120;
                                                        break;
                                                    }
                                                } else {
                                                    CVC = ((i4 + i4) + i4) ^ 4081;
                                                }
                                            }
                                            while (true) {
                                                CVC = ((CVC ^ 2393) + i4) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                                            }
                                        } else if (i12 == 270) {
                                            zWr = ((i11 + i11) >> WebSocketProtocol.PAYLOAD_SHORT) % 40;
                                            if (CVC <= 5465) {
                                                while (true) {
                                                    i5 = CVC;
                                                    int i14 = i5 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                                    if (i14 != 54) {
                                                        if (i14 == 196) {
                                                            break;
                                                        }
                                                    } else {
                                                        CVC = ((i5 >> 78) % 40) ^ 5272;
                                                    }
                                                }
                                                while (true) {
                                                    CVC = (CVC * 115) + i5;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            entry.getValue().dXhJGx(false);
                            QwNZnX.put(entry.getKey(), GCXiNH.fsw("t\u007fO"));
                            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bALDOA@CGQ\u0013_^TZRX\u0014@G\u0010"), value.gAnGwV());
                        }
                        if (zWr > 2632) {
                            continue;
                        } else {
                            if (CVC <= 5465) {
                                while (true) {
                                    int i15 = CVC;
                                    int i16 = i15 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                    if (i16 == 28) {
                                        CVC = (i15 * 8528) + i15;
                                        break;
                                    }
                                    if (i16 != 36) {
                                        if (i16 == 158) {
                                            break loop10;
                                        }
                                        if (i16 == 314) {
                                            CVC = (i15 ^ 3555) + i15;
                                            break loop10;
                                        }
                                    } else {
                                        CVC = (i15 % 76) * 47;
                                    }
                                }
                                while (true) {
                                    CVC = (CVC * 5696) % 89;
                                }
                            }
                            do {
                                i3 = zWr;
                            } while (i3 + 104 != 28);
                            zWr = (i3 >> 91) * 10;
                        }
                    }
                }
                return arrayList;
            }
            if (i8 <= 5465) {
                while (true) {
                    int i17 = CVC;
                    int i18 = i17 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                    if (i18 == 18) {
                        break;
                    }
                    if (i18 != 189) {
                        if (i18 == 279) {
                            CVC = ((i17 + i17) ^ 4644) % 69;
                            break;
                        }
                    } else {
                        while (true) {
                            CVC = (CVC >> 28) + i17;
                        }
                    }
                }
                while (true) {
                    CVC = (CVC * 43) >> 89;
                }
            } else {
                do {
                    i6 = zWr + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                    if (i6 == 8) {
                        while (true) {
                            zWr = (zWr * 5) % 17;
                        }
                    }
                } while (i6 != 63);
                do {
                    zWr = ((zWr * 9) % 61) % 123;
                } while (CVC > 5465);
                while (true) {
                    int i19 = CVC;
                    int i20 = i19 + 221;
                    if (i20 != 14) {
                        if (i20 == 51) {
                            CVC = (i19 * 6) + i19;
                        }
                    }
                    CVC = CVC + i19 + i19;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void QVsKAR(String str, boolean z, Activity activity) {
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        if (!DLGVGj.iKEqwx(saJVGbODXsMY)) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bPFM@[SSG\u0014XWHR@_OX\u001bNXJPCq>#OndK@l$by)fhb5q}ss|jz=si:pk7nKSEqgJ"));
            return;
        }
        DLGVGj dLGVGj = (DLGVGj) saJVGbODXsMY;
        if (CVC > 5465) {
            dLGVGj.QVsKAR(str, z, activity);
            return;
        }
        while (true) {
            int i = CVC;
            int i2 = i + 39;
            if (i2 != 22) {
                if (i2 == 153) {
                    CVC = (i * 21) + i;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            CVC = ((CVC ^ 5053) * 108) % 73;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:40:0x0094) to fix multi-entry loop: BACK_EDGE: B:39:0x008e -> B:40:0x0094 */
    public void QwvEab() {
        int i;
        int i2;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        if ((CVC ^ 5466) != 0) {
            while (true) {
                i2 = CVC;
                int i3 = i2 + 13;
                if (i3 == 35) {
                    break;
                }
                if (i3 == 158) {
                    CVC = (i2 + i2) >> 12;
                } else if (i3 == 248) {
                    CVC = (i2 + i2 + i2) * 65;
                }
            }
            CVC = (i2 + i2) * 79;
        }
        if (zWr <= 2632) {
            if ((CVC ^ 5466) != 0) {
                do {
                    i = CVC;
                } while (i + 39 != 35);
                CVC = (i ^ 4900) >> 19;
            }
            while (true) {
                int i4 = zWr;
                int i5 = i4 + 26;
                if (i5 == 50) {
                    while (true) {
                        zWr = (zWr * 54) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    }
                } else if (i5 == 144) {
                    zWr = (i4 % 67) + i4;
                    if ((CVC ^ 5466) != 0) {
                        while (true) {
                            int i6 = CVC;
                            int i7 = i6 + 91;
                            if (i7 == 99) {
                                break;
                            }
                            if (i7 == 179) {
                                CVC = ((i6 * 24) + i6) * 84;
                            } else if (i7 == 248) {
                                CVC = ((i6 % 80) >> 105) * 37;
                                break;
                            }
                        }
                        while (true) {
                            CVC = (CVC >> 22) % 38;
                        }
                    }
                } else if (i5 == 181) {
                    zWr = (i4 * 100) ^ 1764;
                }
            }
        }
        if (DLGVGj.iKEqwx(saJVGbODXsMY)) {
            ((DLGVGj) saJVGbODXsMY).QwvEab();
        } else {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQFDM\bE_ZYVFCYLM\u001dUU\\VJZGqmll; sCmqgo)at6{{g2t~n|qy\u007f:vj7nV\u0005MsxO\\kA"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:35:0x007f) to fix multi-entry loop: BACK_EDGE: B:34:0x0079 -> B:35:0x007f */
    public void RJOkX() {
        int i;
        for (Map.Entry<String, SaJVGb> entry : this.ajBqpt.entrySet()) {
            if ((CVC ^ 5466) != 0) {
                while (true) {
                    int i2 = CVC;
                    int i3 = i2 + 52;
                    if (i3 != 47) {
                        if (i3 != 223) {
                            if (i3 != 361) {
                                if (i3 == 411) {
                                    i = i2 * 7605;
                                    break;
                                }
                            } else {
                                i = ((i2 ^ 5429) * 13) ^ 1194;
                                break;
                            }
                        } else {
                            while (true) {
                                CVC = ((CVC + i2) >> 59) ^ 3876;
                            }
                        }
                    } else {
                        while (true) {
                            CVC = (CVC >> WalletImportError.ERROR_CODE_AA_CREATE_KEY) + i2;
                        }
                    }
                }
                CVC = i;
            }
            SaJVGb value = entry.getValue();
            if (value != null && value.OFQuKP()) {
                value.RJOkX();
            }
            if (CVC <= 5465) {
                while (true) {
                    int i4 = CVC;
                    int i5 = i4 + 39;
                    if (i5 == 13) {
                        break;
                    }
                    if (i5 == 175) {
                        CVC = ((i4 * 59) % 20) >> 123;
                        break;
                    }
                }
                while (true) {
                    CVC = (CVC ^ 2716) >> 20;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:13:0x0034) to fix multi-entry loop: BACK_EDGE: B:12:0x002a -> B:13:0x0034 */
    public Map<String, String> USBtdM() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg"));
        if (CVC > 5465) {
            String strFsw = GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg");
            if ((zWr ^ 2633) != 0) {
                if ((CVC ^ 5466) != 0) {
                    do {
                        i4 = CVC;
                    } while (i4 + 39 != 9);
                    while (true) {
                        CVC = ((CVC ^ 2619) % WebSocketProtocol.PAYLOAD_SHORT) + i4;
                    }
                } else {
                    while (true) {
                        int i6 = zWr;
                        int i7 = i6 + 26;
                        if (i7 == 8) {
                            zWr = (i6 ^ 1619) % 85;
                            if ((CVC ^ 5466) != 0) {
                                do {
                                    i = CVC;
                                    i2 = i + 91;
                                    if (i2 != 99) {
                                        if (i2 == 161) {
                                            i3 = (i >> 98) * 107;
                                        } else if (i2 == 209) {
                                            i3 = (i >> 74) * 57;
                                        }
                                        CVC = i3;
                                    }
                                    CVC = (CVC * 53) % 34;
                                    break;
                                } while (i2 != 245);
                                CVC = ((CVC + i) % 91) >> 30;
                            }
                        } else if (i7 == 65) {
                            zWr = (i6 ^ 1585) >> 34;
                        } else if (i7 == 161) {
                            do {
                                zWr = ((zWr ^ MTPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE) % 92) % 35;
                            } while ((CVC ^ 5466) == 0);
                            while (CVC + 78 != 30) {
                            }
                            while (true) {
                                CVC = ((CVC % 102) >> 77) * 102;
                            }
                        }
                    }
                }
            }
            if (QSBOWP(strFsw, saJVGbODXsMY)) {
                return ((IYdWPz) saJVGbODXsMY).hpmliR();
            }
            return null;
        }
        do {
            i5 = CVC + 13;
            if (i5 != 33) {
                if (i5 == 149) {
                    CVC = (CVC ^ 3654) >> 40;
                }
            }
            while (true) {
                CVC = ((CVC >> 70) % 53) ^ 2510;
                CVC = (CVC ^ 3654) >> 40;
            }
        } while (i5 != 343);
        while (true) {
            CVC = (CVC * 22) ^ 1223;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:20:0x0032) to fix multi-entry loop: BACK_EDGE: B:20:0x0032 -> B:21:0x0036 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void UlJrfe(java.lang.String r5) {
        /*
            r4 = this;
            QfgSZK.SaJVGb r0 = r4.ODXsMY(r5)
            if (r0 == 0) goto L51
            boolean r1 = r0.aJZHYI()
            if (r1 == 0) goto L51
            boolean r1 = r0.OFQuKP()
            if (r1 == 0) goto L51
            int r1 = QfgSZK.DCUTEI.CVC
            r2 = 5465(0x1559, float:7.658E-42)
            if (r1 > r2) goto L48
        L18:
            int r1 = QfgSZK.DCUTEI.CVC
            int r2 = r1 + 39
            r3 = 33
            if (r2 == r3) goto L43
            r3 = 109(0x6d, float:1.53E-43)
            if (r2 == r3) goto L32
            r3 = 295(0x127, float:4.13E-43)
            if (r2 == r3) goto L38
            r3 = 356(0x164, float:4.99E-43)
            if (r2 == r3) goto L2d
            goto L18
        L2d:
            int r5 = r1 * 690
            int r5 = r5 >> 74
            goto L36
        L32:
            int r5 = QfgSZK.DCUTEI.CVC
            int r5 = r5 + r1
            int r5 = r5 + r1
        L36:
            QfgSZK.DCUTEI.CVC = r5
        L38:
            int r5 = QfgSZK.DCUTEI.CVC
            r5 = r5 ^ 1975(0x7b7, float:2.768E-42)
            int r5 = r5 * 122
            int r5 = r5 >> 86
            QfgSZK.DCUTEI.CVC = r5
            goto L32
        L43:
            int r1 = r1 + r1
            int r1 = r1 * 5372
            QfgSZK.DCUTEI.CVC = r1
        L48:
            boolean r5 = QSBOWP(r5, r0)
            if (r5 == 0) goto L51
            r0.RJOkX()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.UlJrfe(java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x005a) to fix multi-entry loop: BACK_EDGE: B:23:0x0052 -> B:24:0x005a */
    /* JADX DEBUG: Duplicate block (B:56:0x00d9) to fix multi-entry loop: BACK_EDGE: B:55:0x00cf -> B:56:0x00d9 */
    public void aUsmxb(Activity activity) {
        int i;
        int i2;
        int i3;
        int i4;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        if (CVC <= 5465) {
            do {
                i3 = CVC;
                i4 = i3 + 130;
                if (i4 == 69) {
                    CVC = (i3 ^ 5477) >> 26;
                }
            } while (i4 != 239);
            while (true) {
                CVC = (CVC * 28) + i3;
            }
        }
        if (zWr > 2632) {
            if (DLGVGj.iKEqwx(saJVGbODXsMY)) {
                ((DLGVGj) saJVGbODXsMY).aUsmxb(activity);
                return;
            } else {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bAOOHZ\u0007DPSZAEBNJTSU\u0000\u0019uXBphf\"hs\u001eBfp+ogiezpp3}c0fm=uulxt~c"));
                return;
            }
        }
        while (true) {
            int i5 = zWr;
            int i6 = CVC ^ 5466;
            if (i6 != 0) {
                do {
                    i = CVC;
                    i2 = i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                    if (i2 != 13) {
                        if (i2 == 77) {
                            CVC = ((CVC ^ 2455) * 45) % 118;
                        }
                    }
                    while (true) {
                        CVC = (CVC ^ 2385) % 28;
                        CVC = ((CVC ^ 2455) * 45) % 118;
                    }
                } while (i2 != 254);
                while (true) {
                    CVC = (CVC >> 95) + i;
                }
            } else {
                int i7 = i5 + 26;
                if (i7 == 74) {
                    break;
                }
                if (i7 == 201) {
                    zWr = (i5 * 34) ^ 1636;
                    if (i6 != 0) {
                        while (true) {
                            int i8 = CVC;
                            int i9 = i8 + 52;
                            if (i9 != 29) {
                                if (i9 == 178) {
                                    break;
                                }
                                if (i9 == 264) {
                                    CVC = (i8 ^ 1029) + i8;
                                } else if (i9 == 268) {
                                    CVC = (CVC ^ 2533) % 33;
                                }
                            }
                            CVC = ((CVC + i8) ^ 4773) * 97;
                            CVC = (CVC ^ 2533) % 33;
                        }
                        while (true) {
                            CVC = (CVC % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) >> 58;
                        }
                    }
                } else if (i7 == 250) {
                    zWr = ((i5 + i5) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) * 30;
                }
            }
        }
        while (true) {
            int i10 = zWr;
            if ((CVC ^ 5466) != 0) {
                break;
            } else {
                zWr = (i10 * 34) >> 53;
            }
        }
        while (true) {
            int i11 = CVC + 91;
            if (i11 != 40) {
                if (i11 == 88) {
                    CVC = (CVC >> 102) % 108;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            CVC = ((CVC ^ 3873) % 50) ^ MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_SUCCESS;
            CVC = (CVC >> 102) % 108;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> dUDNAs(DIIpTV dIIpTV, long j, Map<String, Object> map) {
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        if (!DLGVGj.iKEqwx(saJVGbODXsMY)) {
            return null;
        }
        HashMap map2 = new HashMap(20);
        map2.put(GCXiNH.fsw("raOeD_r"), Long.valueOf(j));
        map2.put(GCXiNH.fsw("hx\u007fm_PEk~IVJEG"), Integer.valueOf(dIIpTV.dNTKXi));
        map2.put(GCXiNH.fsw("hx\u007fm_PHpxMPUKE"), Integer.valueOf(dIIpTV.ztvGUH));
        map2.put(GCXiNH.fsw("hx\u007fm_PQliKKPCFFdY@ZG"), Integer.valueOf(dIIpTV.gVWzjr));
        map2.put(GCXiNH.fsw("hx\u007fm_PUlmFQNCZ[NY[xZ_XD"), Integer.valueOf(dIIpTV.zRCMEn));
        map2.put(GCXiNH.fsw("ntU\u007fDCEk~IVJEG"), Integer.valueOf(dIIpTV.gSeEMM));
        map2.put(GCXiNH.fsw("ntU\u007fDCHpxMPUKE"), Integer.valueOf(dIIpTV.DTAmNH));
        map2.put(GCXiNH.fsw("ntU\u007fDCQliKKPCFFdY@ZG"), Integer.valueOf(dIIpTV.PczVR));
        map2.put(GCXiNH.fsw("ntU\u007fDCUlmFQNCZ[NY[gZHT"), Integer.valueOf(dIIpTV.QUuiVn));
        map2.put(GCXiNH.fsw("icZbX\\hm\u007fAMMl[MVCPZPK"), Integer.valueOf(dIIpTV.YqniE));
        map2.put(GCXiNH.fsw("\u007fshdDDmz_MLGyLFTYGfREuQ[_"), Integer.valueOf(dIIpTV.QXuOGi));
        map2.put(GCXiNH.fsw("\u007fshdDDmz_MLGyLFTYGgGSECk_I]"), Integer.valueOf(dIIpTV.aLzfda));
        map2.put(GCXiNH.fsw("\u007fshdDDmz_MLG\u007f`zFAqUGS"), Integer.valueOf(dIIpTV.UOnLDW));
        map2.put(GCXiNH.fsw("\u007fshdDDmz_MLG\u007f`{SWAGwSEQ"), Integer.valueOf(dIIpTV.hOJMbc));
        map2.put(GCXiNH.fsw("ntU\u007fDCHpxMPUKE|ODPG[]]T"), Integer.valueOf(dIIpTV.QXatfW));
        map2.put(GCXiNH.fsw("t\u007fX`^UdzMKVJ\\@\\NSF"), dIIpTV.dEZLlj);
        map2.put(GCXiNH.fsw("ppHgNUGwiDFP"), dIIpTV.fqiwJt);
        map2.put(GCXiNH.fsw("tbyiCPwwc{G@oGIEZPP"), Boolean.valueOf(dIIpTV.flnbsU));
        map2.put(GCXiNH.fsw("nyTyGUTmieCPALLjYQQ"), Boolean.valueOf(dIIpTV.aYHOMt));
        map2.put(GCXiNH.fsw("nyTyGUHpfMAW`H^FEVFZBE"), Boolean.valueOf(dIIpTV.dPmiAp));
        map2.put(GCXiNH.fsw("jtYJBTmzELGM^@NNSGuGFCYMKIY"), dIIpTV.akFAfk);
        map2.put(GCXiNH.fsw("hb^XJVGq~jJPcM"), Boolean.valueOf(dIIpTV.akrmuA));
        if (map != null) {
            map2.putAll(map);
        }
        return saJVGbODXsMY.sQOHWT(map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:48:0x00af) to fix multi-entry loop: BACK_EDGE: B:47:0x00a8 -> B:48:0x00af */
    public void fERRXa(String str, boolean z) {
        int i;
        int i2;
        int i3;
        SaJVGb saJVGbODXsMY = ODXsMY(str);
        if ((CVC ^ 5466) != 0) {
            do {
                i2 = CVC;
                i3 = i2 + 104;
                if (i3 == 42) {
                    CVC = ((i2 + i2) + i2) >> 35;
                }
            } while (i3 != 235);
            while (true) {
                CVC = (CVC * 73) + i2;
            }
        }
        if (saJVGbODXsMY == null || !saJVGbODXsMY.aJZHYI()) {
            return;
        }
        if ((zWr ^ 2633) != 0) {
            if ((CVC ^ 5466) != 0) {
                while (true) {
                    i = CVC;
                    int i4 = i + 39;
                    if (i4 != 64) {
                        if (i4 == 236) {
                            CVC = (i ^ 198) * 23;
                        } else if (i4 == 292) {
                            CVC = (i + i) % 10;
                        } else if (i4 == 380) {
                            break;
                        }
                    }
                    CVC = ((CVC + i) >> 8) + i;
                }
                while (true) {
                    CVC = ((CVC ^ 3088) >> 84) + i;
                }
            } else {
                while (true) {
                    int i5 = zWr;
                    int i6 = i5 + 26;
                    if (i6 == 79) {
                        zWr = (i5 + i5) % 71;
                    } else if (i6 != 141) {
                        if (i6 == 281) {
                            zWr = ((i5 >> 43) * 78) % 106;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                do {
                    zWr = (zWr % 122) ^ 5488;
                } while (CVC > 5465);
                while (true) {
                    int i7 = CVC;
                    int i8 = i7 + 65;
                    if (i8 != 35) {
                        if (i8 == 203) {
                            CVC = (i7 >> 49) * 35;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    CVC = ((CVC % 82) * 74) % 47;
                }
            }
        } else {
            if (!saJVGbODXsMY.OFQuKP()) {
                return;
            }
            boolean zQSBOWP = QSBOWP(str, saJVGbODXsMY);
            if ((CVC ^ 5466) == 0) {
                if (zQSBOWP) {
                    saJVGbODXsMY.haRtnV(z);
                    return;
                }
                return;
            }
            while (true) {
                int i9 = CVC;
                int i10 = i9 + 117;
                if (i10 == 47) {
                    CVC = ((i9 % 118) ^ 5178) + i9;
                } else if (i10 != 175) {
                    if (i10 == 196) {
                        break;
                    }
                }
                CVC = ((CVC * 99) ^ 2277) >> 14;
            }
            while (true) {
                CVC *= 4410;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fdOvFl(String str, String str2, Activity activity) {
        int i;
        int i2;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        boolean zIKEqwx = DLGVGj.iKEqwx(saJVGbODXsMY);
        if (CVC <= 5465) {
            do {
                i2 = CVC;
            } while (i2 + 13 != 19);
            CVC = ((i2 >> 105) + i2) * 11;
        }
        if (!zIKEqwx) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bWMYL\\\u0007U@FAW_D\u000fuXEYUXJS\u0006qeqedt\u0004\fDko\u007fem'\u007ff4}}e0jp|~w\u007f}8xu\u0005LW=g@FcIDH"));
            return;
        }
        DLGVGj dLGVGj = (DLGVGj) saJVGbODXsMY;
        if (CVC > 5465) {
            dLGVGj.fdOvFl(str, str2, activity);
            return;
        }
        do {
            i = CVC + 39;
            if (i == 87) {
                while (true) {
                    CVC = ((CVC * 87) >> 93) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                }
            }
        } while (i != 219);
        while (true) {
            CVC = (CVC >> 63) ^ 5125;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if ((QfgSZK.DCUTEI.CVC ^ 5466) != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (QfgSZK.DCUTEI.CVC <= 5465) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r8 = QfgSZK.DCUTEI.CVC;
        r9 = r8 + 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r9 == 16) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r9 == 147) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r9 == 205) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r9 == 312) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        QfgSZK.DCUTEI.CVC = ((QfgSZK.DCUTEI.CVC * 33) ^ 4809) % 75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        r9 = (r8 ^ 3636) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r9 = (r8 ^ 2141) * 1241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        QfgSZK.DCUTEI.CVC = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        QfgSZK.DCUTEI.CVC = ((QfgSZK.DCUTEI.CVC + r8) + r8) ^ 4351;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fjfviF(String str, String str2, Activity activity) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
        if ((CVC ^ 5466) == 0) {
            boolean zIKEqwx = DLGVGj.iKEqwx(saJVGbODXsMY);
            if ((zWr ^ 2633) != 0) {
                if (CVC <= 5465) {
                    do {
                        i5 = CVC;
                    } while (i5 + 26 != 26);
                    CVC = (i5 >> CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA) ^ 4714;
                }
                do {
                    i = zWr;
                    i2 = i + 26;
                    if (i2 == 54) {
                        zWr = i * 11562;
                        if ((CVC ^ 5466) == 0) {
                        }
                        do {
                            i3 = CVC;
                            i4 = i3 + 78;
                            if (i4 != 80) {
                                if (i4 == 146) {
                                    while (true) {
                                        CVC = (CVC >> 54) * 92;
                                    }
                                } else if (i4 == 177) {
                                    CVC = (i3 * 35) + i3;
                                }
                            }
                            while (true) {
                                CVC = ((CVC % 65) >> 39) ^ 1447;
                            }
                        } while (i4 != 225);
                        while (true) {
                            CVC = (CVC + i3) * 2516;
                        }
                    } else if (i2 == 121) {
                        zWr = (i >> 101) % 78;
                    } else if (i2 != 306) {
                    }
                    do {
                        zWr = (zWr >> 20) ^ 2739;
                    } while ((CVC ^ 5466) == 0);
                    do {
                        i3 = CVC;
                        i4 = i3 + 78;
                        if (i4 != 80) {
                        }
                        while (true) {
                            CVC = ((CVC % 65) >> 39) ^ 1447;
                        }
                    } while (i4 != 225);
                    while (true) {
                        CVC = (CVC + i3) * 2516;
                    }
                } while (i2 != 458);
                zWr = (i * 41) + i;
            }
            if (zIKEqwx) {
                ((DLGVGj) saJVGbODXsMY).fjfviF(str, str2, activity);
                return;
            } else {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQF^\tKRDGQ]F\u0011{JG_SZH]\u0018CGwcfv; sCmqgo)at6{{g2t~n|qy\u007f:vj7nV\u0005MsxO\\kA"));
                return;
            }
        }
        while (true) {
            int i6 = CVC;
            if (i6 + 104 == 17) {
                CVC = (i6 ^ 3058) >> 43;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:36:0x0087) to fix multi-entry loop: BACK_EDGE: B:36:0x0087 -> B:37:0x0089 */
    /* JADX DEBUG: Duplicate block (B:81:0x0120) to fix multi-entry loop: BACK_EDGE: B:81:0x0120 -> B:82:0x0125 */
    /* JADX DEBUG: Duplicate block (B:99:0x015a) to fix multi-entry loop: BACK_EDGE: B:99:0x015a -> B:100:0x015c */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void htlTjW(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.app.Activity r10) {
        /*
            r6 = this;
            java.lang.String r0 = "P^\u007fYgt^JUxg|h`gjsafzqb"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            QfgSZK.SaJVGb r0 = r6.ODXsMY(r0)
            int r1 = QfgSZK.DCUTEI.CVC
            r2 = 82
            r3 = 5465(0x1559, float:7.658E-42)
            if (r1 > r3) goto L2c
        L12:
            int r1 = QfgSZK.DCUTEI.CVC
            int r4 = r1 + 104
            r5 = 52
            if (r4 == r5) goto L25
            if (r4 == r2) goto L1d
            goto L12
        L1d:
            r4 = r1 ^ 2267(0x8db, float:3.177E-42)
            int r4 = r4 >> 105
            r4 = r4 ^ 2224(0x8b0, float:3.116E-42)
            QfgSZK.DCUTEI.CVC = r4
        L25:
            int r4 = QfgSZK.DCUTEI.CVC
            int r4 = r4 + r1
            r1 = r4 ^ 2869(0xb35, float:4.02E-42)
            QfgSZK.DCUTEI.CVC = r1
        L2c:
            boolean r1 = QfgSZK.DLGVGj.iKEqwx(r0)
            int r4 = QfgSZK.DCUTEI.CVC
            if (r4 > r3) goto L5f
        L34:
            int r7 = QfgSZK.DCUTEI.CVC
            int r8 = r7 + 13
            r9 = 7
            if (r8 == r9) goto L56
            r9 = 50
            if (r8 == r9) goto L4f
            r7 = 182(0xb6, float:2.55E-43)
            if (r8 == r7) goto L44
            goto L34
        L44:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 * 16
            int r7 = r7 % 46
            int r7 = r7 * 90
            QfgSZK.DCUTEI.CVC = r7
            goto L44
        L4f:
            int r7 = r7 >> 87
            int r7 = r7 * 54
            QfgSZK.DCUTEI.CVC = r7
            goto L34
        L56:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 % 123
            int r7 = r7 * 55
            QfgSZK.DCUTEI.CVC = r7
            goto L56
        L5f:
            if (r1 == 0) goto L170
            int r1 = QfgSZK.DCUTEI.zWr
            r5 = 2632(0xa48, float:3.688E-42)
            if (r1 > r5) goto L16a
            r7 = r4 ^ 5466(0x155a, float:7.66E-42)
            r1 = 43
            if (r7 == 0) goto L92
        L6d:
            int r7 = QfgSZK.DCUTEI.CVC
            int r8 = r7 + 26
            if (r8 == r1) goto L83
            r7 = 176(0xb0, float:2.47E-43)
            if (r8 == r7) goto L89
            r7 = 335(0x14f, float:4.7E-43)
            if (r8 == r7) goto L7c
            goto L6d
        L7c:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 * 3402
            QfgSZK.DCUTEI.CVC = r7
            goto L7c
        L83:
            r7 = r7 ^ 3381(0xd35, float:4.738E-42)
            int r7 = r7 % 124
        L87:
            QfgSZK.DCUTEI.CVC = r7
        L89:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 % 101
            int r7 = r7 % 76
            r7 = r7 ^ 3486(0xd9e, float:4.885E-42)
            goto L87
        L92:
            int r7 = QfgSZK.DCUTEI.zWr
            int r8 = QfgSZK.DCUTEI.CVC
            r9 = 17
            if (r8 > r3) goto Lb8
        L9a:
            int r10 = QfgSZK.DCUTEI.CVC
            int r7 = r10 + 130
            r8 = 42
            if (r7 == r8) goto Laf
            r8 = 211(0xd3, float:2.96E-43)
            if (r7 == r8) goto La7
            goto L9a
        La7:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 >> r2
            int r7 = r7 * 123
            QfgSZK.DCUTEI.CVC = r7
            goto La7
        Laf:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 >> r9
            int r7 = r7 % 49
            int r7 = r7 + r10
            QfgSZK.DCUTEI.CVC = r7
            goto Laf
        Lb8:
            int r10 = r7 + 26
            r0 = 97
            if (r10 == r0) goto Lff
            r0 = 138(0x8a, float:1.93E-43)
            if (r10 == r0) goto Lc3
            goto L92
        Lc3:
            int r10 = r7 + r7
            int r10 = r10 >> 122
            QfgSZK.DCUTEI.zWr = r10
            if (r8 > r3) goto Lff
        Lcb:
            int r8 = QfgSZK.DCUTEI.CVC
            int r10 = r8 + 39
            r0 = 79
            if (r10 == r0) goto Led
            r0 = 162(0xa2, float:2.27E-43)
            if (r10 == r0) goto Le5
            r0 = 229(0xe5, float:3.21E-43)
            if (r10 == r0) goto Lf5
            r0 = 283(0x11b, float:3.97E-43)
            if (r10 == r0) goto Le0
            goto Lcb
        Le0:
            int r8 = r8 >> 51
            int r8 = r8 % 49
            goto Lfd
        Le5:
            r8 = r8 ^ 5477(0x1565, float:7.675E-42)
            r10 = 168(0xa8, float:2.35E-43)
            int r8 = r8 >> r10
            QfgSZK.DCUTEI.CVC = r8
            goto Lcb
        Led:
            int r8 = r8 % 43
            r8 = r8 ^ 3716(0xe84, float:5.207E-42)
            int r8 = r8 >> 77
            QfgSZK.DCUTEI.CVC = r8
        Lf5:
            int r8 = QfgSZK.DCUTEI.CVC
            r8 = r8 ^ 4023(0xfb7, float:5.637E-42)
            int r8 = r8 * 67
            int r8 = r8 >> 66
        Lfd:
            QfgSZK.DCUTEI.CVC = r8
        Lff:
            int r8 = QfgSZK.DCUTEI.zWr
            int r10 = QfgSZK.DCUTEI.CVC
            if (r10 > r3) goto L12f
        L105:
            int r0 = QfgSZK.DCUTEI.CVC
            int r7 = r0 + 65
            if (r7 == r9) goto L120
            r8 = 60
            if (r7 == r8) goto L127
            r8 = 253(0xfd, float:3.55E-43)
            if (r7 == r8) goto L11b
            r8 = 282(0x11a, float:3.95E-43)
            if (r7 == r8) goto L118
            goto L105
        L118:
            r7 = r0 ^ 3666(0xe52, float:5.137E-42)
            goto L125
        L11b:
            r7 = r0 ^ 1350(0x546, float:1.892E-42)
            int r7 = r7 * 58
            goto L12c
        L120:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 + r0
            int r7 = r7 % 67
        L125:
            QfgSZK.DCUTEI.CVC = r7
        L127:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 + r0
            int r7 = r7 >> 78
        L12c:
            QfgSZK.DCUTEI.CVC = r7
            goto L120
        L12f:
            r9 = r10 ^ 5466(0x155a, float:7.66E-42)
            if (r9 == 0) goto L162
        L133:
            int r7 = QfgSZK.DCUTEI.CVC
            int r8 = r7 + 143
            r9 = 22
            if (r8 == r9) goto L157
            r9 = 189(0xbd, float:2.65E-43)
            if (r8 == r9) goto L148
            r7 = 317(0x13d, float:4.44E-43)
            if (r8 == r7) goto L15c
            r7 = 405(0x195, float:5.68E-43)
            if (r8 == r7) goto L14e
            goto L133
        L148:
            int r8 = r7 % 66
            int r8 = r8 + r7
            int r8 = r8 + r7
            QfgSZK.DCUTEI.CVC = r8
        L14e:
            int r7 = QfgSZK.DCUTEI.CVC
            r7 = r7 ^ 2820(0xb04, float:3.952E-42)
            int r7 = r7 >> 28
            QfgSZK.DCUTEI.CVC = r7
            goto L14e
        L157:
            r8 = 192(0xc0, float:2.69E-43)
            int r7 = r7 >> r8
        L15a:
            QfgSZK.DCUTEI.CVC = r7
        L15c:
            int r7 = QfgSZK.DCUTEI.CVC
            int r7 = r7 * 5704
            int r7 = r7 >> r1
            goto L15a
        L162:
            int r8 = r8 + r7
            int r8 = r8 + r7
            r7 = r8 ^ 3625(0xe29, float:5.08E-42)
            QfgSZK.DCUTEI.zWr = r7
            goto L92
        L16a:
            QfgSZK.DLGVGj r0 = (QfgSZK.DLGVGj) r0
            r0.htlTjW(r7, r8, r9, r10)
            return
        L170:
            java.lang.String r7 = QfgSZK.DCUTEI.DlIaRS
            java.lang.String r8 = "[pR`NU!jc\bCMDF]IUP\u0014XWHR@_OX\u001bNXJPCq$wgyt\u001eOaeemll=6X{wg}u/wn<uum8riDGHxj\u000e_p\u0005D_\u0005OI^XVRX"
            java.lang.String r8 = QfgSZK.GCXiNH.fsw(r8)
            QfgSZK.FQMcgE.OijiEz(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.htlTjW(java.lang.String, java.lang.String, java.lang.String, android.app.Activity):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:39:0x0090) to fix multi-entry loop: BACK_EDGE: B:38:0x0089 -> B:39:0x0090 */
    /* JADX DEBUG: Duplicate block (B:64:0x00f6) to fix multi-entry loop: BACK_EDGE: B:63:0x00f4 -> B:64:0x00f6 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public boolean igXuih() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, QfgSZK.SaJVGb> r0 = r5.ajBqpt
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            QfgSZK.SaJVGb r1 = (QfgSZK.SaJVGb) r1
            r2 = 5465(0x1559, float:7.658E-42)
            if (r1 != 0) goto L100
            int r1 = QfgSZK.DCUTEI.zWr
            r1 = r1 ^ 2633(0xa49, float:3.69E-42)
            if (r1 == 0) goto La
        L26:
            int r1 = QfgSZK.DCUTEI.zWr
            int r3 = r1 + 39
            r4 = 62
            if (r3 == r4) goto L9a
            r4 = 124(0x7c, float:1.74E-43)
            if (r3 == r4) goto L63
            r4 = 171(0xab, float:2.4E-43)
            if (r3 == r4) goto L37
            goto L26
        L37:
            int r3 = QfgSZK.DCUTEI.CVC
            if (r3 > r2) goto L56
        L3b:
            int r2 = QfgSZK.DCUTEI.CVC
            int r3 = r2 + 117
            r4 = 6
            if (r3 == r4) goto L50
            r2 = 37
            if (r3 == r2) goto L47
            goto L3b
        L47:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 >> 117
            int r0 = r0 % 30
            QfgSZK.DCUTEI.CVC = r0
            goto L47
        L50:
            int r2 = r2 % 106
            int r2 = r2 >> 97
            QfgSZK.DCUTEI.CVC = r2
        L56:
            r2 = r1 ^ 5939(0x1733, float:8.322E-42)
            int r2 = r2 + r1
            QfgSZK.DCUTEI.zWr = r2
            int r1 = QfgSZK.DCUTEI.CVC
            r1 = r1 ^ 5466(0x155a, float:7.66E-42)
            if (r1 == 0) goto La
            goto L10c
        L63:
            int r1 = r1 % 36
            r1 = r1 ^ 1689(0x699, float:2.367E-42)
            QfgSZK.DCUTEI.zWr = r1
            int r1 = QfgSZK.DCUTEI.CVC
            if (r1 > r2) goto L26
        L6d:
            int r1 = QfgSZK.DCUTEI.CVC
            int r0 = r1 + 65
            r2 = 69
            if (r0 == r2) goto L89
            r2 = 120(0x78, float:1.68E-43)
            if (r0 == r2) goto L7e
            r2 = 249(0xf9, float:3.49E-43)
            if (r0 == r2) goto L90
            goto L6d
        L7e:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 % 78
            int r0 = r0 >> 115
            int r0 = r0 % 93
            QfgSZK.DCUTEI.CVC = r0
            goto L7e
        L89:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 % 68
            int r0 = r0 + r1
            QfgSZK.DCUTEI.CVC = r0
        L90:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 % 65
            r2 = 163(0xa3, float:2.28E-43)
            int r0 = r0 >> r2
            QfgSZK.DCUTEI.CVC = r0
            goto L89
        L9a:
            int r0 = QfgSZK.DCUTEI.zWr
            int r2 = QfgSZK.DCUTEI.CVC
            r2 = r2 ^ 5466(0x155a, float:7.66E-42)
            if (r2 == 0) goto Lcb
        La2:
            int r2 = QfgSZK.DCUTEI.CVC
            int r3 = r2 + 143
            r4 = 95
            if (r3 == r4) goto Lba
            r4 = 197(0xc5, float:2.76E-43)
            if (r3 == r4) goto Lc1
            r4 = 305(0x131, float:4.27E-43)
            if (r3 == r4) goto Lb3
            goto La2
        Lb3:
            int r2 = r2 * 336
            r2 = r2 ^ 4581(0x11e5, float:6.42E-42)
            QfgSZK.DCUTEI.CVC = r2
            goto Lc1
        Lba:
            int r3 = r2 >> 60
            int r3 = r3 % 8
            int r3 = r3 + r2
            QfgSZK.DCUTEI.CVC = r3
        Lc1:
            int r2 = QfgSZK.DCUTEI.CVC
            r2 = r2 ^ 1069(0x42d, float:1.498E-42)
            int r2 = r2 * 92
            int r2 = r2 >> 5
            QfgSZK.DCUTEI.CVC = r2
        Lcb:
            int r0 = r0 + r1
            r2 = 33
            int r0 = r0 * r2
            int r0 = r0 >> 91
            QfgSZK.DCUTEI.zWr = r0
            int r0 = QfgSZK.DCUTEI.CVC
            r0 = r0 ^ 5466(0x155a, float:7.66E-42)
            if (r0 == 0) goto L9a
        Ld9:
            int r0 = QfgSZK.DCUTEI.CVC
            int r1 = r0 + 78
            if (r1 == r2) goto Lee
            r3 = 224(0xe0, float:3.14E-43)
            if (r1 == r3) goto Le8
            r3 = 400(0x190, float:5.6E-43)
            if (r1 == r3) goto Lf6
            goto Ld9
        Le8:
            int r1 = r0 + r0
            int r1 = r1 >> 56
            int r1 = r1 + r0
            goto Lf4
        Lee:
            int r1 = QfgSZK.DCUTEI.CVC
            int r1 = r1 % 58
            int r1 = r1 % 121
        Lf4:
            QfgSZK.DCUTEI.CVC = r1
        Lf6:
            int r1 = QfgSZK.DCUTEI.CVC
            int r1 = r1 * 108
            int r1 = r1 + r0
            int r1 = r1 % 18
            QfgSZK.DCUTEI.CVC = r1
            goto Lee
        L100:
            boolean r1 = r1.hCiIDQ()
            if (r1 == 0) goto L108
            r0 = 1
            return r0
        L108:
            int r1 = QfgSZK.DCUTEI.CVC
            if (r1 > r2) goto La
        L10c:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 + 52
            r1 = 54
            if (r0 == r1) goto L115
            goto L10c
        L115:
            int r0 = QfgSZK.DCUTEI.CVC
            int r0 = r0 >> 7
            r0 = r0 ^ 3413(0xd55, float:4.783E-42)
            QfgSZK.DCUTEI.CVC = r0
            goto L115
        L11e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DCUTEI.igXuih():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long ixgjPv() {
        return this.diggZZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:123:0x01de) to fix multi-entry loop: BACK_EDGE: B:122:0x01d7 -> B:123:0x01de */
    /* JADX DEBUG: Duplicate block (B:151:0x0238) to fix multi-entry loop: BACK_EDGE: B:151:0x0238 -> B:150:0x0236 */
    /* JADX DEBUG: Duplicate block (B:23:0x0058) to fix multi-entry loop: BACK_EDGE: B:23:0x0058 -> B:22:0x0056 */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0056, code lost:
    
        r0 = (QfgSZK.DCUTEI.CVC ^ 2864) % 38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0236, code lost:
    
        r0 = ((QfgSZK.DCUTEI.CVC % 105) >> 59) * 39;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean spnCvw(ZqidTP zqidTP, OmYuqg omYuqg, DcMfJK.fNLfdT fnlfdt, long j, int i, TMXScanEndNotifier tMXScanEndNotifier) {
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        SaJVGb saJVGbODXsMY = ODXsMY(GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"));
        boolean z2 = saJVGbODXsMY instanceof OUcgGI;
        if (zWr <= 2632) {
            while (true) {
                int i9 = zWr;
                int i10 = i9 + 91;
                if (i10 == 50) {
                    zWr = ((i9 % 73) >> 69) * 104;
                    if (CVC <= 5465) {
                        while (true) {
                            i8 = CVC;
                            int i11 = i8 + 26;
                            if (i11 == 14) {
                                while (true) {
                                    CVC = (CVC ^ 3557) + i8;
                                }
                            } else {
                                if (i11 == 165) {
                                    break;
                                }
                                if (i11 == 272) {
                                    while (true) {
                                        CVC = ((CVC ^ 2341) % 17) + i8;
                                    }
                                } else if (i11 == 402) {
                                    CVC = ((i8 + i8) * 56) + i8;
                                    break;
                                }
                            }
                        }
                        CVC = (CVC ^ 3066) + i8;
                    } else {
                        continue;
                    }
                } else if (i10 == 170) {
                    zWr = i9 >> CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
                    if ((CVC ^ 5466) != 0) {
                        while (CVC + 13 != 65) {
                        }
                        while (true) {
                            CVC = ((CVC % 101) % 46) ^ 2022;
                        }
                    }
                } else if (i10 == 210) {
                    do {
                        zWr = ((zWr % 2) % 92) * 104;
                    } while (CVC > 5465);
                    while (true) {
                        int i12 = CVC;
                        int i13 = i12 + 247;
                        if (i13 == 11) {
                            break;
                        }
                        if (i13 != 34) {
                            if (i13 == 171) {
                                CVC = (i12 + i12) >> 53;
                                break;
                            }
                        }
                        i7 = (CVC ^ 2864) % 38;
                    }
                    i7 = (CVC ^ 1480) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    while (true) {
                        CVC = i7;
                        i7 = (CVC ^ 2864) % 38;
                    }
                }
            }
        }
        if (!z2) {
            str = DlIaRS;
            str2 = "T\u007fMmGXe>aGFVFL";
        } else if (fnlfdt == DcMfJK.fNLfdT.INIT) {
            if (zWr <= 2632) {
                if ((CVC ^ 5466) != 0) {
                    while (true) {
                        int i14 = CVC;
                        int i15 = i14 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                        if (i15 != 2) {
                            if (i15 == 123) {
                                while (true) {
                                    CVC = CVC + i14 + i14;
                                }
                            } else if (i15 == 150) {
                                CVC = ((i14 ^ 3314) % 89) >> 87;
                            } else if (i15 == 163) {
                                while (true) {
                                    CVC = (CVC * 68) + i14;
                                }
                            }
                        }
                        CVC = ((CVC >> 9) % 40) + i14;
                    }
                } else {
                    while (true) {
                        i2 = zWr;
                        int i16 = i2 + 52;
                        if (i16 == 40) {
                            do {
                                zWr = ((zWr >> 71) + i2) * 98;
                            } while ((CVC ^ 5466) == 0);
                            while (true) {
                                int i17 = CVC;
                                int i18 = i17 + 260;
                                if (i18 == 78) {
                                    i3 = (i17 >> 52) * 115;
                                } else if (i18 == 119) {
                                    i3 = (i17 + i17) % 84;
                                }
                                CVC = i3;
                            }
                        } else if (i16 != 69) {
                            if (i16 != 266) {
                                if (i16 == 343) {
                                    zWr = (i2 * 2071) % 108;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    zWr = ((zWr + i2) % 88) >> 24;
                    if ((CVC ^ 5466) != 0) {
                        do {
                            int i19 = CVC;
                            i4 = i19 + 273;
                            if (i4 != 12) {
                                if (i4 == 94) {
                                    while (true) {
                                        CVC = ((CVC % 86) * 87) + i19;
                                    }
                                } else if (i4 == 165) {
                                    CVC = (i19 >> 1) % 11;
                                }
                            }
                            while (true) {
                                CVC = ((CVC ^ 5204) + i19) ^ 3791;
                            }
                        } while (i4 != 279);
                        while (true) {
                            CVC = ((CVC ^ 1095) * 35) ^ 4585;
                        }
                    }
                    zWr = (zWr ^ 2958) >> 33;
                }
            }
            z = true;
            if (!z) {
                if (CVC <= 5465) {
                    while (true) {
                        int i20 = CVC;
                        int i21 = i20 + 325;
                        if (i21 == 76) {
                            CVC = (i20 % 107) >> 7;
                            break;
                        }
                        if (i21 == 157) {
                            i5 = (i20 >> 91) % 118;
                            break;
                        }
                        if (i21 != 350) {
                            if (i21 == 471) {
                                i5 = (i20 * 9) >> 15;
                                break;
                            }
                        }
                        i5 = ((CVC % 105) >> 59) * 39;
                    }
                    while (true) {
                        CVC = i5;
                        i5 = ((CVC % 105) >> 59) * 39;
                    }
                }
                if ((j & 12288) == 0) {
                    str = DlIaRS;
                    str2 = "NrZb\u000b^qjeGL\u0003CZ\bIYA\u0014V\\PRC[Y";
                }
            } else {
                if (omYuqg.vqBjd(z)) {
                    new Thread(new ddSDPG(fnlfdt, saJVGbODXsMY, zqidTP, z, j, i, omYuqg, tMXScanEndNotifier)).start();
                    return true;
                }
                str = DlIaRS;
                str2 = "NrZb\u000bPmliIFZ\n@F\u0007FG[T@TC\\\u001eRN\u001bYXVTCi$qgpu[_}ao&)ieyg`z|v";
            }
        } else if ((zWr ^ 2633) != 0) {
            if ((CVC ^ 5466) == 0) {
                while (true) {
                    i6 = zWr;
                    int i22 = i6 + 104;
                    if (i22 == 63) {
                        zWr = (i6 ^ DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS) % 79;
                        if (CVC > 5465) {
                            break;
                        }
                    } else if (i22 == 241) {
                        while (true) {
                            zWr = (zWr >> 61) % 5;
                        }
                    } else if (i22 == 310) {
                        zWr = (i6 % 106) >> 117;
                        if (CVC <= 5465) {
                            break;
                        }
                    } else if (i22 == 413) {
                        break;
                    }
                }
                do {
                    zWr = (zWr + i6) % 115;
                } while (CVC > 5465);
                while (CVC + 208 != 49) {
                }
                while (true) {
                    CVC = (CVC % 99) ^ 1128;
                }
            }
            while (CVC + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 != 57) {
            }
            while (true) {
                CVC = ((CVC * 100) % 16) % 50;
            }
        } else {
            if (fnlfdt != DcMfJK.fNLfdT.PROFILE) {
                z = false;
            }
            if (!z) {
            }
        }
        FQMcgE.fQMcgE.sIqKDg(str, GCXiNH.fsw(str2));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:47:0x00e9) to fix multi-entry loop: BACK_EDGE: B:47:0x00e9 -> B:48:0x00eb */
    /* JADX DEBUG: Duplicate block (B:50:0x00fa) to fix multi-entry loop: BACK_EDGE: B:49:0x00f1 -> B:50:0x00fa */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00fa, code lost:
    
        QfgSZK.DCUTEI.CVC = (QfgSZK.DCUTEI.CVC * 16) ^ 3119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        QfgSZK.DCUTEI.CVC = ((QfgSZK.DCUTEI.CVC + r0) * 115) ^ 1709;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, String> zblBkD() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String strFsw;
        int i8;
        HashMap map = new HashMap();
        map.put(hBpjJd(GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}u")), GCXiNH.fsw("odU"));
        Map<String, String> map2 = QwNZnX;
        String str = map2.get(GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}uns`psyxnpwyu"));
        if (str != null) {
            map.put(hBpjJd(GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}uns`psyxnpwyu")), str);
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String strHBpjJd = hBpjJd(entry.getKey());
            String value = entry.getValue();
            if (value.equals(GCXiNH.fsw("~~Uj"))) {
                SaJVGb saJVGb = this.ajBqpt.get(entry.getKey());
                if (saJVGb != null && saJVGb.OFQuKP()) {
                    if (saJVGb.QTtQrx()) {
                        strFsw = GCXiNH.fsw("odU");
                        if (zWr <= 2632) {
                            do {
                                i8 = zWr;
                            } while (i8 + 78 != 13);
                            zWr = ((i8 >> 61) ^ 4505) + i8;
                        }
                    } else {
                        strFsw = GCXiNH.fsw("rw]");
                    }
                    map.put(strHBpjJd, strFsw);
                }
                if (zWr <= 2632) {
                    if (CVC <= 5465) {
                        do {
                            i7 = CVC;
                        } while (i7 + 117 != 3);
                        while (true) {
                            CVC = CVC + i7 + i7;
                        }
                    } else {
                        do {
                            i5 = zWr;
                        } while (i5 + 91 != 65);
                        do {
                            zWr = (zWr + i5) >> 3;
                        } while ((CVC ^ 5466) == 0);
                        while (true) {
                            i6 = CVC;
                            int i9 = i6 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                            if (i9 == 84) {
                                break;
                            }
                            if (i9 == 225) {
                                CVC = ((i6 ^ 4253) + i6) * 22;
                                break;
                            }
                            if (i9 == 243) {
                                CVC = (CVC * 16) ^ 3119;
                                break;
                            }
                            if (i9 == 400) {
                                break;
                            }
                        }
                        while (true) {
                            CVC = (CVC ^ 2347) + i6;
                        }
                    }
                }
            } else {
                map.put(strHBpjJd, value);
            }
            if ((zWr ^ 2633) != 0) {
                if ((CVC ^ 5466) != 0) {
                    do {
                        i4 = CVC;
                    } while (i4 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 6);
                    CVC = (i4 + i4) ^ 5212;
                }
                do {
                    i = zWr;
                    i2 = i + 104;
                    if (i2 != 14) {
                        if (i2 == 161) {
                            zWr = (i % 19) ^ 2783;
                        } else if (i2 == 185) {
                            while (true) {
                                zWr = zWr + i + i;
                            }
                        }
                    }
                    zWr = (zWr + i) >> 64;
                    if (CVC <= 5465) {
                        while (true) {
                            i3 = CVC;
                            int i10 = i3 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                            if (i10 != 7) {
                                if (i10 == 198) {
                                    break;
                                }
                                if (i10 == 372) {
                                    CVC = i3 >> CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA;
                                } else if (i10 != 395) {
                                }
                                CVC = ((CVC + i3) ^ 3162) >> 72;
                            }
                            CVC ^= 1950;
                        }
                        CVC = (i3 * 86) + i3 + i3;
                    }
                    while (true) {
                        zWr = zWr + i + i;
                    }
                } while (i2 != 366);
                zWr = (i + i) ^ 3052;
                if (CVC <= 5465) {
                    while (true) {
                        int i11 = CVC;
                        int i12 = i11 + 130;
                        if (i12 == 76) {
                            while (true) {
                                CVC = (CVC + i11) * 109;
                            }
                        } else {
                            if (i12 == 224) {
                                CVC = (i11 * 64) % 5;
                                break;
                            }
                            if (i12 == 416) {
                                CVC = ((i11 * 30) + i11) ^ 3859;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return map;
    }
}
