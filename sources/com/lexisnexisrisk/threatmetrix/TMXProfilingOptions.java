package com.lexisnexisrisk.threatmetrix;

import QfgSZK.DGUQLI;
import QfgSZK.FQMcgE;
import QfgSZK.GCXiNH;
import QfgSZK.HJWChP;
import QfgSZK.OeawrH;
import android.app.Activity;
import android.location.Location;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class TMXProfilingOptions {
    static final int DURATION_NOT_SET = Integer.MAX_VALUE;
    static String DlIaRS = null;
    public static int Edw = 0;
    public static int dkn = 7228;
    static final int dlhruh;
    private OeawrH.C0005OeawrH QsSAnx;
    private String aSpLZf;
    private boolean aecqHb;
    private String fRBHvl;
    private List<String> gHOBnK;
    private boolean DQkasq = false;
    private int cOOSE = Integer.MAX_VALUE;
    private Activity gzWrne = null;
    private final Set<String> zhFcBz = new HashSet();
    private final Set<String> sBzGck = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        int i2;
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        if (dkn <= 7227) {
            do {
                i = dkn;
                i2 = i + 26;
                if (i2 == 77) {
                    while (true) {
                        dkn = (dkn >> 87) ^ 1474;
                    }
                }
            } while (i2 != 118);
            while (true) {
                dkn = (dkn * 57) + i;
            }
        } else {
            GCXiNH.OHr = 2270;
            Edw = 2932;
            DlIaRS = FQMcgE.hfdhUn(TMXProfilingOptions.class);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            if (dkn > 7227) {
                dlhruh = (int) timeUnit.toSeconds(5L);
                return;
            }
            while (true) {
                int i3 = dkn;
                int i4 = i3 + 13;
                if (i4 == 66) {
                    dkn = (i3 >> 69) ^ 1936;
                } else if (i4 == 158) {
                    while (true) {
                        dkn = (dkn % 10) % 6;
                    }
                } else if (i4 == 357) {
                    while (true) {
                        dkn = ((dkn + i3) ^ 2689) * 43;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean CCzvY() {
        return this.DQkasq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DbOFhN() {
        return this.fRBHvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int UdAbHR() {
        return this.cOOSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String aLnkZL() {
        return this.aSpLZf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> aSUlQG() {
        return this.gHOBnK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OeawrH.C0005OeawrH apNKau() {
        return this.QsSAnx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> dMqZSI() {
        return this.zhFcBz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions disableBehavioSec() {
        this.DQkasq = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> gIsMnX() {
        return this.sBzGck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean izaUzn() {
        return this.aecqHb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Activity saNDaQ() {
        return this.gzWrne;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:110:0x0193) to fix multi-entry loop: BACK_EDGE: B:110:0x0193 -> B:111:0x0195 */
    /* JADX DEBUG: Duplicate block (B:15:0x002f) to fix multi-entry loop: BACK_EDGE: B:14:0x0029 -> B:15:0x002f */
    /* JADX DEBUG: Duplicate block (B:52:0x00b3) to fix multi-entry loop: BACK_EDGE: B:51:0x00ac -> B:52:0x00b3 */
    /* JADX DEBUG: Duplicate block (B:75:0x010d) to fix multi-entry loop: BACK_EDGE: B:74:0x0105 -> B:75:0x010d */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
    
        com.lexisnexisrisk.threatmetrix.TMXProfilingOptions.dkn = (com.lexisnexisrisk.threatmetrix.TMXProfilingOptions.dkn + r10) ^ 6596;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TMXProfilingOptions setBehavioSecDuration(int i, TimeUnit timeUnit) {
        int i2;
        int i3;
        int i4;
        if (i <= 0) {
            String str = DlIaRS;
            if ((dkn ^ 7228) != 0) {
                while (true) {
                    int i5 = dkn;
                    int i6 = i5 + 208;
                    if (i6 == 88) {
                        while (true) {
                            dkn = ((dkn ^ 3246) >> 88) * 80;
                        }
                    } else if (i6 != 150) {
                        if (i6 == 207) {
                            dkn = ((i5 + i5) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY) * 90;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    dkn = (dkn >> 28) % 119;
                }
            } else {
                String strFsw = GCXiNH.fsw("\\\u007f\u001beEG`reL\u0002G_[IS_ZZ\u0013DP\\Z[\u001dTZI\u0019ZRCk$flueLIm*");
                if (Edw <= 2931) {
                    if (dkn <= 7227) {
                        while (true) {
                            int i7 = dkn;
                            int i8 = i7 + 39;
                            if (i8 == 56) {
                                dkn = (i7 * 217) >> 68;
                            } else if (i8 != 87) {
                                if (i8 == 279) {
                                    dkn = (i7 * 60) + i7;
                                }
                            }
                            dkn = (dkn % 69) * 24;
                        }
                    } else {
                        while (true) {
                            int i9 = Edw;
                            int i10 = i9 + 39;
                            if (i10 == 26) {
                                Edw = i9 * 2700;
                                if ((dkn ^ 7228) != 0) {
                                    while (true) {
                                        int i11 = dkn;
                                        int i12 = i11 + 26;
                                        if (i12 != 40) {
                                            if (i12 != 79) {
                                                if (i12 == 113) {
                                                    dkn = ((i11 % 51) ^ 4528) % 39;
                                                }
                                            }
                                            i3 = (dkn >> 31) * 78;
                                        } else {
                                            i3 = ((i11 + i11) >> 45) * 102;
                                        }
                                        dkn = i3;
                                    }
                                }
                            } else if (i10 != 77) {
                                if (i10 == 95) {
                                    while (true) {
                                        Edw = (Edw % 54) >> 107;
                                    }
                                } else if (i10 == 245) {
                                    do {
                                        int i13 = Edw;
                                        i4 = dkn;
                                        if (i4 <= 7227) {
                                            while (true) {
                                                int i14 = dkn;
                                                int i15 = i14 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                                if (i15 != 34) {
                                                    if (i15 != 231) {
                                                        if (i15 == 373) {
                                                            dkn = ((i14 + i14) >> 14) * 99;
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            dkn = (dkn >> 35) % 4;
                                            while (true) {
                                                dkn = ((dkn >> 78) % 48) >> 12;
                                            }
                                        } else {
                                            Edw = ((i13 * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) ^ 3643) * 48;
                                        }
                                    } while (i4 > 7227);
                                    while (dkn + 117 != 66) {
                                    }
                                    while (true) {
                                        dkn = (dkn * 42) >> 67;
                                    }
                                }
                            } else if (dkn <= 7227) {
                                while (true) {
                                    int i16 = dkn;
                                    int i17 = i16 + 130;
                                    if (i17 != 41) {
                                        if (i17 != 52) {
                                            if (i17 == 140) {
                                                dkn = (i16 ^ 4356) >> 13;
                                                break;
                                            }
                                            if (i17 == 188) {
                                                dkn = (i16 + i16) % 21;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                while (true) {
                                    dkn = ((dkn >> 71) % 123) * 91;
                                }
                            } else {
                                Edw = ((i9 ^ 4723) % 12) >> 37;
                            }
                        }
                    }
                }
                FQMcgE.svhCHd(str, strFsw);
                i2 = Integer.MAX_VALUE;
            }
        } else {
            long seconds = timeUnit.toSeconds(i);
            long j = dlhruh;
            if ((Edw ^ 2932) != 0) {
                if ((dkn ^ 7228) == 0) {
                    while (true) {
                        int i18 = Edw;
                        int i19 = i18 + 52;
                        if (i19 == 78) {
                            Edw = (i18 + i18) >> 54;
                            if ((dkn ^ 7228) != 0) {
                                break;
                            }
                        } else if (i19 == 185) {
                            Edw = (i18 >> 40) * 5;
                            break;
                        }
                    }
                }
                while (true) {
                    int i20 = dkn;
                    int i21 = i20 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                    if (i21 == 38) {
                        dkn = (i20 + i20) ^ 1982;
                        break;
                    }
                    if (i21 == 126) {
                        break;
                    }
                }
                while (true) {
                    dkn = (dkn % 20) % 8;
                }
            }
            if (seconds > j) {
                FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("\\1MmGDd>kZGB^LZ\u0007B]U]\u0012EXJ\u001eP]CSTMZ\u0006aqqcuiQB)rjf|m'ys4&2|yakiyh:qyd'G@As.K^v@_IA\b\u0007|Q_\u001b~XVaYi^G]Y\u0016uQFgnx\u007fglc\u0001Fvvdrngw:}so>kHxa3dgyqqfGZa\u0001zddMS\u000eZAKF\tXaULtBu\u0010FX\u001e\b\u0018ZSWYg{F\u000e"));
                if (dkn <= 7227) {
                    while (true) {
                        int i22 = dkn;
                        int i23 = i22 + 234;
                        if (i23 == 42) {
                            break;
                        }
                        if (i23 != 109) {
                            if (i23 == 236) {
                                dkn = (i22 * 15) % 33;
                            }
                        }
                        dkn = (dkn ^ 4506) % 45;
                    }
                    while (true) {
                        dkn = ((dkn * 75) >> 114) % 84;
                    }
                } else {
                    i2 = dlhruh;
                }
            } else {
                i2 = (int) seconds;
            }
        }
        this.cOOSE = i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setCustomAttributes(List<String> list) {
        this.gHOBnK = list;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setLocation(Location location) {
        if (HJWChP.frwjPh.RihMUf()) {
            this.QsSAnx = DGUQLI.apNbdB(location, true);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setSessionID(String str) {
        this.aSpLZf = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setTMXBehavioSecIncludedActivities(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            this.zhFcBz.addAll(set);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setTMXBehavioSecInjectJavascriptCollector(boolean z) {
        this.aecqHb = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setTMXBehavioSecMaskedFields(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            if ((dkn ^ 7228) != 0) {
                while (true) {
                    int i = dkn;
                    if (i + 26 == 34) {
                        dkn = (i + i) * 6048;
                    }
                }
            } else {
                this.sBzGck.addAll(set);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setTMXBehavioSecRunningActivity(Activity activity) {
        this.gzWrne = activity;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingOptions setTMXBehavioSecWebFieldIdentifierAttribute(String str) {
        this.fRBHvl = str;
        return this;
    }
}
