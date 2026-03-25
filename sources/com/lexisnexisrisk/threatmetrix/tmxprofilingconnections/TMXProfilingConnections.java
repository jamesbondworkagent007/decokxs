package com.lexisnexisrisk.threatmetrix.tmxprofilingconnections;

import aeiGEO.ArkbYM;
import aeiGEO.GVpNrs;
import aeiGEO.IIEbr;
import aeiGEO.RbMRq;
import aeiGEO.UPbYzn;
import aeiGEO.ZpNRhN;
import com.lexisnexisrisk.threatmetrix.TMXModuleMetadataProviderInterface;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import okio.Utf8;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class TMXProfilingConnections implements TMXProfilingConnectionsInterface, TMXModuleMetadataProviderInterface {
    private static String DlIaRS;
    public static int OHr;
    public static int OQs;
    public static char[] fYu;
    public static String hdOILI;
    private final List<TMXFutureTask> skmzZd = new ArrayList(2);
    private byte[][] sEupnh = null;
    private byte[][] zBwwme = null;
    private final ExecutorService awmxpW = Executors.newCachedThreadPool();
    private volatile int uEtDh = 10000;
    private volatile int Ried = 0;

    public class TMXFutureTask extends FutureTask<Void> {
        public static int Oav = 2818;
        public static int kRk = 4543;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:13:0x0028) to fix multi-entry loop: BACK_EDGE: B:12:0x001f -> B:13:0x0028 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TMXFutureTask(Runnable runnable, Void r5) {
            int i;
            super(runnable, r5);
            if ((Oav ^ 2818) != 0) {
                while (true) {
                    i = Oav;
                    int i2 = i + 13;
                    if (i2 != 4) {
                        if (i2 == 141) {
                            Oav = (i % 99) % 95;
                            break;
                        } else if (i2 == 237) {
                            Oav = ((Oav ^ 1859) % 14) ^ 4908;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    Oav = ((Oav % 50) >> 108) + i;
                    Oav = ((Oav ^ 1859) % 14) ^ 4908;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            super.run();
            synchronized (TMXProfilingConnections.this.skmzZd) {
                TMXProfilingConnections.this.skmzZd.remove(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x003c) to fix multi-entry loop: BACK_EDGE: B:17:0x003c -> B:16:0x003a */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r1 = ((com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs * 29) + r0) % 118;
     */
    static {
        int i;
        int i2;
        GVpNrs.OTr = 9103;
        OQs = 6659;
        GVpNrs.dqk = 9094;
        OHr = 2270;
        if ((6659 ^ OQs) == 0) {
            DlIaRS = GVpNrs.hfdhUn(TMXProfilingConnections.class);
            hdOILI = null;
            return;
        }
        while (true) {
            i = OQs;
            int i3 = i + 13;
            if (i3 == 55) {
                i2 = (i + i + i) * 4;
                break;
            }
            if (i3 != 202) {
                if (i3 == 309) {
                    i2 = (i * 19) % 82;
                    break;
                } else if (i3 == 499) {
                    i2 = ((i * 66) + i) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    break;
                }
            }
            i2 = ((OQs * 29) + i) % 118;
        }
        while (true) {
            OQs = i2;
            i2 = ((OQs * 29) + i) % 118;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Incorrect return type in method signature: ()V */
    public static /* synthetic */ String fsw(String str) {
        int i;
        int i2;
        int i3 = 0;
        if (fYu == null) {
            fYu = new char[32767];
            int i4 = 3;
            int i5 = 0;
            while (i5 < 32767) {
                i4 = ((i4 + (i4 ^ i5)) + 23) % 63;
                fYu[i5] = (char) i4;
                i5++;
                if (OHr <= 2269) {
                    if (OQs > 6658) {
                        while (true) {
                            i = OHr;
                            int i6 = i + 39;
                            if (i6 == 57) {
                                OHr = (i >> 45) + i;
                                if (OQs <= 6658) {
                                    break;
                                }
                            } else {
                                if (i6 == 146) {
                                    OHr = ((i * 16) ^ 1964) >> 69;
                                    break;
                                }
                                if (i6 == 305) {
                                    break;
                                }
                            }
                        }
                        do {
                            OHr = (OHr + i) % 121;
                        } while (OQs > 6658);
                        do {
                            int i7 = OQs;
                            i2 = i7 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                            if (i2 == 11) {
                                while (true) {
                                    OQs = (OQs % 79) ^ 3092;
                                }
                            } else if (i2 == 187) {
                                while (true) {
                                    OQs = (OQs >> 32) + i7 + i7;
                                }
                            }
                        } while (i2 != 199);
                        while (true) {
                            OQs = (OQs * 46) % 77;
                        }
                    }
                    while (OQs + 91 != 95) {
                    }
                    while (true) {
                        OQs = ((OQs * 70) % 103) % 92;
                    }
                }
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        while (i3 < str.length()) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ fYu[i3])));
            i3++;
            if ((OHr ^ 2270) != 0) {
                while (true) {
                    int i8 = OHr;
                    int i9 = i8 + 65;
                    if (i9 == 69) {
                        OHr = ((i8 >> 46) + i8) % 91;
                    } else if (i9 == 250) {
                        OHr = ((i8 * 93) ^ 2627) % 27;
                        if (OQs <= 6658) {
                            while (true) {
                                int i10 = OQs;
                                int i11 = i10 + 104;
                                if (i11 == 39) {
                                    OQs = ((i10 % 107) ^ 3390) + i10;
                                } else {
                                    if (i11 == 146) {
                                        break;
                                    }
                                    if (i11 != 177) {
                                        if (i11 == 206) {
                                            OQs = (i10 + i10) >> 25;
                                        }
                                    }
                                }
                                OQs = (OQs ^ 2883) * 94;
                            }
                            while (true) {
                                OQs = (OQs * 74) >> 129;
                            }
                        }
                    } else if (i9 == 437) {
                        do {
                            OHr = ((OHr + i8) ^ Utf8.MASK_2BYTES) + i8;
                        } while ((OQs ^ 6659) == 0);
                        while (true) {
                            int i12 = OQs;
                            if (i12 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA == 23) {
                                OQs = (i12 * 92) >> 82;
                            }
                        }
                    }
                }
            }
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void hsfpdm01(String str) {
        if (UPbYzn.iSpHlg(str)) {
            GVpNrs.fQMcgE.sIqKDg(DlIaRS, fsw("t\u007fMmGXe>zINVO\tNHD\u0015RC\u0012U_B_TR"));
            return;
        }
        GVpNrs.fQMcgE.sIqKDg(DlIaRS, fsw("NtOxB_f>jX\u0002GEDINX\u0015@\\\u0012") + str);
        hdOILI = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static void izUARq(List<String> list) throws IllegalArgumentException {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (str == null || !UPbYzn.UPzgla(str) || 64 != str.length()) {
                    GVpNrs.svhCHd(DlIaRS, fsw("T\u007fMmGXe>oMPWCOADWAQ\u001cbDRCW^w^C\u0019^^HbaqrsiPX)\u007fv*ffko5G[S#%9>|n~:x{tbUQAy"), str);
                    throw new IllegalArgumentException(fsw("[pR`NU!jc\bKMC]\u0012\u0007\u007f[BR^XT\u000f]XNOS_QTGqa,rtbREjOns)[OW'!%2yq|v3"));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface
    public void cancelProfiling() {
        synchronized (this.skmzZd) {
            Iterator<TMXFutureTask> it = this.skmzZd.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            this.skmzZd.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface
    public void closeSocket(String str, int i) {
        IIEbr.uzCIH().closeSocket(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections disableNonfatalLogs() {
        GVpNrs.zDGrpR(true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.TMXModuleMetadataProviderInterface
    public String getModuleVersion() {
        return fsw("%?\u000b!\u0013\t");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<TMXFutureTask> getTasks() {
        return this.skmzZd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface
    public void httpRequest(TMXProfilingConnectionsInterface.HttpMethod httpMethod, String str, Map<String, String> map, byte[] bArr, TMXProfilingConnectionsInterface.TMXCallback tMXCallback) {
        iBsimu(new ArkbYM(new ZpNRhN(this.sEupnh, this.zBwwme, this.uEtDh), httpMethod, str, map, bArr, this.Ried, tMXCallback));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void iBsimu(Runnable runnable) {
        TMXFutureTask tMXFutureTask = new TMXFutureTask(runnable, null);
        synchronized (this.skmzZd) {
            this.skmzZd.add(tMXFutureTask);
        }
        this.awmxpW.execute(tMXFutureTask);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface
    public void resolveHostByName(String str) {
        iBsimu(new RbMRq(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:15:0x002b) to fix multi-entry loop: BACK_EDGE: B:15:0x002b -> B:16:0x0035 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface
    public void sendSocketRequest(java.lang.String r7, int r8, byte[] r9, boolean r10, com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXCallback r11) {
        /*
            r6 = this;
            aeiGEO.IIEbr r0 = aeiGEO.IIEbr.uzCIH()
            int r1 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs
            r1 = r1 ^ 6659(0x1a03, float:9.331E-42)
            if (r1 == 0) goto L3f
        La:
            int r1 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs
            int r2 = r1 + 13
            r3 = 85
            if (r2 == r3) goto L2b
            r3 = 148(0x94, float:2.07E-43)
            if (r2 == r3) goto L26
            r3 = 291(0x123, float:4.08E-43)
            if (r2 == r3) goto L35
            r3 = 438(0x1b6, float:6.14E-43)
            if (r2 == r3) goto L1f
            goto La
        L1f:
            int r1 = r1 % 93
            int r1 = r1 % 80
            com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs = r1
            goto L3f
        L26:
            int r7 = r1 * 64
            int r7 = r7 >> 122
            goto L3c
        L2b:
            int r7 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs
            int r7 = r7 % 5
            int r7 = r7 >> 116
            r7 = r7 ^ 1598(0x63e, float:2.239E-42)
            com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs = r7
        L35:
            int r7 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs
            int r7 = r7 + r1
            int r7 = r7 % 60
            int r7 = r7 >> 10
        L3c:
            com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs = r7
            goto L2b
        L3f:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.sendSocketRequest(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.sendSocketRequest(java.lang.String, int, byte[], boolean, com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXCallback):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections setCertificateHashes(String str) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        izUARq(arrayList);
        this.sEupnh = UPbYzn.fqaWRL(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections setCertificateHashes(List<String> list) throws IllegalArgumentException {
        izUARq(list);
        GVpNrs.fQMcgE.sIqKDg(DlIaRS, fsw("~tIxBWh}m\\G\u0003BH[OSF\u0014G]\u0011@FP\u001d\u0001\u001b") + list);
        this.sEupnh = UPbYzn.fqaWRL(list);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections setConnectionTimeout(int i, TimeUnit timeUnit) {
        int i2;
        int i3;
        long j = i;
        if ((OQs ^ 6659) != 0) {
            while (true) {
                int i4 = OQs;
                int i5 = i4 + 52;
                if (i5 == 21) {
                    OQs = (i4 ^ 2624) + i4;
                } else if (i5 == 59) {
                    break;
                }
            }
            while (true) {
                OQs = (OQs >> 47) ^ 3548;
            }
        } else {
            this.uEtDh = (int) timeUnit.toMillis(j);
            if ((OQs ^ 6659) == 0) {
                if (this.uEtDh < 1) {
                    if ((OQs ^ 6659) != 0) {
                        do {
                            i2 = OQs;
                        } while (i2 + 39 != 24);
                        OQs = (i2 ^ 5062) + i2;
                    }
                    this.uEtDh = 1;
                }
                return this;
            }
            do {
                int i6 = OQs;
                i3 = i6 + 13;
                if (i3 == 96) {
                    while (true) {
                        OQs = (OQs % 34) + i6;
                    }
                } else if (i3 == 147) {
                    while (true) {
                        OQs = ((OQs + i6) >> 95) ^ 5323;
                    }
                } else if (i3 == 328) {
                    while (true) {
                        OQs = ((OQs ^ 2194) * 85) + i6;
                    }
                }
            } while (i3 != 495);
            while (true) {
                OQs = (OQs >> 13) % 74;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections setRetryTimes(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.Ried = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections setSubjectPublicKeyInfoHashes(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        izUARq(arrayList);
        this.zBwwme = UPbYzn.fqaWRL(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXProfilingConnections setSubjectPublicKeyInfoHashes(List<String> list) {
        izUARq(list);
        GVpNrs.fQMcgE.sIqKDg(DlIaRS, fsw("mdY`BR!uiQ\u0002KKZ@BE\u0015@\\\u0012AYA\u001e\u0000\u001c") + list);
        this.zBwwme = UPbYzn.fqaWRL(list);
        return this;
    }
}
