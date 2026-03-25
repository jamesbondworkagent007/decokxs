package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39999qFp implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public final float AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final int DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.CharSequence copydefault;
    public final DefiWebCoins djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final UpDownColor valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39999qFp AEQbTJ(@NotNull DefiWebCoins defiWebCoins, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.CharSequence charSequence, java.lang.String str7, @NotNull java.lang.String str8, @NotNull UpDownColor upDownColor, int i, float f) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        return new C39999qFp(defiWebCoins, str, str2, str3, str4, str5, str6, charSequence, str7, str8, upDownColor, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39999qFp)) {
            return false;
        }
        C39999qFp c39999qFp = (C39999qFp) obj;
        return Intrinsics.EZpvd(this.djBIcL, c39999qFp.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39999qFp.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c39999qFp.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39999qFp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39999qFp.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c39999qFp.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c39999qFp.AkhnZx) && Intrinsics.EZpvd(this.copydefault, c39999qFp.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c39999qFp.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c39999qFp.isConnected) && this.valueOf == c39999qFp.valueOf && this.DbNXlk == c39999qFp.DbNXlk && java.lang.Float.compare(this.AYXKKw, c39999qFp.AYXKKw) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.gEmmrt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AkhnZx;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = this.copydefault.hashCode();
        java.lang.String str5 = this.AhwBna;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.isConnected.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + java.lang.Integer.hashCode(this.DbNXlk)) * 31) + java.lang.Float.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        DefiWebCoins defiWebCoins = this.djBIcL;
        java.lang.String str = this.KWHzl;
        java.lang.String str2 = this.gEmmrt;
        java.lang.String str3 = this.AEQbTJ;
        java.lang.String str4 = this.OLrzqt;
        java.lang.String str5 = this.EZpvd;
        java.lang.String str6 = this.AkhnZx;
        java.lang.CharSequence charSequence = this.copydefault;
        return "SearchResultDefiWeb3Vo(po=" + defiWebCoins + ", baseIconUrl=" + str + ", quoteIconUrl=" + str2 + ", coinName=" + str3 + ", address=" + str4 + ", liqDisplay=" + str5 + ", turnoverDisplay=" + str6 + ", liquidAndTurnover=" + ((java.lang.Object) charSequence) + ", priceDisplay=" + this.AhwBna + ", ratioDisplay=" + this.isConnected + ", ratioColor=" + this.valueOf + ", sorterTag=" + this.DbNXlk + ", matchScore=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiWebCoins valueOf() {
        return this.djBIcL;
    }

    public C39999qFp(@NotNull DefiWebCoins defiWebCoins, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.CharSequence charSequence, java.lang.String str7, @NotNull java.lang.String str8, @NotNull UpDownColor upDownColor, int i, float f) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        this.djBIcL = defiWebCoins;
        this.KWHzl = str;
        this.gEmmrt = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.EZpvd = str5;
        this.AkhnZx = str6;
        this.copydefault = charSequence;
        this.AhwBna = str7;
        this.isConnected = str8;
        this.valueOf = upDownColor;
        this.DbNXlk = i;
        this.AYXKKw = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r17v0 com.okinc.market.common.biz_spot.bean.DefiWebCoins)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.CharSequence)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 com.okinc.market.ext.UpDownColor)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r29v0 float))
 A[MD:(com.okinc.market.common.biz_spot.bean.DefiWebCoins, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, int, float):void (m)] (LINE:7) call: o.qFp.<init>(com.okinc.market.common.biz_spot.bean.DefiWebCoins, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, int, float):void type: THIS */
    public /* synthetic */ C39999qFp(DefiWebCoins defiWebCoins, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.CharSequence charSequence, java.lang.String str7, java.lang.String str8, UpDownColor upDownColor, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(defiWebCoins, str, str2, str3, str4, str5, str6, charSequence, str7, str8, upDownColor, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? 0.0f : f);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        if (interfaceC40516qYt instanceof C39999qFp) {
            C39999qFp c39999qFp = (C39999qFp) interfaceC40516qYt;
            if (Intrinsics.EZpvd(this.djBIcL, c39999qFp.djBIcL) && this.DbNXlk == c39999qFp.DbNXlk) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39999qFp) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
