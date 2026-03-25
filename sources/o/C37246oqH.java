package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37246oqH {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<PhoneRelation> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oqH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37246oqH copy$default(C37246oqH c37246oqH, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c37246oqH.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c37246oqH.EZpvd;
        }
        if ((i & 4) != 0) {
            list = c37246oqH.OLrzqt;
        }
        return c37246oqH.KWHzl(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37246oqH KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<PhoneRelation> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C37246oqH(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PhoneRelation> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37246oqH)) {
            return false;
        }
        C37246oqH c37246oqH = (C37246oqH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c37246oqH.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37246oqH.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c37246oqH.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupedLocalRelation(contactId=" + this.KWHzl + ", displayName=" + this.EZpvd + ", localRelationList=" + this.OLrzqt + ")";
    }

    public C37246oqH(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<PhoneRelation> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.OLrzqt = list;
    }
}
