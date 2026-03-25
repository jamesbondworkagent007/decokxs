package o;

import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mQB implements InterfaceC32140mQz {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final java.util.List<TagWrapper> copydefault;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.mQB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mQB copy$default(mQB mqb, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.util.List list, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = mqb.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            i2 = mqb.valueOf;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = mqb.EZpvd;
        }
        java.lang.String str4 = str;
        if ((i4 & 8) != 0) {
            str2 = mqb.AhwBna;
        }
        java.lang.String str5 = str2;
        if ((i4 & 16) != 0) {
            str3 = mqb.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i4 & 32) != 0) {
            i3 = mqb.KWHzl;
        }
        int i6 = i3;
        if ((i4 & 64) != 0) {
            list = mqb.copydefault;
        }
        return mqb.KWHzl(i, i5, str4, str5, str6, i6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32140mQz
    public int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mQB KWHzl(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i3, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new mQB(i, i2, str, str2, str3, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32140mQz
    public int copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mQB)) {
            return false;
        }
        mQB mqb = (mQB) obj;
        return this.OLrzqt == mqb.OLrzqt && this.valueOf == mqb.valueOf && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) mqb.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) mqb.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) mqb.AEQbTJ) && this.KWHzl == mqb.KWHzl && Intrinsics.EZpvd(this.copydefault, mqb.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavigateEventHolderDetail(primaryTab=" + this.OLrzqt + ", secondaryTab=" + this.valueOf + ", holderWalletAddress=" + this.EZpvd + ", tokenContractAddress=" + this.AhwBna + ", chainId=" + this.AEQbTJ + ", ranking=" + this.KWHzl + ", newTagList=" + this.copydefault + ")";
    }

    public mQB(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i3, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = i;
        this.valueOf = i2;
        this.EZpvd = str;
        this.AhwBna = str2;
        this.AEQbTJ = str3;
        this.KWHzl = i3;
        this.copydefault = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:65)) : (r17v0 java.util.List))
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<com.okinc.dexkline.market.features.tag.domain.TagWrapper>):void (m)] (LINE:58) call: o.mQB.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ mQB(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.util.List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? 1 : i3, (i4 & 64) != 0 ? yDY.AhwBna() : list);
    }
}
