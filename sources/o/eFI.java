package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eFI implements java.lang.Comparable<eFI> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public int KWHzl;
    public ChainAddress OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eFI copy$default(eFI efi, ChainAddress chainAddress, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            chainAddress = efi.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = efi.KWHzl;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = efi.copydefault;
        }
        java.lang.String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = efi.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = efi.EZpvd;
        }
        return efi.KWHzl(chainAddress, i3, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFI KWHzl(@NotNull ChainAddress chainAddress, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return new eFI(chainAddress, i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainAddress copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eFI)) {
            return false;
        }
        eFI efi = (eFI) obj;
        return Intrinsics.EZpvd(this.OLrzqt, efi.OLrzqt) && this.KWHzl == efi.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) efi.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) efi.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) efi.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.KWHzl);
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddressAndAssetInfo(chainAddress=" + this.OLrzqt + ", addressIndex=" + this.KWHzl + ", asset=" + this.copydefault + ", displayAsset=" + this.AEQbTJ + ", currencyAmount=" + this.EZpvd + ")";
    }

    public eFI(@NotNull ChainAddress chainAddress, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        this.OLrzqt = chainAddress;
        this.KWHzl = i;
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 com.okinc.business.defi.biz.model.ChainAddress)
  (r9v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(com.okinc.business.defi.biz.model.ChainAddress, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: o.eFI.<init>(com.okinc.business.defi.biz.model.ChainAddress, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ eFI(ChainAddress chainAddress, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(chainAddress, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull eFI efi) {
        Intrinsics.checkNotNullParameter(efi, "");
        if (C33129mqd.OLrzqt(this.copydefault, efi.copydefault)) {
            return this.KWHzl - efi.KWHzl;
        }
        return C33129mqd.AEQbTJ(this.copydefault, efi.copydefault) ? -1 : 1;
    }
}
