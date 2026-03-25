package com.okinc.dexkline.market.features.coindetail.ui.snipers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SniperSheetParams implements Parcelable {
    public static final Parcelable.Creator<SniperSheetParams> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<SniperSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SniperSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SniperSheetParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SniperSheetParams[] newArray(int i) {
            return new SniperSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SniperSheetParams() {
        this(null, null, false, false, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SniperSheetParams copy$default(SniperSheetParams sniperSheetParams, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sniperSheetParams.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = sniperSheetParams.valueOf;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = sniperSheetParams.AEQbTJ;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = sniperSheetParams.copydefault;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = sniperSheetParams.EZpvd;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = sniperSheetParams.AYXKKw;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = sniperSheetParams.OLrzqt;
        }
        return sniperSheetParams.copydefault(str, str6, z3, z4, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SniperSheetParams copydefault(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SniperSheetParams(str, str2, z, z2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SniperSheetParams)) {
            return false;
        }
        SniperSheetParams sniperSheetParams = (SniperSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) sniperSheetParams.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) sniperSheetParams.valueOf) && this.AEQbTJ == sniperSheetParams.AEQbTJ && this.copydefault == sniperSheetParams.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) sniperSheetParams.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) sniperSheetParams.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) sniperSheetParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.KWHzl.hashCode() * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SniperSheetParams(chainId=" + this.KWHzl + ", tokenContractAddress=" + this.valueOf + ", isMemeDetail=" + this.AEQbTJ + ", isSupportHolderDetail=" + this.copydefault + ", source=" + this.EZpvd + ", tokenName=" + this.AYXKKw + ", chainName=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
    }

    public SniperSheetParams(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.valueOf = str2;
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.EZpvd = str3;
        this.AYXKKw = str4;
        this.OLrzqt = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:0x0025: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("header") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:37) call: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperSheetParams.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SniperSheetParams(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "header" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }
}
