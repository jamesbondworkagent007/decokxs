package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56776yRx {
    public final ReportLevel AEQbTJ;
    public final java.util.Map<C56933yXs, ReportLevel> EZpvd;
    public final ReportLevel KWHzl;
    public final boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReportLevel EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<C56933yXs, ReportLevel> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReportLevel copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56776yRx)) {
            return false;
        }
        C56776yRx c56776yRx = (C56776yRx) obj;
        return this.AEQbTJ == c56776yRx.AEQbTJ && this.KWHzl == c56776yRx.KWHzl && Intrinsics.EZpvd(this.EZpvd, c56776yRx.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        ReportLevel reportLevel = this.KWHzl;
        return (((iHashCode * 31) + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Jsr305Settings(globalLevel=" + this.AEQbTJ + ", migrationLevel=" + this.KWHzl + ", userDefinedLevelForSpecificAnnotation=" + this.EZpvd + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<o.yXs, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56776yRx(@NotNull ReportLevel reportLevel, ReportLevel reportLevel2, @NotNull java.util.Map<C56933yXs, ? extends ReportLevel> map) {
        Intrinsics.checkNotNullParameter(reportLevel, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = reportLevel;
        this.KWHzl = reportLevel2;
        this.EZpvd = map;
        this.copydefault = C56392yDr.copydefault(new C56775yRw(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.OLrzqt = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel)
  (wrap:kotlin.reflect.jvm.internal.impl.load.java.ReportLevel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) : (r2v0 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0009: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:13)) : (r3v0 java.util.Map))
 A[MD:(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel, java.util.Map<o.yXs, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel>):void (m)] (LINE:10) call: o.yRx.<init>(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel, java.util.Map):void type: THIS */
    public /* synthetic */ C56776yRx(ReportLevel reportLevel, ReportLevel reportLevel2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }

    public static final java.lang.String[] AEQbTJ(C56776yRx c56776yRx) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(c56776yRx.AEQbTJ.getDescription());
        ReportLevel reportLevel = c56776yRx.KWHzl;
        if (reportLevel != null) {
            listOLrzqt.add("under-migration:" + reportLevel.getDescription());
        }
        for (Map.Entry<C56933yXs, ReportLevel> entry : c56776yRx.EZpvd.entrySet()) {
            listOLrzqt.add('@' + entry.getKey() + AbstractJsonLexerKt.COLON + entry.getValue().getDescription());
        }
        return (java.lang.String[]) C56402yEa.fARcdN(listOLrzqt).toArray(new java.lang.String[0]);
    }
}
