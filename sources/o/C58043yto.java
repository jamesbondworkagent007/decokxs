package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.mrs.plugin.IDynamicConfig;

/* JADX INFO: renamed from: o.yto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58043yto {
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean AkhnZx;
    public int AuCTel;
    public IDynamicConfig DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public java.lang.String ejfBZ;
    public boolean fARcdN;
    public java.util.Set<java.lang.String> fIwbmz;
    public java.lang.String fJNWhG;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public int getFieldNames;
    public int isConnected;
    public boolean valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.AYXKKw || this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AuCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fIwbmz() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.fetchVPNInfo;
    }

    private C58043yto() {
        this.copydefault = true;
        this.isConnected = 2000;
        this.getFieldNames = 2000;
        this.AuCTel = 0;
        this.AEQbTJ = "";
        this.fJNWhG = "";
        this.fARcdN = true;
    }

    public java.lang.String toString() {
        return " \n# TraceConfig\n* isDebug:\t" + this.AkhnZx + "\n* isDevEnv:\t" + this.fetchVPNInfo + "\n* isHasActivity:\t" + this.fARcdN + "\n* defaultFpsEnable:\t" + this.EZpvd + "\n* defaultMethodTraceEnable:\t" + this.AYXKKw + "\n* defaultStartupEnable:\t" + this.AhwBna + "\n* defaultAnrEnable:\t" + this.OLrzqt + "\n* splashActivities:\t" + this.ejfBZ + "\n* historyMsgRecorder:\t" + this.values + "\n* denseMsgTracer:\t" + this.djBIcL + "\n";
    }

    public java.util.Set<java.lang.String> valueOf() {
        if (this.fIwbmz == null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.fIwbmz = hashSet;
            IDynamicConfig iDynamicConfig = this.DbNXlk;
            if (iDynamicConfig == null) {
                java.lang.String str = this.ejfBZ;
                if (str == null) {
                    return hashSet;
                }
                hashSet.addAll(java.util.Arrays.asList(str.split(";")));
            } else {
                java.lang.String strKWHzl = iDynamicConfig.KWHzl(IDynamicConfig.ExptEnum.clicfg_matrix_trace_care_scene_set.name(), this.ejfBZ);
                if (strKWHzl != null) {
                    this.ejfBZ = strKWHzl;
                }
                java.lang.String str2 = this.ejfBZ;
                if (str2 != null) {
                    this.fIwbmz.addAll(java.util.Arrays.asList(str2.split(";")));
                }
            }
        }
        return this.fIwbmz;
    }

    public int copydefault() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        return iDynamicConfig == null ? TypedValues.TransitionType.TYPE_DURATION : iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_trace_evil_method_threshold.name(), TypedValues.TransitionType.TYPE_DURATION);
    }

    public int KWHzl() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        if (iDynamicConfig == null) {
            return 10000;
        }
        return iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_trace_app_start_up_threshold.name(), 10000);
    }

    public int AYXKKw() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        if (iDynamicConfig == null) {
            return 4000;
        }
        return iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_trace_warm_app_start_up_threshold.name(), 4000);
    }

    public int AEQbTJ() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        if (iDynamicConfig == null) {
            return 42;
        }
        return iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_fps_dropped_frozen.name(), 42);
    }

    public int EZpvd() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        if (iDynamicConfig == null) {
            return 24;
        }
        return iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_fps_dropped_high.name(), 24);
    }

    public int AhwBna() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        if (iDynamicConfig == null) {
            return 9;
        }
        return iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_fps_dropped_middle.name(), 9);
    }

    public int djBIcL() {
        IDynamicConfig iDynamicConfig = this.DbNXlk;
        if (iDynamicConfig == null) {
            return 3;
        }
        return iDynamicConfig.copydefault(IDynamicConfig.ExptEnum.clicfg_matrix_fps_dropped_normal.name(), 3);
    }

    /* JADX INFO: renamed from: o.yto$StateListAnimator */
    public static class StateListAnimator {
        public final C58043yto KWHzl = new C58043yto();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C58043yto KWHzl() {
            return this.KWHzl;
        }

        public StateListAnimator OLrzqt(IDynamicConfig iDynamicConfig) {
            this.KWHzl.DbNXlk = iDynamicConfig;
            return this;
        }

        public StateListAnimator copydefault(boolean z) {
            this.KWHzl.EZpvd = z;
            return this;
        }

        public StateListAnimator KWHzl(boolean z) {
            this.KWHzl.AYXKKw = z;
            return this;
        }

        public StateListAnimator OLrzqt(boolean z) {
            this.KWHzl.OLrzqt = z;
            return this;
        }

        public StateListAnimator copydefault(int i) {
            this.KWHzl.AuCTel = i;
            return this;
        }

        public StateListAnimator EZpvd(boolean z) {
            this.KWHzl.gEmmrt = z;
            return this;
        }

        public StateListAnimator AYXKKw(boolean z) {
            this.KWHzl.AhwBna = z;
            return this;
        }

        public StateListAnimator valueOf(boolean z) {
            this.KWHzl.AkhnZx = z;
            return this;
        }

        public StateListAnimator djBIcL(boolean z) {
            this.KWHzl.fetchVPNInfo = z;
            return this;
        }

        public StateListAnimator AEQbTJ(java.lang.String str) {
            this.KWHzl.ejfBZ = str;
            return this;
        }

        public StateListAnimator EZpvd(java.lang.String str) {
            this.KWHzl.AEQbTJ = str;
            return this;
        }

        public StateListAnimator KWHzl(java.lang.String str) {
            this.KWHzl.fJNWhG = str;
            return this;
        }

        public StateListAnimator AEQbTJ(boolean z) {
            this.KWHzl.KWHzl = z;
            return this;
        }

        public StateListAnimator AhwBna(boolean z) {
            this.KWHzl.valueOf = z;
            return this;
        }
    }
}
