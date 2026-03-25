package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BtK {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public long EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 java.lang.String), (r4v0 java.lang.String), (r5v0 int), (r6v0 boolean) A[MD:(long, java.lang.String, java.lang.String, int, boolean):void (m)] call: o.BtK.<init>(long, java.lang.String, java.lang.String, int, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BtK(long j, java.lang.String str, java.lang.String str2, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-dZZXe8Y$default, reason: not valid java name */
    public static /* synthetic */ BtK m8460copydZZXe8Y$default(BtK btK, long j, java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = btK.EZpvd;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = btK.copydefault;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = btK.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            i = btK.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = btK.AEQbTJ;
        }
        return btK.OLrzqt(j2, str3, str4, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtK OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BtK(j, str, str2, i, z, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BtK)) {
            return false;
        }
        BtK btK = (BtK) obj;
        return this.EZpvd == btK.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) btK.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) btK.KWHzl) && this.OLrzqt == btK.OLrzqt && this.AEQbTJ == btK.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + C56395yDu.KWHzl(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OkUser(id=" + this.EZpvd + ", name=" + this.copydefault + ", email=" + this.KWHzl + ", age=" + C56395yDu.OLrzqt(this.OLrzqt) + ", isActive=" + this.AEQbTJ + ")";
    }

    public BtK(long j, java.lang.String str, java.lang.String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = i;
        this.AEQbTJ = z;
    }
}
