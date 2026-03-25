package o;

import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44051sBn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44052sBo {
    public final java.lang.String EZpvd;
    public final java.util.List<AbstractC44051sBn.Application> KWHzl;
    public final java.util.List<SelfServiceDisplayModel> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sBo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C44052sBo copy$default(C44052sBo c44052sBo, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44052sBo.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c44052sBo.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = c44052sBo.KWHzl;
        }
        return c44052sBo.EZpvd(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44052sBo EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<SelfServiceDisplayModel> list, @NotNull java.util.List<AbstractC44051sBn.Application> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C44052sBo(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC44051sBn.Application> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SelfServiceDisplayModel> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44052sBo)) {
            return false;
        }
        C44052sBo c44052sBo = (C44052sBo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44052sBo.EZpvd) && Intrinsics.EZpvd(this.copydefault, c44052sBo.copydefault) && Intrinsics.EZpvd(this.KWHzl, c44052sBo.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIntentDisplayModel(intentAnswer=" + this.EZpvd + ", selfServiceSection=" + this.copydefault + ", articleList=" + this.KWHzl + ")";
    }

    public C44052sBo(@NotNull java.lang.String str, @NotNull java.util.List<SelfServiceDisplayModel> list, @NotNull java.util.List<AbstractC44051sBn.Application> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = str;
        this.copydefault = list;
        this.KWHzl = list2;
    }
}
