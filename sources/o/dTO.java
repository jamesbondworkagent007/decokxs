package o;

import com.okinc.business.defi.tee.bean.CacheState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dTO {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public CacheState AEQbTJ = CacheState.None;
    public long AYXKKw = 100000;
    public java.lang.Boolean KWHzl;
    public java.util.List<java.lang.Long> OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheState AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull CacheState cacheState) {
        Intrinsics.checkNotNullParameter(cacheState, "");
        this.AEQbTJ = cacheState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Boolean bool) {
        this.KWHzl = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.AYXKKw = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.List<java.lang.Long> list) {
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.copydefault = i;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final dTO KWHzl() {
            return new dTO();
        }

        public final dTO copydefault() {
            dTO dto = new dTO();
            dto.KWHzl(CacheState.NetworkError);
            return dto;
        }

        public final dTO AEQbTJ(@NotNull java.util.List<java.lang.Long> list, boolean z, long j, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            dTO dto = new dTO();
            dto.KWHzl(CacheState.Ready);
            dto.OLrzqt(list);
            dto.KWHzl(java.lang.Boolean.valueOf(z));
            dto.OLrzqt(j);
            dto.copydefault(i);
            return dto;
        }
    }
}
