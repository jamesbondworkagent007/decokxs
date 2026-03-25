package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38044pKd {

    /* JADX INFO: renamed from: o.pKd$ActionBar */
    public static final class ActionBar implements InterfaceC38044pKd {
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pKd$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                map = actionBar.EZpvd;
            }
            return actionBar.copydefault(str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new ActionBar(str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Leak(id=" + this.OLrzqt + ", attributes=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.OLrzqt = str;
            this.EZpvd = map;
        }
    }
}
