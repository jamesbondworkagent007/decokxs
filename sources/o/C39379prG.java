package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39379prG {
    public static final int $stable = 8;

    @SerializedName("rateNum")
    private final C39382prJ rateNum;

    @SerializedName("rateType")
    private final java.lang.String rateType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39379prG copy$default(C39379prG c39379prG, C39382prJ c39382prJ, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c39382prJ = c39379prG.rateNum;
        }
        if ((i & 2) != 0) {
            str = c39379prG.rateType;
        }
        return c39379prG.EZpvd(c39382prJ, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39379prG EZpvd(C39382prJ c39382prJ, java.lang.String str) {
        return new C39379prG(c39382prJ, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39382prJ copydefault() {
        return this.rateNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39379prG)) {
            return false;
        }
        C39379prG c39379prG = (C39379prG) obj;
        return Intrinsics.EZpvd(this.rateNum, c39379prG.rateNum) && Intrinsics.EZpvd((java.lang.Object) this.rateType, (java.lang.Object) c39379prG.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C39382prJ c39382prJ = this.rateNum;
        int iHashCode = c39382prJ == null ? 0 : c39382prJ.hashCode();
        java.lang.String str = this.rateType;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Rate(rateNum=" + this.rateNum + ", rateType=" + this.rateType + ")";
    }

    public C39379prG(C39382prJ c39382prJ, java.lang.String str) {
        this.rateNum = c39382prJ;
        this.rateType = str;
    }
}
