package QfgSZK;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes.dex */
class OFqMGB {
    public static int CrO = 6519;
    public static int cN_ = 7684;
    String rgvUR;
    private static final OFqMGB UcUFhW = new OFqMGB();
    static final Lock zYrWxH = new ReentrantLock();
    static final List<QhsCdE> QpUJcH = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OFqMGB() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:19:0x0046) to fix multi-entry loop: BACK_EDGE: B:18:0x0040 -> B:19:0x0046 */
    private void avCqka(Map<String, String> map) {
        int i;
        if (UPbYzn.dTTfOR(this.rgvUR)) {
            String strDbNXlk = AhwBna.CRASH_LOG_STRING.DbNXlk();
            if ((cN_ ^ 7684) != 0) {
                do {
                    int i2 = cN_;
                    i = i2 + 26;
                    if (i != 49) {
                        if (i == 214) {
                            cN_ = ((i2 >> 46) * 95) ^ 4300;
                        } else if (i == 297) {
                            cN_ = (i2 % 36) ^ 4123;
                        }
                    }
                    while (true) {
                        cN_ = (cN_ >> 26) % 79;
                    }
                } while (i != 321);
                while (true) {
                    cN_ = (cN_ ^ 4354) >> 70;
                }
            }
            map.put(strDbNXlk, UPbYzn.RgaQzq(this.rgvUR, 1024));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OFqMGB uzCIH() {
        return UcUFhW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void zdxASf(QhsCdE qhsCdE) {
        String strZFZsbn = qhsCdE.zFZsbn();
        if (UPbYzn.dTTfOR(strZFZsbn)) {
            this.rgvUR += strZFZsbn;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0050 -> B:24:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void ardYFU(long r3, QfgSZK.QSusPL r5, boolean r6) throws java.lang.InterruptedException {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = QfgSZK.OFqMGB.zYrWxH     // Catch: java.lang.Throwable -> L65
            r0.lock()     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ""
            r2.rgvUR = r0     // Catch: java.lang.Throwable -> L65
            java.util.List<QfgSZK.QhsCdE> r0 = QfgSZK.OFqMGB.QpUJcH     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L65
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L65
            QfgSZK.QhsCdE r1 = (QfgSZK.QhsCdE) r1     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L1e
            goto Lf
        L1e:
            r1.fWSAZA(r3, r5, r6)     // Catch: java.lang.Throwable -> L65
            r2.zdxASf(r1)     // Catch: java.lang.Throwable -> L65
            goto Lf
        L25:
            java.util.concurrent.locks.Lock r3 = QfgSZK.OFqMGB.zYrWxH
            r3.unlock()
            int r3 = QfgSZK.OFqMGB.CrO
            r4 = 6518(0x1976, float:9.134E-42)
            if (r3 > r4) goto L64
        L30:
            int r3 = QfgSZK.OFqMGB.CrO
            int r4 = r3 + 52
            r5 = 97
            if (r4 == r5) goto L59
            r5 = 137(0x89, float:1.92E-43)
            if (r4 == r5) goto L4b
            r5 = 324(0x144, float:4.54E-43)
            if (r4 == r5) goto L45
            r5 = 506(0x1fa, float:7.09E-43)
            if (r4 == r5) goto L52
            goto L30
        L45:
            int r4 = r3 >> 69
            int r4 = r4 + r3
            int r4 = r4 * 116
            goto L50
        L4b:
            int r4 = r3 % 113
            int r4 = r4 + r3
            int r4 = r4 % 71
        L50:
            QfgSZK.OFqMGB.CrO = r4
        L52:
            int r4 = QfgSZK.OFqMGB.CrO
            int r4 = r4 + r3
            int r4 = r4 + r3
            int r4 = r4 % 108
            goto L50
        L59:
            int r3 = QfgSZK.OFqMGB.CrO
            r3 = r3 ^ 4762(0x129a, float:6.673E-42)
            int r3 = r3 * 75
            int r3 = r3 % 95
            QfgSZK.OFqMGB.CrO = r3
            goto L59
        L64:
            return
        L65:
            r3 = move-exception
            java.util.concurrent.locks.Lock r4 = QfgSZK.OFqMGB.zYrWxH
            r4.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.OFqMGB.ardYFU(long, QfgSZK.QSusPL, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> zSsVtY(long j) {
        try {
            zYrWxH.lock();
            HashMap map = new HashMap();
            for (QhsCdE qhsCdE : QpUJcH) {
                if (qhsCdE != null) {
                    qhsCdE.zSsVtY(j, map);
                }
            }
            avCqka(map);
            return map;
        } finally {
            zYrWxH.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0194, code lost:
    
        QfgSZK.OFqMGB.CrO = (QfgSZK.OFqMGB.CrO * 45) ^ 3950;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x019e, code lost:
    
        if (QfgSZK.OFqMGB.cN_ > 7683) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zbGDDc(DPHsZd dPHsZd) {
        int i;
        try {
            Lock lock = zYrWxH;
            lock.lock();
            List<QhsCdE> list = QpUJcH;
            list.clear();
            list.add(new GqbzPL(0L));
            list.add(new DfrfUJ(8L));
            list.add(new FhERFw(0L));
            list.add(new GGlJim(16L));
            list.add(new QezThh(144115188075855872L));
            list.add(new UnZVfq(Long.MIN_VALUE));
            list.add(new GcnicV(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            list.add(new SUwuXE(0L));
            list.add(new ZNPcth(0L));
            list.add(new DKtBnz(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID));
            list.add(new OHsvZP(2251799813685248L));
            list.add(new RsCxkX(PlaybackStateCompat.ACTION_SET_REPEAT_MODE));
            list.add(new ScLVFT(8388608L, false));
            list.add(new Slwtri(536870912L));
            list.add(new QYvkLl(4294967296L));
            list.add(new DlABUU(1125899906842624L));
            list.add(new SqfPTR(288230376151711744L));
            list.add(new AubY(36028797018963968L));
            list.add(new DTeKQX(0L, false));
            PUZqN pUZqN = new PUZqN(67108864L, false, dPHsZd);
            pUZqN.addPreRequisiteCollector(new DQYQgr(PlaybackStateCompat.ACTION_PREPARE_FROM_URI));
            pUZqN.addPreRequisiteCollector(new RhlVAI(0L, dPHsZd));
            list.add(pUZqN);
            list.add(new DxnCrt(33554432L, false));
            list.add(new OtZEmZ(0L, true));
            list.add(new SlnMSS(4194304L, true));
            list.add(new OKvQBs(0L, true));
            list.add(new OeZisf(16384L, true));
            GLcwwN gLcwwN = new GLcwwN(134217728L, true);
            gLcwwN.addPreRequisiteCollector(new WFXFk(0L));
            list.add(gLcwwN);
            list.add(new DlmWDR(576460752303423488L, true));
            list.add(new FSMca(LockFreeTaskQueueCore.FROZEN_MASK, true));
            list.add(new ZGRCNj(LockFreeTaskQueueCore.CLOSED_MASK));
            list.add(new QSbQqJ(Longs.MAX_POWER_OF_TWO, true));
            lock.unlock();
            if ((CrO ^ 6519) == 0) {
                return;
            }
            if (cN_ <= 7683) {
                while (true) {
                    int i2 = cN_;
                    int i3 = i2 + 26;
                    if (i3 == 32) {
                        i = (i2 * 49) ^ 5087;
                    } else if (i3 == 92) {
                        i = ((i2 % 54) >> 13) * 121;
                    }
                    cN_ = i;
                }
            } else {
                while (true) {
                    int i4 = CrO;
                    int i5 = i4 + 13;
                    if (i5 != 55) {
                        if (i5 == 244) {
                            CrO = i4 ^ 235;
                            if ((cN_ ^ 7684) == 0) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    int i6 = cN_;
                    int i7 = i6 + 39;
                    if (i7 == 23) {
                        cN_ = (i6 ^ 3120) + i6;
                    } else if (i7 == 40) {
                        break;
                    }
                }
                while (true) {
                    cN_ = ((cN_ ^ 3254) % 75) ^ 5427;
                }
            }
        } catch (Throwable th) {
            zYrWxH.unlock();
            throw th;
        }
    }
}
