package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40426qVk {
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qVk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40426qVk copy$default(C40426qVk c40426qVk, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c40426qVk.copydefault;
        }
        if ((i & 2) != 0) {
            list = c40426qVk.OLrzqt;
        }
        return c40426qVk.KWHzl(map, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40426qVk KWHzl(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.List<java.lang.String> list) {
        return new C40426qVk(map, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40426qVk)) {
            return false;
        }
        C40426qVk c40426qVk = (C40426qVk) obj;
        return Intrinsics.EZpvd(this.copydefault, c40426qVk.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c40426qVk.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.copydefault;
        int iHashCode = map == null ? 0 : map.hashCode();
        java.util.List<java.lang.String> list = this.OLrzqt;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubscribeWsTickersPayload(instIdMap=" + this.copydefault + ", ccyList=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40426qVk(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.List<java.lang.String> list) {
        this.copydefault = map;
        this.OLrzqt = list;
    }
}
