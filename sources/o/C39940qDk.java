package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39940qDk {
    public final java.util.Map<java.lang.String, C41787qxR> AEQbTJ;
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, BizInstrument>> KWHzl;
    public final java.util.List<C39994qFk> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qDk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39940qDk copy$default(C39940qDk c39940qDk, java.util.List list, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c39940qDk.OLrzqt;
        }
        if ((i & 2) != 0) {
            map = c39940qDk.KWHzl;
        }
        if ((i & 4) != 0) {
            map2 = c39940qDk.AEQbTJ;
        }
        return c39940qDk.OLrzqt(list, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, BizInstrument>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39994qFk> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, C41787qxR> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39940qDk OLrzqt(@NotNull java.util.List<C39994qFk> list, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> map, java.util.Map<java.lang.String, C41787qxR> map2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C39940qDk(list, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39940qDk)) {
            return false;
        }
        C39940qDk c39940qDk = (C39940qDk) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c39940qDk.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c39940qDk.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c39940qDk.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, BizInstrument>> map = this.KWHzl;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        java.util.Map<java.lang.String, C41787qxR> map2 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CombineWatchingAndTickerPayload(hotList=" + this.OLrzqt + ", watchingMap=" + this.KWHzl + ", tickerMap=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends com.okinc.unify_trade.biz.BizInstrument>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39940qDk(@NotNull java.util.List<C39994qFk> list, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> map, java.util.Map<java.lang.String, C41787qxR> map2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.KWHzl = map;
        this.AEQbTJ = map2;
    }
}
