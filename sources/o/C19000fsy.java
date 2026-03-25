package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.fsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19000fsy {
    public final java.util.List<C18992fsq> AEQbTJ;
    public final java.util.List<C18978fsc> KWHzl;
    public final java.util.List<C18990fso> OLrzqt;
    public final java.util.List<C18999fsx> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19000fsy() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fsy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C19000fsy copy$default(C19000fsy c19000fsy, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c19000fsy.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = c19000fsy.KWHzl;
        }
        if ((i & 4) != 0) {
            list3 = c19000fsy.OLrzqt;
        }
        if ((i & 8) != 0) {
            list4 = c19000fsy.copydefault;
        }
        return c19000fsy.OLrzqt(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18992fsq> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18999fsx> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18978fsc> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19000fsy OLrzqt(java.util.List<C18992fsq> list, java.util.List<C18978fsc> list2, java.util.List<C18990fso> list3, java.util.List<C18999fsx> list4) {
        return new C19000fsy(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18990fso> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19000fsy)) {
            return false;
        }
        C19000fsy c19000fsy = (C19000fsy) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c19000fsy.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c19000fsy.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c19000fsy.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c19000fsy.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<C18992fsq> list = this.AEQbTJ;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<C18978fsc> list2 = this.KWHzl;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<C18990fso> list3 = this.OLrzqt;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        java.util.List<C18999fsx> list4 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletSearchResultUiState(coinAssets=" + this.AEQbTJ + ", customCoinAssets=" + this.KWHzl + ", defiAssets=" + this.OLrzqt + ", nftAssets=" + this.copydefault + ")";
    }

    public C19000fsy(java.util.List<C18992fsq> list, java.util.List<C18978fsc> list2, java.util.List<C18990fso> list3, java.util.List<C18999fsx> list4) {
        this.AEQbTJ = list;
        this.KWHzl = list2;
        this.OLrzqt = list3;
        this.copydefault = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.util.List<o.fsq>, java.util.List<o.fsc>, java.util.List<o.fso>, java.util.List<o.fsx>):void (m)] (LINE:7) call: o.fsy.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C19000fsy(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
