package QfgSZK;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public class OmYuqg {
    private static String DlIaRS = null;
    public static int Eex = 0;
    public static int cqa = 1527;
    private final ReentrantReadWriteLock zxnTnV = new ReentrantReadWriteLock();
    private volatile boolean auKaRn = false;
    private volatile boolean DkcQvj = false;
    private volatile boolean OxYvAY = false;
    private volatile boolean gKUtjv = false;
    private volatile boolean DMdjeq = false;
    private volatile boolean UGTLRG = false;
    private CountDownLatch ObLaPJ = null;
    private CountDownLatch hrQvNd = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        FQMcgE.usN = 6842;
        Eex = 5835;
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(OmYuqg.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:34:0x0070) to fix multi-entry loop: BACK_EDGE: B:33:0x006a -> B:34:0x0070 */
    private CountDownLatch UJpkuA(boolean z) {
        this.zxnTnV.readLock().lock();
        try {
            if (this.DMdjeq && this.hrQvNd != null && (!z || this.UGTLRG)) {
                return this.hrQvNd;
            }
            this.zxnTnV.readLock().unlock();
            if (Eex > 5834) {
                return null;
            }
            if (cqa > 1526) {
                while (true) {
                    int i = Eex;
                    int i2 = i + 39;
                    if (i2 == 97) {
                        while (true) {
                            Eex = (Eex % 125) + i + i;
                        }
                    } else if (i2 == 177) {
                        Eex = ((i * 58) >> 120) * 68;
                        if (cqa <= 1526) {
                            break;
                        }
                    }
                }
            }
            while (true) {
                int i3 = cqa;
                int i4 = i3 + 52;
                if (i4 == 21) {
                    while (true) {
                        cqa = ((cqa * 33) >> 13) % 41;
                    }
                } else if (i4 != 91) {
                    if (i4 == 235) {
                        cqa = ((i3 ^ 5258) * 14) % 104;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                cqa = (cqa % 48) >> 59;
            }
        } finally {
            this.zxnTnV.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DDDCac() {
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("\\eOiFAuwbO\u0002WE\tKFXVQ_\u0012BSNPm]XQX_RU"));
        this.zxnTnV.writeLock().lock();
        try {
            if (this.gKUtjv) {
                this.zxnTnV.writeLock().unlock();
                return false;
            }
            this.gKUtjv = true;
            return this.DMdjeq;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DQnQnb() {
        this.zxnTnV.writeLock().lock();
        try {
            this.auKaRn = false;
            this.DkcQvj = false;
            this.DMdjeq = false;
            this.UGTLRG = false;
            this.gKUtjv = false;
            this.OxYvAY = false;
            this.zxnTnV.writeLock().unlock();
            if ((Eex ^ 5835) == 0) {
                return;
            }
            while (true) {
                int i = Eex;
                int i2 = i + 13;
                if (i2 == 34) {
                    Eex = i * 206976;
                    if ((cqa ^ 1527) != 0) {
                        while (true) {
                            int i3 = cqa;
                            int i4 = i3 + 52;
                            if (i4 == 16) {
                                cqa = ((i3 >> 17) + i3) * 28;
                                break;
                            } else if (i4 == 200) {
                                break;
                            }
                        }
                        while (true) {
                            cqa *= 846940;
                        }
                    }
                } else if (i2 == 91) {
                    break;
                }
            }
            while (true) {
                Eex = (Eex >> 81) ^ 4305;
            }
        } catch (Throwable th) {
            this.zxnTnV.writeLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DcNNRp() {
        this.zxnTnV.writeLock().lock();
        try {
            if (this.DkcQvj) {
                return false;
            }
            this.DkcQvj = true;
            this.OxYvAY = false;
            return true;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean OEsIKP() {
        boolean z;
        this.zxnTnV.readLock().lock();
        try {
            CountDownLatch countDownLatch = this.ObLaPJ;
            if (!this.auKaRn || countDownLatch == null) {
                z = false;
            } else if (countDownLatch.getCount() == 0) {
                z = true;
            }
            return z;
        } finally {
            this.zxnTnV.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QhYuFg() {
        this.zxnTnV.writeLock().lock();
        try {
            if (this.auKaRn) {
                this.zxnTnV.writeLock().unlock();
                return false;
            }
            this.auKaRn = true;
            this.ObLaPJ = new CountDownLatch(1);
            return true;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (QfgSZK.OmYuqg.cqa <= 1526) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if ((QfgSZK.OmYuqg.cqa ^ 1527) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        r5 = QfgSZK.OmYuqg.cqa + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r5 == 37) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r5 == 102) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        QfgSZK.OmYuqg.cqa = (QfgSZK.OmYuqg.cqa ^ 1453) >> 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        QfgSZK.OmYuqg.cqa = (QfgSZK.OmYuqg.cqa % 20) ^ com.engagelab.privates.core.constants.MTCoreConstants.RemoteWhat.STOP_CONNECT;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean QjzqRB(int i) {
        CountDownLatch countDownLatch;
        InterruptedException e;
        boolean zAwait;
        int i2;
        int i3;
        this.zxnTnV.readLock().lock();
        try {
            boolean z = false;
            if (!this.auKaRn || (countDownLatch = this.ObLaPJ) == null) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("t\u007fRx\u000b_nj,AL\u0003Z[G@DPG@\u001e\u0011^@JUUU]\u0019LX\u0006rejv!fQ^"));
                return false;
            }
            this.zxnTnV.readLock().unlock();
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("JpRxB_f>jGP\u0003CGAS\u0016A[\u0013Q^]_RXH^"));
            try {
                zAwait = countDownLatch.await(i, TimeUnit.MILLISECONDS);
                if (!zAwait) {
                    try {
                        FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("IxViO\u0011nkx\bUBC]AIQ\u0015R\\@\u0011YAWI\u001cOU\u0019[XKuhfvd"));
                    } catch (InterruptedException e2) {
                        e = e2;
                        FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("JpRxB_f>jGP\u0003CGAS\u0016A[\u0013Q^]_RXH^\u001aPVCCwvvrueZ"), e);
                        ORrpqH.uzCIH().seuMaA(e);
                    }
                }
            } catch (InterruptedException e3) {
                e = e3;
                zAwait = false;
            }
            this.zxnTnV.readLock().lock();
            try {
                if (this.auKaRn && zAwait) {
                    z = true;
                }
                this.zxnTnV.readLock().unlock();
                if ((Eex ^ 5835) == 0) {
                    return z;
                }
                do {
                    i2 = Eex;
                    i3 = i2 + 104;
                    if (i3 != 20) {
                        if (i3 != 140) {
                            if (i3 == 286) {
                                Eex = i2 + i2 + i2;
                            }
                        }
                        Eex = (Eex + i2) ^ 4993;
                        if ((cqa ^ 1527) != 0) {
                            while (cqa + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 29) {
                            }
                            while (true) {
                                cqa = ((cqa % 12) ^ MTPushConstants.MainWhat.TAG_DELETE_ALL) * 86;
                            }
                        }
                    } else {
                        Eex = ((i2 ^ 2117) * 97) + i2;
                    }
                    while (true) {
                        Eex = (Eex % 31) + i2;
                    }
                } while (i3 != 288);
                while (true) {
                    Eex = (Eex % 31) + i2;
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void RIKbBf(boolean z) {
        int i;
        this.zxnTnV.readLock().lock();
        try {
            this.auKaRn = z;
            CountDownLatch countDownLatch = this.ObLaPJ;
            this.zxnTnV.readLock().unlock();
            if (Eex > 5834) {
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    return;
                }
                return;
            }
            do {
                i = Eex + 13;
                if (i == 67) {
                    do {
                        Eex = (Eex * 10) >> 45;
                    } while ((cqa ^ 1527) == 0);
                    while (true) {
                        int i2 = cqa;
                        int i3 = i2 + 52;
                        if (i3 == 91) {
                            cqa = (i2 + i2) ^ 2602;
                        } else if (i3 == 274) {
                            while (true) {
                                cqa = (cqa >> 42) % 28;
                            }
                        } else if (i3 == 314) {
                            while (true) {
                                cqa = (cqa * 29) ^ 3937;
                            }
                        }
                    }
                }
            } while (i != 173);
            do {
                Eex = (Eex % 13) % 96;
            } while (cqa > 1526);
            while (true) {
                int i4 = cqa;
                int i5 = i4 + 65;
                if (i5 != 87) {
                    if (i5 == 112) {
                        cqa = (i4 ^ 3952) + i4;
                    }
                }
                cqa >>= 222;
            }
        } catch (Throwable th) {
            this.zxnTnV.readLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:23:0x0050) to fix multi-entry loop: BACK_EDGE: B:22:0x004e -> B:23:0x0050 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void aChkwz() {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.zxnTnV
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            boolean r0 = r3.DMdjeq     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L17
            r0 = 0
            r3.DMdjeq = r0     // Catch: java.lang.Throwable -> L5f
            r3.gKUtjv = r0     // Catch: java.lang.Throwable -> L5f
            r3.UGTLRG = r0     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.CountDownLatch r0 = r3.hrQvNd     // Catch: java.lang.Throwable -> L5f
            goto L18
        L17:
            r0 = 0
        L18:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.zxnTnV
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            int r1 = QfgSZK.OmYuqg.cqa
            r1 = r1 ^ 1527(0x5f7, float:2.14E-42)
            if (r1 == 0) goto L59
        L27:
            int r0 = QfgSZK.OmYuqg.cqa
            int r1 = r0 + 26
            r2 = 24
            if (r1 == r2) goto L48
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L3c
            r2 = 274(0x112, float:3.84E-43)
            if (r1 == r2) goto L42
            r0 = 443(0x1bb, float:6.21E-43)
            if (r1 == r0) goto L50
            goto L27
        L3c:
            int r1 = r0 % 64
            int r1 = r1 >> 22
            QfgSZK.OmYuqg.cqa = r1
        L42:
            int r1 = QfgSZK.OmYuqg.cqa
            int r1 = r1 + r0
            int r0 = r1 >> 109
            goto L4e
        L48:
            int r0 = QfgSZK.OmYuqg.cqa
            int r0 = r0 >> 46
            r0 = r0 ^ 3687(0xe67, float:5.167E-42)
        L4e:
            QfgSZK.OmYuqg.cqa = r0
        L50:
            int r0 = QfgSZK.OmYuqg.cqa
            int r0 = r0 >> 46
            int r0 = r0 % 43
            QfgSZK.OmYuqg.cqa = r0
            goto L48
        L59:
            if (r0 == 0) goto L5e
            r0.countDown()
        L5e:
            return
        L5f:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.zxnTnV
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.OmYuqg.aChkwz():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dtVxwd() {
        this.zxnTnV.writeLock().lock();
        try {
            if (this.OxYvAY) {
                this.zxnTnV.writeLock().unlock();
                return false;
            }
            this.OxYvAY = true;
            return true;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fGsPTM() {
        this.zxnTnV.readLock().lock();
        try {
            return this.auKaRn;
        } finally {
            this.zxnTnV.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fRNHEq() {
        this.zxnTnV.writeLock().lock();
        try {
            if (!this.OxYvAY) {
                return false;
            }
            this.OxYvAY = false;
            this.zxnTnV.writeLock().unlock();
            return true;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gqESXP() {
        int i;
        this.zxnTnV.writeLock().lock();
        try {
            this.DkcQvj = false;
            this.zxnTnV.writeLock().unlock();
            if (Eex <= 5834) {
                do {
                    i = Eex;
                } while (i + 13 != 12);
                Eex = (i + i) ^ 4399;
                if (cqa <= 1526) {
                    while (true) {
                        int i2 = cqa;
                        int i3 = i2 + 13;
                        if (i3 != 48) {
                            if (i3 == 131) {
                                cqa = (i2 ^ 4767) * 72;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cqa = (cqa * 26) ^ 2446;
                }
            }
        } catch (Throwable th) {
            this.zxnTnV.writeLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hfFNez() {
        this.zxnTnV.readLock().lock();
        try {
            return this.OxYvAY;
        } finally {
            this.zxnTnV.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:66:0x00ee) to fix multi-entry loop: BACK_EDGE: B:66:0x00ee -> B:67:0x00f7 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd A[LOOP:9: B:60:0x00dd->B:121:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105 A[LOOP:7: B:69:0x0105->B:118:?, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00db -> B:67:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isInitInProgress() {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r7.zxnTnV
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            boolean r0 = r7.auKaRn     // Catch: java.lang.Throwable -> L12a
            if (r0 == 0) goto L10
            java.util.concurrent.CountDownLatch r0 = r7.ObLaPJ     // Catch: java.lang.Throwable -> L12a
            goto L11
        L10:
            r0 = 0
        L11:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.zxnTnV
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            int r1 = QfgSZK.OmYuqg.Eex
            r1 = r1 ^ 5835(0x16cb, float:8.177E-42)
            r2 = 75
            r3 = 1526(0x5f6, float:2.138E-42)
            if (r1 == 0) goto L90
            int r0 = QfgSZK.OmYuqg.cqa
            if (r0 > r3) goto L4c
        L28:
            int r0 = QfgSZK.OmYuqg.cqa
            int r1 = r0 + 39
            r4 = 59
            if (r1 == r4) goto L43
            if (r1 == r2) goto L3d
            r4 = 198(0xc6, float:2.77E-43)
            if (r1 == r4) goto L37
            goto L28
        L37:
            int r1 = r0 % 60
            int r1 = r1 + r0
            QfgSZK.OmYuqg.cqa = r1
            goto L4c
        L3d:
            r0 = r0 ^ 5085(0x13dd, float:7.126E-42)
            int r0 = r0 % 5
            QfgSZK.OmYuqg.cqa = r0
        L43:
            int r0 = QfgSZK.OmYuqg.cqa
            int r0 = r0 % 34
            int r0 = r0 >> 63
            QfgSZK.OmYuqg.cqa = r0
            goto L28
        L4c:
            int r0 = QfgSZK.OmYuqg.Eex
            int r1 = r0 + 26
            r2 = 52
            if (r1 == r2) goto L65
            r2 = 211(0xd3, float:2.96E-43)
            if (r1 == r2) goto L5d
            r0 = 277(0x115, float:3.88E-43)
            if (r1 == r0) goto L74
            goto L4c
        L5d:
            r0 = r0 ^ 3741(0xe9d, float:5.242E-42)
            int r0 = r0 >> 116
            int r0 = r0 * 121
            QfgSZK.OmYuqg.Eex = r0
        L65:
            int r0 = QfgSZK.OmYuqg.Eex
            r0 = r0 ^ 2229(0x8b5, float:3.123E-42)
            int r0 = r0 * 5476
            QfgSZK.OmYuqg.Eex = r0
            int r0 = QfgSZK.OmYuqg.cqa
            r0 = r0 ^ 1527(0x5f7, float:2.14E-42)
            if (r0 == 0) goto L74
            goto L80
        L74:
            int r0 = QfgSZK.OmYuqg.Eex
            r0 = r0 ^ 2819(0xb03, float:3.95E-42)
            int r0 = r0 * 520
            QfgSZK.OmYuqg.Eex = r0
            int r0 = QfgSZK.OmYuqg.cqa
            if (r0 > r3) goto L74
        L80:
            int r0 = QfgSZK.OmYuqg.cqa
            int r1 = r0 + 117
            r2 = 76
            if (r1 == r2) goto L89
            goto L80
        L89:
            int r0 = r0 % 69
            int r0 = r0 % 42
            QfgSZK.OmYuqg.cqa = r0
            goto L80
        L90:
            if (r0 == 0) goto L128
            long r0 = r0.getCount()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L128
            int r0 = QfgSZK.OmYuqg.Eex
            r1 = 5834(0x16ca, float:8.175E-42)
            r4 = 1
            if (r0 > r1) goto L129
        La3:
            int r0 = QfgSZK.OmYuqg.Eex
            int r1 = r0 + 52
            r5 = 87
            if (r1 == r5) goto Ld3
            r5 = 136(0x88, float:1.9E-43)
            if (r1 == r5) goto L11f
            r5 = 177(0xb1, float:2.48E-43)
            if (r1 == r5) goto Lf7
            r5 = 293(0x125, float:4.1E-43)
            if (r1 == r5) goto Lb8
            goto La3
        Lb8:
            int r1 = QfgSZK.OmYuqg.Eex
            int r1 = r1 % 11
            int r1 = r1 + r0
            QfgSZK.OmYuqg.Eex = r1
            int r1 = QfgSZK.OmYuqg.cqa
            if (r1 > r3) goto Lb8
        Lc3:
            int r0 = QfgSZK.OmYuqg.cqa
            int r1 = r0 + 169
            r2 = 77
            if (r1 == r2) goto Lcc
            goto Lc3
        Lcc:
            int r0 = r0 % 6
            int r0 = r0 * 1258
            QfgSZK.OmYuqg.cqa = r0
            goto Lc3
        Ld3:
            int r1 = QfgSZK.OmYuqg.Eex
            int r1 = r1 + r0
            int r1 = r1 + r0
            QfgSZK.OmYuqg.Eex = r1
            int r1 = QfgSZK.OmYuqg.cqa
            if (r1 > r3) goto Lf7
        Ldd:
            int r1 = QfgSZK.OmYuqg.cqa
            int r5 = r1 + 156
            if (r5 == r2) goto Lee
            r6 = 217(0xd9, float:3.04E-43)
            if (r5 == r6) goto Le8
            goto Ldd
        Le8:
            int r5 = r1 * 26
            r5 = r5 ^ 4333(0x10ed, float:6.072E-42)
            QfgSZK.OmYuqg.cqa = r5
        Lee:
            int r5 = QfgSZK.OmYuqg.cqa
            int r5 = r5 % 25
            int r5 = r5 + r1
            int r5 = r5 * 115
            QfgSZK.OmYuqg.cqa = r5
        Lf7:
            int r1 = QfgSZK.OmYuqg.Eex
            int r1 = r1 + r0
            int r1 = r1 + r0
            r1 = r1 ^ 1366(0x556, float:1.914E-42)
            QfgSZK.OmYuqg.Eex = r1
            int r1 = QfgSZK.OmYuqg.cqa
            r1 = r1 ^ 1527(0x5f7, float:2.14E-42)
            if (r1 == 0) goto L11f
        L105:
            int r1 = QfgSZK.OmYuqg.cqa
            int r5 = r1 + 143
            r6 = 15
            if (r5 == r6) goto L11a
            r1 = 190(0xbe, float:2.66E-43)
            if (r5 == r1) goto L112
            goto L105
        L112:
            int r0 = QfgSZK.OmYuqg.cqa
            int r0 = r0 % r4
            r0 = r0 ^ 2305(0x901, float:3.23E-42)
            QfgSZK.OmYuqg.cqa = r0
            goto L112
        L11a:
            int r5 = r1 * 79
            int r5 = r5 + r1
            QfgSZK.OmYuqg.cqa = r5
        L11f:
            int r1 = QfgSZK.OmYuqg.Eex
            int r1 = r1 % 117
            int r1 = r1 * 111
            QfgSZK.OmYuqg.Eex = r1
            goto Ld3
        L128:
            r4 = 0
        L129:
            return r4
        L12a:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.zxnTnV
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.OmYuqg.isInitInProgress():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:47:0x00b0) to fix multi-entry loop: BACK_EDGE: B:46:0x00ab -> B:47:0x00b0 */
    public boolean isScanInProgress(boolean z) {
        int i;
        int i2;
        int i3;
        CountDownLatch countDownLatchUJpkuA = UJpkuA(z);
        if (countDownLatchUJpkuA != null) {
            if (Eex <= 5834) {
                while (true) {
                    int i4 = Eex;
                    int i5 = i4 + 39;
                    if (i5 == 35) {
                        Eex = (i4 % WebSocketProtocol.PAYLOAD_SHORT) >> 123;
                        if (cqa <= 1526) {
                            while (true) {
                                int i6 = cqa;
                                int i7 = i6 + 78;
                                if (i7 == 7) {
                                    cqa = ((i6 >> 106) * 115) >> 43;
                                } else if (i7 == 147) {
                                    while (true) {
                                        cqa = ((cqa + i6) ^ 3650) % 10;
                                    }
                                } else {
                                    if (i7 == 255) {
                                        cqa = (i6 % 70) + i6;
                                        break;
                                    }
                                    if (i7 == 302) {
                                        while (true) {
                                            cqa = ((cqa >> 8) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) >> 102;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i5 != 179) {
                        continue;
                    }
                    int i8 = Eex;
                    int i9 = cqa;
                    if (i9 <= 1526) {
                        while (true) {
                            i2 = cqa;
                            int i10 = i2 + 91;
                            if (i10 == 92) {
                                cqa = ((i2 ^ 2311) * 55) + i2;
                            } else if (i10 != 243) {
                                if (i10 == 338) {
                                    break;
                                }
                            }
                            cqa = (cqa % 33) >> 55;
                        }
                        while (true) {
                            cqa = ((cqa + i2) ^ 2334) >> 33;
                        }
                    } else {
                        Eex = ((i8 + i4) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY) * 45;
                        if ((i9 ^ 1527) != 0) {
                            while (true) {
                                i3 = cqa;
                                int i11 = i3 + 52;
                                if (i11 != 91) {
                                    if (i11 == 152) {
                                        cqa = (i3 >> 60) * 58;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                cqa = (cqa >> 71) + i3;
                            }
                        }
                    }
                }
            } else if (countDownLatchUJpkuA.getCount() > 0) {
                if ((Eex ^ 5835) == 0) {
                    return true;
                }
                if ((cqa ^ 1527) != 0) {
                    while (true) {
                        int i12 = cqa;
                        if (i12 + 104 == 6) {
                            cqa = (i12 % 67) % 37;
                        }
                    }
                } else {
                    do {
                        i = Eex;
                    } while (i + 26 != 25);
                    do {
                        Eex = (Eex % 55) + i;
                    } while ((cqa ^ 1527) == 0);
                    while (cqa + 117 != 48) {
                    }
                    while (true) {
                        cqa = ((cqa * 35) >> 12) * 80;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean sJPPOI(boolean z, Long l) {
        CountDownLatch countDownLatchUJpkuA = UJpkuA(z);
        boolean zAwait = true;
        if (countDownLatchUJpkuA == null) {
            return true;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("jpRxm^sMoIL\u0019\n~INB\\ZT\u0012W_]\u001eN_ZT\u0019LX\u0006fknrmeJI"));
        try {
            if (l == null) {
                countDownLatchUJpkuA.await();
            } else {
                zAwait = countDownLatchUJpkuA.await(l.longValue(), TimeUnit.MILLISECONDS);
            }
            return zAwait;
        } catch (InterruptedException e) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("jpRxm^sMoIL\u0003]H[\u0007_[@V@CE_JXX"));
            ORrpqH.uzCIH().seuMaA(e);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean sVaiLC() {
        this.zxnTnV.writeLock().lock();
        try {
            if (!this.gKUtjv) {
                return false;
            }
            this.gKUtjv = false;
            this.zxnTnV.writeLock().unlock();
            return true;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean vqBjd(boolean z) {
        this.zxnTnV.writeLock().lock();
        try {
            if (!this.DMdjeq) {
                if (!this.gKUtjv) {
                    this.DMdjeq = true;
                    this.hrQvNd = new CountDownLatch(1);
                    this.UGTLRG = z;
                    return true;
                }
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("neZ~_bb\u007fbFKMM\u0013\bFTZFGWU\u001c\u000fS\\NP_]\u0018VU%gblbeR@l`"));
                this.gKUtjv = false;
            }
            return false;
        } finally {
            this.zxnTnV.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zHQtTQ() {
        this.zxnTnV.readLock().lock();
        try {
            return this.DkcQvj;
        } finally {
            this.zxnTnV.readLock().unlock();
        }
    }
}
