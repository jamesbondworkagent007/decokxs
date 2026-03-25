package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bhl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4529Bhl {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 java.lang.String), (r4v0 long) A[MD:(java.lang.String, java.lang.String, java.lang.String, long):void (m)] call: o.Bhl.<init>(java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C4529Bhl(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-ARK9YDc$default, reason: not valid java name */
    public static /* synthetic */ C4529Bhl m8310copyARK9YDc$default(C4529Bhl c4529Bhl, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4529Bhl.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c4529Bhl.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c4529Bhl.EZpvd;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            j = c4529Bhl.copydefault;
        }
        return c4529Bhl.EZpvd(str, str4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4529Bhl EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C4529Bhl(str, str2, str3, j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4529Bhl)) {
            return false;
        }
        C4529Bhl c4529Bhl = (C4529Bhl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4529Bhl.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4529Bhl.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4529Bhl.EZpvd) && this.copydefault == c4529Bhl.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + C56396yDv.AEQbTJ(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineEconEventReq(before=" + this.KWHzl + ", after=" + this.AEQbTJ + ", utcZone=" + this.EZpvd + ", cacheExpireSeconds=" + C56396yDv.EZpvd(this.copydefault) + ")";
    }

    public C4529Bhl(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = j;
    }
}
