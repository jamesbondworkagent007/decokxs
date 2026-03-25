package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55790xqb implements RxBus.Application {
    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xqb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C55790xqb copy$default(C55790xqb c55790xqb, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c55790xqb.copydefault;
        }
        if ((i & 2) != 0) {
            map = c55790xqb.OLrzqt;
        }
        return c55790xqb.KWHzl(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55790xqb KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new C55790xqb(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55790xqb)) {
            return false;
        }
        C55790xqb c55790xqb = (C55790xqb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c55790xqb.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c55790xqb.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BotRxEventData(eventName=" + this.copydefault + ", map=" + this.OLrzqt + ")";
    }

    public C55790xqb(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = str;
        this.OLrzqt = map;
    }
}
