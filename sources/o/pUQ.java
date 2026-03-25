package o;

import com.okinc.log.LogLevel;
import com.okinc.log.LogModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUQ {
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final InterfaceC38344pVh AuCTel;
    public final java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> DbNXlk;
    public final boolean EZpvd;
    public final android.app.Application KWHzl;
    public final int OLrzqt;
    public final boolean copydefault;
    public final long djBIcL;
    public final java.lang.String fJNWhG;
    public final LogModel fetchVPNInfo;
    public final LogLevel gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.pUQ$StateListAnimator) A[MD:(o.pUQ$StateListAnimator):void (m)] call: o.pUQ.<init>(o.pUQ$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ pUQ(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC38344pVh AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.app.Application OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LogLevel gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LogModel isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.AkhnZx;
    }

    public pUQ(StateListAnimator stateListAnimator) {
        java.util.HashMap map = new java.util.HashMap();
        this.DbNXlk = map;
        this.gEmmrt = stateListAnimator.AhwBna();
        this.fJNWhG = stateListAnimator.AuCTel();
        this.copydefault = stateListAnimator.valueOf();
        this.EZpvd = stateListAnimator.EZpvd();
        this.isConnected = stateListAnimator.fetchVPNInfo();
        this.fetchVPNInfo = stateListAnimator.AkhnZx();
        this.djBIcL = stateListAnimator.DbNXlk();
        this.AkhnZx = stateListAnimator.ejfBZ();
        this.AYXKKw = stateListAnimator.gEmmrt();
        this.OLrzqt = stateListAnimator.AEQbTJ();
        java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> mapIsConnected = stateListAnimator.isConnected();
        if (mapIsConnected != null) {
            map.putAll(mapIsConnected);
        }
        this.AuCTel = stateListAnimator.fIwbmz();
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.valueOf = stateListAnimator.djBIcL();
        this.AhwBna = stateListAnimator.AYXKKw();
        this.values = stateListAnimator.values();
        this.KWHzl = stateListAnimator.copydefault();
    }

    public final <T> InterfaceC38337pVa<? super T> copydefault(T t) {
        InterfaceC38345pVi<?> interfaceC38345pVi;
        java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> map = this.DbNXlk;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Intrinsics.copydefault(t);
        java.lang.Class<?> superclass = t.getClass();
        do {
            java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> map2 = this.DbNXlk;
            if (map2 != null) {
                Intrinsics.copydefault(superclass);
                interfaceC38345pVi = map2.get(superclass);
            } else {
                interfaceC38345pVi = null;
            }
            Intrinsics.copydefault(superclass);
            superclass = superclass.getSuperclass();
            if (interfaceC38345pVi != null) {
                break;
            }
        } while (superclass != null);
        return interfaceC38345pVi;
    }

    public static final class StateListAnimator {
        public int AEQbTJ;
        public long AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public LogModel DbNXlk;
        public boolean EZpvd;
        public final android.app.Application KWHzl;
        public java.lang.String OLrzqt;
        public boolean copydefault;
        public java.lang.String djBIcL;
        public java.lang.String fIwbmz;
        public final InterfaceC38344pVh fJNWhG;
        public java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> fetchVPNInfo;
        public int gEmmrt;
        public java.lang.String isConnected;
        public LogLevel valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LogLevel AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LogModel AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(int i) {
            this.gEmmrt = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "");
            this.valueOf = logLevel;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fIwbmz = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(boolean z) {
            this.copydefault = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(long j) {
            this.AYXKKw = j;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AhwBna = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(boolean z) {
            this.EZpvd = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.app.Application copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String ejfBZ() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC38344pVh fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.values;
        }

        public StateListAnimator(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.KWHzl = application;
            C38349pVm c38349pVm = C38349pVm.AhwBna;
            this.valueOf = c38349pVm.AEQbTJ();
            this.fIwbmz = "OK-LOG";
            this.EZpvd = c38349pVm.copydefault();
            this.copydefault = c38349pVm.KWHzl();
            this.djBIcL = "";
            this.AhwBna = "";
            this.OLrzqt = "";
            this.AkhnZx = c38349pVm.valueOf();
            this.DbNXlk = LogModel.Async;
            this.AYXKKw = c38349pVm.djBIcL();
            this.isConnected = "";
            this.gEmmrt = c38349pVm.AYXKKw();
            this.AEQbTJ = c38349pVm.OLrzqt();
            this.fJNWhG = C38350pVn.KWHzl.copydefault();
        }

        public final pUQ KWHzl() {
            fARcdN();
            if (this.EZpvd) {
                this.valueOf.setLevel(LogLevel.LEVEL_ALL.getLevel());
            }
            this.values = C38349pVm.AhwBna.AhwBna();
            if (!C38352pVp.EZpvd(this.KWHzl).equals(this.KWHzl.getPackageName())) {
                this.values = C38352pVp.EZpvd(this.KWHzl);
            }
            C38347pVk.OLrzqt.KWHzl(this.djBIcL);
            return new pUQ(this, null);
        }

        public final void fARcdN() {
            if (this.AhwBna.length() == 0) {
                this.AhwBna = this.KWHzl.getFilesDir().getAbsolutePath() + java.io.File.separator + "logDir";
            }
            if (this.OLrzqt.length() == 0) {
                this.OLrzqt = this.KWHzl.getFilesDir().getAbsolutePath() + java.io.File.separator + "cacheDir";
            }
            if (this.djBIcL.length() == 0) {
                this.djBIcL = this.KWHzl.getFilesDir().getAbsolutePath() + java.io.File.separator + "logZipDir";
            }
            java.util.Map<java.lang.Class<?>, InterfaceC38345pVi<?>> map = this.fetchVPNInfo;
            if (map == null || map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.fetchVPNInfo = linkedHashMap;
                linkedHashMap.putAll(C38350pVn.KWHzl.KWHzl());
            }
        }
    }
}
