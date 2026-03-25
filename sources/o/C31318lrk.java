package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31318lrk extends AbstractC31317lrj {
    public final java.lang.Long AEQbTJ;
    public final long AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31318lrk copy$default(C31318lrk c31318lrk, java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c31318lrk.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c31318lrk.OLrzqt;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = c31318lrk.EZpvd;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = c31318lrk.copydefault;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c31318lrk.djBIcL;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            j = c31318lrk.AhwBna;
        }
        return c31318lrk.KWHzl(l, str5, str6, str7, str8, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31318lrk KWHzl(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C31318lrk(l, str, str2, str3, str4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.Long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31318lrk)) {
            return false;
        }
        C31318lrk c31318lrk = (C31318lrk) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c31318lrk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31318lrk.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31318lrk.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31318lrk.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31318lrk.djBIcL) && this.AhwBna == c31318lrk.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.AEQbTJ;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Long.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UIDContact(contactId=" + this.AEQbTJ + ", contactName=" + this.OLrzqt + ", contactAvatar=" + this.EZpvd + ", contactDisplay=" + this.copydefault + ", uid=" + this.djBIcL + ", createdTime=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public long valueOf() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31318lrk(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AEQbTJ = l;
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.djBIcL = str4;
        this.AhwBna = j;
        this.KWHzl = str4;
    }
}
