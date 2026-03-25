package o;

import com.okinc.market.search.features.main.result.ui.model.AnnouncementPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39993qFj implements InterfaceC40516qYt {
    public final java.lang.String EZpvd;
    public final AnnouncementPo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39993qFj copy$default(C39993qFj c39993qFj, AnnouncementPo announcementPo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            announcementPo = c39993qFj.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c39993qFj.EZpvd;
        }
        return c39993qFj.AEQbTJ(announcementPo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnouncementPo AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39993qFj AEQbTJ(@NotNull AnnouncementPo announcementPo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(announcementPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C39993qFj(announcementPo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39993qFj)) {
            return false;
        }
        C39993qFj c39993qFj = (C39993qFj) obj;
        return Intrinsics.EZpvd(this.KWHzl, c39993qFj.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c39993qFj.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultAnnouncementVo(po=" + this.KWHzl + ", formatTime=" + this.EZpvd + ")";
    }

    public C39993qFj(@NotNull AnnouncementPo announcementPo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(announcementPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = announcementPo;
        this.EZpvd = str;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39993qFj) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39993qFj) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
