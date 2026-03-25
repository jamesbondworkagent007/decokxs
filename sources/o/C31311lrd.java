package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31311lrd extends AbstractC31317lrj {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.Long EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31311lrd copy$default(C31311lrd c31311lrd, java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c31311lrd.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c31311lrd.copydefault;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = c31311lrd.KWHzl;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = c31311lrd.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c31311lrd.AhwBna;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            j = c31311lrd.valueOf;
        }
        return c31311lrd.copydefault(l, str5, str6, str7, str8, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.Long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31311lrd copydefault(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C31311lrd(l, str, str2, str3, str4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31311lrd)) {
            return false;
        }
        C31311lrd c31311lrd = (C31311lrd) obj;
        return Intrinsics.EZpvd(this.EZpvd, c31311lrd.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31311lrd.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31311lrd.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31311lrd.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31311lrd.AhwBna) && this.valueOf == c31311lrd.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.EZpvd;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Long.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EmailContact(contactId=" + this.EZpvd + ", contactName=" + this.copydefault + ", contactAvatar=" + this.KWHzl + ", contactDisplay=" + this.OLrzqt + ", email=" + this.AhwBna + ", createdTime=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public long valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31311lrd(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = l;
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.AhwBna = str4;
        this.valueOf = j;
        this.AEQbTJ = str4;
    }
}
