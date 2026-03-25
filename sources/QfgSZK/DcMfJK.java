package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import QfgSZK.OeawrH;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.lexisnexisrisk.threatmetrix.TMXConfig;
import com.lexisnexisrisk.threatmetrix.TMXEndNotifier;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.TMXProfilingHandle;
import com.lexisnexisrisk.threatmetrix.TMXProfilingOptions;
import com.lexisnexisrisk.threatmetrix.TMXScanEndNotifier;
import com.lexisnexisrisk.threatmetrix.TMXStatusCode;
import com.lexisnexisrisk.threatmetrix.TMXStrongAuth;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public abstract class DcMfJK {
    private static String BgeFd = null;
    public static String DlIaRS = null;
    private static final boolean dJxHRb;
    public static int fTB = 0;
    public static final DCUTEI iGmINl;
    public static int kCm = 0;
    private static final int svsvCF = 3478;
    public static String version;
    private final suEgdN DVBNek;
    private boolean aecqHb;
    private boolean ausHaw;
    private String fRBHvl;
    public final AYXKKw gYbxGz;
    public final QBiWsm hfTkCe;
    private Set<String> sBzGck;
    private Set<String> zhFcBz;
    private final GiPPlL gqdqJS = new GiPPlL();
    private volatile Thread aRGqrS = null;
    private volatile Thread QeFQWe = null;
    private volatile long gFVGZP = 0;
    private volatile int rTOlm = 0;
    private volatile boolean hQaSiC = false;
    private final Map<String, DPHsZd> OHpuMD = new ConcurrentHashMap();
    private int dPvniz = 30000;
    private volatile boolean RinfLL = false;
    private volatile int dEFDnc = 10000;
    ExKek QOBnea = null;
    OeawrH OezBCG = null;
    public final OmYuqg OJJBNZ = new OmYuqg();
    ZqidTP Umbazn = null;
    volatile TMXProfilingConnectionsInterface iGYzRr = null;
    public volatile int RGVkLd = TMXConfig.UOJivW;
    public volatile boolean UuVRT = true;
    final AtomicLong dMpqQQ = new AtomicLong(0);

    public class DCKfqP implements Runnable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RKmwCW;
        public static int UNk;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String aMhcRO;
        public static int cAu;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String gDxIpL;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String stTGMA;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String zeKGvX;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String zpjrDr;
        /* synthetic */ String RurgHL;
        /* synthetic */ String fpPPsH;
        final /* synthetic */ DIIpTV sHJiir;

        public class DCfLja implements TMXProfilingConnectionsInterface.TMXCallback {

            /* JADX INFO: Incorrect field signature: Lint; */
            static String gBjLlJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
                GCXiNH.OHr = 2270;
                fmB(false);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public DCfLja() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ void fmB(boolean z) {
                if (z) {
                    fmB(false);
                }
                gBjLlJ = GCXiNH.fsw("ntXcEU`lu\bRLY]\bUSDAVAE\u0010I_TP^^\u0003\u0018");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXCallback
            public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, InputStream inputStream) {
                if (tMXHttpResponseCode.succeeded()) {
                    return true;
                }
                FQMcgE.OijiEz(DcMfJK.DlIaRS, gBjLlJ + tMXHttpResponseCode);
                return true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            cAu = 5553;
            UNk = 6020;
            GCXiNH.OHr = 2270;
            DMb(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public DCKfqP(DIIpTV dIIpTV, String str, String str2) {
            this.sHJiir = dIIpTV;
            this.fpPPsH = str;
            this.RurgHL = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void DMb(boolean z) {
            int i;
            int i2;
            if (z) {
                DMb(false);
            }
            String strFsw = GCXiNH.fsw("ntH\u007fB^oAeL");
            if ((cAu ^ 5553) != 0) {
                do {
                    i2 = cAu;
                } while (i2 + 26 != 94);
                while (true) {
                    cAu = (cAu + i2) % 97;
                }
            } else {
                zpjrDr = strFsw;
                gDxIpL = GCXiNH.fsw("nuI");
                if ((cAu ^ 5553) == 0) {
                    aMhcRO = GCXiNH.fsw("nbI");
                    stTGMA = GCXiNH.fsw("~}^mY\u001fqpk");
                    if ((cAu ^ 5553) != 0) {
                        do {
                            i = cAu;
                        } while (i + 39 != 98);
                        cAu = (i + i) >> 94;
                    }
                    RKmwCW = GCXiNH.fsw("rc\\SBU");
                    zeKGvX = GCXiNH.fsw("s~UoN");
                    return;
                }
                while (cAu + 52 != 42) {
                }
                while (true) {
                    cAu = (cAu * 47) ^ 3193;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            int length;
            int i;
            int i2;
            DcMfJK dcMfJK = DcMfJK.this;
            if (dcMfJK.QOBnea == null) {
                return;
            }
            if ((dcMfJK.dMpqQQ.get() & 64) != 0 && UPbYzn.dTTfOR(this.sHJiir.REOdBU)) {
                long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
                UimiPO uimiPO = new UimiPO();
                TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface = DcMfJK.this.iGYzRr;
                DIIpTV dIIpTV = this.sHJiir;
                uimiPO.doTurnConnection(tMXProfilingConnectionsInterface, dIIpTV.REOdBU, DcMfJK.svsvCF, this.fpPPsH, this.RurgHL, dIIpTV.sfBaYs);
                Ohcwxs.uzCIH().DarRvM(aMhcRO, Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP));
            }
            if ((DcMfJK.this.dMpqQQ.get() & 1024) != 0) {
                long jDNxZaP2 = HJWChP.dNQGVJ.dNxZaP();
                if (!this.sHJiir.zOIkXa.isEmpty()) {
                    Iterator<String> it = this.sHJiir.zOIkXa.iterator();
                    while (it.hasNext()) {
                        DcMfJK.this.iGYzRr.resolveHostByName(DcMfJK.this.QOBnea.QslYrK(this.fpPPsH, this.RurgHL, this.sHJiir.sfBaYs, it.next()));
                        if (cAu <= 5552) {
                            do {
                                i2 = cAu;
                            } while (i2 + 65 != 74);
                            cAu = (i2 % 4) % 43;
                        }
                    }
                }
                Ohcwxs.uzCIH().DarRvM(gDxIpL, Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP2));
            }
            if ((DcMfJK.this.dMpqQQ.get() & 562949953421312L) == 0 || !UPbYzn.dTTfOR(this.sHJiir.sLXpKa)) {
                return;
            }
            DCJXGO dcjxgo = new DCJXGO();
            dcjxgo.DarRvM(RKmwCW, this.fpPPsH);
            dcjxgo.DarRvM(zpjrDr, this.RurgHL);
            dcjxgo.DarRvM(zeKGvX, this.sHJiir.sfBaYs);
            dcjxgo.DarRvM("i", "1");
            byte[] bArrZuWLRA = dcjxgo.zuWLRA();
            OeawrH oeawrH = DcMfJK.this.OezBCG;
            if (bArrZuWLRA == null) {
                if (cAu <= 5552) {
                    while (true) {
                        i = cAu;
                        int i3 = i + 104;
                        if (i3 == 88) {
                            break;
                        } else if (i3 == 155) {
                            cAu = (i ^ 5310) % 65;
                        }
                    }
                    cAu = (i * 101) >> 101;
                }
                length = 0;
            } else {
                length = bArrZuWLRA.length;
            }
            Map<String, String> mapQWpYiD = ExKek.QWpYiD(oeawrH, null, length);
            ExKek exKek = DcMfJK.this.QOBnea;
            DIIpTV dIIpTV2 = this.sHJiir;
            DcMfJK.this.iGYzRr.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, exKek.gsvlRV(dIIpTV2.sLXpKa, dIIpTV2.dFVjhZ, stTGMA), mapQWpYiD, bArrZuWLRA, new DCfLja());
        }
    }

    public class DDUqPf implements Runnable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String aknjBO;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String dzfObL;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String fhRnwQ;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String inADLd;
        public static int skY;
        public static int zgf;
        /* synthetic */ String RIHRgU;
        final /* synthetic */ TMXEndNotifier aHPaBQ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            zgf = 7848;
            GCXiNH.OHr = 2270;
            skY = 6439;
            svY(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:20:0x003f) to fix multi-entry loop: BACK_EDGE: B:20:0x003f -> B:21:0x0041 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public DDUqPf(String str, TMXEndNotifier tMXEndNotifier) {
            int i;
            int i2;
            int i3;
            this.RIHRgU = str;
            if (skY > 6438) {
                this.aHPaBQ = tMXEndNotifier;
                return;
            }
            do {
                i = skY;
            } while (i + 13 != 42);
            loop1: while (true) {
                skY = (skY % 74) + i;
                if ((zgf ^ 7848) != 0) {
                    do {
                        i2 = zgf;
                        i3 = i2 + 39;
                        if (i3 == 84) {
                            while (true) {
                                zgf = (zgf + i2) % 30;
                            }
                        } else if (i3 == 180) {
                            zgf = (i2 * 58) + i2;
                            break loop1;
                        } else if (i3 == 264) {
                            break loop1;
                        }
                    } while (i3 != 375);
                    zgf = (i2 >> 60) + i2 + i2;
                }
            }
            while (true) {
                zgf = ((zgf >> 45) + i2) ^ 4641;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:16:0x0047) to fix multi-entry loop: BACK_EDGE: B:15:0x0041 -> B:16:0x0047 */
        public static /* synthetic */ void svY(boolean z) {
            if (z) {
                svY(false);
            }
            dzfObL = GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014g\u007fiqZJUYUNP[VRlkm\"loZYea+cz(iya4es}yk0=Lw\u007fxkr'HDOx.]Ep@\rXMC\u0007KVHIY^J YeCFUZX\u0017WO*_AUOzdIgmplef|puu<pq{U}w3}f6~viBAbD{2hM\u0007ZEM\u0007KYL*");
            aknjBO = GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014g[\\U@KI\u001cLRPTR\u0006rejvhnY\foky*`fnb5`|2wyawnt");
            String strFsw = GCXiNH.fsw("NeIcEV@kx@\u0002QOX]BEA\u0014USX\\JZ");
            if ((zgf ^ 7848) == 0) {
                inADLd = strFsw;
                fhRnwQ = GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR");
                return;
            }
            while (true) {
                int i = zgf;
                int i2 = i + 39;
                if (i2 != 72) {
                    if (i2 == 235) {
                        zgf = ((i + i) >> 77) + i;
                        break;
                    } else if (i2 == 332) {
                        zgf = ((i * 64) % 66) % 123;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                zgf = (zgf % 98) ^ 4901;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:59:0x0106) to fix multi-entry loop: BACK_EDGE: B:58:0x00ff -> B:59:0x0106 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0120 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0001 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v26 */
        /* JADX WARN: Type inference failed for: r0v27 */
        /* JADX WARN: Type inference failed for: r0v28 */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.lexisnexisrisk.threatmetrix.TMXStatusCode] */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ?? r2;
            int i;
            int i2;
            int i3;
            TMXStatusCode tMXStatusCode;
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
            } catch (Throwable th) {
                th = th;
                r2 = r0;
            }
            try {
                try {
                    try {
                        DcMfJK dcMfJK = DcMfJK.this;
                        if (dcMfJK.OJJBNZ.QjzqRB(dcMfJK.RGVkLd)) {
                            OAjjVP oAjjVPQCjLjM = DcMfJK.iGmINl.QCjLjM();
                            if ((DcMfJK.this.dMpqQQ.get() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == 0 || oAjjVPQCjLjM == null) {
                                FQMcgE.svhCHd(DcMfJK.DlIaRS, dzfObL);
                            } else {
                                TMXStrongAuth.AuthParamResult authParamResultZnKlvJ = oAjjVPQCjLjM.znKlvJ(this.RIHRgU);
                                if (authParamResultZnKlvJ == null) {
                                    FQMcgE.OijiEz(DcMfJK.DlIaRS, fhRnwQ);
                                } else {
                                    DcMfJK.this.$invoke$special$Rtjmuc(null, authParamResultZnKlvJ.vklRO.UvUzrV, this.aHPaBQ);
                                    if ((zgf ^ 7848) == 0) {
                                        return;
                                    }
                                    while (true) {
                                        int i4 = zgf;
                                        int i5 = i4 + 65;
                                        if (i5 == 73) {
                                            zgf = (i4 % 39) * 4;
                                        } else if (i5 == 111) {
                                            zgf = (i4 % 50) * 99;
                                            return;
                                        } else if (i5 == 216) {
                                            while (true) {
                                                zgf = ((zgf >> 68) ^ 3484) >> 37;
                                            }
                                        }
                                    }
                                }
                            }
                            tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Failed;
                        } else {
                            FQMcgE.OijiEz(DcMfJK.DlIaRS, aknjBO);
                            tMXStatusCode = TMXStatusCode.TMX_Internal_Error;
                        }
                        DcMfJK.this.$invoke$special$Rtjmuc(null, tMXStatusCode, this.aHPaBQ);
                    } catch (Throwable th2) {
                        FQMcgE.OijiEz(DcMfJK.DlIaRS, inADLd, th2);
                        TMXStatusCode tMXStatusCode2 = TMXStatusCode.TMX_StrongAuth_Failed;
                        ORrpqH.uzCIH().seuMaA(th2);
                        DcMfJK.this.$invoke$special$Rtjmuc(null, tMXStatusCode2, this.aHPaBQ);
                        int i6 = skY;
                        r0 = i6;
                        if (i6 <= 6438) {
                            while (true) {
                                int i7 = skY;
                                int i8 = i7 + 65;
                                if (i8 == 16) {
                                    int i9 = i7 ^ 54;
                                    skY = i9;
                                    r0 = i9;
                                    break;
                                }
                                if (i8 == 166) {
                                    skY = i7 ^ TypedValues.PositionType.TYPE_PERCENT_X;
                                    if ((zgf ^ 7848) != 0) {
                                        do {
                                            i = zgf;
                                            i2 = i + 78;
                                            if (i2 != 75) {
                                                if (i2 == 162) {
                                                    i3 = i + i + i;
                                                } else if (i2 == 301) {
                                                    i3 = (i >> WebSocketProtocol.PAYLOAD_SHORT) * 55;
                                                }
                                                zgf = i3;
                                                break;
                                            }
                                            break;
                                        } while (i2 != 401);
                                        zgf = ((zgf + i) * 48) ^ 2358;
                                        while (true) {
                                            zgf = ((zgf + i) * 55) >> 62;
                                        }
                                    }
                                } else if (i8 == 336) {
                                    skY = (i7 >> 57) ^ 4863;
                                }
                            }
                        }
                    }
                } catch (IllegalArgumentException e) {
                    TMXStatusCode tMXStatusCode3 = TMXStatusCode.TMX_StrongAuth_Unsupported;
                    ORrpqH.uzCIH().seuMaA(e);
                    DcMfJK.this.$invoke$special$Rtjmuc(null, tMXStatusCode3, this.aHPaBQ);
                }
            } catch (Throwable th3) {
                th = th3;
                DcMfJK.this.$invoke$special$Rtjmuc(r0, r2, this.aHPaBQ);
                throw th;
            }
        }
    }

    public class DGTeJD implements Runnable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RjChe = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RrqUwJ = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String UEttMP = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String UmZZfF = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String dHGfGE = null;
        public static int fSd = 5673;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String gQGwgi;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String gYgXSd;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String guPIAr;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String hDvATf;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String hGruUa;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String hNpUlx;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String iFvvwc;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String sCwYJO;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String zQJTmN;
        final /* synthetic */ DPHsZd DzkhFz;
        final /* synthetic */ ZqidTP QXbndZ;
        final /* synthetic */ TMXConfig RFknhw;
        final /* synthetic */ long iNwWXS;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            sbu(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public DGTeJD(TMXConfig tMXConfig, ZqidTP zqidTP, DPHsZd dPHsZd, long j) {
            this.RFknhw = tMXConfig;
            this.QXbndZ = zqidTP;
            this.DzkhFz = dPHsZd;
            this.iNwWXS = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void sbu(boolean z) {
            if (z) {
                sbu(false);
            }
            sCwYJO = GCXiNH.fsw("Z~O,ZDh{x\bRFX@GC\u0016SF\\_\u0011CNHXX\u001bJK]QCwamads\u001eWt");
            UmZZfF = GCXiNH.fsw("x\u007fZnGTNnxAMMY");
            hGruUa = GCXiNH.fsw("=>\u001b");
            gQGwgi = GCXiNH.fsw("Y~RbL\u0011rrc_\u0002JD@\\\u0007EAAUT");
            UEttMP = GCXiNH.fsw("yxHmI]dQ|\\KLDZ");
            iFvvwc = GCXiNH.fsw("41Oc\u000b");
            RjChe = GCXiNH.fsw("|aK`RXoy,[CUOM\bHFA]\\\\B\u0010\u0007");
            zQJTmN = GCXiNH.fsw("I\\c\\Y^gw`ALD\u0007\u0011\u0006\u0017\u001b\r\f\u001eX_Y");
            RrqUwJ = GCXiNH.fsw("ldRi_adleGF");
            guPIAr = GCXiNH.fsw("|gZeGPcri");
            hNpUlx = GCXiNH.fsw("t\u007fRx\u000bRns|DGWOM\bTCVWVABVZRQE");
            gYgXSd = GCXiNH.fsw("XiXi[Ehqb\bKM\n@FNB");
            dHGfGE = GCXiNH.fsw("SpOe]T!reJQ\u0019\n");
            hDvATf = GCXiNH.fsw("h\u007fZzJXm\u007fnDG");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                FQMcgE.OijiEz(DcMfJK.DlIaRS, gQGwgi);
                DcMfJK.this.gqdqJS.config(this.RFknhw);
                AxsJAY.uzCIH().QVAiDq(this.QXbndZ, zQJTmN, FQMcgE.dPkBzA(), FQMcgE.UfveVb());
                String str = DcMfJK.DlIaRS;
                StringBuilder sb = new StringBuilder();
                sb.append(dHGfGE);
                sb.append(AxsJAY.uzCIH().gGvvIC() ? guPIAr : hDvATf);
                FQMcgE.DFbvW(str, sb.toString());
                this.DzkhFz.fkESqH();
                DcMfJK.this.OezBCG = new OeawrH(this.RFknhw.zrcPaS(), this.RFknhw.ROpbut(), DcMfJK.this.dMpqQQ, this.iNwWXS, this.DzkhFz);
                FQMcgE.fQMcgE.sIqKDg(DcMfJK.DlIaRS, RjChe + this.DzkhFz.Swccd(UmZZfF) + hGruUa + this.DzkhFz.Swccd(UEttMP) + iFvvwc + DcMfJK.this.dMpqQQ.get());
                DcMfJK.this.$invoke$special$aKhcqp(this.DzkhFz.Swccd(UEttMP), this.DzkhFz.Swccd(UmZZfF));
                FQMcgE.fQMcgE.sIqKDg(DcMfJK.DlIaRS, sCwYJO, Integer.valueOf(this.DzkhFz.DPHNDa(RrqUwJ)));
                DcMfJK.this.rTOlm = this.DzkhFz.DPHNDa(RrqUwJ);
                if ((DcMfJK.this.dMpqQQ.get() & PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) == 0) {
                    DcMfJK.this.dzkkkq(this.QXbndZ);
                }
                DcMfJK.this.$invoke$special$ROgMPW(this.QXbndZ);
                UPbYzn.DRuYWY(null);
                if (!this.RFknhw.QBjHmV()) {
                    DCUTEI dcutei = DcMfJK.iGmINl;
                    ZqidTP zqidTPZrcPaS = this.RFknhw.zrcPaS();
                    DcMfJK dcMfJK = DcMfJK.this;
                    dcutei.spnCvw(zqidTPZrcPaS, dcMfJK.OJJBNZ, fNLfdT.INIT, 0L, dcMfJK.dPvniz, null);
                }
                DcMfJK.this.gYbxGz.finishInit();
                DcMfJK.this.hfTkCe.finishInit();
                DcMfJK.this.OJJBNZ.RIKbBf(true);
                FQMcgE.OijiEz(DcMfJK.DlIaRS, hNpUlx);
            } catch (Throwable th) {
                ORrpqH.uzCIH().seuMaA(th);
                DcMfJK.this.OJJBNZ.RIKbBf(false);
                FQMcgE.OijiEz(DcMfJK.DlIaRS, gYgXSd + th.toString());
            }
        }
    }

    public class DIADVb implements TMXProfilingHandle {
        public static int Cvk = 2142;
        public static int cFB = 8101;
        private String asOVqk;
        private final AtomicInteger ietdrk = new AtomicInteger(0);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DIADVb(String str) {
            this.asOVqk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingHandle
        public void cancel() {
            DcMfJK.this.RJOkX();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingHandle
        public String getSessionID() {
            return this.asOVqk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingHandle
        public void sendBehavioSecData() {
            int i;
            boolean zCompareAndSet = this.ietdrk.compareAndSet(0, 1);
            if (Cvk <= 2141) {
                while (true) {
                    i = Cvk;
                    int i2 = i + 13;
                    if (i2 == 46) {
                        Cvk = ((i >> 86) * 125) ^ 2399;
                    } else if (i2 == 141) {
                        break;
                    }
                }
                Cvk = (i ^ 1827) * 105;
            }
            if (zCompareAndSet) {
                DcMfJK.this.QwvEab();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingHandle
        public void stopBehavioSecDataCollection() {
            DcMfJK.this.fupbxE();
        }
    }

    public class DSqxTE implements Runnable {
        public static int OXc;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String dlsJLa;
        final /* synthetic */ TMXStatusCode EnAgf;
        /* synthetic */ String ihgRSX;
        final /* synthetic */ TMXEndNotifier sYbZFp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            OXc = 1967;
            GCXiNH.OHr = 2270;
            jh(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public DSqxTE(TMXEndNotifier tMXEndNotifier, String str, TMXStatusCode tMXStatusCode) {
            int i;
            this.sYbZFp = tMXEndNotifier;
            if (OXc > 1966) {
                this.ihgRSX = str;
                this.EnAgf = tMXStatusCode;
            } else {
                do {
                    i = OXc;
                } while (i + 13 != 20);
                while (true) {
                    OXc = (OXc ^ 4659) + i;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void jh(boolean z) {
            if (z) {
                jh(false);
            }
            dlsJLa = GCXiNH.fsw("H\u007f^t[TbjiL\u0002FRJMWB\\[]\u0012^SLKON^^\u0019O_Ck$`cmlWBn$X~lxRf[{g{wyjl=");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.sYbZFp.complete(new TMXProfilingHandle.Result(this.ihgRSX, this.EnAgf));
            } catch (Throwable th) {
                FQMcgE.svhCHd(DcMfJK.DlIaRS, dlsJLa + th);
                ORrpqH.uzCIH().seuMaA(th);
            }
        }
    }

    /* JADX INFO: renamed from: QfgSZK.DcMfJK$DcMfJK, reason: collision with other inner class name */
    public final class RunnableC0003DcMfJK implements Runnable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String OczcNd = null;
        public static int OiG = 4601;
        public static int ccS;
        final TMXEndNotifier fJFxQM;
        final TMXProfilingHandle.Result vklRO;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            if (OiG > 4600) {
                ccS = 5880;
                sCB(false);
            } else {
                while (OiG + 13 != 48) {
                }
                while (true) {
                    OiG = ((OiG ^ 2097) * 94) >> 118;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        
            if (r2 <= 4600) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            r2 = QfgSZK.DcMfJK.RunnableC0003DcMfJK.ccS;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if ((r2 + 13) == 83) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            QfgSZK.DcMfJK.RunnableC0003DcMfJK.ccS = r2 * 7254;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            if ((QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG ^ 4601) == 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            r2 = QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG;
            r3 = r2 + 26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r3 == 15) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (r3 == 52) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            if (r3 == 180) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (r3 == 251) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        
            QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG = (r2 ^ 2742) >> 53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        
            QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG = (r2 + r2) % 117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        
            QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG = (QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG % okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT) >> 11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        
            QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG = (QfgSZK.DcMfJK.RunnableC0003DcMfJK.OiG >> 82) % 93;
         */
        /* JADX WARN: Path cross not found for [B:49:?, B:41:?], limit reached: 47 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0057 -> B:13:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RunnableC0003DcMfJK(TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier) {
            int i = OiG;
            if ((i ^ 4601) != 0) {
                while (OiG + 13 != 12) {
                }
                while (true) {
                    OiG = (OiG >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) % 87;
                }
            } else if ((ccS ^ 5880) == 0) {
                this.vklRO = result;
                this.fJFxQM = tMXEndNotifier;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void sCB(boolean z) {
            if (z) {
                sCB(false);
            }
            OczcNd = GCXiNH.fsw("H\u007f^t[TbjiL\u0002FRJMWB\\[]\u0012^SLKON^^\u0019O_Ck$`cmlWBn$NdmFhb|rzwc0");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            TMXEndNotifier tMXEndNotifier = this.fJFxQM;
            if (tMXEndNotifier != null) {
                try {
                    tMXEndNotifier.complete(this.vklRO);
                } catch (Throwable th) {
                    FQMcgE.svhCHd(DcMfJK.DlIaRS, OczcNd + th);
                    ORrpqH.uzCIH().seuMaA(th);
                }
            }
        }
    }

    public static class Omnske implements TMXProfilingConnectionsInterface.TMXCallback {
        public static int OTR;
        public static int _KC;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String glfJEt;
        String TpLtq;
        TMXProfilingConnectionsInterface.TMXHttpResponseCode gVrqTV = new TMXProfilingConnectionsInterface.TMXHttpResponseCode(-2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            OTR = 1340;
            _KC = 4379;
            GCXiNH.OHr = 2270;
            DsL(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Omnske(String str) {
            this.TpLtq = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void DsL(boolean z) {
            if (z) {
                DsL(false);
            }
            glfJEt = GCXiNH.fsw("[pR`NU!jc\bPF[\\MTB\u0015ON\u0012FY[V\u001dTONI\u0018ECvtllre\u001eWt");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TMXStatusCode getStatusCode() {
            int httpResponseCode = this.gVrqTV.getHttpResponseCode();
            if (httpResponseCode == 200) {
                return TMXStatusCode.TMX_OK;
            }
            switch (httpResponseCode) {
                case -15:
                    return TMXStatusCode.TMX_CRLError;
                case -14:
                    return TMXStatusCode.TMX_CertStoreError;
                case -13:
                    return TMXStatusCode.TMX_CertPathValidatorError;
                case -12:
                    return TMXStatusCode.TMX_CertPathBuilderError;
                case -11:
                    return TMXStatusCode.TMX_CertificateParsingError;
                case -10:
                    return TMXStatusCode.TMX_CertificateNotYetValid;
                case -9:
                    return TMXStatusCode.TMX_CertificateExpired;
                case -8:
                    return TMXStatusCode.TMX_CertificateEncodingError;
                case -7:
                    return TMXStatusCode.TMX_CertificateError;
                case -6:
                    return TMXStatusCode.TMX_Certificate_Mismatch;
                case -5:
                    return TMXStatusCode.TMX_HostVerification_Error;
                case -4:
                    return TMXStatusCode.TMX_NetworkTimeout_Error;
                case -3:
                    return TMXStatusCode.TMX_HostNotFound_Error;
                case -2:
                    return TMXStatusCode.TMX_NotYet;
                default:
                    return TMXStatusCode.TMX_Connection_Error;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006f -> B:31:0x0071). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode r7, java.io.InputStream r8) {
            /*
                r6 = this;
                r6.gVrqTV = r7
                boolean r8 = r7.succeeded()
                r0 = 1
                if (r8 != 0) goto L98
                int r8 = QfgSZK.DcMfJK.Omnske.OTR
                r8 = r8 ^ 1340(0x53c, float:1.878E-42)
                if (r8 == 0) goto L47
            Lf:
                int r7 = QfgSZK.DcMfJK.Omnske.OTR
                int r8 = r7 + 39
                r0 = 46
                if (r8 == r0) goto L3d
                r0 = 108(0x6c, float:1.51E-43)
                if (r8 == r0) goto L32
                r0 = 258(0x102, float:3.62E-43)
                if (r8 == r0) goto L2a
                r0 = 296(0x128, float:4.15E-43)
                if (r8 == r0) goto L24
                goto Lf
            L24:
                int r8 = r7 >> 43
                int r8 = r8 % 52
                QfgSZK.DcMfJK.Omnske.OTR = r8
            L2a:
                int r8 = QfgSZK.DcMfJK.Omnske.OTR
                int r8 = r8 % 20
                int r8 = r8 + r7
                QfgSZK.DcMfJK.Omnske.OTR = r8
                goto L3d
            L32:
                int r7 = QfgSZK.DcMfJK.Omnske.OTR
                int r7 = r7 * 124
                r7 = r7 ^ 1174(0x496, float:1.645E-42)
                int r7 = r7 >> 26
                QfgSZK.DcMfJK.Omnske.OTR = r7
                goto L32
            L3d:
                int r8 = QfgSZK.DcMfJK.Omnske.OTR
                r8 = r8 ^ 1132(0x46c, float:1.586E-42)
                int r8 = r8 + r7
                int r8 = r8 * 63
                QfgSZK.DcMfJK.Omnske.OTR = r8
                goto Lf
            L47:
                java.lang.String r8 = QfgSZK.DcMfJK.RKDWNf()
                java.lang.String r1 = QfgSZK.DcMfJK.Omnske.glfJEt
                r2 = 2
                java.lang.String[] r2 = new java.lang.String[r2]
                int r3 = QfgSZK.DcMfJK.Omnske.OTR
                r3 = r3 ^ 1340(0x53c, float:1.878E-42)
                if (r3 == 0) goto L79
            L56:
                int r4 = QfgSZK.DcMfJK.Omnske.OTR
                int r7 = r4 + 26
                r8 = 32
                if (r7 == r8) goto L6c
                r8 = 147(0x93, float:2.06E-43)
                if (r7 == r8) goto L67
                r8 = 259(0x103, float:3.63E-43)
                if (r7 == r8) goto L71
                goto L56
            L67:
                int r7 = r4 * 3
                int r7 = r7 >> 20
                goto L6f
            L6c:
                int r7 = r4 % 50
                int r7 = r7 + r4
            L6f:
                QfgSZK.DcMfJK.Omnske.OTR = r7
            L71:
                int r7 = QfgSZK.DcMfJK.Omnske.OTR
                int r7 = r7 * 88
                int r7 = r7 + r4
                int r7 = r7 * 104
                goto L6f
            L79:
                java.lang.String r4 = r6.TpLtq
                r5 = 0
                r2[r5] = r4
                if (r3 == 0) goto L8e
            L80:
                int r7 = QfgSZK.DcMfJK.Omnske.OTR
                int r8 = r7 + 52
                r0 = 90
                if (r8 == r0) goto L89
                goto L80
            L89:
                int r7 = r7 >> 107
                QfgSZK.DcMfJK.Omnske.OTR = r7
                goto L80
            L8e:
                java.lang.String r7 = r7.toString()
                r2[r0] = r7
                QfgSZK.FQMcgE.DFbvW(r8, r1, r2)
                return r5
            L98:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DcMfJK.Omnske.onComplete(com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode, java.io.InputStream):boolean");
        }
    }

    public static class RKUgwx extends Omnske {
        public static int JSA = 0;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String OnMjqT = null;
        public static int hDP = 7963;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String iBgwze;
        String KDpAU;
        String OuEEPx;
        DIIpTV QzhmRx;
        CountDownLatch fazARR;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            JSA = 4917;
            GCXiNH.OHr = 2270;
            fbC(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RKUgwx(String str, CountDownLatch countDownLatch, DIIpTV dIIpTV, String str2, String str3) {
            super(str);
            this.fazARR = countDownLatch;
            this.QzhmRx = dIIpTV;
            this.OuEEPx = str2;
            this.KDpAU = str3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:31:0x005e) to fix multi-entry loop: BACK_EDGE: B:30:0x0056 -> B:31:0x005e */
        /* JADX DEBUG: Duplicate block (B:46:0x0095) to fix multi-entry loop: BACK_EDGE: B:46:0x0095 -> B:47:0x0097 */
        public static /* synthetic */ void fbC(boolean z) {
            int i;
            int i2;
            if (z) {
                fbC(false);
            }
            if (JSA > 4916) {
                iBgwze = GCXiNH.fsw("[pR`NU!jc\bPFKM\bS^P\u0014Z\\AE[\u001eNHI_XU");
                OnMjqT = GCXiNH.fsw("^~UjBVtli\bPF[\\MTB\u0015GFQRUJZXX\u001bXLL\u0017Uqvfcl W_)j~fe");
                return;
            }
            if (hDP > 7962) {
                while (true) {
                    int i3 = JSA;
                    int i4 = i3 + 26;
                    if (i4 == 45) {
                        while (true) {
                            JSA = ((JSA >> 2) * 120) + i3;
                            if ((hDP ^ 7963) != 0) {
                                while (true) {
                                    i = hDP;
                                    int i5 = i + 52;
                                    if (i5 == 79) {
                                        hDP = ((i >> 101) + i) * 93;
                                        break;
                                    } else if (i5 == 214) {
                                        i2 = ((i % 58) * 70) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                                        break;
                                    } else if (i5 == 399) {
                                        break;
                                    }
                                }
                                i2 = ((hDP + i) >> 99) % 86;
                                hDP = i2;
                            }
                        }
                    } else if (i4 == 212) {
                        while (true) {
                            int i6 = JSA;
                            if ((hDP ^ 7963) != 0) {
                                break;
                            } else {
                                JSA = ((i6 >> 48) + i3) % 48;
                            }
                        }
                        while (true) {
                            int i7 = hDP;
                            int i8 = i7 + 91;
                            if (i8 == 42) {
                                hDP = ((i7 % 114) >> 91) ^ 5266;
                                break;
                            } else {
                                if (i8 == 194) {
                                    break;
                                }
                                if (i8 == 374) {
                                    hDP = ((i7 % 62) + i7) % 27;
                                } else if (i8 == 447) {
                                    while (true) {
                                        hDP = (hDP * 118) >> 56;
                                    }
                                }
                            }
                        }
                        while (true) {
                            hDP = (hDP ^ 2858) % 30;
                        }
                    } else if (i4 == 236) {
                        int i9 = hDP;
                        if ((i9 ^ 7963) != 0) {
                            while (true) {
                                int i10 = hDP;
                                if (i10 + 104 == 81) {
                                    hDP = ((i10 ^ 4391) >> 44) + i10;
                                }
                            }
                        } else {
                            JSA = ((i3 * 5) >> 83) + i3;
                            if (i9 <= 7962) {
                                break;
                            }
                        }
                    }
                }
            }
            while (true) {
                int i11 = hDP;
                int i12 = i11 + 39;
                if (i12 != 16) {
                    if (i12 == 122) {
                        hDP = (i11 ^ 1072) >> 92;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                hDP = ((hDP ^ 1115) % 85) % 31;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // QfgSZK.DcMfJK.Omnske, com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, InputStream inputStream) {
            if (super.onComplete(tMXHttpResponseCode, inputStream)) {
                if (inputStream == null) {
                    FQMcgE.DFbvW(DcMfJK.DlIaRS, OnMjqT);
                } else {
                    try {
                        this.QzhmRx.iCPUKe(inputStream, this.OuEEPx, this.KDpAU);
                        this.fazARR.countDown();
                        return true;
                    } catch (InterruptedIOException e) {
                        FQMcgE.DFbvW(DcMfJK.DlIaRS, iBgwze);
                        ORrpqH.uzCIH().seuMaA(e);
                    }
                }
            }
            this.fazARR.countDown();
            return false;
        }
    }

    public final class dMCrTj implements Runnable {
        public static int OWv = 3397;
        public static int ujO = 1988;
        private boolean aWYezJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:14:0x0031) to fix multi-entry loop: BACK_EDGE: B:13:0x002a -> B:14:0x0031 */
        public dMCrTj() {
            int i;
            int i2;
            int i3;
            int i4 = ujO;
            if (OWv > 3396) {
                if (i4 <= 1987) {
                    while (true) {
                        i = ujO;
                        if ((OWv ^ 3397) != 0) {
                            while (true) {
                                int i5 = OWv;
                                int i6 = i5 + 91;
                                if (i6 != 68) {
                                    if (i6 == 168) {
                                        OWv = ((i5 * 20) % WalletImportError.ERROR_CODE_AA_EXIST) * 94;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            OWv = ((OWv >> 89) ^ 2272) * 18;
                        }
                        int i7 = i + 13;
                        if (i7 == 21) {
                            ujO = ((ujO ^ 1868) + i) >> 15;
                            break;
                        } else if (i7 == 180) {
                            break;
                        }
                    }
                    ujO = (ujO + i) >> 94;
                }
                this.aWYezJ = false;
                return;
            }
            do {
                i2 = OWv;
                i3 = i2 + 78;
                if (i3 != 19) {
                    if (i3 == 175) {
                        OWv = (i2 * 3185) ^ 2681;
                    }
                }
                while (true) {
                    OWv = ((OWv ^ 3476) % 105) + i2;
                }
            } while (i3 != 248);
            while (true) {
                OWv = ((OWv >> 45) + i2) ^ 2726;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fcfzuX() {
            return this.aWYezJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                FYtjSf.DuXjdv(DcMfJK.this.Umbazn.Umbazn);
                suEgdN suegdn = DcMfJK.this.DVBNek;
                String advertisingId = (suegdn == null || !DcMfJK.this.hQaSiC || (DcMfJK.this.dMpqQQ.get() & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == 0) ? null : suegdn.getAdvertisingId(DcMfJK.this.RGVkLd / 10);
                if (DcMfJK.this.OJJBNZ.hfFNez() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                DcMfJK dcMfJK = DcMfJK.this;
                dcMfJK.OezBCG.fmdvVn(advertisingId, dcMfJK.OJJBNZ);
            } catch (InterruptedException e) {
                ORrpqH.uzCIH().seuMaA(e);
                this.aWYezJ = true;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class fNLfdT {
        public static int EUl;
        public static final fNLfdT INIT;
        public static final fNLfdT PROFILE;
        public static final fNLfdT SCAN_PACKAGES;
        private static final /* synthetic */ fNLfdT[] gkhjaB;
        public static int kLm;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            EUl = 6486;
            kLm = 5562;
            GCXiNH.OHr = 2270;
            PROFILE = new fNLfdT(GCXiNH.fsw("MCtJb}D"), 0);
            SCAN_PACKAGES = new fNLfdT(GCXiNH.fsw("NRzBta@]Giefy"), 1);
            INIT = new fNLfdT(GCXiNH.fsw("T_rX"), 2);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private fNLfdT(String str, int i) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ fNLfdT[] gEmmrt() {
            int i;
            fNLfdT[] fnlfdtArr = new fNLfdT[3];
            fnlfdtArr[0] = PROFILE;
            fnlfdtArr[1] = SCAN_PACKAGES;
            if ((EUl ^ 6486) != 0) {
                while (true) {
                    int i2 = EUl;
                    int i3 = i2 + 26;
                    if (i3 == 48) {
                        EUl = (i2 * 83) + i2;
                    } else {
                        if (i3 == 223) {
                            i = (i2 >> 26) * 124;
                            break;
                        }
                        if (i3 != 412) {
                            if (i3 == 423) {
                                i = (i2 + i2) % 12;
                                break;
                            }
                        }
                    }
                    EUl = ((EUl + i2) >> 107) + i2;
                }
                EUl = i;
            }
            fnlfdtArr[2] = INIT;
            return fnlfdtArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static fNLfdT valueOf(String str) {
            return (fNLfdT) Enum.valueOf(fNLfdT.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static fNLfdT[] values() {
            return (fNLfdT[]) gkhjaB.clone();
        }
    }

    public static class fNUfqk extends Exception {
        final TMXStatusCode DkckDm;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public fNUfqk(TMXStatusCode tMXStatusCode) {
            this.DkckDm = tMXStatusCode;
        }
    }

    public class fbSiEC implements Runnable {
        public static int cwa = 1556;
        public static int kAp = 1038;
        /* synthetic */ String DBVhdd;
        final /* synthetic */ TMXStrongAuth.AuthMethod RFQVvp;
        /* synthetic */ String RIHRgU;
        /* synthetic */ String RurgHL;
        final /* synthetic */ TMXEndNotifier TlZLd;
        final /* synthetic */ TMXStrongAuth.StrongAuthCallback UBWssA;
        /* synthetic */ String gRpFzY;
        /* synthetic */ String hKwXpW;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public fbSiEC(String str, String str2, String str3, String str4, String str5, TMXStrongAuth.AuthMethod authMethod, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
            int i;
            int i2;
            this.RurgHL = str;
            this.gRpFzY = str2;
            this.hKwXpW = str3;
            this.DBVhdd = str4;
            this.RIHRgU = str5;
            this.RFQVvp = authMethod;
            if (cwa <= 1555) {
                do {
                    i = cwa;
                    i2 = i + 39;
                    if (i2 != 52) {
                        if (i2 != 147) {
                            if (i2 == 249) {
                                cwa = (i ^ 4652) >> 123;
                            }
                        }
                        cwa = (cwa >> 19) + i;
                        break;
                    }
                    break;
                } while (i2 != 299);
                cwa = ((cwa ^ 3817) * 49) + i;
                cwa = (cwa >> 87) ^ 1887;
            }
            this.UBWssA = strongAuthCallback;
            this.TlZLd = tMXEndNotifier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:11:0x0023) to fix multi-entry loop: BACK_EDGE: B:10:0x001e -> B:11:0x0023 */
        /* JADX DEBUG: Duplicate block (B:29:0x0065) to fix multi-entry loop: BACK_EDGE: B:29:0x0065 -> B:30:0x0067 */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        
            QfgSZK.DcMfJK.fbSiEC.cwa = ((QfgSZK.DcMfJK.fbSiEC.cwa ^ 1112) + r2) % 100;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            DcMfJK dcMfJK = DcMfJK.this;
            ExKek exKek = dcMfJK.QOBnea;
            int i7 = cwa ^ 1556;
            if (i7 != 0) {
                while (true) {
                    i6 = cwa;
                    int i8 = i6 + 13;
                    if (i8 != 71) {
                        if (i8 == 266) {
                            cwa = ((i6 % 19) ^ 3462) >> 10;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    cwa = (cwa + i6) ^ 2858;
                }
            } else {
                String str = exKek != null ? exKek.OuEEPx : null;
                String str2 = this.RurgHL;
                String str3 = this.gRpFzY;
                String str4 = this.hKwXpW;
                String str5 = this.DBVhdd;
                int i9 = kAp;
                if (i7 != 0) {
                    while (true) {
                        i5 = cwa;
                        int i10 = i5 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                        if (i10 == 39) {
                            cwa = ((i5 >> 54) ^ 1945) * 40;
                            break;
                        } else if (i10 != 74) {
                            if (i10 == 270) {
                                break;
                            } else if (i10 == 369) {
                                cwa = ((i5 >> 83) % 104) ^ 2197;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cwa = ((cwa >> 57) ^ 2401) + i5;
                }
                if ((i9 ^ MTPushConstants.Message.CODE_MESSAGE_DELETED) == 0) {
                    String str6 = this.RIHRgU;
                    TMXStrongAuth.AuthMethod authMethod = this.RFQVvp;
                    if (cwa <= 1555) {
                        do {
                            i = cwa;
                        } while (i + 39 != 98);
                        cwa = i + i + i;
                    }
                    dcMfJK.$invoke$special$aGOrKO(str, str2, str3, str4, str5, str6, authMethod, false, this.UBWssA, this.TlZLd, false);
                    return;
                }
                if (cwa <= 1555) {
                    while (true) {
                        i4 = cwa;
                        int i11 = i4 + 52;
                        if (i11 != 4) {
                            if (i11 == 78) {
                                cwa = (i4 >> 48) * 18;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cwa = ((cwa * 13) >> 70) + i4;
                }
                while (true) {
                    i2 = kAp;
                    int i12 = i2 + 39;
                    if (i12 == 67) {
                        break;
                    }
                    if (i12 == 86) {
                        break;
                    }
                    if (i12 == 214) {
                        if ((cwa ^ 1556) != 0) {
                            while (true) {
                                int i13 = cwa;
                                int i14 = i13 + 104;
                                if (i14 == 92) {
                                    cwa = (i13 * 124) >> 25;
                                } else if (i14 == 232) {
                                    while (true) {
                                        cwa = (cwa + i13) ^ 2417;
                                    }
                                } else if (i14 == 308) {
                                    while (true) {
                                        cwa = (cwa * 18) % 80;
                                    }
                                } else if (i14 == 362) {
                                    while (true) {
                                        cwa ^= 6569;
                                    }
                                }
                            }
                        } else {
                            kAp = ((i2 ^ 4126) % 60) ^ 2465;
                        }
                    }
                }
                int i15 = kAp;
                if ((cwa ^ 1556) != 0) {
                    while (true) {
                        int i16 = cwa;
                        int i17 = i16 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                        if (i17 != 13) {
                            if (i17 == 146) {
                                cwa = ((cwa + i16) ^ 2908) * 80;
                            } else if (i17 == 196) {
                                cwa = (i16 % 102) * 69;
                            }
                        }
                        cwa = (cwa % 102) >> CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA;
                        cwa = ((cwa + i16) ^ 2908) * 80;
                    }
                } else {
                    kAp = i15 + i2 + i2 + i2;
                    while (true) {
                        int i18 = kAp;
                        int i19 = cwa;
                        if ((i19 ^ 1556) != 0) {
                            break;
                        }
                        kAp = ((i18 ^ 5134) * 66) % 49;
                        if (i19 <= 1555) {
                            while (true) {
                                i3 = cwa;
                                int i20 = i3 + 78;
                                if (i20 == 99) {
                                    cwa = (i3 >> 70) ^ 1631;
                                } else if (i20 == 297) {
                                    break;
                                }
                            }
                            cwa = i3 * 1525;
                        }
                    }
                    while (true) {
                        int i21 = cwa;
                        if (i21 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 == 19) {
                            cwa = (i21 >> 51) * 4588;
                        }
                    }
                }
            }
        }
    }

    public class ffREWX implements Runnable {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String afkjiG;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            Hx(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ffREWX() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void Hx(boolean z) {
            if (z) {
                Hx(false);
            }
            afkjiG = GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            DcMfJK.iGmINl.UlJrfe(afkjiG);
        }
    }

    public class fwDlxl extends Omnske {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String DejOlE = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QrXuKv = null;
        public static int dpD = 0;
        public static int zMG = 1115;
        CountDownLatch fazARR;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            dpD = 9250;
            GCXiNH.OHr = 2270;
            XW(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public fwDlxl(String str, CountDownLatch countDownLatch) {
            super(str);
            this.fazARR = countDownLatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void XW(boolean z) {
            if (z) {
                XW(false);
            }
            if ((zMG ^ 1115) == 0) {
                DejOlE = GCXiNH.fsw("mcTjB]d>~MSVOZ\\\u0007UZYC^TDJ");
                QrXuKv = GCXiNH.fsw("mcTjB]hpk\bUJFE\bES\u0015]]Q^]_RXH^");
            } else {
                while (true) {
                    int i = zMG;
                    if (i + 26 == 65) {
                        zMG = ((i % 28) % 21) >> 6;
                    }
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // QfgSZK.DcMfJK.Omnske, com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, InputStream inputStream) {
            if (!super.onComplete(tMXHttpResponseCode, inputStream)) {
                FQMcgE.DFbvW(DcMfJK.DlIaRS, QrXuKv);
                this.fazARR.countDown();
                return false;
            }
            FQMcgE.OijiEz(DcMfJK.DlIaRS, DejOlE);
            DcMfJK.this.gFVGZP = System.currentTimeMillis();
            this.fazARR.countDown();
            return true;
        }
    }

    public final class gMxgjU extends Thread {
        public static int _kM = 9364;
        public static int kVX = 6783;
        public final Runnable m_runnable;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public gMxgjU(Runnable runnable) {
            int i;
            int i2;
            int i3;
            int i4;
            if (_kM <= 9363) {
                while (true) {
                    int i5 = _kM;
                    int i6 = i5 + 13;
                    if (i6 != 73) {
                        if (i6 == 134) {
                            _kM = i5 * 10197;
                        } else if (i6 == 161) {
                            _kM = ((i5 % 48) ^ 3386) >> 14;
                            break;
                        } else if (i6 == 272) {
                            while (true) {
                                _kM = (_kM >> 22) % 65;
                            }
                        }
                    }
                    _kM = (_kM ^ 2823) + i5;
                }
            }
            if ((kVX ^ 6783) != 0) {
                if ((_kM ^ 9364) != 0) {
                    do {
                        int i7 = _kM;
                        i4 = i7 + 26;
                        if (i4 == 11) {
                            while (true) {
                                _kM = ((_kM % 64) + i7) % 27;
                            }
                        }
                    } while (i4 != 18);
                    while (true) {
                        _kM = (_kM * 33) >> WebSocketProtocol.PAYLOAD_SHORT;
                    }
                } else {
                    do {
                        i = kVX;
                        i2 = _kM;
                        if (i2 <= 9363) {
                            do {
                                i3 = _kM;
                            } while (i3 + 78 != 50);
                            while (true) {
                                _kM = (_kM + i3) >> 198;
                            }
                        }
                    } while (i + 13 != 31);
                    kVX = (i ^ 723) % 37;
                    if (i2 <= 9363) {
                        while (true) {
                            int i8 = _kM;
                            int i9 = i8 + 65;
                            if (i9 == 76) {
                                while (true) {
                                    _kM = _kM + i8 + i8;
                                }
                            } else if (i9 == 97) {
                                _kM = (i8 % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) + i8 + i8;
                            } else if (i9 == 295) {
                                _kM = ((i8 >> 107) + i8) % 88;
                                break;
                            }
                        }
                    }
                }
            }
            this.m_runnable = runnable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.m_runnable.run();
        }
    }

    public class sfEqpH implements Runnable {
        public static int Rhn = 6426;
        public static int _Pz = 9980;
        /* synthetic */ String DBVhdd;
        final /* synthetic */ TMXEndNotifier DpBDcW;
        final /* synthetic */ TMXStrongAuth.StrongAuthCallback OMLgZt;
        /* synthetic */ String RIHRgU;
        /* synthetic */ String RurgHL;
        /* synthetic */ String hKwXpW;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:29:0x0063) to fix multi-entry loop: BACK_EDGE: B:29:0x0063 -> B:30:0x0065 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public sfEqpH(String str, String str2, String str3, String str4, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
            this.RurgHL = str;
            this.hKwXpW = str2;
            this.DBVhdd = str3;
            int i = Rhn;
            if (i <= 6425) {
                while (true) {
                    int i2 = Rhn;
                    int i3 = i2 + 13;
                    if (i3 == 54) {
                        while (true) {
                            Rhn = (Rhn >> 47) ^ 2179;
                        }
                    } else if (i3 == 164) {
                        Rhn = ((i2 ^ 2681) + i2) % 105;
                    } else if (i3 == 358) {
                        Rhn = (i2 % 106) ^ 3779;
                    } else if (i3 == 490) {
                        while (true) {
                            Rhn = (Rhn * 46) + i2;
                        }
                    }
                }
            } else {
                this.RIHRgU = str4;
                this.OMLgZt = strongAuthCallback;
                if ((i ^ 6426) == 0) {
                    this.DpBDcW = tMXEndNotifier;
                    return;
                }
                while (true) {
                    int i4 = Rhn;
                    int i5 = i4 + 26;
                    if (i5 == 88) {
                        Rhn = ((i4 >> 36) * 93) % 68;
                    } else if (i5 != 143) {
                        if (i5 == 204) {
                            Rhn = (i4 + i4) >> 114;
                            break;
                        } else if (i5 == 212) {
                            break;
                        }
                    }
                    Rhn = Rhn + i4 + i4;
                }
                while (true) {
                    Rhn >>= 130;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            int i;
            DcMfJK dcMfJK = DcMfJK.this;
            String str = dcMfJK.QOBnea.OuEEPx;
            if ((Rhn ^ 6426) != 0) {
                do {
                    i = Rhn;
                } while (i + 39 != 9);
                Rhn = i >> 72;
            }
            dcMfJK.$invoke$special$aGOrKO(str, this.RurgHL, null, this.hKwXpW, this.DBVhdd, this.RIHRgU, TMXStrongAuth.AuthMethod.TMX_USER_PRESENCE, true, this.OMLgZt, this.DpBDcW, true);
        }
    }

    public class sgNvtZ implements Runnable {
        public static int RGn = 4520;
        public static int sWL = 1965;
        final /* synthetic */ TMXEndNotifier fiwdvG;
        final /* synthetic */ DIADVb fmuntx;
        final /* synthetic */ TMXProfilingOptions fpgMza;
        /* synthetic */ String ihgRSX;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:22:0x004b) to fix multi-entry loop: BACK_EDGE: B:22:0x004b -> B:23:0x0054 */
        /* JADX DEBUG: Duplicate block (B:48:0x00a8) to fix multi-entry loop: BACK_EDGE: B:47:0x00a1 -> B:48:0x00a8 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public sgNvtZ(java.lang.String r3, com.lexisnexisrisk.threatmetrix.TMXProfilingOptions r4, com.lexisnexisrisk.threatmetrix.TMXEndNotifier r5, QfgSZK.DcMfJK.DIADVb r6) {
            /*
                r1 = this;
                QfgSZK.DcMfJK.this = r2
                r1.ihgRSX = r3
                r1.fpgMza = r4
                int r2 = QfgSZK.DcMfJK.sgNvtZ.RGn
                int r3 = QfgSZK.DcMfJK.sgNvtZ.sWL
                r4 = 1964(0x7ac, float:2.752E-42)
                if (r3 > r4) goto L20
            Le:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 + 117
                r3 = 22
                if (r2 == r3) goto L17
                goto Le
            L17:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 % 108
                int r2 = r2 % 76
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto L17
            L20:
                r3 = 4519(0x11a7, float:6.332E-42)
                if (r2 > r3) goto L100
            L24:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.RGn
                int r3 = QfgSZK.DcMfJK.sgNvtZ.sWL
                r5 = r3 ^ 1965(0x7ad, float:2.754E-42)
                if (r5 == 0) goto L69
            L2c:
                int r6 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r6 + 130
                r3 = 25
                if (r2 == r3) goto L4b
                r3 = 193(0xc1, float:2.7E-43)
                if (r2 == r3) goto L41
                r3 = 214(0xd6, float:3.0E-43)
                if (r2 == r3) goto L5e
                r3 = 317(0x13d, float:4.44E-43)
                if (r2 == r3) goto L54
                goto L2c
            L41:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 % 86
                int r2 = r2 + r6
                int r2 = r2 >> 34
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto L41
            L4b:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 % 83
                int r2 = r2 * 52
                int r2 = r2 + r6
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
            L54:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 >> 72
                int r2 = r2 * 31
                int r2 = r2 % 59
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
            L5e:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 * 69
                r2 = r2 ^ 5433(0x1539, float:7.613E-42)
                int r2 = r2 * 51
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto L4b
            L69:
                int r6 = r2 + 13
                r0 = 55
                if (r6 == r0) goto L81
                r3 = 234(0xea, float:3.28E-43)
                if (r6 == r3) goto Lca
                r3 = 324(0x144, float:4.54E-43)
                if (r6 == r3) goto L78
                goto L24
            L78:
                int r2 = r2 % 63
                int r2 = r2 * 21
                QfgSZK.DcMfJK.sgNvtZ.RGn = r2
                if (r5 == 0) goto L24
                goto Ld6
            L81:
                if (r5 == 0) goto Lb0
            L83:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r3 = r2 + 91
                r4 = 1
                if (r3 == r4) goto Lab
                r4 = 147(0x93, float:2.06E-43)
                if (r3 == r4) goto La1
                r4 = 345(0x159, float:4.83E-43)
                if (r3 == r4) goto L9c
                r4 = 478(0x1de, float:6.7E-43)
                if (r3 == r4) goto L97
                goto L83
            L97:
                int r3 = r2 + r2
                int r3 = r3 % 113
                goto La8
            L9c:
                int r2 = r2 * 23
                r2 = r2 ^ 1862(0x746, float:2.609E-42)
                goto Lad
            La1:
                int r3 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r3 = r3 * 57
                int r3 = r3 + r2
                int r3 = r3 % 98
            La8:
                QfgSZK.DcMfJK.sgNvtZ.sWL = r3
                goto La1
            Lab:
                r2 = r2 ^ 1063(0x427, float:1.49E-42)
            Lad:
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto L83
            Lb0:
                int r2 = r2 >> 14
                int r2 = r2 * 1425
                QfgSZK.DcMfJK.sgNvtZ.RGn = r2
                if (r3 > r4) goto Lca
            Lb8:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 + 65
                r3 = 20
                if (r2 == r3) goto Lc1
                goto Lb8
            Lc1:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 % 45
                r2 = r2 ^ 1523(0x5f3, float:2.134E-42)
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto Lc1
            Lca:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.RGn
                int r2 = r2 % 102
                int r2 = r2 >> 3
                int r2 = r2 * 31
                QfgSZK.DcMfJK.sgNvtZ.RGn = r2
                if (r5 == 0) goto L24
            Ld6:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r3 = r2 + 26
                r5 = 66
                if (r3 == r5) goto Lee
                r5 = 156(0x9c, float:2.19E-43)
                if (r3 == r5) goto Le7
                r2 = 160(0xa0, float:2.24E-43)
                if (r3 == r2) goto Lf4
                goto Ld6
            Le7:
                r2 = r2 ^ 4989(0x137d, float:6.991E-42)
                int r2 = r2 * 83
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto Ld6
            Lee:
                r2 = r2 ^ 2049(0x801, float:2.871E-42)
                int r2 = r2 * 3450
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
            Lf4:
                int r2 = QfgSZK.DcMfJK.sgNvtZ.sWL
                int r2 = r2 >> 10
                r2 = r2 ^ 1503(0x5df, float:2.106E-42)
                int r2 = r2 >> 9
                QfgSZK.DcMfJK.sgNvtZ.sWL = r2
                goto L24
            L100:
                r1.fiwdvG = r5
                r1.fmuntx = r6
                r1.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DcMfJK.sgNvtZ.<init>(QfgSZK.DcMfJK, java.lang.String, com.lexisnexisrisk.threatmetrix.TMXProfilingOptions, com.lexisnexisrisk.threatmetrix.TMXEndNotifier, QfgSZK.DcMfJK$DIADVb):void");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public void run() {
            DcMfJK dcMfJK = DcMfJK.this;
            String str = dcMfJK.QOBnea.OuEEPx;
            String str2 = this.ihgRSX;
            if ((sWL ^ 1965) == 0) {
                DcMfJK.RTWSvT(dcMfJK, str, str2, this.fpgMza, this.fiwdvG, this.fmuntx);
                return;
            }
            while (true) {
                int i = sWL;
                int i2 = i + 13;
                if (i2 != 22) {
                    if (i2 == 128) {
                        sWL = ((i >> 64) ^ 4147) + i;
                    } else if (i2 == 253) {
                        break;
                    }
                }
                sWL = (sWL % 38) ^ 1483;
            }
            while (true) {
                sWL = ((sWL * 43) % 22) ^ 1418;
            }
        }
    }

    public interface suEgdN {
        boolean bindToGooglePlayService(ZqidTP zqidTP);

        String getAdvertisingId(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:20:0x007e) to fix multi-entry loop: BACK_EDGE: B:19:0x007a -> B:20:0x007e */
    /* JADX DEBUG: Duplicate block (B:45:0x00ce) to fix multi-entry loop: BACK_EDGE: B:45:0x00ce -> B:46:0x00d5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0112 -> B:51:0x00f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static {
        /*
            r0 = 3987(0xf93, float:5.587E-42)
            QfgSZK.GCXiNH.Cwg = r0
            r0 = 9057(0x2361, float:1.2692E-41)
            QfgSZK.FQMcgE.RQa = r0
            r0 = 3230(0xc9e, float:4.526E-42)
            QfgSZK.DcMfJK.kCm = r0
            r1 = 6842(0x1aba, float:9.588E-42)
            QfgSZK.FQMcgE.usN = r1
            r1 = 3939(0xf63, float:5.52E-42)
            QfgSZK.DcMfJK.fTB = r1
            r2 = 2270(0x8de, float:3.181E-42)
            QfgSZK.GCXiNH.OHr = r2
            java.lang.String r2 = "%?\u000b!\u0013\t"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)
            QfgSZK.DcMfJK.version = r2
            java.lang.String r2 = "ub]|O\\1/"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)
            QfgSZK.DcMfJK.BgeFd = r2
            java.lang.Class<QfgSZK.DcMfJK> r2 = QfgSZK.DcMfJK.class
            java.lang.String r2 = QfgSZK.FQMcgE.hfdhUn(r2)
            QfgSZK.DcMfJK.DlIaRS = r2
            QfgSZK.DCUTEI r2 = new QfgSZK.DCUTEI
            r2.<init>()
            QfgSZK.DcMfJK.iGmINl = r2
            java.lang.String r2 = "wpMm\u0005Gl0zMPPCFF"
            java.lang.String r2 = QfgSZK.GCXiNH.fsw(r2)
            java.lang.String r2 = java.lang.System.getProperty(r2)
            if (r2 == 0) goto L12c
            java.lang.String r3 = "/?\u000b\"\u001b"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L12c
            int r2 = QfgSZK.DcMfJK.fTB
            r1 = r1 ^ r2
            r2 = 1
            if (r1 == 0) goto L12d
            int r1 = QfgSZK.DcMfJK.kCm
            r3 = 3229(0xc9d, float:4.525E-42)
            if (r1 > r3) goto L82
        L5b:
            int r1 = QfgSZK.DcMfJK.kCm
            int r0 = r1 + 39
            r2 = 71
            if (r0 == r2) goto L7a
            r2 = 112(0x70, float:1.57E-43)
            if (r0 == r2) goto L6f
            r2 = 117(0x75, float:1.64E-43)
            if (r0 == r2) goto L6c
            goto L5b
        L6c:
            int r0 = r1 + r1
            goto L7e
        L6f:
            int r0 = QfgSZK.DcMfJK.kCm
            int r0 = r0 >> 66
            int r0 = r0 * 74
            int r0 = r0 >> 113
            QfgSZK.DcMfJK.kCm = r0
            goto L6f
        L7a:
            int r0 = QfgSZK.DcMfJK.kCm
            r0 = r0 ^ 5375(0x14ff, float:7.532E-42)
        L7e:
            int r0 = r0 + r1
            QfgSZK.DcMfJK.kCm = r0
            goto L7a
        L82:
            int r1 = QfgSZK.DcMfJK.fTB
            int r4 = r1 + 26
            r5 = 48
            if (r4 == r5) goto Lb2
            r5 = 237(0xed, float:3.32E-43)
            if (r4 == r5) goto L97
            r5 = 390(0x186, float:5.47E-43)
            if (r4 == r5) goto Lf2
            r5 = 569(0x239, float:7.97E-43)
            if (r4 == r5) goto Le6
            goto L82
        L97:
            int r0 = QfgSZK.DcMfJK.fTB
            int r0 = r0 >> 120
            int r0 = r0 + r1
            QfgSZK.DcMfJK.fTB = r0
            int r0 = QfgSZK.DcMfJK.kCm
            if (r0 > r3) goto L97
        La2:
            int r0 = QfgSZK.DcMfJK.kCm
            int r1 = r0 + 78
            r2 = 91
            if (r1 == r2) goto Lab
            goto La2
        Lab:
            r0 = r0 ^ 1324(0x52c, float:1.855E-42)
            int r0 = r0 * 62
            QfgSZK.DcMfJK.kCm = r0
            goto La2
        Lb2:
            int r4 = r1 % 120
            int r4 = r4 % 122
            QfgSZK.DcMfJK.fTB = r4
            int r4 = QfgSZK.DcMfJK.kCm
            r4 = r4 ^ r0
            if (r4 == 0) goto Le6
        Lbd:
            int r4 = QfgSZK.DcMfJK.kCm
            int r0 = r4 + 104
            r1 = 47
            if (r0 == r1) goto Lce
            r1 = 218(0xda, float:3.05E-43)
            if (r0 == r1) goto Ldd
            r1 = 267(0x10b, float:3.74E-43)
            if (r0 == r1) goto Ld5
            goto Lbd
        Lce:
            int r0 = QfgSZK.DcMfJK.kCm
            int r0 = r0 * 125
            int r0 = r0 % r2
            QfgSZK.DcMfJK.kCm = r0
        Ld5:
            int r0 = QfgSZK.DcMfJK.kCm
            int r0 = r0 + r4
            int r0 = r0 + r4
            int r0 = r0 * 44
            QfgSZK.DcMfJK.kCm = r0
        Ldd:
            int r0 = QfgSZK.DcMfJK.kCm
            int r0 = r0 >> 51
            r0 = r0 ^ 1027(0x403, float:1.439E-42)
            QfgSZK.DcMfJK.kCm = r0
            goto Lce
        Le6:
            int r2 = QfgSZK.DcMfJK.fTB
            int r2 = r2 + r1
            r1 = r2 ^ 3920(0xf50, float:5.493E-42)
            QfgSZK.DcMfJK.fTB = r1
            int r1 = QfgSZK.DcMfJK.kCm
            if (r1 > r3) goto Lf2
            goto L101
        Lf2:
            int r1 = QfgSZK.DcMfJK.fTB
            int r1 = r1 * 34
            int r1 = r1 % 96
            int r1 = r1 % 103
            QfgSZK.DcMfJK.fTB = r1
            int r1 = QfgSZK.DcMfJK.kCm
            r1 = r1 ^ r0
            if (r1 == 0) goto Lf2
        L101:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 91
            r3 = 22
            if (r2 == r3) goto L124
            r3 = 202(0xca, float:2.83E-43)
            if (r2 == r3) goto L11b
            r3 = 382(0x17e, float:5.35E-43)
            if (r2 == r3) goto L112
            goto L101
        L112:
            int r1 = r1 * 100
            int r1 = r1 >> 33
            int r1 = r1 % 5
            QfgSZK.DcMfJK.kCm = r1
            goto Lf2
        L11b:
            int r0 = QfgSZK.DcMfJK.kCm
            r0 = r0 ^ 3189(0xc75, float:4.469E-42)
            int r0 = r0 * 49
            QfgSZK.DcMfJK.kCm = r0
            goto L11b
        L124:
            int r2 = r1 + r1
            int r2 = r2 + r1
            r1 = r2 ^ 3417(0xd59, float:4.788E-42)
            QfgSZK.DcMfJK.kCm = r1
            goto L101
        L12c:
            r2 = 0
        L12d:
            QfgSZK.DcMfJK.dJxHRb = r2
            if (r2 == 0) goto L13c
            java.lang.String r0 = QfgSZK.DcMfJK.DlIaRS
            java.lang.String r1 = "_cTgN_!tcAL\u000b\u0003\tLBBPWGWU\u001c\u000f_^HRLXL^Hb$ecml\\Mjo+xf}s\u007f{q"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            QfgSZK.FQMcgE.OijiEz(r0, r1)
        L13c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DcMfJK.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcMfJK(suEgdN suegdn) {
        DCUTEI dcutei = iGmINl;
        this.gYbxGz = new AYXKKw(dcutei);
        this.hfTkCe = new QBiWsm(dcutei);
        this.DVBNek = suegdn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void RTWSvT(DcMfJK dcMfJK, String str, String str2, TMXProfilingOptions tMXProfilingOptions, TMXEndNotifier tMXEndNotifier, DIADVb dIADVb) {
        if ((kCm ^ 3230) == 0) {
            dcMfJK.$invoke$special$ODCBUN(str, str2, tMXProfilingOptions, tMXEndNotifier, dIADVb);
        } else {
            while (true) {
                int i = kCm;
                if (i + 13 == 22) {
                    kCm = (i + i) * 6867;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x002a) to fix multi-entry loop: BACK_EDGE: B:13:0x0026 -> B:14:0x002a */
    public static int UccSpe(int i, int i2, String str) {
        int i3;
        int i4;
        long j = i;
        long j2 = i2;
        if (kCm <= 3229) {
            do {
                i3 = kCm;
                i4 = i3 + 13;
                if (i4 != 97) {
                    if (i4 == 207) {
                        kCm = (i3 ^ 5494) >> 66;
                    }
                }
                while (true) {
                    kCm = kCm + i3 + i3;
                }
            } while (i4 != 264);
            kCm = ((i3 + i3) % 62) * 88;
        }
        return (int) UccSpe(j, j2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long UccSpe(long j, long j2, String str) {
        if (j >= 0 && (j2 == 0 || j <= j2)) {
            return j;
        }
        FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>zINVO\tNHD\u0015ON\u001e\u0011KR"), str, String.valueOf(j));
        throw new IllegalArgumentException(GCXiNH.fsw("T\u007fMmGXe>zINVO\tNHD\u0015O") + str + "}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean ggKfIT(Thread thread, boolean z, int i) {
        int i2;
        int i3;
        boolean z2;
        int i4;
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("jx]x"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("jpRxB_f>jGP\u0003^AZBWQ\u0014G]\u0011S@SMP^N\\\u0018\u001a\u0006") + thread.getId());
        if (dJxHRb) {
            i2 = i / 100;
            i3 = 100;
            if (i2 >= 100) {
            }
            z2 = false;
            i4 = 0;
            do {
                try {
                    thread.join(i3);
                } catch (InterruptedException e) {
                    if (z) {
                        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("iyIiJU!tcAL"), e);
                    }
                    ORrpqH.uzCIH().seuMaA(e);
                    z2 = true;
                }
                i4 += i3;
                if (!thread.isAlive() || i4 >= i) {
                    break;
                }
            } while (!z2);
            if (thread.isAlive()) {
                return true;
            }
            if (!z2) {
                Exception exc = new Exception();
                exc.setStackTrace(thread.getStackTrace());
                FQMcgE.DFbvW(DlIaRS, GCXiNH.fsw("w~Rb\u0003\u0018!jeEGL_]\bBNE]AWU\u001c\u000f\\HH\u001bNQJRGa$jq!sJEeh+keaqs5<2;?0\\j|\u007fp:mjvd@\u0005K{.zyF\u0005") + thread.getId(), exc);
            }
            return false;
        }
        i2 = i;
        i3 = i2;
        z2 = false;
        i4 = 0;
        do {
            thread.join(i3);
            i4 += i3;
            if (!thread.isAlive()) {
                break;
            }
            break;
            break;
        } while (!z2);
        if (thread.isAlive()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:125:0x01e3) to fix multi-entry loop: BACK_EDGE: B:125:0x01e3 -> B:126:0x01e5 */
    /* JADX DEBUG: Duplicate block (B:144:0x023b) to fix multi-entry loop: BACK_EDGE: B:143:0x0234 -> B:144:0x023b */
    /* JADX DEBUG: Duplicate block (B:187:0x02dd) to fix multi-entry loop: BACK_EDGE: B:186:0x02d9 -> B:187:0x02dd */
    /* JADX DEBUG: Duplicate block (B:214:0x033f) to fix multi-entry loop: BACK_EDGE: B:214:0x033f -> B:212:0x0337 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x01ec -> B:115:0x01bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0100 -> B:64:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final /* synthetic */ void $invoke$special$DPHOMC(QfgSZK.DIIpTV r15, com.lexisnexisrisk.threatmetrix.TMXProfilingOptions r16, java.lang.String r17, java.lang.String r18) throws java.lang.InterruptedException {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            QfgSZK.DCUTEI r2 = QfgSZK.DcMfJK.iGmINl
            java.lang.String r3 = "P^\u007fYgt^JUxg|h`gjsafzqb"
            java.lang.String r4 = QfgSZK.GCXiNH.fsw(r3)
            r2.UlJrfe(r4)
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            boolean r4 = r16.CCzvY()
            r5 = 0
            r6 = 65
            r7 = 1
            if (r4 != 0) goto L32
            int r4 = QfgSZK.DcMfJK.fTB
            r4 = r4 ^ 3939(0xf63, float:5.52E-42)
            if (r4 == 0) goto L30
        L21:
            int r4 = QfgSZK.DcMfJK.fTB
            int r1 = r4 + 26
            if (r1 == r6) goto L28
            goto L21
        L28:
            int r1 = QfgSZK.DcMfJK.fTB
            int r1 = r1 + r4
            int r1 = r1 + r4
            int r1 = r1 + r4
            QfgSZK.DcMfJK.fTB = r1
            goto L28
        L30:
            r4 = r7
            goto L33
        L32:
            r4 = r5
        L33:
            r2.fERRXa(r3, r4)
            boolean r2 = r16.CCzvY()
            if (r2 == 0) goto L3d
            return
        L3d:
            int r2 = r16.UdAbHR()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L69
            int r3 = QfgSZK.DcMfJK.kCm
            r3 = r3 ^ 3230(0xc9e, float:4.526E-42)
            if (r3 == 0) goto L59
        L4c:
            int r3 = QfgSZK.DcMfJK.kCm
            int r4 = r3 + 533
            r8 = 72
            if (r4 == r8) goto L55
            goto L4c
        L55:
            int r3 = r3 * 8268
            QfgSZK.DcMfJK.kCm = r3
        L59:
            int r3 = r1.gSeEMM
            int r3 = java.lang.Math.min(r3, r2)
            r1.gSeEMM = r3
            int r3 = r1.dNTKXi
            int r2 = java.lang.Math.min(r3, r2)
            r1.dNTKXi = r2
        L69:
            java.util.Set r2 = r16.dMqZSI()
            int r3 = QfgSZK.DcMfJK.fTB
            r4 = 25
            r8 = 121(0x79, float:1.7E-43)
            r9 = 3938(0xf62, float:5.518E-42)
            if (r3 > r9) goto Lb3
            int r1 = QfgSZK.DcMfJK.kCm
            r1 = r1 ^ 3230(0xc9e, float:4.526E-42)
            if (r1 == 0) goto La3
        L7d:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 429
            r3 = 98
            if (r2 == r3) goto L92
            r3 = 297(0x129, float:4.16E-43)
            if (r2 == r3) goto L8e
            r3 = 481(0x1e1, float:6.74E-43)
            if (r2 == r3) goto L99
            goto L7d
        L8e:
            int r2 = r1 >> 75
            int r2 = r2 + r1
            goto L97
        L92:
            int r2 = r1 % 83
            r2 = r2 ^ 2835(0xb13, float:3.973E-42)
            int r2 = r2 >> r8
        L97:
            QfgSZK.DcMfJK.kCm = r2
        L99:
            int r2 = QfgSZK.DcMfJK.kCm
            int r2 = r2 + r1
            int r2 = r2 % 67
            int r2 = r2 * 52
            QfgSZK.DcMfJK.kCm = r2
            goto L7d
        La3:
            int r1 = QfgSZK.DcMfJK.fTB
            int r1 = r1 + 195
            if (r1 == r4) goto Laa
            goto La3
        Laa:
            int r1 = QfgSZK.DcMfJK.fTB
            int r1 = r1 % 42
            r1 = r1 ^ 1516(0x5ec, float:2.124E-42)
            QfgSZK.DcMfJK.fTB = r1
            goto Laa
        Lb3:
            java.util.Set<java.lang.String> r3 = r0.zhFcBz
            java.util.Set<java.lang.String> r10 = r1.dEZLlj
            boolean r10 = r10.isEmpty()
            r11 = 41
            r12 = 3229(0xc9d, float:4.525E-42)
            if (r10 == 0) goto L154
            if (r2 == 0) goto L147
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L147
            java.lang.String r3 = QfgSZK.DcMfJK.DlIaRS
            java.lang.String r10 = "Iy^,DAuwcF\u0002JDJDRRPPrQEYYWIU^I\u0019PVU%ffgo SEnvj~ll'pg{~2ab`xtp~:mw7nKLP3.kHgFXXLII\bNSWP\u001dNr@cTPX\u0015CDQGm+xeg|0Nrwmjh+(qulyk{m\f1gcptb~vm\u000eMiTm2hNWBHEBD]]pZBo\u000eqB]ZNITN\u001aP_3lPCQ]Laebhl)"
            java.lang.String r10 = QfgSZK.GCXiNH.fsw(r10)
            QfgSZK.FQMcgE.OijiEz(r3, r10)
            java.util.Set<java.lang.String> r3 = r1.dEZLlj
            r3.addAll(r2)
            int r2 = QfgSZK.DcMfJK.fTB
            if (r2 > r9) goto L154
            int r1 = QfgSZK.DcMfJK.kCm
            if (r1 > r12) goto L112
        Le1:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 208
            r3 = 75
            if (r2 == r3) goto L10a
            r3 = 117(0x75, float:1.64E-43)
            if (r2 == r3) goto Lfa
            r3 = 168(0xa8, float:2.35E-43)
            if (r2 == r3) goto Lf6
            r3 = 254(0xfe, float:3.56E-43)
            if (r2 == r3) goto L102
            goto Le1
        Lf6:
            int r2 = r1 % 24
            int r2 = r2 + r1
            goto L100
        Lfa:
            int r2 = r1 >> 45
            int r2 = r2 % 52
            int r2 = r2 * 101
        L100:
            QfgSZK.DcMfJK.kCm = r2
        L102:
            int r2 = QfgSZK.DcMfJK.kCm
            int r2 = r2 + r1
            int r2 = r2 % 76
            r2 = r2 ^ 1908(0x774, float:2.674E-42)
            goto L100
        L10a:
            int r2 = QfgSZK.DcMfJK.kCm
            int r2 = r2 + r1
            int r2 = r2 >> 27
            QfgSZK.DcMfJK.kCm = r2
            goto L10a
        L112:
            int r1 = QfgSZK.DcMfJK.fTB
            int r2 = r1 + 65
            r3 = 89
            if (r2 == r3) goto L125
            r3 = 107(0x6b, float:1.5E-43)
            if (r2 == r3) goto L11f
            goto L112
        L11f:
            int r1 = r1 + r1
            int r1 = r1 * 86
            QfgSZK.DcMfJK.fTB = r1
            goto L112
        L125:
            int r1 = QfgSZK.DcMfJK.fTB
            int r1 = r1 * 43
            int r1 = r1 >> r8
            QfgSZK.DcMfJK.fTB = r1
            int r1 = QfgSZK.DcMfJK.kCm
            if (r1 > r12) goto L125
        L130:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 403
            if (r2 == r11) goto L141
            r3 = 54
            if (r2 == r3) goto L13b
            goto L130
        L13b:
            int r2 = r1 % 8
            int r2 = r2 + r1
            QfgSZK.DcMfJK.kCm = r2
            goto L125
        L141:
            int r1 = r1 + r1
            int r1 = r1 >> 119
            QfgSZK.DcMfJK.kCm = r1
            goto L125
        L147:
            if (r3 == 0) goto L154
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L154
            java.util.Set<java.lang.String> r2 = r1.dEZLlj
            r2.addAll(r3)
        L154:
            java.util.Set r2 = r16.gIsMnX()
            java.util.Set<java.lang.String> r3 = r0.sBzGck
            int r10 = QfgSZK.DcMfJK.fTB
            r13 = 5
            if (r10 > r9) goto L1fd
            int r1 = QfgSZK.DcMfJK.kCm
            if (r1 > r12) goto L19b
        L163:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 91
            r3 = 48
            if (r2 == r3) goto L190
            r3 = 66
            if (r2 == r3) goto L189
            r3 = 138(0x8a, float:1.93E-43)
            if (r2 == r3) goto L181
            r3 = 223(0xdf, float:3.12E-43)
            if (r2 == r3) goto L178
            goto L163
        L178:
            int r2 = QfgSZK.DcMfJK.kCm
            int r2 = r2 >> r11
            int r2 = r2 + r1
            int r2 = r2 * 80
            QfgSZK.DcMfJK.kCm = r2
            goto L178
        L181:
            int r2 = r1 % 56
            int r2 = r2 % 83
            int r2 = r2 % 105
            QfgSZK.DcMfJK.kCm = r2
        L189:
            int r2 = QfgSZK.DcMfJK.kCm
            int r2 = r2 + r1
            int r2 = r2 % 3
            QfgSZK.DcMfJK.kCm = r2
        L190:
            int r1 = QfgSZK.DcMfJK.kCm
            r1 = r1 ^ 1046(0x416, float:1.466E-42)
            int r1 = r1 >> 97
            int r1 = r1 % 19
            QfgSZK.DcMfJK.kCm = r1
            goto L190
        L19b:
            int r1 = QfgSZK.DcMfJK.fTB
            int r2 = r1 + 208
            r3 = 56
            if (r2 == r3) goto L1f5
            r3 = 100
            if (r2 == r3) goto L1ba
            r3 = 224(0xe0, float:3.14E-43)
            if (r2 == r3) goto L1bf
            r3 = 275(0x113, float:3.85E-43)
            if (r2 == r3) goto L1b0
            goto L19b
        L1b0:
            int r2 = r1 % 86
            int r2 = r2 + r1
            QfgSZK.DcMfJK.fTB = r2
            int r2 = QfgSZK.DcMfJK.kCm
            if (r2 > r12) goto L1bf
            goto L1ce
        L1ba:
            int r2 = r1 >> 21
            int r2 = r2 + r1
            QfgSZK.DcMfJK.fTB = r2
        L1bf:
            int r2 = QfgSZK.DcMfJK.fTB
            r2 = r2 ^ 5406(0x151e, float:7.575E-42)
            int r2 = r2 + r1
            int r2 = r2 % 53
            QfgSZK.DcMfJK.fTB = r2
            int r2 = QfgSZK.DcMfJK.kCm
            r2 = r2 ^ 3230(0xc9e, float:4.526E-42)
            if (r2 == 0) goto L1bf
        L1ce:
            int r2 = QfgSZK.DcMfJK.kCm
            int r3 = r2 + 338
            r4 = 43
            if (r3 == r4) goto L1ec
            r4 = 222(0xde, float:3.11E-43)
            if (r3 == r4) goto L1df
            r4 = 386(0x182, float:5.41E-43)
            if (r3 == r4) goto L1e5
            goto L1ce
        L1df:
            int r1 = r2 >> 119
            r1 = r1 ^ 3701(0xe75, float:5.186E-42)
        L1e3:
            QfgSZK.DcMfJK.kCm = r1
        L1e5:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 + r2
            int r1 = r1 % 27
            int r1 = r1 % r13
            goto L1e3
        L1ec:
            int r2 = r2 * 68
            r2 = r2 ^ 4033(0xfc1, float:5.651E-42)
            int r2 = r2 >> 13
            QfgSZK.DcMfJK.kCm = r2
            goto L1bf
        L1f5:
            int r1 = r1 % 34
            r2 = 244(0xf4, float:3.42E-43)
            int r1 = r1 >> r2
            QfgSZK.DcMfJK.fTB = r1
            goto L19b
        L1fd:
            java.util.Set<java.lang.String> r10 = r1.fqiwJt
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L294
            if (r2 == 0) goto L25c
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L25c
            java.lang.String r3 = QfgSZK.DcMfJK.DlIaRS
            java.lang.String r10 = "Iy^,DAuwcF\u0002NKZCBRs]V^UC\u000fV\\O\u001bX\\]Y\u0006hmdp`t[H)byed(wdzrz~t0{q=uusm67B]@GhzG_l\u0005ZEIJ\u0007XKUXYXZ ZsX[[\u0015B_QZ*d|yg`~\r\"kkrcqmk6;imz~Tx|t4lybj*GYvMz\u007fdMSOYAHD\tLv\\@qZmI\u0012^M\u001dJRYVA~{[D[T\u000f"
            java.lang.String r10 = QfgSZK.GCXiNH.fsw(r10)
            QfgSZK.FQMcgE.OijiEz(r3, r10)
            java.util.Set<java.lang.String> r3 = r1.fqiwJt
            r3.addAll(r2)
            int r2 = QfgSZK.DcMfJK.fTB
            r2 = r2 ^ 3939(0xf63, float:5.52E-42)
            if (r2 == 0) goto L294
            int r2 = QfgSZK.DcMfJK.kCm
            r2 = r2 ^ 3230(0xc9e, float:4.526E-42)
            if (r2 == 0) goto L243
        L229:
            int r2 = QfgSZK.DcMfJK.kCm
            int r1 = r2 + 234
            if (r1 == r11) goto L234
            r3 = 234(0xea, float:3.28E-43)
            if (r1 == r3) goto L23b
            goto L229
        L234:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 + r2
            r1 = r1 ^ 3668(0xe54, float:5.14E-42)
            QfgSZK.DcMfJK.kCm = r1
        L23b:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 + r2
            int r1 = r1 * 26
            QfgSZK.DcMfJK.kCm = r1
            goto L234
        L243:
            int r2 = QfgSZK.DcMfJK.fTB
            int r3 = r2 + 91
            r10 = 80
            if (r3 == r10) goto L256
            if (r3 == r8) goto L24e
            goto L243
        L24e:
            int r3 = r2 % 21
            int r3 = r3 % 96
            int r3 = r3 + r2
            QfgSZK.DcMfJK.fTB = r3
            goto L294
        L256:
            int r2 = r2 >> 122
            int r2 = r2 * r6
            QfgSZK.DcMfJK.fTB = r2
            goto L243
        L25c:
            if (r3 == 0) goto L294
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L294
            java.util.Set<java.lang.String> r2 = r1.fqiwJt
            int r6 = QfgSZK.DcMfJK.kCm
            if (r6 > r12) goto L291
        L26a:
            int r6 = QfgSZK.DcMfJK.kCm
            int r8 = r6 + 546
            r10 = 95
            if (r8 == r10) goto L289
            r10 = 290(0x122, float:4.06E-43)
            if (r8 == r10) goto L281
            r10 = 309(0x135, float:4.33E-43)
            if (r8 == r10) goto L27b
            goto L26a
        L27b:
            r8 = 198(0xc6, float:2.77E-43)
            int r6 = r6 >> r8
            QfgSZK.DcMfJK.kCm = r6
            goto L26a
        L281:
            int r8 = r6 % 84
            int r8 = r8 + r6
            int r6 = r8 >> 91
            QfgSZK.DcMfJK.kCm = r6
            goto L291
        L289:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 * 365
            int r1 = r1 + r6
            QfgSZK.DcMfJK.kCm = r1
            goto L289
        L291:
            r2.addAll(r3)
        L294:
            boolean r2 = r16.izaUzn()
            int r3 = QfgSZK.DcMfJK.kCm
            r6 = 57
            if (r3 > r12) goto L2ae
        L29e:
            int r3 = QfgSZK.DcMfJK.kCm
            int r1 = r3 + 117
            if (r1 == r6) goto L2a5
            goto L29e
        L2a5:
            int r1 = QfgSZK.DcMfJK.kCm
            r1 = r1 ^ 2827(0xb0b, float:3.961E-42)
            int r1 = r1 + r3
            int r1 = r1 + r3
            QfgSZK.DcMfJK.kCm = r1
            goto L2a5
        L2ae:
            boolean r3 = r0.aecqHb
            boolean r8 = r1.dPmiAp
            if (r8 != 0) goto L30b
            if (r2 == 0) goto L307
            java.lang.String r2 = QfgSZK.DcMfJK.DlIaRS
            java.lang.String r3 = "Iy^,DAuwcF\u0002PBF]KR|ZYWRDe_K]HYKQGR%lbq!b[Ig$fcnzfbpp3tc\u007fb>mnt|ptr'QJ\u0004t`GD,\u0005hT@ER\\PUU\u001cJWlC AGSVSR\\\t\u007fxeci/dIkp$jvsavt7<uqhEgwa85cg|kZ]hF?knVU\u000eDEWFLQa]Y`Zh_\\\u0017NOWZJM@j>\\S\u001eBDgdk`minlx\r"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            QfgSZK.FQMcgE.OijiEz(r2, r3)
            r1.dPmiAp = r7
            int r2 = QfgSZK.DcMfJK.fTB
            if (r2 > r9) goto L30b
        L2c7:
            int r1 = QfgSZK.DcMfJK.fTB
            int r2 = r1 + 117
            if (r2 == r6) goto L2e0
            r3 = 84
            if (r2 == r3) goto L2d9
            r3 = 214(0xd6, float:3.0E-43)
            if (r2 == r3) goto L2d6
            goto L2c7
        L2d6:
            r1 = r1 ^ 306(0x132, float:4.29E-43)
            goto L2dd
        L2d9:
            int r1 = QfgSZK.DcMfJK.fTB
            int r1 = r1 * 12120
        L2dd:
            QfgSZK.DcMfJK.fTB = r1
            goto L2d9
        L2e0:
            int r1 = r1 >> 29
            int r1 = r1 % 26
            int r1 = r1 * 69
            QfgSZK.DcMfJK.fTB = r1
            int r1 = QfgSZK.DcMfJK.kCm
            r1 = r1 ^ 3230(0xc9e, float:4.526E-42)
            if (r1 == 0) goto L2c7
        L2ee:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 260
            if (r2 == r4) goto L2f9
            r1 = 90
            if (r2 == r1) goto L2fe
            goto L2ee
        L2f9:
            int r1 = r1 % 49
            int r1 = r1 % r13
            QfgSZK.DcMfJK.kCm = r1
        L2fe:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 * 24
            int r1 = r1 % 51
            QfgSZK.DcMfJK.kCm = r1
            goto L2c7
        L307:
            if (r3 == 0) goto L30b
            r1.dPmiAp = r7
        L30b:
            java.lang.String r2 = r16.DbOFhN()
            int r3 = QfgSZK.DcMfJK.kCm
            r3 = r3 ^ 3230(0xc9e, float:4.526E-42)
            if (r3 == 0) goto L348
        L315:
            int r1 = QfgSZK.DcMfJK.kCm
            int r2 = r1 + 143
            r3 = 87
            if (r2 == r3) goto L330
            r3 = 254(0xfe, float:3.56E-43)
            if (r2 == r3) goto L33f
            r3 = 410(0x19a, float:5.75E-43)
            if (r2 == r3) goto L32a
            r1 = 432(0x1b0, float:6.05E-43)
            if (r2 == r1) goto L337
            goto L315
        L32a:
            int r1 = r1 + r1
            r1 = r1 ^ 2619(0xa3b, float:3.67E-42)
            int r1 = r1 >> 110
            goto L33d
        L330:
            r2 = r1 ^ 4052(0xfd4, float:5.678E-42)
            int r2 = r2 + r1
            int r2 = r2 * 101
            QfgSZK.DcMfJK.kCm = r2
        L337:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 % 86
            r1 = r1 ^ 2810(0xafa, float:3.938E-42)
        L33d:
            QfgSZK.DcMfJK.kCm = r1
        L33f:
            int r1 = QfgSZK.DcMfJK.kCm
            int r1 = r1 >> 115
            int r1 = r1 % 47
            QfgSZK.DcMfJK.kCm = r1
            goto L337
        L348:
            java.lang.String r4 = r0.fRBHvl
            java.lang.String r6 = r1.akFAfk
            if (r3 == 0) goto L381
        L34e:
            int r3 = QfgSZK.DcMfJK.kCm
            int r8 = r3 + 520
            r9 = 70
            if (r8 == r9) goto L369
            r9 = 178(0xb2, float:2.5E-43)
            if (r8 == r9) goto L363
            r3 = 300(0x12c, float:4.2E-43)
            if (r8 == r3) goto L37b
            r3 = 345(0x159, float:4.83E-43)
            if (r8 == r3) goto L373
            goto L34e
        L363:
            r3 = r3 ^ 1819(0x71b, float:2.549E-42)
            int r3 = r3 >> 107
            QfgSZK.DcMfJK.kCm = r3
        L369:
            int r3 = QfgSZK.DcMfJK.kCm
            r3 = r3 ^ 2223(0x8af, float:3.115E-42)
            int r3 = r3 * 53
            r3 = r3 ^ 1519(0x5ef, float:2.129E-42)
            QfgSZK.DcMfJK.kCm = r3
        L373:
            int r3 = QfgSZK.DcMfJK.kCm
            r3 = r3 ^ 4990(0x137e, float:6.992E-42)
            int r3 = r3 >> 112
            QfgSZK.DcMfJK.kCm = r3
        L37b:
            int r3 = QfgSZK.DcMfJK.kCm
            r3 = r3 ^ 7389(0x1cdd, float:1.0354E-41)
            QfgSZK.DcMfJK.kCm = r3
        L381:
            java.lang.String r3 = "tu"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L3a1
            if (r2 == 0) goto L39d
            java.lang.String r3 = QfgSZK.DcMfJK.DlIaRS
            java.lang.String r4 = "Iy^,DAuwcF\u0002TOKnNSYPzVT^[W[U^HxLCTlfvvd VMz$iolf'{|saseuk>{ntw9hehCLHx.Z_\"LCEQ\b\u0007mA_XIIWoA F\\PY\u0016GJFinii.zcHld$qnn{9ukhtqq\f1z|cp`rj&\u000eAvE~fhM@\u000eTGRX\tUiCAdCd^FVJTWY\u001aI^|sETRI\u0001mx&\u007fmdedqF`Auk\f"
            java.lang.String r4 = QfgSZK.GCXiNH.fsw(r4)
            QfgSZK.FQMcgE.OijiEz(r3, r4)
            r1.akFAfk = r2
            goto L3a1
        L39d:
            if (r4 == 0) goto L3a1
            r1.akFAfk = r4
        L3a1:
            boolean r2 = r0.ausHaw
            boolean r3 = r1.akrmuA
            if (r3 != 0) goto L3ab
            if (r2 == 0) goto L3ab
            r1.akrmuA = r7
        L3ab:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r13)
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface r3 = r0.iGYzRr
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 3
            r4.<init>(r6)
            java.lang.String r6 = "rc\\SBU"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r7 = r17
            r4.put(r6, r7)
            java.lang.String r6 = "ntH\u007fB^oAeL"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r7 = r18
            r4.put(r6, r7)
            java.lang.String r6 = "s~UoN"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            java.lang.String r7 = r1.sfBaYs
            r4.put(r6, r7)
            java.lang.String r6 = "~~UbNRuwcFkMY]IIUP"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r2.put(r6, r3)
            java.lang.String r3 = "otJyNBuXePGGzHQKYTP"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            r2.put(r3, r4)
            java.lang.String r3 = "otJyNBuViIFFX"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            QfgSZK.OeawrH r4 = r0.OezBCG
            r6 = 0
            java.util.Map r4 = QfgSZK.ExKek.QWpYiD(r4, r6, r5)
            r2.put(r3, r4)
            java.lang.String r3 = "otJyNBuK~D"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
            QfgSZK.ExKek r4 = r0.QOBnea
            java.lang.String r5 = r4.sznweJ
            java.lang.String r6 = r1.dFVjhZ
            java.lang.String r7 = "~}^mY\u0002/nbO"
            java.lang.String r7 = QfgSZK.GCXiNH.fsw(r7)
            java.lang.String r4 = r4.gsvlRV(r5, r6, r7)
            r2.put(r3, r4)
            android.app.Activity r3 = r16.saNDaQ()
            if (r3 == 0) goto L423
            java.lang.String r4 = "odUbB_f_o\\KUC]Q"
            java.lang.String r4 = QfgSZK.GCXiNH.fsw(r4)
            r2.put(r4, r3)
        L423:
            QfgSZK.DCUTEI r3 = QfgSZK.DcMfJK.iGmINl
            java.util.concurrent.atomic.AtomicLong r4 = r0.dMpqQQ
            long r4 = r4.get()
            r3.dUDNAs(r15, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DcMfJK.$invoke$special$DPHOMC(QfgSZK.DIIpTV, com.lexisnexisrisk.threatmetrix.TMXProfilingOptions, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:13:0x003d) to fix multi-entry loop: BACK_EDGE: B:12:0x0039 -> B:13:0x003d */
    public final /* synthetic */ TMXStatusCode $invoke$special$DaTmkG(String str, DCJXGO dcjxgo) throws fNUfqk, InterruptedException {
        int length;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExKek exKek = this.QOBnea;
        String strGsvlRV = exKek.gsvlRV(exKek.sznweJ, str, GCXiNH.fsw("~}^mY\u001fqpk"));
        fwDlxl fwdlxl = new fwDlxl(strGsvlRV, countDownLatch);
        byte[] bArrZuWLRA = dcjxgo.zuWLRA();
        OeawrH oeawrH = this.OezBCG;
        if (bArrZuWLRA != null) {
            length = bArrZuWLRA.length;
        } else if ((kCm ^ 3230) != 0) {
            while (true) {
                int i = kCm;
                int i2 = i + 26;
                if (i2 != 86) {
                    if (i2 == 234) {
                        kCm = (i ^ 1162) >> 117;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                kCm ^= 2217;
            }
        } else {
            length = 0;
        }
        this.iGYzRr.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, strGsvlRV, ExKek.QWpYiD(oeawrH, null, length), bArrZuWLRA, fwdlxl);
        if (!countDownLatch.await(this.RGVkLd, TimeUnit.MILLISECONDS)) {
            throw new fNUfqk(TMXStatusCode.TMX_NetworkTimeout_Error);
        }
        TMXStatusCode statusCode = fwdlxl.getStatusCode();
        TMXStatusCode tMXStatusCode = TMXStatusCode.TMX_OK;
        if (statusCode == tMXStatusCode) {
            return tMXStatusCode;
        }
        throw new fNUfqk(TMXStatusCode.TMX_PartialProfile);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, IGET, INVOKE]}, finally: {[INVOKE, IGET, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, SGET, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, IGET, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, SGET, SGET, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, SGET, IF] complete}, expected: {[INVOKE, IGET, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, SGET, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[LOOP:1: B:93:0x0279->B:113:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void $invoke$special$ODCBUN(String str, String str2, TMXProfilingOptions tMXProfilingOptions, TMXEndNotifier tMXEndNotifier, DIADVb dIADVb) {
        int i;
        boolean zSpnCvw;
        int i2;
        Zpvmxu.dbAction(((Boolean) Class.forName(GCXiNH.fsw("|\u007f_~DXe0c[\fgOK]@")).getMethod(GCXiNH.fsw("tb\u007fiIDfyiZaLDGMDBPP"), new Class[0]).invoke(null, new Object[0])).booleanValue());
        TMXStatusCode tMXStatusCode = TMXStatusCode.TMX_NotYet;
        try {
            try {
                String str3 = DlIaRS;
                StringBuilder sb = new StringBuilder();
                sb.append(GCXiNH.fsw("~~UxB_twbO\u0002SXFNNZP\u0014AW@EJMI\u001c"));
                sb.append(GCXiNH.fsw(this.OJJBNZ.fGsPTM() ? "t\u007fRxNU!\u007f`ZGBNP" : "=\u007f^iOB!wbAV"));
                FQMcgE.OijiEz(str3, sb.toString());
                if (this.OJJBNZ.hfFNez() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                DwQSDd.abAflu();
                if (!this.OJJBNZ.OEsIKP() || this.RinfLL) {
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("nrZb{PbumOGP\u0002YZHP\\XV\u001b\u000b\u0010N\\RNO_]\u0019\u0017Hjp#koiJIm$dx)lnetv\u007fwu"));
                    zSpnCvw = false;
                } else {
                    zSpnCvw = iGmINl.spnCvw(this.Umbazn, this.OJJBNZ, fNLfdT.PROFILE, 0L, this.dEFDnc, null);
                }
                gMxgjU gmxgju = new gMxgjU(new dMCrTj());
                this.QeFQWe = gmxgju;
                gmxgju.start();
                if (this.OJJBNZ.hfFNez() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
                DIIpTV dIIpTV$invoke$special$gBtXYZ = $invoke$special$gBtXYZ(str, str2);
                Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("meC"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP));
                if (this.OJJBNZ.hfFNez() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                iGmINl.OFhtUX();
                $invoke$special$DPHOMC(dIIpTV$invoke$special$gBtXYZ, tMXProfilingOptions, str, str2);
                String str4 = dIIpTV$invoke$special$gBtXYZ.dFVjhZ;
                $invoke$special$hOMIpD(dIIpTV$invoke$special$gBtXYZ, str, str2);
                DCJXGO dcjxgo$invoke$special$siEkQe = $invoke$special$siEkQe(str, str2, zSpnCvw, tMXProfilingOptions, dIIpTV$invoke$special$gBtXYZ);
                if (this.OJJBNZ.hfFNez() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                DPHsZd dPHsZd = this.OHpuMD.get(str);
                if (dPHsZd != null) {
                    dPHsZd.DPhTBN();
                }
                TMXStatusCode tMXStatusCode$invoke$special$DaTmkG = $invoke$special$DaTmkG(str4, dcjxgo$invoke$special$siEkQe);
                Ohcwxs.gvFztT();
                if (this.OJJBNZ.hfFNez()) {
                    tMXStatusCode$invoke$special$DaTmkG = TMXStatusCode.TMX_Interrupted_Error;
                    Thread.interrupted();
                }
                this.QeFQWe = null;
                $invoke$special$hlXVux(new TMXProfilingHandle.Result(str2, tMXStatusCode$invoke$special$DaTmkG), tMXEndNotifier, dIADVb);
                HrMTQN.uzCIH().adwzgZ(str2, tMXStatusCode$invoke$special$DaTmkG);
                if (kCm <= 3229) {
                    while (true) {
                        i2 = kCm;
                        int i3 = i2 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                        if (i3 == 18) {
                            kCm = ((i2 % 13) + i2) * 21;
                            break;
                        } else if (i3 == 110) {
                            break;
                        }
                    }
                    kCm = ((kCm % 20) + i2) ^ 5192;
                }
            } catch (fNUfqk e) {
                TMXStatusCode tMXStatusCode2 = e.DkckDm;
                ORrpqH.uzCIH().seuMaA(e);
                Ohcwxs.gvFztT();
                if (this.OJJBNZ.hfFNez()) {
                    tMXStatusCode2 = TMXStatusCode.TMX_Interrupted_Error;
                    Thread.interrupted();
                }
                this.QeFQWe = null;
                $invoke$special$hlXVux(new TMXProfilingHandle.Result(str2, tMXStatusCode2), tMXEndNotifier, dIADVb);
                HrMTQN.uzCIH().adwzgZ(str2, tMXStatusCode2);
                if ((fTB ^ 3939) == 0) {
                    return;
                }
                if (kCm <= 3229) {
                    do {
                        int i4 = kCm;
                        i = i4 + 247;
                        if (i == 73) {
                            kCm = (i4 ^ 2718) + i4;
                        }
                    } while (i != 269);
                    while (true) {
                        kCm = (kCm * 41) >> 5;
                    }
                }
                while (fTB + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 != 58) {
                }
                while (true) {
                    fTB = ((fTB >> 73) * 25) ^ 2274;
                }
            } catch (InterruptedException e2) {
                if (this.OJJBNZ.hfFNez()) {
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("mcTjB]d>~MSVOZ\\\u0007_[@V@CE_JXX\u001b^L]\u0017Rj$`coc[@"));
                } else {
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("mcTjB]d>~MSVOZ\\\u0007_[@V@CE_JXX"), e2);
                    TMXStatusCode tMXStatusCode3 = TMXStatusCode.TMX_Internal_Error;
                }
                TMXStatusCode tMXStatusCode4 = TMXStatusCode.TMX_Interrupted_Error;
                ORrpqH.uzCIH().seuMaA(e2);
                Ohcwxs.gvFztT();
                if (this.OJJBNZ.hfFNez()) {
                    Thread.interrupted();
                }
                this.QeFQWe = null;
                $invoke$special$hlXVux(new TMXProfilingHandle.Result(str2, tMXStatusCode4), tMXEndNotifier, dIADVb);
                HrMTQN.uzCIH().adwzgZ(str2, tMXStatusCode4);
                if (fTB > 3938) {
                    return;
                }
                if (kCm <= 3229) {
                }
                while (fTB + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 != 58) {
                }
                while (true) {
                    fTB = ((fTB >> 73) * 25) ^ 2274;
                }
            } catch (Throwable th) {
                TMXStatusCode tMXStatusCode5 = TMXStatusCode.TMX_Internal_Error;
                FQMcgE.DFbvW(DlIaRS, GCXiNH.fsw("mcTjB]d>~MSVOZ\\\u0007PT]_WU"), th);
                ORrpqH.uzCIH().seuMaA(th);
                Ohcwxs.gvFztT();
                if (this.OJJBNZ.hfFNez()) {
                    tMXStatusCode5 = TMXStatusCode.TMX_Interrupted_Error;
                    Thread.interrupted();
                }
                this.QeFQWe = null;
                $invoke$special$hlXVux(new TMXProfilingHandle.Result(str2, tMXStatusCode5), tMXEndNotifier, dIADVb);
                HrMTQN.uzCIH().adwzgZ(str2, tMXStatusCode5);
                if ((fTB ^ 3939) == 0) {
                    return;
                }
                if (kCm <= 3229) {
                }
                while (fTB + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 != 58) {
                }
                while (true) {
                    fTB = ((fTB >> 73) * 25) ^ 2274;
                }
            }
        } catch (Throwable th2) {
            Ohcwxs.gvFztT();
            if (this.OJJBNZ.hfFNez()) {
                tMXStatusCode = TMXStatusCode.TMX_Interrupted_Error;
                Thread.interrupted();
            }
            this.QeFQWe = null;
            $invoke$special$hlXVux(new TMXProfilingHandle.Result(str2, tMXStatusCode), tMXEndNotifier, dIADVb);
            HrMTQN.uzCIH().adwzgZ(str2, tMXStatusCode);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ void $invoke$special$ROgMPW(ZqidTP zqidTP) {
        suEgdN suegdn = this.DVBNek;
        try {
            if ((this.dMpqQQ.get() & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == 0 || suegdn == null) {
                return;
            }
            this.hQaSiC = suegdn.bindToGooglePlayService(zqidTP);
        } catch (SecurityException e) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("\u007fxUh\u000bTslcZ\u0002\u000e\nJGIB\\ZFW"), e.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ TMXStatusCode $invoke$special$Rtjmuc(String str, TMXStatusCode tMXStatusCode, TMXEndNotifier tMXEndNotifier) {
        if (tMXEndNotifier != null) {
            new Thread(new DSqxTE(tMXEndNotifier, str, tMXStatusCode)).start();
        }
        return tMXStatusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ TMXProfilingHandle $invoke$special$RuDPQV(TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier, TMXProfilingHandle tMXProfilingHandle) {
        if (tMXEndNotifier != null) {
            new Thread(new RunnableC0003DcMfJK(result, tMXEndNotifier)).start();
        }
        return tMXProfilingHandle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v20, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX DEBUG: Multi-variable search result rejected for r13v21, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX DEBUG: Multi-variable search result rejected for r13v22, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX DEBUG: Multi-variable search result rejected for r13v23, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX DEBUG: Multi-variable search result rejected for r13v24, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX DEBUG: Multi-variable search result rejected for r13v25, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX DEBUG: Multi-variable search result rejected for r13v9, resolved type: com.lexisnexisrisk.threatmetrix.TMXStatusCode */
    /* JADX WARN: Can't wrap try/catch for region: R(10:(4:52|(4:159|54|55|56)|154|150)(1:65)|66|(2:(1:69)(1:70)|71)|72|157|73|(1:75)|76|77|(1:79)(1:183)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0211, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0213, code lost:
    
        if (QfgSZK.DcMfJK.kCm <= 3229) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r0 = QfgSZK.DcMfJK.kCm;
        r2 = r0 + 299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021b, code lost:
    
        if (r2 == 58) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        if (r2 == 122) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0222, code lost:
    
        QfgSZK.DcMfJK.kCm = (r0 + r0) >> com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm * 52) ^ 4738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024f, code lost:
    
        r0 = QfgSZK.DcMfJK.fTB;
        r2 = r0 + 286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0255, code lost:
    
        if (r2 != 13) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0259, code lost:
    
        if (r2 != 26) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025d, code lost:
    
        if (r2 != 170) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0260, code lost:
    
        QfgSZK.DcMfJK.fTB = (r0 % 104) % 53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0268, code lost:
    
        if (QfgSZK.DcMfJK.kCm <= 3229) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026a, code lost:
    
        r2 = QfgSZK.DcMfJK.kCm;
        r0 = r2 + 338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0270, code lost:
    
        if (r0 != 31) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0274, code lost:
    
        if (r0 != 103) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027b, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm ^ 5284) * 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0284, code lost:
    
        QfgSZK.DcMfJK.kCm ^= 5918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028b, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm + r2) ^ 4890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0293, code lost:
    
        QfgSZK.DcMfJK.fTB = ((QfgSZK.DcMfJK.fTB ^ 4977) + r0) ^ 4475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029d, code lost:
    
        QfgSZK.DcMfJK.fTB = r0 ^ 6289;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b6, code lost:
    
        r0 = QfgSZK.DcMfJK.kCm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02bf, code lost:
    
        QfgSZK.DcMfJK.kCm = (r0 ^ 2282) >> 94;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b5, code lost:
    
        if (QfgSZK.DcMfJK.kCm <= 3229) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f6, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fa, code lost:
    
        if ((QfgSZK.DcMfJK.kCm ^ 3230) != 0) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b6 A[LOOP:7: B:146:0x02b6->B:182:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[PHI: r13
  PHI (r13v10 java.lang.Object) = (r13v16 java.lang.Object), (r13v17 java.lang.Object), (r13v18 java.lang.Object), (r13v19 java.lang.Object) binds: [B:99:0x01fa, B:119:0x024d, B:107:0x0213, B:80:0x01b5] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void $invoke$special$aGOrKO(String str, String str2, String str3, String str4, String str5, String str6, TMXStrongAuth.AuthMethod authMethod, boolean z, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier, boolean z2) {
        TMXStatusCode tMXStatusCode;
        Object obj;
        TMXStrongAuth.AuthParamResult authParamResultAdevsa;
        try {
            try {
            } catch (fNUfqk e) {
                e = e;
            } catch (IllegalArgumentException e2) {
                e = e2;
            } catch (InterruptedException e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
            }
            if (!this.OJJBNZ.fGsPTM()) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014Z\\XD\u0007\u0017\u001dUH\u001aWWC\u0006feondd"));
                $invoke$special$Rtjmuc(str2, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                return;
            }
            if (!this.OJJBNZ.QjzqRB(this.RGVkLd)) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014g[\\U@KI\u001cLRPTR\u0006rejvhnY\foky*`fnb5`|2wyawnt"));
                $invoke$special$Rtjmuc(str2, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                return;
            }
            DCUTEI dcutei = iGmINl;
            OAjjVP oAjjVPQCjLjM = dcutei.QCjLjM();
            if ((this.dMpqQQ.get() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) != 0 && oAjjVPQCjLjM != null) {
                ZqidTP zqidTP = this.Umbazn;
                if (zqidTP == null) {
                    $invoke$special$Rtjmuc(str2, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                    return;
                }
                new gMxgjU(new dMCrTj()).start();
                DIIpTV dIIpTV$invoke$special$gBtXYZ = $invoke$special$gBtXYZ(str, str2);
                String str7 = dIIpTV$invoke$special$gBtXYZ.dFVjhZ;
                if (!dIIpTV$invoke$special$gBtXYZ.fcZaDc) {
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014rGEXJPIUX[MQXH%ilftl[\f`w+df|'s{uq~tt#>mp~{j}7dJKP|mZ\u0010VM_IDRjMMHRD\u001dMu_p^GH\u001b"));
                    $invoke$special$Rtjmuc(str2, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                    return;
                }
                dIjzlO(dIIpTV$invoke$special$gBtXYZ, str);
                String str8 = str4 == null ? "" : str4;
                byte[] bArrZeUJxr = UPbYzn.zeUJxr(dIIpTV$invoke$special$gBtXYZ.sfBaYs);
                if (z2) {
                    authParamResultAdevsa = oAjjVPQCjLjM.seuMaA(zqidTP.Umbazn, str8, str5, str6, bArrZeUJxr, strongAuthCallback);
                } else {
                    boolean zIsAvailable = UkvvWh.isAvailable(zqidTP.Umbazn);
                    authParamResultAdevsa = oAjjVPQCjLjM.adevsa(zqidTP.Umbazn, authMethod, str8, str5, str6, bArrZeUJxr, strongAuthCallback, zIsAvailable, zIsAvailable ? UkvvWh.sDMsbj : null, zIsAvailable ? UkvvWh.gatkcr : 0L);
                }
                TMXStrongAuth.AuthParamResult authParamResult = authParamResultAdevsa;
                DCJXGO dcjxgo = new DCJXGO();
                if (UPbYzn.dTTfOR(str3)) {
                    dcjxgo.DarRvM(GCXiNH.fsw("npI}"), str3);
                }
                if (authParamResult == null) {
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014"));
                    $invoke$special$Rtjmuc(str2, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                    return;
                }
                if (z) {
                    TMXStatusCode tMXStatusCode2 = authParamResult.vklRO.UvUzrV;
                    if (tMXStatusCode2 != TMXStatusCode.TMX_OK) {
                        try {
                            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014") + tMXStatusCode2);
                            $invoke$special$Rtjmuc(str2, tMXStatusCode2, tMXEndNotifier);
                            return;
                        } catch (fNUfqk e4) {
                            e = e4;
                            TMXStatusCode tMXStatusCode3 = e.DkckDm;
                            ORrpqH.uzCIH().seuMaA(e);
                            $invoke$special$Rtjmuc(str2, tMXStatusCode3, tMXEndNotifier);
                            tMXStatusCode = tMXStatusCode3;
                            if ((kCm ^ 3230) != 0) {
                            }
                            return;
                        } catch (IllegalArgumentException e5) {
                            e = e5;
                            TMXStatusCode tMXStatusCode4 = TMXStatusCode.TMX_StrongAuth_Unsupported;
                            ORrpqH.uzCIH().seuMaA(e);
                            $invoke$special$Rtjmuc(str2, tMXStatusCode4, tMXEndNotifier);
                            tMXStatusCode = tMXStatusCode4;
                            if ((fTB ^ 3939) != 0) {
                            }
                            return;
                        } catch (InterruptedException e6) {
                            e = e6;
                            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002QOX]BEA\u0014Z\\EU]LHLO_]\u0002\u0017"), e);
                            TMXStatusCode tMXStatusCode5 = TMXStatusCode.TMX_StrongAuth_Cancelled;
                            ORrpqH.uzCIH().seuMaA(e);
                            $invoke$special$Rtjmuc(str2, tMXStatusCode5, tMXEndNotifier);
                            obj = tMXStatusCode5;
                            tMXStatusCode = tMXStatusCode5;
                            if ((fTB ^ 3939) != 0) {
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002QOX]BEA\u0014USX\\JZ"), th);
                            TMXStatusCode tMXStatusCode6 = TMXStatusCode.TMX_StrongAuth_Failed;
                            ORrpqH.uzCIH().seuMaA(th);
                            $invoke$special$Rtjmuc(str2, tMXStatusCode6, tMXEndNotifier);
                            tMXStatusCode = tMXStatusCode6;
                            if ((fTB ^ 3939) != 0) {
                            }
                            return;
                        }
                    }
                    return;
                }
                dcjxgo.put(GCXiNH.fsw("npd\u007f_"), authParamResult.vklRO.hkMEAD);
                if (authParamResult.QIfFad != null) {
                    String strFsw = GCXiNH.fsw(z2 ? "npd|@" : "npd\u007fBV");
                    String str9 = authParamResult.QIfFad;
                    dcjxgo.DarRvM(strFsw, str9, Integer.valueOf(str9.length() + 1));
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ZtUiYPu{h\bPFM@[SDT@Z]_\u0010LLXX^TMQVJ%mp8") + authParamResult.QIfFad);
                }
                String str10 = str7;
                DCJXGO dcjxgoRidNCX = this.OezBCG.RidNCX(dIIpTV$invoke$special$gBtXYZ, str, str2, null, dcjxgo, dcutei, false);
                $invoke$special$hOMIpD(dIIpTV$invoke$special$gBtXYZ, str, str2);
                TMXStatusCode tMXStatusCode$invoke$special$DaTmkG = $invoke$special$DaTmkG(str10, dcjxgoRidNCX);
                if (tMXStatusCode$invoke$special$DaTmkG == TMXStatusCode.TMX_OK) {
                    tMXStatusCode$invoke$special$DaTmkG = authParamResult.vklRO.UvUzrV;
                }
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002QOX]BEA\u0014P]\\@C[IY"));
                $invoke$special$Rtjmuc(str2, tMXStatusCode$invoke$special$DaTmkG, tMXEndNotifier);
                if ((fTB ^ 3939) == 0) {
                    return;
                } else {
                    obj = str10;
                }
            }
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014g\u007fiqZJUYUNP[VRlkm\"hs\u001eH`wjhemc6zf3\u007f~tzrx<ri9vxs\u0005SEqgJ\u001e\"uAIDUB\bT[PY\u001dMu]e\u0011ATP\u0016TW[xnoy.yuSqjkk&hn9NVD\\kkHt|g}vwcqe@\u0014kN{gmF\u0007G^\bNDJPqWHe\u000eh^\u0012CVX\u0018VJI\u0002"));
            $invoke$special$Rtjmuc(str2, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        } catch (Throwable th3) {
            $invoke$special$Rtjmuc(str2, tMXStatusCode, tMXEndNotifier);
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ void $invoke$special$aKhcqp(long j, long j2) {
        AtomicLong atomicLong = this.dMpqQQ;
        long j3 = this.OezBCG.UgUpud;
        if ((kCm ^ 3230) == 0) {
            atomicLong.set(((~j) & j3) | j2);
        } else {
            while (true) {
                int i = kCm;
                if (i + 13 == 1) {
                    kCm = ((i + i) >> 49) % 120;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:65:0x00fe) to fix multi-entry loop: BACK_EDGE: B:64:0x00f6 -> B:65:0x00fe */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        r0 = QfgSZK.DcMfJK.kCm;
        r1 = r0 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r1 == 22) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r1 == 169) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (r1 == 360) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        if (r1 == 467) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        QfgSZK.DcMfJK.kCm = (r0 % 88) ^ 3955;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        QfgSZK.DcMfJK.kCm = ((QfgSZK.DcMfJK.kCm * 4) >> 73) ^ 3582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        QfgSZK.DcMfJK.kCm = ((QfgSZK.DcMfJK.kCm % 62) + r0) ^ 3203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        QfgSZK.DcMfJK.kCm = ((QfgSZK.DcMfJK.kCm % 81) >> 24) + r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de A[EDGE_INSN: B:83:0x00de->B:102:? BREAK  A[LOOP:5: B:29:0x0070->B:84:0x0070], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean $invoke$special$aVhqwO() {
        int i;
        int i2;
        if (this.gFVGZP != 0) {
            if ((kCm ^ 3230) != 0) {
                do {
                    i = kCm;
                    i2 = i + 26;
                    if (i2 == 38) {
                        while (true) {
                            kCm = ((kCm ^ 4887) % 42) >> 82;
                        }
                    }
                } while (i2 != 133);
                while (true) {
                    kCm = ((kCm + i) % 87) >> 20;
                }
            } else if (this.rTOlm != 0) {
                long j = this.gFVGZP;
                long jConvert = TimeUnit.MILLISECONDS.convert(this.rTOlm, TimeUnit.MINUTES);
                if (kCm <= 3229) {
                    while (kCm + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 71) {
                    }
                    while (true) {
                        kCm = (kCm % 80) >> 59;
                    }
                } else if (j + jConvert > System.currentTimeMillis()) {
                    if ((fTB ^ 3939) == 0) {
                        return true;
                    }
                    if (kCm > 3229) {
                        while (true) {
                            int i3 = fTB;
                            int i4 = i3 + 52;
                            if (i4 != 12) {
                                if (i4 == 159) {
                                    fTB = (i3 + i3) * 7644;
                                    if ((kCm ^ 3230) != 0) {
                                        break;
                                    }
                                } else if (i4 != 308) {
                                    continue;
                                }
                                fTB = (fTB % 51) % 74;
                                if ((kCm ^ 3230) == 0) {
                                    break;
                                }
                            } else {
                                fTB = (i3 ^ 2853) + i3;
                                if ((kCm ^ 3230) != 0) {
                                    break;
                                }
                                fTB = (fTB % 51) % 74;
                                if ((kCm ^ 3230) == 0) {
                                }
                            }
                        }
                    }
                    while (true) {
                        int i5 = kCm;
                        int i6 = i5 + 78;
                        if (i6 == 35) {
                            break;
                        }
                        if (i6 == 154) {
                            kCm = (i5 >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) * 44;
                        } else if (i6 == 229) {
                            kCm = (kCm ^ 3761) >> 87;
                            break;
                        }
                    }
                    while (true) {
                        kCm = (kCm ^ 3965) >> 8;
                        kCm = (kCm ^ 3761) >> 87;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:56:0x00ba) to fix multi-entry loop: BACK_EDGE: B:55:0x00b5 -> B:56:0x00ba */
    /* JADX DEBUG: Duplicate block (B:83:0x0121) to fix multi-entry loop: BACK_EDGE: B:82:0x011a -> B:83:0x0121 */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00ba, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm ^ 3240) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if ((QfgSZK.DcMfJK.kCm ^ 3230) != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r0 = QfgSZK.DcMfJK.fTB;
        r5 = r0 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r5 == 71) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r5 == 247) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r5 == 415) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r5 == 553) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        QfgSZK.DcMfJK.fTB = (r0 + r0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if ((QfgSZK.DcMfJK.kCm ^ 3230) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        r5 = QfgSZK.DcMfJK.kCm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if ((r5 + 208) == 20) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm >> 11) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        QfgSZK.DcMfJK.fTB = (QfgSZK.DcMfJK.fTB + r0) * 41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (QfgSZK.DcMfJK.kCm > 3229) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        r0 = QfgSZK.DcMfJK.kCm;
        r5 = r0 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r5 == 54) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r5 == 145) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (r5 == 230) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r5 == 391) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm * 9150) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        QfgSZK.DcMfJK.kCm = (r0 % 125) ^ 1347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        QfgSZK.DcMfJK.kCm = ((r0 ^ 3846) * 46) % 41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        QfgSZK.DcMfJK.kCm *= 4225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        QfgSZK.DcMfJK.fTB = (r0 * 75) % 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if ((QfgSZK.DcMfJK.kCm ^ 3230) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r0 = QfgSZK.DcMfJK.kCm;
        r1 = r0 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r1 == 34) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r1 == 65) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        if (r1 == 175) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
    
        if (r1 == 291) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
    
        QfgSZK.DcMfJK.kCm = (r0 % 51) ^ 2402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        QfgSZK.DcMfJK.kCm = (r0 % 66) ^ 5478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm * 101) ^ 5266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        QfgSZK.DcMfJK.fTB = (r0 ^ 2803) >> 24;
     */
    /* JADX WARN: Path cross not found for [B:144:?, B:135:?], limit reached: 151 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0078 -> B:13:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean $invoke$special$atDTRm() {
        boolean z;
        int i;
        ZqidTP zqidTP = this.Umbazn;
        if (zqidTP == null || DGUQLI.sVXHln(zqidTP)) {
            if (fTB <= 3938) {
            }
            z = true;
        } else {
            z = false;
        }
        if (this.gFVGZP == 0) {
            return z;
        }
        if (!z && !this.UuVRT) {
            return false;
        }
        if (kCm <= 3229) {
            do {
                int i2 = kCm;
                i = i2 + 78;
                if (i != 63) {
                    if (i == 165) {
                        kCm = ((i2 % 9) ^ 1302) % 59;
                    } else if (i == 206) {
                        while (true) {
                            kCm = (kCm + i2) % 90;
                        }
                    }
                }
                while (true) {
                    kCm = ((kCm * 60) + i2) ^ 2690;
                }
            } while (i != 262);
            while (true) {
                kCm = (kCm * 124) ^ 16;
            }
        } else {
            if (fTB > 3938) {
                return true;
            }
            while (true) {
                int i3 = fTB;
                int i4 = i3 + 91;
                if (i4 != 48) {
                    if (i4 == 243) {
                        fTB = (i3 ^ 1105) * 31;
                        if (kCm <= 3229) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                fTB *= 1750;
            }
            while (true) {
                int i5 = kCm;
                int i6 = i5 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                if (i6 == 18) {
                    kCm = ((i5 * 28) % 99) + i5;
                } else if (i6 == 206) {
                    break;
                }
            }
            while (true) {
                kCm = ((kCm * 83) % 76) ^ 4900;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ boolean $invoke$special$dPnHjp(DIIpTV dIIpTV, String str) {
        DPHsZd dPHsZd = this.OHpuMD.get(str);
        if (dPHsZd == null || !dPHsZd.zLAIeZ(dIIpTV.fqVTOY, dIIpTV.UnJFsM, GCXiNH.fsw("%?\u000b!\u0013\t"), dIIpTV.EESEk)) {
            return false;
        }
        long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
        dPHsZd.ihnvzI(GCXiNH.fsw("nuPZNCrwcF"), GCXiNH.fsw("%?\u000b!\u0013\t"));
        dPHsZd.ihnvzI(GCXiNH.fsw("x\u007fZnGTNnxAMMY"), dIIpTV.fqVTOY);
        String strFsw = GCXiNH.fsw("yxHmI]dQ|\\KLDZ");
        if (kCm <= 3229) {
            while (true) {
                int i = kCm;
                int i2 = i + 39;
                if (i2 != 35) {
                    if (i2 == 133) {
                        kCm = (i + i) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                        break;
                    }
                } else {
                    break;
                }
            }
            kCm = (kCm % 101) >> 11;
        }
        dPHsZd.ihnvzI(strFsw, dIIpTV.UnJFsM);
        dPHsZd.ihnvzI(GCXiNH.fsw("ldRi_adleGF"), dIIpTV.EESEk);
        Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("mbT"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ DIIpTV $invoke$special$gBtXYZ(String str, String str2) throws fNUfqk, InterruptedException {
        int length;
        int i;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        DIIpTV dIIpTV = new DIIpTV();
        byte[] bArrZuWLRA = this.QOBnea.dbwnZN(str, str2, this.OezBCG.adICYR).zuWLRA();
        OeawrH oeawrH = this.OezBCG;
        if (bArrZuWLRA != null) {
            length = bArrZuWLRA.length;
        } else if (fTB <= 3938) {
            while (true) {
                int i2 = fTB;
                int i3 = i2 + 26;
                if (i3 == 97) {
                    break;
                }
                if (i3 == 148) {
                    fTB = ((i2 % 4) * 7) ^ 1053;
                }
            }
            do {
                fTB = ((fTB ^ 3480) >> 35) ^ 3705;
            } while ((kCm ^ 3230) == 0);
            do {
                i = kCm + 91;
                if (i == 48) {
                    while (true) {
                        kCm = ((kCm >> 57) % 56) ^ 1202;
                    }
                }
            } while (i != 97);
            while (true) {
                kCm >>= CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA;
            }
        } else {
            length = 0;
        }
        Map<String, String> mapQWpYiD = ExKek.QWpYiD(oeawrH, null, length);
        RKUgwx rKUgwx = new RKUgwx(this.QOBnea.fVjYLc(), countDownLatch, dIIpTV, str, str2);
        this.iGYzRr.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, this.QOBnea.fVjYLc(), mapQWpYiD, bArrZuWLRA, rKUgwx);
        if (!countDownLatch.await(this.RGVkLd, TimeUnit.MILLISECONDS)) {
            throw new fNUfqk(TMXStatusCode.TMX_NetworkTimeout_Error);
        }
        if (rKUgwx.getStatusCode() != TMXStatusCode.TMX_OK) {
            throw new fNUfqk(rKUgwx.getStatusCode());
        }
        if (dIIpTV.cBPFI()) {
            return dIIpTV;
        }
        throw new fNUfqk(TMXStatusCode.TMX_ConfigurationError);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ void $invoke$special$hOMIpD(DIIpTV dIIpTV, String str, String str2) {
        new Thread(new DCKfqP(dIIpTV, str, str2)).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ TMXProfilingHandle $invoke$special$hlXVux(TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier, TMXProfilingHandle tMXProfilingHandle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.OJJBNZ.gqESXP();
        if (fTB > 3938) {
            return $invoke$special$RuDPQV(result, tMXEndNotifier, tMXProfilingHandle);
        }
        while (true) {
            i = fTB;
            int i7 = i + 13;
            if (i7 == 53) {
                int i8 = kCm;
                if (i8 <= 3229) {
                    do {
                        i4 = kCm;
                    } while (i4 + 91 != 19);
                    while (true) {
                        kCm = ((kCm % 76) + i4) * 33;
                    }
                } else if ((i8 ^ 3230) != 0) {
                    while (true) {
                        int i9 = kCm;
                        int i10 = i9 + 130;
                        if (i10 == 59) {
                            kCm = (i9 >> 100) ^ 4196;
                        } else if (i10 != 193) {
                            if (i10 == 242) {
                                kCm = (kCm % 98) ^ 4953;
                            } else if (i10 == 303) {
                                i3 = ((i9 % 53) % 87) ^ 4249;
                                kCm = i3;
                                kCm = (kCm % 98) ^ 4953;
                            }
                        }
                        i3 = (kCm >> 38) ^ 4712;
                        kCm = i3;
                        kCm = (kCm % 98) ^ 4953;
                    }
                } else {
                    fTB = ((i % 39) % 62) ^ 1703;
                    if (i8 <= 3229) {
                        while (true) {
                            int i11 = kCm;
                            int i12 = i11 + 78;
                            if (i12 == 81) {
                                i2 = ((i11 >> 82) + i11) >> 79;
                                break;
                            }
                            if (i12 == 111) {
                                while (true) {
                                    kCm = ((kCm ^ 4324) % 57) * 3;
                                }
                            } else if (i12 == 171) {
                                i2 = ((i11 ^ 3911) * 120) >> 14;
                                break;
                            }
                        }
                        kCm = i2;
                    }
                }
            } else if (i7 == 157) {
                fTB = (i + i) % 124;
                if (kCm <= 3229) {
                    do {
                        i6 = kCm;
                    } while (i6 + 26 != 49);
                    while (true) {
                        kCm = ((kCm * 19) + i6) * 30;
                    }
                }
            } else if (i7 == 333) {
                while (true) {
                    fTB = (fTB ^ 5063) >> 19;
                }
            } else if (i7 == 435) {
                break;
            }
        }
        while (true) {
            int i13 = fTB;
            if ((kCm ^ 3230) != 0) {
                do {
                    i5 = kCm;
                } while (i5 + 104 != 39);
                kCm = ((i5 * 107) >> 105) * 118;
            }
            fTB = (i13 + i) >> 37;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ DCJXGO $invoke$special$siEkQe(String str, String str2, boolean z, TMXProfilingOptions tMXProfilingOptions, DIIpTV dIIpTV) throws fNUfqk, InterruptedException {
        int i;
        long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
        dIjzlO(dIIpTV, str);
        this.OJJBNZ.sJPPOI(true, z ? Long.valueOf(((long) this.RGVkLd) - HrMTQN.uzCIH().zlzhuY()) : null);
        Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("na]"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP));
        DCJXGO dcjxgo = new DCJXGO();
        if (tMXProfilingOptions.aSUlQG() != null) {
            Iterator<String> it = tMXProfilingOptions.aSUlQG().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(GCXiNH.fsw("|rZ"));
                int i3 = i2 + 1;
                sb.append(i2);
                dcjxgo.DarRvM(sb.toString(), next, false);
                if (i3 >= 5) {
                    if (kCm <= 3229) {
                        while (true) {
                            i = kCm;
                            int i4 = i + 26;
                            if (i4 != 68) {
                                if (i4 == 174) {
                                    break;
                                }
                                if (i4 == 225) {
                                    kCm = ((i % 56) * 36) >> 121;
                                }
                            }
                            kCm = (kCm >> 65) * 24;
                        }
                        kCm = (i + i) ^ 2192;
                    }
                } else if ((fTB ^ 3939) != 0) {
                    if (kCm > 3229) {
                        while (true) {
                            int i5 = fTB;
                            if (i5 + 52 == 15) {
                                fTB = (i5 % 108) * 70;
                                if (kCm <= 3229) {
                                    break;
                                }
                            }
                        }
                    }
                    while (true) {
                        int i6 = kCm;
                        if (i6 + 65 == 45) {
                            kCm = (i6 + i6) * 59;
                        }
                    }
                } else {
                    i2 = i3;
                }
            }
        }
        DCUTEI dcutei = iGmINl;
        Map<String, String> mapUSBtdM = dcutei.USBtdM();
        if (mapUSBtdM != null) {
            dcjxgo.OqFWZa(mapUSBtdM);
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new ffREWX(), IYdWPz.OhvLwL, TimeUnit.MILLISECONDS);
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
        OeawrH.C0005OeawrH c0005OeawrHApNKau = tMXProfilingOptions.apNKau();
        if (c0005OeawrHApNKau == null) {
            c0005OeawrHApNKau = this.gqdqJS.getLocation();
        }
        OeawrH.C0005OeawrH c0005OeawrH = c0005OeawrHApNKau;
        long jDNxZaP2 = HJWChP.dNQGVJ.dNxZaP();
        DCJXGO dcjxgoRidNCX = this.OezBCG.RidNCX(dIIpTV, str, str2, c0005OeawrH, dcjxgo, dcutei, true);
        Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("os]"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP2));
        return dcjxgoRidNCX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DPHOMC(DIIpTV dIIpTV, TMXProfilingOptions tMXProfilingOptions, String str, String str2) throws InterruptedException {
        $invoke$special$DPHOMC(dIIpTV, tMXProfilingOptions, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStatusCode DaTmkG(String str, DCJXGO dcjxgo) throws fNUfqk, InterruptedException {
        return $invoke$special$DaTmkG(str, dcjxgo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void ODCBUN(String str, String str2, TMXProfilingOptions tMXProfilingOptions, TMXEndNotifier tMXEndNotifier, DIADVb dIADVb) {
        $invoke$special$ODCBUN(str, str2, tMXProfilingOptions, tMXEndNotifier, dIADVb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void QwvEab() {
        int i;
        if (this.OJJBNZ.fGsPTM()) {
            iGmINl.QwvEab();
        } else if (kCm > 3229) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQFDM\bE_ZYVFCYLM\u001dUU\\VJZGqmll; WB`p##)at6{{g2rqcrxx5"));
        } else {
            do {
                i = kCm;
            } while (i + 26 != 75);
            while (true) {
                kCm = ((kCm % 94) + i) ^ 4629;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void RJOkX() {
        int i;
        synchronized (this) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("~pUoN])7"));
            if (this.OJJBNZ.fGsPTM()) {
                iGmINl.RJOkX();
                if (this.OJJBNZ.zHQtTQ()) {
                    if ((fTB ^ 3939) != 0) {
                        if ((kCm ^ 3230) == 0) {
                            while (true) {
                                int i2 = fTB;
                                int i3 = i2 + 130;
                                if (i3 != 78) {
                                    if (i3 == 223) {
                                        fTB = (i2 * 119) >> 8;
                                        if (kCm <= 3229) {
                                            do {
                                                int i4 = kCm;
                                                i = i4 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                                                if (i == 32) {
                                                    kCm = ((i4 ^ 2072) + i4) % 124;
                                                }
                                            } while (i != 164);
                                            while (true) {
                                                kCm = ((kCm * 123) ^ 4155) >> 48;
                                            }
                                        }
                                    } else if (i3 != 310) {
                                    }
                                    fTB = (fTB * 6) >> 37;
                                    if (kCm <= 3229) {
                                        break;
                                    }
                                } else {
                                    fTB = (i2 >> 94) + i2;
                                    if (kCm > 3229) {
                                    }
                                }
                            }
                        }
                        while (true) {
                            int i5 = kCm;
                            int i6 = i5 + 52;
                            if (i6 != 6) {
                                if (i6 == 73) {
                                    while (true) {
                                        kCm = (kCm + i5) >> CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                    }
                                } else if (i6 == 105) {
                                    kCm = i5 ^ 5868;
                                } else if (i6 == 245) {
                                    while (true) {
                                        kCm = (kCm * 26) >> 241;
                                    }
                                }
                            }
                            kCm = ((kCm + i5) ^ 1843) * 37;
                        }
                    } else {
                        if (!this.OJJBNZ.dtVxwd()) {
                            FQMcgE.DFbvW(DlIaRS, GCXiNH.fsw("^pUoN]!\u007f`ZGBNP\bOWEDV\\TT"));
                            return;
                        }
                        if (this.OJJBNZ.zHQtTQ()) {
                            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("~pUoN]mwbO\u0002BDP\bHCAGGS_TFPZ\u001cqtp\u0018TGihp"));
                            AxsJAY.uzCIH().RJOkX();
                            TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface = this.iGYzRr;
                            if (tMXProfilingConnectionsInterface != null) {
                                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("~pUoN]mwbO\u0002BI]AQS\u0015DA]WYCWS[\u001bH\\IBCvp"));
                                tMXProfilingConnectionsInterface.cancelProfiling();
                            }
                            Thread thread = this.aRGqrS;
                            if (thread != null) {
                                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("ntUhB_f>eFVFX[]WB\u0015@\\\u0012AB@XTP^\u001aMPECd`#VHD\u0004\f") + thread.getId());
                                thread.interrupt();
                            }
                            Thread thread2 = this.QeFQWe;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                            if (thread != null && thread.isAlive()) {
                                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("jpRxB_f>jGP\u0003Z[GA_YQ\u0013FYBJ_Y\u001cOU\u0019[XKuhfvd"));
                                ggKfIT(thread, false, this.RGVkLd);
                            }
                            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("JpRxB_f>jGP\u0003KGQ\u0007Y@@@FP^KWS[\u001bpwq\u0017Edhoq"));
                            AxsJAY.uzCIH().fFgQHt();
                        }
                        this.OJJBNZ.fRNHEq();
                    }
                }
                if (this.OJJBNZ.DDDCac()) {
                    FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("JpRxB_f>jGP\u0003ZHKLWRQ\u0013ARQA"));
                    this.OJJBNZ.sJPPOI(false, null);
                }
                this.OJJBNZ.sVaiLC();
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pUoN]m{h"));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void ROgMPW(ZqidTP zqidTP) {
        $invoke$special$ROgMPW(zqidTP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStatusCode Rtjmuc(String str, TMXStatusCode tMXStatusCode, TMXEndNotifier tMXEndNotifier) {
        return $invoke$special$Rtjmuc(str, tMXStatusCode, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingHandle RuDPQV(TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier, TMXProfilingHandle tMXProfilingHandle) {
        return $invoke$special$RuDPQV(result, tMXEndNotifier, tMXProfilingHandle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:22:0x0050) to fix multi-entry loop: BACK_EDGE: B:22:0x0050 -> B:23:0x0052 */
    public String YFmri(String str, String str2, String str3, String str4, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        int i;
        if (!UPbYzn.QWSkGZ(str2) && !UPbYzn.iSpHlg(str4) && !UPbYzn.iSpHlg(str)) {
            new Thread(new sfEqpH(str, str3, str4, str2, strongAuthCallback, tMXEndNotifier)).start();
            return str;
        }
        String str5 = DlIaRS;
        if ((kCm ^ 3230) != 0) {
            while (true) {
                i = kCm;
                int i2 = i + 39;
                if (i2 == 52) {
                    kCm = ((i % 9) + i) >> 45;
                    break;
                }
                if (i2 == 210) {
                    kCm = ((i * 79) ^ 3209) + i;
                    break;
                }
                if (i2 == 240) {
                    break;
                }
            }
            while (true) {
                kCm = (kCm % 64) + i;
            }
        }
        FQMcgE.OijiEz(str5, GCXiNH.fsw("Ot\\eXEs\u007fxAMM\noINZPP\t\u0012x^Y_QU_\u001aIYEGhawgs W_)tjyzmc6a{3`twfmiyi:t}coJA"));
        $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:31:0x0061) to fix multi-entry loop: BACK_EDGE: B:30:0x005b -> B:31:0x0061 */
    public String aCSzUz(String str, String str2, String str3, String str4, String str5, String str6, String str7, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        String str8;
        String str9;
        int i;
        if (UPbYzn.iSpHlg(str7) || UPbYzn.iSpHlg(str5) || UPbYzn.iSpHlg(str4) || UPbYzn.iSpHlg(str2) || UPbYzn.iSpHlg(str)) {
            str8 = DlIaRS;
            str9 = "Ne^|^A!XmANFN\u0013\bnXCU_[U\u0010__O]V_M]E";
        } else {
            String str10 = UPbYzn.iSpHlg(str6) ? TMXStrongAuth.AuthMethod.TMX_USER_PRESENCE.methodName : str6;
            if (GCXiNH.fsw("ne^|^A").equals(str7)) {
                new Thread(new fbSiEC(str, str2, str3, str4, str5, TMXStrongAuth.AuthMethod.zsXlph(str10), strongAuthCallback, tMXEndNotifier)).start();
                return str;
            }
            if (kCm <= 3229) {
                while (true) {
                    int i2 = kCm;
                    int i3 = i2 + 65;
                    if (i3 != 93) {
                        if (i3 == 156) {
                            i = (i2 ^ 2819) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                            break;
                        }
                        if (i3 == 213) {
                            i = (i2 + i2) ^ 2554;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                kCm = i;
                while (true) {
                    kCm = (kCm * 76) ^ MTAnalysisConstants.MainWhat.ON_REPORT;
                }
            } else {
                str8 = DlIaRS;
                str9 = "Ne^|^A!XmANFN\u0013\bFCA\\lSRDFQS\u001cRI\u0019QYPdhjf- ]Mg#\u007f*yzhupqw";
            }
        }
        FQMcgE.OijiEz(str8, GCXiNH.fsw(str9));
        $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void aGOrKO(String str, String str2, String str3, String str4, String str5, String str6, TMXStrongAuth.AuthMethod authMethod, boolean z, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier, boolean z2) {
        $invoke$special$aGOrKO(str, str2, str3, str4, str5, str6, authMethod, z, strongAuthCallback, tMXEndNotifier, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void aKhcqp(long j, long j2) {
        $invoke$special$aKhcqp(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean aVhqwO() {
        return $invoke$special$aVhqwO();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean atDTRm() {
        return $invoke$special$atDTRm();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void dIjzlO(DIIpTV dIIpTV, String str) throws fNUfqk, InterruptedException {
        gMxgjU gmxgju = (gMxgjU) this.QeFQWe;
        if (gmxgju != null) {
            gmxgju.join(this.RGVkLd);
            if (gmxgju.getState() != Thread.State.TERMINATED) {
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("NrZboPu\u007f,@CPD\u000e\\\u0007UZYC^TDJZ\u001d^^\\VJR\u0006qlf\"uiSIfq\u007f*lpw\u007fgqw>1qmqohrt~"));
                gmxgju.interrupt();
                throw new fNUfqk(TMXStatusCode.TMX_ProfileTimeout_Error);
            }
            if (((dMCrTj) gmxgju.m_runnable).fcfzuX()) {
                throw new InterruptedException();
            }
        }
        if ($invoke$special$dPnHjp(dIIpTV, str)) {
            $invoke$special$aKhcqp(dIIpTV.UnJFsM & (-5062151534281218L), (-5062151534281218L) & dIIpTV.fqVTOY);
        }
        this.rTOlm = dIIpTV.EESEk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dPnHjp(DIIpTV dIIpTV, String str) {
        return $invoke$special$dPnHjp(dIIpTV, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:60:0x00de) to fix multi-entry loop: BACK_EDGE: B:60:0x00de -> B:61:0x00e0 */
    public void deregisterUser(String str, TMXEndNotifier tMXEndNotifier) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (UPbYzn.QWSkGZ(str)) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("Yt\u0016~NVhmxZCWCFF\u0007pT]_WU\n\u000fwSJZVP\\\u0017Vdvbodt[^)mx*yitepp3f~0k{oy|sjlru\u0005HAifAT"));
            if (kCm <= 3229) {
                while (true) {
                    int i6 = kCm;
                    int i7 = i6 + 26;
                    if (i7 != 71) {
                        if (i7 == 260) {
                            i5 = ((i6 % 37) + i6) >> 64;
                            kCm = i5;
                        } else if (i7 == 269) {
                            kCm = ((i6 * 115) % 16) ^ 4178;
                        }
                    }
                    i5 = kCm >> 85;
                    kCm = i5;
                }
            } else {
                $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
            }
        }
        if (fTB > 3938) {
            if (this.OJJBNZ.fGsPTM()) {
                new Thread(new DDUqPf(str, tMXEndNotifier)).start();
                return;
            } else {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014Z\\XD\u0007\u0017\u001dUH\u001aWWC\u0006feondd"));
                $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                return;
            }
        }
        if (kCm <= 3229) {
            do {
                int i8 = kCm;
                i4 = i8 + 52;
                if (i4 == 86) {
                    kCm = ((i8 >> 28) * 104) >> WebSocketProtocol.PAYLOAD_SHORT;
                }
            } while (i4 != 126);
            while (true) {
                kCm = (kCm * 8468) % 105;
            }
        }
        while (true) {
            i = fTB;
            int i9 = i + 39;
            if (i9 == 44) {
                break;
            }
            if (i9 == 67) {
                while (true) {
                    fTB = ((fTB * 20) ^ 2730) * 35;
                    if ((kCm ^ 3230) != 0) {
                        while (true) {
                            i3 = kCm;
                            int i10 = i3 + 78;
                            if (i10 == 91) {
                                break;
                            }
                            if (i10 == 192) {
                                kCm = (i3 >> CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA) * 13;
                            } else if (i10 != 256) {
                            }
                            kCm = (kCm * 27) >> 56;
                        }
                        kCm = (i3 % 17) + i3;
                    }
                }
            } else if (i9 == 238) {
                fTB = (i ^ 4735) % 50;
                if ((kCm ^ 3230) == 0) {
                    break;
                }
            }
        }
        do {
            fTB = fTB + i + i;
        } while (kCm > 3229);
        while (true) {
            i2 = kCm;
            int i11 = i2 + 65;
            if (i11 == 85) {
                while (true) {
                    kCm = (kCm + i2) ^ 5438;
                }
            } else if (i11 == 233) {
                kCm = (i2 + i2) % 65;
                break;
            } else if (i11 == 336) {
                break;
            }
        }
        while (true) {
            kCm = ((kCm % 33) >> 3) + i2;
        }
    }

    public abstract void dzkkkq(ZqidTP zqidTP);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fupbxE() {
        int i;
        if (this.OJJBNZ.fGsPTM()) {
            iGmINl.UlJrfe(GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb"));
            return;
        }
        if ((kCm ^ 3230) != 0) {
            do {
                i = kCm;
            } while (i + 26 != 35);
            kCm = (i % 102) * 16;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQWEY\bE_ZYVFCYLM\u001dXZNX\u0018TIihfauiQB3$bd`|/?5}`2\u007f\u007f{>~}wv||9"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DIIpTV gBtXYZ(String str, String str2) throws fNUfqk, InterruptedException {
        return $invoke$special$gBtXYZ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void getUserContextRegisteredStatus(String str, TMXEndNotifier tMXEndNotifier) {
        if (UPbYzn.QWSkGZ(str)) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("Hb^~\u000brnpxMZW\n{M@_F@ASEY@P\u001dOO[MMD\u001c%Mmt`lWH)tjxhebbpf3{b0\u007f\u007fno~~9lx'B@PH}KBAJCX@^Sz\\]ROI[rJdbA]ACD\u0018Do\u007fdbj"));
            $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
            return;
        }
        try {
            if (!this.OJJBNZ.fGsPTM()) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014Z\\XD\u0007\u0017\u001dUH\u001aWWC\u0006feondd"));
                $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                return;
            }
            if (!this.OJJBNZ.QjzqRB(this.RGVkLd)) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014g[\\U@KI\u001cLRPTR\u0006rejvhnY\foky*`fnb5`|2wyawnt"));
                $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                return;
            }
            OAjjVP oAjjVPQCjLjM = iGmINl.QCjLjM();
            if ((this.dMpqQQ.get() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) != 0 && oAjjVPQCjLjM != null) {
                TMXStrongAuth.AuthParamResult authParamResultAWuQzD = oAjjVPQCjLjM.aWuQzD(str);
                if (authParamResultAWuQzD == null) {
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR"));
                    $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                    return;
                }
                $invoke$special$Rtjmuc(null, authParamResultAWuQzD.vklRO.UvUzrV, tMXEndNotifier);
                if ((kCm ^ 3230) != 0) {
                    while (true) {
                        int i = kCm;
                        int i2 = i + 91;
                        if (i2 == 92) {
                            kCm = (i >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) % 109;
                            break;
                        } else if (i2 == 190) {
                            while (true) {
                                kCm = ((kCm % 1) ^ 4076) >> 12;
                            }
                        } else if (i2 == 266) {
                            while (true) {
                                kCm *= 10692;
                            }
                        } else if (i2 == 378) {
                            break;
                        }
                    }
                    kCm = ((kCm ^ 2685) >> 25) ^ 1575;
                    return;
                }
                return;
            }
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("NeIcEV@kx@\u0002eK@DBR\u000f\u0014g\u007fiqZJUYUNP[VRlkm\"loZYea+cz(iya4es}yk0=Lw\u007fxkr'HDOx.]Ep@\rXMC\u0007KVHIY^J YeCFUZX\u0017WO*_AUOzdIgmplef|puu<pq{U}w3}f6~viBAbD{2hM\u0007ZEM\u0007KYL*"));
            $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        } catch (Throwable th) {
            $invoke$special$Rtjmuc(null, null, tMXEndNotifier);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void hOMIpD(DIIpTV dIIpTV, String str, String str2) {
        $invoke$special$hOMIpD(dIIpTV, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingHandle hlXVux(TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier, TMXProfilingHandle tMXProfilingHandle) {
        return $invoke$special$hlXVux(result, tMXEndNotifier, tMXProfilingHandle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void init(Context context) throws IOException, IllegalArgumentException {
        Zpvmxu.dbAction(((Boolean) Class.forName(GCXiNH.fsw("|\u007f_~DXe0c[\fgOK]@")).getMethod(GCXiNH.fsw("tb\u007fiIDfyiZaLDGMDBPP"), new Class[0]).invoke(null, new Object[0])).booleanValue());
        init(context, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void init(Context context, TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface) throws IOException, IllegalArgumentException {
        Zpvmxu.dbAction(((Boolean) Class.forName(GCXiNH.fsw("|\u007f_~DXe0c[\fgOK]@")).getMethod(GCXiNH.fsw("tb\u007fiIDfyiZaLDGMDBPP"), new Class[0]).invoke(null, new Object[0])).booleanValue());
        if (context == null) {
            throw new IllegalArgumentException(GCXiNH.fsw("[pR`NU!jc\bKMC]\u0012\u0007\u007f[BR^XT\u000f}RRO_AL"));
        }
        TMXConfig tMXConfigApAOXX = new FHvxmb(context).apAOXX();
        if (tMXProfilingConnectionsInterface != null) {
            tMXConfigApAOXX.setProfilingConnections(tMXProfilingConnectionsInterface);
        }
        init(tMXConfigApAOXX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void init(TMXConfig tMXConfig) throws IllegalStateException, IllegalArgumentException {
        Zpvmxu.dbAction(((Boolean) Class.forName(GCXiNH.fsw("|\u007f_~DXe0c[\fgOK]@")).getMethod(GCXiNH.fsw("tb\u007fiIDfyiZaLDGMDBPP"), new Class[0]).invoke(null, new Object[0])).booleanValue());
        ZqidTP zqidTPZrcPaS = tMXConfig.zrcPaS();
        if (zqidTPZrcPaS == null) {
            throw new IllegalArgumentException(GCXiNH.fsw("[pR`NU!jc\bKMC]\u0012\u0007\u007f[BR^XT\u000f}RRO_AL"));
        }
        if (!this.OJJBNZ.QhYuFg()) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("\\}IiJUx>eFKW\rM"));
            return;
        }
        if (FQMcgE.UfveVb() && (tMXConfig.ROpbut() & 268435456) == 0) {
            FQMcgE.zDGrpR(true);
        }
        DwQSDd.abAflu();
        try {
            this.RinfLL = tMXConfig.sdltZI();
            this.dEFDnc = UccSpe(tMXConfig.RJiFQE(), 0, GCXiNH.fsw("mpXgJVd>\u007fKCM\n]AJSZAG"));
            this.dPvniz = UccSpe(tMXConfig.DOjjmr(), 0, GCXiNH.fsw("t\u007fRx\u000bA`}gIEF\nZKFX\u0015@Z_T_ZJ"));
            zpGcln(tMXConfig);
            if (!ExKek.gGNlxh(tMXConfig.UMUdjZ())) {
                this.OJJBNZ.RIKbBf(false);
                throw new IllegalArgumentException(GCXiNH.fsw("[pR`NU!jc\bKMC]\u0012\u0007\u007f[BR^XT\u000fXRNV[M\u0018QIw$lpf WH"));
            }
            if (ExKek.DGGHxk(tMXConfig.DLglvB())) {
                this.OJJBNZ.RIKbBf(false);
                throw new IllegalArgumentException(GCXiNH.fsw("[pR`NU!jc\bKMC]\u0012\u0007\u007f[BR^XT\u000fXRNV[M\u0018QIw$ekog[^yvbd}(tsgbv`"));
            }
            this.QOBnea = new ExKek(tMXConfig.DLglvB(), tMXConfig.UMUdjZ(), tMXConfig.DwLrnl());
            this.RGVkLd = UccSpe(tMXConfig.OdSkjz(), Integer.MAX_VALUE, GCXiNH.fsw("mcTjB]dJeEGL_]"));
            if (this.RGVkLd == 0) {
                this.RGVkLd = TMXConfig.UOJivW;
            }
            this.iGYzRr = tMXConfig.aqXRUQ();
            if (this.iGYzRr == null) {
                FQMcgE.fQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("S~\u001b|Y^gw`ALDiFFISV@Z]_C\u000fWSOO[W[R\u0006gajlf NMzwnn)ai6wm3atd_lrzrvpvpDJKJxmZYmK^\u0000\u0005RUQ\u0019SUUIWaCiB\\RR\u0016XVL*bj-m`~Og`plii(tu\u007fiq{?Ib2rbt\u007f{yhBQ("));
                this.iGYzRr = DCUTEI.dHguZz();
                if (this.iGYzRr == null) {
                    this.OJJBNZ.RIKbBf(false);
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bKMY]IIB\\UGW\u0011X[JM\u001cXVP]YR"));
                    throw new IllegalStateException(GCXiNH.fsw("[pR`NU!jc\bKMC]\u0012\u0007PT]_WU\u0010[Q\u001dUUIMYYRlewg!hJXy$hf`mib"));
                }
            }
            DCUTEI.RdAHlO(this.iGYzRr);
            Method methodZLjUOn = AuCTel.zLjUOn(this.iGYzRr.getClass(), GCXiNH.fsw("ub]|O\\1/"), String.class);
            if (methodZLjUOn != null) {
                AuCTel.fIwbmz(null, methodZLjUOn, this.QOBnea.sznweJ);
            }
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NeZ~_Xoy,ALJ^\u0001\u0001"));
            this.UuVRT = true;
            this.Umbazn = zqidTPZrcPaS;
            this.zhFcBz = tMXConfig.dMqZSI();
            this.sBzGck = tMXConfig.gIsMnX();
            this.aecqHb = tMXConfig.izaUzn();
            this.fRBHvl = tMXConfig.DbOFhN();
            this.ausHaw = tMXConfig.aIxqGW();
            DPHsZd dPHsZd = new DPHsZd(this.Umbazn, tMXConfig.UMUdjZ());
            this.OHpuMD.put(tMXConfig.UMUdjZ(), dPHsZd);
            this.dMpqQQ.set(tMXConfig.ROpbut());
            if ((this.dMpqQQ.get() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == 0) {
                iGmINl.fERRXa(GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs"), false);
            }
            new Thread(new DGTeJD(tMXConfig, zqidTPZrcPaS, dPHsZd, iGmINl.ixgjPv())).start();
        } catch (RuntimeException e) {
            ORrpqH.uzCIH().seuMaA(e);
            this.OJJBNZ.RIKbBf(false);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void pauseLocationServices(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        GiPPlL giPPlL = this.gqdqJS;
        if (giPPlL != null) {
            if (!z) {
                giPPlL.resume();
                return;
            }
            giPPlL.pause();
            if ((fTB ^ 3939) != 0) {
                if ((kCm ^ 3230) != 0) {
                    while (true) {
                        i5 = kCm;
                        int i6 = i5 + 39;
                        if (i6 == 79) {
                            kCm = (i5 + i5) * 40;
                        } else if (i6 == 203) {
                            break;
                        }
                    }
                    kCm = ((i5 * 63) + i5) ^ 1145;
                }
                while (true) {
                    int i7 = fTB;
                    int i8 = i7 + 13;
                    if (i8 == 6) {
                        fTB = i7 ^ 262;
                        break;
                    }
                    if (i8 == 9) {
                        if ((kCm ^ 3230) != 0) {
                            do {
                                i2 = kCm;
                                i3 = i2 + 104;
                                if (i3 == 99) {
                                    while (true) {
                                        kCm = (kCm + i2) >> 129;
                                    }
                                } else if (i3 == 268) {
                                    while (true) {
                                        kCm = (kCm * 3552) + i2;
                                    }
                                } else if (i3 == 393) {
                                    while (true) {
                                        kCm = (kCm + i2) % 105;
                                    }
                                }
                            } while (i3 != 534);
                            kCm = ((i2 >> 64) ^ 1828) % 92;
                        }
                        fTB = ((i7 % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) >> 76) + i7;
                        if ((kCm ^ 3230) != 0) {
                            do {
                                i = kCm + 91;
                                if (i == 31) {
                                    while (true) {
                                        kCm = ((kCm % 107) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 90;
                                    }
                                }
                            } while (i != 183);
                            while (true) {
                                kCm *= 1344;
                            }
                        }
                    } else if (i8 != 171) {
                        if (i8 == 175) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                int i9 = fTB;
                if (kCm <= 3229) {
                    while (true) {
                        i4 = kCm;
                        int i10 = i4 + 117;
                        if (i10 == 7) {
                            break;
                        }
                        if (i10 != 195) {
                            if (i10 == 359) {
                                kCm = (i4 % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) * 120;
                            } else if (i10 != 459) {
                            }
                            kCm = ((kCm >> 2) % 75) * 87;
                        } else {
                            kCm = (i4 * 59) + i4;
                        }
                    }
                    kCm = ((i4 % 34) % 71) * 119;
                }
                fTB = ((i9 % 73) % 46) ^ 4027;
                if (kCm <= 3229) {
                    while (true) {
                        int i11 = kCm;
                        int i12 = i11 + 78;
                        if (i12 != 78) {
                            if (i12 == 83) {
                                kCm = ((i11 >> 28) % 121) + i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    kCm = (kCm * 41) >> 114;
                }
                fTB = ((fTB >> 22) * 20) >> 28;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String processStrongAuthMessage(TMXStrongAuth.StrongAuthConfiguration strongAuthConfiguration, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        String strDdhgMB = UPbYzn.ddhgMB();
        String str = strongAuthConfiguration.sHUizq;
        String str2 = strongAuthConfiguration.sYnYSE;
        return aCSzUz(strDdhgMB, str, strongAuthConfiguration.sdpCMu, strongAuthConfiguration.OtYwTu, strongAuthConfiguration.iWqizr, strongAuthConfiguration.QPiTfK, str2, strongAuthCallback, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String processStrongAuthMessage(Object obj, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        String str;
        String str2;
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            TMXStrongAuth.StrongAuthConfiguration strongAuthConfiguration = new TMXStrongAuth.StrongAuthConfiguration();
            strongAuthConfiguration.setAuthMethod(bundle.getString(GCXiNH.fsw("|dOdt\\djdGF")));
            strongAuthConfiguration.setAuthAction(bundle.getString(GCXiNH.fsw("|dOdtPbjeGL")));
            strongAuthConfiguration.setAuthContext(bundle.getString(GCXiNH.fsw("|dOdtRnpxMZW")));
            strongAuthConfiguration.setAuthRequestId(bundle.getString(GCXiNH.fsw("|dOdtCdoyMQWu@L")));
            strongAuthConfiguration.setAuthPrompt(bundle.getString(GCXiNH.fsw("|dOdtAsqaXV")));
            strongAuthConfiguration.setAuthTitle(bundle.getString(GCXiNH.fsw("ixO`N")));
            return processStrongAuthMessage(strongAuthConfiguration, strongAuthCallback, tMXEndNotifier);
        }
        Method methodZsXlph = AuCTel.zsXlph(obj.getClass(), GCXiNH.fsw("ztOHJE`"), new Class[0]);
        if (methodZsXlph == null) {
            str = DlIaRS;
            str2 = "Ne^|^A!XmANFN\u0013\bjSFGRUT\u0010__O]V_M]E\u0006akfq!nQX)lj|l(%qp`Wseq->pyorv|";
        } else {
            Object objFIwbmz = AuCTel.fIwbmz(obj, methodZsXlph, new Object[0]);
            if (objFIwbmz instanceof Map) {
                Map map = (Map) objFIwbmz;
                String strDdhgMB = UPbYzn.ddhgMB();
                String str3 = (String) map.get(GCXiNH.fsw("|dOdtCdoyMQWu@L"));
                String str4 = (String) map.get(GCXiNH.fsw("|dOdtPbjeGL"));
                String str5 = (String) map.get(GCXiNH.fsw("|dOdtRnpxMZW"));
                return aCSzUz(strDdhgMB, str3, (String) map.get(GCXiNH.fsw("ixO`N")), (String) map.get(GCXiNH.fsw("|dOdtAsqaXV")), str5, (String) map.get(GCXiNH.fsw("|dOdt\\djdGF")), str4, strongAuthCallback, tMXEndNotifier);
            }
            str = DlIaRS;
            str2 = "Ne^|^A!XmANFN\u0013\b\u0005QP@wSEQ\r\u001eOYOOKVD\u0006rvllf JUya";
        }
        FQMcgE.OijiEz(str, GCXiNH.fsw(str2));
        $invoke$special$Rtjmuc(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingHandle profile(TMXEndNotifier tMXEndNotifier) {
        return profile(new TMXProfilingOptions(), tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:42:0x00ee) to fix multi-entry loop: BACK_EDGE: B:41:0x00e8 -> B:42:0x00ee */
    /* JADX DEBUG: Duplicate block (B:44:0x00f5) to fix multi-entry loop: BACK_EDGE: B:44:0x00f5 -> B:45:0x00f7 */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00ee, code lost:
    
        QfgSZK.DcMfJK.fTB = (QfgSZK.DcMfJK.fTB % 2) >> 96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01df, code lost:
    
        if ((QfgSZK.DcMfJK.kCm ^ 3230) != 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ef, code lost:
    
        if ((QfgSZK.DcMfJK.kCm ^ 3230) != 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
    
        r10 = QfgSZK.DcMfJK.kCm;
        r11 = r10 + 260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f7, code lost:
    
        if (r11 == 22) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fb, code lost:
    
        if (r11 == 214) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ff, code lost:
    
        if (r11 == 407) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0203, code lost:
    
        if (r11 == 456) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0206, code lost:
    
        QfgSZK.DcMfJK.kCm = (r10 * 108) >> 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020c, code lost:
    
        QfgSZK.DcMfJK.kCm = ((QfgSZK.DcMfJK.kCm * 30) % 95) % 38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0216, code lost:
    
        QfgSZK.DcMfJK.kCm = (QfgSZK.DcMfJK.kCm % 50) >> 67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021f, code lost:
    
        QfgSZK.DcMfJK.kCm = ((r10 + r10) ^ 5071) + r10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01ef -> B:92:0x0227). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TMXProfilingHandle profile(TMXProfilingOptions tMXProfilingOptions, TMXEndNotifier tMXEndNotifier) {
        String strDdhgMB;
        int i;
        int i2;
        int i3;
        HrMTQN.uzCIH().DzOuPm();
        if (!this.OJJBNZ.fGsPTM()) {
            return $invoke$special$RuDPQV(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_Internal_Error), tMXEndNotifier, new DIADVb(null));
        }
        if (this.OJJBNZ.QjzqRB(this.RGVkLd) && this.OJJBNZ.DcNNRp()) {
            if ((this.dMpqQQ.get() & PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) == 0 && !$invoke$special$atDTRm()) {
                this.OJJBNZ.gqESXP();
                return $invoke$special$RuDPQV(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_Blocked), tMXEndNotifier, new DIADVb(null));
            }
            if ($invoke$special$aVhqwO()) {
                this.OJJBNZ.gqESXP();
                return $invoke$special$RuDPQV(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_In_Quiet_Period), tMXEndNotifier, new DIADVb(null));
            }
            if (tMXEndNotifier == null) {
                this.OJJBNZ.gqESXP();
                return $invoke$special$RuDPQV(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_EndNotifier_NotFound), null, new DIADVb(null));
            }
            if (UPbYzn.dTTfOR(tMXProfilingOptions.aLnkZL())) {
                strDdhgMB = UPbYzn.DRtzUu(tMXProfilingOptions.aLnkZL());
                if (fTB <= 3938) {
                    while (true) {
                        i3 = fTB;
                        int i4 = i3 + 104;
                        if (i4 == 72) {
                            fTB = (i3 >> 123) ^ 2291;
                            break;
                        }
                        if (i4 != 101) {
                            if (i4 == 205) {
                                fTB = ((i3 ^ 1679) + i3) >> 39;
                                break;
                            }
                            if (i4 == 372) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        fTB = (fTB % 117) + i3;
                    }
                }
            } else {
                strDdhgMB = UPbYzn.ddhgMB();
            }
            String str = strDdhgMB;
            if (UPbYzn.iSpHlg(str)) {
                this.OJJBNZ.gqESXP();
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQWK[\\\u0007FG[U[]YAY\u0007\u001crTOY[Oa$pgrsWCg$bn"));
                return $invoke$special$RuDPQV(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_Internal_Error), tMXEndNotifier, new DIADVb(null));
            }
            FQMcgE.dPkBzA();
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("neZ~_Xoy,XPLL@DB\u0016GQBGTC[\u001eHORT^\u0018\u001a\u0006=*3/98\u001eCypbeg{'") + this.dMpqQQ.get() + GCXiNH.fsw("=aIcMXm{XAOFE\\\\\u0007") + this.RGVkLd + GCXiNH.fsw("pb\u001bfJG`0zE\fUO[[NY[\u0014") + System.getProperty(GCXiNH.fsw("wpMm\u0005Gl0zMPPCFF")));
            DIADVb dIADVb = new DIADVb(str);
            this.iGYzRr.cancelProfiling();
            OeawrH.C0005OeawrH c0005OeawrHApNKau = tMXProfilingOptions.apNKau();
            if (c0005OeawrHApNKau != null) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Q~Xm_Xnp,AQ\u0003GHFRWY\u0014FAX^H\u001eITZN\u0019TXEdpjmo"));
                this.gqdqJS.setLocationManually(c0005OeawrHApNKau);
                if (fTB <= 3938) {
                    if (kCm <= 3229) {
                        while (true) {
                            int i5 = kCm;
                            int i6 = i5 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                            if (i6 == 59) {
                                kCm = ((i5 ^ 1437) * 123) % 35;
                                break;
                            }
                            if (i6 == 113) {
                                while (true) {
                                    kCm = (kCm % 106) % 18;
                                }
                            } else if (i6 == 279) {
                                kCm = (i5 >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + i5 + i5;
                                break;
                            }
                        }
                    }
                    while (true) {
                        i = fTB;
                        int i7 = i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                        if (i7 == 51) {
                            break;
                        }
                        if (i7 == 97) {
                            fTB = ((i ^ 3379) * 123) + i;
                        } else if (i7 == 286) {
                            break;
                        }
                    }
                    fTB = (fTB >> 82) % 24;
                    if ((kCm ^ 3230) != 0) {
                        while (true) {
                            i2 = kCm;
                            int i8 = i2 + 234;
                            if (i8 != 1) {
                                if (i8 != 51) {
                                    if (i8 != 184) {
                                        if (i8 == 307) {
                                            break;
                                        }
                                    } else {
                                        kCm = i2 ^ 6934;
                                        break;
                                    }
                                } else {
                                    kCm = ((i2 * 91) >> 4) + i2;
                                    break;
                                }
                            } else {
                                kCm = (i2 >> 10) + i2;
                            }
                        }
                        kCm = ((kCm + i2) % 118) * 122;
                    }
                    fTB = ((fTB + i) >> 90) * 90;
                }
            } else if (this.gqdqJS.sElUiK() && !this.gqdqJS.QMuEJi()) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("U~Hx\u000bPqn`AAB^@GI\u0016GQBGTC[[Y\u001c]UK\u0018[Ifewknn\u001eN|p+fh{s6a}~w1y{>j}h:wwc'W@Ct}ZUp@I\fVSDK\\IHZHRlV,\u0011ANL_Y_\tklmd`/~Nu"));
                this.gqdqJS.OmJATG();
            }
            this.aRGqrS = new Thread(new sgNvtZ(this, str, tMXProfilingOptions, tMXEndNotifier, dIADVb));
            this.aRGqrS.start();
            return dIADVb;
        }
        return $invoke$special$RuDPQV(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_NotYet), tMXEndNotifier, new DIADVb(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingHandle profile(String str, TMXEndNotifier tMXEndNotifier) {
        return profile(new TMXProfilingOptions().setSessionID(str), tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String registerUser(String str, String str2, String str3, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        String strDdhgMB = UPbYzn.ddhgMB();
        if ((kCm ^ 3230) == 0) {
            return YFmri(strDdhgMB, str, str2, str3, strongAuthCallback, tMXEndNotifier);
        }
        while (true) {
            int i = kCm;
            int i2 = i + 13;
            if (i2 != 3) {
                if (i2 == 153) {
                    kCm = (i + i) ^ 4695;
                }
            }
            kCm = ((kCm % 109) + i) ^ 1735;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean scanPackages() {
        return scanPackages(0, TimeUnit.SECONDS, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:23:0x004c) to fix multi-entry loop: BACK_EDGE: B:22:0x0048 -> B:23:0x004c */
    public boolean scanPackages(int i, TimeUnit timeUnit, TMXScanEndNotifier tMXScanEndNotifier) {
        int i2;
        int i3;
        int millis = (int) timeUnit.toMillis(i);
        if (millis == 0 && i != 0) {
            millis = 1;
        }
        int i4 = millis;
        OmYuqg omYuqg = this.OJJBNZ;
        if ((fTB ^ 3939) == 0) {
            if (omYuqg.OEsIKP()) {
                return iGmINl.spnCvw(this.Umbazn, this.OJJBNZ, fNLfdT.SCAN_PACKAGES, this.dMpqQQ.get(), i4, tMXScanEndNotifier);
            }
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("nrZb{PbumOGP\u0002ZKFXeUPYPWJM\u0014\u0006\u001b[[WER``\"\"hnWX)in~agc6|g3|~d/}|pw\u007f}"));
            return false;
        }
        while (true) {
            i2 = fTB;
            int i5 = i2 + 39;
            if (i5 == 28) {
                break;
            }
            if (i5 == 98) {
                if (kCm <= 3229) {
                    while (true) {
                        i3 = kCm;
                        int i6 = i3 + 104;
                        if (i6 == 91) {
                            kCm = (i3 ^ 2359) >> 14;
                        } else if (i6 == 113) {
                            break;
                        }
                    }
                    while (true) {
                        kCm = (kCm + i3) % 99;
                    }
                } else {
                    fTB = (i2 * 98) ^ 7522;
                }
            }
        }
        while (true) {
            fTB = (fTB + i2) % 98;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean scanPackages(TMXScanEndNotifier tMXScanEndNotifier) {
        return scanPackages(0, TimeUnit.SECONDS, tMXScanEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DCJXGO siEkQe(String str, String str2, boolean z, TMXProfilingOptions tMXProfilingOptions, DIIpTV dIIpTV) throws fNUfqk, InterruptedException {
        return $invoke$special$siEkQe(str, str2, z, tMXProfilingOptions, dIIpTV);
    }

    public abstract void zpGcln(TMXConfig tMXConfig) throws IllegalStateException, IllegalArgumentException;
}
