package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32900mmM {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public final EventParamsList copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventParamsList AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public C32900mmM(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.EZpvd = map;
        this.copydefault = eventParamsList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
  (wrap:com.okinc.components.track.bean.EventParamsList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.components.track.bean.EventParamsList) : (r4v0 com.okinc.components.track.bean.EventParamsList))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, com.okinc.components.track.bean.EventParamsList):void (m)] (LINE:12) call: o.mmM.<init>(java.lang.String, java.util.Map, com.okinc.components.track.bean.EventParamsList):void type: THIS */
    public /* synthetic */ C32900mmM(java.lang.String str, java.util.Map map, EventParamsList eventParamsList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : eventParamsList);
    }
}
