package o;

import com.okinc.business.defi.api.bean.DexTransferData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54848xXo {
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final C54845xXl DbNXlk;
    public final C54849xXp EZpvd;
    public final java.lang.String KWHzl;
    public final DexTransferData OLrzqt;
    public final C54842xXi copydefault;
    public final boolean djBIcL;
    public final C54849xXp fARcdN;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final boolean valueOf;
    public final int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54848xXo AEQbTJ(@NotNull C54849xXp c54849xXp, @NotNull C54849xXp c54849xXp2, @NotNull C54845xXl c54845xXl, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, int i, boolean z3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, DexTransferData dexTransferData, C54842xXi c54842xXi, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(c54849xXp, "");
        Intrinsics.checkNotNullParameter(c54849xXp2, "");
        Intrinsics.checkNotNullParameter(c54845xXl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C54848xXo(c54849xXp, c54849xXp2, c54845xXl, z, str, str2, str3, z2, i, z3, str4, str5, str6, dexTransferData, c54842xXi, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54848xXo)) {
            return false;
        }
        C54848xXo c54848xXo = (C54848xXo) obj;
        return Intrinsics.EZpvd(this.EZpvd, c54848xXo.EZpvd) && Intrinsics.EZpvd(this.fARcdN, c54848xXo.fARcdN) && Intrinsics.EZpvd(this.DbNXlk, c54848xXo.DbNXlk) && this.valueOf == c54848xXo.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c54848xXo.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c54848xXo.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c54848xXo.isConnected) && this.AYXKKw == c54848xXo.AYXKKw && this.values == c54848xXo.values && this.djBIcL == c54848xXo.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c54848xXo.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c54848xXo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c54848xXo.fetchVPNInfo) && Intrinsics.EZpvd(this.OLrzqt, c54848xXo.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c54848xXo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c54848xXo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.fARcdN.hashCode();
        int iHashCode3 = this.DbNXlk.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.valueOf);
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        int iHashCode7 = this.isConnected.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode9 = java.lang.Integer.hashCode(this.values);
        int iHashCode10 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode11 = this.AkhnZx.hashCode();
        int iHashCode12 = this.KWHzl.hashCode();
        int iHashCode13 = this.fetchVPNInfo.hashCode();
        DexTransferData dexTransferData = this.OLrzqt;
        int iHashCode14 = dexTransferData == null ? 0 : dexTransferData.hashCode();
        C54842xXi c54842xXi = this.copydefault;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (c54842xXi == null ? 0 : c54842xXi.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SwapInfo(from=" + this.EZpvd + ", to=" + this.fARcdN + ", price=" + this.DbNXlk + ", isShowOtherFees=" + this.valueOf + ", minReceived=" + this.AhwBna + ", minReceivedSymbol=" + this.gEmmrt + ", otherFee=" + this.isConnected + ", isBridge=" + this.AYXKKw + ", source=" + this.values + ", isomerism=" + this.djBIcL + ", signDataJson=" + this.AkhnZx + ", extraGas=" + this.KWHzl + ", sourceType=" + this.fetchVPNInfo + ", dexTransferData=" + this.OLrzqt + ", bridge=" + this.copydefault + ", dexUniqueKey=" + this.AEQbTJ + ")";
    }

    public C54848xXo(@NotNull C54849xXp c54849xXp, @NotNull C54849xXp c54849xXp2, @NotNull C54845xXl c54845xXl, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, int i, boolean z3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, DexTransferData dexTransferData, C54842xXi c54842xXi, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(c54849xXp, "");
        Intrinsics.checkNotNullParameter(c54849xXp2, "");
        Intrinsics.checkNotNullParameter(c54845xXl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.EZpvd = c54849xXp;
        this.fARcdN = c54849xXp2;
        this.DbNXlk = c54845xXl;
        this.valueOf = z;
        this.AhwBna = str;
        this.gEmmrt = str2;
        this.isConnected = str3;
        this.AYXKKw = z2;
        this.values = i;
        this.djBIcL = z3;
        this.AkhnZx = str4;
        this.KWHzl = str5;
        this.fetchVPNInfo = str6;
        this.OLrzqt = dexTransferData;
        this.copydefault = c54842xXi;
        this.AEQbTJ = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (r20v0 o.xXp)
  (r21v0 o.xXp)
  (r22v0 o.xXl)
  (r23v0 boolean)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 boolean)
  (r28v0 int)
  (r29v0 boolean)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.DexTransferData:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DexTransferData) : (r33v0 com.okinc.business.defi.api.bean.DexTransferData))
  (wrap:o.xXi:?: TERNARY null = ((wrap:int:0x0016: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null o.xXi) : (r34v0 o.xXi))
  (r35v0 java.lang.String)
 A[MD:(o.xXp, o.xXp, o.xXl, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.DexTransferData, o.xXi, java.lang.String):void (m)] (LINE:17) call: o.xXo.<init>(o.xXp, o.xXp, o.xXl, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.DexTransferData, o.xXi, java.lang.String):void type: THIS */
    public /* synthetic */ C54848xXo(C54849xXp c54849xXp, C54849xXp c54849xXp2, C54845xXl c54845xXl, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, int i, boolean z3, java.lang.String str4, java.lang.String str5, java.lang.String str6, DexTransferData dexTransferData, C54842xXi c54842xXi, java.lang.String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c54849xXp, c54849xXp2, c54845xXl, z, str, str2, str3, z2, i, z3, str4, str5, (i2 & 4096) != 0 ? "" : str6, (i2 & 8192) != 0 ? null : dexTransferData, (i2 & 16384) != 0 ? null : c54842xXi, str7);
    }
}
