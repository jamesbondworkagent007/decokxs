package com.lexisnexisrisk.threatmetrix;

import QfgSZK.FQMcgE;
import QfgSZK.GCXiNH;
import QfgSZK.GzAsTt;
import QfgSZK.ZqidTP;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class TMXConfig {
    private static final long DFelZs;
    private static final long DLLHtv;
    public static final int UOJivW;
    public static int dZL = 0;
    private static final int fKQGDs = 1;
    static final int heAlCD;
    static String ibtjxV;
    private static final int iwRnxw;
    public static int kFl;
    static final int ziOVHn;
    private boolean DeMcOg;
    private int DiufwN;
    private boolean OcFVql;
    private String OuEEPx;
    private String QSGMPe;
    private long RKAAMt;
    private int RmuJJx;
    private boolean UXrqGX;
    private Context Umbazn;
    private boolean aecqHb;
    private boolean ausHaw;
    private long dMpqQQ;
    private String fRBHvl;
    private boolean fhpKlM;
    private int gWjWAt;
    private TMXProfilingConnectionsInterface iGYzRr;
    private int idBaO;
    private final Set<String> sBzGck;
    private long sFxuYV;
    private int suXziQ;
    private boolean swhTcj;
    private String sznweJ;
    private final Set<String> zhFcBz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        dZL = 3397;
        GCXiNH.OHr = 2270;
        kFl = 4978;
        ibtjxV = GCXiNH.fsw("u<Hh@\u001fnp`ALF\u0007DMSD\\L\u001d\\TD");
        heAlCD = (int) TimeUnit.MINUTES.toMillis(30L);
        if (dZL <= 3396) {
            do {
                i = dZL;
            } while (i + 13 != 55);
            dZL = ((i % 48) + i) % 90;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        ziOVHn = (int) timeUnit.toMillis(3L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        UOJivW = (int) timeUnit2.toMillis(30L);
        iwRnxw = (int) timeUnit2.toMillis(30L);
        DFelZs = timeUnit.toMillis(15L);
        DLLHtv = timeUnit.toMillis(60L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig() {
        int i = iwRnxw;
        this.gWjWAt = i;
        this.DeMcOg = false;
        this.DiufwN = i;
        this.OcFVql = false;
        this.RmuJJx = ziOVHn;
        this.idBaO = 1;
        this.dMpqQQ = GzAsTt.OPTION_ALL;
        this.RKAAMt = DFelZs;
        this.sFxuYV = DLLHtv;
        this.UXrqGX = false;
        this.swhTcj = false;
        this.fhpKlM = false;
        this.QSGMPe = null;
        this.sznweJ = GCXiNH.fsw("u<Hh@\u001fnp`ALF\u0007DMSD\\L\u001d\\TD");
        this.OuEEPx = null;
        this.Umbazn = null;
        this.iGYzRr = null;
        this.suXziQ = UOJivW;
        this.zhFcBz = new HashSet();
        this.sBzGck = new HashSet();
        this.ausHaw = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long DEZRQt() {
        return this.RKAAMt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DLglvB() {
        return this.sznweJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DOjjmr() {
        return this.gWjWAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DbOFhN() {
        return this.fRBHvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DwLrnl() {
        return this.QSGMPe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OdSkjz() {
        return this.suXziQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QBjHmV() {
        return this.DeMcOg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int RJiFQE() {
        return this.DiufwN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long ROpbut() {
        int i;
        long j = this.dMpqQQ;
        if (!this.fhpKlM) {
            return j;
        }
        if ((dZL ^ 3397) != 0) {
            while (true) {
                i = dZL;
                int i2 = i + 26;
                if (i2 == 18) {
                    dZL = (i * 13) >> 65;
                } else if (i2 == 142) {
                    break;
                }
            }
            dZL = (i ^ 2919) * 123;
        }
        return j & (-12289);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String UMUdjZ() {
        return this.OuEEPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean YGgET() {
        return this.swhTcj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean aIxqGW() {
        return this.ausHaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnectionsInterface aqXRUQ() {
        return this.iGYzRr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> dMqZSI() {
        return this.zhFcBz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long dUjeuS() {
        return this.sFxuYV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig disableInitPackageScanTimeLimit() {
        this.gWjWAt = 0;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig disableNonfatalLogs() {
        FQMcgE.zDGrpR(true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:65:0x00eb) to fix multi-entry loop: BACK_EDGE: B:65:0x00eb -> B:66:0x00ed */
    public TMXConfig disableOption(long j) {
        int i;
        long j2 = this.dMpqQQ;
        if ((kFl ^ 4978) == 0) {
            this.dMpqQQ = (~j) & j2;
            return this;
        }
        if ((dZL ^ 3397) == 0) {
            while (true) {
                int i2 = kFl;
                int i3 = dZL;
                int i4 = i3 ^ 3397;
                if (i4 != 0) {
                    do {
                        i = dZL;
                    } while (i + 117 != 28);
                    while (true) {
                        dZL = (dZL >> 30) + i;
                    }
                } else {
                    int i5 = i2 + 13;
                    if (i5 != 40) {
                        if (i5 != 66) {
                            if (i5 != 121) {
                                continue;
                            } else if (i4 != 0) {
                                while (dZL + 91 != 55) {
                                }
                                while (true) {
                                    dZL = (dZL * 45) ^ 3380;
                                }
                            } else {
                                kFl = (i2 >> 32) + i2 + i2;
                            }
                        }
                    } else if (i4 != 0) {
                        while (true) {
                            int i6 = dZL;
                            int i7 = i6 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                            if (i7 == 35) {
                                break;
                            }
                            if (i7 == 149) {
                                dZL = (i6 >> 20) + i6;
                            }
                        }
                        while (true) {
                            dZL = (dZL >> 73) ^ 3872;
                        }
                    } else {
                        kFl = ((i2 * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) ^ 3836) + i2;
                        if (i3 <= 3396) {
                            while (true) {
                                int i8 = dZL;
                                int i9 = i8 + 52;
                                if (i9 != 2) {
                                    if (i9 == 111) {
                                        dZL = (i8 * 6283) ^ 4474;
                                    } else if (i9 == 279) {
                                        dZL = (i8 + i8) % 84;
                                    }
                                }
                                dZL = ((dZL + i8) % 31) * 106;
                            }
                        }
                    }
                    int i10 = kFl;
                    if (i4 != 0) {
                        while (true) {
                            int i11 = dZL;
                            int i12 = i11 + 130;
                            if (i12 == 48) {
                                dZL = (i11 ^ 3596) >> 8;
                            } else if (i12 == 241) {
                                while (true) {
                                    dZL = (dZL % 98) + i11;
                                }
                            } else if (i12 == 244) {
                                while (true) {
                                    dZL = (dZL >> 66) + i11;
                                }
                            }
                        }
                    } else {
                        kFl = ((i10 % 5) + i2) * 72;
                        if (i3 <= 3396) {
                            break;
                        }
                    }
                }
            }
        }
        while (true) {
            int i13 = dZL;
            int i14 = i13 + 26;
            if (i14 == 87) {
                dZL = ((i13 % 7) >> 58) ^ 3854;
                break;
            }
            if (i14 == 282) {
                break;
            }
        }
        while (true) {
            dZL = ((dZL ^ 3756) % 65) >> 77;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig disablePackageScanTimeLimit() {
        this.DiufwN = 0;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig enableOption(long j) {
        int i;
        int i2;
        long j2 = this.dMpqQQ;
        if (dZL <= 3396) {
            while (true) {
                i = dZL;
                int i3 = i + 13;
                if (i3 != 55) {
                    if (i3 == 179) {
                        i2 = ((i ^ 2480) * 15) + i;
                        break;
                    }
                    if (i3 == 275) {
                        dZL = (i ^ 1653) * 54;
                        break;
                    }
                } else {
                    break;
                }
            }
            i2 = ((dZL % 88) + i) % 66;
            dZL = i2;
        }
        this.dMpqQQ = j | j2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> gIsMnX() {
        return this.sBzGck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hMnsts() {
        return this.idBaO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean izaUzn() {
        return this.aecqHb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean sdltZI() {
        return this.OcFVql;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r6 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if ((r6 + 26) == 79) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = (r6 + r6) * 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (com.lexisnexisrisk.threatmetrix.TMXConfig.dZL > 3396) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r6 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL;
        r0 = r6 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r0 == 44) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r0 == 192) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r0 == 300) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = ((r6 >> 59) + r6) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = ((com.lexisnexisrisk.threatmetrix.TMXConfig.dZL >> 32) + r6) * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = ((r6 % 29) * 6) + r6;
     */
    /* JADX WARN: Path cross not found for [B:53:?, B:45:?], limit reached: 52 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0052 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TMXConfig setAdvertisingIdCollection(boolean z) {
        int i;
        long j = this.dMpqQQ;
        if (z) {
            this.dMpqQQ = j | PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            int i2 = kFl;
            int i3 = dZL ^ 3397;
            if (i3 != 0) {
                while (dZL + 52 != 24) {
                }
                while (true) {
                    dZL = ((dZL ^ 4361) % 75) ^ MTPushConstants.RemoteWhat.TURN_OFF_GEOFENCESWITCH;
                }
            } else if (i2 <= 4977) {
            }
        } else {
            if (dZL <= 3396) {
                do {
                    i = dZL;
                } while (i + 39 != 11);
                dZL = (i * 48) + i;
            }
            this.dMpqQQ = j & (-131073);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setApiKey(String str) {
        this.QSGMPe = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setContext(Context context) {
        this.Umbazn = context;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setDisableAppHashing(boolean z) {
        this.fhpKlM = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x0031) to fix multi-entry loop: BACK_EDGE: B:17:0x0031 -> B:18:0x0038 */
    /* JADX DEBUG: Duplicate block (B:82:0x0143) to fix multi-entry loop: BACK_EDGE: B:81:0x013e -> B:82:0x0143 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public com.lexisnexisrisk.threatmetrix.TMXConfig setDisableAuthenticationModule(boolean r9) {
        /*
            r8 = this;
            r0 = 63
            r1 = 118(0x76, float:1.65E-43)
            r2 = 4977(0x1371, float:6.974E-42)
            r3 = 19
            if (r9 == 0) goto L124
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            r4 = 87
            r5 = 3396(0xd44, float:4.759E-42)
            if (r9 > r2) goto L85
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            if (r9 > r5) goto L4b
        L16:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r0 = r9 + 65
            r2 = 64
            if (r0 == r3) goto L31
            if (r0 == r2) goto L41
            r6 = 253(0xfd, float:3.55E-43)
            if (r0 == r6) goto L38
            r2 = 397(0x18d, float:5.56E-43)
            if (r0 == r2) goto L29
            goto L16
        L29:
            int r9 = r9 + r9
            int r9 = r9 % 31
            int r9 = r9 % 60
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L4b
        L31:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r0 = 137(0x89, float:1.92E-43)
            int r9 = r9 >> r0
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
        L38:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 >> r2
            int r9 = r9 % 21
            int r9 = r9 % 15
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
        L41:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 % 78
            r9 = r9 ^ 2073(0x819, float:2.905E-42)
            int r9 = r9 >> r3
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L31
        L4b:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            int r9 = r9 + 39
            r0 = 26
            if (r9 == r0) goto L54
            goto L4b
        L54:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            int r9 = r9 % r1
            int r9 = r9 * 7820
            com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = r9
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            if (r9 > r5) goto L54
        L5f:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r0 = r9 + 78
            if (r0 == r4) goto L7c
            r2 = 240(0xf0, float:3.36E-43)
            if (r0 == r2) goto L73
            r2 = 418(0x1a2, float:5.86E-43)
            if (r0 == r2) goto L6e
            goto L5f
        L6e:
            int r9 = r9 * 9991
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L54
        L73:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r9 = r9 ^ 1586(0x632, float:2.222E-42)
            int r9 = r9 >> 71
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L73
        L7c:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r9 = r9 ^ 4934(0x1346, float:6.914E-42)
            int r9 = r9 % 61
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L7c
        L85:
            long r1 = r8.dMpqQQ
            r6 = -2097153(0xffffffffffdfffff, double:NaN)
            long r1 = r1 & r6
            r8.dMpqQQ = r1
            r9 = r9 ^ 4978(0x1372, float:6.976E-42)
            if (r9 == 0) goto L1a2
        L91:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            int r1 = r9 + 26
            r2 = 1
            if (r1 == r2) goto Le2
            r2 = 195(0xc3, float:2.73E-43)
            if (r1 == r2) goto La5
            r9 = 238(0xee, float:3.34E-43)
            if (r1 == r9) goto Lef
            r9 = 290(0x122, float:4.06E-43)
            if (r1 == r9) goto Lab
            goto L91
        La5:
            int r9 = r9 >> 37
            int r9 = r9 % 9
            com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = r9
        Lab:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            r9 = r9 ^ 1779(0x6f3, float:2.493E-42)
            int r9 = r9 * 92
            com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = r9
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            if (r9 > r5) goto L91
        Lb7:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r0 = r9 + 91
            r1 = 51
            if (r0 == r1) goto Ld9
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 == r1) goto Ld2
            r9 = 251(0xfb, float:3.52E-43)
            if (r0 == r9) goto Lc8
            goto Lb7
        Lc8:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 >> r4
            r9 = r9 ^ 5227(0x146b, float:7.325E-42)
            int r9 = r9 >> 14
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto Lc8
        Ld2:
            int r9 = r9 % 106
            r9 = r9 ^ 1148(0x47c, float:1.609E-42)
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto Lb7
        Ld9:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 * 71
            r9 = r9 ^ 3486(0xd9e, float:4.885E-42)
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto Ld9
        Le2:
            int r9 = r9 % 82
            int r9 = r9 % 31
            com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = r9
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r9 = r9 ^ 3397(0xd45, float:4.76E-42)
            if (r9 == 0) goto Lef
            goto Lfd
        Lef:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            r9 = r9 ^ 1614(0x64e, float:2.262E-42)
            int r9 = r9 % 124
            com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = r9
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r9 = r9 ^ 3397(0xd45, float:4.76E-42)
            if (r9 == 0) goto Lef
        Lfd:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r1 = r9 + 130
            r2 = 49
            if (r1 == r2) goto L116
            r2 = 144(0x90, float:2.02E-43)
            if (r1 == r2) goto L11b
            r9 = 267(0x10b, float:3.74E-43)
            if (r1 == r9) goto L10e
            goto Lfd
        L10e:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 % 54
            int r9 = r9 % r3
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L10e
        L116:
            r1 = r9 ^ 4483(0x1183, float:6.282E-42)
            int r1 = r1 % r0
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r1
        L11b:
            int r1 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r1 = r1 % 123
            int r1 = r1 + r9
            int r1 = r1 + r9
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r1
            goto Lfd
        L124:
            long r4 = r8.dMpqQQ
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            int r6 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r6 = r6 ^ 3397(0xd45, float:4.76E-42)
            if (r6 == 0) goto L146
        L12e:
            int r7 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r7 + 39
            r0 = 85
            if (r9 == r0) goto L13e
            if (r9 == r1) goto L139
            goto L12e
        L139:
            int r9 = r7 * 57
            r9 = r9 ^ 379(0x17b, float:5.31E-43)
            goto L143
        L13e:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 + r7
            int r9 = r9 >> 102
        L143:
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L13e
        L146:
            if (r9 > r2) goto L19c
            if (r6 == 0) goto L15c
        L14a:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 + 156
            r0 = 8
            if (r9 == r0) goto L153
            goto L14a
        L153:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r0 = 538560(0x837c0, float:7.54683E-40)
            int r9 = r9 * r0
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L153
        L15c:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.kFl
            int r1 = r9 + 52
            r2 = 73
            if (r1 == r2) goto L165
            goto L15c
        L165:
            int r1 = r9 % 107
            r1 = r1 ^ 3390(0xd3e, float:4.75E-42)
            int r1 = r1 + r9
            com.lexisnexisrisk.threatmetrix.TMXConfig.kFl = r1
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r9 = r9 ^ 3397(0xd45, float:4.76E-42)
            if (r9 == 0) goto L19c
        L172:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r1 = r9 + 182
            if (r1 == r0) goto L191
            r2 = 221(0xdd, float:3.1E-43)
            if (r1 == r2) goto L187
            r2 = 374(0x176, float:5.24E-43)
            if (r1 == r2) goto L181
            goto L172
        L181:
            int r9 = r9 * 115
            int r9 = r9 % 14
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
        L187:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            r9 = r9 ^ 3858(0xf12, float:5.406E-42)
            int r9 = r9 * 3
            int r9 = r9 % r3
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L19c
        L191:
            int r9 = com.lexisnexisrisk.threatmetrix.TMXConfig.dZL
            int r9 = r9 % 98
            int r9 = r9 >> 69
            r9 = r9 ^ 3142(0xc46, float:4.403E-42)
            com.lexisnexisrisk.threatmetrix.TMXConfig.dZL = r9
            goto L191
        L19c:
            r0 = 2097152(0x200000, double:1.0361308E-317)
            long r0 = r0 | r4
            r8.dMpqQQ = r0
        L1a2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.TMXConfig.setDisableAuthenticationModule(boolean):com.lexisnexisrisk.threatmetrix.TMXConfig");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setDisableInitPackageScan(boolean z) {
        this.DeMcOg = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setDisableLocSerOnBatteryLow(boolean z) {
        this.swhTcj = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setDisableProfilePackageScan(boolean z) {
        this.OcFVql = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setFPServer(String str) {
        this.sznweJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setHighPowerUpdateTime(long j, TimeUnit timeUnit) {
        this.sFxuYV = timeUnit.toMillis(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:28:0x0061) to fix multi-entry loop: BACK_EDGE: B:28:0x0061 -> B:29:0x0063 */
    public TMXConfig setInitPackageScanTimeLimit(int i, TimeUnit timeUnit) {
        int i2;
        this.gWjWAt = (int) timeUnit.toMillis(i);
        if ((dZL ^ 3397) != 0) {
            while (true) {
                i2 = dZL;
                int i3 = i2 + 13;
                if (i3 == 10) {
                    dZL = ((i2 % 68) ^ 1032) * 55;
                } else if (i3 == 90) {
                    break;
                }
            }
            dZL = (i2 * 65) >> 47;
        }
        if (this.gWjWAt == 0 && i != 0) {
            if ((dZL ^ 3397) != 0) {
                while (true) {
                    int i4 = dZL;
                    int i5 = i4 + 39;
                    if (i5 == 61) {
                        dZL = (i4 ^ 2789) * 84;
                        break;
                    }
                    if (i5 == 206) {
                        dZL = ((i4 + i4) + i4) ^ 2957;
                    } else {
                        if (i5 == 384) {
                            break;
                        }
                        if (i5 == 538) {
                            while (true) {
                                dZL = (dZL * 75) + i4 + i4;
                            }
                        }
                    }
                }
                while (true) {
                    dZL = ((dZL ^ 4359) * 89) % 19;
                }
            } else {
                this.gWjWAt = 1;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setLocationAccuracy(int i) {
        this.idBaO = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setLowPowerUpdateTime(long j, TimeUnit timeUnit) {
        this.RKAAMt = timeUnit.toMillis(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setOrgId(String str) {
        this.OuEEPx = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setPackageScanTimeLimit(int i, TimeUnit timeUnit) {
        int millis = (int) timeUnit.toMillis(i);
        this.DiufwN = millis;
        if (dZL > 3396) {
            if (millis == 0 && i != 0) {
                this.DiufwN = 1;
            }
            return this;
        }
        while (true) {
            int i2 = dZL;
            int i3 = i2 + 39;
            if (i3 == 73) {
                dZL = (i2 ^ 5229) + i2;
            } else if (i3 != 230) {
            }
            dZL = (dZL + i2) * 28;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setProfileTimeout(int i, TimeUnit timeUnit) {
        int i2;
        long j = i;
        if ((dZL ^ 3397) != 0) {
            do {
                i2 = dZL;
            } while (i2 + 13 != 73);
            dZL = ((i2 + i2) * 14) + i2;
        }
        this.suXziQ = (int) timeUnit.toMillis(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setProfilingConnections(TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface) {
        this.iGYzRr = tMXProfilingConnectionsInterface;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setRegisterForLocationServices(boolean z) {
        this.UXrqGX = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:11:0x001c) to fix multi-entry loop: BACK_EDGE: B:10:0x0018 -> B:11:0x001c */
    public TMXConfig setScreenOffTimeout(int i, TimeUnit timeUnit) {
        long j = i;
        if ((dZL ^ 3397) == 0) {
            this.RmuJJx = (int) timeUnit.toMillis(j);
            return this;
        }
        while (true) {
            int i2 = dZL;
            int i3 = i2 + 13;
            if (i3 != 87) {
                if (i3 == 170) {
                    dZL = (i2 + i2) ^ 3473;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            dZL *= 11648;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setTMXBehavioSecIdFromTag(boolean z) {
        this.ausHaw = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setTMXBehavioSecIncludedActivities(Set<String> set) {
        int i;
        int i2;
        int i3;
        if (set != null && !set.isEmpty()) {
            if (dZL <= 3396) {
                do {
                    i = dZL;
                    i2 = i + 26;
                    if (i2 != 91) {
                        if (i2 == 268) {
                            dZL = (i >> 74) * 84;
                        }
                    }
                    i3 = (dZL % 53) >> 77;
                    break;
                } while (i2 != 466);
                i3 = ((i + i) + i) ^ 2812;
                dZL = i3;
            }
            this.zhFcBz.addAll(set);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setTMXBehavioSecInjectJavascriptCollector(boolean z) {
        this.aecqHb = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setTMXBehavioSecMaskedFields(Set<String> set) {
        int i;
        int i2;
        int i3;
        if (set != null && !set.isEmpty()) {
            if ((dZL ^ 3397) != 0) {
                do {
                    i3 = dZL;
                } while (i3 + 104 != 97);
                while (true) {
                    dZL = (dZL + i3) * 4656;
                }
            } else if ((kFl ^ 4978) != 0) {
                while (true) {
                    int i4 = kFl;
                    int i5 = i4 + 26;
                    if (i5 != 69) {
                        if (i5 == 231) {
                            kFl = (i4 * 61) >> 63;
                            if ((dZL ^ 3397) != 0) {
                                break;
                            }
                        } else if (i5 == 424) {
                            kFl = (i4 % 32) >> 91;
                            if ((dZL ^ 3397) != 0) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    kFl = ((kFl * 41) ^ 2206) + i4;
                    if ((dZL ^ 3397) != 0) {
                        while (true) {
                            i = dZL;
                            int i6 = i + 39;
                            if (i6 == 45) {
                                while (true) {
                                    dZL = ((dZL ^ MTPushConstants.RemoteWhat.TAG_ADD) >> 7) * 52;
                                }
                            } else {
                                if (i6 == 101) {
                                    break;
                                }
                                if (i6 == 202) {
                                    while (true) {
                                        dZL = ((dZL >> 22) ^ 4463) * 75;
                                    }
                                } else if (i6 == 381) {
                                    dZL = ((i >> 93) % 92) ^ 4772;
                                    break;
                                }
                            }
                        }
                        dZL = (dZL + i) >> 48;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    i2 = dZL;
                    int i7 = i2 + 52;
                    if (i7 == 21) {
                        dZL = (i2 ^ 1925) * 64;
                    } else if (i7 == 128) {
                        break;
                    }
                }
                while (true) {
                    dZL = (dZL + i2) * 7616;
                }
            } else {
                this.sBzGck.addAll(set);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXConfig setTMXBehavioSecWebFieldIdentifierAttribute(String str) {
        this.fRBHvl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int zObvzS() {
        return this.RmuJJx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zdmjIa() {
        return this.UXrqGX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZqidTP zrcPaS() {
        Context context = this.Umbazn;
        if (context == null) {
            return null;
        }
        return new ZqidTP(context.getApplicationContext());
    }
}
