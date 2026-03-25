package o;

import com.okinc.business.defi.tee.bean.CacheState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dTR {
    public java.util.List<java.lang.Long> EZpvd;
    public CacheState KWHzl = CacheState.None;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull CacheState cacheState) {
        Intrinsics.checkNotNullParameter(cacheState, "");
        this.KWHzl = cacheState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.util.List<java.lang.Long> list) {
        this.EZpvd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheState KWHzl() {
        return this.KWHzl;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final dTR OLrzqt() {
            return new dTR();
        }

        public final dTR KWHzl() {
            dTR dtr = new dTR();
            dtr.AEQbTJ(CacheState.NetworkError);
            return dtr;
        }

        public final dTR OLrzqt(@NotNull java.util.List<java.lang.Long> list) {
            Intrinsics.checkNotNullParameter(list, "");
            dTR dtr = new dTR();
            dtr.AEQbTJ(CacheState.Ready);
            dtr.AEQbTJ(list);
            return dtr;
        }
    }
}
