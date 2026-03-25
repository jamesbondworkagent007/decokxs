package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DepositQuoteProperties implements Parcelable {
    public static final Parcelable.Creator<DepositQuoteProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String ejfBZ;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public String isConnected;
    public final String valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<DepositQuoteProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositQuoteProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DepositQuoteProperties(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositQuoteProperties[] newArray(int i) {
            return new DepositQuoteProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositQuoteProperties() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositQuoteProperties copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new DepositQuoteProperties(str, str2, str3, z, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositQuoteProperties)) {
            return false;
        }
        DepositQuoteProperties depositQuoteProperties = (DepositQuoteProperties) obj;
        return Intrinsics.EZpvd((Object) this.AkhnZx, (Object) depositQuoteProperties.AkhnZx) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) depositQuoteProperties.ejfBZ) && Intrinsics.EZpvd((Object) this.valueOf, (Object) depositQuoteProperties.valueOf) && this.values == depositQuoteProperties.values && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) depositQuoteProperties.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) depositQuoteProperties.DbNXlk) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) depositQuoteProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) depositQuoteProperties.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) depositQuoteProperties.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) depositQuoteProperties.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) depositQuoteProperties.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) depositQuoteProperties.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) depositQuoteProperties.KWHzl) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) depositQuoteProperties.AhwBna) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) depositQuoteProperties.AYXKKw) && Intrinsics.EZpvd((Object) this.isConnected, (Object) depositQuoteProperties.isConnected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AkhnZx.hashCode();
        int iHashCode2 = this.ejfBZ.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = Boolean.hashCode(this.values);
        int iHashCode5 = this.fetchVPNInfo.hashCode();
        int iHashCode6 = this.DbNXlk.hashCode();
        int iHashCode7 = this.AEQbTJ.hashCode();
        int iHashCode8 = this.copydefault.hashCode();
        int iHashCode9 = this.OLrzqt.hashCode();
        int iHashCode10 = this.djBIcL.hashCode();
        int iHashCode11 = this.gEmmrt.hashCode();
        String str = this.EZpvd;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        int iHashCode13 = this.KWHzl.hashCode();
        int iHashCode14 = this.AhwBna.hashCode();
        int iHashCode15 = this.AYXKKw.hashCode();
        String str2 = this.isConnected;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str2 == null ? 0 : str2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositQuoteProperties(requestId=" + this.AkhnZx + ", tradeType=" + this.ejfBZ + ", requestAmount=" + this.valueOf + ", splitEnabled=" + this.values + ", requestCurrency=" + this.fetchVPNInfo + ", successUrl=" + this.DbNXlk + ", failUrl=" + this.AEQbTJ + ", depositName=" + this.copydefault + ", depositPlatformCode=" + this.OLrzqt + ", paymentAccountId=" + this.djBIcL + ", paymentMethodType=" + this.gEmmrt + ", deviceData=" + this.EZpvd + ", codeType=" + this.KWHzl + ", msgCode=" + this.AhwBna + ", paybackOrderId=" + this.AYXKKw + ", sessionId=" + this.isConnected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.isConnected);
    }

    public DepositQuoteProperties(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.AkhnZx = str;
        this.ejfBZ = str2;
        this.valueOf = str3;
        this.values = z;
        this.fetchVPNInfo = str4;
        this.DbNXlk = str5;
        this.AEQbTJ = str6;
        this.copydefault = str7;
        this.OLrzqt = str8;
        this.djBIcL = str9;
        this.gEmmrt = str10;
        this.EZpvd = str11;
        this.KWHzl = str12;
        this.AhwBna = str13;
        this.AYXKKw = str14;
        this.isConnected = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ac: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:109) call: com.okinc.okx.paymentapi.data.paas.DepositQuoteProperties.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DepositQuoteProperties(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? null : str15);
    }
}
