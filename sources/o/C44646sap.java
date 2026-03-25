package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44646sap {
    public static final int KWHzl = NotificationCategoryBean.$stable;
    public final boolean OLrzqt;
    public final NotificationCategoryBean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44646sap copy$default(C44646sap c44646sap, NotificationCategoryBean notificationCategoryBean, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            notificationCategoryBean = c44646sap.copydefault;
        }
        if ((i & 2) != 0) {
            z = c44646sap.OLrzqt;
        }
        return c44646sap.EZpvd(notificationCategoryBean, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44646sap EZpvd(@NotNull NotificationCategoryBean notificationCategoryBean, boolean z) {
        Intrinsics.checkNotNullParameter(notificationCategoryBean, "");
        return new C44646sap(notificationCategoryBean, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationCategoryBean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44646sap)) {
            return false;
        }
        C44646sap c44646sap = (C44646sap) obj;
        return Intrinsics.EZpvd(this.copydefault, c44646sap.copydefault) && this.OLrzqt == c44646sap.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CategoryTypeRecyclerData(categoryType=" + this.copydefault + ", isSelected=" + this.OLrzqt + ")";
    }

    public C44646sap(@NotNull NotificationCategoryBean notificationCategoryBean, boolean z) {
        Intrinsics.checkNotNullParameter(notificationCategoryBean, "");
        this.copydefault = notificationCategoryBean;
        this.OLrzqt = z;
    }
}
