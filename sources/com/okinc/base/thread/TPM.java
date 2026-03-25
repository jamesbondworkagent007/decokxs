package com.okinc.base.thread;

import android.os.Handler;
import android.os.Looper;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.base.thread.TPM;
import com.okinc.base.thread.pool.PoolType;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58253yxm;
import o.C56392yDr;
import o.C56444yFp;
import o.C6788aVw;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC6778aVm;
import o.ThreadFactoryC6748aVI;
import o.yBP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TPM {
    public static boolean EZpvd;
    public static final TPM AEQbTJ = new TPM();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aVy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TPM.KWHzl();
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.aVA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TPM.OLrzqt();
        }
    });
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aVx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TPM.AYXKKw();
        }
    });
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        EZpvd = z;
    }

    private TPM() {
    }

    public final InterfaceC6778aVm djBIcL() {
        return (InterfaceC6778aVm) copydefault.getValue();
    }

    public static final InterfaceC6778aVm KWHzl() {
        return InterfaceC6778aVm.Companion.KWHzl(C6788aVw.AEQbTJ.OLrzqt("mobile_infra_tpm"));
    }

    public static final Handler OLrzqt() {
        return new Handler(Looper.getMainLooper());
    }

    public final Handler valueOf() {
        return (Handler) OLrzqt.getValue();
    }

    public static final class TaskDescription {
        public int AEQbTJ;
        public int AYXKKw;
        public long AhwBna;
        public long AkhnZx;
        public int AuCTel;
        public long AuCTelauCTel;
        public int AubY;
        public int DbNXlk;
        public int EZpvd;
        public int KWHzl;
        public long OLrzqt;
        public long copydefault;
        public int djBIcL;
        public int ejfBZ;
        public long fARcdN;
        public int fIwbmz;
        public final Activity fJNWhG;
        public int fetchVPNInfo;
        public int gEmmrt;
        public int getFieldNames;
        public long getNewProxyInstance;
        public int hDKMBd;
        public long isConnected;
        public long iwGUEr;
        public int uzCIH;
        public boolean valueOf;
        public int values;
        public long wlaJM;
        public long zsXlph;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, long j, int i4, int i5, long j2, int i6, int i7, long j3, int i8, int i9, long j4, int i10, int i11, long j5, int i12, int i13, long j6, int i14, long j7, int i15, long j8, int i16, long j9, long j10, long j11, boolean z, Activity activity, int i17, Object obj) {
            int i18 = (i17 & 1) != 0 ? taskDescription.uzCIH : i;
            int i19 = (i17 & 2) != 0 ? taskDescription.EZpvd : i2;
            int i20 = (i17 & 4) != 0 ? taskDescription.KWHzl : i3;
            long j12 = (i17 & 8) != 0 ? taskDescription.copydefault : j;
            int i21 = (i17 & 16) != 0 ? taskDescription.AYXKKw : i4;
            int i22 = (i17 & 32) != 0 ? taskDescription.gEmmrt : i5;
            long j13 = (i17 & 64) != 0 ? taskDescription.AhwBna : j2;
            int i23 = (i17 & 128) != 0 ? taskDescription.AEQbTJ : i6;
            int i24 = (i17 & 256) != 0 ? taskDescription.djBIcL : i7;
            long j14 = (i17 & 512) != 0 ? taskDescription.OLrzqt : j3;
            int i25 = (i17 & 1024) != 0 ? taskDescription.values : i8;
            int i26 = (i17 & 2048) != 0 ? taskDescription.fetchVPNInfo : i9;
            long j15 = j14;
            long j16 = (i17 & 4096) != 0 ? taskDescription.isConnected : j4;
            return taskDescription.AEQbTJ(i18, i19, i20, j12, i21, i22, j13, i23, i24, j15, i25, i26, j16, (i17 & 8192) != 0 ? taskDescription.AuCTel : i10, (i17 & 16384) != 0 ? taskDescription.fIwbmz : i11, (i17 & 32768) != 0 ? taskDescription.fARcdN : j5, (i17 & 65536) != 0 ? taskDescription.DbNXlk : i12, (131072 & i17) != 0 ? taskDescription.ejfBZ : i13, (i17 & 262144) != 0 ? taskDescription.AkhnZx : j6, (i17 & 524288) != 0 ? taskDescription.getFieldNames : i14, (1048576 & i17) != 0 ? taskDescription.iwGUEr : j7, (i17 & 2097152) != 0 ? taskDescription.AubY : i15, (4194304 & i17) != 0 ? taskDescription.wlaJM : j8, (i17 & 8388608) != 0 ? taskDescription.hDKMBd : i16, (16777216 & i17) != 0 ? taskDescription.getNewProxyInstance : j9, (i17 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? taskDescription.AuCTelauCTel : j10, (i17 & 67108864) != 0 ? taskDescription.zsXlph : j11, (i17 & 134217728) != 0 ? taskDescription.valueOf : z, (i17 & 268435456) != 0 ? taskDescription.fJNWhG : activity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(int i, int i2, int i3, long j, int i4, int i5, long j2, int i6, int i7, long j3, int i8, int i9, long j4, int i10, int i11, long j5, int i12, int i13, long j6, int i14, long j7, int i15, long j8, int i16, long j9, long j10, long j11, boolean z, Activity activity) {
            return new TaskDescription(i, i2, i3, j, i4, i5, j2, i6, i7, j3, i8, i9, j4, i10, i11, j5, i12, i13, j6, i14, j7, i15, j8, i16, j9, j10, j11, z, activity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AuCTel() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AuCTelauCTel() {
            return this.AubY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int ejfBZ() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.uzCIH == taskDescription.uzCIH && this.EZpvd == taskDescription.EZpvd && this.KWHzl == taskDescription.KWHzl && this.copydefault == taskDescription.copydefault && this.AYXKKw == taskDescription.AYXKKw && this.gEmmrt == taskDescription.gEmmrt && this.AhwBna == taskDescription.AhwBna && this.AEQbTJ == taskDescription.AEQbTJ && this.djBIcL == taskDescription.djBIcL && this.OLrzqt == taskDescription.OLrzqt && this.values == taskDescription.values && this.fetchVPNInfo == taskDescription.fetchVPNInfo && this.isConnected == taskDescription.isConnected && this.AuCTel == taskDescription.AuCTel && this.fIwbmz == taskDescription.fIwbmz && this.fARcdN == taskDescription.fARcdN && this.DbNXlk == taskDescription.DbNXlk && this.ejfBZ == taskDescription.ejfBZ && this.AkhnZx == taskDescription.AkhnZx && this.getFieldNames == taskDescription.getFieldNames && this.iwGUEr == taskDescription.iwGUEr && this.AubY == taskDescription.AubY && this.wlaJM == taskDescription.wlaJM && this.hDKMBd == taskDescription.hDKMBd && this.getNewProxyInstance == taskDescription.getNewProxyInstance && this.AuCTelauCTel == taskDescription.AuCTelauCTel && this.zsXlph == taskDescription.zsXlph && this.valueOf == taskDescription.valueOf && Intrinsics.EZpvd(this.fJNWhG, taskDescription.fJNWhG);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fARcdN() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long fJNWhG() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getFieldNames() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getNewProxyInstance() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long hDKMBd() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.uzCIH);
            int iHashCode2 = Integer.hashCode(this.EZpvd);
            int iHashCode3 = Integer.hashCode(this.KWHzl);
            int iHashCode4 = Long.hashCode(this.copydefault);
            int iHashCode5 = Integer.hashCode(this.AYXKKw);
            int iHashCode6 = Integer.hashCode(this.gEmmrt);
            int iHashCode7 = Long.hashCode(this.AhwBna);
            int iHashCode8 = Integer.hashCode(this.AEQbTJ);
            int iHashCode9 = Integer.hashCode(this.djBIcL);
            int iHashCode10 = Long.hashCode(this.OLrzqt);
            int iHashCode11 = Integer.hashCode(this.values);
            int iHashCode12 = Integer.hashCode(this.fetchVPNInfo);
            int iHashCode13 = Long.hashCode(this.isConnected);
            int iHashCode14 = Integer.hashCode(this.AuCTel);
            int iHashCode15 = Integer.hashCode(this.fIwbmz);
            int iHashCode16 = Long.hashCode(this.fARcdN);
            int iHashCode17 = Integer.hashCode(this.DbNXlk);
            int iHashCode18 = Integer.hashCode(this.ejfBZ);
            int iHashCode19 = Long.hashCode(this.AkhnZx);
            int iHashCode20 = Integer.hashCode(this.getFieldNames);
            int iHashCode21 = Long.hashCode(this.iwGUEr);
            int iHashCode22 = Integer.hashCode(this.AubY);
            int iHashCode23 = Long.hashCode(this.wlaJM);
            int iHashCode24 = Integer.hashCode(this.hDKMBd);
            int iHashCode25 = Long.hashCode(this.getNewProxyInstance);
            int iHashCode26 = Long.hashCode(this.AuCTelauCTel);
            int iHashCode27 = Long.hashCode(this.zsXlph);
            int iHashCode28 = Boolean.hashCode(this.valueOf);
            Activity activity = this.fJNWhG;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (activity == null ? 0 : activity.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int iwGUEr() {
            return this.uzCIH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Config(maxQueueSize=" + this.uzCIH + ", cpuHighCoreSize=" + this.EZpvd + ", cpuHighMaxSize=" + this.KWHzl + ", cpuHighKeepAliveTime=" + this.copydefault + ", cpuNormalCoreSize=" + this.AYXKKw + ", cpuNormalMaxSize=" + this.gEmmrt + ", cpuNormalKeepAliveTime=" + this.AhwBna + ", cpuLowCoreSize=" + this.AEQbTJ + ", cpuLowMaxSize=" + this.djBIcL + ", cpuLowKeepAliveTime=" + this.OLrzqt + ", ioHighCoreSize=" + this.values + ", ioHighMaxSize=" + this.fetchVPNInfo + ", ioHighKeepAliveTime=" + this.isConnected + ", ioNormalCoreSize=" + this.AuCTel + ", ioNormalMaxSize=" + this.fIwbmz + ", ioNormalKeepAliveTime=" + this.fARcdN + ", ioLowCoreSize=" + this.DbNXlk + ", ioLowMaxSize=" + this.ejfBZ + ", ioLowKeepAliveTime=" + this.AkhnZx + ", scheduleHighCoreSize=" + this.getFieldNames + ", scheduleHighKeepAliveTime=" + this.iwGUEr + ", scheduleNormalCoreSize=" + this.AubY + ", scheduleNormalKeepAliveTime=" + this.wlaJM + ", scheduleLowCoreSize=" + this.hDKMBd + ", scheduleLowKeepAliveTime=" + this.getNewProxyInstance + ", taskTimeoutMillis=" + this.AuCTelauCTel + ", submitThrottleMillis=" + this.zsXlph + ", enableThreadMonitor=" + this.valueOf + ", lowEndDeviceConfig=" + this.fJNWhG + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int uzCIH() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long values() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long wlaJM() {
            return this.wlaJM;
        }

        public TaskDescription(int i, int i2, int i3, long j, int i4, int i5, long j2, int i6, int i7, long j3, int i8, int i9, long j4, int i10, int i11, long j5, int i12, int i13, long j6, int i14, long j7, int i15, long j8, int i16, long j9, long j10, long j11, boolean z, Activity activity) {
            this.uzCIH = i;
            this.EZpvd = i2;
            this.KWHzl = i3;
            this.copydefault = j;
            this.AYXKKw = i4;
            this.gEmmrt = i5;
            this.AhwBna = j2;
            this.AEQbTJ = i6;
            this.djBIcL = i7;
            this.OLrzqt = j3;
            this.values = i8;
            this.fetchVPNInfo = i9;
            this.isConnected = j4;
            this.AuCTel = i10;
            this.fIwbmz = i11;
            this.fARcdN = j5;
            this.DbNXlk = i12;
            this.ejfBZ = i13;
            this.AkhnZx = j6;
            this.getFieldNames = i14;
            this.iwGUEr = j7;
            this.AubY = i15;
            this.wlaJM = j8;
            this.hDKMBd = i16;
            this.getNewProxyInstance = j9;
            this.AuCTelauCTel = j10;
            this.zsXlph = j11;
            this.valueOf = z;
            this.fJNWhG = activity;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r84v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (200 int) : (r44v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r84v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r45v0 int))
  (r46v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r84v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r47v0 long))
  (r49v0 int)
  (r50v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r84v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r51v0 long))
  (r53v0 int)
  (r54v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0027: ARITH (r84v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (30 long) : (r55v0 long))
  (r57v0 int)
  (r58v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0031: ARITH (r84v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r59v0 long))
  (r61v0 int)
  (r62v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x003d: ARITH (32768 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r63v0 long))
  (r65v0 int)
  (r66v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0047: ARITH (262144 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (30 long) : (r67v0 long))
  (r69v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0051: ARITH (1048576 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r70v0 long))
  (r72v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x005b: ARITH (4194304 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r73v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (8388608 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r75v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x006f: ARITH (16777216 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (30 long) : (r76v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0079: ARITH (33554432 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (10000 long) : (r78v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0085: ARITH (67108864 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? (10000 long) : (r80v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (134217728 int) & (r84v0 int) A[WRAPPED]) != (0 int)) ? false : (r82v0 boolean))
  (wrap:com.okinc.base.thread.TPM$Activity:?: TERNARY null = ((wrap:int:0x009a: ARITH (r84v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.base.thread.TPM$Activity) : (r83v0 com.okinc.base.thread.TPM$Activity))
 A[MD:(int, int, int, long, int, int, long, int, int, long, int, int, long, int, int, long, int, int, long, int, long, int, long, int, long, long, long, boolean, com.okinc.base.thread.TPM$Activity):void (m)] (LINE:38) call: com.okinc.base.thread.TPM.TaskDescription.<init>(int, int, int, long, int, int, long, int, int, long, int, int, long, int, int, long, int, int, long, int, long, int, long, int, long, long, long, boolean, com.okinc.base.thread.TPM$Activity):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, int i3, long j, int i4, int i5, long j2, int i6, int i7, long j3, int i8, int i9, long j4, int i10, int i11, long j5, int i12, int i13, long j6, int i14, long j7, int i15, long j8, int i16, long j9, long j10, long j11, boolean z, Activity activity, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? 200 : i, (i17 & 2) != 0 ? 1 : i2, i3, (i17 & 8) != 0 ? 60L : j, i4, i5, (i17 & 64) != 0 ? 60L : j2, i6, i7, (i17 & 512) != 0 ? 30L : j3, i8, i9, (i17 & 4096) != 0 ? 60L : j4, i10, i11, (32768 & i17) != 0 ? 60L : j5, i12, i13, (262144 & i17) != 0 ? 30L : j6, i14, (1048576 & i17) != 0 ? 60L : j7, i15, (4194304 & i17) != 0 ? 60L : j8, (8388608 & i17) != 0 ? 1 : i16, (16777216 & i17) != 0 ? 30L : j9, (33554432 & i17) != 0 ? 10000L : j10, (67108864 & i17) != 0 ? 10000L : j11, (134217728 & i17) != 0 ? false : z, (i17 & 268435456) != 0 ? null : activity);
        }
    }

    public static final class Activity {
        public final int AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = activity.KWHzl;
            }
            if ((i4 & 2) != 0) {
                i2 = activity.AEQbTJ;
            }
            if ((i4 & 4) != 0) {
                i3 = activity.EZpvd;
            }
            return activity.AEQbTJ(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i, int i2, int i3) {
            return new Activity(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.KWHzl == activity.KWHzl && this.AEQbTJ == activity.AEQbTJ && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LowEndDeviceConfig(keepAliveTime=" + this.KWHzl + ", threadPoolSize=" + this.AEQbTJ + ", maxThreadPoolSize=" + this.EZpvd + ")";
        }

        public Activity(int i, int i2, int i3) {
            this.KWHzl = i;
            this.AEQbTJ = i2;
            this.EZpvd = i3;
        }
    }

    public static /* synthetic */ Executor ioExecutor$OKBase_okbase$default(TPM tpm, Application application, Priority priority, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return tpm.AEQbTJ(application, priority, str);
    }

    public final Executor AEQbTJ(@NotNull Application application, @NotNull Priority priority, @NotNull String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL().KWHzl(application, str, PoolType.IO, priority);
    }

    public static /* synthetic */ Executor cpuExecutor$OKBase_okbase$default(TPM tpm, Application application, Priority priority, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return tpm.KWHzl(application, priority, str);
    }

    public final Executor KWHzl(@NotNull Application application, @NotNull Priority priority, @NotNull String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL().KWHzl(application, str, PoolType.CPU, priority);
    }

    public static /* synthetic */ Executor singleExecutor$default(TPM tpm, Application application, Priority priority, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return tpm.EZpvd(application, priority, str);
    }

    public final Executor EZpvd(@NotNull Application application, @NotNull Priority priority, @NotNull String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL().KWHzl(application, str, PoolType.SINGLE, priority);
    }

    public static /* synthetic */ AbstractC58253yxm ioScheduler$OKBase_okbase$default(TPM tpm, Application application, Priority priority, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return tpm.copydefault(application, priority, str);
    }

    public final AbstractC58253yxm copydefault(@NotNull Application application, @NotNull Priority priority, @NotNull String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(AEQbTJ(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        return abstractC58253yxmKWHzl;
    }

    public static /* synthetic */ AbstractC58253yxm cpuScheduler$OKBase_okbase$default(TPM tpm, Application application, Priority priority, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return tpm.OLrzqt(application, priority, str);
    }

    public final AbstractC58253yxm OLrzqt(@NotNull Application application, @NotNull Priority priority, @NotNull String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(KWHzl(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        return abstractC58253yxmKWHzl;
    }

    public static /* synthetic */ AbstractC58253yxm singleScheduler$OKBase_okbase$default(TPM tpm, Application application, Priority priority, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return tpm.djBIcL(application, priority, str);
    }

    public final AbstractC58253yxm djBIcL(@NotNull Application application, @NotNull Priority priority, @NotNull String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(EZpvd(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        return abstractC58253yxmKWHzl;
    }

    public static final class StateListAnimator {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public static /* synthetic */ AbstractC58253yxm low$default(StateListAnimator stateListAnimator, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = Application.Companion;
            }
            return stateListAnimator.KWHzl(application);
        }

        public final AbstractC58253yxm KWHzl(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return TPM.ioScheduler$OKBase_okbase$default(TPM.AEQbTJ, application, Priority.LOW, null, 4, null);
        }

        public static /* synthetic */ AbstractC58253yxm high$default(StateListAnimator stateListAnimator, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = Application.Companion;
            }
            return stateListAnimator.AEQbTJ(application);
        }

        public final AbstractC58253yxm AEQbTJ(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return TPM.ioScheduler$OKBase_okbase$default(TPM.AEQbTJ, application, Priority.HIGH, null, 4, null);
        }

        public static /* synthetic */ AbstractC58253yxm normal$default(StateListAnimator stateListAnimator, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = Application.Companion;
            }
            return stateListAnimator.OLrzqt(application);
        }

        public final AbstractC58253yxm OLrzqt(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return TPM.ioScheduler$OKBase_okbase$default(TPM.AEQbTJ, application, Priority.NORMAL, null, 4, null);
        }
    }

    public static final class ActionBar {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }

        public static /* synthetic */ AbstractC58253yxm low$default(ActionBar actionBar, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = Application.Companion;
            }
            return actionBar.KWHzl(application);
        }

        public final AbstractC58253yxm KWHzl(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return TPM.singleScheduler$OKBase_okbase$default(TPM.AEQbTJ, application, Priority.LOW, null, 4, null);
        }

        public static /* synthetic */ AbstractC58253yxm high$default(ActionBar actionBar, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = Application.Companion;
            }
            return actionBar.EZpvd(application);
        }

        public final AbstractC58253yxm EZpvd(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return TPM.singleScheduler$OKBase_okbase$default(TPM.AEQbTJ, application, Priority.HIGH, null, 4, null);
        }

        public static /* synthetic */ AbstractC58253yxm normal$default(ActionBar actionBar, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = Application.Companion;
            }
            return actionBar.copydefault(application);
        }

        public final AbstractC58253yxm copydefault(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return TPM.singleScheduler$OKBase_okbase$default(TPM.AEQbTJ, application, Priority.NORMAL, null, 4, null);
        }

        public static /* synthetic */ AbstractC58253yxm create$default(ActionBar actionBar, String str, Application application, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 128;
            }
            return actionBar.AEQbTJ(str, application, i);
        }

        public final AbstractC58253yxm AEQbTJ(@NotNull String str, @NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(i), new ThreadFactoryC6748aVI("[" + application.EZpvd() + "]-" + str, null, false, null, 14, null), new ThreadPoolExecutor.CallerRunsPolicy()));
            Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
            return abstractC58253yxmKWHzl;
        }
    }

    public final ExecutorService AhwBna() {
        Object value = gEmmrt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    public static final ExecutorService AYXKKw() {
        return Executors.newFixedThreadPool(1, new ThreadFactoryC6748aVI("Monitor", null, false, null, 14, null));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Priority {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        private final int value;
        public static final Priority HIGH = new Priority(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 0, 6);
        public static final Priority NORMAL = new Priority("NORMAL", 1, 5);
        public static final Priority LOW = new Priority(VerifyDAppDomainUrlResponse.LEVEL_LOW, 2, 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{HIGH, NORMAL, LOW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Priority> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private Priority(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            Priority[] priorityArr$values = $values();
            $VALUES = priorityArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(priorityArr$values);
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }
    }

    public interface Application {
        public static final C0242Application Companion = C0242Application.EZpvd;

        String EZpvd();

        /* JADX INFO: renamed from: com.okinc.base.thread.TPM$Application$Application, reason: collision with other inner class name */
        public static final class C0242Application implements Application {
            public static final /* synthetic */ C0242Application EZpvd = new C0242Application();
            public static final String AEQbTJ = "default";

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.base.thread.TPM.Application
            public String EZpvd() {
                return AEQbTJ;
            }

            private C0242Application() {
            }
        }
    }

    public final boolean gEmmrt() {
        return Intrinsics.EZpvd(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final void AEQbTJ(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        TPM tpm = AEQbTJ;
        if (tpm.gEmmrt()) {
            runnable.run();
        } else {
            tpm.valueOf().post(runnable);
        }
    }

    public final void copydefault(@NotNull Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "");
        valueOf().postDelayed(runnable, j);
    }
}
