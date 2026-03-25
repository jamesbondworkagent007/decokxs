package com.lexisnexisrisk.threatmetrix;

import QfgSZK.DcMfJK;
import QfgSZK.FQMcgE;
import QfgSZK.GCXiNH;
import QfgSZK.OmYuqg;
import QfgSZK.SQPLEi;
import QfgSZK.UUsvzU;
import QfgSZK.ZqidTP;
import android.content.Context;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.TMXStrongAuth;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class TMXProfiling extends DcMfJK {
    public static int Csx;
    private static String DlIaRS;
    private static volatile TMXProfiling UcUFhW;
    public static int ucO;
    private volatile boolean ODRFvL;
    private int RmuJJx;
    private Timer hfftHH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        Csx = 7237;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        ucO = 5962;
        if (Csx <= 7236) {
            while (true) {
                int i = Csx;
                int i2 = i + 13;
                if (i2 != 57) {
                    if (i2 == 218) {
                        Csx = (i % 69) ^ 4445;
                        break;
                    }
                } else {
                    break;
                }
            }
            Csx = (Csx * 16) ^ 5130;
        }
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(TMXProfiling.class);
        UcUFhW = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TMXProfiling() {
        super(new UUsvzU());
        this.ODRFvL = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TMXProfiling getInstance() {
        TMXProfiling tMXProfiling = UcUFhW;
        return tMXProfiling != null ? tMXProfiling : hGBTGR();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static TMXProfiling hGBTGR() {
        synchronized (TMXProfiling.class) {
            TMXProfiling tMXProfiling = UcUFhW;
            if (tMXProfiling != null) {
                return tMXProfiling;
            }
            TMXProfiling tMXProfiling2 = new TMXProfiling();
            UcUFhW = tMXProfiling2;
            return tMXProfiling2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DWlxKC() {
        synchronized (this) {
            this.ODRFvL = true;
            this.UuVRT = true;
            Timer timer = this.hfftHH;
            if (timer != null) {
                timer.cancel();
            }
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NrIiN_!w\u007f\bMM\nYZHP\\XZ\\V\u0010FM\u001dIUXUWTM``-"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void QJCXpF() {
        this.ODRFvL = false;
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("NrIiN_!w\u007f\bMEL\u0005\bFXL\u0014UGEE][\u001dLIU_Q[Okc#uhlR\fka+hegd}pp3swdjl=") + this.RmuJJx + GCXiNH.fsw("=|R`GXr{oGLGY\u0007"));
        Timer timer = this.hfftHH;
        if (timer != null) {
            timer.cancel();
        }
        this.hfftHH = new Timer();
        this.hfftHH.schedule(new TimerTask() { // from class: com.lexisnexisrisk.threatmetrix.TMXProfiling.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                synchronized (this) {
                    if (!TMXProfiling.this.ODRFvL) {
                        TMXProfiling.this.UuVRT = false;
                    }
                }
            }
        }, this.RmuJJx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ void deregisterUser(String str, TMXEndNotifier tMXEndNotifier) {
        super.deregisterUser(str, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public void dzkkkq(ZqidTP zqidTP) {
        if (this.RmuJJx > 0) {
            SQPLEi.hTAtCx(this, zqidTP);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HybridAppWithNTFSupport getCordovaSupport() {
        return this.hfTkCe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HybridAppWithNTFSupport getFlutterSupport() {
        return this.hfTkCe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HybridAppWithNTFSupport getJetpackComposeSupport() {
        return this.hfTkCe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReactNativeSupport getReactNativeSupport() {
        return this.gYbxGz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ void getUserContextRegisteredStatus(String str, TMXEndNotifier tMXEndNotifier) {
        super.getUserContextRegisteredStatus(str, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ void init(Context context) throws IOException, IllegalArgumentException {
        super.init(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ void init(Context context, TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface) throws IOException, IllegalArgumentException {
        super.init(context, tMXProfilingConnectionsInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void init(Context context, String str) {
        init(new TMXConfig().setContext(context).setOrgId(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ void init(TMXConfig tMXConfig) throws IllegalStateException, IllegalArgumentException {
        super.init(tMXConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ void pauseLocationServices(boolean z) {
        super.pauseLocationServices(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ String processStrongAuthMessage(TMXStrongAuth.StrongAuthConfiguration strongAuthConfiguration, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        return super.processStrongAuthMessage(strongAuthConfiguration, strongAuthCallback, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ String processStrongAuthMessage(Object obj, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        return super.processStrongAuthMessage(obj, strongAuthCallback, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ TMXProfilingHandle profile(TMXEndNotifier tMXEndNotifier) {
        return super.profile(tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ TMXProfilingHandle profile(TMXProfilingOptions tMXProfilingOptions, TMXEndNotifier tMXEndNotifier) {
        return super.profile(tMXProfilingOptions, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ TMXProfilingHandle profile(String str, TMXEndNotifier tMXEndNotifier) {
        return super.profile(str, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x003b) to fix multi-entry loop: BACK_EDGE: B:16:0x0034 -> B:17:0x003b */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        com.lexisnexisrisk.threatmetrix.TMXProfiling.Csx = (com.lexisnexisrisk.threatmetrix.TMXProfiling.Csx >> org.spongycastle.crypto.tls.CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA) ^ 1264;
     */
    @Override // QfgSZK.DcMfJK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* bridge */ /* synthetic */ String registerUser(String str, String str2, String str3, TMXStrongAuth.StrongAuthCallback strongAuthCallback, TMXEndNotifier tMXEndNotifier) {
        int i;
        int i2;
        int i3;
        if (Csx <= 7236) {
            while (true) {
                i3 = Csx;
                int i4 = i3 + 13;
                if (i4 != 84) {
                    if (i4 != 145) {
                        if (i4 == 159) {
                            Csx = ((i3 % 35) % 3) ^ 4301;
                            break;
                        }
                        if (i4 == 181) {
                            Csx = ((i3 * 27) ^ 4921) >> 35;
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
                Csx = ((Csx ^ 3812) + i3) ^ 1675;
            }
        }
        if ((ucO ^ 5962) != 0) {
            do {
                i = ucO;
            } while (i + 13 != 11);
            ucO = ((i * 23) % 31) + i;
            if (Csx <= 7236) {
                do {
                    int i5 = Csx;
                    i2 = i5 + 52;
                    if (i2 == 15) {
                        Csx = ((i5 ^ 2134) >> 104) % WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                    }
                } while (i2 != 36);
                while (true) {
                    Csx = (Csx >> 2) ^ 4067;
                }
            }
        }
        return super.registerUser(str, str2, str3, strongAuthCallback, tMXEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ boolean scanPackages() {
        return super.scanPackages();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ boolean scanPackages(int i, TimeUnit timeUnit, TMXScanEndNotifier tMXScanEndNotifier) {
        return super.scanPackages(i, timeUnit, tMXScanEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK
    public /* bridge */ /* synthetic */ boolean scanPackages(TMXScanEndNotifier tMXScanEndNotifier) {
        return super.scanPackages(tMXScanEndNotifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:15:0x002f) to fix multi-entry loop: BACK_EDGE: B:14:0x0027 -> B:15:0x002f */
    public void tidyUp() {
        int i;
        int i2;
        OmYuqg omYuqg = this.OJJBNZ;
        int i3 = this.RGVkLd;
        if (Csx <= 7236) {
            do {
                i = Csx;
                i2 = i + 13;
                if (i2 != 8) {
                    if (i2 != 55) {
                        if (i2 == 226) {
                            Csx = (Csx + i) * 1260;
                        }
                    }
                    while (true) {
                        Csx = ((Csx + i) >> 45) + i;
                        Csx = (Csx + i) * 1260;
                    }
                } else {
                    Csx = (i * 52) ^ 3660;
                }
            } while (i2 != 371);
            while (true) {
                Csx = (Csx >> 33) + i;
            }
        }
        omYuqg.QjzqRB(i3);
        RJOkX();
        this.OJJBNZ.DQnQnb();
        UcUFhW = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:40:0x0098) to fix multi-entry loop: BACK_EDGE: B:39:0x0094 -> B:40:0x0098 */
    /* JADX DEBUG: Duplicate block (B:84:0x013e) to fix multi-entry loop: BACK_EDGE: B:84:0x013e -> B:85:0x0140 */
    @Override // QfgSZK.DcMfJK
    public void zpGcln(TMXConfig tMXConfig) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.ODRFvL = true;
        this.RmuJJx = DcMfJK.UccSpe(tMXConfig.zObvzS(), TMXConfig.heAlCD, GCXiNH.fsw("nrIiN_Nxj|KNOF]S"));
        Timer timer = this.hfftHH;
        if (timer != null) {
            timer.cancel();
        }
        long jDEZRQt = tMXConfig.DEZRQt();
        if (ucO <= 5961) {
            if (Csx > 7236) {
                while (true) {
                    i2 = ucO;
                    int i6 = i2 + 26;
                    if (i6 == 79) {
                        if (Csx <= 7236) {
                            while (true) {
                                int i7 = Csx;
                                int i8 = i7 + 130;
                                if (i8 == 33) {
                                    Csx = ((i7 % 52) ^ 4490) % 101;
                                    break;
                                } else if (i8 == 78) {
                                    Csx = (i7 % 6) ^ 5420;
                                } else if (i8 == 229) {
                                    while (true) {
                                        Csx = (Csx % 52) % 36;
                                    }
                                }
                            }
                        }
                        ucO = ((i2 ^ 3932) >> 99) ^ 2084;
                        if ((Csx ^ 7237) != 0) {
                            break;
                        }
                    } else {
                        if (i6 == 248) {
                            break;
                        }
                        if (i6 == 295) {
                            ucO = (i2 >> 2) + i2;
                            if ((Csx ^ 7237) != 0) {
                                do {
                                    int i9 = Csx;
                                    i4 = i9 + 91;
                                    if (i4 != 2) {
                                        if (i4 == 183) {
                                            Csx = ((i9 + i9) + i9) % 99;
                                        }
                                    }
                                    Csx = ((Csx >> 106) + i9) * 84;
                                    break;
                                } while (i4 != 369);
                                while (true) {
                                    Csx = (Csx ^ 2797) >> CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
                                }
                            }
                        } else if (i6 == 476) {
                            break;
                        }
                    }
                }
                ucO = (ucO % 27) + i2;
                if (Csx <= 7236) {
                    while (true) {
                        i5 = Csx;
                        int i10 = i5 + 65;
                        if (i10 != 72) {
                            if (i10 == 121) {
                                Csx = i5 + i5 + i5 + i5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        Csx = (Csx * 107) + i5;
                    }
                }
                int i11 = ucO;
                int i12 = Csx;
                if ((i12 ^ 7237) != 0) {
                    while (Csx + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 2) {
                    }
                    while (true) {
                        Csx = (Csx ^ 1531) >> 66;
                    }
                } else {
                    ucO = (i11 * 6900) >> 23;
                    if (i12 <= 7236) {
                        while (true) {
                            i3 = Csx;
                            int i13 = i3 + 26;
                            if (i13 == 37) {
                                Csx = (i3 % 52) * 93;
                            } else if (i13 == 80) {
                                break;
                            } else if (i13 != 277) {
                            }
                            Csx = ((Csx >> 10) ^ 1820) + i3;
                        }
                        Csx = (i3 + i3) >> 74;
                    }
                }
            }
            while (true) {
                i = Csx;
                int i14 = i + 39;
                if (i14 == 4) {
                    while (true) {
                        Csx = ((Csx * 92) ^ 4944) + i;
                    }
                } else if (i14 == 145) {
                    Csx = (i + i) >> CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                    break;
                } else if (i14 == 173) {
                    break;
                } else if (i14 == 176) {
                    Csx = (i ^ 1673) + i;
                }
            }
            while (true) {
                Csx = (Csx + i) ^ 1149;
            }
        }
        DcMfJK.UccSpe(jDEZRQt, 0L, GCXiNH.fsw("Q~L\\DFdlYXFB^L|N[P"));
        DcMfJK.UccSpe(tMXConfig.dUjeuS(), 0L, GCXiNH.fsw("Ux\\d{^v{~}RGK]Ms_XQ"));
        DcMfJK.UccSpe(tMXConfig.hMnsts(), 2, GCXiNH.fsw("q~Xm_Xnp,IA@_[IDO"));
        DcMfJK.iGmINl.QVAiDq(tMXConfig);
    }
}
