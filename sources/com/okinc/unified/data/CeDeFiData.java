package com.okinc.unified.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dexkline.dex.api.bean.CoinDetailRedirection;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CeDeFiData implements Parcelable {
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final boolean KWHzl;
    public final String OLrzqt;
    public final TokenBase djBIcL;
    public final CoinDetailRedirection valueOf;
    public static final int copydefault = CoinDetailRedirection.$stable | TokenBase.$stable;
    public static final Parcelable.Creator<CeDeFiData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CeDeFiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDeFiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CeDeFiData((TokenBase) parcel.readParcelable(CeDeFiData.class.getClassLoader()), parcel.readString(), (CoinDetailRedirection) parcel.readParcelable(CeDeFiData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDeFiData[] newArray(int i) {
            return new CeDeFiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDeFiData AEQbTJ(TokenBase tokenBase, String str, CoinDetailRedirection coinDetailRedirection, String str2, boolean z, String str3, String str4, String str5) {
        return new CeDeFiData(tokenBase, str, coinDetailRedirection, str2, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailRedirection copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDeFiData)) {
            return false;
        }
        CeDeFiData ceDeFiData = (CeDeFiData) obj;
        return Intrinsics.EZpvd(this.djBIcL, ceDeFiData.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) ceDeFiData.AhwBna) && Intrinsics.EZpvd(this.valueOf, ceDeFiData.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) ceDeFiData.AYXKKw) && this.KWHzl == ceDeFiData.KWHzl && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ceDeFiData.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ceDeFiData.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ceDeFiData.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TokenBase tokenBase = this.djBIcL;
        int iHashCode = tokenBase == null ? 0 : tokenBase.hashCode();
        String str = this.AhwBna;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        CoinDetailRedirection coinDetailRedirection = this.valueOf;
        int iHashCode3 = coinDetailRedirection == null ? 0 : coinDetailRedirection.hashCode();
        String str2 = this.AYXKKw;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = Boolean.hashCode(this.KWHzl);
        String str3 = this.EZpvd;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.OLrzqt;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDeFiData(tokenBase=" + this.djBIcL + ", pageFrom=" + this.AhwBna + ", redirection=" + this.valueOf + ", sourceType=" + this.AYXKKw + ", isShowPriceAlert=" + this.KWHzl + ", firstTab=" + this.EZpvd + ", fromPageId=" + this.OLrzqt + ", fromScene=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.djBIcL, i);
        parcel.writeString(this.AhwBna);
        parcel.writeParcelable(this.valueOf, i);
        parcel.writeString(this.AYXKKw);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
    }

    public CeDeFiData(TokenBase tokenBase, String str, CoinDetailRedirection coinDetailRedirection, String str2, boolean z, String str3, String str4, String str5) {
        this.djBIcL = tokenBase;
        this.AhwBna = str;
        this.valueOf = coinDetailRedirection;
        this.AYXKKw = str2;
        this.KWHzl = z;
        this.EZpvd = str3;
        this.OLrzqt = str4;
        this.AEQbTJ = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r12v0 com.okinc.dexkline.dex.api.bean.TokenBase)
  (r13v0 java.lang.String)
  (r14v0 com.okinc.dexkline.dex.api.bean.CoinDetailRedirection)
  (r15v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(com.okinc.dexkline.dex.api.bean.TokenBase, java.lang.String, com.okinc.dexkline.dex.api.bean.CoinDetailRedirection, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.unified.data.CeDeFiData.<init>(com.okinc.dexkline.dex.api.bean.TokenBase, java.lang.String, com.okinc.dexkline.dex.api.bean.CoinDetailRedirection, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CeDeFiData(TokenBase tokenBase, String str, CoinDetailRedirection coinDetailRedirection, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenBase, str, coinDetailRedirection, str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}
